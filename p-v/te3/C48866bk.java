package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bk */
public class C48866bk extends C101820nt3 {

    /* renamed from: d */
    public C77925f4 f131158d;

    /* renamed from: e */
    public String f131159e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48866bk)) {
            return false;
        }
        C48866bk bkVar = (C48866bk) aVar;
        return C46238a.m51546a(this.BaseRequest, bkVar.BaseRequest) && C46238a.m51546a(this.f131158d, bkVar.f131158d) && C46238a.m51546a(this.f131159e, bkVar.f131159e);
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
            C77925f4 f4Var = this.f131158d;
            if (f4Var != null) {
                aVar.mo74322i(2, f4Var.computeSize());
                this.f131158d.writeFields(aVar);
            }
            String str = this.f131159e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C77925f4 f4Var2 = this.f131158d;
            if (f4Var2 != null) {
                i2 += C52418a.m58682i(2, f4Var2.computeSize());
            }
            String str2 = this.f131159e;
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
            C48866bk bkVar = objArr[1];
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
                    bkVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77925f4 f4Var3 = new C77925f4();
                    if (bArr2 != null && bArr2.length > 0) {
                        f4Var3.parseFrom(bArr2);
                    }
                    bkVar.f131158d = f4Var3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                bkVar.f131159e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
