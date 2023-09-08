package p284zb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import b34.C79664a;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81827f;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C81973j2;
import com.tencent.p014mm.plugin.appbrand.C83194k2;
import com.tencent.p014mm.plugin.appbrand.C83716o4;
import com.tencent.p014mm.plugin.appbrand.appcache.AbsReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83133y6;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83182r;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.plugin.appbrand.menu.C83657c0;
import com.tencent.p014mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode;
import com.tencent.p014mm.plugin.appbrand.page.C83779d0;
import com.tencent.p014mm.plugin.appbrand.page.C83788e0;
import com.tencent.p014mm.plugin.appbrand.report.model.C84141e;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gu0.C87384a;
import gy3.C87412m;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import js0.C88020k;
import op0.C89262h;
import org.json.JSONException;
import org.json.JSONObject;
import p1044ub.C90626a;
import p1044ub.C90629b;
import p1044ub.C90630c;
import p1044ub.C90636f;
import p252vb.C14423a;
import p963fc.C86812g;

/* renamed from: zb.f */
public class C91635f extends C81925i2 implements C89262h, C90636f {

    /* renamed from: L */
    public static final String[] f262592L = {C83788e0.NAME, C83779d0.NAME, "onSkylineGlobalReady", "onSkylineWindowReady", "requireRenderContext", C83657c0.C83660c.NAME, "onAppRoute", "onAppRouteDone"};

    /* renamed from: H */
    public final C91640i<? extends C91635f> f262593H;

    /* renamed from: I */
    public C84217q f262594I;

    /* renamed from: J */
    public C16132t f262595J;

    /* renamed from: K */
    public final LinkedList<Runnable> f262596K;

    /* renamed from: zb.f$a */
    public class C91636a extends C83788e0 {
        public C91636a() {
        }

        /* renamed from: s */
        public void mo116256s(AppBrandRuntime appBrandRuntime, boolean z, JSONObject jSONObject) {
            C84141e.m103706b(C91635f.this.getRuntime(), jSONObject, z);
        }
    }

    /* renamed from: zb.f$b */
    public class C91637b extends C83779d0 {
        public C91637b() {
        }

        /* renamed from: o */
        public /* bridge */ /* synthetic */ C82919r2 mo115165o(Map map) {
            mo115196r(map);
            return this;
        }

        /* renamed from: r */
        public C82926s mo115196r(Map<String, Object> map) {
            JSONObject jSONObject = new JSONObject(map);
            C86812g H0 = C91635f.this.getRuntime();
            try {
                Pair<Integer, String> f = C84141e.m103710f((C90630c) H0.mo113042Z().getCurrentPage().getCurrentPageView());
                jSONObject.put("targetAction", ((Integer) f.first).intValue());
                jSONObject.put("targetPagePath", (String) f.second);
                jSONObject.put("usedState", H0.mo121253n1().f245535h);
                jSONObject.put("isEntrance", H0.mo113042Z().getReporter().mo115894l().mo116806i(H0.mo113042Z().getCurrentUrl()));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillEventOnAppEnterBackground ex = %s", e);
            }
            this.f242407f = jSONObject.toString();
            return this;
        }
    }

    public C91635f() {
        this((C90629b) new d$$m());
    }

    /* renamed from: A0 */
    public final void mo114325A0(boolean z) {
        super.mo114325A0(z);
        this.f262593H.mo120926z0();
    }

    /* renamed from: D0 */
    public C82381f.C82384c mo122643D0() {
        return new C81827f(getRuntime(), this, getRuntime().f251968f1);
    }

