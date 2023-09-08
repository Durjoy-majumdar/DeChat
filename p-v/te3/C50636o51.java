package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o51 */
public class C50636o51 extends C47465a {

    /* renamed from: d */
    public String f138960d;

    /* renamed from: e */
    public String f138961e;

    /* renamed from: f */
    public int f138962f;

    /* renamed from: g */
    public long f138963g;

    /* renamed from: h */
    public int f138964h;

    /* renamed from: i */
    public FinderJumpInfo f138965i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50636o51)) {
            return false;
        }
        C50636o51 o512 = (C50636o51) aVar;
        return C46238a.m51546a(this.f138960d, o512.f138960d) && C46238a.m51546a(this.f138961e, o512.f138961e) && C46238a.m51546a(Integer.valueOf(this.f138962f), Integer.valueOf(o512.f138962f)) && C46238a.m51546a(Long.valueOf(this.f138963g), Long.valueOf(o512.f138963g)) && C46238a.m51546a(Integer.valueOf(this.f138964h), Integer.valueOf(o512.f138964h)) && C46238a.m51546a(this.f138965i, o512.f138965i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138960d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f138961e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f138962f);
            aVar.mo74321h(4, this.f138963g);
            aVar.mo74318e(5, this.f138964h);
            FinderJumpInfo finderJumpInfo = this.f138965i;
            if (finderJumpInfo != null) {
                aVar.mo74322i(6, finderJumpInfo.computeSize());
                this.f138965i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f138960d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f138961e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f138962f) + C52418a.m58681h(4, this.f138963g) + C52418a.m58678e(5, this.f138964h);
            FinderJumpInfo finderJumpInfo2 = this.f138965i;
            return finderJumpInfo2 != null ? e + C52418a.m58682i(6, finderJumpInfo2.computeSize()) : e;
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
            C50636o51 o512 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    o512.f138960d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    o512.f138961e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    o512.f138962f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    o512.f138963g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    o512.f138964h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                        if (bArr != null && bArr.length > 0) {
                            finderJumpInfo3.parseFrom(bArr);
                        }
                        o512.f138965i = finderJumpInfo3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
