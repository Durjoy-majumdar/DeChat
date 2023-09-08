package je0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import g62.C75875l;
import gy3.C87412m;
import gy3.C87413o;
import ie0.C46220j;
import ie0.C46225p;
import rx3.C13598b0;

/* renamed from: je0.k0 */
public final class C46483k0 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f125229d;

    /* renamed from: e */
    public final /* synthetic */ C46220j f125230e;

    /* renamed from: f */
    public final /* synthetic */ Context f125231f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46483k0(C32226l<? super Boolean, C13598b0> lVar, C46220j jVar, Context context) {
        super(1);
        this.f125229d = lVar;
        this.f125230e = jVar;
        this.f125231f = context;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.f125229d.invoke(Boolean.valueOf(booleanValue));
        if (booleanValue) {
            C46220j jVar = this.f125230e;
            String str = jVar.field_username;
            if (str == null) {
                str = "";
            }
            String string = this.f125231f.getString(C0966R.string.m8m, new Object[]{jVar.field_nickname});
            C87412m.m108593f(string, "context.getString(\n     …ame\n                    )");
            C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108733M2(C31543z5.m39451a());
            f4Var.mo108749c3(str);
            f4Var.mo108732L2(string);
            f4Var.setType(10000);
            ((C72972g4) LE).my0(f4Var);
            C46220j jVar2 = this.f125230e;
            jVar2.field_needReport = false;
            C46225p.m51525c(jVar2);
        }
        return C13598b0.f38549a;
    }
}
