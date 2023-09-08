package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y11 */
public class C52051y11 extends C47465a {

    /* renamed from: d */
    public C52213z4 f145070d;

    /* renamed from: e */
    public C52213z4 f145071e;

    /* renamed from: f */
    public String f145072f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52051y11)) {
            return false;
        }
        C52051y11 y112 = (C52051y11) aVar;
        return C46238a.m51546a(this.f145070d, y112.f145070d) && C46238a.m51546a(this.f145071e, y112.f145071e) && C46238a.m51546a(this.f145072f, y112.f145072f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52213z4 z4Var = this.f145070d;
            if (z4Var != null) {
                aVar.mo74322i(1, z4Var.computeSize());
                this.f145070d.writeFields(aVar);
            }
            C52213z4 z4Var2 = this.f145071e;
            if (z4Var2 != null) {
                aVar.mo74322i(2, z4Var2.computeSize());
                this.f145071e.writeFields(aVar);
            }
            String str = this.f145072f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C52213z4 z4Var3 = this.f145070d;
            if (z4Var3 != null) {
                i2 = 0 + C52418a.m58682i(1, z4Var3.computeSize());
            }
            C52213z4 z4Var4 = this.f145071e;
            if (z4Var4 != null) {
                i2 += C52418a.m58682i(2, z4Var4.computeSize());
            }
            String str2 = this.f145072f;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
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
            C52051y11 y112 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52213z4 z4Var5 = new C52213z4();
                    if (bArr != null && bArr.length > 0) {
                        z4Var5.parseFrom(bArr);
                    }
                    y112.f145070d = z4Var5;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52213z4 z4Var6 = new C52213z4();
                    if (bArr2 != null && bArr2.length > 0) {
                        z4Var6.parseFrom(bArr2);
                    }
                    y112.f145071e = z4Var6;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                y112.f145072f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
