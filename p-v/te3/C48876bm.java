package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bm */
public class C48876bm extends C101820nt3 {

    /* renamed from: d */
    public String f131192d;

    /* renamed from: e */
    public String f131193e;

    /* renamed from: f */
    public long f131194f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48876bm)) {
            return false;
        }
        C48876bm bmVar = (C48876bm) aVar;
        return C46238a.m51546a(this.BaseRequest, bmVar.BaseRequest) && C46238a.m51546a(this.f131192d, bmVar.f131192d) && C46238a.m51546a(this.f131193e, bmVar.f131193e) && C46238a.m51546a(Long.valueOf(this.f131194f), Long.valueOf(bmVar.f131194f));
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
            String str = this.f131192d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f131193e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74321h(4, this.f131194f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f131192d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f131193e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58681h(4, this.f131194f);
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
            C48876bm bmVar = objArr[1];
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
                    bmVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                bmVar.f131192d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                bmVar.f131193e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                bmVar.f131194f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
