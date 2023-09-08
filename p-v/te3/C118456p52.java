package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p52 */
public class C118456p52 extends C49335eu3 {

    /* renamed from: d */
    public int f354218d;

    /* renamed from: e */
    public LinkedList<C118452o93> f354219e = new LinkedList<>();

    /* renamed from: f */
    public int f354220f;

    /* renamed from: g */
    public int f354221g;

    /* renamed from: h */
    public C51018qv3 f354222h;

    /* renamed from: i */
    public String f354223i;

    /* renamed from: j */
    public String f354224j;

    /* renamed from: n */
    public String f354225n;

    /* renamed from: o */
    public String f354226o;

    /* renamed from: p */
    public int f354227p;

    /* renamed from: q */
    public String f354228q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118456p52)) {
            return false;
        }
        C118456p52 p522 = (C118456p52) aVar;
        return C46238a.m51546a(this.BaseResponse, p522.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f354218d), Integer.valueOf(p522.f354218d)) && C46238a.m51546a(this.f354219e, p522.f354219e) && C46238a.m51546a(Integer.valueOf(this.f354220f), Integer.valueOf(p522.f354220f)) && C46238a.m51546a(Integer.valueOf(this.f354221g), Integer.valueOf(p522.f354221g)) && C46238a.m51546a(this.f354222h, p522.f354222h) && C46238a.m51546a(this.f354223i, p522.f354223i) && C46238a.m51546a(this.f354224j, p522.f354224j) && C46238a.m51546a(this.f354225n, p522.f354225n) && C46238a.m51546a(this.f354226o, p522.f354226o) && C46238a.m51546a(Integer.valueOf(this.f354227p), Integer.valueOf(p522.f354227p)) && C46238a.m51546a(this.f354228q, p522.f354228q);
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
            } else if (this.f354222h != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f354218d);
                aVar.mo74320g(3, 8, this.f354219e);
                aVar.mo74318e(4, this.f354220f);
                aVar.mo74318e(5, this.f354221g);
                C51018qv3 qv32 = this.f354222h;
                if (qv32 != null) {
                    aVar.mo74322i(6, qv32.computeSize());
                    this.f354222h.writeFields(aVar);
                }
                String str = this.f354223i;
                if (str != null) {
                    aVar.mo74323j(7, str);
                }
                String str2 = this.f354224j;
                if (str2 != null) {
                    aVar.mo74323j(8, str2);
                }
                String str3 = this.f354225n;
                if (str3 != null) {
                    aVar.mo74323j(9, str3);
                }
                String str4 = this.f354226o;
                if (str4 != null) {
                    aVar.mo74323j(10, str4);
                }
                aVar.mo74318e(11, this.f354227p);
                String str5 = this.f354228q;
                if (str5 != null) {
                    aVar.mo74323j(12, str5);
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
            int e = i3 + C52418a.m58678e(2, this.f354218d) + C52418a.m58680g(3, 8, this.f354219e) + C52418a.m58678e(4, this.f354220f) + C52418a.m58678e(5, this.f354221g);
            C51018qv3 qv33 = this.f354222h;
            if (qv33 != null) {
                e += C52418a.m58682i(6, qv33.computeSize());
            }
            String str6 = this.f354223i;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            String str7 = this.f354224j;
            if (str7 != null) {
                e += C52418a.m58683j(8, str7);
            }
            String str8 = this.f354225n;
            if (str8 != null) {
                e += C52418a.m58683j(9, str8);
            }
            String str9 = this.f354226o;
            if (str9 != null) {
                e += C52418a.m58683j(10, str9);
            }
            int e2 = e + C52418a.m58678e(11, this.f354227p);
            String str10 = this.f354228q;
            return str10 != null ? e2 + C52418a.m58683j(12, str10) : e2;
        } else if (i2 == 2) {
            this.f354219e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f354222h != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Buff");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118456p52 p522 = objArr[1];
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
                        p522.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    p522.f354218d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C118452o93 o932 = new C118452o93();
                        if (bArr2 != null && bArr2.length > 0) {
                            o932.parseFrom(bArr2);
                        }
                        p522.f354219e.add(o932);
                    }
                    return 0;
                case 4:
                    p522.f354220f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    p522.f354221g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv34.mo73348f(bArr3);
                        }
                        p522.f354222h = qv34;
                    }
                    return 0;
                case 7:
                    p522.f354223i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    p522.f354224j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    p522.f354225n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    p522.f354226o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    p522.f354227p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    p522.f354228q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
