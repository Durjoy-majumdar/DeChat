package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ez2 */
public class C64353ez2 extends C47465a {

    /* renamed from: d */
    public long f183059d;

    /* renamed from: e */
    public long f183060e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64353ez2)) {
            return false;
        }
        C64353ez2 ez22 = (C64353ez2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f183059d), Long.valueOf(ez22.f183059d)) && C46238a.m51546a(Long.valueOf(this.f183060e), Long.valueOf(ez22.f183060e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f183059d);
            aVar.mo74321h(2, this.f183060e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f183059d) + 0 + C52418a.m58681h(2, this.f183060e);
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
                C64353ez2 ez22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ez22.f183059d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    ez22.f183060e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f183059d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "set_bitmask", valueOf, false);
            aVar.mo71655d(jSONObject, "clear_bitmask", Long.valueOf(this.f183060e), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
