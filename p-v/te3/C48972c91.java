package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c91 */
public class C48972c91 extends C47465a {

    /* renamed from: d */
    public C51942x91 f131576d;

    /* renamed from: e */
    public String f131577e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48972c91)) {
            return false;
        }
        C48972c91 c912 = (C48972c91) aVar;
        return C46238a.m51546a(this.f131576d, c912.f131576d) && C46238a.m51546a(this.f131577e, c912.f131577e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51942x91 x912 = this.f131576d;
            if (x912 != null) {
                aVar.mo74322i(1, x912.computeSize());
                this.f131576d.writeFields(aVar);
            }
            String str = this.f131577e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            C51942x91 x913 = this.f131576d;
            if (x913 != null) {
                i2 = 0 + C52418a.m58682i(1, x913.computeSize());
            }
            String str2 = this.f131577e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
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
            C48972c91 c912 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51942x91 x914 = new C51942x91();
                    if (bArr != null && bArr.length > 0) {
                        x914.parseFrom(bArr);
                    }
                    c912.f131576d = x914;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                c912.f131577e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
