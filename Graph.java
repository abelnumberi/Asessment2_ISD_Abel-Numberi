import java.util.*;

public class Graph {
    private final Map<String, List<String>> adjList = new HashMap<>();
    private final Map<String, Integer> indegree = new HashMap<>();

    public void addTask(String from, String to) {
        adjList.putIfAbsent(from, new ArrayList<>());
        adjList.putIfAbsent(to, new ArrayList<>());
        adjList.get(from).add(to);

        indegree.putIfAbsent(from, 0);
        indegree.put(to, indegree.getOrDefault(to, 0) + 1);
    }

    public List<String> getOrder() {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        for (String node : adjList.keySet()) {
            if (indegree.getOrDefault(node, 0) == 0) {
                queue.offer(node);
            }

        }

        while (!queue.isEmpty()) {
            String current = queue.poll();
            result.add(current);

            for (String neighbor : adjList.get(current)) {
                indegree.put(neighbor, indegree.get(neighbor) - 1);
                if (indegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return result;
    }
}