package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class q55 extends C47465a {

    /* renamed from: d */
    public String f140158d;

    /* renamed from: e */
    public C89349b f140159e;

    /* renamed from: f */
    public LinkedList<n55> f140160f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof q55)) {
            return false;
        }
        q55 q55 = (q55) aVar;
        return C46238a.m51546a(this.f140158d, q55.f140158d) && C46238a.m51546a(this.f140159e, q55.f140159e) && C46238a.m51546a(this.f140160f, q55.f140160f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140158d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                C89349b bVar = this.f140159e;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                aVar.mo74320g(3, 8, this.f140160f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: WxaUserName");
        } else if (i == 1) {
            String str2 = this.f140158d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C89349b bVar2 = this.f140159e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58680g(3, 8, this.f140160f);
        } else if (i == 2) {
            this.f140160f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f140158d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: WxaUserName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            q55 q55 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                q55.f140158d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                q55.f140159e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    n55 n55 = new n55();
                    if (bArr != null && bArr.length > 0) {
                        n55.parseFrom(bArr);
                    }
                    q55.f140160f.add(n55);
                }
                return 0;
            }
        }
    }
}
