package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qo1 */
public class C50990qo1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f140432d;

    /* renamed from: e */
    public String f140433e;

    /* renamed from: f */
    public String f140434f;

    /* renamed from: g */
    public C89349b f140435g;

    /* renamed from: h */
    public float f140436h;

    /* renamed from: i */
    public float f140437i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50990qo1)) {
            return false;
        }
        C50990qo1 qo12 = (C50990qo1) aVar;
        return C46238a.m51546a(this.BaseRequest, qo12.BaseRequest) && C46238a.m51546a(this.f140432d, qo12.f140432d) && C46238a.m51546a(this.f140433e, qo12.f140433e) && C46238a.m51546a(this.f140434f, qo12.f140434f) && C46238a.m51546a(this.f140435g, qo12.f140435g) && C46238a.m51546a(Float.valueOf(this.f140436h), Float.valueOf(qo12.f140436h)) && C46238a.m51546a(Float.valueOf(this.f140437i), Float.valueOf(qo12.f140437i));
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
            C49842ig0 ig02 = this.f140432d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f140432d.writeFields(aVar);
            }
            String str = this.f140433e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f140434f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C89349b bVar = this.f140435g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            aVar.mo74317d(7, this.f140436h);
            aVar.mo74317d(8, this.f140437i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f140432d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f140433e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            String str4 = this.f140434f;
            if (str4 != null) {
                i2 += C52418a.m58683j(4, str4);
            }
            C89349b bVar2 = this.f140435g;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(5, bVar2);
            }
            return i2 + C52418a.m58677d(7, this.f140436h) + C52418a.m58677d(8, this.f140437i);
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
            C50990qo1 qo12 = objArr[1];
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
                        qo12.BaseRequest = iaVar3;
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
                        qo12.f140432d = ig04;
                    }
                    return 0;
                case 3:
                    qo12.f140433e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qo12.f140434f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qo12.f140435g = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    qo12.f140436h = aVar3.mo141628f(intValue);
                    return 0;
                case 8:
                    qo12.f140437i = aVar3.mo141628f(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
