package v41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.g */
public class C52748g extends C47465a {

    /* renamed from: d */
    public C52744c f147385d;

    /* renamed from: e */
    public C52751j f147386e;

    /* renamed from: f */
    public boolean f147387f;

    /* renamed from: g */
    public int f147388g;

    /* renamed from: h */
    public boolean f147389h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52748g)) {
            return false;
        }
        C52748g gVar = (C52748g) aVar;
        return C46238a.m51546a(this.f147385d, gVar.f147385d) && C46238a.m51546a(this.f147386e, gVar.f147386e) && C46238a.m51546a(Boolean.valueOf(this.f147387f), Boolean.valueOf(gVar.f147387f)) && C46238a.m51546a(Integer.valueOf(this.f147388g), Integer.valueOf(gVar.f147388g)) && C46238a.m51546a(Boolean.valueOf(this.f147389h), Boolean.valueOf(gVar.f147389h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52744c cVar = this.f147385d;
            if (cVar != null) {
                aVar.mo74322i(1, cVar.computeSize());
                this.f147385d.writeFields(aVar);
            }
            C52751j jVar = this.f147386e;
            if (jVar != null) {
                aVar.mo74322i(2, jVar.computeSize());
                this.f147386e.writeFields(aVar);
            }
            aVar.mo74314a(3, this.f147387f);
            aVar.mo74318e(4, this.f147388g);
            aVar.mo74314a(5, this.f147389h);
            return 0;
        } else if (i == 1) {
            C52744c cVar2 = this.f147385d;
            if (cVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, cVar2.computeSize());
            }
            C52751j jVar2 = this.f147386e;
            if (jVar2 != null) {
                i2 += C52418a.m58682i(2, jVar2.computeSize());
            }
            return i2 + C52418a.m58674a(3, this.f147387f) + C52418a.m58678e(4, this.f147388g) + C52418a.m58674a(5, this.f147389h);
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
            C52748g gVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52744c cVar3 = new C52744c();
                    if (bArr != null && bArr.length > 0) {
                        cVar3.parseFrom(bArr);
                    }
                    gVar.f147385d = cVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52751j jVar3 = new C52751j();
                    if (bArr2 != null && bArr2.length > 0) {
                        jVar3.parseFrom(bArr2);
                    }
                    gVar.f147386e = jVar3;
                }
                return 0;
            } else if (intValue == 3) {
                gVar.f147387f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 4) {
                gVar.f147388g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                gVar.f147389h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
