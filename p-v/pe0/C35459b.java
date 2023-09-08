package pe0;

import oe0.C47364a;
import og3.C35167b;
import og3.C77007c;

/* renamed from: pe0.b */
public class C35459b implements C35167b {

    /* renamed from: d */
    public final C47364a[] f94882d = {null};

    public C77007c get() {
        C47364a[] aVarArr = this.f94882d;
        C47364a aVar = aVarArr[0];
        if (aVar != null) {
            return aVar;
        }
        synchronized (aVarArr) {
            C47364a[] aVarArr2 = this.f94882d;
            C47364a aVar2 = aVarArr2[0];
            if (aVar2 != null) {
                return aVar2;
            }
            C47364a aVar3 = new C47364a();
            aVarArr2[0] = aVar3;
            return aVar3;
        }
    }
}
