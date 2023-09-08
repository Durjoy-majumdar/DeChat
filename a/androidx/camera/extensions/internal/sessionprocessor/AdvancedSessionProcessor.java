package androidx.camera.extensions.internal.sessionprocessor;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.impl.Camera2CameraCaptureResultConverter;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.RequestProcessor;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.ImageReferenceImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p329d3.C20434g;

public class AdvancedSessionProcessor extends SessionProcessorBase {
    private final Context mContext;
    private final SessionProcessorImpl mImpl;

    public static class CallbackAdapter implements RequestProcessor.Callback {
        private final RequestProcessorImpl.Callback mCallback;

        public CallbackAdapter(RequestProcessorImpl.Callback callback) {
            this.mCallback = callback;
        }

        private RequestProcessorImpl.Request getImplRequest(RequestProcessor.Request request) {
            C20434g.m22017a(request instanceof RequestAdapter);
            return ((RequestAdapter) request).getImplRequest();
        }

        public void onCaptureBufferLost(RequestProcessor.Request request, long j, int i) {
            this.mCallback.onCaptureBufferLost(getImplRequest(request), j, i);
        }

        public void onCaptureCompleted(RequestProcessor.Request request, CameraCaptureResult cameraCaptureResult) {
            CaptureResult captureResult = Camera2CameraCaptureResultConverter.getCaptureResult(cameraCaptureResult);
            C20434g.m22018b(captureResult instanceof TotalCaptureResult, "CaptureResult in cameraCaptureResult is not a TotalCaptureResult");
            this.mCallback.onCaptureCompleted(getImplRequest(request), (TotalCaptureResult) captureResult);
        }

        public void onCaptureFailed(RequestProcessor.Request request, CameraCaptureFailure cameraCaptureFailure) {
            CaptureFailure captureFailure = Camera2CameraCaptureResultConverter.getCaptureFailure(cameraCaptureFailure);
            C20434g.m22018b(captureFailure != null, "CameraCaptureFailure does not contain CaptureFailure.");
            this.mCallback.onCaptureFailed(getImplRequest(request), captureFailure);
        }

        public void onCaptureProgressed(RequestProcessor.Request request, CameraCaptureResult cameraCaptureResult) {
            CaptureResult captureResult = Camera2CameraCaptureResultConverter.getCaptureResult(cameraCaptureResult);
            C20434g.m22018b(captureResult != null, "Cannot get CaptureResult from the cameraCaptureResult ");
            this.mCallback.onCaptureProgressed(getImplRequest(request), captureResult);
        }

        public void onCaptureSequenceAborted(int i) {
            this.mCallback.onCaptureSequenceAborted(i);
        }

        public void onCaptureSequenceCompleted(int i, long j) {
            this.mCallback.onCaptureSequenceCompleted(i, j);
        }

        public void onCaptureStarted(RequestProcessor.Request request, long j, long j2) {
            this.mCallback.onCaptureStarted(getImplRequest(request), j, j2);
        }
    }

    public static class ImageProcessorAdapter implements ImageProcessor {
        private final ImageProcessorImpl mImpl;

        public ImageProcessorAdapter(ImageProcessorImpl imageProcessorImpl) {
            this.mImpl = imageProcessorImpl;
        }

        public void onNextImageAvailable(int i, long j, ImageReference imageReference, String str) {
            this.mImpl.onNextImageAvailable(i, j, new ImageReferenceImplAdapter(imageReference), str);
        }
    }

    public static class ImageReferenceImplAdapter implements ImageReferenceImpl {
        private final ImageReference mImageReference;

        public ImageReferenceImplAdapter(ImageReference imageReference) {
            this.mImageReference = imageReference;
        }

        public boolean decrement() {
            return this.mImageReference.decrement();
        }

        public Image get() {
            return this.mImageReference.get();
        }

        public boolean increment() {
            return this.mImageReference.increment();
        }
    }

    public static class OutputSurfaceImplAdapter implements OutputSurfaceImpl {
        private final OutputSurface mOutputSurface;

        public OutputSurfaceImplAdapter(OutputSurface outputSurface) {
            this.mOutputSurface = outputSurface;
        }

        public int getImageFormat() {
            return this.mOutputSurface.getImageFormat();
        }

        public Size getSize() {
            return this.mOutputSurface.getSize();
        }

        public Surface getSurface() {
            return this.mOutputSurface.getSurface();
        }
    }

    public static class RequestAdapter implements RequestProcessor.Request {
        private final RequestProcessorImpl.Request mImplRequest;
        private final Config mParameters;
        private final List<Integer> mTargetOutputConfigIds;
        private final int mTemplateId;

        public RequestAdapter(RequestProcessorImpl.Request request) {
            this.mImplRequest = request;
            ArrayList arrayList = new ArrayList();
            for (Integer add : request.getTargetOutputConfigIds()) {
                arrayList.add(add);
            }
            this.mTargetOutputConfigIds = arrayList;
            Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
            for (CaptureRequest.Key key : request.getParameters().keySet()) {
                builder.setCaptureRequestOption(key, request.getParameters().get(key));
            }
            this.mParameters = builder.build();
            this.mTemplateId = request.getTemplateId().intValue();
        }

        public RequestProcessorImpl.Request getImplRequest() {
            return this.mImplRequest;
        }

        public Config getParameters() {
            return this.mParameters;
        }

        public List<Integer> getTargetOutputConfigIds() {
            return this.mTargetOutputConfigIds;
        }

