package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mu3 */
public class C50453mu3 extends C101820nt3 {

    /* renamed from: d */
    public long f138215d;

    /* renamed from: e */
    public String f138216e;

    /* renamed from: f */
    public String f138217f;

    /* renamed from: g */
    public String f138218g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50453mu3)) {
            return false;
        }
        C50453mu3 mu32 = (C50453mu3) aVar;
        return C46238a.m51546a(this.BaseRequest, mu32.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f138215d), Long.valueOf(mu32.f138215d)) && C46238a.m51546a(this.f138216e, mu32.f138216e) && C46238a.m51546a(this.f138217f, mu32.f138217f) && C46238a.m51546a(this.f138218g, mu32.f138218g);
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
            aVar.mo74321h(2, this.f138215d);
            String str = this.f138216e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f138217f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f138218g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f138215d);
            String str4 = this.f138216e;
            if (str4 != null) {
                h += C52418a.m58683j(3, str4);
            }
            String str5 = this.f138217f;
            if (str5 != null) {
                h += C52418a.m58683j(4, str5);
            }
            String str6 = this.f138218g;
            return str6 != null ? h + C52418a.m58683j(5, str6) : h;
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
            C50453mu3 mu32 = objArr[1];
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
                    mu32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                mu32.f138215d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                mu32.f138216e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                mu32.f138217f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                mu32.f138218g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
