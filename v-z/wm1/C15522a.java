package wm1;

import android.content.Context;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb0.C31543z5;
import f40.C86709a0;
import fe1.C8014g;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import hn1.C8614b;
import ht1.C60200t1;
import it1.C9256k;
import java.util.LinkedList;
import jn1.C9476a;
import jn1.C9482d;
import ln1.C21445b;
import nn1.C11232a;
import nn1.C11235c;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C50989qo0;
import te3.C51942x91;
import up1.C37521f;

/* renamed from: wm1.a */
public final class C15522a implements C11385n {

    /* renamed from: d */
    public final Context f42069d;

    /* renamed from: e */
    public final int f42070e;

    /* renamed from: f */
    public final String f42071f;

    /* renamed from: g */
    public final String f42072g;

    /* renamed from: h */
    public final String f42073h;

    /* renamed from: i */
    public final String f42074i;

    /* renamed from: j */
    public C15548j f42075j;

    /* renamed from: n */
    public C32230s<? super String, ? super String, ? super String, ? super LinkedList<C51942x91>, ? super Boolean, C13598b0> f42076n;

    /* renamed from: o */
    public boolean f42077o;

    /* renamed from: wm1.a$a */
    public static final class C15523a extends C87413o implements C32226l<C9256k<C117747y>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15522a f42078d;

        /* renamed from: e */
        public final /* synthetic */ C49712hj1 f42079e;

        /* renamed from: f */
        public final /* synthetic */ boolean f42080f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15523a(C15522a aVar, C49712hj1 hj12, boolean z) {
            super(1);
            this.f42078d = aVar;
            this.f42079e = hj12;
            this.f42080f = z;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            C9256k kVar = (C9256k) obj;
            if (kVar != null) {
                this.f42078d.onSceneEnd(kVar.f29001b, kVar.f29000a, kVar.f29002c, (C117747y) kVar.f29003d);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                this.f42078d.mo14301b(this.f42079e, this.f42080f, 1);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wm1.a$b */
    public static final class C15524b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C50989qo0 f42081d;

        /* renamed from: e */
        public final /* synthetic */ C15522a f42082e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15524b(C50989qo0 qo02, C15522a aVar) {
            super(0);
            this.f42081d = qo02;
            this.f42082e = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
            r5 = r5.f137766g;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r9 = this;
                hn1.b r0 = hn1.C8614b.f27717a
                te3.qo0 r1 = r9.f42081d
                java.util.LinkedList<te3.x91> r1 = r1.f140423d
                java.lang.String r2 = "response.tab_list"
                gy3.C87412m.m108593f(r1, r2)
                r0.getClass()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "onGetLiveTabList tabSize:"
                r0.append(r3)
                int r3 = r1.size()
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r3 = "NearbyPreloadManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                java.util.LinkedList<te3.x91> r0 = hn1.C8614b.f27720d
                r0.clear()
                java.util.LinkedList<te3.x91> r0 = hn1.C8614b.f27720d
                r0.addAll(r1)
                wm1.a r0 = r9.f42082e
                fy3.s<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.LinkedList<te3.x91>, ? super java.lang.Boolean, rx3.b0> r3 = r0.f42076n
                if (r3 == 0) goto L_0x006d
                te3.qo0 r0 = r9.f42081d
                java.lang.String r1 = r0.f140429j
                java.lang.String r4 = ""
                if (r1 != 0) goto L_0x0041
                r1 = r4
            L_0x0041:
                te3.m21 r5 = r0.f140424e
                if (r5 == 0) goto L_0x0049
                java.lang.String r6 = r5.f137765f
                if (r6 != 0) goto L_0x004a
            L_0x0049:
                r6 = r4
            L_0x004a:
                if (r5 == 0) goto L_0x0053
                java.lang.String r5 = r5.f137766g
                if (r5 != 0) goto L_0x0051
                goto L_0x0053
            L_0x0051:
                r7 = r5
                goto L_0x0054
            L_0x0053:
                r7 = r4
            L_0x0054:
                java.util.LinkedList<te3.x91> r0 = r0.f140423d
                gy3.C87412m.m108593f(r0, r2)
                te3.qo0 r2 = r9.f42081d
                int r2 = r2.f140430n
                r4 = 1
                if (r2 != r4) goto L_0x0061
                goto L_0x0062
            L_0x0061:
                r4 = 0
            L_0x0062:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
                r4 = r1
                r5 = r6
                r6 = r7
                r7 = r0
                r3.mo237D(r4, r5, r6, r7, r8)
            L_0x006d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onSceneEnd list:"
                r0.append(r1)
                te3.qo0 r1 = r9.f42081d
                java.util.LinkedList<te3.x91> r1 = r1.f140423d
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "NearbyLiveSquareTabFetcher"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wm1.C15522a.C15524b.invoke():java.lang.Object");
        }
    }

    public C15522a(Context context, int i, String str, String str2, String str3, String str4) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "byPass");
        C87412m.m108594g(str2, "encrypted_object_id");
        C87412m.m108594g(str3, "object_nonce_id");
        C87412m.m108594g(str4, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f42069d = context;
        this.f42070e = i;
        this.f42071f = str;
        this.f42072g = str2;
        this.f42073h = str3;
        this.f42074i = str4;
    }

