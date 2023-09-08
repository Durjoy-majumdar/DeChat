package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mk */
public class C50413mk extends C47465a {

    /* renamed from: d */
    public String f138075d;

    /* renamed from: e */
    public String f138076e;

    /* renamed from: f */
    public String f138077f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50413mk)) {
            return false;
        }
        C50413mk mkVar = (C50413mk) aVar;
        return C46238a.m51546a(this.f138075d, mkVar.f138075d) && C46238a.m51546a(this.f138076e, mkVar.f138076e) && C46238a.m51546a(this.f138077f, mkVar.f138077f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138075d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f138076e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f138077f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: IconUrl");
        } else if (i == 1) {
            String str4 = this.f138075d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f138076e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f138077f;
            return str6 != null ? i2 + C52418a.m58683j(3, str6) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138075d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: IconUrl");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50413mk mkVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mkVar.f138075d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                mkVar.f138076e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                mkVar.f138077f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f138075d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "IconUrl", str, false);
            aVar.mo71655d(jSONObject, "Descrption", this.f138076e, false);
            aVar.mo71655d(jSONObject, "DescFormat", this.f138077f, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
