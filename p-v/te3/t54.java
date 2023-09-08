package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class t54 extends C47465a {

    /* renamed from: d */
    public String f141974d;

    /* renamed from: e */
    public String f141975e;

    /* renamed from: f */
    public int f141976f;

    /* renamed from: g */
    public FinderJumpInfo f141977g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof t54)) {
            return false;
        }
        t54 t54 = (t54) aVar;
        return C46238a.m51546a(this.f141974d, t54.f141974d) && C46238a.m51546a(this.f141975e, t54.f141975e) && C46238a.m51546a(Integer.valueOf(this.f141976f), Integer.valueOf(t54.f141976f)) && C46238a.m51546a(this.f141977g, t54.f141977g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141974d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f141975e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f141976f);
            FinderJumpInfo finderJumpInfo = this.f141977g;
            if (finderJumpInfo != null) {
                aVar.mo74322i(4, finderJumpInfo.computeSize());
                this.f141977g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f141974d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f141975e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f141976f);
            FinderJumpInfo finderJumpInfo2 = this.f141977g;
            return finderJumpInfo2 != null ? e + C52418a.m58682i(4, finderJumpInfo2.computeSize()) : e;
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
            t54 t54 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                t54.f141974d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                t54.f141975e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                t54.f141976f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        finderJumpInfo3.parseFrom(bArr);
                    }
                    t54.f141977g = finderJumpInfo3;
                }
                return 0;
            }
        }
    }
}
