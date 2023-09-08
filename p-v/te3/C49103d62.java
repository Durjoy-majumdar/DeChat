package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d62 */
public class C49103d62 extends C49335eu3 {

    /* renamed from: d */
    public String f132144d;

    /* renamed from: e */
    public String f132145e;

    /* renamed from: f */
    public String f132146f;

    /* renamed from: g */
    public String f132147g;

    /* renamed from: h */
    public String f132148h;

    /* renamed from: i */
    public LinkedList<C101824o80> f132149i = new LinkedList<>();

    /* renamed from: j */
    public C51018qv3 f132150j;

    /* renamed from: n */
    public LinkedList<C101800k70> f132151n = new LinkedList<>();

    /* renamed from: o */
    public C49941j40 f132152o;

    /* renamed from: p */
    public LinkedList<C101787i40> f132153p = new LinkedList<>();

    /* renamed from: q */
    public C89349b f132154q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49103d62)) {
            return false;
        }
        C49103d62 d622 = (C49103d62) aVar;
        return C46238a.m51546a(this.BaseResponse, d622.BaseResponse) && C46238a.m51546a(this.f132144d, d622.f132144d) && C46238a.m51546a(this.f132145e, d622.f132145e) && C46238a.m51546a(this.f132146f, d622.f132146f) && C46238a.m51546a(this.f132147g, d622.f132147g) && C46238a.m51546a(this.f132148h, d622.f132148h) && C46238a.m51546a(this.f132149i, d622.f132149i) && C46238a.m51546a(this.f132150j, d622.f132150j) && C46238a.m51546a(this.f132151n, d622.f132151n) && C46238a.m51546a(this.f132152o, d622.f132152o) && C46238a.m51546a(this.f132153p, d622.f132153p) && C46238a.m51546a(this.f132154q, d622.f132154q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f132144d == null) {
                throw new C52419b("Not all required fields were included: BannerUrl");
            } else if (this.f132145e == null) {
                throw new C52419b("Not all required fields were included: Name");
            } else if (this.f132146f == null) {
                throw new C52419b("Not all required fields were included: Desc");
            } else if (this.f132147g == null) {
                throw new C52419b("Not all required fields were included: HeadUrl");
            } else if (this.f132148h == null) {
                throw new C52419b("Not all required fields were included: BizName");
            } else if (this.f132150j != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f132144d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f132145e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f132146f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f132147g;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                String str5 = this.f132148h;
                if (str5 != null) {
                    aVar.mo74323j(6, str5);
                }
                aVar.mo74320g(7, 8, this.f132149i);
                C51018qv3 qv32 = this.f132150j;
                if (qv32 != null) {
                    aVar.mo74322i(8, qv32.computeSize());
                    this.f132150j.writeFields(aVar);
                }
                aVar.mo74320g(9, 8, this.f132151n);
                C49941j40 j402 = this.f132152o;
                if (j402 != null) {
                    aVar.mo74322i(10, j402.computeSize());
                    this.f132152o.writeFields(aVar);
                }
                aVar.mo74320g(12, 8, this.f132153p);
                C89349b bVar = this.f132154q;
                if (bVar != null) {
                    aVar.mo74315b(13, bVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ReqBuf");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            String str6 = this.f132144d;
            if (str6 != null) {
                i3 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f132145e;
            if (str7 != null) {
                i3 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f132146f;
            if (str8 != null) {
                i3 += C52418a.m58683j(4, str8);
            }
            String str9 = this.f132147g;
            if (str9 != null) {
                i3 += C52418a.m58683j(5, str9);
            }
            String str10 = this.f132148h;
            if (str10 != null) {
                i3 += C52418a.m58683j(6, str10);
            }
            int g = i3 + C52418a.m58680g(7, 8, this.f132149i);
            C51018qv3 qv33 = this.f132150j;
            if (qv33 != null) {
                g += C52418a.m58682i(8, qv33.computeSize());
            }
            int g2 = g + C52418a.m58680g(9, 8, this.f132151n);
            C49941j40 j403 = this.f132152o;
            if (j403 != null) {
                g2 += C52418a.m58682i(10, j403.computeSize());
            }
            int g3 = g2 + C52418a.m58680g(12, 8, this.f132153p);
            C89349b bVar2 = this.f132154q;
            return bVar2 != null ? g3 + C52418a.m58675b(13, bVar2) : g3;
        } else if (i2 == 2) {
            this.f132149i.clear();
            this.f132151n.clear();
            this.f132153p.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f132144d == null) {
                throw new C52419b("Not all required fields were included: BannerUrl");
            } else if (this.f132145e == null) {
                throw new C52419b("Not all required fields were included: Name");
            } else if (this.f132146f == null) {
                throw new C52419b("Not all required fields were included: Desc");
            } else if (this.f132147g == null) {
                throw new C52419b("Not all required fields were included: HeadUrl");
            } else if (this.f132148h == null) {
                throw new C52419b("Not all required fields were included: BizName");
            } else if (this.f132150j != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ReqBuf");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49103d62 d622 = objArr[1];
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
                        d622.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    d622.f132144d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    d622.f132145e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    d622.f132146f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    d622.f132147g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    d622.f132148h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C101824o80 o802 = new C101824o80();
                        if (bArr2 != null && bArr2.length > 0) {
                            o802.parseFrom(bArr2);
                        }
                        d622.f132149i.add(o802);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv34.mo73348f(bArr3);
                        }
                        d622.f132150j = qv34;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C101800k70 k702 = new C101800k70();
                        if (bArr4 != null && bArr4.length > 0) {
                            k702.parseFrom(bArr4);
                        }
                        d622.f132151n.add(k702);
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49941j40 j404 = new C49941j40();
                        if (bArr5 != null && bArr5.length > 0) {
                            j404.parseFrom(bArr5);
                        }
                        d622.f132152o = j404;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C101787i40 i402 = new C101787i40();
                        if (bArr6 != null && bArr6.length > 0) {
                            i402.parseFrom(bArr6);
                        }
                        d622.f132153p.add(i402);
                    }
                    return 0;
                case 13:
                    d622.f132154q = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
