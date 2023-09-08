package vn0;

import android.graphics.SurfaceTexture;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105130c;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85148d;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import js0.C88020k;
import org.json.JSONObject;
import p576jp.C88007b;
import p830xc.C91165a;
import p830xc.C91167d;
import p980id.C87695a;
import po0.C89425k;

/* renamed from: vn0.e */
public final class C90847e extends C87695a implements C85148d.C85150b {

    /* renamed from: g */
    public SurfaceTexture f260805g;

    /* renamed from: h */
    public C105130c f260806h;

    /* renamed from: i */
    public final List<C91165a> f260807i = new ArrayList();

    /* renamed from: j */
    public int f260808j;

    /* renamed from: n */
    public int f260809n;

    /* renamed from: o */
    public int f260810o;

    /* renamed from: p */
    public int f260811p;

    /* renamed from: q */
    public String f260812q = "cover";

    /* renamed from: r */
    public C89425k f260813r = new C89425k();

    /* renamed from: vn0.e$a */
    public static final class C90848a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C90847e f260814d;

        /* renamed from: e */
        public final /* synthetic */ C91165a f260815e;

        /* renamed from: f */
        public final /* synthetic */ Runnable f260816f;

        public C90848a(C90847e eVar, C91165a aVar, Runnable runnable) {
            this.f260814d = eVar;
            this.f260815e = aVar;
            this.f260816f = runnable;
        }

