package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82256p;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign;
import com.tencent.p014mm.plugin.webview.model.C6027c0;
import com.tencent.p014mm.plugin.webview.model.C6030e0;
import com.tencent.p014mm.plugin.webview.model.C6031f0;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONObject;
import t83.C13851h1;
import te3.C48869bk2;
import te3.C49293ej2;
import te3.C49432fj2;
import te3.C49568gj2;
import te3.C50696ok2;
import te3.C51842wj2;
import te3.wp4;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c */
public class C6210c implements C11385n {

    /* renamed from: d */
    public final HashMap<String, C49293ej2> f22912d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, String> f22913e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<String, C6215d> f22914f = new HashMap<>();

    /* renamed from: g */
    public final int f22915g;

    /* renamed from: h */
    public Context f22916h;

    /* renamed from: i */
    public C6107m f22917i;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a */
    public interface C6211a {

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a$a */
        public enum C6212a {
            RET_OK(0),
            RET_FAIL(-1),
            RET_REJECT(-2),
            RET_ACCESS_DENIED(-3);
            

            /* renamed from: d */
            public int f22923d;

            /* access modifiers changed from: public */
            C6212a(int i) {
                this.f22923d = i;
            }

            /* renamed from: a */
            public int mo7281a() {
                return this.f22923d;
            }
        }

        /* renamed from: a */
        void mo7280a(String str);

