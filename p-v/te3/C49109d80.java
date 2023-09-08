package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d80 */
public class C49109d80 extends C47465a {

    /* renamed from: d */
    public String f132178d;

    /* renamed from: e */
    public int f132179e;

    /* renamed from: f */
    public LinkedList<C50850pm2> f132180f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49109d80)) {
            return false;
        }
        C49109d80 d802 = (C49109d80) aVar;
        return C46238a.m51546a(this.f132178d, d802.f132178d) && C46238a.m51546a(Integer.valueOf(this.f132179e), Integer.valueOf(d802.f132179e)) && C46238a.m51546a(this.f132180f, d802.f132180f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132178d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f132179e);
            aVar.mo74320g(3, 8, this.f132180f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f132178d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f132179e) + C52418a.m58680g(3, 8, this.f132180f);
        } else if (i == 2) {
            this.f132180f.clear();
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
            C49109d80 d802 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d802.f132178d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                d802.f132179e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50850pm2 pm22 = new C50850pm2();
                    if (bArr != null && bArr.length > 0) {
                        pm22.parseFrom(bArr);
                    }
                    d802.f132180f.add(pm22);
                }
                return 0;
            }
        }
    }
}
