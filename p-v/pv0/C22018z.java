package pv0;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.z */
public class C22018z extends C47465a {

    /* renamed from: d */
    public int f62315d;

    /* renamed from: e */
    public int f62316e;

    /* renamed from: f */
    public String f62317f;

    /* renamed from: g */
    public C89349b f62318g;

    /* renamed from: h */
    public int f62319h;

    /* renamed from: i */
    public int f62320i;

    /* renamed from: j */
    public int f62321j;

    /* renamed from: n */
    public C89349b f62322n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22018z)) {
            return false;
        }
        C22018z zVar = (C22018z) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f62315d), Integer.valueOf(zVar.f62315d)) && C46238a.m51546a(Integer.valueOf(this.f62316e), Integer.valueOf(zVar.f62316e)) && C46238a.m51546a(this.f62317f, zVar.f62317f) && C46238a.m51546a(this.f62318g, zVar.f62318g) && C46238a.m51546a(Integer.valueOf(this.f62319h), Integer.valueOf(zVar.f62319h)) && C46238a.m51546a(Integer.valueOf(this.f62320i), Integer.valueOf(zVar.f62320i)) && C46238a.m51546a(Integer.valueOf(this.f62321j), Integer.valueOf(zVar.f62321j)) && C46238a.m51546a(this.f62322n, zVar.f62322n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f62317f != null) {
                aVar.mo74318e(1, this.f62315d);
                aVar.mo74318e(2, this.f62316e);
                String str = this.f62317f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C89349b bVar = this.f62318g;
                if (bVar != null) {
                    aVar.mo74315b(4, bVar);
                }
                aVar.mo74318e(5, this.f62319h);
                aVar.mo74318e(6, this.f62320i);
                aVar.mo74318e(7, this.f62321j);
                C89349b bVar2 = this.f62322n;
                if (bVar2 != null) {
                    aVar.mo74315b(8, bVar2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f62315d) + 0 + C52418a.m58678e(2, this.f62316e);
            String str2 = this.f62317f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C89349b bVar3 = this.f62318g;
            if (bVar3 != null) {
                e += C52418a.m58675b(4, bVar3);
            }
            int e2 = e + C52418a.m58678e(5, this.f62319h) + C52418a.m58678e(6, this.f62320i) + C52418a.m58678e(7, this.f62321j);
            C89349b bVar4 = this.f62322n;
            return bVar4 != null ? e2 + C52418a.m58675b(8, bVar4) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f62317f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C22018z zVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zVar.f62315d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    zVar.f62316e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    zVar.f62317f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zVar.f62318g = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    zVar.f62319h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    zVar.f62320i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    zVar.f62321j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    zVar.f62322n = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
