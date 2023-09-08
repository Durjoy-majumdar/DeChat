package j03;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.api.TPCaptureParams;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerFactory;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPSurface;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.api.proxy.ITPPlayerProxy;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.api.report.ITPBusinessReportManager;
import com.tencent.thumbplayer.api.reportv2.ITPExtendReportController;
import com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener;
import com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer;
import com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader;
import com.tencent.thumbplayer.log.TPLoggerContext;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.Map;

/* renamed from: j03.f */
public class C21147f implements ITPPlayer, C60698b {

    /* renamed from: a */
    public final String f59786a = ("MicroMsg.TP.MMTPPlayer@" + hashCode());

    /* renamed from: b */
    public ITPPlayer f59787b;

    /* renamed from: c */
    public boolean f59788c;

    /* renamed from: d */
    public String f59789d = "";

    /* renamed from: e */
    public boolean f59790e;

    /* renamed from: f */
    public long f59791f;

    /* renamed from: g */
    public boolean f59792g;

    /* renamed from: h */
    public long f59793h;

    /* renamed from: i */
    public ITPPlayerListener.IOnStateChangeListener f59794i = new C21148a(this);

    /* renamed from: j */
    public ITPPlayerListener.IOnStateChangeListener f59795j;

    /* renamed from: j03.f$a */
    public static final class C21148a implements ITPPlayerListener.IOnStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C21147f f59796d;

        public C21148a(C21147f fVar) {
            this.f59796d = fVar;
        }

