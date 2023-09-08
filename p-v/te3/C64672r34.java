package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r34 */
public class C64672r34 extends C49335eu3 {

    /* renamed from: d */
    public int f185106d;

    /* renamed from: e */
    public int f185107e;

    /* renamed from: f */
    public float f185108f;

    /* renamed from: g */
    public C51018qv3 f185109g;

    /* renamed from: h */
    public C51018qv3 f185110h;

    /* renamed from: i */
    public C51018qv3 f185111i;

    /* renamed from: j */
    public C51018qv3 f185112j;

    /* renamed from: n */
    public C51018qv3 f185113n;

    /* renamed from: o */
    public C51018qv3 f185114o;

    /* renamed from: p */
    public C51018qv3 f185115p;

    /* renamed from: q */
    public C51018qv3 f185116q;

    /* renamed from: r */
    public int f185117r;

    /* renamed from: s */
    public int f185118s;

    /* renamed from: t */
    public String f185119t;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64672r34)) {
            return false;
        }
        C64672r34 r342 = (C64672r34) aVar;
        return C46238a.m51546a(this.BaseResponse, r342.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f185106d), Integer.valueOf(r342.f185106d)) && C46238a.m51546a(Integer.valueOf(this.f185107e), Integer.valueOf(r342.f185107e)) && C46238a.m51546a(Float.valueOf(this.f185108f), Float.valueOf(r342.f185108f)) && C46238a.m51546a(this.f185109g, r342.f185109g) && C46238a.m51546a(this.f185110h, r342.f185110h) && C46238a.m51546a(this.f185111i, r342.f185111i) && C46238a.m51546a(this.f185112j, r342.f185112j) && C46238a.m51546a(this.f185113n, r342.f185113n) && C46238a.m51546a(this.f185114o, r342.f185114o) && C46238a.m51546a(this.f185115p, r342.f185115p) && C46238a.m51546a(this.f185116q, r342.f185116q) && C46238a.m51546a(Integer.valueOf(this.f185117r), Integer.valueOf(r342.f185117r)) && C46238a.m51546a(Integer.valueOf(this.f185118s), Integer.valueOf(r342.f185118s)) && C46238a.m51546a(this.f185119t, r342.f185119t);
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
            } else if (this.f185109g == null) {
                throw new C52419b("Not all required fields were included: SongName");
            } else if (this.f185110h == null) {
                throw new C52419b("Not all required fields were included: SongSinger");
            } else if (this.f185111i == null) {
                throw new C52419b("Not all required fields were included: SongAlbum");
            } else if (this.f185112j == null) {
                throw new C52419b("Not all required fields were included: SongAlbumUrl");
            } else if (this.f185113n == null) {
                throw new C52419b("Not all required fields were included: SongWifiUrl");
            } else if (this.f185114o == null) {
                throw new C52419b("Not all required fields were included: SongWapLinkUrl");
            } else if (this.f185115p == null) {
                throw new C52419b("Not all required fields were included: SongWebUrl");
            } else if (this.f185116q != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f185106d);
                aVar.mo74318e(3, this.f185107e);
                aVar.mo74317d(4, this.f185108f);
                C51018qv3 qv32 = this.f185109g;
                if (qv32 != null) {
                    aVar.mo74322i(5, qv32.computeSize());
                    this.f185109g.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f185110h;
                if (qv33 != null) {
                    aVar.mo74322i(6, qv33.computeSize());
                    this.f185110h.writeFields(aVar);
                }
                C51018qv3 qv34 = this.f185111i;
                if (qv34 != null) {
                    aVar.mo74322i(7, qv34.computeSize());
                    this.f185111i.writeFields(aVar);
                }
                C51018qv3 qv35 = this.f185112j;
                if (qv35 != null) {
                    aVar.mo74322i(8, qv35.computeSize());
                    this.f185112j.writeFields(aVar);
                }
                C51018qv3 qv36 = this.f185113n;
                if (qv36 != null) {
                    aVar.mo74322i(9, qv36.computeSize());
                    this.f185113n.writeFields(aVar);
                }
                C51018qv3 qv37 = this.f185114o;
                if (qv37 != null) {
                    aVar.mo74322i(10, qv37.computeSize());
                    this.f185114o.writeFields(aVar);
                }
                C51018qv3 qv38 = this.f185115p;
                if (qv38 != null) {
                    aVar.mo74322i(11, qv38.computeSize());
                    this.f185115p.writeFields(aVar);
                }
                C51018qv3 qv39 = this.f185116q;
                if (qv39 != null) {
                    aVar.mo74322i(12, qv39.computeSize());
                    this.f185116q.writeFields(aVar);
                }
                aVar.mo74318e(13, this.f185117r);
                aVar.mo74318e(14, this.f185118s);
                String str = this.f185119t;
                if (str != null) {
                    aVar.mo74323j(15, str);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SongLyric");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f185106d) + C52418a.m58678e(3, this.f185107e) + C52418a.m58677d(4, this.f185108f);
            C51018qv3 qv310 = this.f185109g;
            if (qv310 != null) {
                e += C52418a.m58682i(5, qv310.computeSize());
            }
            C51018qv3 qv311 = this.f185110h;
            if (qv311 != null) {
                e += C52418a.m58682i(6, qv311.computeSize());
            }
            C51018qv3 qv312 = this.f185111i;
            if (qv312 != null) {
                e += C52418a.m58682i(7, qv312.computeSize());
            }
            C51018qv3 qv313 = this.f185112j;
            if (qv313 != null) {
                e += C52418a.m58682i(8, qv313.computeSize());
            }
            C51018qv3 qv314 = this.f185113n;
            if (qv314 != null) {
                e += C52418a.m58682i(9, qv314.computeSize());
            }
            C51018qv3 qv315 = this.f185114o;
            if (qv315 != null) {
                e += C52418a.m58682i(10, qv315.computeSize());
            }
            C51018qv3 qv316 = this.f185115p;
            if (qv316 != null) {
                e += C52418a.m58682i(11, qv316.computeSize());
            }
            C51018qv3 qv317 = this.f185116q;
            if (qv317 != null) {
                e += C52418a.m58682i(12, qv317.computeSize());
            }
            int e2 = e + C52418a.m58678e(13, this.f185117r) + C52418a.m58678e(14, this.f185118s);
            String str2 = this.f185119t;
            return str2 != null ? e2 + C52418a.m58683j(15, str2) : e2;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f185109g == null) {
                throw new C52419b("Not all required fields were included: SongName");
            } else if (this.f185110h == null) {
                throw new C52419b("Not all required fields were included: SongSinger");
            } else if (this.f185111i == null) {
                throw new C52419b("Not all required fields were included: SongAlbum");
            } else if (this.f185112j == null) {
                throw new C52419b("Not all required fields were included: SongAlbumUrl");
            } else if (this.f185113n == null) {
                throw new C52419b("Not all required fields were included: SongWifiUrl");
            } else if (this.f185114o == null) {
                throw new C52419b("Not all required fields were included: SongWapLinkUrl");
            } else if (this.f185115p == null) {
                throw new C52419b("Not all required fields were included: SongWebUrl");
            } else if (this.f185116q != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: SongLyric");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64672r34 r342 = objArr[1];
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
                        r342.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    r342.f185106d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    r342.f185107e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    r342.f185108f = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv318 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv318.mo73348f(bArr2);
                        }
                        r342.f185109g = qv318;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51018qv3 qv319 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv319.mo73348f(bArr3);
                        }
                        r342.f185110h = qv319;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51018qv3 qv320 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv320.mo73348f(bArr4);
                        }
                        r342.f185111i = qv320;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51018qv3 qv321 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv321.mo73348f(bArr5);
                        }
                        r342.f185112j = qv321;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51018qv3 qv322 = new C51018qv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            qv322.mo73348f(bArr6);
                        }
                        r342.f185113n = qv322;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51018qv3 qv323 = new C51018qv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            qv323.mo73348f(bArr7);
                        }
                        r342.f185114o = qv323;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C51018qv3 qv324 = new C51018qv3();
                        if (bArr8 != null && bArr8.length > 0) {
                            qv324.mo73348f(bArr8);
                        }
                        r342.f185115p = qv324;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C51018qv3 qv325 = new C51018qv3();
                        if (bArr9 != null && bArr9.length > 0) {
                            qv325.mo73348f(bArr9);
                        }
                        r342.f185116q = qv325;
                    }
                    return 0;
                case 13:
                    r342.f185117r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    r342.f185118s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    r342.f185119t = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
