package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class t35 extends C47465a {

    /* renamed from: d */
    public String f141931d;

    /* renamed from: e */
    public String f141932e;

    /* renamed from: f */
    public String f141933f;

    /* renamed from: g */
    public String f141934g;

    /* renamed from: h */
    public int f141935h;

    /* renamed from: i */
    public String f141936i;

    /* renamed from: j */
    public String f141937j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof t35)) {
            return false;
        }
        t35 t35 = (t35) aVar;
        return C46238a.m51546a(this.f141931d, t35.f141931d) && C46238a.m51546a(this.f141932e, t35.f141932e) && C46238a.m51546a(this.f141933f, t35.f141933f) && C46238a.m51546a(this.f141934g, t35.f141934g) && C46238a.m51546a(Integer.valueOf(this.f141935h), Integer.valueOf(t35.f141935h)) && C46238a.m51546a(this.f141936i, t35.f141936i) && C46238a.m51546a(this.f141937j, t35.f141937j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141931d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f141932e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f141933f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f141934g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f141935h);
            String str5 = this.f141936i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f141937j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f141931d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f141932e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f141933f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f141934g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            int e = i2 + C52418a.m58678e(5, this.f141935h);
            String str11 = this.f141936i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f141937j;
            return str12 != null ? e + C52418a.m58683j(7, str12) : e;
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
            t35 t35 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    t35.f141931d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    t35.f141932e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    t35.f141933f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    t35.f141934g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    t35.f141935h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    t35.f141936i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    t35.f141937j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f141931d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "DocId", str, false);
            aVar.mo71655d(jSONObject, "UserName", this.f141932e, false);
            aVar.mo71655d(jSONObject, "NickName", this.f141933f, false);
            aVar.mo71655d(jSONObject, "AppID", this.f141934g, false);
            aVar.mo71655d(jSONObject, "AppVersion", Integer.valueOf(this.f141935h), false);
            aVar.mo71655d(jSONObject, "BoxInfo", this.f141936i, false);
            aVar.mo71655d(jSONObject, "IconUrl", this.f141937j, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
