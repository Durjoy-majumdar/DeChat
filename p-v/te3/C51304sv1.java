package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sv1 */
public class C51304sv1 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<C49423fh2> f141777d = new LinkedList<>();

    /* renamed from: e */
    public C49561gh2 f141778e;

    /* renamed from: f */
    public long f141779f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51304sv1)) {
            return false;
        }
        C51304sv1 sv12 = (C51304sv1) aVar;
        return C46238a.m51546a(this.BaseRequest, sv12.BaseRequest) && C46238a.m51546a(this.f141777d, sv12.f141777d) && C46238a.m51546a(this.f141778e, sv12.f141778e) && C46238a.m51546a(Long.valueOf(this.f141779f), Long.valueOf(sv12.f141779f));
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
            aVar.mo74320g(2, 8, this.f141777d);
            C49561gh2 gh22 = this.f141778e;
            if (gh22 != null) {
                aVar.mo74322i(4, gh22.computeSize());
                this.f141778e.writeFields(aVar);
            }
            aVar.mo74321h(5, this.f141779f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f141777d);
            C49561gh2 gh23 = this.f141778e;
            if (gh23 != null) {
                g += C52418a.m58682i(4, gh23.computeSize());
            }
            return g + C52418a.m58681h(5, this.f141779f);
        } else if (i == 2) {
            this.f141777d.clear();
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
            C51304sv1 sv12 = objArr[1];
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
                    sv12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49423fh2 fh22 = new C49423fh2();
                    if (bArr2 != null && bArr2.length > 0) {
                        fh22.parseFrom(bArr2);
                    }
                    sv12.f141777d.add(fh22);
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49561gh2 gh24 = new C49561gh2();
                    if (bArr3 != null && bArr3.length > 0) {
                        gh24.parseFrom(bArr3);
                    }
                    sv12.f141778e = gh24;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                sv12.f141779f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
