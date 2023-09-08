package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nk3 */
public class C50559nk3 extends C49335eu3 {

    /* renamed from: d */
    public int f138642d;

    /* renamed from: e */
    public String f138643e;

    /* renamed from: f */
    public String f138644f;

    /* renamed from: g */
    public String f138645g;

    /* renamed from: h */
    public String f138646h;

    /* renamed from: i */
    public C51127rm f138647i;

    /* renamed from: j */
    public String f138648j;

    /* renamed from: n */
    public String f138649n;

    /* renamed from: o */
    public String f138650o;

    /* renamed from: p */
    public String f138651p;

    /* renamed from: q */
    public ji4 f138652q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50559nk3)) {
            return false;
        }
        C50559nk3 nk32 = (C50559nk3) aVar;
        return C46238a.m51546a(this.BaseResponse, nk32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f138642d), Integer.valueOf(nk32.f138642d)) && C46238a.m51546a(this.f138643e, nk32.f138643e) && C46238a.m51546a(this.f138644f, nk32.f138644f) && C46238a.m51546a(this.f138645g, nk32.f138645g) && C46238a.m51546a(this.f138646h, nk32.f138646h) && C46238a.m51546a(this.f138647i, nk32.f138647i) && C46238a.m51546a(this.f138648j, nk32.f138648j) && C46238a.m51546a(this.f138649n, nk32.f138649n) && C46238a.m51546a(this.f138650o, nk32.f138650o) && C46238a.m51546a(this.f138651p, nk32.f138651p) && C46238a.m51546a(this.f138652q, nk32.f138652q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f138642d);
                String str = this.f138643e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f138644f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f138645g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f138646h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                C51127rm rmVar = this.f138647i;
                if (rmVar != null) {
                    aVar.mo74322i(7, rmVar.computeSize());
                    this.f138647i.writeFields(aVar);
                }
                String str5 = this.f138648j;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                String str6 = this.f138649n;
                if (str6 != null) {
                    aVar.mo74323j(9, str6);
                }
                String str7 = this.f138650o;
                if (str7 != null) {
                    aVar.mo74323j(10, str7);
                }
                String str8 = this.f138651p;
                if (str8 != null) {
                    aVar.mo74323j(11, str8);
                }
                ji4 ji4 = this.f138652q;
                if (ji4 == null) {
                    return 0;
                }
                aVar.mo74322i(12, ji4.computeSize());
                this.f138652q.writeFields(aVar);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = (jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0) + C52418a.m58678e(2, this.f138642d);
            String str9 = this.f138643e;
            if (str9 != null) {
                i3 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f138644f;
            if (str10 != null) {
                i3 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f138645g;
            if (str11 != null) {
                i3 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f138646h;
            if (str12 != null) {
                i3 += C52418a.m58683j(6, str12);
            }
            C51127rm rmVar2 = this.f138647i;
            if (rmVar2 != null) {
                i3 += C52418a.m58682i(7, rmVar2.computeSize());
            }
            String str13 = this.f138648j;
            if (str13 != null) {
                i3 += C52418a.m58683j(8, str13);
            }
            String str14 = this.f138649n;
            if (str14 != null) {
                i3 += C52418a.m58683j(9, str14);
            }
            String str15 = this.f138650o;
            if (str15 != null) {
                i3 += C52418a.m58683j(10, str15);
            }
            String str16 = this.f138651p;
            if (str16 != null) {
                i3 += C52418a.m58683j(11, str16);
            }
            ji4 ji42 = this.f138652q;
            return ji42 != null ? i3 + C52418a.m58682i(12, ji42.computeSize()) : i3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50559nk3 nk32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        nk32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    nk32.f138642d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    nk32.f138643e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    nk32.f138644f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    nk32.f138645g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    nk32.f138646h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51127rm rmVar3 = new C51127rm();
                        if (bArr2 != null && bArr2.length > 0) {
                            rmVar3.parseFrom(bArr2);
                        }
                        nk32.f138647i = rmVar3;
                    }
                    return 0;
                case 8:
                    nk32.f138648j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    nk32.f138649n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    nk32.f138650o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    nk32.f138651p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        ji4 ji43 = new ji4();
                        if (bArr3 != null && bArr3.length > 0) {
                            ji43.parseFrom(bArr3);
                        }
                        nk32.f138652q = ji43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
