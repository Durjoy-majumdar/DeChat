package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mj */
public class C50409mj extends C47465a {

    /* renamed from: d */
    public long f138058d;

    /* renamed from: e */
    public long f138059e;

    /* renamed from: f */
    public String f138060f;

    /* renamed from: g */
    public long f138061g;

    /* renamed from: h */
    public int f138062h;

    /* renamed from: i */
    public long f138063i;

    /* renamed from: j */
    public int f138064j;

    /* renamed from: n */
    public int f138065n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50409mj)) {
            return false;
        }
        C50409mj mjVar = (C50409mj) aVar;
        return C46238a.m51546a(Long.valueOf(this.f138058d), Long.valueOf(mjVar.f138058d)) && C46238a.m51546a(Long.valueOf(this.f138059e), Long.valueOf(mjVar.f138059e)) && C46238a.m51546a(this.f138060f, mjVar.f138060f) && C46238a.m51546a(Long.valueOf(this.f138061g), Long.valueOf(mjVar.f138061g)) && C46238a.m51546a(Integer.valueOf(this.f138062h), Integer.valueOf(mjVar.f138062h)) && C46238a.m51546a(Long.valueOf(this.f138063i), Long.valueOf(mjVar.f138063i)) && C46238a.m51546a(Integer.valueOf(this.f138064j), Integer.valueOf(mjVar.f138064j)) && C46238a.m51546a(Integer.valueOf(this.f138065n), Integer.valueOf(mjVar.f138065n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f138058d);
            aVar.mo74321h(2, this.f138059e);
            String str = this.f138060f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f138061g);
            aVar.mo74318e(5, this.f138062h);
            aVar.mo74321h(6, this.f138063i);
            aVar.mo74318e(7, this.f138064j);
            aVar.mo74318e(8, this.f138065n);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f138058d) + 0 + C52418a.m58681h(2, this.f138059e);
            String str2 = this.f138060f;
            if (str2 != null) {
                h += C52418a.m58683j(3, str2);
            }
            return h + C52418a.m58681h(4, this.f138061g) + C52418a.m58678e(5, this.f138062h) + C52418a.m58681h(6, this.f138063i) + C52418a.m58678e(7, this.f138064j) + C52418a.m58678e(8, this.f138065n);
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
            C50409mj mjVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mjVar.f138058d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    mjVar.f138059e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    mjVar.f138060f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mjVar.f138061g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    mjVar.f138062h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    mjVar.f138063i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    mjVar.f138064j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    mjVar.f138065n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
