package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eb3 */
public class C22494eb3 extends C47465a {

    /* renamed from: d */
    public String f63778d;

    /* renamed from: e */
    public C48884bn2 f63779e;

    /* renamed from: f */
    public String f63780f;

    /* renamed from: g */
    public String f63781g;

    /* renamed from: h */
    public String f63782h;

    /* renamed from: i */
    public int f63783i;

    /* renamed from: j */
    public int f63784j;

    /* renamed from: n */
    public int f63785n;

    /* renamed from: o */
    public int f63786o;

    /* renamed from: p */
    public int f63787p;

    /* renamed from: q */
    public C64816wv f63788q;

    /* renamed from: r */
    public int f63789r;

    /* renamed from: s */
    public int f63790s;

    /* renamed from: t */
    public C50044jw f63791t;

    /* renamed from: u */
    public LinkedList<C49768hy> f63792u = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22494eb3)) {
            return false;
        }
        C22494eb3 eb32 = (C22494eb3) aVar;
        return C46238a.m51546a(this.f63778d, eb32.f63778d) && C46238a.m51546a(this.f63779e, eb32.f63779e) && C46238a.m51546a(this.f63780f, eb32.f63780f) && C46238a.m51546a(this.f63781g, eb32.f63781g) && C46238a.m51546a(this.f63782h, eb32.f63782h) && C46238a.m51546a(Integer.valueOf(this.f63783i), Integer.valueOf(eb32.f63783i)) && C46238a.m51546a(Integer.valueOf(this.f63784j), Integer.valueOf(eb32.f63784j)) && C46238a.m51546a(Integer.valueOf(this.f63785n), Integer.valueOf(eb32.f63785n)) && C46238a.m51546a(Integer.valueOf(this.f63786o), Integer.valueOf(eb32.f63786o)) && C46238a.m51546a(Integer.valueOf(this.f63787p), Integer.valueOf(eb32.f63787p)) && C46238a.m51546a(this.f63788q, eb32.f63788q) && C46238a.m51546a(Integer.valueOf(this.f63789r), Integer.valueOf(eb32.f63789r)) && C46238a.m51546a(Integer.valueOf(this.f63790s), Integer.valueOf(eb32.f63790s)) && C46238a.m51546a(this.f63791t, eb32.f63791t) && C46238a.m51546a(this.f63792u, eb32.f63792u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f63778d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C48884bn2 bn22 = this.f63779e;
            if (bn22 != null) {
                aVar.mo74322i(2, bn22.computeSize());
                this.f63779e.writeFields(aVar);
            }
            String str2 = this.f63780f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f63781g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f63782h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f63783i);
            aVar.mo74318e(7, this.f63784j);
            aVar.mo74318e(8, this.f63785n);
            aVar.mo74318e(9, this.f63786o);
            aVar.mo74318e(10, this.f63787p);
            C64816wv wvVar = this.f63788q;
            if (wvVar != null) {
                aVar.mo74322i(11, wvVar.computeSize());
                this.f63788q.writeFields(aVar);
            }
            aVar.mo74318e(12, this.f63789r);
            aVar.mo74318e(13, this.f63790s);
            C50044jw jwVar = this.f63791t;
            if (jwVar != null) {
                aVar.mo74322i(14, jwVar.computeSize());
                this.f63791t.writeFields(aVar);
            }
            aVar.mo74320g(15, 8, this.f63792u);
            return 0;
        } else if (i2 == 1) {
            String str5 = this.f63778d;
            if (str5 != null) {
                i3 = C52418a.m58683j(1, str5) + 0;
            }
            C48884bn2 bn23 = this.f63779e;
            if (bn23 != null) {
                i3 += C52418a.m58682i(2, bn23.computeSize());
            }
            String str6 = this.f63780f;
            if (str6 != null) {
                i3 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f63781g;
            if (str7 != null) {
                i3 += C52418a.m58683j(4, str7);
            }
            String str8 = this.f63782h;
            if (str8 != null) {
                i3 += C52418a.m58683j(5, str8);
            }
            int e = i3 + C52418a.m58678e(6, this.f63783i) + C52418a.m58678e(7, this.f63784j) + C52418a.m58678e(8, this.f63785n) + C52418a.m58678e(9, this.f63786o) + C52418a.m58678e(10, this.f63787p);
            C64816wv wvVar2 = this.f63788q;
            if (wvVar2 != null) {
                e += C52418a.m58682i(11, wvVar2.computeSize());
            }
            int e2 = e + C52418a.m58678e(12, this.f63789r) + C52418a.m58678e(13, this.f63790s);
            C50044jw jwVar2 = this.f63791t;
            if (jwVar2 != null) {
                e2 += C52418a.m58682i(14, jwVar2.computeSize());
            }
            return e2 + C52418a.m58680g(15, 8, this.f63792u);
        } else if (i2 == 2) {
            this.f63792u.clear();
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
            C22494eb3 eb32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    eb32.f63778d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C48884bn2 bn24 = new C48884bn2();
                        if (bArr != null && bArr.length > 0) {
                            bn24.parseFrom(bArr);
                        }
                        eb32.f63779e = bn24;
                    }
                    return 0;
                case 3:
                    eb32.f63780f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    eb32.f63781g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    eb32.f63782h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    eb32.f63783i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    eb32.f63784j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    eb32.f63785n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    eb32.f63786o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    eb32.f63787p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64816wv wvVar3 = new C64816wv();
                        if (bArr2 != null && bArr2.length > 0) {
                            wvVar3.parseFrom(bArr2);
                        }
                        eb32.f63788q = wvVar3;
                    }
                    return 0;
                case 12:
                    eb32.f63789r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    eb32.f63790s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C50044jw jwVar3 = new C50044jw();
                        if (bArr3 != null && bArr3.length > 0) {
                            jwVar3.parseFrom(bArr3);
                        }
                        eb32.f63791t = jwVar3;
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C49768hy hyVar = new C49768hy();
                        if (bArr4 != null && bArr4.length > 0) {
                            hyVar.parseFrom(bArr4);
                        }
                        eb32.f63792u.add(hyVar);
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
            String str = this.f63778d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Query", str, false);
            aVar.mo71655d(jSONObject, "Location", this.f63779e, false);
            aVar.mo71655d(jSONObject, "SessionId", this.f63780f, false);
            aVar.mo71655d(jSONObject, "RequestId", this.f63781g, false);
            aVar.mo71655d(jSONObject, "Source", this.f63782h, false);
            aVar.mo71655d(jSONObject, "PardusSwitch", Integer.valueOf(this.f63783i), false);
            aVar.mo71655d(jSONObject, "H5Version", Integer.valueOf(this.f63784j), false);
            aVar.mo71655d(jSONObject, "DarkMode", Integer.valueOf(this.f63785n), false);
            aVar.mo71655d(jSONObject, "Scene", Integer.valueOf(this.f63786o), false);
            aVar.mo71655d(jSONObject, "BusinessType", Integer.valueOf(this.f63787p), false);
            aVar.mo71655d(jSONObject, "ChildMode", this.f63788q, false);
            aVar.mo71655d(jSONObject, "WebSearchH5Version", Integer.valueOf(this.f63789r), false);
            aVar.mo71655d(jSONObject, "ActionType", Integer.valueOf(this.f63790s), false);
            aVar.mo71655d(jSONObject, "ClickContext", this.f63791t, false);
            aVar.mo71655d(jSONObject, "ExtReqParams", this.f63792u, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
