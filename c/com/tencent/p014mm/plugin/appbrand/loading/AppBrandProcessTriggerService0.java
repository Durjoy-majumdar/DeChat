package com.tencent.p014mm.plugin.appbrand.loading;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandTaskPreloadReceiver;
import com.tencent.p014mm.plugin.appbrand.task.preload.C84326f;
import gr0.C87318a;
import gr0.C87321b;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\"\u0010\f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006!"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/loading/AppBrandProcessTriggerService0;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "Lrx3/b0;", "onRebind", "onCreate", "", "flags", "startId", "onStartCommand", "", "onUnbind", "onDestroy", "Lgr0/b;", "callback", "Lgr0/b;", "getCallback", "()Lgr0/b;", "setCallback", "(Lgr0/b;)V", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "setIntent", "(Landroid/content/Intent;)V", "<init>", "()V", "Companion", "a", "b", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0 */
public class AppBrandProcessTriggerService0 extends Service {
    public static final C83533b Companion = new C83533b((C8480h) null);
    public static final int IPC_TRIGGER_PRELOAD = 2;
    private static final String TAG = "MicroMsg.AppBrand.AppBrandProcessTriggerService";
    private C87321b callback;
    private Intent intent;

    /* renamed from: com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0$a */
    public final class C83532a extends C87318a.C87319a {
        public C83532a() {
        }

        /* renamed from: Wc */
        public int mo115830Wc(int i) {
            if (i == 0) {
                return 1;
            }
            if (i != 2) {
                return -1;
            }
            new C84326f();
            AppBrandTaskPreloadReceiver.m103893a("PreloadIPCTaskImpl", AppBrandProcessTriggerService0.this.getIntent());
            IPCVoid iPCVoid = IPCVoid.f10316d;
            return 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0$b */
    public static final class C83533b {
        public C83533b(C8480h hVar) {
        }
    }

    public final C87321b getCallback() {
        return this.callback;
    }

    public final Intent getIntent() {
        return this.intent;
    }

    public IBinder onBind(Intent intent2) {
        C87412m.m108594g(intent2, "intent");
        this.intent = intent2;
        return new C83532a();
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onRebind(Intent intent2) {
        super.onRebind(intent2);
    }

    public int onStartCommand(Intent intent2, int i, int i2) {
        return 3;
    }

    public boolean onUnbind(Intent intent2) {
        return true;
    }

    public final void setCallback(C87321b bVar) {
        this.callback = bVar;
    }

    public final void setIntent(Intent intent2) {
        this.intent = intent2;
    }
}
