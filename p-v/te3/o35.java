package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class o35 extends C47465a {

    /* renamed from: d */
    public String f138942d;

    /* renamed from: e */
    public String f138943e;

    /* renamed from: f */
    public n35 f138944f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof o35)) {
            return false;
        }
        o35 o35 = (o35) aVar;
        return C46238a.m51546a(this.f138942d, o35.f138942d) && C46238a.m51546a(this.f138943e, o35.f138943e) && C46238a.m51546a(this.f138944f, o35.f138944f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138942d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Rid");
            } else if (this.f138943e == null) {
                throw new C52419b("Not all required fields were included: MimeType");
            } else if (this.f138944f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f138943e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                n35 n35 = this.f138944f;
                if (n35 != null) {
                    aVar.mo74322i(3, n35.computeSize());
                    this.f138944f.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DownloadInfo");
            }
        } else if (i == 1) {
            String str3 = this.f138942d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f138943e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            n35 n352 = this.f138944f;
            return n352 != null ? i2 + C52418a.m58682i(3, n352.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138942d == null) {
                throw new C52419b("Not all required fields were included: Rid");
            } else if (this.f138943e == null) {
                throw new C52419b("Not all required fields were included: MimeType");
            } else if (this.f138944f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DownloadInfo");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            o35 o35 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                o35.f138942d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                o35.f138943e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    n35 n353 = new n35();
                    if (bArr != null && bArr.length > 0) {
                        n353.parseFrom(bArr);
                    }
                    o35.f138944f = n353;
                }
                return 0;
            }
        }
    }
}
