package com.tencent.p014mm.plugin.performance.watchdogs;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import be2.C79693c;
import ce2.C28544a;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.matrix.dice.C80982a;
import com.tencent.p014mm.plugin.performance.watchdogs.C85342n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import kj2.C117407d;
import lu3.C109426i;
import org.json.JSONObject;
import org.xwalk.core.XWalkEnvironment;
import p757xv.C91349n;
import p757xv.C91354v;
import qe3.C89625d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog */
public class ThreadWatchDog implements Application.ActivityLifecycleCallbacks, C91354v {
    private static final ThreadWatchDog DOG = new ThreadWatchDog();
    private static final int HOOK_ID_KEY = 1571;
    public static final int HOOK_THRESHOLD = 20;
    private static final int LIMIT_THREAD_COUNT_150 = 150;
    private static final int LIMIT_THREAD_COUNT_200 = 200;
    private static final int LIMIT_THREAD_COUNT_300 = 300;
    private static final int OVER_300 = 2;
    private static final int OVER_500 = 1;
    private static final int OVER_500_WHITE_THREAD = 3;
    private static final int OVER_INC_50 = 4;
    public static final int REPORT_ID = 960;
    private static final int REPORT_KV_ID = 16470;
    private static final String TAG = "MicroMsg.ThreadWatchDog";
    private static volatile int TOP_THREAD_COUNT = 500;
    /* access modifiers changed from: private */
    public boolean enableTriggerPthreadHook;
    /* access modifiers changed from: private */
    public boolean isSensitiveMode;
    private volatile StringBuilder mContent;
    private C91349n mExtraInfoFactory;
    /* access modifiers changed from: private */
    public volatile int mJavaThreadCount = 0;
    /* access modifiers changed from: private */
    public volatile int mLastJavaThreadCount = 0;
    /* access modifiers changed from: private */
    public volatile int mLastProcessThreadCount = 0;
    private int mLastReportedThreadCount;
    private long mLastWangTime;
    /* access modifiers changed from: private */
    public volatile int mProcessThreadCount = 0;
    /* access modifiers changed from: private */
    public final Collection<String> mScenes = new ConcurrentSkipListSet();
    private volatile boolean mShouldPreventThrow;

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog$a */
    public class C30348a implements C80982a.C80983a {
        public C30348a() {
        }

        /* renamed from: S1 */
        public double mo55862S1() {
            return 1.0d / ((double) ((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_diagnostic_pthread_hook_auto_trigger_rate_denominator_v2, 5)));
        }

        public long b00() {
            return 0;
        }

        /* renamed from: kD */
        public void mo55864kD(double d) {
            Log.m105924i(ThreadWatchDog.TAG, "enable trigger pthread hook");
            boolean unused = ThreadWatchDog.this.enableTriggerPthreadHook = true;
        }

