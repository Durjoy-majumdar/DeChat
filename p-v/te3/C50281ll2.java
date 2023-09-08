package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ll2 */
public class C50281ll2 extends C101820nt3 {

    /* renamed from: d */
    public String f137503d;

    /* renamed from: e */
    public LinkedList<String> f137504e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<Integer> f137505f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50281ll2)) {
            return false;
        }
        C50281ll2 ll22 = (C50281ll2) aVar;
        return C46238a.m51546a(this.BaseRequest, ll22.BaseRequest) && C46238a.m51546a(this.f137503d, ll22.f137503d) && C46238a.m51546a(this.f137504e, ll22.f137504e) && C46238a.m51546a(this.f137505f, ll22.f137505f);
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
            String str = this.f137503d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f137504e);
            aVar.mo74320g(4, 2, this.f137505f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f137503d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58680g(3, 1, this.f137504e) + C52418a.m58680g(4, 2, this.f137505f);
        } else if (i == 2) {
            this.f137504e.clear();
            this.f137505f.clear();
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
            C50281ll2 ll22 = objArr[1];
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
                    ll22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ll22.f137503d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ll22.f137504e.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ll22.f137505f.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            }
        }
    }
}
