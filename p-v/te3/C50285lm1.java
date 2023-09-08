package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.lm1 */
public class C50285lm1 extends C47465a {

    /* renamed from: d */
    public LinkedList<FinderJumpInfo> f137519d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C50285lm1) && C46238a.m51546a(this.f137519d, ((C50285lm1) aVar).f137519d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.f137519d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f137519d) + 0;
        } else {
            if (i == 2) {
                this.f137519d.clear();
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                C50285lm1 lm12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        finderJumpInfo.parseFrom(bArr);
                    }
                    lm12.f137519d.add(finderJumpInfo);
                }
                return 0;
            }
        }
    }
}
