package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i */
public class C77945i extends C101820nt3 {

    /* renamed from: d */
    public String f227596d;

    /* renamed from: e */
    public int f227597e;

    /* renamed from: f */
    public String f227598f;

    /* renamed from: g */
    public C77963l1 f227599g;

    /* renamed from: h */
    public long f227600h;

    /* renamed from: i */
    public String f227601i;

    /* renamed from: j */
    public String f227602j;

    /* renamed from: n */
    public String f227603n;

    /* renamed from: o */
    public String f227604o;

    /* renamed from: p */
    public boolean f227605p;

    /* renamed from: q */
    public LinkedList<s94> f227606q = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77945i)) {
            return false;
        }
        C77945i iVar = (C77945i) aVar;
        return C46238a.m51546a(this.BaseRequest, iVar.BaseRequest) && C46238a.m51546a(this.f227596d, iVar.f227596d) && C46238a.m51546a(Integer.valueOf(this.f227597e), Integer.valueOf(iVar.f227597e)) && C46238a.m51546a(this.f227598f, iVar.f227598f) && C46238a.m51546a(this.f227599g, iVar.f227599g) && C46238a.m51546a(Long.valueOf(this.f227600h), Long.valueOf(iVar.f227600h)) && C46238a.m51546a(this.f227601i, iVar.f227601i) && C46238a.m51546a(this.f227602j, iVar.f227602j) && C46238a.m51546a(this.f227603n, iVar.f227603n) && C46238a.m51546a(this.f227604o, iVar.f227604o) && C46238a.m51546a(Boolean.valueOf(this.f227605p), Boolean.valueOf(iVar.f227605p)) && C46238a.m51546a(this.f227606q, iVar.f227606q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f227596d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f227597e);
            String str2 = this.f227598f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C77963l1 l1Var = this.f227599g;
            if (l1Var != null) {
                aVar.mo74322i(5, l1Var.computeSize());
                this.f227599g.writeFields(aVar);
            }
            aVar.mo74321h(6, this.f227600h);
            String str3 = this.f227601i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f227602j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f227603n;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            String str6 = this.f227604o;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            aVar.mo74314a(11, this.f227605p);
            aVar.mo74320g(12, 8, this.f227606q);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f227596d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int e = i2 + C52418a.m58678e(3, this.f227597e);
            String str8 = this.f227598f;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            C77963l1 l1Var2 = this.f227599g;
            if (l1Var2 != null) {
                e += C52418a.m58682i(5, l1Var2.computeSize());
            }
            int h = e + C52418a.m58681h(6, this.f227600h);
            String str9 = this.f227601i;
            if (str9 != null) {
                h += C52418a.m58683j(7, str9);
            }
            String str10 = this.f227602j;
            if (str10 != null) {
                h += C52418a.m58683j(8, str10);
            }
            String str11 = this.f227603n;
            if (str11 != null) {
                h += C52418a.m58683j(9, str11);
            }
            String str12 = this.f227604o;
            if (str12 != null) {
                h += C52418a.m58683j(10, str12);
            }
            return h + C52418a.m58674a(11, this.f227605p) + C52418a.m58680g(12, 8, this.f227606q);
        } else if (i == 2) {
            this.f227606q.clear();
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
            C77945i iVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        iVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    iVar.f227596d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    iVar.f227597e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    iVar.f227598f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77963l1 l1Var3 = new C77963l1();
                        if (bArr2 != null && bArr2.length > 0) {
                            l1Var3.parseFrom(bArr2);
                        }
                        iVar.f227599g = l1Var3;
                    }
                    return 0;
                case 6:
                    iVar.f227600h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    iVar.f227601i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    iVar.f227602j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    iVar.f227603n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    iVar.f227604o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    iVar.f227605p = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        s94 s94 = new s94();
                        if (bArr3 != null && bArr3.length > 0) {
                            s94.parseFrom(bArr3);
                        }
                        iVar.f227606q.add(s94);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
