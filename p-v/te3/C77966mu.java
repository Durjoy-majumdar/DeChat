package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mu */
public class C77966mu extends C101820nt3 {

    /* renamed from: d */
    public String f227827d;

    /* renamed from: e */
    public String f227828e;

    /* renamed from: f */
    public String f227829f;

    /* renamed from: g */
    public String f227830g;

    /* renamed from: h */
    public String f227831h;

    /* renamed from: i */
    public String f227832i;

    /* renamed from: j */
    public String f227833j;

    /* renamed from: n */
    public int f227834n;

    /* renamed from: o */
    public C77963l1 f227835o;

    /* renamed from: p */
    public String f227836p;

    /* renamed from: q */
    public String f227837q;

    /* renamed from: r */
    public String f227838r;

    /* renamed from: s */
    public int f227839s;

    /* renamed from: t */
    public int f227840t;

    /* renamed from: u */
    public String f227841u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77966mu)) {
            return false;
        }
        C77966mu muVar = (C77966mu) aVar;
        return C46238a.m51546a(this.BaseRequest, muVar.BaseRequest) && C46238a.m51546a(this.f227827d, muVar.f227827d) && C46238a.m51546a(this.f227828e, muVar.f227828e) && C46238a.m51546a(this.f227829f, muVar.f227829f) && C46238a.m51546a(this.f227830g, muVar.f227830g) && C46238a.m51546a(this.f227831h, muVar.f227831h) && C46238a.m51546a(this.f227832i, muVar.f227832i) && C46238a.m51546a(this.f227833j, muVar.f227833j) && C46238a.m51546a(Integer.valueOf(this.f227834n), Integer.valueOf(muVar.f227834n)) && C46238a.m51546a(this.f227835o, muVar.f227835o) && C46238a.m51546a(this.f227836p, muVar.f227836p) && C46238a.m51546a(this.f227837q, muVar.f227837q) && C46238a.m51546a(this.f227838r, muVar.f227838r) && C46238a.m51546a(Integer.valueOf(this.f227839s), Integer.valueOf(muVar.f227839s)) && C46238a.m51546a(Integer.valueOf(this.f227840t), Integer.valueOf(muVar.f227840t)) && C46238a.m51546a(this.f227841u, muVar.f227841u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f227827d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f227828e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f227829f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f227830g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f227831h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f227832i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f227833j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            aVar.mo74318e(9, this.f227834n);
            C77963l1 l1Var = this.f227835o;
            if (l1Var != null) {
                aVar.mo74322i(10, l1Var.computeSize());
                this.f227835o.writeFields(aVar);
            }
            String str8 = this.f227836p;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            String str9 = this.f227837q;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            String str10 = this.f227838r;
            if (str10 != null) {
                aVar.mo74323j(13, str10);
            }
            aVar.mo74318e(14, this.f227839s);
            aVar.mo74318e(15, this.f227840t);
            String str11 = this.f227841u;
            if (str11 != null) {
                aVar.mo74323j(16, str11);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str12 = this.f227827d;
            if (str12 != null) {
                i3 += C52418a.m58683j(2, str12);
            }
            String str13 = this.f227828e;
            if (str13 != null) {
                i3 += C52418a.m58683j(3, str13);
            }
            String str14 = this.f227829f;
            if (str14 != null) {
                i3 += C52418a.m58683j(4, str14);
            }
            String str15 = this.f227830g;
            if (str15 != null) {
                i3 += C52418a.m58683j(5, str15);
            }
            String str16 = this.f227831h;
            if (str16 != null) {
                i3 += C52418a.m58683j(6, str16);
            }
            String str17 = this.f227832i;
            if (str17 != null) {
                i3 += C52418a.m58683j(7, str17);
            }
            String str18 = this.f227833j;
            if (str18 != null) {
                i3 += C52418a.m58683j(8, str18);
            }
            int e = i3 + C52418a.m58678e(9, this.f227834n);
            C77963l1 l1Var2 = this.f227835o;
            if (l1Var2 != null) {
                e += C52418a.m58682i(10, l1Var2.computeSize());
            }
            String str19 = this.f227836p;
            if (str19 != null) {
                e += C52418a.m58683j(11, str19);
            }
            String str20 = this.f227837q;
            if (str20 != null) {
                e += C52418a.m58683j(12, str20);
            }
            String str21 = this.f227838r;
            if (str21 != null) {
                e += C52418a.m58683j(13, str21);
            }
            int e2 = e + C52418a.m58678e(14, this.f227839s) + C52418a.m58678e(15, this.f227840t);
            String str22 = this.f227841u;
            return str22 != null ? e2 + C52418a.m58683j(16, str22) : e2;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77966mu muVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        muVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    muVar.f227827d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    muVar.f227828e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    muVar.f227829f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    muVar.f227830g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    muVar.f227831h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    muVar.f227832i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    muVar.f227833j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    muVar.f227834n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C77963l1 l1Var3 = new C77963l1();
                        if (bArr2 != null && bArr2.length > 0) {
                            l1Var3.parseFrom(bArr2);
                        }
                        muVar.f227835o = l1Var3;
                    }
                    return 0;
                case 11:
                    muVar.f227836p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    muVar.f227837q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    muVar.f227838r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    muVar.f227839s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    muVar.f227840t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    muVar.f227841u = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
