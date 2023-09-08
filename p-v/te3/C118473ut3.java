package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ut3 */
public class C118473ut3 extends C47465a {

    /* renamed from: d */
    public int f354482d;

    /* renamed from: e */
    public C90448yt3 f354483e;

    /* renamed from: f */
    public C52019xt3 f354484f;

    /* renamed from: g */
    public int f354485g;

    /* renamed from: h */
    public int f354486h;

    /* renamed from: i */
    public String f354487i;

    /* renamed from: j */
    public int f354488j;

    /* renamed from: n */
    public int f354489n;

    /* renamed from: o */
    public int f354490o;

    /* renamed from: p */
    public int f354491p;

    /* renamed from: q */
    public int f354492q;

    /* renamed from: r */
    public int f354493r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118473ut3)) {
            return false;
        }
        C118473ut3 ut32 = (C118473ut3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f354482d), Integer.valueOf(ut32.f354482d)) && C46238a.m51546a(this.f354483e, ut32.f354483e) && C46238a.m51546a(this.f354484f, ut32.f354484f) && C46238a.m51546a(Integer.valueOf(this.f354485g), Integer.valueOf(ut32.f354485g)) && C46238a.m51546a(Integer.valueOf(this.f354486h), Integer.valueOf(ut32.f354486h)) && C46238a.m51546a(this.f354487i, ut32.f354487i) && C46238a.m51546a(Integer.valueOf(this.f354488j), Integer.valueOf(ut32.f354488j)) && C46238a.m51546a(Integer.valueOf(this.f354489n), Integer.valueOf(ut32.f354489n)) && C46238a.m51546a(Integer.valueOf(this.f354490o), Integer.valueOf(ut32.f354490o)) && C46238a.m51546a(Integer.valueOf(this.f354491p), Integer.valueOf(ut32.f354491p)) && C46238a.m51546a(Integer.valueOf(this.f354492q), Integer.valueOf(ut32.f354492q)) && C46238a.m51546a(Integer.valueOf(this.f354493r), Integer.valueOf(ut32.f354493r));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f354487i != null) {
                aVar.mo74318e(1, this.f354482d);
                C90448yt3 yt32 = this.f354483e;
                if (yt32 != null) {
                    aVar.mo74322i(2, yt32.computeSize());
                    this.f354483e.writeFields(aVar);
                }
                C52019xt3 xt32 = this.f354484f;
                if (xt32 != null) {
                    aVar.mo74322i(3, xt32.computeSize());
                    this.f354484f.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f354485g);
                aVar.mo74318e(5, this.f354486h);
                String str = this.f354487i;
                if (str != null) {
                    aVar.mo74323j(6, str);
                }
                aVar.mo74318e(7, this.f354488j);
                aVar.mo74318e(8, this.f354489n);
                aVar.mo74318e(9, this.f354490o);
                aVar.mo74318e(10, this.f354491p);
                aVar.mo74318e(11, this.f354492q);
                aVar.mo74318e(12, this.f354493r);
                return 0;
            }
            throw new C52419b("Not all required fields were included: SampleId");
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f354482d) + 0;
            C90448yt3 yt33 = this.f354483e;
            if (yt33 != null) {
                e += C52418a.m58682i(2, yt33.computeSize());
            }
            C52019xt3 xt33 = this.f354484f;
            if (xt33 != null) {
                e += C52418a.m58682i(3, xt33.computeSize());
            }
            int e2 = e + C52418a.m58678e(4, this.f354485g) + C52418a.m58678e(5, this.f354486h);
            String str2 = this.f354487i;
            if (str2 != null) {
                e2 += C52418a.m58683j(6, str2);
            }
            return e2 + C52418a.m58678e(7, this.f354488j) + C52418a.m58678e(8, this.f354489n) + C52418a.m58678e(9, this.f354490o) + C52418a.m58678e(10, this.f354491p) + C52418a.m58678e(11, this.f354492q) + C52418a.m58678e(12, this.f354493r);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f354487i != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: SampleId");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118473ut3 ut32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ut32.f354482d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90448yt3 yt34 = new C90448yt3();
                        if (bArr != null && bArr.length > 0) {
                            yt34.parseFrom(bArr);
                        }
                        ut32.f354483e = yt34;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52019xt3 xt34 = new C52019xt3();
                        if (bArr2 != null && bArr2.length > 0) {
                            xt34.parseFrom(bArr2);
                        }
                        ut32.f354484f = xt34;
                    }
                    return 0;
                case 4:
                    ut32.f354485g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ut32.f354486h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ut32.f354487i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ut32.f354488j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ut32.f354489n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ut32.f354490o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ut32.f354491p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    ut32.f354492q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    ut32.f354493r = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
