package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ry3 */
public class C101837ry3 extends C47465a {

    /* renamed from: d */
    public String f299368d;

    /* renamed from: e */
    public String f299369e;

    /* renamed from: f */
    public String f299370f;

    /* renamed from: g */
    public String f299371g;

    /* renamed from: h */
    public String f299372h;

    /* renamed from: i */
    public String f299373i;

    /* renamed from: j */
    public String f299374j;

    /* renamed from: n */
    public int f299375n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101837ry3)) {
            return false;
        }
        C101837ry3 ry32 = (C101837ry3) aVar;
        return C46238a.m51546a(this.f299368d, ry32.f299368d) && C46238a.m51546a(this.f299369e, ry32.f299369e) && C46238a.m51546a(this.f299370f, ry32.f299370f) && C46238a.m51546a(this.f299371g, ry32.f299371g) && C46238a.m51546a(this.f299372h, ry32.f299372h) && C46238a.m51546a(this.f299373i, ry32.f299373i) && C46238a.m51546a(this.f299374j, ry32.f299374j) && C46238a.m51546a(Integer.valueOf(this.f299375n), Integer.valueOf(ry32.f299375n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f299368d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f299369e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f299370f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f299371g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f299372h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f299373i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f299374j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            aVar.mo74318e(8, this.f299375n);
            return 0;
        } else if (i == 1) {
            String str8 = this.f299368d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f299369e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f299370f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f299371g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f299372h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f299373i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f299374j;
            if (str14 != null) {
                i2 += C52418a.m58683j(7, str14);
            }
            return i2 + C52418a.m58678e(8, this.f299375n);
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
            C101837ry3 ry32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ry32.f299368d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ry32.f299369e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ry32.f299370f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ry32.f299371g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ry32.f299372h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ry32.f299373i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ry32.f299374j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ry32.f299375n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f299368d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Title", str, false);
            aVar.mo71655d(jSONObject, "Desc", this.f299369e, false);
            aVar.mo71655d(jSONObject, "ThumbUrl", this.f299370f, false);
            aVar.mo71655d(jSONObject, "AppID", this.f299371g, false);
            aVar.mo71655d(jSONObject, "UserName", this.f299372h, false);
            aVar.mo71655d(jSONObject, "Path", this.f299373i, false);
            aVar.mo71655d(jSONObject, "WeappIconUrl", this.f299374j, false);
            aVar.mo71655d(jSONObject, "Version", Integer.valueOf(this.f299375n), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