        public int getTemplateId() {
            return this.mTemplateId;
        }
    }

    public class RequestProcessorImplAdapter implements RequestProcessorImpl {
        private final RequestProcessor mRequestProcessor;

        public RequestProcessorImplAdapter(RequestProcessor requestProcessor) {
            this.mRequestProcessor = requestProcessor;
        }

        public void abortCaptures() {
            this.mRequestProcessor.abortCaptures();
        }

        public void setImageProcessor(int i, ImageProcessorImpl imageProcessorImpl) {
            AdvancedSessionProcessor.this.setImageProcessor(i, new ImageProcessorAdapter(imageProcessorImpl));
        }

        public int setRepeating(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.setRepeating(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public void stopRepeating() {
            this.mRequestProcessor.stopRepeating();
        }

        public int submit(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
            return this.mRequestProcessor.submit((RequestProcessor.Request) new RequestAdapter(request), (RequestProcessor.Callback) new CallbackAdapter(callback));
        }

        public int submit(List<RequestProcessorImpl.Request> list, RequestProcessorImpl.Callback callback) {
            ArrayList arrayList = new ArrayList();
            for (RequestProcessorImpl.Request requestAdapter : list) {
                arrayList.add(new RequestAdapter(requestAdapter));
            }
            return this.mRequestProcessor.submit((List<RequestProcessor.Request>) arrayList, (RequestProcessor.Callback) new CallbackAdapter(callback));
        }
    }

    public static class SessionProcessorImplCaptureCallbackAdapter implements SessionProcessorImpl.CaptureCallback {
        private final SessionProcessor.CaptureCallback mCaptureCallback;

        public SessionProcessorImplCaptureCallbackAdapter(SessionProcessor.CaptureCallback captureCallback) {
            this.mCaptureCallback = captureCallback;
        }

        public void onCaptureFailed(int i) {
            this.mCaptureCallback.onCaptureFailed(i);
        }

        public void onCaptureProcessStarted(int i) {
            this.mCaptureCallback.onCaptureProcessStarted(i);
        }

        public void onCaptureSequenceAborted(int i) {
            this.mCaptureCallback.onCaptureSequenceAborted(i);
        }

        public void onCaptureSequenceCompleted(int i) {
            this.mCaptureCallback.onCaptureSequenceCompleted(i);
        }

        public void onCaptureStarted(int i, long j) {
            this.mCaptureCallback.onCaptureStarted(i, j);
        }
    }

    public AdvancedSessionProcessor(SessionProcessorImpl sessionProcessorImpl, Context context) {
        this.mImpl = sessionProcessorImpl;
        this.mContext = context;
    }

    private Camera2SessionConfig convertToCamera2SessionConfig(Camera2SessionConfigImpl camera2SessionConfigImpl) {
        Camera2SessionConfigBuilder camera2SessionConfigBuilder = new Camera2SessionConfigBuilder();
        for (Camera2OutputConfigImpl fromImpl : camera2SessionConfigImpl.getOutputConfigs()) {
            camera2SessionConfigBuilder.addOutputConfig(Camera2OutputConfigBuilder.fromImpl(fromImpl).build());
        }
        for (CaptureRequest.Key key : camera2SessionConfigImpl.getSessionParameters().keySet()) {
            camera2SessionConfigBuilder.addSessionParameter(key, camera2SessionConfigImpl.getSessionParameters().get(key));
        }
        camera2SessionConfigBuilder.setSessionTemplateId(camera2SessionConfigImpl.getSessionTemplateId());
        return camera2SessionConfigBuilder.build();
    }

    public void abortCapture(int i) {
        this.mImpl.abortCapture(i);
    }

    public void deInitSessionInternal() {
        this.mImpl.deInitSession();
    }

    public Camera2SessionConfig initSessionInternal(String str, Map<String, CameraCharacteristics> map, OutputSurface outputSurface, OutputSurface outputSurface2, OutputSurface outputSurface3) {
        return convertToCamera2SessionConfig(this.mImpl.initSession(str, map, this.mContext, new OutputSurfaceImplAdapter(outputSurface), new OutputSurfaceImplAdapter(outputSurface2), outputSurface3 == null ? null : new OutputSurfaceImplAdapter(outputSurface3)));
    }

    public void onCaptureSessionEnd() {
        this.mImpl.onCaptureSessionEnd();
    }

    public void onCaptureSessionStart(RequestProcessor requestProcessor) {
        this.mImpl.onCaptureSessionStart(new RequestProcessorImplAdapter(requestProcessor));
    }

    public void setParameters(Config config) {
        HashMap hashMap = new HashMap();
        CaptureRequestOptions build = CaptureRequestOptions.Builder.from(config).build();
        for (Config.Option option : build.listOptions()) {
            hashMap.put((CaptureRequest.Key) option.getToken(), build.retrieveOption(option));
        }
        this.mImpl.setParameters(hashMap);
    }

    public int startCapture(SessionProcessor.CaptureCallback captureCallback) {
        return this.mImpl.startCapture(new SessionProcessorImplCaptureCallbackAdapter(captureCallback));
    }

    public int startRepeating(SessionProcessor.CaptureCallback captureCallback) {
        return this.mImpl.startRepeating(new SessionProcessorImplCaptureCallbackAdapter(captureCallback));
    }

    public void stopRepeating() {
        this.mImpl.stopRepeating();
    }
}
