package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.halfscreen.MMHalfScreenDialogFragment;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingHalfSceenDialogFragment;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroidx/lifecycle/r;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "activityClassName", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "drawerListener", "<init>", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;)V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingHalfSceenDialogFragment */
public final class SettingHalfSceenDialogFragment extends MMHalfScreenDialogFragment {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingHalfSceenDialogFragment(Context context, Intent intent, String str, RecyclerViewDrawerSquares.C45117c cVar) {
        super(context, intent, str, cVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "activityClassName");
    }

    /* renamed from: M */
    public int mo97705M() {
        return (int) (((double) ((Number) ((C36570n) this.f219867i).getValue()).intValue()) * 0.5d);
    }
}
