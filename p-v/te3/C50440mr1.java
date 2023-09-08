package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mr1 */
public class C50440mr1 extends C101820nt3 {

    /* renamed from: d */
    public String f138166d;

    /* renamed from: e */
    public LinkedList<String> f138167e = new LinkedList<>();

    /* renamed from: f */
    public String f138168f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50440mr1)) {
            return false;
        }
        C50440mr1 mr12 = (C50440mr1) aVar;
        return C46238a.m51546a(this.BaseRequest, mr12.BaseRequest) && C46238a.m51546a(this.f138166d, mr12.f138166d) && C46238a.m51546a(this.f138167e, mr12.f138167e) && C46238a.m51546a(this.f138168f, mr12.f138168f);
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
            String str = this.f138166d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f138167e);
            String str2 = this.f138168f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f138166d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f138167e);
            String str4 = this.f138168f;
            return str4 != null ? g + C52418a.m58683j(4, str4) : g;
        } else if (i == 2) {
            this.f138167e.clear();
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
            C50440mr1 mr12 = objArr[1];
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
                    mr12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                mr12.f138166d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                mr12.f138167e.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                mr12.f138168f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
