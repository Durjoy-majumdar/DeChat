package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class x84 extends C101820nt3 {

    /* renamed from: d */
    public int f299860d;

    /* renamed from: e */
    public int f299861e;

    /* renamed from: f */
    public int f299862f;

    /* renamed from: g */
    public int f299863g;

    /* renamed from: h */
    public C51018qv3 f299864h;

    /* renamed from: i */
    public String f299865i;

    /* renamed from: j */
    public int f299866j;

    /* renamed from: n */
    public int f299867n;

    /* renamed from: o */
    public String f299868o;

    /* renamed from: p */
    public int f299869p;

    /* renamed from: q */
    public int f299870q;

    /* renamed from: r */
    public ek4 f299871r;

    /* renamed from: s */
    public String f299872s;

    /* renamed from: t */
    public int f299873t;

    /* renamed from: u */
    public String f299874u;

    /* renamed from: v */
    public int f299875v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof x84)) {
            return false;
        }
        x84 x84 = (x84) aVar;
        return C46238a.m51546a(this.BaseRequest, x84.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f299860d), Integer.valueOf(x84.f299860d)) && C46238a.m51546a(Integer.valueOf(this.f299861e), Integer.valueOf(x84.f299861e)) && C46238a.m51546a(Integer.valueOf(this.f299862f), Integer.valueOf(x84.f299862f)) && C46238a.m51546a(Integer.valueOf(this.f299863g), Integer.valueOf(x84.f299863g)) && C46238a.m51546a(this.f299864h, x84.f299864h) && C46238a.m51546a(this.f299865i, x84.f299865i) && C46238a.m51546a(Integer.valueOf(this.f299866j), Integer.valueOf(x84.f299866j)) && C46238a.m51546a(Integer.valueOf(this.f299867n), Integer.valueOf(x84.f299867n)) && C46238a.m51546a(this.f299868o, x84.f299868o) && C46238a.m51546a(Integer.valueOf(this.f299869p), Integer.valueOf(x84.f299869p)) && C46238a.m51546a(Integer.valueOf(this.f299870q), Integer.valueOf(x84.f299870q)) && C46238a.m51546a(this.f299871r, x84.f299871r) && C46238a.m51546a(this.f299872s, x84.f299872s) && C46238a.m51546a(Integer.valueOf(this.f299873t), Integer.valueOf(x84.f299873t)) && C46238a.m51546a(this.f299874u, x84.f299874u) && C46238a.m51546a(Integer.valueOf(this.f299875v), Integer.valueOf(x84.f299875v));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f299864h != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f299860d);
                aVar.mo74318e(3, this.f299861e);
                aVar.mo74318e(17, this.f299862f);
                aVar.mo74318e(4, this.f299863g);
                C51018qv3 qv32 = this.f299864h;
                if (qv32 != null) {
                    aVar.mo74322i(5, qv32.computeSize());
                    this.f299864h.writeFields(aVar);
                }
                String str = this.f299865i;
                if (str != null) {
                    aVar.mo74323j(6, str);
                }
                aVar.mo74318e(7, this.f299866j);
                aVar.mo74318e(8, this.f299867n);
                String str2 = this.f299868o;
                if (str2 != null) {
                    aVar.mo74323j(9, str2);
                }
                aVar.mo74318e(10, this.f299869p);
                aVar.mo74318e(11, this.f299870q);
                ek4 ek4 = this.f299871r;
                if (ek4 != null) {
                    aVar.mo74322i(12, ek4.computeSize());
                    this.f299871r.writeFields(aVar);
                }
                String str3 = this.f299872s;
                if (str3 != null) {
                    aVar.mo74323j(13, str3);
                }
                aVar.mo74318e(14, this.f299873t);
                String str4 = this.f299874u;
                if (str4 != null) {
                    aVar.mo74323j(15, str4);
                }
                aVar.mo74318e(16, this.f299875v);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Buffer");
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f299860d) + C52418a.m58678e(3, this.f299861e) + C52418a.m58678e(17, this.f299862f) + C52418a.m58678e(4, this.f299863g);
            C51018qv3 qv33 = this.f299864h;
            if (qv33 != null) {
                e += C52418a.m58682i(5, qv33.computeSize());
            }
            String str5 = this.f299865i;
            if (str5 != null) {
                e += C52418a.m58683j(6, str5);
            }
            int e2 = e + C52418a.m58678e(7, this.f299866j) + C52418a.m58678e(8, this.f299867n);
            String str6 = this.f299868o;
            if (str6 != null) {
                e2 += C52418a.m58683j(9, str6);
            }
            int e3 = e2 + C52418a.m58678e(10, this.f299869p) + C52418a.m58678e(11, this.f299870q);
            ek4 ek42 = this.f299871r;
            if (ek42 != null) {
                e3 += C52418a.m58682i(12, ek42.computeSize());
            }
            String str7 = this.f299872s;
            if (str7 != null) {
                e3 += C52418a.m58683j(13, str7);
            }
            int e4 = e3 + C52418a.m58678e(14, this.f299873t);
            String str8 = this.f299874u;
            if (str8 != null) {
                e4 += C52418a.m58683j(15, str8);
            }
            return e4 + C52418a.m58678e(16, this.f299875v);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299864h != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Buffer");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            x84 x84 = objArr[1];
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
                        x84.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    x84.f299860d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    x84.f299861e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    x84.f299863g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        x84.f299864h = qv34;
                    }
                    return 0;
                case 6:
                    x84.f299865i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    x84.f299866j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    x84.f299867n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    x84.f299868o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    x84.f299869p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    x84.f299870q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        ek4 ek43 = new ek4();
                        if (bArr3 != null && bArr3.length > 0) {
                            ek43.parseFrom(bArr3);
                        }
                        x84.f299871r = ek43;
                    }
                    return 0;
                case 13:
                    x84.f299872s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    x84.f299873t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    x84.f299874u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    x84.f299875v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    x84.f299862f = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
