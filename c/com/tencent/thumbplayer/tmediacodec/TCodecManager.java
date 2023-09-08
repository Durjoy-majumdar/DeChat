package com.tencent.thumbplayer.tmediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaDescrambler;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.tencent.thumbplayer.tmediacodec.TMediaCodec;
import com.tencent.thumbplayer.tmediacodec.codec.AudioCodecWrapper;
import com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper;
import com.tencent.thumbplayer.tmediacodec.codec.DirectCodecWrapper;
import com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper;
import com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper;
import com.tencent.thumbplayer.tmediacodec.codec.VideoCodecWrapper;
import com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperManager;
import com.tencent.thumbplayer.tmediacodec.preload.PreloadCodecManager;
import com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper;
import com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy;
import com.tencent.thumbplayer.tmediacodec.util.ILogProxy;
import com.tencent.thumbplayer.tmediacodec.util.LogUtils;
import com.tencent.thumbplayer.tmediacodec.util.TUtils;
import java.util.HashMap;
import java.util.LinkedHashSet;

public final class TCodecManager {
    public static final String TAG = "TCodecManager";
    private static final TCodecManager mInstance = new TCodecManager();
    private static boolean mIsDebugVersion = false;
    private static boolean mIsLeakFixed = true;
    private boolean mAllowKeepPool = true;
    private final CodecWrapperManager mAudioCodecManager = new CodecWrapperManager();
    private final HashMap<TMediaCodec, CodecWrapper> mCodecMap = new HashMap<>();
    private boolean mConfigMethodCalled;
    private boolean mGlobalReuseEnable = true;
    private final PreloadCodecManager mPreloadCodecManager = new PreloadCodecManager();
    private ReusePolicy mReusePolicy = ReusePolicy.DEFAULT;
    private final CodecWrapperManager mVideoCodecManager = new CodecWrapperManager();

    private void changeToReuseDisable() {
        this.mVideoCodecManager.clearAndReleaseAll();
        this.mAudioCodecManager.clearAndReleaseAll();
    }

