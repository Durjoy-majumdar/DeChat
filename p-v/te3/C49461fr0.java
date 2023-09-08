package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fr0 */
public class C49461fr0 extends C47465a {

    /* renamed from: d */
    public LinkedList<FinderObject> f133643d = new LinkedList<>();

    /* renamed from: e */
    public FinderJumpInfo f133644e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49461fr0)) {
            return false;
        }
        C49461fr0 fr02 = (C49461fr0) aVar;
        return C46238a.m51546a(this.f133643d, fr02.f133643d) && C46238a.m51546a(this.f133644e, fr02.f133644e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f133643d);
            FinderJumpInfo finderJumpInfo = this.f133644e;
            if (finderJumpInfo != null) {
                aVar.mo74322i(2, finderJumpInfo.computeSize());
                this.f133644e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f133643d) + 0;
            FinderJumpInfo finderJumpInfo2 = this.f133644e;
            return finderJumpInfo2 != null ? g + C52418a.m58682i(2, finderJumpInfo2.computeSize()) : g;
        } else if (i == 2) {
            this.f133643d.clear();
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
            C49461fr0 fr02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    FinderObject finderObject = new FinderObject();
                    if (bArr != null && bArr.length > 0) {
                        finderObject.parseFrom(bArr);
                    }
                    fr02.f133643d.add(finderObject);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderJumpInfo3.parseFrom(bArr2);
                    }
                    fr02.f133644e = finderJumpInfo3;
                }
                return 0;
            }
        }
    }
}
