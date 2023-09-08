package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.b4 */
public class C47552b4 extends C47465a {

    /* renamed from: d */
    public String f127598d;

    /* renamed from: e */
    public String f127599e;

    /* renamed from: f */
    public String f127600f;

    /* renamed from: g */
    public String f127601g;

    /* renamed from: h */
    public String f127602h;

    /* renamed from: i */
    public C47589h f127603i;

    /* renamed from: j */
    public LinkedList<C47625m0> f127604j = new LinkedList<>();

    /* renamed from: n */
    public String f127605n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47552b4)) {
            return false;
        }
        C47552b4 b4Var = (C47552b4) aVar;
        return C46238a.m51546a(this.f127598d, b4Var.f127598d) && C46238a.m51546a(this.f127599e, b4Var.f127599e) && C46238a.m51546a(this.f127600f, b4Var.f127600f) && C46238a.m51546a(this.f127601g, b4Var.f127601g) && C46238a.m51546a(this.f127602h, b4Var.f127602h) && C46238a.m51546a(this.f127603i, b4Var.f127603i) && C46238a.m51546a(this.f127604j, b4Var.f127604j) && C46238a.m51546a(this.f127605n, b4Var.f127605n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127598d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f127599e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f127600f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f127601g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f127602h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            C47589h hVar = this.f127603i;
            if (hVar != null) {
                aVar.mo74322i(6, hVar.computeSize());
                this.f127603i.writeFields(aVar);
            }
            aVar.mo74320g(7, 8, this.f127604j);
            String str6 = this.f127605n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f127598d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f127599e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f127600f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f127601g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f127602h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            C47589h hVar2 = this.f127603i;
            if (hVar2 != null) {
                i2 += C52418a.m58682i(6, hVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(7, 8, this.f127604j);
            String str12 = this.f127605n;
            return str12 != null ? g + C52418a.m58683j(8, str12) : g;
        } else if (i == 2) {
            this.f127604j.clear();
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
            C47552b4 b4Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    b4Var.f127598d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    b4Var.f127599e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    b4Var.f127600f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    b4Var.f127601g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    b4Var.f127602h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C47589h hVar3 = new C47589h();
                        if (bArr != null && bArr.length > 0) {
                            hVar3.parseFrom(bArr);
                        }
                        b4Var.f127603i = hVar3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C47625m0 m0Var = new C47625m0();
                        if (bArr2 != null && bArr2.length > 0) {
                            m0Var.parseFrom(bArr2);
                        }
                        b4Var.f127604j.add(m0Var);
                    }
                    return 0;
                case 8:
                    b4Var.f127605n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
