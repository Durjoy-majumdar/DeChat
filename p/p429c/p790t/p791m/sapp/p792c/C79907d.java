package p429c.p790t.p791m.sapp.p792c;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.t.m.sapp.c.d */
public class C79907d {

    /* renamed from: a */
    public static C79907d f234099a;

    /* renamed from: b */
    public Context f234100b;

    /* renamed from: c */
    public Map<String, FileChannel> f234101c = null;

    public C79907d(Context context) {
        this.f234100b = context;
        this.f234101c = new HashMap(5);
    }

    /* renamed from: a */
    public static synchronized C79907d m97052a(Context context) {
        C79907d dVar;
        synchronized (C79907d.class) {
            if (f234099a == null) {
                f234099a = new C79907d(context);
            }
            dVar = f234099a;
        }
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo110068b(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r6 == 0) goto L_0x0049
            java.lang.String r1 = r6.trim()     // Catch:{ all -> 0x0046 }
            int r1 = r1.length()     // Catch:{ all -> 0x0046 }
            if (r1 > 0) goto L_0x000f
            goto L_0x0049
        L_0x000f:
            java.io.File r1 = r5.mo110067a((java.lang.String) r6)     // Catch:{ all -> 0x0046 }
            r2 = 1
            if (r1 != 0) goto L_0x0018
            monitor-exit(r5)
            return r2
        L_0x0018:
            java.util.Map<java.lang.String, java.nio.channels.FileChannel> r3 = r5.f234101c     // Catch:{ all -> 0x0044 }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x0044 }
            java.nio.channels.FileChannel r3 = (java.nio.channels.FileChannel) r3     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x0028
            boolean r4 = r3.isOpen()     // Catch:{ all -> 0x0044 }
            if (r4 != 0) goto L_0x0036
        L_0x0028:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0044 }
            r3.<init>(r1)     // Catch:{ all -> 0x0044 }
            java.nio.channels.FileChannel r3 = r3.getChannel()     // Catch:{ all -> 0x0044 }
            java.util.Map<java.lang.String, java.nio.channels.FileChannel> r1 = r5.f234101c     // Catch:{ all -> 0x0044 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0044 }
        L_0x0036:
            java.nio.channels.FileLock r6 = r3.lock()     // Catch:{ all -> 0x0044 }
            if (r6 == 0) goto L_0x0044
            boolean r6 = r6.isValid()     // Catch:{ all -> 0x0044 }
            if (r6 == 0) goto L_0x0044
            monitor-exit(r5)
            return r2
        L_0x0044:
            monitor-exit(r5)
            return r0
        L_0x0046:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x0049:
            monitor-exit(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p429c.p790t.p791m.sapp.p792c.C79907d.mo110068b(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo110069c(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x0020
            java.lang.String r0 = r2.trim()     // Catch:{ all -> 0x001d }
            int r0 = r0.length()     // Catch:{ all -> 0x001d }
            if (r0 > 0) goto L_0x000e
            goto L_0x0020
        L_0x000e:
            java.util.Map<java.lang.String, java.nio.channels.FileChannel> r0 = r1.f234101c     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            java.nio.channels.FileChannel r2 = (java.nio.channels.FileChannel) r2     // Catch:{ all -> 0x001b }
            if (r2 == 0) goto L_0x001b
            r2.close()     // Catch:{ all -> 0x001b }
        L_0x001b:
            monitor-exit(r1)
            return
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0020:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p429c.p790t.p791m.sapp.p792c.C79907d.mo110069c(java.lang.String):void");
    }

    /* renamed from: a */
    public synchronized File mo110067a(String str) {
        File file;
        try {
            File filesDir = this.f234100b.getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append("TencentLocationCoverSDK_sapp_");
            sb.append(str);
            sb.append(".lock");
            file = new File(filesDir, sb.toString());
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException unused) {
            file = null;
        }
        return file;
    }
}
