package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ak0 */
public class C48726ak0 extends C47465a {

    /* renamed from: d */
    public C64726td1 f130584d;

    /* renamed from: e */
    public LinkedList<FinderContact> f130585e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48726ak0)) {
            return false;
        }
        C48726ak0 ak02 = (C48726ak0) aVar;
        return C46238a.m51546a(this.f130584d, ak02.f130584d) && C46238a.m51546a(this.f130585e, ak02.f130585e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64726td1 td12 = this.f130584d;
            if (td12 != null) {
                aVar.mo74322i(1, td12.computeSize());
                this.f130584d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f130585e);
            return 0;
        } else if (i == 1) {
            C64726td1 td13 = this.f130584d;
            if (td13 != null) {
                i2 = 0 + C52418a.m58682i(1, td13.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f130585e);
        } else if (i == 2) {
            this.f130585e.clear();
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
            C48726ak0 ak02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64726td1 td14 = new C64726td1();
                    if (bArr != null && bArr.length > 0) {
                        td14.parseFrom(bArr);
                    }
                    ak02.f130584d = td14;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderContact finderContact = new FinderContact();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderContact.parseFrom(bArr2);
                    }
                    ak02.f130585e.add(finderContact);
                }
                return 0;
            }
        }
    }
}
