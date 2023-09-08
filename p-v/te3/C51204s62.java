package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s62 */
public class C51204s62 extends C47465a {

    /* renamed from: d */
    public LinkedList<C50249le> f141344d = new LinkedList<>();

    /* renamed from: e */
    public int f141345e;

    /* renamed from: f */
    public int f141346f;

    /* renamed from: g */
    public String f141347g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51204s62)) {
            return false;
        }
        C51204s62 s622 = (C51204s62) aVar;
        return C46238a.m51546a(this.f141344d, s622.f141344d) && C46238a.m51546a(Integer.valueOf(this.f141345e), Integer.valueOf(s622.f141345e)) && C46238a.m51546a(Integer.valueOf(this.f141346f), Integer.valueOf(s622.f141346f)) && C46238a.m51546a(this.f141347g, s622.f141347g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f141344d);
            aVar.mo74318e(2, this.f141345e);
            aVar.mo74318e(3, this.f141346f);
            String str = this.f141347g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f141344d) + 0 + C52418a.m58678e(2, this.f141345e) + C52418a.m58678e(3, this.f141346f);
            String str2 = this.f141347g;
            return str2 != null ? g + C52418a.m58683j(4, str2) : g;
        } else if (i == 2) {
            this.f141344d.clear();
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
            C51204s62 s622 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50249le leVar = new C50249le();
                    if (bArr != null && bArr.length > 0) {
                        leVar.parseFrom(bArr);
                    }
                    s622.f141344d.add(leVar);
                }
                return 0;
            } else if (intValue == 2) {
                s622.f141345e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                s622.f141346f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                s622.f141347g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
