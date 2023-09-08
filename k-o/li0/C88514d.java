package li0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseIntArray;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83186v;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.statemachine.IState;
import com.tencent.p014mm.sdk.statemachine.State;
import java.util.Locale;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import junit.framework.Assert;
import p1042u.C90590d;
import u24.C90595a;

/* renamed from: li0.d */
public abstract class C88514d extends C88540k {

    /* renamed from: D */
    public static final AtomicInteger f255671D = new AtomicInteger(0);

    /* renamed from: A */
    public volatile State f255672A;

    /* renamed from: B */
    public final Runnable f255673B;

    /* renamed from: C */
    public final C88523h f255674C;

    /* renamed from: f */
    public final C88529m f255675f;

    /* renamed from: g */
    public final C88525i f255676g;

    /* renamed from: h */
    public final C88530n f255677h;

    /* renamed from: i */
    public final C88531o f255678i;

    /* renamed from: j */
    public final C88528l f255679j;

    /* renamed from: n */
    public final C88527k f255680n;

    /* renamed from: o */
    public final C88526j f255681o;

    /* renamed from: p */
    public final State[] f255682p;

    /* renamed from: q */
    public final State[] f255683q;

    /* renamed from: r */
    public final String f255684r;

    /* renamed from: s */
    public final AppBrandRuntime f255685s;

    /* renamed from: t */
    public final AtomicBoolean f255686t = new AtomicBoolean(false);

    /* renamed from: u */
    public final AtomicBoolean f255687u = new AtomicBoolean(false);

    /* renamed from: v */
    public final AtomicBoolean f255688v;

    /* renamed from: w */
    public final AtomicReference<State> f255689w;

    /* renamed from: x */
    public final AtomicReference<State> f255690x;

    /* renamed from: y */
    public final Queue<C88542m<?>> f255691y;

    /* renamed from: z */
    public final AtomicBoolean f255692z;

    /* renamed from: li0.d$a */
    public class C88515a implements Runnable {
        public C88515a() {
        }

        public void run() {
            for (State addState : C88514d.this.f255682p) {
                C88514d.this.addState(addState);
            }
            for (State addState2 : C88514d.this.f255683q) {
                C88514d.this.addState(addState2);
            }
            C88514d dVar = C88514d.this;
            dVar.addState(dVar.f255675f);
            C88514d dVar2 = C88514d.this;
            dVar2.setInitialState(dVar2.f255675f);
            C88514d.super.setDbg(true);
        }
    }

    /* renamed from: li0.d$b */
    public class C88516b implements Runnable {
        public C88516b() {
        }

        public void run() {
            C88514d.this.f255688v.set(false);
        }
    }

    /* renamed from: li0.d$c */
    public class C88517c implements Runnable {
        public C88517c() {
        }

        public void run() {
            C88514d.super.start();
        }
    }

    /* renamed from: li0.d$d */
    public class C88518d extends C88542m<C88508b> {
        public C88518d(long j, C88508b bVar) {
            super(j, bVar);
        }

        /* renamed from: b */
        public Object mo122994b() {
            return C88514d.this.mo122989w(true);
        }
    }

    /* renamed from: li0.d$e */
    public class C88519e extends C88542m<IState> {
        public C88519e() {
        }

        /* renamed from: b */
        public Object mo122994b() {
            return C88514d.super.getCurrentState();
        }
    }

    /* renamed from: li0.d$f */
    public class C88520f implements Runnable {

        /* renamed from: li0.d$f$a */
        public class C88521a implements MessageQueue.IdleHandler {
            public C88521a(C88520f fVar) {
            }

            public boolean queueIdle() {
                Looper.myLooper().quit();
                return false;
            }
        }

        public C88520f(C88514d dVar) {
        }

        public void run() {
            Looper.myQueue().addIdleHandler(new C88521a(this));
        }
    }

