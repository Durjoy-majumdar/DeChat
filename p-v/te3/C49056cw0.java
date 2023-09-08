package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cw0 */
public class C49056cw0 extends C47465a {

    /* renamed from: d */
    public String f131991d;

    /* renamed from: e */
    public LinkedList<C51663v9> f131992e = new LinkedList<>();

    /* renamed from: f */
    public FinderJumpInfo f131993f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49056cw0)) {
            return false;
        }
        C49056cw0 cw02 = (C49056cw0) aVar;
        return C46238a.m51546a(this.f131991d, cw02.f131991d) && C46238a.m51546a(this.f131992e, cw02.f131992e) && C46238a.m51546a(this.f131993f, cw02.f131993f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131991d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f131992e);
            FinderJumpInfo finderJumpInfo = this.f131993f;
            if (finderJumpInfo != null) {
                aVar.mo74322i(3, finderJumpInfo.computeSize());
                this.f131993f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f131991d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f131992e);
            FinderJumpInfo finderJumpInfo2 = this.f131993f;
            return finderJumpInfo2 != null ? g + C52418a.m58682i(3, finderJumpInfo2.computeSize()) : g;
        } else if (i == 2) {
            this.f131992e.clear();
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
            C49056cw0 cw02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                cw02.f131991d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51663v9 v9Var = new C51663v9();
                    if (bArr != null && bArr.length > 0) {
                        v9Var.parseFrom(bArr);
                    }
                    cw02.f131992e.add(v9Var);
                }
                return 0;
            } else if (intValue != 3) {
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
                    cw02.f131993f = finderJumpInfo3;
                }
                return 0;
            }
        }
    }
}
