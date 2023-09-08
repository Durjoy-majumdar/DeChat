package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lx0 */
public class C50322lx0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f137685d;

    /* renamed from: e */
    public String f137686e;

    /* renamed from: f */
    public C89349b f137687f;

    /* renamed from: g */
    public long f137688g;

    /* renamed from: h */
    public long f137689h;

    /* renamed from: i */
    public LinkedList<C51280sp2> f137690i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50322lx0)) {
            return false;
        }
        C50322lx0 lx02 = (C50322lx0) aVar;
        return C46238a.m51546a(this.BaseRequest, lx02.BaseRequest) && C46238a.m51546a(this.f137685d, lx02.f137685d) && C46238a.m51546a(this.f137686e, lx02.f137686e) && C46238a.m51546a(this.f137687f, lx02.f137687f) && C46238a.m51546a(Long.valueOf(this.f137688g), Long.valueOf(lx02.f137688g)) && C46238a.m51546a(Long.valueOf(this.f137689h), Long.valueOf(lx02.f137689h)) && C46238a.m51546a(this.f137690i, lx02.f137690i);
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
            C49842ig0 ig02 = this.f137685d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f137685d.writeFields(aVar);
            }
            String str = this.f137686e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f137687f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74321h(5, this.f137688g);
            aVar.mo74321h(6, this.f137689h);
            aVar.mo74320g(7, 8, this.f137690i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f137685d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f137686e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f137687f;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(4, bVar2);
            }
            return i2 + C52418a.m58681h(5, this.f137688g) + C52418a.m58681h(6, this.f137689h) + C52418a.m58680g(7, 8, this.f137690i);
        } else if (i == 2) {
            this.f137690i.clear();
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
            C50322lx0 lx02 = objArr[1];
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
                        lx02.BaseRequest = iaVar3;
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
                        lx02.f137685d = ig04;
                    }
                    return 0;
                case 3:
                    lx02.f137686e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    lx02.f137687f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    lx02.f137688g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    lx02.f137689h = aVar3.mo141631i(intValue);
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
                        lx02.f137690i.add(sp22);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
