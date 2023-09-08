package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class o74 extends C47465a {

    /* renamed from: d */
    public String f139006d;

    /* renamed from: e */
    public String f139007e;

    /* renamed from: f */
    public int f139008f;

    /* renamed from: g */
    public String f139009g;

    /* renamed from: h */
    public String f139010h;

    /* renamed from: i */
    public LinkedList<p74> f139011i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof o74)) {
            return false;
        }
        o74 o74 = (o74) aVar;
        return C46238a.m51546a(this.f139006d, o74.f139006d) && C46238a.m51546a(this.f139007e, o74.f139007e) && C46238a.m51546a(Integer.valueOf(this.f139008f), Integer.valueOf(o74.f139008f)) && C46238a.m51546a(this.f139009g, o74.f139009g) && C46238a.m51546a(this.f139010h, o74.f139010h) && C46238a.m51546a(this.f139011i, o74.f139011i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139006d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f139007e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f139008f);
            String str3 = this.f139009g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f139010h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74320g(6, 8, this.f139011i);
            return 0;
        } else if (i == 1) {
            String str5 = this.f139006d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f139007e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f139008f);
            String str7 = this.f139009g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f139010h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            return e + C52418a.m58680g(6, 8, this.f139011i);
        } else if (i == 2) {
            this.f139011i.clear();
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
            o74 o74 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    o74.f139006d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    o74.f139007e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    o74.f139008f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    o74.f139009g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    o74.f139010h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        p74 p74 = new p74();
                        if (bArr != null && bArr.length > 0) {
                            p74.parseFrom(bArr);
                        }
                        o74.f139011i.add(p74);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
