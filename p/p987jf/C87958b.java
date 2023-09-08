package p987jf;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: jf.b */
public class C87958b {

    /* renamed from: a */
    public final Handler f254541a;

    /* renamed from: b */
    public final Handler f254542b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public long f254543c;

    /* renamed from: jf.b$a */
    public class C87959a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87960b f254544d;

        /* renamed from: e */
        public final /* synthetic */ int f254545e;

        public C87959a(C87960b bVar, int i) {
            this.f254544d = bVar;
            this.f254545e = i;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                jf.b$b r0 = r11.f254544d
                jf.a$b r0 = (p987jf.C87954a.C87957b) r0
                jf.a r1 = p987jf.C87954a.this
                java.util.concurrent.ConcurrentLinkedQueue<com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo> r1 = r1.f254532m
                boolean r1 = r1.isEmpty()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x003f
                java.lang.String r1 = "Matrix.ActivityRefWatcher"
                java.lang.String r4 = "DestroyedActivityInfo is empty! wait..."
                java.lang.Object[] r5 = new java.lang.Object[r2]
                p723vf.C118672d.m167353c(r1, r4, r5)
                jf.a r1 = p987jf.C87954a.this
                java.util.concurrent.ConcurrentLinkedQueue<com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo> r1 = r1.f254532m
                monitor-enter(r1)
            L_0x001e:
                jf.a r4 = p987jf.C87954a.this     // Catch:{ all -> 0x0030 }
                java.util.concurrent.ConcurrentLinkedQueue<com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo> r4 = r4.f254532m     // Catch:{ all -> 0x0030 }
                boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0030 }
                if (r4 == 0) goto L_0x0030
                jf.a r4 = p987jf.C87954a.this     // Catch:{ all -> 0x0030 }
                java.util.concurrent.ConcurrentLinkedQueue<com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo> r4 = r4.f254532m     // Catch:{ all -> 0x0030 }
                r4.wait()     // Catch:{ all -> 0x0030 }
                goto L_0x001e
            L_0x0030:
                monitor-exit(r1)     // Catch:{ all -> 0x003c }
                java.lang.String r0 = "Matrix.ActivityRefWatcher"
                java.lang.String r1 = "DestroyedActivityInfo is NOT empty! resume check"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                p723vf.C118672d.m167353c(r0, r1, r2)
                goto L_0x0129
            L_0x003c:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x003c }
                throw r0
            L_0x003f:
                boolean r1 = android.os.Debug.isDebuggerConnected()
                if (r1 == 0) goto L_0x0059
                jf.a r0 = p987jf.C87954a.this
                com.tencent.matrix.resource.h r0 = r0.f254526g
                cf.a r0 = r0.f235548h
                r0.getClass()
                java.lang.String r0 = "Matrix.ActivityRefWatcher"
                java.lang.String r1 = "debugger is connected, to avoid fake result, detection was delayed."
                java.lang.Object[] r2 = new java.lang.Object[r2]
                p723vf.C118672d.m167356f(r0, r1, r2)
                goto L_0x0129
            L_0x0059:
                jf.a r1 = p987jf.C87954a.this
                r1.mo122416c()
                jf.a r1 = p987jf.C87954a.this
                java.util.concurrent.ConcurrentLinkedQueue<com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo> r1 = r1.f254532m
                java.util.Iterator r1 = r1.iterator()
            L_0x0066:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x0129
                java.lang.Object r4 = r1.next()
                com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo r4 = (com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo) r4
                jf.a r5 = p987jf.C87954a.this
                cf.a$b r6 = r5.f254534o
                cf.a$b r7 = p937cf.C80018a.C80020b.NO_DUMP
                if (r6 == r7) goto L_0x007e
                cf.a$b r7 = p937cf.C80018a.C80020b.AUTO_DUMP
                if (r6 != r7) goto L_0x00a0
            L_0x007e:
                com.tencent.matrix.resource.h r5 = r5.f254526g
                cf.a r5 = r5.f235548h
                r5.getClass()
                jf.a r5 = p987jf.C87954a.this
                java.lang.String r6 = r4.mActivityName
                boolean r5 = r5.mo125241a(r6)
                if (r5 == 0) goto L_0x00a0
                java.lang.String r5 = "Matrix.ActivityRefWatcher"
                java.lang.String r6 = "activity with key [%s] was already published."
                java.lang.Object[] r7 = new java.lang.Object[r3]
                java.lang.String r4 = r4.mActivityName
                r7[r2] = r4
                p723vf.C118672d.m167355e(r5, r6, r7)
                r1.remove()
                goto L_0x0066
            L_0x00a0:
                jf.a r5 = p987jf.C87954a.this
                r5.mo122416c()
                java.lang.ref.WeakReference<android.app.Activity> r5 = r4.mActivityRef
                java.lang.Object r5 = r5.get()
                if (r5 != 0) goto L_0x00be
                java.lang.String r5 = "Matrix.ActivityRefWatcher"
                java.lang.String r6 = "activity with key [%s] was already recycled."
                java.lang.Object[] r7 = new java.lang.Object[r3]
                java.lang.String r4 = r4.mKey
                r7[r2] = r4
                p723vf.C118672d.m167355e(r5, r6, r7)
                r1.remove()
                goto L_0x0066
            L_0x00be:
                int r5 = r4.mDetectedCount
                int r5 = r5 + r3
                r4.mDetectedCount = r5
                jf.a r6 = p987jf.C87954a.this
                int r7 = r6.f254528i
                r8 = 2
                if (r5 >= r7) goto L_0x00ed
                com.tencent.matrix.resource.h r5 = r6.f254526g
                cf.a r5 = r5.f235548h
                r5.getClass()
                java.lang.String r5 = "Matrix.ActivityRefWatcher"
                java.lang.String r6 = "activity with key [%s] should be recycled but actually still exists in %s times, wait for next detection to confirm."
                java.lang.Object[] r7 = new java.lang.Object[r8]
                java.lang.String r8 = r4.mKey
                r7[r2] = r8
                int r4 = r4.mDetectedCount
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r7[r3] = r4
                p723vf.C118672d.m167353c(r5, r6, r7)
                jf.a r4 = p987jf.C87954a.this
                r4.mo122416c()
                goto L_0x0066
            L_0x00ed:
                java.lang.String r5 = "Matrix.ActivityRefWatcher"
                java.lang.String r7 = "activity with key [%s] was suspected to be a leaked instance. mode[%s]"
                java.lang.Object[] r9 = new java.lang.Object[r8]
                java.lang.String r10 = r4.mKey
                r9[r2] = r10
                cf.a$b r6 = r6.f254534o
                r9[r3] = r6
                p723vf.C118672d.m167353c(r5, r7, r9)
                jf.a r5 = p987jf.C87954a.this
                if.c r5 = r5.f254533n
                if (r5 == 0) goto L_0x0121
                boolean r5 = r5.mo112104b(r4)
                if (r5 == 0) goto L_0x0066
                java.lang.String r5 = "Matrix.ActivityRefWatcher"
                java.lang.String r6 = "the leaked activity [%s] with key [%s] has been processed. stop polling"
                java.lang.Object[] r7 = new java.lang.Object[r8]
                java.lang.String r8 = r4.mActivityName
                r7[r2] = r8
                java.lang.String r4 = r4.mKey
                r7[r3] = r4
                p723vf.C118672d.m167353c(r5, r6, r7)
                r1.remove()
                goto L_0x0066
            L_0x0121:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "LeakProcessor not found!!!"
                r0.<init>(r1)
                throw r0
            L_0x0129:
                jf.b r0 = p987jf.C87958b.this
                jf.b$b r1 = r11.f254544d
                int r2 = r11.f254545e
                int r2 = r2 + r3
                r0.mo122418a(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p987jf.C87958b.C87959a.run():void");
        }
    }

    /* renamed from: jf.b$b */
    public interface C87960b {
    }

    public C87958b(long j, HandlerThread handlerThread) {
        this.f254541a = new Handler(handlerThread.getLooper());
        this.f254543c = j;
    }

    /* renamed from: a */
    public final void mo122418a(C87960b bVar, int i) {
        this.f254541a.postDelayed(new C87959a(bVar, i), this.f254543c);
    }
}
