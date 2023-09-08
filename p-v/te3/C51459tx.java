package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tx */
public class C51459tx extends C101820nt3 {

    /* renamed from: d */
    public int f142460d;

    /* renamed from: e */
    public String f142461e;

    /* renamed from: f */
    public int f142462f;

    /* renamed from: g */
    public C89349b f142463g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51459tx)) {
            return false;
        }
        C51459tx txVar = (C51459tx) aVar;
        return C46238a.m51546a(this.BaseRequest, txVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f142460d), Integer.valueOf(txVar.f142460d)) && C46238a.m51546a(this.f142461e, txVar.f142461e) && C46238a.m51546a(Integer.valueOf(this.f142462f), Integer.valueOf(txVar.f142462f)) && C46238a.m51546a(this.f142463g, txVar.f142463g);
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
            aVar.mo74318e(2, this.f142460d);
            String str = this.f142461e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f142462f);
            C89349b bVar = this.f142463g;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f142460d);
            String str2 = this.f142461e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            int e2 = e + C52418a.m58678e(4, this.f142462f);
            C89349b bVar2 = this.f142463g;
            return bVar2 != null ? e2 + C52418a.m58675b(5, bVar2) : e2;
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
            C51459tx txVar = objArr[1];
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
                    txVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                txVar.f142460d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                txVar.f142461e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                txVar.f142462f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                txVar.f142463g = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
