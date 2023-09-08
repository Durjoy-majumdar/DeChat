package c81;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceFollowsUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: c81.h */
public final class C0431h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C39904a f1055d;

    public C0431h(C39904a aVar) {
        this.f1055d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(this.f1055d.getActivity(), ExdeviceFollowsUI.class);
        AppCompatActivity activity = this.f1055d.getActivity();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = activity;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