        public String key() {
            return ThreadWatchDog.TAG;
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog$b */
    public class C30349b implements C80982a.C80983a {
        public C30349b() {
        }

        /* renamed from: S1 */
        public double mo55862S1() {
            long Qe = (long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_diagnostic_pthread_hook_sensitive_rate, 2);
            if (Qe == 0) {
                Qe = -1;
            }
            return 1.0d / ((double) Qe);
        }

        public long b00() {
            return 0;
        }

        /* renamed from: kD */
        public void mo55864kD(double d) {
            boolean unused = ThreadWatchDog.this.isSensitiveMode = true;
        }

        public String key() {
            return "MicroMsg.ThreadWatchDog-sensitive";
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog$c */
    public class C85323c implements C109426i {
        public C85323c() {
        }

        public String getKey() {
            return ThreadWatchDog.TAG;
        }

        public boolean isLogging() {
            return false;
        }

        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                ThreadWatchDog threadWatchDog = ThreadWatchDog.this;
                int unused = threadWatchDog.mLastProcessThreadCount = threadWatchDog.mProcessThreadCount;
                ThreadWatchDog threadWatchDog2 = ThreadWatchDog.this;
                int unused2 = threadWatchDog2.mLastJavaThreadCount = threadWatchDog2.mJavaThreadCount;
                int unused3 = ThreadWatchDog.this.mProcessThreadCount = C85342n.m105365c();
                Collection<C85342n.C85345c> b = C85342n.m105364b();
                int i = 0;
                for (C85342n.C85345c a : b) {
                    i += a.mo118631a();
                }
                int unused4 = ThreadWatchDog.this.mJavaThreadCount = i;
                String access$600 = ThreadWatchDog.this.report();
                if (BuildInfo.DEBUG && access$600 == null) {
                    access$600 = Arrays.toString(((LinkedList) C85342n.m105366d()).toArray());
                }
                Object[] objArr = new Object[4];
                objArr[0] = Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis);
                objArr[1] = Integer.valueOf(ThreadWatchDog.this.mJavaThreadCount);
                objArr[2] = Integer.valueOf(ThreadWatchDog.this.mProcessThreadCount);
                if (access$600 == null) {
                    access$600 = b.toString();
                }
                objArr[3] = access$600;
                Log.m105929w(ThreadWatchDog.TAG, "[dumpAsync][Cost:%s][%s:%s]:%s", objArr);
            } catch (Throwable th) {
                ThreadWatchDog.this.mScenes.clear();
                throw th;
            }
            ThreadWatchDog.this.mScenes.clear();
        }
    }

    private ThreadWatchDog() {
        C80982a aVar = C80982a.f237863f;
        aVar.mo112808c(new C30348a());
        aVar.mo112808c(new C30349b());
    }

    private void dumpThreadCountAndReportAsync(String str) {
        ((C119157j) C119157j.f356862d).mo183884o(new C85323c());
    }

    private void enablePthreadHook(List<String> list) {
        boolean z = BuildInfo.IS_FLAVOR_RED || C89625d.f257845k || WeChatEnvironment.isCoolassistEnv() || WeChatEnvironment.hasDebugger() || this.enableTriggerPthreadHook;
        Log.m105925i(TAG, "enable auto trigger? %s", Boolean.valueOf(z));
        if (z) {
            if (list.isEmpty()) {
                Log.m105928w(TAG, "threadNames is empty, just return");
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String replace : list) {
                String replace2 = replace.replace("[", "\\[").replace("]", "\\]").replace("?", ".*");
                if (replace2.length() > 1 && replace2.endsWith("J")) {
                    replace2 = replace2.substring(0, replace2.length() - 1);
                }
                sb.append(replace2);
                sb.append(";");
            }
            C28544a.INSTANCE.mo56047c("<cmd><diagnostic><PthreadHook\n enable='1' process='" + processCmd() + "' duration='1' hook='.*\\.so$' thread='" + sb.toString() + "'/></diagnostic></cmd>");
            ArrayList arrayList = new ArrayList();
            IDKey iDKey = new IDKey((int) HOOK_ID_KEY, 11, 1);
            IDKey iDKey2 = new IDKey((int) HOOK_ID_KEY, getWatchDogTriggerProcessKey(), 1);
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            C117407d.INSTANCE.mo160124a(arrayList, false);
        }
    }

    public static synchronized ThreadWatchDog getDog() {
        ThreadWatchDog threadWatchDog;
        synchronized (ThreadWatchDog.class) {
            threadWatchDog = DOG;
        }
        return threadWatchDog;
    }

    private int getWatchDogTriggerProcessKey() {
        if (MMApplicationContext.isMainProcess()) {
            return 60;
        }
        if (MMApplicationContext.isAppBrandProcess()) {
            return 61;
        }
        return (MMApplicationContext.isToolsProcess() || MMApplicationContext.isToolsIsolatedProcess()) ? 62 : -1;
    }

    private boolean isCheck() {
        if (SystemClock.uptimeMillis() - this.mLastWangTime < 10000) {
            return false;
        }
        this.mLastWangTime = SystemClock.uptimeMillis();
        return true;
    }

    private String map2Json(Map<String, String> map) {
        try {
            return new JSONObject(map).toString().replace(",", ";");
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "", new Object[0]);
            return "";
        }
    }

