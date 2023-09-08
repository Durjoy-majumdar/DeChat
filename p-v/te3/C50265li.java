package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.li */
public class C50265li extends C47465a {

    /* renamed from: d */
    public String f137424d;

    /* renamed from: e */
    public LinkedList<C49555gg> f137425e = new LinkedList<>();

    /* renamed from: f */
    public int f137426f;

    /* renamed from: g */
    public String f137427g;

    /* renamed from: h */
    public String f137428h;

    /* renamed from: i */
    public String f137429i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50265li)) {
            return false;
        }
        C50265li liVar = (C50265li) aVar;
        return C46238a.m51546a(this.f137424d, liVar.f137424d) && C46238a.m51546a(this.f137425e, liVar.f137425e) && C46238a.m51546a(Integer.valueOf(this.f137426f), Integer.valueOf(liVar.f137426f)) && C46238a.m51546a(this.f137427g, liVar.f137427g) && C46238a.m51546a(this.f137428h, liVar.f137428h) && C46238a.m51546a(this.f137429i, liVar.f137429i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137424d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f137425e);
            aVar.mo74318e(3, this.f137426f);
            String str2 = this.f137427g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f137428h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f137429i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f137424d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f137425e) + C52418a.m58678e(3, this.f137426f);
            String str6 = this.f137427g;
            if (str6 != null) {
                g += C52418a.m58683j(4, str6);
            }
            String str7 = this.f137428h;
            if (str7 != null) {
                g += C52418a.m58683j(5, str7);
            }
            String str8 = this.f137429i;
            return str8 != null ? g + C52418a.m58683j(6, str8) : g;
        } else if (i == 2) {
            this.f137425e.clear();
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
            C50265li liVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    liVar.f137424d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49555gg ggVar = new C49555gg();
                        if (bArr != null && bArr.length > 0) {
                            ggVar.parseFrom(bArr);
                        }
                        liVar.f137425e.add(ggVar);
                    }
                    return 0;
                case 3:
                    liVar.f137426f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    liVar.f137427g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    liVar.f137428h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    liVar.f137429i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
