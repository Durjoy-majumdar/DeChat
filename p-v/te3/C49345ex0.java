package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ex0 */
public class C49345ex0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f133155d;

    /* renamed from: e */
    public long f133156e;

    /* renamed from: f */
    public long f133157f;

    /* renamed from: g */
    public String f133158g;

    /* renamed from: h */
    public long f133159h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49345ex0)) {
            return false;
        }
        C49345ex0 ex02 = (C49345ex0) aVar;
        return C46238a.m51546a(this.BaseRequest, ex02.BaseRequest) && C46238a.m51546a(this.f133155d, ex02.f133155d) && C46238a.m51546a(Long.valueOf(this.f133156e), Long.valueOf(ex02.f133156e)) && C46238a.m51546a(Long.valueOf(this.f133157f), Long.valueOf(ex02.f133157f)) && C46238a.m51546a(this.f133158g, ex02.f133158g) && C46238a.m51546a(Long.valueOf(this.f133159h), Long.valueOf(ex02.f133159h));
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
            C49842ig0 ig02 = this.f133155d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f133155d.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f133156e);
            aVar.mo74321h(4, this.f133157f);
            String str = this.f133158g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74321h(6, this.f133159h);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f133155d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f133156e) + C52418a.m58681h(4, this.f133157f);
            String str2 = this.f133158g;
            if (str2 != null) {
                h += C52418a.m58683j(5, str2);
            }
            return h + C52418a.m58681h(6, this.f133159h);
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
            C49345ex0 ex02 = objArr[1];
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
                        ex02.BaseRequest = iaVar3;
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
                        ex02.f133155d = ig04;
                    }
                    return 0;
                case 3:
                    ex02.f133156e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    ex02.f133157f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ex02.f133158g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ex02.f133159h = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
