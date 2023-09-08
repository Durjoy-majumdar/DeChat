package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class zo4 extends C47465a {

    /* renamed from: d */
    public String f146154d;

    /* renamed from: e */
    public String f146155e;

    /* renamed from: f */
    public String f146156f;

    /* renamed from: g */
    public String f146157g;

    /* renamed from: h */
    public String f146158h;

    /* renamed from: i */
    public String f146159i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof zo4)) {
            return false;
        }
        zo4 zo4 = (zo4) aVar;
        return C46238a.m51546a(this.f146154d, zo4.f146154d) && C46238a.m51546a(this.f146155e, zo4.f146155e) && C46238a.m51546a(this.f146156f, zo4.f146156f) && C46238a.m51546a(this.f146157g, zo4.f146157g) && C46238a.m51546a(this.f146158h, zo4.f146158h) && C46238a.m51546a(this.f146159i, zo4.f146159i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f146154d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f146155e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f146155e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f146156f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f146157g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                String str5 = this.f146158h;
                if (str5 != null) {
                    aVar.mo74323j(5, str5);
                }
                String str6 = this.f146159i;
                if (str6 != null) {
                    aVar.mo74323j(6, str6);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: MatchWord");
            }
        } else if (i == 1) {
            String str7 = this.f146154d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f146155e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f146156f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f146157g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f146158h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f146159i;
            return str12 != null ? i2 + C52418a.m58683j(6, str12) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f146154d == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f146155e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: MatchWord");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            zo4 zo4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zo4.f146154d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    zo4.f146155e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    zo4.f146156f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zo4.f146157g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zo4.f146158h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    zo4.f146159i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f146154d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "UserName", str, false);
            aVar.mo71655d(jSONObject, "MatchWord", this.f146155e, false);
            aVar.mo71655d(jSONObject, "NickName", this.f146156f, false);
            aVar.mo71655d(jSONObject, "Remark", this.f146157g, false);
            aVar.mo71655d(jSONObject, "Alias", this.f146158h, false);
            aVar.mo71655d(jSONObject, "Description", this.f146159i, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
