package s70;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner;
import com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner;
import com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner;
import com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner;
import com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner;
import com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner;
import com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner;
import com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner;
import com.tencent.matrix.lifecycle.supervisor.C80481h;
import com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import p723vf.C118672d;
import rx3.C13598b0;

/* renamed from: s70.a */
public final class C90134a {

    /* renamed from: a */
    public static final C90134a f258830a = new C90134a();

    /* renamed from: b */
    public static final String f258831b;

    /* renamed from: s70.a$a */
    public static final class C90135a extends C87413o implements C32228q<String, String, Integer, Boolean> {

        /* renamed from: d */
        public static final C90135a f258832d = new C90135a();

        public C90135a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "process " + ((Integer) obj3) + '-' + ((String) obj2) + " is dying on scene " + ((String) obj), new Object[0]);
            return Boolean.FALSE;
        }
    }

    /* renamed from: s70.a$b */
    public static final class C90136b extends C87413o implements C32229r<String, String, Integer, Boolean, C13598b0> {

        /* renamed from: d */
        public static final C90136b f258833d = new C90136b();

        public C90136b() {
            super(4);
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "process " + ((Integer) obj3) + '-' + ((String) obj2) + " died on scene " + ((String) obj) + ", is LRU Kill? " + ((Boolean) obj4), new Object[0]);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: s70.a$c */
    public static final class C90137c implements C80407h {
        public void off() {
            C118672d.m167353c(C90134a.f258831b, "ForegroundServiceLifecycleOwner: OFF", new Object[0]);
        }

        /* renamed from: on */
        public void mo60742on() {
            C118672d.m167353c(C90134a.f258831b, "ForegroundServiceLifecycleOwner: ON", new Object[0]);
        }
    }

    /* renamed from: s70.a$d */
    public static final class C90138d implements C80407h {
        public void off() {
            String str = C90134a.f258831b;
            StringBuilder sb = new StringBuilder();
            sb.append("OverlayWindowLifecycleOwner: OFF, hasOverlay = ");
            OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = OverlayWindowLifecycleOwner.INSTANCE;
            sb.append(overlayWindowLifecycleOwner.hasOverlayWindow());
            sb.append(", hasVisible = ");
            sb.append(overlayWindowLifecycleOwner.hasVisibleWindow());
            C118672d.m167353c(str, sb.toString(), new Object[0]);
        }

        /* renamed from: on */
        public void mo60742on() {
            String str = C90134a.f258831b;
            StringBuilder sb = new StringBuilder();
            sb.append("OverlayWindowLifecycleOwner: ON, hasOverlay = ");
            OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = OverlayWindowLifecycleOwner.INSTANCE;
            sb.append(overlayWindowLifecycleOwner.hasOverlayWindow());
            sb.append(", hasVisible = ");
            sb.append(overlayWindowLifecycleOwner.hasVisibleWindow());
            C118672d.m167353c(str, sb.toString(), new Object[0]);
        }
    }

    /* renamed from: s70.a$e */
    public static final class C90139e implements C80407h {
        public void off() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "ProcessUIResumedStateOwner: ON_PAUSE -> " + ProcessUIResumedStateOwner.INSTANCE.active(), new Object[0]);
        }

        /* renamed from: on */
        public void mo60742on() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "ProcessUIResumedStateOwner: ON_RESUME -> " + ProcessUIResumedStateOwner.INSTANCE.active(), new Object[0]);
        }
    }

    /* renamed from: s70.a$f */
    public static final class C90140f implements C80407h {
        public void off() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "ProcessUIStartedStateOwner: ON_STOP -> " + ProcessUIStartedStateOwner.INSTANCE.active(), new Object[0]);
        }

        /* renamed from: on */
        public void mo60742on() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "ProcessUIStartedStateOwner: ON_START -> " + ProcessUIStartedStateOwner.INSTANCE.active(), new Object[0]);
        }
    }

    /* renamed from: s70.a$g */
    public static final class C90141g implements C80407h {
        public void off() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "ProcessExplicitBackgroundOwner: OFF -> " + ProcessExplicitBackgroundOwner.INSTANCE.active(), new Object[0]);
        }

        /* renamed from: on */
        public void mo60742on() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "ProcessExplicitBackgroundOwner: ON -> " + ProcessExplicitBackgroundOwner.INSTANCE.active(), new Object[0]);
        }
    }

    /* renamed from: s70.a$h */
    public static final class C90142h implements C80407h {
        public void off() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "ProcessStagedBackgroundOwner: OFF -> " + ProcessStagedBackgroundOwner.INSTANCE.active(), new Object[0]);
        }

        /* renamed from: on */
        public void mo60742on() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "ProcessStagedBackgroundOwner: ON -> " + ProcessStagedBackgroundOwner.INSTANCE.active(), new Object[0]);
        }
    }

    /* renamed from: s70.a$i */
    public static final class C90143i implements C80407h {
        public void off() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "ProcessDeepBackgroundOwner: OFF -> " + ProcessDeepBackgroundOwner.INSTANCE.active(), new Object[0]);
        }

        /* renamed from: on */
        public void mo60742on() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "ProcessDeepBackgroundOwner: ON -> " + ProcessDeepBackgroundOwner.INSTANCE.active(), new Object[0]);
        }
    }

    /* renamed from: s70.a$j */
    public static final class C90144j implements C80407h {
        public void off() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "AppUIForegroundOwner: OFF -> " + AppUIForegroundOwner.INSTANCE.active() + " on scene: " + ProcessSupervisor.f235421k.mo111974a(), new Object[0]);
        }

        /* renamed from: on */
        public void mo60742on() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "AppUIForegroundOwner: ON -> " + AppUIForegroundOwner.INSTANCE.active() + " on scene: " + ProcessSupervisor.f235421k.mo111974a(), new Object[0]);
        }
    }

    /* renamed from: s70.a$k */
    public static final class C90145k implements C80407h {
        public void off() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "AppExplicitBackgroundOwner: OFF -> " + AppExplicitBackgroundOwner.INSTANCE.active(), new Object[0]);
        }

        /* renamed from: on */
        public void mo60742on() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "AppExplicitBackgroundOwner: ON -> " + AppExplicitBackgroundOwner.INSTANCE.active(), new Object[0]);
        }
    }

    /* renamed from: s70.a$l */
    public static final class C90146l implements C80407h {
        public void off() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "AppStagedBackgroundOwner: OFF -> " + AppStagedBackgroundOwner.INSTANCE.active(), new Object[0]);
        }

        /* renamed from: on */
        public void mo60742on() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "AppStagedBackgroundOwner: ON -> " + AppStagedBackgroundOwner.INSTANCE.active(), new Object[0]);
        }
    }

    /* renamed from: s70.a$m */
    public static final class C90147m implements C80407h {
        public void off() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "AppDeepBackgroundOwner: OFF -> " + AppDeepBackgroundOwner.INSTANCE.active(), new Object[0]);
        }

        /* renamed from: on */
        public void mo60742on() {
            String str = C90134a.f258831b;
            C118672d.m167353c(str, "AppDeepBackgroundOwner: ON -> " + AppDeepBackgroundOwner.INSTANCE.active(), new Object[0]);
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("MicroMsg.MemoryCanaryTest >>>>>> ");
        String format = String.format("%-25.25s", Arrays.copyOf(new Object[]{MMApplicationContext.getProcessName()}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        sb.append(format);
        sb.append(" >>>>>>>>>");
        f258831b = sb.toString();
    }

    /* renamed from: a */
    public final void mo124397a() {
        ProcessUIResumedStateOwner.INSTANCE.observeForever(new C90139e());
        ProcessUIStartedStateOwner.INSTANCE.observeForever(new C90140f());
        ProcessExplicitBackgroundOwner.INSTANCE.observeForever(new C90141g());
        ProcessStagedBackgroundOwner.INSTANCE.observeForever(new C90142h());
        ProcessDeepBackgroundOwner.INSTANCE.observeForever(new C90143i());
        AppUIForegroundOwner.INSTANCE.observeForever(new C90144j());
        AppExplicitBackgroundOwner.INSTANCE.observeForever(new C90145k());
        AppStagedBackgroundOwner.INSTANCE.observeForever(new C90146l());
        AppDeepBackgroundOwner.INSTANCE.observeForever(new C90147m());
        ProcessSupervisor processSupervisor = ProcessSupervisor.f235421k;
        C90135a aVar = C90135a.f258832d;
        processSupervisor.getClass();
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((C80481h.C80488e) processSupervisor.f235422a).getClass();
        C80481h.f235477c.add(aVar);
        C90136b bVar = C90136b.f258833d;
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((C80481h.C80488e) processSupervisor.f235422a).getClass();
        C80481h.f235478d.add(bVar);
        ForegroundServiceLifecycleOwner.INSTANCE.observeForever(new C90137c());
        OverlayWindowLifecycleOwner.INSTANCE.observeForever(new C90138d());
    }
}
