package com.tencent.maas.instamovie;

import com.tencent.maas.base.Vec2;
import com.tencent.maas.handlebox.model.MJHandleBoxSettings;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.internal.NativeCallbackManager;
import com.tencent.maas.model.time.MJTime;
import com.tencent.maas.model.time.MJTimeRange;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import p172io.clipworks.corekit.NativeLogger;

public class MJMovieSessionCallback {

    public static class CompleteCallback extends BaseCallback<MJMoveSessionCallbackArg.CompleteArg> {
        private final MJMovieSession.OnComplete onComplete;

        public CompleteCallback(MJMovieSession mJMovieSession, MJMovieSession.OnComplete onComplete2) {
            super(mJMovieSession);
            this.onComplete = onComplete2;
        }

        public void onInvoke(MJMovieSession mJMovieSession, MJMoveSessionCallbackArg.CompleteArg completeArg) {
            MJMovieSession.OnComplete onComplete2 = this.onComplete;
            if (onComplete2 != null && completeArg != null) {
                onComplete2.onComplete(completeArg.error);
            }
        }

        public CompleteCallback(MJMovieSession mJMovieSession, MJMovieSession.OnComplete onComplete2, boolean z) {
            super(mJMovieSession, z);
            this.onComplete = onComplete2;
        }
    }

    public static class ExportClipBundleCallback extends BaseCallback<MJMoveSessionCallbackArg.ExportClipBundleArg> {
        private final MJMovieSession.OnExportClipBundle onExportClipBundle;

        public ExportClipBundleCallback(MJMovieSession mJMovieSession, MJMovieSession.OnExportClipBundle onExportClipBundle2) {
            super(mJMovieSession);
            this.onExportClipBundle = onExportClipBundle2;
        }

        public void onInvoke(MJMovieSession mJMovieSession, MJMoveSessionCallbackArg.ExportClipBundleArg exportClipBundleArg) {
            MJMovieSession.OnExportClipBundle onExportClipBundle2 = this.onExportClipBundle;
            if (onExportClipBundle2 != null && exportClipBundleArg != null) {
                onExportClipBundle2.onExportClipBundle(exportClipBundleArg.path, exportClipBundleArg.error);
            }
        }

        public ExportClipBundleCallback(MJMovieSession mJMovieSession, boolean z, MJMovieSession.OnExportClipBundle onExportClipBundle2) {
            super(mJMovieSession, z);
            this.onExportClipBundle = onExportClipBundle2;
        }
    }

    public static class MediaTimeChangeCallback extends BaseCallback<MJMoveSessionCallbackArg.MediaTimeChangeArg> {
        private final MJMovieSession.OnMediaTimeChange onMediaTimeChange;

        public MediaTimeChangeCallback(MJMovieSession mJMovieSession, MJMovieSession.OnMediaTimeChange onMediaTimeChange2) {
            super(mJMovieSession);
            this.onMediaTimeChange = onMediaTimeChange2;
        }

        public void onInvoke(MJMovieSession mJMovieSession, MJMoveSessionCallbackArg.MediaTimeChangeArg mediaTimeChangeArg) {
            MJMovieSession.OnMediaTimeChange onMediaTimeChange2 = this.onMediaTimeChange;
            if (onMediaTimeChange2 != null && mediaTimeChangeArg != null) {
                onMediaTimeChange2.onMediaTimeChange(mediaTimeChangeArg.lastFrameTime, mediaTimeChangeArg.mediaTimeRange, mediaTimeChangeArg.tag);
            }
        }

        public MediaTimeChangeCallback(MJMovieSession mJMovieSession, MJMovieSession.OnMediaTimeChange onMediaTimeChange2, boolean z) {
            super(mJMovieSession, z);
            this.onMediaTimeChange = onMediaTimeChange2;
        }
    }

    public static class OnDidTapSegmentCallback extends BaseCallback<MJMoveSessionCallbackArg.OnDidTapSegmentArg> {
        private final MJMovieSession.OnDidTapSegment onDidTapSegment;

        public OnDidTapSegmentCallback(MJMovieSession mJMovieSession, MJMovieSession.OnDidTapSegment onDidTapSegment2) {
            super(mJMovieSession);
            this.onDidTapSegment = onDidTapSegment2;
        }

        public void onInvoke(MJMovieSession mJMovieSession, MJMoveSessionCallbackArg.OnDidTapSegmentArg onDidTapSegmentArg) {
            MJMovieSession.OnDidTapSegment onDidTapSegment2 = this.onDidTapSegment;
            if (onDidTapSegment2 != null && onDidTapSegmentArg != null) {
                onDidTapSegment2.onDidTapSegment(onDidTapSegmentArg.f309910ID, onDidTapSegmentArg.hints);
            }
        }

        public OnDidTapSegmentCallback(MJMovieSession mJMovieSession, boolean z, MJMovieSession.OnDidTapSegment onDidTapSegment2) {
            super(mJMovieSession, z);
            this.onDidTapSegment = onDidTapSegment2;
        }
    }

