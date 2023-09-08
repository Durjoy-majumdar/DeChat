package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ei1 */
public class C64341ei1 extends C47465a {

    /* renamed from: d */
    public int f182964d;

    /* renamed from: e */
    public int f182965e;

    /* renamed from: f */
    public int f182966f;

    /* renamed from: g */
    public int f182967g;

    /* renamed from: h */
    public int f182968h;

    /* renamed from: i */
    public int f182969i;

    /* renamed from: j */
    public C64788vx2 f182970j;

    /* renamed from: n */
    public LinkedList<C64520lb3> f182971n = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64341ei1)) {
            return false;
        }
        C64341ei1 ei12 = (C64341ei1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182964d), Integer.valueOf(ei12.f182964d)) && C46238a.m51546a(Integer.valueOf(this.f182965e), Integer.valueOf(ei12.f182965e)) && C46238a.m51546a(Integer.valueOf(this.f182966f), Integer.valueOf(ei12.f182966f)) && C46238a.m51546a(Integer.valueOf(this.f182967g), Integer.valueOf(ei12.f182967g)) && C46238a.m51546a(Integer.valueOf(this.f182968h), Integer.valueOf(ei12.f182968h)) && C46238a.m51546a(Integer.valueOf(this.f182969i), Integer.valueOf(ei12.f182969i)) && C46238a.m51546a(this.f182970j, ei12.f182970j) && C46238a.m51546a(this.f182971n, ei12.f182971n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182964d);
            aVar.mo74318e(2, this.f182965e);
            aVar.mo74318e(3, this.f182966f);
            aVar.mo74318e(4, this.f182967g);
            aVar.mo74318e(5, this.f182968h);
            aVar.mo74318e(6, this.f182969i);
            C64788vx2 vx22 = this.f182970j;
            if (vx22 != null) {
                aVar.mo74322i(7, vx22.computeSize());
                this.f182970j.writeFields(aVar);
            }
            aVar.mo74320g(8, 8, this.f182971n);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182964d) + 0 + C52418a.m58678e(2, this.f182965e) + C52418a.m58678e(3, this.f182966f) + C52418a.m58678e(4, this.f182967g) + C52418a.m58678e(5, this.f182968h) + C52418a.m58678e(6, this.f182969i);
            C64788vx2 vx23 = this.f182970j;
            if (vx23 != null) {
                e += C52418a.m58682i(7, vx23.computeSize());
            }
            return e + C52418a.m58680g(8, 8, this.f182971n);
        } else if (i == 2) {
            this.f182971n.clear();
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
            C64341ei1 ei12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ei12.f182964d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ei12.f182965e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ei12.f182966f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ei12.f182967g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ei12.f182968h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ei12.f182969i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64788vx2 vx24 = new C64788vx2();
                        if (bArr != null && bArr.length > 0) {
                            vx24.parseFrom(bArr);
                        }
                        ei12.f182970j = vx24;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64520lb3 lb32 = new C64520lb3();
                        if (bArr2 != null && bArr2.length > 0) {
                            lb32.parseFrom(bArr2);
                        }
                        ei12.f182971n.add(lb32);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
