package uz2;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.m1 */
public class C65491m1 extends C47465a {

    /* renamed from: d */
    public String f188449d;

    /* renamed from: e */
    public String f188450e;

    /* renamed from: f */
    public String f188451f;

    /* renamed from: g */
    public int f188452g;

    /* renamed from: h */
    public int f188453h;

    /* renamed from: i */
    public String f188454i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C65491m1)) {
            return false;
        }
        C65491m1 m1Var = (C65491m1) aVar;
        return C46238a.m51546a(this.f188449d, m1Var.f188449d) && C46238a.m51546a(this.f188450e, m1Var.f188450e) && C46238a.m51546a(this.f188451f, m1Var.f188451f) && C46238a.m51546a(Integer.valueOf(this.f188452g), Integer.valueOf(m1Var.f188452g)) && C46238a.m51546a(Integer.valueOf(this.f188453h), Integer.valueOf(m1Var.f188453h)) && C46238a.m51546a(this.f188454i, m1Var.f188454i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f188449d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f188450e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f188451f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f188452g);
            aVar.mo74318e(5, this.f188453h);
            String str4 = this.f188454i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f188449d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f188450e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f188451f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int e = i2 + C52418a.m58678e(4, this.f188452g) + C52418a.m58678e(5, this.f188453h);
            String str8 = this.f188454i;
            return str8 != null ? e + C52418a.m58683j(6, str8) : e;
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
            C65491m1 m1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    m1Var.f188449d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    m1Var.f188450e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    m1Var.f188451f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    m1Var.f188452g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    m1Var.f188453h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    m1Var.f188454i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f188449d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "app_id", str, false);
            aVar.mo71655d(jSONObject, "path", this.f188450e, false);
            aVar.mo71655d(jSONObject, "username", this.f188451f, false);
            aVar.mo71655d(jSONObject, "version_type", Integer.valueOf(this.f188452g), false);
            aVar.mo71655d(jSONObject, "version_num", Integer.valueOf(this.f188453h), false);
            aVar.mo71655d(jSONObject, "icon_url", this.f188454i, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
