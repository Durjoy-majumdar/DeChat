package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ky */
public class C64503ky extends C47465a {

    /* renamed from: d */
    public LinkedList<C50325ly> f183995d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C64565my> f183996e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C64642py> f183997f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64503ky)) {
            return false;
        }
        C64503ky kyVar = (C64503ky) aVar;
        return C46238a.m51546a(this.f183995d, kyVar.f183995d) && C46238a.m51546a(this.f183996e, kyVar.f183996e) && C46238a.m51546a(this.f183997f, kyVar.f183997f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f183995d);
            aVar.mo74320g(2, 8, this.f183996e);
            aVar.mo74320g(3, 8, this.f183997f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f183995d) + 0 + C52418a.m58680g(2, 8, this.f183996e) + C52418a.m58680g(3, 8, this.f183997f);
        } else {
            if (i == 2) {
                this.f183995d.clear();
                this.f183996e.clear();
                this.f183997f.clear();
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
                C64503ky kyVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50325ly lyVar = new C50325ly();
                        if (bArr != null && bArr.length > 0) {
                            lyVar.parseFrom(bArr);
                        }
                        kyVar.f183995d.add(lyVar);
                    }
                    return 0;
                } else if (intValue == 2) {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64565my myVar = new C64565my();
                        if (bArr2 != null && bArr2.length > 0) {
                            myVar.parseFrom(bArr2);
                        }
                        kyVar.f183996e.add(myVar);
                    }
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C64642py pyVar = new C64642py();
                        if (bArr3 != null && bArr3.length > 0) {
                            pyVar.parseFrom(bArr3);
                        }
                        kyVar.f183997f.add(pyVar);
                    }
                    return 0;
                }
            }
        }
    }
}
