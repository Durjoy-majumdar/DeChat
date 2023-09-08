package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.is3 */
public class C49892is3 extends C101820nt3 {

    /* renamed from: d */
    public float f135643d;

    /* renamed from: e */
    public float f135644e;

    /* renamed from: f */
    public float f135645f;

    /* renamed from: g */
    public C89349b f135646g;

    /* renamed from: h */
    public String f135647h;

    /* renamed from: i */
    public boolean f135648i;

    /* renamed from: j */
    public boolean f135649j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49892is3)) {
            return false;
        }
        C49892is3 is32 = (C49892is3) aVar;
        return C46238a.m51546a(this.BaseRequest, is32.BaseRequest) && C46238a.m51546a(Float.valueOf(this.f135643d), Float.valueOf(is32.f135643d)) && C46238a.m51546a(Float.valueOf(this.f135644e), Float.valueOf(is32.f135644e)) && C46238a.m51546a(Float.valueOf(this.f135645f), Float.valueOf(is32.f135645f)) && C46238a.m51546a(this.f135646g, is32.f135646g) && C46238a.m51546a(this.f135647h, is32.f135647h) && C46238a.m51546a(Boolean.valueOf(this.f135648i), Boolean.valueOf(is32.f135648i)) && C46238a.m51546a(Boolean.valueOf(this.f135649j), Boolean.valueOf(is32.f135649j));
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
            aVar.mo74317d(2, this.f135643d);
            aVar.mo74317d(3, this.f135644e);
            aVar.mo74317d(4, this.f135645f);
            C89349b bVar = this.f135646g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            String str = this.f135647h;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            aVar.mo74314a(7, this.f135648i);
            aVar.mo74314a(8, this.f135649j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int d = i2 + C52418a.m58677d(2, this.f135643d) + C52418a.m58677d(3, this.f135644e) + C52418a.m58677d(4, this.f135645f);
            C89349b bVar2 = this.f135646g;
            if (bVar2 != null) {
                d += C52418a.m58675b(5, bVar2);
            }
            String str2 = this.f135647h;
            if (str2 != null) {
                d += C52418a.m58683j(6, str2);
            }
            return d + C52418a.m58674a(7, this.f135648i) + C52418a.m58674a(8, this.f135649j);
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
            C49892is3 is32 = objArr[1];
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
                        is32.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    is32.f135643d = aVar3.mo141628f(intValue);
                    return 0;
                case 3:
                    is32.f135644e = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    is32.f135645f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    is32.f135646g = aVar3.mo141626d(intValue);
                    return 0;
                case 6:
                    is32.f135647h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    is32.f135648i = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    is32.f135649j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
