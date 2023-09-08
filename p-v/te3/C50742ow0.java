package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ow0 */
public class C50742ow0 extends C47465a {

    /* renamed from: d */
    public C64733to f139399d;

    /* renamed from: e */
    public int f139400e;

    /* renamed from: f */
    public String f139401f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50742ow0)) {
            return false;
        }
        C50742ow0 ow02 = (C50742ow0) aVar;
        return C46238a.m51546a(this.f139399d, ow02.f139399d) && C46238a.m51546a(Integer.valueOf(this.f139400e), Integer.valueOf(ow02.f139400e)) && C46238a.m51546a(this.f139401f, ow02.f139401f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64733to toVar = this.f139399d;
            if (toVar != null) {
                aVar.mo74322i(1, toVar.computeSize());
                this.f139399d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f139400e);
            String str = this.f139401f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C64733to toVar2 = this.f139399d;
            if (toVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, toVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139400e);
            String str2 = this.f139401f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            C50742ow0 ow02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64733to toVar3 = new C64733to();
                    if (bArr != null && bArr.length > 0) {
                        toVar3.parseFrom(bArr);
                    }
                    ow02.f139399d = toVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ow02.f139400e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ow02.f139401f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
