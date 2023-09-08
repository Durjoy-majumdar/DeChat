package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class h85 extends C47465a {

    /* renamed from: d */
    public long f134509d;

    /* renamed from: e */
    public long f134510e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof h85)) {
            return false;
        }
        h85 h85 = (h85) aVar;
        return C46238a.m51546a(Long.valueOf(this.f134509d), Long.valueOf(h85.f134509d)) && C46238a.m51546a(Long.valueOf(this.f134510e), Long.valueOf(h85.f134510e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f134509d);
            aVar.mo74321h(2, this.f134510e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f134509d) + 0 + C52418a.m58681h(2, this.f134510e);
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
                h85 h85 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    h85.f134509d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    h85.f134510e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f134509d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "FuncsSwitch", valueOf, false);
            aVar.mo71655d(jSONObject, "FuncsUserChoiceSwitch", Long.valueOf(this.f134510e), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
