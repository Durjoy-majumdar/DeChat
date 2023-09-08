package com.tencent.p014mm.plugin.finder.view;

import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87413o;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import rx3.C13598b0;
import ve1.C14492d4;
import ve1.C14495d8;
import ve1.C14590p;
import ve1.C14623r8;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/view/FinderFoldedScrollLayout$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFoldedScrollLayout$buildItemCoverts$1 */
public final class FinderFoldedScrollLayout$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ FinderFoldedScrollLayout this$0;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderFoldedScrollLayout$buildItemCoverts$1$a */
    public static final class C3955a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFoldedScrollLayout f17792d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3955a(FinderFoldedScrollLayout finderFoldedScrollLayout) {
            super(0);
            this.f17792d = finderFoldedScrollLayout;
        }

        public Object invoke() {
            int i = FinderFoldedScrollLayout.f17784q;
            FinderFoldedScrollLayout.f17781n = C31543z5.m39453c();
            this.f17792d.getClass();
            return C13598b0.f38549a;
        }
    }

    public FinderFoldedScrollLayout$buildItemCoverts$1(FinderFoldedScrollLayout finderFoldedScrollLayout) {
        this.this$0 = finderFoldedScrollLayout;
    }

    public C60896i<?> getItemConvert(int i) {
        return i != -100 ? i != 2 ? i != 4 ? new C14590p() : new C14623r8(this.this$0.f17790i) : new C14492d4(this.this$0.f17790i) : new C14495d8(new C3955a(this.this$0));
    }
}
