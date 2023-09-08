package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.f0 */
public class C65681f0 extends C47465a {

    /* renamed from: d */
    public C65679e0 f188985d;

    /* renamed from: e */
    public String f188986e;

    /* renamed from: f */
    public LinkedList<String> f188987f = new LinkedList<>();

    /* renamed from: g */
    public String f188988g;

    /* renamed from: h */
    public String f188989h;

    /* renamed from: i */
    public long f188990i;

    /* renamed from: j */
    public C52831g0 f188991j;

    /* renamed from: n */
    public int f188992n;

    /* renamed from: o */
    public long f188993o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C65681f0)) {
            return false;
        }
        C65681f0 f0Var = (C65681f0) aVar;
        return C46238a.m51546a(this.f188985d, f0Var.f188985d) && C46238a.m51546a(this.f188986e, f0Var.f188986e) && C46238a.m51546a(this.f188987f, f0Var.f188987f) && C46238a.m51546a(this.f188988g, f0Var.f188988g) && C46238a.m51546a(this.f188989h, f0Var.f188989h) && C46238a.m51546a(Long.valueOf(this.f188990i), Long.valueOf(f0Var.f188990i)) && C46238a.m51546a(this.f188991j, f0Var.f188991j) && C46238a.m51546a(Integer.valueOf(this.f188992n), Integer.valueOf(f0Var.f188992n)) && C46238a.m51546a(Long.valueOf(this.f188993o), Long.valueOf(f0Var.f188993o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C65679e0 e0Var = this.f188985d;
            if (e0Var != null) {
                aVar.mo74322i(1, e0Var.computeSize());
                this.f188985d.writeFields(aVar);
            }
            String str = this.f188986e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f188987f);
            String str2 = this.f188988g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f188989h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74321h(6, this.f188990i);
            C52831g0 g0Var = this.f188991j;
            if (g0Var != null) {
                aVar.mo74322i(7, g0Var.computeSize());
                this.f188991j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f188992n);
            aVar.mo74321h(9, this.f188993o);
            return 0;
        } else if (i == 1) {
            C65679e0 e0Var2 = this.f188985d;
            if (e0Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, e0Var2.computeSize());
            }
            String str4 = this.f188986e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f188987f);
            String str5 = this.f188988g;
            if (str5 != null) {
                g += C52418a.m58683j(4, str5);
            }
            String str6 = this.f188989h;
            if (str6 != null) {
                g += C52418a.m58683j(5, str6);
            }
            int h = g + C52418a.m58681h(6, this.f188990i);
            C52831g0 g0Var2 = this.f188991j;
            if (g0Var2 != null) {
                h += C52418a.m58682i(7, g0Var2.computeSize());
            }
            return h + C52418a.m58678e(8, this.f188992n) + C52418a.m58681h(9, this.f188993o);
        } else if (i == 2) {
            this.f188987f.clear();
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
            C65681f0 f0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C65679e0 e0Var3 = new C65679e0();
                        if (bArr != null && bArr.length > 0) {
                            e0Var3.parseFrom(bArr);
                        }
                        f0Var.f188985d = e0Var3;
                    }
                    return 0;
                case 2:
                    f0Var.f188986e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    f0Var.f188987f.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    f0Var.f188988g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    f0Var.f188989h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    f0Var.f188990i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52831g0 g0Var3 = new C52831g0();
                        if (bArr2 != null && bArr2.length > 0) {
                            g0Var3.parseFrom(bArr2);
                        }
                        f0Var.f188991j = g0Var3;
                    }
                    return 0;
                case 8:
                    f0Var.f188992n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    f0Var.f188993o = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
