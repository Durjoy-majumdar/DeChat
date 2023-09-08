package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o */
public class C77970o extends C47465a {

    /* renamed from: d */
    public int f227894d;

    /* renamed from: e */
    public int f227895e;

    /* renamed from: f */
    public int f227896f;

    /* renamed from: g */
    public long f227897g;

    /* renamed from: h */
    public long f227898h;

    /* renamed from: i */
    public String f227899i;

    /* renamed from: j */
    public String f227900j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77970o)) {
            return false;
        }
        C77970o oVar = (C77970o) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f227894d), Integer.valueOf(oVar.f227894d)) && C46238a.m51546a(Integer.valueOf(this.f227895e), Integer.valueOf(oVar.f227895e)) && C46238a.m51546a(Integer.valueOf(this.f227896f), Integer.valueOf(oVar.f227896f)) && C46238a.m51546a(Long.valueOf(this.f227897g), Long.valueOf(oVar.f227897g)) && C46238a.m51546a(Long.valueOf(this.f227898h), Long.valueOf(oVar.f227898h)) && C46238a.m51546a(this.f227899i, oVar.f227899i) && C46238a.m51546a(this.f227900j, oVar.f227900j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f227894d);
            aVar.mo74318e(2, this.f227895e);
            aVar.mo74318e(3, this.f227896f);
            aVar.mo74321h(4, this.f227897g);
            aVar.mo74321h(5, this.f227898h);
            String str = this.f227899i;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f227900j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f227894d) + 0 + C52418a.m58678e(2, this.f227895e) + C52418a.m58678e(3, this.f227896f) + C52418a.m58681h(4, this.f227897g) + C52418a.m58681h(5, this.f227898h);
            String str3 = this.f227899i;
            if (str3 != null) {
                e += C52418a.m58683j(6, str3);
            }
            String str4 = this.f227900j;
            return str4 != null ? e + C52418a.m58683j(7, str4) : e;
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
            C77970o oVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oVar.f227894d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    oVar.f227895e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    oVar.f227896f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    oVar.f227897g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    oVar.f227898h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    oVar.f227899i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    oVar.f227900j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
