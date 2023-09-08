package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class py4 extends C47465a {

    /* renamed from: d */
    public int f184923d;

    /* renamed from: e */
    public String f184924e;

    /* renamed from: f */
    public ty4 f184925f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof py4)) {
            return false;
        }
        py4 py4 = (py4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184923d), Integer.valueOf(py4.f184923d)) && C46238a.m51546a(this.f184924e, py4.f184924e) && C46238a.m51546a(this.f184925f, py4.f184925f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184923d);
            String str = this.f184924e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            ty4 ty4 = this.f184925f;
            if (ty4 != null) {
                aVar.mo74322i(3, ty4.computeSize());
                this.f184925f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184923d) + 0;
            String str2 = this.f184924e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            ty4 ty42 = this.f184925f;
            return ty42 != null ? e + C52418a.m58682i(3, ty42.computeSize()) : e;
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
            py4 py4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                py4.f184923d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                py4.f184924e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
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
                    py4.f184925f = ty43;
                }
                return 0;
            }
        }
    }
}
