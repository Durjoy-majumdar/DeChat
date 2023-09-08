package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h22 */
public class C49646h22 extends C101820nt3 {

    /* renamed from: d */
    public long f134412d;

    /* renamed from: e */
    public int f134413e;

    /* renamed from: f */
    public String f134414f;

    /* renamed from: g */
    public String f134415g;

    /* renamed from: h */
    public int f134416h;

    /* renamed from: i */
    public String f134417i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49646h22)) {
            return false;
        }
        C49646h22 h222 = (C49646h22) aVar;
        return C46238a.m51546a(this.BaseRequest, h222.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f134412d), Long.valueOf(h222.f134412d)) && C46238a.m51546a(Integer.valueOf(this.f134413e), Integer.valueOf(h222.f134413e)) && C46238a.m51546a(this.f134414f, h222.f134414f) && C46238a.m51546a(this.f134415g, h222.f134415g) && C46238a.m51546a(Integer.valueOf(this.f134416h), Integer.valueOf(h222.f134416h)) && C46238a.m51546a(this.f134417i, h222.f134417i);
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
            aVar.mo74321h(2, this.f134412d);
            aVar.mo74318e(3, this.f134413e);
            String str = this.f134414f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f134415g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f134416h);
            String str3 = this.f134417i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f134412d) + C52418a.m58678e(3, this.f134413e);
            String str4 = this.f134414f;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            String str5 = this.f134415g;
            if (str5 != null) {
                h += C52418a.m58683j(5, str5);
            }
            int e = h + C52418a.m58678e(6, this.f134416h);
            String str6 = this.f134417i;
            return str6 != null ? e + C52418a.m58683j(7, str6) : e;
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
            C49646h22 h222 = objArr[1];
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
                        h222.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    h222.f134412d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    h222.f134413e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    h222.f134414f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    h222.f134415g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    h222.f134416h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    h222.f134417i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
