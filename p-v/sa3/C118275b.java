package sa3;

import android.view.View;
import com.tencent.p014mm.plugin.welab.p130ui.WelabAppInfoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import la3.C117468g;
import la3.C117470l;
import na3.C117620h;

/* renamed from: sa3.b */
public class C118275b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WelabAppInfoUI f353516d;

    public C118275b(WelabAppInfoUI welabAppInfoUI) {
        this.f353516d = welabAppInfoUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("WelabAppInfoUI", "open func " + this.f353516d.f347596d);
        C117468g gVar = C117468g.f351552c;
        WelabAppInfoUI welabAppInfoUI = this.f353516d;
        String str = welabAppInfoUI.f347596d;
        C117620h e = gVar.mo182176e(str);
        if (e != null) {
            Log.m105924i("WelabMgr", "use custome opener to open " + str);
            e.dh0(welabAppInfoUI, str);
        } else {
            Log.m105924i("WelabMgr", "use default opener open " + str);
            if (gVar.mo182173b(str).field_Type == 2) {
                C117620h hVar = gVar.f351553a;
                if (hVar != null) {
                    hVar.dh0(welabAppInfoUI, str);
                } else {
                    Log.m105920e("WelabMgr", "defaultWeAppOpener is null!");
                }
            } else {
                Log.m105920e("WelabMgr", "can not find opener for " + str);
            }
        }
        WelabAppInfoUI welabAppInfoUI2 = this.f353516d;
        C117470l.m165698a(welabAppInfoUI2.f347596d, 7, welabAppInfoUI2.f347599g);
        C117292a.m165361g(this, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
