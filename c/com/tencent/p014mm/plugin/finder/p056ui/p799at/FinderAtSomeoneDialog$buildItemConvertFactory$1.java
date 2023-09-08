package com.tencent.p014mm.plugin.finder.p056ui.p799at;

import cq1.C45145f;
import cq1.C57973e;
import cq1.C57975h;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/ui/at/FinderAtSomeoneDialog$buildItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneDialog$buildItemConvertFactory$1 */
public final class FinderAtSomeoneDialog$buildItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ FinderAtSomeoneDialog this$0;

    public FinderAtSomeoneDialog$buildItemConvertFactory$1(FinderAtSomeoneDialog finderAtSomeoneDialog) {
        this.this$0 = finderAtSomeoneDialog;
    }

    public C60896i<?> getItemConvert(int i) {
        return i != 2 ? i != 4 ? new C45145f(this.this$0.f165867s) : new C57973e(this.this$0.f165867s) : new C57975h(this.this$0.f165867s);
    }
}
