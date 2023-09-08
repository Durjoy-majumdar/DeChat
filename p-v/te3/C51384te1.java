package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.te1 */
public class C51384te1 extends C47465a {

    /* renamed from: d */
    public FinderJumpInfo f142156d;

    /* renamed from: e */
    public long f142157e;

    /* renamed from: f */
    public String f142158f;

    /* renamed from: g */
    public String f142159g;

    /* renamed from: h */
    public long f142160h;

    /* renamed from: i */
    public long f142161i;

    /* renamed from: j */
    public FinderJumpInfo f142162j;

    /* renamed from: n */
    public LinkedList<FinderJumpInfo> f142163n = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51384te1)) {
            return false;
        }
        C51384te1 te12 = (C51384te1) aVar;
        return C46238a.m51546a(this.f142156d, te12.f142156d) && C46238a.m51546a(Long.valueOf(this.f142157e), Long.valueOf(te12.f142157e)) && C46238a.m51546a(this.f142158f, te12.f142158f) && C46238a.m51546a(this.f142159g, te12.f142159g) && C46238a.m51546a(Long.valueOf(this.f142160h), Long.valueOf(te12.f142160h)) && C46238a.m51546a(Long.valueOf(this.f142161i), Long.valueOf(te12.f142161i)) && C46238a.m51546a(this.f142162j, te12.f142162j) && C46238a.m51546a(this.f142163n, te12.f142163n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderJumpInfo finderJumpInfo = this.f142156d;
            if (finderJumpInfo != null) {
                aVar.mo74322i(1, finderJumpInfo.computeSize());
                this.f142156d.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f142157e);
            String str = this.f142158f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f142159g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f142160h);
            aVar.mo74321h(6, this.f142161i);
            FinderJumpInfo finderJumpInfo2 = this.f142162j;
            if (finderJumpInfo2 != null) {
                aVar.mo74322i(7, finderJumpInfo2.computeSize());
                this.f142162j.writeFields(aVar);
            }
            aVar.mo74320g(8, 8, this.f142163n);
            return 0;
        } else if (i == 1) {
            FinderJumpInfo finderJumpInfo3 = this.f142156d;
            if (finderJumpInfo3 != null) {
                i2 = 0 + C52418a.m58682i(1, finderJumpInfo3.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f142157e);
            String str3 = this.f142158f;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            String str4 = this.f142159g;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            int h2 = h + C52418a.m58681h(5, this.f142160h) + C52418a.m58681h(6, this.f142161i);
            FinderJumpInfo finderJumpInfo4 = this.f142162j;
            if (finderJumpInfo4 != null) {
                h2 += C52418a.m58682i(7, finderJumpInfo4.computeSize());
            }
            return h2 + C52418a.m58680g(8, 8, this.f142163n);
        } else if (i == 2) {
            this.f142163n.clear();
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
            C51384te1 te12 = objArr[1];
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
                        te12.f142156d = finderJumpInfo5;
                    }
                    return 0;
                case 2:
                    te12.f142157e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    te12.f142158f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    te12.f142159g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    te12.f142160h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    te12.f142161i = aVar3.mo141631i(intValue);
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
                        te12.f142162j = finderJumpInfo6;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        FinderJumpInfo finderJumpInfo7 = new FinderJumpInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderJumpInfo7.parseFrom(bArr3);
                        }
                        te12.f142163n.add(finderJumpInfo7);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
