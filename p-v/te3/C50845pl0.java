package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pl0 */
public class C50845pl0 extends C47465a {

    /* renamed from: d */
    public String f139818d;

    /* renamed from: e */
    public int f139819e;

    /* renamed from: f */
    public C51261sl0 f139820f;

    /* renamed from: g */
    public int f139821g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50845pl0)) {
            return false;
        }
        C50845pl0 pl02 = (C50845pl0) aVar;
        return C46238a.m51546a(this.f139818d, pl02.f139818d) && C46238a.m51546a(Integer.valueOf(this.f139819e), Integer.valueOf(pl02.f139819e)) && C46238a.m51546a(this.f139820f, pl02.f139820f) && C46238a.m51546a(Integer.valueOf(this.f139821g), Integer.valueOf(pl02.f139821g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139818d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f139819e);
            C51261sl0 sl02 = this.f139820f;
            if (sl02 != null) {
                aVar.mo74322i(3, sl02.computeSize());
                this.f139820f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f139821g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f139818d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f139819e);
            C51261sl0 sl03 = this.f139820f;
            if (sl03 != null) {
                e += C52418a.m58682i(3, sl03.computeSize());
            }
            return e + C52418a.m58678e(4, this.f139821g);
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
            C50845pl0 pl02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                pl02.f139818d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                pl02.f139819e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51261sl0 sl04 = new C51261sl0();
                    if (bArr != null && bArr.length > 0) {
                        sl04.parseFrom(bArr);
                    }
                    pl02.f139820f = sl04;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                pl02.f139821g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
