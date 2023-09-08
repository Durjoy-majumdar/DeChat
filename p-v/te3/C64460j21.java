package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j21 */
public class C64460j21 extends C47465a {

    /* renamed from: d */
    public int f183761d;

    /* renamed from: e */
    public String f183762e;

    /* renamed from: f */
    public C64797wa1 f183763f;

    /* renamed from: g */
    public boolean f183764g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64460j21)) {
            return false;
        }
        C64460j21 j212 = (C64460j21) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183761d), Integer.valueOf(j212.f183761d)) && C46238a.m51546a(this.f183762e, j212.f183762e) && C46238a.m51546a(this.f183763f, j212.f183763f) && C46238a.m51546a(Boolean.valueOf(this.f183764g), Boolean.valueOf(j212.f183764g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183761d);
            String str = this.f183762e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C64797wa1 wa12 = this.f183763f;
            if (wa12 != null) {
                aVar.mo74322i(3, wa12.computeSize());
                this.f183763f.writeFields(aVar);
            }
            aVar.mo74314a(4, this.f183764g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183761d) + 0;
            String str2 = this.f183762e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            C64797wa1 wa13 = this.f183763f;
            if (wa13 != null) {
                e += C52418a.m58682i(3, wa13.computeSize());
            }
            return e + C52418a.m58674a(4, this.f183764g);
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
            C64460j21 j212 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                j212.f183761d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                j212.f183762e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64797wa1 wa14 = new C64797wa1();
                    if (bArr != null && bArr.length > 0) {
                        wa14.parseFrom(bArr);
                    }
                    j212.f183763f = wa14;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                j212.f183764g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
