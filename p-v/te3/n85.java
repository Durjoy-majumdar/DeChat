package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class n85 extends C47465a {

    /* renamed from: d */
    public String f138485d;

    /* renamed from: e */
    public int f138486e;

    /* renamed from: f */
    public int f138487f;

    /* renamed from: g */
    public int f138488g;

    /* renamed from: h */
    public int f138489h;

    /* renamed from: i */
    public pa4 f138490i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof n85)) {
            return false;
        }
        n85 n85 = (n85) aVar;
        return C46238a.m51546a(this.f138485d, n85.f138485d) && C46238a.m51546a(Integer.valueOf(this.f138486e), Integer.valueOf(n85.f138486e)) && C46238a.m51546a(Integer.valueOf(this.f138487f), Integer.valueOf(n85.f138487f)) && C46238a.m51546a(Integer.valueOf(this.f138488g), Integer.valueOf(n85.f138488g)) && C46238a.m51546a(Integer.valueOf(this.f138489h), Integer.valueOf(n85.f138489h)) && C46238a.m51546a(this.f138490i, n85.f138490i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138485d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f138486e);
                aVar.mo74318e(3, this.f138487f);
                aVar.mo74318e(4, this.f138488g);
                aVar.mo74318e(5, this.f138489h);
                pa4 pa4 = this.f138490i;
                if (pa4 != null) {
                    aVar.mo74322i(6, pa4.computeSize());
                    this.f138490i.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i == 1) {
            String str2 = this.f138485d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f138486e) + C52418a.m58678e(3, this.f138487f) + C52418a.m58678e(4, this.f138488g) + C52418a.m58678e(5, this.f138489h);
            pa4 pa42 = this.f138490i;
            return pa42 != null ? e + C52418a.m58682i(6, pa42.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138485d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: username");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            n85 n85 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    n85.f138485d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    n85.f138486e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    n85.f138487f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    n85.f138488g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    n85.f138489h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        pa4 pa43 = new pa4();
                        if (bArr != null && bArr.length > 0) {
                            pa43.parseFrom(bArr);
                        }
                        n85.f138490i = pa43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
