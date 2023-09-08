package com.tencent.p014mm.storage;

import android.os.Process;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114660c0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import java.util.Calendar;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import zh3.C119118e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.storage.w4 */
public final class C85803w4 {

    /* renamed from: a */
    public static boolean f249907a;

    /* renamed from: b */
    public static ConcurrentLinkedQueue<C85806b> f249908b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    public static Future<?> f249909c;

    /* renamed from: com.tencent.mm.storage.w4$c */
    public enum C30795c {
        FIRST_SCREEN_OFF
    }

    /* renamed from: com.tencent.mm.storage.w4$a */
    public static final class C85804a implements C114660c0 {

        /* renamed from: com.tencent.mm.storage.w4$a$a */
        public static final class C85805a implements Runnable {

            /* renamed from: d */
            public static final C85805a f249910d = new C85805a();

            public final void run() {
                Calendar instance = Calendar.getInstance();
                instance.set(11, 4);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                if (System.currentTimeMillis() < instance.getTimeInMillis()) {
                    Log.m105924i("MicroMsg.SilentTask", "executeTask!");
                    boolean z = C85803w4.f249907a;
                    long j = 600000;
                    while (!C85803w4.f249908b.isEmpty() && C85803w4.f249907a && j > 0) {
                        Log.m105924i("MicroMsg.SilentTask", "mTaskRunnableQueue, mTaskQueue.size = " + C85803w4.f249908b.size());
                        long currentTimeMillis = System.currentTimeMillis();
                        C85806b poll = C85803w4.f249908b.poll();
                        if (poll != null) {
                            String str = poll.f249912b;
                            Runnable runnable = poll.f249911a;
                            if (runnable != null) {
                                runnable.run();
                            }
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            Log.m105924i("MicroMsg.SilentTask", "mTaskRunnableQueue, [" + str + "], duration = " + currentTimeMillis2);
                            j -= currentTimeMillis2;
                            StringBuilder sb = new StringBuilder();
                            sb.append("remainingTime = ");
                            sb.append(j);
                            Log.m105924i("MicroMsg.SilentTask", sb.toString());
                        }
                    }
                }
                C85803w4.f249907a = false;
            }
        }

        /* renamed from: b */
        public void mo112345b(boolean z) {
            boolean z2 = z;
            Log.m105924i("MicroMsg.SilentTask", "isScreenOff : " + z2 + ", mCreateIndexThreadRunning = " + C85803w4.f249907a);
            if (!z2) {
                try {
                    if (C85803w4.f249907a) {
                        C85803w4.f249907a = false;
                        Log.m105924i("MicroMsg.SilentTask", "delayTask canceled");
                        Future<?> future = C85803w4.f249909c;
                        if (future != null) {
                            future.cancel(true);
                        }
                        if (C119118e.f356735o) {
                            Log.m105924i("MicroMsg.SilentTask", "isVacuuming, kill self");
                            C117407d.INSTANCE.mo160131h(25824, "", "", 0, 0, 0, "wakeup-kill", 0, 0, 0, 0, 0, 0);
                            int myPid = Process.myPid();
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(Integer.valueOf(myPid));
                            Object obj = new Object();
                            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/storage/SilentTask$1", "onScreen", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(obj, "com/tencent/mm/storage/SilentTask$1", "onScreen", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                        }
                    }
                } catch (Throwable th) {
                    Log.m105924i("MicroMsg.SilentTask", "delayTask cancel error : " + th.getMessage());
                }
            } else {
                Log.m105924i("MicroMsg.SilentTask", "mTaskQueue.size = " + C85803w4.f249908b.size());
                if (!C85803w4.f249907a && !C85803w4.f249908b.isEmpty()) {
                    C85803w4.f249907a = true;
                    C85805a aVar2 = C85805a.f249910d;
                    Calendar instance = Calendar.getInstance();
                    instance.add(5, 1);
                    instance.set(11, 2);
                    instance.set(12, 0);
                    instance.set(13, 0);
                    instance.set(14, 0);
                    long timeInMillis = instance.getTimeInMillis();
                    long currentTimeMillis = (timeInMillis - System.currentTimeMillis()) + ((long) Util.getIntRandom(600000, 0));
                    Log.m105924i("MicroMsg.SilentTask", "targetTimeStamp = " + timeInMillis);
                    Log.m105924i("MicroMsg.SilentTask", "delayTime = " + currentTimeMillis);
                    C85803w4.f249909c = ((C119157j) C119157j.f356862d).mo183879j(aVar2, currentTimeMillis, "Silent-Task-Thread");
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.storage.w4$b */
    public static final class C85806b {

        /* renamed from: a */
        public Runnable f249911a;

        /* renamed from: b */
        public String f249912b;

        public C85806b(Runnable runnable, String str, C30795c cVar) {
            C87412m.m108594g(runnable, "runnable");
            C87412m.m108594g(str, "name");
            C87412m.m108594g(cVar, "timing");
            this.f249911a = runnable;
            this.f249912b = str;
        }
    }

    static {
        Log.m105924i("MicroMsg.SilentTask", "SilentDBOperationHelper init");
        AppForegroundDelegate.INSTANCE.mo174209b(new C85804a());
    }
}
