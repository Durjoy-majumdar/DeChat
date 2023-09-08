package gs1;

import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gs1.j */
public final class C8450j extends C87413o implements C32227p<Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Spannable f27456d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8450j(Spannable spannable) {
        super(2);
        this.f27456d = spannable;
    }

    public Object invoke(Object obj, Object obj2) {
        this.f27456d.setSpan(new ForegroundColorSpan(MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d)), ((Number) obj).intValue(), ((Number) obj2).intValue(), 17);
        return C13598b0.f38549a;
    }
}
