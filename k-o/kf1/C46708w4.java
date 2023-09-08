package kf1;

import com.tencent.p014mm.p136ui.MMActivity;
import hp3.C87581a;
import ht1.C60216z4;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C49310eo0;
import te3.C49352ez;
import te3.C50920q61;

/* renamed from: kf1.w4 */
public final class C46708w4<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C60216z4.C8821a<Integer> f125742a;

    /* renamed from: b */
    public final /* synthetic */ C49310eo0 f125743b;

    /* renamed from: c */
    public final /* synthetic */ C60216z4.C8821a<Integer> f125744c;

    /* renamed from: d */
    public final /* synthetic */ MMActivity f125745d;

    public C46708w4(C60216z4.C8821a<Integer> aVar, C49310eo0 eo02, C60216z4.C8821a<Integer> aVar2, MMActivity mMActivity) {
        this.f125742a = aVar;
        this.f125743b = eo02;
        this.f125744c = aVar2;
        this.f125745d = mMActivity;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256794b == 0 && cVar.f256793a == 0) {
            C49352ez ezVar = ((C50920q61) cVar.f256796d).f140162d;
            if (ezVar != null) {
                C61926c.m72668M(new C10011v4(this.f125745d, ezVar, this.f125743b));
                C60216z4.C8821a<Integer> aVar = this.f125742a;
                C46715z4.f125755a.getClass();
                aVar.mo6382a(Integer.valueOf(C46715z4.f125758d));
            }
        } else {
            C49098d51 d512 = this.f125743b.f133026d;
            boolean z = true;
            int i = 3;
            if (!(d512 != null && d512.f132125n == 1)) {
                if (!(d512 != null && d512.f132125n == 3)) {
                    C46715z4.f125755a.getClass();
                    C46715z4.f125758d = 0;
                    C60216z4.C8821a<Integer> aVar2 = this.f125744c;
                    C46715z4.f125755a.getClass();
                    aVar2.mo6382a(Integer.valueOf(C46715z4.f125758d));
                }
            }
            C46715z4 z4Var = C46715z4.f125755a;
            if (d512 == null || d512.f132125n != 1) {
                z = false;
            }
            if (!z) {
                i = 10;
            }
            z4Var.getClass();
            C46715z4.f125758d = i;
            this.f125744c.mo6382a(Integer.valueOf(i));
            C60216z4.C8821a<Integer> aVar22 = this.f125744c;
            C46715z4.f125755a.getClass();
            aVar22.mo6382a(Integer.valueOf(C46715z4.f125758d));
        }
        return C13598b0.f38549a;
    }
}
