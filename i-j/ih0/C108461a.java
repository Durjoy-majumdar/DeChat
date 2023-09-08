package ih0;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.pointers.PFloat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import p492dn.C45426j;

/* renamed from: ih0.a */
public class C108461a {
    /* renamed from: a */
    public static boolean m146962a(PFloat pFloat) {
        Intent registerReceiver = MMApplicationContext.getContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            Log.m105928w("MicroMsg.AiDeviceData", "get battery charge intent is null");
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        boolean z = intExtra == 2 || intExtra == 5;
        int intExtra2 = registerReceiver.getIntExtra(FirebaseAnalytics.C113379b.LEVEL, -1);
        int intExtra3 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra2 >= 0 && intExtra3 > 0) {
            pFloat.value = (((float) intExtra2) * 1.0f) / (((float) intExtra3) * 1.0f);
        }
        Log.m105925i("MicroMsg.AiDeviceData", "get battery charge and level charging[%b] level[%f]", Boolean.valueOf(z), Float.valueOf(pFloat.value));
        return z;
    }

    /* renamed from: b */
    public static int m146963b() {
        AudioManager k = ((C45426j) C86312j.m106911c(C45426j.class)).n40().mo157509k();
        int i = k != null ? k.isWiredHeadsetOn() ? 3 : (k.isBluetoothA2dpOn() || k.isBluetoothScoOn()) ? 4 : k.isSpeakerphoneOn() ? 1 : 2 : 0;
        Log.m105925i("MicroMsg.AiDeviceData", "get current audio mode [%d]", Integer.valueOf(i));
        return i;
    }
}