        /* renamed from: b */
        void mo7263b(C6212a aVar, String str, LinkedList<wp4> linkedList, int i, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c$b */
    public interface C6213b {
        /* renamed from: g */
        int mo6996g();
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c$c */
    public static abstract class C6214c implements C6211a {

        /* renamed from: a */
        public boolean f22924a = true;

        /* renamed from: a */
        public void mo7280a(String str) {
        }

        /* renamed from: c */
        public void mo7282c(boolean z) {
            this.f22924a = z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c$d */
    public static class C6215d {

        /* renamed from: a */
        public String f22925a;

        /* renamed from: b */
        public List<String> f22926b;

        /* renamed from: c */
        public List<C48869bk2> f22927c;

        public C6215d(String str, C51842wj2 wj22) {
            this.f22925a = str;
            this.f22926b = wj22.f144092f;
            this.f22927c = wj22.f144094h;
        }
    }

    public C6210c(int i) {
        this.f22915g = i;
    }

    /* renamed from: a */
    public final void mo7275a(C6027c0 c0Var, int i, C49293ej2 ej22) {
        C6027c0 c0Var2 = c0Var;
        C6211a.C6212a aVar = C6211a.C6212a.RET_FAIL;
        C47350c cVar = c0Var2.f22276d;
        C49432fj2 fj22 = cVar == null ? null : (C49432fj2) cVar.f127055a.f127080a;
        C49568gj2 j1 = c0Var.mo6997j1();
        if (fj22 == null) {
            Log.m105920e("MicroMsg.webview.JSVerifyHelper", "authReq is null");
            c0Var2.f22278f.mo7263b(aVar, (String) null, (LinkedList<wp4>) null, i, c0Var.mo6997j1().f134074d.f134688d);
        } else if (j1 == null) {
            Log.m105920e("MicroMsg.webview.JSVerifyHelper", "authResp is null");
            c0Var2.f22278f.mo7263b(aVar, (String) null, (LinkedList<wp4>) null, i, c0Var.mo6997j1().f134074d.f134688d);
        } else {
            C86709a0.m107524d().mo123455a(1096, this);
            LinkedList<C50696ok2> linkedList = j1.f134077g;
            if (linkedList != null) {
                Iterator<C50696ok2> it = linkedList.iterator();
                while (it.hasNext()) {
                    C50696ok2 next = it.next();
                    if (next != null) {
                        Log.m105925i("MicroMsg.webview.JSVerifyHelper", "apiname = %s, scope = %s, scope desc = %s, status = %d, now jsapi name = %s", next.f139239g, next.f139236d, next.f139238f, Integer.valueOf(next.f139237e), fj22.f133539f);
                        next.f139237e = 1;
                    }
                }
                Iterator<C50696ok2> it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    C50696ok2 next2 = it4.next();
                    if (next2 != null) {
                        Log.m105925i("MicroMsg.webview.JSVerifyHelper", "apiname = %s, scope = %s, scope desc = %s, status = %d, now jsapi name = %s", next2.f139239g, next2.f139236d, next2.f139238f, Integer.valueOf(next2.f139237e), fj22.f133539f);
                    }
                }
            }
            int i2 = ((C49432fj2) ((C47350c) c0Var.getReqResp()).f127055a.f127080a).f133548r;
            C86709a0.m107524d().mo123460f(new C6031f0(ej22, fj22.f133537d, fj22.f133547q, fj22.f133538e, fj22.f133539f, fj22.f133540g, fj22.f133541h, fj22.f133542i, fj22.f133543j, fj22.f133544n, fj22.f133545o, linkedList, this.f22915g, i2));
            c0Var2.f22278f.mo7263b(C6211a.C6212a.RET_OK, (String) null, (LinkedList<wp4>) null, i, c0Var.mo6997j1().f134074d.f134688d);
        }
    }

    /* renamed from: b */
    public final String mo7276b(String str) {
        int indexOf = str.indexOf("#");
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    /* renamed from: c */
    public String mo7277c(String str) {
        if (str == null) {
            return null;
        }
        String str2 = this.f22913e.get(str);
        if (!Util.isNullOrNil(str2)) {
            return str2;
        }
        String b = mo7276b(str);
        Log.m105925i("MicroMsg.webview.JSVerifyHelper", "appid = %s, url = %s, drophash url = %s", str2, str, b);
        return !Util.isNullOrNil(b) ? this.f22913e.get(b) : str2;
    }

    /* renamed from: d */
    public C6215d mo7278d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C6215d dVar = this.f22914f.get(str);
        if (dVar != null) {
            return dVar;
        }
        return this.f22914f.get(mo7276b(str));
    }

    /* renamed from: e */
    public void mo7279e(JsapiPermissionWrapper jsapiPermissionWrapper, String str, String str2, int i, C13851h1 h1Var, int i2, C6211a aVar) {
        int i3;
        String str3;
        String str4;
        JsapiPermissionWrapper jsapiPermissionWrapper2 = jsapiPermissionWrapper;
        String str5 = str;
        C13851h1 h1Var2 = h1Var;
        C6211a.C6212a aVar2 = C6211a.C6212a.RET_FAIL;
        C6211a.C6212a aVar3 = C6211a.C6212a.RET_OK;
        C6211a.C6212a aVar4 = C6211a.C6212a.RET_ACCESS_DENIED;
        String str6 = h1Var2 != null ? h1Var2.f38996i : "";
        if (Util.isNullOrNil(str6)) {
            Log.m105921e("MicroMsg.webview.JSVerifyHelper", "jsapi is null, %s", str5);
            aVar.mo7263b(aVar4, (String) null, (LinkedList<wp4>) null, 0, 0);
        } else if (jsapiPermissionWrapper2 == null || Util.isNullOrNil(str) || h1Var2 == null || jsapiPermissionWrapper2.f121048d == null) {
            Object[] objArr = new Object[3];
            objArr[0] = str5;
            objArr[1] = str6;
            objArr[2] = Boolean.valueOf(jsapiPermissionWrapper2 != null);
            Log.m105921e("MicroMsg.webview.JSVerifyHelper", "handleJSVerify invalid argument, currentUrl = %s, jsapi = %s, %s", objArr);
            aVar.mo7263b(aVar2, "localParameters", (LinkedList<wp4>) null, 0, 0);
        } else {
            int d = jsapiPermissionWrapper2.mo69443d(i);
            Log.m105925i("MicroMsg.webview.JSVerifyHelper", "handleJSVerify jsApi = %s, permission pos = %d, permission = %s currentUrl = %s", str6, Integer.valueOf(i), Integer.valueOf(d), str5);
            String str7 = this.f22913e.get(str5);
            if (Util.isNullOrNil(str7)) {
                str7 = (String) h1Var2.f38983a.get("verifyAppId");
            }
            HashMap hashMap = (HashMap) h1Var2.f38995h;
            hashMap.put("permissionValue", Integer.valueOf(d));
            hashMap.put("appId", str7);
            if (d == 0) {
                aVar.mo7263b(aVar4, (String) null, (LinkedList<wp4>) null, 0, 0);
            } else if (d == 1) {
                aVar.mo7263b(aVar3, (String) null, (LinkedList<wp4>) null, 0, 0);
            } else if (d != 2) {
                if (d != 3) {
                    if (d == 4) {
                        str5 = (String) h1Var2.f38983a.get("url");
                        HashMap<String, C49293ej2> hashMap2 = this.f22912d;
                        C49293ej2 ej22 = hashMap2.get(str6 + str5);
                        if (ej22 != null && ej22.f132958e == 1) {
                            aVar.mo7263b(aVar3, (String) null, (LinkedList<wp4>) null, 0, 0);
                            return;
                        }
                    }
                    aVar.mo7263b(aVar2, "unkonwPermission_" + d, (LinkedList<wp4>) null, 0, 0);
                    Log.m105920e("MicroMsg.webview.JSVerifyHelper", "unknow permission");
                }
                String str8 = (String) h1Var2.f38983a.get("verifySignature");
                String str9 = (String) h1Var2.f38983a.get("verifyTimestamp");
                String str10 = (String) h1Var2.f38983a.get("verifySignType");
                String str11 = (String) h1Var2.f38983a.get("scope");
                String str12 = (String) h1Var2.f38983a.get("addrSign");
                String str13 = (String) h1Var2.f38983a.get("verifyNonceStr");
                Log.m105925i("MicroMsg.webview.JSVerifyHelper", "handleJSVerify addrSign = %s, signature = %s", str12, str8);
                if (!Util.isNullOrNil(str8) || Util.isNullOrNil(str12)) {
                    str4 = str13;
                    str3 = str8;
                    i3 = !Util.isNullOrNil(str8) ? 2 : 0;
                } else {
                    str10 = (String) h1Var2.f38983a.get("signType");
                    str7 = (String) h1Var2.f38983a.get("appId");
                    str3 = (String) h1Var2.f38983a.get("addrSign");
                    str9 = (String) h1Var2.f38983a.get("timeStamp");
                    str4 = (String) h1Var2.f38983a.get("nonceStr");
                    i3 = 1;
                }
                JSONObject b = C13851h1.C13852a.m13142b(h1Var2.f38983a);
                byte[] bytes = b != null ? b.toString().getBytes() : null;
                if (d == 4) {
                    C6027c0 c0Var = new C6027c0(aVar, str5, str2, str7, str6, str9, str4, str3, str10, bytes, i3, str11, this.f22915g, i2);
                    C86709a0.m107524d().mo123455a(JsApiEcdSaSign.CTRL_INDEX, this);
                    C86709a0.m107524d().mo123460f(c0Var);
                    return;
                }
                if (d == 3) {
                    C6030e0 e0Var = new C6030e0(aVar, str5, str2, str7, str6, str9, str4, str3, str10, bytes, this.f22915g, i2);
                    C86709a0.m107524d().mo123455a(C82256p.CTRL_INDEX, this);
                    C86709a0.m107524d().mo123460f(e0Var);
                    return;
                }
                aVar.mo7263b(aVar2, "unkonwPermission_" + d, (LinkedList<wp4>) null, 0, 0);
                Log.m105920e("MicroMsg.webview.JSVerifyHelper", "unknow permission");
            } else if (str6.equals("preVerifyJSAPI")) {
                aVar.mo7263b(aVar3, (String) null, (LinkedList<wp4>) null, 0, 0);
            } else {
                aVar.mo7263b(aVar4, (String) null, (LinkedList<wp4>) null, 0, 0);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: te3.zj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: te3.zj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: te3.zj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v53, resolved type: te3.fj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: te3.zj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: te3.vj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: te3.zj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: te3.zj2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v13, resolved type: te3.zj2} */
    /* JADX WARNING: type inference failed for: r3v7, types: [pe3.a] */
    /* JADX WARNING: type inference failed for: r16v7, types: [te3.fj2] */
    /* JADX WARNING: type inference failed for: r16v10, types: [te3.vj2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r27, int r28, java.lang.String r29, ob0.C117747y r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r5 = r28
            r3 = r29
            r2 = r30
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a$a r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c.C6211a.C6212a.RET_OK
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a$a r6 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c.C6211a.C6212a.RET_FAIL
            r7 = 4
            java.lang.Object[] r8 = new java.lang.Object[r7]
            int r9 = r30.getType()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 0
            r8[r10] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r27)
            r11 = 1
            r8[r11] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r28)
            r12 = 2
            r8[r12] = r9
            r9 = 3
            r8[r9] = r3
            java.lang.String r13 = "MicroMsg.webview.JSVerifyHelper"
            java.lang.String r14 = "JSVerifyHelper onSceneEnd: type[%d], errType[%s], errCode[%s], errMsg[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r8)
            boolean r8 = r2 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c.C6213b
            if (r8 != 0) goto L_0x003e
            java.lang.String r1 = "JSVerifyHelper onSceneEnd: net scene type mismatched, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            return
        L_0x003e:
            r8 = r2
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$b r8 = (com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c.C6213b) r8
            int r14 = r8.mo6996g()
            int r15 = r0.f22915g
            if (r14 == r15) goto L_0x0061
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r1[r10] = r2
            int r2 = r8.mo6996g()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r11] = r2
            java.lang.String r2 = "JSVerifyHelper onSceneEnd: this.binderId = %d, incoming binderId = %d, not equal, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r1)
            return
        L_0x0061:
            int r8 = r30.getType()
            java.lang.String r14 = "_"
            r15 = 1093(0x445, float:1.532E-42)
            r16 = 0
            if (r8 != r15) goto L_0x01b4
            ob0.b0 r8 = f40.C86709a0.m107524d()
            r8.mo123470p(r15, r0)
            com.tencent.mm.plugin.webview.model.d0 r2 = (com.tencent.p014mm.plugin.webview.model.C6029d0) r2
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r8 = r2.f22285f
            if (r8 != 0) goto L_0x0081
            java.lang.String r1 = "dealJSAPIPreVerify, VerifyCallback is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            goto L_0x057e
        L_0x0081:
            te3.wj2 r8 = r2.mo6998j1()
            if (r8 == 0) goto L_0x0098
            te3.wj2 r8 = r2.mo6998j1()
            te3.hj2 r8 = r8.f144090d
            if (r8 == 0) goto L_0x0098
            te3.wj2 r8 = r2.mo6998j1()
            te3.hj2 r8 = r8.f144090d
            int r8 = r8.f134688d
            goto L_0x0099
        L_0x0098:
            r8 = 0
        L_0x0099:
            if (r1 != 0) goto L_0x0187
            if (r5 == 0) goto L_0x009f
            goto L_0x0187
        L_0x009f:
            te3.wj2 r1 = r2.mo6998j1()
            ob0.c r3 = r2.f22283d
            if (r3 != 0) goto L_0x00a8
            goto L_0x00b0
        L_0x00a8:
            ob0.c$c r3 = r3.f127055a
            pe3.a r3 = r3.f127080a
            r16 = r3
            te3.vj2 r16 = (te3.C51702vj2) r16
        L_0x00b0:
            r7 = r16
            if (r1 == 0) goto L_0x0152
            java.lang.String r3 = r2.f22286g
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0152
            if (r7 == 0) goto L_0x0152
            java.lang.String r3 = r7.f143515e
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x00c8
            goto L_0x0152
        L_0x00c8:
            te3.hj2 r3 = r1.f144090d
            if (r3 != 0) goto L_0x00de
            java.lang.String r1 = "jsapi_baseresponse null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22285f
            r3 = 0
            r4 = 0
            r2 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x00de:
            int r3 = r3.f134688d
            if (r3 == 0) goto L_0x0106
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r10] = r3
            te3.hj2 r3 = r1.f144090d
            java.lang.String r3 = r3.f134689e
            r4[r11] = r3
            java.lang.String r3 = "jsapi baseresponse errcode fail : %d, errmsg = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r3, r4)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r2 = r2.f22285f
            te3.hj2 r1 = r1.f144090d
            java.lang.String r3 = r1.f134689e
            r4 = 0
            r1 = r2
            r2 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x0106:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r3 = r2.f22285f
            java.lang.String r6 = r1.f144093g
            r3.mo7280a(r6)
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r0.f22913e
            java.lang.String r6 = r7.f143514d
            java.lang.String r6 = r0.mo7276b(r6)
            java.lang.String r9 = r7.f143515e
            r3.put(r6, r9)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$d r3 = new com.tencent.mm.plugin.webview.ui.tools.jsapi.c$d
            java.lang.String r6 = r7.f143515e
            r3.<init>(r6, r1)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.webview.ui.tools.jsapi.c$d> r6 = r0.f22914f
            java.lang.String r9 = r7.f143514d
            java.lang.String r9 = r0.mo7276b(r9)
            r6.put(r9, r3)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.webview.ui.tools.jsapi.c$d> r6 = r0.f22914f
            java.lang.String r9 = r7.f143524q
            java.lang.String r9 = r0.mo7276b(r9)
            r6.put(r9, r3)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r2 = r2.f22285f
            r3 = 0
            java.util.LinkedList<te3.wp4> r6 = r1.f144091e
            r1 = r2
            r2 = r4
            r4 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r2 = r7.f143514d
            r1[r10] = r2
            java.lang.String r2 = "dealJSAPIPreVerify url is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r2, r1)
            goto L_0x057e
        L_0x0152:
            java.lang.Object[] r3 = new java.lang.Object[r9]
            if (r1 != 0) goto L_0x0158
            r1 = 1
            goto L_0x0159
        L_0x0158:
            r1 = 0
        L_0x0159:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3[r10] = r1
            java.lang.String r1 = r2.f22286g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3[r11] = r1
            if (r7 != 0) goto L_0x016e
            r10 = 1
        L_0x016e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            r3[r12] = r1
            java.lang.String r1 = "something null %b, %b, %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r1, r3)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22285f
            r3 = 0
            r4 = 0
            r2 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x0187:
            if (r1 != r7) goto L_0x01a7
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22285f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r14)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r4 = 0
            r2 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x01a7:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22285f
            r3 = 0
            r4 = 0
            r2 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x01b4:
            r15 = 1095(0x447, float:1.534E-42)
            if (r8 != r15) goto L_0x03e8
            ob0.b0 r8 = f40.C86709a0.m107524d()
            r8.mo123470p(r15, r0)
            com.tencent.mm.plugin.webview.model.c0 r2 = (com.tencent.p014mm.plugin.webview.model.C6027c0) r2
            te3.gj2 r8 = r2.mo6997j1()
            if (r8 == 0) goto L_0x01d8
            te3.gj2 r8 = r2.mo6997j1()
            te3.hj2 r8 = r8.f134074d
            if (r8 == 0) goto L_0x01d8
            te3.gj2 r8 = r2.mo6997j1()
            te3.hj2 r8 = r8.f134074d
            int r8 = r8.f134688d
            goto L_0x01d9
        L_0x01d8:
            r8 = 0
        L_0x01d9:
            if (r1 != 0) goto L_0x03b7
            if (r5 == 0) goto L_0x01df
            goto L_0x03b7
        L_0x01df:
            java.lang.String r1 = r2.f22279g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x01fa
            java.lang.String r1 = "scene.jsapi is null or nil."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22278f
            r3 = 0
            r4 = 0
            r2 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x01fa:
            te3.gj2 r1 = r2.mo6997j1()
            if (r1 == 0) goto L_0x03a5
            te3.hj2 r3 = r1.f134074d
            if (r3 != 0) goto L_0x0206
            goto L_0x03a5
        L_0x0206:
            int r3 = r3.f134688d
            if (r3 == 0) goto L_0x022e
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r10] = r3
            te3.hj2 r3 = r1.f134074d
            java.lang.String r3 = r3.f134689e
            r4[r11] = r3
            java.lang.String r3 = "auth jsapi_baseresponse %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r3, r4)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r2 = r2.f22278f
            te3.hj2 r1 = r1.f134074d
            java.lang.String r3 = r1.f134689e
            r4 = 0
            r1 = r2
            r2 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x022e:
            ob0.c r3 = r2.f22276d
            if (r3 != 0) goto L_0x0235
            r7 = r16
            goto L_0x023b
        L_0x0235:
            ob0.c$c r7 = r3.f127055a
            pe3.a r7 = r7.f127080a
            te3.fj2 r7 = (te3.C49432fj2) r7
        L_0x023b:
            if (r7 != 0) goto L_0x023f
            r3 = 0
            goto L_0x024e
        L_0x023f:
            if (r3 != 0) goto L_0x0242
            goto L_0x024a
        L_0x0242:
            ob0.c$c r3 = r3.f127055a
            pe3.a r3 = r3.f127080a
            r16 = r3
            te3.fj2 r16 = (te3.C49432fj2) r16
        L_0x024a:
            r3 = r16
            int r3 = r3.f133545o
        L_0x024e:
            java.lang.Object[] r7 = new java.lang.Object[r11]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r7[r10] = r9
            java.lang.String r9 = "signature flag : %d."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r9, r7)
            if (r3 != r11) goto L_0x02cd
            java.util.LinkedList<te3.ok2> r1 = r1.f134077g
            if (r1 != 0) goto L_0x0274
            java.lang.String r1 = "dealJSAPI scope_auth_info is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22278f
            r3 = 0
            r4 = 0
            r2 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x0274:
            java.util.Iterator r1 = r1.iterator()
        L_0x0278:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0316
            java.lang.Object r3 = r1.next()
            te3.ok2 r3 = (te3.C50696ok2) r3
            java.util.LinkedList<java.lang.String> r7 = r3.f139239g
            if (r7 != 0) goto L_0x028e
            java.lang.String r3 = "authInfo.apiname is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r3)
            goto L_0x0278
        L_0x028e:
            java.util.Iterator r7 = r7.iterator()
        L_0x0292:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0278
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r14 != 0) goto L_0x0292
            te3.ej2 r14 = new te3.ej2
            r14.<init>()
            r14.f132957d = r9
            int r9 = r3.f139237e
            r14.f132958e = r9
            java.lang.String r9 = r3.f139238f
            r14.f132959f = r9
            java.util.HashMap<java.lang.String, te3.ej2> r9 = r0.f22912d
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r11 = r14.f132957d
            r15.append(r11)
            java.lang.String r11 = r2.f22280h
            r15.append(r11)
            java.lang.String r11 = r15.toString()
            r9.put(r11, r14)
            r11 = 1
            goto L_0x0292
        L_0x02cd:
            java.util.LinkedList<te3.ej2> r1 = r1.f134075e
            if (r1 != 0) goto L_0x02e4
            java.lang.String r1 = "dealJSAPIAuth auth_info is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22278f
            r4 = 0
            java.lang.String r3 = "nullAuthInfo"
            r2 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x02e4:
            java.util.Iterator r1 = r1.iterator()
        L_0x02e8:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0316
            java.lang.Object r3 = r1.next()
            te3.ej2 r3 = (te3.C49293ej2) r3
            java.lang.String r7 = r3.f132957d
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x02fd
            goto L_0x02e8
        L_0x02fd:
            java.util.HashMap<java.lang.String, te3.ej2> r7 = r0.f22912d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = r3.f132957d
            r9.append(r11)
            java.lang.String r11 = r2.f22280h
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r7.put(r9, r3)
            goto L_0x02e8
        L_0x0316:
            java.util.HashMap<java.lang.String, te3.ej2> r1 = r0.f22912d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = r2.f22279g
            r3.append(r7)
            java.lang.String r7 = r2.f22280h
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.Object r1 = r1.get(r3)
            te3.ej2 r1 = (te3.C49293ej2) r1
            if (r1 != 0) goto L_0x0350
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r3 = r2.f22279g
            r1[r10] = r3
            java.lang.String r3 = r2.f22280h
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "The JSAPIAuthInfo is null. (jsapi : %s , url : %s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r3, r1)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22278f
            r3 = 0
            r4 = 0
            r2 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x0350:
            int r3 = r1.f132958e
            r6 = 1
            if (r3 != r6) goto L_0x0363
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22278f
            r3 = 0
            r6 = 0
            r2 = r4
            r4 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x0363:
            android.content.Context r9 = r0.f22916h
            if (r9 != 0) goto L_0x0371
            java.lang.String r3 = "JSVerify context not activity"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r3)
            r0.mo7275a(r2, r5, r1)
            goto L_0x057e
        L_0x0371:
            com.tencent.mm.plugin.webview.stub.m r10 = r0.f22917i
            r11 = 0
            java.lang.String r3 = r1.f132960g
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            java.lang.String r3 = r1.f132959f
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            android.content.Context r3 = r0.f22916h
            r4 = 2131831696(0x7f112b90, float:1.9296425E38)
            java.lang.String r14 = r3.getString(r4)
            android.content.Context r3 = r0.f22916h
            r4 = 2131831695(0x7f112b8f, float:1.9296423E38)
            java.lang.String r15 = r3.getString(r4)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.a r3 = new com.tencent.mm.plugin.webview.ui.tools.jsapi.a
            r3.<init>(r0, r2, r5, r1)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.b r1 = new com.tencent.mm.plugin.webview.ui.tools.jsapi.b
            r1.<init>(r0, r2, r5)
            r16 = r3
            r17 = r1
            com.tencent.p014mm.plugin.webview.stub.WebViewStubTempUI.m5972I7(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x057e
        L_0x03a5:
            java.lang.String r1 = "dealJSAPIAuth resp is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22278f
            r3 = 0
            r4 = 0
            r2 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x03b7:
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r27)
            r4[r10] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r28)
            r10 = 1
            r4[r10] = r9
            java.lang.String r9 = "dealJSAPIAuth netscene error, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r9, r4)
            if (r1 != r7) goto L_0x03db
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22278f
            r4 = 0
            r2 = r6
            r3 = r29
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x03db:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22278f
            r3 = 0
            r4 = 0
            r2 = r6
            r5 = r28
            r6 = r8
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x03e8:
            r11 = 1094(0x446, float:1.533E-42)
            if (r8 != r11) goto L_0x04fe
            ob0.b0 r8 = f40.C86709a0.m107524d()
            r8.mo123470p(r11, r0)
            com.tencent.mm.plugin.webview.model.e0 r2 = (com.tencent.p014mm.plugin.webview.model.C6030e0) r2
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 157(0x9d, double:7.76E-322)
            r21 = 24
            r23 = 1
            r25 = 0
            r18 = r8
            r18.idkeyStat(r19, r21, r23, r25)
            te3.yj2 r9 = r2.mo6999j1()
            if (r9 == 0) goto L_0x041b
            te3.yj2 r9 = r2.mo6999j1()
            te3.hj2 r9 = r9.f145325d
            if (r9 == 0) goto L_0x041b
            te3.yj2 r9 = r2.mo6999j1()
            te3.hj2 r9 = r9.f145325d
            int r9 = r9.f134688d
            goto L_0x041c
        L_0x041b:
            r9 = 0
        L_0x041c:
            if (r1 != 0) goto L_0x04b0
            if (r5 == 0) goto L_0x0422
            goto L_0x04b0
        L_0x0422:
            te3.yj2 r1 = r2.mo6999j1()
            if (r1 == 0) goto L_0x049e
            te3.hj2 r3 = r1.f145325d
            if (r3 != 0) goto L_0x042e
            goto L_0x049e
        L_0x042e:
            int r3 = r3.f134688d
            if (r3 == 0) goto L_0x0457
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r10] = r3
            te3.hj2 r3 = r1.f145325d
            java.lang.String r3 = r3.f134689e
            r7 = 1
            r4[r7] = r3
            java.lang.String r3 = "realtime jsapi_baseresponse %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r3, r4)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r2 = r2.f22290f
            te3.hj2 r1 = r1.f145325d
            java.lang.String r3 = r1.f134689e
            r4 = 0
            r1 = r2
            r2 = r6
            r5 = r28
            r6 = r9
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x0457:
            te3.wp4 r1 = r1.f145326e
            if (r1 != 0) goto L_0x046f
            java.lang.String r1 = "realtime not ok, vInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22290f
            r4 = 0
            java.lang.String r3 = "verifyFail"
            r2 = r6
            r5 = r28
            r6 = r9
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x046f:
            int r1 = r1.f144211f
            r3 = 1
            if (r1 == r3) goto L_0x0490
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r10] = r1
            java.lang.String r1 = "realtime not ok, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r1, r3)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22290f
            r4 = 0
            java.lang.String r3 = "verifyFail"
            r2 = r6
            r5 = r28
            r6 = r9
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x0490:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22290f
            r3 = 0
            r6 = 0
            r2 = r4
            r4 = r6
            r5 = r28
            r6 = r9
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x049e:
            java.lang.String r1 = "dealJSAPIRealtimeVerify resp is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22290f
            r3 = 0
            r4 = 0
            r2 = r6
            r5 = r28
            r6 = r9
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x04b0:
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r27)
            r4[r10] = r11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r28)
            r11 = 1
            r4[r11] = r10
            java.lang.String r10 = "dealJSAPIRealtimeVerify netscene error"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r10, r4)
            r19 = 157(0x9d, double:7.76E-322)
            r21 = 25
            r23 = 1
            r25 = 0
            r18 = r8
            r18.idkeyStat(r19, r21, r23, r25)
            if (r1 != r7) goto L_0x04f1
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22290f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r14)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r4 = 0
            r2 = r6
            r5 = r28
            r6 = r9
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x04f1:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c$a r1 = r2.f22290f
            r3 = 0
            r4 = 0
            r2 = r6
            r5 = r28
            r6 = r9
            r1.mo7263b(r2, r3, r4, r5, r6)
            goto L_0x057e
        L_0x04fe:
            r3 = 1096(0x448, float:1.536E-42)
            if (r8 != r3) goto L_0x057e
            ob0.b0 r4 = f40.C86709a0.m107524d()
            r4.mo123470p(r3, r0)
            com.tencent.mm.plugin.webview.model.f0 r2 = (com.tencent.p014mm.plugin.webview.model.C6031f0) r2
            ob0.c r3 = r2.f22292d
            if (r3 != 0) goto L_0x0510
            goto L_0x0518
        L_0x0510:
            ob0.c$c r3 = r3.f127055a
            pe3.a r3 = r3.f127080a
            r16 = r3
            te3.zj2 r16 = (te3.C52273zj2) r16
        L_0x0518:
            r3 = r16
            if (r3 != 0) goto L_0x0522
            java.lang.String r1 = "JSAPISetOAuth, setAuthReq is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            return
        L_0x0522:
            if (r1 != 0) goto L_0x0566
            if (r5 == 0) goto L_0x0527
            goto L_0x0566
        L_0x0527:
            java.lang.String r4 = r3.f146029f
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            qe3.c$h r4 = qe3.C25549c.m33051b(r4)
            if (r4 != 0) goto L_0x0548
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r2[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r4 = 1
            r2[r4] = r1
            java.lang.String r1 = "JSAPISetOAuth, errType[%s], errCode[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r1, r2)
            return
        L_0x0548:
            r4 = 1
            te3.ej2 r1 = r2.f22294f
            r1.f132958e = r4
            java.util.HashMap<java.lang.String, te3.ej2> r2 = r0.f22912d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.f146029f
            r4.append(r5)
            java.lang.String r3 = r3.f146027d
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.put(r3, r1)
            goto L_0x057e
        L_0x0566:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r2[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r4 = 1
            r2[r4] = r1
            java.lang.String r1 = r3.f146029f
            r2[r12] = r1
            java.lang.String r1 = "JSAPISetOAuth, errType[%s], errCode[%s], %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r1, r2)
        L_0x057e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
