package he1;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ie1.C60274a;
import java.util.ArrayList;
import java.util.List;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p001ak.C54053a;
import p006bk.C54478a;
import p006bk.C54479b;
import p006bk.C54485h;
import p006bk.C54486i;
import p850ek.C58612c;
import p850ek.C58614e;
import p871zj.C66838e;
import p871zj.C66841f;
import p871zj.C66846j;
import p871zj.C66849k;
import p871zj.C66851m;
import pe3.C47465a;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C36907w;
import te3.C49422fh1;
import te3.C50409mj;
import up1.C37521f;
import xl1.C66368a;

/* renamed from: he1.m */
public final class C59854m implements C11385n {

    /* renamed from: r */
    public static final C32869b f170903r = new C32869b((C8480h) null);

    /* renamed from: d */
    public final View f170904d;

    /* renamed from: e */
    public C55018j0 f170905e;

    /* renamed from: f */
    public C66846j f170906f;

    /* renamed from: g */
    public long f170907g = -1;

    /* renamed from: h */
    public C66368a f170908h;

    /* renamed from: i */
    public boolean f170909i;

    /* renamed from: j */
    public C66846j.C66848b f170910j;

    /* renamed from: n */
    public long f170911n;

    /* renamed from: o */
    public float f170912o = 1.0f;

    /* renamed from: p */
    public boolean f170913p;

    /* renamed from: q */
    public final C59855c f170914q = new C59855c(this);

    /* renamed from: he1.m$a */
    public static final class C32868a implements C54485h {
        /* renamed from: d */
        public void mo14326d(String str, String str2) {
            Log.m105918d("FinderBullet." + str, str2);
        }

        /* renamed from: e */
        public void mo14327e(String str, String str2) {
            Log.m105920e("FinderBullet." + str, str2);
        }

        /* renamed from: i */
        public void mo14329i(String str, String str2) {
            Log.m105924i("FinderBullet." + str, str2);
        }

        /* renamed from: v */
        public void mo14330v(String str, String str2) {
            Log.m105926v("FinderBullet." + str, str2);
        }

        /* renamed from: w */
        public void mo14331w(String str, String str2) {
            Log.m105928w("FinderBullet." + str, str2);
        }

        /* renamed from: e */
        public void mo14328e(String str, String str2, Throwable th) {
            Log.m105921e("FinderBullet." + str, str2, th);
        }
    }

    /* renamed from: he1.m$b */
    public static final class C32869b {
        public C32869b(C8480h hVar) {
        }

        /* renamed from: a */
        public static final int m39837a(C32869b bVar, boolean z, float f) {
            bVar.getClass();
            float f2 = z ? 6500.0f : 12000.0f;
            C37521f.f99374d.getClass();
            return (int) ((f2 * C37521f.f99467n6.mo60266n().floatValue()) / f);
        }
    }

    /* renamed from: he1.m$c */
    public static final class C59855c implements C66368a.C66369a {

        /* renamed from: a */
        public final /* synthetic */ C59854m f170915a;

        public C59855c(C59854m mVar) {
            this.f170915a = mVar;
        }

        /* renamed from: a */
        public void mo84823a(List<C59840c> list) {
            C87412m.m108594g(list, "increaseList");
            C59854m mVar = this.f170915a;
            mVar.mo84814a(mVar.mo84816c().mo76078r0(list), "onBulletIncrease");
        }
    }

    /* renamed from: he1.m$d */
    public static final class C59856d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59854m f170916d;

        /* renamed from: e */
        public final /* synthetic */ C59840c f170917e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59856d(C59854m mVar, C59840c cVar) {
            super(0);
            this.f170916d = mVar;
            this.f170917e = cVar;
        }