    /* renamed from: a */
    public final void mo14300a(C49712hj1 hj12, boolean z, boolean z2, C32230s<? super String, ? super String, ? super String, ? super LinkedList<C51942x91>, ? super Boolean, C13598b0> sVar) {
        C9256k e;
        C87412m.m108594g(hj12, "contextObj");
        C87412m.m108594g(sVar, "callback");
        C11232a aVar = C11235c.f33110a;
        C11235c.f33110a.mo12482c("startFetchTabs");
        Log.m105924i("NearbyLiveSquareTabFetcher", "fetch forcePermission:" + z + " isUseCache:" + z2);
        this.f42076n = sVar;
        if (z2) {
            C8614b.f27717a.getClass();
            C9482d dVar = C8614b.f27718b;
            if (dVar != null) {
                C21445b bVar = C21445b.f60694a;
                boolean z3 = dVar.f29562n == C9476a.C9477a.OK;
                Log.m105924i("FinderNearbyLiveLoadingReporter", "tickHasCacheFromClick isFromClick : " + C21445b.f60697d + " hasCache: " + z3);
                if (C21445b.f60697d) {
                    C21445b.f60699f = z3;
                }
                int ordinal = dVar.f29562n.ordinal();
                if (ordinal == 1) {
                    dVar.mo10165f(new C15523a(this, hj12, z));
                    return;
                } else if (ordinal == 5 && (e = dVar.mo10164e()) != null) {
                    onSceneEnd(e.f29001b, e.f29000a, e.f29002c, (C117747y) e.f29003d);
                    return;
                }
            }
        }
        mo14301b(hj12, z, 2);
    }

    /* renamed from: b */
    public final void mo14301b(C49712hj1 hj12, boolean z, int i) {
        Log.m105924i("NearbyLiveSquareTabFetcher", "fetchLiveSquareTabs, contextObj:" + hj12 + " forcePermission:" + z + " invokeSource:" + i);
        if (z) {
            Log.m105924i("NearbyLiveSquareTabFetcher", "fetchLiveSquareTabsForPermission, contextObj:" + hj12 + " invokeSource:" + i);
            C15525b bVar = C15525b.f42083d;
            C15528e eVar = new C15528e(this, hj12);
            C15529f fVar = new C15529f(this, hj12);
            C8014g gVar = (C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class);
            if (gVar.mo9103H()) {
                long a = C31543z5.m39451a() - gVar.mo9106t1();
                C37521f.f99374d.getClass();
                if (a < ((long) C37521f.f99296U)) {
                    fVar.invoke();
                } else {
                    eVar.invoke();
                }
            } else if (bVar != null) {
                bVar.invoke();
            }
        } else {
            mo14302c(hj12);
        }
    }

    /* renamed from: c */
    public final void mo14302c(C49712hj1 hj12) {
        C15548j jVar = new C15548j(hj12, this.f42070e, this.f42071f, this.f42074i, this.f42072g, this.f42073h);
        this.f42075j = jVar;
        Context context = this.f42069d;
        jVar.mo85584j1(context, context.getResources().getString(C0966R.string.ett), 500);
        C86709a0.m107524d().mo123455a(4210, this);
        C86709a0.m107524d().mo123460f(this.f42075j);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        Log.m105924i("NearbyLiveSquareTabFetcher", "onSceneEnd handle NetSceneNearbyLiveSquareTabs, errType:" + i + " errCode:" + i2);
        C86709a0.m107524d().mo123470p(4210, this);
        if ((i == 0 && i2 == 0) || i2 == -200008) {
            C47350c cVar = ((C15548j) yVar).f42139h;
            C87412m.m108591d(cVar);
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveTabsResponse");
            C11235c.f33110a.mo12482c("fetchTabsDone");
            C61926c.m72668M(new C15524b((C50989qo0) aVar, this));
            return;
        }
        Log.m105920e("NearbyLiveSquareTabFetcher", "onSceneEnd handle NetSceneNearbyLiveSquareTabs error");
    }
}
