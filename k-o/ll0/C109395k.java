package ll0;

import android.text.TextUtils;
import c30.C79922d;
import c30.C79923f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104873k;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68709b1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68711c2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84954e1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84959i;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import js0.C88020k;
import js0.C88024r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p518fb.C86780b;
import p518fb.C86781c;
import rt0.C110651a;
import rt0.C110652b;
import rt0.C110653f;

/* renamed from: ll0.k */
public class C109395k extends C109390a<C110653f> {
    public static final int CTRL_INDEX = 1;
    public static final String NAME = "showKeyboard";

    /* renamed from: ll0.k$a */
    public class C88580a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83780d1 f255829d;

        /* renamed from: e */
        public final /* synthetic */ int f255830e;

        /* renamed from: f */
        public final /* synthetic */ int f255831f;

        /* renamed from: g */
        public final /* synthetic */ int f255832g;

        /* renamed from: h */
        public final /* synthetic */ int f255833h;

        public C88580a(C83780d1 d1Var, int i, int i2, int i3, int i4) {
            this.f255829d = d1Var;
            this.f255830e = i;
            this.f255831f = i2;
            this.f255832g = i3;
            this.f255833h = i4;
        }

        public void run() {
            C83780d1 d1Var = this.f255829d;
            int i = this.f255830e;
            int i2 = this.f255831f;
            int i3 = this.f255832g;
            C84954e1<?> a = C84947c0.m104713a(d1Var, i);
            if (a != null && a.mo117822g(d1Var) && a.mo117819d(i2, i3, d1Var.f244577X.forceLightMode())) {
                this.f255829d.mo109647a(this.f255833h, C109395k.this.mo115109j("ok"));
            } else {
                this.f255829d.mo109647a(this.f255833h, C109395k.this.mo115109j("fail:invalid data"));
            }
        }
    }

    /* renamed from: ll0.k$b */
    public class C109396b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83780d1 f327475d;

        /* renamed from: e */
        public final /* synthetic */ int f327476e;

        /* renamed from: f */
        public final /* synthetic */ int f327477f;

        /* renamed from: g */
        public final /* synthetic */ String f327478g;

        /* renamed from: h */
        public final /* synthetic */ C110653f f327479h;

        /* renamed from: i */
        public final /* synthetic */ int f327480i;

        public C109396b(C83780d1 d1Var, int i, int i2, String str, C110653f fVar, int i3) {
            this.f327475d = d1Var;
            this.f327476e = i;
            this.f327477f = i2;
            this.f327478g = str;
            this.f327479h = fVar;
            this.f327480i = i3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
            r15 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
            r9 = r16.mo117828j(r8.f244558J, r10, r19, r20, r21, r22);
         */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0132  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r23 = this;
                r0 = r23
                ll0.k r2 = ll0.C109395k.this
                com.tencent.mm.plugin.appbrand.page.d1 r1 = r0.f327475d
                int r6 = r0.f327476e
                int r7 = r0.f327477f
                java.lang.String r3 = r0.f327478g
                rt0.f r5 = r0.f327479h
                int r4 = r0.f327480i
                r2.getClass()
                com.tencent.mm.plugin.appbrand.widget.input.u r14 = com.tencent.p014mm.plugin.appbrand.widget.input.C104924u.C104925a.f311549a
                java.lang.String r8 = r5.f331018R
                u.d<com.tencent.mm.plugin.appbrand.widget.input.c$c$a> r9 = com.tencent.p014mm.plugin.appbrand.widget.input.C104849c.C104852c.f311384d
                java.util.Iterator r9 = r9.iterator()
            L_0x001d:
                r10 = r9
                u.h$a r10 = (p1042u.C118556h.C118557a) r10
                boolean r11 = r10.hasNext()
                r12 = 0
                if (r11 == 0) goto L_0x0034
                java.lang.Object r10 = r10.next()
                com.tencent.mm.plugin.appbrand.widget.input.c$c$a r10 = (com.tencent.p014mm.plugin.appbrand.widget.input.C104849c.C104852c.C104853a) r10
                com.tencent.mm.plugin.appbrand.widget.input.c r10 = r10.mo148749a(r8, r1, r5)
                if (r10 == 0) goto L_0x001d
                goto L_0x004d
            L_0x0034:
                boolean r9 = com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0.m104717f(r8)
                if (r9 == 0) goto L_0x0040
                com.tencent.mm.plugin.appbrand.widget.input.d r10 = new com.tencent.mm.plugin.appbrand.widget.input.d
                r10.<init>(r8, r1, r5)
                goto L_0x004d
            L_0x0040:
                java.lang.String r9 = "safe-password"
                boolean r9 = r9.equalsIgnoreCase(r8)
                if (r9 == 0) goto L_0x004f
                com.tencent.mm.plugin.appbrand.widget.input.o0 r10 = new com.tencent.mm.plugin.appbrand.widget.input.o0
                r10.<init>(r8, r1, r5)
            L_0x004d:
                r15 = r10
                goto L_0x0050
            L_0x004f:
                r15 = r12
            L_0x0050:
                if (r15 != 0) goto L_0x0054
                goto L_0x00da
            L_0x0054:
                java.lang.String r8 = r5.f331030a
                if (r8 == 0) goto L_0x005b
                r15.mo148747p(r8)
            L_0x005b:
                r15.mo148740i(r5)
                rt0.a r8 = r5.f331022V
                if (r8 == 0) goto L_0x007a
                java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.page.d1> r9 = r15.f311378h
                java.lang.Object r9 = r9.get()
                com.tencent.mm.plugin.appbrand.page.d1 r9 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r9
                if (r9 == 0) goto L_0x007a
                android.widget.EditText r10 = r15.mo148742k()
                if (r10 != 0) goto L_0x0073
                goto L_0x007a
            L_0x0073:
                android.widget.EditText r10 = r15.mo148742k()
                com.tencent.p014mm.plugin.appbrand.widget.input.autofill.C104841e.m140510a(r9, r10, r8)
            L_0x007a:
                java.lang.Integer r8 = r5.f331031b
                int r19 = r8.intValue()
                java.lang.Integer r8 = r5.f331032c
                int r20 = r8.intValue()
                java.lang.Integer r8 = r5.f331034e
                int r21 = r8.intValue()
                java.lang.Integer r8 = r5.f331033d
                int r22 = r8.intValue()
                java.lang.ref.WeakReference<com.tencent.mm.plugin.appbrand.page.d1> r8 = r15.f311378h
                java.lang.Object r8 = r8.get()
                com.tencent.mm.plugin.appbrand.page.d1 r8 = (com.tencent.p014mm.plugin.appbrand.page.C83780d1) r8
                r9 = 0
                if (r8 == 0) goto L_0x00cb
                com.tencent.mm.plugin.appbrand.page.e3 r10 = r8.f244558J
                if (r10 != 0) goto L_0x00a2
                goto L_0x00cb
            L_0x00a2:
                android.widget.EditText r10 = r15.mo148742k()
                if (r10 != 0) goto L_0x00a9
                goto L_0x00cb
            L_0x00a9:
                android.view.ViewGroup r11 = r8.mo116152G0()
                r16 = r11
                com.tencent.mm.plugin.appbrand.widget.input.h r16 = (com.tencent.p014mm.plugin.appbrand.widget.input.C84957h) r16
                if (r16 != 0) goto L_0x00b4
                goto L_0x00cb
            L_0x00b4:
                com.tencent.mm.plugin.appbrand.page.e3 r8 = r8.f244558J
                r17 = r8
                r18 = r10
                boolean r9 = r16.mo117828j(r17, r18, r19, r20, r21, r22)
                if (r9 == 0) goto L_0x00cb
                r8 = r10
                com.tencent.mm.plugin.appbrand.widget.input.f1 r8 = (com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1) r8
                android.view.View$OnFocusChangeListener r11 = r15.f311379i
                r8.mo148811h(r11)
                r10.addTextChangedListener(r15)
            L_0x00cb:
                if (r9 != 0) goto L_0x00ce
                goto L_0x00da
            L_0x00ce:
                br0.c r8 = r1.f244577X
                boolean r8 = r8.forceLightMode()
                boolean r8 = r15.mo117819d(r6, r7, r8)
                if (r8 != 0) goto L_0x00dd
            L_0x00da:
                r17 = r7
                goto L_0x011b
            L_0x00dd:
                java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
                r13.<init>(r1)
                int r12 = r15.f311376f
                android.widget.EditText r8 = r15.mo148742k()
                com.tencent.mm.plugin.appbrand.widget.input.f1 r8 = (com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1) r8
                com.tencent.mm.plugin.appbrand.widget.input.r r9 = new com.tencent.mm.plugin.appbrand.widget.input.r
                r9.<init>(r14, r13, r15, r3)
                r8.setOnKeyUpPostImeListener(r9)
                com.tencent.mm.plugin.appbrand.widget.input.s r11 = new com.tencent.mm.plugin.appbrand.widget.input.s
                r8 = r11
                r9 = r14
                r10 = r13
                r0 = r11
                r11 = r15
                r16 = r12
                r17 = r7
                r7 = r13
                r13 = r3
                r8.<init>(r9, r10, r11, r12, r13)
                r15.f311374d = r0
                com.tencent.mm.plugin.appbrand.widget.input.t r0 = new com.tencent.mm.plugin.appbrand.widget.input.t
                r8 = r16
                r0.<init>(r14, r7, r8)
                r15.f311375e = r0
                js0.l<com.tencent.mm.plugin.appbrand.page.d1, com.tencent.mm.plugin.appbrand.widget.input.e1<?>> r0 = com.tencent.p014mm.plugin.appbrand.widget.input.C84955f.f247608a
                r0.mo122464e(r1, r15)
                com.tencent.mm.plugin.appbrand.widget.input.w r0 = new com.tencent.mm.plugin.appbrand.widget.input.w
                r0.<init>(r1)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            L_0x011b:
                if (r12 == 0) goto L_0x0132
                java.util.HashMap r0 = new java.util.HashMap
                r3 = 1
                r0.<init>(r3)
                java.lang.String r3 = "inputId"
                r0.put(r3, r12)
                java.lang.String r3 = "ok"
                java.lang.String r0 = r2.mo115112m(r3, r0)
                r1.mo109647a(r4, r0)
                goto L_0x0163
            L_0x0132:
                java.lang.String r0 = r1.getAppId()
                r1.getComponentId()
                java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
                r7.<init>(r1)
                r5.f331023W = r7
                com.tencent.mm.plugin.appbrand.widget.input.k r4 = r2.mo160600C(r7, r3, r4)
                ll0.l r3 = new ll0.l
                r3.<init>(r2, r4, r0, r1)
                ot0.a r0 = r4.f311438y
                r0.f329349b = r3
                ll0.m r0 = new ll0.m
                r0.<init>(r2, r7)
                r4.f311422f = r0
                r2.mo160599B(r4)
                ll0.n r0 = new ll0.n
                r1 = r0
                r3 = r7
                r7 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7)
                js0.C88024r.m109572b(r0)
            L_0x0163:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ll0.C109395k.C109396b.run():void");
        }
    }

    /* renamed from: ll0.k$c */
    public class C109397c extends C104873k {

        /* renamed from: G */
        public final /* synthetic */ WeakReference f327482G;

        /* renamed from: H */
        public final /* synthetic */ int f327483H;

        /* renamed from: I */
        public final /* synthetic */ String f327484I;

        public C109397c(WeakReference weakReference, int i, String str) {
            this.f327482G = weakReference;
            this.f327483H = i;
            this.f327484I = str;
        }

        /* renamed from: u */
        public void mo148843u(String str) {
            C83780d1 d1Var = (C83780d1) this.f327482G.get();
            if (d1Var != null) {
                try {
                    int i = this.f311429p;
                    C109398d dVar = new C109398d();
                    JSONObject put = new JSONObject().put("value", C84737f0.m104397d(str)).put("data", C109395k.this.mo160598z(i)).put("cursor", 0).put("inputId", i).put("keyCode", 8);
                    dVar.mo115195q(d1Var.getRuntime().mo113047b0(), d1Var.getComponentId());
                    dVar.f242407f = put.toString();
                    dVar.mo115158h();
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.JsApiShowKeyboard", "onBackspacePressedWhileValueNoChange, e = %s", e);
                }
            }
        }

        /* renamed from: v */
        public void mo148844v(String str, int i, boolean z, boolean z2) {
            C83780d1 d1Var;
            C83797e3 e3Var;
            C82381f fVar = (C82381f) this.f327482G.get();
            if (fVar != null) {
                String str2 = null;
                try {
                    str2 = new JSONObject().put("value", C84737f0.m104397d(str)).put("inputId", this.f311429p).put("cursor", i).toString();
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.JsApiShowKeyboard", "dispatch input done, exp = %s", Util.stackTraceToString(e));
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (z) {
                        fVar.mo109650d(C86781c.NAME, str2);
                    }
                    if (!z2) {
                        fVar.mo109650d(C86780b.NAME, str2);
                    }
                }
                if (!z2 && (d1Var = (C83780d1) this.f327482G.get()) != null && (e3Var = d1Var.f244558J) != null) {
                    C84959i.f247617b.mo117842c(e3Var);
                }
            }
        }

        /* renamed from: w */
        public void mo148845w(String str, int i, boolean z, boolean z2, String str2, String str3) {
            C83780d1 d1Var;
            C83797e3 e3Var;
            C82381f fVar = (C82381f) this.f327482G.get();
            if (fVar != null) {
                String str4 = null;
                try {
                    JSONObject put = new JSONObject().put("value", C84737f0.m104397d(str)).put("inputId", this.f311429p).put("cursor", i);
                    if (str2 != null) {
                        put.put("encryptValue", str2);
                    }
                    if (str3 != null) {
                        put.put("encryptError", str3);
                    }
                    str4 = put.toString();
                    Log.m105925i("MicroMsg.JsApiShowKeyboard", "onInputDoneWithEncryptedValue, eventData: %s", str4);
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.JsApiShowKeyboard", "dispatch input done, exp = %s", Util.stackTraceToString(e));
                }
                if (!TextUtils.isEmpty(str4)) {
                    if (z) {
                        fVar.mo109650d(C86781c.NAME, str4);
                    }
                    if (!z2) {
                        fVar.mo109650d(C86780b.NAME, str4);
                    }
                }
                if (!z2 && (d1Var = (C83780d1) this.f327482G.get()) != null && (e3Var = d1Var.f244558J) != null) {
                    C84959i.f247617b.mo117842c(e3Var);
                }
            }
        }

        /* renamed from: x */
        public void mo148846x() {
            if (this.f327482G.get() != null) {
                int i = this.f311429p;
                HashMap hashMap = new HashMap(1);
                hashMap.put("inputId", Integer.valueOf(i));
                ((C83780d1) this.f327482G.get()).mo109647a(this.f327483H, C109395k.this.mo115112m("ok", hashMap));
                C109395k.this.mo160597y(i, this.f327484I);
                C109395k.this.mo160596x(i, (C83780d1) this.f327482G.get());
            }
        }

        /* renamed from: y */
        public void mo148847y() {
            C83797e3 e3Var;
            if (this.f327482G.get() != null) {
                ((C83780d1) this.f327482G.get()).mo109647a(this.f327483H, C109395k.this.mo115109j("fail"));
                C83780d1 d1Var = (C83780d1) this.f327482G.get();
                if (d1Var != null && (e3Var = d1Var.f244558J) != null) {
                    C84959i.f247617b.mo117842c(e3Var);
                }
            }
        }
    }

    /* renamed from: ll0.k$d */
    public static final class C109398d extends C82926s {
        public static final int CTRL_INDEX = 78;
        public static final String NAME = "onKeyboardValueChange";
    }

    /* renamed from: B */
    public void mo160599B(C104873k kVar) {
    }

    /* renamed from: C */
    public C104873k mo160600C(WeakReference<C83780d1> weakReference, String str, int i) {
        return new C109397c(weakReference, i, str);
    }

    /* renamed from: D */
    public final void mo160603D(int i, int i2, C83780d1 d1Var) {
        try {
            int f = C88020k.m109555f(i2);
            C79922d dVar = new C79922d();
            dVar.put("inputId", i);
            dVar.put("height", f);
            d1Var.mo109652f("onKeyboardShow", dVar.toString(), 0);
        } catch (C79923f e) {
            Log.m105921e("MicroMsg.JsApiShowKeyboard", "", e.getMessage());
        }
    }

    /* renamed from: E */
    public void mo1505u(C83780d1 d1Var, JSONObject jSONObject, int i) {
        int i2;
        int optInt = jSONObject.optInt("cursor", -2);
        if (jSONObject.has("selectionStart") || jSONObject.has("selectionEnd")) {
            optInt = jSONObject.optInt("selectionStart", -2);
            i2 = jSONObject.optInt("selectionEnd", -2);
        } else {
            i2 = optInt;
        }
        try {
            int i3 = jSONObject.getInt("inputId");
            if (!(this instanceof C109391e)) {
                MMHandlerThread.postToMainThread(new C88580a(d1Var, i3, optInt, i2, i));
                return;
            }
        } catch (JSONException unused) {
        }
        C110653f fVar = new C110653f();
        if (mo160602F(fVar, jSONObject, d1Var, i)) {
            if (!jSONObject.has("inputId")) {
                long nanoTime = System.nanoTime();
                int hashCode = (d1Var.hashCode() + "#" + System.currentTimeMillis() + "#" + nanoTime).hashCode();
                fVar.f331017Q = hashCode;
                mo160603D(hashCode, 0, d1Var);
            }
            C88024r.m109572b(new C109396b(d1Var, optInt, i2, jSONObject.optString("data"), fVar, i));
        }
    }

    /* renamed from: F */
    public boolean mo160602F(C110653f fVar, JSONObject jSONObject, C83780d1 d1Var, int i) {
        JSONObject optJSONObject;
        if (!mo160594A(fVar, jSONObject, d1Var, i)) {
            return false;
        }
        fVar.f331016P = jSONObject.optInt("parentId");
        fVar.f331017Q = jSONObject.optInt("inputId");
        fVar.f331031b = Integer.valueOf(Math.max(0, fVar.f331031b.intValue()));
        Integer num = fVar.f331032c;
        fVar.f331032c = Integer.valueOf(num == null ? 0 : Math.max(0, num.intValue()));
        fVar.f331018R = jSONObject.optString("type", MimeTypes.BASE_TYPE_TEXT);
        if (!C84947c0.f247597e.contains(fVar.f331018R)) {
            d1Var.mo109647a(i, mo115109j("fail:unsupported input type"));
            return false;
        }
        if (fVar.f331026B == null) {
            fVar.f331026B = Boolean.TRUE;
        }
        fVar.f331019S = jSONObject.optBoolean("password");
        fVar.f226132F = Boolean.valueOf(jSONObject.optBoolean("password"));
        if (jSONObject.has("showCoverView")) {
            fVar.f226133G = Boolean.valueOf(jSONObject.optBoolean("showCoverView", false));
        }
        C68711c2.m80983c(jSONObject, fVar);
        C68709b1.m80981c(jSONObject, fVar);
        if ((!(this instanceof C109391e)) && (optJSONObject = jSONObject.optJSONObject("dropdown")) != null) {
            C110651a aVar = new C110651a();
            optJSONObject.optInt("marginLeft");
            optJSONObject.optInt("marginRight");
            aVar.f331011a = optJSONObject.optString("width");
            JSONArray optJSONArray = optJSONObject.optJSONArray("options");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                aVar.f331012b = new ArrayList<>();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                    if (optJSONObject2 != null) {
                        String optString = optJSONObject2.optString("id");
                        String optString2 = optJSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        String optString3 = optJSONObject2.optString("content");
                        if (!Util.isNullOrNil(optString) && !Util.isNullOrNil(optString2)) {
                            C110652b bVar = new C110652b();
                            bVar.f331013a = optString;
                            bVar.f331014b = optString2;
                            bVar.f331015c = optString3;
                            aVar.f331012b.add(bVar);
                        }
                    }
                }
                fVar.f331022V = aVar;
            }
        }
        return true;
    }
}