        public Object invoke() {
            C59853j jVar = C59853j.f170902a;
            Context context = this.f170916d.f170904d.getContext();
            C87412m.m108593f(context, "bulletView.context");
            long j = (long) 1000;
            jVar.mo84812c(context, this.f170917e.f170850a, this.f170916d.mo84816c().getItemId(), (int) (this.f170916d.f170907g / j), true);
            View view = this.f170916d.f170904d;
            Context context2 = view.getContext();
            C87412m.m108593f(context2, "bulletView.context");
            jVar.mo84813d(view, context2, this.f170917e.f170850a, this.f170916d.mo84816c().getItemId(), (int) (this.f170916d.f170907g / j), true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: he1.m$e */
    public static final class C59857e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59854m f170918d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59857e(C59854m mVar) {
            super(0);
            this.f170918d = mVar;
        }

        public Object invoke() {
            this.f170918d.f170911n = 0;
            return C13598b0.f38549a;
        }
    }

    static {
        C54486i c = C54479b.m61196c();
        c.f152756c = 3;
        c.f152761h = true;
        c.f152754a = 6500;
        c.f152755b = C58612c.m68061a((float) 0);
        c.f152767n = (float) C58612c.m68061a(0.0f);
        c.f152768o = (float) C58612c.m68061a(0.0f);
        c.f152757d = C58612c.m68061a(6.0f);
        c.f152758e = C58612c.m68061a((float) 24);
        c.mo75310a(true);
    }

    public C59854m(View view) {
        C87412m.m108594g(view, "bulletView");
        this.f170904d = view;
        C54479b.C54480a aVar = new C54479b.C54480a((C54478a) null);
        aVar.f152748a = new C59858n(this);
        aVar.f152751d = C59859o.f170920a;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        ((ArrayList) aVar.f152750c).add(new C59868u(context));
        aVar.f152749b = new C59860p(this, view);
        this.f170906f = new C66846j(view, new C54479b(aVar, (C54478a) null));
        C58614e.f167820a = new C32868a();
    }

    /* renamed from: a */
    public final void mo84814a(List<C59840c> list, String str) {
        Log.m105924i("FinderBulletManager", "addDanmaku: size = " + list.size() + ", source = " + str);
        C66846j b = mo84815b();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C59840c cVar : list) {
            C54053a c = mo84815b().mo90844c(0, cVar);
            c.f151358o = 3000;
            c.f151348e = cVar.f170850a.f138061g;
            arrayList.add(c);
        }
        b.mo90842a(arrayList, false);
    }

    /* renamed from: b */
    public final C66846j mo84815b() {
        C66846j jVar = this.f170906f;
        if (jVar != null) {
            return jVar;
        }
        C87412m.m108603p("danmakuManager");
        throw null;
    }

    /* renamed from: c */
    public final C55018j0 mo84816c() {
        C55018j0 j0Var = this.f170905e;
        if (j0Var != null) {
            return j0Var;
        }
        C87412m.m108603p("feedObject");
        throw null;
    }

    /* renamed from: d */
    public final boolean mo84817d() {
        return this.f170909i && this.f170905e != null;
    }

