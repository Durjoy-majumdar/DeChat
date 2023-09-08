package com.tencent.xweb.updater;

public class AssetsUpdateConfig extends EmbededUpdateConfig {
    public static final String TAG = "AssetsUpdateConfig";

    public AssetsUpdateConfig(int i) {
        super(i);
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean copyPackageToLocal(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "copyPackageToLocal, fileName:"
            r7.append(r0)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "AssetsUpdateConfig"
            com.tencent.xweb.util.XWebLog.m21911i(r0, r7)
            android.content.Context r7 = org.xwalk.core.XWalkEnvironment.getApplicationContext()
            android.content.res.AssetManager r7 = r7.getAssets()
            r1 = 0
            r2 = 0
            java.io.InputStream r6 = r7.open(r6)     // Catch:{ all -> 0x004d }
            java.lang.String r7 = r5.getDownloadPath()     // Catch:{ all -> 0x0049 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0049 }
            r3.<init>(r7)     // Catch:{ all -> 0x0049 }
            r7 = 524288(0x80000, float:7.34684E-40)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0047 }
        L_0x0031:
            int r2 = r6.read(r7)     // Catch:{ all -> 0x0047 }
            r4 = -1
            if (r2 == r4) goto L_0x003c
            r3.write(r7, r1, r2)     // Catch:{ all -> 0x0047 }
            goto L_0x0031
        L_0x003c:
            r3.flush()     // Catch:{ all -> 0x0047 }
            com.tencent.xweb.util.FileUtils.tryClose(r6)
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            r6 = 1
            return r6
        L_0x0047:
            r7 = move-exception
            goto L_0x004b
        L_0x0049:
            r7 = move-exception
            r3 = r2
        L_0x004b:
            r2 = r6
            goto L_0x004f
        L_0x004d:
            r7 = move-exception
            r3 = r2
        L_0x004f:
            java.lang.String r6 = "copyPackageToLocal error"
            com.tencent.xweb.util.XWebLog.m21910e(r0, r6, r7)     // Catch:{ all -> 0x005b }
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            return r1
        L_0x005b:
            r6 = move-exception
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.updater.AssetsUpdateConfig.copyPackageToLocal(java.lang.String, java.lang.String):boolean");
    }
}
