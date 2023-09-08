package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class wf4 extends C47465a {

    /* renamed from: d */
    public String f186089d;

    /* renamed from: e */
    public cl4 f186090e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof wf4)) {
            return false;
        }
        wf4 wf4 = (wf4) aVar;
        return C46238a.m51546a(this.f186089d, wf4.f186089d) && C46238a.m51546a(this.f186090e, wf4.f186090e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186089d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            cl4 cl4 = this.f186090e;
            if (cl4 != null) {
                aVar.mo74322i(2, cl4.computeSize());
                this.f186090e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f186089d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            cl4 cl42 = this.f186090e;
            return cl42 != null ? i2 + C52418a.m58682i(2, cl42.computeSize()) : i2;
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
            wf4 wf4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wf4.f186089d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    cl4 cl43 = new cl4();
                    if (bArr != null && bArr.length > 0) {
                        cl43.parseFrom(bArr);
                    }
                    wf4.f186090e = cl43;
                }
                return 0;
            }
        }
    }
}
