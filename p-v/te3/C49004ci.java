package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ci */
public class C49004ci extends C101820nt3 {

    /* renamed from: d */
    public int f131731d;

    /* renamed from: e */
    public dr4 f131732e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49004ci)) {
            return false;
        }
        C49004ci ciVar = (C49004ci) aVar;
        return C46238a.m51546a(this.BaseRequest, ciVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f131731d), Integer.valueOf(ciVar.f131731d)) && C46238a.m51546a(this.f131732e, ciVar.f131732e);
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
            aVar.mo74318e(2, this.f131731d);
            dr4 dr4 = this.f131732e;
            if (dr4 != null) {
                aVar.mo74322i(3, dr4.computeSize());
                this.f131732e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f131731d);
            dr4 dr42 = this.f131732e;
            return dr42 != null ? e + C52418a.m58682i(3, dr42.computeSize()) : e;
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
            C49004ci ciVar = objArr[1];
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
                    ciVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ciVar.f131731d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    dr4 dr43 = new dr4();
                    if (bArr2 != null && bArr2.length > 0) {
                        dr43.parseFrom(bArr2);
                    }
                    ciVar.f131732e = dr43;
                }
                return 0;
            }
        }
    }
}
