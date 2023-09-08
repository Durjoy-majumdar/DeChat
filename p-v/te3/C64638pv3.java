package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pv3 */
public class C64638pv3 extends C47465a {

    /* renamed from: d */
    public String f184892d;

    /* renamed from: e */
    public String f184893e;

    /* renamed from: f */
    public String f184894f;

    /* renamed from: g */
    public boolean f184895g;

    /* renamed from: h */
    public FinderJumpInfo f184896h;

    /* renamed from: i */
    public String f184897i;

    /* renamed from: j */
    public String f184898j;

    /* renamed from: n */
    public String f184899n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64638pv3)) {
            return false;
        }
        C64638pv3 pv32 = (C64638pv3) aVar;
        return C46238a.m51546a(this.f184892d, pv32.f184892d) && C46238a.m51546a(this.f184893e, pv32.f184893e) && C46238a.m51546a(this.f184894f, pv32.f184894f) && C46238a.m51546a(Boolean.valueOf(this.f184895g), Boolean.valueOf(pv32.f184895g)) && C46238a.m51546a(this.f184896h, pv32.f184896h) && C46238a.m51546a(this.f184897i, pv32.f184897i) && C46238a.m51546a(this.f184898j, pv32.f184898j) && C46238a.m51546a(this.f184899n, pv32.f184899n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184892d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184893e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f184894f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74314a(4, this.f184895g);
            FinderJumpInfo finderJumpInfo = this.f184896h;
            if (finderJumpInfo != null) {
                aVar.mo74322i(5, finderJumpInfo.computeSize());
                this.f184896h.writeFields(aVar);
            }
            String str4 = this.f184897i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f184898j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f184899n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f184892d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f184893e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f184894f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            int a = i2 + C52418a.m58674a(4, this.f184895g);
            FinderJumpInfo finderJumpInfo2 = this.f184896h;
            if (finderJumpInfo2 != null) {
                a += C52418a.m58682i(5, finderJumpInfo2.computeSize());
            }
            String str10 = this.f184897i;
            if (str10 != null) {
                a += C52418a.m58683j(6, str10);
            }
            String str11 = this.f184898j;
            if (str11 != null) {
                a += C52418a.m58683j(7, str11);
            }
            String str12 = this.f184899n;
            return str12 != null ? a + C52418a.m58683j(8, str12) : a;
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
            C64638pv3 pv32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pv32.f184892d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pv32.f184893e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pv32.f184894f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    pv32.f184895g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                        if (bArr != null && bArr.length > 0) {
                            finderJumpInfo3.parseFrom(bArr);
                        }
                        pv32.f184896h = finderJumpInfo3;
                    }
                    return 0;
                case 6:
                    pv32.f184897i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    pv32.f184898j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    pv32.f184899n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
