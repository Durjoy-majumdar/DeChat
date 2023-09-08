package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rx0 */
public class C51169rx0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f141196d;

    /* renamed from: e */
    public String f141197e;

    /* renamed from: f */
    public C89349b f141198f;

    /* renamed from: g */
    public long f141199g;

    /* renamed from: h */
    public long f141200h;

    /* renamed from: i */
    public String f141201i;

    /* renamed from: j */
    public String f141202j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51169rx0)) {
            return false;
        }
        C51169rx0 rx02 = (C51169rx0) aVar;
        return C46238a.m51546a(this.BaseRequest, rx02.BaseRequest) && C46238a.m51546a(this.f141196d, rx02.f141196d) && C46238a.m51546a(this.f141197e, rx02.f141197e) && C46238a.m51546a(this.f141198f, rx02.f141198f) && C46238a.m51546a(Long.valueOf(this.f141199g), Long.valueOf(rx02.f141199g)) && C46238a.m51546a(Long.valueOf(this.f141200h), Long.valueOf(rx02.f141200h)) && C46238a.m51546a(this.f141201i, rx02.f141201i) && C46238a.m51546a(this.f141202j, rx02.f141202j);
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
            C49842ig0 ig02 = this.f141196d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f141196d.writeFields(aVar);
            }
            String str = this.f141197e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f141198f;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74321h(5, this.f141199g);
            aVar.mo74321h(6, this.f141200h);
            String str2 = this.f141201i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            String str3 = this.f141202j;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f141196d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str4 = this.f141197e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C89349b bVar2 = this.f141198f;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(4, bVar2);
            }
            int h = i2 + C52418a.m58681h(5, this.f141199g) + C52418a.m58681h(6, this.f141200h);
            String str5 = this.f141201i;
            if (str5 != null) {
                h += C52418a.m58683j(7, str5);
            }
            String str6 = this.f141202j;
            return str6 != null ? h + C52418a.m58683j(8, str6) : h;
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
            C51169rx0 rx02 = objArr[1];
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
                        rx02.BaseRequest = iaVar3;
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
                        rx02.f141196d = ig04;
                    }
                    return 0;
                case 3:
                    rx02.f141197e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rx02.f141198f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    rx02.f141199g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    rx02.f141200h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    rx02.f141201i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    rx02.f141202j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