    public static class OnHandleBoxSettingsChangeCallback extends BaseCallback<MJMoveSessionCallbackArg.OnHandleBoxSettingsDidChangeArg> {
        private final MJMovieSession.OnHandleBoxSettingsChanged onHandleBoxSettingsChanged;

        public OnHandleBoxSettingsChangeCallback(MJMovieSession mJMovieSession, MJMovieSession.OnHandleBoxSettingsChanged onHandleBoxSettingsChanged2) {
            super(mJMovieSession);
            this.onHandleBoxSettingsChanged = onHandleBoxSettingsChanged2;
        }

        public void onInvoke(MJMovieSession mJMovieSession, MJMoveSessionCallbackArg.OnHandleBoxSettingsDidChangeArg onHandleBoxSettingsDidChangeArg) {
            MJMovieSession.OnHandleBoxSettingsChanged onHandleBoxSettingsChanged2 = this.onHandleBoxSettingsChanged;
            if (onHandleBoxSettingsChanged2 != null && onHandleBoxSettingsDidChangeArg != null) {
                onHandleBoxSettingsChanged2.handleBoxSettingsChanged(onHandleBoxSettingsDidChangeArg.handleBoxSettings);
            }
        }

        public OnHandleBoxSettingsChangeCallback(MJMovieSession mJMovieSession, boolean z, MJMovieSession.OnHandleBoxSettingsChanged onHandleBoxSettingsChanged2) {
            super(mJMovieSession, z);
            this.onHandleBoxSettingsChanged = onHandleBoxSettingsChanged2;
        }
    }

    public static class OnHanldeBoxCompleteCallback extends BaseCallback<MJMoveSessionCallbackArg.OnHandleBoxCompleteArg> {
        private final MJMovieSession.OnHandleBoxComplete onHandleBoxComplete;

        public OnHanldeBoxCompleteCallback(MJMovieSession mJMovieSession, MJMovieSession.OnHandleBoxComplete onHandleBoxComplete2) {
            super(mJMovieSession);
            this.onHandleBoxComplete = onHandleBoxComplete2;
        }

        public void onInvoke(MJMovieSession mJMovieSession, MJMoveSessionCallbackArg.OnHandleBoxCompleteArg onHandleBoxCompleteArg) {
            MJMovieSession.OnHandleBoxComplete onHandleBoxComplete2 = this.onHandleBoxComplete;
            if (onHandleBoxComplete2 != null && onHandleBoxCompleteArg != null) {
                onHandleBoxComplete2.onHandleBoxComplete(onHandleBoxCompleteArg.segmentID);
            }
        }

        public OnHanldeBoxCompleteCallback(MJMovieSession mJMovieSession, boolean z, MJMovieSession.OnHandleBoxComplete onHandleBoxComplete2) {
            super(mJMovieSession, z);
            this.onHandleBoxComplete = onHandleBoxComplete2;
        }
    }

    public static class OnWillShowHandleBoxCallback extends BaseCallback<MJMoveSessionCallbackArg.OnWillShowHandleBoxArg> {
        private final MJMovieSession.OnWillShowHandleBox onWillShowHandleBox;

        public OnWillShowHandleBoxCallback(MJMovieSession mJMovieSession, MJMovieSession.OnWillShowHandleBox onWillShowHandleBox2) {
            super(mJMovieSession);
            this.onWillShowHandleBox = onWillShowHandleBox2;
        }

        public void onInvoke(MJMovieSession mJMovieSession, MJMoveSessionCallbackArg.OnWillShowHandleBoxArg onWillShowHandleBoxArg) {
            MJMovieSession.OnWillShowHandleBox onWillShowHandleBox2 = this.onWillShowHandleBox;
            if (onWillShowHandleBox2 != null && onWillShowHandleBoxArg != null) {
                onWillShowHandleBox2.onWillShowHandleBox(onWillShowHandleBoxArg.f309911ID, onWillShowHandleBoxArg.position, onWillShowHandleBoxArg.scale, onWillShowHandleBoxArg.rotation);
            }
        }

        public OnWillShowHandleBoxCallback(MJMovieSession mJMovieSession, boolean z, MJMovieSession.OnWillShowHandleBox onWillShowHandleBox2) {
            super(mJMovieSession, z);
            this.onWillShowHandleBox = onWillShowHandleBox2;
        }
    }

    public static class ProgressCallback extends BaseCallback<MJMoveSessionCallbackArg.ProgressArg> {
        private final MJMovieSession.OnProgress onProgress;

        public ProgressCallback(MJMovieSession mJMovieSession, MJMovieSession.OnProgress onProgress2) {
            super(mJMovieSession);
            this.onProgress = onProgress2;
        }

        public void onInvoke(MJMovieSession mJMovieSession, MJMoveSessionCallbackArg.ProgressArg progressArg) {
            MJMovieSession.OnProgress onProgress2 = this.onProgress;
            if (onProgress2 != null && progressArg != null) {
                onProgress2.onProgress(progressArg.progress);
            }
        }

        public ProgressCallback(MJMovieSession mJMovieSession, MJMovieSession.OnProgress onProgress2, boolean z) {
            super(mJMovieSession, z);
            this.onProgress = onProgress2;
        }
    }