    private void onOverInc() {
        if (this.mContent == null) {
            this.mContent = new StringBuilder(C85342n.m105366d().toString());
        }
        String format = String.format("ThreadInc[%s:%s->%s:%s]: %s", new Object[]{Integer.valueOf(this.mLastJavaThreadCount), Integer.valueOf(this.mLastProcessThreadCount), Integer.valueOf(this.mJavaThreadCount), Integer.valueOf(this.mProcessThreadCount), this.mContent.toString()});
        String a = C79693c.m96807a(this.mScenes.toArray());
        Log.m105925i(TAG, "ThreadInc[%s:%s->%s:%s] passedScenes:%s", Integer.valueOf(this.mLastJavaThreadCount), Integer.valueOf(this.mLastProcessThreadCount), Integer.valueOf(this.mJavaThreadCount), Integer.valueOf(this.mProcessThreadCount), a);
        C117407d.INSTANCE.mo160131h(REPORT_KV_ID, format, 4, Integer.valueOf(this.mJavaThreadCount), Integer.valueOf(this.mProcessThreadCount), "", "", "", "", "", "", "", "", "", MMApplicationContext.getProcessName(), a, BuildInfo.REV);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean onOverThread(int r22, int r23, int r24, java.lang.StringBuilder r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r25
            java.util.List r2 = com.tencent.p014mm.plugin.performance.watchdogs.C85342n.m105366d()
            r3 = 3
            com.tencent.mm.plugin.performance.watchdogs.n$c[] r4 = new com.tencent.p014mm.plugin.performance.watchdogs.C85342n.C85345c[r3]
            java.util.Iterator r5 = r2.iterator()
            r6 = 0
            r7 = r22
            r8 = 0
            r9 = 0
        L_0x0014:
            boolean r10 = r5.hasNext()
            r12 = 4
            r14 = 1
            if (r10 == 0) goto L_0x013a
            java.lang.Object r10 = r5.next()
            com.tencent.mm.plugin.performance.watchdogs.n$c r10 = (com.tencent.p014mm.plugin.performance.watchdogs.C85342n.C85345c) r10
            r4[r8] = r10
            if (r14 != r7) goto L_0x012d
            java.lang.String r10 = r10.f248693a
            java.util.List<java.lang.String> r15 = com.tencent.p014mm.plugin.performance.watchdogs.C85347o.f248699a
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x0030:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x004a
            java.lang.Object r16 = r15.next()
            r11 = r16
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r3 = android.os.Build.BRAND
            boolean r3 = r3.equalsIgnoreCase(r11)
            if (r3 == 0) goto L_0x0048
            r3 = 1
            goto L_0x004b
        L_0x0048:
            r3 = 3
            goto L_0x0030
        L_0x004a:
            r3 = 0
        L_0x004b:
            java.util.List<java.lang.Integer> r11 = com.tencent.p014mm.plugin.performance.watchdogs.C85347o.f248700b
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x0053:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x0069
            java.lang.Object r15 = r11.next()
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r15 != r13) goto L_0x0053
            r11 = 1
            goto L_0x006a
        L_0x0069:
            r11 = 0
        L_0x006a:
            java.util.List<java.lang.String> r13 = com.tencent.p014mm.plugin.performance.watchdogs.C85347o.f248701c
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.Iterator r13 = r13.iterator()
        L_0x0072:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0086
            java.lang.Object r15 = r13.next()
            java.lang.String r15 = (java.lang.String) r15
            boolean r15 = r10.contains(r15)
            if (r15 == 0) goto L_0x0072
            r13 = 1
            goto L_0x0087
        L_0x0086:
            r13 = 0
        L_0x0087:
            java.lang.Object[] r15 = new java.lang.Object[r12]
            if (r3 == 0) goto L_0x0092
            if (r11 == 0) goto L_0x0092
            if (r13 == 0) goto L_0x0092
            r18 = 1
            goto L_0x0094
        L_0x0092:
            r18 = 0
        L_0x0094:
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r18)
            r15[r6] = r18
            java.lang.String r12 = android.os.Build.BRAND
            r15[r14] = r12
            int r14 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r19 = java.lang.Integer.valueOf(r14)
            r17 = 2
            r15[r17] = r19
            r16 = 3
            r15[r16] = r10
            java.lang.String r6 = "MicroMsg.ThreadWhiteList"
            r20 = r5
            java.lang.String r5 = "OnePlus_Q_AudioLeak: matchWhiteThread? %s, brand = %s, API = %s, threadName = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r15)
            if (r3 == 0) goto L_0x00bd
            if (r11 == 0) goto L_0x00bd
            if (r13 == 0) goto L_0x00bd
            r3 = 1
            goto L_0x00be
        L_0x00bd:
            r3 = 0
        L_0x00be:
            if (r3 == 0) goto L_0x00c2
        L_0x00c0:
            r3 = 1
            goto L_0x0128
        L_0x00c2:
            java.lang.String r3 = com.tencent.p014mm.plugin.performance.watchdogs.C85348p.f248702a
            boolean r3 = r3.equalsIgnoreCase(r12)
            int r5 = com.tencent.p014mm.plugin.performance.watchdogs.C85348p.f248703b
            if (r14 != r5) goto L_0x00ce
            r5 = 1
            goto L_0x00cf
        L_0x00ce:
            r5 = 0
        L_0x00cf:
            java.lang.String r11 = com.tencent.p014mm.plugin.performance.watchdogs.C85348p.f248704c
            boolean r11 = r11.equals(r10)
            if (r3 == 0) goto L_0x0123
            if (r5 == 0) goto L_0x0123
            if (r11 != 0) goto L_0x00dc
            goto L_0x0123
        L_0x00dc:
            java.util.List<java.lang.String> r3 = com.tencent.p014mm.plugin.performance.watchdogs.C85348p.f248705d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x00e4:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00fc
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r11 = p156gj.C87203t.m108275k()
            boolean r5 = r5.equalsIgnoreCase(r11)
            if (r5 == 0) goto L_0x00e4
            r3 = 1
            goto L_0x00fd
        L_0x00fc:
            r3 = 0
        L_0x00fd:
            r5 = 5
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r12 = 0
            r11[r12] = r5
            java.lang.String r5 = android.os.Build.BRAND
            r12 = 1
            r11[r12] = r5
            java.lang.String r5 = p156gj.C87203t.m108275k()
            r12 = 2
            r11[r12] = r5
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r12 = 3
            r11[r12] = r5
            r5 = 4
            r11[r5] = r10
            java.lang.String r5 = "Vivo_Q_Camera_Leak: matchWhiteThread? %s, brand = %s, model = %s, API = %s, threadName = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r11)
            goto L_0x0124
        L_0x0123:
            r3 = 0
        L_0x0124:
            if (r3 == 0) goto L_0x0127
            goto L_0x00c0
        L_0x0127:
            r3 = 0
        L_0x0128:
            if (r3 == 0) goto L_0x012f
            r7 = 3
            r9 = 1
            goto L_0x012f
        L_0x012d:
            r20 = r5
        L_0x012f:
            int r8 = r8 + 1
            r3 = 3
            if (r8 < r3) goto L_0x0135
            goto L_0x013a
        L_0x0135:
            r5 = r20
            r6 = 0
            goto L_0x0014
        L_0x013a:
            java.lang.String r3 = r2.toString()
            java.util.Collection<java.lang.String> r5 = r0.mScenes
            java.lang.Object[] r5 = r5.toArray()
            java.lang.String r5 = be2.C79693c.m96807a(r5)
            r6 = 2
            java.lang.Object[] r8 = new java.lang.Object[r6]
            if (r7 != r6) goto L_0x0150
            java.lang.String r6 = "300"
            goto L_0x0152
        L_0x0150:
            java.lang.String r6 = "500"
        L_0x0152:
            r10 = 0
            r8[r10] = r6
            r6 = 1
            r8[r6] = r5
            java.lang.String r10 = "MicroMsg.ThreadWatchDog"
            java.lang.String r11 = "trigger Over %s: passed scenes: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r8)
            if (r7 != r6) goto L_0x0165
            com.tencent.matrix.trace.tracer.SignalAnrTracer.m98143l()
        L_0x0165:
            org.json.JSONObject r2 = toJson(r2)
            kj2.d r6 = kj2.C117407d.INSTANCE
            r8 = 16470(0x4056, float:2.308E-41)
            r10 = 17
            java.lang.Object[] r10 = new java.lang.Object[r10]
            if (r2 != 0) goto L_0x0175
            r2 = r3
            goto L_0x0181
        L_0x0175:
            java.lang.String r2 = r2.toString()
            java.lang.String r11 = ","
            java.lang.String r12 = ";"
            java.lang.String r2 = r2.replace(r11, r12)
        L_0x0181:
            r11 = 0
            r10[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r12 = 1
            r10[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r12 = 2
            r10[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
            r12 = 3
            r10[r12] = r2
            r2 = r4[r11]
            java.lang.String r11 = "null"
            if (r2 == 0) goto L_0x01a3
            java.lang.String r12 = r2.f248693a
            goto L_0x01a4
        L_0x01a3:
            r12 = r11
        L_0x01a4:
            r13 = 4
            r10[r13] = r12
            java.lang.String r12 = "0"
            if (r2 == 0) goto L_0x01b4
            int r2 = r2.mo118631a()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x01b5
        L_0x01b4:
            r2 = r12
        L_0x01b5:
            r13 = 5
            r10[r13] = r2
            r2 = 6
            r13 = 0
            r14 = r4[r13]
            if (r14 == 0) goto L_0x01c6
            boolean r13 = r14.mo118632b()
            if (r13 == 0) goto L_0x01c6
            r13 = 1
            goto L_0x01c7
        L_0x01c6:
            r13 = 0
        L_0x01c7:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r10[r2] = r13
            r2 = 7
            r13 = 1
            r14 = r4[r13]
            if (r14 == 0) goto L_0x01d6
            java.lang.String r13 = r14.f248693a
            goto L_0x01d7
        L_0x01d6:
            r13 = r11
        L_0x01d7:
            r10[r2] = r13
            r2 = 8
            if (r14 == 0) goto L_0x01e6
            int r13 = r14.mo118631a()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x01e7
        L_0x01e6:
            r13 = r12
        L_0x01e7:
            r10[r2] = r13
            r2 = 9
            r13 = 1
            r14 = r4[r13]
            if (r14 == 0) goto L_0x01f8
            boolean r13 = r14.mo118632b()
            if (r13 == 0) goto L_0x01f8
            r13 = 1
            goto L_0x01f9
        L_0x01f8:
            r13 = 0
        L_0x01f9:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r10[r2] = r13
            r2 = 10
            r13 = 2
            r14 = r4[r13]
            if (r14 == 0) goto L_0x0208
            java.lang.String r11 = r14.f248693a
        L_0x0208:
            r10[r2] = r11
            r2 = 11
            if (r14 == 0) goto L_0x0216
            int r11 = r14.mo118631a()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
        L_0x0216:
            r10[r2] = r12
            r2 = 12
            r11 = 2
            r11 = r4[r11]
            if (r11 == 0) goto L_0x0227
            boolean r11 = r11.mo118632b()
            if (r11 == 0) goto L_0x0227
            r12 = 1
            goto L_0x0228
        L_0x0227:
            r12 = 0
        L_0x0228:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r10[r2] = r11
            r2 = 13
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r10[r2] = r11
            r2 = 14
            r10[r2] = r5
            r2 = 15
            xv.n r5 = r0.mExtraInfoFactory
            if (r5 == 0) goto L_0x0249
            java.util.Map r5 = r5.getExtra()
            java.lang.String r5 = r0.map2Json(r5)
            goto L_0x024b
        L_0x0249:
            java.lang.String r5 = ""
        L_0x024b:
            r10[r2] = r5
            r2 = 16
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            r10[r2] = r5
            r6.mo160131h(r8, r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = 3
            r12 = 0
        L_0x025d:
            if (r12 >= r5) goto L_0x0275
            r6 = r4[r12]
            if (r6 == 0) goto L_0x0272
            int r6 = r6.mo118631a()
            r8 = 20
            if (r6 <= r8) goto L_0x0272
            r6 = r4[r12]
            java.lang.String r6 = r6.f248693a
            r2.add(r6)
        L_0x0272:
            int r12 = r12 + 1
            goto L_0x025d
        L_0x0275:
            r6 = 1
            if (r6 == r7) goto L_0x0292
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r4 != 0) goto L_0x0292
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r4 != 0) goto L_0x0292
            boolean r4 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r4 != 0) goto L_0x0292
            boolean r4 = qe3.C89625d.f257845k
            if (r4 != 0) goto L_0x0292
            boolean r4 = qe3.C89625d.f257842h
            if (r4 != 0) goto L_0x0292
            boolean r4 = r0.isSensitiveMode
            if (r4 == 0) goto L_0x02a0
        L_0x0292:
            ce2.a r4 = ce2.C28544a.INSTANCE
            java.lang.Class<fe2.b> r5 = fe2.C86863b.class
            ce2.c r4 = r4.mo56045a(r5)
            fe2.b r4 = (fe2.C86863b) r4
            r5 = 0
            r4.mo118541p(r5)
        L_0x02a0:
            r0.enablePthreadHook(r2)
            if (r1 == 0) goto L_0x02a8
            r1.append(r3)
        L_0x02a8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.performance.watchdogs.ThreadWatchDog.onOverThread(int, int, int, java.lang.StringBuilder):boolean");
    }

