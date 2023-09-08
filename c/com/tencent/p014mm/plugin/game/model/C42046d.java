package com.tencent.p014mm.plugin.game.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.tencent.p014mm.plugin.game.p061ui.GameRegionPreference;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import sw1.C48483p;
import u10.C52415a;
import uy1.C52638a;

/* renamed from: com.tencent.mm.plugin.game.model.d */
public class C42046d {

    /* renamed from: com.tencent.mm.plugin.game.model.d$a */
    public class C42047a implements C44580q1 {

        /* renamed from: a */
        public final /* synthetic */ String f113289a;

        public C42047a(String str) {
            this.f113289a = str;
        }

        /* renamed from: a */
        public void mo1579a(boolean z, boolean z2) {
            if (z) {
                C52415a.m58668a().mo62981c(this.f113289a, 0, 0, (String) null, (String) null);
            }
        }
    }

    /* renamed from: a */
    public static String m45742a() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("game_center_pref", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("game_ban_msg_type_array", "");
        }
        return null;
    }

    /* renamed from: b */
    public static String m45743b() {
        String simCountryCode = Util.getSimCountryCode(MMApplicationContext.getContext());
        if (Util.isNullOrNil(simCountryCode)) {
            simCountryCode = "CN";
        }
        return simCountryCode.toUpperCase();
    }

    /* renamed from: c */
    public static String m45744c(String str) {
        String str2;
        InputStream inputStream = null;
        try {
            inputStream = MMApplicationContext.getContext().getAssets().open("game_region_default.txt");
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            str2 = new String(bArr);
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.m105921e("MicroMsg.GameCenterLogic", "exception:%s", Util.stackTraceToString(e));
            }
        } catch (IOException e2) {
            Log.m105921e("MicroMsg.GameCenterLogic", "exception:%s", Util.stackTraceToString(e2));
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.m105921e("MicroMsg.GameCenterLogic", "exception:%s", Util.stackTraceToString(e3));
                }
            }
            str2 = "";
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    Log.m105921e("MicroMsg.GameCenterLogic", "exception:%s", Util.stackTraceToString(e4));
                }
            }
            throw th;
        }
        String[] split = str2.trim().split("\\|");
        if (split.length >= 3) {
            return "zh_CN".equalsIgnoreCase(str) ? split[0] : ("zh_TW".equalsIgnoreCase(str) || "zh_HK".equalsIgnoreCase(str)) ? split[1] : split[2];
        }
        Log.m105921e("MicroMsg.GameCenterLogic", "this region default title has problem %s", str2);
        return "";
    }

    /* renamed from: d */
    public static String m45745d(Context context) {
        return context.getSharedPreferences("game_center_pref", 0).getString("game_region_code", "");
    }

    /* renamed from: e */
    public static LinkedList<String> m45746e(Context context) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(((C48483p) C86312j.m106911c(C48483p.class)).xg0().f113235a);
        return linkedList;
    }

    /* renamed from: f */
    public static ShapeDrawable m45747f(Context context, int i, int i2) {
        float f = (float) i2;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    /* renamed from: g */
    public static GameRegionPreference.C42228a m45748g(Context context) {
        String d = m45745d(context);
        if (Util.isNullOrNil(d)) {
            d = m45743b();
        }
        return (GameRegionPreference.C42228a) ((LinkedHashMap) C52638a.C52640b.f146975a.mo73589b()).get(d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0026 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.LinkedList<com.tencent.p014mm.pluginsdk.model.app.C44561j> m45749h(android.content.Context r8) {
        /*
            java.lang.String r8 = "MicroMsg.GameCenterLogic"
            java.lang.String r0 = "getShowInGameCenterGames"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.Class<sw1.p> r1 = sw1.C48483p.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            sw1.p r1 = (sw1.C48483p) r1
            com.tencent.mm.plugin.game.model.a r1 = r1.xg0()
            java.util.LinkedList<com.tencent.mm.pluginsdk.model.app.j> r1 = r1.f113236b
            r0.addAll(r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0026:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0065
            java.lang.Object r3 = r2.next()
            com.tencent.mm.pluginsdk.model.app.j r3 = (com.tencent.p014mm.pluginsdk.model.app.C44561j) r3
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0037
            goto L_0x0053
        L_0x0037:
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r3.field_appId
            r6[r4] = r7
            int r7 = r3.field_appInfoFlag
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r5] = r7
            java.lang.String r7 = "appinfo:[%s], appinfo flag:[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r6)
            int r6 = r3.field_appInfoFlag
            r6 = r6 & 4
            if (r6 <= 0) goto L_0x0053
            r6 = 1
            goto L_0x0054
        L_0x0053:
            r6 = 0
        L_0x0054:
            if (r6 != 0) goto L_0x0026
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r3.field_appName
            r5[r4] = r6
            java.lang.String r4 = "app should not show in gamecenter:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r4, r5)
            r1.add(r3)
            goto L_0x0026
        L_0x0065:
            int r8 = r1.size()
            if (r8 <= 0) goto L_0x006e
            r0.removeAll(r1)
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.C42046d.m45749h(android.content.Context):java.util.LinkedList");
    }

    /* renamed from: i */
    public static String m45750i(GameRegionPreference.C42228a aVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (aVar != null) {
            String nullAsNil = Util.nullAsNil(LocaleUtil.getApplicationLanguage());
            if ("zh_CN".equalsIgnoreCase(nullAsNil)) {
                stringBuffer.append(aVar.f114141a);
            } else if ("zh_TW".equalsIgnoreCase(nullAsNil) || "zh_HK".equalsIgnoreCase(nullAsNil)) {
                stringBuffer.append(aVar.f114142b);
            } else {
                stringBuffer.append(aVar.f114143c);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: j */
    public static void m45751j(Context context, String str) {
        m45752k(context, str, (String) null, "WX_GameCenter", new C42047a(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d9  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45752k(android.content.Context r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, com.tencent.p014mm.pluginsdk.model.app.C44580q1 r15) {
        /*
            java.lang.Class<ym.l> r0 = p763ym.C79138l.class
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            java.lang.String r2 = "MicroMsg.GameCenterLogic"
            r3 = 0
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "null or nil appid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            if (r15 == 0) goto L_0x0015
            r15.mo1579a(r3, r3)
        L_0x0015:
            di3.d r1 = di3.C86312j.m106911c(r0)
            ym.l r1 = (p763ym.C79138l) r1
            com.tencent.mm.pluginsdk.model.app.j r12 = r1.getAppInfo(r12)
            if (r12 == 0) goto L_0x012f
            java.lang.String r1 = r12.field_appId
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x002b
            goto L_0x012f
        L_0x002b:
            java.lang.String r1 = "MicroMsg.AppUtilities"
            java.lang.String r4 = "check the signature of the Application."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r4 = 2
            r5 = 1
            if (r11 != 0) goto L_0x003c
            java.lang.String r6 = "context is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            goto L_0x0093
        L_0x003c:
            java.lang.String r6 = r12.field_packageName
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x004a
            java.lang.String r6 = "packageName is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            goto L_0x0093
        L_0x004a:
            java.lang.String r6 = r12.field_signature
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x005e
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = r12.field_packageName
            r6[r3] = r7
            java.lang.String r7 = "app.field_signature is null. app.field_packageName is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r7, r6)
            goto L_0x0093
        L_0x005e:
            java.lang.String r6 = r12.field_packageName
            android.content.pm.Signature[] r6 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r11, r6)
            if (r6 == 0) goto L_0x00a4
            int r7 = r6.length
            if (r7 != 0) goto L_0x006a
            goto L_0x00a4
        L_0x006a:
            int r7 = r6.length
            r8 = 0
        L_0x006c:
            if (r8 >= r7) goto L_0x0098
            r9 = r6[r8]
            byte[] r9 = r9.toByteArray()
            java.lang.String r9 = p823sg.C90193h.m112878f(r9)
            java.lang.String r9 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85019e(r9)
            java.lang.String r10 = r12.field_signature
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0095
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = r12.field_appName
            r6[r3] = r7
            java.lang.String r7 = r12.field_signature
            r6[r5] = r7
            java.lang.String r7 = "app_name : %s ,signature : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r6)
        L_0x0093:
            r1 = 1
            goto L_0x00aa
        L_0x0095:
            int r8 = r8 + 1
            goto L_0x006c
        L_0x0098:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = r12.field_appName
            r6[r3] = r7
            java.lang.String r7 = "signature is diff.(app_name:%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r7, r6)
            goto L_0x00a9
        L_0x00a4:
            java.lang.String r6 = "apk signatures is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
        L_0x00a9:
            r1 = 0
        L_0x00aa:
            if (r1 != 0) goto L_0x00d9
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.String r14 = r12.field_appName
            r13[r3] = r14
            java.lang.String r14 = "The app %s signature is incorrect."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r14, r13)
            r13 = 2131830801(0x7f112811, float:1.929461E38)
            java.lang.Object[] r14 = new java.lang.Object[r5]
            di3.d r0 = di3.C86312j.m106911c(r0)
            ym.l r0 = (p763ym.C79138l) r0
            java.lang.String r12 = r0.mo74011hv(r11, r12)
            r14[r3] = r12
            java.lang.String r12 = r11.getString(r13, r14)
            android.widget.Toast r11 = p910lj.C76701a.makeText((android.content.Context) r11, (java.lang.CharSequence) r12, (int) r5)
            r11.show()
            if (r15 == 0) goto L_0x0139
            r15.mo1579a(r3, r3)
            goto L_0x0139
        L_0x00d9:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            com.tencent.mm.opensdk.modelmsg.WXAppExtendObject r1 = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject
            r1.<init>()
            r0.<init>(r1)
            r1 = 638064131(0x26081603, float:4.721431E-16)
            r0.sdkVer = r1
            r0.messageAction = r13
            r0.messageExt = r14
            r13 = 3
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.String r14 = r12.field_appId
            r13[r3] = r14
            java.lang.String r14 = r12.field_appName
            r13[r5] = r14
            java.lang.String r14 = r12.field_openId
            r13[r4] = r14
            java.lang.String r14 = "launch game app from wx: appid: [%s], appname:[%s], openid:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r14, r13)
            java.lang.String r13 = r12.field_openId
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x0126
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.String r14 = r12.field_appName
            r13[r3] = r14
            java.lang.String r14 = "open id is null or nil, try to get from server:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r14, r13)
            java.lang.Class<ym.s> r13 = p763ym.C53543s.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            ym.s r13 = (p763ym.C53543s) r13
            ym.o r13 = r13.mo74025px()
            java.lang.String r14 = r12.field_appId
            com.tencent.mm.pluginsdk.model.app.e0 r13 = (com.tencent.p014mm.pluginsdk.model.app.C44550e0) r13
            r13.mo69340a(r14)
        L_0x0126:
            com.tencent.mm.plugin.game.model.e r13 = new com.tencent.mm.plugin.game.model.e
            r13.<init>(r11, r12, r0, r15)
            ji3.C9457a.m9137a(r13)
            goto L_0x0139
        L_0x012f:
            java.lang.String r11 = "appinfo is null or appid is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r11)
            if (r15 == 0) goto L_0x0139
            r15.mo1579a(r3, r3)
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.C42046d.m45752k(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.pluginsdk.model.app.q1):void");
    }

    /* renamed from: l */
    public static void m45753l(int i) {
        String valueOf = String.valueOf(i);
        String a = m45742a();
        if (!Util.isNullOrNil(a)) {
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("game_center_pref", 0);
            String[] split = a.split(",");
            StringBuilder sb = new StringBuilder();
            for (String str : split) {
                if (!str.equals(valueOf)) {
                    sb.append(str);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            sharedPreferences.edit().putString("game_ban_msg_type_array", sb.toString()).apply();
        }
    }

    /* renamed from: m */
    public static void m45754m() {
        MMApplicationContext.getContext().getSharedPreferences("game_center_pref", 0).edit().putString("game_center_pref_lang", LocaleUtil.getApplicationLanguage()).commit();
    }

    /* renamed from: n */
    public static void m45755n(Context context, String str) {
        String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
        SharedPreferences sharedPreferences = context.getSharedPreferences("game_center_pref", 0);
        String string = sharedPreferences.getString("download_app_id_time_map", "");
        if (Util.isNullOrNil(string)) {
            sharedPreferences.edit().putString("download_app_id_time_map", str + "-" + valueOf).commit();
        } else if (string.contains(str)) {
            String str2 = new String();
            String[] split = string.split(",");
            for (int i = 0; i < split.length; i++) {
                String str3 = split[i];
                if (str3.contains(str)) {
                    str3 = str + "-" + valueOf;
                }
                if (i == split.length - 1) {
                    str2 = str2 + str3;
                } else {
                    str2 = str2 + str3 + ",";
                }
            }
            sharedPreferences.edit().putString("download_app_id_time_map", str2).apply();
        } else {
            sharedPreferences.edit().putString("download_app_id_time_map", string + "," + str + "-" + valueOf).apply();
        }
    }

    /* renamed from: o */
    public static void m45756o(int i) {
        String valueOf = String.valueOf(i);
        int i2 = 0;
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("game_center_pref", 0);
        String a = m45742a();
        if (!Util.isNullOrNil(a)) {
            String[] split = a.split(",");
            int length = split.length;
            while (i2 < length) {
                if (!split[i2].equals(valueOf)) {
                    i2++;
                } else {
                    return;
                }
            }
            valueOf = a + "," + valueOf;
        }
        sharedPreferences.edit().putString("game_ban_msg_type_array", valueOf).apply();
    }
}
