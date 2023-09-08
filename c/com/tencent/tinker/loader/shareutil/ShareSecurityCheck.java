package com.tencent.tinker.loader.shareutil;

import android.content.Context;
import com.tencent.tinker.loader.TinkerRuntimeException;
import java.io.File;
import java.security.cert.Certificate;
import java.util.HashMap;

public class ShareSecurityCheck {
    private static final String TAG = "Tinker.SecurityCheck";
    private static String mPublicKeyMd5;
    private final Context mContext;
    private final HashMap<String, String> metaContentMap = new HashMap<>();
    private final HashMap<String, String> packageProperties = new HashMap<>();

    public ShareSecurityCheck(Context context) {
        this.mContext = context;
        if (mPublicKeyMd5 == null) {
            init(context);
        }
    }

    private boolean check(File file, Certificate[] certificateArr) {
        if (certificateArr.length > 0) {
            int length = certificateArr.length - 1;
            while (length >= 0) {
                try {
                    if (mPublicKeyMd5.equals(SharePatchFileUtil.getMD5(certificateArr[length].getEncoded()))) {
                        return true;
                    }
                    length--;
                } catch (Exception e) {
                    ShareTinkerLog.m106531e(TAG, file.getAbsolutePath(), e);
                }
            }
        }
        return false;
    }

    private void init(Context context) {
        try {
            String md5 = SharePatchFileUtil.getMD5(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            mPublicKeyMd5 = md5;
            if (md5 != null) {
                SharePatchFileUtil.closeQuietly((Object) null);
                return;
            }
            throw new TinkerRuntimeException("get public key md5 is null");
        } catch (Exception e) {
            throw new TinkerRuntimeException("ShareSecurityCheck init public key fail", e);
        } catch (Throwable th) {
            SharePatchFileUtil.closeQuietly((Object) null);
            throw th;
        }
    }

    public HashMap<String, String> getMetaContentMap() {
        return this.metaContentMap;
    }

    public HashMap<String, String> getPackagePropertiesIfPresent() {
        String[] split;
        if (!this.packageProperties.isEmpty()) {
            return this.packageProperties;
        }
        String str = this.metaContentMap.get(ShareConstants.PACKAGE_META_FILE);
        if (str == null) {
            return null;
        }
        for (String str2 : str.split("\n")) {
            if (str2 != null && str2.length() > 0 && !str2.startsWith("#") && (split = str2.split("=", 2)) != null && split.length >= 2) {
                this.packageProperties.put(split[0].trim(), split[1].trim());
            }
        }
        return this.packageProperties;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x009e A[SYNTHETIC, Splitter:B:43:0x009e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean verifyPatchMetaSignature(java.io.File r12) {
        /*
            r11 = this;
            java.lang.String r0 = "Tinker.SecurityCheck"
            boolean r1 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(r12)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            r1 = 0
            r3 = 1
            java.util.jar.JarFile r4 = new java.util.jar.JarFile     // Catch:{ Exception -> 0x0078, all -> 0x0073 }
            r4.<init>(r12)     // Catch:{ Exception -> 0x0078, all -> 0x0073 }
            java.util.Enumeration r1 = r4.entries()     // Catch:{ Exception -> 0x0071 }
        L_0x0015:
            boolean r5 = r1.hasMoreElements()     // Catch:{ Exception -> 0x0071 }
            if (r5 == 0) goto L_0x0060
            java.lang.Object r5 = r1.nextElement()     // Catch:{ Exception -> 0x0071 }
            java.util.jar.JarEntry r5 = (java.util.jar.JarEntry) r5     // Catch:{ Exception -> 0x0071 }
            if (r5 != 0) goto L_0x0024
            goto L_0x0015
        L_0x0024:
            java.lang.String r6 = r5.getName()     // Catch:{ Exception -> 0x0071 }
            java.lang.String r7 = "META-INF/"
            boolean r7 = r6.startsWith(r7)     // Catch:{ Exception -> 0x0071 }
            if (r7 == 0) goto L_0x0031
            goto L_0x0015
        L_0x0031:
            java.lang.String r7 = "meta.txt"
            boolean r7 = r6.endsWith(r7)     // Catch:{ Exception -> 0x0071 }
            if (r7 != 0) goto L_0x003a
            goto L_0x0015
        L_0x003a:
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r11.metaContentMap     // Catch:{ Exception -> 0x0071 }
            java.lang.String r8 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.loadDigestes(r4, r5)     // Catch:{ Exception -> 0x0071 }
            r7.put(r6, r8)     // Catch:{ Exception -> 0x0071 }
            java.security.cert.Certificate[] r5 = r5.getCertificates()     // Catch:{ Exception -> 0x0071 }
            if (r5 == 0) goto L_0x004f
            boolean r5 = r11.check(r12, r5)     // Catch:{ Exception -> 0x0071 }
            if (r5 != 0) goto L_0x0015
        L_0x004f:
            r4.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x005f
        L_0x0053:
            r1 = move-exception
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r12, r3)
        L_0x005f:
            return r2
        L_0x0060:
            r4.close()     // Catch:{ IOException -> 0x0064 }
            goto L_0x0070
        L_0x0064:
            r1 = move-exception
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r1
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r12, r4)
        L_0x0070:
            return r3
        L_0x0071:
            r1 = move-exception
            goto L_0x007c
        L_0x0073:
            r4 = move-exception
            r10 = r4
            r4 = r1
            r1 = r10
            goto L_0x009c
        L_0x0078:
            r4 = move-exception
            r10 = r4
            r4 = r1
            r1 = r10
        L_0x007c:
            com.tencent.tinker.loader.TinkerRuntimeException r5 = new com.tencent.tinker.loader.TinkerRuntimeException     // Catch:{ all -> 0x009b }
            java.lang.String r6 = "ShareSecurityCheck file %s, size %d verifyPatchMetaSignature fail"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x009b }
            java.lang.String r8 = r12.getAbsolutePath()     // Catch:{ all -> 0x009b }
            r7[r2] = r8     // Catch:{ all -> 0x009b }
            long r8 = r12.length()     // Catch:{ all -> 0x009b }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x009b }
            r7[r3] = r8     // Catch:{ all -> 0x009b }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x009b }
            r5.<init>(r6, r1)     // Catch:{ all -> 0x009b }
            throw r5     // Catch:{ all -> 0x009b }
        L_0x009b:
            r1 = move-exception
        L_0x009c:
            if (r4 == 0) goto L_0x00ae
            r4.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00ae
        L_0x00a2:
            r4 = move-exception
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r4
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r12, r3)
        L_0x00ae:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.ShareSecurityCheck.verifyPatchMetaSignature(java.io.File):boolean");
    }
}
