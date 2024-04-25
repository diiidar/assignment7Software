package assignment7Software.ex1;

class SoftwareSupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType() == SupportRequest.Type.SOFTWARE) {
            System.out.println("Software support team is handling request ID: " + request.getId());
            // Handle the request
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler available for request ID: " + request.getId());
        }
    }
}
