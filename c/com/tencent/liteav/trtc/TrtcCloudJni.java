package com.tencent.liteav.trtc;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.base.ThreadUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C28637q;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtc.TRTCStatistics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.microedition.khronos.egl.EGLContext;

@JNINamespace("liteav::trtc")
public class TrtcCloudJni {
    private static final Object INIT_LOCK = new Object();
    private static final String TAG = "TrtcCloudJni";
    private static boolean mHasInited;
    private TRTCCloudListener.TRTCAudioFrameListener mAudioFrameListener;
    private TRTCCloudListener.TRTCVideoFrameListener mCalledGLCreatedFrameListener;
    private View mFloatingWindow;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private TRTCCloudListener mListener;
    private Handler mListenerHandler;
    private String mLocalUserId;
    private final C17185a<TRTCCloudListener.TRTCVideoRenderListener> mLocalVideoRenderListenerWrapper;
    private long mNativeTrtcCloudJni;
    private final ReentrantReadWriteLock mReadWriteLock;
    private final Map<String, C17185a<TRTCCloudListener.TRTCVideoRenderListener>> mRemoteVideoRenderListenerMap;
    private final C17185a<TRTCCloudListener.TRTCVideoFrameListener> mVideoFrameListenerWrapper;

    public static class AudioParallelParams {

        /* renamed from: a */
        private TRTCCloudDef.TRTCAudioParallelParams f46427a;

        public AudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
            this.f46427a = tRTCAudioParallelParams;
        }

        public String[] getIncludeUsers() {
            ArrayList<String> arrayList = this.f46427a.includeUsers;
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        public int getMaxCount() {
            return this.f46427a.maxCount;
        }
    }

    public static class AudioRecordingParams {

        /* renamed from: a */
        private final TRTCCloudDef.TRTCAudioRecordingParams f46428a;

        public AudioRecordingParams(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
            this.f46428a = tRTCAudioRecordingParams;
        }

        public int getContent() {
            return this.f46428a.recordingContent;
        }

        public String getFilePath() {
            return this.f46428a.filePath;
        }
    }

    public static class LocalRecordingParams {

        /* renamed from: a */
        private final TRTCCloudDef.TRTCLocalRecordingParams f46429a;

        public LocalRecordingParams(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
            this.f46429a = tRTCLocalRecordingParams;
        }

        public String getFilePath() {
            return this.f46429a.filePath;
        }

        public int getInterval() {
            return this.f46429a.interval;
        }

        public int getRecordType() {
            return this.f46429a.recordType;
        }
    }

    public static class PublishCDNParams {

        /* renamed from: a */
        private TRTCCloudDef.TRTCPublishCDNParam f46430a;

        public PublishCDNParams(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
            this.f46430a = tRTCPublishCDNParam;
        }

        public int getAppId() {
            return this.f46430a.appId;
        }

        public int getBizId() {
            return this.f46430a.bizId;
        }

        public String getUrl() {
            return TextUtils.isEmpty(this.f46430a.url) ? "" : this.f46430a.url;
        }
    }

    public static class ScreenShareParams {

        /* renamed from: a */
        private final TRTCCloudDef.TRTCScreenShareParams f46431a;

        public ScreenShareParams(TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
            this.f46431a = tRTCScreenShareParams;
        }

        public Object getMediaProjection() {
            return this.f46431a.mediaProjection;
        }
    }

    public static class SpeedTestParams {

        /* renamed from: a */
        private final TRTCCloudDef.TRTCSpeedTestParams f46432a;

        public SpeedTestParams(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
            this.f46432a = tRTCSpeedTestParams;
        }

        public int getExpectedDownBandwidth() {
            return this.f46432a.expectedDownBandwidth;
        }

        public int getExpectedUpBandwidth() {
            return this.f46432a.expectedUpBandwidth;
        }

        public int getSDKAppId() {
            return this.f46432a.sdkAppId;
        }

        public String getUserId() {
            return this.f46432a.userId;
        }

        public String getUserSig() {
            return this.f46432a.userSig;
        }
    }

    public static class SpeedTestResult {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public TRTCCloudDef.TRTCSpeedTestResult f46433a = new TRTCCloudDef.TRTCSpeedTestResult();

        public static SpeedTestResult createSpeedTestResult(boolean z, String str, String str2, int i, float f, float f2, int i2, int i3, int i4) {
            SpeedTestResult speedTestResult = new SpeedTestResult();
            TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult = speedTestResult.f46433a;
            tRTCSpeedTestResult.success = z;
            tRTCSpeedTestResult.errMsg = str;
            tRTCSpeedTestResult.f57003ip = str2;
            tRTCSpeedTestResult.quality = i;
            tRTCSpeedTestResult.upLostRate = f;
            tRTCSpeedTestResult.downLostRate = f2;
            tRTCSpeedTestResult.rtt = i2;
            tRTCSpeedTestResult.availableUpBandwidth = i3;
            tRTCSpeedTestResult.availableDownBandwidth = i4;
            return speedTestResult;
        }
    }

    public static class SwitchRoomConfig {

        /* renamed from: a */
        private TRTCCloudDef.TRTCSwitchRoomConfig f46434a;

        public SwitchRoomConfig(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
            this.f46434a = tRTCSwitchRoomConfig;
        }

        public String getPrivateMapKey() {
            String str = this.f46434a.privateMapKey;
            return str != null ? str : "";
        }

        public int getRoomId() {
            return this.f46434a.roomId;
        }

        public String getStringRoomId() {
            String str = this.f46434a.strRoomId;
            return str != null ? str : "";
        }

        public String getUserSig() {
            String str = this.f46434a.userSig;
            return str != null ? str : "";
        }
    }

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$a */
    public static class C17185a<T> {

        /* renamed from: a */
        public int f46435a;

        /* renamed from: b */
        public GLConstants.PixelFormatType f46436b;

        /* renamed from: c */
        public GLConstants.PixelBufferType f46437c;

        /* renamed from: d */
        public T f46438d;

        private C17185a() {
        }

        public /* synthetic */ C17185a(byte b) {
            this();
        }
    }

    public static class AudioFrame {

        /* renamed from: a */
        private TRTCCloudDef.TRTCAudioFrame f46439a;

        public AudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
            this.f46439a = tRTCAudioFrame;
        }

        public int getChannel() {
            return this.f46439a.channel;
        }

        public byte[] getData() {
            return this.f46439a.data;
        }

        public int getSampleRate() {
            return this.f46439a.sampleRate;
        }

