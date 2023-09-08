package mf1;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rf1.C12982a;
import rx3.C13598b0;

/* renamed from: mf1.n */
public final class C10843n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ View f32380d;

    /* renamed from: e */
    public final /* synthetic */ View f32381e;

    /* renamed from: f */
    public final /* synthetic */ C10854p f32382f;

    /* renamed from: g */
    public final /* synthetic */ View f32383g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10843n(View view, View view2, C10854p pVar, View view3) {
        super(0);
        this.f32380d = view;
        this.f32381e = view2;
        this.f32382f = pVar;
        this.f32383g = view3;
    }

    public Object invoke() {
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) this.f32380d.findViewById(C0966R.C0970id.n8b);
        TextView textView = (TextView) this.f32380d.findViewById(C0966R.C0970id.n87);
        TextView textView2 = (TextView) this.f32380d.findViewById(C0966R.C0970id.n89);
        View findViewById = this.f32380d.findViewById(C0966R.C0970id.n8d);
        View findViewById2 = this.f32380d.findViewById(C0966R.C0970id.f358075gr2);
        RoundedCornerFrameLayout roundedCornerFrameLayout2 = (RoundedCornerFrameLayout) this.f32380d.findViewById(C0966R.C0970id.d9i);
        TextView textView3 = (TextView) this.f32380d.findViewById(C0966R.C0970id.f358071d92);
        View findViewById3 = this.f32380d.findViewById(C0966R.C0970id.n8c);
        this.f32381e.getGlobalVisibleRect(new Rect());
        C10854p pVar = this.f32382f;
        View view = this.f32383g;
        C87412m.m108593f(view, "normalLayout");
        View view2 = this.f32381e;
        C87412m.m108593f(view2, "expandLayout");
        TextView textView4 = (TextView) this.f32380d.findViewById(C0966R.C0970id.f358074gr1);
        C12982a.m12428w(pVar, view, view2, 0, new C10841m(this.f32381e, this.f32383g), 4, (Object) null);
        C10854p pVar2 = this.f32382f;
        C87412m.m108593f(roundedCornerFrameLayout2, "iconLayout");
        C87412m.m108593f(roundedCornerFrameLayout, "iconLayoutExpand");
        C12982a.m12428w(pVar2, roundedCornerFrameLayout2, roundedCornerFrameLayout, 0, (C32224a) null, 12, (Object) null);
        C10854p pVar3 = this.f32382f;
        C87412m.m108593f(textView3, "titleTv");
        C87412m.m108593f(textView, "titleTvExpand");
        TextView textView5 = textView;
        View view3 = findViewById3;
        TextView textView6 = (TextView) this.f32380d.findViewById(C0966R.C0970id.n88);
        C12982a.m12428w(pVar3, textView3, textView5, 0, (C32224a) null, 12, (Object) null);
        C10854p pVar4 = this.f32382f;
        C87412m.m108593f(textView6, "titleLineTwoTv");
        C87412m.m108593f(textView2, "titleLineTwoTvExpand");
        C12982a.m12428w(pVar4, textView6, textView2, 0, (C32224a) null, 12, (Object) null);
        C10854p pVar5 = this.f32382f;
        C87412m.m108593f(view3, "btn");
        C87412m.m108593f(findViewById, "btnExpand");
        C12982a.m12428w(pVar5, view3, findViewById, 0, (C32224a) null, 12, (Object) null);
        C10854p pVar6 = this.f32382f;
        TextView textView7 = textView4;
        C87412m.m108593f(textView7, "btnTv");
        C87412m.m108593f(findViewById2, "btnTvExpand");
        C12982a.m12428w(pVar6, textView7, findViewById2, 0, (C32224a) null, 12, (Object) null);
        return C13598b0.f38549a;
    }
}
