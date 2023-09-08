package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qn1 */
public class C50985qn1 extends C47465a {

    /* renamed from: d */
    public FinderContact f140407d;

    /* renamed from: e */
    public C64726td1 f140408e;

    /* renamed from: f */
    public String f140409f;

    /* renamed from: g */
    public String f140410g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50985qn1)) {
            return false;
        }
        C50985qn1 qn12 = (C50985qn1) aVar;
        return C46238a.m51546a(this.f140407d, qn12.f140407d) && C46238a.m51546a(this.f140408e, qn12.f140408e) && C46238a.m51546a(this.f140409f, qn12.f140409f) && C46238a.m51546a(this.f140410g, qn12.f140410g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderContact finderContact = this.f140407d;
            if (finderContact != null) {
                aVar.mo74322i(1, finderContact.computeSize());
                this.f140407d.writeFields(aVar);
            }
            C64726td1 td12 = this.f140408e;
            if (td12 != null) {
                aVar.mo74322i(2, td12.computeSize());
                this.f140408e.writeFields(aVar);
            }
            String str = this.f140409f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f140410g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            FinderContact finderContact2 = this.f140407d;
            if (finderContact2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderContact2.computeSize());
            }
            C64726td1 td13 = this.f140408e;
            if (td13 != null) {
                i2 += C52418a.m58682i(2, td13.computeSize());
            }
            String str3 = this.f140409f;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            String str4 = this.f140410g;
            return str4 != null ? i2 + C52418a.m58683j(4, str4) : i2;
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
            C50985qn1 qn12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    FinderContact finderContact3 = new FinderContact();
                    if (bArr != null && bArr.length > 0) {
                        finderContact3.parseFrom(bArr);
                    }
                    qn12.f140407d = finderContact3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64726td1 td14 = new C64726td1();
                    if (bArr2 != null && bArr2.length > 0) {
                        td14.parseFrom(bArr2);
                    }
                    qn12.f140408e = td14;
                }
                return 0;
            } else if (intValue == 3) {
                qn12.f140409f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                qn12.f140410g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
