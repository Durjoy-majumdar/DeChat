package n61;

import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeBaseFragment;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p61.C100639a;
import p61.C100652i;
import p61.C100664m;
import rx3.C13598b0;

/* renamed from: n61.k */
public final class C100099k extends C87413o implements C32227p<Integer, C100639a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3HomeBaseFragment f293249d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100099k(EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment) {
        super(2);
        this.f293249d = emojiStoreV3HomeBaseFragment;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        C87412m.m108594g((C100639a) obj2, "dataItem");
        EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment = this.f293249d;
        int i = EmojiStoreV3HomeBaseFragment.f268989C;
        C100664m L = emojiStoreV3HomeBaseFragment.mo127886L();
        L.getClass();
        C100652i.C100653a aVar = C100652i.C100653a.f294868a;
        if (L.f294892j.contains(Integer.valueOf(intValue))) {
            L.notifyItemChanged(intValue, aVar);
        }
        return C13598b0.f38549a;
    }
}
