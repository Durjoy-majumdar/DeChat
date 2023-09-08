package p413ok;

import android.content.Context;
import gy3.C87412m;
import java.io.File;

/* renamed from: ok.b */
public final class C77013b {

    /* renamed from: a */
    public static final C77013b f225000a = new C77013b();

    /* JADX WARNING: Removed duplicated region for block: B:38:0x008a A[SYNTHETIC, Splitter:B:38:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0094 A[SYNTHETIC, Splitter:B:44:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099 A[Catch:{ Exception -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107337a(android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108595h(r10, r0)
            java.lang.String r0 = "srcFileName"
            gy3.C87412m.m108595h(r11, r0)
            java.lang.String r0 = "dstFileName"
            gy3.C87412m.m108595h(r12, r0)
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r11
            r3 = 1
            r1[r3] = r12
            java.lang.String r4 = "DynamicBgAssetsManager"
            java.lang.String r5 = "alvinluo copyFileFromAssets src: %s, dst: %s"
            p413ok.C77014c.m92922b(r4, r5, r1)
            r1 = 0
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            r5.<init>(r12)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            boolean r12 = r5.exists()     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            if (r12 != 0) goto L_0x002f
            r5.createNewFile()     // Catch:{ Exception -> 0x007f, all -> 0x007c }
        L_0x002f:
            android.content.res.AssetManager r10 = r10.getAssets()     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            java.io.InputStream r10 = r10.open(r11)     // Catch:{ Exception -> 0x007f, all -> 0x007c }
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0077, all -> 0x0072 }
            r12.<init>(r5)     // Catch:{ Exception -> 0x0077, all -> 0x0072 }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x0070, all -> 0x006e }
        L_0x0040:
            if (r10 == 0) goto L_0x006a
            int r7 = r10.read(r6)     // Catch:{ Exception -> 0x0070, all -> 0x006e }
            r8 = -1
            if (r7 != r8) goto L_0x0066
            r12.flush()     // Catch:{ Exception -> 0x0070, all -> 0x006e }
            java.lang.String r1 = "alvinluo copyFileFromAssets %s successfully, file len: %d"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0070, all -> 0x006e }
            r0[r2] = r11     // Catch:{ Exception -> 0x0070, all -> 0x006e }
            long r5 = r5.length()     // Catch:{ Exception -> 0x0070, all -> 0x006e }
            java.lang.Long r11 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0070, all -> 0x006e }
            r0[r3] = r11     // Catch:{ Exception -> 0x0070, all -> 0x006e }
            p413ok.C77014c.m92922b(r4, r1, r0)     // Catch:{ Exception -> 0x0070, all -> 0x006e }
            r10.close()     // Catch:{ Exception -> 0x0090 }
        L_0x0062:
            r12.close()     // Catch:{ Exception -> 0x0090 }
            goto L_0x0090
        L_0x0066:
            r12.write(r6, r2, r7)     // Catch:{ Exception -> 0x0070, all -> 0x006e }
            goto L_0x0040
        L_0x006a:
            gy3.C87412m.m108601n()     // Catch:{ Exception -> 0x0070, all -> 0x006e }
            throw r1     // Catch:{ Exception -> 0x0070, all -> 0x006e }
        L_0x006e:
            r11 = move-exception
            goto L_0x0074
        L_0x0070:
            r11 = move-exception
            goto L_0x0079
        L_0x0072:
            r11 = move-exception
            r12 = r1
        L_0x0074:
            r1 = r10
            r10 = r11
            goto L_0x0092
        L_0x0077:
            r11 = move-exception
            r12 = r1
        L_0x0079:
            r1 = r10
            r10 = r11
            goto L_0x0081
        L_0x007c:
            r10 = move-exception
            r12 = r1
            goto L_0x0092
        L_0x007f:
            r10 = move-exception
            r12 = r1
        L_0x0081:
            java.lang.String r11 = "alvinluo copyFileFromAssets exception"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0091 }
            p413ok.C77014c.m92923c(r4, r10, r11, r0)     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x008d
            r1.close()     // Catch:{ Exception -> 0x0090 }
        L_0x008d:
            if (r12 == 0) goto L_0x0090
            goto L_0x0062
        L_0x0090:
            return
        L_0x0091:
            r10 = move-exception
        L_0x0092:
            if (r1 == 0) goto L_0x0097
            r1.close()     // Catch:{ Exception -> 0x009c }
        L_0x0097:
            if (r12 == 0) goto L_0x009c
            r12.close()     // Catch:{ Exception -> 0x009c }
        L_0x009c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p413ok.C77013b.mo107337a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final String mo107338b(Context context) {
        C87412m.m108595h(context, "context");
        StringBuilder sb = new StringBuilder();
        File filesDir = context.getFilesDir();
        C87412m.m108590c(filesDir, "context.filesDir");
        sb.append(filesDir.getParent());
        sb.append(File.separator);
        sb.append("appbrand/glsl/");
        return sb.toString();
    }
}
