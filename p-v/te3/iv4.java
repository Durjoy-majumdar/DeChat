package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

public class iv4 extends C47465a {

    /* renamed from: d */
    public C101858vq3 f298414d;

    /* renamed from: e */
    public C101763c50 f298415e;

    /* renamed from: f */
    public int f298416f;

    /* renamed from: g */
    public LinkedList<Integer> f298417g = new LinkedList<>();

    /* renamed from: h */
    public int f298418h;

    /* renamed from: i */
    public LinkedList<Integer> f298419i = new LinkedList<>();

    /* renamed from: j */
    public int f298420j;

    /* renamed from: n */
    public C101858vq3 f298421n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof iv4)) {
            return false;
        }
        iv4 iv4 = (iv4) aVar;
        return C46238a.m51546a(this.f298414d, iv4.f298414d) && C46238a.m51546a(this.f298415e, iv4.f298415e) && C46238a.m51546a(Integer.valueOf(this.f298416f), Integer.valueOf(iv4.f298416f)) && C46238a.m51546a(this.f298417g, iv4.f298417g) && C46238a.m51546a(Integer.valueOf(this.f298418h), Integer.valueOf(iv4.f298418h)) && C46238a.m51546a(this.f298419i, iv4.f298419i) && C46238a.m51546a(Integer.valueOf(this.f298420j), Integer.valueOf(iv4.f298420j)) && C46238a.m51546a(this.f298421n, iv4.f298421n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C101858vq3 vq32 = this.f298414d;
            if (vq32 != null) {
                aVar.mo74322i(1, vq32.computeSize());
                this.f298414d.writeFields(aVar);
            }
            C101763c50 c502 = this.f298415e;
            if (c502 != null) {
                aVar.mo74322i(2, c502.computeSize());
                this.f298415e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f298416f);
            aVar.mo74324k(4, 2, this.f298417g);
            aVar.mo74318e(5, this.f298418h);
            aVar.mo74324k(6, 2, this.f298419i);
            aVar.mo74318e(7, this.f298420j);
            C101858vq3 vq33 = this.f298421n;
            if (vq33 != null) {
                aVar.mo74322i(8, vq33.computeSize());
                this.f298421n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C101858vq3 vq34 = this.f298414d;
            if (vq34 != null) {
                i2 = 0 + C52418a.m58682i(1, vq34.computeSize());
            }
            C101763c50 c503 = this.f298415e;
            if (c503 != null) {
                i2 += C52418a.m58682i(2, c503.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f298416f) + C52418a.m58684k(4, 2, this.f298417g) + C52418a.m58678e(5, this.f298418h) + C52418a.m58684k(6, 2, this.f298419i) + C52418a.m58678e(7, this.f298420j);
            C101858vq3 vq35 = this.f298421n;
            return vq35 != null ? e + C52418a.m58682i(8, vq35.computeSize()) : e;
        } else if (i == 2) {
            this.f298417g.clear();
            this.f298419i.clear();
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
            iv4 iv4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C101858vq3 vq36 = new C101858vq3();
                        if (bArr != null && bArr.length > 0) {
                            vq36.parseFrom(bArr);
                        }
                        iv4.f298414d = vq36;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C101763c50 c504 = new C101763c50();
                        if (bArr2 != null && bArr2.length > 0) {
                            c504.parseFrom(bArr2);
                        }
                        iv4.f298415e = c504;
                    }
                    return 0;
                case 3:
                    iv4.f298416f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    byte[] bArr3 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr3, 0, bArr3.length);
                    LinkedList<Integer> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                    }
                    iv4.f298417g = linkedList;
                    return 0;
                case 5:
                    iv4.f298418h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    byte[] bArr4 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar5 = new C102536a(bArr4, 0, bArr4.length);
                    LinkedList<Integer> linkedList2 = new LinkedList<>();
                    while (aVar5.f301908c < aVar5.f301907b) {
                        linkedList2.add(Integer.valueOf(aVar5.mo142153f()));
                    }
                    iv4.f298419i = linkedList2;
                    return 0;
                case 7:
                    iv4.f298420j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr5 = j3.get(i5);
                        C101858vq3 vq37 = new C101858vq3();
                        if (bArr5 != null && bArr5.length > 0) {
                            vq37.parseFrom(bArr5);
                        }
                        iv4.f298421n = vq37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
