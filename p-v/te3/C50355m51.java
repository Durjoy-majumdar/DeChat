package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m51 */
public class C50355m51 extends C47465a {

    /* renamed from: d */
    public C50217l51 f137842d;

    /* renamed from: e */
    public String f137843e;

    /* renamed from: f */
    public C64311db1 f137844f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50355m51)) {
            return false;
        }
        C50355m51 m512 = (C50355m51) aVar;
        return C46238a.m51546a(this.f137842d, m512.f137842d) && C46238a.m51546a(this.f137843e, m512.f137843e) && C46238a.m51546a(this.f137844f, m512.f137844f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50217l51 l512 = this.f137842d;
            if (l512 != null) {
                aVar.mo74322i(1, l512.computeSize());
                this.f137842d.writeFields(aVar);
            }
            String str = this.f137843e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C64311db1 db12 = this.f137844f;
            if (db12 != null) {
                aVar.mo74322i(3, db12.computeSize());
                this.f137844f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C50217l51 l513 = this.f137842d;
            if (l513 != null) {
                i2 = 0 + C52418a.m58682i(1, l513.computeSize());
            }
            String str2 = this.f137843e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C64311db1 db13 = this.f137844f;
            return db13 != null ? i2 + C52418a.m58682i(3, db13.computeSize()) : i2;
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
            C50355m51 m512 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50217l51 l514 = new C50217l51();
                    if (bArr != null && bArr.length > 0) {
                        l514.parseFrom(bArr);
                    }
                    m512.f137842d = l514;
                }
                return 0;
            } else if (intValue == 2) {
                m512.f137843e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64311db1 db14 = new C64311db1();
                    if (bArr2 != null && bArr2.length > 0) {
                        db14.parseFrom(bArr2);
                    }
                    m512.f137844f = db14;
                }
                return 0;
            }
        }
    }
}
