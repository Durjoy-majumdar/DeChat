package uz2;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.p */
public class C65492p extends C47465a {

    /* renamed from: d */
    public String f188455d;

    /* renamed from: e */
    public String f188456e;

    /* renamed from: f */
    public String f188457f;

    /* renamed from: g */
    public String f188458g;

    /* renamed from: h */
    public String f188459h;

    /* renamed from: i */
    public String f188460i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C65492p)) {
            return false;
        }
        C65492p pVar = (C65492p) aVar;
        return C46238a.m51546a(this.f188455d, pVar.f188455d) && C46238a.m51546a(this.f188456e, pVar.f188456e) && C46238a.m51546a(this.f188457f, pVar.f188457f) && C46238a.m51546a(this.f188458g, pVar.f188458g) && C46238a.m51546a(this.f188459h, pVar.f188459h) && C46238a.m51546a(this.f188460i, pVar.f188460i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f188455d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f188456e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f188457f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f188458g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f188459h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f188460i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f188455d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f188456e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f188457f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f188458g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f188459h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f188460i;
            return str12 != null ? i2 + C52418a.m58683j(6, str12) : i2;
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
            C65492p pVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pVar.f188455d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pVar.f188456e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pVar.f188457f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pVar.f188458g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pVar.f188459h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pVar.f188460i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f188455d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "statusDesc", str, false);
            aVar.mo71655d(jSONObject, "statusIconId", this.f188456e, false);
            aVar.mo71655d(jSONObject, "sourceJumpType", this.f188457f, false);
            aVar.mo71655d(jSONObject, "sourceWeAppUserName", this.f188458g, false);
            aVar.mo71655d(jSONObject, "sourceWeAppPagePath", this.f188459h, false);
            aVar.mo71655d(jSONObject, "sourceH5Url", this.f188460i, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
