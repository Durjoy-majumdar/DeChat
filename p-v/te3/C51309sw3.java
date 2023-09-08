package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sw3 */
public class C51309sw3 extends C47465a {

    /* renamed from: d */
    public String f141804d;

    /* renamed from: e */
    public String f141805e;

    /* renamed from: f */
    public int f141806f;

    /* renamed from: g */
    public String f141807g;

    /* renamed from: h */
    public String f141808h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51309sw3)) {
            return false;
        }
        C51309sw3 sw32 = (C51309sw3) aVar;
        return C46238a.m51546a(this.f141804d, sw32.f141804d) && C46238a.m51546a(this.f141805e, sw32.f141805e) && C46238a.m51546a(Integer.valueOf(this.f141806f), Integer.valueOf(sw32.f141806f)) && C46238a.m51546a(this.f141807g, sw32.f141807g) && C46238a.m51546a(this.f141808h, sw32.f141808h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141804d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f141805e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f141806f);
            String str3 = this.f141807g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f141808h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f141804d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f141805e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f141806f);
            String str7 = this.f141807g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f141808h;
            return str8 != null ? e + C52418a.m58683j(5, str8) : e;
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
            C51309sw3 sw32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                sw32.f141804d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                sw32.f141805e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                sw32.f141806f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                sw32.f141807g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                sw32.f141808h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f141804d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "scope", str, false);
            aVar.mo71655d(jSONObject, "desc", this.f141805e, false);
            aVar.mo71655d(jSONObject, "state", Integer.valueOf(this.f141806f), false);
            aVar.mo71655d(jSONObject, "icon_url", this.f141807g, false);
            aVar.mo71655d(jSONObject, "dark_mode_icon_url", this.f141808h, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
