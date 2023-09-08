package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bk1 */
public class C48868bk1 extends C47465a {

    /* renamed from: d */
    public FinderContact f131162d;

    /* renamed from: e */
    public String f131163e;

    /* renamed from: f */
    public String f131164f;

    /* renamed from: g */
    public int f131165g;

    /* renamed from: h */
    public int f131166h;

    /* renamed from: i */
    public String f131167i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48868bk1)) {
            return false;
        }
        C48868bk1 bk12 = (C48868bk1) aVar;
        return C46238a.m51546a(this.f131162d, bk12.f131162d) && C46238a.m51546a(this.f131163e, bk12.f131163e) && C46238a.m51546a(this.f131164f, bk12.f131164f) && C46238a.m51546a(Integer.valueOf(this.f131165g), Integer.valueOf(bk12.f131165g)) && C46238a.m51546a(Integer.valueOf(this.f131166h), Integer.valueOf(bk12.f131166h)) && C46238a.m51546a(this.f131167i, bk12.f131167i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderContact finderContact = this.f131162d;
            if (finderContact != null) {
                aVar.mo74322i(1, finderContact.computeSize());
                this.f131162d.writeFields(aVar);
            }
            String str = this.f131163e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f131164f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f131165g);
            aVar.mo74318e(5, this.f131166h);
            String str3 = this.f131167i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            FinderContact finderContact2 = this.f131162d;
            if (finderContact2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderContact2.computeSize());
            }
            String str4 = this.f131163e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f131164f;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f131165g) + C52418a.m58678e(5, this.f131166h);
            String str6 = this.f131167i;
            return str6 != null ? e + C52418a.m58683j(6, str6) : e;
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
            C48868bk1 bk12 = objArr[1];
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
                        bk12.f131162d = finderContact3;
                    }
                    return 0;
                case 2:
                    bk12.f131163e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bk12.f131164f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bk12.f131165g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bk12.f131166h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    bk12.f131167i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
