package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p31 */
public class C64622p31 extends C47465a {

    /* renamed from: d */
    public String f184746d;

    /* renamed from: e */
    public C64300cx2 f184747e;

    /* renamed from: f */
    public C64594nx2 f184748f;

    /* renamed from: g */
    public int f184749g;

    /* renamed from: h */
    public C48922bx2 f184750h;

    /* renamed from: i */
    public C64668qx2 f184751i;

    /* renamed from: j */
    public C50464mx2 f184752j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64622p31)) {
            return false;
        }
        C64622p31 p312 = (C64622p31) aVar;
        return C46238a.m51546a(this.f184746d, p312.f184746d) && C46238a.m51546a(this.f184747e, p312.f184747e) && C46238a.m51546a(this.f184748f, p312.f184748f) && C46238a.m51546a(Integer.valueOf(this.f184749g), Integer.valueOf(p312.f184749g)) && C46238a.m51546a(this.f184750h, p312.f184750h) && C46238a.m51546a(this.f184751i, p312.f184751i) && C46238a.m51546a(this.f184752j, p312.f184752j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184746d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C64300cx2 cx22 = this.f184747e;
            if (cx22 != null) {
                aVar.mo74322i(2, cx22.computeSize());
                this.f184747e.writeFields(aVar);
            }
            C64594nx2 nx22 = this.f184748f;
            if (nx22 != null) {
                aVar.mo74322i(3, nx22.computeSize());
                this.f184748f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f184749g);
            C48922bx2 bx22 = this.f184750h;
            if (bx22 != null) {
                aVar.mo74322i(5, bx22.computeSize());
                this.f184750h.writeFields(aVar);
            }
            C64668qx2 qx22 = this.f184751i;
            if (qx22 != null) {
                aVar.mo74322i(6, qx22.computeSize());
                this.f184751i.writeFields(aVar);
            }
            C50464mx2 mx22 = this.f184752j;
            if (mx22 != null) {
                aVar.mo74322i(7, mx22.computeSize());
                this.f184752j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f184746d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C64300cx2 cx23 = this.f184747e;
            if (cx23 != null) {
                i2 += C52418a.m58682i(2, cx23.computeSize());
            }
            C64594nx2 nx23 = this.f184748f;
            if (nx23 != null) {
                i2 += C52418a.m58682i(3, nx23.computeSize());
            }
            int e = i2 + C52418a.m58678e(4, this.f184749g);
            C48922bx2 bx23 = this.f184750h;
            if (bx23 != null) {
                e += C52418a.m58682i(5, bx23.computeSize());
            }
            C64668qx2 qx23 = this.f184751i;
            if (qx23 != null) {
                e += C52418a.m58682i(6, qx23.computeSize());
            }
            C50464mx2 mx23 = this.f184752j;
            return mx23 != null ? e + C52418a.m58682i(7, mx23.computeSize()) : e;
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
            C64622p31 p312 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    p312.f184746d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64300cx2 cx24 = new C64300cx2();
                        if (bArr != null && bArr.length > 0) {
                            cx24.parseFrom(bArr);
                        }
                        p312.f184747e = cx24;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64594nx2 nx24 = new C64594nx2();
                        if (bArr2 != null && bArr2.length > 0) {
                            nx24.parseFrom(bArr2);
                        }
                        p312.f184748f = nx24;
                    }
                    return 0;
                case 4:
                    p312.f184749g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C48922bx2 bx24 = new C48922bx2();
                        if (bArr3 != null && bArr3.length > 0) {
                            bx24.parseFrom(bArr3);
                        }
                        p312.f184750h = bx24;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C64668qx2 qx24 = new C64668qx2();
                        if (bArr4 != null && bArr4.length > 0) {
                            qx24.parseFrom(bArr4);
                        }
                        p312.f184751i = qx24;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C50464mx2 mx24 = new C50464mx2();
                        if (bArr5 != null && bArr5.length > 0) {
                            mx24.parseFrom(bArr5);
                        }
                        p312.f184752j = mx24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
