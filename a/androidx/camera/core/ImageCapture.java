package androidx.camera.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageSaver;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.C16536g;
import androidx.camera.core.impl.C16539j;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.IoConfig;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.UseCaseEventConfig;
import androidx.camera.core.internal.compat.workaround.ExifRotationAvailability;
import androidx.camera.core.internal.utils.ImageUtil;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p1167z8.C112608f;
import p202m2.C117512b;
import p202m2.C117518e;
import p329d3.C20434g;

public final class ImageCapture extends UseCase {
    public static final int CAPTURE_MODE_MAXIMIZE_QUALITY = 0;
    public static final int CAPTURE_MODE_MINIMIZE_LATENCY = 1;
    public static final int CAPTURE_MODE_ZERO_SHUTTER_LAG = 2;
    private static final int DEFAULT_CAPTURE_MODE = 1;
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final int DEFAULT_FLASH_MODE = 2;
    public static final int ERROR_CAMERA_CLOSED = 3;
    public static final int ERROR_CAPTURE_FAILED = 2;
    public static final int ERROR_FILE_IO = 1;
    public static final int ERROR_INVALID_CAMERA = 4;
    public static final int ERROR_UNKNOWN = 0;
    public static final ExifRotationAvailability EXIF_ROTATION_AVAILABILITY = new ExifRotationAvailability();
    public static final int FLASH_MODE_AUTO = 0;
    public static final int FLASH_MODE_OFF = 2;
    public static final int FLASH_MODE_ON = 1;
    private static final int FLASH_MODE_UNKNOWN = -1;
    public static final int FLASH_TYPE_ONE_SHOT_FLASH = 0;
    public static final int FLASH_TYPE_USE_TORCH_AS_FLASH = 1;
    private static final byte JPEG_QUALITY_MAXIMIZE_QUALITY_MODE = 100;
    private static final byte JPEG_QUALITY_MINIMIZE_LATENCY_MODE = 95;
    private static final int MAX_IMAGES = 2;
    private static final String TAG = "ImageCapture";
    private CaptureBundle mCaptureBundle;
    private CaptureConfig mCaptureConfig;
    private final int mCaptureMode;
    private CaptureProcessor mCaptureProcessor;
    private final ImageReaderProxy.OnImageAvailableListener mClosingListener = new ImageCapture$$a();
    private Rational mCropAspectRatio = null;
    private DeferrableSurface mDeferrableSurface;
    private ExecutorService mExecutor;
    private int mFlashMode = -1;
    private final int mFlashType;
    private ImageCaptureRequestProcessor mImageCaptureRequestProcessor;
    public SafeCloseImageReaderProxy mImageReader;
    private C112608f<Void> mImageReaderCloseFuture = Futures.immediateFuture(null);
    public final Executor mIoExecutor;
    private boolean mIsSessionProcessorEnabled = true;
    private final AtomicReference<Integer> mLockedFlashMode = new AtomicReference<>((Object) null);
    private int mMaxCaptureStages;
    private CameraCaptureCallback mMetadataMatchingCaptureCallback;
    public ProcessingImageReader mProcessingImageReader;
    private Matrix mSensorToBufferTransformMatrix = new Matrix();
    public final Executor mSequentialIoExecutor;
    public SessionConfig.Builder mSessionConfigBuilder;
    private boolean mUseSoftwareJpeg = false;

    /* renamed from: androidx.camera.core.ImageCapture$8 */
    public static /* synthetic */ class C165038 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$ImageSaver$SaveError;

        static {
            int[] iArr = new int[ImageSaver.SaveError.values().length];
            $SwitchMap$androidx$camera$core$ImageSaver$SaveError = iArr;
            try {
                iArr[ImageSaver.SaveError.FILE_IO_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static final class Builder implements UseCaseConfig.Builder<ImageCapture, ImageCaptureConfig, Builder>, ImageOutputConfig.Builder<Builder>, IoConfig.Builder<Builder> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        public static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public Builder setBufferFormat(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, Integer.valueOf(i));
            return this;
        }

        public Builder setCaptureBundle(CaptureBundle captureBundle) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_CAPTURE_BUNDLE, captureBundle);
            return this;
        }

