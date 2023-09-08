package pu1;

import a14.C0000n0;
import a14.C53851a;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e03.C20486c;
import e03.C20502f;
import e03.C20505i;
import e03.C58471k;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import j03.C60695a;
import j03.C60698b;
import j03.C60700d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p328cz.C20373i;
import qu1.C63330a;
import qu1.C63331b;
import qu1.C63333c;
import qu1.C63334d;
import qu1.C63336e;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: pu1.j */
public final class C62502j extends C60700d {

    /* renamed from: M */
    public static final Map<C63330a, C63333c> f177544M;

    /* renamed from: G */
    public final String f177545G = ("MicroMsg.Flutter.MMVoipStatusCdnTPPlayer@" + hashCode());

    /* renamed from: H */
    public C98127h f177546H;

    /* renamed from: I */
    public C0000n0 f177547I = C53930o0.m60554a(C53872d1.f151119c);

    /* renamed from: J */
    public C53973z1 f177548J;

    /* renamed from: K */
    public C63330a f177549K;

    /* renamed from: L */
    public byte[] f177550L;

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.thumbplayer.player.MMMultiSourceCdnTPPlayer$prepare$1", mo125469f = "MMMultiSourceCdnTPPlayer.kt", mo125470l = {83}, mo125471m = "invokeSuspend")
    /* renamed from: pu1.j$a */
    public static final class C62503a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public long f177551d;

        /* renamed from: e */
        public int f177552e;

        /* renamed from: f */
        public /* synthetic */ Object f177553f;

