package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ox */
public class C50746ox extends C47465a {

    /* renamed from: d */
    public int f139410d;

    /* renamed from: e */
    public C89349b f139411e;

    /* renamed from: f */
    public C49832id3 f139412f;

    /* renamed from: g */
    public C50456mv3 f139413g;

    /* renamed from: h */
    public C50040ju3 f139414h;

    /* renamed from: i */
    public int f139415i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50746ox)) {
            return false;
        }
        C50746ox oxVar = (C50746ox) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139410d), Integer.valueOf(oxVar.f139410d)) && C46238a.m51546a(this.f139411e, oxVar.f139411e) && C46238a.m51546a(this.f139412f, oxVar.f139412f) && C46238a.m51546a(this.f139413g, oxVar.f139413g) && C46238a.m51546a(this.f139414h, oxVar.f139414h) && C46238a.m51546a(Integer.valueOf(this.f139415i), Integer.valueOf(oxVar.f139415i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139410d);
            C89349b bVar = this.f139411e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            C49832id3 id32 = this.f139412f;
            if (id32 != null) {
                aVar.mo74322i(3, id32.computeSize());
                this.f139412f.writeFields(aVar);
            }
            C50456mv3 mv32 = this.f139413g;
            if (mv32 != null) {
                aVar.mo74322i(4, mv32.computeSize());
                this.f139413g.writeFields(aVar);
            }
            C50040ju3 ju32 = this.f139414h;
            if (ju32 != null) {
                aVar.mo74322i(5, ju32.computeSize());
                this.f139414h.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f139415i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139410d) + 0;
            C89349b bVar2 = this.f139411e;
            if (bVar2 != null) {
                e += C52418a.m58675b(2, bVar2);
            }
            C49832id3 id33 = this.f139412f;
            if (id33 != null) {
                e += C52418a.m58682i(3, id33.computeSize());
            }
            C50456mv3 mv33 = this.f139413g;
            if (mv33 != null) {
                e += C52418a.m58682i(4, mv33.computeSize());
            }
            C50040ju3 ju33 = this.f139414h;
            if (ju33 != null) {
                e += C52418a.m58682i(5, ju33.computeSize());
            }
            return e + C52418a.m58678e(6, this.f139415i);
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
            C50746ox oxVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oxVar.f139410d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    oxVar.f139411e = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49832id3 id34 = new C49832id3();
                        if (bArr != null && bArr.length > 0) {
                            id34.parseFrom(bArr);
                        }
                        oxVar.f139412f = id34;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C50456mv3 mv34 = new C50456mv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            mv34.parseFrom(bArr2);
                        }
                        oxVar.f139413g = mv34;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C50040ju3 ju34 = new C50040ju3();
                        if (bArr3 != null && bArr3.length > 0) {
                            ju34.parseFrom(bArr3);
                        }
                        oxVar.f139414h = ju34;
                    }
                    return 0;
                case 6:
                    oxVar.f139415i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
