package y43;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: y43.n */
public class C79034n extends C47465a {

    /* renamed from: d */
    public String f232085d;

    /* renamed from: e */
    public double f232086e;

    /* renamed from: f */
    public double f232087f;

    /* renamed from: g */
    public LinkedList<C79032f> f232088g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C79030d0> f232089h = new LinkedList<>();

    /* renamed from: i */
    public double f232090i;

    /* renamed from: j */
    public double f232091j;

    /* renamed from: n */
    public int f232092n;

    /* renamed from: o */
    public String f232093o;

    /* renamed from: p */
    public String f232094p;

    /* renamed from: q */
    public C89349b f232095q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C79034n)) {
            return false;
        }
        C79034n nVar = (C79034n) aVar;
        return C46238a.m51546a(this.f232085d, nVar.f232085d) && C46238a.m51546a(Double.valueOf(this.f232086e), Double.valueOf(nVar.f232086e)) && C46238a.m51546a(Double.valueOf(this.f232087f), Double.valueOf(nVar.f232087f)) && C46238a.m51546a(this.f232088g, nVar.f232088g) && C46238a.m51546a(this.f232089h, nVar.f232089h) && C46238a.m51546a(Double.valueOf(this.f232090i), Double.valueOf(nVar.f232090i)) && C46238a.m51546a(Double.valueOf(this.f232091j), Double.valueOf(nVar.f232091j)) && C46238a.m51546a(Integer.valueOf(this.f232092n), Integer.valueOf(nVar.f232092n)) && C46238a.m51546a(this.f232093o, nVar.f232093o) && C46238a.m51546a(this.f232094p, nVar.f232094p) && C46238a.m51546a(this.f232095q, nVar.f232095q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f232085d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74316c(2, this.f232086e);
            aVar.mo74316c(3, this.f232087f);
            aVar.mo74320g(4, 8, this.f232088g);
            aVar.mo74320g(5, 8, this.f232089h);
            aVar.mo74316c(6, this.f232090i);
            aVar.mo74316c(7, this.f232091j);
            aVar.mo74318e(8, this.f232092n);
            String str2 = this.f232093o;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            String str3 = this.f232094p;
            if (str3 != null) {
                aVar.mo74323j(10, str3);
            }
            C89349b bVar = this.f232095q;
            if (bVar != null) {
                aVar.mo74315b(11, bVar);
            }
            return 0;
        } else if (i2 == 1) {
            String str4 = this.f232085d;
            if (str4 != null) {
                i3 = 0 + C52418a.m58683j(1, str4);
            }
            int c = i3 + C52418a.m58676c(2, this.f232086e) + C52418a.m58676c(3, this.f232087f) + C52418a.m58680g(4, 8, this.f232088g) + C52418a.m58680g(5, 8, this.f232089h) + C52418a.m58676c(6, this.f232090i) + C52418a.m58676c(7, this.f232091j) + C52418a.m58678e(8, this.f232092n);
            String str5 = this.f232093o;
            if (str5 != null) {
                c += C52418a.m58683j(9, str5);
            }
            String str6 = this.f232094p;
            if (str6 != null) {
                c += C52418a.m58683j(10, str6);
            }
            C89349b bVar2 = this.f232095q;
            return bVar2 != null ? c + C52418a.m58675b(11, bVar2) : c;
        } else if (i2 == 2) {
            this.f232088g.clear();
            this.f232089h.clear();
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
            C79034n nVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    nVar.f232085d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    nVar.f232086e = aVar3.mo141627e(intValue);
                    return 0;
                case 3:
                    nVar.f232087f = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C79032f fVar = new C79032f();
                        if (bArr != null && bArr.length > 0) {
                            fVar.parseFrom(bArr);
                        }
                        nVar.f232088g.add(fVar);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C79030d0 d0Var = new C79030d0();
                        if (bArr2 != null && bArr2.length > 0) {
                            d0Var.parseFrom(bArr2);
                        }
                        nVar.f232089h.add(d0Var);
                    }
                    return 0;
                case 6:
                    nVar.f232090i = aVar3.mo141627e(intValue);
                    return 0;
                case 7:
                    nVar.f232091j = aVar3.mo141627e(intValue);
                    return 0;
                case 8:
                    nVar.f232092n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    nVar.f232093o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    nVar.f232094p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    nVar.f232095q = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
