package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u71 */
public class C51503u71 extends C47465a {

    /* renamed from: d */
    public boolean f142641d;

    /* renamed from: e */
    public long f142642e;

    /* renamed from: f */
    public long f142643f;

    /* renamed from: g */
    public String f142644g;

    /* renamed from: h */
    public String f142645h;

    /* renamed from: i */
    public LinkedList<C51428tp2> f142646i = new LinkedList<>();

    /* renamed from: j */
    public String f142647j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51503u71)) {
            return false;
        }
        C51503u71 u712 = (C51503u71) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f142641d), Boolean.valueOf(u712.f142641d)) && C46238a.m51546a(Long.valueOf(this.f142642e), Long.valueOf(u712.f142642e)) && C46238a.m51546a(Long.valueOf(this.f142643f), Long.valueOf(u712.f142643f)) && C46238a.m51546a(this.f142644g, u712.f142644g) && C46238a.m51546a(this.f142645h, u712.f142645h) && C46238a.m51546a(this.f142646i, u712.f142646i) && C46238a.m51546a(this.f142647j, u712.f142647j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f142641d);
            aVar.mo74321h(2, this.f142642e);
            aVar.mo74321h(3, this.f142643f);
            String str = this.f142644g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f142645h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74320g(6, 8, this.f142646i);
            String str3 = this.f142647j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f142641d) + 0 + C52418a.m58681h(2, this.f142642e) + C52418a.m58681h(3, this.f142643f);
            String str4 = this.f142644g;
            if (str4 != null) {
                a += C52418a.m58683j(4, str4);
            }
            String str5 = this.f142645h;
            if (str5 != null) {
                a += C52418a.m58683j(5, str5);
            }
            int g = a + C52418a.m58680g(6, 8, this.f142646i);
            String str6 = this.f142647j;
            return str6 != null ? g + C52418a.m58683j(7, str6) : g;
        } else if (i == 2) {
            this.f142646i.clear();
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
            C51503u71 u712 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    u712.f142641d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    u712.f142642e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    u712.f142643f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    u712.f142644g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    u712.f142645h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51428tp2 tp22 = new C51428tp2();
                        if (bArr != null && bArr.length > 0) {
                            tp22.parseFrom(bArr);
                        }
                        u712.f142646i.add(tp22);
                    }
                    return 0;
                case 7:
                    u712.f142647j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
