package com.tencent.p014mm.plugin.appbrand;

import android.os.Looper;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.appbrand.app.AppBrandProcessSuicideLogic;
import com.tencent.p014mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$$d;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "<init>", "()V", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent */
public final class AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent extends IEvent {

    /* renamed from: d */
    public static final C81085a f238248d = new C81085a((C8480h) null);

    /* renamed from: e */
    public static final long f238249e = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: f */
    public static long f238250f;

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent$a */
    public static final class C81085a {

        /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent$a$a */
        public static final class C81086a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f238251d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C81086a(boolean z) {
                super(0);
                this.f238251d = z;
            }

            public Object invoke() {
                boolean publish = new AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent().publish();
                boolean z = this.f238251d;
                Log.m105924i("MicroMsg.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent", "callback handled:" + publish);
                if (!publish && C81682d.m100223c() == 0 && z) {
                    AppBrandProcessSuicideLogic.m99381N(AppBrandProcessSuicideLogic$$d.f238444f);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent$a$b */
        public static final class C81087b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f238252d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C81087b(boolean z) {
                super(0);
                this.f238252d = z;
            }

            public Object invoke() {
                String[] strArr = C86709a0.f251722m;
                boolean z = this.f238252d;
                for (int i = 0; i < 5; i++) {
                    String str = MMApplicationContext.getApplicationId() + strArr[i];
                    if (MMApplicationContext.isProcessExist(str)) {
                        C28947a.m38500a(str, new IPCBoolean(z), C29607o1.f80536d, (C32226l) null);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C81085a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo113165a(boolean z) {
            if (!MMApplicationContext.isMainProcess()) {
                C61926c.m72668M(new C81086a(z));
            } else if (Util.ticksToNow(AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f238250f) >= AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f238249e) {
                AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f238250f = Util.currentTicks();
                C81087b bVar = new C81087b(z);
                if (C87412m.m108589b(Looper.getMainLooper(), Looper.myLooper())) {
                    ((C119157j) C119157j.f356862d).mo183871b(new C81088b(bVar), "AppBrandRuntimeSuspendingMMGuardCheckSuspendedEvent");
                    return;
                }
                bVar.invoke();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent$b */
    public static final class C81088b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f238253d;

        public C81088b(C32224a aVar) {
            this.f238253d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f238253d.invoke();
        }
    }
}
