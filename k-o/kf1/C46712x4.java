package kf1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import gy3.C8480h;
import hp3.C87581a;
import ht1.C60216z4;
import je1.C46553z0;
import nj3.C76912y0;
import nr3.C89059e;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C49310eo0;
import te3.C49352ez;
import te3.C50756oz0;

/* renamed from: kf1.x4 */
public final class C46712x4<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ MMActivity f125750a;

    /* renamed from: b */
    public final /* synthetic */ C49310eo0 f125751b;

    /* renamed from: c */
    public final /* synthetic */ C60216z4.C8821a<Integer> f125752c;

    /* renamed from: d */
    public final /* synthetic */ C60216z4.C8821a<Integer> f125753d;

    public C46712x4(MMActivity mMActivity, C49310eo0 eo02, C60216z4.C8821a<Integer> aVar, C60216z4.C8821a<Integer> aVar2) {
        this.f125750a = mMActivity;
        this.f125751b = eo02;
        this.f125752c = aVar;
        this.f125753d = aVar2;
    }

    public Object call(Object obj) {
        String str;
        String str2;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        boolean z = true;
        if (cVar.f256794b == 0 && cVar.f256793a == 0) {
            C49352ez ezVar = ((C50756oz0) cVar.f256796d).f139459d;
            if (ezVar == null || ezVar.f133188j) {
                z = false;
            }
            if (z) {
                MMActivity mMActivity = this.f125750a;
                C76912y0.m92773l(mMActivity, mMActivity.getString(C0966R.string.fq9));
            }
            C49098d51 d512 = this.f125751b.f133026d;
            if (d512 == null || (str = d512.f132126o) == null) {
                str = "";
            }
            C89059e i = new C46553z0(str, (String) null, (byte[]) null, 0, 0, (d512 == null || (str2 = d512.f132122h) == null) ? "" : str2, 1, false, 30, (C8480h) null).mo9225i();
            i.mo123420E(new C46708w4(this.f125753d, this.f125751b, this.f125752c, this.f125750a));
            i.mo11397F(this.f125750a);
            return i;
        }
        C49098d51 d513 = this.f125751b.f133026d;
        int i2 = 3;
        if (!(d513 != null && d513.f132125n == 1)) {
            if (!(d513 != null && d513.f132125n == 3)) {
                C46715z4.f125755a.getClass();
                C46715z4.f125758d = 0;
                C60216z4.C8821a<Integer> aVar = this.f125752c;
                C46715z4.f125755a.getClass();
                aVar.mo6382a(Integer.valueOf(C46715z4.f125758d));
                return C13598b0.f38549a;
            }
        }
        C46715z4 z4Var = C46715z4.f125755a;
        if (d513 == null || d513.f132125n != 1) {
            z = false;
        }
        if (!z) {
            i2 = 10;
        }
        z4Var.getClass();
        C46715z4.f125758d = i2;
        this.f125752c.mo6382a(Integer.valueOf(i2));
        C60216z4.C8821a<Integer> aVar2 = this.f125752c;
        C46715z4.f125755a.getClass();
        aVar2.mo6382a(Integer.valueOf(C46715z4.f125758d));
        return C13598b0.f38549a;
    }
}
