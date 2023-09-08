package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.my3 */
public class C101818my3 extends C47465a {

    /* renamed from: d */
    public String f298878d;

    /* renamed from: e */
    public String f298879e;

    /* renamed from: f */
    public String f298880f;

    /* renamed from: g */
    public int f298881g;

    /* renamed from: h */
    public int f298882h;

    /* renamed from: i */
    public String f298883i;

    /* renamed from: j */
    public C89349b f298884j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101818my3)) {
            return false;
        }
        C101818my3 my32 = (C101818my3) aVar;
        return C46238a.m51546a(this.f298878d, my32.f298878d) && C46238a.m51546a(this.f298879e, my32.f298879e) && C46238a.m51546a(this.f298880f, my32.f298880f) && C46238a.m51546a(Integer.valueOf(this.f298881g), Integer.valueOf(my32.f298881g)) && C46238a.m51546a(Integer.valueOf(this.f298882h), Integer.valueOf(my32.f298882h)) && C46238a.m51546a(this.f298883i, my32.f298883i) && C46238a.m51546a(this.f298884j, my32.f298884j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298878d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f298879e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f298880f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f298881g);
            aVar.mo74318e(5, this.f298882h);
            String str4 = this.f298883i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            C89349b bVar = this.f298884j;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f298878d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f298879e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f298880f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int e = i2 + C52418a.m58678e(4, this.f298881g) + C52418a.m58678e(5, this.f298882h);
            String str8 = this.f298883i;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            C89349b bVar2 = this.f298884j;
            return bVar2 != null ? e + C52418a.m58675b(7, bVar2) : e;
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
            C101818my3 my32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    my32.f298878d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    my32.f298879e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    my32.f298880f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    my32.f298881g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    my32.f298882h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    my32.f298883i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    my32.f298884j = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f298878d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "SessionId", str, false);
            aVar.mo71655d(jSONObject, "SearchId", this.f298879e, false);
            aVar.mo71655d(jSONObject, "RequestId", this.f298880f, false);
            aVar.mo71655d(jSONObject, "BusinessType", Integer.valueOf(this.f298881g), false);
            aVar.mo71655d(jSONObject, "SubType", Integer.valueOf(this.f298882h), false);
            aVar.mo71655d(jSONObject, "DocID", this.f298883i, false);
            aVar.mo71655d(jSONObject, "ExtendInfo", this.f298884j, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
