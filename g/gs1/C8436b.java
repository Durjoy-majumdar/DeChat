package gs1;

import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gs1.b */
public final class C8436b extends C87413o implements C32228q<Integer, Integer, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Spannable f27432d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8436b(Spannable spannable) {
        super(3);
        this.f27432d = spannable;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        C87412m.m108594g((String) obj3, "nickname");
        this.f27432d.setSpan(new ForegroundColorSpan(MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d)), intValue, intValue2, 17);
        return C13598b0.f38549a;
    }
}
