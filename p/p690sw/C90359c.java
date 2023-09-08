package p690sw;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.tencent.p014mm.recoveryv2.C85675e;
import com.tencent.p014mm.recoveryv2.RecoveryCrash;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.recovery.p477wx.service.WXRecoveryUploadService;
import di3.C86301e;
import ei3.C86522b;
import p705tw.C37284b;

@C86522b
/* renamed from: sw.c */
public class C90359c extends C86301e implements C37284b {
    public void K50(Context context) {
        Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "setLaunchRecovery, dump recovery status:");
        RecoveryCrash b = RecoveryCrash.m105765b(context);
        Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "crash count   = " + b.f249629d.f250884a);
        Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "crash time    = " + b.f249626a);
        Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "crash version = " + b.f249627b);
        Bundle bundle = new Bundle();
        SharedPreferences sharedPreferences = context.getSharedPreferences("recovery_enable", 4);
        if (sharedPreferences != null) {
            boolean z = bundle.containsKey("enable") ? bundle.getBoolean("enable") : sharedPreferences.getBoolean("enable", true);
            Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "setting enable       = " + z);
            C85675e eVar = new C85675e(context);
            Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "setting threshold 1  = " + eVar.f249646a);
            Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "setting threshold 2  = " + eVar.f249647b);
            Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "setting interval     = " + eVar.f249648c);
            Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "setting min interval = " + eVar.f249650e);
            Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "setting auto reset   = " + eVar.f249651f);
            Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "setLaunchRecovery, main process will crash immediately");
            RecoveryCrash b2 = RecoveryCrash.m105765b(context);
            b2.f249629d.f250884a = eVar.f249646a;
            b2.f249626a = System.currentTimeMillis();
            b2.mo119230e();
            Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "setting new recovery status:");
            RecoveryCrash b3 = RecoveryCrash.m105765b(context);
            Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "crash count   = " + b3.f249629d.f250884a);
            Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "crash time    = " + b3.f249626a);
            Log.m105928w("MicroMsg.Recovery.RecoveryHelper", "crash version = " + b3.f249627b);
            throw new RuntimeException("setLaunchRecovery");
        }
        throw new IllegalStateException("Persis#load() has not yet been called");
    }

    public void Zq0(Context context, String str) {
        WXRecoveryUploadService.fetchTinkerPatch(context, str);
    }
}
