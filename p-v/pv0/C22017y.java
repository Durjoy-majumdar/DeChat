package pv0;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.y */
public class C22017y extends C47465a {

    /* renamed from: d */
    public int f62308d;

    /* renamed from: e */
    public String f62309e;

    /* renamed from: f */
    public C89349b f62310f;

    /* renamed from: g */
    public int f62311g;

    /* renamed from: h */
    public int f62312h;

    /* renamed from: i */
    public int f62313i;

    /* renamed from: j */
    public int f62314j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22017y)) {
            return false;
        }
        C22017y yVar = (C22017y) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f62308d), Integer.valueOf(yVar.f62308d)) && C46238a.m51546a(this.f62309e, yVar.f62309e) && C46238a.m51546a(this.f62310f, yVar.f62310f) && C46238a.m51546a(Integer.valueOf(this.f62311g), Integer.valueOf(yVar.f62311g)) && C46238a.m51546a(Integer.valueOf(this.f62312h), Integer.valueOf(yVar.f62312h)) && C46238a.m51546a(Integer.valueOf(this.f62313i), Integer.valueOf(yVar.f62313i)) && C46238a.m51546a(Integer.valueOf(this.f62314j), Integer.valueOf(yVar.f62314j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f62309e != null) {
                aVar.mo74318e(1, this.f62308d);
                String str = this.f62309e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C89349b bVar = this.f62310f;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                aVar.mo74318e(4, this.f62311g);
                aVar.mo74318e(5, this.f62312h);
                aVar.mo74318e(6, this.f62313i);
                aVar.mo74318e(7, this.f62314j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f62308d) + 0;
            String str2 = this.f62309e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            C89349b bVar2 = this.f62310f;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            return e + C52418a.m58678e(4, this.f62311g) + C52418a.m58678e(5, this.f62312h) + C52418a.m58678e(6, this.f62313i) + C52418a.m58678e(7, this.f62314j);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f62309e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C22017y yVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yVar.f62308d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    yVar.f62309e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    yVar.f62310f = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    yVar.f62311g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    yVar.f62312h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    yVar.f62313i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    yVar.f62314j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
