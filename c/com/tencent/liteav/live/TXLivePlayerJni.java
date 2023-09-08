package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Surface;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.rtmp.C26956a;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@JNINamespace("liteav")
public class TXLivePlayerJni implements C26956a, TXCloudVideoView.C106890b {
    private static final String TAG = "TXLivePlayerJni";
    private String mAESIV;
    private String mAESKey;
    private Integer mAESMode;
    private String mAESURL;
    private Integer mAudioCodecType;
    private TXLivePlayer.ITXAudioRawDataListener mAudioRawDataListener;
    private Integer mAudioRoute;
    private TXLivePlayer.ITXAudioVolumeEvaluationListener mAudioVolumeEvaluationListener;
    private TXLivePlayConfig mConfig;
    private DisplayTarget mDisplayTarget;
    private Boolean mEnableHardwareDecoder;
    private Object mGLContext = null;
    private Boolean mIsAudioMuted;
    private ITXLivePlayListener mListener;
    private Long mNativeAudioJitterBufferControllerFactory;
    public long mNativeTXLivePlayerJni = 0;
    private Integer mRenderMode;
    private Integer mRenderRotate;
    private String mReportStreamRspInfoParams;
    private Boolean mShowDebugView;
    private TXLivePlayer.ITXSnapshotListener mSnapshotListener;
    private Surface mSurface;
    private int mSurfaceHeight = -1;
    private int mSurfaceWidth = -1;
    private TXLivePlayer.ITXVideoRawDataListener mVideoRawDataListener;
    private TXRecordCommon.ITXVideoRecordListener mVideoRecordListener;
    private TXLivePlayer.ITXLivePlayVideoRenderListener mVideoRenderListener;
    private Integer mVolume;
    private Integer mVolumeIntervalMs;

