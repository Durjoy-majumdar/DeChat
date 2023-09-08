package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class fp4 extends C47465a {

    /* renamed from: d */
    public FinderContact f133628d;

    /* renamed from: e */
    public int f133629e;

    /* renamed from: f */
    public LinkedList<FinderObject> f133630f = new LinkedList<>();

    /* renamed from: g */
    public int f133631g;

    /* renamed from: h */
    public C51129rn0 f133632h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof fp4)) {
            return false;
        }
        fp4 fp4 = (fp4) aVar;
        return C46238a.m51546a(this.f133628d, fp4.f133628d) && C46238a.m51546a(Integer.valueOf(this.f133629e), Integer.valueOf(fp4.f133629e)) && C46238a.m51546a(this.f133630f, fp4.f133630f) && C46238a.m51546a(Integer.valueOf(this.f133631g), Integer.valueOf(fp4.f133631g)) && C46238a.m51546a(this.f133632h, fp4.f133632h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            FinderContact finderContact = this.f133628d;
            if (finderContact != null) {
                aVar.mo74322i(1, finderContact.computeSize());
                this.f133628d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f133629e);
            aVar.mo74320g(3, 8, this.f133630f);
            aVar.mo74318e(6, this.f133631g);
            C51129rn0 rn02 = this.f133632h;
            if (rn02 != null) {
                aVar.mo74322i(7, rn02.computeSize());
                this.f133632h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            FinderContact finderContact2 = this.f133628d;
            if (finderContact2 != null) {
                i2 = 0 + C52418a.m58682i(1, finderContact2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133629e) + C52418a.m58680g(3, 8, this.f133630f) + C52418a.m58678e(6, this.f133631g);
            C51129rn0 rn03 = this.f133632h;
            return rn03 != null ? e + C52418a.m58682i(7, rn03.computeSize()) : e;
        } else if (i == 2) {
            this.f133630f.clear();
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
            fp4 fp4 = objArr[1];
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
                    fp4.f133628d = finderContact3;
                }
                return 0;
            } else if (intValue == 2) {
                fp4.f133629e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderObject finderObject = new FinderObject();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderObject.parseFrom(bArr2);
                    }
                    fp4.f133630f.add(finderObject);
                }
                return 0;
            } else if (intValue == 6) {
                fp4.f133631g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 7) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51129rn0 rn04 = new C51129rn0();
                    if (bArr3 != null && bArr3.length > 0) {
                        rn04.parseFrom(bArr3);
                    }
                    fp4.f133632h = rn04;
                }
                return 0;
            }
        }
    }
}
