package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.un2 */
public class C51572un2 extends C101820nt3 {

    /* renamed from: d */
    public long f142963d;

    /* renamed from: e */
    public String f142964e;

    /* renamed from: f */
    public long f142965f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51572un2)) {
            return false;
        }
        C51572un2 un22 = (C51572un2) aVar;
        return C46238a.m51546a(this.BaseRequest, un22.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f142963d), Long.valueOf(un22.f142963d)) && C46238a.m51546a(this.f142964e, un22.f142964e) && C46238a.m51546a(Long.valueOf(this.f142965f), Long.valueOf(un22.f142965f));
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
            aVar.mo74321h(2, this.f142963d);
            String str = this.f142964e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f142965f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f142963d);
            String str2 = this.f142964e;
            if (str2 != null) {
                h += C52418a.m58683j(3, str2);
            }
            return h + C52418a.m58681h(4, this.f142965f);
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
            C51572un2 un22 = objArr[1];
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
                    un22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                un22.f142963d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                un22.f142964e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                un22.f142965f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
