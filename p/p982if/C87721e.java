package p982if;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.io.File;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import p425ze.C91669a;
import p723vf.C118672d;
import p723vf.C90778c;
import p937cf.C80018a;
import p987jf.C87954a;

/* renamed from: if.e */
public class C87721e extends C87719c {

    /* renamed from: e */
    public volatile boolean f254000e = false;

    /* renamed from: f */
    public final Queue<C87724c> f254001f = new LinkedBlockingQueue();

    /* renamed from: g */
    public final Runnable f254002g = new C87722a();

    /* renamed from: h */
    public final BroadcastReceiver f254003h;

    /* renamed from: if.e$a */
    public class C87722a implements Runnable {
        public C87722a() {
        }

        public void run() {
            C118672d.m167355e("Matrix.LeakProcessor.LazyForkAnalyze", "analyze task start. background: " + C87721e.this.f254000e + ", queue empty: " + C87721e.this.f254001f.isEmpty(), new Object[0]);
            while (true) {
                if (!C87721e.this.f254000e) {
                    break;
                }
                C87724c cVar = (C87724c) ((LinkedBlockingQueue) C87721e.this.f254001f).poll();
                if (cVar == null) {
                    C118672d.m167355e("Matrix.LeakProcessor.LazyForkAnalyze", "task queue is cleared", new Object[0]);
                    break;
                }
                C87721e eVar = C87721e.this;
                eVar.getClass();
                C80018a.C80020b bVar = C80018a.C80020b.LAZY_FORK_ANALYZE;
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    C91669a a = eVar.mo122137a(cVar.f254006a, cVar.f254008c);
                    C118672d.m167353c("Matrix.LeakProcessor.LazyForkAnalyze", String.format("analyze cost=%sms refString=%s", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), cVar.f254008c}), new Object[0]);
                    if (a.f262647d) {
                        String aVar = a.toString();
                        eVar.mo122138c(0, bVar, cVar.f254007b, cVar.f254008c, aVar, String.valueOf(System.currentTimeMillis() - cVar.f254009d));
                        C118672d.m167353c("Matrix.LeakProcessor.LazyForkAnalyze", aVar, new Object[0]);
                    } else {
                        C118672d.m167352b("Matrix.LeakProcessor.LazyForkAnalyze", "leak not found", new Object[0]);
                    }
                    C118672d.m167353c("Matrix.LeakProcessor.LazyForkAnalyze", "analyze complete", new Object[0]);
                } catch (OutOfMemoryError e) {
                    eVar.mo122138c(3, bVar, cVar.f254007b, cVar.f254008c, "OutOfMemoryError", "0");
                    C118672d.m167354d("Matrix.LeakProcessor.LazyForkAnalyze", e.getCause(), "", new Object[0]);
                    C118672d.m167353c("Matrix.LeakProcessor.LazyForkAnalyze", "analyze complete", new Object[0]);
                } catch (Throwable th) {
                    C118672d.m167353c("Matrix.LeakProcessor.LazyForkAnalyze", "analyze complete", new Object[0]);
                    cVar.f254006a.delete();
                    throw th;
                }
                cVar.f254006a.delete();
            }
            C118672d.m167355e("Matrix.LeakProcessor.LazyForkAnalyze", "analyze task complete. background: " + C87721e.this.f254000e + ", queue empty: " + C87721e.this.f254001f.isEmpty(), new Object[0]);
        }
    }

    /* renamed from: if.e$b */
    public class C87723b extends BroadcastReceiver {
        public C87723b() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                C118672d.m167355e("Matrix.LeakProcessor.LazyForkAnalyze", "action screen off", new Object[0]);
                C87721e.this.f254000e = true;
                C90778c.m113843a().post(C87721e.this.f254002g);
            } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                C118672d.m167355e("Matrix.LeakProcessor.LazyForkAnalyze", "action screen on", new Object[0]);
                C87721e.this.f254000e = false;
                C90778c.m113843a().removeCallbacks(C87721e.this.f254002g);
            }
        }
    }

    /* renamed from: if.e$c */
    public static class C87724c {

        /* renamed from: a */
        public final File f254006a;

        /* renamed from: b */
        public final String f254007b;

        /* renamed from: c */
        public final String f254008c;

        /* renamed from: d */
        public final long f254009d;

        public C87724c(File file, String str, String str2, long j) {
            this.f254006a = file;
            this.f254007b = str;
            this.f254008c = str2;
            this.f254009d = j;
        }
    }

    public C87721e(C87954a aVar) {
        super(aVar);
        C87723b bVar = new C87723b();
        this.f254003h = bVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        aVar.f254526g.f261037e.registerReceiver(bVar, intentFilter);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e7 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo112104b(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo r17) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            cf.a$b r10 = p937cf.C80018a.C80020b.LAZY_FORK_ANALYZE
            cf.a$b r3 = p937cf.C80018a.C80020b.NO_DUMP
            java.lang.String r4 = r9.mActivityName
            java.lang.String r5 = r9.mKey
            r2 = 0
            java.lang.String r6 = "no dump"
            java.lang.String r7 = "0"
            r1 = r16
            r1.mo122138c(r2, r3, r4, r5, r6, r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r11 = "Matrix.LeakProcessor.LazyForkAnalyze"
            r12 = 0
            r1 = 31
            if (r0 <= r1) goto L_0x0045
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot fork-dump with unsupported API version "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r12]
            p723vf.C118672d.m167352b(r11, r0, r1)
            r2 = 4
            java.lang.String r4 = r9.mActivityName
            java.lang.String r5 = r9.mKey
            java.lang.String r6 = "Unsupported API"
            java.lang.String r7 = "0"
            r1 = r16
            r3 = r10
            r1.mo122138c(r2, r3, r4, r5, r6, r7)
            return r12
        L_0x0045:
            jf.a r0 = r8.f253997a
            r0.mo122416c()
            java.lang.String r4 = r9.mActivityName
            java.lang.String r5 = r9.mKey
            long r6 = java.lang.System.currentTimeMillis()
            r13 = 1
            df.e r0 = p955df.C86266e.f250872e     // Catch:{ FileNotFoundException -> 0x005c }
            java.lang.String r1 = "LFAP"
            java.io.File r0 = r0.mo120674b(r1, r13)     // Catch:{ FileNotFoundException -> 0x005c }
            goto L_0x0065
        L_0x005c:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r2 = ""
            p723vf.C118672d.m167354d(r11, r0, r2, r1)
            r0 = 0
        L_0x0065:
            r2 = r0
            if (r2 == 0) goto L_0x0084
            java.lang.String r0 = r2.getPath()
            r14 = 600(0x258, double:2.964E-321)
            boolean r0 = com.tencent.matrix.resource.MemoryUtil.m98119e(r0, r14)
            if (r0 != 0) goto L_0x0084
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r12] = r5
            java.lang.String r1 = "heap dump for further analyzing activity with key [%s] was failed, just ignore."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            p723vf.C118672d.m167352b(r11, r0, r1)
            goto L_0x00dc
        L_0x0084:
            if (r2 == 0) goto L_0x00ca
            long r0 = r2.length()
            r14 = 0
            int r3 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x0091
            goto L_0x00ca
        L_0x0091:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r6
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            r0[r12] = r1
            r0[r13] = r5
            r1 = 2
            java.lang.String r3 = r2.getPath()
            r0[r1] = r3
            java.lang.String r1 = "dump cost=%sms refString=%s path=%s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            p723vf.C118672d.m167353c(r11, r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r1 = "dump complete, push task into lazy analyze task queue"
            p723vf.C118672d.m167353c(r11, r1, r0)
            java.util.Queue<if.e$c> r0 = r8.f254001f
            if.e$c r10 = new if.e$c
            r1 = r10
            r3 = r4
            r4 = r5
            r5 = r6
            r1.<init>(r2, r3, r4, r5)
            r0.add(r10)
            r0 = 1
            goto L_0x00dd
        L_0x00ca:
            r2 = 2
            java.lang.String r6 = "FileNull"
            java.lang.String r7 = "0"
            r1 = r16
            r3 = r10
            r1.mo122138c(r2, r3, r4, r5, r6, r7)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r1 = "cannot create hprof file"
            p723vf.C118672d.m167352b(r11, r1, r0)
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            if (r0 == 0) goto L_0x00e7
            jf.a r0 = r8.f253997a
            java.lang.String r1 = r9.mActivityName
            r0.mo125242b(r1, r12)
            return r13
        L_0x00e7:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p982if.C87721e.mo112104b(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo):boolean");
    }
}
