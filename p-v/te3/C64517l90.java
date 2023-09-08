package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l90 */
public class C64517l90 extends C47465a {

    /* renamed from: d */
    public C64487k90 f184051d;

    /* renamed from: e */
    public C64487k90 f184052e;

    /* renamed from: f */
    public boolean f184053f;

    /* renamed from: g */
    public C64487k90 f184054g;

    /* renamed from: h */
    public C64487k90 f184055h;

    /* renamed from: i */
    public C64487k90 f184056i;

    /* renamed from: j */
    public C64487k90 f184057j;

    /* renamed from: n */
    public C64487k90 f184058n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64517l90)) {
            return false;
        }
        C64517l90 l902 = (C64517l90) aVar;
        return C46238a.m51546a(this.f184051d, l902.f184051d) && C46238a.m51546a(this.f184052e, l902.f184052e) && C46238a.m51546a(Boolean.valueOf(this.f184053f), Boolean.valueOf(l902.f184053f)) && C46238a.m51546a(this.f184054g, l902.f184054g) && C46238a.m51546a(this.f184055h, l902.f184055h) && C46238a.m51546a(this.f184056i, l902.f184056i) && C46238a.m51546a(this.f184057j, l902.f184057j) && C46238a.m51546a(this.f184058n, l902.f184058n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64487k90 k902 = this.f184051d;
            if (k902 != null) {
                aVar.mo74322i(1, k902.computeSize());
                this.f184051d.writeFields(aVar);
            }
            C64487k90 k903 = this.f184052e;
            if (k903 != null) {
                aVar.mo74322i(2, k903.computeSize());
                this.f184052e.writeFields(aVar);
            }
            aVar.mo74314a(3, this.f184053f);
            C64487k90 k904 = this.f184054g;
            if (k904 != null) {
                aVar.mo74322i(4, k904.computeSize());
                this.f184054g.writeFields(aVar);
            }
            C64487k90 k905 = this.f184055h;
            if (k905 != null) {
                aVar.mo74322i(5, k905.computeSize());
                this.f184055h.writeFields(aVar);
            }
            C64487k90 k906 = this.f184056i;
            if (k906 != null) {
                aVar.mo74322i(6, k906.computeSize());
                this.f184056i.writeFields(aVar);
            }
            C64487k90 k907 = this.f184057j;
            if (k907 != null) {
                aVar.mo74322i(7, k907.computeSize());
                this.f184057j.writeFields(aVar);
            }
            C64487k90 k908 = this.f184058n;
            if (k908 != null) {
                aVar.mo74322i(8, k908.computeSize());
                this.f184058n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C64487k90 k909 = this.f184051d;
            if (k909 != null) {
                i2 = 0 + C52418a.m58682i(1, k909.computeSize());
            }
            C64487k90 k9010 = this.f184052e;
            if (k9010 != null) {
                i2 += C52418a.m58682i(2, k9010.computeSize());
            }
            int a = i2 + C52418a.m58674a(3, this.f184053f);
            C64487k90 k9011 = this.f184054g;
            if (k9011 != null) {
                a += C52418a.m58682i(4, k9011.computeSize());
            }
            C64487k90 k9012 = this.f184055h;
            if (k9012 != null) {
                a += C52418a.m58682i(5, k9012.computeSize());
            }
            C64487k90 k9013 = this.f184056i;
            if (k9013 != null) {
                a += C52418a.m58682i(6, k9013.computeSize());
            }
            C64487k90 k9014 = this.f184057j;
            if (k9014 != null) {
                a += C52418a.m58682i(7, k9014.computeSize());
            }
            C64487k90 k9015 = this.f184058n;
            return k9015 != null ? a + C52418a.m58682i(8, k9015.computeSize()) : a;
        } else if (i == 2) {
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
            C64517l90 l902 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64487k90 k9016 = new C64487k90();
                        if (bArr != null && bArr.length > 0) {
                            k9016.parseFrom(bArr);
                        }
                        l902.f184051d = k9016;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64487k90 k9017 = new C64487k90();
                        if (bArr2 != null && bArr2.length > 0) {
                            k9017.parseFrom(bArr2);
                        }
                        l902.f184052e = k9017;
                    }
                    return 0;
                case 3:
                    l902.f184053f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64487k90 k9018 = new C64487k90();
                        if (bArr3 != null && bArr3.length > 0) {
                            k9018.parseFrom(bArr3);
                        }
                        l902.f184054g = k9018;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C64487k90 k9019 = new C64487k90();
                        if (bArr4 != null && bArr4.length > 0) {
                            k9019.parseFrom(bArr4);
                        }
                        l902.f184055h = k9019;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C64487k90 k9020 = new C64487k90();
                        if (bArr5 != null && bArr5.length > 0) {
                            k9020.parseFrom(bArr5);
                        }
                        l902.f184056i = k9020;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C64487k90 k9021 = new C64487k90();
                        if (bArr6 != null && bArr6.length > 0) {
                            k9021.parseFrom(bArr6);
                        }
                        l902.f184057j = k9021;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C64487k90 k9022 = new C64487k90();
                        if (bArr7 != null && bArr7.length > 0) {
                            k9022.parseFrom(bArr7);
                        }
                        l902.f184058n = k9022;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
