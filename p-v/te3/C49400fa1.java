package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fa1 */
public class C49400fa1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f133380d;

    /* renamed from: e */
    public String f133381e;

    /* renamed from: f */
    public C89349b f133382f;

    /* renamed from: g */
    public long f133383g;

    /* renamed from: h */
    public long f133384h;

    /* renamed from: i */
    public LinkedList<C51280sp2> f133385i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49400fa1)) {
            return false;
        }
        C49400fa1 fa12 = (C49400fa1) aVar;
        return C46238a.m51546a(this.BaseRequest, fa12.BaseRequest) && C46238a.m51546a(this.f133380d, fa12.f133380d) && C46238a.m51546a(this.f133381e, fa12.f133381e) && C46238a.m51546a(this.f133382f, fa12.f133382f) && C46238a.m51546a(Long.valueOf(this.f133383g), Long.valueOf(fa12.f133383g)) && C46238a.m51546a(Long.valueOf(this.f133384h), Long.valueOf(fa12.f133384h)) && C46238a.m51546a(this.f133385i, fa12.f133385i);
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
            C49842ig0 ig02 = this.f133380d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f133380d.writeFields(aVar);
            }
            String str = this.f133381e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f133382f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74321h(5, this.f133383g);
            aVar.mo74321h(6, this.f133384h);
            aVar.mo74320g(7, 8, this.f133385i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f133380d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f133381e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f133382f;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(4, bVar2);
            }
            return i2 + C52418a.m58681h(5, this.f133383g) + C52418a.m58681h(6, this.f133384h) + C52418a.m58680g(7, 8, this.f133385i);
        } else if (i == 2) {
            this.f133385i.clear();
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
            C49400fa1 fa12 = objArr[1];
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
                        fa12.BaseRequest = iaVar3;
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
                        fa12.f133380d = ig04;
                    }
                    return 0;
                case 3:
                    fa12.f133381e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fa12.f133382f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    fa12.f133383g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    fa12.f133384h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51280sp2 sp22 = new C51280sp2();
                        if (bArr3 != null && bArr3.length > 0) {
                            sp22.parseFrom(bArr3);
                        }
                        fa12.f133385i.add(sp22);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
