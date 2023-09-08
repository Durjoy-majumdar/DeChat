package je1;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: je1.o1 */
public final class C9356o1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f29225d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9356o1(String str) {
        super(0);
        this.f29225d = str;
    }

    public Object invoke() {
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) String.valueOf(this.f29225d), 1).show();
        return C13598b0.f38549a;
    }
}
