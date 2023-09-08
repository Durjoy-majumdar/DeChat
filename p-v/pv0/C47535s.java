package pv0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.s */
public class C47535s extends C47465a {

    /* renamed from: d */
    public String f127532d;

    /* renamed from: e */
    public int f127533e;

    /* renamed from: f */
    public int f127534f;

    /* renamed from: g */
    public int f127535g;

    /* renamed from: h */
    public long f127536h;

    /* renamed from: i */
    public long f127537i;

    /* renamed from: j */
    public long f127538j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47535s)) {
            return false;
        }
        C47535s sVar = (C47535s) aVar;
        return C46238a.m51546a(this.f127532d, sVar.f127532d) && C46238a.m51546a(Integer.valueOf(this.f127533e), Integer.valueOf(sVar.f127533e)) && C46238a.m51546a(Integer.valueOf(this.f127534f), Integer.valueOf(sVar.f127534f)) && C46238a.m51546a(Integer.valueOf(this.f127535g), Integer.valueOf(sVar.f127535g)) && C46238a.m51546a(Long.valueOf(this.f127536h), Long.valueOf(sVar.f127536h)) && C46238a.m51546a(Long.valueOf(this.f127537i), Long.valueOf(sVar.f127537i)) && C46238a.m51546a(Long.valueOf(this.f127538j), Long.valueOf(sVar.f127538j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127532d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f127533e);
                aVar.mo74318e(3, this.f127534f);
                aVar.mo74318e(4, this.f127535g);
                aVar.mo74321h(5, this.f127536h);
                aVar.mo74321h(6, this.f127537i);
                aVar.mo74321h(7, this.f127538j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i == 1) {
            String str2 = this.f127532d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f127533e) + C52418a.m58678e(3, this.f127534f) + C52418a.m58678e(4, this.f127535g) + C52418a.m58681h(5, this.f127536h) + C52418a.m58681h(6, this.f127537i) + C52418a.m58681h(7, this.f127538j);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127532d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47535s sVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    sVar.f127532d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    sVar.f127533e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    sVar.f127534f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    sVar.f127535g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    sVar.f127536h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    sVar.f127537i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    sVar.f127538j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
