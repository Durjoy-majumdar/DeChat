package uz2;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.t */
public class C78316t extends C47465a {

    /* renamed from: d */
    public String f229443d;

    /* renamed from: e */
    public String f229444e;

    /* renamed from: f */
    public String f229445f;

    /* renamed from: g */
    public boolean f229446g;

    /* renamed from: h */
    public boolean f229447h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78316t)) {
            return false;
        }
        C78316t tVar = (C78316t) aVar;
        return C46238a.m51546a(this.f229443d, tVar.f229443d) && C46238a.m51546a(this.f229444e, tVar.f229444e) && C46238a.m51546a(this.f229445f, tVar.f229445f) && C46238a.m51546a(Boolean.valueOf(this.f229446g), Boolean.valueOf(tVar.f229446g)) && C46238a.m51546a(Boolean.valueOf(this.f229447h), Boolean.valueOf(tVar.f229447h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f229443d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f229444e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f229445f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74314a(4, this.f229446g);
            aVar.mo74314a(5, this.f229447h);
            return 0;
        } else if (i == 1) {
            String str4 = this.f229443d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f229444e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f229445f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58674a(4, this.f229446g) + C52418a.m58674a(5, this.f229447h);
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
            C78316t tVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tVar.f229443d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                tVar.f229444e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                tVar.f229445f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                tVar.f229446g = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                tVar.f229447h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f229443d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "emojiMd5", str, false);
            aVar.mo71655d(jSONObject, "cdnUrl", this.f229444e, false);
            aVar.mo71655d(jSONObject, "emojiPath", this.f229445f, false);
            aVar.mo71655d(jSONObject, "isLoadedEmoji", Boolean.valueOf(this.f229446g), false);
            aVar.mo71655d(jSONObject, "isNeedEmoji", Boolean.valueOf(this.f229447h), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
