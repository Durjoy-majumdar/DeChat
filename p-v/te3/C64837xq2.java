package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xq2 */
public class C64837xq2 extends C47465a {

    /* renamed from: d */
    public int f186378d;

    /* renamed from: e */
    public FinderJumpInfo f186379e;

    /* renamed from: f */
    public boolean f186380f;

    /* renamed from: g */
    public boolean f186381g;

    /* renamed from: h */
    public int f186382h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64837xq2)) {
            return false;
        }
        C64837xq2 xq22 = (C64837xq2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186378d), Integer.valueOf(xq22.f186378d)) && C46238a.m51546a(this.f186379e, xq22.f186379e) && C46238a.m51546a(Boolean.valueOf(this.f186380f), Boolean.valueOf(xq22.f186380f)) && C46238a.m51546a(Boolean.valueOf(this.f186381g), Boolean.valueOf(xq22.f186381g)) && C46238a.m51546a(Integer.valueOf(this.f186382h), Integer.valueOf(xq22.f186382h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186378d);
            FinderJumpInfo finderJumpInfo = this.f186379e;
            if (finderJumpInfo != null) {
                aVar.mo74322i(2, finderJumpInfo.computeSize());
                this.f186379e.writeFields(aVar);
            }
            aVar.mo74314a(3, this.f186380f);
            aVar.mo74314a(4, this.f186381g);
            aVar.mo74318e(5, this.f186382h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186378d) + 0;
            FinderJumpInfo finderJumpInfo2 = this.f186379e;
            if (finderJumpInfo2 != null) {
                e += C52418a.m58682i(2, finderJumpInfo2.computeSize());
            }
            return e + C52418a.m58674a(3, this.f186380f) + C52418a.m58674a(4, this.f186381g) + C52418a.m58678e(5, this.f186382h);
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
            C64837xq2 xq22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xq22.f186378d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        finderJumpInfo3.parseFrom(bArr);
                    }
                    xq22.f186379e = finderJumpInfo3;
                }
                return 0;
            } else if (intValue == 3) {
                xq22.f186380f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 4) {
                xq22.f186381g = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                xq22.f186382h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
