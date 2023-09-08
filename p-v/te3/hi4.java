package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class hi4 extends C47465a {

    /* renamed from: d */
    public String f183504d;

    /* renamed from: e */
    public int f183505e;

    /* renamed from: f */
    public long f183506f;

    /* renamed from: g */
    public long f183507g;

    /* renamed from: h */
    public long f183508h;

    /* renamed from: i */
    public long f183509i;

    /* renamed from: j */
    public long f183510j;

    /* renamed from: n */
    public int f183511n;

    /* renamed from: o */
    public int f183512o;

    /* renamed from: p */
    public float f183513p;

    /* renamed from: q */
    public float f183514q;

    /* renamed from: r */
    public C64543m10 f183515r;

    /* renamed from: s */
    public int f183516s;

    /* renamed from: t */
    public tj4 f183517t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof hi4)) {
            return false;
        }
        hi4 hi4 = (hi4) aVar;
        return C46238a.m51546a(this.f183504d, hi4.f183504d) && C46238a.m51546a(Integer.valueOf(this.f183505e), Integer.valueOf(hi4.f183505e)) && C46238a.m51546a(Long.valueOf(this.f183506f), Long.valueOf(hi4.f183506f)) && C46238a.m51546a(Long.valueOf(this.f183507g), Long.valueOf(hi4.f183507g)) && C46238a.m51546a(Long.valueOf(this.f183508h), Long.valueOf(hi4.f183508h)) && C46238a.m51546a(Long.valueOf(this.f183509i), Long.valueOf(hi4.f183509i)) && C46238a.m51546a(Long.valueOf(this.f183510j), Long.valueOf(hi4.f183510j)) && C46238a.m51546a(Integer.valueOf(this.f183511n), Integer.valueOf(hi4.f183511n)) && C46238a.m51546a(Integer.valueOf(this.f183512o), Integer.valueOf(hi4.f183512o)) && C46238a.m51546a(Float.valueOf(this.f183513p), Float.valueOf(hi4.f183513p)) && C46238a.m51546a(Float.valueOf(this.f183514q), Float.valueOf(hi4.f183514q)) && C46238a.m51546a(this.f183515r, hi4.f183515r) && C46238a.m51546a(Integer.valueOf(this.f183516s), Integer.valueOf(hi4.f183516s)) && C46238a.m51546a(this.f183517t, hi4.f183517t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183504d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f183505e);
                aVar.mo74321h(3, this.f183506f);
                aVar.mo74321h(4, this.f183507g);
                aVar.mo74321h(5, this.f183508h);
                aVar.mo74321h(6, this.f183509i);
                aVar.mo74321h(7, this.f183510j);
                aVar.mo74318e(8, this.f183511n);
                aVar.mo74318e(9, this.f183512o);
                aVar.mo74317d(10, this.f183513p);
                aVar.mo74317d(11, this.f183514q);
                C64543m10 m102 = this.f183515r;
                if (m102 != null) {
                    aVar.mo74322i(12, m102.computeSize());
                    this.f183515r.writeFields(aVar);
                }
                aVar.mo74318e(13, this.f183516s);
                tj4 tj4 = this.f183517t;
                if (tj4 != null) {
                    aVar.mo74322i(14, tj4.computeSize());
                    this.f183517t.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: path");
        } else if (i2 == 1) {
            String str2 = this.f183504d;
            if (str2 != null) {
                i3 = C52418a.m58683j(1, str2) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f183505e) + C52418a.m58681h(3, this.f183506f) + C52418a.m58681h(4, this.f183507g) + C52418a.m58681h(5, this.f183508h) + C52418a.m58681h(6, this.f183509i) + C52418a.m58681h(7, this.f183510j) + C52418a.m58678e(8, this.f183511n) + C52418a.m58678e(9, this.f183512o) + C52418a.m58677d(10, this.f183513p) + C52418a.m58677d(11, this.f183514q);
            C64543m10 m103 = this.f183515r;
            if (m103 != null) {
                e += C52418a.m58682i(12, m103.computeSize());
            }
            int e2 = e + C52418a.m58678e(13, this.f183516s);
            tj4 tj42 = this.f183517t;
            return tj42 != null ? e2 + C52418a.m58682i(14, tj42.computeSize()) : e2;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f183504d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: path");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            hi4 hi4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hi4.f183504d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    hi4.f183505e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    hi4.f183506f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    hi4.f183507g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    hi4.f183508h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    hi4.f183509i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    hi4.f183510j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    hi4.f183511n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    hi4.f183512o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    hi4.f183513p = aVar3.mo141628f(intValue);
                    return 0;
                case 11:
                    hi4.f183514q = aVar3.mo141628f(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C64543m10 m104 = new C64543m10();
                        if (bArr != null && bArr.length > 0) {
                            m104.parseFrom(bArr);
                        }
                        hi4.f183515r = m104;
                    }
                    return 0;
                case 13:
                    hi4.f183516s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        tj4 tj43 = new tj4();
                        if (bArr2 != null && bArr2.length > 0) {
                            tj43.parseFrom(bArr2);
                        }
                        hi4.f183517t = tj43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
