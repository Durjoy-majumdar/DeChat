package ha0;

import com.tencent.maas.MJNativeLoader;

/* renamed from: ha0.a0 */
public final class C87461a0 implements MJNativeLoader {

    /* renamed from: a */
    public static final C87461a0 f253440a = new C87461a0();

    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0179 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loadLibrary(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.Class<ul.a> r0 = p1049ul.C90687a.class
            java.lang.String r1 = "MaasSDK"
            boolean r1 = gy3.C87412m.m108589b(r12, r1)
            if (r1 != 0) goto L_0x019e
            java.util.Set<java.lang.String> r1 = p1049ul.C90687a.f260503a
            r0.getClassLoader()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.Map<java.lang.String, java.lang.ClassLoader> r1 = p1049ul.C90687a.f260505c
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r12)
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0073
            if (r1 == r0) goto L_0x01ab
            java.lang.UnsatisfiedLinkError r4 = new java.lang.UnsatisfiedLinkError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Library "
            r5.append(r6)
            r5.append(r12)
            java.lang.String r6 = "to be loaded by classloader: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = " has already loaded by classloader: "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            r4.<init>(r0)
            java.util.List<ul.a$b> r0 = p1049ul.C90687a.f260504b
            monitor-enter(r0)
            r1 = r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0070 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0070 }
        L_0x0054:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0070 }
            if (r5 == 0) goto L_0x006a
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0070 }
            ul.a$b r5 = (p1049ul.C90687a.C90689b) r5     // Catch:{ all -> 0x0070 }
            boolean r5 = r5.mo124824a(r12, r4)     // Catch:{ all -> 0x0070 }
            if (r5 == 0) goto L_0x0054
            if (r2 != 0) goto L_0x0054
            r2 = 1
            goto L_0x0054
        L_0x006a:
            if (r2 == 0) goto L_0x006f
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            goto L_0x01ab
        L_0x006f:
            throw r4     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            throw r12
        L_0x0073:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "lib"
            r1.append(r4)
            r1.append(r12)
            java.lang.String r4 = ".so"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.util.Set<java.lang.String> r4 = p1049ul.C90687a.f260503a
            monitor-enter(r4)
            r5 = r4
            java.util.TreeSet r5 = (java.util.TreeSet) r5     // Catch:{ all -> 0x019b }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x019b }
        L_0x0093:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x019b }
            r7 = 0
            if (r6 == 0) goto L_0x00b7
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x019b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x019b }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x019b }
            r8.<init>(r6, r1)     // Catch:{ all -> 0x019b }
            boolean r6 = r8.isDirectory()     // Catch:{ all -> 0x019b }
            if (r6 != 0) goto L_0x0093
            boolean r6 = r8.canRead()     // Catch:{ all -> 0x019b }
            if (r6 == 0) goto L_0x0093
            java.lang.String r1 = r8.getAbsolutePath()     // Catch:{ all -> 0x019b }
            monitor-exit(r4)     // Catch:{ all -> 0x019b }
            goto L_0x00b9
        L_0x00b7:
            monitor-exit(r4)     // Catch:{ all -> 0x019b }
            r1 = r7
        L_0x00b9:
            r4 = 2
            if (r1 == 0) goto L_0x00f3
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()     // Catch:{ UnsatisfiedLinkError -> 0x00d5 }
            r5.load(r1)     // Catch:{ UnsatisfiedLinkError -> 0x00d5 }
            java.lang.String r5 = "MicroMsg.LoadLibrary"
            java.lang.String r6 = "[+] Library [%s] was loaded, path: %s"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ UnsatisfiedLinkError -> 0x00d5 }
            r7[r2] = r12     // Catch:{ UnsatisfiedLinkError -> 0x00d5 }
            r7[r3] = r1     // Catch:{ UnsatisfiedLinkError -> 0x00d5 }
            p1049ul.C90687a.m113698b(r4, r5, r6, r7)     // Catch:{ UnsatisfiedLinkError -> 0x00d5 }
            p1049ul.C90687a.m113697a(r12, r1, r0)     // Catch:{ UnsatisfiedLinkError -> 0x00d5 }
            goto L_0x0190
        L_0x00d5:
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch:{ all -> 0x00da }
        L_0x00da:
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            r5.load(r1)
            java.lang.String r5 = "MicroMsg.LoadLibrary"
            java.lang.String r6 = "[+] [RE] Library [%s] was loaded, path: %s"
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r2] = r12
            r7[r3] = r1
            p1049ul.C90687a.m113698b(r4, r5, r6, r7)
            p1049ul.C90687a.m113697a(r12, r1, r0)
            goto L_0x0190
        L_0x00f3:
            java.lang.String r1 = "MicroMsg.LoadLibrary"
            java.lang.String r5 = "[+] Try to load library [%s] with cl: %s"
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r2] = r12
            r6[r3] = r0
            p1049ul.C90687a.m113698b(r4, r1, r5, r6)
            java.lang.reflect.Method[] r1 = p1049ul.C90687a.f260507e
            monitor-enter(r1)
            r5 = r1[r2]     // Catch:{ all -> 0x0127 }
            if (r5 != 0) goto L_0x011a
            java.lang.Class<java.lang.ClassLoader> r5 = java.lang.ClassLoader.class
            java.lang.String r6 = "findLibrary"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ all -> 0x0127 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r2] = r9     // Catch:{ all -> 0x0127 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r8)     // Catch:{ all -> 0x0127 }
            r5.setAccessible(r3)     // Catch:{ all -> 0x0127 }
            r1[r2] = r5     // Catch:{ all -> 0x0127 }
        L_0x011a:
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0127 }
            r6[r2] = r12     // Catch:{ all -> 0x0127 }
            java.lang.Object r5 = r5.invoke(r0, r6)     // Catch:{ all -> 0x0127 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0127 }
            monitor-exit(r1)     // Catch:{ all -> 0x0198 }
            r7 = r5
            goto L_0x015a
        L_0x0127:
            java.lang.String r5 = "MicroMsg.LoadLibrary"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0198 }
            r6.<init>()     // Catch:{ all -> 0x0198 }
            java.lang.String r8 = "[-] Fail to find library in classloader: "
            r6.append(r8)     // Catch:{ all -> 0x0198 }
            r6.append(r0)     // Catch:{ all -> 0x0198 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0198 }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0198 }
            java.lang.ThreadLocal<java.lang.Boolean> r9 = p1049ul.C90687a.f260509g     // Catch:{ all -> 0x0198 }
            java.lang.Object r10 = r9.get()     // Catch:{ all -> 0x0198 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0198 }
            if (r10 == 0) goto L_0x014c
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0198 }
            if (r10 != 0) goto L_0x0159
        L_0x014c:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0198 }
            r9.set(r10)     // Catch:{ all -> 0x0198 }
            p1005ma.C88718b.m110680b(r5, r6, r8)     // Catch:{ all -> 0x0198 }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0198 }
            r9.set(r5)     // Catch:{ all -> 0x0198 }
        L_0x0159:
            monitor-exit(r1)     // Catch:{ all -> 0x0198 }
        L_0x015a:
            if (r7 == 0) goto L_0x0190
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            r1.load(r7)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            java.lang.String r1 = "MicroMsg.LoadLibrary"
            java.lang.String r5 = "[+] Library [%s] was loaded, path: %s"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            r6[r2] = r12     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            r6[r3] = r7     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            p1049ul.C90687a.m113698b(r4, r1, r5, r6)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            p1049ul.C90687a.m113697a(r12, r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0174 }
            goto L_0x0190
        L_0x0174:
            r5 = 5
            java.lang.Thread.sleep(r5)     // Catch:{ all -> 0x0179 }
        L_0x0179:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ UnsatisfiedLinkError -> 0x0190 }
            r1.load(r7)     // Catch:{ UnsatisfiedLinkError -> 0x0190 }
            java.lang.String r1 = "MicroMsg.LoadLibrary"
            java.lang.String r5 = "[+] [RE] Library [%s] was loaded, path: %s"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ UnsatisfiedLinkError -> 0x0190 }
            r6[r2] = r12     // Catch:{ UnsatisfiedLinkError -> 0x0190 }
            r6[r3] = r7     // Catch:{ UnsatisfiedLinkError -> 0x0190 }
            p1049ul.C90687a.m113698b(r4, r1, r5, r6)     // Catch:{ UnsatisfiedLinkError -> 0x0190 }
            p1049ul.C90687a.m113697a(r12, r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0190 }
        L_0x0190:
            java.util.Map<java.lang.String, java.lang.ClassLoader> r1 = p1049ul.C90687a.f260505c
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.put(r12, r0)
            goto L_0x01ab
        L_0x0198:
            r12 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0198 }
            throw r12
        L_0x019b:
            r12 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x019b }
            throw r12
        L_0x019e:
            ka0.g r12 = ka0.C33848g.f91487a
            java.util.concurrent.locks.ReentrantLock r0 = ka0.C33848g.f91490d
            r0.lock()
            r12.mo59326f()     // Catch:{ all -> 0x01ac }
            r0.unlock()
        L_0x01ab:
            return
        L_0x01ac:
            r12 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = ka0.C33848g.f91490d
            r0.unlock()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C87461a0.loadLibrary(java.lang.String):void");
    }
}
