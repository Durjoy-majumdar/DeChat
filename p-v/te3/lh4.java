package te3;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class lh4 extends C47465a {

    /* renamed from: d */
    public String f227801d;

    /* renamed from: e */
    public String f227802e;

    /* renamed from: f */
    public String f227803f;

    /* renamed from: g */
    public String f227804g;

    /* renamed from: h */
    public String f227805h;

    /* renamed from: i */
    public String f227806i;

    /* renamed from: j */
    public String f227807j;

    /* renamed from: n */
    public String f227808n;

    /* renamed from: o */
    public int f227809o;

    /* renamed from: p */
    public int f227810p;

    /* renamed from: q */
    public String f227811q;

    /* renamed from: r */
    public String f227812r;

    /* renamed from: s */
    public int f227813s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof lh4)) {
            return false;
        }
        lh4 lh4 = (lh4) aVar;
        return C46238a.m51546a(this.f227801d, lh4.f227801d) && C46238a.m51546a(this.f227802e, lh4.f227802e) && C46238a.m51546a(this.f227803f, lh4.f227803f) && C46238a.m51546a(this.f227804g, lh4.f227804g) && C46238a.m51546a(this.f227805h, lh4.f227805h) && C46238a.m51546a(this.f227806i, lh4.f227806i) && C46238a.m51546a(this.f227807j, lh4.f227807j) && C46238a.m51546a(this.f227808n, lh4.f227808n) && C46238a.m51546a(Integer.valueOf(this.f227809o), Integer.valueOf(lh4.f227809o)) && C46238a.m51546a(Integer.valueOf(this.f227810p), Integer.valueOf(lh4.f227810p)) && C46238a.m51546a(this.f227811q, lh4.f227811q) && C46238a.m51546a(this.f227812r, lh4.f227812r) && C46238a.m51546a(Integer.valueOf(this.f227813s), Integer.valueOf(lh4.f227813s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227801d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227802e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f227803f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f227804g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f227805h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f227806i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f227807j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f227808n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            aVar.mo74318e(9, this.f227809o);
            aVar.mo74318e(10, this.f227810p);
            String str9 = this.f227811q;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            String str10 = this.f227812r;
            if (str10 != null) {
                aVar.mo74323j(12, str10);
            }
            aVar.mo74318e(13, this.f227813s);
            return 0;
        } else if (i2 == 1) {
            String str11 = this.f227801d;
            int j = str11 != null ? 0 + C52418a.m58683j(1, str11) : 0;
            String str12 = this.f227802e;
            if (str12 != null) {
                j += C52418a.m58683j(2, str12);
            }
            String str13 = this.f227803f;
            if (str13 != null) {
                j += C52418a.m58683j(3, str13);
            }
            String str14 = this.f227804g;
            if (str14 != null) {
                j += C52418a.m58683j(4, str14);
            }
            String str15 = this.f227805h;
            if (str15 != null) {
                j += C52418a.m58683j(5, str15);
            }
            String str16 = this.f227806i;
            if (str16 != null) {
                j += C52418a.m58683j(6, str16);
            }
            String str17 = this.f227807j;
            if (str17 != null) {
                j += C52418a.m58683j(7, str17);
            }
            String str18 = this.f227808n;
            if (str18 != null) {
                j += C52418a.m58683j(8, str18);
            }
            int e = j + C52418a.m58678e(9, this.f227809o) + C52418a.m58678e(10, this.f227810p);
            String str19 = this.f227811q;
            if (str19 != null) {
                e += C52418a.m58683j(11, str19);
            }
            String str20 = this.f227812r;
            if (str20 != null) {
                e += C52418a.m58683j(12, str20);
            }
            return e + C52418a.m58678e(13, this.f227813s);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            lh4 lh4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lh4.f227801d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    lh4.f227802e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    lh4.f227803f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    lh4.f227804g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    lh4.f227805h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    lh4.f227806i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    lh4.f227807j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    lh4.f227808n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    lh4.f227809o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    lh4.f227810p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    lh4.f227811q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    lh4.f227812r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    lh4.f227813s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f227801d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "RequestId", str, false);
            aVar.mo71655d(jSONObject, "DocId", this.f227802e, false);
            aVar.mo71655d(jSONObject, "Content", this.f227803f, false);
            aVar.mo71655d(jSONObject, "ReplyId", this.f227804g, false);
            aVar.mo71655d(jSONObject, "SubReplyId", this.f227805h, false);
            aVar.mo71655d(jSONObject, "DocUrl", this.f227806i, false);
            aVar.mo71655d(jSONObject, "Title", this.f227807j, false);
            aVar.mo71655d(jSONObject, "SearchId", this.f227808n, false);
            aVar.mo71655d(jSONObject, "Scene", Integer.valueOf(this.f227809o), false);
            aVar.mo71655d(jSONObject, "SubScene", Integer.valueOf(this.f227810p), false);
            aVar.mo71655d(jSONObject, "ByPass", this.f227811q, false);
            aVar.mo71655d(jSONObject, "Vid", this.f227812r, false);
            aVar.mo71655d(jSONObject, "Source", Integer.valueOf(this.f227813s), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
