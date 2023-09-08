package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gi */
public class C49563gi extends C47465a {

    /* renamed from: d */
    public String f134057d;

    /* renamed from: e */
    public LinkedList<C49425fi> f134058e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49563gi)) {
            return false;
        }
        C49563gi giVar = (C49563gi) aVar;
        return C46238a.m51546a(this.f134057d, giVar.f134057d) && C46238a.m51546a(this.f134058e, giVar.f134058e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134057d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f134058e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f134057d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f134058e);
        } else if (i == 2) {
            this.f134058e.clear();
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
            C49563gi giVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                giVar.f134057d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49425fi fiVar = new C49425fi();
                    if (bArr != null && bArr.length > 0) {
                        fiVar.parseFrom(bArr);
                    }
                    giVar.f134058e.add(fiVar);
                }
                return 0;
            }
        }
    }
}
