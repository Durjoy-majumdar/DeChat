package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ki */
public class C50132ki extends C47465a {

    /* renamed from: d */
    public C48716ai f136799d;

    /* renamed from: e */
    public int f136800e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50132ki)) {
            return false;
        }
        C50132ki kiVar = (C50132ki) aVar;
        return C46238a.m51546a(this.f136799d, kiVar.f136799d) && C46238a.m51546a(Integer.valueOf(this.f136800e), Integer.valueOf(kiVar.f136800e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48716ai aiVar = this.f136799d;
            if (aiVar != null) {
                aVar.mo74322i(1, aiVar.computeSize());
                this.f136799d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f136800e);
            return 0;
        } else if (i == 1) {
            C48716ai aiVar2 = this.f136799d;
            if (aiVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, aiVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f136800e);
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
            C50132ki kiVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48716ai aiVar3 = new C48716ai();
                    if (bArr != null && bArr.length > 0) {
                        aiVar3.parseFrom(bArr);
                    }
                    kiVar.f136799d = aiVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                kiVar.f136800e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
