package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sb1 */
public class C51220sb1 extends C101820nt3 {

    /* renamed from: d */
    public long f141420d;

    /* renamed from: e */
    public String f141421e;

    /* renamed from: f */
    public long f141422f;

    /* renamed from: g */
    public String f141423g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51220sb1)) {
            return false;
        }
        C51220sb1 sb12 = (C51220sb1) aVar;
        return C46238a.m51546a(this.BaseRequest, sb12.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f141420d), Long.valueOf(sb12.f141420d)) && C46238a.m51546a(this.f141421e, sb12.f141421e) && C46238a.m51546a(Long.valueOf(this.f141422f), Long.valueOf(sb12.f141422f)) && C46238a.m51546a(this.f141423g, sb12.f141423g);
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
            aVar.mo74321h(2, this.f141420d);
            String str = this.f141421e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f141422f);
            String str2 = this.f141423g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f141420d);
            String str3 = this.f141421e;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            int h2 = h + C52418a.m58681h(4, this.f141422f);
            String str4 = this.f141423g;
            return str4 != null ? h2 + C52418a.m58683j(5, str4) : h2;
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
            C51220sb1 sb12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    sb12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                sb12.f141420d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                sb12.f141421e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                sb12.f141422f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                sb12.f141423g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
