package org.example.object;

import java.util.Objects;

public class FileLink {
    private String archiveName;
    private String ref;

    public FileLink(String archiveName, String ref) {
        this.archiveName = archiveName;
        this.ref = ref;
    }

    public String getArchiveName() {
        return archiveName;
    }

    public String getRef() {
        return ref;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileLink fileLink = (FileLink) o;
        return Objects.equals(archiveName, fileLink.archiveName) && Objects.equals(ref, fileLink.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archiveName, ref);
    }

    @Override
    public String toString() {
        return "FileLink{" +
                "archiveName='" + archiveName + '\'' +
                ", ref='" + ref + '\'' +
                '}';
    }
}
