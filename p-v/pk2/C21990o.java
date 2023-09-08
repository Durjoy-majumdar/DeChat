package pk2;

import android.os.Build;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import hk2.C87542d;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p385u2.C111105a;

/* renamed from: pk2.o */
public final class C21990o implements C87542d {

    /* renamed from: a */
    public final /* synthetic */ RtosWatchLoginUI f62244a;

    public C21990o(RtosWatchLoginUI rtosWatchLoginUI) {
        this.f62244a = rtosWatchLoginUI;
    }

    /* renamed from: a */
    public void mo33903a(int i) {
        Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "so download progress " + i);
        RtosWatchLoginUI rtosWatchLoginUI = this.f62244a;
        rtosWatchLoginUI.f53351H.postUI(new C21994s(rtosWatchLoginUI, i));
    }

    /* renamed from: b */
    public void mo33904b(int i) {
        if (i == 0) {
            Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "onSoResCheck success");
            Log.m105918d("MicroMsg.Rtos.RtosWatchLoginUI", "remove message 1001");
            Log.m105918d("MicroMsg.Rtos.RtosWatchLoginUI", "send message 1003");
            this.f62244a.f53351H.removeMessages(1001);
            this.f62244a.f53351H.sendEmptyMessage(1003);
            if (Build.VERSION.SDK_INT >= 31) {
                boolean z = C111105a.m151499a(this.f62244a, "android.permission.BLUETOOTH_SCAN") == 0;
                boolean z2 = C111105a.m151499a(this.f62244a, "android.permission.BLUETOOTH_ADVERTISE") == 0;
                boolean z3 = C111105a.m151499a(this.f62244a, "android.permission.BLUETOOTH_CONNECT") == 0;
                Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "SDK_INT >= 31 hasScan:" + z + " hasAdvertise:" + z2 + " hasConnect:" + z3);
                if (C111105a.m151499a(this.f62244a, "android.permission.BLUETOOTH_CONNECT") != 0) {
                    Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "request BLUETOOTH_CONNECT");
                    RtosWatchLoginUI rtosWatchLoginUI = this.f62244a;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8848);
                    aVar.mo10233c(new String[]{"android.permission.BLUETOOTH_CONNECT"});
                    RtosWatchLoginUI rtosWatchLoginUI2 = rtosWatchLoginUI;
                    C117292a.m165358d(rtosWatchLoginUI2, aVar.mo10232b(), "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$startCheckSoRes$1", "onSoResCheck", "(I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                    rtosWatchLoginUI.requestPermissions((String[]) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(rtosWatchLoginUI2, "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$startCheckSoRes$1", "onSoResCheck", "(I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                } else if (!z || !z2 || !z3) {
                    this.f62244a.mo24202J7();
                } else {
                    Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "still need to request BLUETOOTH_CONNECT");
                    RtosWatchLoginUI rtosWatchLoginUI3 = this.f62244a;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8848);
                    aVar2.mo10233c(new String[]{"android.permission.BLUETOOTH_CONNECT"});
                    RtosWatchLoginUI rtosWatchLoginUI4 = rtosWatchLoginUI3;
                    C117292a.m165358d(rtosWatchLoginUI4, aVar2.mo10232b(), "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$startCheckSoRes$1", "onSoResCheck", "(I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                    rtosWatchLoginUI3.requestPermissions((String[]) aVar2.mo10231a(0), ((Integer) aVar2.mo10231a(1)).intValue());
                    C117292a.m165359e(rtosWatchLoginUI4, "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$startCheckSoRes$1", "onSoResCheck", "(I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                }
            } else {
                this.f62244a.mo24202J7();
            }
        } else {
            Log.m105920e("MicroMsg.Rtos.RtosWatchLoginUI", "onSoResCheck Fail");
            Log.m105918d("MicroMsg.Rtos.RtosWatchLoginUI", "send message 1002");
            this.f62244a.f53351H.sendEmptyMessage(1002);
        }
    }
}
