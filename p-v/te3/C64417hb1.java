package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hb1 */
public class C64417hb1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C64550mb1> f183455d = new LinkedList<>();

    /* renamed from: e */
    public C64488kb1 f183456e;

    /* renamed from: f */
    public C64463jb1 f183457f;

    /* renamed from: g */
    public C49133de1 f183458g;

    /* renamed from: h */
    public C49824ib1 f183459h;

    /* renamed from: i */
    public LinkedList<C64550mb1> f183460i = new LinkedList<>();

    /* renamed from: j */
    public int f183461j;

    /* renamed from: n */
    public int f183462n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64417hb1)) {
            return false;
        }
        C64417hb1 hb12 = (C64417hb1) aVar;
        return C46238a.m51546a(this.f183455d, hb12.f183455d) && C46238a.m51546a(this.f183456e, hb12.f183456e) && C46238a.m51546a(this.f183457f, hb12.f183457f) && C46238a.m51546a(this.f183458g, hb12.f183458g) && C46238a.m51546a(this.f183459h, hb12.f183459h) && C46238a.m51546a(this.f183460i, hb12.f183460i) && C46238a.m51546a(Integer.valueOf(this.f183461j), Integer.valueOf(hb12.f183461j)) && C46238a.m51546a(Integer.valueOf(this.f183462n), Integer.valueOf(hb12.f183462n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f183455d);
            C64488kb1 kb12 = this.f183456e;
            if (kb12 != null) {
                aVar.mo74322i(2, kb12.computeSize());
                this.f183456e.writeFields(aVar);
            }
            C64463jb1 jb12 = this.f183457f;
            if (jb12 != null) {
                aVar.mo74322i(3, jb12.computeSize());
                this.f183457f.writeFields(aVar);
            }
            C49133de1 de12 = this.f183458g;
            if (de12 != null) {
                aVar.mo74322i(4, de12.computeSize());
                this.f183458g.writeFields(aVar);
            }
            C49824ib1 ib12 = this.f183459h;
            if (ib12 != null) {
                aVar.mo74322i(5, ib12.computeSize());
                this.f183459h.writeFields(aVar);
            }
            aVar.mo74320g(6, 8, this.f183460i);
            aVar.mo74318e(7, this.f183461j);
            aVar.mo74318e(8, this.f183462n);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f183455d) + 0;
            C64488kb1 kb13 = this.f183456e;
            if (kb13 != null) {
                g += C52418a.m58682i(2, kb13.computeSize());
            }
            C64463jb1 jb13 = this.f183457f;
            if (jb13 != null) {
                g += C52418a.m58682i(3, jb13.computeSize());
            }
            C49133de1 de13 = this.f183458g;
            if (de13 != null) {
                g += C52418a.m58682i(4, de13.computeSize());
            }
            C49824ib1 ib13 = this.f183459h;
            if (ib13 != null) {
                g += C52418a.m58682i(5, ib13.computeSize());
            }
            return g + C52418a.m58680g(6, 8, this.f183460i) + C52418a.m58678e(7, this.f183461j) + C52418a.m58678e(8, this.f183462n);
        } else if (i == 2) {
            this.f183455d.clear();
            this.f183460i.clear();
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
            C64417hb1 hb12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64550mb1 mb12 = new C64550mb1();
                        if (bArr != null && bArr.length > 0) {
                            mb12.parseFrom(bArr);
                        }
                        hb12.f183455d.add(mb12);
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64488kb1 kb14 = new C64488kb1();
                        if (bArr2 != null && bArr2.length > 0) {
                            kb14.parseFrom(bArr2);
                        }
                        hb12.f183456e = kb14;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C64463jb1 jb14 = new C64463jb1();
                        if (bArr3 != null && bArr3.length > 0) {
                            jb14.parseFrom(bArr3);
                        }
                        hb12.f183457f = jb14;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C49133de1 de14 = new C49133de1();
                        if (bArr4 != null && bArr4.length > 0) {
                            de14.parseFrom(bArr4);
                        }
                        hb12.f183458g = de14;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C49824ib1 ib14 = new C49824ib1();
                        if (bArr5 != null && bArr5.length > 0) {
                            ib14.parseFrom(bArr5);
                        }
                        hb12.f183459h = ib14;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i7 = 0; i7 < size6; i7++) {
                        byte[] bArr6 = j6.get(i7);
                        C64550mb1 mb13 = new C64550mb1();
                        if (bArr6 != null && bArr6.length > 0) {
                            mb13.parseFrom(bArr6);
                        }
                        hb12.f183460i.add(mb13);
                    }
                    return 0;
                case 7:
                    hb12.f183461j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    hb12.f183462n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
