package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class df4 extends C101820nt3 {

    /* renamed from: d */
    public int f132295d;

    /* renamed from: e */
    public long f132296e;

    /* renamed from: f */
    public int f132297f;

    /* renamed from: g */
    public int f132298g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof df4)) {
            return false;
        }
        df4 df4 = (df4) aVar;
        return C46238a.m51546a(this.BaseRequest, df4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f132295d), Integer.valueOf(df4.f132295d)) && C46238a.m51546a(Long.valueOf(this.f132296e), Long.valueOf(df4.f132296e)) && C46238a.m51546a(Integer.valueOf(this.f132297f), Integer.valueOf(df4.f132297f)) && C46238a.m51546a(Integer.valueOf(this.f132298g), Integer.valueOf(df4.f132298g));
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
            aVar.mo74318e(2, this.f132295d);
            aVar.mo74321h(3, this.f132296e);
            aVar.mo74318e(4, this.f132297f);
            aVar.mo74318e(5, this.f132298g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f132295d) + C52418a.m58681h(3, this.f132296e) + C52418a.m58678e(4, this.f132297f) + C52418a.m58678e(5, this.f132298g);
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
            df4 df4 = objArr[1];
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
                    df4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                df4.f132295d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                df4.f132296e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                df4.f132297f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                df4.f132298g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
