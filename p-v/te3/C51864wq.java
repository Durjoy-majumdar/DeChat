package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wq */
public class C51864wq extends C49335eu3 {

    /* renamed from: d */
    public int f144212d;

    /* renamed from: e */
    public String f144213e;

    /* renamed from: f */
    public String f144214f;

    /* renamed from: g */
    public LinkedList<Integer> f144215g = new LinkedList<>();

    /* renamed from: h */
    public String f144216h;

    /* renamed from: i */
    public String f144217i;

    /* renamed from: j */
    public String f144218j;

    /* renamed from: n */
    public String f144219n;

    /* renamed from: o */
    public String f144220o;

    /* renamed from: p */
    public String f144221p;

    /* renamed from: q */
    public int f144222q;

    /* renamed from: r */
    public String f144223r;

    /* renamed from: s */
    public String f144224s;

    /* renamed from: t */
    public String f144225t;

    /* renamed from: u */
    public C77933g43 f144226u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51864wq)) {
            return false;
        }
        C51864wq wqVar = (C51864wq) aVar;
        return C46238a.m51546a(this.BaseResponse, wqVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f144212d), Integer.valueOf(wqVar.f144212d)) && C46238a.m51546a(this.f144213e, wqVar.f144213e) && C46238a.m51546a(this.f144214f, wqVar.f144214f) && C46238a.m51546a(this.f144215g, wqVar.f144215g) && C46238a.m51546a(this.f144216h, wqVar.f144216h) && C46238a.m51546a(this.f144217i, wqVar.f144217i) && C46238a.m51546a(this.f144218j, wqVar.f144218j) && C46238a.m51546a(this.f144219n, wqVar.f144219n) && C46238a.m51546a(this.f144220o, wqVar.f144220o) && C46238a.m51546a(this.f144221p, wqVar.f144221p) && C46238a.m51546a(Integer.valueOf(this.f144222q), Integer.valueOf(wqVar.f144222q)) && C46238a.m51546a(this.f144223r, wqVar.f144223r) && C46238a.m51546a(this.f144224s, wqVar.f144224s) && C46238a.m51546a(this.f144225t, wqVar.f144225t) && C46238a.m51546a(this.f144226u, wqVar.f144226u);
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
                aVar.mo74318e(2, this.f144212d);
                String str = this.f144213e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f144214f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74320g(5, 2, this.f144215g);
                String str3 = this.f144216h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f144217i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                String str5 = this.f144218j;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                String str6 = this.f144219n;
                if (str6 != null) {
                    aVar.mo74323j(9, str6);
                }
                String str7 = this.f144220o;
                if (str7 != null) {
                    aVar.mo74323j(10, str7);
                }
                String str8 = this.f144221p;
                if (str8 != null) {
                    aVar.mo74323j(11, str8);
                }
                aVar.mo74318e(12, this.f144222q);
                String str9 = this.f144223r;
                if (str9 != null) {
                    aVar.mo74323j(13, str9);
                }
                String str10 = this.f144224s;
                if (str10 != null) {
                    aVar.mo74323j(14, str10);
                }
                String str11 = this.f144225t;
                if (str11 != null) {
                    aVar.mo74323j(15, str11);
                }
                C77933g43 g432 = this.f144226u;
                if (g432 != null) {
                    aVar.mo74322i(16, g432.computeSize());
                    this.f144226u.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f144212d);
            String str12 = this.f144213e;
            if (str12 != null) {
                e += C52418a.m58683j(3, str12);
            }
            String str13 = this.f144214f;
            if (str13 != null) {
                e += C52418a.m58683j(4, str13);
            }
            int g = e + C52418a.m58680g(5, 2, this.f144215g);
            String str14 = this.f144216h;
            if (str14 != null) {
                g += C52418a.m58683j(6, str14);
            }
            String str15 = this.f144217i;
            if (str15 != null) {
                g += C52418a.m58683j(7, str15);
            }
            String str16 = this.f144218j;
            if (str16 != null) {
                g += C52418a.m58683j(8, str16);
            }
            String str17 = this.f144219n;
            if (str17 != null) {
                g += C52418a.m58683j(9, str17);
            }
            String str18 = this.f144220o;
            if (str18 != null) {
                g += C52418a.m58683j(10, str18);
            }
            String str19 = this.f144221p;
            if (str19 != null) {
                g += C52418a.m58683j(11, str19);
            }
            int e2 = g + C52418a.m58678e(12, this.f144222q);
            String str20 = this.f144223r;
            if (str20 != null) {
                e2 += C52418a.m58683j(13, str20);
            }
            String str21 = this.f144224s;
            if (str21 != null) {
                e2 += C52418a.m58683j(14, str21);
            }
            String str22 = this.f144225t;
            if (str22 != null) {
                e2 += C52418a.m58683j(15, str22);
            }
            C77933g43 g433 = this.f144226u;
            return g433 != null ? e2 + C52418a.m58682i(16, g433.computeSize()) : e2;
        } else if (i2 == 2) {
            this.f144215g.clear();
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
            C51864wq wqVar = objArr[1];
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
                        wqVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    wqVar.f144212d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    wqVar.f144213e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    wqVar.f144214f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    wqVar.f144215g.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 6:
                    wqVar.f144216h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    wqVar.f144217i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    wqVar.f144218j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    wqVar.f144219n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    wqVar.f144220o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    wqVar.f144221p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    wqVar.f144222q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    wqVar.f144223r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    wqVar.f144224s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    wqVar.f144225t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C77933g43 g434 = new C77933g43();
                        if (bArr2 != null && bArr2.length > 0) {
                            g434.parseFrom(bArr2);
                        }
                        wqVar.f144226u = g434;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
