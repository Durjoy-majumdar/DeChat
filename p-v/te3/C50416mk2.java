package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mk2 */
public class C50416mk2 extends C101820nt3 {

    /* renamed from: d */
    public String f138083d;

    /* renamed from: e */
    public int f138084e;

    /* renamed from: f */
    public w55 f138085f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50416mk2)) {
            return false;
        }
        C50416mk2 mk22 = (C50416mk2) aVar;
        return C46238a.m51546a(this.BaseRequest, mk22.BaseRequest) && C46238a.m51546a(this.f138083d, mk22.f138083d) && C46238a.m51546a(Integer.valueOf(this.f138084e), Integer.valueOf(mk22.f138084e)) && C46238a.m51546a(this.f138085f, mk22.f138085f);
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
            String str = this.f138083d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f138084e);
            w55 w55 = this.f138085f;
            if (w55 != null) {
                aVar.mo74322i(4, w55.computeSize());
                this.f138085f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f138083d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int e = i2 + C52418a.m58678e(3, this.f138084e);
            w55 w552 = this.f138085f;
            return w552 != null ? e + C52418a.m58682i(4, w552.computeSize()) : e;
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
            C50416mk2 mk22 = objArr[1];
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
                    mk22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                mk22.f138083d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                mk22.f138084e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    w55 w553 = new w55();
                    if (bArr2 != null && bArr2.length > 0) {
                        w553.parseFrom(bArr2);
                    }
                    mk22.f138085f = w553;
                }
                return 0;
            }
        }
    }
}
