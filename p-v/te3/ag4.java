package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ag4 extends C101820nt3 {

    /* renamed from: d */
    public String f130504d;

    /* renamed from: e */
    public int f130505e;

    /* renamed from: f */
    public String f130506f;

    /* renamed from: g */
    public C51018qv3 f130507g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ag4)) {
            return false;
        }
        ag4 ag4 = (ag4) aVar;
        return C46238a.m51546a(this.BaseRequest, ag4.BaseRequest) && C46238a.m51546a(this.f130504d, ag4.f130504d) && C46238a.m51546a(Integer.valueOf(this.f130505e), Integer.valueOf(ag4.f130505e)) && C46238a.m51546a(this.f130506f, ag4.f130506f) && C46238a.m51546a(this.f130507g, ag4.f130507g);
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
            String str = this.f130504d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f130505e);
            String str2 = this.f130506f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C51018qv3 qv32 = this.f130507g;
            if (qv32 != null) {
                aVar.mo74322i(5, qv32.computeSize());
                this.f130507g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f130504d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f130505e);
            String str4 = this.f130506f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            C51018qv3 qv33 = this.f130507g;
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
            ag4 ag4 = objArr[1];
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
                    ag4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ag4.f130504d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ag4.f130505e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                ag4.f130506f = aVar3.mo141633k(intValue);
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
                    ag4.f130507g = qv34;
                }
                return 0;
            }
        }
    }
}
