package com.tencent.p014mm.plugin.finder.view;

import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.feed.model.C2815r0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import qo3.C77407n;
import rx3.C13598b0;
import ve1.C14629s8;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/view/FinderWordingLayout$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderWordingLayout$buildItemCoverts$1 */
public final class FinderWordingLayout$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ FinderWordingLayout this$0;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderWordingLayout$buildItemCoverts$1$a */
    public static final class C3986a extends C87413o implements C32226l<C2815r0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderWordingLayout f17988d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3986a(FinderWordingLayout finderWordingLayout) {
            super(1);
            this.f17988d = finderWordingLayout;
        }

        public Object invoke(Object obj) {
            C2815r0 r0Var = (C2815r0) obj;
            C87412m.m108594g(r0Var, LocaleUtil.ITALIAN);
            FinderWordingLayout finderWordingLayout = this.f17988d;
            int i = FinderWordingLayout.f17970s;
            C77407n nVar = new C77407n(finderWordingLayout.getContext(), 1, true);
            nVar.mo107569n(C85868k2.m106137b(finderWordingLayout.getContext()).inflate(C0966R.C0971layout.cls, (ViewGroup) null), false);
            nVar.f225771i = new C4172s5(finderWordingLayout);
            nVar.f225782p = new C4180t5(finderWordingLayout, r0Var);
            nVar.mo107573q();
            return C13598b0.f38549a;
        }
    }

    public FinderWordingLayout$buildItemCoverts$1(FinderWordingLayout finderWordingLayout) {
        this.this$0 = finderWordingLayout;
    }

    public C60896i<?> getItemConvert(int i) {
        return new C14629s8(new C3986a(this.this$0));
    }
}
