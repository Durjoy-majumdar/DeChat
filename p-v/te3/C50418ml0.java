package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ml0 */
public class C50418ml0 extends C47465a {

    /* renamed from: d */
    public int f138089d;

    /* renamed from: e */
    public int f138090e;

    /* renamed from: f */
    public C89349b f138091f;

    /* renamed from: g */
    public FinderObject f138092g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50418ml0)) {
            return false;
        }
        C50418ml0 ml02 = (C50418ml0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138089d), Integer.valueOf(ml02.f138089d)) && C46238a.m51546a(Integer.valueOf(this.f138090e), Integer.valueOf(ml02.f138090e)) && C46238a.m51546a(this.f138091f, ml02.f138091f) && C46238a.m51546a(this.f138092g, ml02.f138092g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138089d);
            aVar.mo74318e(2, this.f138090e);
            C89349b bVar = this.f138091f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            FinderObject finderObject = this.f138092g;
            if (finderObject != null) {
                aVar.mo74322i(4, finderObject.computeSize());
                this.f138092g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138089d) + 0 + C52418a.m58678e(2, this.f138090e);
            C89349b bVar2 = this.f138091f;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            FinderObject finderObject2 = this.f138092g;
            return finderObject2 != null ? e + C52418a.m58682i(4, finderObject2.computeSize()) : e;
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
            C50418ml0 ml02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ml02.f138089d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ml02.f138090e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ml02.f138091f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    FinderObject finderObject3 = new FinderObject();
                    if (bArr != null && bArr.length > 0) {
                        finderObject3.parseFrom(bArr);
                    }
                    ml02.f138092g = finderObject3;
                }
                return 0;
            }
        }
    }
}
