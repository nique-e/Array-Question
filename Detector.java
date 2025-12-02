import java.util.*;

public class Detector {

    public static boolean hasCircularDependency(Map<String, List<String>> graph) {
        Set<String> visited = new HashSet<>();
        Set<String> recStack = new HashSet<>();

        for (String node : graph.keySet()) {
            if (dfs(node, graph, visited, recStack)) {
                return true;
            }
        }
        return false;
    }

    private static boolean dfs(String node, Map<String, List<String>> graph,
                               Set<String> visited, Set<String> recStack) {

        if (recStack.contains(node)) return true;  // cycle found
        if (visited.contains(node)) return false;

        visited.add(node);
        recStack.add(node);

        List<String> deps = graph.getOrDefault(node, new ArrayList<>());

        for (String dep : deps) {
            if (dfs(dep, graph, visited, recStack)) {
                return true;
            }
        }

        recStack.remove(node);
        return false;
    }


    public static void main(String[] args) {

        // Example 1: Cycle
        Map<String, List<String>> graph1 = new HashMap<>();
        graph1.put("A", Arrays.asList("B"));
        graph1.put("B", Arrays.asList("C"));
        graph1.put("C", Arrays.asList("A"));  // cycle A → B → C → A

        System.out.println("Graph1 has cycle: " + hasCircularDependency(graph1));

        // Example 2: No Cycle
        Map<String, List<String>> graph2 = new HashMap<>();
        graph2.put("A", Arrays.asList("B"));
        graph2.put("B", Arrays.asList("C"));
        graph2.put("C", new ArrayList<>()); // no cycle

        System.out.println("Graph2 has cycle: " + hasCircularDependency(graph2));
    }
}
