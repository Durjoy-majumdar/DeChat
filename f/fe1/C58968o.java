package fe1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60208v1;
import o40.C11348f;
import rx3.C13598b0;

/* renamed from: fe1.o */
public final class C58968o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58969q f168678d;

    /* renamed from: e */
    public final /* synthetic */ Exception f168679e;

    /* renamed from: f */
    public final /* synthetic */ int f168680f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58968o(C58969q qVar, Exception exc, int i) {
        super(0);
        this.f168678d = qVar;
        this.f168679e = exc;
        this.f168680f = i;
    }

    public Object invoke() {
        C58969q qVar = this.f168678d;
        Exception exc = this.f168679e;
        qVar.getClass();
        StackTraceElement[] stackTrace = exc.getStackTrace();
        C87412m.m108593f(stackTrace, "e.stackTrace");
        String str = "";
        for (StackTraceElement stackTraceElement : stackTrace) {
            str = str + stackTraceElement + " \n";
        }
        String iR = ((C60208v1) C86312j.m106911c(C60208v1.class)).mo78713iR();
        C58969q qVar2 = this.f168678d;
        String str2 = "[colCount=" + this.f168680f + "]###\n[" + this.f168678d.f168737Z1 + "]###\n[" + this.f168678d.f168736Y1 + "]###\n[" + iR + "]###\n[error: " + str + ']';
        qVar2.getClass();
        C87412m.m108594g(str2, "<set-?>");
        qVar2.f168737Z1 = str2;
        Log.m105924i("LocalFinderContact", this.f168678d.f168737Z1);
        C11348f.C11349a.m11178b(C59319a.f169618b, "KeyContactConvertError", false, (C11348f.C11352b) null, false, false, new C58967n(this.f168678d), 28, (Object) null);
        return C13598b0.f38549a;
    }
}
