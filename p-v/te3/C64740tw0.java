package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tw0 */
public class C64740tw0 extends C47465a {

    /* renamed from: d */
    public LinkedList<C51601uv> f185685d = new LinkedList<>();

    /* renamed from: e */
    public String f185686e;

    /* renamed from: f */
    public boolean f185687f;

    /* renamed from: g */
    public C64784vv f185688g;

    /* renamed from: h */
    public C64784vv f185689h;

    /* renamed from: i */
    public LinkedList<String> f185690i = new LinkedList<>();

    /* renamed from: j */
    public long f185691j;

    /* renamed from: n */
    public long f185692n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64740tw0)) {
            return false;
        }
        C64740tw0 tw02 = (C64740tw0) aVar;
        return C46238a.m51546a(this.f185685d, tw02.f185685d) && C46238a.m51546a(this.f185686e, tw02.f185686e) && C46238a.m51546a(Boolean.valueOf(this.f185687f), Boolean.valueOf(tw02.f185687f)) && C46238a.m51546a(this.f185688g, tw02.f185688g) && C46238a.m51546a(this.f185689h, tw02.f185689h) && C46238a.m51546a(this.f185690i, tw02.f185690i) && C46238a.m51546a(Long.valueOf(this.f185691j), Long.valueOf(tw02.f185691j)) && C46238a.m51546a(Long.valueOf(this.f185692n), Long.valueOf(tw02.f185692n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f185685d);
            String str = this.f185686e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f185687f);
            C64784vv vvVar = this.f185688g;
            if (vvVar != null) {
                aVar.mo74322i(4, vvVar.computeSize());
                this.f185688g.writeFields(aVar);
            }
            C64784vv vvVar2 = this.f185689h;
            if (vvVar2 != null) {
                aVar.mo74322i(5, vvVar2.computeSize());
                this.f185689h.writeFields(aVar);
            }
            aVar.mo74320g(6, 1, this.f185690i);
            aVar.mo74321h(7, this.f185691j);
            aVar.mo74321h(8, this.f185692n);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f185685d) + 0;
            String str2 = this.f185686e;
            if (str2 != null) {
                g += C52418a.m58683j(2, str2);
            }
            int a = g + C52418a.m58674a(3, this.f185687f);
            C64784vv vvVar3 = this.f185688g;
            if (vvVar3 != null) {
                a += C52418a.m58682i(4, vvVar3.computeSize());
            }
            C64784vv vvVar4 = this.f185689h;
            if (vvVar4 != null) {
                a += C52418a.m58682i(5, vvVar4.computeSize());
            }
            return a + C52418a.m58680g(6, 1, this.f185690i) + C52418a.m58681h(7, this.f185691j) + C52418a.m58681h(8, this.f185692n);
        } else if (i == 2) {
            this.f185685d.clear();
            this.f185690i.clear();
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
            C64740tw0 tw02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51601uv uvVar = new C51601uv();
                        if (bArr != null && bArr.length > 0) {
                            uvVar.parseFrom(bArr);
                        }
                        tw02.f185685d.add(uvVar);
                    }
                    return 0;
                case 2:
                    tw02.f185686e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    tw02.f185687f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C64784vv vvVar5 = new C64784vv();
                        if (bArr2 != null && bArr2.length > 0) {
                            vvVar5.parseFrom(bArr2);
                        }
                        tw02.f185688g = vvVar5;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C64784vv vvVar6 = new C64784vv();
                        if (bArr3 != null && bArr3.length > 0) {
                            vvVar6.parseFrom(bArr3);
                        }
                        tw02.f185689h = vvVar6;
                    }
                    return 0;
                case 6:
                    tw02.f185690i.add(aVar3.mo141633k(intValue));
                    return 0;
                case 7:
                    tw02.f185691j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    tw02.f185692n = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
