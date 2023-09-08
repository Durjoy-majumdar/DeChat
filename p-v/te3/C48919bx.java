package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bx */
public class C48919bx extends C101820nt3 {

    /* renamed from: d */
    public long f131362d;

    /* renamed from: e */
    public String f131363e;

    /* renamed from: f */
    public boolean f131364f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48919bx)) {
            return false;
        }
        C48919bx bxVar = (C48919bx) aVar;
        return C46238a.m51546a(this.BaseRequest, bxVar.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f131362d), Long.valueOf(bxVar.f131362d)) && C46238a.m51546a(this.f131363e, bxVar.f131363e) && C46238a.m51546a(Boolean.valueOf(this.f131364f), Boolean.valueOf(bxVar.f131364f));
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
            aVar.mo74321h(2, this.f131362d);
            String str = this.f131363e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74314a(4, this.f131364f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f131362d);
            String str2 = this.f131363e;
            if (str2 != null) {
                h += C52418a.m58683j(3, str2);
            }
            return h + C52418a.m58674a(4, this.f131364f);
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
            C48919bx bxVar = objArr[1];
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
                    bxVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                bxVar.f131362d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                bxVar.f131363e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                bxVar.f131364f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
