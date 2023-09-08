package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pk3 */
public class C50843pk3 extends C49335eu3 {

    /* renamed from: d */
    public int f139805d;

    /* renamed from: e */
    public String f139806e;

    /* renamed from: f */
    public String f139807f;

    /* renamed from: g */
    public long f139808g;

    /* renamed from: h */
    public long f139809h;

    /* renamed from: i */
    public C51879wu3 f139810i;

    /* renamed from: j */
    public eh4 f139811j;

    /* renamed from: n */
    public String f139812n;

    /* renamed from: o */
    public int f139813o;

    /* renamed from: p */
    public String f139814p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50843pk3)) {
            return false;
        }
        C50843pk3 pk32 = (C50843pk3) aVar;
        return C46238a.m51546a(this.BaseResponse, pk32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f139805d), Integer.valueOf(pk32.f139805d)) && C46238a.m51546a(this.f139806e, pk32.f139806e) && C46238a.m51546a(this.f139807f, pk32.f139807f) && C46238a.m51546a(Long.valueOf(this.f139808g), Long.valueOf(pk32.f139808g)) && C46238a.m51546a(Long.valueOf(this.f139809h), Long.valueOf(pk32.f139809h)) && C46238a.m51546a(this.f139810i, pk32.f139810i) && C46238a.m51546a(this.f139811j, pk32.f139811j) && C46238a.m51546a(this.f139812n, pk32.f139812n) && C46238a.m51546a(Integer.valueOf(this.f139813o), Integer.valueOf(pk32.f139813o)) && C46238a.m51546a(this.f139814p, pk32.f139814p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f139805d);
                String str = this.f139806e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f139807f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74321h(5, this.f139808g);
                aVar.mo74321h(6, this.f139809h);
                C51879wu3 wu32 = this.f139810i;
                if (wu32 != null) {
                    aVar.mo74322i(7, wu32.computeSize());
                    this.f139810i.writeFields(aVar);
                }
                eh4 eh4 = this.f139811j;
                if (eh4 != null) {
                    aVar.mo74322i(8, eh4.computeSize());
                    this.f139811j.writeFields(aVar);
                }
                String str3 = this.f139812n;
                if (str3 != null) {
                    aVar.mo74323j(9, str3);
                }
                aVar.mo74318e(10, this.f139813o);
                String str4 = this.f139814p;
                if (str4 != null) {
                    aVar.mo74323j(11, str4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139805d);
            String str5 = this.f139806e;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f139807f;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            int h = e + C52418a.m58681h(5, this.f139808g) + C52418a.m58681h(6, this.f139809h);
            C51879wu3 wu33 = this.f139810i;
            if (wu33 != null) {
                h += C52418a.m58682i(7, wu33.computeSize());
            }
            eh4 eh42 = this.f139811j;
            if (eh42 != null) {
                h += C52418a.m58682i(8, eh42.computeSize());
            }
            String str7 = this.f139812n;
            if (str7 != null) {
                h += C52418a.m58683j(9, str7);
            }
            int e2 = h + C52418a.m58678e(10, this.f139813o);
            String str8 = this.f139814p;
            return str8 != null ? e2 + C52418a.m58683j(11, str8) : e2;
        } else if (i == 2) {
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
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50843pk3 pk32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        pk32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    pk32.f139805d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    pk32.f139806e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pk32.f139807f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pk32.f139808g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    pk32.f139809h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51879wu3 wu34 = new C51879wu3();
                        if (bArr2 != null && bArr2.length > 0) {
                            wu34.parseFrom(bArr2);
                        }
                        pk32.f139810i = wu34;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        eh4 eh43 = new eh4();
                        if (bArr3 != null && bArr3.length > 0) {
                            eh43.parseFrom(bArr3);
                        }
                        pk32.f139811j = eh43;
                    }
                    return 0;
                case 9:
                    pk32.f139812n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    pk32.f139813o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    pk32.f139814p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
