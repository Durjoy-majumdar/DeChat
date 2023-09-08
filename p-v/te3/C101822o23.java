package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o23 */
public class C101822o23 extends C47465a {

    /* renamed from: d */
    public C64719t23 f298945d;

    /* renamed from: e */
    public int f298946e;

    /* renamed from: f */
    public String f298947f;

    /* renamed from: g */
    public String f298948g;

    /* renamed from: h */
    public String f298949h;

    /* renamed from: i */
    public String f298950i;

    /* renamed from: j */
    public String f298951j;

    /* renamed from: n */
    public String f298952n;

    /* renamed from: o */
    public String f298953o;

    /* renamed from: p */
    public String f298954p;

    /* renamed from: q */
    public String f298955q;

    /* renamed from: r */
    public String f298956r;

    /* renamed from: s */
    public String f298957s;

    /* renamed from: t */
    public String f298958t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101822o23)) {
            return false;
        }
        C101822o23 o232 = (C101822o23) aVar;
        return C46238a.m51546a(this.f298945d, o232.f298945d) && C46238a.m51546a(Integer.valueOf(this.f298946e), Integer.valueOf(o232.f298946e)) && C46238a.m51546a(this.f298947f, o232.f298947f) && C46238a.m51546a(this.f298948g, o232.f298948g) && C46238a.m51546a(this.f298949h, o232.f298949h) && C46238a.m51546a(this.f298950i, o232.f298950i) && C46238a.m51546a(this.f298951j, o232.f298951j) && C46238a.m51546a(this.f298952n, o232.f298952n) && C46238a.m51546a(this.f298953o, o232.f298953o) && C46238a.m51546a(this.f298954p, o232.f298954p) && C46238a.m51546a(this.f298955q, o232.f298955q) && C46238a.m51546a(this.f298956r, o232.f298956r) && C46238a.m51546a(this.f298957s, o232.f298957s) && C46238a.m51546a(this.f298958t, o232.f298958t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C64719t23 t232 = this.f298945d;
            if (t232 != null) {
                aVar.mo74322i(1, t232.computeSize());
                this.f298945d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f298946e);
            String str = this.f298947f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f298948g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f298949h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f298950i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f298951j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f298952n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f298953o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            String str8 = this.f298954p;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            String str9 = this.f298955q;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            String str10 = this.f298956r;
            if (str10 != null) {
                aVar.mo74323j(12, str10);
            }
            String str11 = this.f298957s;
            if (str11 != null) {
                aVar.mo74323j(13, str11);
            }
            String str12 = this.f298958t;
            if (str12 != null) {
                aVar.mo74323j(14, str12);
            }
            return 0;
        } else if (i2 == 1) {
            C64719t23 t233 = this.f298945d;
            if (t233 != null) {
                i3 = C52418a.m58682i(1, t233.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f298946e);
            String str13 = this.f298947f;
            if (str13 != null) {
                e += C52418a.m58683j(3, str13);
            }
            String str14 = this.f298948g;
            if (str14 != null) {
                e += C52418a.m58683j(4, str14);
            }
            String str15 = this.f298949h;
            if (str15 != null) {
                e += C52418a.m58683j(5, str15);
            }
            String str16 = this.f298950i;
            if (str16 != null) {
                e += C52418a.m58683j(6, str16);
            }
            String str17 = this.f298951j;
            if (str17 != null) {
                e += C52418a.m58683j(7, str17);
            }
            String str18 = this.f298952n;
            if (str18 != null) {
                e += C52418a.m58683j(8, str18);
            }
            String str19 = this.f298953o;
            if (str19 != null) {
                e += C52418a.m58683j(9, str19);
            }
            String str20 = this.f298954p;
            if (str20 != null) {
                e += C52418a.m58683j(10, str20);
            }
            String str21 = this.f298955q;
            if (str21 != null) {
                e += C52418a.m58683j(11, str21);
            }
            String str22 = this.f298956r;
            if (str22 != null) {
                e += C52418a.m58683j(12, str22);
            }
            String str23 = this.f298957s;
            if (str23 != null) {
                e += C52418a.m58683j(13, str23);
            }
            String str24 = this.f298958t;
            return str24 != null ? e + C52418a.m58683j(14, str24) : e;
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
            C101822o23 o232 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C64719t23 t234 = new C64719t23();
                        if (bArr != null && bArr.length > 0) {
                            t234.parseFrom(bArr);
                        }
                        o232.f298945d = t234;
                    }
                    return 0;
                case 2:
                    o232.f298946e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    o232.f298947f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    o232.f298948g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    o232.f298949h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    o232.f298950i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    o232.f298951j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    o232.f298952n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    o232.f298953o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    o232.f298954p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    o232.f298955q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    o232.f298956r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    o232.f298957s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    o232.f298958t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C64719t23 t232 = this.f298945d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "musicShareObject", t232, false);
            aVar.mo71655d(jSONObject, "musicType", Integer.valueOf(this.f298946e), false);
            aVar.mo71655d(jSONObject, "albumUrl", this.f298947f, false);
            aVar.mo71655d(jSONObject, "name", this.f298948g, false);
            aVar.mo71655d(jSONObject, "singer", this.f298949h, false);
            aVar.mo71655d(jSONObject, "webUrl", this.f298950i, false);
            aVar.mo71655d(jSONObject, "wapLinUrl", this.f298951j, false);
            aVar.mo71655d(jSONObject, "wifiUrl", this.f298952n, false);
            aVar.mo71655d(jSONObject, "musicId", this.f298953o, false);
            aVar.mo71655d(jSONObject, "songPath", this.f298954p, false);
            aVar.mo71655d(jSONObject, "albumPath", this.f298955q, false);
            aVar.mo71655d(jSONObject, "songAlbum", this.f298956r, false);
            aVar.mo71655d(jSONObject, "appId", this.f298957s, false);
            aVar.mo71655d(jSONObject, "songHAlbumUrl", this.f298958t, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