        public final void run() {
            C90847e eVar = this.f260814d;
            if (eVar.f260805g == null) {
                ((ArrayList) eVar.f260807i).add(this.f260815e);
                return;
            }
            this.f260816f.run();
        }
    }

    /* renamed from: vn0.e$b */
    public static final class C90849b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82870p f260817d;

        /* renamed from: e */
        public final /* synthetic */ C90847e f260818e;

        /* renamed from: f */
        public final /* synthetic */ C82381f f260819f;

        /* renamed from: g */
        public final /* synthetic */ C91165a f260820g;

        /* renamed from: h */
        public final /* synthetic */ JSONObject f260821h;

        public C90849b(C82870p pVar, C90847e eVar, C82381f fVar, C91165a aVar, JSONObject jSONObject) {
            this.f260817d = pVar;
            this.f260818e = eVar;
            this.f260819f = fVar;
            this.f260820g = aVar;
            this.f260821h = jSONObject;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r12 = this;
                com.tencent.mm.plugin.appbrand.jsapi.p r0 = r12.f260817d
                boolean r1 = r0 instanceof vn0.C90845c
                r2 = 0
                java.lang.String r3 = "fail"
                java.lang.String r4 = "ok"
                java.lang.String r5 = "data"
                java.lang.String r6 = "MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler"
                if (r1 == 0) goto L_0x00a9
                java.lang.String r0 = "insert xweb voip"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                vn0.e r0 = r12.f260818e
                com.tencent.mm.plugin.appbrand.jsapi.f r1 = r12.f260819f
                xc.a r7 = r12.f260820g
                org.json.JSONObject r8 = r12.f260821h
                gy3.C87412m.m108593f(r8, r5)
                r0.getClass()
                java.lang.Class<jp.b> r5 = p576jp.C88007b.class
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "onInsertView, viewId:[data:"
                r9.append(r10)
                r9.append(r8)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
                android.graphics.SurfaceTexture r9 = r0.f260805g
                if (r9 == 0) goto L_0x012e
                android.content.Context r1 = r1.getContext()
                if (r1 != 0) goto L_0x0047
                r7.mo62549j(r3)
                goto L_0x012e
            L_0x0047:
                di3.d r10 = di3.C86312j.m106911c(r5)
                jp.b r10 = (p576jp.C88007b) r10
                jp.c r10 = r10.mo59116Bp()
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r10 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w) r10
                int r10 = r10.f312388t
                r11 = 2
                if (r10 != r11) goto L_0x0062
                r7.mo62549j(r3)
                java.lang.String r0 = "insert XWeb VoIp view failed, room is audio room"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
                goto L_0x012e
            L_0x0062:
                di3.d r5 = di3.C86312j.m106911c(r5)
                jp.b r5 = (p576jp.C88007b) r5
                jp.c r5 = r5.mo59116Bp()
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r5 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w) r5
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f1 r5 = r5.f312378h
                r6 = 1
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c r1 = r5.mo149452b(r1, r8, r6)
                if (r1 == 0) goto L_0x009b
                boolean r5 = r1 instanceof com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85148d
                if (r5 == 0) goto L_0x007f
                r5 = r1
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d r5 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85148d) r5
                goto L_0x0080
            L_0x007f:
                r5 = r2
            L_0x0080:
                if (r5 == 0) goto L_0x009b
                r0.mo124944r(r8, r5)
                r0.mo124943q(r8)
                boolean r6 = r5 instanceof com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85148d.C85149a
                if (r6 == 0) goto L_0x008f
                r2 = r5
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d$a r2 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85148d.C85149a) r2
            L_0x008f:
                if (r2 == 0) goto L_0x0094
                r2.setSameLayerCallback(r0)
            L_0x0094:
                r5.setSurfaceTexture(r9)
                r1.mo149440v(r8)
                r2 = r1
            L_0x009b:
                r0.f260806h = r2
                if (r2 == 0) goto L_0x00a4
                r7.mo62549j(r4)
                goto L_0x012e
            L_0x00a4:
                r7.mo62549j(r3)
                goto L_0x012e
            L_0x00a9:
                boolean r1 = r0 instanceof vn0.C90844b
                java.lang.String r7 = "invokeContext"
                if (r1 == 0) goto L_0x00fb
                java.lang.String r0 = "update xweb voip"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                vn0.e r0 = r12.f260818e
                xc.a r1 = r12.f260820g
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c r8 = r0.f260806h
                org.json.JSONObject r9 = r12.f260821h
                gy3.C87412m.m108593f(r9, r5)
                r0.getClass()
                gy3.C87412m.m108594g(r1, r7)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "onUpdateView, data:"
                r5.append(r7)
                r5.append(r9)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                if (r8 != 0) goto L_0x00e7
                r1.mo62549j(r3)
                java.lang.String r0 = "the view is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
                goto L_0x012e
            L_0x00e7:
                boolean r3 = r8 instanceof com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85148d
                if (r3 == 0) goto L_0x00ee
                r2 = r8
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d r2 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85148d) r2
            L_0x00ee:
                r0.mo124944r(r9, r2)
                r0.mo124943q(r9)
                r8.mo149439r(r9)
                r1.mo62549j(r4)
                goto L_0x012e
            L_0x00fb:
                boolean r0 = r0 instanceof vn0.C90846d
                if (r0 == 0) goto L_0x012e
                java.lang.String r0 = "remove xweb voip"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                vn0.e r0 = r12.f260818e
                xc.a r1 = r12.f260820g
                org.json.JSONObject r2 = r12.f260821h
                gy3.C87412m.m108593f(r2, r5)
                r0.getClass()
                gy3.C87412m.m108594g(r1, r7)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "onRemoveView,"
                r3.append(r5)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
                r0.mo124946t()
                r1.mo62549j(r4)
            L_0x012e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vn0.C90847e.C90849b.run():void");
        }
    }

    /* renamed from: d */
    public void mo118174d(int i, int i2) {
        if (this.f260810o != i || this.f260811p != i2) {
            this.f260810o = i;
            this.f260811p = i2;
            mo124945s();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = (com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b) r10;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo17969i(p830xc.C91165a r10) {
        /*
            r9 = this;
            java.lang.String r0 = "invokeContext"
            gy3.C87412m.m108594g(r10, r0)
            boolean r0 = r10 instanceof com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b
            r1 = 0
            if (r0 == 0) goto L_0x0048
            r0 = r10
            com.tencent.mm.plugin.appbrand.extendplugin.b r0 = (com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b) r0
            com.tencent.mm.plugin.appbrand.jsapi.f r8 = r0.mo62544g()
            if (r8 != 0) goto L_0x0014
            return r1
        L_0x0014:
            com.tencent.mm.plugin.appbrand.jsapi.p r3 = r0.f240072c
            org.json.JSONObject r7 = r0.f240071b
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            java.lang.String r4 = r9.mo122122p()
            r0[r2] = r4
            r2 = 1
            java.lang.String r4 = r3.mo114779e()
            r0[r2] = r4
            r2 = 2
            java.lang.String r4 = r7.toString()
            r0[r2] = r4
            java.lang.String r2 = "MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler"
            java.lang.String r4 = "*** handler(%s) handleJsApi(%s), data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r0)
            vn0.e$b r0 = new vn0.e$b
            r2 = r0
            r4 = r9
            r5 = r8
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            vn0.e$a r2 = new vn0.e$a
            r2.<init>(r9, r10, r0)
            r8.mo109673t(r2)
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vn0.C90847e.mo17969i(xc.a):java.lang.String");
    }

    /* renamed from: j */
    public void mo17970j(SurfaceTexture surfaceTexture) {
        this.f260805g = surfaceTexture;
        if (surfaceTexture != null) {
            for (C91165a i : this.f260807i) {
                mo17969i(i);
            }
            ((ArrayList) this.f260807i).clear();
        }
    }

    /* renamed from: m */
    public void mo17971m() {
        this.f260805g = null;
        mo124946t();
        ((ArrayList) this.f260807i).clear();
    }

    /* renamed from: n */
    public boolean mo17972n(C91165a aVar) {
        C87412m.m108594g(aVar, "invokeContext");
        return true;
    }

    /* renamed from: q */
    public final void mo124943q(JSONObject jSONObject) {
        String optString = jSONObject.optString(V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT, "");
        C87412m.m108593f(optString, "objFit");
        if (optString.length() > 0) {
            this.f260812q = optString;
        }
        mo124945s();
    }

    /* renamed from: r */
    public final void mo124944r(JSONObject jSONObject, C85148d dVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("position");
        if (optJSONObject != null) {
            int d = C88020k.m109553d(optJSONObject.optInt("width", 0));
            int d2 = C88020k.m109553d(optJSONObject.optInt("height", 0));
            Log.m105925i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "adjustSurfaceSize, size:[%d, %d]", Integer.valueOf(d), Integer.valueOf(d2));
            if (d > 0 && d2 > 0) {
                this.f260808j = d;
                this.f260809n = d2;
                SurfaceTexture surfaceTexture = this.f260805g;
                if (surfaceTexture != null) {
                    surfaceTexture.setDefaultBufferSize(d, d2);
                }
                if (dVar != null) {
                    dVar.mo118172z(d, d2);
                }
                if (dVar != null) {
                    dVar.mo118171u(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
                }
            }
        }
    }

    /* renamed from: s */
    public final void mo124945s() {
        C89425k kVar = this.f260813r;
        if (kVar.mo123754a(this.f260812q, this.f260808j, this.f260809n, this.f260810o, this.f260811p)) {
            C91167d.m114402c(this.f253973f, this.f253972e, this.f253971d, kVar.f257463h, kVar.f257464i);
        }
    }

    /* renamed from: t */
    public final void mo124946t() {
        if (this.f260806h != null) {
            ((C105181w) ((C88007b) C86312j.m106911c(C88007b.class)).mo59116Bp()).f312378h.mo149451a(this.f260806h);
            this.f260806h = null;
        }
    }
}
