package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class pl4 extends C47465a {

    /* renamed from: d */
    public int f139827d;

    /* renamed from: e */
    public String f139828e;

    /* renamed from: f */
    public String f139829f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pl4)) {
            return false;
        }
        pl4 pl4 = (pl4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139827d), Integer.valueOf(pl4.f139827d)) && C46238a.m51546a(this.f139828e, pl4.f139828e) && C46238a.m51546a(this.f139829f, pl4.f139829f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139827d);
            String str = this.f139828e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f139829f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139827d) + 0;
            String str3 = this.f139828e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f139829f;
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
            pl4 pl4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                pl4.f139827d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                pl4.f139828e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                pl4.f139829f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f139827d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "status", valueOf, false);
            aVar.mo71655d(jSONObject, "tousername", this.f139828e, false);
            aVar.mo71655d(jSONObject, "privacy_agreement_url", this.f139829f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
