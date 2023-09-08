package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rz */
public class C51176rz extends C47465a {

    /* renamed from: d */
    public long f141220d;

    /* renamed from: e */
    public int f141221e;

    /* renamed from: f */
    public int f141222f;

    /* renamed from: g */
    public String f141223g;

    /* renamed from: h */
    public String f141224h;

    /* renamed from: i */
    public LinkedList<String> f141225i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51176rz)) {
            return false;
        }
        C51176rz rzVar = (C51176rz) aVar;
        return C46238a.m51546a(Long.valueOf(this.f141220d), Long.valueOf(rzVar.f141220d)) && C46238a.m51546a(Integer.valueOf(this.f141221e), Integer.valueOf(rzVar.f141221e)) && C46238a.m51546a(Integer.valueOf(this.f141222f), Integer.valueOf(rzVar.f141222f)) && C46238a.m51546a(this.f141223g, rzVar.f141223g) && C46238a.m51546a(this.f141224h, rzVar.f141224h) && C46238a.m51546a(this.f141225i, rzVar.f141225i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f141220d);
            aVar.mo74318e(2, this.f141221e);
            aVar.mo74318e(3, this.f141222f);
            String str = this.f141223g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f141224h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74320g(6, 1, this.f141225i);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f141220d) + 0 + C52418a.m58678e(2, this.f141221e) + C52418a.m58678e(3, this.f141222f);
            String str3 = this.f141223g;
            if (str3 != null) {
                h += C52418a.m58683j(4, str3);
            }
            String str4 = this.f141224h;
            if (str4 != null) {
                h += C52418a.m58683j(5, str4);
            }
            return h + C52418a.m58680g(6, 1, this.f141225i);
        } else if (i == 2) {
            this.f141225i.clear();
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
            C51176rz rzVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rzVar.f141220d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    rzVar.f141221e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    rzVar.f141222f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    rzVar.f141223g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rzVar.f141224h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rzVar.f141225i.add(aVar3.mo141633k(intValue));
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
