package com.tencent.p014mm.plugin.websearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c00.C0405n;
import com.eclipsesource.mmv8.Platform;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.IXWebPreferences;
import di3.C86301e;
import di3.C86312j;
import e00.C7573h0;
import ei3.C86522b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ke3.C88144b;
import oa1.C117731d;
import org.json.JSONException;
import org.json.JSONObject;
import p206nj.C11171e;
import p206nj.C117627q;
import p255vr.C65873e;
import u73.C101982p;
import u73.C101987v0;
import u73.C14134p0;
import u73.C14135q;
import u73.C14136q0;
import u73.C52468u0;
import yf3.C39007f;
import zt3.C119157j;

@C86522b
/* renamed from: com.tencent.mm.plugin.websearch.o */
public class C5835o extends C86301e implements C101982p {

    /* renamed from: com.tencent.mm.plugin.websearch.o$a */
    public class C5836a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C14134p0 f21998d;

        public C5836a(C14134p0 p0Var) {
            this.f21998d = p0Var;
        }

        public void run() {
            String str;
            int i;
            String str2;
            Map<String, String> map;
            if (!C43471q.m46984h(0)) {
                Log.m105920e("MicroMsg.WebSearch.StartWebSearchService", "fts h5 template not avail");
                return;
            }
            Log.m105924i("MicroMsg.WebSearch.StartWebSearchService", "startWebSearch");
            C5835o oVar = C5835o.this;
            C14134p0 p0Var = this.f21998d;
            oVar.getClass();
            String str3 = "";
            if (!(p0Var.f39550g == null || (map = p0Var.f39561r) == null || ((HashMap) map).size() <= 0)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    for (Map.Entry entry : ((HashMap) p0Var.f39561r).entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    ((HashMap) p0Var.f39550g).put("extClientParams", Uri.encode(jSONObject.toString()));
                } catch (JSONException e) {
                    Log.printDebugStack("MicroMsg.WebSearch.StartWebSearchService", str3, e);
                }
            }
            C14134p0 p0Var2 = this.f21998d;
            Map<String, String> map2 = p0Var2.f39561r;
            if (map2 != null && p0Var2.f39552i) {
                if (!TextUtils.isEmpty((CharSequence) ((HashMap) map2).get("exposedFingerWord")) || !TextUtils.isEmpty((CharSequence) ((HashMap) this.f21998d.f39561r).get("matchedFingerWord"))) {
                    this.f21998d.f39552i = false;
                }
                C14134p0 p0Var3 = this.f21998d;
                if (p0Var3.f39545b == 77) {
                    p0Var3.f39552i = false;
                }
            }
            String valueOf = String.valueOf(System.currentTimeMillis());
            String e2 = C101987v0.m134271e(this.f21998d.f39545b);
            Map<String, String> map3 = this.f21998d.f39550g;
            if (map3 != null) {
                i = Util.safeParseInt((String) ((HashMap) map3).get("chatSearch"));
                str = (String) ((HashMap) this.f21998d.f39550g).get("reqKey");
            } else {
                str = null;
                i = 0;
            }
            if (!Util.isNullOrNil(this.f21998d.f39563t)) {
                str2 = Uri.encode(this.f21998d.f39563t);
            } else if (!Util.isNullOrNil(this.f21998d.f39558o)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("parentSearchID", this.f21998d.f39558o);
                } catch (Exception unused) {
                }
                str2 = Uri.encode(jSONObject2.toString());
            } else {
                str2 = str3;
            }
            Log.m105924i("MicroMsg.WebSearch.StartWebSearchService", "preload web search data");
            if (this.f21998d.f39562s) {
                HashMap hashMap = new HashMap(this.f21998d.f39550g);
                if (!Util.isNullOrNil(this.f21998d.f39563t)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(this.f21998d.f39563t);
                        Iterator<String> keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, jSONObject3.optString(next, str3));
                        }
                    } catch (Exception unused2) {
                    }
                }
                C14134p0 p0Var4 = this.f21998d;
                C101987v0.m134278l(valueOf, p0Var4.f39548e, e2, p0Var4.f39547d, p0Var4.f39545b, "", -1, p0Var4.f39558o, i, str, hashMap);
            }
            C14134p0 p0Var5 = this.f21998d;
            Map<String, String> c = C101987v0.m134269c(p0Var5.f39545b, p0Var5.f39549f, p0Var5.f39546c, str2, "", p0Var5.f39548e, p0Var5.f39547d, "", e2, "", valueOf);
            Map<String, String> map4 = this.f21998d.f39550g;
            if (map4 != null) {
                ((HashMap) c).putAll(map4);
            }
            try {
                ((HashMap) c).put(SearchIntents.EXTRA_QUERY, C117627q.m165909b(this.f21998d.f39547d, "UTF-8"));
            } catch (Exception unused3) {
                ((HashMap) c).put(SearchIntents.EXTRA_QUERY, this.f21998d.f39547d);
            }
            HashMap hashMap2 = (HashMap) c;
            hashMap2.put("sessionId", this.f21998d.f39548e);
            hashMap2.put("parentSearchID", this.f21998d.f39558o);
            String d = C101987v0.m134270d(c, 0);
            Intent intent = new Intent();
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            intent.putExtra("neverGetA8Key", true);
            if (!TextUtils.isEmpty(this.f21998d.f39564u)) {
                str3 = this.f21998d.f39564u;
            }
            intent.putExtra("searchPlaceHolder", str3);
            intent.putExtra("ftsType", this.f21998d.f39546c);
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f21998d.f39556m);
            intent.putExtra("ftsbizscene", this.f21998d.f39545b);
            intent.putExtra("ftsQuery", this.f21998d.f39547d);
            intent.putExtra("ftsInitToSearch", !TextUtils.isEmpty(this.f21998d.f39547d) || this.f21998d.f39551h);
            intent.putExtra("sessionId", this.f21998d.f39548e);
            intent.putExtra("subSessionId", e2);
            intent.putExtra("rawUrl", d);
            C5835o oVar2 = C5835o.this;
            int i2 = this.f21998d.f39545b;
            oVar2.getClass();
            intent.putExtra("key_preload_biz", 4);
            intent.putExtra("key_weapp_url", C5835o.vx0(C5835o.this, 22, this.f21998d.f39548e));
            intent.putExtra("hideSearchInput", this.f21998d.f39552i);
            intent.putExtra("fts_need_sos_edittext_tobe_touch_only", this.f21998d.f39560q);
            intent.putExtra("key_back_btn_type", this.f21998d.f39553j);
            intent.putExtra("key_hide_shadow_view", this.f21998d.f39555l);
            intent.putExtra("first_page_result", this.f21998d.f39557n);
            this.f21998d.getClass();
            int i3 = this.f21998d.f39554k;
            if (i3 != Integer.MAX_VALUE) {
                intent.putExtra("customize_status_bar_color", i3);
            }
            intent.putExtra("key_load_js_without_delay", true);
            intent.putExtra("ftsneedkeyboard", this.f21998d.f39565v);
            if (this.f21998d.f39559p) {
                intent.addFlags(67108864);
            }
            C14134p0 p0Var6 = this.f21998d;
            ((C7573h0) C86312j.m106911c(C7573h0.class)).n10(p0Var6.f39544a, intent, p0Var6.f39566w, false);
            C5835o.wx0(C5835o.this, this.f21998d.f39545b);
            C14134p0 p0Var7 = this.f21998d;
            C14136q0.m13469a(p0Var7.f39545b, p0Var7.f39548e, e2, p0Var7.f39549f, p0Var7.f39547d, p0Var7.f39546c, "", false, "");
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.o$b */
    public class C5837b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C14134p0 f22000d;

        /* renamed from: e */
        public final /* synthetic */ Context f22001e;

        public C5837b(C5835o oVar, C14134p0 p0Var, Context context) {
            this.f22000d = p0Var;
            this.f22001e = context;
        }

        public void run() {
            if (!C43471q.m46984h(0)) {
                Log.m105920e("MicroMsg.WebSearch.StartWebSearchService", "fts h5 template not avail");
                return;
            }
            int i = this.f22000d.f39545b;
            String ep02 = ((C65873e) C86312j.m106911c(C65873e.class)).ep0(i);
            int i2 = this.f22000d.f39546c;
            Intent intent = new Intent();
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("ftsbizscene", i);
            intent.putExtra("ftsType", i2);
            intent.putExtra("key_change_search_icon", true);
            intent.putExtra("key_search_icon_and_hint_fix_default", true);
            Map<String, String> a = C101987v0.m134267a(i, false, i2);
            HashMap hashMap = (HashMap) a;
            hashMap.put("sessionId", ep02);
            hashMap.put("subSessionId", ep02);
            intent.putExtra("sessionId", ep02);
            intent.putExtra("subSessionId", ep02);
            String d = C101987v0.m134270d(a, 0);
            intent.putExtra("rawUrl", d);
            Log.m105924i("MicroMsg.WebSearch.StartWebSearchService", "startMiniSearchTabByTemplate , KRawUrl = " + d);
            intent.putExtra("key_load_js_without_delay", true);
            intent.putExtra("ftsneedkeyboard", this.f22000d.f39565v);
            intent.putExtra("key_preload_biz", 4);
            intent.putExtra("ftsForceShowDarkMode", false);
            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2414g3);
            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2415g4);
            C88144b.m109806x(this.f22001e, intent, (Bundle) null);
            if ((this.f22001e instanceof Activity) && C11171e.m11045b(16)) {
                ((Activity) this.f22001e).overridePendingTransition(C0966R.C0968anim.f2414g3, C0966R.C0968anim.f2415g4);
            }
            C14136q0.m13469a(i, ep02, ep02, false, this.f22000d.f39547d, i2, "", false, "");
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.o$c */
    public class C5838c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f22002d;

        /* renamed from: e */
        public final /* synthetic */ Map f22003e;

        /* renamed from: f */
        public final /* synthetic */ String f22004f;

        /* renamed from: g */
        public final /* synthetic */ int f22005g;

        /* renamed from: h */
        public final /* synthetic */ boolean f22006h;

        /* renamed from: i */
        public final /* synthetic */ int f22007i;

        /* renamed from: j */
        public final /* synthetic */ String f22008j;

        /* renamed from: n */
        public final /* synthetic */ String f22009n;

        /* renamed from: o */
        public final /* synthetic */ boolean f22010o;

        /* renamed from: p */
        public final /* synthetic */ boolean f22011p;

        /* renamed from: q */
        public final /* synthetic */ int f22012q;

        /* renamed from: r */
        public final /* synthetic */ boolean f22013r;

        /* renamed from: s */
        public final /* synthetic */ boolean f22014s;

        /* renamed from: t */
        public final /* synthetic */ int f22015t;

        public C5838c(Context context, Map map, String str, int i, boolean z, int i2, String str2, String str3, boolean z2, boolean z3, int i3, boolean z4, boolean z5, int i4) {
            this.f22002d = context;
            this.f22003e = map;
            this.f22004f = str;
            this.f22005g = i;
            this.f22006h = z;
            this.f22007i = i2;
            this.f22008j = str2;
            this.f22009n = str3;
            this.f22010o = z2;
            this.f22011p = z3;
            this.f22012q = i3;
            this.f22013r = z4;
            this.f22014s = z5;
            this.f22015t = i4;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r32 = this;
                r1 = r32
                java.lang.String r2 = "crossExtReqParams"
                java.lang.String r3 = "query"
                r4 = 0
                boolean r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46984h(r4)
                java.lang.String r5 = "MicroMsg.WebSearch.StartWebSearchService"
                if (r0 != 0) goto L_0x0015
                java.lang.String r0 = "fts h5 template not avail"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
                return
            L_0x0015:
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoverySearch
                android.content.Context r6 = r1.f22002d
                boolean r0 = r0.checkAvailable(r6)
                if (r0 != 0) goto L_0x0020
                return
            L_0x0020:
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                java.util.Map r0 = r1.f22003e
                java.lang.String r7 = ""
                r8 = 1
                if (r0 == 0) goto L_0x00e1
                java.lang.String r9 = "sugId"
                java.lang.Object r0 = r0.get(r9)
                java.lang.String r0 = (java.lang.String) r0
                java.util.Map r10 = r1.f22003e
                java.lang.String r11 = "parentSearchID"
                boolean r10 = r10.containsKey(r11)
                if (r10 == 0) goto L_0x0049
                java.util.Map r0 = r1.f22003e
                java.lang.Object r0 = r0.get(r11)
                java.lang.String r0 = (java.lang.String) r0
            L_0x0047:
                r10 = r0
                goto L_0x008a
            L_0x0049:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.util.Map r12 = r1.f22003e
                java.lang.String r13 = "clickType"
                boolean r12 = r12.containsKey(r13)
                java.lang.String r14 = ":"
                if (r12 == 0) goto L_0x0072
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.util.Map r15 = r1.f22003e
                java.lang.Object r13 = r15.get(r13)
                java.lang.String r13 = (java.lang.String) r13
                r12.append(r13)
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                goto L_0x0074
            L_0x0072:
                java.lang.String r12 = "0:"
            L_0x0074:
                r10.append(r12)
                r10.append(r0)
                r10.append(r14)
                java.lang.String r0 = r1.f22004f
                r10.append(r0)
                r10.append(r14)
                java.lang.String r0 = r10.toString()
                goto L_0x0047
            L_0x008a:
                r6.put(r11, r10)     // Catch:{ JSONException -> 0x008e }
                goto L_0x0097
            L_0x008e:
                r0 = move-exception
                r11 = r0
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r0[r4] = r11
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r7, r0)
            L_0x0097:
                java.util.Map r0 = r1.f22003e
                java.lang.Object r0 = r0.get(r9)
                r9 = r0
                java.lang.String r9 = (java.lang.String) r9
                java.util.Map r0 = r1.f22003e
                java.lang.String r11 = "sceneActionType"
                java.lang.Object r0 = r0.get(r11)
                java.lang.String r0 = (java.lang.String) r0
                int r11 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
                java.util.Map r0 = r1.f22003e
                java.lang.String r12 = "chatSearch"
                java.lang.Object r0 = r0.get(r12)
                java.lang.String r0 = (java.lang.String) r0
                int r12 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
                java.util.Map r0 = r1.f22003e     // Catch:{ Exception -> 0x00d1 }
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x00d1 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00d1 }
                if (r0 == 0) goto L_0x00d9
                java.util.Map r13 = r1.f22003e     // Catch:{ Exception -> 0x00d1 }
                java.lang.String r0 = android.net.Uri.encode(r0)     // Catch:{ Exception -> 0x00d1 }
                r13.put(r2, r0)     // Catch:{ Exception -> 0x00d1 }
                goto L_0x00d9
            L_0x00d1:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r8]
                r2[r4] = r0
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r7, r2)
            L_0x00d9:
                r17 = r9
                r7 = r10
                r18 = r11
                r20 = r12
                goto L_0x00e8
            L_0x00e1:
                r11 = -1
                r17 = r7
                r18 = -1
                r20 = 0
            L_0x00e8:
                r0 = 2
                java.lang.Object[] r2 = new java.lang.Object[r0]
                r2[r4] = r7
                int r9 = r1.f22005g
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r2[r8] = r9
                java.lang.String r9 = "startWebSearch parentSearchID=%s,scene=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r2)
                long r9 = java.lang.System.currentTimeMillis()
                java.lang.String r31 = java.lang.String.valueOf(r9)
                int r2 = r1.f22005g
                java.lang.String r2 = u73.C101987v0.m134271e(r2)
                java.util.Map r9 = r1.f22003e
                if (r9 == 0) goto L_0x0125
                java.lang.String r10 = "pass_key"
                java.lang.Object r9 = r9.get(r10)
                if (r9 == 0) goto L_0x0125
                java.util.Map r9 = r1.f22003e
                java.lang.Object r9 = r9.get(r10)
                java.lang.String r9 = (java.lang.String) r9
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 != 0) goto L_0x0125
                r9 = 0
                goto L_0x0126
            L_0x0125:
                r9 = 1
            L_0x0126:
                boolean r10 = r1.f22006h
                if (r10 == 0) goto L_0x014d
                int r10 = r1.f22007i
                if (r10 != 0) goto L_0x014d
                if (r20 != 0) goto L_0x014d
                if (r9 == 0) goto L_0x014d
                java.lang.String r10 = "preload web search data"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
                java.lang.String r13 = r1.f22008j
                java.lang.String r15 = r1.f22004f
                int r10 = r1.f22005g
                r21 = 0
                java.util.Map r11 = r1.f22003e
                r12 = r31
                r14 = r2
                r16 = r10
                r19 = r7
                r22 = r11
                u73.C101987v0.m134278l(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            L_0x014d:
                com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent r10 = new com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent
                r10.<init>()
                com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent$a r11 = r10.f264957d
                r11.f264958a = r4
                r10.publish()
                int r10 = r1.f22005g
                boolean r11 = r1.f22006h
                int r12 = r1.f22007i
                java.lang.String r6 = r6.toString()
                java.lang.String r24 = android.net.Uri.encode(r6)
                java.lang.String r6 = r1.f22008j
                java.lang.String r13 = r1.f22004f
                java.lang.String r25 = ""
                java.lang.String r28 = ""
                java.lang.String r30 = ""
                r21 = r10
                r22 = r11
                r23 = r12
                r26 = r6
                r27 = r13
                r29 = r2
                java.util.Map r6 = u73.C101987v0.m134269c(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                java.util.Map r10 = r1.f22003e
                if (r10 == 0) goto L_0x018b
                r11 = r6
                java.util.HashMap r11 = (java.util.HashMap) r11
                r11.putAll(r10)
            L_0x018b:
                java.lang.String r10 = r1.f22004f     // Catch:{ Exception -> 0x019a }
                java.lang.String r11 = "UTF-8"
                java.lang.String r10 = p206nj.C117627q.m165909b(r10, r11)     // Catch:{ Exception -> 0x019a }
                r11 = r6
                java.util.HashMap r11 = (java.util.HashMap) r11     // Catch:{ Exception -> 0x019a }
                r11.put(r3, r10)     // Catch:{ Exception -> 0x019a }
                goto L_0x01a2
            L_0x019a:
                java.lang.String r10 = r1.f22004f
                r11 = r6
                java.util.HashMap r11 = (java.util.HashMap) r11
                r11.put(r3, r10)
            L_0x01a2:
                java.lang.String r3 = r1.f22008j
                r10 = r6
                java.util.HashMap r10 = (java.util.HashMap) r10
                java.lang.String r11 = "sessionId"
                r10.put(r11, r3)
                java.lang.String r3 = "cachePageResult"
                java.lang.Object r12 = r10.get(r3)
                java.lang.String r12 = (java.lang.String) r12
                r10.remove(r3)
                java.lang.String r3 = u73.C101987v0.m134270d(r6, r4)
                java.util.Map r6 = r1.f22003e
                if (r6 == 0) goto L_0x01d0
                java.lang.String r10 = "needCameraIcon"
                java.lang.Object r6 = r6.get(r10)
                java.lang.String r10 = "0"
                boolean r6 = r10.equals(r6)
                if (r6 == 0) goto L_0x01d0
                r6 = 0
                goto L_0x01d1
            L_0x01d0:
                r6 = 1
            L_0x01d1:
                r10 = 4
                java.lang.Object[] r13 = new java.lang.Object[r10]
                r13[r4] = r7
                int r7 = r1.f22005g
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r13[r8] = r7
                r13[r0] = r3
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
                r7 = 3
                r13[r7] = r0
                java.lang.String r0 = "startWebSearch parentSearchID=%s,scene=%s， rawUrl=%s, needPreLoadSearchData = %s."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r13)
                int r0 = r1.f22005g
                java.lang.String r5 = r1.f22008j
                boolean r9 = r1.f22006h
                java.lang.String r13 = r1.f22004f
                int r14 = r1.f22007i
                r28 = 0
                java.lang.String r27 = ""
                java.lang.String r29 = ""
                r21 = r0
                r22 = r5
                r23 = r2
                r24 = r9
                r25 = r13
                r26 = r14
                u73.C14136q0.m13469a(r21, r22, r23, r24, r25, r26, r27, r28, r29)
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                com.tencent.mm.protocal.JsapiPermissionWrapper r5 = com.tencent.p014mm.protocal.JsapiPermissionWrapper.f121047h
                java.lang.String r9 = "hardcode_jspermission"
                r0.putExtra(r9, r5)
                com.tencent.mm.protocal.GeneralControlWrapper r5 = com.tencent.p014mm.protocal.GeneralControlWrapper.f121044e
                java.lang.String r9 = "hardcode_general_ctrl"
                r0.putExtra(r9, r5)
                java.lang.String r5 = "neverGetA8Key"
                r0.putExtra(r5, r8)
                java.lang.String r5 = "ftsNeedShowCamera"
                r0.putExtra(r5, r6)
                int r5 = r1.f22007i
                java.lang.String r6 = "ftsType"
                r0.putExtra(r6, r5)
                java.lang.String r5 = r1.f22009n
                java.lang.String r6 = "title"
                r0.putExtra(r6, r5)
                int r5 = r1.f22005g
                java.lang.String r6 = "ftsbizscene"
                r0.putExtra(r6, r5)
                java.lang.String r5 = r1.f22004f
                java.lang.String r6 = "ftsQuery"
                r0.putExtra(r6, r5)
                java.lang.String r5 = r1.f22004f
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 == 0) goto L_0x0252
                boolean r5 = r1.f22010o
                if (r5 == 0) goto L_0x0253
            L_0x0252:
                r4 = 1
            L_0x0253:
                java.lang.String r5 = "ftsInitToSearch"
                r0.putExtra(r5, r4)
                java.lang.String r4 = r1.f22008j
                r0.putExtra(r11, r4)
                java.lang.String r4 = "subSessionId"
                r0.putExtra(r4, r2)
                java.lang.String r2 = "rawUrl"
                r0.putExtra(r2, r3)
                com.tencent.mm.plugin.websearch.o r2 = com.tencent.p014mm.plugin.websearch.C5835o.this
                r2.getClass()
                java.lang.String r2 = "key_preload_biz"
                r0.putExtra(r2, r10)
                com.tencent.mm.plugin.websearch.o r2 = com.tencent.p014mm.plugin.websearch.C5835o.this
                r3 = 22
                java.lang.String r4 = r1.f22008j
                java.lang.String r2 = com.tencent.p014mm.plugin.websearch.C5835o.vx0(r2, r3, r4)
                java.lang.String r3 = "key_weapp_url"
                r0.putExtra(r3, r2)
                boolean r2 = r1.f22011p
                java.lang.String r3 = "hideSearchInput"
                r0.putExtra(r3, r2)
                int r2 = r1.f22012q
                java.lang.String r3 = "key_back_btn_type"
                r0.putExtra(r3, r2)
                boolean r2 = r1.f22013r
                java.lang.String r3 = "key_hide_shadow_view"
                r0.putExtra(r3, r2)
                java.lang.String r2 = "first_page_result"
                r0.putExtra(r2, r12)
                boolean r2 = r1.f22014s
                if (r2 == 0) goto L_0x02a7
                java.lang.String r2 = "status_bar_style"
                java.lang.String r3 = "black"
                r0.putExtra(r2, r3)
            L_0x02a7:
                int r2 = r1.f22015t
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r2 == r3) goto L_0x02b3
                java.lang.String r3 = "customize_status_bar_color"
                r0.putExtra(r3, r2)
            L_0x02b3:
                java.lang.String r2 = "key_load_js_without_delay"
                r0.putExtra(r2, r8)
                int r2 = r1.f22005g
                r3 = 56
                if (r2 != r3) goto L_0x02c3
                java.lang.String r2 = "ftsneedkeyboard"
                r0.putExtra(r2, r8)
            L_0x02c3:
                java.util.Map r2 = r1.f22003e
                if (r2 == 0) goto L_0x02da
                java.lang.String r3 = "needShowQueryFirst"
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r3 = "1"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L_0x02da
                java.lang.String r2 = "need_show_query_first"
                r0.putExtra(r2, r8)
            L_0x02da:
                int r2 = r1.f22005g
                if (r2 != r7) goto L_0x02e3
                r2 = 15
                ie3.C87716k.f253994a = r2
                goto L_0x02eb
            L_0x02e3:
                r3 = 20
                if (r2 != r3) goto L_0x02eb
                r2 = 35
                ie3.C87716k.f253994a = r2
            L_0x02eb:
                android.content.Context r2 = r1.f22002d
                ke3.C88144b.m109805w(r2, r0)
                com.tencent.mm.plugin.websearch.o r0 = com.tencent.p014mm.plugin.websearch.C5835o.this
                int r2 = r1.f22005g
                com.tencent.p014mm.plugin.websearch.C5835o.wx0(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.websearch.C5835o.C5838c.run():void");
        }
    }

    public static String vx0(C5835o oVar, int i, String str) {
        oVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, String.valueOf(i));
        hashMap.put("type", String.valueOf(64));
        hashMap.put(IXWebPreferences.XWEB_LANGUAGE, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
        hashMap.put("platform", Platform.ANDROID);
        hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, String.valueOf(C43471q.m46977a(3)));
        hashMap.put("isHomePage", "0");
        if (C85875k4.m106211z()) {
            hashMap.put("isDarkMode", "1");
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("extParams", "");
        }
        hashMap.put("isSug", "1");
        hashMap.put("sessionId", str);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("file://");
        stringBuffer.append(C43471q.m46978b(3));
        stringBuffer.append("/app.html?");
        for (Map.Entry entry : hashMap.entrySet()) {
            stringBuffer.append("&");
            stringBuffer.append((String) entry.getKey());
            stringBuffer.append("=");
            stringBuffer.append((String) entry.getValue());
        }
        if (!hashMap.containsKey("sessionId")) {
            stringBuffer.append("&");
            stringBuffer.append("sessionId");
            stringBuffer.append("=");
            stringBuffer.append(((C0405n) C86312j.m106911c(C0405n.class)).lh0(Util.safeParseInt((String) hashMap.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE))));
        }
        return stringBuffer.toString();
    }

    public static void wx0(C5835o oVar, int i) {
        oVar.getClass();
        if (C117731d.m166007c().mo182440a(new C39007f()) != 1 || i != 3) {
            ((C119157j) C119157j.f356862d).mo183879j(new C52468u0(true, false), 1000, "WebSearchThread");
        }
    }

    /* renamed from: IY */
    public void mo6876IY(Context context, int i, String str, String str2, boolean z) {
        z30(context, i, str, str2, z, (Map<String, String>) null);
    }

    /* renamed from: X6 */
    public void mo6877X6(C14134p0 p0Var) {
        ((C14135q) C86312j.m106911c(C14135q.class)).mo13549kN(p0Var.f39544a, new C5836a(p0Var));
    }

    /* renamed from: da */
    public void mo6878da(Context context, int i, String str, String str2, boolean z, Map<String, String> map, int i2, boolean z2) {
        yx0(context, i, str, str2, z, map, false, Integer.MAX_VALUE, "", i2, z2, false, 0, false);
    }

    public void in0(Context context, int i, String str, String str2, boolean z, Map<String, String> map, String str3) {
        xx0(context, i, str, str2, z, map, false, Integer.MAX_VALUE, str3, 0);
    }

    /* renamed from: nv */
    public void mo6880nv(Context context, int i, String str, String str2, boolean z, Map<String, String> map, boolean z2, int i2) {
        xx0(context, i, str, str2, z, map, z2, i2, "", 0);
    }

    /* renamed from: ph */
    public void mo6881ph(Context context, int i, String str, String str2, boolean z, Map<String, String> map, String str3, int i2, boolean z2) {
        yx0(context, i, str, str2, z, map, false, i2, str3, 0, z2, false, 0, false);
    }

    public void xx0(Context context, int i, String str, String str2, boolean z, Map<String, String> map, boolean z2, int i2, String str3, int i3) {
        yx0(context, i, str, str2, z, map, z2, i2, str3, i3, false, false, 0, false);
    }

    /* renamed from: yJ */
    public void mo6883yJ(Context context, C14134p0 p0Var) {
        ((C14135q) C86312j.m106911c(C14135q.class)).mo13549kN(context, new C5837b(this, p0Var, context));
    }

    public void yx0(Context context, int i, String str, String str2, boolean z, Map<String, String> map, boolean z2, int i2, String str3, int i3, boolean z3, boolean z4, int i4, boolean z5) {
        C5838c cVar = r1;
        C5838c cVar2 = new C5838c(context, map, str, i, z, i3, str2, str3, z3, z4, i4, z5, z2, i2);
        ((C14135q) C86312j.m106911c(C14135q.class)).mo13549kN(context, cVar);
    }

    public void z30(Context context, int i, String str, String str2, boolean z, Map<String, String> map) {
        in0(context, i, str, str2, z, map, "");
    }
}
