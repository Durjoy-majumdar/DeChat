package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l14 */
public class C118441l14 extends C47465a {

    /* renamed from: d */
    public boolean f354092d = true;

    /* renamed from: e */
    public boolean f354093e = false;

    /* renamed from: f */
    public LinkedList<C118446n14> f354094f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C118439k14> f354095g = new LinkedList<>();

    /* renamed from: h */
    public C118443m14 f354096h;

    /* renamed from: i */
    public LinkedList<C118455p14> f354097i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118441l14)) {
            return false;
        }
        C118441l14 l142 = (C118441l14) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f354092d), Boolean.valueOf(l142.f354092d)) && C46238a.m51546a(Boolean.valueOf(this.f354093e), Boolean.valueOf(l142.f354093e)) && C46238a.m51546a(this.f354094f, l142.f354094f) && C46238a.m51546a(this.f354095g, l142.f354095g) && C46238a.m51546a(this.f354096h, l142.f354096h) && C46238a.m51546a(this.f354097i, l142.f354097i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f354092d);
            aVar.mo74314a(2, this.f354093e);
            aVar.mo74320g(3, 8, this.f354094f);
            aVar.mo74320g(4, 8, this.f354095g);
            C118443m14 m142 = this.f354096h;
            if (m142 != null) {
                aVar.mo74322i(5, m142.computeSize());
                this.f354096h.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.f354097i);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f354092d) + 0 + C52418a.m58674a(2, this.f354093e) + C52418a.m58680g(3, 8, this.f354094f) + C52418a.m58680g(4, 8, this.f354095g);
            C118443m14 m143 = this.f354096h;
            if (m143 != null) {
                a += C52418a.m58682i(5, m143.computeSize());
            }
            return a + C52418a.m58680g(6, 8, this.f354097i);
        } else if (i == 2) {
            this.f354094f.clear();
            this.f354095g.clear();
            this.f354097i.clear();
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
            C118441l14 l142 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    l142.f354092d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    l142.f354093e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C118446n14 n142 = new C118446n14();
                        if (bArr != null && bArr.length > 0) {
                            n142.parseFrom(bArr);
                        }
                        l142.f354094f.add(n142);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C118439k14 k142 = new C118439k14();
                        if (bArr2 != null && bArr2.length > 0) {
                            k142.parseFrom(bArr2);
                        }
                        l142.f354095g.add(k142);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C118443m14 m144 = new C118443m14();
                        if (bArr3 != null && bArr3.length > 0) {
                            m144.parseFrom(bArr3);
                        }
                        l142.f354096h = m144;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C118455p14 p142 = new C118455p14();
                        if (bArr4 != null && bArr4.length > 0) {
                            p142.parseFrom(bArr4);
                        }
                        l142.f354097i.add(p142);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
