package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ew */
public class C64349ew extends C47465a {

    /* renamed from: d */
    public int f183033d;

    /* renamed from: e */
    public int f183034e;

    /* renamed from: f */
    public int f183035f;

    /* renamed from: g */
    public LinkedList<C64330dw> f183036g = new LinkedList<>();

    /* renamed from: h */
    public C89349b f183037h;

    /* renamed from: i */
    public C64880zf2 f183038i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64349ew)) {
            return false;
        }
        C64349ew ewVar = (C64349ew) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183033d), Integer.valueOf(ewVar.f183033d)) && C46238a.m51546a(Integer.valueOf(this.f183034e), Integer.valueOf(ewVar.f183034e)) && C46238a.m51546a(Integer.valueOf(this.f183035f), Integer.valueOf(ewVar.f183035f)) && C46238a.m51546a(this.f183036g, ewVar.f183036g) && C46238a.m51546a(this.f183037h, ewVar.f183037h) && C46238a.m51546a(this.f183038i, ewVar.f183038i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183033d);
            aVar.mo74318e(2, this.f183034e);
            aVar.mo74318e(3, this.f183035f);
            aVar.mo74320g(4, 8, this.f183036g);
            C89349b bVar = this.f183037h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            C64880zf2 zf22 = this.f183038i;
            if (zf22 != null) {
                aVar.mo74322i(6, zf22.computeSize());
                this.f183038i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183033d) + 0 + C52418a.m58678e(2, this.f183034e) + C52418a.m58678e(3, this.f183035f) + C52418a.m58680g(4, 8, this.f183036g);
            C89349b bVar2 = this.f183037h;
            if (bVar2 != null) {
                e += C52418a.m58675b(5, bVar2);
            }
            C64880zf2 zf23 = this.f183038i;
            return zf23 != null ? e + C52418a.m58682i(6, zf23.computeSize()) : e;
        } else if (i == 2) {
            this.f183036g.clear();
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
            C64349ew ewVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ewVar.f183033d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ewVar.f183034e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ewVar.f183035f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C64330dw dwVar = new C64330dw();
                        if (bArr != null && bArr.length > 0) {
                            dwVar.parseFrom(bArr);
                        }
                        ewVar.f183036g.add(dwVar);
                    }
                    return 0;
                case 5:
                    ewVar.f183037h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64880zf2 zf24 = new C64880zf2();
                        if (bArr2 != null && bArr2.length > 0) {
                            zf24.parseFrom(bArr2);
                        }
                        ewVar.f183038i = zf24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
