package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ye1 */
public class C52104ye1 extends C47465a {

    /* renamed from: d */
    public int f145243d;

    /* renamed from: e */
    public int f145244e;

    /* renamed from: f */
    public int f145245f;

    /* renamed from: g */
    public int f145246g;

    /* renamed from: h */
    public C51966xf1 f145247h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52104ye1)) {
            return false;
        }
        C52104ye1 ye12 = (C52104ye1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145243d), Integer.valueOf(ye12.f145243d)) && C46238a.m51546a(Integer.valueOf(this.f145244e), Integer.valueOf(ye12.f145244e)) && C46238a.m51546a(Integer.valueOf(this.f145245f), Integer.valueOf(ye12.f145245f)) && C46238a.m51546a(Integer.valueOf(this.f145246g), Integer.valueOf(ye12.f145246g)) && C46238a.m51546a(this.f145247h, ye12.f145247h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(2, this.f145243d);
            aVar.mo74318e(3, this.f145244e);
            aVar.mo74318e(4, this.f145245f);
            aVar.mo74318e(5, this.f145246g);
            C51966xf1 xf12 = this.f145247h;
            if (xf12 != null) {
                aVar.mo74322i(50, xf12.computeSize());
                this.f145247h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(2, this.f145243d) + 0 + C52418a.m58678e(3, this.f145244e) + C52418a.m58678e(4, this.f145245f) + C52418a.m58678e(5, this.f145246g);
            C51966xf1 xf13 = this.f145247h;
            return xf13 != null ? e + C52418a.m58682i(50, xf13.computeSize()) : e;
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
            C52104ye1 ye12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 2) {
                ye12.f145243d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ye12.f145244e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                ye12.f145245f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 5) {
                ye12.f145246g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 50) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51966xf1 xf14 = new C51966xf1();
                    if (bArr != null && bArr.length > 0) {
                        xf14.parseFrom(bArr);
                    }
                    ye12.f145247h = xf14;
                }
                return 0;
            }
        }
    }
}
