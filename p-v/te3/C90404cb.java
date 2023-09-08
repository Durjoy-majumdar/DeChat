package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cb */
public class C90404cb extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<C90413gz1> f259441d = new LinkedList<>();

    /* renamed from: e */
    public int f259442e;

    /* renamed from: f */
    public C90422jy f259443f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90404cb)) {
            return false;
        }
        C90404cb cbVar = (C90404cb) aVar;
        return C46238a.m51546a(this.BaseRequest, cbVar.BaseRequest) && C46238a.m51546a(this.f259441d, cbVar.f259441d) && C46238a.m51546a(Integer.valueOf(this.f259442e), Integer.valueOf(cbVar.f259442e)) && C46238a.m51546a(this.f259443f, cbVar.f259443f);
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
            aVar.mo74320g(2, 8, this.f259441d);
            aVar.mo74318e(3, this.f259442e);
            C90422jy jyVar = this.f259443f;
            if (jyVar != null) {
                aVar.mo74322i(4, jyVar.computeSize());
                this.f259443f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f259441d) + C52418a.m58678e(3, this.f259442e);
            C90422jy jyVar2 = this.f259443f;
            return jyVar2 != null ? g + C52418a.m58682i(4, jyVar2.computeSize()) : g;
        } else if (i == 2) {
            this.f259441d.clear();
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
            C90404cb cbVar = objArr[1];
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
                    cbVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C90413gz1 gz12 = new C90413gz1();
                    if (bArr2 != null && bArr2.length > 0) {
                        gz12.parseFrom(bArr2);
                    }
                    cbVar.f259441d.add(gz12);
                }
                return 0;
            } else if (intValue == 3) {
                cbVar.f259442e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C90422jy jyVar3 = new C90422jy();
                    if (bArr3 != null && bArr3.length > 0) {
                        jyVar3.parseFrom(bArr3);
                    }
                    cbVar.f259443f = jyVar3;
                }
                return 0;
            }
        }
    }
}
