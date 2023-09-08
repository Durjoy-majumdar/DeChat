package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.storage.C19623o0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c1 */
public final class C18224c1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f50372d;

    /* renamed from: e */
    public final /* synthetic */ BizTLRecCardItem f50373e;

    /* renamed from: f */
    public final /* synthetic */ String f50374f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18224c1(C19623o0 o0Var, BizTLRecCardItem bizTLRecCardItem, String str) {
        super(0);
        this.f50372d = o0Var;
        this.f50373e = bizTLRecCardItem;
        this.f50374f = str;
    }

    public Object invoke() {
        int i = this.f50372d.f55530o1.f64521j;
        if ((i == 3 || i == 5) && C18355t.f50835a) {
            Button button = this.f50373e.f50318m;
            if (button != null) {
                button.setVisibility(0);
                BizTLRecCardItem bizTLRecCardItem = this.f50373e;
                Button button2 = bizTLRecCardItem.f50318m;
                if (button2 != null) {
                    button2.setOnClickListener(new C68774b1(bizTLRecCardItem, this.f50374f, this.f50372d));
                    TextView textView = this.f50373e.f50317l;
                    if (textView != null) {
                        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            layoutParams2.setMargins(C76577a.m92151b(this.f50373e.f50309d, 8), 0, C76577a.m92151b(this.f50373e.f50309d, 80), 0);
                        }
                        TextView textView2 = this.f50373e.f50317l;
                        if (textView2 != null) {
                            textView2.setLayoutParams(layoutParams);
                        } else {
                            C87412m.m108603p("profileReasonTv");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("profileReasonTv");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("followType3");
                    throw null;
                }
            } else {
                C87412m.m108603p("followType3");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
