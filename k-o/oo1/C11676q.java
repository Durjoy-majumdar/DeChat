package oo1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import er1.C7776a;
import er1.C7802g1;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C49359f1;
import te3.C51559uk1;

/* renamed from: oo1.q */
public final class C11676q extends C87413o implements C32227p<Boolean, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f34214d;

    /* renamed from: e */
    public final /* synthetic */ C11625e f34215e;

    /* renamed from: f */
    public final /* synthetic */ C49098d51 f34216f;

    /* renamed from: g */
    public final /* synthetic */ String f34217g;

    /* renamed from: h */
    public final /* synthetic */ boolean f34218h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11676q(String str, C11625e eVar, C49098d51 d512, String str2, boolean z) {
        super(2);
        this.f34214d = str;
        this.f34215e = eVar;
        this.f34216f = d512;
        this.f34217g = str2;
        this.f34218h = z;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C87412m.m108594g((String) obj2, "errString");
        if (booleanValue) {
            String str = this.f34214d;
            C51559uk1 uk12 = this.f34215e.f34104r;
            if (C87412m.m108589b(str, uk12 != null ? uk12.f142894e : null)) {
                C11625e eVar = this.f34215e;
                C51559uk1 uk13 = eVar.f34104r;
                if (uk13 != null) {
                    C49098d51 d512 = this.f34216f;
                    String str2 = this.f34217g;
                    boolean z = this.f34218h;
                    C49359f1 f1Var = uk13.f142912z;
                    if (f1Var != null) {
                        C7776a.m7932b(f1Var);
                    }
                    C7802g1.m7951c(d512, uk13);
                    eVar.mo11536i(str2, d512, z);
                }
                AppCompatActivity appCompatActivity = this.f34215e.f34087a;
                C76912y0.m92768g(appCompatActivity, appCompatActivity.getString(C0966R.string.mg6));
            }
        }
        return C13598b0.f38549a;
    }
}
