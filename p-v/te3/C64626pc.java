package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pc */
public class C64626pc extends C101820nt3 {

    /* renamed from: d */
    public long f184808d;

    /* renamed from: e */
    public long f184809e;

    /* renamed from: f */
    public String f184810f;

    /* renamed from: g */
    public int f184811g;

    /* renamed from: h */
    public int f184812h;

    /* renamed from: i */
    public long f184813i;

    /* renamed from: j */
    public long f184814j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64626pc)) {
            return false;
        }
        C64626pc pcVar = (C64626pc) aVar;
        return C46238a.m51546a(this.BaseRequest, pcVar.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f184808d), Long.valueOf(pcVar.f184808d)) && C46238a.m51546a(Long.valueOf(this.f184809e), Long.valueOf(pcVar.f184809e)) && C46238a.m51546a(this.f184810f, pcVar.f184810f) && C46238a.m51546a(Integer.valueOf(this.f184811g), Integer.valueOf(pcVar.f184811g)) && C46238a.m51546a(Integer.valueOf(this.f184812h), Integer.valueOf(pcVar.f184812h)) && C46238a.m51546a(Long.valueOf(this.f184813i), Long.valueOf(pcVar.f184813i)) && C46238a.m51546a(Long.valueOf(this.f184814j), Long.valueOf(pcVar.f184814j));
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
            aVar.mo74321h(2, this.f184808d);
            aVar.mo74321h(3, this.f184809e);
            String str = this.f184810f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f184811g);
            aVar.mo74318e(6, this.f184812h);
            aVar.mo74321h(7, this.f184813i);
            aVar.mo74321h(8, this.f184814j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f184808d) + C52418a.m58681h(3, this.f184809e);
            String str2 = this.f184810f;
            if (str2 != null) {
                h += C52418a.m58683j(4, str2);
            }
            return h + C52418a.m58678e(5, this.f184811g) + C52418a.m58678e(6, this.f184812h) + C52418a.m58681h(7, this.f184813i) + C52418a.m58681h(8, this.f184814j);
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
            C64626pc pcVar = objArr[1];
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
                        pcVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    pcVar.f184808d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    pcVar.f184809e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    pcVar.f184810f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pcVar.f184811g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    pcVar.f184812h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    pcVar.f184813i = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    pcVar.f184814j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
