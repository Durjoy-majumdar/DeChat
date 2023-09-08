package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.er0 */
public class C49321er0 extends C47465a {

    /* renamed from: d */
    public FinderJumpInfo f133080d;

    /* renamed from: e */
    public int f133081e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49321er0)) {
            return false;
        }
        C49321er0 er02 = (C49321er0) aVar;
        return C46238a.m51546a(this.f133080d, er02.f133080d) && C46238a.m51546a(Integer.valueOf(this.f133081e), Integer.valueOf(er02.f133081e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderJumpInfo finderJumpInfo = this.f133080d;
            if (finderJumpInfo != null) {
                aVar.mo74322i(1, finderJumpInfo.computeSize());
                this.f133080d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f133081e);
            return 0;
        } else if (i == 1) {
            FinderJumpInfo finderJumpInfo2 = this.f133080d;
            if (finderJumpInfo2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderJumpInfo2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f133081e);
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
            C49321er0 er02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        finderJumpInfo3.parseFrom(bArr);
                    }
                    er02.f133080d = finderJumpInfo3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                er02.f133081e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
