package v41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.k */
public class C52752k extends C47465a {

    /* renamed from: d */
    public C52745d f147400d;

    /* renamed from: e */
    public C52746e f147401e;

    /* renamed from: f */
    public C52748g f147402f;

    /* renamed from: g */
    public C52753l f147403g;

    /* renamed from: h */
    public C52743b f147404h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52752k)) {
            return false;
        }
        C52752k kVar = (C52752k) aVar;
        return C46238a.m51546a(this.f147400d, kVar.f147400d) && C46238a.m51546a(this.f147401e, kVar.f147401e) && C46238a.m51546a(this.f147402f, kVar.f147402f) && C46238a.m51546a(this.f147403g, kVar.f147403g) && C46238a.m51546a(this.f147404h, kVar.f147404h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52745d dVar = this.f147400d;
            if (dVar != null) {
                if (dVar != null) {
                    aVar.mo74322i(1, dVar.computeSize());
                    this.f147400d.writeFields(aVar);
                }
                C52746e eVar = this.f147401e;
                if (eVar != null) {
                    aVar.mo74322i(2, eVar.computeSize());
                    this.f147401e.writeFields(aVar);
                }
                C52748g gVar = this.f147402f;
                if (gVar != null) {
                    aVar.mo74322i(3, gVar.computeSize());
                    this.f147402f.writeFields(aVar);
                }
                C52753l lVar = this.f147403g;
                if (lVar != null) {
                    aVar.mo74322i(4, lVar.computeSize());
                    this.f147403g.writeFields(aVar);
                }
                C52743b bVar = this.f147404h;
                if (bVar != null) {
                    aVar.mo74322i(5, bVar.computeSize());
                    this.f147404h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_info");
        } else if (i == 1) {
            C52745d dVar2 = this.f147400d;
            if (dVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, dVar2.computeSize());
            }
            C52746e eVar2 = this.f147401e;
            if (eVar2 != null) {
                i2 += C52418a.m58682i(2, eVar2.computeSize());
            }
            C52748g gVar2 = this.f147402f;
            if (gVar2 != null) {
                i2 += C52418a.m58682i(3, gVar2.computeSize());
            }
            C52753l lVar2 = this.f147403g;
            if (lVar2 != null) {
                i2 += C52418a.m58682i(4, lVar2.computeSize());
            }
            C52743b bVar2 = this.f147404h;
            return bVar2 != null ? i2 + C52418a.m58682i(5, bVar2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f147400d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_info");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52752k kVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52745d dVar3 = new C52745d();
                    if (bArr != null && bArr.length > 0) {
                        dVar3.parseFrom(bArr);
                    }
                    kVar.f147400d = dVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52746e eVar3 = new C52746e();
                    if (bArr2 != null && bArr2.length > 0) {
                        eVar3.parseFrom(bArr2);
                    }
                    kVar.f147401e = eVar3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52748g gVar3 = new C52748g();
                    if (bArr3 != null && bArr3.length > 0) {
                        gVar3.parseFrom(bArr3);
                    }
                    kVar.f147402f = gVar3;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    C52753l lVar3 = new C52753l();
                    if (bArr4 != null && bArr4.length > 0) {
                        lVar3.parseFrom(bArr4);
                    }
                    kVar.f147403g = lVar3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i7 = 0; i7 < size5; i7++) {
                    byte[] bArr5 = j5.get(i7);
                    C52743b bVar3 = new C52743b();
                    if (bArr5 != null && bArr5.length > 0) {
                        bVar3.parseFrom(bArr5);
                    }
                    kVar.f147404h = bVar3;
                }
                return 0;
            }
        }
    }
}
