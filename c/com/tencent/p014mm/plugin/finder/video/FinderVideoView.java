package com.tencent.p014mm.plugin.finder.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import co1.C55048e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.modelvideo.MMVideoView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.SynchronizedVideoPlayTextureView;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C97621e;
import fy3.C32224a;
import gr1.C59659i2;
import gr1.C59673q2;
import gr1.C59674r2;
import gr1.C59684w2;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import jr1.C60908a;
import kotlin.Metadata;
import mr1.C61575s;
import pl1.C62367r0;
import pl1.C62369u0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C48889bp1;
import te3.C64477jr2;
import te3.C64689rq2;
import uf0.C102020i;
import uf0.C102022j;
import uf0.C65339f;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010R\u001a\u0004\u0018\u00010Q\u0012\b\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\bU\u0010VJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\n\u001a\u00020\u0002H\u0014J\u0010\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016R\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00103\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\"\u0010=\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\"\u0010?\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b>\u00102\u001a\u0004\b?\u00104\"\u0004\b@\u00106R$\u0010H\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010P\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006W"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderVideoView;", "Lcom/tencent/mm/modelvideo/MMVideoView;", "", "getDefaultLog", "Landroid/graphics/Bitmap;", "getBitmap", "", "isInterceptDetach", "Lrx3/b0;", "setInterceptDetach", "getMediaId", "Lcom/tencent/mm/plugin/finder/video/FinderVideoCore;", "videoCore", "setVideoCore", "", "seconds", "setVideoTotalTime", "mute", "setMute", "getVideoMediaId", "getCurrPosSec", "getVideoDurationSec", "Lcom/tencent/mm/pluginsdk/ui/a$b;", "_callback", "setIMMVideoViewCallback", "loop", "setLoop", "Lco1/e;", "g1", "Lrx3/g;", "getPreloadModel", "()Lco1/e;", "preloadModel", "Lgr1/q2;", "h1", "Lgr1/q2;", "getMediaInfo", "()Lgr1/q2;", "setMediaInfo", "(Lgr1/q2;)V", "mediaInfo", "Lte3/bp1;", "i1", "Lte3/bp1;", "getVideoMatrix", "()Lte3/bp1;", "setVideoMatrix", "(Lte3/bp1;)V", "videoMatrix", "j1", "Z", "isViewFocused", "()Z", "setViewFocused", "(Z)V", "k1", "isShouldPlayResume", "setShouldPlayResume", "l1", "get_isPreviewing", "set_isPreviewing", "_isPreviewing", "m1", "isNeverStart", "setNeverStart", "Lgr1/r2;", "n1", "Lgr1/r2;", "getMuteListener", "()Lgr1/r2;", "setMuteListener", "(Lgr1/r2;)V", "muteListener", "Lgr1/w2;", "o1", "Lgr1/w2;", "getLifecycle", "()Lgr1/w2;", "setLifecycle", "(Lgr1/w2;)V", "lifecycle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoView */
public class FinderVideoView extends MMVideoView {

    /* renamed from: g1 */
    public final C13601g f161920g1 = C36568h.m40985a(C56529c.f161938d);

    /* renamed from: h1 */
    public C59673q2 f161921h1;

    /* renamed from: i1 */
    public C48889bp1 f161922i1;

    /* renamed from: j1 */
    public boolean f161923j1 = true;

    /* renamed from: k1 */
    public boolean f161924k1;

    /* renamed from: l1 */
    public boolean f161925l1;

    /* renamed from: m1 */
    public volatile boolean f161926m1 = true;

    /* renamed from: n1 */
    public C59674r2 f161927n1;

    /* renamed from: o1 */
    public C59684w2 f161928o1;

    /* renamed from: p1 */
    public final C97621e f161929p1 = new C97621e();

    /* renamed from: q1 */
    public SynchronizedVideoPlayTextureView f161930q1;

    /* renamed from: r1 */
    public int f161931r1;

    /* renamed from: s1 */
    public FinderVideoCore f161932s1;

    /* renamed from: t1 */
    public int f161933t1;

    /* renamed from: u1 */
    public int f161934u1;

    /* renamed from: v1 */
    public int f161935v1;

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoView$a */
    public static final class C56527a implements C96814a.C96816c {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoView f161936d;

        public C56527a(FinderVideoView finderVideoView) {
            this.f161936d = finderVideoView;
        }

