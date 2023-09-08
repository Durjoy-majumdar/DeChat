package yy1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: yy1.r */
public class C53656r extends C101820nt3 {

    /* renamed from: d */
    public String f150718d;

    /* renamed from: e */
    public long f150719e;

    /* renamed from: f */
    public boolean f150720f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53656r)) {
            return false;
        }
        C53656r rVar = (C53656r) aVar;
        return C46238a.m51546a(this.BaseRequest, rVar.BaseRequest) && C46238a.m51546a(this.f150718d, rVar.f150718d) && C46238a.m51546a(Long.valueOf(this.f150719e), Long.valueOf(rVar.f150719e)) && C46238a.m51546a(Boolean.valueOf(this.f150720f), Boolean.valueOf(rVar.f150720f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f150718d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f150718d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74321h(3, this.f150719e);
                aVar.mo74314a(4, this.f150720f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: session_id");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f150718d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58681h(3, this.f150719e) + C52418a.m58674a(4, this.f150720f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f150718d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: session_id");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C53656r rVar = objArr[1];
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
                    rVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                rVar.f150718d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                rVar.f150719e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                rVar.f150720f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
