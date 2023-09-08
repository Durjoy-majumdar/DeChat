package com.tencent.p014mm.plugin.finder.p056ui;

import androidx.fragment.app.Fragment;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import pe1.C35464c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo182094d2 = {"com/tencent/mm/plugin/finder/ui/ViewBindUIC$adapter$1", "Ljq3/j;", "", "type", "Ljq3/i;", "Lpe1/c;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.ViewBindUIC$adapter$1 */
public final class ViewBindUIC$adapter$1 implements C9500j {
    public final /* synthetic */ ViewBindUIC this$0;

    public ViewBindUIC$adapter$1(ViewBindUIC viewBindUIC) {
        this.this$0 = viewBindUIC;
    }

    public C60896i<C35464c<?>> getItemConvert(int i) {
        if (i != 0) {
            return new C56401m4();
        }
        Fragment fragment = this.this$0.getFragment();
        C87412m.m108592e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.SettingFragment");
        return new C56394j4((SettingFragment) fragment);
    }
}