    /* renamed from: li0.d$g */
    public enum C88522g {
        NONE(0),
        TO_BACKGROUND(1),
        TO_FOREGROUND(3),
        AWAKE_IN_BACKGROUND(5),
        CHECK_PROCESS_IMPORTANCE(6),
        ON_SYSTEM_SCREEN_OFF(10),
        ON_DETACH_FROM_STACK(12),
        ON_STOP_BACKGROUND_LOCATION_LISTENING(13),
        ON_STOP_BACKGROUND_LIVE_VOIP(14),
        ON_STOP_AUDIO_BACKGROUND_PLAY(15),
        ON_STOP_BACKGROUND_VOIP_1v1(16),
        ON_STOP_BACKGROUND_BLUETOOTH(17),
        ON_CONTAINER_FORCED_MOVE_TO_BACK(18),
        ON_START_BACKGROUND_BLUETOOTH(19),
        ON_RESET_TO_TOP_OF_STACK(20),
        ON_CONTAINER_ACTIVITY_STOPPED(21),
        ON_SYSTEM_SCREEN_ON(22),
        ON_BACKGROUND_KEEP_FLAGS_CLEARED(100);
        

        /* renamed from: d */
        public final int f255717d;

        /* access modifiers changed from: public */
        static {
            SparseIntArray sparseIntArray = new SparseIntArray(values().length);
            for (C88522g gVar : values()) {
                if (sparseIntArray.indexOfKey(gVar.f255717d) >= 0) {
                    Assert.fail(String.format(Locale.ENGLISH, "duplicated defined intValue in %s", new Object[]{gVar.name()}));
                } else {
                    sparseIntArray.put(gVar.f255717d, 1);
                }
            }
        }

        /* access modifiers changed from: public */
        C88522g(int i) {
            this.f255717d = i;
        }

        /* renamed from: a */
        public static C88522g m110408a(int i) {
            for (C88522g gVar : values()) {
                if (gVar.f255717d == i) {
                    return gVar;
                }
            }
            return NONE;
        }
    }

    /* renamed from: li0.d$h */
    public final class C88523h {

        /* renamed from: a */
        public final String f255718a;

        /* renamed from: b */
        public final BroadcastReceiver f255719b;

        /* renamed from: c */
        public final Set<State> f255720c;

        /* renamed from: li0.d$h$a */
        public class C88524a extends BroadcastReceiver {
            public C88524a() {
            }

            public void onReceive(Context context, Intent intent) {
                if (intent != null && C88523h.this.f255718a.equals(intent.getAction())) {
                    C88523h hVar = C88523h.this;
                    Log.m105925i(C88514d.this.f255684r, "onReceive(%s)", hVar.f255718a);
                    C88514d.this.mo122987s(C88522g.ON_SYSTEM_SCREEN_ON, (Object) null);
                }
            }
        }

        public C88523h(C88515a aVar) {
            this.f255718a = !C88509c.f255665d ? "android.intent.action.SCREEN_ON" : "android.intent.action.USER_PRESENT";
            this.f255719b = new C88524a();
            this.f255720c = new C90590d();
        }

        /* renamed from: a */
        public void mo122997a(State state) {
            if (((C90590d) this.f255720c).add(state) && ((C90590d) this.f255720c).f260295f == 1) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(this.f255718a);
                MMApplicationContext.getContext().registerReceiver(this.f255719b, intentFilter);
            }
        }

