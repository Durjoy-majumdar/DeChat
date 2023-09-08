package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o22 */
public class C118449o22 extends C49335eu3 {

    /* renamed from: d */
    public C51018qv3 f354159d;

    /* renamed from: e */
    public int f354160e;

    /* renamed from: f */
    public LinkedList<C51163rv3> f354161f = new LinkedList<>();

    /* renamed from: g */
    public int f354162g;

    /* renamed from: h */
    public LinkedList<C64885zm2> f354163h = new LinkedList<>();

    /* renamed from: i */
    public int f354164i;

    /* renamed from: j */
    public String f354165j;

    /* renamed from: n */
    public String f354166n;

    /* renamed from: o */
    public int f354167o;

    /* renamed from: p */
    public String f354168p;

    /* renamed from: q */
    public int f354169q;

    /* renamed from: r */
    public C64234an2 f354170r;

    /* renamed from: s */
    public String f354171s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118449o22)) {
            return false;
        }
        C118449o22 o222 = (C118449o22) aVar;
        return C46238a.m51546a(this.BaseResponse, o222.BaseResponse) && C46238a.m51546a(this.f354159d, o222.f354159d) && C46238a.m51546a(Integer.valueOf(this.f354160e), Integer.valueOf(o222.f354160e)) && C46238a.m51546a(this.f354161f, o222.f354161f) && C46238a.m51546a(Integer.valueOf(this.f354162g), Integer.valueOf(o222.f354162g)) && C46238a.m51546a(this.f354163h, o222.f354163h) && C46238a.m51546a(Integer.valueOf(this.f354164i), Integer.valueOf(o222.f354164i)) && C46238a.m51546a(this.f354165j, o222.f354165j) && C46238a.m51546a(this.f354166n, o222.f354166n) && C46238a.m51546a(Integer.valueOf(this.f354167o), Integer.valueOf(o222.f354167o)) && C46238a.m51546a(this.f354168p, o222.f354168p) && C46238a.m51546a(Integer.valueOf(this.f354169q), Integer.valueOf(o222.f354169q)) && C46238a.m51546a(this.f354170r, o222.f354170r) && C46238a.m51546a(this.f354171s, o222.f354171s);
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
            } else if (this.f354159d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f354159d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f354159d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f354160e);
                aVar.mo74320g(4, 8, this.f354161f);
                aVar.mo74318e(5, this.f354162g);
                aVar.mo74320g(6, 8, this.f354163h);
                aVar.mo74318e(7, this.f354164i);
                String str = this.f354165j;
                if (str != null) {
                    aVar.mo74323j(8, str);
                }
                String str2 = this.f354166n;
                if (str2 != null) {
                    aVar.mo74323j(9, str2);
                }
                aVar.mo74318e(10, this.f354167o);
                String str3 = this.f354168p;
                if (str3 != null) {
                    aVar.mo74323j(11, str3);
                }
                aVar.mo74318e(12, this.f354169q);
                C64234an2 an22 = this.f354170r;
                if (an22 != null) {
                    aVar.mo74322i(13, an22.computeSize());
                    this.f354170r.writeFields(aVar);
                }
                String str4 = this.f354171s;
                if (str4 != null) {
                    aVar.mo74323j(14, str4);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Buff");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            C51018qv3 qv33 = this.f354159d;
            if (qv33 != null) {
                i3 += C52418a.m58682i(2, qv33.computeSize());
            }
            int e = i3 + C52418a.m58678e(3, this.f354160e) + C52418a.m58680g(4, 8, this.f354161f) + C52418a.m58678e(5, this.f354162g) + C52418a.m58680g(6, 8, this.f354163h) + C52418a.m58678e(7, this.f354164i);
            String str5 = this.f354165j;
            if (str5 != null) {
                e += C52418a.m58683j(8, str5);
            }
            String str6 = this.f354166n;
            if (str6 != null) {
                e += C52418a.m58683j(9, str6);
            }
            int e2 = e + C52418a.m58678e(10, this.f354167o);
            String str7 = this.f354168p;
            if (str7 != null) {
                e2 += C52418a.m58683j(11, str7);
            }
            int e3 = e2 + C52418a.m58678e(12, this.f354169q);
            C64234an2 an23 = this.f354170r;
            if (an23 != null) {
                e3 += C52418a.m58682i(13, an23.computeSize());
            }
            String str8 = this.f354171s;
            return str8 != null ? e3 + C52418a.m58683j(14, str8) : e3;
        } else if (i2 == 2) {
            this.f354161f.clear();
            this.f354163h.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f354159d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Buff");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118449o22 o222 = objArr[1];
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
                        o222.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        o222.f354159d = qv34;
                    }
                    return 0;
                case 3:
                    o222.f354160e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51163rv3 rv32 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv32.mo73356d(bArr3);
                        }
                        o222.f354161f.add(rv32);
                    }
                    return 0;
                case 5:
                    o222.f354162g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64885zm2 zm22 = new C64885zm2();
                        if (bArr4 != null && bArr4.length > 0) {
                            zm22.parseFrom(bArr4);
                        }
                        o222.f354163h.add(zm22);
                    }
                    return 0;
                case 7:
                    o222.f354164i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    o222.f354165j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    o222.f354166n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    o222.f354167o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    o222.f354168p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    o222.f354169q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C64234an2 an24 = new C64234an2();
                        if (bArr5 != null && bArr5.length > 0) {
                            an24.parseFrom(bArr5);
                        }
                        o222.f354170r = an24;
                    }
                    return 0;
                case 14:
                    o222.f354171s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
