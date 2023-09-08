package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lk1 */
public class C50276lk1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f137482d;

    /* renamed from: e */
    public long f137483e;

    /* renamed from: f */
    public C89349b f137484f;

    /* renamed from: g */
    public long f137485g;

    /* renamed from: h */
    public String f137486h;

    /* renamed from: i */
    public int f137487i;

    /* renamed from: j */
    public String f137488j;

    /* renamed from: n */
    public long f137489n;

    /* renamed from: o */
    public long f137490o;

    /* renamed from: p */
    public C50280ll1 f137491p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50276lk1)) {
            return false;
        }
        C50276lk1 lk12 = (C50276lk1) aVar;
        return C46238a.m51546a(this.BaseRequest, lk12.BaseRequest) && C46238a.m51546a(this.f137482d, lk12.f137482d) && C46238a.m51546a(Long.valueOf(this.f137483e), Long.valueOf(lk12.f137483e)) && C46238a.m51546a(this.f137484f, lk12.f137484f) && C46238a.m51546a(Long.valueOf(this.f137485g), Long.valueOf(lk12.f137485g)) && C46238a.m51546a(this.f137486h, lk12.f137486h) && C46238a.m51546a(Integer.valueOf(this.f137487i), Integer.valueOf(lk12.f137487i)) && C46238a.m51546a(this.f137488j, lk12.f137488j) && C46238a.m51546a(Long.valueOf(this.f137489n), Long.valueOf(lk12.f137489n)) && C46238a.m51546a(Long.valueOf(this.f137490o), Long.valueOf(lk12.f137490o)) && C46238a.m51546a(this.f137491p, lk12.f137491p);
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
            C49842ig0 ig02 = this.f137482d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f137482d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f137483e);
            C89349b bVar = this.f137484f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74321h(5, this.f137485g);
            String str = this.f137486h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            aVar.mo74318e(7, this.f137487i);
            String str2 = this.f137488j;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            aVar.mo74321h(9, this.f137489n);
            aVar.mo74321h(10, this.f137490o);
            C50280ll1 ll12 = this.f137491p;
            if (ll12 != null) {
                aVar.mo74322i(11, ll12.computeSize());
                this.f137491p.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f137482d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f137483e);
            C89349b bVar2 = this.f137484f;
            if (bVar2 != null) {
                h += C52418a.m58675b(4, bVar2);
            }
            int h2 = h + C52418a.m58681h(5, this.f137485g);
            String str3 = this.f137486h;
            if (str3 != null) {
                h2 += C52418a.m58683j(6, str3);
            }
            int e = h2 + C52418a.m58678e(7, this.f137487i);
            String str4 = this.f137488j;
            if (str4 != null) {
                e += C52418a.m58683j(8, str4);
            }
            int h3 = e + C52418a.m58681h(9, this.f137489n) + C52418a.m58681h(10, this.f137490o);
            C50280ll1 ll13 = this.f137491p;
            return ll13 != null ? h3 + C52418a.m58682i(11, ll13.computeSize()) : h3;
        } else if (i == 2) {
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
            C50276lk1 lk12 = objArr[1];
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
                        lk12.BaseRequest = iaVar3;
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
                        lk12.f137482d = ig04;
                    }
                    return 0;
                case 3:
                    lk12.f137483e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    lk12.f137484f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    lk12.f137485g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    lk12.f137486h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    lk12.f137487i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    lk12.f137488j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    lk12.f137489n = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    lk12.f137490o = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50280ll1 ll14 = new C50280ll1();
                        if (bArr3 != null && bArr3.length > 0) {
                            ll14.parseFrom(bArr3);
                        }
                        lk12.f137491p = ll14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
