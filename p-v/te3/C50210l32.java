package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l32 */
public class C50210l32 extends C101820nt3 {

    /* renamed from: d */
    public String f137150d;

    /* renamed from: e */
    public long f137151e;

    /* renamed from: f */
    public String f137152f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50210l32)) {
            return false;
        }
        C50210l32 l322 = (C50210l32) aVar;
        return C46238a.m51546a(this.BaseRequest, l322.BaseRequest) && C46238a.m51546a(this.f137150d, l322.f137150d) && C46238a.m51546a(Long.valueOf(this.f137151e), Long.valueOf(l322.f137151e)) && C46238a.m51546a(this.f137152f, l322.f137152f);
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
            String str = this.f137150d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f137151e);
            String str2 = this.f137152f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f137150d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int h = i2 + C52418a.m58681h(3, this.f137151e);
            String str4 = this.f137152f;
            return str4 != null ? h + C52418a.m58683j(4, str4) : h;
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
            C50210l32 l322 = objArr[1];
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
                    l322.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                l322.f137150d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                l322.f137151e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                l322.f137152f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
