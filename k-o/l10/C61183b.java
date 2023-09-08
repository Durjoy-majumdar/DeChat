package l10;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: l10.b */
public class C61183b extends C47465a {

    /* renamed from: d */
    public long f174165d;

    /* renamed from: e */
    public long f174166e;

    /* renamed from: f */
    public String f174167f;

    /* renamed from: g */
    public int f174168g;

    /* renamed from: h */
    public String f174169h;

    /* renamed from: i */
    public LinkedList<C61184c> f174170i = new LinkedList<>();

    /* renamed from: j */
    public String f174171j;

    /* renamed from: n */
    public String f174172n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C61183b)) {
            return false;
        }
        C61183b bVar = (C61183b) aVar;
        return C46238a.m51546a(Long.valueOf(this.f174165d), Long.valueOf(bVar.f174165d)) && C46238a.m51546a(Long.valueOf(this.f174166e), Long.valueOf(bVar.f174166e)) && C46238a.m51546a(this.f174167f, bVar.f174167f) && C46238a.m51546a(Integer.valueOf(this.f174168g), Integer.valueOf(bVar.f174168g)) && C46238a.m51546a(this.f174169h, bVar.f174169h) && C46238a.m51546a(this.f174170i, bVar.f174170i) && C46238a.m51546a(this.f174171j, bVar.f174171j) && C46238a.m51546a(this.f174172n, bVar.f174172n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f174167f != null) {
                aVar.mo74321h(1, this.f174165d);
                aVar.mo74321h(2, this.f174166e);
                String str = this.f174167f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f174168g);
                String str2 = this.f174169h;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74320g(6, 8, this.f174170i);
                String str3 = this.f174171j;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                String str4 = this.f174172n;
                if (str4 != null) {
                    aVar.mo74323j(8, str4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: nonceId");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f174165d) + 0 + C52418a.m58681h(2, this.f174166e);
            String str5 = this.f174167f;
            if (str5 != null) {
                h += C52418a.m58683j(3, str5);
            }
            int e = h + C52418a.m58678e(4, this.f174168g);
            String str6 = this.f174169h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            int g = e + C52418a.m58680g(6, 8, this.f174170i);
            String str7 = this.f174171j;
            if (str7 != null) {
                g += C52418a.m58683j(7, str7);
            }
            String str8 = this.f174172n;
            return str8 != null ? g + C52418a.m58683j(8, str8) : g;
        } else if (i == 2) {
            this.f174170i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f174167f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: nonceId");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C61183b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bVar.f174165d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    bVar.f174166e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    bVar.f174167f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bVar.f174168g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bVar.f174169h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C61184c cVar = new C61184c();
                        if (bArr != null && bArr.length > 0) {
                            cVar.parseFrom(bArr);
                        }
                        bVar.f174170i.add(cVar);
                    }
                    return 0;
                case 7:
                    bVar.f174171j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    bVar.f174172n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
