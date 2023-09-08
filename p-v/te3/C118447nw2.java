package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nw2 */
public class C118447nw2 extends C47465a {

    /* renamed from: d */
    public int f354149d;

    /* renamed from: e */
    public String f354150e;

    /* renamed from: f */
    public String f354151f;

    /* renamed from: g */
    public String f354152g;

    /* renamed from: h */
    public String f354153h;

    /* renamed from: i */
    public String f354154i;

    /* renamed from: j */
    public int f354155j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118447nw2)) {
            return false;
        }
        C118447nw2 nw22 = (C118447nw2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f354149d), Integer.valueOf(nw22.f354149d)) && C46238a.m51546a(this.f354150e, nw22.f354150e) && C46238a.m51546a(this.f354151f, nw22.f354151f) && C46238a.m51546a(this.f354152g, nw22.f354152g) && C46238a.m51546a(this.f354153h, nw22.f354153h) && C46238a.m51546a(this.f354154i, nw22.f354154i) && C46238a.m51546a(Integer.valueOf(this.f354155j), Integer.valueOf(nw22.f354155j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f354150e != null) {
                aVar.mo74318e(1, this.f354149d);
                String str = this.f354150e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f354151f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f354152g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f354153h;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                String str5 = this.f354154i;
                if (str5 != null) {
                    aVar.mo74323j(6, str5);
                }
                aVar.mo74318e(7, this.f354155j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: wording");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f354149d) + 0;
            String str6 = this.f354150e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            String str7 = this.f354151f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f354152g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f354153h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f354154i;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            return e + C52418a.m58678e(7, this.f354155j);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f354150e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: wording");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118447nw2 nw22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    nw22.f354149d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    nw22.f354150e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    nw22.f354151f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    nw22.f354152g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    nw22.f354153h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    nw22.f354154i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    nw22.f354155j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
