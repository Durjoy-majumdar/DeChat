package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class b25 extends C47465a {

    /* renamed from: d */
    public String f130917d;

    /* renamed from: e */
    public String f130918e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof b25)) {
            return false;
        }
        b25 b25 = (b25) aVar;
        return C46238a.m51546a(this.f130917d, b25.f130917d) && C46238a.m51546a(this.f130918e, b25.f130918e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130917d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f130918e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f130917d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f130918e;
            return str4 != null ? i2 + C52418a.m58683j(2, str4) : i2;
        } else if (i == 2) {
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
            b25 b25 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                b25.f130917d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                b25.f130918e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f130917d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "commReq", str, false);
            aVar.mo71655d(jSONObject, "requestId", this.f130918e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
