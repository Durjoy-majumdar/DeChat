package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lk0 */
public class C50275lk0 extends C47465a {

    /* renamed from: d */
    public FinderContact f137476d;

    /* renamed from: e */
    public int f137477e;

    /* renamed from: f */
    public String f137478f;

    /* renamed from: g */
    public boolean f137479g;

    /* renamed from: h */
    public int f137480h;

    /* renamed from: i */
    public String f137481i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50275lk0)) {
            return false;
        }
        C50275lk0 lk02 = (C50275lk0) aVar;
        return C46238a.m51546a(this.f137476d, lk02.f137476d) && C46238a.m51546a(Integer.valueOf(this.f137477e), Integer.valueOf(lk02.f137477e)) && C46238a.m51546a(this.f137478f, lk02.f137478f) && C46238a.m51546a(Boolean.valueOf(this.f137479g), Boolean.valueOf(lk02.f137479g)) && C46238a.m51546a(Integer.valueOf(this.f137480h), Integer.valueOf(lk02.f137480h)) && C46238a.m51546a(this.f137481i, lk02.f137481i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderContact finderContact = this.f137476d;
            if (finderContact != null) {
                aVar.mo74322i(1, finderContact.computeSize());
                this.f137476d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f137477e);
            String str = this.f137478f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74314a(4, this.f137479g);
            aVar.mo74318e(5, this.f137480h);
            String str2 = this.f137481i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            FinderContact finderContact2 = this.f137476d;
            if (finderContact2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderContact2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f137477e);
            String str3 = this.f137478f;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int a = e + C52418a.m58674a(4, this.f137479g) + C52418a.m58678e(5, this.f137480h);
            String str4 = this.f137481i;
            return str4 != null ? a + C52418a.m58683j(6, str4) : a;
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
            C50275lk0 lk02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr != null && bArr.length > 0) {
                            finderContact3.parseFrom(bArr);
                        }
                        lk02.f137476d = finderContact3;
                    }
                    return 0;
                case 2:
                    lk02.f137477e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    lk02.f137478f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    lk02.f137479g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    lk02.f137480h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    lk02.f137481i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