        public long getTimestamp() {
            return this.f46439a.timestamp;
        }
    }

    public static class EnterRoomParams {

        /* renamed from: a */
        private TRTCCloudDef.TRTCParams f46440a;

        public EnterRoomParams(TRTCCloudDef.TRTCParams tRTCParams) {
            this.f46440a = tRTCParams;
        }

        public String getBusinessInfo() {
            return this.f46440a.businessInfo;
        }

        public String getPrivateMapKey() {
            return this.f46440a.privateMapKey;
        }

        public String getRecordId() {
            return this.f46440a.userDefineRecordId;
        }

        public int getRole() {
            return this.f46440a.role;
        }

        public int getRoomId() {
            return this.f46440a.roomId;
        }

        public int getSdkAppId() {
            return this.f46440a.sdkAppId;
        }

        public String getStrRoomId() {
            return this.f46440a.strRoomId;
        }

        public String getStreamId() {
            return this.f46440a.streamId;
        }

        public String getUserId() {
            return this.f46440a.userId;
        }

        public String getUserSig() {
            return this.f46440a.userSig;
        }
    }

    public static class LocalStatistics {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public TRTCStatistics.TRTCLocalStatistics f46441a = new TRTCStatistics.TRTCLocalStatistics();

        public static void addLocalStatistics(LocalStatistics localStatistics, ArrayList<LocalStatistics> arrayList) {
            arrayList.add(localStatistics);
        }

        public static LocalStatistics createLocalStatistics(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            LocalStatistics localStatistics = new LocalStatistics();
            TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics = localStatistics.f46441a;
            tRTCLocalStatistics.streamType = i;
            tRTCLocalStatistics.width = i2;
            tRTCLocalStatistics.height = i3;
            tRTCLocalStatistics.frameRate = i4;
            tRTCLocalStatistics.videoBitrate = i5;
            tRTCLocalStatistics.audioBitrate = i7;
            tRTCLocalStatistics.audioSampleRate = i6;
            tRTCLocalStatistics.audioCaptureState = i8;
            return localStatistics;
        }

        public static ArrayList<LocalStatistics> createLocalStatisticsArray() {
            return new ArrayList<>();
        }
    }

    public static class MixUser {

        /* renamed from: a */
        private TRTCCloudDef.TRTCMixUser f46442a;

        public /* synthetic */ MixUser(TRTCCloudDef.TRTCMixUser tRTCMixUser, byte b) {
            this(tRTCMixUser);
        }

        public int getHeight() {
            return this.f46442a.height;
        }

        public String getImage() {
            return TextUtils.isEmpty(this.f46442a.image) ? "" : this.f46442a.image;
        }

        public int getInputType() {
            return this.f46442a.inputType;
        }

        public boolean getPureAudio() {
            return this.f46442a.pureAudio;
        }

        public int getRenderMode() {
            return this.f46442a.renderMode;
        }

        public String getRoomId() {
            return TextUtils.isEmpty(this.f46442a.roomId) ? "" : this.f46442a.roomId;
        }

        public int getStreamType() {
            return this.f46442a.streamType;
        }

        public String getUserId() {
            return TextUtils.isEmpty(this.f46442a.userId) ? "" : this.f46442a.userId;
        }

        public int getWidth() {
            return this.f46442a.width;
        }

        public int getX() {
            return this.f46442a.f165818x;
        }

        public int getY() {
            return this.f46442a.f165819y;
        }

        public int getZOrder() {
            return this.f46442a.zOrder;
        }

        private MixUser(TRTCCloudDef.TRTCMixUser tRTCMixUser) {
            this.f46442a = tRTCMixUser;
        }
    }

    public static class RemoteStatistics {

        /* renamed from: a */
        public TRTCStatistics.TRTCRemoteStatistics f46443a = new TRTCStatistics.TRTCRemoteStatistics();

        public static void addRemoteStatistics(RemoteStatistics remoteStatistics, ArrayList<RemoteStatistics> arrayList) {
            arrayList.add(remoteStatistics);
        }

        public static RemoteStatistics createRemoteStatistics(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, int i16, int i17, int i18, int i19, int i25, int i26) {
            RemoteStatistics remoteStatistics = new RemoteStatistics();
            TRTCStatistics.TRTCRemoteStatistics tRTCRemoteStatistics = remoteStatistics.f46443a;
            tRTCRemoteStatistics.userId = str;
            tRTCRemoteStatistics.streamType = i;
            tRTCRemoteStatistics.width = i2;
            tRTCRemoteStatistics.height = i3;
            tRTCRemoteStatistics.frameRate = i4;
            tRTCRemoteStatistics.audioPacketLoss = i16;
            tRTCRemoteStatistics.videoPacketLoss = i5;
            tRTCRemoteStatistics.videoBlockRate = i8;
            tRTCRemoteStatistics.videoTotalBlockTime = i7;
            tRTCRemoteStatistics.videoBitrate = i6;
            tRTCRemoteStatistics.audioBitrate = i15;
            tRTCRemoteStatistics.audioSampleRate = i9;
            tRTCRemoteStatistics.audioTotalBlockTime = i17;
            tRTCRemoteStatistics.audioBlockRate = i18;
            tRTCRemoteStatistics.jitterBufferDelay = i19;
            tRTCRemoteStatistics.point2PointDelay = i25;
            tRTCRemoteStatistics.finalLoss = i26;
            return remoteStatistics;
        }

        public static ArrayList<RemoteStatistics> createRemoteStatisticsArray() {
            return new ArrayList<>();
        }
    }

    public static class Statistics {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public TRTCStatistics f46444a = new TRTCStatistics();

        public static Statistics createStatistics(int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, ArrayList<LocalStatistics> arrayList, ArrayList<RemoteStatistics> arrayList2) {
            Statistics statistics = new Statistics();
            TRTCStatistics tRTCStatistics = statistics.f46444a;
            tRTCStatistics.appCpu = i;
            tRTCStatistics.systemCpu = i2;
            tRTCStatistics.upLoss = i3;
            tRTCStatistics.downLoss = i4;
            tRTCStatistics.rtt = i5;
            tRTCStatistics.gatewayRtt = i6;
            tRTCStatistics.sendBytes = j;
            tRTCStatistics.receiveBytes = j2;
            tRTCStatistics.localArray = new ArrayList<>();
            statistics.f46444a.remoteArray = new ArrayList<>();
            if (arrayList != null) {
                Iterator<LocalStatistics> it = arrayList.iterator();
                while (it.hasNext()) {
                    statistics.f46444a.localArray.add(it.next().f46441a);
                }
            }
            if (arrayList2 != null) {
                Iterator<RemoteStatistics> it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    statistics.f46444a.remoteArray.add(it4.next().f46443a);
                }
            }
            return statistics;
        }
    }

    public static class TranscodingConfig {

        /* renamed from: a */
        private TRTCCloudDef.TRTCTranscodingConfig f46445a;

        public TranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
            this.f46445a = tRTCTranscodingConfig;
        }

        public int getAppId() {
            return this.f46445a.appId;
        }

        public int getAudioBitrate() {
            return this.f46445a.audioBitrate;
        }

        public int getAudioChannels() {
            return this.f46445a.audioChannels;
        }

        public int getAudioSampleRate() {
            return this.f46445a.audioSampleRate;
        }

        public int getBackgroundColor() {
            return this.f46445a.backgroundColor;
        }

        public String getBackgroundImage() {
            return TextUtils.isEmpty(this.f46445a.backgroundImage) ? "" : this.f46445a.backgroundImage;
        }

        public int getBizId() {
            return this.f46445a.bizId;
        }

        public MixUser[] getMixUsers() {
            ArrayList<TRTCCloudDef.TRTCMixUser> arrayList = this.f46445a.mixUsers;
            if (arrayList == null) {
                return null;
            }
            MixUser[] mixUserArr = new MixUser[arrayList.size()];
            for (int i = 0; i < this.f46445a.mixUsers.size(); i++) {
                mixUserArr[i] = new MixUser(this.f46445a.mixUsers.get(i), (byte) 0);
            }
            return mixUserArr;
        }

        public int getMode() {
            return this.f46445a.mode;
        }

        public String getStreamId() {
            return TextUtils.isEmpty(this.f46445a.streamId) ? "" : this.f46445a.streamId;
        }

        public int getVideoBitrate() {
            return this.f46445a.videoBitrate;
        }

        public int getVideoFramerate() {
            return this.f46445a.videoFramerate;
        }

        public int getVideoGOP() {
            return this.f46445a.videoGOP;
        }

        public int getVideoHeight() {
            return this.f46445a.videoHeight;
        }

        public int getVideoWidth() {
            return this.f46445a.videoWidth;
        }
    }

    public static class VideoEncParams {

        /* renamed from: a */
        private TRTCCloudDef.TRTCVideoEncParam f46446a;

        public VideoEncParams(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
            this.f46446a = tRTCVideoEncParam;
        }

        public int getMinVideoBitrate() {
            return this.f46446a.minVideoBitrate;
        }

        public int getVideoBitrate() {
            return this.f46446a.videoBitrate;
        }

        public int getVideoFps() {
            return this.f46446a.videoFps;
        }

        public int getVideoResolution() {
            return this.f46446a.videoResolution;
        }

        public int getVideoResolutionMode() {
            return this.f46446a.videoResolutionMode;
        }

        public boolean isEnableAdjustRes() {
            return this.f46446a.enableAdjustRes;
        }
    }

    static {
        C28637q.m38304a();
    }

    public TrtcCloudJni() {
        this(0);
    }

    private static int convertPixelBufferTypeToTRTCBufferType(GLConstants.PixelBufferType pixelBufferType) {
        if (pixelBufferType == GLConstants.PixelBufferType.BYTE_BUFFER) {
            return 1;
        }
        if (pixelBufferType == GLConstants.PixelBufferType.BYTE_ARRAY) {
            return 2;
        }
        return pixelBufferType == GLConstants.PixelBufferType.TEXTURE_2D ? 3 : 0;
    }

    private static int convertPixelFormatTypeToTRTCFormatType(GLConstants.PixelFormatType pixelFormatType) {
        if (pixelFormatType == GLConstants.PixelFormatType.I420) {
            return 1;
        }
        if (pixelFormatType == GLConstants.PixelFormatType.NV21) {
            return 4;
        }
        return pixelFormatType == GLConstants.PixelFormatType.RGBA ? 5 : 0;
    }

    private static GLConstants.PixelBufferType convertTRTCBufferTypeToPixelBufferType(int i) {
        return i != 1 ? i != 2 ? GLConstants.PixelBufferType.TEXTURE_2D : GLConstants.PixelBufferType.BYTE_ARRAY : GLConstants.PixelBufferType.BYTE_BUFFER;
    }

    private static GLConstants.PixelFormatType convertTRTCFormatTypeToPixelFormatType(int i) {
        if (i != 2) {
            if (i == 4) {
                return GLConstants.PixelFormatType.NV21;
            }
            if (i != 5) {
                return GLConstants.PixelFormatType.I420;
            }
        }
        return GLConstants.PixelFormatType.RGBA;
    }

    public static Bundle createExtraInfoBundle(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        return bundle;
    }

    /* access modifiers changed from: private */
    public void hideFloatingWindow() {
        View view = this.mFloatingWindow;
        if (view != null) {
            ((WindowManager) view.getContext().getSystemService("window")).removeViewImmediate(this.mFloatingWindow);
            this.mFloatingWindow = null;
        }
    }

    public static void init(int i) {
        synchronized (INIT_LOCK) {
            if (!mHasInited) {
                mHasInited = true;
                nativeGlobalInit(i);
            }
        }
    }

    private static boolean isCustomPreprocessSupportedBufferType(GLConstants.PixelBufferType pixelBufferType) {
        return pixelBufferType == GLConstants.PixelBufferType.BYTE_BUFFER || pixelBufferType == GLConstants.PixelBufferType.BYTE_ARRAY || pixelBufferType == GLConstants.PixelBufferType.TEXTURE_2D;
    }

    private static boolean isCustomPreprocessSupportedFormatType(GLConstants.PixelFormatType pixelFormatType) {
        return pixelFormatType == GLConstants.PixelFormatType.I420 || pixelFormatType == GLConstants.PixelFormatType.NV21 || pixelFormatType == GLConstants.PixelFormatType.RGBA;
    }

    private static boolean isCustomRenderSupportedBufferType(GLConstants.PixelBufferType pixelBufferType) {
        return pixelBufferType == GLConstants.PixelBufferType.BYTE_BUFFER || pixelBufferType == GLConstants.PixelBufferType.BYTE_ARRAY || pixelBufferType == GLConstants.PixelBufferType.TEXTURE_2D;
    }

    private static boolean isCustomRenderSupportedFormatType(GLConstants.PixelFormatType pixelFormatType) {
        return pixelFormatType == GLConstants.PixelFormatType.I420 || pixelFormatType == GLConstants.PixelFormatType.NV21 || pixelFormatType == GLConstants.PixelFormatType.RGBA;
    }

    public static /* synthetic */ void lambda$enterRoom$0(TrtcCloudJni trtcCloudJni) {
        trtcCloudJni.onEnterRoom(-3316);
        trtcCloudJni.onError(-3316, "enter room param null");
    }

    public static /* synthetic */ void lambda$onSnapshotComplete$1(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        if (tRTCSnapshotListener != null) {
            tRTCSnapshotListener.onSnapshotComplete(bitmap);
        }
    }

    private static native void nativeCallExperimentalAPI(long j, String str);

    private static native void nativeConnectOtherRoom(long j, String str);

    private static native long nativeCreateAudioEffectManager(long j);

    private static native long nativeCreateBeautyManager(long j);

    private static native long nativeCreateDeviceManager(long j);

    private static native long nativeCreatePipeline(TrtcCloudJni trtcCloudJni);

    private static native long nativeCreateSubCloud(TrtcCloudJni trtcCloudJni, long j);

    private static native void nativeDestroyPipeline(long j);

    private static native void nativeDisconnectOtherRoom(long j);

    private static native void nativeEnableAudioFrameNotification(long j, boolean z);

    private static native void nativeEnableAudioVolumeEvaluation(long j, int i);

    private static native void nativeEnableCustomAudioCapture(long j, boolean z);

    private static native void nativeEnableCustomAudioRendering(long j, boolean z);

    private static native void nativeEnableCustomVideoCapture(long j, int i, boolean z);

    private static native void nativeEnableEncSmallVideoStream(long j, boolean z, VideoEncParams videoEncParams);

    private static native void nativeEnableMixExternalAudioFrame(long j, boolean z, boolean z2);

    private static native void nativeEnableVideoCustomPreprocess(long j, boolean z, int i, int i2, int i3);

    private static native void nativeEnableVideoCustomRender(long j, boolean z, String str, int i, int i2, int i3);

    private static native void nativeEnterRoom(long j, EnterRoomParams enterRoomParams, int i);

    private static native void nativeExitRoom(long j);

    private static native int nativeGetAudioCaptureVolume(long j);

    private static native int nativeGetAudioPlayoutVolume(long j);

    private static native void nativeGetCustomAudioRenderingFrame(long j, byte[] bArr, int i, int i2);

    private static native void nativeGlobalInit(int i);

    private static native void nativeGlobalUninit();

    private static native int nativeMixExternalAudioFrame(long j, AudioFrame audioFrame);

    private static native void nativeMuteAllRemoteAudio(long j, boolean z);

    private static native void nativeMuteAllRemoteVideoStreams(long j, boolean z);

    private static native void nativeMuteLocalAudio(long j, boolean z);

    private static native void nativeMuteLocalVideo(long j, int i, boolean z);

    private static native void nativeMuteRemoteAudio(long j, String str, boolean z);

    private static native void nativeMuteRemoteVideoStream(long j, String str, int i, boolean z);

    private static native void nativePauseScreenCapture(long j, int i);

    private static native void nativeResumeScreenCapture(long j, int i);

    private static native void nativeSendCustomAudioData(long j, AudioFrame audioFrame);

    private static native boolean nativeSendCustomCmdMsg(long j, int i, byte[] bArr, boolean z, boolean z2);

    private static native void nativeSendCustomVideoData(long j, int i, PixelFrame pixelFrame);

    private static native boolean nativeSendSEIMsg(long j, byte[] bArr, int i);

    private static native void nativeSetAudioCaptureVolume(long j, int i);

    private static native void nativeSetAudioPlayoutVolume(long j, int i);

    private static native void nativeSetAudioQuality(long j, int i);

    private static native int nativeSetCapturedRawAudioFrameCallbackFormat(long j, int i, int i2, int i3);

    private static native void nativeSetConsoleEnabled(boolean z);

    private static native void nativeSetDefaultStreamRecvMode(long j, boolean z, boolean z2);

    private static native void nativeSetGSensorMode(long j, int i, int i2);

    private static native void nativeSetListenerHandler(long j, Handler handler);

    private static native int nativeSetLocalProcessedAudioFrameCallbackFormat(long j, int i, int i2, int i3);

    private static native void nativeSetLocalViewFillMode(long j, int i);

    private static native void nativeSetLocalViewMirror(long j, int i);

    private static native void nativeSetLocalViewRotation(long j, int i);

    private static native void nativeSetLogCompressEnabled(boolean z);

    private static native void nativeSetLogLevel(int i);

    private static native void nativeSetLogPath(String str);

    private static native void nativeSetMixExternalAudioVolume(long j, int i, int i2);

    private static native void nativeSetMixTranscodingConfig(long j, TranscodingConfig transcodingConfig);

    private static native int nativeSetMixedPlayAudioFrameCallbackFormat(long j, int i, int i2, int i3);

    private static native void nativeSetNetworkQosParam(long j, int i, int i2);

    private static native void nativeSetPriorRemoteVideoStreamType(long j, int i);

    private static native void nativeSetRemoteAudioParallelParams(long j, AudioParallelParams audioParallelParams);

    private static native void nativeSetRemoteAudioVolume(long j, String str, int i);

    private static native void nativeSetRemoteVideoStreamType(long j, String str, int i);

    private static native void nativeSetRemoteViewFillMode(long j, String str, int i, int i2);

    private static native void nativeSetRemoteViewMirror(long j, String str, int i, int i2);

    private static native void nativeSetRemoteViewRotation(long j, String str, int i, int i2);

    private static native void nativeSetVideoEncoderMirror(long j, boolean z);

    private static native void nativeSetVideoEncoderParams(long j, int i, VideoEncParams videoEncParams);

    private static native void nativeSetVideoEncoderRotation(long j, int i);

    private static native void nativeSetVideoMuteImage(long j, int i, Bitmap bitmap, int i2);

    private static native void nativeSetWatermark(long j, Bitmap bitmap, int i, float f, float f2, float f3);

    private static native void nativeShowDashboardManager(long j, int i);

    private static native void nativeSnapshotVideo(long j, String str, int i, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener);

    private static native int nativeStartAudioRecording(long j, AudioRecordingParams audioRecordingParams);

    private static native void nativeStartLocalAudio(long j);

    private static native void nativeStartLocalAudioWithQuality(long j, int i);

    private static native void nativeStartLocalPreview(long j, boolean z, DisplayTarget displayTarget);

    private static native void nativeStartLocalRecording(long j, LocalRecordingParams localRecordingParams);

    private static native void nativeStartPublishCDNStream(long j, PublishCDNParams publishCDNParams);

    private static native void nativeStartPublishing(long j, String str, int i);

    private static native void nativeStartRemoteView(long j, String str, int i, DisplayTarget displayTarget);

    private static native void nativeStartRemoteViewWithoutStreamType(long j, String str, DisplayTarget displayTarget);

    private static native void nativeStartScreenCapture(long j, int i, VideoEncParams videoEncParams, ScreenShareParams screenShareParams);

    private static native void nativeStartSpeedTest(long j, boolean z, SpeedTestParams speedTestParams);

    private static native void nativeStartSystemAudioLoopback(long j);

    private static native void nativeStopAllRemoteView(long j);

    private static native void nativeStopAudioRecording(long j);

    private static native void nativeStopLocalAudio(long j);

    private static native void nativeStopLocalPreview(long j);

    private static native void nativeStopLocalRecording(long j);

    private static native void nativeStopPublishCDNStream(long j);

    private static native void nativeStopPublishing(long j);

    private static native void nativeStopRemoteView(long j, String str, int i);

    private static native void nativeStopRemoteViewWithoutStreamType(long j, String str);

    private static native void nativeStopScreenCapture(long j, int i);

    private static native void nativeStopSpeedTest(long j);

    private static native void nativeStopSystemAudioLoopback(long j);

    private static native void nativeSwitchRole(long j, int i);

    private static native void nativeSwitchRoleWithPrivateMapKey(long j, int i, String str);

    private static native void nativeSwitchRoom(long j, SwitchRoomConfig switchRoomConfig);

    private static native void nativeUpdateLocalView(long j, DisplayTarget displayTarget);

    private static native void nativeUpdateRemoteView(long j, String str, int i, DisplayTarget displayTarget);

    private void runOnListenerThread(Runnable runnable) {
        Handler handler = this.mListenerHandler;
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void setConsoleEnabled(boolean z) {
        nativeSetConsoleEnabled(z);
    }

    public static void setLogCompressEnabled(boolean z) {
        nativeSetLogCompressEnabled(z);
    }

    public static void setLogDirPath(String str) {
        nativeSetLogPath(str);
    }

    public static void setLogLevel(int i) {
        nativeSetLogLevel(i);
    }

    private static void shadowCopy(PixelFrame pixelFrame, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        tRTCVideoFrame.pixelFormat = convertPixelFormatTypeToTRTCFormatType(pixelFrame.getPixelFormatType());
        tRTCVideoFrame.bufferType = convertPixelBufferTypeToTRTCBufferType(pixelFrame.getPixelBufferType());
        TRTCCloudDef.TRTCTexture tRTCTexture = new TRTCCloudDef.TRTCTexture();
        tRTCVideoFrame.texture = tRTCTexture;
        tRTCTexture.textureId = pixelFrame.getTextureId();
        if (pixelFrame.getGLContext() instanceof EGLContext) {
            tRTCVideoFrame.texture.eglContext10 = (EGLContext) pixelFrame.getGLContext();
        } else if (LiteavSystemInfo.getSystemOSVersionInt() >= 17 && (pixelFrame.getGLContext() instanceof android.opengl.EGLContext)) {
            tRTCVideoFrame.texture.eglContext14 = (android.opengl.EGLContext) pixelFrame.getGLContext();
        }
        tRTCVideoFrame.data = pixelFrame.getData();
        tRTCVideoFrame.buffer = pixelFrame.getBuffer();
        tRTCVideoFrame.width = pixelFrame.getWidth();
        tRTCVideoFrame.height = pixelFrame.getHeight();
        tRTCVideoFrame.timestamp = pixelFrame.getTimestamp();
        tRTCVideoFrame.rotation = pixelFrame.getRotation().mValue;
    }

    /* access modifiers changed from: private */
    public void showFloatingWindow(View view) {
        if (view != null) {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 23 || Settings.canDrawOverlays(view.getContext())) {
                this.mFloatingWindow = view;
                WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
                int i = 2005;
                if (LiteavSystemInfo.getSystemOSVersionInt() >= 26) {
                    i = 2038;
                } else if (LiteavSystemInfo.getSystemOSVersionInt() > 24) {
                    i = 2002;
                }
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i);
                layoutParams.flags = 8 | 262144;
                layoutParams.width = -2;
                layoutParams.height = -2;
                layoutParams.format = -3;
                windowManager.addView(view, layoutParams);
                return;
            }
            LiteavLog.m16898e(TAG, "can't show floating window for no drawing overlay permission");
        }
    }

    public static void uninit() {
        synchronized (INIT_LOCK) {
            if (mHasInited) {
                mHasInited = false;
                nativeGlobalUninit();
            }
        }
    }

    public void callExperimentalAPI(String str) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeCallExperimentalAPI(j, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void connectOtherRoom(String str) {
        long j = this.mNativeTrtcCloudJni;
        if (j != 0) {
            nativeConnectOtherRoom(j, str);
        }
    }

    public long createAudioEffectManager() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            long j2 = 0;
            if (j != 0) {
                j2 = nativeCreateAudioEffectManager(j);
            }
            return j2;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long createBeautyManager() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            long j2 = 0;
            if (j != 0) {
                j2 = nativeCreateBeautyManager(j);
            }
            return j2;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long createDeviceManager() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            long j2 = 0;
            if (j != 0) {
                j2 = nativeCreateDeviceManager(j);
            }
            return j2;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeDestroyPipeline(j);
                this.mNativeTrtcCloudJni = 0;
            }
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    public void disconnectOtherRoom() {
        long j = this.mNativeTrtcCloudJni;
        if (j != 0) {
            nativeDisconnectOtherRoom(j);
        }
    }

    public void enableAudioVolumeEvaluation(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeEnableAudioVolumeEvaluation(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomAudioCapture(boolean z) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeEnableCustomAudioCapture(j, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomAudioRendering(boolean z) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeEnableCustomAudioRendering(j, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomVideoCapture(int i, boolean z) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeEnableCustomVideoCapture(j, i, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public int enableEncSmallVideoStream(boolean z, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeEnableEncSmallVideoStream(j, z, new VideoEncParams(tRTCVideoEncParam));
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public void enableMixExternalAudioFrame(boolean z, boolean z2) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeEnableMixExternalAudioFrame(j, z, z2);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, int i) {
        if (tRTCParams == null) {
            LiteavLog.m16898e(TAG, "enterRoom param is null");
            runOnListenerThread(C17186a.m17023a(this));
            return;
        }
        this.mJniReadLock.lock();
        try {
            this.mLocalUserId = tRTCParams.userId;
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeEnterRoom(j, new EnterRoomParams(tRTCParams), i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void exitRoom() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeExitRoom(j);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getAudioCaptureVolume() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            return j != 0 ? nativeGetAudioCaptureVolume(j) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getAudioPlayoutVolume() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            return j != 0 ? nativeGetAudioPlayoutVolume(j) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void getCustomAudioRenderingFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeGetCustomAudioRenderingFrame(j, tRTCAudioFrame.data, tRTCAudioFrame.sampleRate, tRTCAudioFrame.channel);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long getTrtcCloudJni() {
        this.mJniReadLock.lock();
        try {
            return this.mNativeTrtcCloudJni;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int mixExternalAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                return nativeMixExternalAudioFrame(j, new AudioFrame(tRTCAudioFrame));
            }
            this.mJniReadLock.unlock();
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteAllRemoteAudio(boolean z) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeMuteAllRemoteAudio(j, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteAllRemoteVideoStreams(boolean z) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeMuteAllRemoteVideoStreams(j, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteLocalAudio(boolean z) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeMuteLocalAudio(j, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteLocalVideo(int i, boolean z) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeMuteLocalVideo(j, i, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteRemoteAudio(String str, boolean z) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeMuteRemoteAudio(j, str, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteRemoteVideoStream(String str, int i, boolean z) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeMuteRemoteVideoStream(j, str, i, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void onAudioCaptureProcessedData(byte[] bArr, long j, int i, int i2) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener != null) {
            TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
            tRTCAudioFrame.data = bArr;
            tRTCAudioFrame.timestamp = j;
            tRTCAudioFrame.sampleRate = i;
            tRTCAudioFrame.channel = i2;
            tRTCAudioFrameListener.onCapturedRawAudioFrame(tRTCAudioFrame);
        }
    }

    public void onAudioMixedAllData(byte[] bArr, int i, int i2) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener != null) {
            TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
            tRTCAudioFrame.data = bArr;
            tRTCAudioFrame.timestamp = 0;
            tRTCAudioFrame.sampleRate = i;
            tRTCAudioFrame.channel = i2;
            tRTCAudioFrameListener.onMixedAllAudioFrame(tRTCAudioFrame);
        }
    }

    public void onAudioPlayoutData(byte[] bArr, long j, int i, int i2) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener != null) {
            TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
            tRTCAudioFrame.data = bArr;
            tRTCAudioFrame.timestamp = j;
            tRTCAudioFrame.sampleRate = i;
            tRTCAudioFrame.channel = i2;
            tRTCAudioFrameListener.onMixedPlayAudioFrame(tRTCAudioFrame);
        }
    }

    public void onAudioRemoteStreamData(String str, byte[] bArr, long j, int i, int i2, byte[] bArr2) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener != null) {
            TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
            tRTCAudioFrame.data = bArr;
            tRTCAudioFrame.timestamp = j;
            tRTCAudioFrame.sampleRate = i;
            tRTCAudioFrame.channel = i2;
            tRTCAudioFrame.extraData = bArr2;
            tRTCAudioFrameListener.onRemoteUserAudioFrame(tRTCAudioFrame, str);
        }
    }

    public void onAudioRouteChanged(int i, int i2) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onAudioRouteChanged(i, i2);
        }
    }

    public void onCameraDidReady() {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onCameraDidReady();
        }
    }

    public void onConnectOtherRoom(String str, int i, String str2) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onConnectOtherRoom(str, i, str2);
        }
    }

    public void onConnectionLost() {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onConnectionLost();
        }
    }

    public void onConnectionRecovery() {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onConnectionRecovery();
        }
    }

    public void onDisConnectOtherRoom(int i, String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onDisConnectOtherRoom(i, str);
        }
    }

    public void onEnterRoom(int i) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onEnterRoom((long) i);
        }
    }

    public void onError(int i, String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onError(i, str, (Bundle) null);
        }
    }

    public void onExitRoom(int i) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onExitRoom(i);
        }
        synchronized (this.mLocalVideoRenderListenerWrapper) {
            this.mLocalVideoRenderListenerWrapper.f46438d = null;
        }
        synchronized (this.mRemoteVideoRenderListenerMap) {
            this.mRemoteVideoRenderListenerMap.clear();
        }
    }

    public void onFirstAudioFrame(String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onFirstAudioFrame(str);
        }
    }

    public void onFirstVideoFrame(String str, int i, int i2, int i3) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onFirstVideoFrame(str, i, i2, i3);
        }
    }

    public void onGLContextCreated() {
        synchronized (this.mVideoFrameListenerWrapper) {
            this.mCalledGLCreatedFrameListener = (TRTCCloudListener.TRTCVideoFrameListener) this.mVideoFrameListenerWrapper.f46438d;
        }
        LiteavLog.m16901i(TAG, "onGLContextCreated " + this.mCalledGLCreatedFrameListener);
        TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener != null) {
            tRTCVideoFrameListener.onGLContextCreated();
        }
    }

    public void onGLContextDestroy() {
        LiteavLog.m16901i(TAG, "onGLContextDestroy " + this.mCalledGLCreatedFrameListener);
        TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener != null) {
            tRTCVideoFrameListener.onGLContextDestory();
            this.mCalledGLCreatedFrameListener = null;
        }
    }

    public byte[] onLocalAudioStreamData(byte[] bArr, long j, int i, int i2) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return null;
        }
        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j;
        tRTCAudioFrame.sampleRate = i;
        tRTCAudioFrame.channel = i2;
        tRTCAudioFrameListener.onLocalProcessedAudioFrame(tRTCAudioFrame);
        byte[] bArr2 = tRTCAudioFrame.extraData;
        if (bArr2 == null) {
            return null;
        }
        if (bArr2.length <= 100) {
            return bArr2;
        }
        LiteavLog.m16905w(TAG, "Audioframe.extraData length need to be under 100!");
        return null;
    }

    public void onLocalRecordBegin(int i, String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onLocalRecordBegin(i, str);
        }
    }

    public void onLocalRecordComplete(int i, String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onLocalRecordComplete(i, str);
        }
    }

    public void onLocalRecording(long j, String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onLocalRecording(j, str);
        }
    }

    public void onMicDidReady() {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onMicDidReady();
        }
    }

    public void onMissCustomCmdMsg(String str, int i, int i2, int i3) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onMissCustomCmdMsg(str, i, i2, i3);
        }
    }

    public void onNetworkQuality(int i, String[] strArr, int[] iArr) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            TRTCCloudDef.TRTCQuality tRTCQuality = new TRTCCloudDef.TRTCQuality();
            tRTCQuality.userId = "";
            tRTCQuality.quality = i;
            ArrayList arrayList = new ArrayList();
            if (!(strArr == null || strArr.length == 0 || iArr == null || iArr.length == 0 || iArr.length != strArr.length)) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    TRTCCloudDef.TRTCQuality tRTCQuality2 = new TRTCCloudDef.TRTCQuality();
                    tRTCQuality2.userId = strArr[i2];
                    tRTCQuality2.quality = iArr[i2];
                    arrayList.add(tRTCQuality2);
                }
            }
            tRTCCloudListener.onNetworkQuality(tRTCQuality, arrayList);
        }
    }

    public void onPreprocessVideoFrame(int i, PixelFrame pixelFrame, PixelFrame pixelFrame2) {
        TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener != null && tRTCVideoFrameListener != null) {
            TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = new TRTCCloudDef.TRTCVideoFrame();
            TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame2 = new TRTCCloudDef.TRTCVideoFrame();
            shadowCopy(pixelFrame, tRTCVideoFrame);
            shadowCopy(pixelFrame2, tRTCVideoFrame2);
            tRTCVideoFrameListener.onProcessVideoFrame(tRTCVideoFrame, tRTCVideoFrame2);
            shadowCopy(tRTCVideoFrame, pixelFrame);
            shadowCopy(tRTCVideoFrame2, pixelFrame2);
        }
    }

    public void onRecvCustomCmdMsg(String str, int i, int i2, byte[] bArr) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onRecvCustomCmdMsg(str, i, i2, bArr);
        }
    }

    public void onRemoteVideoStatusUpdated(String str, int i, int i2) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onRemoteVideoStatusUpdated(str, i, i2, 0, (Bundle) null);
        }
    }

    public void onRenderVideoFrame(String str, int i, PixelFrame pixelFrame) {
        TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener;
        if (TextUtils.isEmpty(str)) {
            str = this.mLocalUserId;
            tRTCVideoRenderListener = (TRTCCloudListener.TRTCVideoRenderListener) this.mLocalVideoRenderListenerWrapper.f46438d;
        } else {
            C17185a aVar = this.mRemoteVideoRenderListenerMap.get(str);
            tRTCVideoRenderListener = aVar == null ? null : (TRTCCloudListener.TRTCVideoRenderListener) aVar.f46438d;
        }
        if (tRTCVideoRenderListener != null) {
            TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = new TRTCCloudDef.TRTCVideoFrame();
            shadowCopy(pixelFrame, tRTCVideoFrame);
            tRTCVideoRenderListener.onRenderVideoFrame(str, i, tRTCVideoFrame);
        }
    }

    public void onSEIMessageReceived(byte[] bArr, String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onRecvSEIMsg(str, bArr);
        }
    }

    public void onScreenCapturePaused() {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onScreenCapturePaused();
        }
    }

    public void onScreenCaptureResumed() {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onScreenCaptureResumed();
        }
    }

    public void onScreenCaptureStarted() {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onScreenCaptureStarted();
        }
    }

    public void onScreenCaptureStopped(int i) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onScreenCaptureStopped(i);
        }
    }

    public void onSendFirstLocalAudioFrame() {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onSendFirstLocalAudioFrame();
        }
    }

    public void onSendFirstLocalVideoFrame(int i) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onSendFirstLocalVideoFrame(i);
        }
    }

    public void onSetMixTranscodingConfig(int i, String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onSetMixTranscodingConfig(i, str);
        }
    }

    public void onSnapshotComplete(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        runOnListenerThread(C17187b.m17024a(tRTCSnapshotListener, bitmap));
    }

    public void onSpeedTest(SpeedTestResult speedTestResult, int i, int i2) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onSpeedTest(speedTestResult.f46433a, i, i2);
        }
    }

    public void onSpeedTestResult(SpeedTestResult speedTestResult) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onSpeedTestResult(speedTestResult.f46433a);
        }
    }

    public void onStartPublishCDNStream(int i, String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onStartPublishCDNStream(i, str);
        }
    }

    public void onStartPublishing(int i, String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onStartPublishing(i, str);
        }
    }

    public void onStatistics(Statistics statistics) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onStatistics(statistics.f46444a);
        }
    }

    public void onStopPublishCDNStream(int i, String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onStopPublishCDNStream(i, str);
        }
    }

    public void onStopPublishing(int i, String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onStopPublishing(i, str);
        }
    }

    public void onSwitchRole(int i, String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onSwitchRole(i, str);
        }
    }

    public void onSwitchRoom(int i, String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onSwitchRoom(i, str);
        }
    }

    public void onTryToReconnect() {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onTryToReconnect();
        }
    }

    public void onUserAudioAvailable(String str, boolean z) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onUserAudioAvailable(str, z);
        }
    }

    public void onUserEnter(String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onUserEnter(str);
        }
    }

    public void onUserExit(String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onUserExit(str, 0);
        }
    }

    public void onUserOffline(String str, int i) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onRemoteUserLeaveRoom(str, i);
        }
    }

    public void onUserOnline(String str) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onRemoteUserEnterRoom(str);
        }
    }

    public void onUserSubStreamAvailable(String str, boolean z) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onUserSubStreamAvailable(str, z);
        }
    }

    public void onUserVideoAvailable(String str, boolean z) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onUserVideoAvailable(str, z);
        }
    }

    public void onUserVideoSizeChanged(String str, int i, int i2, int i3) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onUserVideoSizeChanged(str, i, i2, i3);
        }
    }

    public void onUserVoiceVolume(String[] strArr, int[] iArr, int i) {
        String str;
        if (strArr != null && iArr != null) {
            if (strArr.length == iArr.length) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo = new TRTCCloudDef.TRTCVolumeInfo();
                    if (!strArr[i2].isEmpty() || (str = this.mLocalUserId) == null || str.isEmpty()) {
                        tRTCVolumeInfo.userId = strArr[i2];
                    } else {
                        tRTCVolumeInfo.userId = this.mLocalUserId;
                    }
                    tRTCVolumeInfo.volume = iArr[i2];
                    arrayList.add(tRTCVolumeInfo);
                }
                TRTCCloudListener tRTCCloudListener = this.mListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onUserVoiceVolume(arrayList, i);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid parameter, userIds and volumes do not match.");
        }
    }

    public void onWarning(int i, String str, Bundle bundle) {
        TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null) {
            tRTCCloudListener.onWarning(i, str, bundle);
        }
    }

    public void pauseScreenCapture(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativePauseScreenCapture(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void resumeScreenCapture(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeResumeScreenCapture(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSendCustomAudioData(j, new AudioFrame(tRTCAudioFrame));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public boolean sendCustomCmdMsg(int i, byte[] bArr, boolean z, boolean z2) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                return nativeSendCustomCmdMsg(j, i, bArr, z, z2);
            }
            this.mJniReadLock.unlock();
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void sendCustomVideoData(int i, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                PixelFrame pixelFrame = new PixelFrame();
                shadowCopy(tRTCVideoFrame, pixelFrame);
                nativeSendCustomVideoData(this.mNativeTrtcCloudJni, i, pixelFrame);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public boolean sendSEIMsg(byte[] bArr, int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                return nativeSendSEIMsg(j, bArr, i);
            }
            this.mJniReadLock.unlock();
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioCaptureVolume(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetAudioCaptureVolume(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                this.mAudioFrameListener = tRTCAudioFrameListener;
                nativeEnableAudioFrameNotification(j, tRTCAudioFrameListener != null);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioPlayoutVolume(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetAudioPlayoutVolume(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioQuality(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetAudioQuality(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setCapturedRawAudioFrameCallbackFormat(int i, int i2, int i3) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            return j != 0 ? nativeSetCapturedRawAudioFrameCallbackFormat(j, i, i2, i3) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setDefaultStreamRecvMode(boolean z, boolean z2) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetDefaultStreamRecvMode(j, z, z2);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setGSensorMode(int i, int i2) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetGSensorMode(j, i, i2);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setListener(TRTCCloudListener tRTCCloudListener) {
        this.mListener = tRTCCloudListener;
    }

    public void setListenerHandler(Handler handler) {
        this.mJniReadLock.lock();
        if (handler == null) {
            this.mListenerHandler = new Handler(Looper.getMainLooper());
        } else {
            this.mListenerHandler = handler;
        }
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetListenerHandler(j, handler);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setLocalProcessedAudioFrameCallbackFormat(int i, int i2, int i3) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            return j != 0 ? nativeSetLocalProcessedAudioFrameCallbackFormat(j, i, i2, i3) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setLocalVideoProcessListener(int i, int i2, int i3, TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                GLConstants.PixelFormatType convertTRTCFormatTypeToPixelFormatType = convertTRTCFormatTypeToPixelFormatType(i2);
                GLConstants.PixelBufferType convertTRTCBufferTypeToPixelBufferType = convertTRTCBufferTypeToPixelBufferType(i3);
                if (!isCustomPreprocessSupportedFormatType(convertTRTCFormatTypeToPixelFormatType)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
                } else if (!isCustomPreprocessSupportedBufferType(convertTRTCBufferTypeToPixelBufferType)) {
                    this.mJniReadLock.unlock();
                    return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
                } else {
                    synchronized (this.mVideoFrameListenerWrapper) {
                        C17185a<TRTCCloudListener.TRTCVideoFrameListener> aVar = this.mVideoFrameListenerWrapper;
                        if (aVar.f46438d != null) {
                            nativeEnableVideoCustomPreprocess(this.mNativeTrtcCloudJni, false, aVar.f46435a, aVar.f46436b.getValue(), this.mVideoFrameListenerWrapper.f46437c.mValue);
                        }
                        C17185a<TRTCCloudListener.TRTCVideoFrameListener> aVar2 = this.mVideoFrameListenerWrapper;
                        aVar2.f46438d = tRTCVideoFrameListener;
                        aVar2.f46435a = i;
                        aVar2.f46436b = convertTRTCFormatTypeToPixelFormatType;
                        aVar2.f46437c = convertTRTCBufferTypeToPixelBufferType;
                        if (tRTCVideoFrameListener != null) {
                            nativeEnableVideoCustomPreprocess(this.mNativeTrtcCloudJni, true, i, convertTRTCFormatTypeToPixelFormatType.getValue(), this.mVideoFrameListenerWrapper.f46437c.mValue);
                        }
                    }
                }
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0053 A[Catch:{ all -> 0x00c8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int setLocalVideoRenderListener(int r22, int r23, com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener r24) {
        /*
            r21 = this;
            r1 = r21
            r0 = r24
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mJniReadLock
            r2.lock()
            long r2 = r1.mNativeTrtcCloudJni     // Catch:{ all -> 0x00c8 }
            r4 = 0
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0018
        L_0x0012:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mJniReadLock
            r0.unlock()
            return r6
        L_0x0018:
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r2 = convertTRTCFormatTypeToPixelFormatType(r22)     // Catch:{ all -> 0x00c8 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r3 = convertTRTCBufferTypeToPixelBufferType(r23)     // Catch:{ all -> 0x00c8 }
            boolean r4 = isCustomRenderSupportedFormatType(r2)     // Catch:{ all -> 0x00c8 }
            if (r4 != 0) goto L_0x002e
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mJniReadLock
            r0.unlock()
            r0 = -1327(0xfffffffffffffad1, float:NaN)
            return r0
        L_0x002e:
            boolean r4 = isCustomRenderSupportedBufferType(r3)     // Catch:{ all -> 0x00c8 }
            if (r4 != 0) goto L_0x003c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mJniReadLock
            r0.unlock()
            r0 = -1328(0xfffffffffffffad0, float:NaN)
            return r0
        L_0x003c:
            com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener> r4 = r1.mLocalVideoRenderListenerWrapper     // Catch:{ all -> 0x00c8 }
            monitor-enter(r4)     // Catch:{ all -> 0x00c8 }
            com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener> r5 = r1.mLocalVideoRenderListenerWrapper     // Catch:{ all -> 0x00c5 }
            T r7 = r5.f46438d     // Catch:{ all -> 0x00c5 }
            if (r7 == 0) goto L_0x008a
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r7 = r5.f46436b     // Catch:{ all -> 0x00c5 }
            if (r7 != r2) goto L_0x0050
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r8 = r5.f46437c     // Catch:{ all -> 0x00c5 }
            if (r8 == r3) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r8 = 0
            goto L_0x0051
        L_0x0050:
            r8 = 1
        L_0x0051:
            if (r8 != 0) goto L_0x005a
            if (r0 != 0) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            r5.f46438d = r0     // Catch:{ all -> 0x00c5 }
            monitor-exit(r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x0012
        L_0x005a:
            long r8 = r1.mNativeTrtcCloudJni     // Catch:{ all -> 0x00c5 }
            r5 = 0
            java.lang.String r10 = ""
            r11 = 0
            int r12 = r7.getValue()     // Catch:{ all -> 0x00c5 }
            com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener> r7 = r1.mLocalVideoRenderListenerWrapper     // Catch:{ all -> 0x00c5 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r7 = r7.f46437c     // Catch:{ all -> 0x00c5 }
            int r13 = r7.mValue     // Catch:{ all -> 0x00c5 }
            r7 = r8
            r9 = r5
            nativeEnableVideoCustomRender(r7, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00c5 }
            long r14 = r1.mNativeTrtcCloudJni     // Catch:{ all -> 0x00c5 }
            r16 = 0
            java.lang.String r17 = ""
            r18 = 2
            com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener> r5 = r1.mLocalVideoRenderListenerWrapper     // Catch:{ all -> 0x00c5 }
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r5 = r5.f46436b     // Catch:{ all -> 0x00c5 }
            int r19 = r5.getValue()     // Catch:{ all -> 0x00c5 }
            com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener> r5 = r1.mLocalVideoRenderListenerWrapper     // Catch:{ all -> 0x00c5 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r5 = r5.f46437c     // Catch:{ all -> 0x00c5 }
            int r5 = r5.mValue     // Catch:{ all -> 0x00c5 }
            r20 = r5
            nativeEnableVideoCustomRender(r14, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00c5 }
        L_0x008a:
            com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener> r5 = r1.mLocalVideoRenderListenerWrapper     // Catch:{ all -> 0x00c5 }
            r5.f46438d = r0     // Catch:{ all -> 0x00c5 }
            r5.f46436b = r2     // Catch:{ all -> 0x00c5 }
            r5.f46437c = r3     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00c2
            long r7 = r1.mNativeTrtcCloudJni     // Catch:{ all -> 0x00c5 }
            r9 = 1
            java.lang.String r10 = ""
            r11 = 0
            int r12 = r2.getValue()     // Catch:{ all -> 0x00c5 }
            com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener> r0 = r1.mLocalVideoRenderListenerWrapper     // Catch:{ all -> 0x00c5 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r0 = r0.f46437c     // Catch:{ all -> 0x00c5 }
            int r13 = r0.mValue     // Catch:{ all -> 0x00c5 }
            nativeEnableVideoCustomRender(r7, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00c5 }
            long r14 = r1.mNativeTrtcCloudJni     // Catch:{ all -> 0x00c5 }
            r16 = 1
            java.lang.String r17 = ""
            r18 = 2
            com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener> r0 = r1.mLocalVideoRenderListenerWrapper     // Catch:{ all -> 0x00c5 }
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r0 = r0.f46436b     // Catch:{ all -> 0x00c5 }
            int r19 = r0.getValue()     // Catch:{ all -> 0x00c5 }
            com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener> r0 = r1.mLocalVideoRenderListenerWrapper     // Catch:{ all -> 0x00c5 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r0 = r0.f46437c     // Catch:{ all -> 0x00c5 }
            int r0 = r0.mValue     // Catch:{ all -> 0x00c5 }
            r20 = r0
            nativeEnableVideoCustomRender(r14, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00c5 }
        L_0x00c2:
            monitor-exit(r4)     // Catch:{ all -> 0x00c5 }
            goto L_0x0012
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00c5 }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mJniReadLock
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.trtc.TrtcCloudJni.setLocalVideoRenderListener(int, int, com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener):int");
    }

    public void setLocalViewFillMode(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetLocalViewFillMode(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setLocalViewMirror(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetLocalViewMirror(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setLocalViewRotation(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetLocalViewRotation(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setMixExternalAudioVolume(int i, int i2) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetMixExternalAudioVolume(j, i, i2);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetMixTranscodingConfig(j, tRTCTranscodingConfig == null ? null : new TranscodingConfig(tRTCTranscodingConfig));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setMixedPlayAudioFrameCallbackFormat(int i, int i2, int i3) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            return j != 0 ? nativeSetMixedPlayAudioFrameCallbackFormat(j, i, i2, i3) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetNetworkQosParam(j, tRTCNetworkQosParam.preference, tRTCNetworkQosParam.controlMode);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setPriorRemoteVideoStreamType(int i) {
        long j = this.mNativeTrtcCloudJni;
        if (j == 0) {
            return 0;
        }
        nativeSetPriorRemoteVideoStreamType(j, i);
        return 0;
    }

    public void setRemoteAudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetRemoteAudioParallelParams(j, new AudioParallelParams(tRTCAudioParallelParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteAudioVolume(String str, int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetRemoteAudioVolume(j, str, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067 A[Catch:{ all -> 0x00e5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int setRemoteVideoRenderListener(java.lang.String r25, int r26, int r27, com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener r28) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            r2 = r28
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.mJniReadLock
            r3.lock()
            long r3 = r1.mNativeTrtcCloudJni     // Catch:{ all -> 0x00e5 }
            r5 = 0
            r9 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x001a
        L_0x0014:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mJniReadLock
            r0.unlock()
            return r9
        L_0x001a:
            boolean r3 = android.text.TextUtils.isEmpty(r25)     // Catch:{ all -> 0x00e5 }
            if (r3 == 0) goto L_0x0028
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mJniReadLock
            r0.unlock()
            r0 = -3319(0xfffffffffffff309, float:NaN)
            return r0
        L_0x0028:
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r3 = convertTRTCFormatTypeToPixelFormatType(r26)     // Catch:{ all -> 0x00e5 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r4 = convertTRTCBufferTypeToPixelBufferType(r27)     // Catch:{ all -> 0x00e5 }
            boolean r5 = isCustomRenderSupportedFormatType(r3)     // Catch:{ all -> 0x00e5 }
            if (r5 != 0) goto L_0x003e
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mJniReadLock
            r0.unlock()
            r0 = -1327(0xfffffffffffffad1, float:NaN)
            return r0
        L_0x003e:
            boolean r5 = isCustomRenderSupportedBufferType(r4)     // Catch:{ all -> 0x00e5 }
            if (r5 != 0) goto L_0x004c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r1.mJniReadLock
            r0.unlock()
            r0 = -1328(0xfffffffffffffad0, float:NaN)
            return r0
        L_0x004c:
            java.util.Map<java.lang.String, com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener>> r10 = r1.mRemoteVideoRenderListenerMap     // Catch:{ all -> 0x00e5 }
            monitor-enter(r10)     // Catch:{ all -> 0x00e5 }
            java.util.Map<java.lang.String, com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener>> r5 = r1.mRemoteVideoRenderListenerMap     // Catch:{ all -> 0x00e2 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x00e2 }
            com.tencent.liteav.trtc.TrtcCloudJni$a r5 = (com.tencent.liteav.trtc.TrtcCloudJni.C17185a) r5     // Catch:{ all -> 0x00e2 }
            if (r5 == 0) goto L_0x009e
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r6 = r5.f46436b     // Catch:{ all -> 0x00e2 }
            if (r6 != r3) goto L_0x0064
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r7 = r5.f46437c     // Catch:{ all -> 0x00e2 }
            if (r7 == r4) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r7 = 0
            goto L_0x0065
        L_0x0064:
            r7 = 1
        L_0x0065:
            if (r7 != 0) goto L_0x0072
            if (r2 != 0) goto L_0x006a
            goto L_0x0072
        L_0x006a:
            r5.f46438d = r2     // Catch:{ all -> 0x00e2 }
            java.util.Map<java.lang.String, com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener>> r6 = r1.mRemoteVideoRenderListenerMap     // Catch:{ all -> 0x00e2 }
            r6.put(r0, r5)     // Catch:{ all -> 0x00e2 }
            goto L_0x009e
        L_0x0072:
            long r11 = r1.mNativeTrtcCloudJni     // Catch:{ all -> 0x00e2 }
            r13 = 0
            java.lang.String r14 = ""
            r15 = 0
            int r16 = r6.getValue()     // Catch:{ all -> 0x00e2 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r6 = r5.f46437c     // Catch:{ all -> 0x00e2 }
            int r6 = r6.mValue     // Catch:{ all -> 0x00e2 }
            r17 = r6
            nativeEnableVideoCustomRender(r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00e2 }
            long r6 = r1.mNativeTrtcCloudJni     // Catch:{ all -> 0x00e2 }
            r19 = 0
            java.lang.String r20 = ""
            r21 = 2
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r8 = r5.f46436b     // Catch:{ all -> 0x00e2 }
            int r22 = r8.getValue()     // Catch:{ all -> 0x00e2 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r5 = r5.f46437c     // Catch:{ all -> 0x00e2 }
            int r5 = r5.mValue     // Catch:{ all -> 0x00e2 }
            r17 = r6
            r23 = r5
            nativeEnableVideoCustomRender(r17, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x00e2 }
        L_0x009e:
            if (r2 == 0) goto L_0x00da
            com.tencent.liteav.trtc.TrtcCloudJni$a r11 = new com.tencent.liteav.trtc.TrtcCloudJni$a     // Catch:{ all -> 0x00e2 }
            r11.<init>(r9)     // Catch:{ all -> 0x00e2 }
            r11.f46438d = r2     // Catch:{ all -> 0x00e2 }
            r11.f46436b = r3     // Catch:{ all -> 0x00e2 }
            r11.f46437c = r4     // Catch:{ all -> 0x00e2 }
            long r4 = r1.mNativeTrtcCloudJni     // Catch:{ all -> 0x00e2 }
            r6 = 1
            r7 = 0
            int r8 = r3.getValue()     // Catch:{ all -> 0x00e2 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r2 = r11.f46437c     // Catch:{ all -> 0x00e2 }
            int r12 = r2.mValue     // Catch:{ all -> 0x00e2 }
            r2 = r4
            r4 = r6
            r5 = r25
            r6 = r7
            r7 = r8
            r8 = r12
            nativeEnableVideoCustomRender(r2, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00e2 }
            long r2 = r1.mNativeTrtcCloudJni     // Catch:{ all -> 0x00e2 }
            r4 = 1
            r6 = 2
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r5 = r11.f46436b     // Catch:{ all -> 0x00e2 }
            int r7 = r5.getValue()     // Catch:{ all -> 0x00e2 }
            com.tencent.liteav.videobase.base.GLConstants$PixelBufferType r5 = r11.f46437c     // Catch:{ all -> 0x00e2 }
            int r8 = r5.mValue     // Catch:{ all -> 0x00e2 }
            r5 = r25
            nativeEnableVideoCustomRender(r2, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00e2 }
            java.util.Map<java.lang.String, com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener>> r2 = r1.mRemoteVideoRenderListenerMap     // Catch:{ all -> 0x00e2 }
            r2.put(r0, r11)     // Catch:{ all -> 0x00e2 }
            goto L_0x00df
        L_0x00da:
            java.util.Map<java.lang.String, com.tencent.liteav.trtc.TrtcCloudJni$a<com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener>> r2 = r1.mRemoteVideoRenderListenerMap     // Catch:{ all -> 0x00e2 }
            r2.remove(r0)     // Catch:{ all -> 0x00e2 }
        L_0x00df:
            monitor-exit(r10)     // Catch:{ all -> 0x00e2 }
            goto L_0x0014
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00e2 }
            throw r0     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.mJniReadLock
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.trtc.TrtcCloudJni.setRemoteVideoRenderListener(java.lang.String, int, int, com.tencent.trtc.TRTCCloudListener$TRTCVideoRenderListener):int");
    }

    /* JADX INFO: finally extract failed */
    public int setRemoteVideoStreamType(String str, int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetRemoteVideoStreamType(j, str, i);
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public void setRemoteViewFillMode(String str, int i, int i2) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetRemoteViewFillMode(j, str, i, i2);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteViewMirror(String str, int i, int i2) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetRemoteViewMirror(j, str, i, i2);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteViewRotation(String str, int i, int i2) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                if (i2 == 1) {
                    i2 = 3;
                } else if (i2 == 3) {
                    i2 = 1;
                }
                nativeSetRemoteViewRotation(j, str, i, i2);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderMirror(boolean z) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetVideoEncoderMirror(j, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderParams(int i, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetVideoEncoderParams(j, i, new VideoEncParams(tRTCVideoEncParam));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderRotation(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetVideoEncoderRotation(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoMuteImage(int i, Bitmap bitmap, int i2) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetVideoMuteImage(j, i, bitmap, i2);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setWatermark(Bitmap bitmap, int i, float f, float f2, float f3) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSetWatermark(j, bitmap, i, f, f2, f3);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void showDashboardManager(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeShowDashboardManager(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void snapshotVideo(String str, int i, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSnapshotVideo(j, str, i, tRTCSnapshotListener);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j == 0) {
                this.mJniReadLock.unlock();
                return 0;
            }
            int nativeStartAudioRecording = nativeStartAudioRecording(j, new AudioRecordingParams(tRTCAudioRecordingParams));
            this.mJniReadLock.unlock();
            return nativeStartAudioRecording;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public void startLocalAudio(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStartLocalAudioWithQuality(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalPreview(boolean z, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStartLocalPreview(j, z, new DisplayTarget(tXCloudVideoView));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalRecording(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStartLocalRecording(j, new LocalRecordingParams(tRTCLocalRecordingParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStartPublishCDNStream(j, new PublishCDNParams(tRTCPublishCDNParam));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishing(String str, int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStartPublishing(j, str, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startRemoteView(String str, int i, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStartRemoteView(j, str, i, new DisplayTarget(tXCloudVideoView));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startScreenCapture(int i, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, final TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                ScreenShareParams screenShareParams = tRTCScreenShareParams != null ? new ScreenShareParams(tRTCScreenShareParams) : null;
                if (tRTCVideoEncParam == null) {
                    nativeStartScreenCapture(this.mNativeTrtcCloudJni, i, (VideoEncParams) null, screenShareParams);
                    LiteavLog.m16905w(TAG, "startScreenCapture encParams is null");
                } else {
                    nativeStartScreenCapture(this.mNativeTrtcCloudJni, i, new VideoEncParams(tRTCVideoEncParam), screenShareParams);
                }
            }
            if (tRTCScreenShareParams != null) {
                ThreadUtils.runOnUiThread((Runnable) new Runnable() {
                    public final void run() {
                        TrtcCloudJni.this.showFloatingWindow(tRTCScreenShareParams.floatingView);
                    }
                });
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startSpeedTest(boolean z, TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStartSpeedTest(j, z, new SpeedTestParams(tRTCSpeedTestParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startSystemAudioLoopback() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStartSystemAudioLoopback(j);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopAllRemoteView() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStopAllRemoteView(j);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopAudioRecording() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStopAudioRecording(j);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalAudio() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStopLocalAudio(j);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalPreview() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStopLocalPreview(j);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalRecording() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStopLocalRecording(j);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishCDNStream() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStopPublishCDNStream(j);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishing() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStopPublishing(j);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopRemoteView(String str, int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStopRemoteView(j, str, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public void stopScreenCapture(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStopScreenCapture(j, i);
            }
            this.mJniReadLock.unlock();
            ThreadUtils.runOnUiThread((Runnable) new Runnable() {
                public final void run() {
                    TrtcCloudJni.this.hideFloatingWindow();
                }
            });
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public void stopSpeedTest() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStopSpeedTest(j);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopSystemAudioLoopback() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStopSystemAudioLoopback(j);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRole(int i) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSwitchRole(j, i);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRoom(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSwitchRoom(j, new SwitchRoomConfig(tRTCSwitchRoomConfig));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateLocalView(TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeUpdateLocalView(j, new DisplayTarget(tXCloudVideoView));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateRemoteView(String str, int i, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeUpdateRemoteView(j, str, i, new DisplayTarget(tXCloudVideoView));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public TrtcCloudJni(long j) {
        this.mNativeTrtcCloudJni = 0;
        this.mLocalUserId = "";
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mFloatingWindow = null;
        if (j == 0) {
            this.mNativeTrtcCloudJni = nativeCreatePipeline(this);
        } else {
            this.mNativeTrtcCloudJni = nativeCreateSubCloud(this, j);
        }
        this.mVideoFrameListenerWrapper = new C17185a<>((byte) 0);
        this.mLocalVideoRenderListenerWrapper = new C17185a<>((byte) 0);
        this.mRemoteVideoRenderListenerMap = new HashMap();
        this.mListenerHandler = new Handler(Looper.getMainLooper());
    }

    public void startLocalAudio() {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStartLocalAudio(j);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startRemoteView(String str, TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStartRemoteViewWithoutStreamType(j, str, new DisplayTarget(tXCloudVideoView));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopRemoteView(String str) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeStopRemoteViewWithoutStreamType(j, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRole(int i, String str) {
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeTrtcCloudJni;
            if (j != 0) {
                nativeSwitchRoleWithPrivateMapKey(j, i, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    private static void shadowCopy(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame, PixelFrame pixelFrame) {
        Object obj;
        int i;
        TRTCCloudDef.TRTCTexture tRTCTexture = tRTCVideoFrame.texture;
        pixelFrame.setPixelFormatType(convertTRTCFormatTypeToPixelFormatType(tRTCVideoFrame.pixelFormat));
        pixelFrame.setPixelBufferType(convertTRTCBufferTypeToPixelBufferType(tRTCVideoFrame.bufferType));
        if (tRTCTexture != null) {
            i = tRTCTexture.textureId;
            obj = tRTCTexture.eglContext10;
            if (obj == null) {
                obj = tRTCTexture.eglContext14;
            }
        } else {
            i = -1;
            obj = null;
        }
        pixelFrame.setTextureId(i);
        pixelFrame.setGLContext(obj);
        pixelFrame.setData(tRTCVideoFrame.data);
        pixelFrame.setBuffer(tRTCVideoFrame.buffer);
        pixelFrame.setWidth(tRTCVideoFrame.width);
        pixelFrame.setHeight(tRTCVideoFrame.height);
        pixelFrame.setTimestamp(tRTCVideoFrame.timestamp);
        pixelFrame.setRotation(Rotation.m139836a(tRTCVideoFrame.rotation));
    }
}
