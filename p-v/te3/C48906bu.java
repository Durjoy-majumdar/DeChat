package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bu */
public class C48906bu extends C101820nt3 {

    /* renamed from: d */
    public C51018qv3 f131302d;

    /* renamed from: e */
    public String f131303e;

    /* renamed from: f */
    public int f131304f;

    /* renamed from: g */
    public int f131305g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48906bu)) {
            return false;
        }
        C48906bu buVar = (C48906bu) aVar;
        return C46238a.m51546a(this.BaseRequest, buVar.BaseRequest) && C46238a.m51546a(this.f131302d, buVar.f131302d) && C46238a.m51546a(this.f131303e, buVar.f131303e) && C46238a.m51546a(Integer.valueOf(this.f131304f), Integer.valueOf(buVar.f131304f)) && C46238a.m51546a(Integer.valueOf(this.f131305g), Integer.valueOf(buVar.f131305g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f131302d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f131302d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f131302d.writeFields(aVar);
                }
                String str = this.f131303e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f131304f);
                aVar.mo74318e(5, this.f131305g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: RandomEncryKey");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51018qv3 qv33 = this.f131302d;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            String str2 = this.f131303e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            return i2 + C52418a.m58678e(4, this.f131304f) + C52418a.m58678e(5, this.f131305g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f131302d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: RandomEncryKey");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48906bu buVar = objArr[1];
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
                    buVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv34.mo73348f(bArr2);
                    }
                    buVar.f131302d = qv34;
                }
                return 0;
            } else if (intValue == 3) {
                buVar.f131303e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                buVar.f131304f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                buVar.f131305g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
