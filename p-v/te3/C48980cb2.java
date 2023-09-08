package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cb2 */
public class C48980cb2 extends C101820nt3 {

    /* renamed from: d */
    public String f131619d;

    /* renamed from: e */
    public int f131620e;

    /* renamed from: f */
    public LinkedList<C51163rv3> f131621f = new LinkedList<>();

    /* renamed from: g */
    public int f131622g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48980cb2)) {
            return false;
        }
        C48980cb2 cb22 = (C48980cb2) aVar;
        return C46238a.m51546a(this.BaseRequest, cb22.BaseRequest) && C46238a.m51546a(this.f131619d, cb22.f131619d) && C46238a.m51546a(Integer.valueOf(this.f131620e), Integer.valueOf(cb22.f131620e)) && C46238a.m51546a(this.f131621f, cb22.f131621f) && C46238a.m51546a(Integer.valueOf(this.f131622g), Integer.valueOf(cb22.f131622g));
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
            String str = this.f131619d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f131620e);
            aVar.mo74320g(4, 8, this.f131621f);
            aVar.mo74318e(5, this.f131622g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f131619d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f131620e) + C52418a.m58680g(4, 8, this.f131621f) + C52418a.m58678e(5, this.f131622g);
        } else if (i == 2) {
            this.f131621f.clear();
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
            C48980cb2 cb22 = objArr[1];
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
                    cb22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                cb22.f131619d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                cb22.f131620e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51163rv3 rv32 = new C51163rv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        rv32.mo73356d(bArr2);
                    }
                    cb22.f131621f.add(rv32);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                cb22.f131622g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