    /* renamed from: e */
    public final void mo84818e() {
        if (mo84817d()) {
            int i = 0;
            this.f170909i = false;
            this.f170907g = -1;
            Log.m105924i("FinderBulletManager", "onDetach: id = " + C61926c.m72691p(mo84816c().mo3513o().getId()) + "， this=" + hashCode());
            mo84815b().mo90849h();
            C66368a aVar = this.f170908h;
            if (aVar != null) {
                aVar.f191075n = null;
                StringBuilder sb = new StringBuilder();
                sb.append("onDetach ");
                sb.append(aVar.mo90470c());
                sb.append(' ');
                C66368a.C66369a aVar2 = aVar.f191070f;
                if (aVar2 != null) {
                    i = aVar2.hashCode();
                }
                sb.append(i);
                Log.m105924i("FinderBulletLoader", sb.toString());
                C86709a0.m107524d().mo123470p(8560, aVar);
                C86709a0.m107524d().mo123470p(7143, this);
                this.f170911n = 0;
                return;
            }
            C87412m.m108603p("bulletLoader");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x009b, code lost:
        if (r6 > 0) goto L_0x00a0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84819f(java.lang.String r15, boolean r16, int r17, long r18) {
        /*
            r14 = this;
            r0 = r14
            java.lang.String r1 = "content"
            r9 = r15
            gy3.C87412m.m108594g(r15, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "postBullet: feedId="
            r1.append(r2)
            cm1.j0 r2 = r14.mo84816c()
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            long r2 = r2.getId()
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FinderBulletManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.view.View r1 = r0.f170904d
            android.content.Context r1 = r1.getContext()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r1)
            if (r1 != 0) goto L_0x0079
            android.view.View r1 = r0.f170904d
            android.content.Context r1 = r1.getContext()
            android.view.View r3 = r0.f170904d
            android.content.Context r3 = r3.getContext()
            r4 = 2131821610(0x7f11042a, float:1.9275968E38)
            java.lang.String r3 = r3.getString(r4)
            r4 = 0
            android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r3, (int) r4)
            r1.show()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "postBullet: network is disconnect, feedId="
            r1.append(r3)
            cm1.j0 r3 = r14.mo84816c()
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
            long r3 = r3.getId()
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            return
        L_0x0079:
            ie1.a r1 = new ie1.a
            cm1.j0 r2 = r14.mo84816c()
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            long r3 = r2.getId()
            cm1.j0 r2 = r14.mo84816c()
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            java.lang.String r5 = r2.getObjectNonceId()
            if (r17 != 0) goto L_0x009e
            long r6 = r0.f170911n
            r10 = 0
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            long r6 = r0.f170907g
        L_0x00a0:
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            android.view.View r8 = r0.f170904d
            android.content.Context r8 = r8.getContext()
            java.lang.String r10 = "bulletView.context"
            gy3.C87412m.m108593f(r8, r10)
            rs1.s8 r2 = r2.mo12873f(r8)
            if (r2 == 0) goto L_0x00b8
            te3.hj1 r2 = r2.mo12861q3()
            goto L_0x00b9
        L_0x00b8:
            r2 = 0
        L_0x00b9:
            r10 = r2
            r2 = r1
            r8 = r17
            r9 = r15
            r11 = r16
            r12 = r18
            r2.<init>(r3, r5, r6, r8, r9, r10, r11, r12)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123460f(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: he1.C59854m.mo84819f(java.lang.String, boolean, int, long):void");
    }

    /* renamed from: g */
    public final void mo84820g(long j, boolean z) {
        if (mo84817d() && !mo84815b().mo90846e() && mo84816c().mo76077q0(this.f170913p)) {
            Log.m105924i("FinderBulletManager", "restart: timeStamp = " + j + ", id = " + C61926c.m72691p(mo84816c().getItemId()));
            mo84814a(mo84816c().f154483h, "restart");
            mo84815b().mo90852k(j);
            if (z) {
                mo84815b().mo90848g(false);
            }
        }
    }

    /* renamed from: h */
    public final void mo84821h(int i, boolean z) {
        C54486i c = C54479b.m61196c();
        c.f152756c = i;
        c.mo75310a(z);
        c.f152754a = C32869b.m39837a(f170903r, z, this.f170912o);
        Log.m105924i("FinderBulletManager", "setDanmakuRow: rowCount=" + c.f152756c + ", isVertical=" + z + ", duration=" + c.f152754a + ", playSpeedRatio=" + this.f170912o);
        mo84815b().mo90847f();
    }

    /* renamed from: i */
    public final void mo84822i() {
        if (mo84817d()) {
            Log.m105924i("FinderBulletManager", "stop: id = " + C61926c.m72691p(mo84816c().getItemId()));
            C66838e eVar = mo84815b().f192019d;
            eVar.getClass();
            C58614e.m68067d("DanmakuManager", "clearDrawingCache()");
            eVar.f191981J.mo90858a(11);
            mo84815b().mo90843b();
            mo84815b().f192019d.mo90827n();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C50409mj mjVar;
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (yVar instanceof C60274a) {
            C60274a aVar = (C60274a) yVar;
            if (aVar.f171836g == mo84816c().mo3513o().getId()) {
                C47465a aVar2 = aVar.f171837h.f127056b.f127083a;
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPostBulletCommentResponse");
                C50409mj mjVar2 = ((C49422fh1) aVar2).f133495d;
                Long l = null;
                C59840c cVar = mjVar2 != null ? new C59840c(mjVar2) : null;
                if (i == 0 && i2 == 0) {
                    if (cVar != null) {
                        mo84816c().mo76078r0(C26236u.m33719b(cVar));
                        C54053a c = mo84815b().mo90844c(0, cVar);
                        c.f151361r = true;
                        c.f151358o = 3000;
                        c.f151348e = cVar.f170850a.f138061g;
                        C66838e eVar = mo84815b().f192019d;
                        eVar.getClass();
                        Log.m105924i("DanmakuManager", "addNow: danmaku time = " + c.f151348e + " usePlayTime = " + false);
                        C66851m mVar = eVar.f191993n;
                        C66841f fVar = new C66841f(eVar);
                        Handler a = mVar.mo90857a();
                        if (a != null) {
                            a.post(new C66849k(mVar, c, fVar));
                        }
                        C61926c.m72668M(new C59856d(this, cVar));
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("postBullet onSceneEnd: addDanmaku ");
                    sb.append(C61926c.m72691p(mo84816c().mo3513o().getId()));
                    sb.append(", addTime=");
                    if (!(cVar == null || (mjVar = cVar.f170850a) == null)) {
                        l = Long.valueOf(mjVar.f138061g);
                    }
                    sb.append(l);
                    Log.m105924i("FinderBulletManager", sb.toString());
                } else if (i2 == -8000) {
                    C58784w3 w3Var = C58784w3.f168295a;
                    Context context = this.f170904d.getContext();
                    C87412m.m108593f(context, "bulletView.context");
                    String string = this.f170904d.getContext().getString(C0966R.string.gqq);
                    C87412m.m108593f(string, "bulletView.context.getSt…_bullet_has_closed_toast)");
                    w3Var.mo83879J1(context, string);
                } else {
                    Log.m105920e("FinderBulletManager", "NetSceneFinderBulletPost: errType=" + i + ", errCode=" + i2 + ", errMsg=" + str);
                }
                C61926c.m72668M(new C59857e(this));
            }
        }
    }
}
