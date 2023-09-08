package ib1;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectUI;
import com.tencent.p014mm.plugin.facedetect.p045ui.SettingsFacePrintManagerUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ib1.j */
public class C8877j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsFacePrintManagerUI f28145d;

    public C8877j(SettingsFacePrintManagerUI settingsFacePrintManagerUI) {
        this.f28145d = settingsFacePrintManagerUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/facedetect/ui/SettingsFacePrintManagerUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SettingsFacePrintManagerUI settingsFacePrintManagerUI = this.f28145d;
        int i = SettingsFacePrintManagerUI.f12400i;
        settingsFacePrintManagerUI.getClass();
        C115669n.INSTANCE.mo160131h(11390, 3);
        Intent intent = new Intent();
        intent.setClass(settingsFacePrintManagerUI, FaceDetectUI.class);
        intent.putExtra("k_need_signature", true);
        intent.putExtra("k_user_name", C75592q0.m90772b());
        intent.putExtra("k_purpose", 1);
        settingsFacePrintManagerUI.startActivityForResult(intent, 1);
        settingsFacePrintManagerUI.f12405h = false;
        C117292a.m165361g(this, "com/tencent/mm/plugin/facedetect/ui/SettingsFacePrintManagerUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
