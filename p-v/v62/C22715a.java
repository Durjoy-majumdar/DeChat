package v62;

import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPPlayerMsg;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import e72.C20526a;
import gy3.C8480h;
import gy3.C87412m;
import java.io.IOException;
import java.util.Objects;
import u62.C22582c;
import u62.C22595e;
import u62.C22599h;
import z62.C23459a;
import z62.C66734b;
import z62.C66735c;

/* renamed from: v62.a */
public final class C22715a extends C22582c implements ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnSeekCompleteListener, ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnVideoSizeChangedListener {

    /* renamed from: v */
    public ITPPlayer f65298v;

    /* renamed from: w */
    public C20526a f65299w;

    public C22715a(ITPPlayer iTPPlayer, C8480h hVar) {
        Objects.requireNonNull(iTPPlayer);
        this.f65298v = iTPPlayer;
        iTPPlayer.setLoopback(true);
        iTPPlayer.setOnPreparedListener(this);
        iTPPlayer.setOnCompletionListener(this);
        iTPPlayer.setOnErrorListener(this);
        iTPPlayer.setOnInfoListener(this);
        iTPPlayer.setOnSeekCompleteListener(this);
        iTPPlayer.setOnPlayerStateChangeListener(this);
        iTPPlayer.setOnVideoSizeChangedListener(this);
    }

    /* renamed from: a */
    public void mo35686a(float f, float f2) {
        this.f65298v.setOutputMute(f == 0.0f);
    }

    /* renamed from: b */
    public void mo35687b(boolean z) {
        this.f65298v.setLoopback(z);
    }

    /* renamed from: f */
    public void mo35688f(C66734b bVar) {
        C87412m.m108594g(bVar, "mediaSource");
        if (bVar instanceof C23459a) {
            this.f65298v.setDataSource(bVar.f191766b);
        } else if (bVar instanceof C66735c) {
            C20526a aVar = this.f65299w;
            if (aVar != null) {
                aVar.f57769h.mo17760i();
            }
            C22595e eVar = this.f64918d;
            if (eVar != null) {
                C20526a aVar2 = new C20526a(eVar, (C66735c) bVar, this.f64929r);
                this.f65299w = aVar2;
                this.f65298v.enableTPAssetResourceLoader(aVar2);
                TPVideoInfo.Builder builder = new TPVideoInfo.Builder();
                builder.fileId(bVar.f191765a);
                builder.downloadParam(new TPDownloadParamData(11));
                this.f65298v.setVideoInfo(builder.build());
                this.f65298v.setDataSource(bVar.f191766b);
                return;
            }
            C87412m.m108603p("onePlayContext");
            throw null;
        } else {
            Log.m105928w("MMPlayerTPProxy", "setMediaSource unSupport mediaSource:" + bVar);
        }
    }

    public long getCurrentPositionMs() {
        return this.f65298v.getCurrentPositionMs();
    }

    public long getDurationMs() {
        return this.f65298v.getDurationMs();
    }

    public int getVideoHeight() {
        return this.f65298v.getVideoHeight();
    }

    public int getVideoWidth() {
        return this.f65298v.getVideoWidth();
    }

    public boolean isPlaying() {
        boolean z = this.f64932u == 5;
        String tag = getTag();
        Log.m105924i(tag, "isPlaying:" + z + " state:" + this.f64932u);
        return z;
    }

    public void onCompletion(ITPPlayer iTPPlayer) {
        C87412m.m108594g(iTPPlayer, "player");
        Log.m105924i(getTag(), "onCompletion");
        mo35680u();
    }

    public void onError(ITPPlayer iTPPlayer, int i, int i2, long j, long j2) {
        C87412m.m108594g(iTPPlayer, "player");
        mo35681v(i, i2);
    }

