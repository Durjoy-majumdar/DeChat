package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lh0 */
public class C50262lh0 extends C49335eu3 {

    /* renamed from: d */
    public int f137417d;

    /* renamed from: e */
    public int f137418e;

    /* renamed from: f */
    public int f137419f;

    /* renamed from: g */
    public int f137420g;

    /* renamed from: h */
    public LinkedList<FinderJumpInfo> f137421h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50262lh0)) {
            return false;
        }
        C50262lh0 lh02 = (C50262lh0) aVar;
        return C46238a.m51546a(this.BaseResponse, lh02.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f137417d), Integer.valueOf(lh02.f137417d)) && C46238a.m51546a(Integer.valueOf(this.f137418e), Integer.valueOf(lh02.f137418e)) && C46238a.m51546a(Integer.valueOf(this.f137419f), Integer.valueOf(lh02.f137419f)) && C46238a.m51546a(Integer.valueOf(this.f137420g), Integer.valueOf(lh02.f137420g)) && C46238a.m51546a(this.f137421h, lh02.f137421h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f137417d);
            aVar.mo74318e(3, this.f137418e);
            aVar.mo74318e(4, this.f137419f);
            aVar.mo74318e(5, this.f137420g);
            aVar.mo74320g(8, 8, this.f137421h);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f137417d) + C52418a.m58678e(3, this.f137418e) + C52418a.m58678e(4, this.f137419f) + C52418a.m58678e(5, this.f137420g) + C52418a.m58680g(8, 8, this.f137421h);
        } else if (i == 2) {
            this.f137421h.clear();
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
            C50262lh0 lh02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    lh02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                lh02.f137417d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                lh02.f137418e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                lh02.f137419f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 5) {
                lh02.f137420g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 8) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderJumpInfo.parseFrom(bArr2);
                    }
                    lh02.f137421h.add(finderJumpInfo);
                }
                return 0;
            }
        }
    }
}
