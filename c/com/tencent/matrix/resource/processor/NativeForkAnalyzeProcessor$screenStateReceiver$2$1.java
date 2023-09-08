package com.tencent.matrix.resource.processor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.resource.C80525c;
import com.tencent.matrix.resource.MemoryUtil;
import com.tencent.matrix.resource.processor.C80534a;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import p425ze.C91669a;
import p723vf.C118672d;
import p937cf.C80018a;
import rx3.C13598b0;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/matrix/resource/processor/NativeForkAnalyzeProcessor$screenStateReceiver$2$1", "Landroid/content/BroadcastReceiver;", "matrix-resource-canary-android_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class NativeForkAnalyzeProcessor$screenStateReceiver$2$1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C80534a.C80536b f235550a;

    /* renamed from: com.tencent.matrix.resource.processor.NativeForkAnalyzeProcessor$screenStateReceiver$2$1$a */
    public static final class C80532a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ NativeForkAnalyzeProcessor$screenStateReceiver$2$1 f235551d;

        /* renamed from: com.tencent.matrix.resource.processor.NativeForkAnalyzeProcessor$screenStateReceiver$2$1$a$a */
        public static final class C80533a extends C87413o implements C32230s<File, File, String, String, String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C80532a f235552d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80533a(C80532a aVar) {
                super(5);
                this.f235552d = aVar;
            }

            /* renamed from: D */
            public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                File file = (File) obj;
                String str = (String) obj3;
                String str2 = (String) obj4;
                String str3 = (String) obj5;
                C80018a.C80020b bVar = C80018a.C80020b.FORK_ANALYSE;
                C87412m.m108594g(file, "hprof");
                C87412m.m108594g((File) obj2, "keyFile");
                C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C87412m.m108594g(str2, "key");
                C87412m.m108594g(str3, "failure");
                C118672d.m167353c("Matrix.LeakProcessor.NativeForkAnalyze", "Found record " + str + '(' + file.getName() + ").", new Object[0]);
                ArrayList arrayList = new ArrayList();
                arrayList.add(str3);
                String absolutePath = file.getAbsolutePath();
                C87412m.m108593f(absolutePath, "hprof.absolutePath");
                MemoryUtil memoryUtil = MemoryUtil.f235540d;
                C91669a c = memoryUtil.mo112087c(absolutePath, str2, 1200, new C80525c(memoryUtil));
                Throwable th = c.f262649f;
                if (th != null) {
                    arrayList.add(th.toString());
                }
                if (c.f262647d) {
                    this.f235552d.f235551d.f235550a.f235556e.mo125242b(str, false);
                    String aVar = c.toString();
                    this.f235552d.f235551d.f235550a.f235555d.mo122139d(0, bVar, str, str2, aVar, String.valueOf(c.f262650g), 1, (String) null);
                    C118672d.m167353c("Matrix.LeakProcessor.NativeForkAnalyze", "retry leak found: " + aVar, new Object[0]);
                } else {
                    Throwable th4 = c.f262649f;
                    if (th4 != null) {
                        arrayList.add(th4.toString());
                        this.f235552d.f235551d.f235550a.f235555d.mo122139d(5, bVar, str, str2, C110818d0.m150921S(arrayList, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), String.valueOf(c.f262650g), 1, (String) null);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C80532a(NativeForkAnalyzeProcessor$screenStateReceiver$2$1 nativeForkAnalyzeProcessor$screenStateReceiver$2$1) {
            this.f235551d = nativeForkAnalyzeProcessor$screenStateReceiver$2$1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00aa, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            cy3.C58003b.m67160a(r4, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r15 = this;
                com.tencent.matrix.resource.processor.NativeForkAnalyzeProcessor$screenStateReceiver$2$1 r0 = r15.f235551d
                com.tencent.matrix.resource.processor.a$b r0 = r0.f235550a
                com.tencent.matrix.resource.processor.a r0 = r0.f235555d
                rx3.g r0 = r0.f235553e
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                if.i r0 = (p982if.C87728i) r0
                if (r0 == 0) goto L_0x00ce
                com.tencent.matrix.resource.processor.NativeForkAnalyzeProcessor$screenStateReceiver$2$1$a$a r7 = new com.tencent.matrix.resource.processor.NativeForkAnalyzeProcessor$screenStateReceiver$2$1$a$a
                r7.<init>(r15)
                java.lang.Object r1 = r0.f254013a
                monitor-enter(r1)
                java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00cb }
                java.io.File r3 = r0.f254014b     // Catch:{ all -> 0x00cb }
                java.lang.String r4 = "hprof"
                r2.<init>(r3, r4)     // Catch:{ all -> 0x00cb }
                boolean r3 = r2.exists()     // Catch:{ all -> 0x00cb }
                if (r3 != 0) goto L_0x002c
                r2.mkdirs()     // Catch:{ all -> 0x00cb }
            L_0x002c:
                java.io.File[] r2 = r2.listFiles()     // Catch:{ all -> 0x00cb }
                r8 = 0
                if (r2 == 0) goto L_0x0034
                goto L_0x0036
            L_0x0034:
                java.io.File[] r2 = new java.io.File[r8]     // Catch:{ all -> 0x00cb }
            L_0x0036:
                r9 = r2
                monitor-exit(r1)
                int r10 = r9.length
                r11 = 0
            L_0x003a:
                if (r11 >= r10) goto L_0x00ce
                r12 = r9[r11]
                java.io.File r13 = new java.io.File
                java.io.File r1 = new java.io.File
                java.io.File r2 = r0.f254014b
                java.lang.String r3 = "key"
                r1.<init>(r2, r3)
                boolean r2 = r1.exists()
                if (r2 != 0) goto L_0x0052
                r1.mkdirs()
            L_0x0052:
                java.lang.String r2 = "hprofFile"
                gy3.C87412m.m108593f(r12, r2)
                java.lang.String r2 = r12.getName()
                r13.<init>(r1, r2)
                boolean r1 = r13.isFile()     // Catch:{ all -> 0x00af }
                if (r1 == 0) goto L_0x00b9
                java.nio.charset.Charset r1 = z04.C119027c.f356488a     // Catch:{ all -> 0x00af }
                r2 = 8192(0x2000, float:1.14794E-41)
                java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x00af }
                r3.<init>(r13)     // Catch:{ all -> 0x00af }
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x00af }
                r4.<init>(r3, r1)     // Catch:{ all -> 0x00af }
                boolean r1 = r4 instanceof java.io.BufferedReader     // Catch:{ all -> 0x00af }
                if (r1 == 0) goto L_0x0079
                java.io.BufferedReader r4 = (java.io.BufferedReader) r4     // Catch:{ all -> 0x00af }
                goto L_0x007f
            L_0x0079:
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x00af }
                r1.<init>(r4, r2)     // Catch:{ all -> 0x00af }
                r4 = r1
            L_0x007f:
                r1 = 0
                java.lang.String r5 = r4.readLine()     // Catch:{ all -> 0x00a8 }
                java.lang.String r6 = r4.readLine()     // Catch:{ all -> 0x00a8 }
                java.lang.String r14 = r4.readLine()     // Catch:{ all -> 0x00a8 }
                cy3.C58003b.m67160a(r4, r1)     // Catch:{ all -> 0x00af }
                java.lang.String r1 = "activity"
                gy3.C87412m.m108593f(r5, r1)     // Catch:{ all -> 0x00af }
                java.lang.String r1 = "key"
                gy3.C87412m.m108593f(r6, r1)     // Catch:{ all -> 0x00af }
                java.lang.String r1 = "failure"
                gy3.C87412m.m108593f(r14, r1)     // Catch:{ all -> 0x00af }
                r1 = r7
                r2 = r12
                r3 = r13
                r4 = r5
                r5 = r6
                r6 = r14
                r1.mo237D(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00af }
                goto L_0x00b9
            L_0x00a8:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x00aa }
            L_0x00aa:
                r2 = move-exception
                cy3.C58003b.m67160a(r4, r1)     // Catch:{ all -> 0x00af }
                throw r2     // Catch:{ all -> 0x00af }
            L_0x00af:
                r1 = move-exception
                java.lang.String r2 = "Matrix.LeakProcessor.NativeForkAnalyze"
                java.lang.String r3 = "Failed to read HPROF record from retry repository"
                java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x00c3 }
                p723vf.C118672d.m167354d(r2, r1, r3, r4)     // Catch:{ all -> 0x00c3 }
            L_0x00b9:
                p982if.C87726g.m109147a(r12)
                p982if.C87726g.m109147a(r13)
                int r11 = r11 + 1
                goto L_0x003a
            L_0x00c3:
                r0 = move-exception
                p982if.C87726g.m109147a(r12)
                p982if.C87726g.m109147a(r13)
                throw r0
            L_0x00cb:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L_0x00ce:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.resource.processor.NativeForkAnalyzeProcessor$screenStateReceiver$2$1.C80532a.run():void");
        }
    }

    public NativeForkAnalyzeProcessor$screenStateReceiver$2$1(C80534a.C80536b bVar) {
        this.f235550a = bVar;
    }

    public void onReceive(Context context, Intent intent) {
        this.f235550a.f235556e.f254531l.post(new C80532a(this));
    }
}
