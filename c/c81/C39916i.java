package c81;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceProfileUI;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import t71.C48544g;
import tv2.C14096e;

/* renamed from: c81.i */
public final class C39916i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C39904a f107033d;

    public C39916i(C39904a aVar) {
        this.f107033d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f107033d.getActivity() instanceof ExdeviceProfileUI) {
            AppCompatActivity activity = this.f107033d.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI");
            ExdeviceProfileUI exdeviceProfileUI = (ExdeviceProfileUI) activity;
            C14096e.m13447a(17);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(exdeviceProfileUI.f111174e);
            C86709a0.m107529k().f251779b.mo123460f(new C48544g(arrayList2, exdeviceProfileUI.f111168H));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
