package com.tencent.p014mm.plugin.p081mv.p082ui.open.text_status;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import g03.C107680o;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C32799i;
import hb2.C59822f;
import java.util.LinkedList;
import jb2.C46455a;
import jb2.C46460i;
import jb2.C46463n;
import jb2.C46466r;
import kotlin.Metadata;
import la2.C99364n;
import lu3.C34379c;
import m03.C61426c;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import pb2.C62252a;
import pb2.C62258c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49085d23;
import te3.C50008jm0;
import te3.C50338m13;
import te3.C64417hb1;
import te3.C64488kb1;
import te3.C64719t23;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0002R#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/open/text_status/MusicMvView;", "", "Landroid/widget/RelativeLayout;", "Lrx3/b0;", "getSongIdWithCheckPermission", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "g", "Lrx3/g;", "getVideoContainer", "()Landroid/widget/FrameLayout;", "videoContainer", "Lpb2/a;", "i", "getLyricManager", "()Lpb2/a;", "lyricManager", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.open.text_status.MusicMvView */
public final class MusicMvView extends RelativeLayout {

    /* renamed from: d */
    public C61426c f163126d;

    /* renamed from: e */
    public final C59822f f163127e;

    /* renamed from: f */
    public C64488kb1 f163128f;

    /* renamed from: g */
    public final C13601g f163129g;

    /* renamed from: h */
    public boolean f163130h;

    /* renamed from: i */
    public final C13601g f163131i;

    /* renamed from: j */
    public final C11385n f163132j;

    /* renamed from: com.tencent.mm.plugin.mv.ui.open.text_status.MusicMvView$b */
    public static final class C42585b implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ MusicMvView f115217d;

        public C42585b(MusicMvView musicMvView) {
            this.f115217d = musicMvView;
        }

