package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gu3 */
public class C49613gu3 extends C47465a {

    /* renamed from: d */
    public String f134275d;

    /* renamed from: e */
    public String f134276e;

    /* renamed from: f */
    public String f134277f;

    /* renamed from: g */
    public String f134278g;

    /* renamed from: h */
    public String f134279h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49613gu3)) {
            return false;
        }
        C49613gu3 gu32 = (C49613gu3) aVar;
        return C46238a.m51546a(this.f134275d, gu32.f134275d) && C46238a.m51546a(this.f134276e, gu32.f134276e) && C46238a.m51546a(this.f134277f, gu32.f134277f) && C46238a.m51546a(this.f134278g, gu32.f134278g) && C46238a.m51546a(this.f134279h, gu32.f134279h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134275d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f134276e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f134277f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f134278g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f134279h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f134275d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f134276e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f134277f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f134278g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f134279h;
            return str10 != null ? i2 + C52418a.m58683j(5, str10) : i2;
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
            C49613gu3 gu32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gu32.f134275d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                gu32.f134276e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                gu32.f134277f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                gu32.f134278g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                gu32.f134279h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f134275d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "DocId", str, false);
            aVar.mo71655d(jSONObject, "Title", this.f134276e, false);
            aVar.mo71655d(jSONObject, "Desc", this.f134277f, false);
            aVar.mo71655d(jSONObject, "IconUrl", this.f134278g, false);
            aVar.mo71655d(jSONObject, "Source", this.f134279h, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
