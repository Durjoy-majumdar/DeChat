package te3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t23 */
public class C64719t23 extends C47465a {

    /* renamed from: d */
    public String f185459d;

    /* renamed from: e */
    public String f185460e;

    /* renamed from: f */
    public String f185461f;

    /* renamed from: g */
    public String f185462g;

    /* renamed from: h */
    public String f185463h;

    /* renamed from: i */
    public String f185464i;

    /* renamed from: j */
    public String f185465j;

    /* renamed from: n */
    public String f185466n;

    /* renamed from: o */
    public long f185467o;

    /* renamed from: p */
    public String f185468p;

    /* renamed from: q */
    public int f185469q;

    /* renamed from: r */
    public String f185470r;

    /* renamed from: s */
    public String f185471s;

    /* renamed from: t */
    public String f185472t;

    /* renamed from: u */
    public String f185473u;

    /* renamed from: v */
    public String f185474v;

    /* renamed from: w */
    public String f185475w;

    /* renamed from: x */
    public String f185476x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64719t23)) {
            return false;
        }
        C64719t23 t232 = (C64719t23) aVar;
        return C46238a.m51546a(this.f185459d, t232.f185459d) && C46238a.m51546a(this.f185460e, t232.f185460e) && C46238a.m51546a(this.f185461f, t232.f185461f) && C46238a.m51546a(this.f185462g, t232.f185462g) && C46238a.m51546a(this.f185463h, t232.f185463h) && C46238a.m51546a(this.f185464i, t232.f185464i) && C46238a.m51546a(this.f185465j, t232.f185465j) && C46238a.m51546a(this.f185466n, t232.f185466n) && C46238a.m51546a(Long.valueOf(this.f185467o), Long.valueOf(t232.f185467o)) && C46238a.m51546a(this.f185468p, t232.f185468p) && C46238a.m51546a(Integer.valueOf(this.f185469q), Integer.valueOf(t232.f185469q)) && C46238a.m51546a(this.f185470r, t232.f185470r) && C46238a.m51546a(this.f185471s, t232.f185471s) && C46238a.m51546a(this.f185472t, t232.f185472t) && C46238a.m51546a(this.f185473u, t232.f185473u) && C46238a.m51546a(this.f185474v, t232.f185474v) && C46238a.m51546a(this.f185475w, t232.f185475w) && C46238a.m51546a(this.f185476x, t232.f185476x);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185459d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185460e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f185461f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f185462g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f185463h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f185464i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f185465j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f185466n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            aVar.mo74321h(9, this.f185467o);
            String str9 = this.f185468p;
            if (str9 != null) {
                aVar.mo74323j(10, str9);
            }
            aVar.mo74318e(11, this.f185469q);
            String str10 = this.f185470r;
            if (str10 != null) {
                aVar.mo74323j(12, str10);
            }
            String str11 = this.f185471s;
            if (str11 != null) {
                aVar.mo74323j(13, str11);
            }
            String str12 = this.f185472t;
            if (str12 != null) {
                aVar.mo74323j(21, str12);
            }
            String str13 = this.f185473u;
            if (str13 != null) {
                aVar.mo74323j(22, str13);
            }
            String str14 = this.f185474v;
            if (str14 != null) {
                aVar.mo74323j(23, str14);
            }
            String str15 = this.f185475w;
            if (str15 != null) {
                aVar.mo74323j(25, str15);
            }
            String str16 = this.f185476x;
            if (str16 != null) {
                aVar.mo74323j(26, str16);
            }
            return 0;
        } else if (i2 == 1) {
            String str17 = this.f185459d;
            if (str17 != null) {
                i3 = C52418a.m58683j(1, str17) + 0;
            }
            String str18 = this.f185460e;
            if (str18 != null) {
                i3 += C52418a.m58683j(2, str18);
            }
            String str19 = this.f185461f;
            if (str19 != null) {
                i3 += C52418a.m58683j(3, str19);
            }
            String str20 = this.f185462g;
            if (str20 != null) {
                i3 += C52418a.m58683j(4, str20);
            }
            String str21 = this.f185463h;
            if (str21 != null) {
                i3 += C52418a.m58683j(5, str21);
            }
            String str22 = this.f185464i;
            if (str22 != null) {
                i3 += C52418a.m58683j(6, str22);
            }
            String str23 = this.f185465j;
            if (str23 != null) {
                i3 += C52418a.m58683j(7, str23);
            }
            String str24 = this.f185466n;
            if (str24 != null) {
                i3 += C52418a.m58683j(8, str24);
            }
            int h = i3 + C52418a.m58681h(9, this.f185467o);
            String str25 = this.f185468p;
            if (str25 != null) {
                h += C52418a.m58683j(10, str25);
            }
            int e = h + C52418a.m58678e(11, this.f185469q);
            String str26 = this.f185470r;
            if (str26 != null) {
                e += C52418a.m58683j(12, str26);
            }
            String str27 = this.f185471s;
            if (str27 != null) {
                e += C52418a.m58683j(13, str27);
            }
            String str28 = this.f185472t;
            if (str28 != null) {
                e += C52418a.m58683j(21, str28);
            }
            String str29 = this.f185473u;
            if (str29 != null) {
                e += C52418a.m58683j(22, str29);
            }
            String str30 = this.f185474v;
            if (str30 != null) {
                e += C52418a.m58683j(23, str30);
            }
            String str31 = this.f185475w;
            if (str31 != null) {
                e += C52418a.m58683j(25, str31);
            }
            String str32 = this.f185476x;
            return str32 != null ? e + C52418a.m58683j(26, str32) : e;
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
            C64719t23 t232 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 25) {
                t232.f185475w = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 26) {
                switch (intValue) {
                    case 1:
                        t232.f185459d = aVar3.mo141633k(intValue);
                        return 0;
                    case 2:
                        t232.f185460e = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        t232.f185461f = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        t232.f185462g = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        t232.f185463h = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        t232.f185464i = aVar3.mo141633k(intValue);
                        return 0;
                    case 7:
                        t232.f185465j = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        t232.f185466n = aVar3.mo141633k(intValue);
                        return 0;
                    case 9:
                        t232.f185467o = aVar3.mo141631i(intValue);
                        return 0;
                    case 10:
                        t232.f185468p = aVar3.mo141633k(intValue);
                        return 0;
                    case 11:
                        t232.f185469q = aVar3.mo141629g(intValue);
                        return 0;
                    case 12:
                        t232.f185470r = aVar3.mo141633k(intValue);
                        return 0;
                    case 13:
                        t232.f185471s = aVar3.mo141633k(intValue);
                        return 0;
                    default:
                        switch (intValue) {
                            case 21:
                                t232.f185472t = aVar3.mo141633k(intValue);
                                return 0;
                            case 22:
                                t232.f185473u = aVar3.mo141633k(intValue);
                                return 0;
                            case 23:
                                t232.f185474v = aVar3.mo141633k(intValue);
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                t232.f185476x = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f185459d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "mvObjectId", str, false);
            aVar.mo71655d(jSONObject, "mvNonceId", this.f185460e, false);
            aVar.mo71655d(jSONObject, "mvCoverUrl", this.f185461f, false);
            aVar.mo71655d(jSONObject, "mvMakerFinderNickname", this.f185462g, false);
            aVar.mo71655d(jSONObject, "singerName", this.f185463h, false);
            aVar.mo71655d(jSONObject, "albumName", this.f185464i, false);
            aVar.mo71655d(jSONObject, TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, this.f185465j, false);
            aVar.mo71655d(jSONObject, "musicGenre", this.f185466n, false);
            aVar.mo71655d(jSONObject, "issueDate", Long.valueOf(this.f185467o), false);
            aVar.mo71655d(jSONObject, "identification", this.f185468p, false);
            aVar.mo71655d(jSONObject, "musicDuration", Integer.valueOf(this.f185469q), false);
            aVar.mo71655d(jSONObject, "mid", this.f185470r, false);
            aVar.mo71655d(jSONObject, "musicOperationUrl", this.f185471s, false);
            aVar.mo71655d(jSONObject, "musicCoverPath", this.f185472t, false);
            aVar.mo71655d(jSONObject, "songName", this.f185473u, false);
            aVar.mo71655d(jSONObject, "songLyric", this.f185474v, false);
            aVar.mo71655d(jSONObject, "albumCoverUrl", this.f185475w, false);
            aVar.mo71655d(jSONObject, "appIdForSourceDisplay", this.f185476x, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