    private final String processCmd() {
        return MMApplicationContext.isMainProcess() ? XWalkEnvironment.MODULE_MM : MMApplicationContext.isAppBrandProcess() ? XWalkEnvironment.MODULE_APPBRAND : MMApplicationContext.isToolsProcess() ? XWalkEnvironment.MODULE_TOOLS : "all";
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String report() {
        /*
            r15 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            r1 = -1
            if (r0 == 0) goto L_0x000a
            r0 = 100
            goto L_0x001d
        L_0x000a:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r0 == 0) goto L_0x0013
            r0 = 120(0x78, float:1.68E-43)
            goto L_0x001d
        L_0x0013:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r0 == 0) goto L_0x001c
            r0 = 140(0x8c, float:1.96E-43)
            goto L_0x001d
        L_0x001c:
            r0 = -1
        L_0x001d:
            r2 = 0
            if (r0 != r1) goto L_0x0021
            return r2
        L_0x0021:
            r15.mContent = r2
            int r1 = r15.mProcessThreadCount     // Catch:{ all -> 0x012e }
            int r3 = TOP_THREAD_COUNT     // Catch:{ all -> 0x012e }
            r4 = 150(0x96, float:2.1E-43)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = 200(0xc8, float:2.8E-43)
            if (r1 <= r3) goto L_0x0051
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x012e }
            r1.<init>()     // Catch:{ all -> 0x012e }
            r15.mContent = r1     // Catch:{ all -> 0x012e }
            int r1 = r15.mJavaThreadCount     // Catch:{ all -> 0x012e }
            int r3 = r15.mProcessThreadCount     // Catch:{ all -> 0x012e }
            java.lang.StringBuilder r7 = r15.mContent     // Catch:{ all -> 0x012e }
            r8 = 1
            boolean r1 = r15.onOverThread(r8, r1, r3, r7)     // Catch:{ all -> 0x012e }
            r15.mShouldPreventThrow = r1     // Catch:{ all -> 0x012e }
            kj2.d r7 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x012e }
            r8 = 960(0x3c0, double:4.743E-321)
            int r1 = r0 + 1
            long r10 = (long) r1     // Catch:{ all -> 0x012e }
            r12 = 1
            r14 = 1
            r7.idkeyStat(r8, r10, r12, r14)     // Catch:{ all -> 0x012e }
            goto L_0x00a9
        L_0x0051:
            int r1 = r15.mProcessThreadCount     // Catch:{ all -> 0x012e }
            if (r1 <= r5) goto L_0x0078
            kj2.d r7 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x012e }
            r8 = 960(0x3c0, double:4.743E-321)
            long r10 = (long) r0     // Catch:{ all -> 0x012e }
            r12 = 1
            r14 = 1
            r7.idkeyStat(r8, r10, r12, r14)     // Catch:{ all -> 0x012e }
            int r1 = r15.mProcessThreadCount     // Catch:{ all -> 0x012e }
            int r3 = r15.mLastReportedThreadCount     // Catch:{ all -> 0x012e }
            int r1 = r1 - r3
            r3 = 50
            if (r1 < r3) goto L_0x00a9
            int r1 = r15.mProcessThreadCount     // Catch:{ all -> 0x012e }
            r15.mLastReportedThreadCount = r1     // Catch:{ all -> 0x012e }
            int r1 = r15.mJavaThreadCount     // Catch:{ all -> 0x012e }
            int r3 = r15.mProcessThreadCount     // Catch:{ all -> 0x012e }
            java.lang.StringBuilder r7 = r15.mContent     // Catch:{ all -> 0x012e }
            r8 = 2
            r15.onOverThread(r8, r1, r3, r7)     // Catch:{ all -> 0x012e }
            goto L_0x00a9
        L_0x0078:
            int r1 = r15.mProcessThreadCount     // Catch:{ all -> 0x012e }
            if (r1 <= r6) goto L_0x008a
            kj2.d r7 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x012e }
            r8 = 960(0x3c0, double:4.743E-321)
            int r1 = r0 + 2
            long r10 = (long) r1     // Catch:{ all -> 0x012e }
            r12 = 1
            r14 = 1
            r7.idkeyStat(r8, r10, r12, r14)     // Catch:{ all -> 0x012e }
            goto L_0x00a9
        L_0x008a:
            int r1 = r15.mProcessThreadCount     // Catch:{ all -> 0x012e }
            if (r1 <= r4) goto L_0x009c
            kj2.d r7 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x012e }
            r8 = 960(0x3c0, double:4.743E-321)
            int r1 = r0 + 3
            long r10 = (long) r1     // Catch:{ all -> 0x012e }
            r12 = 1
            r14 = 1
            r7.idkeyStat(r8, r10, r12, r14)     // Catch:{ all -> 0x012e }
            goto L_0x00a9
        L_0x009c:
            kj2.d r7 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x012e }
            r8 = 960(0x3c0, double:4.743E-321)
            int r1 = r0 + 8
            long r10 = (long) r1     // Catch:{ all -> 0x012e }
            r12 = 1
            r14 = 1
            r7.idkeyStat(r8, r10, r12, r14)     // Catch:{ all -> 0x012e }
        L_0x00a9:
            int r1 = r15.mJavaThreadCount     // Catch:{ all -> 0x012e }
            int r3 = TOP_THREAD_COUNT     // Catch:{ all -> 0x012e }
            if (r1 <= r3) goto L_0x00bd
            kj2.d r7 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x012e }
            r8 = 960(0x3c0, double:4.743E-321)
            int r0 = r0 + 4
            long r10 = (long) r0     // Catch:{ all -> 0x012e }
            r12 = 1
            r14 = 1
            r7.idkeyStat(r8, r10, r12, r14)     // Catch:{ all -> 0x012e }
            goto L_0x0100
        L_0x00bd:
            int r1 = r15.mJavaThreadCount     // Catch:{ all -> 0x012e }
            if (r1 <= r5) goto L_0x00cf
            kj2.d r7 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x012e }
            r8 = 960(0x3c0, double:4.743E-321)
            int r0 = r0 + 5
            long r10 = (long) r0     // Catch:{ all -> 0x012e }
            r12 = 1
            r14 = 1
            r7.idkeyStat(r8, r10, r12, r14)     // Catch:{ all -> 0x012e }
            goto L_0x0100
        L_0x00cf:
            int r1 = r15.mJavaThreadCount     // Catch:{ all -> 0x012e }
            if (r1 <= r6) goto L_0x00e1
            kj2.d r7 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x012e }
            r8 = 960(0x3c0, double:4.743E-321)
            int r0 = r0 + 6
            long r10 = (long) r0     // Catch:{ all -> 0x012e }
            r12 = 1
            r14 = 1
            r7.idkeyStat(r8, r10, r12, r14)     // Catch:{ all -> 0x012e }
            goto L_0x0100
        L_0x00e1:
            int r1 = r15.mJavaThreadCount     // Catch:{ all -> 0x012e }
            if (r1 <= r4) goto L_0x00f3
            kj2.d r7 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x012e }
            r8 = 960(0x3c0, double:4.743E-321)
            int r0 = r0 + 7
            long r10 = (long) r0     // Catch:{ all -> 0x012e }
            r12 = 1
            r14 = 1
            r7.idkeyStat(r8, r10, r12, r14)     // Catch:{ all -> 0x012e }
            goto L_0x0100
        L_0x00f3:
            kj2.d r7 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x012e }
            r8 = 960(0x3c0, double:4.743E-321)
            int r0 = r0 + 9
            long r10 = (long) r0     // Catch:{ all -> 0x012e }
            r12 = 1
            r14 = 1
            r7.idkeyStat(r8, r10, r12, r14)     // Catch:{ all -> 0x012e }
        L_0x0100:
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x012e }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ all -> 0x012e }
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_thread_watchdog_enable_inc_report_threshold     // Catch:{ all -> 0x012e }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x012e }
            if (r3 != 0) goto L_0x0119
            boolean r3 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()     // Catch:{ all -> 0x012e }
            if (r3 == 0) goto L_0x0115
            goto L_0x0119
        L_0x0115:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x011b
        L_0x0119:
            r3 = 30
        L_0x011b:
            int r0 = r0.mo58779Qe(r1, r3)     // Catch:{ all -> 0x012e }
            int r1 = r15.mLastProcessThreadCount     // Catch:{ all -> 0x012e }
            if (r1 < r6) goto L_0x0139
            int r1 = r15.mProcessThreadCount     // Catch:{ all -> 0x012e }
            int r3 = r15.mLastProcessThreadCount     // Catch:{ all -> 0x012e }
            int r1 = r1 - r3
            if (r1 < r0) goto L_0x0139
            r15.onOverInc()     // Catch:{ all -> 0x012e }
            goto L_0x0139
        L_0x012e:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "MicroMsg.ThreadWatchDog"
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r1)
        L_0x0139:
            java.lang.StringBuilder r0 = r15.mContent
            if (r0 != 0) goto L_0x013e
            goto L_0x0144
        L_0x013e:
            java.lang.StringBuilder r0 = r15.mContent
            java.lang.String r2 = r0.toString()
        L_0x0144:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.performance.watchdogs.ThreadWatchDog.report():java.lang.String");
    }

    private static JSONObject toJson(List<C85342n.C85345c> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (C85342n.C85345c next : list) {
                jSONObject.put(next.f248693a, next.mo118631a());
            }
            return jSONObject;
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "", new Object[0]);
            return null;
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.mScenes.add(simpleName);
        if (isCheck()) {
            wang();
            dumpThreadCountAndReportAsync(simpleName);
        }
    }

    public void setExtraInfoFactory(C91349n nVar) {
        this.mExtraInfoFactory = nVar;
    }

    public void wang() {
        if (this.mProcessThreadCount <= TOP_THREAD_COUNT) {
            return;
        }
        if (this.mShouldPreventThrow) {
            Log.m105924i(TAG, "prevent throw Exception");
            TOP_THREAD_COUNT += 1024;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(this.mJavaThreadCount);
        objArr[1] = Integer.valueOf(this.mProcessThreadCount);
        objArr[2] = this.mContent == null ? "null" : this.mContent.toString();
        sb.append(String.format("\nThreadOver[%s:%s]: %s", objArr));
        throw new RuntimeException(sb.toString());
    }
}
