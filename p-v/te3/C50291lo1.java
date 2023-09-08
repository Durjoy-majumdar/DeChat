package te3;

import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lo1 */
public class C50291lo1 extends C47465a {

    /* renamed from: d */
    public String f137545d;

    /* renamed from: e */
    public int f137546e;

    /* renamed from: f */
    public String f137547f;

    /* renamed from: g */
    public FinderAuthInfo f137548g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50291lo1)) {
            return false;
        }
        C50291lo1 lo12 = (C50291lo1) aVar;
        return C46238a.m51546a(this.f137545d, lo12.f137545d) && C46238a.m51546a(Integer.valueOf(this.f137546e), Integer.valueOf(lo12.f137546e)) && C46238a.m51546a(this.f137547f, lo12.f137547f) && C46238a.m51546a(this.f137548g, lo12.f137548g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137545d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f137546e);
            String str2 = this.f137547f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            FinderAuthInfo finderAuthInfo = this.f137548g;
            if (finderAuthInfo != null) {
                aVar.mo74322i(4, finderAuthInfo.computeSize());
                this.f137548g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f137545d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f137546e);
            String str4 = this.f137547f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            FinderAuthInfo finderAuthInfo2 = this.f137548g;
            return finderAuthInfo2 != null ? e + C52418a.m58682i(4, finderAuthInfo2.computeSize()) : e;
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
            C50291lo1 lo12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lo12.f137545d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                lo12.f137546e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                lo12.f137547f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    FinderAuthInfo finderAuthInfo3 = new FinderAuthInfo();
                    if (bArr != null && bArr.length > 0) {
                        finderAuthInfo3.parseFrom(bArr);
                    }
                    lo12.f137548g = finderAuthInfo3;
                }
                return 0;
            }
        }
    }
}
