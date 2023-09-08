package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uw3 */
public class C51608uw3 extends C47465a {

    /* renamed from: d */
    public int f143166d;

    /* renamed from: e */
    public C89349b f143167e;

    /* renamed from: f */
    public C89349b f143168f;

    /* renamed from: g */
    public C89349b f143169g;

    /* renamed from: h */
    public C89349b f143170h;

    /* renamed from: i */
    public C51751vw3 f143171i;

    /* renamed from: j */
    public int f143172j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51608uw3)) {
            return false;
        }
        C51608uw3 uw32 = (C51608uw3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143166d), Integer.valueOf(uw32.f143166d)) && C46238a.m51546a(this.f143167e, uw32.f143167e) && C46238a.m51546a(this.f143168f, uw32.f143168f) && C46238a.m51546a(this.f143169g, uw32.f143169g) && C46238a.m51546a(this.f143170h, uw32.f143170h) && C46238a.m51546a(this.f143171i, uw32.f143171i) && C46238a.m51546a(Integer.valueOf(this.f143172j), Integer.valueOf(uw32.f143172j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143166d);
            C89349b bVar = this.f143167e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            C89349b bVar2 = this.f143168f;
            if (bVar2 != null) {
                aVar.mo74315b(3, bVar2);
            }
            C89349b bVar3 = this.f143169g;
            if (bVar3 != null) {
                aVar.mo74315b(4, bVar3);
            }
            C89349b bVar4 = this.f143170h;
            if (bVar4 != null) {
                aVar.mo74315b(5, bVar4);
            }
            C51751vw3 vw32 = this.f143171i;
            if (vw32 != null) {
                aVar.mo74322i(6, vw32.computeSize());
                this.f143171i.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f143172j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f143166d) + 0;
            C89349b bVar5 = this.f143167e;
            if (bVar5 != null) {
                e += C52418a.m58675b(2, bVar5);
            }
            C89349b bVar6 = this.f143168f;
            if (bVar6 != null) {
                e += C52418a.m58675b(3, bVar6);
            }
            C89349b bVar7 = this.f143169g;
            if (bVar7 != null) {
                e += C52418a.m58675b(4, bVar7);
            }
            C89349b bVar8 = this.f143170h;
            if (bVar8 != null) {
                e += C52418a.m58675b(5, bVar8);
            }
            C51751vw3 vw33 = this.f143171i;
            if (vw33 != null) {
                e += C52418a.m58682i(6, vw33.computeSize());
            }
            return e + C52418a.m58678e(7, this.f143172j);
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
            C51608uw3 uw32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    uw32.f143166d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    uw32.f143167e = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    uw32.f143168f = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    uw32.f143169g = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    uw32.f143170h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51751vw3 vw34 = new C51751vw3();
                        if (bArr != null && bArr.length > 0) {
                            vw34.parseFrom(bArr);
                        }
                        uw32.f143171i = vw34;
                    }
                    return 0;
                case 7:
                    uw32.f143172j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
