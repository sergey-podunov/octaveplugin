package net.gazpacho.plugin.octaveplugin;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class OctaveFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(OctaveFileType.OCTAVE_FILE_TYPE, OctaveFileType.DEFAULT_EXTENSION);
    }
}
