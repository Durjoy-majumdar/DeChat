package ag2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.k */
public class C67037k extends C47465a {

    /* renamed from: d */
    public int f192565d;

    /* renamed from: e */
    public String f192566e;

    /* renamed from: f */
    public LinkedList<C67038p> f192567f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C67038p> f192568g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C67038p> f192569h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<C67039p0> f192570i = new LinkedList<>();

    /* renamed from: j */
    public String f192571j;

    /* renamed from: n */
    public String f192572n;

    /* renamed from: o */
    public int f192573o = 20;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C67037k)) {
            return false;
        }
        C67037k kVar = (C67037k) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f192565d), Integer.valueOf(kVar.f192565d)) && C46238a.m51546a(this.f192566e, kVar.f192566e) && C46238a.m51546a(this.f192567f, kVar.f192567f) && C46238a.m51546a(this.f192568g, kVar.f192568g) && C46238a.m51546a(this.f192569h, kVar.f192569h) && C46238a.m51546a(this.f192570i, kVar.f192570i) && C46238a.m51546a(this.f192571j, kVar.f192571j) && C46238a.m51546a(this.f192572n, kVar.f192572n) && C46238a.m51546a(Integer.valueOf(this.f192573o), Integer.valueOf(kVar.f192573o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f192572n != null) {
                aVar.mo74318e(1, this.f192565d);
                String str = this.f192566e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74320g(3, 8, this.f192567f);
                aVar.mo74320g(4, 8, this.f192568g);
                aVar.mo74320g(5, 8, this.f192569h);
                aVar.mo74320g(6, 8, this.f192570i);
                String str2 = this.f192571j;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                String str3 = this.f192572n;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                aVar.mo74318e(9, this.f192573o);
                return 0;
            }
            throw new C52419b("Not all required fields were included: content");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f192565d) + 0;
            String str4 = this.f192566e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            int g = e + C52418a.m58680g(3, 8, this.f192567f) + C52418a.m58680g(4, 8, this.f192568g) + C52418a.m58680g(5, 8, this.f192569h) + C52418a.m58680g(6, 8, this.f192570i);
            String str5 = this.f192571j;
            if (str5 != null) {
                g += C52418a.m58683j(7, str5);
            }
            String str6 = this.f192572n;
            if (str6 != null) {
                g += C52418a.m58683j(8, str6);
            }
            return g + C52418a.m58678e(9, this.f192573o);
        } else if (i == 2) {
            this.f192567f.clear();
            this.f192568g.clear();
            this.f192569h.clear();
            this.f192570i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f192572n != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: content");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C67037k kVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kVar.f192565d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    kVar.f192566e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C67038p pVar = new C67038p();
                        if (bArr != null && bArr.length > 0) {
                            pVar.parseFrom(bArr);
                        }
                        kVar.f192567f.add(pVar);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C67038p pVar2 = new C67038p();
                        if (bArr2 != null && bArr2.length > 0) {
                            pVar2.parseFrom(bArr2);
                        }
                        kVar.f192568g.add(pVar2);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C67038p pVar3 = new C67038p();
                        if (bArr3 != null && bArr3.length > 0) {
                            pVar3.parseFrom(bArr3);
                        }
                        kVar.f192569h.add(pVar3);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C67039p0 p0Var = new C67039p0();
                        if (bArr4 != null && bArr4.length > 0) {
                            p0Var.parseFrom(bArr4);
                        }
                        kVar.f192570i.add(p0Var);
                    }
                    return 0;
                case 7:
                    kVar.f192571j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    kVar.f192572n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    kVar.f192573o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
