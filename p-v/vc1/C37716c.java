package vc1;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: vc1.c */
public final class C37716c extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f99917d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37716c(int i) {
        super(1);
        this.f99917d = i;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C37715b.f99915b = false;
        if (booleanValue) {
            C37715b bVar = C37715b.f99914a;
            ((MultiProcessMMKV) ((C36570n) C37715b.f99916c).getValue()).putInt("live_status_flag", this.f99917d);
        }
        return C13598b0.f38549a;
    }
}
