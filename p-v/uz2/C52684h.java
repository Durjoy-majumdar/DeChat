package uz2;

import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.h */
public class C52684h extends C47465a {

    /* renamed from: d */
    public int f147112d;

    /* renamed from: e */
    public String f147113e;

    /* renamed from: f */
    public String f147114f;

    /* renamed from: g */
    public String f147115g;

    /* renamed from: h */
    public int f147116h;

    /* renamed from: i */
    public String f147117i;

    /* renamed from: j */
    public String f147118j;

    /* renamed from: n */
    public String f147119n;

    /* renamed from: o */
    public String f147120o;

    /* renamed from: p */
    public String f147121p;

    /* renamed from: q */
    public String f147122q;

    /* renamed from: r */
    public String f147123r;

    /* renamed from: s */
    public String f147124s;

    /* renamed from: t */
    public boolean f147125t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52684h)) {
            return false;
        }
        C52684h hVar = (C52684h) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f147112d), Integer.valueOf(hVar.f147112d)) && C46238a.m51546a(this.f147113e, hVar.f147113e) && C46238a.m51546a(this.f147114f, hVar.f147114f) && C46238a.m51546a(this.f147115g, hVar.f147115g) && C46238a.m51546a(Integer.valueOf(this.f147116h), Integer.valueOf(hVar.f147116h)) && C46238a.m51546a(this.f147117i, hVar.f147117i) && C46238a.m51546a(this.f147118j, hVar.f147118j) && C46238a.m51546a(this.f147119n, hVar.f147119n) && C46238a.m51546a(this.f147120o, hVar.f147120o) && C46238a.m51546a(this.f147121p, hVar.f147121p) && C46238a.m51546a(this.f147122q, hVar.f147122q) && C46238a.m51546a(this.f147123r, hVar.f147123r) && C46238a.m51546a(this.f147124s, hVar.f147124s) && C46238a.m51546a(Boolean.valueOf(this.f147125t), Boolean.valueOf(hVar.f147125t));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f147112d);
            String str = this.f147113e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f147114f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f147115g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f147116h);
            String str4 = this.f147117i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f147118j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f147119n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f147120o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            String str8 = this.f147121p;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            String str9 = this.f147122q;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            String str10 = this.f147123r;
            if (str10 != null) {
                aVar.mo74323j(12, str10);
            }
            String str11 = this.f147124s;
            if (str11 != null) {
                aVar.mo74323j(13, str11);
            }
            aVar.mo74314a(14, this.f147125t);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f147112d) + 0;
            String str12 = this.f147113e;
            if (str12 != null) {
                e += C52418a.m58683j(2, str12);
            }
            String str13 = this.f147114f;
            if (str13 != null) {
                e += C52418a.m58683j(3, str13);
            }
            String str14 = this.f147115g;
            if (str14 != null) {
                e += C52418a.m58683j(4, str14);
            }
            int e2 = e + C52418a.m58678e(5, this.f147116h);
            String str15 = this.f147117i;
            if (str15 != null) {
                e2 += C52418a.m58683j(6, str15);
            }
            String str16 = this.f147118j;
            if (str16 != null) {
                e2 += C52418a.m58683j(7, str16);
            }
            String str17 = this.f147119n;
            if (str17 != null) {
                e2 += C52418a.m58683j(8, str17);
            }
            String str18 = this.f147120o;
            if (str18 != null) {
                e2 += C52418a.m58683j(9, str18);
            }
            String str19 = this.f147121p;
            if (str19 != null) {
                e2 += C52418a.m58683j(10, str19);
            }
            String str20 = this.f147122q;
            if (str20 != null) {
                e2 += C52418a.m58683j(11, str20);
            }
            String str21 = this.f147123r;
            if (str21 != null) {
                e2 += C52418a.m58683j(12, str21);
            }
            String str22 = this.f147124s;
            if (str22 != null) {
                e2 += C52418a.m58683j(13, str22);
            }
            return e2 + C52418a.m58674a(14, this.f147125t);
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
            C52684h hVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hVar.f147112d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    hVar.f147113e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hVar.f147114f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    hVar.f147115g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    hVar.f147116h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    hVar.f147117i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    hVar.f147118j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    hVar.f147119n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    hVar.f147120o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    hVar.f147121p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    hVar.f147122q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    hVar.f147123r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    hVar.f147124s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    hVar.f147125t = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f147112d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "ret", valueOf, false);
            aVar.mo71655d(jSONObject, "err_msg", this.f147113e, false);
            aVar.mo71655d(jSONObject, "enc_username", this.f147114f, false);
            aVar.mo71655d(jSONObject, "nickname", this.f147115g, false);
            aVar.mo71655d(jSONObject, "sex", Integer.valueOf(this.f147116h), false);
            aVar.mo71655d(jSONObject, "province", this.f147117i, false);
            aVar.mo71655d(jSONObject, "city", this.f147118j, false);
            aVar.mo71655d(jSONObject, "signature", this.f147119n, false);
            aVar.mo71655d(jSONObject, "big_head_img_url", this.f147120o, false);
            aVar.mo71655d(jSONObject, "small_head_img_url", this.f147121p, false);
            aVar.mo71655d(jSONObject, "text_status_ext_info", this.f147122q, false);
            aVar.mo71655d(jSONObject, "country", this.f147123r, false);
            aVar.mo71655d(jSONObject, "text_status_id", this.f147124s, false);
            aVar.mo71655d(jSONObject, "block", Boolean.valueOf(this.f147125t), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
