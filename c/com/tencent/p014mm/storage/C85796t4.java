package com.tencent.p014mm.storage;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.storage.t4 */
public class C85796t4 extends MStorage {

    /* renamed from: d */
    public C85801v1 f249878d;

    public C85796t4(C85801v1 v1Var) {
        this.f249878d = v1Var;
    }

    /* renamed from: bD */
    public static boolean m105982bD(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        try {
            if (XmlParser.parseXml(str, "deviceinfoconfig", (String) null) == null || !C86709a0.m107522a()) {
                return false;
            }
            C86709a0.m107528h();
            C86709a0.m107535s().mo121144k().mo119657Ow(str);
            return true;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ServerConfigInfoStorage", "exception:%s", Util.stackTraceToString(e));
            return false;
        }
    }

    /* renamed from: jo */
    public static String m105983jo() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<deviceinfo>");
        stringBuffer.append("<MANUFACTURER name=\"");
        stringBuffer.append(Build.MANUFACTURER);
        stringBuffer.append("\">");
        stringBuffer.append("<MODEL name=\"");
        stringBuffer.append(C87203t.m108275k());
        stringBuffer.append("\">");
        stringBuffer.append("<VERSION_RELEASE name=\"");
        stringBuffer.append(Build.VERSION.RELEASE);
        stringBuffer.append("\">");
        stringBuffer.append("<VERSION_INCREMENTAL name=\"");
        stringBuffer.append(Build.VERSION.INCREMENTAL);
        stringBuffer.append("\">");
        stringBuffer.append("<DISPLAY name=\"");
        stringBuffer.append(Build.DISPLAY);
        stringBuffer.append("\">");
        stringBuffer.append("</DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>");
        Log.m105918d("MicroMsg.ServerConfigInfoStorage", "getFingerprint  " + stringBuffer.toString());
        return stringBuffer.toString();
    }

    /* renamed from: qq */
    public static String m105984qq() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = Build.FINGERPRINT;
        if (str != null) {
            str = str.replace("/", XVFSFile.PATH_SEPARATOR);
        }
        linkedHashMap.put(FingerprintManagerProxy.FINGERPRINT_SERVICE, str);
        linkedHashMap.put("manufacturer", Build.MANUFACTURER);
        linkedHashMap.put(TPReportKeys.Common.COMMON_DEVICE_NAME, Build.DEVICE);
        linkedHashMap.put("model", C87203t.m108275k());
        linkedHashMap.put("product", Build.PRODUCT);
        linkedHashMap.put("board", Build.BOARD);
        linkedHashMap.put("release", Build.VERSION.RELEASE);
        linkedHashMap.put("codename", Build.VERSION.CODENAME);
        linkedHashMap.put("incremental", Build.VERSION.INCREMENTAL);
        linkedHashMap.put("display", Build.DISPLAY);
        String mapToXml = Util.mapToXml("key", linkedHashMap);
        Log.m105918d("MicroMsg.ServerConfigInfoStorage", "getLocalFingerprint  " + mapToXml);
        return mapToXml;
    }

    /* renamed from: Lo */
    public String mo119656Lo(int i) {
        String str = (String) this.f249878d.mo119684e(i, (Object) null);
        Log.m105918d("MicroMsg.ServerConfigInfoStorage", "getInfoByKey xml " + str + " key " + i);
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca A[SYNTHETIC, Splitter:B:30:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1 A[SYNTHETIC, Splitter:B:38:0x00e1] */
    /* renamed from: Ow */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo119657Ow(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r12
            java.lang.String r3 = "MicroMsg.ServerConfigInfoStorage"
            java.lang.String r4 = "dkconf info:[%s] "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r1)
            com.tencent.mm.storage.v1 r1 = r11.f249878d
            r4 = 77825(0x13001, float:1.09056E-40)
            r1.mo119676J(r4, r12)
            java.lang.String r1 = "deviceconfig.cfg"
            java.lang.String r4 = "exception:%s"
            java.lang.String r5 = com.tencent.p014mm.storage.C72994y1.f212832a
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)
            java.lang.String r6 = r5.getPath()
            if (r6 == 0) goto L_0x003f
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r2, r2)
            java.lang.String r7 = r5.getPath()
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x003f
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r6)
            android.net.Uri r5 = r5.build()
        L_0x003f:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r7 = 0
            com.tencent.mm.vfs.f0$h r8 = r6.mo177799l(r5, r7)
            boolean r9 = r8.mo177810a()
            if (r9 != 0) goto L_0x004e
            r9 = 0
            goto L_0x0056
        L_0x004e:
            com.tencent.mm.vfs.FileSystem$c r9 = r8.f348991a
            java.lang.String r10 = r8.f348992b
            boolean r9 = r9.mo119948x(r10)
        L_0x0056:
            if (r9 != 0) goto L_0x006a
            com.tencent.mm.vfs.f0$h r5 = r6.mo177799l(r5, r8)
            boolean r6 = r5.mo177810a()
            if (r6 != 0) goto L_0x0063
            goto L_0x006a
        L_0x0063:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            r6.mo119937g(r5)
        L_0x006a:
            java.lang.String r5 = "writeConfigToLocalFile, path: %s, info:%s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00bc }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bc }
            r8.<init>()     // Catch:{ Exception -> 0x00bc }
            java.lang.String r9 = com.tencent.p014mm.storage.C72994y1.f212832a     // Catch:{ Exception -> 0x00bc }
            r8.append(r9)     // Catch:{ Exception -> 0x00bc }
            r8.append(r1)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00bc }
            r6[r2] = r8     // Catch:{ Exception -> 0x00bc }
            r6[r0] = r12     // Catch:{ Exception -> 0x00bc }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r6)     // Catch:{ Exception -> 0x00bc }
            com.tencent.mm.vfs.u1 r5 = new com.tencent.mm.vfs.u1     // Catch:{ Exception -> 0x00bc }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bc }
            r6.<init>()     // Catch:{ Exception -> 0x00bc }
            java.lang.String r8 = com.tencent.p014mm.storage.C72994y1.f212832a     // Catch:{ Exception -> 0x00bc }
            r6.append(r8)     // Catch:{ Exception -> 0x00bc }
            r6.append(r1)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x00bc }
            r5.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x00bc }
            r5.write(r12)     // Catch:{ Exception -> 0x00b5, all -> 0x00b8 }
            r5.close()     // Catch:{ Exception -> 0x00b5, all -> 0x00b8 }
            r5.close()     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00da
        L_0x00a8:
            r1 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
            r0[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r0)
            goto L_0x00da
        L_0x00b5:
            r1 = move-exception
            r7 = r5
            goto L_0x00bd
        L_0x00b8:
            r12 = move-exception
            goto L_0x00df
        L_0x00ba:
            r12 = move-exception
            goto L_0x00de
        L_0x00bc:
            r1 = move-exception
        L_0x00bd:
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)     // Catch:{ all -> 0x00ba }
            r5[r2] = r1     // Catch:{ all -> 0x00ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r5)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x00da
            r7.close()     // Catch:{ Exception -> 0x00ce }
            goto L_0x00da
        L_0x00ce:
            r1 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
            r0[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r0)
        L_0x00da:
            super.doNotify(r12)
            return r2
        L_0x00de:
            r5 = r7
        L_0x00df:
            if (r5 == 0) goto L_0x00f1
            r5.close()     // Catch:{ Exception -> 0x00e5 }
            goto L_0x00f1
        L_0x00e5:
            r1 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
            r0[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r0)
        L_0x00f1:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C85796t4.mo119657Ow(java.lang.String):int");
    }

    /* renamed from: Yt */
    public void mo119658Yt() {
        int i;
        String str = (String) this.f249878d.mo119684e(77825, (Object) null);
        Log.m105924i("MicroMsg.ServerConfigInfoStorage", "hy: readConfig xml " + str);
        if (!Util.isNullOrNil(str)) {
            super.doNotify(str);
        }
        if (!(!Util.isNullOrNil(str))) {
            String str2 = C72994y1.f212832a + "deviceconfig.cfg";
            i = -1;
            if (C86013q1.m106450k(str2)) {
                byte[] O = C86013q1.m106433O(str2, 0, -1);
                if (Util.isNullOrNil(O)) {
                    i = -2;
                } else {
                    String str3 = new String(O, Charset.defaultCharset());
                    if (Util.isNullOrNil(str3)) {
                        i = -3;
                    } else {
                        Log.m105925i("MicroMsg.ServerConfigInfoStorage", "hy: read from file: %s", str3);
                        mo119657Ow(str3);
                    }
                }
            }
            Log.m105925i("MicroMsg.ServerConfigInfoStorage", "hy: read from local retcode: %d", Integer.valueOf(i));
        }
        Log.m105924i("MicroMsg.ServerConfigInfoStorage", "hy: got conf from db");
        i = 0;
        Log.m105925i("MicroMsg.ServerConfigInfoStorage", "hy: read from local retcode: %d", Integer.valueOf(i));
    }
}