        public void idkeyStat(long j, long j2, long j3, boolean z) {
            C59673q2 mediaInfo = this.f161936d.getMediaInfo();
            if ((mediaInfo != null ? mediaInfo.f170494d : null) != null) {
                if (j2 < 200) {
                    C115669n.INSTANCE.idkeyStat(1302, j2, j3, z);
                }
                boolean z2 = true;
                int i = (120 > j2 ? 1 : (120 == j2 ? 0 : -1));
                if (i <= 0 && j2 < 140) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(1302, 200, j3, z);
                    if (i <= 0 && j2 < 125) {
                        nVar.idkeyStat(1302, 201, j3, z);
                    }
                    if (125 <= j2 && j2 < 130) {
                        nVar.idkeyStat(1302, 202, j3, z);
                    }
                    if (130 <= j2 && j2 < 135) {
                        nVar.idkeyStat(1302, 203, j3, z);
                    }
                    if (135 <= j2 && j2 < 140) {
                        nVar.idkeyStat(1302, 204, j3, z);
                    }
                }
                int i2 = (141 > j2 ? 1 : (141 == j2 ? 0 : -1));
                if (i2 <= 0 && j2 < 161) {
                    C115669n nVar2 = C115669n.INSTANCE;
                    nVar2.idkeyStat(1302, 210, j3, z);
                    if (i2 <= 0 && j2 < 146) {
                        nVar2.idkeyStat(1302, 211, j3, z);
                    }
                    if (146 <= j2 && j2 < 151) {
                        nVar2.idkeyStat(1302, 212, j3, z);
                    }
                    if (151 <= j2 && j2 < 156) {
                        nVar2.idkeyStat(1302, 213, j3, z);
                    }
                    if (156 > j2 || j2 >= 161) {
                        z2 = false;
                    }
                    if (z2) {
                        nVar2.idkeyStat(1302, 214, j3, z);
                    }
                }
            }
        }

        public void kvStat(int i, String str) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoView$b */
    public static final class C56528b extends SynchronizedVideoPlayTextureView {

        /* renamed from: L */
        public final /* synthetic */ FinderVideoView f161937L;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56528b(Context context, FinderVideoView finderVideoView) {
            super(context);
            this.f161937L = finderVideoView;
        }

        public int getBusinessType() {
            return 1;
        }

        public void setVideoPath(String str) {
            Log.m105924i("Finder.VideoView", "[setVideoPath] " + this.f161937L.getDefaultLog());
            super.setVideoPath(str);
        }

        public void stop() {
            Log.m105924i("Finder.VideoView", "[stop] " + this.f161937L.getDefaultLog());
            super.stop();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoView$c */
    public static final class C56529c extends C87413o implements C32224a<C55048e> {

        /* renamed from: d */
        public static final C56529c f161938d = new C56529c();

        public C56529c() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0();
        }
    }

    public FinderVideoView(Context context) {
        super(context);
        setReporter(new C56527a(this));
        C37521f.f99374d.mo61151E();
        this.f161933t1 = -1;
        this.f161935v1 = 3;
    }

    /* access modifiers changed from: private */
    public final String getDefaultLog() {
        StringBuilder sb = new StringBuilder();
        sb.append("videoView=");
        sb.append(hashCode());
        sb.append("->textureView=");
        sb.append(this.f283595q.hashCode());
        sb.append(" mediaId=");
        C59673q2 q2Var = this.f161921h1;
        sb.append(q2Var != null ? q2Var.f170493c : null);
        return sb.toString();
    }

    private final C55048e getPreloadModel() {
        return (C55048e) this.f161920g1.getValue();
    }

    /* renamed from: E */
    public C96875r0 mo79608E(Context context) {
        this.f283601w = 1;
        C56528b bVar = new C56528b(context, this);
        bVar.setIsOnlineVideoType(true);
        bVar.setNeedResetExtractor(true);
        this.f161930q1 = bVar;
        return bVar;
    }

    /* renamed from: J */
    public int mo79393J() {
        return C0966R.C0971layout.a6b;
    }

    /* renamed from: K */
    public String mo76634K() {
        return "mediaId:" + getMediaId() + hashCode();
    }

    /* renamed from: Q */
    public boolean mo79609Q(double d) {
        return super.mo79609Q(d);
    }

