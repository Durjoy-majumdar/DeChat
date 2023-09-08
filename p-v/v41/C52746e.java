package v41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.e */
public class C52746e extends C47465a {

    /* renamed from: d */
    public String f147376d;

    /* renamed from: e */
    public LinkedList<String> f147377e = new LinkedList<>();

    /* renamed from: f */
    public String f147378f;

    /* renamed from: g */
    public String f147379g;

    /* renamed from: h */
    public LinkedList<String> f147380h = new LinkedList<>();

    /* renamed from: i */
    public C52755n f147381i;

    /* renamed from: j */
    public C52747f f147382j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52746e)) {
            return false;
        }
        C52746e eVar = (C52746e) aVar;
        return C46238a.m51546a(this.f147376d, eVar.f147376d) && C46238a.m51546a(this.f147377e, eVar.f147377e) && C46238a.m51546a(this.f147378f, eVar.f147378f) && C46238a.m51546a(this.f147379g, eVar.f147379g) && C46238a.m51546a(this.f147380h, eVar.f147380h) && C46238a.m51546a(this.f147381i, eVar.f147381i) && C46238a.m51546a(this.f147382j, eVar.f147382j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147376d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 1, this.f147377e);
            String str2 = this.f147378f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f147379g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74320g(5, 1, this.f147380h);
            C52755n nVar = this.f147381i;
            if (nVar != null) {
                aVar.mo74322i(6, nVar.computeSize());
                this.f147381i.writeFields(aVar);
            }
            C52747f fVar = this.f147382j;
            if (fVar != null) {
                aVar.mo74322i(7, fVar.computeSize());
                this.f147382j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f147376d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int g = i2 + C52418a.m58680g(2, 1, this.f147377e);
            String str5 = this.f147378f;
            if (str5 != null) {
                g += C52418a.m58683j(3, str5);
            }
            String str6 = this.f147379g;
            if (str6 != null) {
                g += C52418a.m58683j(4, str6);
            }
            int g2 = g + C52418a.m58680g(5, 1, this.f147380h);
            C52755n nVar2 = this.f147381i;
            if (nVar2 != null) {
                g2 += C52418a.m58682i(6, nVar2.computeSize());
            }
            C52747f fVar2 = this.f147382j;
            return fVar2 != null ? g2 + C52418a.m58682i(7, fVar2.computeSize()) : g2;
        } else if (i == 2) {
            this.f147377e.clear();
            this.f147380h.clear();
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
            C52746e eVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    eVar.f147376d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    eVar.f147377e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 3:
                    eVar.f147378f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    eVar.f147379g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    eVar.f147380h.add(aVar3.mo141633k(intValue));
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C52755n nVar3 = new C52755n();
                        if (bArr != null && bArr.length > 0) {
                            nVar3.parseFrom(bArr);
                        }
                        eVar.f147381i = nVar3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52747f fVar3 = new C52747f();
                        if (bArr2 != null && bArr2.length > 0) {
                            fVar3.parseFrom(bArr2);
                        }
                        eVar.f147382j = fVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
