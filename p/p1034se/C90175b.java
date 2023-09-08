package p1034se;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: se.b */
public class C90175b implements ServiceConnection {

    /* renamed from: d */
    public final /* synthetic */ C90173a f258894d;

    /* renamed from: se.b$a */
    public class C90176a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ IBinder f258895d;

        public C90176a(IBinder iBinder) {
            this.f258895d = iBinder;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r30 = this;
                r1 = r30
                se.b r0 = p1034se.C90175b.this
                se.a r0 = r0.f258894d
                android.os.IBinder r2 = r1.f258895d
                r0.getClass()
                java.lang.String r0 = "glBufferData"
                java.lang.String r3 = "glRenderbufferStorage"
                java.lang.String r4 = "glTexImage3D"
                java.lang.String r5 = "glBindRenderbuffer"
                java.lang.String r6 = "glBindBuffer"
                java.lang.String r7 = "glBindTexture"
                java.lang.String r8 = "glTexImage2D"
                java.lang.String r9 = "glDeleteRenderbuffers"
                java.lang.String r10 = "glGenRenderbuffers"
                java.lang.String r11 = "glDeleteFramebuffers"
                java.lang.String r12 = "glGenFramebuffers"
                java.lang.String r13 = "glDeleteBuffers"
                java.lang.String r14 = "glGenBuffers"
                java.lang.String r15 = "glDeleteTextures"
                java.lang.String r1 = "glGenTextures"
                r16 = r3
                java.lang.String r3 = "destory test process"
                r17 = r4
                r4 = 0
                r18 = r0
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.String r4 = "matrix.OpenglLeakPlugin"
                r19 = r5
                java.lang.String r5 = "onServiceConnected"
                p723vf.C118672d.m167352b(r4, r5, r0)
                int r0 = com.tencent.matrix.openglleak.detector.C80507a.C80508a.f235508d
                if (r2 != 0) goto L_0x0043
                r0 = 0
                goto L_0x0057
            L_0x0043:
                java.lang.String r0 = "com.tencent.matrix.openglleak.detector.IOpenglIndexDetector"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L_0x0052
                boolean r5 = r0 instanceof com.tencent.matrix.openglleak.detector.C80507a
                if (r5 == 0) goto L_0x0052
                com.tencent.matrix.openglleak.detector.a r0 = (com.tencent.matrix.openglleak.detector.C80507a) r0
                goto L_0x0057
            L_0x0052:
                com.tencent.matrix.openglleak.detector.a$a$a r0 = new com.tencent.matrix.openglleak.detector.a$a$a
                r0.<init>(r2)
            L_0x0057:
                r2 = r0
                java.util.Map r0 = r2.zs0()     // Catch:{ all -> 0x02cb }
                if (r0 != 0) goto L_0x0070
                java.lang.String r0 = "indexMap null"
                r1 = 0
                java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x02cb }
                p723vf.C118672d.m167352b(r4, r0, r5)     // Catch:{ all -> 0x02cb }
                java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ RemoteException -> 0x02df }
                p723vf.C118672d.m167353c(r4, r3, r0)     // Catch:{ RemoteException -> 0x02df }
                r2.mo112032uN()     // Catch:{ RemoteException -> 0x02df }
                goto L_0x02df
            L_0x0070:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02cb }
                r5.<init>()     // Catch:{ all -> 0x02cb }
                r20 = r2
                java.lang.String r2 = "indexMap:"
                r5.append(r2)     // Catch:{ all -> 0x02c8 }
                r5.append(r0)     // Catch:{ all -> 0x02c8 }
                java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x02c8 }
                r21 = r3
                r5 = 0
                java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x02c4 }
                p723vf.C118672d.m167352b(r4, r2, r3)     // Catch:{ all -> 0x02c4 }
                p1053ve.C111513c.m152016a()     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r2 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                r2.init()     // Catch:{ all -> 0x02c4 }
                java.lang.String r2 = "init env"
                r3 = 0
                java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x02c4 }
                p723vf.C118672d.m167352b(r4, r2, r5)     // Catch:{ all -> 0x02c4 }
                java.lang.Object r2 = r0.get(r1)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x02c4 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x02c4 }
                java.lang.Object r3 = r0.get(r15)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r3
                java.lang.Object r3 = r0.get(r14)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r3
                java.lang.Object r3 = r0.get(r13)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r3
                java.lang.Object r3 = r0.get(r12)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r3
                java.lang.Object r3 = r0.get(r11)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r3
                java.lang.Object r3 = r0.get(r10)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r3
                java.lang.Object r3 = r0.get(r9)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r3
                java.lang.Object r3 = r0.get(r8)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r3
                java.lang.Object r3 = r0.get(r7)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r3
                java.lang.Object r3 = r0.get(r6)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r3
                java.lang.String r3 = "glBindFramebuffer"
                java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r3
                r3 = r19
                java.lang.Object r5 = r0.get(r3)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x02c4 }
                int r5 = r5.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r5
                r5 = r17
                java.lang.Object r17 = r0.get(r5)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r17 = (java.lang.Integer) r17     // Catch:{ all -> 0x02c4 }
                int r17 = r17.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r17
                r19 = r3
                r3 = r16
                java.lang.Object r16 = r0.get(r3)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r16 = (java.lang.Integer) r16     // Catch:{ all -> 0x02c4 }
                int r16 = r16.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r16
                r16 = r3
                r3 = r18
                java.lang.Object r17 = r0.get(r3)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r17 = (java.lang.Integer) r17     // Catch:{ all -> 0x02c4 }
                int r17 = r17.intValue()     // Catch:{ all -> 0x02c4 }
                int r2 = r2 * r17
                r18 = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c4 }
                r3.<init>()     // Catch:{ all -> 0x02c4 }
                r17 = r6
                java.lang.String r6 = "hookResult = "
                r3.append(r6)     // Catch:{ all -> 0x02c4 }
                r3.append(r2)     // Catch:{ all -> 0x02c4 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02c4 }
                r22 = r7
                r6 = 0
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x02c4 }
                p723vf.C118672d.m167352b(r4, r3, r7)     // Catch:{ all -> 0x02c4 }
                if (r2 != 0) goto L_0x019f
                se.c r2 = p1034se.C90173a.f258891i     // Catch:{ all -> 0x02c4 }
                if (r2 == 0) goto L_0x01a8
                com.tencent.mm.plugin.report.service.n r23 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x02c4 }
                r24 = 1403(0x57b, double:6.93E-321)
                r26 = 39
                r28 = 1
                r23.mo175913w(r24, r26, r28)     // Catch:{ all -> 0x02c4 }
                java.lang.String r2 = "OpenglLeakPlugin.TAG"
                java.lang.String r3 = "onHookFail call & report"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)     // Catch:{ all -> 0x02c4 }
                goto L_0x01a8
            L_0x019f:
                se.c r2 = p1034se.C90173a.f258891i     // Catch:{ all -> 0x02c4 }
                if (r2 == 0) goto L_0x01a8
                com.tencent.mm.matrix.h r2 = (com.tencent.p014mm.matrix.C80989h) r2     // Catch:{ all -> 0x02c4 }
                r2.mo112811a()     // Catch:{ all -> 0x02c4 }
            L_0x01a8:
                com.tencent.matrix.openglleak.hook.OpenGLHook.hookEgl()     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r2 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                r2.hook(r1, r3)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                java.lang.Object r2 = r0.get(r15)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x02c4 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r15, r2)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                java.lang.Object r2 = r0.get(r14)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x02c4 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r14, r2)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                java.lang.Object r2 = r0.get(r13)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x02c4 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r13, r2)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                java.lang.Object r2 = r0.get(r12)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x02c4 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r12, r2)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                java.lang.Object r2 = r0.get(r11)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x02c4 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r11, r2)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                java.lang.Object r2 = r0.get(r10)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x02c4 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r10, r2)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                java.lang.Object r2 = r0.get(r9)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x02c4 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r9, r2)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                java.lang.Object r2 = r0.get(r8)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x02c4 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r8, r2)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                java.lang.Object r2 = r0.get(r5)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x02c4 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r5, r2)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                r2 = r22
                java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r2, r3)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                r2 = r17
                java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r2, r3)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                r2 = r19
                java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r2, r3)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                r2 = r18
                java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x02c4 }
                int r3 = r3.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r2, r3)     // Catch:{ all -> 0x02c4 }
                com.tencent.matrix.openglleak.hook.OpenGLHook r1 = com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance()     // Catch:{ all -> 0x02c4 }
                r2 = r16
                java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x02c4 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x02c4 }
                int r0 = r0.intValue()     // Catch:{ all -> 0x02c4 }
                r1.hook(r2, r0)     // Catch:{ all -> 0x02c4 }
                java.lang.String r0 = "hook finish"
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x02c4 }
                p723vf.C118672d.m167352b(r4, r0, r2)     // Catch:{ all -> 0x02c4 }
                java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ RemoteException -> 0x02df }
                r1 = r21
                p723vf.C118672d.m167353c(r4, r1, r0)     // Catch:{ RemoteException -> 0x02df }
                goto L_0x02dc
            L_0x02c4:
                r0 = move-exception
                r1 = r21
                goto L_0x02cf
            L_0x02c8:
                r0 = move-exception
            L_0x02c9:
                r1 = r3
                goto L_0x02cf
            L_0x02cb:
                r0 = move-exception
                r20 = r2
                goto L_0x02c9
            L_0x02cf:
                java.lang.String r2 = ""
                r3 = 0
                java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x02e0 }
                p723vf.C118672d.m167354d(r4, r0, r2, r5)     // Catch:{ all -> 0x02e0 }
                java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ RemoteException -> 0x02df }
                p723vf.C118672d.m167353c(r4, r1, r0)     // Catch:{ RemoteException -> 0x02df }
            L_0x02dc:
                r20.mo112032uN()     // Catch:{ RemoteException -> 0x02df }
            L_0x02df:
                return
            L_0x02e0:
                r0 = move-exception
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x02ea }
                p723vf.C118672d.m167353c(r4, r1, r2)     // Catch:{ RemoteException -> 0x02ea }
                r20.mo112032uN()     // Catch:{ RemoteException -> 0x02ea }
            L_0x02ea:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p1034se.C90175b.C90176a.run():void");
        }
    }

    public C90175b(C90173a aVar) {
        this.f258894d = aVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        new Thread(new C90176a(iBinder)).start();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f258894d.f258892h.unbindService(this);
    }
}