        /* renamed from: g */
        public final /* synthetic */ C62502j f177554g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62503a(C62502j jVar, C15601d<? super C62503a> dVar) {
            super(2, dVar);
            this.f177554g = jVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C62503a aVar = new C62503a(this.f177554g, dVar);
            aVar.f177553f = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62503a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: a14.n0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r9.f177552e
                r2 = 1
                if (r1 == 0) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                long r0 = r9.f177551d
                java.lang.Object r3 = r9.f177553f
                a14.n0 r3 = (a14.C0000n0) r3
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x0037
            L_0x0013:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x001b:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.f177553f
                r3 = r10
                a14.n0 r3 = (a14.C0000n0) r3
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                pu1.j r10 = r9.f177554g
                r9.f177553f = r3
                r9.f177551d = r4
                r9.f177552e = r2
                java.lang.Object r10 = pu1.C62502j.m73463A(r10, r9)
                if (r10 != r0) goto L_0x0036
                return r0
            L_0x0036:
                r0 = r4
            L_0x0037:
                pu1.j r10 = r9.f177554g
                java.lang.String r10 = r10.f177545G
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "prepareLoader cost:"
                r4.append(r5)
                long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0)
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                boolean r10 = a14.C53930o0.m60560g(r3)
                if (r10 != 0) goto L_0x0065
                pu1.j r10 = r9.f177554g
                java.lang.String r10 = r10.f177545G
                java.lang.String r0 = "prepareJob is not active, return!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            L_0x0065:
                pu1.j r10 = r9.f177554g
                j03.d$a r0 = r10.f172876g
                gi.h r1 = r10.f177546H
                if (r0 == 0) goto L_0x015e
                if (r1 == 0) goto L_0x015e
                java.lang.String r3 = r1.field_fullpath     // Catch:{ Exception -> 0x0135 }
                r4 = 0
                java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106448i(r3, r4)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r4 = r10.f177545G     // Catch:{ Exception -> 0x0135 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0135 }
                r5.<init>()     // Catch:{ Exception -> 0x0135 }
                java.lang.String r6 = "startToPlay(), cache file:"
                r5.append(r6)     // Catch:{ Exception -> 0x0135 }
                r5.append(r3)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r6 = ", isExists:"
                r5.append(r6)     // Catch:{ Exception -> 0x0135 }
                boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)     // Catch:{ Exception -> 0x0135 }
                r5.append(r6)     // Catch:{ Exception -> 0x0135 }
                r6 = 32
                r5.append(r6)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r6 = r10.mo85605c()     // Catch:{ Exception -> 0x0135 }
                r5.append(r6)     // Catch:{ Exception -> 0x0135 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0135 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ Exception -> 0x0135 }
                boolean r0 = r0.f172899g     // Catch:{ Exception -> 0x0135 }
                r4 = 350(0x15e, float:4.9E-43)
                java.lang.String r5 = "cdnTask.field_mediaId"
                if (r0 == 0) goto L_0x00d4
                j03.b r0 = r10.f172872c     // Catch:{ Exception -> 0x0135 }
                if (r0 == 0) goto L_0x00b9
                java.lang.String r6 = r1.field_mediaId     // Catch:{ Exception -> 0x0135 }
                gy3.C87412m.m108593f(r6, r5)     // Catch:{ Exception -> 0x0135 }
                r0.mo33105a(r6)     // Catch:{ Exception -> 0x0135 }
            L_0x00b9:
                j03.b r0 = r10.f172872c     // Catch:{ Exception -> 0x0135 }
                if (r0 == 0) goto L_0x00cc
                com.tencent.thumbplayer.api.TPOptionalParam r5 = new com.tencent.thumbplayer.api.TPOptionalParam     // Catch:{ Exception -> 0x0135 }
                r5.<init>()     // Catch:{ Exception -> 0x0135 }
                int r6 = r10.f172895z     // Catch:{ Exception -> 0x0135 }
                long r6 = (long) r6     // Catch:{ Exception -> 0x0135 }
                com.tencent.thumbplayer.api.TPOptionalParam r4 = r5.buildLong(r4, r6)     // Catch:{ Exception -> 0x0135 }
                r0.setPlayerOptionalParam(r4)     // Catch:{ Exception -> 0x0135 }
            L_0x00cc:
                j03.b r0 = r10.f172872c     // Catch:{ Exception -> 0x0135 }
                if (r0 == 0) goto L_0x0126
                r0.setDataSource((java.lang.String) r3)     // Catch:{ Exception -> 0x0135 }
                goto L_0x0126
            L_0x00d4:
                com.tencent.thumbplayer.api.TPVideoInfo$Builder r0 = new com.tencent.thumbplayer.api.TPVideoInfo$Builder     // Catch:{ Exception -> 0x0135 }
                r0.<init>()     // Catch:{ Exception -> 0x0135 }
                java.lang.String r3 = r1.field_fileId     // Catch:{ Exception -> 0x0135 }
                r0.fileId(r3)     // Catch:{ Exception -> 0x0135 }
                com.tencent.thumbplayer.api.proxy.TPDownloadParamData r3 = new com.tencent.thumbplayer.api.proxy.TPDownloadParamData     // Catch:{ Exception -> 0x0135 }
                r6 = 11
                r3.<init>((int) r6)     // Catch:{ Exception -> 0x0135 }
                r0.downloadParam(r3)     // Catch:{ Exception -> 0x0135 }
                j03.b r3 = r10.f172872c     // Catch:{ Exception -> 0x0135 }
                if (r3 == 0) goto L_0x00f4
                java.lang.String r6 = r1.field_mediaId     // Catch:{ Exception -> 0x0135 }
                gy3.C87412m.m108593f(r6, r5)     // Catch:{ Exception -> 0x0135 }
                r3.mo33105a(r6)     // Catch:{ Exception -> 0x0135 }
            L_0x00f4:
                j03.b r3 = r10.f172872c     // Catch:{ Exception -> 0x0135 }
                if (r3 == 0) goto L_0x010f
                com.tencent.thumbplayer.api.TPOptionalParam r5 = new com.tencent.thumbplayer.api.TPOptionalParam     // Catch:{ Exception -> 0x0135 }
                r5.<init>()     // Catch:{ Exception -> 0x0135 }
                r6 = 102(0x66, float:1.43E-43)
                r7 = 1000(0x3e8, double:4.94E-321)
                com.tencent.thumbplayer.api.TPOptionalParam r5 = r5.buildLong(r6, r7)     // Catch:{ Exception -> 0x0135 }
                int r6 = r10.f172895z     // Catch:{ Exception -> 0x0135 }
                long r6 = (long) r6     // Catch:{ Exception -> 0x0135 }
                com.tencent.thumbplayer.api.TPOptionalParam r4 = r5.buildLong(r4, r6)     // Catch:{ Exception -> 0x0135 }
                r3.setPlayerOptionalParam(r4)     // Catch:{ Exception -> 0x0135 }
            L_0x010f:
                j03.b r3 = r10.f172872c     // Catch:{ Exception -> 0x0135 }
                if (r3 == 0) goto L_0x011a
                com.tencent.thumbplayer.api.TPVideoInfo r0 = r0.build()     // Catch:{ Exception -> 0x0135 }
                r3.setVideoInfo(r0)     // Catch:{ Exception -> 0x0135 }
            L_0x011a:
                j03.b r0 = r10.f172872c     // Catch:{ Exception -> 0x0135 }
                if (r0 == 0) goto L_0x0123
                java.lang.String r3 = r1.f287705p0     // Catch:{ Exception -> 0x0135 }
                r0.setDataSource((java.lang.String) r3)     // Catch:{ Exception -> 0x0135 }
            L_0x0123:
                r10.mo85637x()     // Catch:{ Exception -> 0x0135 }
            L_0x0126:
                r10.mo85635v(r2)     // Catch:{ Exception -> 0x0135 }
                i03.a r0 = r10.f172867D     // Catch:{ Exception -> 0x0135 }
                r0.getClass()     // Catch:{ Exception -> 0x0135 }
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x0135 }
                r0.f171734a = r2     // Catch:{ Exception -> 0x0135 }
                goto L_0x015e
            L_0x0135:
                r0 = move-exception
                java.lang.String r2 = r10.f177545G
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "prepare cdnTask:"
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = " fail:"
                r3.append(r1)
                java.lang.String r0 = r0.getLocalizedMessage()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
                r10.stopAsync()
                r10.recycle()
            L_0x015e:
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: pu1.C62502j.C62503a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: pu1.j$b */
    public static final class C62504b implements C20502f {

        /* renamed from: a */
        public final /* synthetic */ C62502j f177555a;

        public C62504b(C62502j jVar) {
            this.f177555a = jVar;
        }

        /* renamed from: a */
        public C98127h mo32064a(String str) {
            C87412m.m108594g(str, "id");
            return this.f177555a.mo85631r();
        }
    }

    /* renamed from: pu1.j$c */
    public static final class C62505c implements C20505i {

        /* renamed from: a */
        public final /* synthetic */ C62502j f177556a;

        /* renamed from: b */
        public final /* synthetic */ C60700d.C60701a f177557b;

        public C62505c(C62502j jVar, C60700d.C60701a aVar) {
            this.f177556a = jVar;
            this.f177557b = aVar;
        }

        /* renamed from: a */
        public void mo32067a(int i, C98127h hVar) {
            String str = this.f177556a.f177545G;
            Log.m105924i(str, "startCdnDownload()#onStart " + this.f177556a.mo85605c() + ' ' + i);
            if (i == 0) {
                this.f177556a.mo85639z(true);
            } else if (i == 1) {
                C60700d.C60701a aVar = this.f177557b;
                aVar.f172899g = true;
                aVar.f172898f = true;
                C32227p<? super String, ? super Integer, C13598b0> pVar = aVar.f172902j;
                if (pVar != null) {
                    C98127h hVar2 = this.f177556a.f177546H;
                    pVar.invoke(hVar2 != null ? hVar2.field_fileId : null, 0);
                }
                this.f177556a.mo85635v(4);
            }
        }

        /* renamed from: b */
        public void mo32068b(int i, C98127h hVar, C98121d dVar) {
            String str = this.f177556a.f177545G;
            StringBuilder sb = new StringBuilder();
            sb.append("startCdnDownload() #onStop:");
            sb.append(i);
            sb.append(", ");
            sb.append(hVar != null ? hVar.field_mediaId : null);
            Log.m105924i(str, sb.toString());
        }
    }

    /* renamed from: pu1.j$d */
    public static final class C62506d implements C58471k {

        /* renamed from: a */
        public final /* synthetic */ C62502j f177558a;

        /* renamed from: b */
        public final /* synthetic */ C32224a<C13598b0> f177559b;

        public C62506d(C62502j jVar, C32224a<C13598b0> aVar) {
            this.f177558a = jVar;
            this.f177559b = aVar;
        }

        /* renamed from: b */
        public void mo79502b(int i, C98127h hVar, C98121d dVar) {
            String str = this.f177558a.f177545G;
            Log.m105924i(str, "stopCdnDownload()#onStop(), real cancel download task " + this.f177558a.mo85605c() + ' ' + i);
            this.f177559b.invoke();
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f177544M = linkedHashMap;
        linkedHashMap.put(C63330a.Finder, new C63331b());
        linkedHashMap.put(C63330a.Sns, new C63334d());
        linkedHashMap.put(C63330a.TextStatus, new C63336e());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62502j(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m73463A(pu1.C62502j r5, wx3.C15601d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof pu1.C62507k
            if (r0 == 0) goto L_0x0016
            r0 = r6
            pu1.k r0 = (pu1.C62507k) r0
            int r1 = r0.f177563g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f177563g = r1
            goto L_0x001b
        L_0x0016:
            pu1.k r0 = new pu1.k
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.f177561e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f177563g
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r5 = r0.f177560d
            pu1.j r5 = (pu1.C62502j) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x005d
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r6)
            byte[] r6 = r5.f177550L
            if (r6 == 0) goto L_0x0094
            java.lang.String r2 = r5.f177545G
            java.lang.String r4 = "prepareLoader"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.util.Map<qu1.a, qu1.c> r2 = f177544M
            qu1.a r4 = r5.f177549K
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r2 = r2.get(r4)
            qu1.c r2 = (qu1.C63333c) r2
            if (r2 == 0) goto L_0x0094
            r0.f177560d = r5
            r0.f177563g = r3
            java.lang.Object r6 = r2.mo88234a(r6, r0)
            if (r6 != r1) goto L_0x005d
            goto L_0x0096
        L_0x005d:
            gi.h r6 = (p1081gi.C98127h) r6
            if (r6 == 0) goto L_0x0094
            java.lang.String r0 = r5.f177545G
            java.lang.String r1 = "prepareLoader parse finished"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            j03.d$a r0 = r5.f172876g
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = r0.f172896d
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            java.lang.String r1 = r6.field_mediaId
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 != 0) goto L_0x0091
            j03.d$a r0 = new j03.d$a
            java.lang.String r1 = r6.field_mediaId
            java.lang.String r2 = "cdnTask.field_mediaId"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = r6.field_fullpath
            java.lang.String r3 = "cdnTask.field_fullpath"
            gy3.C87412m.m108593f(r2, r3)
            r0.<init>(r5, r1, r2)
            r5.f172876g = r0
            r6.f287704f1 = r0
            r5.f177546H = r6
        L_0x0091:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0096
        L_0x0094:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pu1.C62502j.m73463A(pu1.j, wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public void mo85604b(boolean z) {
        C60698b bVar;
        if (this.f177550L == null) {
            super.mo85604b(z);
            return;
        }
        if (mo85633t() && isPlaying()) {
            C60698b bVar2 = this.f172872c;
            if (bVar2 != null) {
                bVar2.pause();
            }
            if (z && (bVar = this.f172872c) != null) {
                bVar.pauseDownload();
            }
        }
        if (z) {
            C60695a.C60696a.m71001d(this, (C32224a) null, 1, (Object) null);
        }
    }

    /* renamed from: k */
    public void mo85617k(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "finish");
        if (this.f177550L == null) {
            super.mo85617k(aVar);
        } else if (!this.f172877h) {
            String str = this.f177545G;
            Log.m105924i(str, "stopCdnDownload() not start cdn " + mo85605c());
            aVar.invoke();
        } else {
            Log.m105924i(this.f177545G, "stopCdnDownload");
            C20486c xx02 = ((C20373i) C86312j.m106911c(C20373i.class)).xx0();
            C98127h hVar = this.f177546H;
            String str2 = hVar != null ? hVar.field_mediaId : null;
            if (str2 == null) {
                str2 = "";
            }
            xx02.mo32053a(str2, new C62506d(this, aVar));
            this.f172877h = false;
            C60700d.C60701a aVar2 = this.f172876g;
            if (aVar2 != null) {
                aVar2.f172900h = false;
            }
        }
    }

    public void prepare() {
        String str = this.f177545G;
        Log.m105924i(str, "prepare mediaProto:" + this.f177550L + ", prepareJob:" + this.f177548J);
        if (this.f177550L == null) {
            super.prepare();
        } else if (this.f177548J == null) {
            this.f177548J = C53895h.m60466d(this.f177547I, (C66212f) null, (C53934p0) null, new C62503a(this, (C15601d<? super C62503a>) null), 3, (Object) null);
        }
    }

    /* renamed from: r */
    public C98127h mo85631r() {
        C98127h hVar = this.f177546H;
        return hVar == null ? super.mo85631r() : hVar;
    }

    public void recycle() {
        C53930o0.m60558e(this.f177547I, (CancellationException) null, 1, (Object) null);
        super.recycle();
    }

    public void stop() {
        C53973z1 z1Var;
        C53973z1 z1Var2 = this.f177548J;
        boolean z = false;
        if (z1Var2 != null && ((C53851a) z1Var2).mo74466a()) {
            z = true;
        }
        if (z && (z1Var = this.f177548J) != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C60695a.C60696a.m71001d(this, (C32224a) null, 1, (Object) null);
        super.stop();
    }

    /* renamed from: x */
    public void mo85637x() {
        if (this.f177550L == null) {
            super.mo85637x();
        } else if (this.f172877h) {
            String str = this.f177545G;
            Log.m105924i(str, "startCdnDownload() already start cdn " + mo85605c());
        } else {
            C60700d.C60701a aVar = this.f172876g;
            if (aVar == null) {
                return;
            }
            if (!aVar.f172899g) {
                Log.m105924i(this.f177545G, "startCdnDownload");
                C20486c xx02 = ((C20373i) C86312j.m106911c(C20373i.class)).xx0();
                C98127h hVar = this.f177546H;
                String str2 = hVar != null ? hVar.field_mediaId : null;
                if (str2 == null) {
                    str2 = "";
                }
                xx02.mo32061i(str2, new C62504b(this), new C62505c(this, aVar));
                this.f172877h = true;
                return;
            }
            Log.m105924i(this.f177545G, "local file or complete or fromExternResourceLoader");
        }
    }
}
