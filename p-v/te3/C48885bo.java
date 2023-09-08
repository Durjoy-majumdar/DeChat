package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bo */
public class C48885bo extends C47465a {

    /* renamed from: d */
    public String f131228d;

    /* renamed from: e */
    public String f131229e;

    /* renamed from: f */
    public String f131230f;

    /* renamed from: g */
    public int f131231g;

    /* renamed from: h */
    public String f131232h;

    /* renamed from: i */
    public C51997xn f131233i;

    /* renamed from: j */
    public String f131234j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48885bo)) {
            return false;
        }
        C48885bo boVar = (C48885bo) aVar;
        return C46238a.m51546a(this.f131228d, boVar.f131228d) && C46238a.m51546a(this.f131229e, boVar.f131229e) && C46238a.m51546a(this.f131230f, boVar.f131230f) && C46238a.m51546a(Integer.valueOf(this.f131231g), Integer.valueOf(boVar.f131231g)) && C46238a.m51546a(this.f131232h, boVar.f131232h) && C46238a.m51546a(this.f131233i, boVar.f131233i) && C46238a.m51546a(this.f131234j, boVar.f131234j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131228d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f131229e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f131230f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f131231g);
            String str4 = this.f131232h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            C51997xn xnVar = this.f131233i;
            if (xnVar != null) {
                aVar.mo74322i(6, xnVar.computeSize());
                this.f131233i.writeFields(aVar);
            }
            String str5 = this.f131234j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f131228d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f131229e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f131230f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            int e = i2 + C52418a.m58678e(4, this.f131231g);
            String str9 = this.f131232h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            C51997xn xnVar2 = this.f131233i;
            if (xnVar2 != null) {
                e += C52418a.m58682i(6, xnVar2.computeSize());
            }
            String str10 = this.f131234j;
            return str10 != null ? e + C52418a.m58683j(7, str10) : e;
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
            C48885bo boVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    boVar.f131228d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    boVar.f131229e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    boVar.f131230f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    boVar.f131231g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    boVar.f131232h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51997xn xnVar3 = new C51997xn();
                        if (bArr != null && bArr.length > 0) {
                            xnVar3.parseFrom(bArr);
                        }
                        boVar.f131233i = xnVar3;
                    }
                    return 0;
                case 7:
                    boVar.f131234j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
