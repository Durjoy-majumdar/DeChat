package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fv */
public class C49475fv extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<Integer> f133698d = new LinkedList<>();

    /* renamed from: e */
    public int f133699e;

    /* renamed from: f */
    public String f133700f;

    /* renamed from: g */
    public LinkedList<C49336ev> f133701g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49475fv)) {
            return false;
        }
        C49475fv fvVar = (C49475fv) aVar;
        return C46238a.m51546a(this.BaseRequest, fvVar.BaseRequest) && C46238a.m51546a(this.f133698d, fvVar.f133698d) && C46238a.m51546a(Integer.valueOf(this.f133699e), Integer.valueOf(fvVar.f133699e)) && C46238a.m51546a(this.f133700f, fvVar.f133700f) && C46238a.m51546a(this.f133701g, fvVar.f133701g);
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
            aVar.mo74320g(2, 2, this.f133698d);
            aVar.mo74318e(3, this.f133699e);
            String str = this.f133700f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74320g(5, 8, this.f133701g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 2, this.f133698d) + C52418a.m58678e(3, this.f133699e);
            String str2 = this.f133700f;
            if (str2 != null) {
                g += C52418a.m58683j(4, str2);
            }
            return g + C52418a.m58680g(5, 8, this.f133701g);
        } else if (i == 2) {
            this.f133698d.clear();
            this.f133701g.clear();
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
            C49475fv fvVar = objArr[1];
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
                    fvVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                fvVar.f133698d.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue == 3) {
                fvVar.f133699e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                fvVar.f133700f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49336ev evVar = new C49336ev();
                    if (bArr2 != null && bArr2.length > 0) {
                        evVar.parseFrom(bArr2);
                    }
                    fvVar.f133701g.add(evVar);
                }
                return 0;
            }
        }
    }
}
