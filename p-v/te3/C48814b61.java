package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b61 */
public class C48814b61 extends C47465a {

    /* renamed from: d */
    public C48752ar0 f130979d;

    /* renamed from: e */
    public FinderJumpInfo f130980e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48814b61)) {
            return false;
        }
        C48814b61 b612 = (C48814b61) aVar;
        return C46238a.m51546a(this.f130979d, b612.f130979d) && C46238a.m51546a(this.f130980e, b612.f130980e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48752ar0 ar02 = this.f130979d;
            if (ar02 != null) {
                aVar.mo74322i(1, ar02.computeSize());
                this.f130979d.writeFields(aVar);
            }
            FinderJumpInfo finderJumpInfo = this.f130980e;
            if (finderJumpInfo != null) {
                aVar.mo74322i(2, finderJumpInfo.computeSize());
                this.f130980e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C48752ar0 ar03 = this.f130979d;
            if (ar03 != null) {
                i2 = 0 + C52418a.m58682i(1, ar03.computeSize());
            }
            FinderJumpInfo finderJumpInfo2 = this.f130980e;
            return finderJumpInfo2 != null ? i2 + C52418a.m58682i(2, finderJumpInfo2.computeSize()) : i2;
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
            C48814b61 b612 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48752ar0 ar04 = new C48752ar0();
                    if (bArr != null && bArr.length > 0) {
                        ar04.parseFrom(bArr);
                    }
                    b612.f130979d = ar04;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderJumpInfo3.parseFrom(bArr2);
                    }
                    b612.f130980e = finderJumpInfo3;
                }
                return 0;
            }
        }
    }
}
