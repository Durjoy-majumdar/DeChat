package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vh0 */
public class C64772vh0 extends C47465a {

    /* renamed from: d */
    public FinderJumpInfo f185886d;

    /* renamed from: e */
    public long f185887e;

    /* renamed from: f */
    public String f185888f;

    /* renamed from: g */
    public String f185889g;

    /* renamed from: h */
    public String f185890h;

    /* renamed from: i */
    public FinderJumpInfo f185891i;

    /* renamed from: j */
    public LinkedList<C64750uh0> f185892j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64772vh0)) {
            return false;
        }
        C64772vh0 vh02 = (C64772vh0) aVar;
        return C46238a.m51546a(this.f185886d, vh02.f185886d) && C46238a.m51546a(Long.valueOf(this.f185887e), Long.valueOf(vh02.f185887e)) && C46238a.m51546a(this.f185888f, vh02.f185888f) && C46238a.m51546a(this.f185889g, vh02.f185889g) && C46238a.m51546a(this.f185890h, vh02.f185890h) && C46238a.m51546a(this.f185891i, vh02.f185891i) && C46238a.m51546a(this.f185892j, vh02.f185892j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderJumpInfo finderJumpInfo = this.f185886d;
            if (finderJumpInfo != null) {
                aVar.mo74322i(1, finderJumpInfo.computeSize());
                this.f185886d.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f185887e);
            String str = this.f185888f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f185889g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f185890h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            FinderJumpInfo finderJumpInfo2 = this.f185891i;
            if (finderJumpInfo2 != null) {
                aVar.mo74322i(7, finderJumpInfo2.computeSize());
                this.f185891i.writeFields(aVar);
            }
            aVar.mo74320g(8, 8, this.f185892j);
            return 0;
        } else if (i == 1) {
            FinderJumpInfo finderJumpInfo3 = this.f185886d;
            if (finderJumpInfo3 != null) {
                i2 = 0 + C52418a.m58682i(1, finderJumpInfo3.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f185887e);
            String str4 = this.f185888f;
            if (str4 != null) {
                h += C52418a.m58683j(3, str4);
            }
            String str5 = this.f185889g;
            if (str5 != null) {
                h += C52418a.m58683j(4, str5);
            }
            String str6 = this.f185890h;
            if (str6 != null) {
                h += C52418a.m58683j(5, str6);
            }
            FinderJumpInfo finderJumpInfo4 = this.f185891i;
            if (finderJumpInfo4 != null) {
                h += C52418a.m58682i(7, finderJumpInfo4.computeSize());
            }
            return h + C52418a.m58680g(8, 8, this.f185892j);
        } else if (i == 2) {
            this.f185892j.clear();
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
            C64772vh0 vh02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderJumpInfo finderJumpInfo5 = new FinderJumpInfo();
                        if (bArr != null && bArr.length > 0) {
                            finderJumpInfo5.parseFrom(bArr);
                        }
                        vh02.f185886d = finderJumpInfo5;
                    }
                    return 0;
                case 2:
                    vh02.f185887e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    vh02.f185888f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    vh02.f185889g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vh02.f185890h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderJumpInfo finderJumpInfo6 = new FinderJumpInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderJumpInfo6.parseFrom(bArr2);
                        }
                        vh02.f185891i = finderJumpInfo6;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64750uh0 uh02 = new C64750uh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            uh02.parseFrom(bArr3);
                        }
                        vh02.f185892j.add(uh02);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
