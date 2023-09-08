package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r33 */
public class C118462r33 extends C49335eu3 {

    /* renamed from: d */
    public int f354298d;

    /* renamed from: e */
    public LinkedList<bk4> f354299e = new LinkedList<>();

    /* renamed from: f */
    public C89349b f354300f;

    /* renamed from: g */
    public float f354301g;

    /* renamed from: h */
    public String f354302h;

    /* renamed from: i */
    public String f354303i;

    /* renamed from: j */
    public String f354304j;

    /* renamed from: n */
    public boolean f354305n;

    /* renamed from: o */
    public C89349b f354306o;

    /* renamed from: p */
    public C89349b f354307p;

    /* renamed from: q */
    public int f354308q;

    /* renamed from: r */
    public float f354309r;

    /* renamed from: s */
    public C89349b f354310s;

    /* renamed from: t */
    public C89349b f354311t;

    /* renamed from: u */
    public C89349b f354312u;

    /* renamed from: v */
    public int f354313v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118462r33)) {
            return false;
        }
        C118462r33 r332 = (C118462r33) aVar;
        return C46238a.m51546a(this.BaseResponse, r332.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f354298d), Integer.valueOf(r332.f354298d)) && C46238a.m51546a(this.f354299e, r332.f354299e) && C46238a.m51546a(this.f354300f, r332.f354300f) && C46238a.m51546a(Float.valueOf(this.f354301g), Float.valueOf(r332.f354301g)) && C46238a.m51546a(this.f354302h, r332.f354302h) && C46238a.m51546a(this.f354303i, r332.f354303i) && C46238a.m51546a(this.f354304j, r332.f354304j) && C46238a.m51546a(Boolean.valueOf(this.f354305n), Boolean.valueOf(r332.f354305n)) && C46238a.m51546a(this.f354306o, r332.f354306o) && C46238a.m51546a(this.f354307p, r332.f354307p) && C46238a.m51546a(Integer.valueOf(this.f354308q), Integer.valueOf(r332.f354308q)) && C46238a.m51546a(Float.valueOf(this.f354309r), Float.valueOf(r332.f354309r)) && C46238a.m51546a(this.f354310s, r332.f354310s) && C46238a.m51546a(this.f354311t, r332.f354311t) && C46238a.m51546a(this.f354312u, r332.f354312u) && C46238a.m51546a(Integer.valueOf(this.f354313v), Integer.valueOf(r332.f354313v));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f354298d);
                aVar.mo74320g(3, 8, this.f354299e);
                C89349b bVar = this.f354300f;
                if (bVar != null) {
                    aVar.mo74315b(4, bVar);
                }
                aVar.mo74317d(5, this.f354301g);
                String str = this.f354302h;
                if (str != null) {
                    aVar.mo74323j(6, str);
                }
                String str2 = this.f354303i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                String str3 = this.f354304j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                aVar.mo74314a(9, this.f354305n);
                C89349b bVar2 = this.f354306o;
                if (bVar2 != null) {
                    aVar.mo74315b(10, bVar2);
                }
                C89349b bVar3 = this.f354307p;
                if (bVar3 != null) {
                    aVar.mo74315b(11, bVar3);
                }
                aVar.mo74318e(12, this.f354308q);
                aVar.mo74317d(13, this.f354309r);
                C89349b bVar4 = this.f354310s;
                if (bVar4 != null) {
                    aVar.mo74315b(14, bVar4);
                }
                C89349b bVar5 = this.f354311t;
                if (bVar5 != null) {
                    aVar.mo74315b(15, bVar5);
                }
                C89349b bVar6 = this.f354312u;
                if (bVar6 != null) {
                    aVar.mo74315b(16, bVar6);
                }
                aVar.mo74318e(17, this.f354313v);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f354298d) + C52418a.m58680g(3, 8, this.f354299e);
            C89349b bVar7 = this.f354300f;
            if (bVar7 != null) {
                e += C52418a.m58675b(4, bVar7);
            }
            int d = e + C52418a.m58677d(5, this.f354301g);
            String str4 = this.f354302h;
            if (str4 != null) {
                d += C52418a.m58683j(6, str4);
            }
            String str5 = this.f354303i;
            if (str5 != null) {
                d += C52418a.m58683j(7, str5);
            }
            String str6 = this.f354304j;
            if (str6 != null) {
                d += C52418a.m58683j(8, str6);
            }
            int a = d + C52418a.m58674a(9, this.f354305n);
            C89349b bVar8 = this.f354306o;
            if (bVar8 != null) {
                a += C52418a.m58675b(10, bVar8);
            }
            C89349b bVar9 = this.f354307p;
            if (bVar9 != null) {
                a += C52418a.m58675b(11, bVar9);
            }
            int e2 = a + C52418a.m58678e(12, this.f354308q) + C52418a.m58677d(13, this.f354309r);
            C89349b bVar10 = this.f354310s;
            if (bVar10 != null) {
                e2 += C52418a.m58675b(14, bVar10);
            }
            C89349b bVar11 = this.f354311t;
            if (bVar11 != null) {
                e2 += C52418a.m58675b(15, bVar11);
            }
            C89349b bVar12 = this.f354312u;
            if (bVar12 != null) {
                e2 += C52418a.m58675b(16, bVar12);
            }
            return e2 + C52418a.m58678e(17, this.f354313v);
        } else if (i2 == 2) {
            this.f354299e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118462r33 r332 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        r332.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    r332.f354298d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        bk4 bk4 = new bk4();
                        if (bArr2 != null && bArr2.length > 0) {
                            bk4.parseFrom(bArr2);
                        }
                        r332.f354299e.add(bk4);
                    }
                    return 0;
                case 4:
                    r332.f354300f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    r332.f354301g = aVar3.mo141628f(intValue);
                    return 0;
                case 6:
                    r332.f354302h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    r332.f354303i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    r332.f354304j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    r332.f354305n = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    r332.f354306o = aVar3.mo141626d(intValue);
                    return 0;
                case 11:
                    r332.f354307p = aVar3.mo141626d(intValue);
                    return 0;
                case 12:
                    r332.f354308q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    r332.f354309r = aVar3.mo141628f(intValue);
                    return 0;
                case 14:
                    r332.f354310s = aVar3.mo141626d(intValue);
                    return 0;
                case 15:
                    r332.f354311t = aVar3.mo141626d(intValue);
                    return 0;
                case 16:
                    r332.f354312u = aVar3.mo141626d(intValue);
                    return 0;
                case 17:
                    r332.f354313v = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
