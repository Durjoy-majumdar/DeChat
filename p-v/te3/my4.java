package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class my4 extends C47465a {

    /* renamed from: d */
    public int f184407d;

    /* renamed from: e */
    public ty4 f184408e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof my4)) {
            return false;
        }
        my4 my4 = (my4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184407d), Integer.valueOf(my4.f184407d)) && C46238a.m51546a(this.f184408e, my4.f184408e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184407d);
            ty4 ty4 = this.f184408e;
            if (ty4 != null) {
                aVar.mo74322i(2, ty4.computeSize());
                this.f184408e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184407d) + 0;
            ty4 ty42 = this.f184408e;
            return ty42 != null ? e + C52418a.m58682i(2, ty42.computeSize()) : e;
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
            my4 my4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                my4.f184407d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    ty4 ty43 = new ty4();
                    if (bArr != null && bArr.length > 0) {
                        ty43.parseFrom(bArr);
                    }
                    my4.f184408e = ty43;
                }
                return 0;
            }
        }
    }
}
