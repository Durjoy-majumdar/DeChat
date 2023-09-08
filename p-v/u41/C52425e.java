package u41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import v41.C52752k;
import z14.C53733a;

/* renamed from: u41.e */
public class C52425e extends C47465a {

    /* renamed from: d */
    public C52752k f146512d;

    /* renamed from: e */
    public C52426f f146513e;

    /* renamed from: f */
    public C52424d f146514f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52425e)) {
            return false;
        }
        C52425e eVar = (C52425e) aVar;
        return C46238a.m51546a(this.f146512d, eVar.f146512d) && C46238a.m51546a(this.f146513e, eVar.f146513e) && C46238a.m51546a(this.f146514f, eVar.f146514f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52752k kVar = this.f146512d;
            if (kVar != null) {
                if (kVar != null) {
                    aVar.mo74322i(1, kVar.computeSize());
                    this.f146512d.writeFields(aVar);
                }
                C52426f fVar = this.f146513e;
                if (fVar != null) {
                    aVar.mo74322i(2, fVar.computeSize());
                    this.f146513e.writeFields(aVar);
                }
                C52424d dVar = this.f146514f;
                if (dVar != null) {
                    aVar.mo74322i(3, dVar.computeSize());
                    this.f146514f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: app_info");
        } else if (i == 1) {
            C52752k kVar2 = this.f146512d;
            if (kVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, kVar2.computeSize());
            }
            C52426f fVar2 = this.f146513e;
            if (fVar2 != null) {
                i2 += C52418a.m58682i(2, fVar2.computeSize());
            }
            C52424d dVar2 = this.f146514f;
            return dVar2 != null ? i2 + C52418a.m58682i(3, dVar2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f146512d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: app_info");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52425e eVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52752k kVar3 = new C52752k();
                    if (bArr != null && bArr.length > 0) {
                        kVar3.parseFrom(bArr);
                    }
                    eVar.f146512d = kVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52426f fVar3 = new C52426f();
                    if (bArr2 != null && bArr2.length > 0) {
                        fVar3.parseFrom(bArr2);
                    }
                    eVar.f146513e = fVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52424d dVar3 = new C52424d();
                    if (bArr3 != null && bArr3.length > 0) {
                        dVar3.parseFrom(bArr3);
                    }
                    eVar.f146514f = dVar3;
                }
                return 0;
            }
        }
    }
}
