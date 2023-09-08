package te3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class uh4 extends C47465a {

    /* renamed from: A */
    public boolean f64636A;

    /* renamed from: d */
    public String f64637d;

    /* renamed from: e */
    public String f64638e;

    /* renamed from: f */
    public String f64639f;

    /* renamed from: g */
    public String f64640g;

    /* renamed from: h */
    public long f64641h;

    /* renamed from: i */
    public int f64642i;

    /* renamed from: j */
    public String f64643j;

    /* renamed from: n */
    public String f64644n;

    /* renamed from: o */
    public xh4 f64645o;

    /* renamed from: p */
    public e54 f64646p;

    /* renamed from: q */
    public LinkedList<C49768hy> f64647q = new LinkedList<>();

    /* renamed from: r */
    public String f64648r;

    /* renamed from: s */
    public int f64649s;

    /* renamed from: t */
    public boolean f64650t;

    /* renamed from: u */
    public LinkedList<xh4> f64651u = new LinkedList<>();

    /* renamed from: v */
    public int f64652v;

    /* renamed from: w */
    public int f64653w;

    /* renamed from: x */
    public boolean f64654x;

    /* renamed from: y */
    public String f64655y;

    /* renamed from: z */
    public int f64656z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof uh4)) {
            return false;
        }
        uh4 uh4 = (uh4) aVar;
        return C46238a.m51546a(this.f64637d, uh4.f64637d) && C46238a.m51546a(this.f64638e, uh4.f64638e) && C46238a.m51546a(this.f64639f, uh4.f64639f) && C46238a.m51546a(this.f64640g, uh4.f64640g) && C46238a.m51546a(Long.valueOf(this.f64641h), Long.valueOf(uh4.f64641h)) && C46238a.m51546a(Integer.valueOf(this.f64642i), Integer.valueOf(uh4.f64642i)) && C46238a.m51546a(this.f64643j, uh4.f64643j) && C46238a.m51546a(this.f64644n, uh4.f64644n) && C46238a.m51546a(this.f64645o, uh4.f64645o) && C46238a.m51546a(this.f64646p, uh4.f64646p) && C46238a.m51546a(this.f64647q, uh4.f64647q) && C46238a.m51546a(this.f64648r, uh4.f64648r) && C46238a.m51546a(Integer.valueOf(this.f64649s), Integer.valueOf(uh4.f64649s)) && C46238a.m51546a(Boolean.valueOf(this.f64650t), Boolean.valueOf(uh4.f64650t)) && C46238a.m51546a(this.f64651u, uh4.f64651u) && C46238a.m51546a(Integer.valueOf(this.f64652v), Integer.valueOf(uh4.f64652v)) && C46238a.m51546a(Integer.valueOf(this.f64653w), Integer.valueOf(uh4.f64653w)) && C46238a.m51546a(Boolean.valueOf(this.f64654x), Boolean.valueOf(uh4.f64654x)) && C46238a.m51546a(this.f64655y, uh4.f64655y) && C46238a.m51546a(Integer.valueOf(this.f64656z), Integer.valueOf(uh4.f64656z)) && C46238a.m51546a(Boolean.valueOf(this.f64636A), Boolean.valueOf(uh4.f64636A));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64637d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64638e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f64639f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f64640g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74321h(5, this.f64641h);
            aVar.mo74318e(6, this.f64642i);
            String str5 = this.f64643j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f64644n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            xh4 xh4 = this.f64645o;
            if (xh4 != null) {
                aVar.mo74322i(9, xh4.computeSize());
                this.f64645o.writeFields(aVar);
            }
            e54 e54 = this.f64646p;
            if (e54 != null) {
                aVar.mo74322i(10, e54.computeSize());
                this.f64646p.writeFields(aVar);
            }
            aVar.mo74320g(11, 8, this.f64647q);
            String str7 = this.f64648r;
            if (str7 != null) {
                aVar.mo74323j(12, str7);
            }
            aVar.mo74318e(13, this.f64649s);
            aVar.mo74314a(14, this.f64650t);
            aVar.mo74320g(15, 8, this.f64651u);
            aVar.mo74318e(16, this.f64652v);
            aVar.mo74318e(17, this.f64653w);
            aVar.mo74314a(18, this.f64654x);
            String str8 = this.f64655y;
            if (str8 != null) {
                aVar.mo74323j(19, str8);
            }
            aVar.mo74318e(20, this.f64656z);
            aVar.mo74314a(21, this.f64636A);
            return 0;
        } else if (i2 == 1) {
            String str9 = this.f64637d;
            if (str9 != null) {
                i3 = C52418a.m58683j(1, str9) + 0;
            }
            String str10 = this.f64638e;
            if (str10 != null) {
                i3 += C52418a.m58683j(2, str10);
            }
            String str11 = this.f64639f;
            if (str11 != null) {
                i3 += C52418a.m58683j(3, str11);
            }
            String str12 = this.f64640g;
            if (str12 != null) {
                i3 += C52418a.m58683j(4, str12);
            }
            int h = i3 + C52418a.m58681h(5, this.f64641h) + C52418a.m58678e(6, this.f64642i);
            String str13 = this.f64643j;
            if (str13 != null) {
                h += C52418a.m58683j(7, str13);
            }
            String str14 = this.f64644n;
            if (str14 != null) {
                h += C52418a.m58683j(8, str14);
            }
            xh4 xh42 = this.f64645o;
            if (xh42 != null) {
                h += C52418a.m58682i(9, xh42.computeSize());
            }
            e54 e542 = this.f64646p;
            if (e542 != null) {
                h += C52418a.m58682i(10, e542.computeSize());
            }
            int g = h + C52418a.m58680g(11, 8, this.f64647q);
            String str15 = this.f64648r;
            if (str15 != null) {
                g += C52418a.m58683j(12, str15);
            }
            int e = g + C52418a.m58678e(13, this.f64649s) + C52418a.m58674a(14, this.f64650t) + C52418a.m58680g(15, 8, this.f64651u) + C52418a.m58678e(16, this.f64652v) + C52418a.m58678e(17, this.f64653w) + C52418a.m58674a(18, this.f64654x);
            String str16 = this.f64655y;
            if (str16 != null) {
                e += C52418a.m58683j(19, str16);
            }
            return e + C52418a.m58678e(20, this.f64656z) + C52418a.m58674a(21, this.f64636A);
        } else if (i2 == 2) {
            this.f64647q.clear();
            this.f64651u.clear();
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
            uh4 uh4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    uh4.f64637d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    uh4.f64638e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    uh4.f64639f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    uh4.f64640g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    uh4.f64641h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    uh4.f64642i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    uh4.f64643j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    uh4.f64644n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        xh4 xh43 = new xh4();
                        if (bArr != null && bArr.length > 0) {
                            xh43.parseFrom(bArr);
                        }
                        uh4.f64645o = xh43;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        e54 e543 = new e54();
                        if (bArr2 != null && bArr2.length > 0) {
                            e543.parseFrom(bArr2);
                        }
                        uh4.f64646p = e543;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49768hy hyVar = new C49768hy();
                        if (bArr3 != null && bArr3.length > 0) {
                            hyVar.parseFrom(bArr3);
                        }
                        uh4.f64647q.add(hyVar);
                    }
                    return 0;
                case 12:
                    uh4.f64648r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    uh4.f64649s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    uh4.f64650t = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        xh4 xh44 = new xh4();
                        if (bArr4 != null && bArr4.length > 0) {
                            xh44.parseFrom(bArr4);
                        }
                        uh4.f64651u.add(xh44);
                    }
                    return 0;
                case 16:
                    uh4.f64652v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    uh4.f64653w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    uh4.f64654x = aVar3.mo141625c(intValue);
                    return 0;
                case 19:
                    uh4.f64655y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    uh4.f64656z = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    uh4.f64636A = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f64637d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "relevantVid", str, false);
            aVar.mo71655d(jSONObject, "relevantExpand", this.f64638e, false);
            aVar.mo71655d(jSONObject, "relevantPreSearchId", this.f64639f, false);
            aVar.mo71655d(jSONObject, "relevantSharedOpenID", this.f64640g, false);
            aVar.mo71655d(jSONObject, "recCategory", Long.valueOf(this.f64641h), false);
            aVar.mo71655d(jSONObject, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f64642i), false);
            aVar.mo71655d(jSONObject, "searchId", this.f64643j, false);
            aVar.mo71655d(jSONObject, "keyword", this.f64644n, false);
            aVar.mo71655d(jSONObject, "firstVideoInfo", this.f64645o, false);
            aVar.mo71655d(jSONObject, "clickTag", this.f64646p, false);
            aVar.mo71655d(jSONObject, "extReqParams", this.f64647q, false);
            aVar.mo71655d(jSONObject, "contextId", this.f64648r, false);
            aVar.mo71655d(jSONObject, "offset", Integer.valueOf(this.f64649s), false);
            aVar.mo71655d(jSONObject, "enbaleMobileNet", Boolean.valueOf(this.f64650t), false);
            aVar.mo71655d(jSONObject, "videoList", this.f64651u, false);
            aVar.mo71655d(jSONObject, "currentPlayPosition", Integer.valueOf(this.f64652v), false);
            aVar.mo71655d(jSONObject, "currentPlaySecond", Integer.valueOf(this.f64653w), false);
            aVar.mo71655d(jSONObject, "isMute", Boolean.valueOf(this.f64654x), false);
            aVar.mo71655d(jSONObject, "preNetType", this.f64655y, false);
            aVar.mo71655d(jSONObject, "hasCheckMobile", Integer.valueOf(this.f64656z), false);
            aVar.mo71655d(jSONObject, "isSinglePage", Boolean.valueOf(this.f64636A), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
