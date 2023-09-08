package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.di1 */
public class C49150di1 extends C47465a {

    /* renamed from: d */
    public FinderJumpInfo f132348d;

    /* renamed from: e */
    public String f132349e;

    /* renamed from: f */
    public boolean f132350f;

    /* renamed from: g */
    public String f132351g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49150di1)) {
            return false;
        }
        C49150di1 di12 = (C49150di1) aVar;
        return C46238a.m51546a(this.f132348d, di12.f132348d) && C46238a.m51546a(this.f132349e, di12.f132349e) && C46238a.m51546a(Boolean.valueOf(this.f132350f), Boolean.valueOf(di12.f132350f)) && C46238a.m51546a(this.f132351g, di12.f132351g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderJumpInfo finderJumpInfo = this.f132348d;
            if (finderJumpInfo != null) {
                aVar.mo74322i(1, finderJumpInfo.computeSize());
                this.f132348d.writeFields(aVar);
            }
            String str = this.f132349e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f132350f);
            String str2 = this.f132351g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            FinderJumpInfo finderJumpInfo2 = this.f132348d;
            if (finderJumpInfo2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderJumpInfo2.computeSize());
            }
            String str3 = this.f132349e;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int a = i2 + C52418a.m58674a(3, this.f132350f);
            String str4 = this.f132351g;
            return str4 != null ? a + C52418a.m58683j(4, str4) : a;
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
            C49150di1 di12 = objArr[1];
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
                    di12.f132348d = finderJumpInfo3;
                }
                return 0;
            } else if (intValue == 2) {
                di12.f132349e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                di12.f132350f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                di12.f132351g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
