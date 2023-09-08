package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n33 */
public class C50490n33 extends C101820nt3 {

    /* renamed from: d */
    public String f138367d;

    /* renamed from: e */
    public C51018qv3 f138368e;

    /* renamed from: f */
    public C51018qv3 f138369f;

    /* renamed from: g */
    public String f138370g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50490n33)) {
            return false;
        }
        C50490n33 n332 = (C50490n33) aVar;
        return C46238a.m51546a(this.BaseRequest, n332.BaseRequest) && C46238a.m51546a(this.f138367d, n332.f138367d) && C46238a.m51546a(this.f138368e, n332.f138368e) && C46238a.m51546a(this.f138369f, n332.f138369f) && C46238a.m51546a(this.f138370g, n332.f138370g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f138368e == null) {
                throw new C52419b("Not all required fields were included: CurrentSynckey");
            } else if (this.f138369f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f138367d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C51018qv3 qv32 = this.f138368e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f138368e.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f138369f;
                if (qv33 != null) {
                    aVar.mo74322i(4, qv33.computeSize());
                    this.f138369f.writeFields(aVar);
                }
                String str2 = this.f138370g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: MaxSynckey");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f138367d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            C51018qv3 qv34 = this.f138368e;
            if (qv34 != null) {
                i2 += C52418a.m58682i(3, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f138369f;
            if (qv35 != null) {
                i2 += C52418a.m58682i(4, qv35.computeSize());
            }
            String str4 = this.f138370g;
            return str4 != null ? i2 + C52418a.m58683j(5, str4) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138368e == null) {
                throw new C52419b("Not all required fields were included: CurrentSynckey");
            } else if (this.f138369f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: MaxSynckey");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50490n33 n332 = objArr[1];
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
                    n332.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                n332.f138367d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv36 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv36.mo73348f(bArr2);
                    }
                    n332.f138368e = qv36;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51018qv3 qv37 = new C51018qv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        qv37.mo73348f(bArr3);
                    }
                    n332.f138369f = qv37;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                n332.f138370g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
