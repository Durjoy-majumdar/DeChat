package en2;

import android.view.View;
import com.tencent.p014mm.plugin.setting.p102ui.setting.permission.BaseSettingPermissionUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: en2.c */
public final class C7769c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseSettingPermissionUI f26264d;

    public C7769c(BaseSettingPermissionUI baseSettingPermissionUI) {
        this.f26264d = baseSettingPermissionUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initTitleView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f26264d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initTitleView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
