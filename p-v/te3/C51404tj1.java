package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tj1 */
public class C51404tj1 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f142244d;

    /* renamed from: e */
    public C89349b f142245e;

    /* renamed from: f */
    public String f142246f;

    /* renamed from: g */
    public String f142247g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51404tj1)) {
            return false;
        }
        C51404tj1 tj12 = (C51404tj1) aVar;
        return C46238a.m51546a(this.BaseRequest, tj12.BaseRequest) && C46238a.m51546a(this.f142244d, tj12.f142244d) && C46238a.m51546a(this.f142245e, tj12.f142245e) && C46238a.m51546a(this.f142246f, tj12.f142246f) && C46238a.m51546a(this.f142247g, tj12.f142247g);
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
            C49842ig0 ig02 = this.f142244d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f142244d.writeFields(aVar);
            }
            C89349b bVar = this.f142245e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str = this.f142246f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f142247g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f142244d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            C89349b bVar2 = this.f142245e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            String str3 = this.f142246f;
            if (str3 != null) {
                i2 += C52418a.m58683j(4, str3);
            }
            String str4 = this.f142247g;
            return str4 != null ? i2 + C52418a.m58683j(5, str4) : i2;
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
            C51404tj1 tj12 = objArr[1];
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
                    tj12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    tj12.f142244d = ig04;
                }
                return 0;
            } else if (intValue == 3) {
                tj12.f142245e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 4) {
                tj12.f142246f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                tj12.f142247g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
