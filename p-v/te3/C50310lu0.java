package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lu0 */
public class C50310lu0 extends C47465a {

    /* renamed from: d */
    public C64311db1 f137642d;

    /* renamed from: e */
    public String f137643e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50310lu0)) {
            return false;
        }
        C50310lu0 lu02 = (C50310lu0) aVar;
        return C46238a.m51546a(this.f137642d, lu02.f137642d) && C46238a.m51546a(this.f137643e, lu02.f137643e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64311db1 db12 = this.f137642d;
            if (db12 != null) {
                aVar.mo74322i(1, db12.computeSize());
                this.f137642d.writeFields(aVar);
            }
            String str = this.f137643e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            C64311db1 db13 = this.f137642d;
            if (db13 != null) {
                i2 = 0 + C52418a.m58682i(1, db13.computeSize());
            }
            String str2 = this.f137643e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            C50310lu0 lu02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64311db1 db14 = new C64311db1();
                    if (bArr != null && bArr.length > 0) {
                        db14.parseFrom(bArr);
                    }
                    lu02.f137642d = db14;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                lu02.f137643e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
