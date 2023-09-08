package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.of1 */
public class C50673of1 extends C47465a {

    /* renamed from: d */
    public C48727ak1 f139136d;

    /* renamed from: e */
    public LinkedList<C48727ak1> f139137e = new LinkedList<>();

    /* renamed from: f */
    public C89349b f139138f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50673of1)) {
            return false;
        }
        C50673of1 of12 = (C50673of1) aVar;
        return C46238a.m51546a(this.f139136d, of12.f139136d) && C46238a.m51546a(this.f139137e, of12.f139137e) && C46238a.m51546a(this.f139138f, of12.f139138f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48727ak1 ak12 = this.f139136d;
            if (ak12 != null) {
                aVar.mo74322i(1, ak12.computeSize());
                this.f139136d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f139137e);
            C89349b bVar = this.f139138f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            C48727ak1 ak13 = this.f139136d;
            if (ak13 != null) {
                i2 = 0 + C52418a.m58682i(1, ak13.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f139137e);
            C89349b bVar2 = this.f139138f;
            return bVar2 != null ? g + C52418a.m58675b(3, bVar2) : g;
        } else if (i == 2) {
            this.f139137e.clear();
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
            C50673of1 of12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48727ak1 ak14 = new C48727ak1();
                    if (bArr != null && bArr.length > 0) {
                        ak14.parseFrom(bArr);
                    }
                    of12.f139136d = ak14;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48727ak1 ak15 = new C48727ak1();
                    if (bArr2 != null && bArr2.length > 0) {
                        ak15.parseFrom(bArr2);
                    }
                    of12.f139137e.add(ak15);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                of12.f139138f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
