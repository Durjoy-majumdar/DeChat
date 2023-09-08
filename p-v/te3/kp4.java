package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class kp4 extends C47465a {

    /* renamed from: d */
    public String f136975d;

    /* renamed from: e */
    public long f136976e;

    /* renamed from: f */
    public String f136977f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof kp4)) {
            return false;
        }
        kp4 kp4 = (kp4) aVar;
        return C46238a.m51546a(this.f136975d, kp4.f136975d) && C46238a.m51546a(Long.valueOf(this.f136976e), Long.valueOf(kp4.f136976e)) && C46238a.m51546a(this.f136977f, kp4.f136977f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136975d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f136976e);
                String str2 = this.f136977f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: key");
        } else if (i == 1) {
            String str3 = this.f136975d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f136976e);
            String str4 = this.f136977f;
            return str4 != null ? h + C52418a.m58683j(3, str4) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f136975d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: key");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            kp4 kp4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                kp4.f136975d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                kp4.f136976e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                kp4.f136977f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f136975d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "key", str, false);
            aVar.mo71655d(jSONObject, "uint_value", Long.valueOf(this.f136976e), false);
            aVar.mo71655d(jSONObject, "text_value", this.f136977f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
