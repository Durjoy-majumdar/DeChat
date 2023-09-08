package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class CaptureConfig {
    public static final Config.Option<Integer> OPTION_JPEG_QUALITY = Config.Option.create("camerax.core.captureConfig.jpegQuality", Integer.class);
    public static final Config.Option<Integer> OPTION_ROTATION = Config.Option.create("camerax.core.captureConfig.rotation", Integer.TYPE);
    public static final int TEMPLATE_TYPE_NONE = -1;
    public final List<CameraCaptureCallback> mCameraCaptureCallbacks;
    private final CameraCaptureResult mCameraCaptureResult;
    public final Config mImplementationOptions;
    public final List<DeferrableSurface> mSurfaces;
    private final TagBundle mTagBundle;
    public final int mTemplateType;
    private final boolean mUseRepeatingSurface;

    public interface OptionUnpacker {
        void unpack(UseCaseConfig<?> useCaseConfig, Builder builder);
    }

    public CaptureConfig(List<DeferrableSurface> list, Config config, int i, List<CameraCaptureCallback> list2, boolean z, TagBundle tagBundle, CameraCaptureResult cameraCaptureResult) {
        this.mSurfaces = list;
        this.mImplementationOptions = config;
        this.mTemplateType = i;
        this.mCameraCaptureCallbacks = Collections.unmodifiableList(list2);
        this.mUseRepeatingSurface = z;
        this.mTagBundle = tagBundle;
        this.mCameraCaptureResult = cameraCaptureResult;
    }

    public static CaptureConfig defaultEmptyCaptureConfig() {
        return new Builder().build();
    }

    public List<CameraCaptureCallback> getCameraCaptureCallbacks() {
        return this.mCameraCaptureCallbacks;
    }

    public CameraCaptureResult getCameraCaptureResult() {
        return this.mCameraCaptureResult;
    }

    public Config getImplementationOptions() {
        return this.mImplementationOptions;
    }

    public List<DeferrableSurface> getSurfaces() {
        return Collections.unmodifiableList(this.mSurfaces);
    }

    public TagBundle getTagBundle() {
        return this.mTagBundle;
    }

    public int getTemplateType() {
        return this.mTemplateType;
    }

    public boolean isUseRepeatingSurface() {
        return this.mUseRepeatingSurface;
    }

    public static final class Builder {
        private List<CameraCaptureCallback> mCameraCaptureCallbacks;
        private CameraCaptureResult mCameraCaptureResult;
        private MutableConfig mImplementationOptions;
        private MutableTagBundle mMutableTagBundle;
        private final Set<DeferrableSurface> mSurfaces;
        private int mTemplateType;
        private boolean mUseRepeatingSurface;

        public Builder() {
            this.mSurfaces = new HashSet();
            this.mImplementationOptions = MutableOptionsBundle.create();
            this.mTemplateType = -1;
            this.mCameraCaptureCallbacks = new ArrayList();
            this.mUseRepeatingSurface = false;
            this.mMutableTagBundle = MutableTagBundle.create();
        }

        public static Builder createFrom(UseCaseConfig<?> useCaseConfig) {
            OptionUnpacker captureOptionUnpacker = useCaseConfig.getCaptureOptionUnpacker((OptionUnpacker) null);
            if (captureOptionUnpacker != null) {
                Builder builder = new Builder();
                captureOptionUnpacker.unpack(useCaseConfig, builder);
                return builder;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + useCaseConfig.getTargetName(useCaseConfig.toString()));
        }

        public static Builder from(CaptureConfig captureConfig) {
            return new Builder(captureConfig);
        }

        public void addAllCameraCaptureCallbacks(Collection<CameraCaptureCallback> collection) {
            for (CameraCaptureCallback addCameraCaptureCallback : collection) {
                addCameraCaptureCallback(addCameraCaptureCallback);
            }
        }

        public void addAllTags(TagBundle tagBundle) {
            this.mMutableTagBundle.addTagBundle(tagBundle);
        }

        public void addCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            if (!this.mCameraCaptureCallbacks.contains(cameraCaptureCallback)) {
                this.mCameraCaptureCallbacks.add(cameraCaptureCallback);
            }
        }

        public <T> void addImplementationOption(Config.Option<T> option, T t) {
            this.mImplementationOptions.insertOption(option, t);
        }

        public void addImplementationOptions(Config config) {
            for (Config.Option next : config.listOptions()) {
                Object retrieveOption = this.mImplementationOptions.retrieveOption(next, null);
                Object retrieveOption2 = config.retrieveOption(next);
                if (retrieveOption instanceof MultiValueSet) {
                    ((MultiValueSet) retrieveOption).addAll(((MultiValueSet) retrieveOption2).getAllItems());
                } else {
                    if (retrieveOption2 instanceof MultiValueSet) {
                        retrieveOption2 = ((MultiValueSet) retrieveOption2).clone();
                    }
                    this.mImplementationOptions.insertOption(next, config.getOptionPriority(next), retrieveOption2);
                }
            }
        }

        public void addSurface(DeferrableSurface deferrableSurface) {
            this.mSurfaces.add(deferrableSurface);
        }

        public void addTag(String str, Object obj) {
            this.mMutableTagBundle.putTag(str, obj);
        }

        public CaptureConfig build() {
            return new CaptureConfig(new ArrayList(this.mSurfaces), OptionsBundle.from(this.mImplementationOptions), this.mTemplateType, this.mCameraCaptureCallbacks, this.mUseRepeatingSurface, TagBundle.from(this.mMutableTagBundle), this.mCameraCaptureResult);
        }

        public void clearSurfaces() {
            this.mSurfaces.clear();
        }

        public Config getImplementationOptions() {
            return this.mImplementationOptions;
        }

        public Set<DeferrableSurface> getSurfaces() {
            return this.mSurfaces;
        }

        public Object getTag(String str) {
            return this.mMutableTagBundle.getTag(str);
        }

        public int getTemplateType() {
            return this.mTemplateType;
        }

        public boolean isUseRepeatingSurface() {
            return this.mUseRepeatingSurface;
        }

        public boolean removeCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            return this.mCameraCaptureCallbacks.remove(cameraCaptureCallback);
        }

        public void removeSurface(DeferrableSurface deferrableSurface) {
            this.mSurfaces.remove(deferrableSurface);
        }

        public void setCameraCaptureResult(CameraCaptureResult cameraCaptureResult) {
            this.mCameraCaptureResult = cameraCaptureResult;
        }

        public void setImplementationOptions(Config config) {
            this.mImplementationOptions = MutableOptionsBundle.from(config);
        }

        public void setTemplateType(int i) {
            this.mTemplateType = i;
        }

        public void setUseRepeatingSurface(boolean z) {
            this.mUseRepeatingSurface = z;
        }

        private Builder(CaptureConfig captureConfig) {
            HashSet hashSet = new HashSet();
            this.mSurfaces = hashSet;
            this.mImplementationOptions = MutableOptionsBundle.create();
            this.mTemplateType = -1;
            this.mCameraCaptureCallbacks = new ArrayList();
            this.mUseRepeatingSurface = false;
            this.mMutableTagBundle = MutableTagBundle.create();
            hashSet.addAll(captureConfig.mSurfaces);
            this.mImplementationOptions = MutableOptionsBundle.from(captureConfig.mImplementationOptions);
            this.mTemplateType = captureConfig.mTemplateType;
            this.mCameraCaptureCallbacks.addAll(captureConfig.getCameraCaptureCallbacks());
            this.mUseRepeatingSurface = captureConfig.isUseRepeatingSurface();
            this.mMutableTagBundle = MutableTagBundle.from(captureConfig.getTagBundle());
        }
    }
}
