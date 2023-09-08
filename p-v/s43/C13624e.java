package s43;

import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import rx3.C13598b0;
import sx3.C64186f0;

/* renamed from: s43.e */
public final class C13624e {

    /* renamed from: a */
    public final int f38597a;

    /* renamed from: b */
    public final FragmentActivity f38598b;

    /* renamed from: c */
    public final C32226l<C13621b, C13598b0> f38599c;

    /* renamed from: d */
    public final C32226l<C13620a, C13598b0> f38600d;

    /* renamed from: e */
    public final C32224a<C13598b0> f38601e;

    /* renamed from: f */
    public C13623d f38602f = C13623d.Direct;

    /* renamed from: g */
    public byte[] f38603g;

    /* renamed from: h */
    public String f38604h = "";

    /* renamed from: i */
    public String f38605i;

    /* renamed from: j */
    public int f38606j;

    /* renamed from: k */
    public String f38607k;

    /* renamed from: l */
    public List<String> f38608l;

    public C13624e(int i, FragmentActivity fragmentActivity, C32226l<? super C13621b, C13598b0> lVar, C32226l<? super C13620a, C13598b0> lVar2, C32224a<C13598b0> aVar) {
        C87412m.m108594g(fragmentActivity, "context");
        C87412m.m108594g(lVar, "successCallback");
        C87412m.m108594g(lVar2, "failCallback");
        C87412m.m108594g(aVar, "cancelCallback");
        this.f38597a = i;
        this.f38598b = fragmentActivity;
        this.f38599c = lVar;
        this.f38600d = lVar2;
        this.f38601e = aVar;
        String string = fragmentActivity.getString(C0966R.string.mu_);
        C87412m.m108593f(string, "context.getString(R.stri…in_payment_also_required)");
        this.f38605i = string;
        this.f38607k = "";
        this.f38608l = C64186f0.f181907d;
    }
}
