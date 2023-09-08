package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83125x6;
import com.tencent.p014mm.plugin.appbrand.jsapi.errno.AppBrandErrorInfoParcelable;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import fl0.C86916a;
import fl0.C86918c;
import fl0.C86920e;
import gt0.C87340f;
import gt0.C87375o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C90437rw3;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin */
public final class JsApiLogin extends C82197q {
    public static final int CTRL_INDEX = 52;
    public static final String NAME = "login";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask */
    public static class LoginTask extends MainProcessTask {
        public static final Parcelable.Creator<LoginTask> CREATOR = new C82110c();

        /* renamed from: A */
        public int f240804A;

        /* renamed from: B */
        public int f240805B;

        /* renamed from: C */
        public int f240806C;

        /* renamed from: D */
        public String f240807D;

        /* renamed from: E */
        public AppBrandErrorInfoParcelable f240808E;

        /* renamed from: f */
        public C82197q f240809f;

        /* renamed from: g */
        public C82554k f240810g;

        /* renamed from: h */
        public C82164h f240811h;

        /* renamed from: i */
        public int f240812i;

        /* renamed from: j */
        public String f240813j;

        /* renamed from: n */
        public ArrayList<String> f240814n;

        /* renamed from: o */
        public String f240815o;

        /* renamed from: p */
        public String f240816p;

        /* renamed from: q */
        public String f240817q;

        /* renamed from: r */
        public String f240818r;

        /* renamed from: s */
        public int f240819s;

        /* renamed from: t */
        public int f240820t;

        /* renamed from: u */
        public int f240821u;

        /* renamed from: v */
        public String f240822v;

        /* renamed from: w */
        public String f240823w;

        /* renamed from: x */
        public String f240824x;

        /* renamed from: y */
        public int f240825y;

        /* renamed from: z */
        public Bundle f240826z;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask$a */
        public class C82107a implements C82111d {
            public C82107a() {
            }

