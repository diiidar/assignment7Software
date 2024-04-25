package assignment7Software.ex2;

import java.util.List;

class DocumentManagementSystemProxy implements DocumentManagementSystem {
    private DocumentManagementSystem realSystem;

    public DocumentManagementSystemProxy(DocumentManagementSystem realSystem) {
        this.realSystem = realSystem;
    }

    @Override
    public Document uploadDocument(String title, String content) {
        System.out.println("Proxy: Authenticating user and checking permissions for upload");
        Document uploadedDocument = realSystem.uploadDocument(title, content);
        System.out.println("Proxy: Document uploaded successfully");
        return uploadedDocument;
    }

    @Override
    public Document downloadDocument(String id) {
        System.out.println("Proxy: Authenticating user and checking permissions for download");
        Document downloadedDocument = realSystem.downloadDocument(id);
        System.out.println("Proxy: Document downloaded successfully");
        return downloadedDocument;
    }

    @Override
    public List<Document> searchDocuments(String query) {
        System.out.println("Proxy: Authenticating user and checking permissions for search");
        List<Document> searchResults = realSystem.searchDocuments(query);
        System.out.println("Proxy: Search completed");
        return searchResults;
    }
}
