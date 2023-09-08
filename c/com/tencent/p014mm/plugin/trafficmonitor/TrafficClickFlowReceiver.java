package com.tencent.p014mm.plugin.trafficmonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c13.C16846x;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver */
public class TrafficClickFlowReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final Map<String, C19400b> f54763a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final Deque<C19400b> f54764b = new ArrayDeque();

    /* renamed from: c */
    public static long f54765c = System.currentTimeMillis();

    /* renamed from: d */
    public static boolean f54766d;

    /* renamed from: com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$a */
    public class C19399a extends C80401d {
        /* renamed from: a */
        public void mo17850a() {
            Map<String, C19400b> map = TrafficClickFlowReceiver.f54763a;
            C19400b bVar = (C19400b) ((ConcurrentHashMap) map).get("Background");
            if (bVar == null) {
                bVar = new C19400b();
                ((ConcurrentHashMap) map).put("Background", bVar);
            }
            bVar.f54767a = "Background";
            bVar.f54768b = System.currentTimeMillis();
            Log.m105924i("MicroMsg.TrafficClickFlow", "Scene change, background[enter]");
        }

        /* renamed from: b */
        public void mo17851b() {
            Map<String, C19400b> map = TrafficClickFlowReceiver.f54763a;
            if (((ConcurrentHashMap) map).containsKey("Background")) {
                C19400b bVar = (C19400b) ((ConcurrentHashMap) map).remove("Background");
                bVar.f54769c = System.currentTimeMillis();
                Deque<C19400b> deque = TrafficClickFlowReceiver.f54764b;
                synchronized (deque) {
                    ((ArrayDeque) deque).addLast(bVar);
                }
            }
            Log.m105924i("MicroMsg.TrafficClickFlow", "Scene change, background[exit]");
        }
    }

    /* renamed from: com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver$b */
    public static class C19400b {

        /* renamed from: a */
        public String f54767a;

        /* renamed from: b */
        public long f54768b;

        /* renamed from: c */
        public long f54769c;

        public Object clone() {
            C19400b bVar = new C19400b();
            bVar.f54767a = this.f54767a;
            bVar.f54768b = this.f54768b;
            bVar.f54769c = this.f54769c;
            return bVar;
        }

        public String toString() {
            return "UIObject{ui='" + this.f54767a + '\'' + ", duration=" + (this.f54769c - this.f54768b) + '}';
        }
    }

    static {
        AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback((C80401d) new C19399a());
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.tencent.mm.Intent.ACTION_NET_STATS".equals(action)) {
                String stringExtra = intent.getStringExtra("ui");
                if (stringExtra == null) {
                    stringExtra = "null";
                }
                if (stringExtra.contains(".")) {
                    stringExtra = stringExtra.substring(stringExtra.lastIndexOf(".") + 1);
                }
                int intExtra = intent.getIntExtra("opCode", 0);
                long currentTimeMillis = System.currentTimeMillis();
                if (intExtra == 10) {
                    f54765c = System.currentTimeMillis();
                } else if (intExtra == 3) {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f54763a;
                    C19400b bVar = (C19400b) concurrentHashMap.get(stringExtra);
                    if (bVar == null) {
                        bVar = new C19400b();
                        concurrentHashMap.put(stringExtra, bVar);
                    }
                    bVar.f54767a = stringExtra;
                    bVar.f54768b = currentTimeMillis;
                    Log.m105925i("MicroMsg.TrafficClickFlow", "Scene change, ui@%s[enter]", stringExtra);
                } else if (intExtra == 4) {
                    ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) f54763a;
                    if (concurrentHashMap2.containsKey(stringExtra)) {
                        C19400b bVar2 = (C19400b) concurrentHashMap2.remove(stringExtra);
                        bVar2.f54769c = currentTimeMillis;
                        Deque<C19400b> deque = f54764b;
                        synchronized (deque) {
                            ((ArrayDeque) deque).offer(bVar2);
                            long j = currentTimeMillis - C16846x.m16494b().f45513b;
                            while (true) {
                                Deque<C19400b> deque2 = f54764b;
                                if (((ArrayDeque) deque2).size() > 0 && ((C19400b) ((ArrayDeque) deque2).peekFirst()).f54769c <= j) {
                                    ((ArrayDeque) deque2).pollFirst();
                                }
                            }
                        }
                    }
                    Log.m105925i("MicroMsg.TrafficClickFlow", "Scene change, ui@%s[exit]", stringExtra);
                }
            } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                Log.m105924i("MicroMsg.TrafficClickFlow", "Scene change, screen[on]");
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                Log.m105924i("MicroMsg.TrafficClickFlow", "Scene change, screen[off]");
            } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                Log.m105924i("MicroMsg.TrafficClickFlow", "Scene change, screen[unlock]");
            }
        }
    }
}
