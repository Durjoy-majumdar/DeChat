package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.es3 */
public class C49327es3 extends C47465a {

    /* renamed from: d */
    public int f133103d;

    /* renamed from: e */
    public int f133104e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49327es3)) {
            return false;
        }
        C49327es3 es32 = (C49327es3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133103d), Integer.valueOf(es32.f133103d)) && C46238a.m51546a(Integer.valueOf(this.f133104e), Integer.valueOf(es32.f133104e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133103d);
            aVar.mo74318e(2, this.f133104e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f133103d) + 0 + C52418a.m58678e(2, this.f133104e);
        } else {
            if (i == 2) {
                C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                    if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                        aVar2.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar3 = objArr[0];
                C49327es3 es32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    es32.f133103d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    es32.f133104e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f133103d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "ClientType", valueOf, false);
            aVar.mo71655d(jSONObject, "SubType", Integer.valueOf(this.f133104e), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
