package com.tencent.p014mm.plugin.appbrand.task.ipc;

import android.app.Activity;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.luggage.sdk.processes.C80249b;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.app.AppBrandProcessSuicideLogic;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84572p2;
import com.tencent.p014mm.plugin.appbrand.report.C55548a;
import com.tencent.p014mm.plugin.appbrand.report.C84125k;
import com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.concurrent.atomic.AtomicBoolean;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import kotlin.Metadata;
import rx3.C13598b0;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandKillByClientMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandKillByClientMessage */
public final class AppBrandKillByClientMessage extends LuggageClientProcessMessage<AppBrandRuntimeWC> {
    public static final Parcelable.Creator<AppBrandKillByClientMessage> CREATOR = new C84295a();

    /* renamed from: e */
    public final String f246172e;

    /* renamed from: f */
    public final int f246173f;

    /* renamed from: g */
    public final C80249b f246174g;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandKillByClientMessage$a */
    public static final class C84295a implements Parcelable.Creator<AppBrandKillByClientMessage> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AppBrandKillByClientMessage(parcel.readString(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new AppBrandKillByClientMessage[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandKillByClientMessage$b */
    public static final class C84296b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandKillByClientMessage f246175d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandRuntimeWC f246176e;

        public C84296b(AppBrandKillByClientMessage appBrandKillByClientMessage, AppBrandRuntimeWC appBrandRuntimeWC) {
            this.f246175d = appBrandKillByClientMessage;
            this.f246176e = appBrandRuntimeWC;
        }

        public final void run() {
            this.f246175d.mo893c(this.f246176e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandKillByClientMessage$c */
    public static final class C84297c implements Runnable {

        /* renamed from: d */
        public static final C84297c f246177d = new C84297c();

        public final void run() {
            C117407d.INSTANCE.idkeyStat(365, 5, 1, false);
            AtomicBoolean atomicBoolean = AppBrandProcessSuicideLogic.f238430g;
            try {
                KVCommCrossProcessReceiver.m162690b();
                C55548a.m63179d(true);
                C84125k.f245593a.mo116792c("cleanupAndSuicideInWorker", false);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandProcessSuicideLogic", e, "sendKV", new Object[0]);
            }
            Log.appenderFlushSync();
            int myPid = Process.myPid();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(myPid));
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/task/ipc/AppBrandKillByClientMessage$silentKill$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/plugin/appbrand/task/ipc/AppBrandKillByClientMessage$silentKill$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            Object obj2 = new Object();
            C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/task/ipc/AppBrandKillByClientMessage$silentKill$1", "run", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
            System.exit(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(obj2, "com/tencent/mm/plugin/appbrand/task/ipc/AppBrandKillByClientMessage$silentKill$1", "run", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandKillByClientMessage(String str, int i) {
        super(str);
        C87412m.m108594g(str, "appId");
        this.f246172e = str;
        this.f246173f = i;
        this.f246174g = C80249b.values()[i];
    }

    /* renamed from: b */
    public String mo892b() {
        return this.f246172e;
    }

    /* renamed from: d */
    public void mo893c(AppBrandRuntimeWC appBrandRuntimeWC) {
        C13598b0 b0Var;
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        if (!C87412m.m108589b(Looper.getMainLooper(), Looper.myLooper())) {
            ((C119157j) C119157j.f356862d).mo183895z(new C84296b(this, appBrandRuntimeWC));
            return;
        }
        Log.m105924i("MicroMsg.AppBrandKillByClientMessage", "runInLuggageProcess killType:" + this.f246174g + ", web-kernel:" + WebView.getCurrentModuleWebCoreType());
        int ordinal = this.f246174g.ordinal();
        if (ordinal == 1) {
            XWebSdk.clearAllWebViewCache(true);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_account_expired_enable, false)) {
                mo116987e(appBrandRuntimeWC);
                return;
            }
            Activity R = appBrandRuntimeWC.mo113026R();
            if (R != null) {
                C84572p2.f246773a.mo117255a(R);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                mo116987e(appBrandRuntimeWC);
            }
        } else if (ordinal == 3) {
            XWebSdk.clearAllWebViewCache(true);
            mo116987e(appBrandRuntimeWC);
        } else if (ordinal != 4) {
            mo116987e(appBrandRuntimeWC);
        } else {
            Activity R2 = appBrandRuntimeWC.mo113026R();
            if (R2 != null) {
                R2.finish();
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo116987e(AppBrandRuntimeWC appBrandRuntimeWC) {
        Log.m105924i("MicroMsg.AppBrandKillByClientMessage", "silentKill runtime:" + appBrandRuntimeWC.f238147j);
        appBrandRuntimeWC.mo113176H1(C84297c.f246177d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f246172e);
        parcel.writeInt(this.f246173f);
    }
}
