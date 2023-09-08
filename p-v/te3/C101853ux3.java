package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ux3 */
public class C101853ux3 extends C47465a {

    /* renamed from: d */
    public int f299644d;

    /* renamed from: e */
    public String f299645e;

    /* renamed from: f */
    public int f299646f;

    /* renamed from: g */
    public int f299647g;

    /* renamed from: h */
    public String f299648h;

    /* renamed from: i */
    public int f299649i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101853ux3)) {
            return false;
        }
        C101853ux3 ux32 = (C101853ux3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299644d), Integer.valueOf(ux32.f299644d)) && C46238a.m51546a(this.f299645e, ux32.f299645e) && C46238a.m51546a(Integer.valueOf(this.f299646f), Integer.valueOf(ux32.f299646f)) && C46238a.m51546a(Integer.valueOf(this.f299647g), Integer.valueOf(ux32.f299647g)) && C46238a.m51546a(this.f299648h, ux32.f299648h) && C46238a.m51546a(Integer.valueOf(this.f299649i), Integer.valueOf(ux32.f299649i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f299644d);
            String str = this.f299645e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f299646f);
            aVar.mo74318e(4, this.f299647g);
            String str2 = this.f299648h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f299649i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f299644d) + 0;
            String str3 = this.f299645e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            int e2 = e + C52418a.m58678e(3, this.f299646f) + C52418a.m58678e(4, this.f299647g);
            String str4 = this.f299648h;
            if (str4 != null) {
                e2 += C52418a.m58683j(5, str4);
            }
            return e2 + C52418a.m58678e(6, this.f299649i);
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
            C101853ux3 ux32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ux32.f299644d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ux32.f299645e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ux32.f299646f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ux32.f299647g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ux32.f299648h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ux32.f299649i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f299644d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "MediaType", valueOf, false);
            aVar.mo71655d(jSONObject, "Url", this.f299645e, false);
            aVar.mo71655d(jSONObject, "Width", Integer.valueOf(this.f299646f), false);
            aVar.mo71655d(jSONObject, "Height", Integer.valueOf(this.f299647g), false);
            aVar.mo71655d(jSONObject, "ThumbUrl", this.f299648h, false);
            aVar.mo71655d(jSONObject, "VideoPlayDuration", Integer.valueOf(this.f299649i), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
