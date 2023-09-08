package wc1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: wc1.n */
public final class C15100n extends C87413o implements C32226l<View, String> {

    /* renamed from: d */
    public static final C15100n f41237d = new C15100n();

    public C15100n() {
        super(1);
    }

    public Object invoke(Object obj) {
        View view = (View) obj;
        C87412m.m108594g(view, LocaleUtil.ITALIAN);
        return view instanceof TextView ? ((TextView) view).getText().toString() : "";
    }
}