    private CodecWrapper createDirectCodecWrapper(MediaFormat mediaFormat, TMediaCodec tMediaCodec) {
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "createDirectCodecWrapper mediaFormat:" + mediaFormat + " createBy:" + tMediaCodec.getCreateBy() + " nameOrType:" + tMediaCodec.getNameOrType());
        }
        return tMediaCodec.getCreateBy() == TMediaCodec.CreateBy.CreateByName ? new DirectCodecWrapper(MediaCodec.createByCodecName(tMediaCodec.getNameOrType())) : new DirectCodecWrapper(MediaCodec.createDecoderByType(tMediaCodec.getNameOrType()));
    }

    private CodecWrapper createNewReuseCodecWrapper(MediaFormat mediaFormat, TMediaCodec tMediaCodec) {
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "createNewReuseCodecWrapper mediaFormat:" + mediaFormat + " createBy:" + tMediaCodec.getCreateBy() + " nameOrType:" + tMediaCodec.getNameOrType());
        }
        String string = mediaFormat.getString("mime");
        FormatWrapper create = FormatWrapper.create(mediaFormat);
        ReuseHelper.initFormatWrapper(create, mediaFormat);
        return tMediaCodec.getCreateBy() == TMediaCodec.CreateBy.CreateByName ? ReuseCodecWrapper.create(MediaCodec.createByCodecName(tMediaCodec.getNameOrType()), string, create) : ReuseCodecWrapper.create(MediaCodec.createDecoderByType(string), string, create);
    }

    private CodecWrapper getCodec(MediaFormat mediaFormat, TMediaCodec tMediaCodec, Surface surface) {
        boolean isVideo = tMediaCodec.isVideo();
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "getCodec isVideo:" + isVideo + " codecFinalReuseEnable:" + tMediaCodec.codecFinalReuseEnable);
        }
        if (Build.VERSION.SDK_INT < 23 || !tMediaCodec.codecFinalReuseEnable) {
            tMediaCodec.isReUsed = false;
            if (LogUtils.isLogEnable()) {
                LogUtils.m21881d(TAG, "getCodec return DirectCodecWrapper for mediaFormat:" + mediaFormat + " codecFinalReuseEnable:" + false + " surface:" + surface);
            }
            return createDirectCodecWrapper(mediaFormat, tMediaCodec);
        }
        FormatWrapper create = FormatWrapper.create(mediaFormat);
        CodecWrapper obtainCodecWrapper = obtainCodecWrapper(isVideo, create);
        FormatWrapper.dumpCsdArray(create.initializationData);
        if (obtainCodecWrapper != null) {
            ReuseHelper.ReuseType canReuseType = obtainCodecWrapper.canReuseType(create);
            if (canReuseType == ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION || canReuseType == ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION) {
                if (LogUtils.isLogEnable()) {
                    LogUtils.m21881d(TAG, "getCodec reuse, isVideo:" + isVideo + " reuseType:" + canReuseType);
                }
                obtainCodecWrapper.attachThread();
                obtainCodecWrapper.prepareToReUse();
                tMediaCodec.isReUsed = true;
                return obtainCodecWrapper;
            } else if (canReuseType == ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO && LogUtils.isLogEnable()) {
                LogUtils.m21886w(TAG, "getCodec not reuse, isVideo:" + isVideo + " reuseType:" + canReuseType);
            }
        }
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "getCodec not reuse, for can't find reUseAble CodecWrapper. isVideo:" + isVideo);
        }
        tMediaCodec.isReUsed = false;
        CodecWrapper createNewReuseCodecWrapper = createNewReuseCodecWrapper(mediaFormat, tMediaCodec);
        createNewReuseCodecWrapper.attachThread();
        this.mCodecMap.put(tMediaCodec, createNewReuseCodecWrapper);
        return createNewReuseCodecWrapper;
    }

    public static TCodecManager getInstance() {
        return mInstance;
    }

    public static void init() {
    }

    public static boolean isDebug() {
        return mIsDebugVersion;
    }

    public static boolean isLeakFixed() {
        return mIsLeakFixed;
    }

    private CodecWrapper obtainCodecWrapper(boolean z, FormatWrapper formatWrapper) {
        return (z ? this.mVideoCodecManager : this.mAudioCodecManager).obtainCodecWrapper(formatWrapper);
    }

    private void onCodecRunning(CodecWrapper codecWrapper) {
        if (!isGlobalReuseEnable()) {
            return;
        }
        if (codecWrapper instanceof VideoCodecWrapper) {
            this.mVideoCodecManager.transToRunning((ReuseCodecWrapper) codecWrapper);
        } else if (codecWrapper instanceof AudioCodecWrapper) {
            this.mAudioCodecManager.transToRunning((ReuseCodecWrapper) codecWrapper);
        }
    }

    public static void setIsDebug(boolean z) {
        mIsDebugVersion = z;
    }

    public static void setLeakFixed(boolean z) {
        mIsLeakFixed = z;
    }

    public final void clearAndReleaseKeepPool() {
        this.mAllowKeepPool = false;
        this.mVideoCodecManager.clearAndReleaseKeepPool();
        this.mAudioCodecManager.clearAndReleaseKeepPool();
    }

    public final CodecWrapper configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, TMediaCodec tMediaCodec) {
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "configureStart videoPoolInfo:" + this.mVideoCodecManager.getDumpInfo() + ", audioPoolInfo:" + this.mAudioCodecManager.getDumpInfo());
        }
        this.mConfigMethodCalled = true;
        this.mAllowKeepPool = true;
        CodecWrapper codec = getCodec(mediaFormat, tMediaCodec, surface);
        onCodecRunning(codec);
        codec.setCodecCallback(tMediaCodec.getCodecCallback());
        codec.configure(mediaFormat, surface, mediaCrypto, i);
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "configureEnd   videoPoolInfo:" + this.mVideoCodecManager.getDumpInfo() + ", audioPoolInfo:" + this.mAudioCodecManager.getDumpInfo());
        }
        return codec;
    }

    public final ReusePolicy getReusePolicy() {
        return this.mReusePolicy;
    }

    public final boolean isAllowKeepPool() {
        return this.mAllowKeepPool;
    }

    public final boolean isGlobalReuseEnable() {
        return this.mGlobalReuseEnable;
    }

    public final boolean isVideoKeepPoolFull() {
        return this.mVideoCodecManager.isKeepPoolFull();
    }

    public final void preloadCodec(String str, String str2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (PreloadCodecManager.isInvalidMimeType(str)) {
            linkedHashSet.add(str);
        }
        if (PreloadCodecManager.isInvalidMimeType(str2)) {
            linkedHashSet.add(str2);
        }
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "preloadCodec mimeTypeSet:" + linkedHashSet);
        }
        this.mPreloadCodecManager.preload(linkedHashSet);
    }

    public final void recycleCodecFromRunning(CodecWrapper codecWrapper) {
        if (!isGlobalReuseEnable()) {
            return;
        }
        if (codecWrapper instanceof VideoCodecWrapper) {
            this.mVideoCodecManager.transToKeep((ReuseCodecWrapper) codecWrapper);
        } else if (codecWrapper instanceof AudioCodecWrapper) {
            this.mAudioCodecManager.transToKeep((ReuseCodecWrapper) codecWrapper);
        }
    }

    public final void removeCodecFromRunningPool(CodecWrapper codecWrapper) {
        if (!isGlobalReuseEnable()) {
            return;
        }
        if (codecWrapper instanceof VideoCodecWrapper) {
            this.mVideoCodecManager.removeFromRunning((ReuseCodecWrapper) codecWrapper);
        } else if (codecWrapper instanceof AudioCodecWrapper) {
            this.mAudioCodecManager.removeFromRunning((ReuseCodecWrapper) codecWrapper);
        }
    }

    public boolean reuseEnable(TMediaCodec tMediaCodec, Surface surface) {
        boolean isGlobalReuseEnable = isGlobalReuseEnable();
        boolean isReuseEnable = tMediaCodec.isReuseEnable();
        boolean isVideo = tMediaCodec.isVideo();
        boolean z = isGlobalReuseEnable && isReuseEnable;
        boolean z2 = Build.VERSION.SDK_INT >= 23 && !TUtils.codecNeedsSetOutputSurfaceWorkaround();
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "reuseEnable getCodec isVideo:" + isVideo + " reuseEnable:" + z + ' ' + "globalReuseEnable:" + isGlobalReuseEnable + " mediaCodecReuseEnable:" + isReuseEnable + " canUseSetOutputSurfaceAPI:" + z2 + " ,surface:" + surface);
        }
        return z && isVideo && z2 && surface != null;
    }

    public final void setGlobalReuseEnable(boolean z) {
        if (this.mGlobalReuseEnable != z) {
            this.mGlobalReuseEnable = z;
            if (this.mConfigMethodCalled && !z) {
                changeToReuseDisable();
            }
        }
    }

    public final void setLogEnable(boolean z) {
        LogUtils.setLogEnable(z);
    }

    public final void setLogLevel(int i) {
        LogUtils.setLogLevel(i);
    }

    public final void setLogProxy(ILogProxy iLogProxy) {
        LogUtils.setLogProxy(iLogProxy);
    }

    public final void setReusePolicy(ReusePolicy reusePolicy) {
        this.mReusePolicy = reusePolicy;
    }

    public final CodecWrapper configure(MediaFormat mediaFormat, Surface surface, int i, MediaDescrambler mediaDescrambler, TMediaCodec tMediaCodec) {
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "configureStart videoPoolInfo:" + this.mVideoCodecManager.getDumpInfo() + ", audioPoolInfo:" + this.mAudioCodecManager.getDumpInfo());
        }
        this.mConfigMethodCalled = true;
        this.mAllowKeepPool = true;
        CodecWrapper codec = getCodec(mediaFormat, tMediaCodec, surface);
        codec.setCodecCallback(tMediaCodec.getCodecCallback());
        onCodecRunning(codec);
        codec.configure(mediaFormat, surface, i, mediaDescrambler);
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "configureEnd   videoPoolInfo:" + this.mVideoCodecManager.getDumpInfo() + ", audioPoolInfo:" + this.mAudioCodecManager.getDumpInfo());
        }
        return codec;
    }
}
