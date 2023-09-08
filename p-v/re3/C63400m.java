package re3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: re3.m */
public class C63400m extends C47465a {

    /* renamed from: d */
    public int f179874d;

    /* renamed from: e */
    public int f179875e;

    /* renamed from: f */
    public LinkedList<C63401n> f179876f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C63400m)) {
            return false;
        }
        C63400m mVar = (C63400m) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f179874d), Integer.valueOf(mVar.f179874d)) && C46238a.m51546a(Integer.valueOf(this.f179875e), Integer.valueOf(mVar.f179875e)) && C46238a.m51546a(this.f179876f, mVar.f179876f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f179874d);
            aVar.mo74318e(2, this.f179875e);
            aVar.mo74320g(3, 8, this.f179876f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f179874d) + 0 + C52418a.m58678e(2, this.f179875e) + C52418a.m58680g(3, 8, this.f179876f);
        } else {
            if (i == 2) {
                this.f179876f.clear();
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
                C63400m mVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    mVar.f179874d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    mVar.f179875e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C63401n nVar = new C63401n();
                        if (bArr != null && bArr.length > 0) {
                            nVar.parseFrom(bArr);
                        }
                        mVar.f179876f.add(nVar);
                    }
                    return 0;
                }
            }
        }
    }
}
