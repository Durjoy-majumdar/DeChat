package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class b64 extends C47465a {

    /* renamed from: d */
    public int f182223d;

    /* renamed from: e */
    public int f182224e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof b64)) {
            return false;
        }
        b64 b64 = (b64) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182223d), Integer.valueOf(b64.f182223d)) && C46238a.m51546a(Integer.valueOf(this.f182224e), Integer.valueOf(b64.f182224e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182223d);
            aVar.mo74318e(2, this.f182224e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f182223d) + 0 + C52418a.m58678e(2, this.f182224e);
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
                b64 b64 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    b64.f182223d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    b64.f182224e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f182223d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "checkCount", valueOf, false);
            aVar.mo71655d(jSONObject, "isFinalCheck", Integer.valueOf(this.f182224e), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
