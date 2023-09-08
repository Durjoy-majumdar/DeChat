package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fy1 */
public class C118432fy1 extends C49335eu3 {

    /* renamed from: d */
    public String f354007d;

    /* renamed from: e */
    public C51018qv3 f354008e;

    /* renamed from: f */
    public String f354009f;

    /* renamed from: g */
    public String f354010g;

    /* renamed from: h */
    public int f354011h;

    /* renamed from: i */
    public int f354012i;

    /* renamed from: j */
    public LinkedList<C64844xz> f354013j = new LinkedList<>();

    /* renamed from: n */
    public String f354014n;

    /* renamed from: o */
    public String f354015o;

    /* renamed from: p */
    public String f354016p;

    /* renamed from: q */
    public int f354017q;

    /* renamed from: r */
    public int f354018r;

    /* renamed from: s */
    public long f354019s;

    /* renamed from: t */
    public String f354020t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118432fy1)) {
            return false;
        }
        C118432fy1 fy12 = (C118432fy1) aVar;
        return C46238a.m51546a(this.BaseResponse, fy12.BaseResponse) && C46238a.m51546a(this.f354007d, fy12.f354007d) && C46238a.m51546a(this.f354008e, fy12.f354008e) && C46238a.m51546a(this.f354009f, fy12.f354009f) && C46238a.m51546a(this.f354010g, fy12.f354010g) && C46238a.m51546a(Integer.valueOf(this.f354011h), Integer.valueOf(fy12.f354011h)) && C46238a.m51546a(Integer.valueOf(this.f354012i), Integer.valueOf(fy12.f354012i)) && C46238a.m51546a(this.f354013j, fy12.f354013j) && C46238a.m51546a(this.f354014n, fy12.f354014n) && C46238a.m51546a(this.f354015o, fy12.f354015o) && C46238a.m51546a(this.f354016p, fy12.f354016p) && C46238a.m51546a(Integer.valueOf(this.f354017q), Integer.valueOf(fy12.f354017q)) && C46238a.m51546a(Integer.valueOf(this.f354018r), Integer.valueOf(fy12.f354018r)) && C46238a.m51546a(Long.valueOf(this.f354019s), Long.valueOf(fy12.f354019s)) && C46238a.m51546a(this.f354020t, fy12.f354020t);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f354008e != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f354007d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C51018qv3 qv32 = this.f354008e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f354008e.writeFields(aVar);
                }
                String str2 = this.f354009f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f354010g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f354011h);
                aVar.mo74318e(7, this.f354012i);
                aVar.mo74320g(8, 8, this.f354013j);
                String str4 = this.f354014n;
                if (str4 != null) {
                    aVar.mo74323j(9, str4);
                }
                String str5 = this.f354015o;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                String str6 = this.f354016p;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                aVar.mo74318e(12, this.f354017q);
                aVar.mo74318e(13, this.f354018r);
                aVar.mo74321h(14, this.f354019s);
                String str7 = this.f354020t;
                if (str7 != null) {
                    aVar.mo74323j(15, str7);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Key");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            String str8 = this.f354007d;
            if (str8 != null) {
                i3 += C52418a.m58683j(2, str8);
            }
            C51018qv3 qv33 = this.f354008e;
            if (qv33 != null) {
                i3 += C52418a.m58682i(3, qv33.computeSize());
            }
            String str9 = this.f354009f;
            if (str9 != null) {
                i3 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f354010g;
            if (str10 != null) {
                i3 += C52418a.m58683j(5, str10);
            }
            int e = i3 + C52418a.m58678e(6, this.f354011h) + C52418a.m58678e(7, this.f354012i) + C52418a.m58680g(8, 8, this.f354013j);
            String str11 = this.f354014n;
            if (str11 != null) {
                e += C52418a.m58683j(9, str11);
            }
            String str12 = this.f354015o;
            if (str12 != null) {
                e += C52418a.m58683j(10, str12);
            }
            String str13 = this.f354016p;
            if (str13 != null) {
                e += C52418a.m58683j(11, str13);
            }
            int e2 = e + C52418a.m58678e(12, this.f354017q) + C52418a.m58678e(13, this.f354018r) + C52418a.m58681h(14, this.f354019s);
            String str14 = this.f354020t;
            return str14 != null ? e2 + C52418a.m58683j(15, str14) : e2;
        } else if (i2 == 2) {
            this.f354013j.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f354008e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Key");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118432fy1 fy12 = objArr[1];
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
                        fy12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    fy12.f354007d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        fy12.f354008e = qv34;
                    }
                    return 0;
                case 4:
                    fy12.f354009f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fy12.f354010g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fy12.f354011h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    fy12.f354012i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64844xz xzVar = new C64844xz();
                        if (bArr3 != null && bArr3.length > 0) {
                            xzVar.parseFrom(bArr3);
                        }
                        fy12.f354013j.add(xzVar);
                    }
                    return 0;
                case 9:
                    fy12.f354014n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    fy12.f354015o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    fy12.f354016p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    fy12.f354017q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    fy12.f354018r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    fy12.f354019s = aVar3.mo141631i(intValue);
                    return 0;
                case 15:
                    fy12.f354020t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
