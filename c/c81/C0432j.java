package c81;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.exdevice.p042ui.SportHistoryUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: c81.j */
public final class C0432j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C39904a f1056d;

    /* renamed from: e */
    public final /* synthetic */ String f1057e;

    public C0432j(C39904a aVar, String str) {
        this.f1056d = aVar;
        this.f1057e = str;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C39904a aVar = this.f1056d;
        String str = this.f1057e;
        aVar.getClass();
        Intent intent = new Intent(aVar.getActivity(), SportHistoryUI.class);
        intent.putExtra("username", str);
        AppCompatActivity activity = aVar.getActivity();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        AppCompatActivity appCompatActivity = activity;
        C117292a.m165358d(appCompatActivity, aVar2.mo10232b(), "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC", "startSportHistoryActivity", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC", "startSportHistoryActivity", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
