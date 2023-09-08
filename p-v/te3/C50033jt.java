package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jt */
public class C50033jt extends C101820nt3 {

    /* renamed from: d */
    public int f136301d;

    /* renamed from: e */
    public String f136302e;

    /* renamed from: f */
    public String f136303f;

    /* renamed from: g */
    public String f136304g;

    /* renamed from: h */
    public int f136305h;

    /* renamed from: i */
    public LinkedList<C51163rv3> f136306i = new LinkedList<>();

    /* renamed from: j */
    public String f136307j;

    /* renamed from: n */
    public String f136308n;

    /* renamed from: o */
    public int f136309o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50033jt)) {
            return false;
        }
        C50033jt jtVar = (C50033jt) aVar;
        return C46238a.m51546a(this.BaseRequest, jtVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f136301d), Integer.valueOf(jtVar.f136301d)) && C46238a.m51546a(this.f136302e, jtVar.f136302e) && C46238a.m51546a(this.f136303f, jtVar.f136303f) && C46238a.m51546a(this.f136304g, jtVar.f136304g) && C46238a.m51546a(Integer.valueOf(this.f136305h), Integer.valueOf(jtVar.f136305h)) && C46238a.m51546a(this.f136306i, jtVar.f136306i) && C46238a.m51546a(this.f136307j, jtVar.f136307j) && C46238a.m51546a(this.f136308n, jtVar.f136308n) && C46238a.m51546a(Integer.valueOf(this.f136309o), Integer.valueOf(jtVar.f136309o));
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
            aVar.mo74318e(2, this.f136301d);
            String str = this.f136302e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f136303f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f136304g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f136305h);
            aVar.mo74320g(7, 8, this.f136306i);
            String str4 = this.f136307j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f136308n;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            aVar.mo74318e(10, this.f136309o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f136301d);
            String str6 = this.f136302e;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f136303f;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f136304g;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            int e2 = e + C52418a.m58678e(6, this.f136305h) + C52418a.m58680g(7, 8, this.f136306i);
            String str9 = this.f136307j;
            if (str9 != null) {
                e2 += C52418a.m58683j(8, str9);
            }
            String str10 = this.f136308n;
            if (str10 != null) {
                e2 += C52418a.m58683j(9, str10);
            }
            return e2 + C52418a.m58678e(10, this.f136309o);
        } else if (i == 2) {
            this.f136306i.clear();
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
            C50033jt jtVar = objArr[1];
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
                        jtVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    jtVar.f136301d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    jtVar.f136302e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    jtVar.f136303f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    jtVar.f136304g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    jtVar.f136305h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv32.mo73356d(bArr2);
                        }
                        jtVar.f136306i.add(rv32);
                    }
                    return 0;
                case 8:
                    jtVar.f136307j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    jtVar.f136308n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    jtVar.f136309o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
