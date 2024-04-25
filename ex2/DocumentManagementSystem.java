package assignment7Software.ex2;

import java.util.List;

interface DocumentManagementSystem {
    Document uploadDocument(String title, String content);
    Document downloadDocument(String id);
    List<Document> searchDocuments(String query);
}
