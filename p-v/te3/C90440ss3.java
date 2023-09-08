package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ss3 */
public class C90440ss3 extends C101820nt3 {

    /* renamed from: d */
    public long f259835d;

    /* renamed from: e */
    public LinkedList<C90406da0> f259836e = new LinkedList<>();

    /* renamed from: f */
    public int f259837f;

    /* renamed from: g */
    public int f259838g;

    /* renamed from: h */
    public C64716sw f259839h;

    /* renamed from: i */
    public LinkedList<C90425kw> f259840i = new LinkedList<>();

    /* renamed from: j */
    public int f259841j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90440ss3)) {
            return false;
        }
        C90440ss3 ss32 = (C90440ss3) aVar;
        return C46238a.m51546a(this.BaseRequest, ss32.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f259835d), Long.valueOf(ss32.f259835d)) && C46238a.m51546a(this.f259836e, ss32.f259836e) && C46238a.m51546a(Integer.valueOf(this.f259837f), Integer.valueOf(ss32.f259837f)) && C46238a.m51546a(Integer.valueOf(this.f259838g), Integer.valueOf(ss32.f259838g)) && C46238a.m51546a(this.f259839h, ss32.f259839h) && C46238a.m51546a(this.f259840i, ss32.f259840i) && C46238a.m51546a(Integer.valueOf(this.f259841j), Integer.valueOf(ss32.f259841j));
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
            aVar.mo74321h(2, this.f259835d);
            aVar.mo74320g(3, 8, this.f259836e);
            aVar.mo74318e(5, this.f259837f);
            aVar.mo74318e(6, this.f259838g);
            C64716sw swVar = this.f259839h;
            if (swVar != null) {
                aVar.mo74322i(7, swVar.computeSize());
                this.f259839h.writeFields(aVar);
            }
            aVar.mo74320g(8, 8, this.f259840i);
            aVar.mo74318e(9, this.f259841j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f259835d) + C52418a.m58680g(3, 8, this.f259836e) + C52418a.m58678e(5, this.f259837f) + C52418a.m58678e(6, this.f259838g);
            C64716sw swVar2 = this.f259839h;
            if (swVar2 != null) {
                h += C52418a.m58682i(7, swVar2.computeSize());
            }
            return h + C52418a.m58680g(8, 8, this.f259840i) + C52418a.m58678e(9, this.f259841j);
        } else if (i == 2) {
            this.f259836e.clear();
            this.f259840i.clear();
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
            C90440ss3 ss32 = objArr[1];
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
                        ss32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    ss32.f259835d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C90406da0 da02 = new C90406da0();
                        if (bArr2 != null && bArr2.length > 0) {
                            da02.parseFrom(bArr2);
                        }
                        ss32.f259836e.add(da02);
                    }
                    return 0;
                case 5:
                    ss32.f259837f = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ss32.f259838g = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64716sw swVar3 = new C64716sw();
                        if (bArr3 != null && bArr3.length > 0) {
                            swVar3.parseFrom(bArr3);
                        }
                        ss32.f259839h = swVar3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C90425kw kwVar = new C90425kw();
                        if (bArr4 != null && bArr4.length > 0) {
                            kwVar.parseFrom(bArr4);
                        }
                        ss32.f259840i.add(kwVar);
                    }
                    return 0;
                case 9:
                    ss32.f259841j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
