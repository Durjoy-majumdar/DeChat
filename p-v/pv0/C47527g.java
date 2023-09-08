package pv0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.g */
public class C47527g extends C47465a {

    /* renamed from: d */
    public String f127504d;

    /* renamed from: e */
    public C47532k f127505e;

    /* renamed from: f */
    public int f127506f;

    /* renamed from: g */
    public int f127507g;

    /* renamed from: h */
    public int f127508h;

    /* renamed from: i */
    public int f127509i;

    /* renamed from: j */
    public int f127510j;

    /* renamed from: n */
    public int f127511n;

    /* renamed from: o */
    public int f127512o;

    /* renamed from: p */
    public int f127513p;

    /* renamed from: q */
    public int f127514q;

    /* renamed from: r */
    public C62556a f127515r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47527g)) {
            return false;
        }
        C47527g gVar = (C47527g) aVar;
        return C46238a.m51546a(this.f127504d, gVar.f127504d) && C46238a.m51546a(this.f127505e, gVar.f127505e) && C46238a.m51546a(Integer.valueOf(this.f127506f), Integer.valueOf(gVar.f127506f)) && C46238a.m51546a(Integer.valueOf(this.f127507g), Integer.valueOf(gVar.f127507g)) && C46238a.m51546a(Integer.valueOf(this.f127508h), Integer.valueOf(gVar.f127508h)) && C46238a.m51546a(Integer.valueOf(this.f127509i), Integer.valueOf(gVar.f127509i)) && C46238a.m51546a(Integer.valueOf(this.f127510j), Integer.valueOf(gVar.f127510j)) && C46238a.m51546a(Integer.valueOf(this.f127511n), Integer.valueOf(gVar.f127511n)) && C46238a.m51546a(Integer.valueOf(this.f127512o), Integer.valueOf(gVar.f127512o)) && C46238a.m51546a(Integer.valueOf(this.f127513p), Integer.valueOf(gVar.f127513p)) && C46238a.m51546a(Integer.valueOf(this.f127514q), Integer.valueOf(gVar.f127514q)) && C46238a.m51546a(this.f127515r, gVar.f127515r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127504d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                C47532k kVar = this.f127505e;
                if (kVar != null) {
                    aVar.mo74322i(2, kVar.computeSize());
                    this.f127505e.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f127506f);
                aVar.mo74318e(4, this.f127507g);
                aVar.mo74318e(5, this.f127508h);
                aVar.mo74318e(6, this.f127509i);
                aVar.mo74318e(7, this.f127510j);
                aVar.mo74318e(8, this.f127511n);
                aVar.mo74318e(9, this.f127512o);
                aVar.mo74318e(10, this.f127513p);
                aVar.mo74318e(11, this.f127514q);
                C62556a aVar2 = this.f127515r;
                if (aVar2 == null) {
                    return 0;
                }
                aVar.mo74322i(12, aVar2.computeSize());
                this.f127515r.writeFields(aVar);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i2 == 1) {
            String str2 = this.f127504d;
            int j = str2 != null ? 0 + C52418a.m58683j(1, str2) : 0;
            C47532k kVar2 = this.f127505e;
            if (kVar2 != null) {
                j += C52418a.m58682i(2, kVar2.computeSize());
            }
            int e = j + C52418a.m58678e(3, this.f127506f) + C52418a.m58678e(4, this.f127507g) + C52418a.m58678e(5, this.f127508h) + C52418a.m58678e(6, this.f127509i) + C52418a.m58678e(7, this.f127510j) + C52418a.m58678e(8, this.f127511n) + C52418a.m58678e(9, this.f127512o) + C52418a.m58678e(10, this.f127513p) + C52418a.m58678e(11, this.f127514q);
            C62556a aVar3 = this.f127515r;
            return aVar3 != null ? e + C52418a.m58682i(12, aVar3.computeSize()) : e;
        } else if (i2 == 2) {
            C102122a aVar4 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar4); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar4)) {
                if (!super.populateBuilderWithField(aVar4, this, nextFieldNumber)) {
                    aVar4.mo141624b();
                }
            }
            if (this.f127504d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar5 = objArr[0];
            C47527g gVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gVar.f127504d = aVar5.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar5.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C47532k kVar3 = new C47532k();
                        if (bArr != null && bArr.length > 0) {
                            kVar3.parseFrom(bArr);
                        }
                        gVar.f127505e = kVar3;
                    }
                    return 0;
                case 3:
                    gVar.f127506f = aVar5.mo141629g(intValue);
                    return 0;
                case 4:
                    gVar.f127507g = aVar5.mo141629g(intValue);
                    return 0;
                case 5:
                    gVar.f127508h = aVar5.mo141629g(intValue);
                    return 0;
                case 6:
                    gVar.f127509i = aVar5.mo141629g(intValue);
                    return 0;
                case 7:
                    gVar.f127510j = aVar5.mo141629g(intValue);
                    return 0;
                case 8:
                    gVar.f127511n = aVar5.mo141629g(intValue);
                    return 0;
                case 9:
                    gVar.f127512o = aVar5.mo141629g(intValue);
                    return 0;
                case 10:
                    gVar.f127513p = aVar5.mo141629g(intValue);
                    return 0;
                case 11:
                    gVar.f127514q = aVar5.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar5.mo141632j(intValue);
                    int size2 = j3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j3.get(i4);
                        C62556a aVar6 = new C62556a();
                        if (bArr2 != null && bArr2.length > 0) {
                            aVar6.parseFrom(bArr2);
                        }
                        gVar.f127515r = aVar6;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
