package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.p136ui.MMActivity;
import er1.C58784w3;
import gy3.C8480h;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import pe3.C89349b;
import ve1.C14445a2;
import ve1.C14590p;
import ve1.C14592p2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo182094d2 = {"com/tencent/mm/plugin/finder/ui/Presenter$buildItemCoverts$1", "Ljq3/j;", "Lpe3/b;", "getLikeBuffer", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.Presenter$buildItemCoverts$1 */
public final class Presenter$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ Presenter this$0;

    public Presenter$buildItemCoverts$1(Presenter presenter) {
        this.this$0 = presenter;
    }

    private final C89349b getLikeBuffer() {
        MMActivity mMActivity = this.this$0.f29961d;
        if (mMActivity instanceof FinderShareFeedDetailUI) {
            return ((FinderShareFeedDetailUI) mMActivity).f17104B;
        }
        return null;
    }

    public C60896i<?> getItemConvert(int i) {
        int i2 = i;
        if (i2 == 2) {
            return new C14445a2(this.this$0, false, 0, false, 14, (C8480h) null);
        }
        if (i2 != 4) {
            C58784w3.f168295a.mo83916b(this.this$0.f17202v, i2);
            return new C14590p();
        }
        Presenter presenter = this.this$0;
        return new C14592p2(presenter.f29969o, presenter, false, 0, false, 28, (C8480h) null);
    }
}
