package d81;

import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: d81.d */
public final class C45287d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ TextView f122665d;

    /* renamed from: e */
    public final /* synthetic */ int f122666e;

    /* renamed from: f */
    public final /* synthetic */ WeImageView f122667f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45287d(TextView textView, int i, WeImageView weImageView) {
        super(0);
        this.f122665d = textView;
        this.f122666e = i;
        this.f122667f = weImageView;
    }

    public Object invoke() {
        TextView textView = this.f122665d;
        if (textView != null) {
            textView.setTextColor(this.f122666e);
        }
        WeImageView weImageView = this.f122667f;
        if (weImageView != null) {
            weImageView.setIconColor(this.f122666e);
        }
        return C13598b0.f38549a;
    }
}
