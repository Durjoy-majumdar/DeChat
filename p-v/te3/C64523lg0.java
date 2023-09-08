package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lg0 */
public class C64523lg0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f184092d;

    /* renamed from: e */
    public LinkedList<C64800wf1> f184093e = new LinkedList<>();

    /* renamed from: f */
    public int f184094f;

    /* renamed from: g */
    public int f184095g;

    /* renamed from: h */
    public int f184096h;

    /* renamed from: i */
    public String f184097i;

    /* renamed from: j */
    public String f184098j;

    /* renamed from: n */
    public String f184099n;

    /* renamed from: o */
    public LinkedList<Integer> f184100o = new LinkedList<>();

    /* renamed from: p */
    public boolean f184101p;

    /* renamed from: q */
    public int f184102q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64523lg0)) {
            return false;
        }
        C64523lg0 lg02 = (C64523lg0) aVar;
        return C46238a.m51546a(this.BaseRequest, lg02.BaseRequest) && C46238a.m51546a(this.f184092d, lg02.f184092d) && C46238a.m51546a(this.f184093e, lg02.f184093e) && C46238a.m51546a(Integer.valueOf(this.f184094f), Integer.valueOf(lg02.f184094f)) && C46238a.m51546a(Integer.valueOf(this.f184095g), Integer.valueOf(lg02.f184095g)) && C46238a.m51546a(Integer.valueOf(this.f184096h), Integer.valueOf(lg02.f184096h)) && C46238a.m51546a(this.f184097i, lg02.f184097i) && C46238a.m51546a(this.f184098j, lg02.f184098j) && C46238a.m51546a(this.f184099n, lg02.f184099n) && C46238a.m51546a(this.f184100o, lg02.f184100o) && C46238a.m51546a(Boolean.valueOf(this.f184101p), Boolean.valueOf(lg02.f184101p)) && C46238a.m51546a(Integer.valueOf(this.f184102q), Integer.valueOf(lg02.f184102q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f184092d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f184092d.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f184093e);
            aVar.mo74318e(4, this.f184094f);
            aVar.mo74318e(5, this.f184095g);
            aVar.mo74318e(6, this.f184096h);
            String str = this.f184097i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            String str2 = this.f184098j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            String str3 = this.f184099n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74320g(10, 2, this.f184100o);
            aVar.mo74314a(11, this.f184101p);
            aVar.mo74318e(12, this.f184102q);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f184092d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f184093e) + C52418a.m58678e(4, this.f184094f) + C52418a.m58678e(5, this.f184095g) + C52418a.m58678e(6, this.f184096h);
            String str4 = this.f184097i;
            if (str4 != null) {
                g += C52418a.m58683j(7, str4);
            }
            String str5 = this.f184098j;
            if (str5 != null) {
                g += C52418a.m58683j(8, str5);
            }
            String str6 = this.f184099n;
            if (str6 != null) {
                g += C52418a.m58683j(9, str6);
            }
            return g + C52418a.m58680g(10, 2, this.f184100o) + C52418a.m58674a(11, this.f184101p) + C52418a.m58678e(12, this.f184102q);
        } else if (i == 2) {
            this.f184093e.clear();
            this.f184100o.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64523lg0 lg02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        lg02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        lg02.f184092d = ig04;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64800wf1 wf12 = new C64800wf1();
                        if (bArr3 != null && bArr3.length > 0) {
                            wf12.parseFrom(bArr3);
                        }
                        lg02.f184093e.add(wf12);
                    }
                    return 0;
                case 4:
                    lg02.f184094f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    lg02.f184095g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    lg02.f184096h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    lg02.f184097i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    lg02.f184098j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    lg02.f184099n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    lg02.f184100o.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 11:
                    lg02.f184101p = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    lg02.f184102q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
