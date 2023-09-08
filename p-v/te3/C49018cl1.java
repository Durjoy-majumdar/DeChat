package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cl1 */
public class C49018cl1 extends C47465a {

    /* renamed from: d */
    public FinderContact f131807d;

    /* renamed from: e */
    public int f131808e;

    /* renamed from: f */
    public String f131809f;

    /* renamed from: g */
    public C51227sd1 f131810g;

    /* renamed from: h */
    public C51286sr0 f131811h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49018cl1)) {
            return false;
        }
        C49018cl1 cl12 = (C49018cl1) aVar;
        return C46238a.m51546a(this.f131807d, cl12.f131807d) && C46238a.m51546a(Integer.valueOf(this.f131808e), Integer.valueOf(cl12.f131808e)) && C46238a.m51546a(this.f131809f, cl12.f131809f) && C46238a.m51546a(this.f131810g, cl12.f131810g) && C46238a.m51546a(this.f131811h, cl12.f131811h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderContact finderContact = this.f131807d;
            if (finderContact != null) {
                aVar.mo74322i(1, finderContact.computeSize());
                this.f131807d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f131808e);
            String str = this.f131809f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C51227sd1 sd12 = this.f131810g;
            if (sd12 != null) {
                aVar.mo74322i(4, sd12.computeSize());
                this.f131810g.writeFields(aVar);
            }
            C51286sr0 sr02 = this.f131811h;
            if (sr02 != null) {
                aVar.mo74322i(5, sr02.computeSize());
                this.f131811h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            FinderContact finderContact2 = this.f131807d;
            if (finderContact2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderContact2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f131808e);
            String str2 = this.f131809f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C51227sd1 sd13 = this.f131810g;
            if (sd13 != null) {
                e += C52418a.m58682i(4, sd13.computeSize());
            }
            C51286sr0 sr03 = this.f131811h;
            return sr03 != null ? e + C52418a.m58682i(5, sr03.computeSize()) : e;
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
            C49018cl1 cl12 = objArr[1];
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
                    cl12.f131807d = finderContact3;
                }
                return 0;
            } else if (intValue == 2) {
                cl12.f131808e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                cl12.f131809f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51227sd1 sd14 = new C51227sd1();
                    if (bArr2 != null && bArr2.length > 0) {
                        sd14.parseFrom(bArr2);
                    }
                    cl12.f131810g = sd14;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51286sr0 sr04 = new C51286sr0();
                    if (bArr3 != null && bArr3.length > 0) {
                        sr04.parseFrom(bArr3);
                    }
                    cl12.f131811h = sr04;
                }
                return 0;
            }
        }
    }
}
