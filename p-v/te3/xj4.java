package te3;

import if0.C46238a;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class xj4 extends C101820nt3 {

    /* renamed from: d */
    public String f144712d;

    /* renamed from: e */
    public String f144713e;

    /* renamed from: f */
    public String f144714f;

    /* renamed from: b */
    public C89132b<yj4> mo73361b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 4956;
        bVar.f127068c = "/cgi-bin/micromsg-bin/translatemsgbadcase";
        bVar.f127066a = this;
        bVar.f127067b = new yj4();
        C47350c a = bVar.mo72403a();
        C89132b<yj4> bVar2 = new C89132b<>();
        bVar2.mo123453j(a);
        return bVar2;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xj4)) {
            return false;
        }
        xj4 xj4 = (xj4) aVar;
        return C46238a.m51546a(this.BaseRequest, xj4.BaseRequest) && C46238a.m51546a(this.f144712d, xj4.f144712d) && C46238a.m51546a(this.f144713e, xj4.f144713e) && C46238a.m51546a(this.f144714f, xj4.f144714f);
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
            String str = this.f144712d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f144713e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f144714f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f144712d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f144713e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            String str6 = this.f144714f;
            return str6 != null ? i2 + C52418a.m58683j(4, str6) : i2;
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
            xj4 xj4 = objArr[1];
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
                    xj4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                xj4.f144712d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                xj4.f144713e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                xj4.f144714f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
