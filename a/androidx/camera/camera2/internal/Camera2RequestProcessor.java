package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.RequestProcessor;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.TagBundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p329d3.C20434g;

public class Camera2RequestProcessor implements RequestProcessor {
    private static final String TAG = "Camera2RequestProcessor";
    private final CaptureSession mCaptureSession;
    private volatile boolean mIsClosed = false;
    private final List<SessionProcessorSurface> mProcessorSurfaces;
    private volatile SessionConfig mSessionConfig;

    public class Camera2CallbackWrapper extends CameraCaptureSession.CaptureCallback {
        private final RequestProcessor.Callback mCallback;
        private final boolean mInvokeSequenceCallback;
        private final RequestProcessor.Request mRequest;

        public Camera2CallbackWrapper(RequestProcessor.Request request, RequestProcessor.Callback callback, boolean z) {
            this.mCallback = callback;
            this.mRequest = request;
            this.mInvokeSequenceCallback = z;
        }

        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            this.mCallback.onCaptureBufferLost(this.mRequest, j, Camera2RequestProcessor.this.findOutputConfigId(surface));
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.mCallback.onCaptureCompleted(this.mRequest, new Camera2CameraCaptureResult(totalCaptureResult));
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.mCallback.onCaptureFailed(this.mRequest, new Camera2CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR, captureFailure));
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.mCallback.onCaptureProgressed(this.mRequest, new Camera2CameraCaptureResult(captureResult));
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            if (this.mInvokeSequenceCallback) {
                this.mCallback.onCaptureSequenceAborted(i);
            }
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            if (this.mInvokeSequenceCallback) {
                this.mCallback.onCaptureSequenceCompleted(i, j);
            }
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.mCallback.onCaptureStarted(this.mRequest, j2, j);
        }
    }

    public Camera2RequestProcessor(CaptureSession captureSession, List<SessionProcessorSurface> list) {
        boolean z = false;
        z = captureSession.mState == CaptureSession.State.OPENED ? true : z;
        C20434g.m22018b(z, "CaptureSession state must be OPENED. Current state:" + captureSession.mState);
        this.mCaptureSession = captureSession;
        this.mProcessorSurfaces = Collections.unmodifiableList(new ArrayList(list));
    }

    private boolean areRequestsValid(List<RequestProcessor.Request> list) {
        for (RequestProcessor.Request isRequestValid : list) {
            if (!isRequestValid(isRequestValid)) {
                return false;
            }
        }
        return true;
    }

    private DeferrableSurface findSurface(int i) {
        for (SessionProcessorSurface next : this.mProcessorSurfaces) {
            if (next.getOutputConfigId() == i) {
                return next;
            }
        }
        return null;
    }

    private boolean isRequestValid(RequestProcessor.Request request) {
        if (request.getTargetOutputConfigIds().isEmpty()) {
            Logger.m15473e(TAG, "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds");
            return false;
        }
        for (Integer next : request.getTargetOutputConfigIds()) {
            if (findSurface(next.intValue()) == null) {
                Logger.m15473e(TAG, "Unable to submit the RequestProcessor.Request: targetOutputConfigId(" + next + ") is not a valid id");
                return false;
            }
        }
        return true;
    }

    public void abortCaptures() {
        if (!this.mIsClosed) {
            this.mCaptureSession.abortCaptures();
        }
    }

    public void close() {
        this.mIsClosed = true;
    }

    public int findOutputConfigId(Surface surface) {
        for (SessionProcessorSurface next : this.mProcessorSurfaces) {
            try {
                if (next.getSurface().get() == surface) {
                    return next.getOutputConfigId();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return -1;
    }

    public int setRepeating(RequestProcessor.Request request, RequestProcessor.Callback callback) {
        if (this.mIsClosed || !isRequestValid(request)) {
            return -1;
        }
        SessionConfig.Builder builder = new SessionConfig.Builder();
        builder.setTemplateType(request.getTemplateId());
        builder.setImplementationOptions(request.getParameters());
        builder.addCameraCaptureCallback(CaptureCallbackContainer.create(new Camera2CallbackWrapper(request, callback, true)));
        if (this.mSessionConfig != null) {
            for (CameraCaptureCallback addCameraCaptureCallback : this.mSessionConfig.getRepeatingCameraCaptureCallbacks()) {
                builder.addCameraCaptureCallback(addCameraCaptureCallback);
            }
            TagBundle tagBundle = this.mSessionConfig.getRepeatingCaptureConfig().getTagBundle();
            for (String next : tagBundle.listKeys()) {
                builder.addTag(next, tagBundle.getTag(next));
            }
        }
        for (Integer intValue : request.getTargetOutputConfigIds()) {
            builder.addSurface(findSurface(intValue.intValue()));
        }
        return this.mCaptureSession.issueRepeatingCaptureRequests(builder.build());
    }

    public void stopRepeating() {
        if (!this.mIsClosed) {
            this.mCaptureSession.stopRepeating();
        }
    }

    public int submit(RequestProcessor.Request request, RequestProcessor.Callback callback) {
        return submit((List<RequestProcessor.Request>) Arrays.asList(new RequestProcessor.Request[]{request}), callback);
    }

    public void updateSessionConfig(SessionConfig sessionConfig) {
        this.mSessionConfig = sessionConfig;
    }

    public int submit(List<RequestProcessor.Request> list, RequestProcessor.Callback callback) {
        if (this.mIsClosed || !areRequestsValid(list)) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (RequestProcessor.Request next : list) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(next.getTemplateId());
            builder.setImplementationOptions(next.getParameters());
            builder.addCameraCaptureCallback(CaptureCallbackContainer.create(new Camera2CallbackWrapper(next, callback, z)));
            z = false;
            for (Integer intValue : next.getTargetOutputConfigIds()) {
                builder.addSurface(findSurface(intValue.intValue()));
            }
            arrayList.add(builder.build());
        }
        return this.mCaptureSession.issueBurstCaptureRequest(arrayList);
    }
}
