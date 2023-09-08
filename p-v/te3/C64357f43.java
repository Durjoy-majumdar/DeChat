package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f43 */
public class C64357f43 extends C47465a {

    /* renamed from: d */
    public int f183078d;

    /* renamed from: e */
    public String f183079e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64357f43)) {
            return false;
        }
        C64357f43 f432 = (C64357f43) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183078d), Integer.valueOf(f432.f183078d)) && C46238a.m51546a(this.f183079e, f432.f183079e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183078d);
            String str = this.f183079e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183078d) + 0;
            String str2 = this.f183079e;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
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
            C64357f43 f432 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                f432.f183078d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                f432.f183079e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f183078d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "eventType", valueOf, false);
            aVar.mo71655d(jSONObject, "eventData", this.f183079e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
