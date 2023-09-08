package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class uo4 extends C47465a {

    /* renamed from: d */
    public wo4 f142989d;

    /* renamed from: e */
    public to4 f142990e;

    /* renamed from: f */
    public vo4 f142991f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof uo4)) {
            return false;
        }
        uo4 uo4 = (uo4) aVar;
        return C46238a.m51546a(this.f142989d, uo4.f142989d) && C46238a.m51546a(this.f142990e, uo4.f142990e) && C46238a.m51546a(this.f142991f, uo4.f142991f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            wo4 wo4 = this.f142989d;
            if (wo4 != null) {
                aVar.mo74322i(1, wo4.computeSize());
                this.f142989d.writeFields(aVar);
            }
            to4 to4 = this.f142990e;
            if (to4 != null) {
                aVar.mo74322i(2, to4.computeSize());
                this.f142990e.writeFields(aVar);
            }
            vo4 vo4 = this.f142991f;
            if (vo4 != null) {
                aVar.mo74322i(3, vo4.computeSize());
                this.f142991f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            wo4 wo42 = this.f142989d;
            if (wo42 != null) {
                i2 = 0 + C52418a.m58682i(1, wo42.computeSize());
            }
            to4 to42 = this.f142990e;
            if (to42 != null) {
                i2 += C52418a.m58682i(2, to42.computeSize());
            }
            vo4 vo42 = this.f142991f;
            return vo42 != null ? i2 + C52418a.m58682i(3, vo42.computeSize()) : i2;
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
            uo4 uo4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    wo4 wo43 = new wo4();
                    if (bArr != null && bArr.length > 0) {
                        wo43.parseFrom(bArr);
                    }
                    uo4.f142989d = wo43;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    to4 to43 = new to4();
                    if (bArr2 != null && bArr2.length > 0) {
                        to43.parseFrom(bArr2);
                    }
                    uo4.f142990e = to43;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    vo4 vo43 = new vo4();
                    if (bArr3 != null && bArr3.length > 0) {
                        vo43.parseFrom(bArr3);
                    }
                    uo4.f142991f = vo43;
                }
                return 0;
            }
        }
    }
}
