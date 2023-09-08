package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hy */
public class C49768hy extends C47465a {

    /* renamed from: d */
    public String f134951d;

    /* renamed from: e */
    public long f134952e;

    /* renamed from: f */
    public String f134953f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49768hy)) {
            return false;
        }
        C49768hy hyVar = (C49768hy) aVar;
        return C46238a.m51546a(this.f134951d, hyVar.f134951d) && C46238a.m51546a(Long.valueOf(this.f134952e), Long.valueOf(hyVar.f134952e)) && C46238a.m51546a(this.f134953f, hyVar.f134953f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134951d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f134952e);
                String str2 = this.f134953f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: key");
        } else if (i == 1) {
            String str3 = this.f134951d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f134952e);
            String str4 = this.f134953f;
            return str4 != null ? h + C52418a.m58683j(3, str4) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134951d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: key");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49768hy hyVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hyVar.f134951d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                hyVar.f134952e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                hyVar.f134953f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f134951d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "key", str, false);
            aVar.mo71655d(jSONObject, "uint_value", Long.valueOf(this.f134952e), false);
            aVar.mo71655d(jSONObject, "text_value", this.f134953f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
