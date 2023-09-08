package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eo0 */
public class C49310eo0 extends C49335eu3 {

    /* renamed from: d */
    public C49098d51 f133026d;

    /* renamed from: e */
    public C52083y81 f133027e;

    /* renamed from: f */
    public FinderContact f133028f;

    /* renamed from: g */
    public C49236e51 f133029g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49310eo0)) {
            return false;
        }
        C49310eo0 eo02 = (C49310eo0) aVar;
        return C46238a.m51546a(this.BaseResponse, eo02.BaseResponse) && C46238a.m51546a(this.f133026d, eo02.f133026d) && C46238a.m51546a(this.f133027e, eo02.f133027e) && C46238a.m51546a(this.f133028f, eo02.f133028f) && C46238a.m51546a(this.f133029g, eo02.f133029g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            C49098d51 d512 = this.f133026d;
            if (d512 != null) {
                aVar.mo74322i(2, d512.computeSize());
                this.f133026d.writeFields(aVar);
            }
            C52083y81 y812 = this.f133027e;
            if (y812 != null) {
                aVar.mo74322i(3, y812.computeSize());
                this.f133027e.writeFields(aVar);
            }
            FinderContact finderContact = this.f133028f;
            if (finderContact != null) {
                aVar.mo74322i(4, finderContact.computeSize());
                this.f133028f.writeFields(aVar);
            }
            C49236e51 e512 = this.f133029g;
            if (e512 != null) {
                aVar.mo74322i(5, e512.computeSize());
                this.f133029g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49098d51 d513 = this.f133026d;
            if (d513 != null) {
                i2 += C52418a.m58682i(2, d513.computeSize());
            }
            C52083y81 y813 = this.f133027e;
            if (y813 != null) {
                i2 += C52418a.m58682i(3, y813.computeSize());
            }
            FinderContact finderContact2 = this.f133028f;
            if (finderContact2 != null) {
                i2 += C52418a.m58682i(4, finderContact2.computeSize());
            }
            C49236e51 e513 = this.f133029g;
            return e513 != null ? i2 + C52418a.m58682i(5, e513.computeSize()) : i2;
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
            C49310eo0 eo02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    eo02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49098d51 d514 = new C49098d51();
                    if (bArr2 != null && bArr2.length > 0) {
                        d514.parseFrom(bArr2);
                    }
                    eo02.f133026d = d514;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52083y81 y814 = new C52083y81();
                    if (bArr3 != null && bArr3.length > 0) {
                        y814.parseFrom(bArr3);
                    }
                    eo02.f133027e = y814;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    FinderContact finderContact3 = new FinderContact();
                    if (bArr4 != null && bArr4.length > 0) {
                        finderContact3.parseFrom(bArr4);
                    }
                    eo02.f133028f = finderContact3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    byte[] bArr5 = j5.get(i7);
                    C49236e51 e514 = new C49236e51();
                    if (bArr5 != null && bArr5.length > 0) {
                        e514.parseFrom(bArr5);
                    }
                    eo02.f133029g = e514;
                }
                return 0;
            }
        }
    }
}