            /* renamed from: a */
            public void mo114545a(int i, String str, AppBrandErrorInfoParcelable appBrandErrorInfoParcelable) {
                Log.m105924i("MicroMsg.JsApiLogin", "onFailure !");
                LoginTask loginTask = LoginTask.this;
                loginTask.f240818r = "fail";
                loginTask.f240806C = i;
                loginTask.f240807D = str;
                loginTask.f240808E = appBrandErrorInfoParcelable;
                loginTask.mo114394b();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask$b */
        public class C82108b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ LinkedList f240828d;

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask$b$a */
            public class C82109a implements C87340f.C87341a {
                public C82109a() {
                }

                /* renamed from: a */
                public void mo114547a(int i, ArrayList<String> arrayList) {
                    Log.m105925i("MicroMsg.JsApiLogin", "stev onRevMsg resultCode %d", Integer.valueOf(i));
                    if (i == 1 || i == 2) {
                        LoginTask loginTask = LoginTask.this;
                        loginTask.f240815o = "loginConfirm";
                        loginTask.f240814n = arrayList;
                        loginTask.f240821u = i;
                        loginTask.mo114395c();
                        if (i == 2) {
                            LoginTask loginTask2 = LoginTask.this;
                            loginTask2.f240809f.mo114602y(loginTask2.f240810g, loginTask2.f240812i, "fail auth deny", C86920e.f252319i);
                            ((C82127b0) LoginTask.this.f240811h).mo56741d();
                            return;
                        }
                        return;
                    }
                    Log.m105918d("MicroMsg.JsApiLogin", "press back button!");
                    LoginTask loginTask3 = LoginTask.this;
                    loginTask3.f240809f.mo114602y(loginTask3.f240810g, loginTask3.f240812i, "fail auth cancel", C86920e.f252320j);
                    ((C82127b0) LoginTask.this.f240811h).mo56741d();
                }
            }

            public C82108b(LinkedList linkedList) {
                this.f240828d = linkedList;
            }

            public void run() {
                C82109a aVar = new C82109a();
                C87375o0 dialogContainer = LoginTask.this.f240810g.getDialogContainer();
                LoginTask loginTask = LoginTask.this;
                C82197q qVar = loginTask.f240809f;
                C82554k kVar = loginTask.f240810g;
                qVar.getClass();
                Context o0 = kVar instanceof C81925i2 ? ((C81925i2) kVar).mo114344o0() : kVar.getContext();
                Activity castActivityOrNull = o0 == null ? null : AndroidContextUtil.castActivityOrNull(o0);
                LinkedList<C87340f.C87345c> z = C82197q.m100917z(this.f240828d);
                LoginTask loginTask2 = LoginTask.this;
                dialogContainer.mo121778b(new C87340f(castActivityOrNull, z, loginTask2.f240823w, loginTask2.f240824x, aVar));
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask$c */
        public class C82110c implements Parcelable.Creator<LoginTask> {
            public Object createFromParcel(Parcel parcel) {
                return new LoginTask(parcel);
            }

            public Object[] newArray(int i) {
                return new LoginTask[i];
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask$d */
        public interface C82111d {
        }

        public LoginTask() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            Class<JsApiLogin> cls = JsApiLogin.class;
            this.f240813j = parcel.readString();
            this.f240812i = parcel.readInt();
            this.f240815o = parcel.readString();
            this.f240816p = parcel.readString();
            this.f240817q = parcel.readString();
            this.f240818r = parcel.readString();
            this.f240822v = parcel.readString();
            this.f240819s = parcel.readInt();
            this.f240823w = parcel.readString();
            this.f240824x = parcel.readString();
            this.f240825y = parcel.readInt();
            this.f240826z = parcel.readBundle(cls.getClassLoader());
            this.f240814n = parcel.createStringArrayList();
            this.f240820t = parcel.readInt();
            this.f240821u = parcel.readInt();
            this.f240804A = parcel.readInt();
            this.f240805B = parcel.readInt();
            this.f240806C = parcel.readInt();
            this.f240807D = parcel.readString();
            this.f240808E = (AppBrandErrorInfoParcelable) parcel.readParcelable(cls.getClassLoader());
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            if (!this.f240810g.isRunning()) {
                ((C82127b0) this.f240811h).mo56741d();
            } else if (this.f240818r.equals("ok")) {
                HashMap hashMap = new HashMap();
                hashMap.put("code", this.f240817q);
                C82197q qVar = this.f240809f;
                qVar.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                hashMap.put("errno", 0);
                this.f240810g.mo109647a(this.f240812i, qVar.mo115114o("ok", hashMap));
                ((C82127b0) this.f240811h).mo56741d();
            } else if (this.f240818r.equals("fail")) {
                if (Util.isNullOrNil(this.f240807D)) {
                    str = String.format("fail:login error %s", new Object[]{Integer.valueOf(this.f240806C)});
                } else {
                    str = String.format("fail:%s", new Object[]{this.f240807D});
                }
                C82197q qVar2 = this.f240809f;
                C82554k kVar = this.f240810g;
                int i = this.f240812i;
                AppBrandErrorInfoParcelable appBrandErrorInfoParcelable = this.f240808E;
                qVar2.mo114602y(kVar, i, str, new C86918c(appBrandErrorInfoParcelable.f241429d, appBrandErrorInfoParcelable.f241430e));
                ((C82127b0) this.f240811h).mo56741d();
            } else if (this.f240818r.equals("needConfirm")) {
                LinkedList linkedList = new LinkedList();
                int i2 = 0;
                while (i2 < this.f240825y) {
                    Bundle bundle = this.f240826z;
                    byte[] byteArray = bundle.getByteArray(i2 + "");
                    C90437rw3 rw32 = new C90437rw3();
                    try {
                        rw32.parseFrom(byteArray);
                        linkedList.add(rw32);
                        i2++;
                    } catch (IOException e) {
                        Log.m105921e("MicroMsg.JsApiLogin", "parse scope info error %s", e.getMessage());
                        Log.printErrStackTrace("MicroMsg.JsApiLogin", e, "", new Object[0]);
                        this.f240809f.mo114602y(this.f240810g, this.f240812i, "fail:internal error scope error", C86916a.f252262a);
                        ((C82127b0) this.f240811h).mo56741d();
                        return;
                    }
                }
                if (linkedList.size() > 0) {
                    MMHandlerThread.postToMainThread(new C82108b(linkedList));
                    return;
                }
                this.f240809f.mo114602y(this.f240810g, this.f240812i, "fail:internal error scope empty", C86920e.f252324n);
                ((C82127b0) this.f240811h).mo56741d();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: te3.gk2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: te3.ik2} */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: type inference failed for: r3v9 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1553j() {
            /*
                r14 = this;
                java.lang.Class<nt.b> r0 = p209nt.C89090b.class
                com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask$a r1 = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask$a
                r1.<init>()
                java.lang.String r2 = r14.f240815o
                java.lang.String r3 = "login"
                boolean r2 = r2.equals(r3)
                r3 = 0
                java.lang.String r4 = "MicroMsg.JsApiLogin"
                if (r2 == 0) goto L_0x007d
                java.lang.String r2 = "start login"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                java.util.LinkedList r7 = new java.util.LinkedList
                r7.<init>()
                r2 = 1
                r14.f240819s = r2
                java.lang.String r10 = ""
                r14.f240822v = r10
                java.lang.String r6 = r14.f240816p
                int r11 = r14.f240820t
                di3.d r0 = di3.C86312j.m106911c(r0)
                r5 = r0
                nt.b r5 = (p209nt.C89090b) r5
                int r12 = r14.f240804A
                com.tencent.mm.plugin.appbrand.jsapi.auth.d0 r13 = new com.tencent.mm.plugin.appbrand.jsapi.auth.d0
                r13.<init>(r14, r1)
                r8 = 1
                java.lang.String r9 = ""
                nt.e r0 = r5.mo123232uK(r6, r7, r8, r9, r10, r11, r12, r13)
                b30.c r0 = (b30.C79662c) r0
                ob0.c r1 = r0.f233568d
                if (r1 != 0) goto L_0x0047
                r2 = r3
                goto L_0x004d
            L_0x0047:
                ob0.c$c r2 = r1.f127055a
                pe3.a r2 = r2.f127080a
                te3.ik2 r2 = (te3.C90418ik2) r2
            L_0x004d:
                te3.w55 r2 = r2.f259582j
                if (r2 != 0) goto L_0x0062
                if (r1 != 0) goto L_0x0055
                r1 = r3
                goto L_0x005b
            L_0x0055:
                ob0.c$c r1 = r1.f127055a
                pe3.a r1 = r1.f127080a
                te3.ik2 r1 = (te3.C90418ik2) r1
            L_0x005b:
                te3.w55 r2 = new te3.w55
                r2.<init>()
                r1.f259582j = r2
            L_0x0062:
                ob0.c r1 = r0.f233568d
                if (r1 != 0) goto L_0x0067
                goto L_0x006e
            L_0x0067:
                ob0.c$c r1 = r1.f127055a
                pe3.a r1 = r1.f127080a
                r3 = r1
                te3.ik2 r3 = (te3.C90418ik2) r3
            L_0x006e:
                te3.w55 r1 = r3.f259582j
                int r2 = r14.f240805B
                r1.f143870f = r2
                ob0.b0 r1 = f40.C86709a0.m107524d()
                r1.mo123460f(r0)
                goto L_0x00f4
            L_0x007d:
                java.lang.String r2 = r14.f240815o
                java.lang.String r5 = "loginConfirm"
                boolean r2 = r2.equals(r5)
                if (r2 == 0) goto L_0x00f4
                java.lang.String r2 = "start loginConfirm"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                java.lang.String r6 = r14.f240816p
                java.util.ArrayList<java.lang.String> r2 = r14.f240814n
                int r8 = r14.f240819s
                java.lang.String r9 = r14.f240822v
                int r10 = r14.f240820t
                int r11 = r14.f240821u
                di3.d r0 = di3.C86312j.m106911c(r0)
                r5 = r0
                nt.b r5 = (p209nt.C89090b) r5
                if (r2 != 0) goto L_0x00a4
                r7 = r3
                goto L_0x00ad
            L_0x00a4:
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r0.addAll(r2)
                r7 = r0
            L_0x00ad:
                int r12 = r14.f240804A
                com.tencent.mm.plugin.appbrand.jsapi.auth.e0 r13 = new com.tencent.mm.plugin.appbrand.jsapi.auth.e0
                r13.<init>(r14, r1, r11)
                nt.f r0 = r5.qc0(r6, r7, r8, r9, r10, r11, r12, r13)
                b30.d r0 = (b30.C79663d) r0
                ob0.c r1 = r0.f233571d
                if (r1 != 0) goto L_0x00c0
                r2 = r3
                goto L_0x00c6
            L_0x00c0:
                ob0.c$c r2 = r1.f127055a
                pe3.a r2 = r2.f127080a
                te3.gk2 r2 = (te3.C90412gk2) r2
            L_0x00c6:
                te3.w55 r2 = r2.f259531j
                if (r2 != 0) goto L_0x00db
                if (r1 != 0) goto L_0x00ce
                r1 = r3
                goto L_0x00d4
            L_0x00ce:
                ob0.c$c r1 = r1.f127055a
                pe3.a r1 = r1.f127080a
                te3.gk2 r1 = (te3.C90412gk2) r1
            L_0x00d4:
                te3.w55 r2 = new te3.w55
                r2.<init>()
                r1.f259531j = r2
            L_0x00db:
                ob0.c r1 = r0.f233571d
                if (r1 != 0) goto L_0x00e0
                goto L_0x00e7
            L_0x00e0:
                ob0.c$c r1 = r1.f127055a
                pe3.a r1 = r1.f127080a
                r3 = r1
                te3.gk2 r3 = (te3.C90412gk2) r3
            L_0x00e7:
                te3.w55 r1 = r3.f259531j
                int r2 = r14.f240805B
                r1.f143870f = r2
                ob0.b0 r1 = f40.C86709a0.m107524d()
                r1.mo123460f(r0)
            L_0x00f4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.JsApiLogin.LoginTask.mo1553j():void");
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240813j);
            parcel.writeInt(this.f240812i);
            parcel.writeString(this.f240815o);
            parcel.writeString(this.f240816p);
            parcel.writeString(this.f240817q);
            parcel.writeString(this.f240818r);
            parcel.writeString(this.f240822v);
            parcel.writeInt(this.f240819s);
            parcel.writeString(this.f240823w);
            parcel.writeString(this.f240824x);
            parcel.writeInt(this.f240825y);
            parcel.writeBundle(this.f240826z);
            parcel.writeStringList(this.f240814n);
            parcel.writeInt(this.f240820t);
            parcel.writeInt(this.f240821u);
            parcel.writeInt(this.f240804A);
            parcel.writeInt(this.f240805B);
            parcel.writeInt(this.f240806C);
            parcel.writeString(this.f240807D);
            parcel.writeParcelable(this.f240808E, i);
        }

        public LoginTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }

    public JsApiLogin() {
        new C82159g0();
    }

    /* renamed from: c */
    public void mo114544c(C83125x6<C81879g> x6Var) {
        JSONObject jSONObject = x6Var.f242917c;
        try {
            if (!jSONObject.has("requestInQueue")) {
                jSONObject.put("requestInQueue", false);
            }
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiLogin", "invoke put KEY_IN_QUEUE e=%s", e.getMessage());
        }
        super.mo114544c(x6Var);
    }

    /* renamed from: w */
    public void mo114534w(C83125x6<C81879g> x6Var, C82164h hVar) {
        C81879g gVar = (C81879g) x6Var.f242916b;
        JSONObject jSONObject = x6Var.f242917c;
        int i = x6Var.f242919e;
        LoginTask loginTask = new LoginTask();
        loginTask.f240816p = gVar.getAppId();
        loginTask.f240815o = "login";
        C90988l d0 = gVar.getRuntime().mo113051d0();
        if (d0 != null) {
            loginTask.f240820t = d0.f261072r.f238585d;
        }
        AppBrandStatObject d = C81682d.m100224d(gVar.getAppId());
        if (d != null) {
            loginTask.f240804A = d.f245533f;
        }
        String jSONObject2 = jSONObject.toString();
        loginTask.f240809f = this;
        loginTask.f240810g = gVar;
        loginTask.f240813j = jSONObject2;
        loginTask.f240812i = i;
        loginTask.f240811h = new C82127b0(loginTask, hVar);
        loginTask.f240826z = new Bundle();
        if (gVar instanceof C81925i2) {
            loginTask.f240805B = 1;
        } else if (gVar instanceof C83780d1) {
            loginTask.f240805B = 2;
        }
        gVar.getRuntime().keep(new C82129c0(loginTask));
        loginTask.mo114395c();
    }
}
