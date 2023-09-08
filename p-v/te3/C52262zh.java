package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zh */
public class C52262zh extends C47465a {

    /* renamed from: d */
    public int f145948d;

    /* renamed from: e */
    public int f145949e;

    /* renamed from: f */
    public String f145950f;

    /* renamed from: g */
    public String f145951g;

    /* renamed from: h */
    public String f145952h;

    /* renamed from: i */
    public LinkedList<C52262zh> f145953i = new LinkedList<>();

    /* renamed from: j */
    public int f145954j;

    /* renamed from: n */
    public String f145955n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52262zh)) {
            return false;
        }
        C52262zh zhVar = (C52262zh) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145948d), Integer.valueOf(zhVar.f145948d)) && C46238a.m51546a(Integer.valueOf(this.f145949e), Integer.valueOf(zhVar.f145949e)) && C46238a.m51546a(this.f145950f, zhVar.f145950f) && C46238a.m51546a(this.f145951g, zhVar.f145951g) && C46238a.m51546a(this.f145952h, zhVar.f145952h) && C46238a.m51546a(this.f145953i, zhVar.f145953i) && C46238a.m51546a(Integer.valueOf(this.f145954j), Integer.valueOf(zhVar.f145954j)) && C46238a.m51546a(this.f145955n, zhVar.f145955n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145948d);
            aVar.mo74318e(2, this.f145949e);
            String str = this.f145950f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f145951g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f145952h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74320g(6, 8, this.f145953i);
            aVar.mo74318e(7, this.f145954j);
            String str4 = this.f145955n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145948d) + 0 + C52418a.m58678e(2, this.f145949e);
            String str5 = this.f145950f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f145951g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f145952h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            int g = e + C52418a.m58680g(6, 8, this.f145953i) + C52418a.m58678e(7, this.f145954j);
            String str8 = this.f145955n;
            return str8 != null ? g + C52418a.m58683j(8, str8) : g;
        } else if (i == 2) {
            this.f145953i.clear();
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
            C52262zh zhVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zhVar.f145948d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    zhVar.f145949e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    zhVar.f145950f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zhVar.f145951g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zhVar.f145952h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52262zh zhVar2 = new C52262zh();
                        if (bArr != null && bArr.length > 0) {
                            zhVar2.parseFrom(bArr);
                        }
                        zhVar.f145953i.add(zhVar2);
                    }
                    return 0;
                case 7:
                    zhVar.f145954j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    zhVar.f145955n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