    public void onInfo(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
        C87412m.m108594g(iTPPlayer, "player");
        if (i == 106) {
            mo35682w();
        } else if (i == 204) {
            Log.m105925i(getTag(), "video decoder tyep: ", Long.valueOf(j));
            mo35683x(this, i, j, j2, obj);
        } else if (i == 1001) {
            Log.m105924i(getTag(), "play video download finish");
        } else if (i != 1003) {
            if (i != 1006) {
                if (i == 200) {
                    mo35679t();
                } else if (i == 201) {
                    mo35674s();
                } else if (i == 1008) {
                    Log.m105924i(getTag(), "play no more data");
                } else if (i != 1009) {
                    mo35683x(this, i, j, j2, obj);
                    String tag = getTag();
                    Log.m105924i(tag, "onInfo what :" + i);
                } else {
                    String tag2 = getTag();
                    Log.m105924i(tag2, "play use proxy:" + j);
                }
            } else if (obj == null || !(obj instanceof TPPlayerMsg.TPDownLoadProgressInfo)) {
                String tag3 = getTag();
                Log.m105924i(tag3, "play download process:" + obj);
            } else {
                String tag4 = getTag();
                StringBuilder sb = new StringBuilder();
                sb.append("play download process:");
                TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = (TPPlayerMsg.TPDownLoadProgressInfo) obj;
                sb.append(tPDownLoadProgressInfo.playableDurationMS);
                sb.append("ms,");
                sb.append(tPDownLoadProgressInfo.downloadSpeedKBps);
                sb.append("KB/s,");
                sb.append(tPDownLoadProgressInfo.currentDownloadSize);
                sb.append(',');
                sb.append(tPDownLoadProgressInfo.totalFileSize);
                Log.m105924i(tag4, sb.toString());
            }
        } else if (obj == null || !(obj instanceof TPPlayerMsg.TPCDNURLInfo)) {
            String tag5 = getTag();
            Log.m105924i(tag5, "play cdn info:" + obj);
        } else {
            String tag6 = getTag();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onPlayCdnInfoUpdateInternal play cdn info, uip:");
            TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = (TPPlayerMsg.TPCDNURLInfo) obj;
            sb4.append(tPCDNURLInfo.uIp);
            sb4.append(",cdnIp:");
            sb4.append(tPCDNURLInfo.cdnIp);
            sb4.append(",err:");
            sb4.append(tPCDNURLInfo.errorStr);
            sb4.append(",url:");
            sb4.append(tPCDNURLInfo.url);
            Log.m105924i(tag6, sb4.toString());
        }
    }

    public void onPrepared(ITPPlayer iTPPlayer) {
        C87412m.m108594g(iTPPlayer, "player");
        C22599h hVar = new C22599h();
        iTPPlayer.getPropertyLong(101);
        iTPPlayer.getPropertyLong(202);
        iTPPlayer.getPropertyLong(206);
        mo35684y(hVar);
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
        C87412m.m108594g(iTPPlayer, "player");
        mo35685z();
    }

    public void onStateChange(int i, int i2) {
        String tag = getTag();
        Log.m105924i(tag, "onStateChange from:" + i + " to:" + i2);
        mo35653A(this, i, i2);
    }

    public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j, long j2) {
        C87412m.m108594g(iTPPlayer, "player");
        mo35654B((int) j, (int) j2);
    }

    /* renamed from: p */
    public Object mo35694p() {
        return this.f65298v;
    }

    public void pause() {
        super.pause();
        this.f65298v.pauseDownload();
        this.f65298v.pause();
    }

    public void prepareAsync() {
        super.prepareAsync();
        try {
            C20526a aVar = this.f65299w;
            if (aVar != null) {
                aVar.f57769h.mo17758d();
            }
            this.f65298v.prepareAsync();
        } catch (IOException e) {
            Log.m105921e(getTag(), "prepareAsync", e);
        }
    }

    public void release() {
        super.release();
        this.f65298v.pauseDownload();
        C20526a aVar = this.f65299w;
        if (aVar != null) {
            aVar.f57769h.mo17760i();
        }
        this.f65298v.release();
    }

    public void reset() {
        super.reset();
        this.f65298v.reset();
    }

    public void seekTo(long j) {
        try {
            super.seekTo(j);
            this.f65298v.seekTo((int) j, 3);
        } catch (Exception e) {
            String tag = getTag();
            Log.m105924i(tag, "seekTo error" + e);
        }
    }

    public void setOutputMute(boolean z) {
        this.f65298v.setOutputMute(z);
    }

    public void setPlaySpeedRatio(float f) {
        this.f65298v.setPlaySpeedRatio(f);
    }

    public void setSurface(Surface surface) {
        super.setSurface(surface);
        this.f65298v.setSurface(surface);
    }

    public void start() {
        super.start();
        this.f65298v.start();
    }

    public void stop() {
        super.stop();
        this.f65298v.pauseDownload();
        C20526a aVar = this.f65299w;
        if (aVar != null) {
            aVar.f57769h.mo17760i();
        }
        this.f65298v.stop();
        mo35671q(9, this + "#stop");
    }
}
