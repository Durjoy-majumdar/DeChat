package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w03 */
public class C51765w03 extends C47465a {

    /* renamed from: d */
    public String f143798d;

    /* renamed from: e */
    public C49192du3 f143799e;

    /* renamed from: f */
    public C49192du3 f143800f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51765w03)) {
            return false;
        }
        C51765w03 w032 = (C51765w03) aVar;
        return C46238a.m51546a(this.f143798d, w032.f143798d) && C46238a.m51546a(this.f143799e, w032.f143799e) && C46238a.m51546a(this.f143800f, w032.f143800f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143798d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C49192du3 du32 = this.f143799e;
            if (du32 != null) {
                aVar.mo74322i(2, du32.computeSize());
                this.f143799e.writeFields(aVar);
            }
            C49192du3 du33 = this.f143800f;
            if (du33 != null) {
                aVar.mo74322i(3, du33.computeSize());
                this.f143800f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f143798d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C49192du3 du34 = this.f143799e;
            if (du34 != null) {
                i2 += C52418a.m58682i(2, du34.computeSize());
            }
            C49192du3 du35 = this.f143800f;
            return du35 != null ? i2 + C52418a.m58682i(3, du35.computeSize()) : i2;
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
            C51765w03 w032 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                w032.f143798d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49192du3 du36 = new C49192du3();
                    if (bArr != null && bArr.length > 0) {
                        du36.parseFrom(bArr);
                    }
                    w032.f143799e = du36;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49192du3 du37 = new C49192du3();
                    if (bArr2 != null && bArr2.length > 0) {
                        du37.parseFrom(bArr2);
                    }
                    w032.f143800f = du37;
                }
                return 0;
            }
        }
    }
}
