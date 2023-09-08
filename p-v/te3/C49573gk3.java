package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gk3 */
public class C49573gk3 extends C47465a {

    /* renamed from: d */
    public String f134102d;

    /* renamed from: e */
    public int f134103e;

    /* renamed from: f */
    public boolean f134104f;

    /* renamed from: g */
    public String f134105g;

    /* renamed from: h */
    public int f134106h;

    /* renamed from: i */
    public int f134107i;

    /* renamed from: j */
    public LinkedList<C49436fk3> f134108j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49573gk3)) {
            return false;
        }
        C49573gk3 gk32 = (C49573gk3) aVar;
        return C46238a.m51546a(this.f134102d, gk32.f134102d) && C46238a.m51546a(Integer.valueOf(this.f134103e), Integer.valueOf(gk32.f134103e)) && C46238a.m51546a(Boolean.valueOf(this.f134104f), Boolean.valueOf(gk32.f134104f)) && C46238a.m51546a(this.f134105g, gk32.f134105g) && C46238a.m51546a(Integer.valueOf(this.f134106h), Integer.valueOf(gk32.f134106h)) && C46238a.m51546a(Integer.valueOf(this.f134107i), Integer.valueOf(gk32.f134107i)) && C46238a.m51546a(this.f134108j, gk32.f134108j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134102d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f134103e);
            aVar.mo74314a(3, this.f134104f);
            String str2 = this.f134105g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f134106h);
            aVar.mo74318e(6, this.f134107i);
            aVar.mo74320g(7, 8, this.f134108j);
            return 0;
        } else if (i == 1) {
            String str3 = this.f134102d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f134103e) + C52418a.m58674a(3, this.f134104f);
            String str4 = this.f134105g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58678e(5, this.f134106h) + C52418a.m58678e(6, this.f134107i) + C52418a.m58680g(7, 8, this.f134108j);
        } else if (i == 2) {
            this.f134108j.clear();
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
            C49573gk3 gk32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gk32.f134102d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    gk32.f134103e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    gk32.f134104f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    gk32.f134105g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gk32.f134106h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gk32.f134107i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49436fk3 fk32 = new C49436fk3();
                        if (bArr != null && bArr.length > 0) {
                            fk32.parseFrom(bArr);
                        }
                        gk32.f134108j.add(fk32);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
