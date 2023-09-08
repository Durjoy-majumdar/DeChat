package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i5 */
public class C90416i5 extends C47465a {

    /* renamed from: d */
    public String f259566d;

    /* renamed from: e */
    public String f259567e;

    /* renamed from: f */
    public int f259568f;

    /* renamed from: g */
    public int f259569g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90416i5)) {
            return false;
        }
        C90416i5 i5Var = (C90416i5) aVar;
        return C46238a.m51546a(this.f259566d, i5Var.f259566d) && C46238a.m51546a(this.f259567e, i5Var.f259567e) && C46238a.m51546a(Integer.valueOf(this.f259568f), Integer.valueOf(i5Var.f259568f)) && C46238a.m51546a(Integer.valueOf(this.f259569g), Integer.valueOf(i5Var.f259569g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259566d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f259567e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f259568f);
            aVar.mo74318e(4, this.f259569g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f259566d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f259567e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f259568f) + C52418a.m58678e(4, this.f259569g);
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
            C90416i5 i5Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                i5Var.f259566d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                i5Var.f259567e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                i5Var.f259568f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                i5Var.f259569g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f259566d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "appId", str, false);
            aVar.mo71655d(jSONObject, "username", this.f259567e, false);
            aVar.mo71655d(jSONObject, "versionType", Integer.valueOf(this.f259568f), false);
            aVar.mo71655d(jSONObject, "appServiceType", Integer.valueOf(this.f259569g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
