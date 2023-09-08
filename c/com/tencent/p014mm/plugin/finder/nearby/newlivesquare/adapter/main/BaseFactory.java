package com.tencent.p014mm.plugin.finder.nearby.newlivesquare.adapter.main;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import ve1.C14590p;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/BaseFactory;", "Ljq3/j;", "Lve1/p;", "createFinderEmptyConvert", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BaseFactory */
public abstract class BaseFactory implements C9500j {
    public final C14590p createFinderEmptyConvert() {
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            throw new RuntimeException("type invalid");
        }
        Log.printInfoStack("RecyclerViewAdapterEx", "type invalid", new Object[0]);
        return new C14590p();
    }

    public abstract /* synthetic */ C60896i<?> getItemConvert(int i);
}
