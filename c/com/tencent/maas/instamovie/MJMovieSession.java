package com.tencent.maas.instamovie;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.facebook.jni.HybridData;
import com.tencent.maas.base.Rect2;
import com.tencent.maas.base.Vec2;
import com.tencent.maas.composing.MJComposingDesc;
import com.tencent.maas.handlebox.MJHandleBoxTouchHelper;
import com.tencent.maas.handlebox.MJHandleBoxTouchHelperListener;
import com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle;
import com.tencent.maas.handlebox.model.MJHandleBoxItem;
import com.tencent.maas.handlebox.model.MJHandleBoxSettings;
import com.tencent.maas.handlebox.protocol.MJHandlerBoxListener;
import com.tencent.maas.instamovie.MJMovieSessionCallback;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.instamovie.base.asset.MJAssetInfo;
import com.tencent.maas.internal.MJClipSegmentInfo;
import com.tencent.maas.internal.MJVideoOutputSetter;
import com.tencent.maas.internal.NativeCallbackManager;
import com.tencent.maas.model.MJEdgeInsets;
import com.tencent.maas.model.MJLayerStyle;
import com.tencent.maas.model.MJLyricInfo;
import com.tencent.maas.model.MJMusicInfo;
import com.tencent.maas.model.MJMusicOptions;
import com.tencent.maas.model.MJSpatialInfo;
import com.tencent.maas.model.MJTemplateCategory;
import com.tencent.maas.model.MJTemplateInfo;
import com.tencent.maas.model.MJTextStyle;
import com.tencent.maas.model.time.MJTime;
import com.tencent.maas.model.time.MJTimeRange;
import com.tencent.maas.utils.MJComposingUtils;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import p172io.clipworks.corekit.NativeLogger;
import p172io.clipworks.displaysys.DSProxySurface;
import p172io.clipworks.displaysys.DSProxySurfaceHolder;
import p172io.clipworks.displaysys.DSRenderView;
import p172io.clipworks.displaysys.DSViewProxy;

public class MJMovieSession implements MJVideoOutputSetter {
    public static final long MJSEGMENT_OPTIONS_NOT_EDITABLE = 0;
    public static final long MJSEGMENT_OPTIONS_POSITION_EDITABLE = 1;
    public static final long MJSEGMENT_OPTIONS_ROTATION_EDITABLE = 2;
    public static final long MJSEGMENT_OPTIONS_SCALE_EDITABLE = 4;
    public static final long MJSEGMENT_OPTIONS_TEXT_EDITABLE = 8;
    private static final String TAG = "MJMovieSession";
    private DSViewProxy dsViewProxy;
    private final NativeCallbackManager mCallbackManager;
    private final HybridData mHybridData;

    public enum MJMovieComposingMode {
        Clipping(0),
        Simple(1);
        
        private final int value;

        private MJMovieComposingMode(int i) {
            this.value = i;
        }

        public static MJMovieComposingMode fromInt(int i) {
            for (MJMovieComposingMode mJMovieComposingMode : values()) {
                if (mJMovieComposingMode.getValue() == i) {
                    return mJMovieComposingMode;
                }
            }
            return Clipping;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMovieSession$1 */
    public static /* synthetic */ class C550631 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$maas$model$MJMusicOptions$SourceType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tencent.maas.model.MJMusicOptions$SourceType[] r0 = com.tencent.maas.model.MJMusicOptions.SourceType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$maas$model$MJMusicOptions$SourceType = r0
                com.tencent.maas.model.MJMusicOptions$SourceType r1 = com.tencent.maas.model.MJMusicOptions.SourceType.None     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tencent$maas$model$MJMusicOptions$SourceType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.maas.model.MJMusicOptions$SourceType r1 = com.tencent.maas.model.MJMusicOptions.SourceType.TemplateBuiltin     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$tencent$maas$model$MJMusicOptions$SourceType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.maas.model.MJMusicOptions$SourceType r1 = com.tencent.maas.model.MJMusicOptions.SourceType.Recommendation     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.instamovie.MJMovieSession.C550631.<clinit>():void");
        }
    }

    public interface OnComplete {
        void onComplete(MJError mJError);
    }

    public interface OnDidTapSegment {
        void onDidTapSegment(String str, long j);
    }

    public interface OnExportClipBundle {
        void onExportClipBundle(String str, MJError mJError);
    }

    public interface OnHandleBoxComplete {
        void onHandleBoxComplete(String str);
    }

    public interface OnHandleBoxSettingsChanged {
        void handleBoxSettingsChanged(MJHandleBoxSettings mJHandleBoxSettings);
    }

    public interface OnMediaTimeChange {
        void onMediaTimeChange(MJTime mJTime, MJTimeRange mJTimeRange, long j);
    }

    public interface OnProgress {
        void onProgress(float f);
    }

