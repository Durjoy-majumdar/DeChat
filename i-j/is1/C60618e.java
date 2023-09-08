package is1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C60200t1;
import l60.C99344b;
import p151er.C107289t;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import uc1.C14153w;
import up1.C27696y;
import x60.C15627c;

@C86522b
/* renamed from: is1.e */
public final class C60618e extends C86301e implements C107289t {
    /* renamed from: JI */
    public int mo85564JI() {
        return 3;
    }

    /* renamed from: KX */
    public WeImageView mo85565KX(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.iiz);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.red_dot_highlight_icon)");
        return (WeImageView) findViewById;
    }

    /* renamed from: Oo */
    public TextView mo85566Oo(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.f359043ij0);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.red_dot_highlight_title)");
        return (TextView) findViewById;
    }

    public View Pk0(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.iiy);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.r…_dot_highlight_container)");
        return findViewById;
    }

    /* renamed from: Q8 */
    public int mo85568Q8(Context context, AttributeSet attributeSet) {
        C87412m.m108594g(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14153w.f39586e);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…ble.FinderRedDotTextView)");
        try {
            return obtainStyledAttributes.getDimensionPixelSize(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public int T00() {
        return 1;
    }

    public TextView fj0(View view) {
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.f359045ij2);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.red_dot_title)");
        return (TextView) findViewById;
    }

    /* renamed from: lK */
    public void mo85571lK(Context context, ViewGroup viewGroup) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "rootView");
        C85868k2.m106137b(context).inflate(C0966R.C0971layout.bqz, viewGroup, true);
    }

    public C99344b<? extends C15627c, Bitmap> lo0(String str) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        return ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.THUMB_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.LINK_THUMB));
    }

    /* renamed from: nG */
    public int mo85573nG() {
        return 2;
    }
}
