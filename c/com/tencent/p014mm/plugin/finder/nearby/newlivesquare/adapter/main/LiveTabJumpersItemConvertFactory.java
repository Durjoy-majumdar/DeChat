package com.tencent.p014mm.plugin.finder.nearby.newlivesquare.adapter.main;

import cn1.C0883x;
import jq3.C60896i;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/LiveTabJumpersItemConvertFactory;", "Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/BaseFactory;", "", "type", "Ljq3/i;", "getItemConvert", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.LiveTabJumpersItemConvertFactory */
public final class LiveTabJumpersItemConvertFactory extends BaseFactory {
    public C60896i<?> getItemConvert(int i) {
        return i == 7 ? new C0883x() : createFinderEmptyConvert();
    }
}