    public interface OnTaskProgress {
        void onTaskProgress(float f, MJTaskTrace mJTaskTrace);
    }

    public interface OnWillShowHandleBox {
        void onWillShowHandleBox(String str, Vec2 vec2, Vec2 vec22, float f);
    }

    public MJMovieSession(Handler handler) {
        NativeCallbackManager nativeCallbackManager = new NativeCallbackManager(handler.getLooper());
        this.mCallbackManager = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    private native HybridData initHybrid(Handler handler, NativeCallbackManager nativeCallbackManager);

    private native MJSegment nativeAddStickerSegment(String str, boolean z);

    private native MJSegment nativeAddTextSegment(String str, MJSpatialInfo mJSpatialInfo, MJTextStyle mJTextStyle, MJLayerStyle mJLayerStyle, float f, boolean z);

    private native void nativeBeginClipping(int i);

    private native MJError nativeCancelExporting(int i);

    private native MJError nativeCancelMovieCreation(int i);

    private native MJError nativeCancelRecreation(int i);

    private native MJError nativeCommitChangesAndNotifyRenderUpdate(boolean z);

    private native MJError nativeCommitChangesAndNotifyRenderUpdateByPreviewTime(MJTime mJTime, boolean z);

    private native MJError nativeConnectToView(Object obj);

    private native Vec2 nativeConvertCanvasPointToViewPoint(Vec2 vec2, Rect2 rect2);

    private native Vec2 nativeConvertViewPointToCanvasPoint(Vec2 vec2, Rect2 rect2);

    private native MJError nativeDisconnectFromView();

    private native void nativeEndClipping(int i);

    private native MJError nativeEnterFocusMode(String str);

    private native void nativeExportClipBundle(int i);

    private native MJAssetInfo nativeGetAssetInfo(String str);

    private native Object[] nativeGetCurrentLyricInfos();

    private native MJMovieOptions nativeGetCurrentMovieOptions();

    private native MJMusicInfo nativeGetCurrentMusicInfo();

    private native MJMusicOptions nativeGetCurrentMusicOptions();

    private native MJTime nativeGetCurrentPlaybackTime();

    private native int nativeGetCurrentState();

    private native MJTemplateInfo nativeGetCurrentTemplateInfo();

    private native Object[] nativeGetCurrentTemplateMusicInfos();

    private native MJTemplateSettings nativeGetCurrentTemplateSettings();

    private native MJTime nativeGetPlaybackDuration();

    private native Object[] nativeGetRecommendedMusicInfos();

    private native Object[] nativeGetRecommendedTemplateCategories();

    private native Object[] nativeGetRecommendedTemplateInfos();

    private native MJTime nativeGetSegmentClipDuration(String str);

    private native Rect2 nativeGetSegmentNormalizedCropRect(String str);

    private native int nativeGetSegmentRotationMode(String str);

    private native MJSpatialInfo nativeGetSegmentSpatialInfo(String str);

    private native MJTimeRange nativeGetSegmentTimeRangeInClip(String str);

    private native MJTimeRange nativeGetSegmentTimeRangeInTimeline(String str);

    private native MJSegment nativeGetStickerSegmentById(String str);

    private native Object[] nativeGetStorylineClipSegments();

    private native byte[] nativeGetTemplateAnalysisPbData();

    private native MJSegment nativeGetTextSegmentById(String str);

    private native MJLayerStyle nativeGetTextSegmentLayerStyle(String str);

    private native String nativeGetTextSegmentText(String str);

    private native MJTextStyle nativeGetTextSegmentTextStyle(String str);

    private native double nativeGetVideoAspectRatio();

    private native MJError nativeLeaveFocusMode();

    private native void nativeOnTapRenderView(Vec2 vec2, Rect2 rect2);

    private native void nativeOnUpdateSegmentFlip();

    private native void nativeOnUpdateSegmentPosition(Vec2 vec2, Rect2 rect2);

    private native void nativeOnUpdateSegmentRotation(float f);

    private native void nativeOnUpdateSegmentScale(float f);

    private native void nativeOnUpdateSegmentScaleDidFinish();

    private native MJAsyncTaskInfo nativeRecreateUsingBlankTemplate(String str, MJMovieOptions mJMovieOptions, int i, int i2);

    private native MJAsyncTaskInfo nativeRecreateWithMusic(String str, MJMovieOptions mJMovieOptions, MJMovieOutroInfo mJMovieOutroInfo, int i, int i2);

    private native MJAsyncTaskInfo nativeRecreateWithTemplate(String str, String str2, MJMovieOptions mJMovieOptions, MJMovieOutroInfo mJMovieOutroInfo, int i, int i2);

    private native void nativeRemoveHandleBox();

    private native MJError nativeRemoveSegment(String str, boolean z);

    private native void nativeRemoveSegmentByHandleBox();

    private native void nativeSetHandleBoxSettingsChangeCallback(int i, Vec2 vec2);

    private native void nativeSetOnDidRemoveHandleBoxCallback(int i);

    private native void nativeSetOnDidRemoveSegmentCallback(int i);

    private native void nativeSetOnDidTapSegmentCallback(int i);

    private native void nativeSetOnPlaybackMediaTimeDidChangeFunc(int i);

    private native void nativeSetOnWillShowHandleBoxCallback(int i);

    private native MJError nativeSetSegmentNormalizedCropRect(String str, Rect2 rect2, boolean z);

    private native MJError nativeSetSegmentRotationMode(String str, int i, boolean z);

    private native MJError nativeSetSegmentTimeRangeInClip(String str, MJTimeRange mJTimeRange);

    private native void nativeSetTextResolver(MJTextResolver mJTextResolver);

    private native void nativeShowHandleBox(String str, Rect2 rect2, MJEdgeInsets mJEdgeInsets, MJHandleBoxBorderStyle mJHandleBoxBorderStyle, List<MJHandleBoxItem> list);

    private native MJError nativeSkimTo(MJTime mJTime, long j, boolean z, boolean z2);

    private native MJError nativeSkimToSegment(String str, MJTime mJTime, long j, boolean z, boolean z2);

    private native MJAsyncTaskInfo nativeStartExporting(String str, MJTimeRange mJTimeRange, MJExportSettings mJExportSettings, int i, int i2);

    private native MJAsyncTaskInfo nativeStartMovieCreationAutoRecommendTemplate(List<MJAssetInfo> list, MJMovieOptions mJMovieOptions, MJRecommendOptions mJRecommendOptions, MJMovieOutroInfo mJMovieOutroInfo, int i, int i2);

    private native MJAsyncTaskInfo nativeStartMovieCreationUsingBlankTemplate(List<MJAssetInfo> list, String str, MJMovieOptions mJMovieOptions, MJRecommendOptions mJRecommendOptions, int i, int i2, int i3);

    private native MJAsyncTaskInfo nativeStartMovieCreationUsingTemplate(String str, String str2, List<MJAssetInfo> list, MJMovieOptions mJMovieOptions, MJRecommendOptions mJRecommendOptions, MJMovieOutroInfo mJMovieOutroInfo, int i, int i2, int i3);

    private native MJAsyncTaskInfo nativeStartMovieCreationWithComposingDesc(ByteBuffer byteBuffer, String str, MJMovieOptions mJMovieOptions, MJRecommendOptions mJRecommendOptions, int i, int i2, int i3);

    private native MJError nativeStartPlaying(MJTimeRange mJTimeRange, MJTime mJTime, int i, boolean z, int i2);

    private native MJError nativeStopPlaying(int i);

    private native MJError nativeTeardown(int i);

    private native MJError nativeUpdateMovieOptions(MJMovieOptions mJMovieOptions, int i);

    private native MJError nativeUpdateSegmentSpatialInfo(String str, MJSpatialInfo mJSpatialInfo, boolean z);

    private native MJError nativeUpdateTextSegmentStyle(String str, MJTextStyle mJTextStyle, MJLayerStyle mJLayerStyle, boolean z);

    private native MJError nativeUpdateTextSegmentText(String str, String str2, boolean z);

    public MJTime GetCurrentPlaybackTime() {
        return nativeGetCurrentPlaybackTime();
    }

    public MJStickerSegment addStickerSegment(String str, boolean z) {
        MJSegment nativeAddStickerSegment = nativeAddStickerSegment(str, z);
        if (nativeAddStickerSegment == null) {
            return null;
        }
        return new MJStickerSegment(nativeAddStickerSegment.getId(), this);
    }

    public MJTextSegment addTextSegment(String str, MJSpatialInfo mJSpatialInfo, MJTextStyle mJTextStyle, MJLayerStyle mJLayerStyle, float f, boolean z) {
        MJSegment nativeAddTextSegment = nativeAddTextSegment(str, mJSpatialInfo, mJTextStyle, mJLayerStyle, f, z);
        if (nativeAddTextSegment == null) {
            return null;
        }
        return new MJTextSegment(nativeAddTextSegment.getId(), this);
    }

    public void beginClipping(OnComplete onComplete) {
        nativeBeginClipping(onComplete != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError cancelExporting(OnComplete onComplete) {
        return nativeCancelExporting(onComplete != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError cancelMovieCreation(OnComplete onComplete) {
        return nativeCancelMovieCreation(onComplete != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError cancelRecreation(OnComplete onComplete) {
        return nativeCancelRecreation(onComplete != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError commitChangesAndNotifyRenderUpdate() {
        return nativeCommitChangesAndNotifyRenderUpdate(false);
    }

    public Vec2 convertCanvasPointToViewPoint(Vec2 vec2, Rect2 rect2) {
        return nativeConvertCanvasPointToViewPoint(vec2, rect2);
    }

    public Vec2 convertViewPointToCanvasPoint(Vec2 vec2, Rect2 rect2) {
        return nativeConvertViewPointToCanvasPoint(vec2, rect2);
    }

    public MJHandleBoxTouchHelper createMJHandleBoxTouchHelper(Context context, Vec2 vec2, MJHandlerBoxListener mJHandlerBoxListener, MJHandleBoxTouchHelperListener mJHandleBoxTouchHelperListener) {
        return new MJHandleBoxTouchHelper(this, context, vec2, mJHandlerBoxListener, mJHandleBoxTouchHelperListener);
    }

    public void endClipping(OnComplete onComplete) {
        nativeEndClipping(onComplete != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError enterFocusMode(String str) {
        return nativeEnterFocusMode(str);
    }

    public void exportClipBundle(OnComplete onComplete) {
        nativeExportClipBundle(onComplete != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJAssetInfo getAssetInfo(String str) {
        return nativeGetAssetInfo(str);
    }

    public List<MJLyricInfo> getCurrentLyricInfos() {
        Object[] nativeGetCurrentLyricInfos = nativeGetCurrentLyricInfos();
        if (nativeGetCurrentLyricInfos == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(nativeGetCurrentLyricInfos.length);
        for (Object obj : nativeGetCurrentLyricInfos) {
            arrayList.add((MJLyricInfo) obj);
        }
        return arrayList;
    }

    public MJMovieOptions getCurrentMovieOptions() {
        return nativeGetCurrentMovieOptions();
    }

    public MJMusicInfo getCurrentMusicInfo() {
        return nativeGetCurrentMusicInfo();
    }

    public MJMusicOptions getCurrentMusicOptions() {
        return nativeGetCurrentMusicOptions();
    }

    public MJMovieSessionState getCurrentState() {
        return MJMovieSessionState.fromInt(nativeGetCurrentState());
    }

    public List<MJMusicInfo> getCurrentTemplateBuiltinMusicInfos() {
        Object[] nativeGetCurrentTemplateMusicInfos = nativeGetCurrentTemplateMusicInfos();
        ArrayList arrayList = new ArrayList();
        if (nativeGetCurrentTemplateMusicInfos != null) {
            for (Object obj : nativeGetCurrentTemplateMusicInfos) {
                arrayList.add((MJMusicInfo) obj);
            }
        }
        return arrayList;
    }

    public MJTemplateInfo getCurrentTemplateInfo() {
        return nativeGetCurrentTemplateInfo();
    }

    public List<MJMusicInfo> getCurrentTemplateMusicInfos() {
        MJMusicOptions currentMusicOptions = getCurrentMusicOptions();
        if (currentMusicOptions == null) {
            return getCurrentTemplateBuiltinMusicInfos();
        }
        ArrayList arrayList = null;
        int i = C550631.$SwitchMap$com$tencent$maas$model$MJMusicOptions$SourceType[currentMusicOptions.getSourceType().ordinal()];
        if (i == 1) {
            MJMovieOptions currentMovieOptions = getCurrentMovieOptions();
            if (currentMovieOptions != null) {
                arrayList = currentMovieOptions.shouldAutoRecommendBGM() ? new ArrayList(getRecommendedMusicInfos()) : new ArrayList(getCurrentTemplateBuiltinMusicInfos());
            }
        } else if (i == 2) {
            arrayList = new ArrayList(getCurrentTemplateBuiltinMusicInfos());
        } else if (i == 3) {
            arrayList = new ArrayList(getRecommendedMusicInfos());
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        MJMusicInfo musicInfo = currentMusicOptions.getMusicInfo();
        if (musicInfo != null && !arrayList.contains(musicInfo)) {
            arrayList.add(0, musicInfo);
        }
        return arrayList;
    }

    public MJTemplateSettings getCurrentTemplateSettings() {
        return nativeGetCurrentTemplateSettings();
    }

    public MJTime getPlaybackDuration() {
        return nativeGetPlaybackDuration();
    }

    public List<MJMusicInfo> getRecommendedMusicInfos() {
        Object[] nativeGetRecommendedMusicInfos = nativeGetRecommendedMusicInfos();
        ArrayList arrayList = new ArrayList();
        if (nativeGetRecommendedMusicInfos != null) {
            for (Object obj : nativeGetRecommendedMusicInfos) {
                arrayList.add((MJMusicInfo) obj);
            }
        }
        return arrayList;
    }

    public ArrayList<MJTemplateCategory> getRecommendedTemplateCategories() {
        Object[] nativeGetRecommendedTemplateCategories = nativeGetRecommendedTemplateCategories();
        ArrayList<MJTemplateCategory> arrayList = new ArrayList<>();
        if (nativeGetRecommendedTemplateCategories != null) {
            for (Object obj : nativeGetRecommendedTemplateCategories) {
                arrayList.add((MJTemplateCategory) obj);
            }
        }
        return arrayList;
    }

    public ArrayList<MJTemplateInfo> getRecommendedTemplateInfos() {
        Object[] nativeGetRecommendedTemplateInfos = nativeGetRecommendedTemplateInfos();
        ArrayList<MJTemplateInfo> arrayList = new ArrayList<>();
        if (nativeGetRecommendedTemplateInfos != null) {
            for (Object obj : nativeGetRecommendedTemplateInfos) {
                arrayList.add((MJTemplateInfo) obj);
            }
        }
        return arrayList;
    }

    public MJTime getSegmentClipDuration(String str) {
        return nativeGetSegmentClipDuration(str);
    }

    public Rect2 getSegmentNormalizedCropRect(String str) {
        return nativeGetSegmentNormalizedCropRect(str);
    }

    public int getSegmentRotationMode(String str) {
        return nativeGetSegmentRotationMode(str);
    }

    public MJSpatialInfo getSegmentSpatialInfo(String str) {
        return nativeGetSegmentSpatialInfo(str);
    }

    public MJTimeRange getSegmentTimeRangeInClip(String str) {
        return nativeGetSegmentTimeRangeInClip(str);
    }

    public MJTimeRange getSegmentTimeRangeInTimeline(String str) {
        return nativeGetSegmentTimeRangeInTimeline(str);
    }

    public MJStickerSegment getStickerSegmentById(String str) {
        MJSegment nativeGetStickerSegmentById = nativeGetStickerSegmentById(str);
        if (nativeGetStickerSegmentById == null) {
            return null;
        }
        return new MJStickerSegment(nativeGetStickerSegmentById.getId(), this);
    }

    public List<MJClipSegment> getStorylineClipSegments() {
        Object[] nativeGetStorylineClipSegments = nativeGetStorylineClipSegments();
        ArrayList arrayList = new ArrayList();
        if (nativeGetStorylineClipSegments != null) {
            for (Object obj : nativeGetStorylineClipSegments) {
                arrayList.add(new MJClipSegment((MJClipSegmentInfo) obj, this));
            }
        }
        return arrayList;
    }

    public byte[] getTemplateAnalysisPbData() {
        return nativeGetTemplateAnalysisPbData();
    }

    public MJTextSegment getTextSegmentById(String str) {
        MJSegment nativeGetTextSegmentById = nativeGetTextSegmentById(str);
        if (nativeGetTextSegmentById == null) {
            return null;
        }
        return new MJTextSegment(nativeGetTextSegmentById.getId(), this);
    }

    public MJLayerStyle getTextSegmentLayerStyle(String str) {
        return nativeGetTextSegmentLayerStyle(str);
    }

    public String getTextSegmentText(String str) {
        return nativeGetTextSegmentText(str);
    }

    public MJTextStyle getTextSegmentTextStyle(String str) {
        return nativeGetTextSegmentTextStyle(str);
    }

    public Double getVideoAspectRatio() {
        return Double.valueOf(nativeGetVideoAspectRatio());
    }

    public MJError leaveFocusMode() {
        return nativeLeaveFocusMode();
    }

    public void notifySurfaceChanged(int i, int i2, int i3) {
        DSViewProxy dSViewProxy = this.dsViewProxy;
        if (dSViewProxy == null || !(dSViewProxy instanceof DSProxySurface)) {
            NativeLogger.error(TAG, "current surface is not DSProxySurface");
            throw new IllegalStateException("current surface is not DSProxySurface");
        } else {
            ((DSProxySurface) dSViewProxy).notifySurfaceChanged(i, i2, i3);
        }
    }

    public void onTapRenderView(Vec2 vec2, Rect2 rect2) {
        nativeOnTapRenderView(vec2, rect2);
    }

    public void onUpdateSegmentFlip() {
        nativeOnUpdateSegmentFlip();
    }

    public void onUpdateSegmentPosition(Vec2 vec2, Rect2 rect2) {
        nativeOnUpdateSegmentPosition(vec2, rect2);
    }

    public void onUpdateSegmentRotation(float f) {
        nativeOnUpdateSegmentRotation(f);
    }

    public void onUpdateSegmentScale(float f) {
        nativeOnUpdateSegmentScale(f);
    }

    public void onUpdateSegmentScaleDidFinish() {
        nativeOnUpdateSegmentScaleDidFinish();
    }

    public MJAsyncTaskInfo recreateUsingBlankTemplate(String str, MJMovieOptions mJMovieOptions, OnTaskProgress onTaskProgress, OnComplete onComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new MJMovieSessionCallback.CompleteCallback(this, onComplete));
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return nativeRecreateUsingBlankTemplate(str, mJMovieOptions, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public MJAsyncTaskInfo recreateWithMusicID(String str, MJMovieOptions mJMovieOptions, MJMovieOutroInfo mJMovieOutroInfo, OnTaskProgress onTaskProgress, OnComplete onComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new MJMovieSessionCallback.CompleteCallback(this, onComplete));
        return nativeRecreateWithMusic(str, mJMovieOptions, mJMovieOutroInfo, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public MJAsyncTaskInfo recreateWithTemplate(String str, String str2, MJMovieOptions mJMovieOptions, MJMovieOutroInfo mJMovieOutroInfo, OnTaskProgress onTaskProgress, OnComplete onComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new MJMovieSessionCallback.CompleteCallback(this, onComplete));
        return nativeRecreateWithTemplate(str, TextUtils.isEmpty(str2) ? null : str2, mJMovieOptions, mJMovieOutroInfo, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public void release() {
        this.mHybridData.resetNative();
    }

    public void removeHandleBox() {
        nativeRemoveHandleBox();
    }

    public MJError removeSegment(String str, boolean z) {
        return nativeRemoveSegment(str, z);
    }

    public void removeSegmentByHandleBox() {
        nativeRemoveSegmentByHandleBox();
    }

    public void setOnDidRemoveHandleBoxCallback(OnHandleBoxComplete onHandleBoxComplete) {
        nativeSetOnDidRemoveHandleBoxCallback(onHandleBoxComplete != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.OnHanldeBoxCompleteCallback(this, false, onHandleBoxComplete)) : -1);
    }

    public void setOnDidRemoveSegmentCallback(OnHandleBoxComplete onHandleBoxComplete) {
        nativeSetOnDidRemoveSegmentCallback(onHandleBoxComplete != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.OnHanldeBoxCompleteCallback(this, false, onHandleBoxComplete)) : -1);
    }

    public void setOnDidTapSegmentCallback(OnDidTapSegment onDidTapSegment) {
        nativeSetOnDidTapSegmentCallback(onDidTapSegment != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.OnDidTapSegmentCallback(this, false, onDidTapSegment)) : -1);
    }

    public void setOnHandleBoxSettingsChangeCallback(OnHandleBoxSettingsChanged onHandleBoxSettingsChanged, Vec2 vec2) {
        nativeSetHandleBoxSettingsChangeCallback(onHandleBoxSettingsChanged != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.OnHandleBoxSettingsChangeCallback(this, false, onHandleBoxSettingsChanged)) : -1, vec2);
    }

    public void setOnPlaybackMediaTimeDidChange(OnMediaTimeChange onMediaTimeChange) {
        nativeSetOnPlaybackMediaTimeDidChangeFunc(onMediaTimeChange != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.MediaTimeChangeCallback(this, onMediaTimeChange, false)) : -1);
    }

    public void setOnWillShowHandleBoxCallback(OnWillShowHandleBox onWillShowHandleBox) {
        nativeSetOnWillShowHandleBoxCallback(onWillShowHandleBox != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.OnWillShowHandleBoxCallback(this, false, onWillShowHandleBox)) : -1);
    }

    public void setRenderView(SurfaceView surfaceView) {
        if (!(surfaceView instanceof DSRenderView)) {
            NativeLogger.error(TAG, "renderView must be SDK DSRenderView");
            throw new InvalidParameterException("renderView must be SDK DSRenderView");
        } else if (this.dsViewProxy == null) {
            DSViewProxy dSViewProxy = ((DSRenderView) surfaceView).getDSViewProxy();
            MJError nativeConnectToView = nativeConnectToView(dSViewProxy);
            if (nativeConnectToView == null) {
                this.dsViewProxy = dSViewProxy;
                return;
            }
            String str = TAG;
            NativeLogger.error(str, "Fail to connect to RenderView, " + nativeConnectToView.message);
            throw new IllegalStateException("Fail to connect to RenderView, " + nativeConnectToView.message);
        } else {
            NativeLogger.error(TAG, "Already a view connected!");
            throw new IllegalStateException("Already a view connected!");
        }
    }

    public MJError setSegmentNormalizedCropRect(String str, Rect2 rect2, boolean z) {
        return nativeSetSegmentNormalizedCropRect(str, rect2, z);
    }

    public MJError setSegmentRotationMode(String str, int i, boolean z) {
        return nativeSetSegmentRotationMode(str, i, z);
    }

    public MJError setSegmentTimeRangeInClip(String str, MJTimeRange mJTimeRange) {
        return nativeSetSegmentTimeRangeInClip(str, mJTimeRange);
    }

    public void setSurface(Surface surface) {
        DSViewProxy dSViewProxy = this.dsViewProxy;
        if (dSViewProxy != null && !(dSViewProxy instanceof DSProxySurface)) {
            NativeLogger.error(TAG, "Already a non surface output connected");
            throw new IllegalArgumentException("Already a non surface output connected");
        } else if (surface != null || dSViewProxy != null) {
            if (dSViewProxy == null) {
                DSProxySurface dSProxySurface = new DSProxySurface(surface);
                MJError nativeConnectToView = nativeConnectToView(dSProxySurface);
                if (nativeConnectToView == null) {
                    this.dsViewProxy = dSProxySurface;
                    dSProxySurface.notifySurfaceCreated(surface);
                    String str = TAG;
                    NativeLogger.info(str, "nativeConnectToView, new surface created: " + surface);
                    return;
                }
                String str2 = TAG;
                NativeLogger.error(str2, "Fail to connect to surface, " + nativeConnectToView.message);
                throw new IllegalStateException("Fail to connect to surface, " + nativeConnectToView.message);
            }
            DSProxySurface dSProxySurface2 = (DSProxySurface) dSViewProxy;
            if (surface == null) {
                dSProxySurface2.updateSurface((Surface) null);
                dSProxySurface2.notifySurfaceDidDestroy();
                NativeLogger.info(TAG, "setSurface, surface destroyed");
            } else if (dSProxySurface2.getSurface() == null) {
                dSProxySurface2.updateSurface(surface);
                dSProxySurface2.notifySurfaceCreated(surface);
                String str3 = TAG;
                NativeLogger.info(str3, "setSurface, surface changed: " + surface);
            } else {
                NativeLogger.error(TAG, "Already a surface connect, please setSurface(null) firstly");
                throw new IllegalStateException("Already a surface connect, please setSurface(null) firstly");
            }
        }
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        DSViewProxy dSViewProxy = this.dsViewProxy;
        if (dSViewProxy != null) {
            if (!(dSViewProxy instanceof DSProxySurfaceHolder)) {
                NativeLogger.error(TAG, "Already a non SurfaceHolder connected");
                throw new IllegalArgumentException("Already a non SurfaceHolder connected");
            }
        } else if (surfaceHolder != null) {
            DSProxySurfaceHolder dSProxySurfaceHolder = new DSProxySurfaceHolder(surfaceHolder);
            MJError nativeConnectToView = nativeConnectToView(dSProxySurfaceHolder);
            if (nativeConnectToView == null) {
                this.dsViewProxy = dSProxySurfaceHolder;
                if (surfaceHolder.getSurface() != null) {
                    this.dsViewProxy.notifySurfaceCreated(surfaceHolder.getSurface());
                    return;
                }
                return;
            }
            String str = TAG;
            NativeLogger.error(str, "Fail to connect to surface, " + nativeConnectToView.message);
            throw new IllegalStateException("Fail to connect to surface, " + nativeConnectToView.message);
        }
    }

    public void setTextResolver(MJTextResolver mJTextResolver) {
        nativeSetTextResolver(mJTextResolver);
    }

    public void showHandleBox(String str, Rect2 rect2, MJEdgeInsets mJEdgeInsets, MJHandleBoxBorderStyle mJHandleBoxBorderStyle, List<MJHandleBoxItem> list) {
        nativeShowHandleBox(str, rect2, mJEdgeInsets, mJHandleBoxBorderStyle, list);
    }

    public MJError skimTo(MJTime mJTime, long j, boolean z, boolean z2) {
        return nativeSkimTo(mJTime, j, z, z2);
    }

    public MJError skimToSegment(String str, MJTime mJTime) {
        return nativeSkimToSegment(str, mJTime, 0, false, false);
    }

    public MJAsyncTaskInfo startExporting(String str, MJTimeRange mJTimeRange, MJExportSettings mJExportSettings, OnTaskProgress onTaskProgress, OnComplete onComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new MJMovieSessionCallback.CompleteCallback(this, onComplete));
        return nativeStartExporting(str, mJTimeRange, mJExportSettings, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public MJAsyncTaskInfo startMovieCreationAutoRecommendTemplate(List<MJAssetInfo> list, MJMovieOptions mJMovieOptions, MJRecommendOptions mJRecommendOptions, MJMovieOutroInfo mJMovieOutroInfo, OnTaskProgress onTaskProgress, OnComplete onComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new MJMovieSessionCallback.CompleteCallback(this, onComplete));
        return nativeStartMovieCreationAutoRecommendTemplate(list, mJMovieOptions, mJRecommendOptions, mJMovieOutroInfo, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public MJAsyncTaskInfo startMovieCreationUsingBlankTemplate(List<MJAssetInfo> list, String str, MJMovieOptions mJMovieOptions, MJRecommendOptions mJRecommendOptions, OnTaskProgress onTaskProgress, OnComplete onComplete, OnComplete onComplete2) {
        OnComplete onComplete3 = onComplete2;
        OnTaskProgress onTaskProgress2 = onTaskProgress;
        OnComplete onComplete4 = onComplete;
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new MJMovieSessionCallback.CompleteCallback(this, onComplete));
        return nativeStartMovieCreationUsingBlankTemplate(list, TextUtils.isEmpty(str) ? null : str, mJMovieOptions, mJRecommendOptions, registerProgressWithComplete[0], registerProgressWithComplete[1], onComplete3 != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.CompleteCallback(this, onComplete3)) : -1);
    }

    public MJAsyncTaskInfo startMovieCreationUsingTemplate(String str, String str2, List<MJAssetInfo> list, MJMovieOptions mJMovieOptions, MJRecommendOptions mJRecommendOptions, MJMovieOutroInfo mJMovieOutroInfo, OnTaskProgress onTaskProgress, OnComplete onComplete, OnComplete onComplete2) {
        OnComplete onComplete3 = onComplete2;
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new MJMovieSessionCallback.CompleteCallback(this, onComplete));
        return nativeStartMovieCreationUsingTemplate(str, str2, list, mJMovieOptions, mJRecommendOptions, mJMovieOutroInfo, registerProgressWithComplete[0], registerProgressWithComplete[1], onComplete3 != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.CompleteCallback(this, onComplete3)) : -1);
    }

    public MJAsyncTaskInfo startMovieCreationWithComposingDesc(MJComposingDesc mJComposingDesc, String str, MJMovieOptions mJMovieOptions, MJRecommendOptions mJRecommendOptions, OnTaskProgress onTaskProgress, OnComplete onComplete, OnComplete onComplete2) {
        OnComplete onComplete3 = onComplete2;
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJMovieSessionCallback.TaskProgressCallback(this, onTaskProgress, false), new MJMovieSessionCallback.CompleteCallback(this, onComplete));
        try {
            return nativeStartMovieCreationWithComposingDesc(MJComposingUtils.toByteBuffer(mJComposingDesc), str, mJMovieOptions, mJRecommendOptions, registerProgressWithComplete[0], registerProgressWithComplete[1], onComplete3 != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.CompleteCallback(this, onComplete3)) : -1);
        } catch (IllegalArgumentException e) {
            return new MJAsyncTaskInfo(new MJError(MJError.MaasEC.InvalidArgument.getErrorCode(), e.getMessage()), -1, "");
        } catch (Exception e2) {
            return new MJAsyncTaskInfo(new MJError(MJError.MaasEC.GeneralError.getErrorCode(), e2.getMessage()), -1, "");
        }
    }

    public MJError startPlaying(MJTimeRange mJTimeRange, MJTime mJTime, int i, boolean z, OnComplete onComplete) {
        return nativeStartPlaying(mJTimeRange, mJTime, i, z, onComplete != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError stopPlaying(OnComplete onComplete) {
        return nativeStopPlaying(onComplete != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError tearDown(OnComplete onComplete) {
        if (this.dsViewProxy != null) {
            NativeLogger.info(TAG, "nativeDisconnectFromView");
            nativeDisconnectFromView();
            this.dsViewProxy = null;
        }
        return nativeTeardown(onComplete != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError updateMovieOptions(MJMovieOptions mJMovieOptions, OnComplete onComplete) {
        return nativeUpdateMovieOptions(mJMovieOptions, onComplete != null ? this.mCallbackManager.registerCallback(new MJMovieSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError updateSegmentSpatialInfo(String str, MJSpatialInfo mJSpatialInfo, boolean z) {
        return nativeUpdateSegmentSpatialInfo(str, mJSpatialInfo, z);
    }

    public MJError updateTextSegmentStyle(String str, MJTextStyle mJTextStyle, MJLayerStyle mJLayerStyle, boolean z) {
        return nativeUpdateTextSegmentStyle(str, mJTextStyle, mJLayerStyle, z);
    }

    public MJError updateTextSegmentText(String str, String str2, boolean z) {
        return nativeUpdateTextSegmentText(str, str2, z);
    }

    public MJError commitChangesAndNotifyRenderUpdate(boolean z) {
        return nativeCommitChangesAndNotifyRenderUpdate(z);
    }

    public MJHandleBoxTouchHelper createMJHandleBoxTouchHelper(Context context, Vec2 vec2, MJHandlerBoxListener mJHandlerBoxListener) {
        return new MJHandleBoxTouchHelper(this, context, vec2, mJHandlerBoxListener, (MJHandleBoxTouchHelperListener) null);
    }

    public MJError commitChangesAndNotifyRenderUpdate(MJTime mJTime) {
        return nativeCommitChangesAndNotifyRenderUpdateByPreviewTime(mJTime, false);
    }

    public MJError commitChangesAndNotifyRenderUpdate(MJTime mJTime, boolean z) {
        return nativeCommitChangesAndNotifyRenderUpdateByPreviewTime(mJTime, z);
    }
}
