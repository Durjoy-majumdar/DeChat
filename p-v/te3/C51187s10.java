package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s10 */
public class C51187s10 extends C47465a {

    /* renamed from: d */
    public int f141260d;

    /* renamed from: e */
    public String f141261e;

    /* renamed from: f */
    public String f141262f;

    /* renamed from: g */
    public String f141263g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51187s10)) {
            return false;
        }
        C51187s10 s102 = (C51187s10) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141260d), Integer.valueOf(s102.f141260d)) && C46238a.m51546a(this.f141261e, s102.f141261e) && C46238a.m51546a(this.f141262f, s102.f141262f) && C46238a.m51546a(this.f141263g, s102.f141263g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141260d);
            String str = this.f141261e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f141262f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f141263g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141260d) + 0;
            String str4 = this.f141261e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f141262f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f141263g;
            return str6 != null ? e + C52418a.m58683j(4, str6) : e;
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
            C51187s10 s102 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s102.f141260d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                s102.f141261e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                s102.f141262f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                s102.f141263g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f141260d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BrandFlag", valueOf, false);
            aVar.mo71655d(jSONObject, "ExternalInfo", this.f141261e, false);
            aVar.mo71655d(jSONObject, "BrandInfo", this.f141262f, false);
            aVar.mo71655d(jSONObject, "BrandIconURL", this.f141263g, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
