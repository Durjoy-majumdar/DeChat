package fo2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import dl0.C86342c;
import go2.C116981b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import vr2.C37817q;

/* renamed from: fo2.a */
public class C116889a {
    /* renamed from: a */
    public static String m164871a(byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("findVersionFromData", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        String str = "";
        if (bArr == null) {
            SnsMethodCalculate.markEndTimeMs("findVersionFromData", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
            return str;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            } else if (i2 > 50000) {
                Log.m105920e("AdDeviceInfo.ua.ChromeInfoUtils", "findVersionFromData strCount > 20000");
                break;
            } else {
                if (bArr[i] == 0) {
                    int i4 = i - i3;
                    if (i4 < 8 || i4 > 20) {
                        i3 = i + 1;
                    } else {
                        try {
                            byte[] bArr2 = new byte[i4];
                            System.arraycopy(bArr, i3, bArr2, 0, i4);
                            i3 = i + 1;
                            int i5 = i4 - 1;
                            if ((bArr2[0] & ExifInterface.MARKER) == i5) {
                                byte[] bArr3 = new byte[i5];
                                System.arraycopy(bArr2, 1, bArr3, 0, i5);
                                bArr2 = bArr3;
                            }
                            if (C116981b.m165051a(bArr2)) {
                                String str2 = new String(bArr2, "UTF-8");
                                try {
                                    Log.m105918d("AdDeviceInfo.ua.ChromeInfoUtils", str2 + ", strcount:" + i2);
                                    str = str2;
                                    break;
                                } catch (Throwable th) {
                                    String str3 = str2;
                                    th = th;
                                    str = str3;
                                }
                            } else {
                                i2++;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            Log.m105920e("AdDeviceInfo.ua.ChromeInfoUtils", "findVersionFromData got Exception:" + th.toString());
                            i++;
                        }
                    }
                }
                i++;
            }
        }
        SnsMethodCalculate.markEndTimeMs("findVersionFromData", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        return str;
    }

    /* renamed from: b */
    public static String m164872b(Context context, boolean z) {
        int i;
        int i2;
        boolean z2 = z;
        SnsMethodCalculate.markStartTimeMs("getChromeInfoVersion", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        try {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1893, 1);
            if (!z2) {
                nVar.mo175911u(1893, 4);
            }
            Log.m105924i("AdDeviceInfo.ua.ChromeInfoUtils", "getChromeInfoVersion, visitDexOrODex = " + z2);
            long currentTimeMillis = System.currentTimeMillis();
            String c = m164873c();
            Log.m105924i("AdDeviceInfo.ua.ChromeInfoUtils", "getPackageInfo, package name: " + c);
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(c, C86342c.CTRL_INDEX);
            String str = packageInfo.versionName;
            Log.m105924i("AdDeviceInfo.ua.ChromeInfoUtils", "getPackageInfo, ver: " + str);
            if (c.equals("com.google.android.webview")) {
                Log.m105924i("AdDeviceInfo.ua.ChromeInfoUtils", "getPackageInfo, chrome ver: " + str + "web cost:" + (System.currentTimeMillis() - currentTimeMillis));
                SnsMethodCalculate.markEndTimeMs("getChromeInfoVersion", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                return str;
            } else if (!c.equals("com.android.webview") || TextUtils.isEmpty(str) || (!str.contains("-arm64") && packageInfo.versionName.indexOf(".") >= 0)) {
                if (c.equals("com.android.webview")) {
                    String str2 = packageInfo.versionName;
                    SnsMethodCalculate.markStartTimeMs("checkStr", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
                    boolean a = C116981b.m165051a(str2.getBytes());
                    SnsMethodCalculate.markEndTimeMs("checkStr", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
                    if (a) {
                        Log.m105924i("AdDeviceInfo.ua.ChromeInfoUtils", "16TH chrom ver: " + packageInfo.versionName);
                        String str3 = packageInfo.versionName;
                        SnsMethodCalculate.markEndTimeMs("getChromeInfoVersion", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                        return str3;
                    }
                }
                nVar.mo175911u(1893, 3);
                if (!z2) {
                    Log.m105928w("AdDeviceInfo.ua.ChromeInfoUtils", "!visitDexOrODex, return unknow");
                    C37817q.m41545a("webview_ua_info", "chrome_ver_err", 0, 1, "");
                    nVar.mo175911u(1893, 2);
                    SnsMethodCalculate.markEndTimeMs("getChromeInfoVersion", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                    return "unknow";
                }
                if (packageInfo.applicationInfo != null) {
                    Log.m105924i("AdDeviceInfo.ua.ChromeInfoUtils", "sourceDire: " + packageInfo.applicationInfo.sourceDir);
                    String str4 = packageInfo.applicationInfo.sourceDir;
                    if (!TextUtils.isEmpty(str4)) {
                        ByteBuffer d = m164874d(str4);
                        if (d != null) {
                            Log.m105924i("AdDeviceInfo.ua.ChromeInfoUtils", "readDexFile cost:" + (System.currentTimeMillis() - currentTimeMillis));
                            String b = new C116981b(d).mo180953b();
                            Log.m105924i("AdDeviceInfo.ua.ChromeInfoUtils", "web ver:" + b + ", DexParser cost:" + (System.currentTimeMillis() - currentTimeMillis));
                            SnsMethodCalculate.markEndTimeMs("getChromeInfoVersion", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                            return b;
                        }
                        String a2 = m164871a(m164875e(str4));
                        Log.m105924i("AdDeviceInfo.ua.ChromeInfoUtils", "odex web ver:" + a2 + " web cost:" + (System.currentTimeMillis() - currentTimeMillis));
                        SnsMethodCalculate.markEndTimeMs("getChromeInfoVersion", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                        return a2;
                    }
                    Log.m105920e("AdDeviceInfo.ua.ChromeInfoUtils", "apkPath is empty ");
                    i2 = 0;
                    i = 2;
                } else {
                    Log.m105920e("AdDeviceInfo.ua.ChromeInfoUtils", "applicationInfo is null ");
                    i2 = 0;
                    i = 3;
                }
                C37817q.m41545a("webview_ua_info", "chrome_ver_err", i2, i, "");
                C115669n.INSTANCE.mo175911u(1893, 2);
                Log.m105928w("AdDeviceInfo.ua.ChromeInfoUtils", "finally, return unknow");
                SnsMethodCalculate.markEndTimeMs("getChromeInfoVersion", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                return "unknow";
            } else {
                String str5 = str.substring(0, 2) + ".0.0.0";
                Log.m105924i("AdDeviceInfo.ua.ChromeInfoUtils", "getPackageInfo, chrom ver: " + str5);
                SnsMethodCalculate.markEndTimeMs("getChromeInfoVersion", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                return str5;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.m105920e("AdDeviceInfo.ua.ChromeInfoUtils", "get webview application info failed! " + e.toString());
            i2 = 0;
            i = 4;
        } catch (Throwable th) {
            i = 6;
            Log.m105920e("AdDeviceInfo.ua.ChromeInfoUtils", "WebViewFactory failed!" + th.toString());
        }
        i2 = 0;
        C37817q.m41545a("webview_ua_info", "chrome_ver_err", i2, i, "");
        C115669n.INSTANCE.mo175911u(1893, 2);
        Log.m105928w("AdDeviceInfo.ua.ChromeInfoUtils", "finally, return unknow");
        SnsMethodCalculate.markEndTimeMs("getChromeInfoVersion", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        return "unknow";
    }

    /* renamed from: c */
    public static String m164873c() {
        SnsMethodCalculate.markStartTimeMs("getWebViewPackageName", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        String str = "com.google.android.webview";
        switch (Build.VERSION.SDK_INT) {
            case 21:
            case 22:
            case 23:
                SnsMethodCalculate.markStartTimeMs("getWebViewPackageName4Lollipop", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                try {
                    Log.m105918d("AdDeviceInfo.ua.ChromeInfoUtils", "getWebViewPackageName4Lollipop ");
                    String str2 = (String) C32142b.m39633a("android.webkit.WebViewFactory", "getWebViewPackageName", (Class<?>[]) null, new Object[0]);
                    SnsMethodCalculate.markEndTimeMs("getWebViewPackageName4Lollipop", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                    str = str2;
                } catch (Throwable th) {
                    Log.m105920e("AdDeviceInfo.ua.ChromeInfoUtils", "getWebViewPackageName4Lollipop failed!" + th.toString());
                    SnsMethodCalculate.markEndTimeMs("getWebViewPackageName4Lollipop", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                }
                SnsMethodCalculate.markEndTimeMs("getWebViewPackageName", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                return str;
            default:
                SnsMethodCalculate.markStartTimeMs("getWebViewPackageName4More", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                try {
                    Log.m105918d("AdDeviceInfo.ua.ChromeInfoUtils", "getWebViewPackageName4More ");
                    str = ((Context) C32142b.m39633a("android.webkit.WebViewFactory", "getWebViewContextAndSetProvider", (Class<?>[]) null, new Object[0])).getApplicationInfo().packageName;
                    SnsMethodCalculate.markEndTimeMs("getWebViewPackageName4More", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                } catch (Throwable th4) {
                    Log.m105920e("AdDeviceInfo.ua.ChromeInfoUtils", "getWebViewPackageName4More failed!" + th4.toString());
                    SnsMethodCalculate.markEndTimeMs("getWebViewPackageName4More", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                }
                SnsMethodCalculate.markEndTimeMs("getWebViewPackageName", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                return str;
        }
    }

    /* renamed from: d */
    public static ByteBuffer m164874d(String str) {
        SnsMethodCalculate.markStartTimeMs("readDexFile", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
        Log.m105918d("AdDeviceInfo.ua.ChromeInfoUtils", "apkpath: " + str);
        ByteBuffer byteBuffer = null;
        try {
            ZipFile zipFile = new ZipFile(str);
            ZipEntry entry = zipFile.getEntry("classes.dex");
            if (entry == null) {
                Log.m105918d("AdDeviceInfo.ua.ChromeInfoUtils", "zip not found classes.dex ");
            }
            Log.m105918d("AdDeviceInfo.ua.ChromeInfoUtils", "zip entry: " + entry.toString());
            InputStream inputStream = zipFile.getInputStream(entry);
            int available = inputStream.available();
            if (available > 10485760) {
                inputStream.close();
                zipFile.close();
                SnsMethodCalculate.markEndTimeMs("readDexFile", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
                return null;
            }
            byteBuffer = ByteBuffer.allocate(available);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteBuffer.put(bArr, 0, read);
            }
            inputStream.close();
            zipFile.close();
            SnsMethodCalculate.markEndTimeMs("readDexFile", "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils");
            return byteBuffer;
        } catch (Throwable th) {
            Log.m105920e("AdDeviceInfo.ua.ChromeInfoUtils", "readDexFile got Throwable:" + th.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e0 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m164875e(java.lang.String r16) {
        /*
            java.lang.String r1 = "read "
            java.lang.String r2 = "AdDeviceInfo.ua.ChromeInfoUtils"
            java.lang.String r3 = "readDexFromOdex"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.device.utils.ua.ChromeInfoUtils"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.io.File r0 = new java.io.File
            r5 = r16
            r0.<init>(r5)
            java.lang.String r0 = r0.getParent()
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r0 = "/oat/arm"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r5.<init>(r0)
            java.io.File[] r5 = r5.listFiles()
            int r6 = r5.length
            r7 = 0
            r8 = 0
        L_0x0035:
            if (r8 >= r6) goto L_0x01a2
            r0 = r5[r8]
            boolean r10 = r0.isFile()
            if (r10 == 0) goto L_0x019e
            java.lang.String r10 = r0.getName()
            java.lang.String r11 = ".odex"
            boolean r10 = r10.endsWith(r11)
            if (r10 == 0) goto L_0x019e
            java.lang.String r10 = r0.getAbsolutePath()
            java.lang.String r11 = "readFile"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r4)
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x00a7 }
            r0.<init>(r10)     // Catch:{ all -> 0x00a7 }
            int r12 = r0.available()     // Catch:{ all -> 0x00a7 }
            r13 = 10485760(0xa00000, float:1.469368E-38)
            if (r12 <= r13) goto L_0x0069
            r0.close()     // Catch:{ all -> 0x00a7 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
            goto L_0x00c4
        L_0x0069:
            int r12 = r0.available()     // Catch:{ all -> 0x00a7 }
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r12)     // Catch:{ all -> 0x00a7 }
            r13 = 4096(0x1000, float:5.74E-42)
            byte[] r13 = new byte[r13]     // Catch:{ all -> 0x00a7 }
            r14 = 0
        L_0x0076:
            int r15 = r0.read(r13)     // Catch:{ all -> 0x00a7 }
            r9 = -1
            if (r15 == r9) goto L_0x0082
            r12.put(r13, r7, r15)     // Catch:{ all -> 0x00a7 }
            int r14 = r14 + r15
            goto L_0x0076
        L_0x0082:
            r0.close()     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r0.<init>()     // Catch:{ all -> 0x00a7 }
            r0.append(r1)     // Catch:{ all -> 0x00a7 }
            r0.append(r10)     // Catch:{ all -> 0x00a7 }
            java.lang.String r9 = " ret:"
            r0.append(r9)     // Catch:{ all -> 0x00a7 }
            r0.append(r14)     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)     // Catch:{ all -> 0x00a7 }
            byte[] r9 = r12.array()     // Catch:{ all -> 0x00a7 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
            goto L_0x00c5
        L_0x00a7:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "readFile got Exception:"
            r9.append(r12)
            java.lang.String r0 = r0.toString()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
        L_0x00c4:
            r9 = 0
        L_0x00c5:
            if (r9 != 0) goto L_0x00e0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r10)
            java.lang.String r9 = " failed!"
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            goto L_0x019e
        L_0x00e0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "find odex file:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", odexData-len:"
            r0.append(r1)
            int r1 = r9.length
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            java.lang.String r0 = "parse"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            ho2.a r5 = new ho2.a
            r5.<init>(r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            java.lang.String r0 = "getHeader"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            ho2.d r5 = r5.f350881d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            ho2.a$a r5 = (ho2.C117101a.C117102a) r5
            r5.getClass()
            java.lang.String r0 = "getRodata"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            byte[] r6 = new byte[r7]
            r8 = 1
            r9 = 1
        L_0x0129:
            java.lang.String r10 = "getNumberOfSectionHeaders"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r1)
            short r11 = r5.f350885c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r1)
            if (r9 >= r11) goto L_0x0181
            java.lang.String r10 = "getSectionHeader"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r1)
            ho2.g[] r11 = r5.f350887e
            r11 = r11[r9]
            r11.getClass()
            java.lang.String r12 = "getValue"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.MemoizedObject"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            boolean r14 = r11.f350903a
            if (r14 != 0) goto L_0x0154
            java.lang.Object r14 = r11.mo181050a()
            r11.f350904b = r14
            r11.f350903a = r8
        L_0x0154:
            java.lang.Object r11 = r11.f350904b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            ho2.e r11 = (ho2.C117110e) r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r1)
            java.lang.String r10 = r11.getName()
            java.lang.String r12 = ".rodata"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x017e
            int r6 = r11.getOffset()
            int r10 = r11.getSize()
            byte[] r11 = new byte[r10]
            ho2.a r12 = ho2.C117101a.this
            byte[] r12 = ho2.C117101a.m165130a(r12)
            java.lang.System.arraycopy(r12, r6, r11, r7, r10)
            r6 = r11
        L_0x017e:
            int r9 = r9 + 1
            goto L_0x0129
        L_0x0181:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "rodata-len "
            r0.append(r1)
            int r1 = r6.length
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r6
        L_0x019e:
            int r8 = r8 + 1
            goto L_0x0035
        L_0x01a2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fo2.C116889a.m164875e(java.lang.String):byte[]");
    }
}
