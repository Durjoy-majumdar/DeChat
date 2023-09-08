package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nc3 */
public class C50523nc3 extends C47465a {

    /* renamed from: d */
    public boolean f138532d;

    /* renamed from: e */
    public int f138533e;

    /* renamed from: f */
    public boolean f138534f;

    /* renamed from: g */
    public int f138535g;

    /* renamed from: h */
    public C89349b f138536h;

    /* renamed from: i */
    public int f138537i;

    /* renamed from: j */
    public C49801i51 f138538j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50523nc3)) {
            return false;
        }
        C50523nc3 nc32 = (C50523nc3) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f138532d), Boolean.valueOf(nc32.f138532d)) && C46238a.m51546a(Integer.valueOf(this.f138533e), Integer.valueOf(nc32.f138533e)) && C46238a.m51546a(Boolean.valueOf(this.f138534f), Boolean.valueOf(nc32.f138534f)) && C46238a.m51546a(Integer.valueOf(this.f138535g), Integer.valueOf(nc32.f138535g)) && C46238a.m51546a(this.f138536h, nc32.f138536h) && C46238a.m51546a(Integer.valueOf(this.f138537i), Integer.valueOf(nc32.f138537i)) && C46238a.m51546a(this.f138538j, nc32.f138538j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f138532d);
            aVar.mo74318e(2, this.f138533e);
            aVar.mo74314a(3, this.f138534f);
            aVar.mo74318e(4, this.f138535g);
            C89349b bVar = this.f138536h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74318e(6, this.f138537i);
            C49801i51 i512 = this.f138538j;
            if (i512 != null) {
                aVar.mo74322i(7, i512.computeSize());
                this.f138538j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f138532d) + 0 + C52418a.m58678e(2, this.f138533e) + C52418a.m58674a(3, this.f138534f) + C52418a.m58678e(4, this.f138535g);
            C89349b bVar2 = this.f138536h;
            if (bVar2 != null) {
                a += C52418a.m58675b(5, bVar2);
            }
            int e = a + C52418a.m58678e(6, this.f138537i);
            C49801i51 i513 = this.f138538j;
            return i513 != null ? e + C52418a.m58682i(7, i513.computeSize()) : e;
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
            C50523nc3 nc32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    nc32.f138532d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    nc32.f138533e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    nc32.f138534f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    nc32.f138535g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    nc32.f138536h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    nc32.f138537i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49801i51 i514 = new C49801i51();
                        if (bArr != null && bArr.length > 0) {
                            i514.parseFrom(bArr);
                        }
                        nc32.f138538j = i514;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
