package com.tencent.p014mm.plugin.ipcall.model;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.ipcall.model.d */
public class C42464d {

    /* renamed from: d */
    public static C42464d f114950d;

    /* renamed from: a */
    public ArrayList<Integer> f114951a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<Integer> f114952b = new ArrayList<>();

    /* renamed from: c */
    public boolean f114953c = false;

    /* renamed from: a */
    public static C42464d m46136a() {
        if (f114950d == null) {
            f114950d = new C42464d();
        }
        return f114950d;
    }

    /* renamed from: b */
    public void mo66546b(boolean z) {
        if (!this.f114953c || z) {
            mo66548d();
            String str = C112760b.m154225d() + "ipcallCountryCodeConfig.cfg";
            InputStream inputStream = null;
            try {
                Uri n = C116299g2.m163858n(str);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    Log.m105919d("MicroMsg.IPCallCountryCodeConfig", "initConfig, file: %s not exist!", str);
                    this.f114953c = true;
                    Pattern pattern = C116299g2.f349012a;
                    return;
                }
                inputStream = C86013q1.m106421C(n, C116281f0.C116289i.f348994a.mo177799l(n, l));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String str2 = "";
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str2 = str2 + readLine;
                }
                Log.m105919d("MicroMsg.IPCallCountryCodeConfig", "config file content: %s", str2);
                mo66547c(str2);
                this.f114953c = true;
                C116299g2.m163847c(inputStream);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.IPCallCountryCodeConfig", e, "", new Object[0]);
                Log.m105921e("MicroMsg.IPCallCountryCodeConfig", "initConfig error: %s", e.getMessage());
            } catch (Throwable th) {
                C116299g2.m163847c((Closeable) null);
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void mo66547c(String str) {
        if (!Util.isNullOrNil(str)) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("restriction");
                Log.m105919d("MicroMsg.IPCallCountryCodeConfig", "restrictionCountryCode: %d", Integer.valueOf(jSONArray.length()));
                this.f114952b.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f114952b.add(Integer.valueOf(jSONArray.getInt(i)));
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.IPCallCountryCodeConfig", e, "", new Object[0]);
                Log.m105921e("MicroMsg.IPCallCountryCodeConfig", "initConfigFromContent error: %s", e.getMessage());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66548d() {
        /*
            r11 = this;
            s12.j r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Bx0()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f97350d
            r2 = 0
            r3 = 2
            java.lang.String r4 = "SELECT IPCallPopularCountry.countryCode,IPCallPopularCountry.callTimeCount,IPCallPopularCountry.lastCallTime FROM IPCallPopularCountry   ORDER BY IPCallPopularCountry.callTimeCount DESC,IPCallPopularCountry.lastCallTime DESC"
            android.database.Cursor r0 = r0.rawQuery(r4, r2, r3)
            if (r0 == 0) goto L_0x003a
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L_0x003a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0023:
            s12.i r2 = new s12.i
            r2.<init>()
            r2.convertFrom(r0)
            int r2 = r2.field_countryCode
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L_0x0023
        L_0x003a:
            if (r0 == 0) goto L_0x003f
            r0.close()
        L_0x003f:
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0048
            r11.f114951a = r1
            goto L_0x00af
        L_0x0048:
            java.util.ArrayList<java.lang.Integer> r0 = r11.f114951a
            r0.clear()
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r1 = "WeChatOutTopCountryCode"
            java.lang.String r0 = r0.mo107405c(r1)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r0
            java.lang.String r4 = "MicroMsg.IPCallCountryCodeConfig"
            java.lang.String r5 = "popularCountryConfig: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x00af
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2)
            int r2 = r0.length
            int r5 = r0.length     // Catch:{ NumberFormatException -> 0x00a1 }
            r6 = 0
        L_0x007f:
            if (r6 >= r5) goto L_0x00af
            r7 = r0[r6]     // Catch:{ NumberFormatException -> 0x00a1 }
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r3)     // Catch:{ NumberFormatException -> 0x00a1 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x00a1 }
            java.util.ArrayList<java.lang.Integer> r8 = r11.f114951a     // Catch:{ NumberFormatException -> 0x00a1 }
            r8.add(r7)     // Catch:{ NumberFormatException -> 0x00a1 }
            s12.j r8 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Bx0()     // Catch:{ NumberFormatException -> 0x00a1 }
            int r7 = r7.intValue()     // Catch:{ NumberFormatException -> 0x00a1 }
            long r9 = (long) r2     // Catch:{ NumberFormatException -> 0x00a1 }
            r8.mo60757jo(r7, r9)     // Catch:{ NumberFormatException -> 0x00a1 }
            int r2 = r2 + -1
            int r6 = r6 + 1
            goto L_0x007f
        L_0x00a1:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r1[r3] = r0
            java.lang.String r0 = "initPopularCountryFromDynamicConfig error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r1)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.model.C42464d.mo66548d():void");
    }

    /* renamed from: e */
    public boolean mo66549e(int i) {
        if (!this.f114953c) {
            mo66546b(false);
        }
        ArrayList<Integer> arrayList = this.f114952b;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f114952b.contains(Integer.valueOf(i));
    }
}
