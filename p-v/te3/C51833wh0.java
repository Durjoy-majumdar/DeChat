package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wh0 */
public class C51833wh0 extends C47465a {

    /* renamed from: d */
    public long f144049d;

    /* renamed from: e */
    public String f144050e;

    /* renamed from: f */
    public FinderJumpInfo f144051f;

    /* renamed from: g */
    public int f144052g;

    /* renamed from: h */
    public String f144053h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51833wh0)) {
            return false;
        }
        C51833wh0 wh02 = (C51833wh0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f144049d), Long.valueOf(wh02.f144049d)) && C46238a.m51546a(this.f144050e, wh02.f144050e) && C46238a.m51546a(this.f144051f, wh02.f144051f) && C46238a.m51546a(Integer.valueOf(this.f144052g), Integer.valueOf(wh02.f144052g)) && C46238a.m51546a(this.f144053h, wh02.f144053h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f144049d);
            String str = this.f144050e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            FinderJumpInfo finderJumpInfo = this.f144051f;
            if (finderJumpInfo != null) {
                aVar.mo74322i(3, finderJumpInfo.computeSize());
                this.f144051f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f144052g);
            String str2 = this.f144053h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f144049d) + 0;
            String str3 = this.f144050e;
            if (str3 != null) {
                h += C52418a.m58683j(2, str3);
            }
            FinderJumpInfo finderJumpInfo2 = this.f144051f;
            if (finderJumpInfo2 != null) {
                h += C52418a.m58682i(3, finderJumpInfo2.computeSize());
            }
            int e = h + C52418a.m58678e(4, this.f144052g);
            String str4 = this.f144053h;
            return str4 != null ? e + C52418a.m58683j(5, str4) : e;
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
            C51833wh0 wh02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wh02.f144049d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                wh02.f144050e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        finderJumpInfo3.parseFrom(bArr);
                    }
                    wh02.f144051f = finderJumpInfo3;
                }
                return 0;
            } else if (intValue == 4) {
                wh02.f144052g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                wh02.f144053h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
