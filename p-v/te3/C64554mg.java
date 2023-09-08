package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mg */
public class C64554mg extends C47465a {

    /* renamed from: d */
    public C64406gy f184315d;

    /* renamed from: e */
    public boolean f184316e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64554mg)) {
            return false;
        }
        C64554mg mgVar = (C64554mg) aVar;
        return C46238a.m51546a(this.f184315d, mgVar.f184315d) && C46238a.m51546a(Boolean.valueOf(this.f184316e), Boolean.valueOf(mgVar.f184316e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64406gy gyVar = this.f184315d;
            if (gyVar != null) {
                aVar.mo74322i(1, gyVar.computeSize());
                this.f184315d.writeFields(aVar);
            }
            aVar.mo74314a(2, this.f184316e);
            return 0;
        } else if (i == 1) {
            C64406gy gyVar2 = this.f184315d;
            if (gyVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, gyVar2.computeSize());
            }
            return i2 + C52418a.m58674a(2, this.f184316e);
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
            C64554mg mgVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64406gy gyVar3 = new C64406gy();
                    if (bArr != null && bArr.length > 0) {
                        gyVar3.parseFrom(bArr);
                    }
                    mgVar.f184315d = gyVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                mgVar.f184316e = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
