package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ye4 extends C47465a {

    /* renamed from: d */
    public int f186506d;

    /* renamed from: e */
    public String f186507e;

    /* renamed from: f */
    public String f186508f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ye4)) {
            return false;
        }
        ye4 ye4 = (ye4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186506d), Integer.valueOf(ye4.f186506d)) && C46238a.m51546a(this.f186507e, ye4.f186507e) && C46238a.m51546a(this.f186508f, ye4.f186508f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186506d);
            String str = this.f186507e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f186508f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186506d) + 0;
            String str3 = this.f186507e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f186508f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
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
            ye4 ye4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ye4.f186506d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ye4.f186507e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ye4.f186508f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f186506d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "TagType", valueOf, false);
            aVar.mo71655d(jSONObject, "TagText", this.f186507e, false);
            aVar.mo71655d(jSONObject, "TagExtValue", this.f186508f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
