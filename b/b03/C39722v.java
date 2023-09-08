package b03;

import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import vl3.C102226d;

/* renamed from: b03.v */
public final class C39722v extends C87413o implements C32226l<CharSequence, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ TextView f106576d;

    /* renamed from: e */
    public final /* synthetic */ CharSequence f106577e;

    /* renamed from: f */
    public final /* synthetic */ int f106578f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<CharSequence, C13598b0> f106579g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39722v(TextView textView, CharSequence charSequence, int i, C32226l<? super CharSequence, C13598b0> lVar) {
        super(1);
        this.f106576d = textView;
        this.f106577e = charSequence;
        this.f106578f = i;
        this.f106579g = lVar;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((CharSequence) obj, LocaleUtil.ITALIAN);
        this.f106576d.setText(C102226d.m134696a(MMApplicationContext.getContext(), this.f106577e));
        this.f106576d.setMaxLines(this.f106578f);
        C32226l<CharSequence, C13598b0> lVar = this.f106579g;
        if (lVar != null) {
            lVar.invoke(this.f106577e);
        }
        return C13598b0.f38549a;
    }
}
