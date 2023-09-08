package fz3;

import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import sx3.C26236u;
import tx3.C26314b;

/* renamed from: fz3.c0 */
public final class C24499c0 extends C87413o implements C32224a<String[]> {

    /* renamed from: d */
    public final /* synthetic */ C24501d0 f70017d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24499c0(C24501d0 d0Var) {
        super(0);
        this.f70017d = d0Var;
    }

    public Object invoke() {
        C24501d0 d0Var = this.f70017d;
        C26314b bVar = new C26314b();
        bVar.add(d0Var.f70026a.f70069d);
        C24507k0 k0Var = d0Var.f70027b;
        if (k0Var != null) {
            bVar.add("under-migration:" + k0Var.f70069d);
        }
        for (Map.Entry next : d0Var.f70028c.entrySet()) {
            bVar.add('@' + next.getKey() + XVFSFile.PATH_SEPARATOR_CHAR + ((C24507k0) next.getValue()).f70069d);
        }
        Object[] array = ((C26314b) C26236u.m33718a(bVar)).toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }
}
