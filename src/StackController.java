public class StackController {
    public static void main(String[] args) {
        StackService stackService = new StackService();

        System.out.println(stackService.isEmpty());
        stackService.push(10);
        stackService.push(20);
        System.out.println(stackService.size());
        System.out.println(stackService.pop());
        System.out.println(stackService.peek());
        System.out.println(stackService.size());
    }
}
