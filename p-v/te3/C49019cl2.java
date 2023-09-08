package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cl2 */
public class C49019cl2 extends C47465a {

    /* renamed from: d */
    public C51466tz f131812d;

    /* renamed from: e */
    public int f131813e = 0;

    /* renamed from: f */
    public String f131814f;

    /* renamed from: g */
    public LinkedList<C50562nl2> f131815g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49019cl2)) {
            return false;
        }
        C49019cl2 cl22 = (C49019cl2) aVar;
        return C46238a.m51546a(this.f131812d, cl22.f131812d) && C46238a.m51546a(Integer.valueOf(this.f131813e), Integer.valueOf(cl22.f131813e)) && C46238a.m51546a(this.f131814f, cl22.f131814f) && C46238a.m51546a(this.f131815g, cl22.f131815g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51466tz tzVar = this.f131812d;
            if (tzVar != null) {
                if (tzVar != null) {
                    aVar.mo74322i(1, tzVar.computeSize());
                    this.f131812d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f131813e);
                String str = this.f131814f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 8, this.f131815g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: idInfo");
        } else if (i == 1) {
            C51466tz tzVar2 = this.f131812d;
            if (tzVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, tzVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f131813e);
            String str2 = this.f131814f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58680g(4, 8, this.f131815g);
        } else if (i == 2) {
            this.f131815g.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f131812d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: idInfo");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49019cl2 cl22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51466tz tzVar3 = new C51466tz();
                    if (bArr != null && bArr.length > 0) {
                        tzVar3.parseFrom(bArr);
                    }
                    cl22.f131812d = tzVar3;
                }
                return 0;
            } else if (intValue == 2) {
                cl22.f131813e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                cl22.f131814f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50562nl2 nl22 = new C50562nl2();
                    if (bArr2 != null && bArr2.length > 0) {
                        nl22.parseFrom(bArr2);
                    }
                    cl22.f131815g.add(nl22);
                }
                return 0;
            }
        }
    }
}
