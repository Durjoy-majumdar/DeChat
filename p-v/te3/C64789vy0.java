package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vy0 */
public class C64789vy0 extends C47465a {

    /* renamed from: d */
    public C64403gs1 f186012d;

    /* renamed from: e */
    public ih4 f186013e;

    /* renamed from: f */
    public C51613uy0 f186014f;

    /* renamed from: g */
    public String f186015g;

    /* renamed from: h */
    public String f186016h;

    /* renamed from: i */
    public int f186017i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64789vy0)) {
            return false;
        }
        C64789vy0 vy02 = (C64789vy0) aVar;
        return C46238a.m51546a(this.f186012d, vy02.f186012d) && C46238a.m51546a(this.f186013e, vy02.f186013e) && C46238a.m51546a(this.f186014f, vy02.f186014f) && C46238a.m51546a(this.f186015g, vy02.f186015g) && C46238a.m51546a(this.f186016h, vy02.f186016h) && C46238a.m51546a(Integer.valueOf(this.f186017i), Integer.valueOf(vy02.f186017i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64403gs1 gs12 = this.f186012d;
            if (gs12 != null) {
                aVar.mo74322i(1, gs12.computeSize());
                this.f186012d.writeFields(aVar);
            }
            ih4 ih4 = this.f186013e;
            if (ih4 != null) {
                aVar.mo74322i(2, ih4.computeSize());
                this.f186013e.writeFields(aVar);
            }
            C51613uy0 uy02 = this.f186014f;
            if (uy02 != null) {
                aVar.mo74322i(3, uy02.computeSize());
                this.f186014f.writeFields(aVar);
            }
            String str = this.f186015g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f186016h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f186017i);
            return 0;
        } else if (i == 1) {
            C64403gs1 gs13 = this.f186012d;
            if (gs13 != null) {
                i2 = 0 + C52418a.m58682i(1, gs13.computeSize());
            }
            ih4 ih42 = this.f186013e;
            if (ih42 != null) {
                i2 += C52418a.m58682i(2, ih42.computeSize());
            }
            C51613uy0 uy03 = this.f186014f;
            if (uy03 != null) {
                i2 += C52418a.m58682i(3, uy03.computeSize());
            }
            String str3 = this.f186015g;
            if (str3 != null) {
                i2 += C52418a.m58683j(4, str3);
            }
            String str4 = this.f186016h;
            if (str4 != null) {
                i2 += C52418a.m58683j(5, str4);
            }
            return i2 + C52418a.m58678e(6, this.f186017i);
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
            C64789vy0 vy02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64403gs1 gs14 = new C64403gs1();
                        if (bArr != null && bArr.length > 0) {
                            gs14.parseFrom(bArr);
                        }
                        vy02.f186012d = gs14;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        ih4 ih43 = new ih4();
                        if (bArr2 != null && bArr2.length > 0) {
                            ih43.parseFrom(bArr2);
                        }
                        vy02.f186013e = ih43;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51613uy0 uy04 = new C51613uy0();
                        if (bArr3 != null && bArr3.length > 0) {
                            uy04.parseFrom(bArr3);
                        }
                        vy02.f186014f = uy04;
                    }
                    return 0;
                case 4:
                    vy02.f186015g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vy02.f186016h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    vy02.f186017i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
