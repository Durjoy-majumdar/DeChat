package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hp3 */
public class C64427hp3 extends C47465a {

    /* renamed from: d */
    public String f183530d;

    /* renamed from: e */
    public long f183531e;

    /* renamed from: f */
    public int f183532f;

    /* renamed from: g */
    public String f183533g;

    /* renamed from: h */
    public int f183534h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64427hp3)) {
            return false;
        }
        C64427hp3 hp32 = (C64427hp3) aVar;
        return C46238a.m51546a(this.f183530d, hp32.f183530d) && C46238a.m51546a(Long.valueOf(this.f183531e), Long.valueOf(hp32.f183531e)) && C46238a.m51546a(Integer.valueOf(this.f183532f), Integer.valueOf(hp32.f183532f)) && C46238a.m51546a(this.f183533g, hp32.f183533g) && C46238a.m51546a(Integer.valueOf(this.f183534h), Integer.valueOf(hp32.f183534h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183530d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f183531e);
            aVar.mo74318e(3, this.f183532f);
            String str2 = this.f183533g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f183534h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f183530d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f183531e) + C52418a.m58678e(3, this.f183532f);
            String str4 = this.f183533g;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            return h + C52418a.m58678e(5, this.f183534h);
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
            C64427hp3 hp32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hp32.f183530d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                hp32.f183531e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                hp32.f183532f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                hp32.f183533g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                hp32.f183534h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
