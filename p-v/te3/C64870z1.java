package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z1 */
public class C64870z1 extends C101820nt3 {

    /* renamed from: d */
    public String f186615d;

    /* renamed from: e */
    public C64845y1 f186616e;

    /* renamed from: f */
    public String f186617f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64870z1)) {
            return false;
        }
        C64870z1 z1Var = (C64870z1) aVar;
        return C46238a.m51546a(this.BaseRequest, z1Var.BaseRequest) && C46238a.m51546a(this.f186615d, z1Var.f186615d) && C46238a.m51546a(this.f186616e, z1Var.f186616e) && C46238a.m51546a(this.f186617f, z1Var.f186617f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f186615d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C64845y1 y1Var = this.f186616e;
            if (y1Var != null) {
                aVar.mo74322i(3, y1Var.computeSize());
                this.f186616e.writeFields(aVar);
            }
            String str2 = this.f186617f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f186615d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            C64845y1 y1Var2 = this.f186616e;
            if (y1Var2 != null) {
                i2 += C52418a.m58682i(3, y1Var2.computeSize());
            }
            String str4 = this.f186617f;
            return str4 != null ? i2 + C52418a.m58683j(4, str4) : i2;
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
            C64870z1 z1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    z1Var.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                z1Var.f186615d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64845y1 y1Var3 = new C64845y1();
                    if (bArr2 != null && bArr2.length > 0) {
                        y1Var3.parseFrom(bArr2);
                    }
                    z1Var.f186616e = y1Var3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                z1Var.f186617f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