    public static class TaskProgressCallback extends BaseCallback<MJMoveSessionCallbackArg.TaskProgressArg> {
        private final MJMovieSession.OnTaskProgress onTaskProgress;

        public TaskProgressCallback(MJMovieSession mJMovieSession, MJMovieSession.OnTaskProgress onTaskProgress2) {
            super(mJMovieSession);
            this.onTaskProgress = onTaskProgress2;
        }

        public void onInvoke(MJMovieSession mJMovieSession, MJMoveSessionCallbackArg.TaskProgressArg taskProgressArg) {
            if (this.onTaskProgress != null && taskProgressArg != null) {
                MJTaskTrace mJTaskTrace = null;
                ByteBuffer byteBuffer = taskProgressArg.taskTracePBData;
                if (byteBuffer != null) {
                    try {
                        mJTaskTrace = new MJTaskTrace(taskProgressArg.timestamp, byteBuffer);
                    } catch (Exception e) {
                        NativeLogger.error("MJMovieSessionCallback", e.getMessage());
                    }
                }
                this.onTaskProgress.onTaskProgress(taskProgressArg.progress, mJTaskTrace);
            }
        }

        public TaskProgressCallback(MJMovieSession mJMovieSession, MJMovieSession.OnTaskProgress onTaskProgress2, boolean z) {
            super(mJMovieSession, z);
            this.onTaskProgress = onTaskProgress2;
        }
    }

    public static abstract class BaseCallback<T> extends NativeCallbackManager.Callback {
        private final WeakReference<MJMovieSession> mjMovieSessionRef;

        public BaseCallback(MJMovieSession mJMovieSession) {
            this.mjMovieSessionRef = new WeakReference<>(mJMovieSession);
        }

        public final void invoke(NativeCallbackManager.CallbackArgs callbackArgs) {
            onInvoke(this.mjMovieSessionRef.get(), callbackArgs);
        }

        public abstract void onInvoke(MJMovieSession mJMovieSession, T t);

        public BaseCallback(MJMovieSession mJMovieSession, boolean z) {
            super(z);
            this.mjMovieSessionRef = new WeakReference<>(mJMovieSession);
        }
    }

    public static class MJMoveSessionCallbackArg extends NativeCallbackManager.CallbackArgs {

        public static class CompleteArg extends MJMoveSessionCallbackArg {
            public final MJError error;

            public CompleteArg(MJError mJError) {
                this.error = mJError;
            }
        }

        public static class ExportClipBundleArg extends MJMoveSessionCallbackArg {
            public final MJError error;
            public final String path;

            public ExportClipBundleArg(String str, MJError mJError) {
                this.path = str;
                this.error = mJError;
            }
        }

        public static class MediaTimeChangeArg extends MJMoveSessionCallbackArg {
            public MJTime lastFrameTime;
            public MJTimeRange mediaTimeRange;
            public long tag;

            public MediaTimeChangeArg(MJTime mJTime, MJTimeRange mJTimeRange, long j) {
                this.lastFrameTime = mJTime;
                this.mediaTimeRange = mJTimeRange;
                this.tag = j;
            }
        }

        public static class OnHandleBoxCompleteArg extends MJMoveSessionCallbackArg {
            public final String segmentID;

            public OnHandleBoxCompleteArg(String str) {
                this.segmentID = str;
            }
        }

        public static class OnHandleBoxSettingsDidChangeArg extends MJMoveSessionCallbackArg {
            public final MJHandleBoxSettings handleBoxSettings;

            public OnHandleBoxSettingsDidChangeArg(MJHandleBoxSettings mJHandleBoxSettings) {
                this.handleBoxSettings = mJHandleBoxSettings;
            }
        }

        public static class OnWillShowHandleBoxArg extends MJMoveSessionCallbackArg {

            /* renamed from: ID */
            public final String f309911ID;
            public final Vec2 position;
            public float rotation;
            public final Vec2 scale;

            public OnWillShowHandleBoxArg(String str, Vec2 vec2, Vec2 vec22, float f) {
                this.f309911ID = str;
                this.position = vec2;
                this.scale = vec22;
                this.rotation = f;
            }
        }

        public static class ProgressArg extends MJMoveSessionCallbackArg {
            public final float progress;

            public ProgressArg(float f) {
                this.progress = f;
            }
        }

        public static class TaskProgressArg extends MJMoveSessionCallbackArg {
            public final float progress;
            public final ByteBuffer taskTracePBData;
            public final double timestamp;

            public TaskProgressArg(float f, double d, ByteBuffer byteBuffer) {
                this.progress = f;
                this.timestamp = d;
                this.taskTracePBData = byteBuffer;
            }
        }

        public static class OnDidTapSegmentArg extends MJMoveSessionCallbackArg {

            /* renamed from: ID */
            public String f309910ID;
            public long hints;

            public OnDidTapSegmentArg() {
                this.f309910ID = null;
                this.hints = 0;
            }

            public OnDidTapSegmentArg(String str, long j) {
                this.f309910ID = str;
                this.hints = j;
            }
        }
    }
}
