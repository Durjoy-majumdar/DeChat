package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class o54 extends C47465a {

    /* renamed from: d */
    public String f138966d;

    /* renamed from: e */
    public C49240e60 f138967e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof o54)) {
            return false;
        }
        o54 o54 = (o54) aVar;
        return C46238a.m51546a(this.f138966d, o54.f138966d) && C46238a.m51546a(this.f138967e, o54.f138967e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138966d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C49240e60 e602 = this.f138967e;
            if (e602 != null) {
                aVar.mo74322i(2, e602.computeSize());
                this.f138967e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f138966d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C49240e60 e603 = this.f138967e;
            return e603 != null ? i2 + C52418a.m58682i(2, e603.computeSize()) : i2;
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
            o54 o54 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                o54.f138966d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49240e60 e604 = new C49240e60();
                    if (bArr != null && bArr.length > 0) {
                        e604.parseFrom(bArr);
                    }
                    o54.f138967e = e604;
                }
                return 0;
            }
        }
    }
}
