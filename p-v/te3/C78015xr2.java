package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xr2 */
public class C78015xr2 extends C47465a {

    /* renamed from: d */
    public String f228535d;

    /* renamed from: e */
    public LinkedList<C77909bp> f228536e = new LinkedList<>();

    /* renamed from: f */
    public boolean f228537f;

    /* renamed from: g */
    public C77938h9 f228538g;

    /* renamed from: h */
    public String f228539h;

    /* renamed from: i */
    public boolean f228540i;

    /* renamed from: j */
    public int f228541j;

    /* renamed from: n */
    public String f228542n;

    /* renamed from: o */
    public int f228543o;

    /* renamed from: p */
    public ug4 f228544p;

    /* renamed from: q */
    public C51892wy f228545q;

    /* renamed from: r */
    public String f228546r;

    /* renamed from: s */
    public String f228547s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78015xr2)) {
            return false;
        }
        C78015xr2 xr22 = (C78015xr2) aVar;
        return C46238a.m51546a(this.f228535d, xr22.f228535d) && C46238a.m51546a(this.f228536e, xr22.f228536e) && C46238a.m51546a(Boolean.valueOf(this.f228537f), Boolean.valueOf(xr22.f228537f)) && C46238a.m51546a(this.f228538g, xr22.f228538g) && C46238a.m51546a(this.f228539h, xr22.f228539h) && C46238a.m51546a(Boolean.valueOf(this.f228540i), Boolean.valueOf(xr22.f228540i)) && C46238a.m51546a(Integer.valueOf(this.f228541j), Integer.valueOf(xr22.f228541j)) && C46238a.m51546a(this.f228542n, xr22.f228542n) && C46238a.m51546a(Integer.valueOf(this.f228543o), Integer.valueOf(xr22.f228543o)) && C46238a.m51546a(this.f228544p, xr22.f228544p) && C46238a.m51546a(this.f228545q, xr22.f228545q) && C46238a.m51546a(this.f228546r, xr22.f228546r) && C46238a.m51546a(this.f228547s, xr22.f228547s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f228535d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f228536e);
            aVar.mo74314a(3, this.f228537f);
            C77938h9 h9Var = this.f228538g;
            if (h9Var != null) {
                aVar.mo74322i(4, h9Var.computeSize());
                this.f228538g.writeFields(aVar);
            }
            String str2 = this.f228539h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74314a(6, this.f228540i);
            aVar.mo74318e(7, this.f228541j);
            String str3 = this.f228542n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            aVar.mo74318e(9, this.f228543o);
            ug4 ug4 = this.f228544p;
            if (ug4 != null) {
                aVar.mo74322i(10, ug4.computeSize());
                this.f228544p.writeFields(aVar);
            }
            C51892wy wyVar = this.f228545q;
            if (wyVar != null) {
                aVar.mo74322i(11, wyVar.computeSize());
                this.f228545q.writeFields(aVar);
            }
            String str4 = this.f228546r;
            if (str4 != null) {
                aVar.mo74323j(12, str4);
            }
            String str5 = this.f228547s;
            if (str5 == null) {
                return 0;
            }
            aVar.mo74323j(13, str5);
            return 0;
        } else if (i2 == 1) {
            String str6 = this.f228535d;
            int j = (str6 != null ? 0 + C52418a.m58683j(1, str6) : 0) + C52418a.m58680g(2, 8, this.f228536e) + C52418a.m58674a(3, this.f228537f);
            C77938h9 h9Var2 = this.f228538g;
            if (h9Var2 != null) {
                j += C52418a.m58682i(4, h9Var2.computeSize());
            }
            String str7 = this.f228539h;
            if (str7 != null) {
                j += C52418a.m58683j(5, str7);
            }
            int a = j + C52418a.m58674a(6, this.f228540i) + C52418a.m58678e(7, this.f228541j);
            String str8 = this.f228542n;
            if (str8 != null) {
                a += C52418a.m58683j(8, str8);
            }
            int e = a + C52418a.m58678e(9, this.f228543o);
            ug4 ug42 = this.f228544p;
            if (ug42 != null) {
                e += C52418a.m58682i(10, ug42.computeSize());
            }
            C51892wy wyVar2 = this.f228545q;
            if (wyVar2 != null) {
                e += C52418a.m58682i(11, wyVar2.computeSize());
            }
            String str9 = this.f228546r;
            if (str9 != null) {
                e += C52418a.m58683j(12, str9);
            }
            String str10 = this.f228547s;
            return str10 != null ? e + C52418a.m58683j(13, str10) : e;
        } else if (i2 == 2) {
            this.f228536e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C78015xr2 xr22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xr22.f228535d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C77909bp bpVar = new C77909bp();
                        if (bArr != null && bArr.length > 0) {
                            bpVar.parseFrom(bArr);
                        }
                        xr22.f228536e.add(bpVar);
                    }
                    return 0;
                case 3:
                    xr22.f228537f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size2 = j3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j3.get(i4);
                        C77938h9 h9Var3 = new C77938h9();
                        if (bArr2 != null && bArr2.length > 0) {
                            h9Var3.parseFrom(bArr2);
                        }
                        xr22.f228538g = h9Var3;
                    }
                    return 0;
                case 5:
                    xr22.f228539h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    xr22.f228540i = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    xr22.f228541j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    xr22.f228542n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    xr22.f228543o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size3 = j4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j4.get(i5);
                        ug4 ug43 = new ug4();
                        if (bArr3 != null && bArr3.length > 0) {
                            ug43.parseFrom(bArr3);
                        }
                        xr22.f228544p = ug43;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size4 = j5.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j5.get(i6);
                        C51892wy wyVar3 = new C51892wy();
                        if (bArr4 != null && bArr4.length > 0) {
                            wyVar3.parseFrom(bArr4);
                        }
                        xr22.f228545q = wyVar3;
                    }
                    return 0;
                case 12:
                    xr22.f228546r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    xr22.f228547s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
