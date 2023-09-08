package androidx.camera.core;

import android.graphics.Matrix;
import android.media.ImageReader;
import androidx.camera.core.impl.TagBundle;

class ModifiableImageReaderProxy extends AndroidImageReaderProxy {
    private volatile Integer mRotationDegrees = null;
    private volatile Matrix mSensorToBufferTransformMatrix = null;
    private volatile TagBundle mTagBundle = null;
    private volatile Long mTimestamp = null;

    public ModifiableImageReaderProxy(ImageReader imageReader) {
        super(imageReader);
    }

    private ImageProxy modifyImage(ImageProxy imageProxy) {
        ImageInfo imageInfo = imageProxy.getImageInfo();
        return new SettableImageProxy(imageProxy, ImmutableImageInfo.create(this.mTagBundle != null ? this.mTagBundle : imageInfo.getTagBundle(), this.mTimestamp != null ? this.mTimestamp.longValue() : imageInfo.getTimestamp(), this.mRotationDegrees != null ? this.mRotationDegrees.intValue() : imageInfo.getRotationDegrees(), this.mSensorToBufferTransformMatrix != null ? this.mSensorToBufferTransformMatrix : imageInfo.getSensorToBufferTransformMatrix()));
    }

    public ImageProxy acquireLatestImage() {
        return modifyImage(super.acquireNextImage());
    }

    public ImageProxy acquireNextImage() {
        return modifyImage(super.acquireNextImage());
    }

    public void setImageRotationDegrees(int i) {
        this.mRotationDegrees = Integer.valueOf(i);
    }

    public void setImageSensorToBufferTransformaMatrix(Matrix matrix) {
        this.mSensorToBufferTransformMatrix = matrix;
    }

    public void setImageTagBundle(TagBundle tagBundle) {
        this.mTagBundle = tagBundle;
    }

    public void setImageTimeStamp(long j) {
        this.mTimestamp = Long.valueOf(j);
    }
}