    public TXLivePlayerJni(Context context) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
    }

    private void enableReportStreamRspInfo(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("ids")) {
            LiteavLog.m16898e(TAG, "enable report stream rsp info failed. invalid params:".concat(String.valueOf(jSONObject)));
            return;
        }
        synchronized (this) {
            try {
                jSONObject.getJSONArray("ids");
                this.mReportStreamRspInfoParams = jSONObject.toString();
                if (isNativeValid()) {
                    nativeEnableReportStreamRspInfo(this.mNativeTXLivePlayerJni, jSONObject.toString());
                }
            } catch (JSONException unused) {
                LiteavLog.m16898e(TAG, "enable report stream rsp info failed. parse json failed.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static String genFilePath(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String format = simpleDateFormat.format(new Date(Long.valueOf(valueOf + "000").longValue()));
            String diskFileDir = getDiskFileDir(context);
            if (TextUtils.isEmpty(diskFileDir)) {
                return null;
            }
            return new File(diskFileDir, String.format("TXUGC_%s".concat(String.valueOf(str)), new Object[]{format})).getAbsolutePath();
        } catch (Exception e) {
            LiteavLog.m16899e(TAG, "create file path failed.", (Throwable) e);
            return null;
        }
    }

    private static String getDiskFileDir(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        if (!"mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) {
            return context.getFilesDir().getPath();
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
        if (externalFilesDir != null) {
            str = externalFilesDir.getPath();
        }
        return str;
    }

    public static String[] getMapKeys(Map<String, String> map) {
        String[] strArr = new String[map.size()];
        int i = 0;
        for (String str : map.keySet()) {
            strArr[i] = str;
            i++;
        }
        return strArr;
    }

    public static String[] getMapValues(Map<String, String> map, String[] strArr) {
        String[] strArr2 = new String[map.size()];
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            strArr2[i2] = map.get(strArr[i]);
            i++;
            i2++;
        }
        return strArr2;
    }

    private boolean isNativeValid() {
        return this.mNativeTXLivePlayerJni != 0;
    }

    private static native long nativeCreate(WeakReference<TXLivePlayerJni> weakReference);

    private static native void nativeDestroy(long j);

    private static native void nativeEnableAudioVolumeEvaluation(long j, int i);

    private static native void nativeEnableCustomAudioProcess(long j, boolean z);

    private static native void nativeEnableCustomRenderI420(long j, boolean z);

    private static native void nativeEnableCustomRenderTexture(long j, boolean z, Object obj);

    private static native void nativeEnableHardwareDecode(long j, boolean z);

    private static native void nativeEnableReportStreamRspInfo(long j, String str);

    private static native long nativeGetCurrentRenderPts(long j);

    private static native boolean nativeIsPlaying(long j);

    private static native void nativePause(long j);

    private static native void nativeResume(long j);

    private static native void nativeSetAESCodecParams(long j, String str, int i, String str2, String str3);

    private static native void nativeSetAudioCodecType(long j, int i);

    private static native void nativeSetAudioJitterBufferControllerFactory(long j, long j2);

    private static native void nativeSetAudioRoute(long j, int i);

    private static native void nativeSetConfig(long j, float f, float f2, float f3, int i, int i2, int i3, boolean z, boolean z2, boolean z3, String str, Map map);

    private static native void nativeSetMute(long j, boolean z);

    private static native void nativeSetPlayerView(long j, DisplayTarget displayTarget);

    private static native void nativeSetRenderMode(long j, int i);

    private static native void nativeSetRenderRotation(long j, int i);

    private static native void nativeSetVolume(long j, int i);

    private static native void nativeShowDebugView(long j, boolean z);

    private static native void nativeSnapshot(long j);

    private static native int nativeStartPlay(long j, String str, int i);

    private static native void nativeStartRecord(long j, int i, String str);

    private static native void nativeStopPlay(long j);

    private static native void nativeStopRecord(long j);

    private static native int nativeSwitchStream(long j, String str);

    private void setAudioCodecType(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("type")) {
            LiteavLog.m16898e(TAG, "set audio codec type failed. invalid params:".concat(String.valueOf(jSONObject)));
            return;
        }
        synchronized (this) {
            try {
                this.mAudioCodecType = Integer.valueOf(jSONObject.getInt("type"));
                if (isNativeValid()) {
                    nativeSetAudioCodecType(this.mNativeTXLivePlayerJni, this.mAudioCodecType.intValue());
                }
            } catch (JSONException unused) {
                LiteavLog.m16898e(TAG, "set audio codec type failed. parse json failed.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void setAudioJitterBufferFactory(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("controllerFactory")) {
            LiteavLog.m16898e(TAG, "set audio jitter buffer controller factory params failed. invalid params:".concat(String.valueOf(jSONObject)));
            return;
        }
        synchronized (this) {
            try {
                this.mNativeAudioJitterBufferControllerFactory = new Long(jSONObject.getLong("controllerFactory"));
                if (isNativeValid()) {
                    nativeSetAudioJitterBufferControllerFactory(this.mNativeTXLivePlayerJni, this.mNativeAudioJitterBufferControllerFactory.longValue());
                }
            } catch (JSONException unused) {
                LiteavLog.m16898e(TAG, "set audio jitter buffer factory params failed. parse json failed.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void setEncryptionParams(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("url") || !jSONObject.has("encMode") || !jSONObject.has("encKey") || !jSONObject.has("encIV")) {
            LiteavLog.m16898e(TAG, "set encryption params failed. invalid params:".concat(String.valueOf(jSONObject)));
            return;
        }
        synchronized (this) {
            try {
                int i = jSONObject.getInt("encMode");
                String string = jSONObject.getString("url");
                String string2 = jSONObject.getString("encKey");
                String string3 = jSONObject.getString("encIV");
                this.mAESMode = Integer.valueOf(i);
                this.mAESKey = string2;
                this.mAESURL = string;
                this.mAESIV = string3;
                if (isNativeValid()) {
                    nativeSetAESCodecParams(this.mNativeTXLivePlayerJni, this.mAESURL, this.mAESMode.intValue(), this.mAESKey, this.mAESIV);
                }
            } catch (JSONException unused) {
                LiteavLog.m16898e(TAG, "set encryption params failed. parse json failed.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static TXLivePlayerJni weakToStrongReference(WeakReference<TXLivePlayerJni> weakReference) {
        return weakReference.get();
    }

    public boolean addVideoRawData(byte[] bArr) {
        return false;
    }

    public void callExperimentalAPI(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(ProviderConstants.API_PATH)) {
                LiteavLog.m16898e(TAG, "call experimental api failed. json: ".concat(String.valueOf(str)));
                return;
            }
            String string = jSONObject.getString(ProviderConstants.API_PATH);
            JSONObject jSONObject2 = null;
            if (jSONObject.has("params")) {
                jSONObject2 = jSONObject.getJSONObject("params");
            }
            char c = 65535;
            switch (string.hashCode()) {
                case -2131574212:
                    if (string.equals(V2TXLiveDefInner.TXLivePropertyKey.kV2SetAudioCodecType)) {
                        c = 3;
                        break;
                    }
                    break;
                case -679410198:
                    if (string.equals("setAudioJitterBufferFactory")) {
                        c = 1;
                        break;
                    }
                    break;
                case 298124139:
                    if (string.equals("setEncryptionParams")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1189138598:
                    if (string.equals("enableReportStreamRspInfo")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                setEncryptionParams(jSONObject2);
            } else if (c == 1) {
                setAudioJitterBufferFactory(jSONObject2);
            } else if (c == 2) {
                enableReportStreamRspInfo(jSONObject2);
            } else if (c == 3) {
                setAudioCodecType(jSONObject2);
            }
        } catch (Exception unused) {
            LiteavLog.m16898e(TAG, "call experimental api failed. json:".concat(String.valueOf(str)));
        }
    }

    public void enableAudioVolumeEvaluation(int i) {
        synchronized (this) {
            this.mVolumeIntervalMs = Integer.valueOf(i);
            if (isNativeValid()) {
                nativeEnableAudioVolumeEvaluation(this.mNativeTXLivePlayerJni, i);
            }
        }
    }

    public boolean enableHardwareDecode(boolean z) {
        synchronized (this) {
            this.mEnableHardwareDecoder = Boolean.valueOf(z);
            if (isNativeValid()) {
                nativeEnableHardwareDecode(this.mNativeTXLivePlayerJni, z);
            }
        }
        return true;
    }

    public long getCurrentRenderPts() {
        synchronized (this) {
            if (!isNativeValid()) {
                return 0;
            }
            long nativeGetCurrentRenderPts = nativeGetCurrentRenderPts(this.mNativeTXLivePlayerJni);
            return nativeGetCurrentRenderPts;
        }
    }

    public boolean isPlaying() {
        synchronized (this) {
            if (!isNativeValid()) {
                return false;
            }
            boolean nativeIsPlaying = nativeIsPlaying(this.mNativeTXLivePlayerJni);
            return nativeIsPlaying;
        }
    }

    public void onAudioInfoChanged(int i, int i2, int i3) {
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener = this.mAudioRawDataListener;
        if (iTXAudioRawDataListener != null) {
            iTXAudioRawDataListener.onAudioInfoChanged(i, i2, i3);
        }
    }

    public void onAudioVolumeEvaluationNotify(int i) {
        TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.mAudioVolumeEvaluationListener;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.onAudioVolumeEvaluationNotify(i);
        }
    }

    public void onNetStatus(Bundle bundle) {
        ITXLivePlayListener iTXLivePlayListener = this.mListener;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onNetStatus(bundle);
        }
    }

    public void onPcmDataAvailable(byte[] bArr, long j) {
        TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener = this.mAudioRawDataListener;
        if (iTXAudioRawDataListener != null) {
            iTXAudioRawDataListener.onPcmDataAvailable(bArr, j);
        }
    }

    public void onPlayEvent(int i, Bundle bundle) {
        ITXLivePlayListener iTXLivePlayListener = this.mListener;
        if (iTXLivePlayListener != null) {
            iTXLivePlayListener.onPlayEvent(i, bundle);
        }
    }

    public void onRecordComplete(int i, String str, String str2, String str3) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
            if (i == 0) {
                tXRecordResult.retCode = 0;
            } else {
                tXRecordResult.retCode = -1;
            }
            tXRecordResult.descMsg = str;
            tXRecordResult.videoPath = str2;
            tXRecordResult.coverPath = str3;
            iTXVideoRecordListener.onRecordComplete(tXRecordResult);
        }
    }

    public void onRecordEvent(int i, Bundle bundle) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordEvent(i, bundle);
        }
    }

    public void onRecordProgress(long j) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordProgress(j);
        }
    }

    public void onRenderVideoFrame(PixelFrame pixelFrame) {
        TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener = this.mVideoRenderListener;
        if (iTXLivePlayVideoRenderListener != null) {
            TXLivePlayer.TXLiteAVTexture tXLiteAVTexture = new TXLivePlayer.TXLiteAVTexture();
            tXLiteAVTexture.textureId = pixelFrame.getTextureId();
            tXLiteAVTexture.width = pixelFrame.getWidth();
            tXLiteAVTexture.height = pixelFrame.getHeight();
            tXLiteAVTexture.eglContext = pixelFrame.getGLContext();
            iTXLivePlayVideoRenderListener.onRenderVideoFrame(tXLiteAVTexture);
        }
        TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener = this.mVideoRawDataListener;
        if (iTXVideoRawDataListener != null) {
            iTXVideoRawDataListener.onVideoRawDataAvailable(pixelFrame.getData(), pixelFrame.getWidth(), pixelFrame.getHeight(), (int) pixelFrame.getTimestamp());
        }
    }

    public void onShowLog(boolean z) {
        showDebugView(z);
    }

    public void onSnapshot(Bitmap bitmap) {
        TXLivePlayer.ITXSnapshotListener iTXSnapshotListener = this.mSnapshotListener;
        if (iTXSnapshotListener != null) {
            iTXSnapshotListener.onSnapshot(bitmap);
        }
    }

    public void pause() {
        synchronized (this) {
            if (isNativeValid()) {
                nativePause(this.mNativeTXLivePlayerJni);
            }
        }
    }

    public int prepareLiveSeek(String str, int i) {
        return 0;
    }

    public void resume() {
        synchronized (this) {
            if (isNativeValid()) {
                nativeResume(this.mNativeTXLivePlayerJni);
            }
        }
    }

    public int resumeLive() {
        return 0;
    }

    public void seek(int i) {
    }

    public void setAudioRawDataListener(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        synchronized (this) {
            this.mAudioRawDataListener = iTXAudioRawDataListener;
            if (isNativeValid()) {
                nativeEnableCustomAudioProcess(this.mNativeTXLivePlayerJni, iTXAudioRawDataListener != null);
            }
        }
    }

    public void setAudioRoute(int i) {
        synchronized (this) {
            this.mAudioRoute = Integer.valueOf(i);
            if (isNativeValid()) {
                nativeSetAudioRoute(this.mNativeTXLivePlayerJni, i);
            }
        }
    }

    public void setAudioVolumeEvaluationListener(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mAudioVolumeEvaluationListener = iTXAudioVolumeEvaluationListener;
    }

    public void setAutoPlay(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setConfig(com.tencent.rtmp.TXLivePlayConfig r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            if (r14 != 0) goto L_0x0005
            monitor-exit(r13)     // Catch:{ all -> 0x0056 }
            return
        L_0x0005:
            r13.mConfig = r14     // Catch:{ all -> 0x0056 }
            boolean r14 = r13.isNativeValid()     // Catch:{ all -> 0x0056 }
            if (r14 == 0) goto L_0x0054
            long r0 = r13.mNativeTXLivePlayerJni     // Catch:{ all -> 0x0056 }
            com.tencent.rtmp.TXLivePlayConfig r14 = r13.mConfig     // Catch:{ all -> 0x0056 }
            float r2 = r14.getCacheTime()     // Catch:{ all -> 0x0056 }
            com.tencent.rtmp.TXLivePlayConfig r14 = r13.mConfig     // Catch:{ all -> 0x0056 }
            float r3 = r14.getMaxAutoAdjustCacheTime()     // Catch:{ all -> 0x0056 }
            com.tencent.rtmp.TXLivePlayConfig r14 = r13.mConfig     // Catch:{ all -> 0x0056 }
            float r4 = r14.getMinAutoAdjustCacheTime()     // Catch:{ all -> 0x0056 }
            com.tencent.rtmp.TXLivePlayConfig r14 = r13.mConfig     // Catch:{ all -> 0x0056 }
            int r5 = r14.getVideoBlockThreshold()     // Catch:{ all -> 0x0056 }
            com.tencent.rtmp.TXLivePlayConfig r14 = r13.mConfig     // Catch:{ all -> 0x0056 }
            int r6 = r14.getConnectRetryCount()     // Catch:{ all -> 0x0056 }
            com.tencent.rtmp.TXLivePlayConfig r14 = r13.mConfig     // Catch:{ all -> 0x0056 }
            int r7 = r14.getConnectRetryInterval()     // Catch:{ all -> 0x0056 }
            com.tencent.rtmp.TXLivePlayConfig r14 = r13.mConfig     // Catch:{ all -> 0x0056 }
            boolean r8 = r14.isAutoAdjustCacheTime()     // Catch:{ all -> 0x0056 }
            com.tencent.rtmp.TXLivePlayConfig r14 = r13.mConfig     // Catch:{ all -> 0x0056 }
            boolean r9 = r14.isEnableMessage()     // Catch:{ all -> 0x0056 }
            com.tencent.rtmp.TXLivePlayConfig r14 = r13.mConfig     // Catch:{ all -> 0x0056 }
            boolean r10 = r14.isEnableMetaData()     // Catch:{ all -> 0x0056 }
            com.tencent.rtmp.TXLivePlayConfig r14 = r13.mConfig     // Catch:{ all -> 0x0056 }
            java.lang.String r11 = r14.getFlvSessionKey()     // Catch:{ all -> 0x0056 }
            com.tencent.rtmp.TXLivePlayConfig r14 = r13.mConfig     // Catch:{ all -> 0x0056 }
            java.util.Map r12 = r14.getHeaders()     // Catch:{ all -> 0x0056 }
            nativeSetConfig(r0, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r13)     // Catch:{ all -> 0x0056 }
            return
        L_0x0056:
            r14 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0056 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.live.TXLivePlayerJni.setConfig(com.tencent.rtmp.TXLivePlayConfig):void");
    }

    public void setMute(boolean z) {
        synchronized (this) {
            this.mIsAudioMuted = Boolean.valueOf(z);
            if (isNativeValid()) {
                nativeSetMute(this.mNativeTXLivePlayerJni, z);
            }
        }
    }

    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.mListener = iTXLivePlayListener;
    }

    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView != null) {
            C104511a.m139800a(tXCloudVideoView, new WeakReference(this));
            showDebugView(C104511a.m139801a(tXCloudVideoView));
        }
        synchronized (this) {
            if (tXCloudVideoView != null) {
                this.mDisplayTarget = new DisplayTarget(tXCloudVideoView);
            } else {
                this.mDisplayTarget = null;
            }
            if (isNativeValid()) {
                nativeSetPlayerView(this.mNativeTXLivePlayerJni, this.mDisplayTarget);
            }
        }
    }

    public void setRate(float f) {
    }

    public void setRenderMode(int i) {
        synchronized (this) {
            this.mRenderMode = Integer.valueOf(i);
            if (isNativeValid()) {
                nativeSetRenderMode(this.mNativeTXLivePlayerJni, i);
            }
        }
    }

    public void setRenderRotation(int i) {
        synchronized (this) {
            this.mRenderRotate = Integer.valueOf(i);
            if (isNativeValid()) {
                nativeSetRenderRotation(this.mNativeTXLivePlayerJni, i);
            }
        }
    }

    public void setSurface(Surface surface) {
        synchronized (this) {
            this.mSurface = surface;
            if (surface != null) {
                this.mDisplayTarget = new DisplayTarget(surface, this.mSurfaceWidth, this.mSurfaceHeight);
            } else {
                this.mDisplayTarget = null;
            }
            if (isNativeValid()) {
                nativeSetPlayerView(this.mNativeTXLivePlayerJni, this.mDisplayTarget);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSurfaceSize(int r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto L_0x002a
            if (r4 >= 0) goto L_0x0006
            goto L_0x002a
        L_0x0006:
            r2.mSurfaceWidth = r3     // Catch:{ all -> 0x002c }
            r2.mSurfaceHeight = r4     // Catch:{ all -> 0x002c }
            android.view.Surface r0 = r2.mSurface     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0016
            com.tencent.liteav.videobase.videobase.DisplayTarget r1 = new com.tencent.liteav.videobase.videobase.DisplayTarget     // Catch:{ all -> 0x002c }
            r1.<init>(r0, r3, r4)     // Catch:{ all -> 0x002c }
            r2.mDisplayTarget = r1     // Catch:{ all -> 0x002c }
            goto L_0x0019
        L_0x0016:
            r3 = 0
            r2.mDisplayTarget = r3     // Catch:{ all -> 0x002c }
        L_0x0019:
            boolean r3 = r2.isNativeValid()     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x0028
            com.tencent.liteav.videobase.videobase.DisplayTarget r3 = r2.mDisplayTarget     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x0028
            long r0 = r2.mNativeTXLivePlayerJni     // Catch:{ all -> 0x002c }
            nativeSetPlayerView(r0, r3)     // Catch:{ all -> 0x002c }
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            return
        L_0x002a:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.live.TXLivePlayerJni.setSurfaceSize(int, int):void");
    }

    public void setVideoRawDataListener(TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener) {
        synchronized (this) {
            boolean z = false;
            if (this.mVideoRenderListener != null) {
                this.mVideoRenderListener = null;
                this.mGLContext = null;
                if (isNativeValid()) {
                    nativeEnableCustomRenderTexture(this.mNativeTXLivePlayerJni, false, (Object) null);
                }
            }
            this.mVideoRawDataListener = iTXVideoRawDataListener;
            if (isNativeValid()) {
                long j = this.mNativeTXLivePlayerJni;
                if (iTXVideoRawDataListener != null) {
                    z = true;
                }
                nativeEnableCustomRenderI420(j, z);
            }
        }
    }

    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mVideoRecordListener = iTXVideoRecordListener;
    }

    public int setVideoRenderListener(TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
        synchronized (this) {
            if (this.mVideoRawDataListener != null) {
                this.mVideoRawDataListener = null;
                if (isNativeValid()) {
                    nativeEnableCustomRenderI420(this.mNativeTXLivePlayerJni, false);
                }
            }
            this.mVideoRenderListener = iTXLivePlayVideoRenderListener;
            if (iTXLivePlayVideoRenderListener == null) {
                obj = null;
            }
            this.mGLContext = obj;
            if (isNativeValid()) {
                nativeEnableCustomRenderTexture(this.mNativeTXLivePlayerJni, iTXLivePlayVideoRenderListener != null, this.mGLContext);
            }
        }
        return 0;
    }

    public void setVolume(int i) {
        synchronized (this) {
            this.mVolume = Integer.valueOf(i);
            if (isNativeValid()) {
                nativeSetVolume(this.mNativeTXLivePlayerJni, i);
            }
        }
    }

    public void showDebugView(boolean z) {
        synchronized (this) {
            this.mShowDebugView = Boolean.valueOf(z);
            if (isNativeValid()) {
                nativeShowDebugView(this.mNativeTXLivePlayerJni, z);
            }
        }
    }

    public void snapshot(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        synchronized (this) {
            this.mSnapshotListener = iTXSnapshotListener;
            if (isNativeValid()) {
                nativeSnapshot(this.mNativeTXLivePlayerJni);
            }
        }
    }

    public int startPlay(String str, int i) {
        int nativeStartPlay;
        String str2;
        Integer num;
        synchronized (this) {
            if (!isNativeValid()) {
                long nativeCreate = nativeCreate(new WeakReference(this));
                this.mNativeTXLivePlayerJni = nativeCreate;
                nativeSetPlayerView(nativeCreate, this.mDisplayTarget);
                TXLivePlayConfig tXLivePlayConfig = this.mConfig;
                if (tXLivePlayConfig != null) {
                    nativeSetConfig(this.mNativeTXLivePlayerJni, tXLivePlayConfig.getCacheTime(), this.mConfig.getMaxAutoAdjustCacheTime(), this.mConfig.getMinAutoAdjustCacheTime(), this.mConfig.getVideoBlockThreshold(), this.mConfig.getConnectRetryCount(), this.mConfig.getConnectRetryInterval(), this.mConfig.isAutoAdjustCacheTime(), this.mConfig.isEnableMessage(), this.mConfig.isEnableMetaData(), this.mConfig.getFlvSessionKey(), this.mConfig.getHeaders());
                }
                boolean z = true;
                if (this.mVideoRenderListener != null) {
                    nativeEnableCustomRenderI420(this.mNativeTXLivePlayerJni, false);
                    nativeEnableCustomRenderTexture(this.mNativeTXLivePlayerJni, true, this.mGLContext);
                } else if (this.mVideoRawDataListener != null) {
                    nativeEnableCustomRenderTexture(this.mNativeTXLivePlayerJni, false, this.mGLContext);
                    nativeEnableCustomRenderI420(this.mNativeTXLivePlayerJni, true);
                } else {
                    nativeEnableCustomRenderTexture(this.mNativeTXLivePlayerJni, false, this.mGLContext);
                    nativeEnableCustomRenderI420(this.mNativeTXLivePlayerJni, false);
                }
                long j = this.mNativeTXLivePlayerJni;
                if (this.mAudioRawDataListener == null) {
                    z = false;
                }
                nativeEnableCustomAudioProcess(j, z);
                Integer num2 = this.mRenderMode;
                if (num2 != null) {
                    nativeSetRenderMode(this.mNativeTXLivePlayerJni, num2.intValue());
                }
                Integer num3 = this.mRenderRotate;
                if (num3 != null) {
                    nativeSetRenderRotation(this.mNativeTXLivePlayerJni, num3.intValue());
                }
                Boolean bool = this.mEnableHardwareDecoder;
                if (bool != null) {
                    nativeEnableHardwareDecode(this.mNativeTXLivePlayerJni, bool.booleanValue());
                }
                Integer num4 = this.mVolume;
                if (num4 != null) {
                    nativeSetVolume(this.mNativeTXLivePlayerJni, num4.intValue());
                }
                Integer num5 = this.mAudioRoute;
                if (num5 != null) {
                    nativeSetAudioRoute(this.mNativeTXLivePlayerJni, num5.intValue());
                }
                Integer num6 = this.mVolumeIntervalMs;
                if (num6 != null) {
                    nativeEnableAudioVolumeEvaluation(this.mNativeTXLivePlayerJni, num6.intValue());
                }
                Boolean bool2 = this.mIsAudioMuted;
                if (bool2 != null) {
                    nativeSetMute(this.mNativeTXLivePlayerJni, bool2.booleanValue());
                }
                Boolean bool3 = this.mShowDebugView;
                if (bool3 != null) {
                    nativeShowDebugView(this.mNativeTXLivePlayerJni, bool3.booleanValue());
                }
                if (!(this.mAESKey == null || (str2 = this.mAESURL) == null || (num = this.mAESMode) == null || this.mAESIV == null)) {
                    nativeSetAESCodecParams(this.mNativeTXLivePlayerJni, str2, num.intValue(), this.mAESKey, this.mAESIV);
                }
                Long l = this.mNativeAudioJitterBufferControllerFactory;
                if (l != null) {
                    nativeSetAudioJitterBufferControllerFactory(this.mNativeTXLivePlayerJni, l.longValue());
                }
                String str3 = this.mReportStreamRspInfoParams;
                if (str3 != null) {
                    nativeEnableReportStreamRspInfo(this.mNativeTXLivePlayerJni, str3);
                }
                Integer num7 = this.mAudioCodecType;
                if (num7 != null) {
                    nativeSetAudioCodecType(this.mNativeTXLivePlayerJni, num7.intValue());
                }
            }
            nativeStartPlay = nativeStartPlay(this.mNativeTXLivePlayerJni, str, i);
        }
        return nativeStartPlay;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int startRecord(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.isNativeValid()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x001f
            android.content.Context r0 = com.tencent.liteav.base.ContextUtils.getApplicationContext()     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = ".mp4"
            java.lang.String r0 = genFilePath(r0, r1)     // Catch:{ all -> 0x0022 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x001a
            r4 = -1
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            return r4
        L_0x001a:
            long r1 = r3.mNativeTXLivePlayerJni     // Catch:{ all -> 0x0022 }
            nativeStartRecord(r1, r4, r0)     // Catch:{ all -> 0x0022 }
        L_0x001f:
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            r4 = 0
            return r4
        L_0x0022:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.live.TXLivePlayerJni.startRecord(int):int");
    }

    public int stopPlay(boolean z) {
        synchronized (this) {
            DisplayTarget displayTarget = this.mDisplayTarget;
            if (displayTarget != null && z) {
                displayTarget.hideAll();
            }
            if (isNativeValid()) {
                nativeStopPlay(this.mNativeTXLivePlayerJni);
                nativeDestroy(this.mNativeTXLivePlayerJni);
                this.mNativeTXLivePlayerJni = 0;
            }
        }
        return 0;
    }

    public int stopRecord() {
        synchronized (this) {
            if (isNativeValid()) {
                nativeStopRecord(this.mNativeTXLivePlayerJni);
            }
        }
        return 0;
    }

    public int switchStream(String str) {
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                LiteavLog.m16898e(TAG, "Invalid params.");
                return -1;
            } else if (!isNativeValid()) {
                return -1;
            } else {
                int nativeSwitchStream = nativeSwitchStream(this.mNativeTXLivePlayerJni, str);
                return nativeSwitchStream;
            }
        }
    }
}
