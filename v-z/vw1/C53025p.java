package vw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.p */
public class C53025p extends C101820nt3 {

    /* renamed from: d */
    public long f148009d;

    /* renamed from: e */
    public int f148010e = 20;

    /* renamed from: f */
    public String f148011f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53025p)) {
            return false;
        }
        C53025p pVar = (C53025p) aVar;
        return C46238a.m51546a(this.BaseRequest, pVar.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f148009d), Long.valueOf(pVar.f148009d)) && C46238a.m51546a(Integer.valueOf(this.f148010e), Integer.valueOf(pVar.f148010e)) && C46238a.m51546a(this.f148011f, pVar.f148011f);
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
            aVar.mo74321h(2, this.f148009d);
            aVar.mo74318e(3, this.f148010e);
            String str = this.f148011f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f148009d) + C52418a.m58678e(3, this.f148010e);
            String str2 = this.f148011f;
            return str2 != null ? h + C52418a.m58683j(4, str2) : h;
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
            C53025p pVar = objArr[1];
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
                    pVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                pVar.f148009d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                pVar.f148010e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                pVar.f148011f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
