package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z02 */
public class C52195z02 extends C101820nt3 {

    /* renamed from: d */
    public String f145617d;

    /* renamed from: e */
    public String f145618e;

    /* renamed from: f */
    public String f145619f;

    /* renamed from: g */
    public C50694ok f145620g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52195z02)) {
            return false;
        }
        C52195z02 z022 = (C52195z02) aVar;
        return C46238a.m51546a(this.BaseRequest, z022.BaseRequest) && C46238a.m51546a(this.f145617d, z022.f145617d) && C46238a.m51546a(this.f145618e, z022.f145618e) && C46238a.m51546a(this.f145619f, z022.f145619f) && C46238a.m51546a(this.f145620g, z022.f145620g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f145617d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f145617d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f145618e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f145619f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                C50694ok okVar = this.f145620g;
                if (okVar != null) {
                    aVar.mo74322i(5, okVar.computeSize());
                    this.f145620g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: FunctionMsgID");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f145617d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f145618e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f145619f;
            if (str6 != null) {
                i2 += C52418a.m58683j(4, str6);
            }
            C50694ok okVar2 = this.f145620g;
            return okVar2 != null ? i2 + C52418a.m58682i(5, okVar2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f145617d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: FunctionMsgID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52195z02 z022 = objArr[1];
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
                    z022.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                z022.f145617d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                z022.f145618e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                z022.f145619f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50694ok okVar3 = new C50694ok();
                    if (bArr2 != null && bArr2.length > 0) {
                        okVar3.parseFrom(bArr2);
                    }
                    z022.f145620g = okVar3;
                }
                return 0;
            }
        }
    }
}
