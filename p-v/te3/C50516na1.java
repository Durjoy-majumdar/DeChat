package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.na1 */
public class C50516na1 extends C47465a {

    /* renamed from: d */
    public String f138504d;

    /* renamed from: e */
    public long f138505e;

    /* renamed from: f */
    public long f138506f;

    /* renamed from: g */
    public String f138507g;

    /* renamed from: h */
    public String f138508h;

    /* renamed from: i */
    public long f138509i;

    /* renamed from: j */
    public boolean f138510j;

    /* renamed from: n */
    public boolean f138511n;

    /* renamed from: o */
    public int f138512o;

    /* renamed from: p */
    public LinkedList<ar4> f138513p = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50516na1)) {
            return false;
        }
        C50516na1 na12 = (C50516na1) aVar;
        return C46238a.m51546a(this.f138504d, na12.f138504d) && C46238a.m51546a(Long.valueOf(this.f138505e), Long.valueOf(na12.f138505e)) && C46238a.m51546a(Long.valueOf(this.f138506f), Long.valueOf(na12.f138506f)) && C46238a.m51546a(this.f138507g, na12.f138507g) && C46238a.m51546a(this.f138508h, na12.f138508h) && C46238a.m51546a(Long.valueOf(this.f138509i), Long.valueOf(na12.f138509i)) && C46238a.m51546a(Boolean.valueOf(this.f138510j), Boolean.valueOf(na12.f138510j)) && C46238a.m51546a(Boolean.valueOf(this.f138511n), Boolean.valueOf(na12.f138511n)) && C46238a.m51546a(Integer.valueOf(this.f138512o), Integer.valueOf(na12.f138512o)) && C46238a.m51546a(this.f138513p, na12.f138513p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138504d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f138505e);
            aVar.mo74321h(3, this.f138506f);
            String str2 = this.f138507g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f138508h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74321h(6, this.f138509i);
            aVar.mo74314a(7, this.f138510j);
            aVar.mo74314a(8, this.f138511n);
            aVar.mo74318e(9, this.f138512o);
            aVar.mo74320g(10, 8, this.f138513p);
            return 0;
        } else if (i == 1) {
            String str4 = this.f138504d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int h = i2 + C52418a.m58681h(2, this.f138505e) + C52418a.m58681h(3, this.f138506f);
            String str5 = this.f138507g;
            if (str5 != null) {
                h += C52418a.m58683j(4, str5);
            }
            String str6 = this.f138508h;
            if (str6 != null) {
                h += C52418a.m58683j(5, str6);
            }
            return h + C52418a.m58681h(6, this.f138509i) + C52418a.m58674a(7, this.f138510j) + C52418a.m58674a(8, this.f138511n) + C52418a.m58678e(9, this.f138512o) + C52418a.m58680g(10, 8, this.f138513p);
        } else if (i == 2) {
            this.f138513p.clear();
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
            C50516na1 na12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    na12.f138504d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    na12.f138505e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    na12.f138506f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    na12.f138507g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    na12.f138508h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    na12.f138509i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    na12.f138510j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    na12.f138511n = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    na12.f138512o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        ar4 ar4 = new ar4();
                        if (bArr != null && bArr.length > 0) {
                            ar4.parseFrom(bArr);
                        }
                        na12.f138513p.add(ar4);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
