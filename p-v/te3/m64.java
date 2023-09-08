package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class m64 extends C47465a {

    /* renamed from: d */
    public String f298773d;

    /* renamed from: e */
    public String f298774e;

    /* renamed from: f */
    public String f298775f;

    /* renamed from: g */
    public String f298776g;

    /* renamed from: h */
    public int f298777h;

    /* renamed from: i */
    public int f298778i;

    /* renamed from: j */
    public int f298779j;

    /* renamed from: n */
    public String f298780n;

    /* renamed from: o */
    public int f298781o;

    /* renamed from: p */
    public int f298782p;

    /* renamed from: q */
    public int f298783q;

    /* renamed from: r */
    public long f298784r;

    /* renamed from: s */
    public long f298785s;

    /* renamed from: t */
    public C51018qv3 f298786t;

    /* renamed from: u */
    public int f298787u;

    /* renamed from: v */
    public C52156yq3 f298788v;

    /* renamed from: w */
    public LinkedList<c74> f298789w = new LinkedList<>();

    /* renamed from: x */
    public int f298790x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof m64)) {
            return false;
        }
        m64 m64 = (m64) aVar;
        return C46238a.m51546a(this.f298773d, m64.f298773d) && C46238a.m51546a(this.f298774e, m64.f298774e) && C46238a.m51546a(this.f298775f, m64.f298775f) && C46238a.m51546a(this.f298776g, m64.f298776g) && C46238a.m51546a(Integer.valueOf(this.f298777h), Integer.valueOf(m64.f298777h)) && C46238a.m51546a(Integer.valueOf(this.f298778i), Integer.valueOf(m64.f298778i)) && C46238a.m51546a(Integer.valueOf(this.f298779j), Integer.valueOf(m64.f298779j)) && C46238a.m51546a(this.f298780n, m64.f298780n) && C46238a.m51546a(Integer.valueOf(this.f298781o), Integer.valueOf(m64.f298781o)) && C46238a.m51546a(Integer.valueOf(this.f298782p), Integer.valueOf(m64.f298782p)) && C46238a.m51546a(Integer.valueOf(this.f298783q), Integer.valueOf(m64.f298783q)) && C46238a.m51546a(Long.valueOf(this.f298784r), Long.valueOf(m64.f298784r)) && C46238a.m51546a(Long.valueOf(this.f298785s), Long.valueOf(m64.f298785s)) && C46238a.m51546a(this.f298786t, m64.f298786t) && C46238a.m51546a(Integer.valueOf(this.f298787u), Integer.valueOf(m64.f298787u)) && C46238a.m51546a(this.f298788v, m64.f298788v) && C46238a.m51546a(this.f298789w, m64.f298789w) && C46238a.m51546a(Integer.valueOf(this.f298790x), Integer.valueOf(m64.f298790x));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298773d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f298774e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f298775f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f298776g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f298777h);
            aVar.mo74318e(6, this.f298778i);
            aVar.mo74318e(7, this.f298779j);
            String str5 = this.f298780n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74318e(9, this.f298781o);
            aVar.mo74318e(10, this.f298782p);
            aVar.mo74318e(11, this.f298783q);
            aVar.mo74321h(12, this.f298784r);
            aVar.mo74321h(13, this.f298785s);
            C51018qv3 qv32 = this.f298786t;
            if (qv32 != null) {
                aVar.mo74322i(14, qv32.computeSize());
                this.f298786t.writeFields(aVar);
            }
            aVar.mo74318e(15, this.f298787u);
            C52156yq3 yq32 = this.f298788v;
            if (yq32 != null) {
                aVar.mo74322i(16, yq32.computeSize());
                this.f298788v.writeFields(aVar);
            }
            aVar.mo74320g(17, 8, this.f298789w);
            aVar.mo74318e(18, this.f298790x);
            return 0;
        } else if (i2 == 1) {
            String str6 = this.f298773d;
            if (str6 != null) {
                i3 = C52418a.m58683j(1, str6) + 0;
            }
            String str7 = this.f298774e;
            if (str7 != null) {
                i3 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f298775f;
            if (str8 != null) {
                i3 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f298776g;
            if (str9 != null) {
                i3 += C52418a.m58683j(4, str9);
            }
            int e = i3 + C52418a.m58678e(5, this.f298777h) + C52418a.m58678e(6, this.f298778i) + C52418a.m58678e(7, this.f298779j);
            String str10 = this.f298780n;
            if (str10 != null) {
                e += C52418a.m58683j(8, str10);
            }
            int e2 = e + C52418a.m58678e(9, this.f298781o) + C52418a.m58678e(10, this.f298782p) + C52418a.m58678e(11, this.f298783q) + C52418a.m58681h(12, this.f298784r) + C52418a.m58681h(13, this.f298785s);
            C51018qv3 qv33 = this.f298786t;
            if (qv33 != null) {
                e2 += C52418a.m58682i(14, qv33.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(15, this.f298787u);
            C52156yq3 yq33 = this.f298788v;
            if (yq33 != null) {
                e3 += C52418a.m58682i(16, yq33.computeSize());
            }
            return e3 + C52418a.m58680g(17, 8, this.f298789w) + C52418a.m58678e(18, this.f298790x);
        } else if (i2 == 2) {
            this.f298789w.clear();
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
            m64 m64 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    m64.f298773d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    m64.f298774e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    m64.f298775f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    m64.f298776g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m64.f298777h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    m64.f298778i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    m64.f298779j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    m64.f298780n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    m64.f298781o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    m64.f298782p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    m64.f298783q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    m64.f298784r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    m64.f298785s = aVar3.mo141631i(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv34.mo73348f(bArr);
                        }
                        m64.f298786t = qv34;
                    }
                    return 0;
                case 15:
                    m64.f298787u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C52156yq3 yq34 = new C52156yq3();
                        if (bArr2 != null && bArr2.length > 0) {
                            yq34.parseFrom(bArr2);
                        }
                        m64.f298788v = yq34;
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        c74 c74 = new c74();
                        if (bArr3 != null && bArr3.length > 0) {
                            c74.parseFrom(bArr3);
                        }
                        m64.f298789w.add(c74);
                    }
                    return 0;
                case 18:
                    m64.f298790x = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
