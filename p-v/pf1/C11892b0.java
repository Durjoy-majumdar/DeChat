package pf1;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pf1.b0 */
public final class C11892b0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WeImageView f34753d;

    /* renamed from: e */
    public final /* synthetic */ boolean f34754e;

    /* renamed from: f */
    public final /* synthetic */ int f34755f;

    /* renamed from: g */
    public final /* synthetic */ View f34756g;

    /* renamed from: h */
    public final /* synthetic */ C11918p f34757h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11892b0(WeImageView weImageView, boolean z, int i, View view, C11918p pVar) {
        super(0);
        this.f34753d = weImageView;
        this.f34754e = z;
        this.f34755f = i;
        this.f34756g = view;
        this.f34757h = pVar;
    }

    public Object invoke() {
        this.f34753d.clearColorFilter();
        this.f34753d.setLayerPaint((Paint) null);
        this.f34753d.setIconColor(0);
        if (this.f34754e) {
            int i = this.f34755f;
            if (i != 0) {
                this.f34753d.setIconColor(i);
            }
            View view = this.f34756g;
            if (view != null) {
                view.setBackground((Drawable) null);
            }
        } else {
            C62262d0.f176978a.mo87330w(this.f34753d, this.f34757h);
        }
        return C13598b0.f38549a;
    }
}
