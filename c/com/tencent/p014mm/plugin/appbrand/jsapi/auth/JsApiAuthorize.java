package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83125x6;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.JSONObject;
import p1031sb.C90156c;
import te3.C90437rw3;
import te3.t65;
import wi0.C90988l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize */
public final class JsApiAuthorize extends C82197q {
    private static final int CTRL_INDEX = 54;
    private static final String NAME = "authorize";

    /* renamed from: w */
    public void mo114534w(C83125x6<C81879g> x6Var, C82164h hVar) {
        C81879g gVar = (C81879g) x6Var.f242916b;
        JSONObject jSONObject = x6Var.f242917c;
        int i = x6Var.f242919e;
        Log.m105918d("MicroMsg.JsApiAuthorize", "stev JsApiAuthorize!");
        AuthorizeTask authorizeTask = new AuthorizeTask();
        authorizeTask.f240781p = gVar.getAppId();
        if (x6Var.f242918d != null) {
            t65 t65 = new t65();
            authorizeTask.f240782q = t65;
            t65.f141999d = x6Var.f242918d.optString("appId");
            C90156c cVar = (C90156c) gVar.getRuntime().mo113021O(C90156c.class, false);
            if (cVar != null) {
                t65 t652 = authorizeTask.f240782q;
                t652.f142001f = cVar.mo124413a(t652.f141999d);
            }
        }
        authorizeTask.f240780o = NAME;
        C90988l d0 = gVar.getRuntime().mo113051d0();
        if (d0 != null) {
            authorizeTask.f240784s = d0.f261072r.f238585d;
        }
        AppBrandStatObject d = C81682d.m100224d(gVar.getAppId());
        if (d != null) {
            authorizeTask.f240767I = d.f245533f;
        }
        String jSONObject2 = jSONObject.toString();
        authorizeTask.f240774f = this;
        authorizeTask.f240775g = gVar;
        authorizeTask.f240778j = jSONObject2;
        authorizeTask.f240777i = i;
        authorizeTask.f240776h = new C82201s(authorizeTask, hVar);
        authorizeTask.f240764F = new Bundle();
        if (gVar instanceof C81925i2) {
            authorizeTask.f240768J = 1;
        } else if (gVar instanceof C83780d1) {
            authorizeTask.f240768J = 2;
        }
        gVar.getRuntime().keep(new C82202t(authorizeTask));
        authorizeTask.mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask */
    public static class AuthorizeTask extends MainProcessTask {
        public static final Parcelable.Creator<AuthorizeTask> CREATOR = new JsApiAuthorize$AuthorizeTask$$e();

        /* renamed from: A */
        public boolean f240759A;

        /* renamed from: B */
        public String f240760B;

        /* renamed from: C */
        public String f240761C;

        /* renamed from: D */
        public String f240762D;

        /* renamed from: E */
        public int f240763E;

        /* renamed from: F */
        public Bundle f240764F;

        /* renamed from: G */
        public String f240765G;

        /* renamed from: H */
        public MMAuthScopeRiskInfo f240766H;

        /* renamed from: I */
        public int f240767I;

        /* renamed from: J */
        public int f240768J;

        /* renamed from: K */
        public int f240769K;

        /* renamed from: L */
        public String f240770L;

        /* renamed from: M */
        public String f240771M;

        /* renamed from: N */
        public String f240772N;

        /* renamed from: P */
        public MMUserPrivacyProtectInfo f240773P = MMUserPrivacyProtectInfo.f240926f;

        /* renamed from: f */
        public transient C82197q f240774f;

        /* renamed from: g */
        public transient C81879g f240775g;

        /* renamed from: h */
        public transient C82164h f240776h;

        /* renamed from: i */
        public int f240777i;

        /* renamed from: j */
        public String f240778j;

        /* renamed from: n */
        public ArrayList<String> f240779n;

        /* renamed from: o */
        public String f240780o;

        /* renamed from: p */
        public String f240781p;

        /* renamed from: q */
        public t65 f240782q;

        /* renamed from: r */
        public String f240783r;

        /* renamed from: s */
        public int f240784s;

        /* renamed from: t */
        public int f240785t;

        /* renamed from: u */
        public boolean f240786u;

        /* renamed from: v */
        public String f240787v;

        /* renamed from: w */
        public String f240788w;

        /* renamed from: x */
        public String f240789x;

        /* renamed from: y */
        public String f240790y;

        /* renamed from: z */
        public String f240791z;

        public AuthorizeTask() {
        }

        /* renamed from: q */
        public static void m100820q(AuthorizeTask authorizeTask, int i, ArrayList arrayList, boolean z) {
            authorizeTask.f240780o = "authorizeConfirm";
            authorizeTask.f240779n = arrayList;
            authorizeTask.f240785t = i;
            authorizeTask.f240786u = z;
            authorizeTask.mo114395c();
            if (i == 2) {
                authorizeTask.f240774f.mo114601x(authorizeTask.f240775g, authorizeTask.f240777i, "fail auth deny");
                ((C82201s) authorizeTask.f240776h).mo56741d();
            }
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f240778j = parcel.readString();
            this.f240777i = parcel.readInt();
            this.f240781p = parcel.readString();
            int readInt = parcel.readInt();
            boolean z = false;
            if (readInt > 0) {
                this.f240782q = new t65();
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                try {
                    this.f240782q.parseFrom(bArr);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.JsApiAuthorize", "AuthorizeTask parse wxaPluginAppInfo get exception:%s", e);
                    this.f240782q = null;
                }
            } else {
                this.f240782q = null;
            }
            this.f240783r = parcel.readString();
            this.f240780o = parcel.readString();
            this.f240787v = parcel.readString();
            this.f240788w = parcel.readString();
            this.f240763E = parcel.readInt();
            this.f240764F = parcel.readBundle(JsApiAuthorize.class.getClassLoader());
            this.f240779n = parcel.createStringArrayList();
            this.f240784s = parcel.readInt();
            this.f240785t = parcel.readInt();
            this.f240767I = parcel.readInt();
            this.f240768J = parcel.readInt();
            this.f240769K = parcel.readInt();
            this.f240770L = parcel.readString();
            this.f240791z = parcel.readString();
            this.f240790y = parcel.readString();
            this.f240789x = parcel.readString();
            this.f240761C = parcel.readString();
            this.f240762D = parcel.readString();
            this.f240759A = parcel.readInt() == 1;
            this.f240760B = parcel.readString();
            this.f240765G = parcel.readString();
            this.f240766H = (MMAuthScopeRiskInfo) parcel.readParcelable(MMAuthScopeRiskInfo.class.getClassLoader());
            this.f240771M = parcel.readString();
            this.f240772N = parcel.readString();
            this.f240773P = (MMUserPrivacyProtectInfo) parcel.readParcelable(MMUserPrivacyProtectInfo.class.getClassLoader());
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f240786u = z;
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            if (!this.f240775g.isRunning()) {
                ((C82201s) this.f240776h).mo56741d();
            } else if (this.f240783r.equals("ok")) {
                if (this.f240771M == null || Util.isNullOrNil(this.f240772N) || this.f240771M.equals(this.f240772N)) {
                    this.f240774f.mo114601x(this.f240775g, this.f240777i, "ok");
                } else {
                    Log.m105925i("MicroMsg.JsApiAuthorize", "targetScope:%s, selectScope:%s", this.f240771M, this.f240772N);
                    this.f240774f.mo114601x(this.f240775g, this.f240777i, "fail auth deny");
                }
                ((C82201s) this.f240776h).mo56741d();
            } else if (this.f240783r.equals("fail")) {
                if (Util.isNullOrNil(this.f240770L)) {
                    str = String.format("fail:login error %s", new Object[]{Integer.valueOf(this.f240769K)});
                } else {
                    str = String.format("fail:%s", new Object[]{this.f240770L});
                }
                this.f240774f.mo114601x(this.f240775g, this.f240777i, str);
                ((C82201s) this.f240776h).mo56741d();
            } else if (this.f240783r.equals("risk_intercepted")) {
                if (this.f240766H != null) {
                    ((C119157j) C119157j.f356862d).mo183895z(new JsApiAuthorize$AuthorizeTask$$c(this));
                }
                ((C82201s) this.f240776h).mo56741d();
            } else if (this.f240783r.equals("needConfirm")) {
                LinkedList linkedList = new LinkedList();
                int i = 0;
                while (i < this.f240763E) {
                    Bundle bundle = this.f240764F;
                    byte[] byteArray = bundle.getByteArray(i + "");
                    C90437rw3 rw32 = new C90437rw3();
                    try {
                        rw32.parseFrom(byteArray);
                        linkedList.add(rw32);
                        i++;
                    } catch (IOException e) {
                        Log.m105921e("MicroMsg.JsApiAuthorize", "IOException %s", e.getMessage());
                        Log.printErrStackTrace("MicroMsg.JsApiAuthorize", e, "", new Object[0]);
                        this.f240774f.mo114601x(this.f240775g, this.f240777i, "fail:internal error scope error");
                        ((C82201s) this.f240776h).mo56741d();
                        return;
                    }
                }
                if (linkedList.size() > 0) {
                    this.f240775g.mo109673t(new JsApiAuthorize$AuthorizeTask$$d(this, linkedList));
                    return;
                }
                this.f240774f.mo114601x(this.f240775g, this.f240777i, "fail:internal error scope empty");
                ((C82201s) this.f240776h).mo56741d();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: te3.ck2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: te3.ek2} */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v9 */
        /* JADX WARNING: type inference failed for: r3v10 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1553j() {
            /*
                r13 = this;
                java.lang.Class<nt.b> r0 = p209nt.C89090b.class
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$b r1 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$b
                r1.<init>(r13)
                java.lang.String r2 = r13.f240780o
                java.lang.String r3 = "authorize"
                boolean r2 = r2.equals(r3)
                r3 = 0
                if (r2 == 0) goto L_0x00b9
                r2 = 0
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a0 }
                java.lang.String r5 = r13.f240778j     // Catch:{ Exception -> 0x00a0 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x00a0 }
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x00a0 }
                java.lang.String r6 = "scope"
                java.lang.String r4 = r4.optString(r6)     // Catch:{ Exception -> 0x00a0 }
                r5.<init>(r4)     // Catch:{ Exception -> 0x00a0 }
                java.util.LinkedList r9 = new java.util.LinkedList
                r9.<init>()
                r4 = 0
            L_0x002c:
                int r6 = r5.length()
                if (r4 >= r6) goto L_0x003c
                java.lang.String r6 = r5.optString(r4)
                r9.add(r6)
                int r4 = r4 + 1
                goto L_0x002c
            L_0x003c:
                int r4 = r9.size()
                if (r4 <= 0) goto L_0x004a
                java.lang.Object r2 = r9.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                r13.f240771M = r2
            L_0x004a:
                java.lang.String r7 = r13.f240781p
                te3.t65 r8 = r13.f240782q
                int r10 = r13.f240784s
                di3.d r0 = di3.C86312j.m106911c(r0)
                r6 = r0
                nt.b r6 = (p209nt.C89090b) r6
                int r11 = r13.f240767I
                com.tencent.mm.plugin.appbrand.jsapi.auth.v r12 = new com.tencent.mm.plugin.appbrand.jsapi.auth.v
                r12.<init>(r13, r1)
                nt.c r0 = r6.mo123230na(r7, r8, r9, r10, r11, r12)
                b30.a r0 = (b30.C39723a) r0
                ob0.c r1 = r0.f106580d
                if (r1 != 0) goto L_0x006a
                r2 = r3
                goto L_0x0070
            L_0x006a:
                ob0.c$c r2 = r1.f127055a
                pe3.a r2 = r2.f127080a
                te3.ek2 r2 = (te3.C49297ek2) r2
            L_0x0070:
                te3.w55 r2 = r2.f132986g
                if (r2 != 0) goto L_0x0085
                if (r1 != 0) goto L_0x0078
                r1 = r3
                goto L_0x007e
            L_0x0078:
                ob0.c$c r1 = r1.f127055a
                pe3.a r1 = r1.f127080a
                te3.ek2 r1 = (te3.C49297ek2) r1
            L_0x007e:
                te3.w55 r2 = new te3.w55
                r2.<init>()
                r1.f132986g = r2
            L_0x0085:
                ob0.c r1 = r0.f106580d
                if (r1 != 0) goto L_0x008a
                goto L_0x0091
            L_0x008a:
                ob0.c$c r1 = r1.f127055a
                pe3.a r1 = r1.f127080a
                r3 = r1
                te3.ek2 r3 = (te3.C49297ek2) r3
            L_0x0091:
                te3.w55 r1 = r3.f132986g
                int r2 = r13.f240768J
                r1.f143870f = r2
                ob0.b0 r1 = f40.C86709a0.m107524d()
                r1.mo123460f(r0)
                goto L_0x0132
            L_0x00a0:
                r0 = move-exception
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r0 = r0.getMessage()
                r1[r2] = r0
                java.lang.String r0 = "MicroMsg.JsApiAuthorize"
                java.lang.String r2 = "Exception %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r1)
                java.lang.String r0 = "fail"
                r13.f240783r = r0
                r13.mo114394b()
                return
            L_0x00b9:
                java.lang.String r2 = r13.f240780o
                java.lang.String r4 = "authorizeConfirm"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0132
                java.lang.String r5 = r13.f240781p
                java.util.ArrayList<java.lang.String> r2 = r13.f240779n
                int r7 = r13.f240784s
                int r8 = r13.f240785t
                boolean r11 = r13.f240786u
                di3.d r0 = di3.C86312j.m106911c(r0)
                r4 = r0
                nt.b r4 = (p209nt.C89090b) r4
                if (r2 != 0) goto L_0x00d8
                r6 = r3
                goto L_0x00e1
            L_0x00d8:
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r0.addAll(r2)
                r6 = r0
            L_0x00e1:
                int r9 = r13.f240767I
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$a r10 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$a
                r10.<init>(r1, r8)
                nt.d r0 = r4.mo123227Lj(r5, r6, r7, r8, r9, r10)
                b30.b r0 = (b30.C39724b) r0
                ob0.c r1 = r0.f106583d
                if (r1 != 0) goto L_0x00f4
                r2 = r3
                goto L_0x00fa
            L_0x00f4:
                ob0.c$c r2 = r1.f127055a
                pe3.a r2 = r2.f127080a
                te3.ck2 r2 = (te3.C49014ck2) r2
            L_0x00fa:
                te3.w55 r2 = r2.f131799h
                if (r2 != 0) goto L_0x010f
                if (r1 != 0) goto L_0x0102
                r1 = r3
                goto L_0x0108
            L_0x0102:
                ob0.c$c r1 = r1.f127055a
                pe3.a r1 = r1.f127080a
                te3.ck2 r1 = (te3.C49014ck2) r1
            L_0x0108:
                te3.w55 r2 = new te3.w55
                r2.<init>()
                r1.f131799h = r2
            L_0x010f:
                ob0.c r1 = r0.f106583d
                if (r1 != 0) goto L_0x0114
                goto L_0x011b
            L_0x0114:
                ob0.c$c r2 = r1.f127055a
                pe3.a r2 = r2.f127080a
                r3 = r2
                te3.ck2 r3 = (te3.C49014ck2) r3
            L_0x011b:
                te3.w55 r2 = r3.f131799h
                int r3 = r13.f240768J
                r2.f143870f = r3
                ob0.c$c r1 = r1.f127055a
                pe3.a r1 = r1.f127080a
                te3.ck2 r1 = (te3.C49014ck2) r1
                if (r1 == 0) goto L_0x012b
                r1.f131800i = r11
            L_0x012b:
                ob0.b0 r1 = f40.C86709a0.m107524d()
                r1.mo123460f(r0)
            L_0x0132:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiAuthorize.AuthorizeTask.mo1553j():void");
        }

        /* renamed from: t */
        public final void mo114535t(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f240774f.mo114601x(this.f240775g, this.f240777i, "fail auth cancel");
            } else {
                this.f240774f.mo114601x(this.f240775g, this.f240777i, str);
            }
            ((C82201s) this.f240776h).mo56741d();
        }

        public void writeToParcel(Parcel parcel, int i) {
            byte[] bArr;
            parcel.writeString(this.f240778j);
            parcel.writeInt(this.f240777i);
            parcel.writeString(this.f240781p);
            t65 t65 = this.f240782q;
            if (t65 != null) {
                try {
                    bArr = t65.toByteArray();
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.JsApiAuthorize", "AuthorizeTask writeToParcel wxaPluginAppInfo.toByteArray get exception:%s", e);
                    bArr = new byte[0];
                }
                parcel.writeInt(bArr.length);
                if (bArr.length > 0) {
                    parcel.writeByteArray(bArr);
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f240783r);
            parcel.writeString(this.f240780o);
            parcel.writeString(this.f240787v);
            parcel.writeString(this.f240788w);
            parcel.writeInt(this.f240763E);
            parcel.writeBundle(this.f240764F);
            parcel.writeStringList(this.f240779n);
            parcel.writeInt(this.f240784s);
            parcel.writeInt(this.f240785t);
            parcel.writeInt(this.f240767I);
            parcel.writeInt(this.f240768J);
            parcel.writeInt(this.f240769K);
            parcel.writeString(this.f240770L);
            parcel.writeString(this.f240791z);
            parcel.writeString(this.f240790y);
            parcel.writeString(this.f240789x);
            parcel.writeString(this.f240761C);
            parcel.writeString(this.f240762D);
            parcel.writeInt(this.f240759A ? 1 : 0);
            parcel.writeString(this.f240760B);
            parcel.writeString(this.f240765G);
            parcel.writeParcelable(this.f240766H, i);
            parcel.writeString(this.f240771M);
            parcel.writeString(this.f240772N);
            parcel.writeParcelable(this.f240773P, i);
            parcel.writeInt(this.f240786u ? 1 : 0);
        }

        public AuthorizeTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