        public final void onStateChange(int i, int i2) {
            C21147f fVar = this.f59796d;
            if (fVar.f59791f > 0) {
                String str = fVar.f59786a;
                Log.m105924i(str, "state from:" + i + " to:" + i2 + " cost:" + (C31543z5.m39453c() - this.f59796d.f59791f) + " id:" + this.f59796d.f59789d);
            }
            if (i2 == 2) {
                this.f59796d.f59790e = false;
            } else if (i2 == 3) {
                this.f59796d.f59792g = false;
            } else if (i2 == 4) {
                this.f59796d.f59793h = C31543z5.m39453c() - this.f59796d.f59791f;
            }
            ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener = this.f59796d.f59795j;
            if (iOnStateChangeListener != null) {
                iOnStateChangeListener.onStateChange(i, i2);
            }
        }
    }

    public C21147f(Context context) {
        ITPPlayer createTPPlayer = TPPlayerFactory.createTPPlayer(context);
        C87412m.m108593f(createTPPlayer, "createTPPlayer(context)");
        this.f59787b = createTPPlayer;
        createTPPlayer.setOnPlayerStateChangeListener(this.f59794i);
    }

    /* renamed from: a */
    public void mo33105a(String str) {
        C87412m.m108594g(str, "mediaId");
        this.f59789d = str;
        Log.m105918d(this.f59786a, "setMediaId");
    }

    public void addAudioTrackSource(String str, String str2) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.addAudioTrackSource(str, str2);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void addSubtitleSource(String str, String str2, String str3) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str3, "name");
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.addSubtitleSource(str, str2, str3);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    /* renamed from: b */
    public boolean mo33106b() {
        return this.f59788c;
    }

    /* renamed from: c */
    public long mo33107c() {
        return this.f59793h;
    }

    public void captureVideo(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.captureVideo(tPCaptureParams, tPCaptureCallBack);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void deselectTrack(int i, long j) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.deselectTrack(i, j);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void enableTPAssetResourceLoader(ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener, Looper looper) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.enableTPAssetResourceLoader(iTPAssetResourceLoaderListener, looper);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public int getBufferPercent() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            return iTPPlayer.getBufferPercent();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public long getCurrentPositionMs() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            return iTPPlayer.getCurrentPositionMs();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public int getCurrentState() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            return iTPPlayer.getCurrentState();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public long getDurationMs() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            return iTPPlayer.getDurationMs();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public ITPExtendReportController getExtendReportController() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            return iTPPlayer.getExtendReportController();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public long getPlayableDurationMs() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            return iTPPlayer.getPlayableDurationMs();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public long getPlayerBufferedDurationMs() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            return iTPPlayer.getPlayerBufferedDurationMs();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public ITPPlayerProxy getPlayerProxy() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            ITPPlayerProxy playerProxy = iTPPlayer.getPlayerProxy();
            C87412m.m108593f(playerProxy, "player.playerProxy");
            return playerProxy;
        }
        C87412m.m108603p("player");
        throw null;
    }

    public int getPlayerType() {
        return getPlayerType();
    }

    public TPProgramInfo[] getProgramInfo() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            TPProgramInfo[] programInfo = iTPPlayer.getProgramInfo();
            C87412m.m108593f(programInfo, "player.programInfo");
            return programInfo;
        }
        C87412m.m108603p("player");
        throw null;
    }

    public long getPropertyLong(int i) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            return iTPPlayer.getPropertyLong(i);
        }
        C87412m.m108603p("player");
        throw null;
    }

    public String getPropertyString(int i) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            String propertyString = iTPPlayer.getPropertyString(i);
            C87412m.m108593f(propertyString, "player.getPropertyString(paramId)");
            return propertyString;
        }
        C87412m.m108603p("player");
        throw null;
    }

    public ITPBusinessReportManager getReportManager() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            return iTPPlayer.getReportManager();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public TPTrackInfo[] getTrackInfo() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            TPTrackInfo[] trackInfo = iTPPlayer.getTrackInfo();
            C87412m.m108593f(trackInfo, "player.trackInfo");
            return trackInfo;
        }
        C87412m.m108603p("player");
        throw null;
    }

    public int getVideoHeight() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            return iTPPlayer.getVideoHeight();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public int getVideoWidth() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            return iTPPlayer.getVideoWidth();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public void pause() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.pause();
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void pauseDownload() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.pauseDownload();
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void prepareAsync() {
        String str = this.f59786a;
        Log.m105924i(str, "prepareAsync, inPrepareAsync:" + this.f59792g + ", mediaId:" + this.f59789d);
        if (!this.f59792g) {
            this.f59792g = true;
            ITPPlayer iTPPlayer = this.f59787b;
            if (iTPPlayer != null) {
                iTPPlayer.prepareAsync();
            } else {
                C87412m.m108603p("player");
                throw null;
            }
        } else {
            Log.m105924i(this.f59786a, "already prepareAsync");
        }
    }

    public void release() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.release();
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void reset() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.reset();
            this.f59789d = "";
            this.f59790e = false;
            this.f59792g = false;
            this.f59791f = 0;
            this.f59793h = 0;
            return;
        }
        C87412m.m108603p("player");
        throw null;
    }

    public void resumeDownload() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.resumeDownload();
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void seekTo(int i) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.seekTo(i);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void selectProgram(int i, long j) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.selectProgram(i, j);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void selectTrack(int i, long j) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.selectTrack(i, j);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setAudioGainRatio(float f) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setAudioGainRatio(f);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setAudioNormalizeVolumeParams(String str) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setAudioNormalizeVolumeParams(str);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setDataSource(String str) {
        if (!this.f59790e) {
            this.f59790e = true;
            this.f59791f = C31543z5.m39453c();
            ITPPlayer iTPPlayer = this.f59787b;
            if (iTPPlayer != null) {
                iTPPlayer.setDataSource(str);
                Log.m105918d(this.f59786a, "setDataSource");
                return;
            }
            C87412m.m108603p("player");
            throw null;
        }
        String str2 = this.f59786a;
        Log.m105924i(str2, "already setDataSource " + str);
    }

    public void setLoopback(boolean z) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setLoopback(z);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnAudioFrameOutputListener(ITPPlayerListener.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnAudioFrameOutputListener(iOnAudioFrameOutputListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnAudioProcessFrameOutputListener(ITPPlayerListener.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnAudioProcessFrameOutputListener(iOnAudioProcessFrameOutputListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnCompletionListener(ITPPlayerListener.IOnCompletionListener iOnCompletionListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnCompletionListener(iOnCompletionListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnDemuxerListener(ITPPlayerListener.IOnDemuxerListener iOnDemuxerListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnDemuxerListener(iOnDemuxerListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnDetailInfoListener(ITPPlayerListener.IOnDetailInfoListener iOnDetailInfoListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnDetailInfoListener(iOnDetailInfoListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnErrorListener(ITPPlayerListener.IOnErrorListener iOnErrorListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnErrorListener(iOnErrorListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnInfoListener(ITPPlayerListener.IOnInfoListener iOnInfoListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnInfoListener(iOnInfoListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnPlayerStateChangeListener(ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener) {
        this.f59795j = iOnStateChangeListener;
    }

    public void setOnPreparedListener(ITPPlayerListener.IOnPreparedListener iOnPreparedListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnPreparedListener(iOnPreparedListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnSeekCompleteListener(ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnSeekCompleteListener(iOnSeekCompleteListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnStopAsyncCompleteListener(ITPPlayerListener.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnStopAsyncCompleteListener(iOnStopAsyncCompleteListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnSubtitleDataListener(ITPPlayerListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnSubtitleDataListener(iOnSubtitleDataListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnSubtitleFrameOutListener(ITPPlayerListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnSubtitleFrameOutListener(iOnSubtitleFrameOutListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnVideoFrameOutListener(ITPPlayerListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnVideoFrameOutListener(iOnVideoFrameOutListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnVideoProcessFrameOutputListener(ITPPlayerListener.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnVideoProcessFrameOutputListener(iOnVideoProcessFrameOutputListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOnVideoSizeChangedListener(ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOnVideoSizeChangedListener(iOnVideoSizeChangedListener);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setOutputMute(boolean z) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setOutputMute(z);
            this.f59788c = z;
            return;
        }
        C87412m.m108603p("player");
        throw null;
    }

    public void setPlaySharpenSwitch() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setPlaySharpenSwitch();
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setPlaySpeedRatio(float f) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setPlaySpeedRatio(f);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setPlayerOptionalParam(TPOptionalParam tPOptionalParam) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setPlayerOptionalParam(tPOptionalParam);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setRichMediaSynchronizer(ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setRichMediaSynchronizer(iTPRichMediaSynchronizer);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setSurface(Surface surface) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setSurface(surface);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setSurfaceHolder(surfaceHolder);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setTPSurface(TPSurface tPSurface) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setTPSurface(tPSurface);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setVideoInfo(TPVideoInfo tPVideoInfo) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setVideoInfo(tPVideoInfo);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void start() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.start();
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void stop() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.stop();
            this.f59789d = "";
            this.f59790e = false;
            this.f59792g = false;
            this.f59791f = 0;
            this.f59793h = 0;
            return;
        }
        C87412m.m108603p("player");
        throw null;
    }

    public void stopAsync() {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.stopAsync();
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void switchDefinition(String str, long j, TPVideoInfo tPVideoInfo) {
        C87412m.m108594g(str, "defUrl");
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.switchDefinition(str, j, tPVideoInfo);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void updateLoggerContext(TPLoggerContext tPLoggerContext) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.updateLoggerContext(tPLoggerContext);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void addAudioTrackSource(String str, String str2, TPDownloadParamData tPDownloadParamData) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.addAudioTrackSource(str, str2, tPDownloadParamData);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void addSubtitleSource(String str, String str2, String str3, TPDownloadParamData tPDownloadParamData) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str3, "name");
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.addSubtitleSource(str, str2, str3, tPDownloadParamData);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void enableTPAssetResourceLoader(ITPAssetResourceLoader iTPAssetResourceLoader) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.enableTPAssetResourceLoader(iTPAssetResourceLoader);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void seekTo(int i, int i2) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.seekTo(i, i2);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setLoopback(boolean z, long j, long j2) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setLoopback(z, j, j2);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setSurface(Surface surface, int i) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setSurface(surface, i);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void switchDefinition(String str, long j, TPVideoInfo tPVideoInfo, Map<String, String> map) {
        C87412m.m108594g(str, "defUrl");
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.switchDefinition(str, j, tPVideoInfo, map);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void switchDefinition(ITPMediaAsset iTPMediaAsset, long j, TPVideoInfo tPVideoInfo) {
        C87412m.m108594g(iTPMediaAsset, "mediaAsset");
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.switchDefinition(iTPMediaAsset, j, tPVideoInfo);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void switchDefinition(String str, long j, TPVideoInfo tPVideoInfo, int i) {
        C87412m.m108594g(str, "defUrl");
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.switchDefinition(str, j, tPVideoInfo, i);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void switchDefinition(String str, long j, TPVideoInfo tPVideoInfo, Map<String, String> map, int i) {
        C87412m.m108594g(str, "defUrl");
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.switchDefinition(str, j, tPVideoInfo, map, i);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void switchDefinition(ITPMediaAsset iTPMediaAsset, long j, TPVideoInfo tPVideoInfo, int i) {
        C87412m.m108594g(iTPMediaAsset, "mediaAsset");
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.switchDefinition(iTPMediaAsset, j, tPVideoInfo, i);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public C21147f(Context context, Looper looper) {
        ITPPlayer createTPPlayer = TPPlayerFactory.createTPPlayer(context, looper);
        C87412m.m108593f(createTPPlayer, "createTPPlayer(context, threadLooper)");
        this.f59787b = createTPPlayer;
        createTPPlayer.setOnPlayerStateChangeListener(this.f59794i);
    }

    public void setDataSource(String str, Map<String, String> map) {
        if (!this.f59790e) {
            this.f59790e = true;
            this.f59791f = C31543z5.m39453c();
            ITPPlayer iTPPlayer = this.f59787b;
            if (iTPPlayer != null) {
                iTPPlayer.setDataSource(str, map);
                Log.m105918d(this.f59786a, "setDataSource");
                return;
            }
            C87412m.m108603p("player");
            throw null;
        }
        String str2 = this.f59786a;
        Log.m105924i(str2, "already setDataSource " + str);
    }

    public void setDataSource(ParcelFileDescriptor parcelFileDescriptor) {
        if (!this.f59790e) {
            this.f59790e = true;
            this.f59791f = C31543z5.m39453c();
            ITPPlayer iTPPlayer = this.f59787b;
            if (iTPPlayer != null) {
                iTPPlayer.setDataSource(parcelFileDescriptor);
                Log.m105918d(this.f59786a, "setDataSource");
                return;
            }
            C87412m.m108603p("player");
            throw null;
        }
        String str = this.f59786a;
        Log.m105924i(str, "already setDataSource " + parcelFileDescriptor);
    }

    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        ITPPlayer iTPPlayer = this.f59787b;
        if (iTPPlayer != null) {
            iTPPlayer.setDataSource(assetFileDescriptor);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setDataSource(ITPMediaAsset iTPMediaAsset) {
        if (!this.f59790e) {
            this.f59790e = true;
            this.f59791f = C31543z5.m39453c();
            ITPPlayer iTPPlayer = this.f59787b;
            if (iTPPlayer != null) {
                iTPPlayer.setDataSource(iTPMediaAsset);
                Log.m105918d(this.f59786a, "setDataSource");
                return;
            }
            C87412m.m108603p("player");
            throw null;
        }
        String str = this.f59786a;
        Log.m105924i(str, "already setDataSource " + iTPMediaAsset);
    }
}
