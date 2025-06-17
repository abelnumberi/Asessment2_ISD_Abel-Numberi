public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addTask("bake bread", "breheat oven");
        graph.addTask("bake bread", "preheat pan");
        graph.addTask("preheat oven", "set plate");
        graph.addTask("preheat oven", "serve patty");
        graph.addTask("add tartar sauce", "add krabby patty");
        graph.addTask("serve bread", "eat");
        graph.addTask("set plate", "add some pickles");
        graph.addTask("pour sauce over patty", "eat");
        graph.addTask("bake bread", "preheat oven");

        System.out.println("Langkah Langkah yang berdekatan:");
        System.out.println(graph.getOrder());
        
    }
}
