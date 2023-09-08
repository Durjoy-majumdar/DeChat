package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vx1 */
public class C64787vx1 extends C47465a {

    /* renamed from: d */
    public int f186001d;

    /* renamed from: e */
    public int f186002e;

    /* renamed from: f */
    public int f186003f;

    /* renamed from: g */
    public C89349b f186004g;

    /* renamed from: h */
    public int f186005h;

    /* renamed from: i */
    public int f186006i;

    /* renamed from: j */
    public int f186007j;

    /* renamed from: n */
    public C64880zf2 f186008n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64787vx1)) {
            return false;
        }
        C64787vx1 vx12 = (C64787vx1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186001d), Integer.valueOf(vx12.f186001d)) && C46238a.m51546a(Integer.valueOf(this.f186002e), Integer.valueOf(vx12.f186002e)) && C46238a.m51546a(Integer.valueOf(this.f186003f), Integer.valueOf(vx12.f186003f)) && C46238a.m51546a(this.f186004g, vx12.f186004g) && C46238a.m51546a(Integer.valueOf(this.f186005h), Integer.valueOf(vx12.f186005h)) && C46238a.m51546a(Integer.valueOf(this.f186006i), Integer.valueOf(vx12.f186006i)) && C46238a.m51546a(Integer.valueOf(this.f186007j), Integer.valueOf(vx12.f186007j)) && C46238a.m51546a(this.f186008n, vx12.f186008n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186001d);
            aVar.mo74318e(2, this.f186002e);
            aVar.mo74318e(3, this.f186003f);
            C89349b bVar = this.f186004g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f186005h);
            aVar.mo74318e(6, this.f186006i);
            aVar.mo74318e(7, this.f186007j);
            C64880zf2 zf22 = this.f186008n;
            if (zf22 != null) {
                aVar.mo74322i(8, zf22.computeSize());
                this.f186008n.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186001d) + 0 + C52418a.m58678e(2, this.f186002e) + C52418a.m58678e(3, this.f186003f);
            C89349b bVar2 = this.f186004g;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            int e2 = e + C52418a.m58678e(5, this.f186005h) + C52418a.m58678e(6, this.f186006i) + C52418a.m58678e(7, this.f186007j);
            C64880zf2 zf23 = this.f186008n;
            return zf23 != null ? e2 + C52418a.m58682i(8, zf23.computeSize()) : e2;
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
            C64787vx1 vx12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    vx12.f186001d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    vx12.f186002e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    vx12.f186003f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    vx12.f186004g = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    vx12.f186005h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    vx12.f186006i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    vx12.f186007j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64880zf2 zf24 = new C64880zf2();
                        if (bArr != null && bArr.length > 0) {
                            zf24.parseFrom(bArr);
                        }
                        vx12.f186008n = zf24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
