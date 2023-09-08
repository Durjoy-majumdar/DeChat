package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u93 */
public class C90441u93 extends C47465a {

    /* renamed from: d */
    public String f259852d;

    /* renamed from: e */
    public int f259853e;

    /* renamed from: f */
    public LinkedList<C51364t93> f259854f = new LinkedList<>();

    /* renamed from: g */
    public int f259855g;

    /* renamed from: h */
    public int f259856h;

    /* renamed from: i */
    public C90448yt3 f259857i;

    /* renamed from: j */
    public int f259858j;

    /* renamed from: n */
    public LinkedList<C90439s93> f259859n = new LinkedList<>();

    /* renamed from: o */
    public boolean f259860o;

    /* renamed from: p */
    public LinkedList<C90448yt3> f259861p = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90441u93)) {
            return false;
        }
        C90441u93 u932 = (C90441u93) aVar;
        return C46238a.m51546a(this.f259852d, u932.f259852d) && C46238a.m51546a(Integer.valueOf(this.f259853e), Integer.valueOf(u932.f259853e)) && C46238a.m51546a(this.f259854f, u932.f259854f) && C46238a.m51546a(Integer.valueOf(this.f259855g), Integer.valueOf(u932.f259855g)) && C46238a.m51546a(Integer.valueOf(this.f259856h), Integer.valueOf(u932.f259856h)) && C46238a.m51546a(this.f259857i, u932.f259857i) && C46238a.m51546a(Integer.valueOf(this.f259858j), Integer.valueOf(u932.f259858j)) && C46238a.m51546a(this.f259859n, u932.f259859n) && C46238a.m51546a(Boolean.valueOf(this.f259860o), Boolean.valueOf(u932.f259860o)) && C46238a.m51546a(this.f259861p, u932.f259861p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259852d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f259853e);
                aVar.mo74320g(3, 8, this.f259854f);
                aVar.mo74318e(4, this.f259855g);
                aVar.mo74318e(5, this.f259856h);
                C90448yt3 yt32 = this.f259857i;
                if (yt32 != null) {
                    aVar.mo74322i(6, yt32.computeSize());
                    this.f259857i.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f259858j);
                aVar.mo74320g(8, 8, this.f259859n);
                aVar.mo74314a(9, this.f259860o);
                aVar.mo74320g(10, 8, this.f259861p);
                return 0;
            }
            throw new C52419b("Not all required fields were included: pid");
        } else if (i == 1) {
            String str2 = this.f259852d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f259853e) + C52418a.m58680g(3, 8, this.f259854f) + C52418a.m58678e(4, this.f259855g) + C52418a.m58678e(5, this.f259856h);
            C90448yt3 yt33 = this.f259857i;
            if (yt33 != null) {
                e += C52418a.m58682i(6, yt33.computeSize());
            }
            return e + C52418a.m58678e(7, this.f259858j) + C52418a.m58680g(8, 8, this.f259859n) + C52418a.m58674a(9, this.f259860o) + C52418a.m58680g(10, 8, this.f259861p);
        } else if (i == 2) {
            this.f259854f.clear();
            this.f259859n.clear();
            this.f259861p.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f259852d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: pid");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C90441u93 u932 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    u932.f259852d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    u932.f259853e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51364t93 t932 = new C51364t93();
                        if (bArr != null && bArr.length > 0) {
                            t932.parseFrom(bArr);
                        }
                        u932.f259854f.add(t932);
                    }
                    return 0;
                case 4:
                    u932.f259855g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    u932.f259856h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C90448yt3 yt34 = new C90448yt3();
                        if (bArr2 != null && bArr2.length > 0) {
                            yt34.parseFrom(bArr2);
                        }
                        u932.f259857i = yt34;
                    }
                    return 0;
                case 7:
                    u932.f259858j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C90439s93 s932 = new C90439s93();
                        if (bArr3 != null && bArr3.length > 0) {
                            s932.parseFrom(bArr3);
                        }
                        u932.f259859n.add(s932);
                    }
                    return 0;
                case 9:
                    u932.f259860o = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C90448yt3 yt35 = new C90448yt3();
                        if (bArr4 != null && bArr4.length > 0) {
                            yt35.parseFrom(bArr4);
                        }
                        u932.f259861p.add(yt35);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
