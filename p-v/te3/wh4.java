package te3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class wh4 extends C47465a {

    /* renamed from: d */
    public String f64676d;

    /* renamed from: e */
    public String f64677e;

    /* renamed from: f */
    public String f64678f;

    /* renamed from: g */
    public String f64679g;

    /* renamed from: h */
    public e54 f64680h;

    /* renamed from: i */
    public long f64681i;

    /* renamed from: j */
    public String f64682j;

    /* renamed from: n */
    public int f64683n;

    /* renamed from: o */
    public boolean f64684o;

    /* renamed from: p */
    public int f64685p;

    /* renamed from: q */
    public String f64686q;

    /* renamed from: r */
    public LinkedList<xh4> f64687r = new LinkedList<>();

    /* renamed from: s */
    public LinkedList<C49768hy> f64688s = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof wh4)) {
            return false;
        }
        wh4 wh4 = (wh4) aVar;
        return C46238a.m51546a(this.f64676d, wh4.f64676d) && C46238a.m51546a(this.f64677e, wh4.f64677e) && C46238a.m51546a(this.f64678f, wh4.f64678f) && C46238a.m51546a(this.f64679g, wh4.f64679g) && C46238a.m51546a(this.f64680h, wh4.f64680h) && C46238a.m51546a(Long.valueOf(this.f64681i), Long.valueOf(wh4.f64681i)) && C46238a.m51546a(this.f64682j, wh4.f64682j) && C46238a.m51546a(Integer.valueOf(this.f64683n), Integer.valueOf(wh4.f64683n)) && C46238a.m51546a(Boolean.valueOf(this.f64684o), Boolean.valueOf(wh4.f64684o)) && C46238a.m51546a(Integer.valueOf(this.f64685p), Integer.valueOf(wh4.f64685p)) && C46238a.m51546a(this.f64686q, wh4.f64686q) && C46238a.m51546a(this.f64687r, wh4.f64687r) && C46238a.m51546a(this.f64688s, wh4.f64688s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64676d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64677e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f64678f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f64679g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            e54 e54 = this.f64680h;
            if (e54 != null) {
                aVar.mo74322i(5, e54.computeSize());
                this.f64680h.writeFields(aVar);
            }
            aVar.mo74321h(6, this.f64681i);
            String str5 = this.f64682j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            aVar.mo74318e(8, this.f64683n);
            aVar.mo74314a(9, this.f64684o);
            aVar.mo74318e(10, this.f64685p);
            String str6 = this.f64686q;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            aVar.mo74320g(12, 8, this.f64687r);
            aVar.mo74320g(13, 8, this.f64688s);
            return 0;
        } else if (i2 == 1) {
            String str7 = this.f64676d;
            int j = str7 != null ? 0 + C52418a.m58683j(1, str7) : 0;
            String str8 = this.f64677e;
            if (str8 != null) {
                j += C52418a.m58683j(2, str8);
            }
            String str9 = this.f64678f;
            if (str9 != null) {
                j += C52418a.m58683j(3, str9);
            }
            String str10 = this.f64679g;
            if (str10 != null) {
                j += C52418a.m58683j(4, str10);
            }
            e54 e542 = this.f64680h;
            if (e542 != null) {
                j += C52418a.m58682i(5, e542.computeSize());
            }
            int h = j + C52418a.m58681h(6, this.f64681i);
            String str11 = this.f64682j;
            if (str11 != null) {
                h += C52418a.m58683j(7, str11);
            }
            int e = h + C52418a.m58678e(8, this.f64683n) + C52418a.m58674a(9, this.f64684o) + C52418a.m58678e(10, this.f64685p);
            String str12 = this.f64686q;
            if (str12 != null) {
                e += C52418a.m58683j(11, str12);
            }
            return e + C52418a.m58680g(12, 8, this.f64687r) + C52418a.m58680g(13, 8, this.f64688s);
        } else if (i2 == 2) {
            this.f64687r.clear();
            this.f64688s.clear();
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
            wh4 wh4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    wh4.f64676d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    wh4.f64677e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wh4.f64678f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wh4.f64679g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        e54 e543 = new e54();
                        if (bArr != null && bArr.length > 0) {
                            e543.parseFrom(bArr);
                        }
                        wh4.f64680h = e543;
                    }
                    return 0;
                case 6:
                    wh4.f64681i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    wh4.f64682j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    wh4.f64683n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    wh4.f64684o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    wh4.f64685p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    wh4.f64686q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size2 = j3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j3.get(i4);
                        xh4 xh4 = new xh4();
                        if (bArr2 != null && bArr2.length > 0) {
                            xh4.parseFrom(bArr2);
                        }
                        wh4.f64687r.add(xh4);
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size3 = j4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j4.get(i5);
                        C49768hy hyVar = new C49768hy();
                        if (bArr3 != null && bArr3.length > 0) {
                            hyVar.parseFrom(bArr3);
                        }
                        wh4.f64688s.add(hyVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f64676d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "relevantVid", str, false);
            aVar.mo71655d(jSONObject, "relevantExpand", this.f64677e, false);
            aVar.mo71655d(jSONObject, "relevantPreSearchId", this.f64678f, false);
            aVar.mo71655d(jSONObject, "relevantSharedOpenID", this.f64679g, false);
            aVar.mo71655d(jSONObject, "clickTag", this.f64680h, false);
            aVar.mo71655d(jSONObject, "recCategory", Long.valueOf(this.f64681i), false);
            aVar.mo71655d(jSONObject, "contextId", this.f64682j, false);
            aVar.mo71655d(jSONObject, "offset", Integer.valueOf(this.f64683n), false);
            aVar.mo71655d(jSONObject, "isSinglePage", Boolean.valueOf(this.f64684o), false);
            aVar.mo71655d(jSONObject, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f64685p), false);
            aVar.mo71655d(jSONObject, "keyword", this.f64686q, false);
            aVar.mo71655d(jSONObject, "cacheVideoList", this.f64687r, false);
            aVar.mo71655d(jSONObject, "extReqParams", this.f64688s, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
