package p645pj;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc3.C10485b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pj.d */
public class C47505d {

    /* renamed from: c */
    public static final String f127470c = (C72994y1.f212832a + "configlist/");

    /* renamed from: a */
    public SparseArray<C47506e> f127471a = new SparseArray<>();

    /* renamed from: b */
    public volatile boolean f127472b = false;

    /* renamed from: a */
    public String mo72508a(int i, String str, String str2) {
        C47506e c = mo72510c(i);
        if (c != null && c.f127474a.containsKey(str)) {
            return (String) c.f127474a.get(str).get(str2);
        }
        return null;
    }

    /* renamed from: b */
    public final String mo72509b(int i) {
        return f127470c + "config_" + i + ".xml";
    }

    /* renamed from: c */
    public final C47506e mo72510c(int i) {
        if (!this.f127472b) {
            synchronized (this) {
                if (!this.f127472b) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr = C47506e.f127473c;
                        if (i2 >= 1) {
                            this.f127472b = true;
                            break;
                        }
                        mo72513f(iArr[i2]);
                        i2++;
                    }
                }
            }
        }
        if (this.f127471a.get(i) == null) {
            mo72513f(i);
        }
        return this.f127471a.get(i);
    }

    /* renamed from: d */
    public List<String> mo72511d() {
        String a = mo72508a(1, "IBeacon", "Content");
        if (Util.isNullOrNil(a)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<String> keys = new JSONObject(a.replace(",}", "}")).keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null) {
                    arrayList.add(next.toString());
                }
            }
            return arrayList;
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.ConfigListDecoder", "[oneliang] json parse exception: " + e.getMessage());
            return arrayList;
        }
    }

    /* renamed from: e */
    public boolean mo72512e() {
        boolean z = true;
        if (Util.getInt(mo72508a(1, "ShowConfig", "showRecvTmpMsgBtn"), 0) != 1) {
            z = false;
        }
        Log.m105918d("MicroMsg.ConfigListDecoder", "isShowRecvTmpMsgBtn : " + z);
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.tencent.mm.vfs.f0$h, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72513f(int r10) {
        /*
            r9 = this;
            java.lang.String r0 = "exception:%s"
            java.lang.String r1 = "MicroMsg.ConfigListDecoder"
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.String r5 = r9.mo72509b(r10)     // Catch:{ Exception -> 0x0030 }
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r6 = r5.getPath()     // Catch:{ Exception -> 0x0030 }
            if (r6 == 0) goto L_0x0032
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r4, r4)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r7 = r5.getPath()     // Catch:{ Exception -> 0x0030 }
            boolean r7 = r7.equals(r6)     // Catch:{ Exception -> 0x0030 }
            if (r7 != 0) goto L_0x0032
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ Exception -> 0x0030 }
            android.net.Uri$Builder r5 = r5.path(r6)     // Catch:{ Exception -> 0x0030 }
            android.net.Uri r5 = r5.build()     // Catch:{ Exception -> 0x0030 }
            goto L_0x0032
        L_0x0030:
            r10 = move-exception
            goto L_0x0091
        L_0x0032:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0030 }
            com.tencent.mm.vfs.f0$h r6 = r6.mo177799l(r5, r2)     // Catch:{ Exception -> 0x0030 }
            boolean r7 = r6.mo177810a()     // Catch:{ Exception -> 0x0030 }
            if (r7 != 0) goto L_0x0040
            r7 = 0
            goto L_0x0048
        L_0x0040:
            com.tencent.mm.vfs.FileSystem$c r7 = r6.f348991a     // Catch:{ Exception -> 0x0030 }
            java.lang.String r8 = r6.f348992b     // Catch:{ Exception -> 0x0030 }
            boolean r7 = r7.mo119948x(r8)     // Catch:{ Exception -> 0x0030 }
        L_0x0048:
            if (r7 == 0) goto L_0x007c
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0030 }
            com.tencent.mm.vfs.f0$h r6 = r7.mo177799l(r5, r6)     // Catch:{ Exception -> 0x0030 }
            java.io.InputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106421C(r5, r6)     // Catch:{ Exception -> 0x0030 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0030 }
            java.lang.String r6 = "utf-8"
            r5.<init>(r2, r6)     // Catch:{ Exception -> 0x0030 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0030 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x0030 }
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x0030 }
            r7.<init>()     // Catch:{ Exception -> 0x0030 }
        L_0x0065:
            java.lang.String r8 = r6.readLine()     // Catch:{ Exception -> 0x0030 }
            if (r8 == 0) goto L_0x006f
            r7.append(r8)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0065
        L_0x006f:
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0030 }
            r9.mo72514g(r10, r7)     // Catch:{ Exception -> 0x0030 }
            r5.close()     // Catch:{ Exception -> 0x0030 }
            r6.close()     // Catch:{ Exception -> 0x0030 }
        L_0x007c:
            if (r2 == 0) goto L_0x00ae
            r2.close()     // Catch:{ IOException -> 0x0082 }
            goto L_0x00ae
        L_0x0082:
            r10 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r10)
            r2[r4] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r2)
            goto L_0x00ae
        L_0x008f:
            r10 = move-exception
            goto L_0x00af
        L_0x0091:
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x008f }
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r10)     // Catch:{ all -> 0x008f }
            r5[r4] = r10     // Catch:{ all -> 0x008f }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r5)     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x00ae
            r2.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00ae
        L_0x00a2:
            r10 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r10)
            r2[r4] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r2)
        L_0x00ae:
            return
        L_0x00af:
            if (r2 == 0) goto L_0x00c1
            r2.close()     // Catch:{ IOException -> 0x00b5 }
            goto L_0x00c1
        L_0x00b5:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2)
            r3[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r3)
        L_0x00c1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p645pj.C47505d.mo72513f(int):void");
    }

    /* renamed from: g */
    public final void mo72514g(int i, String str) {
        boolean z;
        C47506e eVar = new C47506e(i);
        Map<String, String> parseXml = XmlParser.parseXml(str, "ConfigList", (String) null);
        eVar.f127475b = parseXml;
        if (parseXml.containsKey(".ConfigList.$version")) {
            Util.getInt(eVar.f127475b.get(".ConfigList.$version"), 0);
        }
        int i2 = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(".ConfigList.Config");
            sb.append(i2 == 0 ? "" : Integer.valueOf(i2));
            String sb4 = sb.toString();
            Map<String, String> map = eVar.f127475b;
            if (map.get(sb4 + ".$name") == null) {
                this.f127471a.put(Integer.valueOf(i).intValue(), eVar);
                return;
            }
            Map<String, String> map2 = eVar.f127475b;
            String str2 = map2.get(sb4 + ".$name");
            if (!str2.equalsIgnoreCase("JDWebViewMenu")) {
                int i3 = 0;
                while (true) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(sb4);
                    sb5.append(".Item");
                    sb5.append(i3 == 0 ? "" : Integer.valueOf(i3));
                    String sb6 = sb5.toString();
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(sb4);
                    sb7.append(".Item");
                    sb7.append(i3 == 0 ? "" : Integer.valueOf(i3));
                    sb7.append(".$key");
                    String sb8 = sb7.toString();
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(sb4);
                    sb9.append(".Item");
                    sb9.append(i3 == 0 ? "" : Integer.valueOf(i3));
                    sb9.append(".$lang");
                    String sb10 = sb9.toString();
                    if (!eVar.f127475b.containsKey(sb6)) {
                        break;
                    }
                    String str3 = eVar.f127475b.get(sb8);
                    String str4 = eVar.f127475b.get(sb6);
                    String str5 = eVar.f127475b.get(sb10);
                    Log.m105918d("MicroMsg.ConfigListInfo", "itemKey " + str3 + " itemValue " + str4 + " itemLang " + str5);
                    if (str5 != null) {
                        try {
                            if (!Util.isNullOrNil(str5)) {
                                ArrayList arrayList = new ArrayList();
                                if (!Util.isNullOrNil(str5)) {
                                    String[] split = str5.split(",");
                                    if (split != null && split.length > 0) {
                                        for (int i4 = 0; i4 < split.length; i4++) {
                                            if (!Util.isNullOrNil(split[i4])) {
                                                arrayList.add(split[i4]);
                                            }
                                        }
                                    }
                                }
                                String applicationLanguage = LocaleUtil.getApplicationLanguage();
                                if (!Util.isNullOrNil(applicationLanguage)) {
                                    Log.m105918d("MicroMsg.ConfigListInfo", "locale is " + applicationLanguage);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        String str6 = (String) it.next();
                                        if (str6.trim().toLowerCase().equals("other") && !applicationLanguage.equals("zh_CN")) {
                                            Log.m105918d("MicroMsg.ConfigListInfo", "find other");
                                        } else if (str6.trim().toLowerCase().equals(applicationLanguage.trim().toLowerCase())) {
                                            Log.m105918d("MicroMsg.ConfigListInfo", "find ");
                                        }
                                        z = true;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.ConfigListInfo", "exception:%s", Util.stackTraceToString(e));
                            Log.m105918d("MicroMsg.ConfigListInfo", "isContainLocale failed " + e.getMessage());
                        }
                        z = false;
                        if (z) {
                            eVar.mo72516c(str2, str3, str4);
                        }
                    } else {
                        eVar.mo72516c(str2, str3, str4);
                    }
                    i3++;
                }
            }
            i2++;
        }
    }

    /* renamed from: h */
    public int mo72515h() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("VoiceVOIPSwitch");
        Log.m105918d("MicroMsg.ConfigListDecoder", "voip is " + c);
        int i = 0;
        try {
            i = Util.getInt(c, 0);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ConfigListDecoder", "exception:%s", Util.stackTraceToString(e));
        }
        Log.m105918d("MicroMsg.ConfigListDecoder", "showVoiceVoipEntrance is " + i);
        return i;
    }
}
