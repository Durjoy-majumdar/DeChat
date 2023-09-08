package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class n35 extends C47465a {

    /* renamed from: d */
    public String f138396d;

    /* renamed from: e */
    public String f138397e;

    /* renamed from: f */
    public int f138398f;

    /* renamed from: g */
    public int f138399g;

    /* renamed from: h */
    public q35 f138400h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof n35)) {
            return false;
        }
        n35 n35 = (n35) aVar;
        return C46238a.m51546a(this.f138396d, n35.f138396d) && C46238a.m51546a(this.f138397e, n35.f138397e) && C46238a.m51546a(Integer.valueOf(this.f138398f), Integer.valueOf(n35.f138398f)) && C46238a.m51546a(Integer.valueOf(this.f138399g), Integer.valueOf(n35.f138399g)) && C46238a.m51546a(this.f138400h, n35.f138400h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138396d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Md5");
            } else if (this.f138397e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f138397e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74318e(3, this.f138398f);
                aVar.mo74318e(4, this.f138399g);
                q35 q35 = this.f138400h;
                if (q35 != null) {
                    aVar.mo74322i(5, q35.computeSize());
                    this.f138400h.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DownloadUrl");
            }
        } else if (i == 1) {
            String str3 = this.f138396d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f138397e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f138398f) + C52418a.m58678e(4, this.f138399g);
            q35 q352 = this.f138400h;
            return q352 != null ? e + C52418a.m58682i(5, q352.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138396d == null) {
                throw new C52419b("Not all required fields were included: Md5");
            } else if (this.f138397e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DownloadUrl");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            n35 n35 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n35.f138396d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                n35.f138397e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                n35.f138398f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                n35.f138399g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    q35 q353 = new q35();
                    if (bArr != null && bArr.length > 0) {
                        q353.parseFrom(bArr);
                    }
                    n35.f138400h = q353;
                }
                return 0;
            }
        }
    }
}
