package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class n75 extends C47465a {

    /* renamed from: d */
    public e75 f138461d;

    /* renamed from: e */
    public String f138462e;

    /* renamed from: f */
    public int f138463f;

    /* renamed from: g */
    public String f138464g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof n75)) {
            return false;
        }
        n75 n75 = (n75) aVar;
        return C46238a.m51546a(this.f138461d, n75.f138461d) && C46238a.m51546a(this.f138462e, n75.f138462e) && C46238a.m51546a(Integer.valueOf(this.f138463f), Integer.valueOf(n75.f138463f)) && C46238a.m51546a(this.f138464g, n75.f138464g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            e75 e75 = this.f138461d;
            if (e75 != null) {
                aVar.mo74322i(1, e75.computeSize());
                this.f138461d.writeFields(aVar);
            }
            String str = this.f138462e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f138463f);
            String str2 = this.f138464g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            e75 e752 = this.f138461d;
            if (e752 != null) {
                i2 = 0 + C52418a.m58682i(1, e752.computeSize());
            }
            String str3 = this.f138462e;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f138463f);
            String str4 = this.f138464g;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            n75 n75 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    e75 e753 = new e75();
                    if (bArr != null && bArr.length > 0) {
                        e753.parseFrom(bArr);
                    }
                    n75.f138461d = e753;
                }
                return 0;
            } else if (intValue == 2) {
                n75.f138462e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                n75.f138463f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                n75.f138464g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
