package x03;

import android.content.Context;
import com.tencent.p014mm.modelvideo.MMVideoView;
import com.tencent.p014mm.plugin.topstory.p113ui.video.TopStoryVideoPlayTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import t03.C22426h;
import te3.xh4;
import uf0.C65339f;
import v73.C102158a;
import v73.C102159b;

/* renamed from: x03.t */
public class C102532t extends MMVideoView {

    /* renamed from: g1 */
    public C22947b f301892g1;

    /* renamed from: h1 */
    public String f301893h1 = "";

    public C102532t(Context context, C22947b bVar) {
        super(context);
        this.f283587f = context;
        this.f301892g1 = bVar;
    }

    /* renamed from: E */
    public C96875r0 mo79608E(Context context) {
        TopStoryVideoPlayTextureView topStoryVideoPlayTextureView = new TopStoryVideoPlayTextureView(context);
        topStoryVideoPlayTextureView.setOpenWithNoneSurface(true);
        topStoryVideoPlayTextureView.setNeedResetExtractor(mo142145j0());
        topStoryVideoPlayTextureView.setIsOnlineVideoType(true);
        return topStoryVideoPlayTextureView;
    }

    /* renamed from: H */
    public void mo79392H() {
        super.mo79392H();
    }

    /* renamed from: L */
    public boolean mo135075L() {
        return false;
    }

    /* renamed from: Y */
    public boolean mo79611Y(int i, PInt pInt, PInt pInt2) {
        boolean z;
        pInt.value = Math.max(i, this.f267495W0);
        int i2 = this.f267486Q0;
        if (i2 == 1 || i2 == 0) {
            if (this.f267487R0 == null || !mo142145j0()) {
                z = false;
            } else {
                pInt2.value = 0;
                pInt.value = 0;
                z = this.f267487R0.mo89450e(i + 1, pInt, pInt2);
            }
            if (!z) {
                pInt.value = i;
                pInt2.value = i + 4;
            }
        } else {
            z = false;
        }
        if (this.f267486Q0 == 2) {
            C65339f fVar = this.f267487R0;
            if (fVar != null) {
                z = fVar.mo89450e(i, pInt, pInt2);
                pInt2.value += 4;
            }
            if (!z) {
                int i3 = i - 8;
                pInt.value = i3;
                if (i3 < 0) {
                    pInt.value = 0;
                }
                pInt2.value = pInt.value + this.f267496X0 + 8;
            }
        }
        int i4 = this.f267486Q0;
        if (i4 == 3 || i4 == 4) {
            pInt.value = this.f267495W0;
            pInt2.value = this.f267488S0 + 1;
        }
        int i5 = pInt2.value;
        int i6 = this.f267488S0;
        if (i5 >= i6 + 1) {
            pInt2.value = i6 + 1;
        }
        int i7 = pInt2.value;
        int i8 = pInt.value;
        if (i7 < i8) {
            pInt2.value = i8 + 2;
            return false;
        }
        Log.m105919d("MicroMsg.TopStory.TopStoryVideoView", "%s calcDownloadRange2 range[%d, %d, %b] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", mo76634K(), Integer.valueOf(pInt.value), Integer.valueOf(pInt2.value), Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(this.f267486Q0), Integer.valueOf(this.f267495W0), Integer.valueOf(this.f267496X0), this.f267494W);
        return true;
    }

    /* renamed from: Z */
    public boolean mo79612Z(int i) {
        boolean z;
        boolean z2;
        C65339f fVar;
        if (this.f267506y0 == 3) {
            return true;
        }
        PInt pInt = new PInt();
        PInt pInt2 = new PInt();
        try {
            PInt pInt3 = new PInt();
            PInt pInt4 = new PInt();
            if (i != 0 || this.f267487R0 == null || !mo142145j0()) {
                z2 = false;
            } else {
                pInt4.value = 0;
                pInt3.value = 0;
                z2 = this.f267487R0.mo89450e(i + 1, pInt3, pInt4);
            }
            int i2 = i + 1;
            if (z2) {
                i2 = pInt4.value;
            }
            if (this.f267492V == null || (fVar = this.f267487R0) == null || !fVar.mo89449d(i, i2, pInt, pInt2)) {
                return false;
            }
            boolean c = this.f267492V.mo36229c(this.f267494W, pInt.value, pInt2.value);
            if (c) {
                try {
                    this.f267495W0 = i2;
                } catch (Exception e) {
                    Exception exc = e;
                    z = c;
                    e = exc;
                }
            }
            return c;
        } catch (Exception e2) {
            e = e2;
            z = false;
            Log.m105921e("MicroMsg.TopStory.TopStoryVideoView", "%s check video data error %s ", mo76634K(), e.toString());
            return z;
        }
    }

