package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sa */
public class C101840sa extends C47465a {

    /* renamed from: d */
    public int f299391d;

    /* renamed from: e */
    public int f299392e;

    /* renamed from: f */
    public LinkedList<String> f299393f = new LinkedList<>();

    /* renamed from: g */
    public int f299394g = 0;

    /* renamed from: h */
    public C89349b f299395h;

    /* renamed from: i */
    public C89349b f299396i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101840sa)) {
            return false;
        }
        C101840sa saVar = (C101840sa) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299391d), Integer.valueOf(saVar.f299391d)) && C46238a.m51546a(Integer.valueOf(this.f299392e), Integer.valueOf(saVar.f299392e)) && C46238a.m51546a(this.f299393f, saVar.f299393f) && C46238a.m51546a(Integer.valueOf(this.f299394g), Integer.valueOf(saVar.f299394g)) && C46238a.m51546a(this.f299395h, saVar.f299395h) && C46238a.m51546a(this.f299396i, saVar.f299396i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f299391d);
            aVar.mo74318e(2, this.f299392e);
            aVar.mo74320g(3, 1, this.f299393f);
            aVar.mo74318e(4, this.f299394g);
            C89349b bVar = this.f299395h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            C89349b bVar2 = this.f299396i;
            if (bVar2 != null) {
                aVar.mo74315b(6, bVar2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f299391d) + 0 + C52418a.m58678e(2, this.f299392e) + C52418a.m58680g(3, 1, this.f299393f) + C52418a.m58678e(4, this.f299394g);
            C89349b bVar3 = this.f299395h;
            if (bVar3 != null) {
                e += C52418a.m58675b(5, bVar3);
            }
            C89349b bVar4 = this.f299396i;
            return bVar4 != null ? e + C52418a.m58675b(6, bVar4) : e;
        } else if (i == 2) {
            this.f299393f.clear();
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
            C101840sa saVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    saVar.f299391d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    saVar.f299392e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    saVar.f299393f.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    saVar.f299394g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    saVar.f299395h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    saVar.f299396i = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
