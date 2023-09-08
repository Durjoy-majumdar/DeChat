package androidx.camera.extensions.internal;

import android.content.Context;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.CameraEventCallback;
import androidx.camera.camera2.impl.CameraEventCallbacks;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;

public class PreviewConfigProvider implements ConfigProvider<PreviewConfig> {
    public static final Config.Option<Integer> OPTION_PREVIEW_CONFIG_PROVIDER_MODE = Config.Option.create("camerax.extensions.previewConfigProvider.mode", Integer.class);
    private static final String TAG = "PreviewConfigProvider";
    private final Context mContext;
    private final int mEffectMode;
    private final VendorExtender mVendorExtender;

    /* renamed from: androidx.camera.extensions.internal.PreviewConfigProvider$1 */
    public static /* synthetic */ class C165651 {

        /* renamed from: $SwitchMap$androidx$camera$extensions$impl$PreviewExtenderImpl$ProcessorType */
        public static final /* synthetic */ int[] f44377xa95c897f;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.camera.extensions.impl.PreviewExtenderImpl$ProcessorType[] r0 = androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44377xa95c897f = r0
                androidx.camera.extensions.impl.PreviewExtenderImpl$ProcessorType r1 = androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44377xa95c897f     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.extensions.impl.PreviewExtenderImpl$ProcessorType r1 = androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.internal.PreviewConfigProvider.C165651.<clinit>():void");
        }
    }

    public static class PreviewEventAdapter extends CameraEventCallback implements UseCase.EventCallback {
        public volatile boolean mActive = true;
        public final CloseableProcessor mCloseableProcessor;
        private final Context mContext;
        private volatile int mEnabledSessionCount = 0;
        public final PreviewExtenderImpl mImpl;
        public final Object mLock = new Object();
        private volatile boolean mUnbind = false;

        public PreviewEventAdapter(PreviewExtenderImpl previewExtenderImpl, Context context, CloseableProcessor closeableProcessor) {
            this.mImpl = previewExtenderImpl;
            this.mContext = context;
            this.mCloseableProcessor = closeableProcessor;
        }

        private void callDeInit() {
            synchronized (this.mLock) {
                if (this.mActive) {
                    CloseableProcessor closeableProcessor = this.mCloseableProcessor;
                    if (closeableProcessor != null) {
                        closeableProcessor.close();
                    }
                    this.mImpl.onDeInit();
                    this.mActive = false;
                }
            }
        }

        public void onAttach(CameraInfo cameraInfo) {
            synchronized (this.mLock) {
                if (this.mActive) {
                    this.mImpl.onInit(Camera2CameraInfo.from(cameraInfo).getCameraId(), Camera2CameraInfo.extractCameraCharacteristics(cameraInfo), this.mContext);
                }
            }
        }

        public void onDetach() {
            synchronized (this.mLock) {
                this.mUnbind = true;
                if (this.mEnabledSessionCount == 0) {
                    callDeInit();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            r2 = r3.mLock;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r3.mEnabledSessionCount--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            if (r3.mEnabledSessionCount != 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            if (r3.mUnbind == false) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
            callDeInit();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
            r1 = r3.mLock;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r3.mEnabledSessionCount--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x003f, code lost:
            if (r3.mEnabledSessionCount != 0) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0043, code lost:
            if (r3.mUnbind == false) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0045, code lost:
            callDeInit();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0048, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0049, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.camera.core.impl.CaptureConfig onDisableSession() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.mLock     // Catch:{ all -> 0x0050 }
                monitor-enter(r0)     // Catch:{ all -> 0x0050 }
                boolean r1 = r3.mActive     // Catch:{ all -> 0x004d }
                if (r1 == 0) goto L_0x0032
                androidx.camera.extensions.impl.PreviewExtenderImpl r1 = r3.mImpl     // Catch:{ all -> 0x004d }
                androidx.camera.extensions.impl.CaptureStageImpl r1 = r1.onDisableSession()     // Catch:{ all -> 0x004d }
                if (r1 == 0) goto L_0x0032
                androidx.camera.extensions.internal.AdaptingCaptureStage r2 = new androidx.camera.extensions.internal.AdaptingCaptureStage     // Catch:{ all -> 0x004d }
                r2.<init>(r1)     // Catch:{ all -> 0x004d }
                androidx.camera.core.impl.CaptureConfig r1 = r2.getCaptureConfig()     // Catch:{ all -> 0x004d }
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
                java.lang.Object r2 = r3.mLock
                monitor-enter(r2)
                int r0 = r3.mEnabledSessionCount     // Catch:{ all -> 0x002f }
                int r0 = r0 + -1
                r3.mEnabledSessionCount = r0     // Catch:{ all -> 0x002f }
                int r0 = r3.mEnabledSessionCount     // Catch:{ all -> 0x002f }
                if (r0 != 0) goto L_0x002d
                boolean r0 = r3.mUnbind     // Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x002d
                r3.callDeInit()     // Catch:{ all -> 0x002f }
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                return r1
            L_0x002f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                throw r0
            L_0x0032:
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
                r0 = 0
                java.lang.Object r1 = r3.mLock
                monitor-enter(r1)
                int r2 = r3.mEnabledSessionCount     // Catch:{ all -> 0x004a }
                int r2 = r2 + -1
                r3.mEnabledSessionCount = r2     // Catch:{ all -> 0x004a }
                int r2 = r3.mEnabledSessionCount     // Catch:{ all -> 0x004a }
                if (r2 != 0) goto L_0x0048
                boolean r2 = r3.mUnbind     // Catch:{ all -> 0x004a }
                if (r2 == 0) goto L_0x0048
                r3.callDeInit()     // Catch:{ all -> 0x004a }
            L_0x0048:
                monitor-exit(r1)     // Catch:{ all -> 0x004a }
                return r0
            L_0x004a:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x004a }
                throw r0
            L_0x004d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
                throw r1     // Catch:{ all -> 0x0050 }
            L_0x0050:
                r0 = move-exception
                java.lang.Object r1 = r3.mLock
                monitor-enter(r1)
                int r2 = r3.mEnabledSessionCount     // Catch:{ all -> 0x0067 }
                int r2 = r2 + -1
                r3.mEnabledSessionCount = r2     // Catch:{ all -> 0x0067 }
                int r2 = r3.mEnabledSessionCount     // Catch:{ all -> 0x0067 }
                if (r2 != 0) goto L_0x0065
                boolean r2 = r3.mUnbind     // Catch:{ all -> 0x0067 }
                if (r2 == 0) goto L_0x0065
                r3.callDeInit()     // Catch:{ all -> 0x0067 }
            L_0x0065:
                monitor-exit(r1)     // Catch:{ all -> 0x0067 }
                throw r0
            L_0x0067:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0067 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.internal.PreviewConfigProvider.PreviewEventAdapter.onDisableSession():androidx.camera.core.impl.CaptureConfig");
        }

        public CaptureConfig onEnableSession() {
            CaptureStageImpl onEnableSession;
            try {
                synchronized (this.mLock) {
                    if (!this.mActive || (onEnableSession = this.mImpl.onEnableSession()) == null) {
                        synchronized (this.mLock) {
                            this.mEnabledSessionCount++;
                        }
                        return null;
                    }
                    CaptureConfig captureConfig = new AdaptingCaptureStage(onEnableSession).getCaptureConfig();
                    synchronized (this.mLock) {
                        this.mEnabledSessionCount++;
                    }
                    return captureConfig;
                }
            } catch (Throwable th) {
                synchronized (this.mLock) {
                    this.mEnabledSessionCount++;
                    throw th;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.camera.core.impl.CaptureConfig onPresetSession() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.mLock
                monitor-enter(r0)
                androidx.camera.extensions.impl.PreviewExtenderImpl r1 = r4.mImpl     // Catch:{ all -> 0x0026 }
                androidx.camera.extensions.impl.CaptureStageImpl r1 = r1.onPresetSession()     // Catch:{ all -> 0x0026 }
                if (r1 == 0) goto L_0x0023
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0026 }
                r3 = 28
                if (r2 < r3) goto L_0x001c
                androidx.camera.extensions.internal.AdaptingCaptureStage r2 = new androidx.camera.extensions.internal.AdaptingCaptureStage     // Catch:{ all -> 0x0026 }
                r2.<init>(r1)     // Catch:{ all -> 0x0026 }
                androidx.camera.core.impl.CaptureConfig r1 = r2.getCaptureConfig()     // Catch:{ all -> 0x0026 }
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                return r1
            L_0x001c:
                java.lang.String r1 = "PreviewConfigProvider"
                java.lang.String r2 = "The CaptureRequest parameters returned from onPresetSession() will be passed to the camera device as part of the capture session via SessionConfiguration#setSessionParameters(CaptureRequest) which only supported from API level 28!"
                androidx.camera.core.Logger.m15477w(r1, r2)     // Catch:{ all -> 0x0026 }
            L_0x0023:
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                r0 = 0
                return r0
            L_0x0026:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.internal.PreviewConfigProvider.PreviewEventAdapter.onPresetSession():androidx.camera.core.impl.CaptureConfig");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.camera.core.impl.CaptureConfig onRepeating() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                boolean r1 = r3.mActive     // Catch:{ all -> 0x001d }
                if (r1 == 0) goto L_0x001a
                androidx.camera.extensions.impl.PreviewExtenderImpl r1 = r3.mImpl     // Catch:{ all -> 0x001d }
                androidx.camera.extensions.impl.CaptureStageImpl r1 = r1.getCaptureStage()     // Catch:{ all -> 0x001d }
                if (r1 == 0) goto L_0x001a
                androidx.camera.extensions.internal.AdaptingCaptureStage r2 = new androidx.camera.extensions.internal.AdaptingCaptureStage     // Catch:{ all -> 0x001d }
                r2.<init>(r1)     // Catch:{ all -> 0x001d }
                androidx.camera.core.impl.CaptureConfig r1 = r2.getCaptureConfig()     // Catch:{ all -> 0x001d }
                monitor-exit(r0)     // Catch:{ all -> 0x001d }
                return r1
            L_0x001a:
                monitor-exit(r0)     // Catch:{ all -> 0x001d }
                r0 = 0
                return r0
            L_0x001d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001d }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.internal.PreviewConfigProvider.PreviewEventAdapter.onRepeating():androidx.camera.core.impl.CaptureConfig");
        }
    }

    public PreviewConfigProvider(int i, VendorExtender vendorExtender, Context context) {
        this.mEffectMode = i;
        this.mVendorExtender = vendorExtender;
        this.mContext = context;
    }

    public void updateBuilderConfig(Preview.Builder builder, int i, VendorExtender vendorExtender, Context context) {
        PreviewEventAdapter previewEventAdapter;
        PreviewEventAdapter previewEventAdapter2;
        if (vendorExtender instanceof BasicVendorExtender) {
            PreviewExtenderImpl previewExtenderImpl = ((BasicVendorExtender) vendorExtender).getPreviewExtenderImpl();
            if (previewExtenderImpl != null) {
                int i2 = C165651.f44377xa95c897f[previewExtenderImpl.getProcessorType().ordinal()];
                if (i2 == 1) {
                    AdaptingRequestUpdateProcessor adaptingRequestUpdateProcessor = new AdaptingRequestUpdateProcessor(previewExtenderImpl);
                    builder.setImageInfoProcessor(adaptingRequestUpdateProcessor);
                    previewEventAdapter2 = new PreviewEventAdapter(previewExtenderImpl, context, adaptingRequestUpdateProcessor);
                } else if (i2 != 2) {
                    previewEventAdapter = new PreviewEventAdapter(previewExtenderImpl, context, (CloseableProcessor) null);
                    new Camera2ImplConfig.Extender(builder).setCameraEventCallback(new CameraEventCallbacks(previewEventAdapter));
                    builder.setUseCaseEventCallback((UseCase.EventCallback) previewEventAdapter);
                } else {
                    AdaptingPreviewProcessor adaptingPreviewProcessor = new AdaptingPreviewProcessor(previewExtenderImpl.getProcessor());
                    builder.setCaptureProcessor(adaptingPreviewProcessor);
                    builder.setIsRgba8888SurfaceRequired(true);
                    previewEventAdapter2 = new PreviewEventAdapter(previewExtenderImpl, context, adaptingPreviewProcessor);
                }
                previewEventAdapter = previewEventAdapter2;
                new Camera2ImplConfig.Extender(builder).setCameraEventCallback(new CameraEventCallbacks(previewEventAdapter));
                builder.setUseCaseEventCallback((UseCase.EventCallback) previewEventAdapter);
            } else {
                Logger.m15473e(TAG, "PreviewExtenderImpl is null!");
            }
        } else {
            builder.setIsRgba8888SurfaceRequired(true);
        }
        builder.getMutableConfig().insertOption(OPTION_PREVIEW_CONFIG_PROVIDER_MODE, Integer.valueOf(i));
        builder.setSupportedResolutions(vendorExtender.getSupportedPreviewOutputResolutions());
    }

    public PreviewConfig getConfig() {
        Preview.Builder builder = new Preview.Builder();
        updateBuilderConfig(builder, this.mEffectMode, this.mVendorExtender, this.mContext);
        return builder.getUseCaseConfig();
    }
}
