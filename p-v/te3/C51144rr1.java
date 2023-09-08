package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rr1 */
public class C51144rr1 extends C47465a {

    /* renamed from: d */
    public String f141087d;

    /* renamed from: e */
    public int f141088e;

    /* renamed from: f */
    public LinkedList<C50300lr1> f141089f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C51434tr1> f141090g = new LinkedList<>();

    /* renamed from: h */
    public String f141091h;

    /* renamed from: i */
    public String f141092i;

    /* renamed from: j */
    public LinkedList<C51287sr1> f141093j = new LinkedList<>();

    /* renamed from: n */
    public int f141094n;

    /* renamed from: o */
    public boolean f141095o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51144rr1)) {
            return false;
        }
        C51144rr1 rr12 = (C51144rr1) aVar;
        return C46238a.m51546a(this.f141087d, rr12.f141087d) && C46238a.m51546a(Integer.valueOf(this.f141088e), Integer.valueOf(rr12.f141088e)) && C46238a.m51546a(this.f141089f, rr12.f141089f) && C46238a.m51546a(this.f141090g, rr12.f141090g) && C46238a.m51546a(this.f141091h, rr12.f141091h) && C46238a.m51546a(this.f141092i, rr12.f141092i) && C46238a.m51546a(this.f141093j, rr12.f141093j) && C46238a.m51546a(Integer.valueOf(this.f141094n), Integer.valueOf(rr12.f141094n)) && C46238a.m51546a(Boolean.valueOf(this.f141095o), Boolean.valueOf(rr12.f141095o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141087d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f141088e);
            aVar.mo74320g(3, 8, this.f141089f);
            aVar.mo74320g(4, 8, this.f141090g);
            String str2 = this.f141091h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f141092i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74320g(7, 8, this.f141093j);
            aVar.mo74318e(8, this.f141094n);
            aVar.mo74314a(9, this.f141095o);
            return 0;
        } else if (i == 1) {
            String str4 = this.f141087d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f141088e) + C52418a.m58680g(3, 8, this.f141089f) + C52418a.m58680g(4, 8, this.f141090g);
            String str5 = this.f141091h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f141092i;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            return e + C52418a.m58680g(7, 8, this.f141093j) + C52418a.m58678e(8, this.f141094n) + C52418a.m58674a(9, this.f141095o);
        } else if (i == 2) {
            this.f141089f.clear();
            this.f141090g.clear();
            this.f141093j.clear();
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
            C51144rr1 rr12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rr12.f141087d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rr12.f141088e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C50300lr1 lr12 = new C50300lr1();
                        if (bArr != null && bArr.length > 0) {
                            lr12.parseFrom(bArr);
                        }
                        rr12.f141089f.add(lr12);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51434tr1 tr12 = new C51434tr1();
                        if (bArr2 != null && bArr2.length > 0) {
                            tr12.parseFrom(bArr2);
                        }
                        rr12.f141090g.add(tr12);
                    }
                    return 0;
                case 5:
                    rr12.f141091h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rr12.f141092i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51287sr1 sr12 = new C51287sr1();
                        if (bArr3 != null && bArr3.length > 0) {
                            sr12.parseFrom(bArr3);
                        }
                        rr12.f141093j.add(sr12);
                    }
                    return 0;
                case 8:
                    rr12.f141094n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    rr12.f141095o = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
