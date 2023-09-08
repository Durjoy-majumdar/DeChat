package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sx3 */
public class C101844sx3 extends C47465a {

    /* renamed from: d */
    public String f299466d;

    /* renamed from: e */
    public String f299467e;

    /* renamed from: f */
    public String f299468f;

    /* renamed from: g */
    public String f299469g;

    /* renamed from: h */
    public String f299470h;

    /* renamed from: i */
    public String f299471i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101844sx3)) {
            return false;
        }
        C101844sx3 sx32 = (C101844sx3) aVar;
        return C46238a.m51546a(this.f299466d, sx32.f299466d) && C46238a.m51546a(this.f299467e, sx32.f299467e) && C46238a.m51546a(this.f299468f, sx32.f299468f) && C46238a.m51546a(this.f299469g, sx32.f299469g) && C46238a.m51546a(this.f299470h, sx32.f299470h) && C46238a.m51546a(this.f299471i, sx32.f299471i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299466d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299467e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f299468f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f299469g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f299470h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f299471i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f299466d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f299467e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f299468f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f299469g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f299470h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f299471i;
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
            C101844sx3 sx32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    sx32.f299466d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    sx32.f299467e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    sx32.f299468f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    sx32.f299469g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    sx32.f299470h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    sx32.f299471i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f299466d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Title", str, false);
            aVar.mo71655d(jSONObject, "UserName", this.f299467e, false);
            aVar.mo71655d(jSONObject, "HeadUrl", this.f299468f, false);
            aVar.mo71655d(jSONObject, "NickName", this.f299469g, false);
            aVar.mo71655d(jSONObject, "AuthJob", this.f299470h, false);
            aVar.mo71655d(jSONObject, "AuthIcon", this.f299471i, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
