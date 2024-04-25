package assignment7Software.ex2;

import java.util.List;

class ConcreteDocumentManagementSystem implements DocumentManagementSystem {
    @Override
    public Document uploadDocument(String title, String content) {
        System.out.println("Uploading document with title: " + title);
        return new Document("1", title, content);
    }

    @Override
    public Document downloadDocument(String id) {
        System.out.println("Downloading document with ID: " + id);
        return new Document(id, "Downloaded Document", "Downloaded Content");
    }

    @Override
    public List<Document> searchDocuments(String query) {
        System.out.println("Searching for documents with query: " + query);
        return List.of(new Document("1", "Document 1", "Content 1"), new Document("2", "Document 2", "Content 2"));
    }
}
