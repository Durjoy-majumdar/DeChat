package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w82 */
public class C78007w82 extends C49335eu3 {

    /* renamed from: d */
    public int f228340d = 0;

    /* renamed from: e */
    public String f228341e = "ok";

    /* renamed from: f */
    public LinkedList<C77994sf2> f228342f = new LinkedList<>();

    /* renamed from: g */
    public String f228343g;

    /* renamed from: h */
    public int f228344h;

    /* renamed from: i */
    public String f228345i;

    /* renamed from: j */
    public LinkedList<String> f228346j = new LinkedList<>();

    /* renamed from: n */
    public int f228347n;

    /* renamed from: o */
    public long f228348o;

    /* renamed from: p */
    public int f228349p;

    /* renamed from: q */
    public String f228350q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78007w82)) {
            return false;
        }
        C78007w82 w822 = (C78007w82) aVar;
        return C46238a.m51546a(this.BaseResponse, w822.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228340d), Integer.valueOf(w822.f228340d)) && C46238a.m51546a(this.f228341e, w822.f228341e) && C46238a.m51546a(this.f228342f, w822.f228342f) && C46238a.m51546a(this.f228343g, w822.f228343g) && C46238a.m51546a(Integer.valueOf(this.f228344h), Integer.valueOf(w822.f228344h)) && C46238a.m51546a(this.f228345i, w822.f228345i) && C46238a.m51546a(this.f228346j, w822.f228346j) && C46238a.m51546a(Integer.valueOf(this.f228347n), Integer.valueOf(w822.f228347n)) && C46238a.m51546a(Long.valueOf(this.f228348o), Long.valueOf(w822.f228348o)) && C46238a.m51546a(Integer.valueOf(this.f228349p), Integer.valueOf(w822.f228349p)) && C46238a.m51546a(this.f228350q, w822.f228350q);
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
                aVar.mo74318e(2, this.f228340d);
                String str = this.f228341e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 8, this.f228342f);
                String str2 = this.f228343g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74318e(6, this.f228344h);
                String str3 = this.f228345i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                aVar.mo74320g(8, 1, this.f228346j);
                aVar.mo74318e(9, this.f228347n);
                aVar.mo74321h(10, this.f228348o);
                aVar.mo74318e(11, this.f228349p);
                String str4 = this.f228350q;
                if (str4 == null) {
                    return 0;
                }
                aVar.mo74323j(12, str4);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = (jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0) + C52418a.m58678e(2, this.f228340d);
            String str5 = this.f228341e;
            if (str5 != null) {
                i3 += C52418a.m58683j(3, str5);
            }
            int g = i3 + C52418a.m58680g(4, 8, this.f228342f);
            String str6 = this.f228343g;
            if (str6 != null) {
                g += C52418a.m58683j(5, str6);
            }
            int e = g + C52418a.m58678e(6, this.f228344h);
            String str7 = this.f228345i;
            if (str7 != null) {
                e += C52418a.m58683j(7, str7);
            }
            int g2 = e + C52418a.m58680g(8, 1, this.f228346j) + C52418a.m58678e(9, this.f228347n) + C52418a.m58681h(10, this.f228348o) + C52418a.m58678e(11, this.f228349p);
            String str8 = this.f228350q;
            return str8 != null ? g2 + C52418a.m58683j(12, str8) : g2;
        } else if (i2 == 2) {
            this.f228342f.clear();
            this.f228346j.clear();
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
            C78007w82 w822 = objArr[1];
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
                        w822.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    w822.f228340d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    w822.f228341e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C77994sf2 sf22 = new C77994sf2();
                        if (bArr2 != null && bArr2.length > 0) {
                            sf22.parseFrom(bArr2);
                        }
                        w822.f228342f.add(sf22);
                    }
                    return 0;
                case 5:
                    w822.f228343g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    w822.f228344h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    w822.f228345i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    w822.f228346j.add(aVar3.mo141633k(intValue));
                    return 0;
                case 9:
                    w822.f228347n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    w822.f228348o = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    w822.f228349p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    w822.f228350q = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
