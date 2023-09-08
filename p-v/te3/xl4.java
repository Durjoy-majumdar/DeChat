package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class xl4 extends C101820nt3 {

    /* renamed from: d */
    public String f144740d;

    /* renamed from: e */
    public String f144741e;

    /* renamed from: f */
    public int f144742f;

    /* renamed from: g */
    public C51018qv3 f144743g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xl4)) {
            return false;
        }
        xl4 xl4 = (xl4) aVar;
        return C46238a.m51546a(this.BaseRequest, xl4.BaseRequest) && C46238a.m51546a(this.f144740d, xl4.f144740d) && C46238a.m51546a(this.f144741e, xl4.f144741e) && C46238a.m51546a(Integer.valueOf(this.f144742f), Integer.valueOf(xl4.f144742f)) && C46238a.m51546a(this.f144743g, xl4.f144743g);
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
            String str = this.f144740d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f144741e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f144742f);
            C51018qv3 qv32 = this.f144743g;
            if (qv32 != null) {
                aVar.mo74322i(5, qv32.computeSize());
                this.f144743g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f144740d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f144741e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int e = i2 + C52418a.m58678e(4, this.f144742f);
            C51018qv3 qv33 = this.f144743g;
            return qv33 != null ? e + C52418a.m58682i(5, qv33.computeSize()) : e;
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
            xl4 xl4 = objArr[1];
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
                    xl4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                xl4.f144740d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                xl4.f144741e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                xl4.f144742f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv34.mo73348f(bArr2);
                    }
                    xl4.f144743g = qv34;
                }
                return 0;
            }
        }
    }
}
