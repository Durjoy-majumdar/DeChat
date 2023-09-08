package gn2;

import android.view.View;
import com.tencent.p014mm.plugin.setting.p102ui.setting.view.SettingPermissionView;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: gn2.c */
public final class C107866c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingPermissionView f323003d;

    public C107866c(SettingPermissionView settingPermissionView) {
        this.f323003d = settingPermissionView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/view/SettingPermissionView$showDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77407n nVar = this.f323003d.f347188n;
        if (nVar != null) {
            nVar.mo107572p();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/view/SettingPermissionView$showDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
