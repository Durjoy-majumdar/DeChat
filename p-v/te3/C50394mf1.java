package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mf1 */
public class C50394mf1 extends C47465a {

    /* renamed from: d */
    public long f137997d;

    /* renamed from: e */
    public String f137998e;

    /* renamed from: f */
    public int f137999f;

    /* renamed from: g */
    public int f138000g;

    /* renamed from: h */
    public C89349b f138001h;

    /* renamed from: i */
    public int f138002i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50394mf1)) {
            return false;
        }
        C50394mf1 mf12 = (C50394mf1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f137997d), Long.valueOf(mf12.f137997d)) && C46238a.m51546a(this.f137998e, mf12.f137998e) && C46238a.m51546a(Integer.valueOf(this.f137999f), Integer.valueOf(mf12.f137999f)) && C46238a.m51546a(Integer.valueOf(this.f138000g), Integer.valueOf(mf12.f138000g)) && C46238a.m51546a(this.f138001h, mf12.f138001h) && C46238a.m51546a(Integer.valueOf(this.f138002i), Integer.valueOf(mf12.f138002i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f137997d);
            String str = this.f137998e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f137999f);
            aVar.mo74318e(4, this.f138000g);
            C89349b bVar = this.f138001h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74318e(6, this.f138002i);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f137997d) + 0;
            String str2 = this.f137998e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            int e = h + C52418a.m58678e(3, this.f137999f) + C52418a.m58678e(4, this.f138000g);
            C89349b bVar2 = this.f138001h;
            if (bVar2 != null) {
                e += C52418a.m58675b(5, bVar2);
            }
            return e + C52418a.m58678e(6, this.f138002i);
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
            C50394mf1 mf12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mf12.f137997d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    mf12.f137998e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    mf12.f137999f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    mf12.f138000g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    mf12.f138001h = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    mf12.f138002i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