        public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C50338m13 m132;
            C49085d23 d232;
            C46463n nVar;
            C50008jm0 jm02;
            int i3;
            if ((yVar instanceof C46455a) && (i3 = ((C46455a) yVar).f125136d) != 0 && i3 != this.f115217d.hashCode()) {
                Log.m105924i("MicroMsg.Ts.MusicMvView", "not the same page of netscene");
            } else if (yVar instanceof C46463n) {
                Log.m105924i("MicroMsg.Ts.MusicMvView", "NetSceneMusicMvGetFinderFeedDetail, errType:" + i + ", errCode:" + i2 + ", errMsg:" + str);
                if (i == 0 && i2 == 0 && (jm02 = nVar.f125173r) != null) {
                    MusicMvView.m65672b(this.f115217d, jm02, (nVar = (C46463n) yVar).f125169n);
                }
            } else if (yVar instanceof C46466r) {
                Log.m105924i("MicroMsg.Ts.MusicMvView", "NetSceneMusicMvGetSongStatus, errType:" + i + ", errCode:" + i2 + ", errMsg:" + str);
                if (i == 0 && i2 == 0 && (d232 = ((C46466r) yVar).f125186o) != null) {
                    MusicMvView musicMvView = this.f115217d;
                    String str2 = d232.f132076d;
                    if (str2 != null) {
                        if (!(str2.length() > 0)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            Log.m105924i("MicroMsg.Ts.MusicMvView", "NetSceneMusicMvGetSongStatus, lyric length:" + str2.length());
                            musicMvView.getLyricManager().mo87310c(str2);
                        }
                    }
                }
            } else if (yVar instanceof C46460i) {
                Log.m105924i("MicroMsg.Ts.MusicMvView", "NetSceneMusicMvCheckPermission, errType:" + i + ", errCode:" + i2 + ", errMsg:" + str);
                if (i == 0 && i2 == 0 && (m132 = ((C46460i) yVar).f125157o) != null) {
                    MusicMvView musicMvView2 = this.f115217d;
                    musicMvView2.f163128f.f183909i = m132.f137752f;
                    Log.m105924i("MicroMsg.Ts.MusicMvView", "NetSceneMusicMvCheckPermission songId:" + m132.f137752f + " mvPostPermissionBit:" + m132.f137750d + " statusVerifyInfo:" + m132.f137751e);
                    C64488kb1 kb12 = musicMvView2.f163128f;
                    Log.m105924i("MicroMsg.Ts.MusicMvView", "getSongDetailInfo songId:" + kb12.f183909i + " appId:" + kb12.f183907g + " webUrl:" + kb12.f183908h);
                    C86709a0.m107524d().mo123460f(new C46466r(kb12, musicMvView2.hashCode()));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.open.text_status.MusicMvView$d */
    public static final class C42586d extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ MusicMvView f115218d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42586d(MusicMvView musicMvView) {
            super(0);
            this.f115218d = musicMvView;
        }

        public Object invoke() {
            return (FrameLayout) this.f115218d.findViewById(C0966R.C0970id.f359485l50);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.open.text_status.MusicMvView$a */
    public static final class C56959a extends C87413o implements C32224a<C62252a> {

        /* renamed from: d */
        public final /* synthetic */ Context f163133d;

        /* renamed from: e */
        public final /* synthetic */ MusicMvView f163134e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56959a(Context context, MusicMvView musicMvView) {
            super(0);
            this.f163133d = context;
            this.f163134e = musicMvView;
        }

        public Object invoke() {
            return new C62252a(this.f163133d, this.f163134e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.open.text_status.MusicMvView$c */
    public static final class C56960c implements C107680o {

        /* renamed from: a */
        public final /* synthetic */ MusicMvView f163135a;

        public C56960c(MusicMvView musicMvView) {
            this.f163135a = musicMvView;
        }

        public void onPause() {
            C59822f fVar = this.f163135a.f163127e;
            if (fVar.f170774v > 0) {
                long j = fVar.f170775w;
                long c = C31543z5.m39453c();
                C59822f fVar2 = this.f163135a.f163127e;
                fVar.f170775w = j + (c - fVar2.f170774v);
                fVar2.f170774v = 0;
            }
        }

        public void onResume() {
            C59822f fVar = this.f163135a.f163127e;
            if (fVar.f170774v > 0) {
                fVar.f170775w += C31543z5.m39453c() - this.f163135a.f163127e.f170774v;
            }
            this.f163135a.f163127e.f170774v = C31543z5.m39453c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f163127e = new C59822f();
        this.f163128f = new C64488kb1();
        this.f163129g = C36568h.m40985a(new C42586d(this));
        this.f163131i = C36568h.m40985a(new C56959a(context, this));
        View.inflate(context, C0966R.C0971layout.c9h, this);
        this.f163132j = new C42585b(this);
    }

    /* renamed from: b */
    public static final void m65672b(MusicMvView musicMvView, C50008jm0 jm02, int i) {
        FinderObject finderObject;
        C64417hb1 hb12;
        C64488kb1 kb12;
        String str;
        musicMvView.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("handleGetCommentDetailResponse, musicMv.hashCode() == musicMvHashCode:");
        boolean z = true;
        sb.append(musicMvView.f163127e.hashCode() == i);
        sb.append(", musicMvHashCode:");
        sb.append(i);
        Log.m105924i("MicroMsg.Ts.MusicMvView", sb.toString());
        if (musicMvView.f163127e.hashCode() == i && (finderObject = jm02.f136184e) != null) {
            C59822f.f170752A.mo84777b(finderObject, musicMvView.f163127e);
            C59822f fVar = musicMvView.f163127e;
            LinkedList<FinderObject> linkedList = jm02.f136192p;
            C87412m.m108593f(linkedList, "resp.refObjectList");
            fVar.getClass();
            fVar.f170767o = linkedList;
            FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
            if (!(finderObjectDesc == null || (hb12 = finderObjectDesc.mvInfo) == null || (kb12 = hb12.f183456e) == null || (str = kb12.f183910j) == null)) {
                if (str.length() <= 0) {
                    z = false;
                }
                if (!z) {
                    str = null;
                }
                if (str != null) {
                    musicMvView.getLyricManager().mo87310c(str);
                }
            }
            musicMvView.mo80410i(0);
        }
    }

    /* access modifiers changed from: private */
    public final C62252a getLyricManager() {
        return (C62252a) ((C36570n) this.f163131i).getValue();
    }

    private final void getSongIdWithCheckPermission() {
        C86709a0.m107524d().mo123460f(new C46460i(this.f163128f, hashCode()));
    }

    private final FrameLayout getVideoContainer() {
        return (FrameLayout) ((C36570n) this.f163129g).getValue();
    }

    /* renamed from: c */
    public final void mo80404c() {
        C86709a0.m107524d().mo123455a(3763, this.f163132j);
        C86709a0.m107524d().mo123455a(5286, this.f163132j);
        C86709a0.m107524d().mo123455a(5292, this.f163132j);
    }

    /* renamed from: d */
    public void mo80405d() {
        Log.m105924i("MicroMsg.Ts.MusicMvView", "onMvPause");
        C61426c cVar = this.f163126d;
        if (cVar != null) {
            cVar.pause();
        }
        this.f163130h = true;
        C62252a lyricManager = getLyricManager();
        lyricManager.getClass();
        Log.m105924i("MicroMsg.Mv.MusicMvLyric", "onPause" + C99364n.m129616h().mo138822a());
        C99364n.m129616h().mo138828g(lyricManager.f176964h);
    }

    /* renamed from: e */
    public void mo80406e() {
        Log.m105924i("MicroMsg.Ts.MusicMvView", "onResume, needResumePosition:" + this.f163130h);
        if (!this.f163130h) {
            mo80410i(0);
        } else {
            C61426c cVar = this.f163126d;
            if (cVar != null) {
                cVar.resume();
            }
        }
        this.f163130h = false;
        C62252a lyricManager = getLyricManager();
        lyricManager.getClass();
        Log.m105924i("MicroMsg.Mv.MusicMvLyric", "onResume" + C99364n.m129616h().mo138822a());
        C99364n.m129616h().mo138823b(lyricManager.f176964h);
    }

    /* renamed from: f */
    public void mo80407f(C64488kb1 kb12) {
        C87412m.m108594g(kb12, "songInfo");
        StringBuilder sb = new StringBuilder();
        sb.append("onViewCreateWithSongInfo，songName:");
        sb.append(kb12.f183904d);
        sb.append(" lyric length:");
        String str = kb12.f183910j;
        sb.append(str != null ? Integer.valueOf(str.length()) : null);
        Log.m105924i("MicroMsg.Ts.MusicMvView", sb.toString());
        this.f163128f = kb12;
        getLyricManager().mo87309b();
        getLyricManager().mo87310c(kb12.f183910j);
        getSongIdWithCheckPermission();
        mo80404c();
    }

    /* renamed from: g */
    public void mo80408g(C64719t23 t232) {
        C13598b0 b0Var;
        C34379c<?> cVar;
        C64719t23 t233 = t232;
        C87412m.m108594g(t233, "mvInfo");
        StringBuilder sb = new StringBuilder();
        sb.append("onViewCreateWithMvShareObject, mvInfoObjId:");
        sb.append(t233.f185459d);
        sb.append(", mvInfoSongName:");
        sb.append(t233.f185473u);
        sb.append(", mvInfoLyricLength:");
        String str = t233.f185474v;
        sb.append(str != null ? Integer.valueOf(str.length()) : null);
        Log.m105924i("MicroMsg.Ts.MusicMvView", sb.toString());
        C59822f fVar = this.f163127e;
        fVar.f170755c = Long.valueOf(C61926c.m72671P(t233.f185459d));
        fVar.f170756d = t233.f185460e;
        String str2 = t233.f185462g;
        if (str2 == null) {
            str2 = "";
        }
        fVar.f170758f = str2;
        String str3 = fVar.f170757e;
        boolean z = false;
        if (str3 == null || str3.length() == 0) {
            fVar.f170757e = t233.f185461f;
        }
        Long l = fVar.f170755c;
        String str4 = fVar.f170756d;
        if (l == null || str4 == null) {
            b0Var = null;
        } else {
            long longValue = l.longValue();
            C59822f fVar2 = this.f163127e;
            Log.m105924i("MicroMsg.Ts.MusicMvView", "getMvDetailInfo mvObjectId:" + longValue + " mvNonceId:" + str4 + " localId:" + fVar2.f170753a);
            C50008jm0 c = C32799i.f89226a.mo58808c(longValue, str4);
            if (c != null) {
                Log.m105924i("MicroMsg.Ts.MusicMvView", "getMvDetailInfo hit cache");
                cVar = ((C119157j) C119157j.f356862d).mo183895z(new C62258c(this, c, fVar2));
            } else {
                cVar = null;
            }
            if (cVar == null) {
                C89137b0 d = C86709a0.m107524d();
                C46463n nVar = r8;
                C46463n nVar2 = new C46463n(longValue, str4, fVar2.hashCode(), hashCode());
                d.mo123460f(nVar);
            }
            Log.m105924i("MicroMsg.Ts.MusicMvView", "init finder music mv " + longValue + ' ' + str4);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.Ts.MusicMvView", "fillMvByMusicShareObject, invalid music info!!");
        }
        getLyricManager().mo87309b();
        getLyricManager().mo87310c(t233.f185474v);
        C64488kb1 kb12 = this.f163128f;
        String str5 = t233.f185473u;
        if (str5 != null) {
            if (!(str5.length() > 0)) {
                str5 = null;
            }
            if (str5 != null) {
                kb12.f183904d = str5;
            }
        }
        String str6 = t233.f185474v;
        if (str6 != null) {
            if (!(str6.length() > 0)) {
                str6 = null;
            }
            if (str6 != null) {
                kb12.f183910j = str6;
            }
        }
        String str7 = t233.f185464i;
        if (str7 != null) {
            if (!(str7.length() > 0)) {
                str7 = null;
            }
            if (str7 != null) {
                kb12.f183911n = str7;
            }
        }
        String str8 = t233.f185463h;
        if (str8 != null) {
            if (!(str8.length() > 0)) {
                str8 = null;
            }
            if (str8 != null) {
                kb12.f183905e = str8;
            }
        }
        String str9 = t233.f185475w;
        if (str9 != null) {
            if (!(str9.length() > 0)) {
                str9 = null;
            }
            if (str9 != null) {
                kb12.f183912o = str9;
            }
        }
        Long valueOf = Long.valueOf(t233.f185467o);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            kb12.f183915r = valueOf.longValue();
        }
        String str10 = t233.f185466n;
        if (str10 != null) {
            if (!(str10.length() > 0)) {
                str10 = null;
            }
            if (str10 != null) {
                kb12.f183913p = str10;
            }
        }
        String str11 = t233.f185468p;
        if (str11 != null) {
            if (!(str11.length() > 0)) {
                str11 = null;
            }
            if (str11 != null) {
                kb12.f183917t = str11;
            }
        }
        String str12 = t233.f185465j;
        if (str12 != null) {
            if (str12.length() > 0) {
                z = true;
            }
            String str13 = z ? str12 : null;
            if (str13 != null) {
                kb12.f183916s = str13;
            }
        }
        getSongIdWithCheckPermission();
        mo80404c();
    }

    /* renamed from: h */
    public void mo80409h() {
        Log.m105924i("MicroMsg.Ts.MusicMvView", "onViewDestroy");
        C86709a0.m107524d().mo123470p(3763, this.f163132j);
        C86709a0.m107524d().mo123470p(5286, this.f163132j);
        C86709a0.m107524d().mo123470p(5292, this.f163132j);
        C62252a lyricManager = getLyricManager();
        lyricManager.getClass();
        Log.m105924i("MicroMsg.Mv.MusicMvLyric", "onDestroy" + C99364n.m129616h().mo138822a());
        lyricManager.f176960d.clear();
        lyricManager.f176961e = null;
        C99364n.m129616h().mo138828g(lyricManager.f176964h);
        C61426c cVar = this.f163126d;
        if (cVar != null) {
            cVar.release();
        }
        this.f163126d = null;
        this.f163130h = false;
    }

    /* JADX WARNING: type inference failed for: r7v19, types: [m03.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80410i(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.Ts.MusicMvView"
            if (r7 >= 0) goto L_0x001a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "refreshVideo position error:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)
            return
        L_0x001a:
            hb2.f r1 = r6.f163127e
            java.util.LinkedList<te3.mb1> r1 = r1.f170759g
            int r1 = r1.size()
            if (r1 != 0) goto L_0x003f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "refreshVideo "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " trackDataList empty"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            return
        L_0x003f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "refreshVideo, position:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            m03.c r7 = r6.f163126d
            r1 = 2131309855(0x7f09351f, float:1.8238006E38)
            r2 = 0
            if (r7 != 0) goto L_0x008e
            java.lang.Class<dz.i> r7 = p501dz.C58467i.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            dz.i r7 = (p501dz.C58467i) r7
            android.content.Context r3 = r6.getContext()
            java.lang.String r4 = "context"
            gy3.C87412m.m108593f(r3, r4)
            m03.c r7 = r7.Nu0(r3)
            r6.f163126d = r7
            if (r7 != 0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            pb2.b r3 = new pb2.b
            r3.<init>()
            r7.setMvMusicProxy(r3)
        L_0x007e:
            m03.c r7 = r6.f163126d
            boolean r3 = r7 instanceof android.view.View
            if (r3 == 0) goto L_0x0087
            android.view.View r7 = (android.view.View) r7
            goto L_0x0088
        L_0x0087:
            r7 = r2
        L_0x0088:
            if (r7 != 0) goto L_0x008b
            goto L_0x008e
        L_0x008b:
            r7.setId(r1)
        L_0x008e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r3 = "refreshVideo, videoLayout.parent:"
            r7.append(r3)
            m03.c r3 = r6.f163126d
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L_0x00a2
            android.view.View r3 = (android.view.View) r3
            goto L_0x00a3
        L_0x00a2:
            r3 = r2
        L_0x00a3:
            if (r3 == 0) goto L_0x00aa
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x00ab
        L_0x00aa:
            r3 = r2
        L_0x00ab:
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            m03.c r7 = r6.f163126d
            boolean r3 = r7 instanceof android.view.View
            if (r3 == 0) goto L_0x00be
            android.view.View r7 = (android.view.View) r7
            goto L_0x00bf
        L_0x00be:
            r7 = r2
        L_0x00bf:
            if (r7 == 0) goto L_0x00c6
            android.view.ViewParent r7 = r7.getParent()
            goto L_0x00c7
        L_0x00c6:
            r7 = r2
        L_0x00c7:
            if (r7 != 0) goto L_0x00f0
            m03.c r7 = r6.f163126d
            boolean r3 = r7 instanceof android.view.View
            if (r3 == 0) goto L_0x00d2
            android.view.View r7 = (android.view.View) r7
            goto L_0x00d3
        L_0x00d2:
            r7 = r2
        L_0x00d3:
            if (r7 != 0) goto L_0x00d6
            goto L_0x00d9
        L_0x00d6:
            r7.setId(r1)
        L_0x00d9:
            java.lang.String r7 = "refreshVideo add videoLayout to current videoContainer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            android.widget.FrameLayout r7 = r6.getVideoContainer()
            m03.c r1 = r6.f163126d
            java.lang.String r3 = "null cannot be cast to non-null type android.view.View"
            gy3.C87412m.m108592e(r1, r3)
            android.view.View r1 = (android.view.View) r1
            r7.addView(r1)
        L_0x00f0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "refreshVideo current music position:"
            r7.append(r1)
            la2.n r1 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r1 = r1.mo138822a()
            int r1 = r1.getPlayPosition()
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            m03.c r7 = r6.f163126d
            r0 = 1
            if (r7 == 0) goto L_0x0119
            r7.setMute(r0)
        L_0x0119:
            m03.c r7 = r6.f163126d
            if (r7 == 0) goto L_0x0126
            hb2.f r1 = r6.f163127e
            java.util.LinkedList r1 = r1.mo84775a()
            r7.setMediaList(r1)
        L_0x0126:
            m03.c r7 = r6.f163126d
            if (r7 != 0) goto L_0x012b
            goto L_0x0133
        L_0x012b:
            com.tencent.mm.plugin.mv.ui.open.text_status.MusicMvView$c r1 = new com.tencent.mm.plugin.mv.ui.open.text_status.MusicMvView$c
            r1.<init>(r6)
            r7.setPlayStatusChangeListener(r1)
        L_0x0133:
            m03.c r7 = r6.f163126d
            if (r7 == 0) goto L_0x013a
            r7.start()
        L_0x013a:
            la2.n r7 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r7 = r7.mo138822a()
            int r7 = r7.getPlayPosition()
            r1 = 0
            if (r7 >= 0) goto L_0x014a
            r7 = 0
        L_0x014a:
            m03.c r3 = r6.f163126d
            if (r3 == 0) goto L_0x0152
            long r4 = (long) r7
            r3.seekTo(r4)
        L_0x0152:
            m03.c r7 = r6.f163126d
            if (r7 != 0) goto L_0x0157
            goto L_0x015a
        L_0x0157:
            r7.setPauseOnVideoPlay(r1)
        L_0x015a:
            m03.c r7 = r6.f163126d
            boolean r1 = r7 instanceof android.view.View
            if (r1 == 0) goto L_0x0163
            r2 = r7
            android.view.View r2 = (android.view.View) r2
        L_0x0163:
            if (r2 != 0) goto L_0x0166
            goto L_0x0169
        L_0x0166:
            r2.setKeepScreenOn(r0)
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.open.text_status.MusicMvView.mo80410i(int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicMvView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
