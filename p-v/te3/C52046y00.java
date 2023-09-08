package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y00 */
public class C52046y00 extends C101820nt3 {

    /* renamed from: d */
    public C51163rv3 f145055d;

    /* renamed from: e */
    public int f145056e;

    /* renamed from: f */
    public LinkedList<C49762hw2> f145057f = new LinkedList<>();

    /* renamed from: g */
    public int f145058g;

    /* renamed from: h */
    public C51018qv3 f145059h;

    /* renamed from: i */
    public String f145060i;

    /* renamed from: j */
    public String f145061j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52046y00)) {
            return false;
        }
        C52046y00 y002 = (C52046y00) aVar;
        return C46238a.m51546a(this.BaseRequest, y002.BaseRequest) && C46238a.m51546a(this.f145055d, y002.f145055d) && C46238a.m51546a(Integer.valueOf(this.f145056e), Integer.valueOf(y002.f145056e)) && C46238a.m51546a(this.f145057f, y002.f145057f) && C46238a.m51546a(Integer.valueOf(this.f145058g), Integer.valueOf(y002.f145058g)) && C46238a.m51546a(this.f145059h, y002.f145059h) && C46238a.m51546a(this.f145060i, y002.f145060i) && C46238a.m51546a(this.f145061j, y002.f145061j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f145055d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                C51163rv3 rv32 = this.f145055d;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f145055d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f145056e);
                aVar.mo74320g(4, 8, this.f145057f);
                aVar.mo74318e(5, this.f145058g);
                C51018qv3 qv32 = this.f145059h;
                if (qv32 != null) {
                    aVar.mo74322i(6, qv32.computeSize());
                    this.f145059h.writeFields(aVar);
                }
                String str = this.f145060i;
                if (str != null) {
                    aVar.mo74323j(7, str);
                }
                String str2 = this.f145061j;
                if (str2 != null) {
                    aVar.mo74323j(8, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Topic");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C51163rv3 rv33 = this.f145055d;
            if (rv33 != null) {
                i2 += C52418a.m58682i(2, rv33.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f145056e) + C52418a.m58680g(4, 8, this.f145057f) + C52418a.m58678e(5, this.f145058g);
            C51018qv3 qv33 = this.f145059h;
            if (qv33 != null) {
                e += C52418a.m58682i(6, qv33.computeSize());
            }
            String str3 = this.f145060i;
            if (str3 != null) {
                e += C52418a.m58683j(7, str3);
            }
            String str4 = this.f145061j;
            return str4 != null ? e + C52418a.m58683j(8, str4) : e;
        } else if (i == 2) {
            this.f145057f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f145055d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Topic");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52046y00 y002 = objArr[1];
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
                        y002.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv34.mo73356d(bArr2);
                        }
                        y002.f145055d = rv34;
                    }
                    return 0;
                case 3:
                    y002.f145056e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49762hw2 hw22 = new C49762hw2();
                        if (bArr3 != null && bArr3.length > 0) {
                            hw22.parseFrom(bArr3);
                        }
                        y002.f145057f.add(hw22);
                    }
                    return 0;
                case 5:
                    y002.f145058g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv34.mo73348f(bArr4);
                        }
                        y002.f145059h = qv34;
                    }
                    return 0;
                case 7:
                    y002.f145060i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    y002.f145061j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
