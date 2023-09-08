package c81;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceLikeUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: c81.k */
public final class C0433k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C39904a f1058d;

    public C0433k(C39904a aVar) {
        this.f1058d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!Util.isNullOrNil(this.f1058d.f106988d) && !C87412m.m108589b("#", this.f1058d.f106988d)) {
            Intent intent = new Intent(this.f1058d.getActivity(), ExdeviceLikeUI.class);
            String str = this.f1058d.f106989e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            intent.putExtra("app_username", str);
            String str3 = this.f1058d.f106988d;
            if (str3 != null) {
                str2 = str3;
            }
            intent.putExtra("rank_id", str2);
            intent.putExtra("key_is_like_read_only", true);
            AppCompatActivity activity = this.f1058d.getActivity();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppCompatActivity appCompatActivity = activity;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
