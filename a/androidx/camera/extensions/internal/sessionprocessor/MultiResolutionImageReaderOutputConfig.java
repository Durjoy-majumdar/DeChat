package androidx.camera.extensions.internal.sessionprocessor;

public interface MultiResolutionImageReaderOutputConfig extends Camera2OutputConfig {
    int getImageFormat();

    int getMaxImages();
}
