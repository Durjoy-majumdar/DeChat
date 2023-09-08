package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hv3 */
public class C64431hv3 extends C101820nt3 {

    /* renamed from: d */
    public String f183558d;

    /* renamed from: e */
    public String f183559e;

    /* renamed from: f */
    public String f183560f;

    /* renamed from: g */
    public C77955jv3 f183561g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64431hv3)) {
            return false;
        }
        C64431hv3 hv32 = (C64431hv3) aVar;
        return C46238a.m51546a(this.BaseRequest, hv32.BaseRequest) && C46238a.m51546a(this.f183558d, hv32.f183558d) && C46238a.m51546a(this.f183559e, hv32.f183559e) && C46238a.m51546a(this.f183560f, hv32.f183560f) && C46238a.m51546a(this.f183561g, hv32.f183561g);
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
            String str = this.f183558d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f183559e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f183560f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            C77955jv3 jv32 = this.f183561g;
            if (jv32 != null) {
                aVar.mo74322i(5, jv32.computeSize());
                this.f183561g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f183558d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f183559e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f183560f;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            C77955jv3 jv33 = this.f183561g;
            return jv33 != null ? i2 + C52418a.m58682i(5, jv33.computeSize()) : i2;
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
            C64431hv3 hv32 = objArr[1];
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
                    hv32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                hv32.f183558d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                hv32.f183559e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                hv32.f183560f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77955jv3 jv34 = new C77955jv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        jv34.parseFrom(bArr2);
                    }
                    hv32.f183561g = jv34;
                }
                return 0;
            }
        }
    }
}
