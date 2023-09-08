package com.tencent.matrix.lifecycle.owners;

import androidx.lifecycle.C0125s;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.C80404f;
import com.tencent.matrix.lifecycle.C80406g;
import com.tencent.matrix.lifecycle.IBackgroundStatefulOwner;
import com.tencent.matrix.lifecycle.StatefulOwner;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p723vf.C118672d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006*\u0001\u0017\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/owners/ProcessStagedBackgroundOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/IBackgroundStatefulOwner;", "", "active", "", "TAG", "Ljava/lang/String;", "", "value", "maxCheckInterval", "J", "getMaxCheckInterval", "()J", "setMaxCheckInterval", "(J)V", "", "maxCheckTimes", "I", "getMaxCheckTimes", "()I", "setMaxCheckTimes", "(I)V", "com/tencent/matrix/lifecycle/owners/ProcessStagedBackgroundOwner$b", "checkTask", "Lcom/tencent/matrix/lifecycle/owners/ProcessStagedBackgroundOwner$b;", "<init>", "()V", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class ProcessStagedBackgroundOwner extends StatefulOwner implements IBackgroundStatefulOwner {
    public static final ProcessStagedBackgroundOwner INSTANCE;
    private static final String TAG = "Matrix.background.Staged";
    /* access modifiers changed from: private */
    public static final C80435b checkTask;
    private static long maxCheckInterval;
    private static int maxCheckTimes = 20;

    /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner$a */
    public static final class C80434a implements C80406g {
        public void off() {
            ProcessStagedBackgroundOwner processStagedBackgroundOwner = ProcessStagedBackgroundOwner.INSTANCE;
            ProcessStagedBackgroundOwner.checkTask.mo21187g();
            processStagedBackgroundOwner.turnOff();
        }

        /* renamed from: on */
        public void mo60742on() {
            ProcessStagedBackgroundOwner.checkTask.mo21186f();
        }

        public boolean serial() {
            return true;
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner$b */
    public static final class C80435b extends C17661k {
        public C80435b(ProcessStagedBackgroundOwner processStagedBackgroundOwner, String str, long j, int i) {
            super(str, j, i);
        }

        /* renamed from: a */
        public boolean mo21181a() {
            if (ProcessExplicitBackgroundOwner.INSTANCE.active()) {
                boolean c = ProcessUILifecycleOwner.m98000c();
                C118672d.m167353c(ProcessStagedBackgroundOwner.TAG, "hasRunningAppTask? " + c, new Object[0]);
                if (c || ProcessUICreatedStateOwner.INSTANCE.active()) {
                    C118672d.m167353c(ProcessStagedBackgroundOwner.TAG, "turn ON", new Object[0]);
                    ProcessStagedBackgroundOwner.INSTANCE.turnOn();
                    return true;
                }
            }
            C118672d.m167353c(ProcessStagedBackgroundOwner.TAG, "turn off", new Object[0]);
            ProcessStagedBackgroundOwner.INSTANCE.turnOff();
            return false;
        }
    }

    static {
        ProcessStagedBackgroundOwner processStagedBackgroundOwner = new ProcessStagedBackgroundOwner();
        INSTANCE = processStagedBackgroundOwner;
        long j = C80444d.f235405a;
        maxCheckInterval = j;
        checkTask = new C80435b(processStagedBackgroundOwner, TAG, j, 20);
        ProcessExplicitBackgroundOwner.INSTANCE.observeForever(new C80434a());
    }

    private ProcessStagedBackgroundOwner() {
        super(false, 1, (C8480h) null);
    }

    public boolean active() {
        if (!ProcessExplicitBackgroundOwner.INSTANCE.active()) {
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

    public final int getMaxCheckTimes() {
        return maxCheckTimes;
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

    public final void setMaxCheckTimes(int i) {
        if (i > 0) {
            maxCheckTimes = i;
            C118672d.m167353c(TAG, "set max check interval as " + i, new Object[0]);
            return;
        }
        throw new IllegalArgumentException("max check times should be greater than 0");
    }

    public void addLifecycleCallback(C80401d dVar) {
        C87412m.m108594g(dVar, "callback");
        IBackgroundStatefulOwner.C80384a.m97973b(this, dVar);
    }
}
