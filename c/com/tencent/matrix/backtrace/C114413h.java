package com.tencent.matrix.backtrace;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import com.tencent.matrix.backtrace.C114419k;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.backtrace.h */
public class C114413h implements Handler.Callback {

    /* renamed from: d */
    public C114414a f342978d;

    /* renamed from: e */
    public C114405e f342979e;

    /* renamed from: f */
    public Handler f342980f;

    /* renamed from: g */
    public Context f342981g;

    /* renamed from: h */
    public C114419k.C114423d f342982h;

    /* renamed from: i */
    public long f342983i = 0;

    /* renamed from: com.tencent.matrix.backtrace.h$a */
    public static final class C114414a extends BroadcastReceiver {

        /* renamed from: a */
        public CancellationSignal f342984a;

        /* renamed from: b */
        public Handler f342985b;

        /* renamed from: c */
        public Context f342986c;

        /* renamed from: d */
        public final C114419k.C114423d f342987d;

        /* renamed from: e */
        public final long f342988e;

        /* renamed from: f */
        public final Set<C114415b> f342989f = new HashSet();

        public C114414a(Context context, Handler handler, C114419k.C114423d dVar, long j) {
            this.f342986c = context;
            this.f342985b = handler;
            this.f342987d = dVar;
            this.f342988e = j;
        }

        /* renamed from: a */
        public synchronized void mo173586a(Context context) {
            int intExtra;
            boolean isInteractive = ((PowerManager) context.getSystemService("power")).isInteractive();
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z = false;
            if (registerReceiver != null && ((intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5)) {
                z = true;
            }
            mo173587b(isInteractive, z);
        }

        /* renamed from: b */
        public final synchronized void mo173587b(boolean z, boolean z2) {
            C118672d.m167353c("Matrix.WarmUpScheduler", "Idle status changed: interactive = %s, charging = %s", Boolean.valueOf(z), Boolean.valueOf(z2));
            boolean z3 = !z && (this.f342987d == C114419k.C114423d.WhileScreenOff || !z2);
            if (z3 && this.f342984a == null) {
                this.f342984a = new CancellationSignal();
                Iterator it = ((HashSet) this.f342989f).iterator();
                while (it.hasNext()) {
                    int ordinal = ((C114415b) it.next()).ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            if (C114417j.m160952g(this.f342986c)) {
                                Handler handler = this.f342985b;
                                handler.sendMessageDelayed(Message.obtain(handler, 3, this.f342984a), 3000);
                            } else {
                                it.remove();
                            }
                            C118672d.m167353c("Matrix.WarmUpScheduler", "System idle, trigger clean up in %s seconds.", 3L);
                        } else if (ordinal == 2) {
                            Handler handler2 = this.f342985b;
                            handler2.sendMessageDelayed(Message.obtain(handler2, 2, this.f342984a), this.f342988e);
                            C118672d.m167353c("Matrix.WarmUpScheduler", "System idle, trigger consume requested qut in %s seconds.", Long.valueOf(this.f342988e / 1000));
                        } else if (ordinal == 3) {
                            if (C114417j.m160954i(this.f342986c)) {
                                Handler handler3 = this.f342985b;
                                handler3.sendMessageDelayed(Message.obtain(handler3, 4, this.f342984a), 3000);
                            } else {
                                it.remove();
                            }
                            C118672d.m167353c("Matrix.WarmUpScheduler", "System idle, trigger disk usage in %s seconds.", 3L);
                        }
                    } else if (!C114417j.m160957l(this.f342986c).exists()) {
                        Handler handler4 = this.f342985b;
                        handler4.sendMessageDelayed(Message.obtain(handler4, 1, this.f342984a), this.f342988e);
                        C118672d.m167353c("Matrix.WarmUpScheduler", "System idle, trigger warm up in %s seconds.", Long.valueOf(this.f342988e / 1000));
                    } else {
                        it.remove();
                    }
                }
            } else if (!z3 && this.f342984a != null) {
                this.f342985b.removeMessages(1);
                this.f342985b.removeMessages(2);
                this.f342985b.removeMessages(3);
                this.f342985b.removeMessages(4);
                this.f342984a.cancel();
                this.f342984a = null;
                C118672d.m167353c("Matrix.WarmUpScheduler", "Exit idle state, task cancelled.", new Object[0]);
            }
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null) {
                synchronized (this) {
                    char c = 65535;
                    boolean z = true;
                    boolean z2 = false;
                    switch (action.hashCode()) {
                        case -2128145023:
                            if (action.equals("android.intent.action.SCREEN_OFF")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -1454123155:
                            if (action.equals("android.intent.action.SCREEN_ON")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    if (c != 0) {
                        if (c == 1 || c != 2) {
                            z = false;
                        } else {
                            z = false;
                            z2 = true;
                        }
                    }
                    mo173587b(z, z2);
                }
            }
        }
    }

    /* renamed from: com.tencent.matrix.backtrace.h$b */
    public enum C114415b {
        WarmUp,
        CleanUp,
        RequestConsuming,
        DiskUsage
    }

    public C114413h(C114405e eVar, Context context, C114419k.C114423d dVar, long j) {
        this.f342979e = eVar;
        if (this.f342980f == null) {
            this.f342980f = new Handler(Looper.getMainLooper(), this);
        }
        this.f342981g = context;
        this.f342982h = dVar;
        this.f342983i = Math.max(j, 3000);
    }

    /* renamed from: a */
    public void mo173584a(C114415b bVar) {
        int size;
        int ordinal = this.f342982h.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            Context context = this.f342981g;
            synchronized (this) {
                C114414a aVar = this.f342978d;
                if (aVar != null) {
                    synchronized (aVar) {
                        ((HashSet) aVar.f342989f).remove(bVar);
                        size = ((HashSet) aVar.f342989f).size();
                    }
                    if (size == 0) {
                        C118672d.m167353c("Matrix.WarmUpScheduler", "Unregister idle receiver.", new Object[0]);
                        context.unregisterReceiver(this.f342978d);
                        this.f342978d = null;
                    }
                }
            }
        }
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C114405e eVar = this.f342979e;
            eVar.f342953d.mo173579a(new C114398a(eVar, (CancellationSignal) message.obj), "warm-up");
            return false;
        } else if (i == 2) {
            C114405e eVar2 = this.f342979e;
            eVar2.f342953d.mo173579a(new C114402c(eVar2, (CancellationSignal) message.obj), "consuming-up");
            return false;
        } else if (i == 3) {
            C114405e eVar3 = this.f342979e;
            eVar3.f342953d.mo173579a(new C114400b(eVar3, (CancellationSignal) message.obj), "clean-up");
            return false;
        } else if (i != 4) {
            return false;
        } else {
            C114405e eVar4 = this.f342979e;
            eVar4.f342953d.mo173579a(new C114403d(eVar4, (CancellationSignal) message.obj), "compute-disk-usage");
            return false;
        }
    }
}
