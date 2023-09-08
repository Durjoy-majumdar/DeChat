package y43;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: y43.b */
public class C79028b extends C47465a {

    /* renamed from: d */
    public C66502u f232034d;

    /* renamed from: e */
    public int f232035e;

    /* renamed from: f */
    public String f232036f;

    /* renamed from: g */
    public String f232037g;

    /* renamed from: h */
    public String f232038h;

    /* renamed from: i */
    public String f232039i;

    /* renamed from: j */
    public String f232040j;

    /* renamed from: n */
    public String f232041n;

    /* renamed from: o */
    public String f232042o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C79028b)) {
            return false;
        }
        C79028b bVar = (C79028b) aVar;
        return C46238a.m51546a(this.f232034d, bVar.f232034d) && C46238a.m51546a(Integer.valueOf(this.f232035e), Integer.valueOf(bVar.f232035e)) && C46238a.m51546a(this.f232036f, bVar.f232036f) && C46238a.m51546a(this.f232037g, bVar.f232037g) && C46238a.m51546a(this.f232038h, bVar.f232038h) && C46238a.m51546a(this.f232039i, bVar.f232039i) && C46238a.m51546a(this.f232040j, bVar.f232040j) && C46238a.m51546a(this.f232041n, bVar.f232041n) && C46238a.m51546a(this.f232042o, bVar.f232042o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C66502u uVar = this.f232034d;
            if (uVar != null) {
                aVar.mo74322i(1, uVar.computeSize());
                this.f232034d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f232035e);
            String str = this.f232036f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f232037g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f232038h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f232039i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f232040j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f232041n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f232042o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            return 0;
        } else if (i == 1) {
            C66502u uVar2 = this.f232034d;
            if (uVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, uVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f232035e);
            String str8 = this.f232036f;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f232037g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f232038h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f232039i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f232040j;
            if (str12 != null) {
                e += C52418a.m58683j(7, str12);
            }
            String str13 = this.f232041n;
            if (str13 != null) {
                e += C52418a.m58683j(8, str13);
            }
            String str14 = this.f232042o;
            return str14 != null ? e + C52418a.m58683j(9, str14) : e;
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
            C79028b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C66502u uVar3 = new C66502u();
                        if (bArr != null && bArr.length > 0) {
                            uVar3.parseFrom(bArr);
                        }
                        bVar.f232034d = uVar3;
                    }
                    return 0;
                case 2:
                    bVar.f232035e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    bVar.f232036f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bVar.f232037g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bVar.f232038h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bVar.f232039i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bVar.f232040j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    bVar.f232041n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    bVar.f232042o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
