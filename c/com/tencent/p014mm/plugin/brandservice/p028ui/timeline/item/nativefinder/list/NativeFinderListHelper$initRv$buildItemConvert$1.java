package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.nativefinder.list;

import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import px0.C22042g;
import px0.C22055p;
import px0.C22060t;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/brandservice/ui/timeline/item/nativefinder/list/NativeFinderListHelper$initRv$buildItemConvert$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.nativefinder.list.NativeFinderListHelper$initRv$buildItemConvert$1 */
public final class NativeFinderListHelper$initRv$buildItemConvert$1 implements C9500j {
    public final /* synthetic */ C22055p this$0;

    public NativeFinderListHelper$initRv$buildItemConvert$1(C22055p pVar) {
        this.this$0 = pVar;
    }

    public C60896i<?> getItemConvert(int i) {
        C22055p pVar = this.this$0;
        int i2 = C22055p.f62409o;
        return ((Boolean) ((C36570n) pVar.f62427n).getValue()).booleanValue() ? new C22060t() : new C22042g();
    }
}
