package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ij */
public class C49853ij extends C101820nt3 {

    /* renamed from: d */
    public C51164rw f135368d;

    /* renamed from: e */
    public C51605uw f135369e;

    /* renamed from: f */
    public C50316lw f135370f;

    /* renamed from: g */
    public int f135371g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49853ij)) {
            return false;
        }
        C49853ij ijVar = (C49853ij) aVar;
        return C46238a.m51546a(this.BaseRequest, ijVar.BaseRequest) && C46238a.m51546a(this.f135368d, ijVar.f135368d) && C46238a.m51546a(this.f135369e, ijVar.f135369e) && C46238a.m51546a(this.f135370f, ijVar.f135370f) && C46238a.m51546a(Integer.valueOf(this.f135371g), Integer.valueOf(ijVar.f135371g));
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
            C51164rw rwVar = this.f135368d;
            if (rwVar != null) {
                aVar.mo74322i(2, rwVar.computeSize());
                this.f135368d.writeFields(aVar);
            }
            C51605uw uwVar = this.f135369e;
            if (uwVar != null) {
                aVar.mo74322i(3, uwVar.computeSize());
                this.f135369e.writeFields(aVar);
            }
            C50316lw lwVar = this.f135370f;
            if (lwVar != null) {
                aVar.mo74322i(4, lwVar.computeSize());
                this.f135370f.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f135371g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51164rw rwVar2 = this.f135368d;
            if (rwVar2 != null) {
                i2 += C52418a.m58682i(2, rwVar2.computeSize());
            }
            C51605uw uwVar2 = this.f135369e;
            if (uwVar2 != null) {
                i2 += C52418a.m58682i(3, uwVar2.computeSize());
            }
            C50316lw lwVar2 = this.f135370f;
            if (lwVar2 != null) {
                i2 += C52418a.m58682i(4, lwVar2.computeSize());
            }
            return i2 + C52418a.m58678e(5, this.f135371g);
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
            C49853ij ijVar = objArr[1];
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
                    ijVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51164rw rwVar3 = new C51164rw();
                    if (bArr2 != null && bArr2.length > 0) {
                        rwVar3.parseFrom(bArr2);
                    }
                    ijVar.f135368d = rwVar3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51605uw uwVar3 = new C51605uw();
                    if (bArr3 != null && bArr3.length > 0) {
                        uwVar3.parseFrom(bArr3);
                    }
                    ijVar.f135369e = uwVar3;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C50316lw lwVar3 = new C50316lw();
                    if (bArr4 != null && bArr4.length > 0) {
                        lwVar3.parseFrom(bArr4);
                    }
                    ijVar.f135370f = lwVar3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                ijVar.f135371g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
