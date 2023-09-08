package vz2;

import com.tencent.p014mm.sdk.platformtools.Log;
import dm2.C58325i;
import p749xh.C38549d8;
import pe3.C47465a;
import rx3.C13598b0;
import uz2.C78318v1;
import zt3.C119157j;

/* renamed from: vz2.c */
public final class C78500c<T extends C47465a> implements C58325i {

    /* renamed from: a */
    public final /* synthetic */ String f229941a;

    /* renamed from: b */
    public final /* synthetic */ Long f229942b;

    /* renamed from: c */
    public final /* synthetic */ String f229943c;

    /* renamed from: d */
    public final /* synthetic */ String f229944d;

    public C78500c(String str, Long l, String str2, String str3) {
        this.f229941a = str;
        this.f229942b = l;
        this.f229943c = str2;
        this.f229944d = str3;
    }

    /* renamed from: a */
    public void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
        C13598b0 b0Var;
        C78318v1 v1Var = (C78318v1) aVar;
        Log.m105924i("MicroMsg.TextStatus.tsReport", "postReport onActionDone " + i + ' ' + z + ' ' + this.f229941a);
        if (v1Var != null) {
            Long l = this.f229942b;
            String str = this.f229943c;
            String str2 = this.f229944d;
            ((C119157j) C119157j.f356862d).mo183875f(new C78503e(v1Var, l, str, str2));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.TextStatus.tsReport", "postReport: postData is null, " + this.f229941a + ", " + this.f229942b);
        }
    }
}
