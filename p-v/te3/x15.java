package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class x15 extends C47465a {

    /* renamed from: d */
    public String f144404d;

    /* renamed from: e */
    public String f144405e;

    /* renamed from: f */
    public C89349b f144406f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof x15)) {
            return false;
        }
        x15 x15 = (x15) aVar;
        return C46238a.m51546a(this.f144404d, x15.f144404d) && C46238a.m51546a(this.f144405e, x15.f144405e) && C46238a.m51546a(this.f144406f, x15.f144406f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144404d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f144405e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f144405e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                C89349b bVar = this.f144406f;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NickName");
            }
        } else if (i == 1) {
            String str3 = this.f144404d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f144405e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            C89349b bVar2 = this.f144406f;
            return bVar2 != null ? i2 + C52418a.m58675b(3, bVar2) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f144404d == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f144405e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NickName");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            x15 x15 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                x15.f144404d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                x15.f144405e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                x15.f144406f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
