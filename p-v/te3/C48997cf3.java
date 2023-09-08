package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cf3 */
public class C48997cf3 extends C47465a {

    /* renamed from: d */
    public String f131697d;

    /* renamed from: e */
    public String f131698e;

    /* renamed from: f */
    public int f131699f;

    /* renamed from: g */
    public LinkedList<C51535ue3> f131700g = new LinkedList<>();

    /* renamed from: h */
    public String f131701h;

    /* renamed from: i */
    public int f131702i;

    /* renamed from: j */
    public int f131703j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48997cf3)) {
            return false;
        }
        C48997cf3 cf32 = (C48997cf3) aVar;
        return C46238a.m51546a(this.f131697d, cf32.f131697d) && C46238a.m51546a(this.f131698e, cf32.f131698e) && C46238a.m51546a(Integer.valueOf(this.f131699f), Integer.valueOf(cf32.f131699f)) && C46238a.m51546a(this.f131700g, cf32.f131700g) && C46238a.m51546a(this.f131701h, cf32.f131701h) && C46238a.m51546a(Integer.valueOf(this.f131702i), Integer.valueOf(cf32.f131702i)) && C46238a.m51546a(Integer.valueOf(this.f131703j), Integer.valueOf(cf32.f131703j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131697d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f131698e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f131699f);
            aVar.mo74320g(4, 8, this.f131700g);
            String str3 = this.f131701h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f131702i);
            aVar.mo74318e(7, this.f131703j);
            return 0;
        } else if (i == 1) {
            String str4 = this.f131697d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f131698e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f131699f) + C52418a.m58680g(4, 8, this.f131700g);
            String str6 = this.f131701h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            return e + C52418a.m58678e(6, this.f131702i) + C52418a.m58678e(7, this.f131703j);
        } else if (i == 2) {
            this.f131700g.clear();
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
            C48997cf3 cf32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cf32.f131697d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    cf32.f131698e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cf32.f131699f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51535ue3 ue32 = new C51535ue3();
                        if (bArr != null && bArr.length > 0) {
                            ue32.parseFrom(bArr);
                        }
                        cf32.f131700g.add(ue32);
                    }
                    return 0;
                case 5:
                    cf32.f131701h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cf32.f131702i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    cf32.f131703j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
