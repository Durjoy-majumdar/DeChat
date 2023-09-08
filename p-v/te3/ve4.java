package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ve4 extends C47465a {

    /* renamed from: d */
    public String f185876d;

    /* renamed from: e */
    public String f185877e;

    /* renamed from: f */
    public int f185878f;

    /* renamed from: g */
    public int f185879g;

    /* renamed from: h */
    public String f185880h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ve4)) {
            return false;
        }
        ve4 ve4 = (ve4) aVar;
        return C46238a.m51546a(this.f185876d, ve4.f185876d) && C46238a.m51546a(this.f185877e, ve4.f185877e) && C46238a.m51546a(Integer.valueOf(this.f185878f), Integer.valueOf(ve4.f185878f)) && C46238a.m51546a(Integer.valueOf(this.f185879g), Integer.valueOf(ve4.f185879g)) && C46238a.m51546a(this.f185880h, ve4.f185880h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185876d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185877e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f185878f);
            aVar.mo74318e(4, this.f185879g);
            String str3 = this.f185880h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f185876d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f185877e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f185878f) + C52418a.m58678e(4, this.f185879g);
            String str6 = this.f185880h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            ve4 ve4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ve4.f185876d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ve4.f185877e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ve4.f185878f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                ve4.f185879g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ve4.f185880h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f185876d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "PublishUsername", str, false);
            aVar.mo71655d(jSONObject, "CommentUserName", this.f185877e, false);
            aVar.mo71655d(jSONObject, "Source", Integer.valueOf(this.f185878f), false);
            aVar.mo71655d(jSONObject, "ContentType", Integer.valueOf(this.f185879g), false);
            aVar.mo71655d(jSONObject, "ContentID", this.f185880h, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
