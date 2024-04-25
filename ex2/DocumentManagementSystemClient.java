package assignment7Software.ex2;

import java.util.List;

public class DocumentManagementSystemClient {
    public static void main(String[] args) {
        // Create the real document management system
        DocumentManagementSystem realSystem = new ConcreteDocumentManagementSystem();

        // Create the proxy
        DocumentManagementSystem proxy = new DocumentManagementSystemProxy(realSystem);

        // Use the proxy to perform document management operations
        Document uploadedDocument = proxy.uploadDocument("New Document", "This is the content of the new document");
        System.out.println("Uploaded Document ID: " + uploadedDocument.getId());

        Document downloadedDocument = proxy.downloadDocument(uploadedDocument.getId());
        System.out.println("Downloaded Document Title: " + downloadedDocument.getTitle());

        List<Document> searchResults = proxy.searchDocuments("content");
        System.out.println("Search Results:");
        for (Document document : searchResults) {
            System.out.println("Document ID: " + document.getId() + ", Title: " + document.getTitle());
        }
    }
}