    /* renamed from: W */
    public void mo79610W(int i) {
        super.mo79610W(i);
        if (this.f161933t1 != i) {
            C59684w2 w2Var = this.f161928o1;
            if (w2Var != null) {
                C59673q2 q2Var = this.f161921h1;
                w2Var.mo78294c(q2Var != null ? q2Var.f170494d : null, i, this.f161934u1);
            }
            this.f161933t1 = i;
        }
    }

    /* renamed from: Y */
    public boolean mo79611Y(int i, PInt pInt, PInt pInt2) {
        int i2 = i;
        PInt pInt3 = pInt;
        PInt pInt4 = pInt2;
        C87412m.m108594g(pInt3, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(pInt4, "end");
        pInt3.value = Math.max(i2, this.f267495W0);
        int i3 = this.f267486Q0;
        if (i3 == 1) {
            pInt3.value = i2;
            pInt4.value = this.f161935v1 + i2 + 1;
        }
        int i4 = this.f161935v1;
        MMVideoView.C55393b bVar = this.f267500b1;
        this.f161935v1 = i4 + bVar.f157764a;
        int i5 = 0;
        if (i3 == 2) {
            int i6 = i2 - 8;
            pInt3.value = i6;
            if (i6 < 0) {
                pInt3.value = 0;
            }
            pInt4.value = pInt3.value + this.f267496X0 + 8;
        }
        if (i3 == 3 || i3 == 4) {
            pInt3.value = this.f267495W0;
            pInt4.value = this.f267496X0 + i2 + 1 + bVar.f157765b;
            i5 = Math.min(C60641c.m70921b((((float) getPreloadModel().f154549d) / 100.0f) * ((float) this.f267488S0)), getPreloadModel().f154555j);
            if (i5 <= 0) {
                int i7 = this.f267488S0;
                if (((float) pInt4.value) < ((float) i7) / 2.0f) {
                    pInt4.value = (int) ((((float) i7) / 2.0f) + ((float) 1));
                }
            } else if (pInt4.value < i5) {
                pInt4.value = i5 + 1;
            }
        }
        int i8 = pInt4.value;
        int i9 = this.f267488S0;
        if (i8 >= i9 + 1) {
            pInt4.value = i9 + 1;
        }
        int i15 = pInt4.value;
        int i16 = pInt3.value;
        if (i15 < i16) {
            pInt4.value = i16 + this.f267500b1.f157765b;
            Log.m105924i("Finder.VideoView", mo76634K() + " [start:end]=[" + pInt3.value + XVFSFile.PATH_SEPARATOR_CHAR + pInt4.value + "],playStatus=" + this.f267486Q0 + ",playTime=" + i2 + ",cachePlayTime=" + this.f267495W0 + ",cacheTimeStep=" + this.f267496X0 + ",timeDuration=" + this.f267488S0 + ",targetSecond=" + i5 + ",cdnMediaId=" + this.f267494W);
            return true;
        }
        Log.m105924i("Finder.VideoView", mo76634K() + " [start:end]=[" + pInt3.value + XVFSFile.PATH_SEPARATOR_CHAR + pInt4.value + "],playStatus=" + this.f267486Q0 + ",playTime=" + i2 + ",cachePlayTime=" + this.f267495W0 + ",cacheTimeStep=" + this.f267496X0 + ",timeDuration=" + this.f267488S0 + ",targetSecond=" + i5 + ",cdnMediaId=" + this.f267494W);
        return true;
    }

    /* renamed from: Z */
    public boolean mo79612Z(int i) {
        boolean z;
        boolean z2;
        C65339f fVar;
        MediaPreloadCore mediaPreloadCore;
        C65339f fVar2;
        if (this.f267506y0 == 3) {
            return true;
        }
        PInt pInt = new PInt();
        PInt pInt2 = new PInt();
        try {
            PInt pInt3 = new PInt();
            PInt pInt4 = new PInt();
            if (i != 0 || (fVar2 = this.f267487R0) == null) {
                z2 = false;
            } else {
                pInt4.value = 0;
                pInt3.value = 0;
                z2 = fVar2.mo89450e(i + 1, pInt3, pInt4);
            }
            int i2 = i + 1;
            if (z2) {
                i2 = pInt4.value + 1;
            }
            if (this.f267492V == null || (fVar = this.f267487R0) == null || !fVar.mo89449d(i, i2, pInt, pInt2)) {
                return false;
            }
            z = this.f267492V.mo36229c(this.f267494W, pInt.value, pInt2.value);
            if (z) {
                try {
                    this.f267495W0 = Math.max(i2, this.f267495W0);
                } catch (Exception e) {
                    e = e;
                    Log.m105921e(this.f283586e, "%s check video data error %s ", mo76634K(), e.toString());
                    return z;
                }
            } else {
                this.f267495W0 = i;
            }
            FinderVideoCore finderVideoCore = this.f161932s1;
            if (!(finderVideoCore == null || (mediaPreloadCore = finderVideoCore.f161830p) == null)) {
                mediaPreloadCore.mo78445f3(getMediaId(), this.f267495W0, this.f267488S0);
            }
            Log.m105925i("Finder.VideoView", "ret=%s %s checkCanPlay range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", Boolean.valueOf(z), mo76634K(), Integer.valueOf(pInt3.value), Integer.valueOf(pInt4.value), Integer.valueOf(i), Integer.valueOf(this.f267486Q0), Integer.valueOf(this.f267495W0), Integer.valueOf(this.f267496X0), this.f267494W);
            return z;
        } catch (Exception e2) {
            e = e2;
            z = false;
            Log.m105921e(this.f283586e, "%s check video data error %s ", mo76634K(), e.toString());
            return z;
        }
    }

    /* renamed from: a */
    public boolean mo79613a(double d, boolean z) {
        return mo79629i0((int) d, z);
    }

    /* renamed from: b */
    public void mo79614b() {
        super.mo79614b();
    }

    /* renamed from: b0 */
    public C65339f mo79615b0() {
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        int i = C37521f.f99332Y;
        if (i == 1) {
            return new C102022j();
        }
        fVar.getClass();
        return i == 2 ? new C102020i() : new C60908a();
    }

    /* renamed from: c */
    public void mo79616c() {
        super.mo79616c();
        this.f161923j1 = false;
        this.f161921h1 = null;
        this.f161922i1 = null;
        Log.m105924i("Finder.VideoView", "[onUIDestroy] " + getDefaultLog() + "  " + "");
    }

    /* renamed from: c0 */
    public void mo76635c0() {
    }

    /* renamed from: e */
    public void mo76638e(String str, long j, long j2) {
        if (Util.isEqual(this.f267494W, str)) {
            Log.m105925i("Finder.VideoView", "%s download  onPlayProgress [%d, %d] pauseByLoadData=%s playStatus=%s", mo76634K(), Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(this.f267493V0), Integer.valueOf(this.f267486Q0));
            if (this.f267493V0 && this.f267486Q0 == 3) {
                mo127232a0(getCurrPosSec());
            }
        }
    }

    /* renamed from: f */
    public void mo79617f() {
        super.mo79617f();
    }

    public final Bitmap getBitmap() {
        SynchronizedVideoPlayTextureView synchronizedVideoPlayTextureView = this.f161930q1;
        if (synchronizedVideoPlayTextureView != null) {
            return synchronizedVideoPlayTextureView.getBitmap();
        }
        return null;
    }

    public int getCurrPosSec() {
        return super.getCurrPosSec();
    }

    public final C59684w2 getLifecycle() {
        return this.f161928o1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f170493c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getMediaId() {
        /*
            r1 = this;
            gr1.q2 r0 = r1.f161921h1
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f170493c
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderVideoView.getMediaId():java.lang.String");
    }

    public final C59673q2 getMediaInfo() {
        return this.f161921h1;
    }

    public final C59674r2 getMuteListener() {
        return this.f161927n1;
    }

    public int getVideoDurationSec() {
        return super.getVideoDurationSec();
    }

    public final C48889bp1 getVideoMatrix() {
        return this.f161922i1;
    }

    public final String getVideoMediaId() {
        C59673q2 q2Var = this.f161921h1;
        if (q2Var != null) {
            return q2Var.f170493c;
        }
        return null;
    }

    public final boolean get_isPreviewing() {
        return this.f161925l1;
    }

    /* renamed from: h0 */
    public void mo79628h0() {
        super.mo79628h0();
        this.f161935v1 = 3;
    }

    /* renamed from: i0 */
    public boolean mo79629i0(int i, boolean z) {
        Log.m105924i("Finder.VideoView", "[seekTo] time=" + i + " afterSeekPlay=" + z + ' ' + getDefaultLog());
        this.f161929p1.mo136891c(new C59659i2());
        return super.mo79629i0(i, z);
    }

    public boolean isPlaying() {
        return super.isPlaying();
    }

    /* renamed from: k0 */
    public void mo79396k0() {
    }

    /* renamed from: l0 */
    public final void mo79631l0(String str, String str2, String str3, C64689rq2 rq22, C62369u0 u0Var, FeedData feedData) {
        C59673q2 q2Var = new C59673q2(str, str2, str3, rq22, u0Var, feedData);
        this.f161921h1 = q2Var;
        boolean z = true;
        if (rq22 == null || !rq22.f185280t) {
            z = false;
        }
        if (z) {
            C64477jr2 jr22 = rq22.f185281u;
            this.f161922i1 = jr22 != null ? jr22.f183831e : null;
            Log.m105924i("Finder.VideoView", "[setVideoMedia] needCrop, " + this.f161922i1);
        }
        mo79396k0();
        mo76636h(false, str, 0);
        this.f267504p0 = q2Var.f170492b;
        this.f267494W = q2Var.f170493c;
        Log.m105924i("Finder.VideoView", "[setVideoMedia] " + getDefaultLog());
    }

    /* renamed from: m0 */
    public final void mo79632m0(C62369u0 u0Var, boolean z, FeedData feedData) {
        C87412m.m108594g(u0Var, "video");
        C87412m.m108594g(feedData, "feedData");
        if (z) {
            String str = u0Var.mo87421f().f185266d;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            String b = ((C62367r0) u0Var).mo11841b();
            C64477jr2 jr22 = u0Var.mo87421f().f185281u;
            this.f161922i1 = jr22 != null ? jr22.f183831e : null;
            mo79631l0("", str2, b, (C64689rq2) null, u0Var, feedData);
            return;
        }
        C62367r0 r0Var = (C62367r0) u0Var;
        mo79631l0(r0Var.getUrl(), r0Var.getPath(), r0Var.mo11841b(), u0Var.mo87421f(), u0Var, feedData);
    }

    public void onCompletion() {
        C59684w2 w2Var;
        C59673q2 q2Var = this.f161921h1;
        if (q2Var != null) {
            C59684w2 w2Var2 = this.f161928o1;
            if (w2Var2 != null) {
                w2Var2.mo78294c(q2Var.f170494d, getVideoDurationSec(), getVideoDurationSec());
            }
            if (this.f267502d1 && (w2Var = this.f161928o1) != null) {
                w2Var.mo78299h(q2Var.f170494d);
            }
        }
        super.onCompletion();
    }

    public boolean pause() {
        this.f161929p1.mo136889a();
        Log.m105924i("Finder.VideoView", "[pause] " + getDefaultLog() + "  " + "");
        C59684w2 w2Var = this.f161928o1;
        if (w2Var != null) {
            C59673q2 q2Var = this.f161921h1;
            C59684w2.C59685a.m69601a(w2Var, q2Var != null ? q2Var.f170494d : null, (C61575s) null, 2, (Object) null);
        }
        return super.pause();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: te3.rq2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean play() {
        /*
            r8 = this;
            boolean r0 = r8.f161923j1
            r1 = 0
            java.lang.String r2 = "Finder.VideoView"
            r3 = 0
            if (r0 != 0) goto L_0x002f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "[play] unFocused. "
            r0.append(r4)
            java.lang.String r4 = r8.getDefaultLog()
            r0.append(r4)
            java.lang.String r4 = " mediaId="
            r0.append(r4)
            gr1.q2 r4 = r8.f161921h1
            if (r4 == 0) goto L_0x0024
            java.lang.String r1 = r4.f170493c
        L_0x0024:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r3
        L_0x002f:
            int r0 = r8.f161931r1
            r4 = 1
            if (r0 != r4) goto L_0x0072
            r8.f267506y0 = r4
            r8.f161931r1 = r3
            com.tencent.mm.modelvideo.a r0 = r8.f267492V
            if (r0 == 0) goto L_0x0047
            java.lang.String r5 = r8.getVideoMediaId()
            java.lang.String r6 = r8.f267504p0
            java.lang.String r7 = r8.f283616Q
            r0.mo36231f(r5, r6, r7)
        L_0x0047:
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r8.f283595q
            int r0 = r0.getCurrentPosition()
            int r0 = r0 / 1000
            r8.mo127232a0(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "continue to download... mediaId="
            r5.append(r6)
            java.lang.String r6 = r8.getVideoMediaId()
            r5.append(r6)
            java.lang.String r6 = " playSec="
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x0072:
            boolean r0 = r8.f161923j1
            if (r0 == 0) goto L_0x009b
            boolean r0 = super.play()
            if (r0 == 0) goto L_0x009b
            eb0.e r0 = r8.f161929p1
            gr1.i2 r2 = new gr1.i2
            r2.<init>()
            r0.mo136891c(r2)
            com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView r0 = r8.f161930q1
            if (r0 == 0) goto L_0x008d
            r0.setOneTimeVideoTextureUpdateCallback(r8)
        L_0x008d:
            gr1.w2 r0 = r8.f161928o1
            if (r0 == 0) goto L_0x009a
            gr1.q2 r2 = r8.f161921h1
            if (r2 == 0) goto L_0x0097
            te3.rq2 r1 = r2.f170494d
        L_0x0097:
            r0.mo77475e(r1)
        L_0x009a:
            return r4
        L_0x009b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderVideoView.play():boolean");
    }

    /* renamed from: q */
    public final int mo79635q() {
        Log.m105924i("Finder.VideoView", "[pauseWithCancel] " + getDefaultLog() + " downloadStatus=" + this.f267506y0 + ", isPrepared=" + this.f283572B);
        this.f161931r1 = this.f267506y0;
        C55394a aVar = this.f267492V;
        if (aVar != null) {
            aVar.mo36227a(getVideoMediaId());
        }
        pause();
        return 0;
    }

    /* renamed from: r */
    public void mo79636r() {
        super.mo79636r();
        C59684w2 w2Var = this.f161928o1;
        if (w2Var != null) {
            C59673q2 q2Var = this.f161921h1;
            w2Var.mo78304m(q2Var != null ? q2Var.f170494d : null, 0);
        }
    }

    public void setIMMVideoViewCallback(C96814a.C57541b bVar) {
        C87412m.m108594g(bVar, "_callback");
        super.setIMMVideoViewCallback(bVar);
    }

    public final void setInterceptDetach(boolean z) {
        SynchronizedVideoPlayTextureView synchronizedVideoPlayTextureView = this.f161930q1;
        if (synchronizedVideoPlayTextureView != null) {
            synchronizedVideoPlayTextureView.setInterceptDetach(z);
        }
    }

    public final void setLifecycle(C59684w2 w2Var) {
        this.f161928o1 = w2Var;
    }

    public void setLoop(boolean z) {
        super.setLoop(z);
    }

    public final void setMediaInfo(C59673q2 q2Var) {
        this.f161921h1 = q2Var;
    }

    public void setMute(boolean z) {
        super.setMute(z);
        C59674r2 r2Var = this.f161927n1;
        if (r2Var != null) {
            r2Var.mo79550b(z);
        }
    }

    public final void setMuteListener(C59674r2 r2Var) {
        this.f161927n1 = r2Var;
    }

    public final void setNeverStart(boolean z) {
        this.f161926m1 = z;
    }

    public final void setShouldPlayResume(boolean z) {
        this.f161924k1 = z;
    }

    public final void setVideoCore(FinderVideoCore finderVideoCore) {
        this.f161932s1 = finderVideoCore;
    }

    public final void setVideoMatrix(C48889bp1 bp12) {
        this.f161922i1 = bp12;
    }

    public void setVideoTotalTime(int i) {
        super.setVideoTotalTime(i);
        this.f161934u1 = i;
    }

    public final void setViewFocused(boolean z) {
        this.f161923j1 = z;
    }

    public final void set_isPreviewing(boolean z) {
        this.f161925l1 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0132, code lost:
        if (r8 == 0) goto L_0x0134;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r14 = this;
            boolean r0 = r14.f161923j1
            java.lang.String r1 = "Finder.VideoView"
            if (r0 != 0) goto L_0x001d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "isViewFocused="
            r0.append(r2)
            boolean r2 = r14.f161923j1
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            return
        L_0x001d:
            gr1.q2 r0 = r14.f161921h1
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "mediaInfo is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            return
        L_0x0027:
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r14.f283595q
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "videoView is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            return
        L_0x0032:
            int r0 = r14.f267486Q0
            r2 = 3
            r3 = 1
            r4 = 0
            if (r0 != r2) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            if (r0 == 0) goto L_0x003f
            return
        L_0x003f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[start#1] isNeverStart="
            r5.append(r6)
            boolean r6 = r14.f161926m1
            r5.append(r6)
            java.lang.String r6 = " isViewFocused="
            r5.append(r6)
            boolean r6 = r14.f161923j1
            r5.append(r6)
            java.lang.String r6 = " isPlaying="
            r5.append(r6)
            r5.append(r0)
            r0 = 32
            r5.append(r0)
            java.lang.String r6 = r14.getDefaultLog()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            boolean r5 = r14.f161926m1
            if (r5 != 0) goto L_0x007b
            r14.play()
            return
        L_0x007b:
            gr1.w2 r5 = r14.f161928o1
            r6 = 0
            if (r5 == 0) goto L_0x008b
            gr1.q2 r7 = r14.f161921h1
            if (r7 == 0) goto L_0x0087
            te3.rq2 r8 = r7.f170494d
            goto L_0x0088
        L_0x0087:
            r8 = r6
        L_0x0088:
            r5.mo78305n(r8, r7, r4)
        L_0x008b:
            gr1.q2 r5 = r14.f161921h1
            if (r5 != 0) goto L_0x0096
            java.lang.String r0 = "[checkCompleted] mediaInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            goto L_0x0136
        L_0x0096:
            te3.rq2 r7 = r5.f170494d
            if (r7 != 0) goto L_0x00a1
            java.lang.String r0 = "[checkCompleted] localFinderMedia is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            goto L_0x0134
        L_0x00a1:
            wp1.g r7 = wp1.C66167g.f190173a
            java.lang.String r8 = r5.f170493c
            cm1.f1 r7 = r7.mo90234c(r8, r3)
            java.lang.String r8 = r5.f170492b
            java.lang.String r9 = "path"
            gy3.C87412m.m108594g(r8, r9)
            long r9 = r7.field_totalSize
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x00c0
            long r11 = r7.field_cacheSize
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x00c0
            r9 = 1
            goto L_0x00c1
        L_0x00c0:
            r9 = 0
        L_0x00c1:
            if (r9 != 0) goto L_0x00c5
            r8 = 1
            goto L_0x00ce
        L_0x00c5:
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r8 != 0) goto L_0x00cd
            r8 = 2
            goto L_0x00ce
        L_0x00cd:
            r8 = 0
        L_0x00ce:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "[checkCompleted] isDownloadFinishAndCheckFile="
            r9.append(r10)
            r9.append(r8)
            java.lang.String r10 = " cache="
            r9.append(r10)
            r9.append(r7)
            java.lang.String r10 = " path="
            r9.append(r10)
            java.lang.String r10 = r5.f170492b
            r9.append(r10)
            r9.append(r0)
            java.lang.String r0 = r14.getDefaultLog()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            boolean r0 = com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore.f160304p
            if (r0 == 0) goto L_0x0132
            com.tencent.mm.autogen.events.PreloadProcessChangeEvent r0 = new com.tencent.mm.autogen.events.PreloadProcessChangeEvent
            r0.<init>()
            com.tencent.mm.autogen.events.PreloadProcessChangeEvent$a r9 = r0.f154859d
            te3.rq2 r5 = r5.f170494d
            if (r5 == 0) goto L_0x0111
            java.lang.String r5 = r5.f185275p
            if (r5 != 0) goto L_0x0113
        L_0x0111:
            java.lang.String r5 = ""
        L_0x0113:
            r9.f154860a = r5
            java.lang.String r5 = r7.field_fileFormat
            r9.f154865f = r5
            boolean r5 = r7.field_hasPlayed
            r9.f154864e = r5
            if (r8 != 0) goto L_0x012c
            r5 = 1120403456(0x42c80000, float:100.0)
            long r10 = r7.field_cacheSize
            float r10 = (float) r10
            float r10 = r10 * r5
            long r11 = r7.field_totalSize
            float r5 = (float) r11
            float r10 = r10 / r5
            int r5 = (int) r10
            goto L_0x012d
        L_0x012c:
            r5 = 0
        L_0x012d:
            r9.f154861b = r5
            r0.publish()
        L_0x0132:
            if (r8 != 0) goto L_0x0136
        L_0x0134:
            r0 = 1
            goto L_0x0137
        L_0x0136:
            r0 = 0
        L_0x0137:
            if (r0 == 0) goto L_0x01ca
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r14.f283595q
            java.lang.String r0 = r0.getVideoPath()
            gr1.q2 r5 = r14.f161921h1
            gy3.C87412m.m108591d(r5)
            java.lang.String r5 = r5.f170492b
            boolean r0 = gy3.C87412m.m108589b(r0, r5)
            if (r0 != 0) goto L_0x0158
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r14.f283595q
            gr1.q2 r5 = r14.f161921h1
            gy3.C87412m.m108591d(r5)
            java.lang.String r5 = r5.f170492b
            r0.setVideoPath(r5)
        L_0x0158:
            r14.f267492V = r6
            r14.f267506y0 = r2
            r14.f161931r1 = r4
            com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView r0 = r14.f161930q1
            if (r0 == 0) goto L_0x0165
            r0.setIsOnlineVideoType(r4)
        L_0x0165:
            boolean r0 = r14.play()
            if (r0 != 0) goto L_0x01a6
            com.tencent.mm.pluginsdk.ui.tools.r0 r2 = r14.f283595q
            java.lang.String r2 = r2.getVideoPath()
            if (r2 == 0) goto L_0x017b
            int r2 = r2.length()
            if (r2 != 0) goto L_0x017a
            goto L_0x017b
        L_0x017a:
            r3 = 0
        L_0x017b:
            if (r3 == 0) goto L_0x01a6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[start] ERROR! videoPath="
            r2.append(r3)
            com.tencent.mm.pluginsdk.ui.tools.r0 r3 = r14.f283595q
            java.lang.String r3 = r3.getVideoPath()
            r2.append(r3)
            java.lang.String r3 = " completedPath="
            r2.append(r3)
            gr1.q2 r3 = r14.f161921h1
            gy3.C87412m.m108591d(r3)
            java.lang.String r3 = r3.f170492b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
        L_0x01a6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[start] ret="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " has download! local path:"
            r2.append(r0)
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r14.f283595q
            java.lang.String r0 = r0.getVideoPath()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x0243
        L_0x01ca:
            com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView r0 = r14.f161930q1
            if (r0 == 0) goto L_0x01d1
            r0.setIsOnlineVideoType(r3)
        L_0x01d1:
            com.tencent.mm.modelvideo.a r0 = r14.f267492V
            if (r0 == 0) goto L_0x020b
            int r0 = r14.f267506y0
            if (r0 == r3) goto L_0x020b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[start] need to download..."
            r0.append(r2)
            java.lang.String r2 = r14.getDefaultLog()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r14.mo129179R()
            r14.setDownloadStatus(r3)
            com.tencent.mm.modelvideo.a r0 = r14.f267492V
            r0.mo36228b(r14)
            com.tencent.mm.modelvideo.a r0 = r14.f267492V
            java.lang.String r1 = r14.f267494W
            java.lang.String r2 = r14.f267504p0
            java.lang.String r3 = r14.f283616Q
            r0.mo36231f(r1, r2, r3)
            r14.mo135076O()
            goto L_0x0243
        L_0x020b:
            r14.mo129179R()
            com.tencent.mm.modelvideo.a r0 = r14.f267492V
            if (r0 != 0) goto L_0x022b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "why proxy is null! "
            r0.append(r2)
            java.lang.String r2 = r14.getDefaultLog()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x022b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[start] wait for download..."
            r0.append(r2)
            java.lang.String r2 = r14.getDefaultLog()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x0243:
            r6 = 600(0x258, double:2.964E-321)
            r0 = 1
            int r2 = r14.getReportIdkey()
            long r2 = (long) r2
            long r8 = r2 + r0
            r10 = 1
            r12 = 0
            r5 = r14
            r5.mo135073G(r6, r8, r10, r12)
            r14.f161926m1 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderVideoView.start():void");
    }

    public void stop() {
        super.stop();
        C59684w2 w2Var = this.f161928o1;
        if (w2Var != null) {
            C59684w2.C59685a.m69602b(w2Var, this.f161921h1, (C61575s) null, 2, (Object) null);
        }
        this.f161926m1 = true;
        this.f161921h1 = null;
        this.f161922i1 = null;
        this.f161923j1 = false;
        this.f161931r1 = 0;
        Log.m105924i("Finder.VideoView", "[stop] " + getDefaultLog() + "  " + "");
    }

    public FinderVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setReporter(new C56527a(this));
        C37521f.f99374d.mo61151E();
        this.f161933t1 = -1;
        this.f161935v1 = 3;
    }
}
