package te3;

import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nq2 */
public class C64589nq2 extends C47465a {

    /* renamed from: d */
    public String f184530d;

    /* renamed from: e */
    public String f184531e;

    /* renamed from: f */
    public String f184532f;

    /* renamed from: g */
    public FinderAuthInfo f184533g;

    /* renamed from: h */
    public long f184534h;

    /* renamed from: i */
    public int f184535i;

    /* renamed from: j */
    public int f184536j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64589nq2)) {
            return false;
        }
        C64589nq2 nq22 = (C64589nq2) aVar;
        return C46238a.m51546a(this.f184530d, nq22.f184530d) && C46238a.m51546a(this.f184531e, nq22.f184531e) && C46238a.m51546a(this.f184532f, nq22.f184532f) && C46238a.m51546a(this.f184533g, nq22.f184533g) && C46238a.m51546a(Long.valueOf(this.f184534h), Long.valueOf(nq22.f184534h)) && C46238a.m51546a(Integer.valueOf(this.f184535i), Integer.valueOf(nq22.f184535i)) && C46238a.m51546a(Integer.valueOf(this.f184536j), Integer.valueOf(nq22.f184536j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184530d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184531e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f184532f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            FinderAuthInfo finderAuthInfo = this.f184533g;
            if (finderAuthInfo != null) {
                aVar.mo74322i(4, finderAuthInfo.computeSize());
                this.f184533g.writeFields(aVar);
            }
            aVar.mo74321h(5, this.f184534h);
            aVar.mo74318e(6, this.f184535i);
            aVar.mo74318e(7, this.f184536j);
            return 0;
        } else if (i == 1) {
            String str4 = this.f184530d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f184531e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f184532f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            FinderAuthInfo finderAuthInfo2 = this.f184533g;
            if (finderAuthInfo2 != null) {
                i2 += C52418a.m58682i(4, finderAuthInfo2.computeSize());
            }
            return i2 + C52418a.m58681h(5, this.f184534h) + C52418a.m58678e(6, this.f184535i) + C52418a.m58678e(7, this.f184536j);
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
            C64589nq2 nq22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    nq22.f184530d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    nq22.f184531e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    nq22.f184532f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderAuthInfo finderAuthInfo3 = new FinderAuthInfo();
                        if (bArr != null && bArr.length > 0) {
                            finderAuthInfo3.parseFrom(bArr);
                        }
                        nq22.f184533g = finderAuthInfo3;
                    }
                    return 0;
                case 5:
                    nq22.f184534h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    nq22.f184535i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    nq22.f184536j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
