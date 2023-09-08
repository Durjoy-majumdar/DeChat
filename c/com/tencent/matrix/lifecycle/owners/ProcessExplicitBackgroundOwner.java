package com.tencent.matrix.lifecycle.owners;

import androidx.lifecycle.C0125s;
import com.tencent.matrix.lifecycle.C28657g0;
import com.tencent.matrix.lifecycle.C28660i;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.C80404f;
import com.tencent.matrix.lifecycle.C80406g;
import com.tencent.matrix.lifecycle.IBackgroundStatefulOwner;
import com.tencent.matrix.lifecycle.IStatefulOwner;
import com.tencent.matrix.lifecycle.StatefulOwner;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p723vf.C118672d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\b\u0006*\u0001\u0010\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/owners/ProcessExplicitBackgroundOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/IBackgroundStatefulOwner;", "", "active", "", "TAG", "Ljava/lang/String;", "", "value", "maxCheckInterval", "J", "getMaxCheckInterval", "()J", "setMaxCheckInterval", "(J)V", "com/tencent/matrix/lifecycle/owners/ProcessExplicitBackgroundOwner$b", "checkTask", "Lcom/tencent/matrix/lifecycle/owners/ProcessExplicitBackgroundOwner$b;", "<init>", "()V", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class ProcessExplicitBackgroundOwner extends StatefulOwner implements IBackgroundStatefulOwner {
    public static final ProcessExplicitBackgroundOwner INSTANCE;
    private static final String TAG = "Matrix.background.Explicit";
    /* access modifiers changed from: private */
    public static final C80430b checkTask;
    private static long maxCheckInterval;

    /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner$a */
    public static final class C80429a implements C80406g {
        public void off() {
            ProcessExplicitBackgroundOwner.checkTask.mo21186f();
        }

        /* renamed from: on */
        public void mo60742on() {
            ProcessExplicitBackgroundOwner processExplicitBackgroundOwner = ProcessExplicitBackgroundOwner.INSTANCE;
            ProcessExplicitBackgroundOwner.checkTask.mo21187g();
            processExplicitBackgroundOwner.turnOff();
        }

        public boolean serial() {
            return true;
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner$b */
    public static final class C80430b extends C17661k {

        /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner$b$a */
        public static final class C80431a extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public static final C80431a f235373d = new C80431a();

            public C80431a() {
                super(0);
            }

            public Object invoke() {
                return Boolean.valueOf(ForegroundServiceLifecycleOwner.INSTANCE.hasForegroundService());
            }
        }

        /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner$b$b */
        public static final class C80432b extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public static final C80432b f235374d = new C80432b();

            public C80432b() {
                super(0);
            }

            public Object invoke() {
                return Boolean.valueOf(ProcessUIStartedStateOwner.INSTANCE.active());
            }
        }

        /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner$b$c */
        public static final class C80433c extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public static final C80433c f235375d = new C80433c();

            public C80433c() {
                super(0);
            }

            public Object invoke() {
                return Boolean.valueOf(OverlayWindowLifecycleOwner.INSTANCE.hasOverlayWindow());
            }
        }

        public C80430b(ProcessExplicitBackgroundOwner processExplicitBackgroundOwner, String str, long j) {
            super(str, j, -1);
        }

        /* renamed from: a */
        public boolean mo21181a() {
            C13601g a = C36568h.m40985a(C80432b.f235374d);
            C13601g a2 = C36568h.m40985a(C80431a.f235373d);
            C13601g a3 = C36568h.m40985a(C80433c.f235375d);
            if (((Boolean) ((C36570n) a).getValue()).booleanValue()) {
                C118672d.m167353c(ProcessExplicitBackgroundOwner.TAG, "turn OFF for UI foreground", new Object[0]);
                ProcessExplicitBackgroundOwner.INSTANCE.turnOff();
                return false;
            }
            C36570n nVar = (C36570n) a2;
            if (((Boolean) nVar.getValue()).booleanValue() || ((Boolean) ((C36570n) a3).getValue()).booleanValue()) {
                C118672d.m167353c(ProcessExplicitBackgroundOwner.TAG, "turn OFF: fgService=" + ((Boolean) nVar.getValue()).booleanValue() + ", visibleView=" + ((Boolean) ((C36570n) a3).getValue()).booleanValue() + ", overlay=" + OverlayWindowLifecycleOwner.INSTANCE.hasOverlayWindow(), new Object[0]);
                ProcessExplicitBackgroundOwner.INSTANCE.turnOff();
                return true;
            }
            C118672d.m167353c(ProcessExplicitBackgroundOwner.TAG, "turn ON", new Object[0]);
            ProcessExplicitBackgroundOwner.INSTANCE.turnOn();
            return false;
        }
    }

    static {
        ProcessExplicitBackgroundOwner processExplicitBackgroundOwner = new ProcessExplicitBackgroundOwner();
        INSTANCE = processExplicitBackgroundOwner;
        long j = C80444d.f235405a;
        maxCheckInterval = j;
        checkTask = new C80430b(processExplicitBackgroundOwner, TAG, j);
        C32226l<Collection<? extends C28660i>, Boolean> lVar = C28657g0.f78630a;
        new C80406g(C28657g0.f78630a, new IStatefulOwner[]{ProcessUIStartedStateOwner.INSTANCE, ForegroundServiceLifecycleOwner.INSTANCE, OverlayWindowLifecycleOwner.INSTANCE}) {
            public boolean serial() {
                return true;
            }
        }.observeForever(new C80429a());
    }

    private ProcessExplicitBackgroundOwner() {
        super(false, 1, (C8480h) null);
    }

    public boolean active() {
        if (ProcessUIStartedStateOwner.INSTANCE.active()) {
            turnOff();
            return false;
        }
        checkTask.mo21182b();
        return super.active();
    }

    public void addLifecycleCallback(C0125s sVar, C80401d dVar) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(dVar, "callback");
        IBackgroundStatefulOwner.C80384a.m97972a(this, sVar, dVar);
    }

    public void addLifecycleCallback(C0125s sVar, C80404f fVar) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(fVar, "callback");
        throw null;
    }

    public void addLifecycleCallback(C80404f fVar) {
        C87412m.m108594g(fVar, "callback");
        throw null;
    }

    public final long getMaxCheckInterval() {
        return maxCheckInterval;
    }

    public boolean isBackground() {
        return active();
    }

    public void removeLifecycleCallback(C80401d dVar) {
        C87412m.m108594g(dVar, "callback");
        IBackgroundStatefulOwner.C80384a.m97974c(this, dVar);
    }

    public void removeLifecycleCallback(C80404f fVar) {
        C87412m.m108594g(fVar, "callback");
        throw null;
    }

    public final void setMaxCheckInterval(long j) {
        if (j >= TimeUnit.SECONDS.toMillis(10)) {
            maxCheckInterval = j;
            C118672d.m167353c(TAG, "set max check interval as " + j, new Object[0]);
            return;
        }
        throw new IllegalArgumentException("interval should NOT be less than 10s");
    }

    public void addLifecycleCallback(C80401d dVar) {
        C87412m.m108594g(dVar, "callback");
        IBackgroundStatefulOwner.C80384a.m97973b(this, dVar);
    }
}
