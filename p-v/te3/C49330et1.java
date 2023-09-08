package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.et1 */
public class C49330et1 extends C101820nt3 {

    /* renamed from: d */
    public int f133112d;

    /* renamed from: e */
    public String f133113e;

    /* renamed from: f */
    public int f133114f;

    /* renamed from: g */
    public LinkedList<C49608gt1> f133115g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49330et1)) {
            return false;
        }
        C49330et1 et12 = (C49330et1) aVar;
        return C46238a.m51546a(this.BaseRequest, et12.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f133112d), Integer.valueOf(et12.f133112d)) && C46238a.m51546a(this.f133113e, et12.f133113e) && C46238a.m51546a(Integer.valueOf(this.f133114f), Integer.valueOf(et12.f133114f)) && C46238a.m51546a(this.f133115g, et12.f133115g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f133112d);
            String str = this.f133113e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f133114f);
            aVar.mo74320g(5, 8, this.f133115g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133112d);
            String str2 = this.f133113e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58678e(4, this.f133114f) + C52418a.m58680g(5, 8, this.f133115g);
        } else if (i == 2) {
            this.f133115g.clear();
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
            C49330et1 et12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    et12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                et12.f133112d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                et12.f133113e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                et12.f133114f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49608gt1 gt12 = new C49608gt1();
                    if (bArr2 != null && bArr2.length > 0) {
                        gt12.parseFrom(bArr2);
                    }
                    et12.f133115g.add(gt12);
                }
                return 0;
            }
        }
    }
}
