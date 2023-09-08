package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bf3 */
public class C48850bf3 extends C47465a {

    /* renamed from: d */
    public String f131080d;

    /* renamed from: e */
    public String f131081e;

    /* renamed from: f */
    public String f131082f;

    /* renamed from: g */
    public int f131083g;

    /* renamed from: h */
    public String f131084h;

    /* renamed from: i */
    public LinkedList<C48997cf3> f131085i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48850bf3)) {
            return false;
        }
        C48850bf3 bf32 = (C48850bf3) aVar;
        return C46238a.m51546a(this.f131080d, bf32.f131080d) && C46238a.m51546a(this.f131081e, bf32.f131081e) && C46238a.m51546a(this.f131082f, bf32.f131082f) && C46238a.m51546a(Integer.valueOf(this.f131083g), Integer.valueOf(bf32.f131083g)) && C46238a.m51546a(this.f131084h, bf32.f131084h) && C46238a.m51546a(this.f131085i, bf32.f131085i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131080d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f131081e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f131082f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f131083g);
            String str4 = this.f131084h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74320g(6, 8, this.f131085i);
            return 0;
        } else if (i == 1) {
            String str5 = this.f131080d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f131081e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f131082f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            int e = i2 + C52418a.m58678e(4, this.f131083g);
            String str8 = this.f131084h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            return e + C52418a.m58680g(6, 8, this.f131085i);
        } else if (i == 2) {
            this.f131085i.clear();
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
            C48850bf3 bf32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bf32.f131080d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    bf32.f131081e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bf32.f131082f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bf32.f131083g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bf32.f131084h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C48997cf3 cf32 = new C48997cf3();
                        if (bArr != null && bArr.length > 0) {
                            cf32.parseFrom(bArr);
                        }
                        bf32.f131085i.add(cf32);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
