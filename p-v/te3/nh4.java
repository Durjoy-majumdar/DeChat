package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class nh4 extends C47465a {

    /* renamed from: d */
    public String f64318d;

    /* renamed from: e */
    public String f64319e;

    /* renamed from: f */
    public int f64320f;

    /* renamed from: g */
    public String f64321g;

    /* renamed from: h */
    public String f64322h;

    /* renamed from: i */
    public int f64323i;

    /* renamed from: j */
    public String f64324j;

    /* renamed from: n */
    public int f64325n;

    /* renamed from: o */
    public String f64326o;

    /* renamed from: p */
    public String f64327p;

    /* renamed from: q */
    public int f64328q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof nh4)) {
            return false;
        }
        nh4 nh4 = (nh4) aVar;
        return C46238a.m51546a(this.f64318d, nh4.f64318d) && C46238a.m51546a(this.f64319e, nh4.f64319e) && C46238a.m51546a(Integer.valueOf(this.f64320f), Integer.valueOf(nh4.f64320f)) && C46238a.m51546a(this.f64321g, nh4.f64321g) && C46238a.m51546a(this.f64322h, nh4.f64322h) && C46238a.m51546a(Integer.valueOf(this.f64323i), Integer.valueOf(nh4.f64323i)) && C46238a.m51546a(this.f64324j, nh4.f64324j) && C46238a.m51546a(Integer.valueOf(this.f64325n), Integer.valueOf(nh4.f64325n)) && C46238a.m51546a(this.f64326o, nh4.f64326o) && C46238a.m51546a(this.f64327p, nh4.f64327p) && C46238a.m51546a(Integer.valueOf(this.f64328q), Integer.valueOf(nh4.f64328q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64318d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64319e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f64320f);
            String str3 = this.f64321g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f64322h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f64323i);
            String str5 = this.f64324j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f64325n);
            String str6 = this.f64326o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f64327p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            aVar.mo74318e(11, this.f64328q);
            return 0;
        } else if (i == 1) {
            String str8 = this.f64318d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f64319e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            int e = i2 + C52418a.m58678e(3, this.f64320f);
            String str10 = this.f64321g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f64322h;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            int e2 = e + C52418a.m58678e(6, this.f64323i);
            String str12 = this.f64324j;
            if (str12 != null) {
                e2 += C52418a.m58683j(7, str12);
            }
            int e3 = e2 + C52418a.m58678e(8, this.f64325n);
            String str13 = this.f64326o;
            if (str13 != null) {
                e3 += C52418a.m58683j(9, str13);
            }
            String str14 = this.f64327p;
            if (str14 != null) {
                e3 += C52418a.m58683j(10, str14);
            }
            return e3 + C52418a.m58678e(11, this.f64328q);
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
            nh4 nh4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    nh4.f64318d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    nh4.f64319e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    nh4.f64320f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    nh4.f64321g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    nh4.f64322h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    nh4.f64323i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    nh4.f64324j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    nh4.f64325n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    nh4.f64326o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    nh4.f64327p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    nh4.f64328q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f64318d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "DocId", str, false);
            aVar.mo71655d(jSONObject, "CommentId", this.f64319e, false);
            aVar.mo71655d(jSONObject, "OpType", Integer.valueOf(this.f64320f), false);
            aVar.mo71655d(jSONObject, "RequestId", this.f64321g, false);
            aVar.mo71655d(jSONObject, "Content", this.f64322h, false);
            aVar.mo71655d(jSONObject, "Scene", Integer.valueOf(this.f64323i), false);
            aVar.mo71655d(jSONObject, "SearchId", this.f64324j, false);
            aVar.mo71655d(jSONObject, "SubScene", Integer.valueOf(this.f64325n), false);
            aVar.mo71655d(jSONObject, "Vid", this.f64326o, false);
            aVar.mo71655d(jSONObject, "ByPass", this.f64327p, false);
            aVar.mo71655d(jSONObject, "Source", Integer.valueOf(this.f64328q), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
