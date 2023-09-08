package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.MultiResolutionImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.SurfaceOutputConfigImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class Camera2OutputConfigBuilder {
    private static AtomicInteger sLastId = new AtomicInteger(0);
    private OutputConfig mOutputConfig;
    private String mPhysicalCameraId;
    private int mSurfaceGroupId;
    private List<Camera2OutputConfig> mSurfaceSharingConfigs;

    public static abstract class ImageReaderConfig extends OutputConfig implements ImageReaderOutputConfig {
        public static ImageReaderConfig create(Size size, int i, int i2) {
            return new AutoValue_Camera2OutputConfigBuilder_ImageReaderConfig(size, i, i2);
        }

        public abstract int getImageFormat();

        public abstract int getMaxImages();

        public abstract Size getSize();
    }

    public static abstract class MultiResolutionImageReaderConfig extends OutputConfig implements MultiResolutionImageReaderOutputConfig {
        public static MultiResolutionImageReaderConfig create(int i, int i2) {
            return new C16566x743a36f2(i, i2);
        }

        public abstract int getImageFormat();

        public abstract int getMaxImages();
    }

    public static class OutputConfig implements Camera2OutputConfig {
        private int mId = -1;
        private String mPhysicalCameraId = null;
        private int mSurfaceGroup = 0;
        private List<Camera2OutputConfig> mSurfaceSharingConfigs = Collections.emptyList();

        public int getId() {
            return this.mId;
        }

        public String getPhysicalCameraId() {
            return this.mPhysicalCameraId;
        }

        public int getSurfaceGroupId() {
            return this.mSurfaceGroup;
        }

        public List<Camera2OutputConfig> getSurfaceSharingOutputConfigs() {
            return this.mSurfaceSharingConfigs;
        }

        public void setId(int i) {
            this.mId = i;
        }

        public void setPhysicalCameraId(String str) {
            this.mPhysicalCameraId = str;
        }

        public void setSurfaceGroup(int i) {
            this.mSurfaceGroup = i;
        }

        public void setSurfaceSharingConfigs(List<Camera2OutputConfig> list) {
            this.mSurfaceSharingConfigs = list;
        }
    }

    public static abstract class SurfaceConfig extends OutputConfig implements SurfaceOutputConfig {
        public static SurfaceConfig create(Surface surface) {
            return new AutoValue_Camera2OutputConfigBuilder_SurfaceConfig(surface);
        }

        public abstract Surface getSurface();
    }

    private Camera2OutputConfigBuilder(OutputConfig outputConfig) {
        this.mOutputConfig = outputConfig;
    }

    public static Camera2OutputConfigBuilder fromImpl(Camera2OutputConfigImpl camera2OutputConfigImpl) {
        OutputConfig outputConfig;
        if (camera2OutputConfigImpl instanceof SurfaceOutputConfigImpl) {
            outputConfig = SurfaceConfig.create(((SurfaceOutputConfigImpl) camera2OutputConfigImpl).getSurface());
        } else if (camera2OutputConfigImpl instanceof ImageReaderOutputConfigImpl) {
            ImageReaderOutputConfigImpl imageReaderOutputConfigImpl = (ImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            outputConfig = ImageReaderConfig.create(imageReaderOutputConfigImpl.getSize(), imageReaderOutputConfigImpl.getImageFormat(), imageReaderOutputConfigImpl.getMaxImages());
        } else if (camera2OutputConfigImpl instanceof MultiResolutionImageReaderOutputConfigImpl) {
            MultiResolutionImageReaderOutputConfigImpl multiResolutionImageReaderOutputConfigImpl = (MultiResolutionImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            outputConfig = MultiResolutionImageReaderConfig.create(multiResolutionImageReaderOutputConfigImpl.getImageFormat(), multiResolutionImageReaderOutputConfigImpl.getMaxImages());
        } else {
            outputConfig = null;
        }
        outputConfig.setPhysicalCameraId(camera2OutputConfigImpl.getPhysicalCameraId());
        outputConfig.setSurfaceGroup(camera2OutputConfigImpl.getSurfaceGroupId());
        if (camera2OutputConfigImpl.getSurfaceSharingOutputConfigs() != null) {
            ArrayList arrayList = new ArrayList();
            for (Camera2OutputConfigImpl fromImpl : camera2OutputConfigImpl.getSurfaceSharingOutputConfigs()) {
                arrayList.add(fromImpl(fromImpl).build());
            }
            outputConfig.setSurfaceSharingConfigs(arrayList);
        }
        return new Camera2OutputConfigBuilder(outputConfig);
    }

    private int getNextId() {
        return sLastId.getAndIncrement();
    }

    public static Camera2OutputConfigBuilder newImageReaderConfig(Size size, int i, int i2) {
        return new Camera2OutputConfigBuilder(ImageReaderConfig.create(size, i, i2));
    }

    public static Camera2OutputConfigBuilder newMultiResolutionImageReaderConfig(int i, int i2) {
        return new Camera2OutputConfigBuilder(MultiResolutionImageReaderConfig.create(i, i2));
    }

    public static Camera2OutputConfigBuilder newSurfaceConfig(Surface surface) {
        return new Camera2OutputConfigBuilder(SurfaceConfig.create(surface));
    }

    public Camera2OutputConfigBuilder addSurfaceSharingOutputConfig(Camera2OutputConfig camera2OutputConfig) {
        if (this.mSurfaceSharingConfigs == null) {
            this.mSurfaceSharingConfigs = new ArrayList();
        }
        this.mSurfaceSharingConfigs.add(camera2OutputConfig);
        return this;
    }

    public Camera2OutputConfig build() {
        this.mOutputConfig.setId(getNextId());
        this.mOutputConfig.setPhysicalCameraId(this.mPhysicalCameraId);
        this.mOutputConfig.setSurfaceGroup(this.mSurfaceGroupId);
        List<Camera2OutputConfig> list = this.mSurfaceSharingConfigs;
        if (list != null) {
            this.mOutputConfig.setSurfaceSharingConfigs(list);
        }
        return this.mOutputConfig;
    }

    public Camera2OutputConfigBuilder setPhysicalCameraId(String str) {
        this.mPhysicalCameraId = str;
        return this;
    }

    public Camera2OutputConfigBuilder setSurfaceGroupId(int i) {
        this.mSurfaceGroupId = i;
        return this;
    }
}
