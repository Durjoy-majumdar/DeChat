package z72;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: z72.b */
public class C53756b extends C47465a {

    /* renamed from: d */
    public int f150891d;

    /* renamed from: e */
    public int f150892e;

    /* renamed from: f */
    public int f150893f;

    /* renamed from: g */
    public long f150894g;

    /* renamed from: h */
    public long f150895h;

    /* renamed from: i */
    public double f150896i;

    /* renamed from: j */
    public String f150897j;

    /* renamed from: n */
    public C89349b f150898n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53756b)) {
            return false;
        }
        C53756b bVar = (C53756b) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f150891d), Integer.valueOf(bVar.f150891d)) && C46238a.m51546a(Integer.valueOf(this.f150892e), Integer.valueOf(bVar.f150892e)) && C46238a.m51546a(Integer.valueOf(this.f150893f), Integer.valueOf(bVar.f150893f)) && C46238a.m51546a(Long.valueOf(this.f150894g), Long.valueOf(bVar.f150894g)) && C46238a.m51546a(Long.valueOf(this.f150895h), Long.valueOf(bVar.f150895h)) && C46238a.m51546a(Double.valueOf(this.f150896i), Double.valueOf(bVar.f150896i)) && C46238a.m51546a(this.f150897j, bVar.f150897j) && C46238a.m51546a(this.f150898n, bVar.f150898n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f150891d);
            aVar.mo74318e(2, this.f150892e);
            aVar.mo74318e(3, this.f150893f);
            aVar.mo74321h(4, this.f150894g);
            aVar.mo74321h(5, this.f150895h);
            aVar.mo74316c(6, this.f150896i);
            String str = this.f150897j;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            C89349b bVar = this.f150898n;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f150891d) + 0 + C52418a.m58678e(2, this.f150892e) + C52418a.m58678e(3, this.f150893f) + C52418a.m58681h(4, this.f150894g) + C52418a.m58681h(5, this.f150895h) + C52418a.m58676c(6, this.f150896i);
            String str2 = this.f150897j;
            if (str2 != null) {
                e += C52418a.m58683j(7, str2);
            }
            C89349b bVar2 = this.f150898n;
            return bVar2 != null ? e + C52418a.m58675b(8, bVar2) : e;
        } else if (i == 2) {
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
            C53756b bVar3 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bVar3.f150891d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    bVar3.f150892e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    bVar3.f150893f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    bVar3.f150894g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    bVar3.f150895h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    bVar3.f150896i = aVar3.mo141627e(intValue);
                    return 0;
                case 7:
                    bVar3.f150897j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    bVar3.f150898n = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
