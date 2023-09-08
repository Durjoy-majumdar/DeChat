package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.um0 */
public class C51565um0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f142934d;

    /* renamed from: e */
    public String f142935e;

    /* renamed from: f */
    public C89349b f142936f;

    /* renamed from: g */
    public int f142937g;

    /* renamed from: h */
    public C49704hh0 f142938h;

    /* renamed from: i */
    public long f142939i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51565um0)) {
            return false;
        }
        C51565um0 um02 = (C51565um0) aVar;
        return C46238a.m51546a(this.BaseRequest, um02.BaseRequest) && C46238a.m51546a(this.f142934d, um02.f142934d) && C46238a.m51546a(this.f142935e, um02.f142935e) && C46238a.m51546a(this.f142936f, um02.f142936f) && C46238a.m51546a(Integer.valueOf(this.f142937g), Integer.valueOf(um02.f142937g)) && C46238a.m51546a(this.f142938h, um02.f142938h) && C46238a.m51546a(Long.valueOf(this.f142939i), Long.valueOf(um02.f142939i));
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
            C49842ig0 ig02 = this.f142934d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f142934d.writeFields(aVar);
            }
            String str = this.f142935e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f142936f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f142937g);
            C49704hh0 hh02 = this.f142938h;
            if (hh02 != null) {
                aVar.mo74322i(6, hh02.computeSize());
                this.f142938h.writeFields(aVar);
            }
            aVar.mo74321h(7, this.f142939i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f142934d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str2 = this.f142935e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f142936f;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(4, bVar2);
            }
            int e = i2 + C52418a.m58678e(5, this.f142937g);
            C49704hh0 hh03 = this.f142938h;
            if (hh03 != null) {
                e += C52418a.m58682i(6, hh03.computeSize());
            }
            return e + C52418a.m58681h(7, this.f142939i);
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
            C51565um0 um02 = objArr[1];
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
                        um02.BaseRequest = iaVar3;
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
                        um02.f142934d = ig04;
                    }
                    return 0;
                case 3:
                    um02.f142935e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    um02.f142936f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    um02.f142937g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            hh04.parseFrom(bArr3);
                        }
                        um02.f142938h = hh04;
                    }
                    return 0;
                case 7:
                    um02.f142939i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
