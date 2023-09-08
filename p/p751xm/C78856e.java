package p751xm;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.Signature;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.pluginsdk.model.app.C6649i0;
import com.tencent.p014mm.pluginsdk.model.app.C72685h0;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.model.app.C72691t1;
import com.tencent.p014mm.pluginsdk.model.app.C72693u1;
import com.tencent.p014mm.pluginsdk.model.app.C72702v1;
import com.tencent.p014mm.pluginsdk.model.app.C85606b2;
import com.tencent.p014mm.pluginsdk.model.app.v1$$a;
import com.tencent.p014mm.pluginsdk.model.app.v1$$b;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import p1035sf.C90183c;
import p156gj.C87200o;
import p763ym.C79139p;
import p823sg.C101614i;
import p823sg.C90193h;
import qe3.C89625d;
import zt3.C119157j;

@C86522b
/* renamed from: xm.e */
public class C78856e extends C86301e implements C79139p {
    /* renamed from: Hp */
    public void mo108860Hp(int i, String str, String str2, int i2, C72691t1.C72692a aVar, int i3) {
        C72688j0.m85015a(i, str, str2, i2, aVar, i3);
    }

    public String I90(Context context, String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            Log.m105920e("MicroMsg.AppUtil", "buildUnistallUrl fail, invalid arguments");
            return null;
        }
        String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), context);
        if (loadApplicationLanguage == null || loadApplicationLanguage.length() == 0) {
            loadApplicationLanguage = "zh_CN";
        } else if (loadApplicationLanguage.equals("en")) {
            loadApplicationLanguage = "en_US";
        }
        return context.getString(C0966R.string.hfq, new Object[]{str, Integer.valueOf(C89625d.f257841g), loadApplicationLanguage, C87200o.f252868a, str2, 0});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005d, code lost:
        if (r0.startsWith(com.tencent.p014mm.sdk.http.HttpWrapperBase.PROTOCAL_HTTP + com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(com.tencent.p014mm.C0966R.string.f360885fm3) + "/") != false) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017f  */
    /* renamed from: K3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo108862K3(java.lang.String r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r17
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_webview_append_url_params
            r3 = 0
            int r1 = r1.mo58779Qe(r2, r3)
            r2 = 1
            if (r1 != r2) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            if (r4 == 0) goto L_0x001e
            goto L_0x0060
        L_0x001e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "https://"
            r4.append(r5)
            r5 = 2131831321(0x7f112a19, float:1.9295664E38)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r5)
            r4.append(r6)
            java.lang.String r6 = "/"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0062
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "http://"
            r4.append(r7)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r5)
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r4 = 0
            goto L_0x0063
        L_0x0062:
            r4 = 1
        L_0x0063:
            java.lang.String r5 = "MicroMsg.AppUtil"
            if (r1 != 0) goto L_0x0070
            if (r4 != 0) goto L_0x0070
            java.lang.String r1 = "buildRedirectUrl appendParams false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            goto L_0x0185
        L_0x0070:
            if (r0 == 0) goto L_0x017f
            int r1 = r17.length()
            if (r1 != 0) goto L_0x007a
            goto L_0x017f
        L_0x007a:
            java.lang.String r0 = r17.trim()
            java.lang.String r1 = "#"
            int r1 = r0.indexOf(r1)
            java.lang.String r4 = ""
            if (r1 < 0) goto L_0x0091
            java.lang.String r6 = r0.substring(r1)
            java.lang.String r0 = r0.substring(r3, r1)
            goto L_0x0092
        L_0x0091:
            r6 = r4
        L_0x0092:
            java.lang.String r1 = "?"
            int r7 = r0.indexOf(r1)
            if (r7 < 0) goto L_0x00a5
            int r8 = r7 + 1
            java.lang.String r8 = r0.substring(r8)
            java.lang.String r0 = r0.substring(r3, r7)
            goto L_0x00a6
        L_0x00a5:
            r8 = r4
        L_0x00a6:
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r6
            r7[r2] = r8
            r9 = 2
            r7[r9] = r0
            java.lang.String r9 = "buildRedirectUrl, sharpStr = %s, paramStr = %s, srcUrl = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r9, r7)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            java.lang.String r10 = "&"
            if (r9 != 0) goto L_0x0100
            java.lang.String[] r8 = r8.split(r10)
            if (r8 == 0) goto L_0x0100
            int r9 = r8.length
            if (r9 <= 0) goto L_0x0100
            int r9 = r8.length
            r11 = 0
        L_0x00cd:
            if (r11 >= r9) goto L_0x0100
            r12 = r8[r11]
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 != 0) goto L_0x00fd
            java.lang.String r13 = "="
            int r13 = r12.indexOf(r13)
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            r14[r3] = r15
            java.lang.String r15 = "buildRedirectUrl, equalIdx = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r15, r14)
            if (r13 < 0) goto L_0x00f9
            int r13 = r13 + 1
            java.lang.String r14 = r12.substring(r3, r13)
            java.lang.String r12 = r12.substring(r13)
            r13 = r12
            r12 = r14
            goto L_0x00fa
        L_0x00f9:
            r13 = r4
        L_0x00fa:
            r7.put(r12, r13)
        L_0x00fd:
            int r11 = r11 + 1
            goto L_0x00cd
        L_0x0100:
            if (r18 != 0) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r4 = r18
        L_0x0105:
            java.lang.String r8 = "from="
            r7.put(r8, r4)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r8 = r7.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4[r3] = r8
            java.lang.String r8 = "buildRedirectUrl, pMap size = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r8, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Set r8 = r7.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0128:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x014a
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            int r11 = r4.length()
            if (r11 <= 0) goto L_0x013d
            r4.append(r10)
        L_0x013d:
            r4.append(r9)
            java.lang.Object r9 = r7.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r4.append(r9)
            goto L_0x0128
        L_0x014a:
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r1)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r1 != 0) goto L_0x0175
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x0175:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r0
            java.lang.String r2 = "buildRedirectUrl, ret url = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r2, r1)
            goto L_0x0185
        L_0x017f:
            java.lang.String r0 = "buildRedirectUrl fail, invalid arguments"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r0 = 0
        L_0x0185:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p751xm.C78856e.mo108862K3(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: Ln */
    public boolean mo108863Ln(Context context, C44561j jVar, String str, C72693u1 u1Var, C72691t1 t1Var, boolean z) {
        return C72685h0.m85014a(context, jVar, str, u1Var, t1Var, z);
    }

    /* renamed from: OB */
    public boolean mo108864OB(Context context, C44561j jVar) {
        Log.m105924i("MicroMsg.AppUtil", "check the signature of the Application.");
        if (context == null) {
            Log.m105920e("MicroMsg.AppUtil", "context is null.");
        } else if (jVar == null) {
            Log.m105920e("MicroMsg.AppUtil", "appInfo is null.");
        } else if (Util.isNullOrNil(jVar.field_packageName)) {
            Log.m105920e("MicroMsg.AppUtil", "packageName is null.");
        } else if (Util.isNullOrNil(jVar.field_signature)) {
            Log.m105921e("MicroMsg.AppUtil", "app.field_signature is null. app.field_packageName is %s", jVar.field_packageName);
        } else {
            Signature[] a = C6647c.m6936a(context, jVar.field_packageName);
            if (a == null || a.length == 0) {
                Log.m105920e("MicroMsg.AppUtil", "apk signatures is null");
                return false;
            }
            int length = a.length;
            int i = 0;
            while (i < length) {
                if (jVar.field_signature.equals(C72688j0.m85019e(C90193h.m112878f(a[i].toByteArray())))) {
                    Log.m105925i("MicroMsg.AppUtil", "app_name : %s ,signature : %s", jVar.field_appName, jVar.field_signature);
                } else {
                    i++;
                }
            }
            Log.m105929w("MicroMsg.AppUtil", "signature is diff.(app_name:%s)", jVar.field_appName);
            return false;
        }
        return true;
    }

    public C85606b2 S80() {
        if (System.currentTimeMillis() - C85606b2.f249527i < 600000) {
            return C85606b2.f249526h;
        }
        Log.m105920e("MicroMsg.AppUtil", "hy: get comm model time expired");
        return null;
    }

    /* renamed from: Xx */
    public void mo108866Xx(Activity activity, String str) {
        ((C119157j) C119157j.f356862d).mo183876g(new C6649i0(activity, str), "reportLaunchWechat");
    }

    public void ac0(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.AppUtil", "appid is null");
            return;
        }
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        if (defaultPreference != null) {
            String string = defaultPreference.getString("key_app_ids_registion_while_not_login", "");
            if (string.contains(str)) {
                Log.m105925i("MicroMsg.AppUtil", "this app has been saved : %s in %s", str, string);
                return;
            }
            defaultPreference.edit().putString("key_app_ids_registion_while_not_login", str + "|" + string).commit();
        }
    }

    public C72693u1 c30(String str) {
        C101614i<String, C72693u1> iVar = C72702v1.f211542a;
        C72693u1 u1Var = new C72693u1();
        u1Var.f211524e = false;
        if (!C90183c.m112859g(str)) {
            C72693u1 u1Var2 = (C72693u1) C72702v1.f211542a.remove(str);
            if (u1Var2 != null) {
                u1Var = u1Var2;
            }
            if (!Util.isNullOrNil(u1Var.f211521b)) {
                ((C119157j) C119157j.f356862d).mo183876g(new v1$$a(u1Var.f211521b), "OpenSDKTokenTask");
            }
        }
        return u1Var;
    }

    public String mn0(Context context, String str) {
        Signature[] a = C6647c.m6936a(context, str);
        if (a != null && a.length != 0) {
            return C72688j0.m85019e(C90193h.m112878f(a[0].toByteArray()));
        }
        Log.m105920e("MicroMsg.AppUtil", "signs is null");
        return null;
    }

    /* renamed from: oF */
    public boolean mo108870oF(Context context, C44561j jVar, String str) {
        return C72685h0.m85014a(context, jVar, str, (C72693u1) null, (C72691t1) null, false);
    }

    public String on0(String str) {
        C101614i<String, C72693u1> iVar = C72702v1.f211542a;
        return str + C72702v1.m85090b() + System.nanoTime() + "-" + ((int) (Math.random() * 1000.0d));
    }

    public void p20(C85606b2 b2Var) {
        C85606b2.f249526h = b2Var;
        C85606b2.f249527i = System.currentTimeMillis();
    }

    /* renamed from: sp */
    public boolean mo108873sp(String str) {
        C101614i<String, C72693u1> iVar = C72702v1.f211542a;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        return str.contains(C72702v1.m85090b());
    }

    /* renamed from: zK */
    public void mo108874zK(Context context, String str, String str2, int i) {
        C101614i<String, C72693u1> iVar = C72702v1.f211542a;
        String d = C72688j0.m85018d(context, str2);
        C72693u1 u1Var = new C72693u1();
        u1Var.f211520a = str;
        u1Var.f211521b = str2;
        u1Var.f211522c = d;
        u1Var.f211523d = i;
        u1Var.f211524e = true;
        C72702v1.f211542a.put(str, u1Var);
        ((C119157j) C119157j.f356862d).mo183876g(new v1$$b(str, str2), "OpenSDKTokenTask");
    }
}
