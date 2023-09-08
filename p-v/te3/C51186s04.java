package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s04 */
public class C51186s04 extends C101820nt3 {

    /* renamed from: d */
    public String f141254d;

    /* renamed from: e */
    public String f141255e;

    /* renamed from: f */
    public long f141256f;

    /* renamed from: g */
    public String f141257g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51186s04)) {
            return false;
        }
        C51186s04 s042 = (C51186s04) aVar;
        return C46238a.m51546a(this.BaseRequest, s042.BaseRequest) && C46238a.m51546a(this.f141254d, s042.f141254d) && C46238a.m51546a(this.f141255e, s042.f141255e) && C46238a.m51546a(Long.valueOf(this.f141256f), Long.valueOf(s042.f141256f)) && C46238a.m51546a(this.f141257g, s042.f141257g);
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
            String str = this.f141254d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f141255e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74321h(4, this.f141256f);
            String str3 = this.f141257g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f141254d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f141255e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int h = i2 + C52418a.m58681h(4, this.f141256f);
            String str6 = this.f141257g;
            return str6 != null ? h + C52418a.m58683j(5, str6) : h;
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
            C51186s04 s042 = objArr[1];
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
                    s042.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                s042.f141254d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                s042.f141255e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                s042.f141256f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                s042.f141257g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
