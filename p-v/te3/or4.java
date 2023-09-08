package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class or4 extends C47465a {

    /* renamed from: d */
    public long f139339d;

    /* renamed from: e */
    public double f139340e;

    /* renamed from: f */
    public C51696vh2 f139341f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof or4)) {
            return false;
        }
        or4 or4 = (or4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f139339d), Long.valueOf(or4.f139339d)) && C46238a.m51546a(Double.valueOf(this.f139340e), Double.valueOf(or4.f139340e)) && C46238a.m51546a(this.f139341f, or4.f139341f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f139339d);
            aVar.mo74316c(2, this.f139340e);
            C51696vh2 vh22 = this.f139341f;
            if (vh22 != null) {
                aVar.mo74322i(3, vh22.computeSize());
                this.f139341f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f139339d) + 0 + C52418a.m58676c(2, this.f139340e);
            C51696vh2 vh23 = this.f139341f;
            return vh23 != null ? h + C52418a.m58682i(3, vh23.computeSize()) : h;
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
            or4 or4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                or4.f139339d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                or4.f139340e = aVar3.mo141627e(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51696vh2 vh24 = new C51696vh2();
                    if (bArr != null && bArr.length > 0) {
                        vh24.parseFrom(bArr);
                    }
                    or4.f139341f = vh24;
                }
                return 0;
            }
        }
    }
}
