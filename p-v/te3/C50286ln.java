package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ln */
public class C50286ln extends C47465a {

    /* renamed from: d */
    public LinkedList<C48950c33> f137521d = new LinkedList<>();

    /* renamed from: e */
    public int f137522e;

    /* renamed from: f */
    public LinkedList<C48950c33> f137523f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50286ln)) {
            return false;
        }
        C50286ln lnVar = (C50286ln) aVar;
        return C46238a.m51546a(this.f137521d, lnVar.f137521d) && C46238a.m51546a(Integer.valueOf(this.f137522e), Integer.valueOf(lnVar.f137522e)) && C46238a.m51546a(this.f137523f, lnVar.f137523f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f137521d);
            aVar.mo74318e(2, this.f137522e);
            aVar.mo74320g(3, 8, this.f137523f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f137521d) + 0 + C52418a.m58678e(2, this.f137522e) + C52418a.m58680g(3, 8, this.f137523f);
        } else {
            if (i == 2) {
                this.f137521d.clear();
                this.f137523f.clear();
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
                C50286ln lnVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C48950c33 c332 = new C48950c33();
                        if (bArr != null && bArr.length > 0) {
                            c332.parseFrom(bArr);
                        }
                        lnVar.f137521d.add(c332);
                    }
                    return 0;
                } else if (intValue == 2) {
                    lnVar.f137522e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C48950c33 c333 = new C48950c33();
                        if (bArr2 != null && bArr2.length > 0) {
                            c333.parseFrom(bArr2);
                        }
                        lnVar.f137523f.add(c333);
                    }
                    return 0;
                }
            }
        }
    }
}
