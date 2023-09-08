package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t7 */
public class C51352t7 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f142002d;

    /* renamed from: e */
    public String f142003e;

    /* renamed from: f */
    public long f142004f;

    /* renamed from: g */
    public long f142005g;

    /* renamed from: h */
    public String f142006h;

    /* renamed from: i */
    public C89349b f142007i;

    /* renamed from: j */
    public int f142008j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51352t7)) {
            return false;
        }
        C51352t7 t7Var = (C51352t7) aVar;
        return C46238a.m51546a(this.BaseRequest, t7Var.BaseRequest) && C46238a.m51546a(this.f142002d, t7Var.f142002d) && C46238a.m51546a(this.f142003e, t7Var.f142003e) && C46238a.m51546a(Long.valueOf(this.f142004f), Long.valueOf(t7Var.f142004f)) && C46238a.m51546a(Long.valueOf(this.f142005g), Long.valueOf(t7Var.f142005g)) && C46238a.m51546a(this.f142006h, t7Var.f142006h) && C46238a.m51546a(this.f142007i, t7Var.f142007i) && C46238a.m51546a(Integer.valueOf(this.f142008j), Integer.valueOf(t7Var.f142008j));
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
            C49842ig0 ig02 = this.f142002d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f142002d.writeFields(aVar);
            }
            String str = this.f142003e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f142004f);
            aVar.mo74321h(5, this.f142005g);
            String str2 = this.f142006h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            C89349b bVar = this.f142007i;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            aVar.mo74318e(8, this.f142008j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f142002d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str3 = this.f142003e;
            if (str3 != null) {
                i2 += C52418a.m58683j(3, str3);
            }
            int h = i2 + C52418a.m58681h(4, this.f142004f) + C52418a.m58681h(5, this.f142005g);
            String str4 = this.f142006h;
            if (str4 != null) {
                h += C52418a.m58683j(6, str4);
            }
            C89349b bVar2 = this.f142007i;
            if (bVar2 != null) {
                h += C52418a.m58675b(7, bVar2);
            }
            return h + C52418a.m58678e(8, this.f142008j);
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
            C51352t7 t7Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        t7Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        t7Var.f142002d = ig04;
                    }
                    return 0;
                case 3:
                    t7Var.f142003e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    t7Var.f142004f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    t7Var.f142005g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    t7Var.f142006h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    t7Var.f142007i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    t7Var.f142008j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
