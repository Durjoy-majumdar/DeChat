package com.tencent.p014mm.plugin.finder.nearby.newlivesquare.adapter.main;

import cn1.C0850k0;
import cn1.C55039o;
import com.tencent.p014mm.p136ui.MMActivity;
import gy3.C87412m;
import jq3.C60896i;
import kotlin.Metadata;
import xm1.C15828e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/HeadLivingItemConvertFactory;", "Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/BaseFactory;", "", "type", "Ljq3/i;", "getItemConvert", "Lcom/tencent/mm/ui/MMActivity;", "context", "Lcom/tencent/mm/ui/MMActivity;", "", "isForceNightMode", "Z", "isLocalCityPage", "commentScene", "I", "<init>", "(Lcom/tencent/mm/ui/MMActivity;ZZI)V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.HeadLivingItemConvertFactory */
public final class HeadLivingItemConvertFactory extends BaseFactory {
    private final int commentScene;
    private final MMActivity context;
    private final boolean isForceNightMode;
    private final boolean isLocalCityPage;

    public HeadLivingItemConvertFactory(MMActivity mMActivity, boolean z, boolean z2, int i) {
        C87412m.m108594g(mMActivity, "context");
        this.context = mMActivity;
        this.isForceNightMode = z;
        this.isLocalCityPage = z2;
        this.commentScene = i;
    }

    public C60896i<?> getItemConvert(int i) {
        return i != -1000 ? i != 1 ? createFinderEmptyConvert() : new C55039o() : new C0850k0((C15828e) null);
    }
}
