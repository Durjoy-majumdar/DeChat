package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.do */
public class C49171do extends C101820nt3 {

    /* renamed from: d */
    public String f132437d;

    /* renamed from: e */
    public float f132438e;

    /* renamed from: f */
    public float f132439f;

    /* renamed from: g */
    public String f132440g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49171do)) {
            return false;
        }
        C49171do doVar = (C49171do) aVar;
        return C46238a.m51546a(this.BaseRequest, doVar.BaseRequest) && C46238a.m51546a(this.f132437d, doVar.f132437d) && C46238a.m51546a(Float.valueOf(this.f132438e), Float.valueOf(doVar.f132438e)) && C46238a.m51546a(Float.valueOf(this.f132439f), Float.valueOf(doVar.f132439f)) && C46238a.m51546a(this.f132440g, doVar.f132440g);
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
            String str = this.f132437d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74317d(3, this.f132438e);
            aVar.mo74317d(4, this.f132439f);
            String str2 = this.f132440g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f132437d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int d = i2 + C52418a.m58677d(3, this.f132438e) + C52418a.m58677d(4, this.f132439f);
            String str4 = this.f132440g;
            return str4 != null ? d + C52418a.m58683j(5, str4) : d;
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
            C49171do doVar = objArr[1];
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
                    doVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                doVar.f132437d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                doVar.f132438e = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 4) {
                doVar.f132439f = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                doVar.f132440g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
