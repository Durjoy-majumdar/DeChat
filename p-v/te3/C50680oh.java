package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oh */
public class C50680oh extends C47465a {

    /* renamed from: d */
    public int f139174d;

    /* renamed from: e */
    public C89349b f139175e;

    /* renamed from: f */
    public LinkedList<C52281zl3> f139176f = new LinkedList<>();

    /* renamed from: g */
    public long f139177g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50680oh)) {
            return false;
        }
        C50680oh ohVar = (C50680oh) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139174d), Integer.valueOf(ohVar.f139174d)) && C46238a.m51546a(this.f139175e, ohVar.f139175e) && C46238a.m51546a(this.f139176f, ohVar.f139176f) && C46238a.m51546a(Long.valueOf(this.f139177g), Long.valueOf(ohVar.f139177g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139174d);
            C89349b bVar = this.f139175e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74320g(3, 8, this.f139176f);
            aVar.mo74321h(4, this.f139177g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139174d) + 0;
            C89349b bVar2 = this.f139175e;
            if (bVar2 != null) {
                e += C52418a.m58675b(2, bVar2);
            }
            return e + C52418a.m58680g(3, 8, this.f139176f) + C52418a.m58681h(4, this.f139177g);
        } else if (i == 2) {
            this.f139176f.clear();
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
            C50680oh ohVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ohVar.f139174d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ohVar.f139175e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C52281zl3 zl32 = new C52281zl3();
                    if (bArr != null && bArr.length > 0) {
                        zl32.parseFrom(bArr);
                    }
                    ohVar.f139176f.add(zl32);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ohVar.f139177g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
