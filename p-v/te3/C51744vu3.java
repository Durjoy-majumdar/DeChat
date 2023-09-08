package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vu3 */
public class C51744vu3 extends C47465a {

    /* renamed from: d */
    public int f143706d;

    /* renamed from: e */
    public C51094rd3 f143707e;

    /* renamed from: f */
    public lr4 f143708f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51744vu3)) {
            return false;
        }
        C51744vu3 vu32 = (C51744vu3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143706d), Integer.valueOf(vu32.f143706d)) && C46238a.m51546a(this.f143707e, vu32.f143707e) && C46238a.m51546a(this.f143708f, vu32.f143708f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143706d);
            C51094rd3 rd32 = this.f143707e;
            if (rd32 != null) {
                aVar.mo74322i(2, rd32.computeSize());
                this.f143707e.writeFields(aVar);
            }
            lr4 lr4 = this.f143708f;
            if (lr4 != null) {
                aVar.mo74322i(3, lr4.computeSize());
                this.f143708f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f143706d) + 0;
            C51094rd3 rd33 = this.f143707e;
            if (rd33 != null) {
                e += C52418a.m58682i(2, rd33.computeSize());
            }
            lr4 lr42 = this.f143708f;
            return lr42 != null ? e + C52418a.m58682i(3, lr42.computeSize()) : e;
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
            C51744vu3 vu32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vu32.f143706d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51094rd3 rd34 = new C51094rd3();
                    if (bArr != null && bArr.length > 0) {
                        rd34.parseFrom(bArr);
                    }
                    vu32.f143707e = rd34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    lr4 lr43 = new lr4();
                    if (bArr2 != null && bArr2.length > 0) {
                        lr43.parseFrom(bArr2);
                    }
                    vu32.f143708f = lr43;
                }
                return 0;
            }
        }
    }
}
