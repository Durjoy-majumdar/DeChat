package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nx2 */
public class C64594nx2 extends C47465a {

    /* renamed from: d */
    public String f184575d;

    /* renamed from: e */
    public String f184576e;

    /* renamed from: f */
    public int f184577f;

    /* renamed from: g */
    public int f184578g;

    /* renamed from: h */
    public C64773vh3 f184579h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64594nx2)) {
            return false;
        }
        C64594nx2 nx22 = (C64594nx2) aVar;
        return C46238a.m51546a(this.f184575d, nx22.f184575d) && C46238a.m51546a(this.f184576e, nx22.f184576e) && C46238a.m51546a(Integer.valueOf(this.f184577f), Integer.valueOf(nx22.f184577f)) && C46238a.m51546a(Integer.valueOf(this.f184578g), Integer.valueOf(nx22.f184578g)) && C46238a.m51546a(this.f184579h, nx22.f184579h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184575d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184576e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f184577f);
            aVar.mo74318e(4, this.f184578g);
            C64773vh3 vh32 = this.f184579h;
            if (vh32 != null) {
                aVar.mo74322i(5, vh32.computeSize());
                this.f184579h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f184575d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f184576e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f184577f) + C52418a.m58678e(4, this.f184578g);
            C64773vh3 vh33 = this.f184579h;
            return vh33 != null ? e + C52418a.m58682i(5, vh33.computeSize()) : e;
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
            C64594nx2 nx22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nx22.f184575d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                nx22.f184576e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                nx22.f184577f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                nx22.f184578g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64773vh3 vh34 = new C64773vh3();
                    if (bArr != null && bArr.length > 0) {
                        vh34.parseFrom(bArr);
                    }
                    nx22.f184579h = vh34;
                }
                return 0;
            }
        }
    }
}
