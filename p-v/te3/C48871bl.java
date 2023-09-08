package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bl */
public class C48871bl extends C47465a {

    /* renamed from: d */
    public C51896wz f131179d;

    /* renamed from: e */
    public C48730al f131180e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48871bl)) {
            return false;
        }
        C48871bl blVar = (C48871bl) aVar;
        return C46238a.m51546a(this.f131179d, blVar.f131179d) && C46238a.m51546a(this.f131180e, blVar.f131180e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51896wz wzVar = this.f131179d;
            if (wzVar != null) {
                aVar.mo74322i(1, wzVar.computeSize());
                this.f131179d.writeFields(aVar);
            }
            C48730al alVar = this.f131180e;
            if (alVar != null) {
                aVar.mo74322i(2, alVar.computeSize());
                this.f131180e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C51896wz wzVar2 = this.f131179d;
            if (wzVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, wzVar2.computeSize());
            }
            C48730al alVar2 = this.f131180e;
            return alVar2 != null ? i2 + C52418a.m58682i(2, alVar2.computeSize()) : i2;
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
            C48871bl blVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51896wz wzVar3 = new C51896wz();
                    if (bArr != null && bArr.length > 0) {
                        wzVar3.parseFrom(bArr);
                    }
                    blVar.f131179d = wzVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48730al alVar3 = new C48730al();
                    if (bArr2 != null && bArr2.length > 0) {
                        alVar3.parseFrom(bArr2);
                    }
                    blVar.f131180e = alVar3;
                }
                return 0;
            }
        }
    }
}
