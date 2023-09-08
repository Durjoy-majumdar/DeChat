package xs3;

/* renamed from: xs3.e */
public class C118900e {
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0156 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01cb A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m167646a() {
        /*
            boolean r0 = ys3.C118995f.m167760a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "SetuidBitChecker : SELinux is enforcing"
            ft3.C116895f.m164890b(r0)
            goto L_0x00a2
        L_0x000f:
            boolean r0 = xs3.C118901f.m167648b()     // Catch:{ IOException -> 0x009e }
            if (r0 == 0) goto L_0x0017
            goto L_0x00a2
        L_0x0017:
            boolean r0 = ys3.C118991c.f356423c
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "SetuidBitChecker : OsUtil isn't available"
            ft3.C116895f.m164890b(r0)
            goto L_0x00a2
        L_0x0022:
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "/system/bin"
            r0.<init>(r3)
            java.io.File[] r0 = r0.listFiles()
            java.lang.String r3 = "SetuidBitChecker s-bit found : "
            if (r0 == 0) goto L_0x0064
            int r4 = r0.length
            r5 = 0
        L_0x0033:
            if (r5 >= r4) goto L_0x0064
            r6 = r0[r5]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "run-as"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0044
            goto L_0x0061
        L_0x0044:
            boolean r7 = xs3.C118901f.m167647a(r6)
            if (r7 == 0) goto L_0x0061
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = r6.getAbsolutePath()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            ft3.C116895f.m164890b(r0)
            goto L_0x0093
        L_0x0061:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x0064:
            java.io.File r0 = new java.io.File
            java.lang.String r4 = "/system/xbin"
            r0.<init>(r4)
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x0098
            int r4 = r0.length
            r5 = 0
        L_0x0073:
            if (r5 >= r4) goto L_0x0098
            r6 = r0[r5]
            boolean r7 = xs3.C118901f.m167647a(r6)
            if (r7 == 0) goto L_0x0095
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = r6.getAbsolutePath()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            ft3.C116895f.m164890b(r0)
        L_0x0093:
            r0 = 1
            goto L_0x00a3
        L_0x0095:
            int r5 = r5 + 1
            goto L_0x0073
        L_0x0098:
            java.lang.String r0 = "SetuidBitChecker s-bit not found"
            ft3.C116895f.m164890b(r0)
            goto L_0x00a2
        L_0x009e:
            r0 = move-exception
            ft3.C116895f.m164893e(r0)
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            r3 = 2
            if (r0 == 0) goto L_0x00a7
            return r3
        L_0x00a7:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "/proc"
            r4.<init>(r5)
            java.lang.String[] r4 = r4.list()
            if (r4 != 0) goto L_0x00ba
            goto L_0x00e4
        L_0x00ba:
            int r5 = r4.length
            r6 = 0
        L_0x00bc:
            if (r6 >= r5) goto L_0x00e4
            r7 = r4[r6]
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x00c7
            goto L_0x00e1
        L_0x00c7:
            char r8 = r7.charAt(r2)     // Catch:{ Exception -> 0x00e1 }
            r9 = 57
            if (r8 > r9) goto L_0x00e1
            r9 = 48
            if (r8 >= r9) goto L_0x00d4
            goto L_0x00e1
        L_0x00d4:
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x00e1 }
            ys3.d$a r7 = ys3.C118992d.m167757c(r7)     // Catch:{ Exception -> 0x00e1 }
            if (r7 == 0) goto L_0x00e1
            r0.add(r7)     // Catch:{ Exception -> 0x00e1 }
        L_0x00e1:
            int r6 = r6 + 1
            goto L_0x00bc
        L_0x00e4:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x00ec
            r4 = 1
            goto L_0x00ed
        L_0x00ec:
            r4 = 0
        L_0x00ed:
            if (r4 == 0) goto L_0x00f0
            goto L_0x0153
        L_0x00f0:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 3
            r4.<init>(r5)
            xs3.g r5 = new xs3.g
            r5.<init>()
            r4.add(r5)
            xs3.d r5 = new xs3.d
            r5.<init>()
            r4.add(r5)
            boolean r5 = ys3.C118995f.m167760a()
            if (r5 == 0) goto L_0x0114
            xs3.c r5 = new xs3.c
            r5.<init>()
            r4.add(r5)
        L_0x0114:
            java.util.Iterator r0 = r0.iterator()
        L_0x0118:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x013b
            java.lang.Object r5 = r0.next()
            ys3.d$a r5 = (ys3.C118992d.C118993a) r5
            if (r5 != 0) goto L_0x0127
            goto L_0x0118
        L_0x0127:
            java.util.Iterator r6 = r4.iterator()
        L_0x012b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0118
            java.lang.Object r7 = r6.next()
            xs3.b r7 = (xs3.C118897b) r7
            r7.mo183595a(r5)
            goto L_0x012b
        L_0x013b:
            java.util.Iterator r0 = r4.iterator()
        L_0x013f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0153
            java.lang.Object r4 = r0.next()
            xs3.b r4 = (xs3.C118897b) r4
            boolean r4 = r4.mo183596b()
            if (r4 == 0) goto L_0x013f
            r0 = 1
            goto L_0x0154
        L_0x0153:
            r0 = 0
        L_0x0154:
            if (r0 == 0) goto L_0x0157
            return r3
        L_0x0157:
            java.lang.String r0 = "PATH"
            java.lang.String r0 = java.lang.System.getenv(r0)     // Catch:{ all -> 0x01bf }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01bf }
            if (r3 == 0) goto L_0x0198
            java.lang.String r3 = ":"
            java.lang.String[] r0 = r0.split(r3)     // Catch:{ all -> 0x01bf }
            int r3 = r0.length     // Catch:{ all -> 0x01bf }
            r4 = 0
        L_0x016b:
            if (r4 >= r3) goto L_0x01c3
            r5 = r0[r4]     // Catch:{ all -> 0x01bf }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x01bf }
            java.lang.String r7 = "su"
            r6.<init>(r5, r7)     // Catch:{ all -> 0x01bf }
            boolean r5 = r6.exists()     // Catch:{ all -> 0x01bf }
            if (r5 == 0) goto L_0x0195
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bf }
            r0.<init>()     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = "SuFile found : "
            r0.append(r3)     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x01bf }
            r0.append(r3)     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01bf }
            ft3.C116895f.m164890b(r0)     // Catch:{ all -> 0x01bf }
            goto L_0x01bd
        L_0x0195:
            int r4 = r4 + 1
            goto L_0x016b
        L_0x0198:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = "/system/bin/su"
            r0.<init>(r3)     // Catch:{ all -> 0x01bf }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x01ab
            java.lang.String r0 = "SuFile found : /system/bin/su"
            ft3.C116895f.m164890b(r0)     // Catch:{ all -> 0x01bf }
            goto L_0x01bd
        L_0x01ab:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = "/system/xbin/su"
            r0.<init>(r3)     // Catch:{ all -> 0x01bf }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x01c3
            java.lang.String r0 = "SuFile found : /system/xbin/su"
            ft3.C116895f.m164890b(r0)     // Catch:{ all -> 0x01bf }
        L_0x01bd:
            r0 = 1
            goto L_0x01c9
        L_0x01bf:
            r0 = move-exception
            ft3.C116895f.m164893e(r0)
        L_0x01c3:
            java.lang.String r0 = "SuFile not found"
            ft3.C116895f.m164890b(r0)
            r0 = 0
        L_0x01c9:
            if (r0 == 0) goto L_0x01cc
            return r1
        L_0x01cc:
            java.lang.String r0 = "/system/bin/debuggerd"
            boolean r0 = xs3.C118896a.m167638a(r0)
            if (r0 != 0) goto L_0x01d5
            goto L_0x01f8
        L_0x01d5:
            java.lang.String r0 = "/system/bin/debuggerd64"
            boolean r0 = xs3.C118896a.m167638a(r0)
            if (r0 != 0) goto L_0x01de
            goto L_0x01f8
        L_0x01de:
            java.lang.String r0 = "/system/bin/ddexe"
            boolean r0 = xs3.C118896a.m167638a(r0)
            if (r0 != 0) goto L_0x01e7
            goto L_0x01f8
        L_0x01e7:
            java.lang.String r0 = "/system/etc/install-recovery.sh"
            boolean r0 = xs3.C118896a.m167639b(r0)
            if (r0 != 0) goto L_0x01f0
            goto L_0x01f8
        L_0x01f0:
            java.lang.String r0 = "/system/bin/install-recovery.sh"
            boolean r0 = xs3.C118896a.m167639b(r0)
            if (r0 != 0) goto L_0x01fa
        L_0x01f8:
            r0 = 1
            goto L_0x0200
        L_0x01fa:
            java.lang.String r0 = "BootScriptChecker : everything seems ok"
            ft3.C116895f.m164890b(r0)
            r0 = 0
        L_0x0200:
            if (r0 == 0) goto L_0x0203
            return r1
        L_0x0203:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xs3.C118900e.m167646a():int");
    }
}
