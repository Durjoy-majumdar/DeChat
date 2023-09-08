package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d13 */
public class C110959d13 extends C47465a {

    /* renamed from: d */
    public String f331945d;

    /* renamed from: e */
    public String f331946e;

    /* renamed from: f */
    public boolean f331947f;

    /* renamed from: g */
    public String f331948g;

    /* renamed from: h */
    public String f331949h;

    /* renamed from: i */
    public boolean f331950i;

    /* renamed from: j */
    public boolean f331951j;

    /* renamed from: n */
    public int f331952n;

    /* renamed from: o */
    public long f331953o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C110959d13)) {
            return false;
        }
        C110959d13 d132 = (C110959d13) aVar;
        return C46238a.m51546a(this.f331945d, d132.f331945d) && C46238a.m51546a(this.f331946e, d132.f331946e) && C46238a.m51546a(Boolean.valueOf(this.f331947f), Boolean.valueOf(d132.f331947f)) && C46238a.m51546a(this.f331948g, d132.f331948g) && C46238a.m51546a(this.f331949h, d132.f331949h) && C46238a.m51546a(Boolean.valueOf(this.f331950i), Boolean.valueOf(d132.f331950i)) && C46238a.m51546a(Boolean.valueOf(this.f331951j), Boolean.valueOf(d132.f331951j)) && C46238a.m51546a(Integer.valueOf(this.f331952n), Integer.valueOf(d132.f331952n)) && C46238a.m51546a(Long.valueOf(this.f331953o), Long.valueOf(d132.f331953o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f331945d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f331946e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74314a(3, this.f331947f);
            String str3 = this.f331948g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f331949h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74314a(6, this.f331950i);
            aVar.mo74314a(7, this.f331951j);
            aVar.mo74318e(8, this.f331952n);
            aVar.mo74321h(9, this.f331953o);
            return 0;
        } else if (i == 1) {
            String str5 = this.f331945d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f331946e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int a = i2 + C52418a.m58674a(3, this.f331947f);
            String str7 = this.f331948g;
            if (str7 != null) {
                a += C52418a.m58683j(4, str7);
            }
            String str8 = this.f331949h;
            if (str8 != null) {
                a += C52418a.m58683j(5, str8);
            }
            return a + C52418a.m58674a(6, this.f331950i) + C52418a.m58674a(7, this.f331951j) + C52418a.m58678e(8, this.f331952n) + C52418a.m58681h(9, this.f331953o);
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
            C110959d13 d132 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    d132.f331945d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    d132.f331946e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    d132.f331947f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    d132.f331948g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    d132.f331949h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    d132.f331950i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    d132.f331951j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    d132.f331952n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    d132.f331953o = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f331945d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "snapshotUrl", str, false);
            aVar.mo71655d(jSONObject, "position", this.f331946e, false);
            aVar.mo71655d(jSONObject, "needEnterAnim", Boolean.valueOf(this.f331947f), false);
            aVar.mo71655d(jSONObject, "homeSnapUrl", this.f331948g, false);
            aVar.mo71655d(jSONObject, "ori_position", this.f331949h, false);
            aVar.mo71655d(jSONObject, "isVisiableTop", Boolean.valueOf(this.f331950i), false);
            aVar.mo71655d(jSONObject, "isVisiableButtom", Boolean.valueOf(this.f331951j), false);
            aVar.mo71655d(jSONObject, "curItem_pos", Integer.valueOf(this.f331952n), false);
            aVar.mo71655d(jSONObject, "clickTimeStamp", Long.valueOf(this.f331953o), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