    /* renamed from: E0 */
    public C87384a mo114338i0() {
        return new C87384a(this);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* renamed from: F */
    public final void mo114329F() {
        /*
            r7 = this;
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.jsapi.p> r0 = r7.f241586h
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.appbrand.jsapi.p r1 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82870p) r1
            boolean r2 = r1 instanceof sl0.C90217b
            if (r2 == 0) goto L_0x000c
            sl0.b r1 = (sl0.C90217b) r1
            jk0.a r1 = r1.f259018g
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.jsruntime.o> r1 = r1.f254568a
            r1.clear()
            goto L_0x000c
        L_0x0026:
            com.tencent.mm.plugin.appbrand.jsapi.audio.c r0 = com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82077c.INSTANCE
            java.lang.String r1 = r7.getAppId()
            r0.getClass()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 == 0) goto L_0x0037
            goto L_0x0047
        L_0x0037:
            int r1 = r1.hashCode()
            android.util.SparseArray<jk0.a> r2 = r0.f240690d
            monitor-enter(r2)
            android.util.SparseArray<jk0.a> r4 = r0.f240690d     // Catch:{ all -> 0x00ad }
            int r1 = r4.indexOfKey(r1)     // Catch:{ all -> 0x00ad }
            if (r1 >= 0) goto L_0x0049
            monitor-exit(r2)     // Catch:{ all -> 0x00ad }
        L_0x0047:
            r4 = r3
            goto L_0x0057
        L_0x0049:
            android.util.SparseArray<jk0.a> r4 = r0.f240690d     // Catch:{ all -> 0x00ad }
            java.lang.Object r4 = r4.valueAt(r1)     // Catch:{ all -> 0x00ad }
            jk0.a r4 = (jk0.C87975a) r4     // Catch:{ all -> 0x00ad }
            android.util.SparseArray<jk0.a> r0 = r0.f240690d     // Catch:{ all -> 0x00ad }
            r0.removeAt(r1)     // Catch:{ all -> 0x00ad }
            monitor-exit(r2)     // Catch:{ all -> 0x00ad }
        L_0x0057:
            if (r4 == 0) goto L_0x005e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.jsruntime.o> r0 = r4.f254568a
            r0.clear()
        L_0x005e:
            zb.i<? extends zb.f> r0 = r7.f262593H
            r0.mo120918d0()
            super.mo114329F()
            zb.i<? extends zb.f> r0 = r7.f262593H
            r0.mo120895A0()
            com.tencent.mm.plugin.appbrand.l2 r0 = com.tencent.p014mm.plugin.appbrand.C83239l2.C83241b.f243111a
            r0.getClass()
            int r1 = r7.hashCode()
            monitor-enter(r0)
            android.util.SparseArray<java.util.List<com.tencent.mm.plugin.appbrand.l2$c>> r2 = r0.f243109a     // Catch:{ all -> 0x00aa }
            int r2 = r2.indexOfKey(r1)     // Catch:{ all -> 0x00aa }
            if (r2 < 0) goto L_0x0082
            android.util.SparseArray<java.util.List<com.tencent.mm.plugin.appbrand.l2$c>> r4 = r0.f243109a     // Catch:{ all -> 0x00aa }
            r4.removeAt(r2)     // Catch:{ all -> 0x00aa }
        L_0x0082:
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "MicroMsg.AppBrandServiceOnRuntimeReadyListenerMgr"
            java.lang.String r4 = "removeAllListeners, service:%d, already removed:%b"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = 0
            r5[r6] = r1
            r1 = 1
            if (r2 >= 0) goto L_0x0096
            r6 = 1
        L_0x0096:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r5[r1] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r5)
            r7.mo114328C0(r3)
            java.lang.Class<aq0.a> r0 = aq0.C79626a.class
            k40.d r1 = r7.f241592q
            r1.mo122506c(r0)
            return
        L_0x00aa:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            throw r1
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ad }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p284zb.C91635f.mo114329F():void");
    }

    /* renamed from: F0 */
    public C90630c mo114341l0() {
        return (C90630c) mo114342m0(C90630c.class);
    }

    /* renamed from: G0 */
    public final <T> T mo125517G0(Class<T> cls) {
        return cls.isInstance(this) ? cls.cast(this) : cls.isInstance(this.f262593H) ? cls.cast(this.f262593H) : cls.cast(this.f262593H.mo116072t(cls));
    }

    /* renamed from: H */
    public final Map<String, C82870p> mo114330H() {
        return this.f262593H.mo114097p();
    }

    /* renamed from: H0 */
    public C86812g getRuntime() {
        return (C86812g) this.f240282A;
    }

    /* renamed from: I0 */
    public void mo122646I0() {
        this.f262593H.mo120924x0();
    }

    /* renamed from: J */
    public C83165i mo114092J() {
        C83165i e0 = this.f262593H.mo120919e0();
        return e0 == null ? super.mo114092J() : e0;
    }

    /* renamed from: J0 */
    public void mo122647J0(JSONObject jSONObject) {
        this.f262593H.mo120897C0(jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("appLaunchInfo");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            mo114881c0(jSONObject, "appLaunchInfo", optJSONObject);
        }
        if (C80247h.HEADLESS == getRuntime().mo113036W().f234829Y0) {
            mo114881c0(optJSONObject, "inBackground", Boolean.TRUE);
        }
        mo114881c0(optJSONObject, "openId", getRuntime().mo113051d0().f234882V0);
        if (getRuntime().mo113036W().f234831Z0 != null && getRuntime().mo113036W().f234831Z0.f244339d) {
            WxAppLibServerMode wxAppLibServerMode = getRuntime().mo113036W().f234831Z0;
            wxAppLibServerMode.getClass();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, wxAppLibServerMode.f244339d);
            jSONObject2.put(TPReportKeys.PlayerStep.PLAYER_REASON, wxAppLibServerMode.f244340e.f244344d);
            mo114881c0(jSONObject, "serverMode", jSONObject2);
        }
    }

    /* renamed from: K0 */
    public final void mo125518K0(C84217q qVar) {
        this.f262594I = qVar;
        Class cls = C83182r.class;
        mo114842M();
        mo114350u0();
        mo114880Z(mo114333Y());
        this.f240291y = true;
        mo122646I0();
        if (getJsRuntime().mo63321n0(cls) != null) {
            ((C83182r) getJsRuntime().mo63321n0(cls)).mo115437F("https://servicewechat.com/preload/js-engine");
        }
    }

    /* renamed from: L0 */
    public void mo122648L0(C90636f.C90637a aVar, boolean z, long j, long j2, Object obj) {
    }

    /* renamed from: U */
    public final void mo114849U() {
        this.f262593H.mo120896B0();
        while (!this.f262596K.isEmpty()) {
            this.f262596K.poll().run();
        }
    }

    /* renamed from: W */
    public void mo114331W(JSONObject jSONObject) {
        super.mo114331W(jSONObject);
        this.f262593H.mo122621c0(jSONObject);
        mo114881c0(jSONObject, "isIsolateContext", Boolean.valueOf(this.f262593H.mo120921r0()));
        mo114881c0(jSONObject, ProviderConstants.API_COLNAME_FEATURE_VERSION, ChannelUtil.formatVersion((Context) null, BuildInfo.CLIENT_VERSION_INT));
        mo114881c0(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, LocaleUtil.getCurrentLanguage(getContext()));
        if (mo114272k() instanceof AbsReader) {
            C14423a Z = ((AbsReader) mo114272k()).mo113370Z();
            Z.getClass();
            if (!Z.f40028a.isEmpty()) {
                try {
                    HashMap<String, String> hashMap = Z.f40028a;
                    C87412m.m108592e(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any?, kotlin.Any?>");
                    jSONObject.put("expt", new JSONObject(hashMap));
                } catch (JSONException e) {
                    Log.m105921e("Luggage.ExptMapping", "applyToWxConfig get exception:" + e, e);
                }
            }
        }
        mo114881c0(jSONObject, "supportInvokeWithAppId", Boolean.TRUE);
    }

    /* renamed from: X */
    public void mo114332X(JSONObject jSONObject) {
        new C91658u().mo114862a(jSONObject);
    }

    /* renamed from: Y */
    public JSONObject mo114333Y() {
        JSONObject Y = super.mo114333Y();
        mo114881c0(Y, "envPreloadType", Integer.valueOf(this.f262594I.ordinal()));
        return Y;
    }

    /* renamed from: a */
    public void mo109647a(int i, String str) {
        if (!this.f262593H.mo122605G0(i, str)) {
            mo114838E(i, str, (C40482o) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r8 = r8.mo113042Z();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109652f(java.lang.String r13, java.lang.String r14, int r15) {
        /*
            r12 = this;
            java.lang.String[] r0 = f262592L
            boolean r0 = u24.C90595a.m113498b(r0, r13)
            r1 = 0
            r2 = 4
            r3 = 2
            r4 = 1
            r5 = 3
            java.lang.String r6 = "MicroMsg.AppBrand.AppBrandServiceLU"
            r7 = 0
            if (r15 == 0) goto L_0x006f
            int r8 = r12.hashCode()
            if (r8 == r15) goto L_0x006f
            fc.g r8 = r12.getRuntime()     // Catch:{ Exception -> 0x0059 }
            if (r8 == 0) goto L_0x0027
            com.tencent.mm.plugin.appbrand.page.m0 r8 = r8.mo113042Z()     // Catch:{ Exception -> 0x0059 }
            if (r8 == 0) goto L_0x0027
            com.tencent.mm.plugin.appbrand.page.d1 r8 = r8.mo116365q(r15, r7)     // Catch:{ Exception -> 0x0059 }
            goto L_0x0028
        L_0x0027:
            r8 = r1
        L_0x0028:
            if (r8 == 0) goto L_0x006f
            boolean r9 = r8.mo116205x1()     // Catch:{ Exception -> 0x0059 }
            if (r9 == 0) goto L_0x006f
            int r8 = r8.mo116147B0()     // Catch:{ Exception -> 0x0059 }
            if (r15 == r8) goto L_0x0057
            if (r0 == 0) goto L_0x0057
            java.lang.String r9 = "dispatch %s, serviceId:%d, replace src(%d) with pageId(%d)"
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0059 }
            r10[r7] = r13     // Catch:{ Exception -> 0x0059 }
            int r11 = r12.hashCode()     // Catch:{ Exception -> 0x0059 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0059 }
            r10[r4] = r11     // Catch:{ Exception -> 0x0059 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0059 }
            r10[r3] = r11     // Catch:{ Exception -> 0x0059 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0059 }
            r10[r5] = r11     // Catch:{ Exception -> 0x0059 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r10)     // Catch:{ Exception -> 0x0059 }
        L_0x0057:
            r15 = r8
            goto L_0x006f
        L_0x0059:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r7] = r13
            int r10 = r12.hashCode()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r4] = r10
            r9[r3] = r8
            java.lang.String r8 = "dispatch %s, serviceId:%d, try replace src with pageId, get exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r8, r9)
        L_0x006f:
            if (r0 == 0) goto L_0x00ca
            fc.g r0 = r12.getRuntime()
            if (r0 != 0) goto L_0x0078
            goto L_0x0080
        L_0x0078:
            fc.g r0 = r12.getRuntime()
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r1 = r0.mo113036W()
        L_0x0080:
            if (r1 == 0) goto L_0x00af
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r7] = r13
            int r7 = r12.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r4] = r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r0[r3] = r4
            java.lang.String r3 = r12.getAppId()
            r0[r5] = r3
            java.lang.String r3 = r1.f234838r
            r0[r2] = r3
            r2 = 5
            java.lang.String r1 = r1.f234837q
            r0[r2] = r1
            r1 = 6
            r0[r1] = r14
            java.lang.String r1 = "dispatch %s, serviceId:%d, src:%d, appId:%s, instanceId:%s, sessionId:%s, data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            goto L_0x00ca
        L_0x00af:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r7] = r13
            int r1 = r12.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r4] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r3] = r1
            r0[r5] = r14
            java.lang.String r1 = "dispatch %s, serviceId:%d, src:%d, data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
        L_0x00ca:
            zb.i<? extends zb.f> r0 = r12.f262593H
            boolean r0 = r0.mo122606H0(r13, r14, r15)
            if (r0 == 0) goto L_0x00d3
            return
        L_0x00d3:
            super.mo109652f(r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p284zb.C91635f.mo109652f(java.lang.String, java.lang.String, int):void");
    }

    /* renamed from: g */
    public boolean mo114094g(String str) {
        return this.f262593H.mo114094g(str);
    }

    /* renamed from: h0 */
    public C83788e0 mo114337h0() {
        return new C91636a();
    }

    /* renamed from: k0 */
    public JSONObject mo114340k0() {
        JSONObject k0 = super.mo114340k0();
        mo114881c0(k0, "appType", Integer.valueOf(getRuntime().mo113036W().f234841u));
        mo114881c0(k0, "debug", Boolean.valueOf(getRuntime().mo113051d0().f234889w));
        mo122647J0(k0);
        int[] a = C84752i2.m104413a(this);
        mo114881c0(k0, "screenWidth", Integer.valueOf(C88020k.m109555f(a[0])));
        mo114881c0(k0, "screenHeight", Integer.valueOf(C88020k.m109555f(a[1])));
        mo114881c0(k0, "supportAsyncGetSystemInfo", Boolean.TRUE);
        mo114881c0(k0, "prerender", Boolean.valueOf(getRuntime().mo113036W().f234829Y0 == C80247h.PRE_RENDER));
        mo114881c0(k0, "instanceId", getRuntime().mo113036W().f234838r);
        String str = getRuntime().mo113051d0().f234856A.f234897f;
        if (!TextUtils.isEmpty(str)) {
            try {
                mo114881c0(k0, "opConfig", new JSONObject(str));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.AppBrandServiceLU", "generateWxConfig() put wxConfig.opConfig, exception=%s", e);
            }
        }
        k0.remove("permission");
        k0.remove("navigateToMiniProgramAppIdList");
        Log.m105925i("MicroMsg.AppBrand.AppBrandServiceLU", "generateWxConfig(%s): %s", getAppId(), k0.toString());
        return k0;
    }

    /* renamed from: n0 */
    public String mo114343n0() {
        return "https://lib/";
    }

    /* renamed from: p0 */
    public String mo114345p0(String str) {
        String i0 = this.f262593H.mo123166i0(str);
        return Util.isNullOrNil(i0) ? "" : i0;
    }

    /* renamed from: q0 */
    public String mo114346q0() {
        return "https://usr/";
    }

    /* renamed from: t0 */
    public final void mo114349t0() {
        super.mo114349t0();
        this.f262593H.mo120920m0();
        Class cls = C83187w.class;
        Log.m105925i("MicroMsg.AppBrandService", "notifyWxConfigReadyIfNeed, hash=%d", Integer.valueOf(hashCode()));
        String format = String.format(Locale.US, ";(function(){ if(__wxConfig.preload) { %s; return true; } else { return false; }})();", new Object[]{C83133y6.m101970c("onWxConfigReady", "", 0)});
        if (getJsRuntime().mo63321n0(cls) != null) {
            ((C83187w) getJsRuntime().mo63321n0(cls)).mo115397R((URL) null, (String) null, (String) null, 0, format, new C81973j2(this));
            return;
        }
        getJsRuntime().evaluateJavascript(format, new C83194k2(this, Util.nowMilliSecond()));
    }

    /* renamed from: v0 */
    public boolean mo114351v0() {
        C91640i<? extends C91635f> iVar = this.f262593H;
        return iVar != null && iVar.mo123167q0();
    }

    /* renamed from: w0 */
    public boolean mo114352w0() {
        return !(this.f262593H instanceof C91655s);
    }

    /* renamed from: x0 */
    public void mo114095x0() {
        if (this.f240291y) {
            C83716o4.m102757b(this, getJsRuntime());
        }
        this.f262593H.mo120923v0();
    }

    /* renamed from: y0 */
    public final void mo114353y0() {
        new C91637b().mo116145s(getRuntime());
        this.f262593H.mo120925y0();
    }

    /* renamed from: z0 */
    public void mo114096z0(AppBrandRuntime appBrandRuntime) {
        super.mo114096z0(appBrandRuntime);
        this.f241588j = mo122643D0();
        this.f262593H.mo120898D0(appBrandRuntime);
    }

    public C91635f(C90629b bVar) {
        this.f262594I = C84217q.CreateOnRuntimeInit;
        this.f262596K = new LinkedList<>();
        String name = bVar.getClass().getName();
        Log.m105919d("MicroMsg.AppBrand.AppBrandServiceLU", "hy: using %s as logic imp", name);
        Class cls = C91638g.m115119b().f260366a.get(bVar.getClass().getName());
        Object obj = null;
        if (cls != null) {
            try {
                obj = (C90626a.C90627a) new C79664a(cls, cls).mo109791d(this).f233575b;
            } catch (Exception e) {
                Log.printErrStackTrace("Luggage.AppBrandLogicFactory", e, "hy: construct failed!", new Object[0]);
            }
        } else {
            Log.m105929w("Luggage.AppBrandLogicFactory", "hy: implement corresponding to type %s not found!", bVar);
        }
        C91640i<? extends C91635f> iVar = (C91640i) obj;
        this.f262593H = iVar;
        if (iVar != null) {
            iVar.getClass();
            return;
        }
        throw new IllegalArgumentException("No logic corresponding implement found with type: " + name);
    }

    public C91635f(Class<? extends C91640i<? extends C91635f>> cls) {
        this.f262594I = C84217q.CreateOnRuntimeInit;
        this.f262596K = new LinkedList<>();
        C91640i<? extends C91635f> iVar = (C91640i) new C79664a(cls, cls).mo109791d(this).f233575b;
        this.f262593H = iVar;
        iVar.getClass();
    }
}