        public Builder setCaptureMode(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE, Integer.valueOf(i));
            return this;
        }

        public Builder setCaptureProcessor(CaptureProcessor captureProcessor) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, captureProcessor);
            return this;
        }

        public Builder setFlashMode(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_FLASH_MODE, Integer.valueOf(i));
            return this;
        }

        public Builder setFlashType(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_FLASH_TYPE, Integer.valueOf(i));
            return this;
        }

        public Builder setImageReaderProxyProvider(ImageReaderProxyProvider imageReaderProxyProvider) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, imageReaderProxyProvider);
            return this;
        }

        public Builder setJpegQuality(int i) {
            C20434g.m22019c(i, 1, 100, "jpegQuality");
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY, Integer.valueOf(i));
            return this;
        }

        public Builder setMaxCaptureStages(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_MAX_CAPTURE_STAGES, Integer.valueOf(i));
            return this;
        }

        public Builder setSessionProcessorEnabled(boolean z) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_SESSION_PROCESSOR_ENABLED, Boolean.valueOf(z));
            return this;
        }

        public Builder setSoftwareJpegEncoderRequested(boolean z) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, Boolean.valueOf(z));
            return this;
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            Class<ImageCapture> cls = ImageCapture.class;
            this.mMutableConfig = mutableOptionsBundle;
            Class cls2 = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls2 == null || cls2.equals(cls)) {
                setTargetClass(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        public static Builder fromConfig(ImageCaptureConfig imageCaptureConfig) {
            return new Builder(MutableOptionsBundle.from(imageCaptureConfig));
        }

        public ImageCapture build() {
            int intValue;
            if (getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, null) == null || getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null) == null) {
                Integer num = (Integer) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
                boolean z = false;
                if (num != null) {
                    C20434g.m22018b(getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
                    getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, num);
                } else if (getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, null) != null) {
                    getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
                } else {
                    getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
                }
                ImageCapture imageCapture = new ImageCapture(getUseCaseConfig());
                Size size = (Size) getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null);
                if (size != null) {
                    imageCapture.setCropAspectRatio(new Rational(size.getWidth(), size.getHeight()));
                }
                if (((Integer) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_MAX_CAPTURE_STAGES, 2)).intValue() >= 1) {
                    z = true;
                }
                C20434g.m22018b(z, "Maximum outstanding image count must be at least 1");
                C20434g.m22020d((Executor) getMutableConfig().retrieveOption(IoConfig.OPTION_IO_EXECUTOR, CameraXExecutors.ioExecutor()), "The IO executor can't be null");
                MutableConfig mutableConfig = getMutableConfig();
                Config.Option<Integer> option = ImageCaptureConfig.OPTION_FLASH_MODE;
                if (!mutableConfig.containsOption(option) || (intValue = ((Integer) getMutableConfig().retrieveOption(option)).intValue()) == 0 || intValue == 1 || intValue == 2) {
                    return imageCapture;
                }
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + intValue);
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        public ImageCaptureConfig getUseCaseConfig() {
            return new ImageCaptureConfig(OptionsBundle.from(this.mMutableConfig));
        }

        public Builder setCameraSelector(CameraSelector cameraSelector) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
            return this;
        }

        public Builder setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        public Builder setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        public Builder setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        public Builder setDefaultSessionConfig(SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        public Builder setIoExecutor(Executor executor) {
            getMutableConfig().insertOption(IoConfig.OPTION_IO_EXECUTOR, executor);
            return this;
        }

        public Builder setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        public Builder setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        public Builder setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        public Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetAspectRatio(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetClass(Class<ImageCapture> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        public Builder setTargetRotation(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        public Builder setUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            getMutableConfig().insertOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
            return this;
        }
    }

    public static final class Defaults implements ConfigProvider<ImageCaptureConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final ImageCaptureConfig DEFAULT_CONFIG = new Builder().setSurfaceOccupancyPriority(4).setTargetAspectRatio(0).getUseCaseConfig();
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 4;

        public ImageCaptureConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    public static class ImageCaptureRequest {
        private final OnImageCapturedCallback mCallback;
        public AtomicBoolean mDispatched = new AtomicBoolean(false);
        public final int mJpegQuality;
        private final Executor mListenerExecutor;
        public final int mRotationDegrees;
        private final Matrix mSensorToBufferTransformMatrix;
        private final Rational mTargetRatio;
        private final Rect mViewPortCropRect;

        public ImageCaptureRequest(int i, int i2, Rational rational, Rect rect, Matrix matrix, Executor executor, OnImageCapturedCallback onImageCapturedCallback) {
            boolean z = false;
            this.mRotationDegrees = i;
            this.mJpegQuality = i2;
            if (rational != null) {
                C20434g.m22018b(!rational.isZero(), "Target ratio cannot be zero");
                C20434g.m22018b(rational.floatValue() > 0.0f ? true : z, "Target ratio must be positive");
            }
            this.mTargetRatio = rational;
            this.mViewPortCropRect = rect;
            this.mSensorToBufferTransformMatrix = matrix;
            this.mListenerExecutor = executor;
            this.mCallback = onImageCapturedCallback;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$dispatchImage$0(ImageProxy imageProxy) {
            this.mCallback.onCaptureSuccess(imageProxy);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$notifyCallbackError$1(int i, String str, Throwable th) {
            this.mCallback.onError(new ImageCaptureException(i, str, th));
        }

        public void dispatchImage(ImageProxy imageProxy) {
            int i;
            Size size;
            if (!this.mDispatched.compareAndSet(false, true)) {
                imageProxy.close();
                return;
            }
            if (ImageCapture.EXIF_ROTATION_AVAILABILITY.shouldUseExifOrientation(imageProxy)) {
                try {
                    ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
                    buffer.rewind();
                    byte[] bArr = new byte[buffer.capacity()];
                    buffer.get(bArr);
                    Exif createFromInputStream = Exif.createFromInputStream(new ByteArrayInputStream(bArr));
                    buffer.rewind();
                    size = new Size(createFromInputStream.getWidth(), createFromInputStream.getHeight());
                    i = createFromInputStream.getRotation();
                } catch (IOException e) {
                    notifyCallbackError(1, "Unable to parse JPEG exif", e);
                    imageProxy.close();
                    return;
                }
            } else {
                size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
                i = this.mRotationDegrees;
            }
            SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy, size, ImmutableImageInfo.create(imageProxy.getImageInfo().getTagBundle(), imageProxy.getImageInfo().getTimestamp(), i, this.mSensorToBufferTransformMatrix));
            settableImageProxy.setCropRect(ImageCapture.computeDispatchCropRect(this.mViewPortCropRect, this.mTargetRatio, this.mRotationDegrees, size, i));
            try {
                this.mListenerExecutor.execute(new ImageCapture$ImageCaptureRequest$$b(this, settableImageProxy));
            } catch (RejectedExecutionException unused) {
                Logger.m15473e(ImageCapture.TAG, "Unable to post to the supplied executor.");
                imageProxy.close();
            }
        }

        public void notifyCallbackError(int i, String str, Throwable th) {
            if (this.mDispatched.compareAndSet(false, true)) {
                try {
                    this.mListenerExecutor.execute(new ImageCapture$ImageCaptureRequest$$a(this, i, str, th));
                } catch (RejectedExecutionException unused) {
                    Logger.m15473e(ImageCapture.TAG, "Unable to post to the supplied executor.");
                }
            }
        }
    }

    public static class ImageCaptureRequestProcessor implements ForwardingImageProxy.OnImageCloseListener {
        public ImageCaptureRequest mCurrentRequest;
        public C112608f<ImageProxy> mCurrentRequestFuture;
        private final ImageCaptor mImageCaptor;
        public final Object mLock;
        private final int mMaxImages;
        public int mOutstandingImages;
        private final Deque<ImageCaptureRequest> mPendingRequests;
        private final RequestProcessCallback mRequestProcessCallback;

        public interface ImageCaptor {
            C112608f<ImageProxy> capture(ImageCaptureRequest imageCaptureRequest);
        }

        public interface RequestProcessCallback {
            void onPreProcessRequest(ImageCaptureRequest imageCaptureRequest);
        }

        public ImageCaptureRequestProcessor(int i, ImageCaptor imageCaptor) {
            this(i, imageCaptor, (RequestProcessCallback) null);
        }

        public void cancelRequests(Throwable th) {
            ImageCaptureRequest imageCaptureRequest;
            C112608f<ImageProxy> fVar;
            ArrayList arrayList;
            synchronized (this.mLock) {
                imageCaptureRequest = this.mCurrentRequest;
                this.mCurrentRequest = null;
                fVar = this.mCurrentRequestFuture;
                this.mCurrentRequestFuture = null;
                arrayList = new ArrayList(this.mPendingRequests);
                this.mPendingRequests.clear();
            }
            if (!(imageCaptureRequest == null || fVar == null)) {
                imageCaptureRequest.notifyCallbackError(ImageCapture.getError(th), th.getMessage(), th);
                fVar.cancel(true);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ImageCaptureRequest) it.next()).notifyCallbackError(ImageCapture.getError(th), th.getMessage(), th);
            }
        }

        public void onImageClose(ImageProxy imageProxy) {
            synchronized (this.mLock) {
                this.mOutstandingImages--;
                processNextRequest();
            }
        }

        public void processNextRequest() {
            synchronized (this.mLock) {
                if (this.mCurrentRequest == null) {
                    if (this.mOutstandingImages >= this.mMaxImages) {
                        Logger.m15477w(ImageCapture.TAG, "Too many acquire images. Close image to be able to process next.");
                        return;
                    }
                    final ImageCaptureRequest poll = this.mPendingRequests.poll();
                    if (poll != null) {
                        this.mCurrentRequest = poll;
                        RequestProcessCallback requestProcessCallback = this.mRequestProcessCallback;
                        if (requestProcessCallback != null) {
                            requestProcessCallback.onPreProcessRequest(poll);
                        }
                        C112608f<ImageProxy> capture = this.mImageCaptor.capture(poll);
                        this.mCurrentRequestFuture = capture;
                        Futures.addCallback(capture, new FutureCallback<ImageProxy>() {
                            public void onFailure(Throwable th) {
                                synchronized (ImageCaptureRequestProcessor.this.mLock) {
                                    if (!(th instanceof CancellationException)) {
                                        poll.notifyCallbackError(ImageCapture.getError(th), th != null ? th.getMessage() : "Unknown error", th);
                                    }
                                    ImageCaptureRequestProcessor imageCaptureRequestProcessor = ImageCaptureRequestProcessor.this;
                                    imageCaptureRequestProcessor.mCurrentRequest = null;
                                    imageCaptureRequestProcessor.mCurrentRequestFuture = null;
                                    imageCaptureRequestProcessor.processNextRequest();
                                }
                            }

                            public void onSuccess(ImageProxy imageProxy) {
                                synchronized (ImageCaptureRequestProcessor.this.mLock) {
                                    imageProxy.getClass();
                                    SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxy);
                                    singleCloseImageProxy.addOnImageCloseListener(ImageCaptureRequestProcessor.this);
                                    ImageCaptureRequestProcessor.this.mOutstandingImages++;
                                    poll.dispatchImage(singleCloseImageProxy);
                                    ImageCaptureRequestProcessor imageCaptureRequestProcessor = ImageCaptureRequestProcessor.this;
                                    imageCaptureRequestProcessor.mCurrentRequest = null;
                                    imageCaptureRequestProcessor.mCurrentRequestFuture = null;
                                    imageCaptureRequestProcessor.processNextRequest();
                                }
                            }
                        }, CameraXExecutors.directExecutor());
                    }
                }
            }
        }

        public void sendRequest(ImageCaptureRequest imageCaptureRequest) {
            synchronized (this.mLock) {
                this.mPendingRequests.offer(imageCaptureRequest);
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(this.mCurrentRequest != null ? 1 : 0);
                objArr[1] = Integer.valueOf(this.mPendingRequests.size());
                Logger.m15471d(ImageCapture.TAG, String.format(locale, "Send image capture request [current, pending] = [%d, %d]", objArr));
                processNextRequest();
            }
        }

        public ImageCaptureRequestProcessor(int i, ImageCaptor imageCaptor, RequestProcessCallback requestProcessCallback) {
            this.mPendingRequests = new ArrayDeque();
            this.mCurrentRequest = null;
            this.mCurrentRequestFuture = null;
            this.mOutstandingImages = 0;
            this.mLock = new Object();
            this.mMaxImages = i;
            this.mImageCaptor = imageCaptor;
            this.mRequestProcessCallback = requestProcessCallback;
        }
    }

    public static final class Metadata {
        private boolean mIsReversedHorizontal;
        private boolean mIsReversedHorizontalSet = false;
        private boolean mIsReversedVertical;
        private Location mLocation;

        public Location getLocation() {
            return this.mLocation;
        }

        public boolean isReversedHorizontal() {
            return this.mIsReversedHorizontal;
        }

        public boolean isReversedHorizontalSet() {
            return this.mIsReversedHorizontalSet;
        }

        public boolean isReversedVertical() {
            return this.mIsReversedVertical;
        }

        public void setLocation(Location location) {
            this.mLocation = location;
        }

        public void setReversedHorizontal(boolean z) {
            this.mIsReversedHorizontal = z;
            this.mIsReversedHorizontalSet = true;
        }

        public void setReversedVertical(boolean z) {
            this.mIsReversedVertical = z;
        }
    }

    public interface OnImageSavedCallback {
        void onError(ImageCaptureException imageCaptureException);

        void onImageSaved(OutputFileResults outputFileResults);
    }

    public static final class OutputFileOptions {
        private final ContentResolver mContentResolver;
        private final ContentValues mContentValues;
        private final File mFile;
        private final Metadata mMetadata;
        private final OutputStream mOutputStream;
        private final Uri mSaveCollection;

        public OutputFileOptions(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, Metadata metadata) {
            this.mFile = file;
            this.mContentResolver = contentResolver;
            this.mSaveCollection = uri;
            this.mContentValues = contentValues;
            this.mOutputStream = outputStream;
            this.mMetadata = metadata == null ? new Metadata() : metadata;
        }

        public ContentResolver getContentResolver() {
            return this.mContentResolver;
        }

        public ContentValues getContentValues() {
            return this.mContentValues;
        }

        public File getFile() {
            return this.mFile;
        }

        public Metadata getMetadata() {
            return this.mMetadata;
        }

        public OutputStream getOutputStream() {
            return this.mOutputStream;
        }

        public Uri getSaveCollection() {
            return this.mSaveCollection;
        }

        public static final class Builder {
            private ContentResolver mContentResolver;
            private ContentValues mContentValues;
            private File mFile;
            private Metadata mMetadata;
            private OutputStream mOutputStream;
            private Uri mSaveCollection;

            public Builder(File file) {
                this.mFile = file;
            }

            public OutputFileOptions build() {
                return new OutputFileOptions(this.mFile, this.mContentResolver, this.mSaveCollection, this.mContentValues, this.mOutputStream, this.mMetadata);
            }

            public Builder setMetadata(Metadata metadata) {
                this.mMetadata = metadata;
                return this;
            }

            public Builder(ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
                this.mContentResolver = contentResolver;
                this.mSaveCollection = uri;
                this.mContentValues = contentValues;
            }

            public Builder(OutputStream outputStream) {
                this.mOutputStream = outputStream;
            }
        }
    }

    public static class OutputFileResults {
        private Uri mSavedUri;

        public OutputFileResults(Uri uri) {
            this.mSavedUri = uri;
        }

        public Uri getSavedUri() {
            return this.mSavedUri;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CaptureMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FlashMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FlashType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ImageCaptureError {
    }

    public static abstract class OnImageCapturedCallback {
        public void onCaptureSuccess(ImageProxy imageProxy) {
        }

        public void onError(ImageCaptureException imageCaptureException) {
        }
    }

    public ImageCapture(ImageCaptureConfig imageCaptureConfig) {
        super(imageCaptureConfig);
        ImageCaptureConfig imageCaptureConfig2 = (ImageCaptureConfig) getCurrentConfig();
        Config.Option<Integer> option = ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
        imageCaptureConfig2.getClass();
        if (C16539j.m15570a(imageCaptureConfig2, option)) {
            this.mCaptureMode = imageCaptureConfig2.getCaptureMode();
        } else {
            this.mCaptureMode = 1;
        }
        this.mFlashType = imageCaptureConfig2.getFlashType(0);
        Executor ioExecutor = imageCaptureConfig2.getIoExecutor(CameraXExecutors.ioExecutor());
        ioExecutor.getClass();
        this.mIoExecutor = ioExecutor;
        this.mSequentialIoExecutor = CameraXExecutors.newSequentialExecutor(ioExecutor);
    }

    private void abortImageCaptureRequests() {
        if (this.mImageCaptureRequestProcessor != null) {
            this.mImageCaptureRequestProcessor.cancelRequests(new CameraClosedException("Camera is closed."));
        }
    }

    public static Rect computeDispatchCropRect(Rect rect, Rational rational, int i, Size size, int i2) {
        if (rect != null) {
            return ImageUtil.computeCropRectFromDispatchInfo(rect, i, size, i2);
        }
        if (rational != null) {
            if (i2 % 180 != 0) {
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (ImageUtil.isAspectRatioValid(size, rational)) {
                return ImageUtil.computeCropRectFromAspectRatio(size, rational);
            }
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public static boolean enforceSoftwareJpegConstraints(MutableConfig mutableConfig) {
        Config.Option<Boolean> option = ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER;
        Boolean bool = Boolean.FALSE;
        boolean z = false;
        if (((Boolean) mutableConfig.retrieveOption(option, bool)).booleanValue()) {
            boolean z2 = true;
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                Logger.m15477w(TAG, "Software JPEG only supported on API 26+, but current API level is " + i);
                z2 = false;
            }
            Integer num = (Integer) mutableConfig.retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num == null || num.intValue() == 256) {
                z = z2;
            } else {
                Logger.m15477w(TAG, "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z) {
                Logger.m15477w(TAG, "Unable to support software JPEG. Disabling.");
                mutableConfig.insertOption(option, bool);
            }
        }
        return z;
    }

    private CaptureBundle getCaptureBundle(CaptureBundle captureBundle) {
        List<CaptureStage> captureStages = this.mCaptureBundle.getCaptureStages();
        return (captureStages == null || captureStages.isEmpty()) ? captureBundle : CaptureBundles.createCaptureBundle(captureStages);
    }

    public static int getError(Throwable th) {
        if (th instanceof CameraClosedException) {
            return 3;
        }
        if (th instanceof ImageCaptureException) {
            return ((ImageCaptureException) th).getImageCaptureError();
        }
        return 0;
    }

    private int getJpegQualityInternal() {
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) getCurrentConfig();
        Config.Option<Integer> option = ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY;
        imageCaptureConfig.getClass();
        if (C16539j.m15570a(imageCaptureConfig, option)) {
            return imageCaptureConfig.getJpegQuality();
        }
        int i = this.mCaptureMode;
        if (i == 0) {
            return 100;
        }
        if (i == 1 || i == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.mCaptureMode + " is invalid");
    }

    private static boolean isImageFormatSupported(List<Pair<Integer, Size[]>> list, int i) {
        if (list == null) {
            return false;
        }
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createPipeline$2(String str, ImageCaptureConfig imageCaptureConfig, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        clearPipeline();
        if (isCurrentCamera(str)) {
            SessionConfig.Builder createPipeline = createPipeline(str, imageCaptureConfig, size);
            this.mSessionConfigBuilder = createPipeline;
            updateSessionConfig(createPipeline.build());
            notifyReset();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$issueTakePicture$11(ImageCaptureRequest imageCaptureRequest, String str, Throwable th) {
        Logger.m15473e(TAG, "Processing image failed! " + str);
        imageCaptureRequest.notifyCallbackError(2, str, th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void lambda$issueTakePicture$12(List list) {
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(ImageReaderProxy imageReaderProxy) {
        ImageProxy acquireLatestImage;
        try {
            acquireLatestImage = imageReaderProxy.acquireLatestImage();
            Objects.toString(acquireLatestImage);
            if (acquireLatestImage != null) {
                acquireLatestImage.close();
                return;
            }
            return;
        } catch (IllegalStateException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$sendImageCaptureRequest$5(OnImageCapturedCallback onImageCapturedCallback) {
        onImageCapturedCallback.onError(new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", (Throwable) null));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$takePictureInternal$7(C117512b.C117513a aVar, ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage == null) {
                aVar.mo182232b(new IllegalStateException("Unable to acquire image"));
            } else if (!aVar.mo182231a(acquireLatestImage)) {
                acquireLatestImage.close();
            }
        } catch (IllegalStateException e) {
            aVar.mo182232b(e);
        }
    }

    /* access modifiers changed from: private */
    public Object lambda$takePictureInternal$9(ImageCaptureRequest imageCaptureRequest, final C117512b.C117513a aVar) {
        this.mImageReader.setOnImageAvailableListener(new ImageCapture$$b(aVar), CameraXExecutors.mainThreadExecutor());
        lockFlashMode();
        C112608f<Void> issueTakePicture = issueTakePicture(imageCaptureRequest);
        Futures.addCallback(issueTakePicture, new FutureCallback<Void>() {
            public void onFailure(Throwable th) {
                ImageCapture.this.unlockFlashMode();
                aVar.mo182232b(th);
            }

            public void onSuccess(Void voidR) {
                ImageCapture.this.unlockFlashMode();
            }
        }, this.mExecutor);
        ImageCapture$$c imageCapture$$c = new ImageCapture$$c(issueTakePicture);
        Executor directExecutor = CameraXExecutors.directExecutor();
        C117518e<Void> eVar = aVar.f351636c;
        if (eVar == null) {
            return "takePictureInternal";
        }
        eVar.addListener(imageCapture$$c, directExecutor);
        return "takePictureInternal";
    }

    private void lockFlashMode() {
        synchronized (this.mLockedFlashMode) {
            if (this.mLockedFlashMode.get() == null) {
                this.mLockedFlashMode.set(Integer.valueOf(getFlashMode()));
            }
        }
    }

    private void sendImageCaptureRequest(Executor executor, OnImageCapturedCallback onImageCapturedCallback, int i) {
        CameraInternal camera = getCamera();
        if (camera == null) {
            executor.execute(new ImageCapture$$k(this, onImageCapturedCallback));
            return;
        }
        ImageCaptureRequestProcessor imageCaptureRequestProcessor = this.mImageCaptureRequestProcessor;
        if (imageCaptureRequestProcessor == null) {
            executor.execute(new ImageCapture$$l(onImageCapturedCallback));
            return;
        }
        imageCaptureRequestProcessor.sendRequest(new ImageCaptureRequest(getRelativeRotation(camera), i, this.mCropAspectRatio, getViewPortCropRect(), this.mSensorToBufferTransformMatrix, executor, onImageCapturedCallback));
    }

    /* access modifiers changed from: private */
    /* renamed from: takePictureInternal */
    public C112608f<ImageProxy> lambda$createPipeline$1(ImageCaptureRequest imageCaptureRequest) {
        return C117512b.m165760a(new ImageCapture$$h(this, imageCaptureRequest));
    }

    private void trySetFlashModeToCameraControl() {
        synchronized (this.mLockedFlashMode) {
            if (this.mLockedFlashMode.get() == null) {
                getCameraControl().setFlashMode(getFlashMode());
            }
        }
    }

    public void clearPipeline() {
        Threads.checkMainThread();
        ImageCaptureRequestProcessor imageCaptureRequestProcessor = this.mImageCaptureRequestProcessor;
        if (imageCaptureRequestProcessor != null) {
            imageCaptureRequestProcessor.cancelRequests(new CancellationException("Request is canceled."));
            this.mImageCaptureRequestProcessor = null;
        }
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        this.mDeferrableSurface = null;
        this.mImageReader = null;
        this.mProcessingImageReader = null;
        this.mImageReaderCloseFuture = Futures.immediateFuture(null);
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0211  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.SessionConfig.Builder createPipeline(java.lang.String r16, androidx.camera.core.impl.ImageCaptureConfig r17, android.util.Size r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.impl.SessionConfig$Builder r2 = androidx.camera.core.impl.SessionConfig.Builder.createFrom(r17)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 2
            r5 = 23
            if (r3 < r5) goto L_0x001e
            int r5 = r15.getCaptureMode()
            if (r5 != r4) goto L_0x001e
            androidx.camera.core.impl.CameraControlInternal r5 = r15.getCameraControl()
            r5.addZslConfig(r1, r2)
        L_0x001e:
            androidx.camera.core.ImageReaderProxyProvider r5 = r17.getImageReaderProxyProvider()
            r6 = 0
            if (r5 == 0) goto L_0x004c
            androidx.camera.core.SafeCloseImageReaderProxy r3 = new androidx.camera.core.SafeCloseImageReaderProxy
            androidx.camera.core.ImageReaderProxyProvider r7 = r17.getImageReaderProxyProvider()
            int r8 = r18.getWidth()
            int r9 = r18.getHeight()
            int r10 = r15.getImageFormat()
            r11 = 2
            r12 = 0
            androidx.camera.core.impl.ImageReaderProxy r5 = r7.newInstance(r8, r9, r10, r11, r12)
            r3.<init>(r5)
            r0.mImageReader = r3
            androidx.camera.core.ImageCapture$1 r3 = new androidx.camera.core.ImageCapture$1
            r3.<init>()
            r0.mMetadataMatchingCaptureCallback = r3
            goto L_0x0129
        L_0x004c:
            boolean r5 = r0.mIsSessionProcessorEnabled
            r7 = 26
            r8 = 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x0102
            int r5 = r15.getImageFormat()
            if (r5 != r8) goto L_0x0071
            androidx.camera.core.AndroidImageReaderProxy r3 = new androidx.camera.core.AndroidImageReaderProxy
            int r5 = r18.getWidth()
            int r7 = r18.getHeight()
            int r8 = r15.getImageFormat()
            android.media.ImageReader r5 = android.media.ImageReader.newInstance(r5, r7, r8, r4)
            r3.<init>(r5)
            r5 = r6
            goto L_0x00cf
        L_0x0071:
            int r5 = r15.getImageFormat()
            r9 = 35
            if (r5 != r9) goto L_0x00e7
            if (r3 < r7) goto L_0x00df
            androidx.camera.core.internal.YuvToJpegProcessor r3 = new androidx.camera.core.internal.YuvToJpegProcessor
            int r5 = r15.getJpegQualityInternal()
            r3.<init>(r5, r4)
            androidx.camera.core.ModifiableImageReaderProxy r5 = new androidx.camera.core.ModifiableImageReaderProxy
            int r7 = r18.getWidth()
            int r10 = r18.getHeight()
            android.media.ImageReader r7 = android.media.ImageReader.newInstance(r7, r10, r9, r4)
            r5.<init>(r7)
            androidx.camera.core.impl.CaptureBundle r7 = androidx.camera.core.CaptureBundles.singleDefaultCaptureBundle()
            androidx.camera.core.ProcessingImageReader$Builder r9 = new androidx.camera.core.ProcessingImageReader$Builder
            r9.<init>(r5, r7, r3)
            java.util.concurrent.ExecutorService r10 = r0.mExecutor
            androidx.camera.core.ProcessingImageReader$Builder r9 = r9.setPostProcessExecutor(r10)
            androidx.camera.core.ProcessingImageReader$Builder r8 = r9.setOutputFormat(r8)
            androidx.camera.core.ProcessingImageReader r8 = r8.build()
            androidx.camera.core.impl.MutableTagBundle r9 = androidx.camera.core.impl.MutableTagBundle.create()
            java.lang.String r10 = r8.getTagBundleKey()
            java.util.List r7 = r7.getCaptureStages()
            r11 = 0
            java.lang.Object r7 = r7.get(r11)
            androidx.camera.core.impl.CaptureStage r7 = (androidx.camera.core.impl.CaptureStage) r7
            int r7 = r7.getId()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.putTag(r10, r7)
            r5.setImageTagBundle(r9)
            r5 = r3
            r3 = r8
        L_0x00cf:
            androidx.camera.core.ImageCapture$2 r7 = new androidx.camera.core.ImageCapture$2
            r7.<init>()
            r0.mMetadataMatchingCaptureCallback = r7
            androidx.camera.core.SafeCloseImageReaderProxy r7 = new androidx.camera.core.SafeCloseImageReaderProxy
            r7.<init>(r3)
            r0.mImageReader = r7
            goto L_0x01af
        L_0x00df:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Does not support API level < 26"
            r1.<init>(r2)
            throw r1
        L_0x00e7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported image format:"
            r2.append(r3)
            int r3 = r15.getImageFormat()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0102:
            androidx.camera.core.impl.CaptureProcessor r5 = r0.mCaptureProcessor
            if (r5 != 0) goto L_0x012c
            boolean r9 = r0.mUseSoftwareJpeg
            if (r9 == 0) goto L_0x010b
            goto L_0x012c
        L_0x010b:
            androidx.camera.core.MetadataImageReader r3 = new androidx.camera.core.MetadataImageReader
            int r5 = r18.getWidth()
            int r7 = r18.getHeight()
            int r8 = r15.getImageFormat()
            r3.<init>(r5, r7, r8, r4)
            androidx.camera.core.impl.CameraCaptureCallback r5 = r3.getCameraCaptureCallback()
            r0.mMetadataMatchingCaptureCallback = r5
            androidx.camera.core.SafeCloseImageReaderProxy r5 = new androidx.camera.core.SafeCloseImageReaderProxy
            r5.<init>(r3)
            r0.mImageReader = r5
        L_0x0129:
            r5 = r6
            goto L_0x01af
        L_0x012c:
            int r10 = r15.getImageFormat()
            int r9 = r15.getImageFormat()
            boolean r11 = r0.mUseSoftwareJpeg
            if (r11 == 0) goto L_0x0175
            if (r3 < r7) goto L_0x016d
            java.lang.String r3 = "ImageCapture"
            java.lang.String r5 = "Using software JPEG encoder."
            androidx.camera.core.Logger.m15475i(r3, r5)
            androidx.camera.core.impl.CaptureProcessor r3 = r0.mCaptureProcessor
            if (r3 == 0) goto L_0x015c
            androidx.camera.core.internal.YuvToJpegProcessor r3 = new androidx.camera.core.internal.YuvToJpegProcessor
            int r5 = r15.getJpegQualityInternal()
            int r7 = r0.mMaxCaptureStages
            r3.<init>(r5, r7)
            androidx.camera.core.CaptureProcessorPipeline r5 = new androidx.camera.core.CaptureProcessorPipeline
            androidx.camera.core.impl.CaptureProcessor r7 = r0.mCaptureProcessor
            int r9 = r0.mMaxCaptureStages
            java.util.concurrent.ExecutorService r11 = r0.mExecutor
            r5.<init>(r7, r9, r3, r11)
            goto L_0x0168
        L_0x015c:
            androidx.camera.core.internal.YuvToJpegProcessor r3 = new androidx.camera.core.internal.YuvToJpegProcessor
            int r5 = r15.getJpegQualityInternal()
            int r7 = r0.mMaxCaptureStages
            r3.<init>(r5, r7)
            r5 = r3
        L_0x0168:
            r13 = r5
            r5 = r3
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0178
        L_0x016d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Software JPEG only supported on API 26+"
            r1.<init>(r2)
            throw r1
        L_0x0175:
            r13 = r5
            r5 = r6
            r3 = r9
        L_0x0178:
            androidx.camera.core.ProcessingImageReader$Builder r14 = new androidx.camera.core.ProcessingImageReader$Builder
            int r8 = r18.getWidth()
            int r9 = r18.getHeight()
            int r11 = r0.mMaxCaptureStages
            androidx.camera.core.impl.CaptureBundle r7 = androidx.camera.core.CaptureBundles.singleDefaultCaptureBundle()
            androidx.camera.core.impl.CaptureBundle r12 = r15.getCaptureBundle(r7)
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.util.concurrent.ExecutorService r7 = r0.mExecutor
            androidx.camera.core.ProcessingImageReader$Builder r7 = r14.setPostProcessExecutor(r7)
            androidx.camera.core.ProcessingImageReader$Builder r3 = r7.setOutputFormat(r3)
            androidx.camera.core.ProcessingImageReader r3 = r3.build()
            r0.mProcessingImageReader = r3
            androidx.camera.core.impl.CameraCaptureCallback r3 = r3.getCameraCaptureCallback()
            r0.mMetadataMatchingCaptureCallback = r3
            androidx.camera.core.SafeCloseImageReaderProxy r3 = new androidx.camera.core.SafeCloseImageReaderProxy
            androidx.camera.core.ProcessingImageReader r7 = r0.mProcessingImageReader
            r3.<init>(r7)
            r0.mImageReader = r3
        L_0x01af:
            androidx.camera.core.ImageCapture$ImageCaptureRequestProcessor r3 = r0.mImageCaptureRequestProcessor
            if (r3 == 0) goto L_0x01bd
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.String r8 = "Request is canceled."
            r7.<init>(r8)
            r3.cancelRequests(r7)
        L_0x01bd:
            androidx.camera.core.ImageCapture$ImageCaptureRequestProcessor r3 = new androidx.camera.core.ImageCapture$ImageCaptureRequestProcessor
            androidx.camera.core.ImageCapture$$f r7 = new androidx.camera.core.ImageCapture$$f
            r7.<init>(r15)
            if (r5 != 0) goto L_0x01c8
            r8 = r6
            goto L_0x01cd
        L_0x01c8:
            androidx.camera.core.ImageCapture$3 r8 = new androidx.camera.core.ImageCapture$3
            r8.<init>(r5)
        L_0x01cd:
            r3.<init>(r4, r7, r8)
            r0.mImageCaptureRequestProcessor = r3
            androidx.camera.core.SafeCloseImageReaderProxy r3 = r0.mImageReader
            androidx.camera.core.impl.ImageReaderProxy$OnImageAvailableListener r4 = r0.mClosingListener
            java.util.concurrent.ScheduledExecutorService r5 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            r3.setOnImageAvailableListener(r4, r5)
            androidx.camera.core.impl.DeferrableSurface r3 = r0.mDeferrableSurface
            if (r3 == 0) goto L_0x01e4
            r3.close()
        L_0x01e4:
            androidx.camera.core.impl.ImmediateSurface r3 = new androidx.camera.core.impl.ImmediateSurface
            androidx.camera.core.SafeCloseImageReaderProxy r4 = r0.mImageReader
            android.view.Surface r4 = r4.getSurface()
            android.util.Size r5 = new android.util.Size
            androidx.camera.core.SafeCloseImageReaderProxy r7 = r0.mImageReader
            int r7 = r7.getWidth()
            androidx.camera.core.SafeCloseImageReaderProxy r8 = r0.mImageReader
            int r8 = r8.getHeight()
            r5.<init>(r7, r8)
            androidx.camera.core.SafeCloseImageReaderProxy r7 = r0.mImageReader
            int r7 = r7.getImageFormat()
            r3.<init>(r4, r5, r7)
            r0.mDeferrableSurface = r3
            androidx.camera.core.ProcessingImageReader r3 = r0.mProcessingImageReader
            if (r3 == 0) goto L_0x0211
            z8.f r3 = r3.getCloseFuture()
            goto L_0x0215
        L_0x0211:
            z8.f r3 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r6)
        L_0x0215:
            r0.mImageReaderCloseFuture = r3
            androidx.camera.core.impl.DeferrableSurface r3 = r0.mDeferrableSurface
            z8.f r3 = r3.getTerminationFuture()
            androidx.camera.core.SafeCloseImageReaderProxy r4 = r0.mImageReader
            java.util.Objects.requireNonNull(r4)
            androidx.camera.camera2.internal.ZslControlImpl$$a r5 = new androidx.camera.camera2.internal.ZslControlImpl$$a
            r5.<init>(r4)
            java.util.concurrent.ScheduledExecutorService r4 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            r3.addListener(r5, r4)
            androidx.camera.core.impl.DeferrableSurface r3 = r0.mDeferrableSurface
            r2.addNonRepeatingSurface(r3)
            androidx.camera.core.ImageCapture$$g r3 = new androidx.camera.core.ImageCapture$$g
            r4 = r16
            r5 = r17
            r3.<init>(r15, r4, r5, r1)
            r2.addErrorListener(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageCapture.createPipeline(java.lang.String, androidx.camera.core.impl.ImageCaptureConfig, android.util.Size):androidx.camera.core.impl.SessionConfig$Builder");
    }

    public int getCaptureMode() {
        return this.mCaptureMode;
    }

    public UseCaseConfig<?> getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config config = useCaseConfigFactory.getConfig(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE, getCaptureMode());
        if (z) {
            config = C16536g.m15555b(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public int getFlashMode() {
        int i;
        synchronized (this.mLockedFlashMode) {
            i = this.mFlashMode;
            if (i == -1) {
                i = ((ImageCaptureConfig) getCurrentConfig()).getFlashMode(2);
            }
        }
        return i;
    }

    public int getJpegQuality() {
        return getJpegQualityInternal();
    }

    public ResolutionInfo getResolutionInfo() {
        return super.getResolutionInfo();
    }

    public ResolutionInfo getResolutionInfoInternal() {
        CameraInternal camera = getCamera();
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        if (camera == null || attachedSurfaceResolution == null) {
            return null;
        }
        Rect viewPortCropRect = getViewPortCropRect();
        Rational rational = this.mCropAspectRatio;
        if (viewPortCropRect == null) {
            viewPortCropRect = rational != null ? ImageUtil.computeCropRectFromAspectRatio(attachedSurfaceResolution, rational) : new Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        return ResolutionInfo.create(attachedSurfaceResolution, viewPortCropRect, getRelativeRotation(camera));
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    public C112608f<Void> issueTakePicture(ImageCaptureRequest imageCaptureRequest) {
        String str;
        CaptureBundle captureBundle;
        Logger.m15471d(TAG, "issueTakePicture");
        ArrayList arrayList = new ArrayList();
        if (this.mProcessingImageReader != null) {
            captureBundle = getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
            if (captureBundle == null) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle."));
            }
            if (this.mCaptureProcessor == null && captureBundle.getCaptureStages().size() > 1) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("No CaptureProcessor can be found to process the images captured for multiple CaptureStages."));
            }
            if (captureBundle.getCaptureStages().size() > this.mMaxCaptureStages) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            }
            this.mProcessingImageReader.setCaptureBundle(captureBundle);
            this.mProcessingImageReader.setOnProcessingErrorCallback(CameraXExecutors.directExecutor(), new ImageCapture$$i(imageCaptureRequest));
            str = this.mProcessingImageReader.getTagBundleKey();
        } else {
            captureBundle = getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
            if (captureBundle.getCaptureStages().size() > 1) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
            }
            str = null;
        }
        for (CaptureStage next : captureBundle.getCaptureStages()) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mCaptureConfig.getTemplateType());
            builder.addImplementationOptions(this.mCaptureConfig.getImplementationOptions());
            builder.addAllCameraCaptureCallbacks(this.mSessionConfigBuilder.getSingleCameraCaptureCallbacks());
            builder.addSurface(this.mDeferrableSurface);
            if (getImageFormat() == 256) {
                if (EXIF_ROTATION_AVAILABILITY.isRotationOptionSupported()) {
                    builder.addImplementationOption(CaptureConfig.OPTION_ROTATION, Integer.valueOf(imageCaptureRequest.mRotationDegrees));
                }
                builder.addImplementationOption(CaptureConfig.OPTION_JPEG_QUALITY, Integer.valueOf(imageCaptureRequest.mJpegQuality));
            }
            builder.addImplementationOptions(next.getCaptureConfig().getImplementationOptions());
            if (str != null) {
                builder.addTag(str, Integer.valueOf(next.getId()));
            }
            builder.addCameraCaptureCallback(this.mMetadataMatchingCaptureCallback);
            arrayList.add(builder.build());
        }
        return Futures.transform(getCameraControl().submitStillCaptureRequests(arrayList, this.mCaptureMode, this.mFlashType), new ImageCapture$$j(), CameraXExecutors.directExecutor());
    }

    public void onAttached() {
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) getCurrentConfig();
        this.mCaptureConfig = CaptureConfig.Builder.createFrom(imageCaptureConfig).build();
        this.mCaptureProcessor = imageCaptureConfig.getCaptureProcessor((CaptureProcessor) null);
        this.mMaxCaptureStages = imageCaptureConfig.getMaxCaptureStages(2);
        this.mCaptureBundle = imageCaptureConfig.getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
        this.mUseSoftwareJpeg = imageCaptureConfig.isSoftwareJpegEncoderRequested();
        this.mIsSessionProcessorEnabled = imageCaptureConfig.isSessionProcessorEnabled();
        C20434g.m22020d(getCamera(), "Attached camera cannot be null");
        this.mExecutor = Executors.newFixedThreadPool(1, new ThreadFactory() {
            private final AtomicInteger mId = new AtomicInteger(0);

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "CameraX-image_capture_" + this.mId.getAndIncrement());
            }
        });
    }

    public void onCameraControlReady() {
        trySetFlashModeToCameraControl();
    }

    public void onDetached() {
        C112608f<Void> fVar = this.mImageReaderCloseFuture;
        abortImageCaptureRequests();
        clearPipeline();
        this.mUseSoftwareJpeg = false;
        fVar.addListener(new ImageCapture$$m(this.mExecutor), CameraXExecutors.directExecutor());
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [androidx.camera.core.impl.UseCaseConfig$Builder, androidx.camera.core.ExtendableBuilder, androidx.camera.core.impl.UseCaseConfig$Builder<?, ?, ?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal r8, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r9) {
        /*
            r7 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r9.getUseCaseConfig()
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureProcessor> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR
            r2 = 0
            java.lang.Object r0 = r0.retrieveOption(r1, r2)
            java.lang.String r3 = "ImageCapture"
            if (r0 == 0) goto L_0x0026
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r0 < r4) goto L_0x0026
            java.lang.String r8 = "Requesting software JPEG due to a CaptureProcessor is set."
            androidx.camera.core.Logger.m15475i(r3, r8)
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r0 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r8.insertOption(r0, r3)
            goto L_0x0058
        L_0x0026:
            androidx.camera.core.impl.Quirks r8 = r8.getCameraQuirks()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk> r0 = androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk.class
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L_0x0058
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r0 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object r8 = r8.retrieveOption(r0, r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x004c
            java.lang.String r8 = "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."
            androidx.camera.core.Logger.m15477w(r3, r8)
            goto L_0x0058
        L_0x004c:
            java.lang.String r8 = "Requesting software JPEG due to device quirk."
            androidx.camera.core.Logger.m15475i(r3, r8)
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            r8.insertOption(r0, r4)
        L_0x0058:
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            boolean r8 = enforceSoftwareJpegConstraints(r8)
            androidx.camera.core.impl.MutableConfig r0 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r3 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT
            java.lang.Object r0 = r0.retrieveOption(r3, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3 = 0
            r4 = 1
            r5 = 35
            if (r0 == 0) goto L_0x0099
            androidx.camera.core.impl.MutableConfig r6 = r9.getMutableConfig()
            java.lang.Object r1 = r6.retrieveOption(r1, r2)
            if (r1 != 0) goto L_0x007e
            r1 = 1
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            java.lang.String r2 = "Cannot set buffer format with CaptureProcessor defined."
            p329d3.C20434g.m22018b(r1, r2)
            androidx.camera.core.impl.MutableConfig r1 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r2 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            if (r8 == 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            int r5 = r0.intValue()
        L_0x0091:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r1.insertOption(r2, r8)
            goto L_0x00f9
        L_0x0099:
            androidx.camera.core.impl.MutableConfig r0 = r9.getMutableConfig()
            java.lang.Object r0 = r0.retrieveOption(r1, r2)
            if (r0 != 0) goto L_0x00ec
            if (r8 == 0) goto L_0x00a6
            goto L_0x00ec
        L_0x00a6:
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> r0 = androidx.camera.core.impl.ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS
            java.lang.Object r8 = r8.retrieveOption(r0, r2)
            java.util.List r8 = (java.util.List) r8
            r0 = 256(0x100, float:3.59E-43)
            if (r8 != 0) goto L_0x00c4
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.insertOption(r1, r0)
            goto L_0x00f9
        L_0x00c4:
            boolean r1 = isImageFormatSupported(r8, r0)
            if (r1 == 0) goto L_0x00d8
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.insertOption(r1, r0)
            goto L_0x00f9
        L_0x00d8:
            boolean r8 = isImageFormatSupported(r8, r5)
            if (r8 == 0) goto L_0x00f9
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r8.insertOption(r0, r1)
            goto L_0x00f9
        L_0x00ec:
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r8.insertOption(r0, r1)
        L_0x00f9:
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_MAX_CAPTURE_STAGES
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r8 = r8.retrieveOption(r0, r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 < r4) goto L_0x0111
            r3 = 1
        L_0x0111:
            java.lang.String r8 = "Maximum outstanding image count must be at least 1"
            p329d3.C20434g.m22018b(r3, r8)
            androidx.camera.core.impl.UseCaseConfig r8 = r9.getUseCaseConfig()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageCapture.onMergeConfig(androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.impl.UseCaseConfig$Builder):androidx.camera.core.impl.UseCaseConfig");
    }

    public void onStateDetached() {
        abortImageCaptureRequests();
    }

    public Size onSuggestedResolutionUpdated(Size size) {
        SessionConfig.Builder createPipeline = createPipeline(getCameraId(), (ImageCaptureConfig) getCurrentConfig(), size);
        this.mSessionConfigBuilder = createPipeline;
        updateSessionConfig(createPipeline.build());
        notifyActive();
        return size;
    }

    public void setCropAspectRatio(Rational rational) {
        this.mCropAspectRatio = rational;
    }

    public void setFlashMode(int i) {
        if (i == 0 || i == 1 || i == 2) {
            synchronized (this.mLockedFlashMode) {
                this.mFlashMode = i;
                trySetFlashModeToCameraControl();
            }
            return;
        }
        throw new IllegalArgumentException("Invalid flash mode: " + i);
    }

    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        this.mSensorToBufferTransformMatrix = matrix;
    }

    public void setTargetRotation(int i) {
        int targetRotation = getTargetRotation();
        if (setTargetRotationInternal(i) && this.mCropAspectRatio != null) {
            this.mCropAspectRatio = ImageUtil.getRotatedAspectRatio(Math.abs(CameraOrientationUtil.surfaceRotationToDegrees(i) - CameraOrientationUtil.surfaceRotationToDegrees(targetRotation)), this.mCropAspectRatio);
        }
    }

    /* renamed from: takePicture */
    public void lambda$takePicture$3(Executor executor, OnImageCapturedCallback onImageCapturedCallback) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new ImageCapture$$d(this, executor, onImageCapturedCallback));
        } else {
            sendImageCaptureRequest(executor, onImageCapturedCallback, getJpegQualityInternal());
        }
    }

    public String toString() {
        return "ImageCapture:" + getName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unlockFlashMode() {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = r3.mLockedFlashMode
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r1 = r3.mLockedFlashMode     // Catch:{ all -> 0x001f }
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch:{ all -> 0x001f }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x0010:
            int r1 = r1.intValue()     // Catch:{ all -> 0x001f }
            int r2 = r3.getFlashMode()     // Catch:{ all -> 0x001f }
            if (r1 == r2) goto L_0x001d
            r3.trySetFlashModeToCameraControl()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageCapture.unlockFlashMode():void");
    }

    /* renamed from: takePicture */
    public void lambda$takePicture$4(OutputFileOptions outputFileOptions, Executor executor, final OnImageSavedCallback onImageSavedCallback) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new ImageCapture$$e(this, outputFileOptions, executor, onImageSavedCallback));
            return;
        }
        final C165004 r7 = new ImageSaver.OnImageSavedCallback() {
            public void onError(ImageSaver.SaveError saveError, String str, Throwable th) {
                int i = 1;
                if (C165038.$SwitchMap$androidx$camera$core$ImageSaver$SaveError[saveError.ordinal()] != 1) {
                    i = 0;
                }
                onImageSavedCallback.onError(new ImageCaptureException(i, str, th));
            }

            public void onImageSaved(OutputFileResults outputFileResults) {
                onImageSavedCallback.onImageSaved(outputFileResults);
            }
        };
        int jpegQualityInternal = getJpegQualityInternal();
        final OutputFileOptions outputFileOptions2 = outputFileOptions;
        final int i = jpegQualityInternal;
        final Executor executor2 = executor;
        final OnImageSavedCallback onImageSavedCallback2 = onImageSavedCallback;
        C165015 r2 = new OnImageCapturedCallback() {
            public void onCaptureSuccess(ImageProxy imageProxy) {
                ImageCapture.this.mIoExecutor.execute(new ImageSaver(imageProxy, outputFileOptions2, imageProxy.getImageInfo().getRotationDegrees(), i, executor2, ImageCapture.this.mSequentialIoExecutor, r7));
            }

            public void onError(ImageCaptureException imageCaptureException) {
                onImageSavedCallback2.onError(imageCaptureException);
            }
        };
        int relativeRotation = getRelativeRotation(getCamera());
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        Rect computeDispatchCropRect = computeDispatchCropRect(getViewPortCropRect(), this.mCropAspectRatio, relativeRotation, attachedSurfaceResolution, relativeRotation);
        if (ImageUtil.shouldCropImage(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight(), computeDispatchCropRect.width(), computeDispatchCropRect.height())) {
            jpegQualityInternal = this.mCaptureMode == 0 ? 100 : 95;
        }
        sendImageCaptureRequest(CameraXExecutors.mainThreadExecutor(), r2, jpegQualityInternal);
    }
}
