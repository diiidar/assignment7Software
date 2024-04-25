package assignment7Software.ex1;

public class HelpDeskTicketingSystem {
    private SupportHandler supportHandlerChain;

    public HelpDeskTicketingSystem() {
        // Creating the chain
        HardwareSupportHandler hardwareHandler = new HardwareSupportHandler();
        SoftwareSupportHandler softwareHandler = new SoftwareSupportHandler();
        NetworkSupportHandler networkHandler = new NetworkSupportHandler();

        hardwareHandler.setNextHandler(softwareHandler);
        softwareHandler.setNextHandler(networkHandler);

        supportHandlerChain = hardwareHandler;
    }

    public void handleSupportRequest(SupportRequest request) {
        supportHandlerChain.handleRequest(request);
    }

    public static void main(String[] args) {
        HelpDeskTicketingSystem ticketingSystem = new HelpDeskTicketingSystem();

        SupportRequest request1 = new SupportRequest(1, "Hardware issue", SupportRequest.Type.HARDWARE);
        SupportRequest request2 = new SupportRequest(2, "Software issue", SupportRequest.Type.SOFTWARE);
        SupportRequest request3 = new SupportRequest(3, "Network issue", SupportRequest.Type.NETWORK);
        SupportRequest request4 = new SupportRequest(4, "Unknown issue", SupportRequest.Type.OTHER);

        ticketingSystem.handleSupportRequest(request1);
        ticketingSystem.handleSupportRequest(request2);
        ticketingSystem.handleSupportRequest(request3);
        ticketingSystem.handleSupportRequest(request4);
    }
}
