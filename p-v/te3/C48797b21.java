package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b21 */
public class C48797b21 extends C47465a {

    /* renamed from: d */
    public int f130895d;

    /* renamed from: e */
    public int f130896e;

    /* renamed from: f */
    public int f130897f;

    /* renamed from: g */
    public String f130898g;

    /* renamed from: h */
    public String f130899h;

    /* renamed from: i */
    public String f130900i;

    /* renamed from: j */
    public String f130901j;

    /* renamed from: n */
    public String f130902n;

    /* renamed from: o */
    public FinderJumpInfo f130903o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48797b21)) {
            return false;
        }
        C48797b21 b212 = (C48797b21) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130895d), Integer.valueOf(b212.f130895d)) && C46238a.m51546a(Integer.valueOf(this.f130896e), Integer.valueOf(b212.f130896e)) && C46238a.m51546a(Integer.valueOf(this.f130897f), Integer.valueOf(b212.f130897f)) && C46238a.m51546a(this.f130898g, b212.f130898g) && C46238a.m51546a(this.f130899h, b212.f130899h) && C46238a.m51546a(this.f130900i, b212.f130900i) && C46238a.m51546a(this.f130901j, b212.f130901j) && C46238a.m51546a(this.f130902n, b212.f130902n) && C46238a.m51546a(this.f130903o, b212.f130903o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130895d);
            aVar.mo74318e(2, this.f130896e);
            aVar.mo74318e(3, this.f130897f);
            String str = this.f130898g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f130899h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f130900i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f130901j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f130902n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            FinderJumpInfo finderJumpInfo = this.f130903o;
            if (finderJumpInfo != null) {
                aVar.mo74322i(9, finderJumpInfo.computeSize());
                this.f130903o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130895d) + 0 + C52418a.m58678e(2, this.f130896e) + C52418a.m58678e(3, this.f130897f);
            String str6 = this.f130898g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f130899h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f130900i;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            String str9 = this.f130901j;
            if (str9 != null) {
                e += C52418a.m58683j(7, str9);
            }
            String str10 = this.f130902n;
            if (str10 != null) {
                e += C52418a.m58683j(8, str10);
            }
            FinderJumpInfo finderJumpInfo2 = this.f130903o;
            return finderJumpInfo2 != null ? e + C52418a.m58682i(9, finderJumpInfo2.computeSize()) : e;
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
            C48797b21 b212 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    b212.f130895d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    b212.f130896e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    b212.f130897f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    b212.f130898g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    b212.f130899h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    b212.f130900i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    b212.f130901j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    b212.f130902n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                        if (bArr != null && bArr.length > 0) {
                            finderJumpInfo3.parseFrom(bArr);
                        }
                        b212.f130903o = finderJumpInfo3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
