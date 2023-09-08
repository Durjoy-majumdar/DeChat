package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.je0 */
public class C64467je0 extends C47465a {

    /* renamed from: d */
    public String f183790d;

    /* renamed from: e */
    public String f183791e;

    /* renamed from: f */
    public boolean f183792f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64467je0)) {
            return false;
        }
        C64467je0 je02 = (C64467je0) aVar;
        return C46238a.m51546a(this.f183790d, je02.f183790d) && C46238a.m51546a(this.f183791e, je02.f183791e) && C46238a.m51546a(Boolean.valueOf(this.f183792f), Boolean.valueOf(je02.f183792f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183790d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183791e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74314a(3, this.f183792f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f183790d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f183791e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58674a(3, this.f183792f);
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
            C64467je0 je02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                je02.f183790d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                je02.f183791e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                je02.f183792f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f183790d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "id", str, false);
            aVar.mo71655d(jSONObject, "wording", this.f183791e, false);
            aVar.mo71655d(jSONObject, "isUseToConfirm", Boolean.valueOf(this.f183792f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
