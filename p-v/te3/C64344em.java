package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import t14.C77820c;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.em */
public class C64344em extends C49335eu3 {

    /* renamed from: d */
    public int f182995d;

    /* renamed from: e */
    public String f182996e;

    /* renamed from: f */
    public C77820c f182997f;

    /* renamed from: g */
    public long f182998g;

    /* renamed from: h */
    public int f182999h;

    /* renamed from: i */
    public LinkedList<String> f183000i = new LinkedList<>();

    /* renamed from: j */
    public int f183001j;

    /* renamed from: n */
    public String f183002n;

    /* renamed from: o */
    public String f183003o;

    /* renamed from: p */
    public String f183004p;

    /* renamed from: q */
    public String f183005q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64344em)) {
            return false;
        }
        C64344em emVar = (C64344em) aVar;
        return C46238a.m51546a(this.BaseResponse, emVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f182995d), Integer.valueOf(emVar.f182995d)) && C46238a.m51546a(this.f182996e, emVar.f182996e) && C46238a.m51546a(this.f182997f, emVar.f182997f) && C46238a.m51546a(Long.valueOf(this.f182998g), Long.valueOf(emVar.f182998g)) && C46238a.m51546a(Integer.valueOf(this.f182999h), Integer.valueOf(emVar.f182999h)) && C46238a.m51546a(this.f183000i, emVar.f183000i) && C46238a.m51546a(Integer.valueOf(this.f183001j), Integer.valueOf(emVar.f183001j)) && C46238a.m51546a(this.f183002n, emVar.f183002n) && C46238a.m51546a(this.f183003o, emVar.f183003o) && C46238a.m51546a(this.f183004p, emVar.f183004p) && C46238a.m51546a(this.f183005q, emVar.f183005q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f182995d);
                String str = this.f182996e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C77820c cVar = this.f182997f;
                if (cVar != null) {
                    aVar.mo74322i(4, cVar.computeSize());
                    this.f182997f.writeFields(aVar);
                }
                aVar.mo74321h(5, this.f182998g);
                aVar.mo74318e(6, this.f182999h);
                aVar.mo74320g(7, 1, this.f183000i);
                aVar.mo74318e(8, this.f183001j);
                String str2 = this.f183002n;
                if (str2 != null) {
                    aVar.mo74323j(9, str2);
                }
                String str3 = this.f183003o;
                if (str3 != null) {
                    aVar.mo74323j(10, str3);
                }
                String str4 = this.f183004p;
                if (str4 != null) {
                    aVar.mo74323j(11, str4);
                }
                String str5 = this.f183005q;
                if (str5 == null) {
                    return 0;
                }
                aVar.mo74323j(12, str5);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = (jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0) + C52418a.m58678e(2, this.f182995d);
            String str6 = this.f182996e;
            if (str6 != null) {
                i3 += C52418a.m58683j(3, str6);
            }
            C77820c cVar2 = this.f182997f;
            if (cVar2 != null) {
                i3 += C52418a.m58682i(4, cVar2.computeSize());
            }
            int h = i3 + C52418a.m58681h(5, this.f182998g) + C52418a.m58678e(6, this.f182999h) + C52418a.m58680g(7, 1, this.f183000i) + C52418a.m58678e(8, this.f183001j);
            String str7 = this.f183002n;
            if (str7 != null) {
                h += C52418a.m58683j(9, str7);
            }
            String str8 = this.f183003o;
            if (str8 != null) {
                h += C52418a.m58683j(10, str8);
            }
            String str9 = this.f183004p;
            if (str9 != null) {
                h += C52418a.m58683j(11, str9);
            }
            String str10 = this.f183005q;
            return str10 != null ? h + C52418a.m58683j(12, str10) : h;
        } else if (i2 == 2) {
            this.f183000i.clear();
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
            C64344em emVar = objArr[1];
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
                        emVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    emVar.f182995d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    emVar.f182996e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C77820c cVar3 = new C77820c();
                        if (bArr2 != null && bArr2.length > 0) {
                            cVar3.parseFrom(bArr2);
                        }
                        emVar.f182997f = cVar3;
                    }
                    return 0;
                case 5:
                    emVar.f182998g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    emVar.f182999h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    emVar.f183000i.add(aVar3.mo141633k(intValue));
                    return 0;
                case 8:
                    emVar.f183001j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    emVar.f183002n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    emVar.f183003o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    emVar.f183004p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    emVar.f183005q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
