package y30;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import j30.C76385a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oa1.C117731d;
import v30.C90748b;

/* renamed from: y30.g */
public class C91374g {

    /* renamed from: a */
    public static boolean f262060a;

    /* renamed from: b */
    public static final String f262061b = (VFSStrategy.m163776d("PublicResource") + "/kara/model");

    /* renamed from: c */
    public static final String f262062c = (VFSStrategy.m163776d("PublicResource") + "/kara/fewshot/model");

    /* renamed from: a */
    public static C91370a m114627a(String str) {
        if (C76385a.m91810b()) {
            boolean z = true;
            if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_plugin_kara_can_use_fewshot_model", "1", false, true), 1) == 0) {
                z = false;
            }
            if (z && C86013q1.m106450k(C90748b.f260643b)) {
                Uri n = C116299g2.m163858n(f262062c + "/" + str + ".json");
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                    return new C91371b(str);
                }
            }
        }
        List<C91370a> b = m114628b(false);
        if (b == null) {
            return null;
        }
        Iterator it = ((ArrayList) b).iterator();
        while (it.hasNext()) {
            C91370a aVar = (C91370a) it.next();
            if (aVar.f262055c.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ea  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<y30.C91370a> m114628b(boolean r14) {
        /*
            java.lang.String r0 = "Kara.ModelManager"
            oa1.d r1 = oa1.C117731d.m166007c()
            java.lang.String r2 = "clicfg_plugin_kara_model_center_work"
            java.lang.String r3 = "1"
            r4 = 0
            r5 = 1
            java.lang.String r1 = r1.mo182444f(r2, r3, r4, r5)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r5)
            if (r1 != 0) goto L_0x0018
            r1 = 1
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 == 0) goto L_0x001d
            r14 = 0
            return r14
        L_0x001d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            oa1.d r2 = oa1.C117731d.m166007c()
            java.lang.String r6 = "clicfg_plugin_kara_model_download_url"
            java.lang.String r7 = "{\"url\":[]}"
            java.lang.String r2 = r2.mo182444f(r6, r7, r5, r5)
            oa1.d r6 = oa1.C117731d.m166007c()
            java.lang.String r7 = "clicfg_plugin_kara_model_download_md5"
            java.lang.String r8 = "{\"md5\":[]}"
            java.lang.String r6 = r6.mo182444f(r7, r8, r5, r5)
            oa1.d r7 = oa1.C117731d.m166007c()
            java.lang.String r8 = "clicfg_plugin_kara_model_download_minversion"
            java.lang.String r9 = "{\"minVersion\":[]}"
            java.lang.String r7 = r7.mo182444f(r8, r9, r5, r5)
            oa1.d r8 = oa1.C117731d.m166007c()
            java.lang.String r9 = "clicfg_plugin_kara_model_download_module"
            java.lang.String r10 = "{\"moduleName\":[]}"
            java.lang.String r8 = r8.mo182444f(r9, r10, r5, r5)
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00db }
            r9.<init>(r2)     // Catch:{ JSONException -> 0x00db }
            java.lang.String r2 = "url"
            org.json.JSONArray r2 = r9.getJSONArray(r2)     // Catch:{ JSONException -> 0x00db }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00db }
            r9.<init>(r6)     // Catch:{ JSONException -> 0x00db }
            java.lang.String r6 = "md5"
            org.json.JSONArray r6 = r9.getJSONArray(r6)     // Catch:{ JSONException -> 0x00db }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00db }
            r9.<init>(r7)     // Catch:{ JSONException -> 0x00db }
            java.lang.String r7 = "minVersion"
            org.json.JSONArray r7 = r9.getJSONArray(r7)     // Catch:{ JSONException -> 0x00db }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00db }
            r9.<init>(r8)     // Catch:{ JSONException -> 0x00db }
            java.lang.String r8 = "moduleName"
            org.json.JSONArray r8 = r9.getJSONArray(r8)     // Catch:{ JSONException -> 0x00db }
            int r9 = r2.length()     // Catch:{ JSONException -> 0x00db }
            int r10 = r6.length()     // Catch:{ JSONException -> 0x00db }
            if (r9 != r10) goto L_0x00d4
            int r10 = r7.length()     // Catch:{ JSONException -> 0x00db }
            if (r9 != r10) goto L_0x00d4
            int r10 = r8.length()     // Catch:{ JSONException -> 0x00db }
            if (r9 == r10) goto L_0x009a
            goto L_0x00d4
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 >= r9) goto L_0x00e8
            y30.a r11 = new y30.a     // Catch:{ JSONException -> 0x00db }
            r11.<init>()     // Catch:{ JSONException -> 0x00db }
            java.lang.String r12 = r8.getString(r10)     // Catch:{ JSONException -> 0x00db }
            r11.f262055c = r12     // Catch:{ JSONException -> 0x00db }
            java.lang.String r12 = r2.getString(r10)     // Catch:{ JSONException -> 0x00db }
            r11.f262053a = r12     // Catch:{ JSONException -> 0x00db }
            java.lang.String r12 = r6.getString(r10)     // Catch:{ JSONException -> 0x00db }
            r11.f262054b = r12     // Catch:{ JSONException -> 0x00db }
            java.lang.String r12 = r7.getString(r10)     // Catch:{ JSONException -> 0x00db }
            r11.f262056d = r12     // Catch:{ JSONException -> 0x00db }
            r1.add(r11)     // Catch:{ JSONException -> 0x00db }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00db }
            r12.<init>()     // Catch:{ JSONException -> 0x00db }
            java.lang.String r13 = "add model:"
            r12.append(r13)     // Catch:{ JSONException -> 0x00db }
            r12.append(r11)     // Catch:{ JSONException -> 0x00db }
            java.lang.String r11 = r12.toString()     // Catch:{ JSONException -> 0x00db }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)     // Catch:{ JSONException -> 0x00db }
            int r10 = r10 + 1
            goto L_0x009b
        L_0x00d4:
            java.lang.String r2 = "size check error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ JSONException -> 0x00db }
            goto L_0x00e8
        L_0x00db:
            r2 = move-exception
            java.lang.String r6 = "json parse error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r7, r6)
        L_0x00e8:
            if (r14 != 0) goto L_0x0160
            oa1.d r14 = oa1.C117731d.m166007c()
            java.lang.String r0 = "clicfg_plugin_kara_model_use_local_model"
            java.lang.String r14 = r14.mo182444f(r0, r3, r4, r5)
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r5)
            if (r14 != 0) goto L_0x00fc
            r14 = 0
            goto L_0x00fd
        L_0x00fc:
            r14 = 1
        L_0x00fd:
            if (r14 == 0) goto L_0x0160
            com.tencent.mm.vfs.m1 r14 = new com.tencent.mm.vfs.m1
            java.lang.String r0 = f262061b
            r14.<init>((java.lang.String) r0)
            com.tencent.mm.vfs.m1[] r14 = r14.mo119984u()
            if (r14 == 0) goto L_0x0160
            int r0 = r14.length
            r2 = 0
        L_0x010e:
            if (r2 >= r0) goto L_0x0160
            r3 = r14[r2]
            java.lang.String r3 = r3.getName()
            java.lang.String r6 = ".zst"
            boolean r6 = r3.endsWith(r6)
            if (r6 == 0) goto L_0x011f
            goto L_0x015d
        L_0x011f:
            java.util.Iterator r6 = r1.iterator()
        L_0x0123:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x013b
            java.lang.Object r7 = r6.next()
            y30.a r7 = (y30.C91370a) r7
            java.lang.String r7 = r7.mo125341a()
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x0123
            r6 = 1
            goto L_0x013c
        L_0x013b:
            r6 = 0
        L_0x013c:
            if (r6 != 0) goto L_0x015d
            java.lang.String r6 = "_"
            java.lang.String[] r3 = r3.split(r6)
            int r6 = r3.length
            r7 = 3
            if (r6 < r7) goto L_0x015d
            y30.a r6 = new y30.a
            r6.<init>()
            r7 = r3[r4]
            r6.f262055c = r7
            r7 = r3[r5]
            r6.f262056d = r7
            r7 = 2
            r3 = r3[r7]
            r6.f262054b = r3
            r1.add(r6)
        L_0x015d:
            int r2 = r2 + 1
            goto L_0x010e
        L_0x0160:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y30.C91374g.m114628b(boolean):java.util.List");
    }
}