        /* renamed from: b */
        public void mo122998b(State state) {
            if (((C90590d) this.f255720c).remove(state) && ((C90590d) this.f255720c).isEmpty()) {
                try {
                    MMApplicationContext.getContext().unregisterReceiver(this.f255719b);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    ((C90590d) this.f255720c).clear();
                    throw th;
                }
                ((C90590d) this.f255720c).clear();
            }
        }
    }

    /* renamed from: li0.d$i */
    public final class C88525i extends C88537i {

        /* renamed from: h */
        public boolean f255723h;

        public C88525i(C88540k kVar, AppBrandRuntime appBrandRuntime) {
            super(kVar, appBrandRuntime);
        }

        public void enter() {
            this.f255723h = false;
            super.enter();
        }

        public void exit() {
            this.f255723h = false;
            C88514d.this.f255674C.mo122998b(this);
            super.exit();
        }

        public String getName() {
            return "|Background";
        }

        public boolean processMessage(Message message) {
            int ordinal = C88522g.m110408a(message.what).ordinal();
            if (ordinal == 2) {
                C88514d dVar = C88514d.this;
                C88514d.m110396l(dVar, dVar.f255675f);
                return true;
            } else if (ordinal == 6) {
                this.f255723h = true;
                C88514d.this.f255674C.mo122997a(this);
                int i = this.f255740f;
                if (i > 0) {
                    Log.m105925i("MicroMsg.MultipleConditionBackgroundState", "Background process ON_SYSTEM_SCREEN_OFF, stay still, keepFlags %d", Integer.valueOf(i));
                    return true;
                }
                if (C88509c.f255665d) {
                    C88514d dVar2 = C88514d.this;
                    C88514d.m110396l(dVar2, dVar2.f255679j);
                } else {
                    Log.m105924i("MicroMsg.MultipleConditionBackgroundState", "Background process ON_SYSTEM_SCREEN_OFF");
                    C88514d dVar3 = C88514d.this;
                    C88514d.m110396l(dVar3, dVar3.f255681o);
                }
                return true;
            } else if (ordinal != 8) {
                switch (ordinal) {
                    case 17:
                        mo123004c(1024);
                        return true;
                    case 18:
                        this.f255723h = false;
                        C88514d.this.f255674C.mo122998b(this);
                        return true;
                    case 19:
                        if (!this.f255723h || !C88509c.f255665d) {
                            C88514d dVar4 = C88514d.this;
                            C88514d.m110396l(dVar4, dVar4.f255680n);
                        } else {
                            C88514d dVar5 = C88514d.this;
                            C88514d.m110396l(dVar5, dVar5.f255679j);
                        }
                        return true;
                    default:
                        return super.processMessage(message);
                }
            } else {
                mo123004c(16);
                mo123004c(1024);
                return true;
            }
        }
    }

    /* renamed from: li0.d$j */
    public final class C88526j extends C88539j {
        public C88526j(C88540k kVar) {
            super(kVar);
        }

        public void enter() {
            super.enter();
            C88514d.this.f255674C.mo122997a(this);
        }

        public void exit() {
            super.exit();
            C88514d.this.f255674C.mo122998b(this);
        }

        public String getName() {
            return "|BackgroundKeepNoChange";
        }

        public boolean processMessage(Message message) {
            int ordinal = C88522g.m110408a(message.what).ordinal();
            if (ordinal == 2) {
                C88514d dVar = C88514d.this;
                C88514d.m110396l(dVar, dVar.f255675f);
                return true;
            } else if (ordinal != 18) {
                return super.processMessage(message);
            } else {
                C88514d dVar2 = C88514d.this;
                C88514d.m110396l(dVar2, dVar2.f255676g);
                return true;
            }
        }
    }

    /* renamed from: li0.d$k */
    public final class C88527k extends C88539j {

        /* renamed from: e */
        public boolean f255726e;

        public C88527k(C88540k kVar) {
            super(kVar);
        }

        public void enter() {
            boolean z;
            super.enter();
            if (C88514d.this.f255687u.get()) {
                Log.m105921e(C88514d.this.f255684r, "invokeEnterMethods: %s, sm stopped", "|BackgroundTemporary");
            } else if (C88514d.this.f255685s.mo113051d0() == null) {
                Log.m105921e(C88514d.this.f255684r, "invokeEnterMethods: %s, NULL sysConfig, transitionTo StateSuspend", "|BackgroundTemporary");
                C88514d dVar = C88514d.this;
                C88514d.m110396l(dVar, dVar.f255677h);
            } else if (C88514d.this.f255685s.mo113051d0().f261070p != Integer.MAX_VALUE) {
                Message currentMessage = C88514d.this.getCurrentMessage();
                if (currentMessage != null) {
                    C88522g gVar = C88522g.NONE;
                    if (5 != currentMessage.what) {
                        Object obj = currentMessage.obj;
                        if (obj instanceof Message) {
                            Message message = (Message) obj;
                            if (5 == message.what) {
                                message.recycle();
                            }
                        }
                    }
                    z = true;
                    Log.m105925i(C88514d.this.f255684r, "invokeEnterMethods %s, awakenInBackground:%b", "|BackgroundTemporary", Boolean.valueOf(z));
                    Message obtain = Message.obtain(C88514d.this.getHandler());
                    C88522g gVar2 = C88522g.NONE;
                    obtain.what = 4;
                    Bundle bundle = new Bundle(1);
                    bundle.putBoolean("awakenInBackground", z);
                    obtain.obj = bundle;
                    C88514d.this.getHandler().sendMessageDelayed(obtain, ((long) C88514d.this.f255685s.mo113051d0().f261070p) * 1000);
                }
                z = false;
                Log.m105925i(C88514d.this.f255684r, "invokeEnterMethods %s, awakenInBackground:%b", "|BackgroundTemporary", Boolean.valueOf(z));
                Message obtain2 = Message.obtain(C88514d.this.getHandler());
                C88522g gVar22 = C88522g.NONE;
                obtain2.what = 4;
                Bundle bundle2 = new Bundle(1);
                bundle2.putBoolean("awakenInBackground", z);
                obtain2.obj = bundle2;
                C88514d.this.getHandler().sendMessageDelayed(obtain2, ((long) C88514d.this.f255685s.mo113051d0().f261070p) * 1000);
            }
        }

        public void exit() {
            super.exit();
            Handler handler = C88514d.this.getHandler();
            C88522g gVar = C88522g.NONE;
            handler.removeMessages(4);
            this.f255726e = false;
            C88514d.this.f255674C.mo122998b(this);
        }

        public String getName() {
            return "|BackgroundTemporary";
        }

        public boolean processMessage(Message message) {
            int ordinal = C88522g.m110408a(message.what).ordinal();
            if (ordinal == 2) {
                C88514d dVar = C88514d.this;
                C88514d.m110396l(dVar, dVar.f255675f);
                return true;
            } else if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        this.f255726e = true;
                        C88514d.this.f255674C.mo122997a(this);
                        C88514d.this.logi(String.format(Locale.ENGLISH, "BackgroundTemporary process ON_SYSTEM_SCREEN_OFF, no suicide?:%b", new Object[]{Boolean.valueOf(C88509c.f255665d)}));
                        Log.m105924i(C88514d.this.f255684r, "BackgroundTemporary process ON_SYSTEM_SCREEN_OFF");
                        if (C88509c.f255665d) {
                            C88514d dVar2 = C88514d.this;
                            C88514d.m110396l(dVar2, dVar2.f255679j);
                        } else {
                            C88514d dVar3 = C88514d.this;
                            C88514d.m110396l(dVar3, dVar3.f255681o);
                        }
                        return true;
                    } else if (ordinal != 15) {
                        if (ordinal != 18) {
                            return super.processMessage(message);
                        }
                        this.f255726e = false;
                        C88514d.this.f255674C.mo122998b(this);
                        return true;
                    }
                }
                C88514d dVar4 = C88514d.this;
                C88514d.m110396l(dVar4, dVar4.f255676g);
                return true;
            } else if (C88514d.this.f255685s.mo113042Z().mo116047v()) {
                C88514d dVar5 = C88514d.this;
                Log.m105925i(dVar5.f255684r, "%s process TO_SUSPEND_FROM_BACKGROUND, transfer to onSuspendTimeout directly due to HeadlessPage, appId:%s", "|BackgroundTemporary", dVar5.f255685s.f238147j);
                C88514d.this.mo122984A();
                return true;
            } else {
                if (!C88509c.f255665d || !this.f255726e) {
                    C88514d dVar6 = C88514d.this;
                    C88514d.m110396l(dVar6, dVar6.f255677h);
                } else {
                    C88514d dVar7 = C88514d.this;
                    C88514d.m110396l(dVar7, dVar7.f255678i);
                }
                return true;
            }
        }
    }

    /* renamed from: li0.d$l */
    public final class C88528l extends C88539j {
        public C88528l(C88540k kVar) {
            super(kVar);
        }

        public void enter() {
            super.enter();
            C88514d.this.f255674C.mo122997a(this);
            Message obtain = Message.obtain(C88514d.this.getHandler());
            C88522g gVar = C88522g.NONE;
            obtain.what = 4;
            long j = C88509c.f255666e;
            C88514d dVar = C88514d.this;
            dVar.logi("enter with lifespanMillis:" + j);
            if (j > 0) {
                C88514d.this.sendMessageDelayed(obtain, j);
            } else {
                C88514d.this.sendMessage(obtain);
            }
        }

        public void exit() {
            super.exit();
            Handler handler = C88514d.this.getHandler();
            C88522g gVar = C88522g.NONE;
            handler.removeMessages(4);
            C88514d.this.f255674C.mo122998b(this);
        }

        public String getName() {
            return "|StateBackgroundTemporaryDuringScreenOff";
        }

        public boolean processMessage(Message message) {
            int ordinal = C88522g.m110408a(message.what).ordinal();
            if (ordinal == 2) {
                C88514d dVar = C88514d.this;
                C88514d.m110396l(dVar, dVar.f255675f);
                return true;
            } else if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        return true;
                    }
                    if (!(ordinal == 15 || ordinal == 18)) {
                        return super.processMessage(message);
                    }
                }
                C88514d dVar2 = C88514d.this;
                C88514d.m110396l(dVar2, dVar2.f255676g);
                return true;
            } else {
                C88514d dVar3 = C88514d.this;
                C88514d.m110396l(dVar3, dVar3.f255678i);
                return true;
            }
        }
    }

    /* renamed from: li0.d$m */
    public final class C88529m extends C88539j {
        public C88529m(C88540k kVar) {
            super(kVar);
        }

        public void enter() {
            super.enter();
            Handler handler = C88514d.this.getHandler();
            C88522g gVar = C88522g.NONE;
            handler.removeMessages(11);
            Handler handler2 = C88514d.this.getHandler();
            C88522g gVar2 = C88522g.NONE;
            handler2.removeMessages(4);
            C88514d.m110397o(C88514d.this);
        }

        public void exit() {
            super.exit();
        }

        public String getName() {
            return "|Foreground";
        }

        public boolean processMessage(Message message) {
            if (C88522g.m110408a(message.what).ordinal() != 1) {
                return super.processMessage(message);
            }
            C88514d dVar = C88514d.this;
            C88514d.m110396l(dVar, dVar.f255676g);
            return true;
        }
    }

    /* renamed from: li0.d$n */
    public class C88530n extends C88539j {
        public C88530n(C88540k kVar) {
            super(kVar);
        }

        public void enter() {
            super.enter();
            Log.m105925i(C88514d.this.f255684r, "invokeEnterMethods: %s appId:%s, lifespanAfterSuspend:%d, stopped:%b", getName(), C88514d.this.f255685s.f238147j, Integer.valueOf(C88514d.this.f255685s.mo113051d0().f261071q), Boolean.valueOf(C88514d.this.f255687u.get()));
            if (!C88514d.this.f255687u.get()) {
                Handler handler = C88514d.this.getHandler();
                C88522g gVar = C88522g.NONE;
                handler.sendEmptyMessageDelayed(11, ((long) C88514d.this.f255685s.mo113051d0().f261071q) * 1000);
                C88514d dVar = C88514d.this;
                C83186v x = dVar.mo122990x();
                if (x != null) {
                    x.pause();
                    if (dVar.f255685s.mo113047b0().mo114347r0() != null) {
                        for (C80669j jVar : dVar.f255685s.mo113047b0().mo114347r0().f245478c.f236076b.values()) {
                            jVar.f236041b.pause();
                        }
                    }
                }
            }
        }

        public void exit() {
            super.exit();
            Handler handler = C88514d.this.getHandler();
            C88522g gVar = C88522g.NONE;
            handler.removeMessages(11);
        }

        public String getName() {
            return "|Suspend";
        }

        public boolean processMessage(Message message) {
            int ordinal = C88522g.m110408a(message.what).ordinal();
            if (ordinal == 2) {
                C88514d dVar = C88514d.this;
                C88514d.m110396l(dVar, dVar.f255675f);
                return true;
            } else if (ordinal == 4) {
                C88514d dVar2 = C88514d.this;
                C88514d.m110396l(dVar2, dVar2.f255676g);
                C88514d.m110397o(C88514d.this);
                return true;
            } else if (ordinal != 7) {
                return super.processMessage(message);
            } else {
                Log.m105925i(C88514d.this.f255684r, "processMessage: %s, ON_SUSPEND_TIMEOUT, appId:%s", getName(), C88514d.this.f255685s.f238147j);
                C88514d.this.mo122984A();
                return true;
            }
        }
    }

    /* renamed from: li0.d$o */
    public final class C88531o extends C88530n {
        public C88531o(C88540k kVar) {
            super(kVar);
        }

        public void enter() {
            super.enter();
            Handler handler = C88514d.this.getHandler();
            C88522g gVar = C88522g.NONE;
            handler.removeMessages(11);
            C88514d.this.f255674C.mo122997a(this);
        }

        public void exit() {
            super.exit();
            C88514d.this.f255674C.mo122998b(this);
        }

        public String getName() {
            return "|StateSuspendKeepAlive";
        }

        public boolean processMessage(Message message) {
            int ordinal = C88522g.m110408a(message.what).ordinal();
            if (ordinal != 5) {
                if (ordinal == 7) {
                    C88514d.this.logw("ignore ON_SUSPEND_TIMEOUT");
                } else if (ordinal != 18) {
                    return super.processMessage(message);
                } else {
                    C88514d dVar = C88514d.this;
                    C88514d.m110396l(dVar, dVar.f255677h);
                    return true;
                }
            }
            return true;
        }
    }

    public C88514d(AppBrandRuntime appBrandRuntime) {
        super(String.format(Locale.ENGLISH, "Luggage.AppRunningStateMachine[%s][%d]", new Object[]{appBrandRuntime.f238147j, Integer.valueOf(f255671D.incrementAndGet())}), Looper.getMainLooper());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f255688v = atomicBoolean;
        this.f255689w = new AtomicReference<>((Object) null);
        this.f255690x = new AtomicReference<>((Object) null);
        this.f255691y = new LinkedBlockingQueue();
        this.f255692z = new AtomicBoolean(false);
        this.f255672A = null;
        this.f255673B = new C88516b();
        this.f255674C = new C88523h((C88515a) null);
        this.f255684r = getName();
        this.f255685s = appBrandRuntime;
        super.setDbg(false);
        C88527k kVar = new C88527k(this);
        this.f255680n = kVar;
        C88526j jVar = new C88526j(this);
        this.f255681o = jVar;
        C88528l lVar = new C88528l(this);
        this.f255679j = lVar;
        C88525i iVar = new C88525i(this, appBrandRuntime);
        this.f255676g = iVar;
        this.f255675f = new C88529m(this);
        C88530n nVar = new C88530n(this);
        this.f255677h = nVar;
        C88531o oVar = new C88531o(this);
        this.f255678i = oVar;
        this.f255682p = new State[]{kVar, jVar, lVar, iVar};
        this.f255683q = new State[]{nVar, oVar};
        C88515a aVar = new C88515a();
        if (Looper.myLooper() == getHandler().getLooper()) {
            aVar.run();
            return;
        }
        atomicBoolean.set(true);
        getHandler().post(aVar);
    }

    /* renamed from: l */
    public static void m110396l(C88514d dVar, C88539j jVar) {
        dVar.f255688v.set(false);
        dVar.f255689w.set(jVar);
        dVar.f255690x.set((Object) null);
        super.transitionTo(jVar);
    }

    /* renamed from: o */
    public static void m110397o(C88514d dVar) {
        C83186v x = dVar.mo122990x();
        if (x != null) {
            x.resume();
            if (dVar.f255685s.mo113047b0().mo114347r0() != null) {
                for (C80669j jVar : dVar.f255685s.mo113047b0().mo114347r0().f245478c.f236076b.values()) {
                    jVar.f236041b.resume();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract void mo122984A();

    /* renamed from: C */
    public final C88508b mo122986C(IState iState) {
        C88508b bVar = C88508b.FOREGROUND;
        if (C90595a.m113498b(this.f255682p, iState)) {
            return C88508b.BACKGROUND;
        }
        if (C90595a.m113498b(this.f255683q, iState)) {
            return C88508b.SUSPEND;
        }
        if (iState != this.f255675f && BuildInfo.DEBUG) {
            Assert.fail(String.format(Locale.ENGLISH, "Unrecognised state %s, call @smoothieli to fix this", new Object[]{iState}));
        }
        return bVar;
    }

    public void onQuitting() {
        super.onQuitting();
        this.f255687u.set(true);
        C88523h hVar = this.f255674C;
        hVar.getClass();
        try {
            MMApplicationContext.getContext().unregisterReceiver(hVar.f255719b);
        } catch (Exception unused) {
        } catch (Throwable th) {
            ((C90590d) hVar.f255720c).clear();
            throw th;
        }
        ((C90590d) hVar.f255720c).clear();
        if (getHandler().getLooper().getThread().getId() != Looper.getMainLooper().getThread().getId()) {
            getHandler().post(new C88520f(this));
        }
    }

    public boolean recordLogRec(Message message) {
        int i = message.what;
        C88522g gVar = C88522g.NONE;
        return i != 1000;
    }

    /* renamed from: s */
    public void mo122987s(C88522g gVar, Object obj) {
        if (getHandler() == null) {
            Log.m105929w(this.f255684r, "executeOrPostMessage with cmd[%s], null handler", gVar.name());
            return;
        }
        getHandler().removeCallbacks(this.f255673B);
        this.f255688v.set(true);
        if (Looper.myLooper() != getHandler().getLooper() || getCurrentMessage() == null || getCurrentMessage().what == -2 || this.f255745e) {
            super.sendMessage(obtainMessage(gVar.f255717d, obj));
            getHandler().post(this.f255673B);
            return;
        }
        getHandler().dispatchMessage(obtainMessage(gVar.f255717d, obj));
        ((C88516b) this.f255673B).run();
    }

    public void start() {
        if (!this.f255687u.get()) {
            this.f255686t.set(true);
            if (Looper.myLooper() == getHandler().getLooper()) {
                super.start();
            } else {
                getHandler().post(new C88517c());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public li0.C88508b mo122988u() {
        /*
            r12 = this;
            li0.b r0 = li0.C88508b.FOREGROUND
            li0.b r1 = li0.C88508b.DESTROYED
            android.os.Handler r2 = r12.getHandler()
            if (r2 != 0) goto L_0x0012
            java.lang.String r0 = r12.f255684r
            java.lang.String r2 = "getRunningStateExport, NULL handler, return DESTROYED"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            return r1
        L_0x0012:
            r3 = -1
            boolean r3 = r2.hasMessages(r3)
            if (r3 == 0) goto L_0x0021
            java.lang.String r0 = r12.f255684r
            java.lang.String r2 = "getRunningStateExport, has SM_QUIT_CMD, return DESTROYED"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            return r1
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r3 = r12.f255687u
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x0031
            java.lang.String r0 = r12.f255684r
            java.lang.String r2 = "getRunningStateExport, mStopped=true, return DESTROYED"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            return r1
        L_0x0031:
            android.os.Handler r3 = r12.getHandler()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = 0
            goto L_0x003f
        L_0x003a:
            r5 = -2
            boolean r3 = r3.hasMessages(r5)
        L_0x003f:
            if (r3 == 0) goto L_0x0042
            return r0
        L_0x0042:
            java.util.concurrent.atomic.AtomicBoolean r3 = r12.f255688v
            boolean r3 = r3.get()
            r5 = 1
            if (r3 == 0) goto L_0x00ed
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r6 = r2.getLooper()
            if (r3 == r6) goto L_0x00ed
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r7 = 0
            if (r3 != r6) goto L_0x0064
            java.lang.String r3 = "query from main-looper"
            goto L_0x006f
        L_0x0064:
            java.util.concurrent.atomic.AtomicBoolean r3 = r12.f255692z
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x0071
            java.lang.String r3 = "skip flag marked true by outer"
        L_0x006f:
            r6 = 1
            goto L_0x0073
        L_0x0071:
            r3 = r7
            r6 = 0
        L_0x0073:
            if (r6 == 0) goto L_0x00b6
            java.util.concurrent.atomic.AtomicReference<com.tencent.mm.sdk.statemachine.State> r6 = r12.f255690x
            java.lang.Object r6 = r6.get()
            com.tencent.mm.sdk.statemachine.State r6 = (com.tencent.p014mm.sdk.statemachine.State) r6
            java.util.concurrent.atomic.AtomicBoolean r7 = r12.f255687u
            boolean r7 = r7.get()
            java.lang.String r8 = r12.f255684r
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            android.os.Looper r2 = r2.getLooper()
            java.lang.Thread r2 = r2.getThread()
            long r10 = r2.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r9[r4] = r2
            r9[r5] = r3
            r2 = 2
            r9[r2] = r6
            r2 = 3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            r9[r2] = r3
            java.lang.String r2 = "getRunningStateExport, pending change in sm-looper(%d) but %s, cached-state=%s, stopped=%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r9)
            if (r6 == 0) goto L_0x00b2
            li0.b r0 = r12.mo122986C(r6)
            return r0
        L_0x00b2:
            if (r7 == 0) goto L_0x00b5
            r0 = r1
        L_0x00b5:
            return r0
        L_0x00b6:
            li0.d$d r0 = new li0.d$d
            r8 = 500(0x1f4, double:2.47E-321)
            r0.<init>(r8, r7)
            java.lang.String r1 = r12.f255684r
            java.lang.String r3 = "getRunningStateExport, await"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r3)
            java.util.Queue<li0.m<?>> r1 = r12.f255691y
            r1.add(r0)
            com.tencent.mm.sdk.platformtools.MMHandler r1 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r2 = r2.getLooper()
            r1.<init>((android.os.Looper) r2)
            java.lang.Object r1 = r0.mo123008a(r1)
            li0.b r1 = (li0.C88508b) r1
            java.util.Queue<li0.m<?>> r2 = r12.f255691y
            java.util.concurrent.LinkedBlockingQueue r2 = (java.util.concurrent.LinkedBlockingQueue) r2
            r2.remove(r0)
            if (r1 != 0) goto L_0x00ed
            java.lang.String r0 = r12.f255684r
            java.lang.String r1 = "getRunningStateExport, await timeout"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            li0.b r0 = r12.mo122989w(r4)
            return r0
        L_0x00ed:
            li0.b r0 = r12.mo122989w(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: li0.C88514d.mo122988u():li0.b");
    }

    public void unhandledMessage(Message message) {
        Log.m105921e(getName(), " - unhandledMessage: msg.what=%d, msg.obj=%s", Integer.valueOf(message.what), message.obj);
        this.f255688v.set(false);
    }

    /* renamed from: w */
    public final C88508b mo122989w(boolean z) {
        IState iState;
        if (this.f255687u.get()) {
            Log.m105918d(this.f255684r, "getRunningStateExportImpl, mStopped=true, return DESTROYED");
            return C88508b.DESTROYED;
        }
        State state = this.f255689w.get();
        if (state != null) {
            return mo122986C(state);
        }
        State state2 = this.f255690x.get();
        if (state2 != null) {
            return mo122986C(state2);
        }
        if (!z) {
            return mo122986C(this.f255672A);
        }
        if (Thread.currentThread().getId() != getHandler().getLooper().getThread().getId()) {
            C88519e eVar = new C88519e();
            Log.m105918d(this.f255684r, "getRunningStateExportImpl, await");
            iState = (IState) eVar.mo123008a(new MMHandler(getHandler().getLooper()));
        } else {
            iState = super.getCurrentState();
        }
        return mo122986C(iState);
    }

    /* renamed from: x */
    public final C83186v mo122990x() {
        if (this.f255685s.mo113047b0() == null || !this.f255685s.f238116N) {
            return null;
        }
        return (C83186v) this.f255685s.mo113047b0().getJsRuntime().mo63321n0(C83186v.class);
    }

    /* renamed from: y */
    public abstract void mo122985y(C88508b bVar);
}
