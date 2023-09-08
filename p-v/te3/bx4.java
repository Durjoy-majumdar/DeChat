package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class bx4 extends C47465a {

    /* renamed from: d */
    public xw4 f259433d;

    /* renamed from: e */
    public nw4 f259434e;

    /* renamed from: f */
    public String f259435f;

    /* renamed from: g */
    public String f259436g;

    /* renamed from: h */
    public String f259437h;

    /* renamed from: i */
    public int f259438i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof bx4)) {
            return false;
        }
        bx4 bx4 = (bx4) aVar;
        return C46238a.m51546a(this.f259433d, bx4.f259433d) && C46238a.m51546a(this.f259434e, bx4.f259434e) && C46238a.m51546a(this.f259435f, bx4.f259435f) && C46238a.m51546a(this.f259436g, bx4.f259436g) && C46238a.m51546a(this.f259437h, bx4.f259437h) && C46238a.m51546a(Integer.valueOf(this.f259438i), Integer.valueOf(bx4.f259438i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            xw4 xw4 = this.f259433d;
            if (xw4 != null) {
                aVar.mo74322i(1, xw4.computeSize());
                this.f259433d.writeFields(aVar);
            }
            nw4 nw4 = this.f259434e;
            if (nw4 != null) {
                aVar.mo74322i(2, nw4.computeSize());
                this.f259434e.writeFields(aVar);
            }
            String str = this.f259435f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f259436g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f259437h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f259438i);
            return 0;
        } else if (i == 1) {
            xw4 xw42 = this.f259433d;
            if (xw42 != null) {
                i2 = 0 + C52418a.m58682i(1, xw42.computeSize());
            }
            nw4 nw42 = this.f259434e;
            if (nw42 != null) {
                i2 += C52418a.m58682i(2, nw42.computeSize());
            }
            String str4 = this.f259435f;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            String str5 = this.f259436g;
            if (str5 != null) {
                i2 += C52418a.m58683j(4, str5);
            }
            String str6 = this.f259437h;
            if (str6 != null) {
                i2 += C52418a.m58683j(5, str6);
            }
            return i2 + C52418a.m58678e(6, this.f259438i);
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
            bx4 bx4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        xw4 xw43 = new xw4();
                        if (bArr != null && bArr.length > 0) {
                            xw43.parseFrom(bArr);
                        }
                        bx4.f259433d = xw43;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        nw4 nw43 = new nw4();
                        if (bArr2 != null && bArr2.length > 0) {
                            nw43.parseFrom(bArr2);
                        }
                        bx4.f259434e = nw43;
                    }
                    return 0;
                case 3:
                    bx4.f259435f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bx4.f259436g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bx4.f259437h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bx4.f259438i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
