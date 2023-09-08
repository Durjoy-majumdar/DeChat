package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qg0 */
public class C50955qg0 extends C47465a {

    /* renamed from: d */
    public int f140290d;

    /* renamed from: e */
    public C51691vg0 f140291e;

    /* renamed from: f */
    public C49316ep1 f140292f;

    /* renamed from: g */
    public C49709hi1 f140293g;

    /* renamed from: h */
    public C51691vg0 f140294h;

    /* renamed from: i */
    public C50700ol1 f140295i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50955qg0)) {
            return false;
        }
        C50955qg0 qg02 = (C50955qg0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140290d), Integer.valueOf(qg02.f140290d)) && C46238a.m51546a(this.f140291e, qg02.f140291e) && C46238a.m51546a(this.f140292f, qg02.f140292f) && C46238a.m51546a(this.f140293g, qg02.f140293g) && C46238a.m51546a(this.f140294h, qg02.f140294h) && C46238a.m51546a(this.f140295i, qg02.f140295i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140290d);
            C51691vg0 vg02 = this.f140291e;
            if (vg02 != null) {
                aVar.mo74322i(2, vg02.computeSize());
                this.f140291e.writeFields(aVar);
            }
            C49316ep1 ep12 = this.f140292f;
            if (ep12 != null) {
                aVar.mo74322i(3, ep12.computeSize());
                this.f140292f.writeFields(aVar);
            }
            C49709hi1 hi12 = this.f140293g;
            if (hi12 != null) {
                aVar.mo74322i(4, hi12.computeSize());
                this.f140293g.writeFields(aVar);
            }
            C51691vg0 vg03 = this.f140294h;
            if (vg03 != null) {
                aVar.mo74322i(5, vg03.computeSize());
                this.f140294h.writeFields(aVar);
            }
            C50700ol1 ol12 = this.f140295i;
            if (ol12 != null) {
                aVar.mo74322i(6, ol12.computeSize());
                this.f140295i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140290d) + 0;
            C51691vg0 vg04 = this.f140291e;
            if (vg04 != null) {
                e += C52418a.m58682i(2, vg04.computeSize());
            }
            C49316ep1 ep13 = this.f140292f;
            if (ep13 != null) {
                e += C52418a.m58682i(3, ep13.computeSize());
            }
            C49709hi1 hi13 = this.f140293g;
            if (hi13 != null) {
                e += C52418a.m58682i(4, hi13.computeSize());
            }
            C51691vg0 vg05 = this.f140294h;
            if (vg05 != null) {
                e += C52418a.m58682i(5, vg05.computeSize());
            }
            C50700ol1 ol13 = this.f140295i;
            return ol13 != null ? e + C52418a.m58682i(6, ol13.computeSize()) : e;
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
            C50955qg0 qg02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qg02.f140290d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51691vg0 vg06 = new C51691vg0();
                        if (bArr != null && bArr.length > 0) {
                            vg06.parseFrom(bArr);
                        }
                        qg02.f140291e = vg06;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C49316ep1 ep14 = new C49316ep1();
                        if (bArr2 != null && bArr2.length > 0) {
                            ep14.parseFrom(bArr2);
                        }
                        qg02.f140292f = ep14;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C49709hi1 hi14 = new C49709hi1();
                        if (bArr3 != null && bArr3.length > 0) {
                            hi14.parseFrom(bArr3);
                        }
                        qg02.f140293g = hi14;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C51691vg0 vg07 = new C51691vg0();
                        if (bArr4 != null && bArr4.length > 0) {
                            vg07.parseFrom(bArr4);
                        }
                        qg02.f140294h = vg07;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C50700ol1 ol14 = new C50700ol1();
                        if (bArr5 != null && bArr5.length > 0) {
                            ol14.parseFrom(bArr5);
                        }
                        qg02.f140295i = ol14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
