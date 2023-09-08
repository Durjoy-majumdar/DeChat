package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class d75 extends C47465a {

    /* renamed from: d */
    public int f182647d;

    /* renamed from: e */
    public int f182648e;

    /* renamed from: f */
    public String f182649f;

    /* renamed from: g */
    public String f182650g;

    /* renamed from: h */
    public String f182651h;

    /* renamed from: i */
    public int f182652i;

    /* renamed from: j */
    public boolean f182653j = false;

    /* renamed from: n */
    public boolean f182654n = false;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof d75)) {
            return false;
        }
        d75 d75 = (d75) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182647d), Integer.valueOf(d75.f182647d)) && C46238a.m51546a(Integer.valueOf(this.f182648e), Integer.valueOf(d75.f182648e)) && C46238a.m51546a(this.f182649f, d75.f182649f) && C46238a.m51546a(this.f182650g, d75.f182650g) && C46238a.m51546a(this.f182651h, d75.f182651h) && C46238a.m51546a(Integer.valueOf(this.f182652i), Integer.valueOf(d75.f182652i)) && C46238a.m51546a(Boolean.valueOf(this.f182653j), Boolean.valueOf(d75.f182653j)) && C46238a.m51546a(Boolean.valueOf(this.f182654n), Boolean.valueOf(d75.f182654n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182647d);
            aVar.mo74318e(2, this.f182648e);
            String str = this.f182649f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f182650g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f182651h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f182652i);
            aVar.mo74314a(7, this.f182653j);
            aVar.mo74314a(8, this.f182654n);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182647d) + 0 + C52418a.m58678e(2, this.f182648e);
            String str4 = this.f182649f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f182650g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f182651h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            return e + C52418a.m58678e(6, this.f182652i) + C52418a.m58674a(7, this.f182653j) + C52418a.m58674a(8, this.f182654n);
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
            d75 d75 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    d75.f182647d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    d75.f182648e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    d75.f182649f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    d75.f182650g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    d75.f182651h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    d75.f182652i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    d75.f182653j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    d75.f182654n = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f182647d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "h5_version", valueOf, false);
            aVar.mo71655d(jSONObject, "sub_type", Integer.valueOf(this.f182648e), false);
            aVar.mo71655d(jSONObject, "session_id", this.f182649f, false);
            aVar.mo71655d(jSONObject, "keyword_id", this.f182650g, false);
            aVar.mo71655d(jSONObject, "wording_id", this.f182651h, false);
            aVar.mo71655d(jSONObject, "sug_pos", Integer.valueOf(this.f182652i), false);
            aVar.mo71655d(jSONObject, "is_local_search", Boolean.valueOf(this.f182653j), false);
            aVar.mo71655d(jSONObject, "no_history_save", Boolean.valueOf(this.f182654n), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
