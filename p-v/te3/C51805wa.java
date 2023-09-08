package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wa */
public class C51805wa extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<String> f143938d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C50036jt3> f143939e = new LinkedList<>();

    /* renamed from: f */
    public String f143940f;

    /* renamed from: g */
    public long f143941g;

    /* renamed from: h */
    public int f143942h;

    /* renamed from: i */
    public int f143943i;

    /* renamed from: j */
    public LinkedList<C49336ev> f143944j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51805wa)) {
            return false;
        }
        C51805wa waVar = (C51805wa) aVar;
        return C46238a.m51546a(this.BaseRequest, waVar.BaseRequest) && C46238a.m51546a(this.f143938d, waVar.f143938d) && C46238a.m51546a(this.f143939e, waVar.f143939e) && C46238a.m51546a(this.f143940f, waVar.f143940f) && C46238a.m51546a(Long.valueOf(this.f143941g), Long.valueOf(waVar.f143941g)) && C46238a.m51546a(Integer.valueOf(this.f143942h), Integer.valueOf(waVar.f143942h)) && C46238a.m51546a(Integer.valueOf(this.f143943i), Integer.valueOf(waVar.f143943i)) && C46238a.m51546a(this.f143944j, waVar.f143944j);
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
            aVar.mo74320g(2, 1, this.f143938d);
            aVar.mo74320g(3, 8, this.f143939e);
            String str = this.f143940f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74321h(5, this.f143941g);
            aVar.mo74318e(6, this.f143942h);
            aVar.mo74318e(7, this.f143943i);
            aVar.mo74320g(8, 8, this.f143944j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 1, this.f143938d) + C52418a.m58680g(3, 8, this.f143939e);
            String str2 = this.f143940f;
            if (str2 != null) {
                g += C52418a.m58683j(4, str2);
            }
            return g + C52418a.m58681h(5, this.f143941g) + C52418a.m58678e(6, this.f143942h) + C52418a.m58678e(7, this.f143943i) + C52418a.m58680g(8, 8, this.f143944j);
        } else if (i == 2) {
            this.f143938d.clear();
            this.f143939e.clear();
            this.f143944j.clear();
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
            C51805wa waVar = objArr[1];
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
                        waVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    waVar.f143938d.add(aVar3.mo141633k(intValue));
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C50036jt3 jt32 = new C50036jt3();
                        if (bArr2 != null && bArr2.length > 0) {
                            jt32.parseFrom(bArr2);
                        }
                        waVar.f143939e.add(jt32);
                    }
                    return 0;
                case 4:
                    waVar.f143940f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    waVar.f143941g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    waVar.f143942h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    waVar.f143943i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49336ev evVar = new C49336ev();
                        if (bArr3 != null && bArr3.length > 0) {
                            evVar.parseFrom(bArr3);
                        }
                        waVar.f143944j.add(evVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
