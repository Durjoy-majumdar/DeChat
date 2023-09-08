package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ke4 extends C47465a {

    /* renamed from: d */
    public String f136723d;

    /* renamed from: e */
    public g75 f136724e;

    /* renamed from: f */
    public String f136725f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ke4)) {
            return false;
        }
        ke4 ke4 = (ke4) aVar;
        return C46238a.m51546a(this.f136723d, ke4.f136723d) && C46238a.m51546a(this.f136724e, ke4.f136724e) && C46238a.m51546a(this.f136725f, ke4.f136725f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136723d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                g75 g75 = this.f136724e;
                if (g75 != null) {
                    aVar.mo74322i(2, g75.computeSize());
                    this.f136724e.writeFields(aVar);
                }
                String str2 = this.f136725f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: WxaUserName");
        } else if (i == 1) {
            String str3 = this.f136723d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            g75 g752 = this.f136724e;
            if (g752 != null) {
                i2 += C52418a.m58682i(2, g752.computeSize());
            }
            String str4 = this.f136725f;
            return str4 != null ? i2 + C52418a.m58683j(3, str4) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f136723d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: WxaUserName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ke4 ke4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ke4.f136723d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    g75 g753 = new g75();
                    if (bArr != null && bArr.length > 0) {
                        g753.parseFrom(bArr);
                    }
                    ke4.f136724e = g753;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ke4.f136725f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
