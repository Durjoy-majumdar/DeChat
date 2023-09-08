package com.tencent.p014mm.plugin.performance.watchdogs;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p723vf.C118672d;
import p723vf.C90779e;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.n */
public class C85342n {

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.n$a */
    public class C85343a implements Comparator<C85345c> {
        public int compare(Object obj, Object obj2) {
            return Long.compare((long) ((C85345c) obj2).mo118631a(), (long) ((C85345c) obj).mo118631a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.n$b */
    public class C85344b implements Comparator<C85345c> {
        public int compare(Object obj, Object obj2) {
            return Long.compare((long) ((C85345c) obj2).mo118631a(), (long) ((C85345c) obj).mo118631a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.n$c */
    public static class C85345c {

        /* renamed from: a */
        public String f248693a;

        /* renamed from: b */
        public List<C85346d> f248694b = new LinkedList();

        public C85345c(String str) {
            this.f248693a = str;
        }

        /* renamed from: a */
        public int mo118631a() {
            return ((LinkedList) this.f248694b).size();
        }

        /* renamed from: b */
        public boolean mo118632b() {
            if (((LinkedList) this.f248694b).size() > 0) {
                return ((C85346d) ((LinkedList) this.f248694b).get(0)).f248697c;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C85346d) {
                return this.f248693a.equals(((C85346d) obj).f248695a);
            }
            return false;
        }

        public int hashCode() {
            return this.f248693a.hashCode();
        }

        public String toString() {
            return this.f248693a + "=" + mo118631a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.n$d */
    public static class C85346d {

        /* renamed from: a */
        public String f248695a;

        /* renamed from: b */
        public long f248696b;

        /* renamed from: c */
        public boolean f248697c;

        /* renamed from: d */
        public String f248698d;

        public boolean equals(Object obj) {
            return (obj instanceof C85346d) && this.f248696b == ((C85346d) obj).f248696b;
        }

        public int hashCode() {
            return (int) this.f248696b;
        }

        public String toString() {
            return String.format("name=%s tid=%s state=%s isHandlerThread=%s", new Object[]{this.f248695a, Long.valueOf(this.f248696b), this.f248698d, Boolean.valueOf(this.f248697c)});
        }
    }

    /* renamed from: a */
    public static int m105363a() {
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup == null) {
            return -1;
        }
        return threadGroup.enumerate(new Thread[(threadGroup.activeCount() * 2)]);
    }

    /* renamed from: b */
    public static Collection<C85345c> m105364b() {
        HashMap hashMap = new HashMap();
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup == null) {
            Log.m105920e("MicroMsg.ThreadInfoReader", "getJavaThreads failed");
            return hashMap.values();
        }
        Thread[] threadArr = new Thread[(threadGroup.activeCount() * 2)];
        int enumerate = threadGroup.enumerate(threadArr);
        for (int i = 0; i < enumerate; i++) {
            Thread thread = threadArr[i];
            String name = thread.getName();
            if (!Util.isNullOrNil(name)) {
                String replaceAll = name.replaceAll("[0-9]\\d*", "?");
                if (replaceAll.contains("Binder:")) {
                    replaceAll = "Binder:?_?";
                }
                C85346d dVar = new C85346d();
                dVar.f248695a = replaceAll;
                dVar.f248696b = thread.getId();
                C85345c cVar = (C85345c) hashMap.get(replaceAll);
                if (cVar == null) {
                    cVar = new C85345c(replaceAll);
                    hashMap.put(replaceAll, cVar);
                }
                ((LinkedList) cVar.f248694b).add(dVar);
            }
        }
        LinkedList linkedList = new LinkedList(hashMap.values());
        Collections.sort(linkedList, new C85343a());
        return linkedList;
    }

    /* renamed from: c */
    public static int m105365c() {
        try {
            String[] split = m105367e(String.format("/proc/%s/status", new Object[]{Integer.valueOf(Process.myPid())})).trim().split("\n");
            for (String str : split) {
                if (str.startsWith("Threads")) {
                    Matcher matcher = Pattern.compile("\\d+").matcher(str);
                    if (matcher.find()) {
                        return Util.safeParseInt(matcher.group());
                    }
                }
            }
            Log.m105929w("MicroMsg.ThreadInfoReader", "[getProcessThreadCount] Wrong!", split[24]);
            return Util.safeParseInt(split[24].trim());
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: d */
    public static List<C85345c> m105366d() {
        HashMap hashMap = new HashMap();
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        char c = 2;
        if (threadGroup == null) {
            Log.m105920e("MicroMsg.ThreadInfoReader", "getJavaThreads failed");
        } else {
            Thread[] threadArr = new Thread[(threadGroup.activeCount() * 2)];
            int enumerate = threadGroup.enumerate(threadArr);
            for (int i = 0; i < enumerate; i++) {
                Thread thread = threadArr[i];
                if (thread instanceof HandlerThread) {
                    C85346d dVar = new C85346d();
                    dVar.f248695a = thread.getName();
                    long threadId = (long) ((HandlerThread) thread).getThreadId();
                    dVar.f248696b = threadId;
                    hashMap.put(Long.valueOf(threadId), dVar);
                    dVar.f248697c = true;
                }
            }
        }
        LinkedList<C85346d> linkedList = new LinkedList<>();
        String format = String.format("/proc/%s/task/", new Object[]{Integer.valueOf(Process.myPid())});
        File file = new File(format);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                File file2 = listFiles[i2];
                try {
                    String e = m105367e(format + file2.getName() + "/stat");
                    if (e != null) {
                        String[] split = e.replaceAll("\n", "").split(" ");
                        C85346d dVar2 = new C85346d();
                        dVar2.f248696b = Long.parseLong(split[0]);
                        dVar2.f248695a = split[1].replace("(", "").replace(")", "");
                        dVar2.f248698d = split[c].replace("'", "");
                        linkedList.add(dVar2);
                        C85346d dVar3 = (C85346d) hashMap.get(Long.valueOf(dVar2.f248696b));
                        if (dVar3 != null) {
                            dVar2.f248695a = dVar3.f248695a.replaceAll("-?[0-9]\\d*", "?") + "J";
                            dVar2.f248697c = dVar3.f248697c;
                        } else {
                            dVar2.f248695a = dVar2.f248695a.replaceAll("-?[0-9]\\d*", "?");
                        }
                    }
                } catch (Exception e2) {
                    C118672d.m167352b("MicroMsg.ThreadInfoReader", C90779e.m113849d(e2), new Object[0]);
                }
                i2++;
                c = 2;
            }
        }
        HashMap hashMap2 = new HashMap();
        for (C85346d dVar4 : linkedList) {
            C85345c cVar = (C85345c) hashMap2.get(dVar4.f248695a);
            if (cVar == null) {
                cVar = new C85345c(dVar4.f248695a);
                hashMap2.put(dVar4.f248695a, cVar);
            }
            ((LinkedList) cVar.f248694b).add(dVar4);
        }
        LinkedList linkedList2 = new LinkedList(hashMap2.values());
        Collections.sort(linkedList2, new C85344b());
        return linkedList2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[SYNTHETIC, Splitter:B:26:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m105367e(java.lang.String r5) {
        /*
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)
            java.lang.String r0 = r5.getPath()
            if (r0 == 0) goto L_0x0025
            r1 = 0
            java.lang.String r0 = com.tencent.p014mm.vfs.C116299g2.m163855k(r0, r1, r1)
            java.lang.String r1 = r5.getPath()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0025
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r0)
            android.net.Uri r5 = r5.build()
        L_0x0025:
            r0 = 0
            com.tencent.mm.vfs.f0 r1 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x0068 }
            com.tencent.mm.vfs.f0$h r1 = r1.mo177799l(r5, r0)     // Catch:{ all -> 0x0068 }
            java.io.InputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106421C(r5, r1)     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r1.<init>()     // Catch:{ all -> 0x005b }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0061 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0061 }
            r3.<init>(r5)     // Catch:{ all -> 0x0061 }
            r2.<init>(r3)     // Catch:{ all -> 0x0061 }
        L_0x003f:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x004e
            r1.append(r0)     // Catch:{ all -> 0x005d }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x005d }
            goto L_0x003f
        L_0x004e:
            r2.close()     // Catch:{ all -> 0x005b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005b }
            if (r5 == 0) goto L_0x005a
            r5.close()
        L_0x005a:
            return r0
        L_0x005b:
            r0 = move-exception
            goto L_0x006c
        L_0x005d:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L_0x0062
        L_0x0061:
            r1 = move-exception
        L_0x0062:
            if (r0 == 0) goto L_0x0067
            r0.close()     // Catch:{ all -> 0x005b }
        L_0x0067:
            throw r1     // Catch:{ all -> 0x005b }
        L_0x0068:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L_0x006c:
            if (r5 == 0) goto L_0x0071
            r5.close()
        L_0x0071:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.performance.watchdogs.C85342n.m105367e(java.lang.String):java.lang.String");
    }
}