    /* renamed from: b */
    public void mo79614b() {
        Log.m105925i("MicroMsg.TopStory.TopStoryVideoView", "%s onUIPause", mo76634K());
        if (this.f283588g) {
            this.f283596r = getCurrPosSec();
            this.f283597s = isPlaying();
            this.f283574D = 0;
            this.f283573C = (long) 0;
            pause();
            mo127231U();
            this.f283588g = false;
            mo135073G(600, (long) (getReportIdkey() + 11), 1, false);
        }
    }

    /* renamed from: c */
    public void mo79616c() {
        super.mo79616c();
        this.f301892g1 = null;
    }

    /* renamed from: e */
    public void mo76638e(String str, long j, long j2) {
        if (Util.isEqual(this.f267494W, str)) {
            Log.m105919d("MicroMsg.TopStory.TopStoryVideoView", "%s download  onProgress [%d, %d]", mo76634K(), Long.valueOf(j), Long.valueOf(j2));
            if (this.f267493V0 && this.f267486Q0 == 3) {
                mo127232a0(getCurrPosSec());
            }
        }
    }

    /* renamed from: e0 */
    public void mo127233e0() {
        MMVideoView.C55393b bVar = this.f267500b1;
        bVar.f157764a = 4;
        bVar.f157765b = 2;
    }

    /* renamed from: f */
    public void mo79617f() {
        Log.m105925i("MicroMsg.TopStory.TopStoryVideoView", "%s onUIResume", mo76634K());
        if (!this.f283588g) {
            this.f283588g = true;
            C96875r0 r0Var = this.f283595q;
            if (r0Var != null) {
                if (this.f283597s) {
                    play();
                } else {
                    ((VideoPlayerTextureView) r0Var).mo153302E();
                }
            }
            mo135073G(600, (long) (getReportIdkey() + 10), 1, false);
        }
    }

    public int getCurrPosMs() {
        C96875r0 r0Var = this.f283595q;
        int currentPosition = r0Var != null ? r0Var.getCurrentPosition() : 0;
        int i = this.f267489T0;
        return i > 0 ? i * 1000 : currentPosition;
    }

    public int getCurrPosSec() {
        C96875r0 r0Var = this.f283595q;
        int round = r0Var != null ? Math.round((((float) r0Var.getCurrentPosition()) * 1.0f) / 1000.0f) : 0;
        int i = this.f267489T0;
        return i > 0 ? i : round;
    }

    public String getSessionId() {
        return this.f301893h1;
    }

    /* renamed from: i0 */
    public boolean mo79629i0(int i, boolean z) {
        int f;
        C65339f fVar = this.f267487R0;
        if (fVar != null && i > (f = fVar.mo89451f()) && f > 0) {
            Log.m105925i("MicroMsg.TopStory.TopStoryVideoView", "%s seek to reset time ori[%d] last key frame[%d]", mo76634K(), Integer.valueOf(i), Integer.valueOf(f));
            i = f;
        }
        return super.mo79629i0(i, z);
    }

    public boolean isPlaying() {
        boolean isPlaying = super.isPlaying();
        Log.m105919d("MicroMsg.TopStory.TopStoryVideoView", "%s result [%b] is playing[%b] playStatus[%d]", mo76634K(), Boolean.valueOf(isPlaying && this.f267486Q0 == 3), Boolean.valueOf(isPlaying), Integer.valueOf(this.f267486Q0));
        return isPlaying;
    }

    /* renamed from: j0 */
    public final boolean mo142145j0() {
        try {
            C86709a0.m107528h();
            return C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, false);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoView", e, "check need reset error", new Object[0]);
            return false;
        }
    }

    /* renamed from: m */
    public void mo76640m(String str, int i) {
        C96814a.C57541b bVar;
        super.mo76640m(str, i);
        if (i != 0 && (bVar = this.f283598t) != null) {
            bVar.mo22960T(getSessionId(), getMediaId(), "download error", i, 0);
        }
    }

    public void onError(int i, int i2) {
        super.onError(i, i2);
        if (i2 == -3) {
            C102159b.m134601a(3);
        } else if (i2 == -2) {
            try {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, Boolean.TRUE);
                C96875r0 r0Var = this.f283595q;
                if (r0Var instanceof TopStoryVideoPlayTextureView) {
                    ((TopStoryVideoPlayTextureView) r0Var).setNeedResetExtractor(true);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoView", e, "%s onError [%s]", mo76634K(), e.toString());
            }
            C102159b.m134601a(2);
        } else if (i2 == -1) {
            C102159b.m134601a(1);
        }
    }

    public void setVideoInfo(xh4 xh4) {
        mo76636h(false, xh4.f64726e, 0);
        this.f267494W = C22426h.m26100b(xh4.f64729h, xh4.f64741v);
        this.f267504p0 = this.f301892g1.mo24975Z2() + this.f267494W + ".mp4";
    }

    public void start() {
        super.start();
        C102158a.m134600a(5);
    }

    public void stop() {
        super.stop();
    }
}
