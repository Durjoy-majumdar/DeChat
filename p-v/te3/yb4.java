package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class yb4 extends C101820nt3 {

    /* renamed from: d */
    public String f145219d;

    /* renamed from: e */
    public String f145220e;

    /* renamed from: f */
    public int f145221f;

    /* renamed from: g */
    public long f145222g;

    /* renamed from: h */
    public long f145223h;

    /* renamed from: i */
    public int f145224i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof yb4)) {
            return false;
        }
        yb4 yb4 = (yb4) aVar;
        return C46238a.m51546a(this.BaseRequest, yb4.BaseRequest) && C46238a.m51546a(this.f145219d, yb4.f145219d) && C46238a.m51546a(this.f145220e, yb4.f145220e) && C46238a.m51546a(Integer.valueOf(this.f145221f), Integer.valueOf(yb4.f145221f)) && C46238a.m51546a(Long.valueOf(this.f145222g), Long.valueOf(yb4.f145222g)) && C46238a.m51546a(Long.valueOf(this.f145223h), Long.valueOf(yb4.f145223h)) && C46238a.m51546a(Integer.valueOf(this.f145224i), Integer.valueOf(yb4.f145224i));
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
            String str = this.f145219d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f145220e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f145221f);
            aVar.mo74321h(5, this.f145222g);
            aVar.mo74321h(6, this.f145223h);
            aVar.mo74318e(7, this.f145224i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f145219d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f145220e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58678e(4, this.f145221f) + C52418a.m58681h(5, this.f145222g) + C52418a.m58681h(6, this.f145223h) + C52418a.m58678e(7, this.f145224i);
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
            yb4 yb4 = objArr[1];
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
                        yb4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    yb4.f145219d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    yb4.f145220e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    yb4.f145221f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    yb4.f145222g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    yb4.f145223h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    yb4.f145224i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
