package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fd */
public class C77928fd extends C101820nt3 {

    /* renamed from: A */
    public b64 f227355A;

    /* renamed from: B */
    public C64305d33 f227356B;

    /* renamed from: C */
    public String f227357C;

    /* renamed from: D */
    public String f227358D;

    /* renamed from: E */
    public String f227359E;

    /* renamed from: F */
    public int f227360F;

    /* renamed from: d */
    public String f227361d;

    /* renamed from: e */
    public String f227362e;

    /* renamed from: f */
    public int f227363f;

    /* renamed from: g */
    public String f227364g;

    /* renamed from: h */
    public int f227365h;

    /* renamed from: i */
    public String f227366i;

    /* renamed from: j */
    public String f227367j;

    /* renamed from: n */
    public int f227368n;

    /* renamed from: o */
    public String f227369o;

    /* renamed from: p */
    public String f227370p;

    /* renamed from: q */
    public C51018qv3 f227371q;

    /* renamed from: r */
    public String f227372r;

    /* renamed from: s */
    public int f227373s;

    /* renamed from: t */
    public int f227374t;

    /* renamed from: u */
    public String f227375u;

    /* renamed from: v */
    public int f227376v;

    /* renamed from: w */
    public String f227377w;

    /* renamed from: x */
    public C51018qv3 f227378x;

    /* renamed from: y */
    public C51018qv3 f227379y;

    /* renamed from: z */
    public String f227380z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77928fd)) {
            return false;
        }
        C77928fd fdVar = (C77928fd) aVar;
        return C46238a.m51546a(this.BaseRequest, fdVar.BaseRequest) && C46238a.m51546a(this.f227361d, fdVar.f227361d) && C46238a.m51546a(this.f227362e, fdVar.f227362e) && C46238a.m51546a(Integer.valueOf(this.f227363f), Integer.valueOf(fdVar.f227363f)) && C46238a.m51546a(this.f227364g, fdVar.f227364g) && C46238a.m51546a(Integer.valueOf(this.f227365h), Integer.valueOf(fdVar.f227365h)) && C46238a.m51546a(this.f227366i, fdVar.f227366i) && C46238a.m51546a(this.f227367j, fdVar.f227367j) && C46238a.m51546a(Integer.valueOf(this.f227368n), Integer.valueOf(fdVar.f227368n)) && C46238a.m51546a(this.f227369o, fdVar.f227369o) && C46238a.m51546a(this.f227370p, fdVar.f227370p) && C46238a.m51546a(this.f227371q, fdVar.f227371q) && C46238a.m51546a(this.f227372r, fdVar.f227372r) && C46238a.m51546a(Integer.valueOf(this.f227373s), Integer.valueOf(fdVar.f227373s)) && C46238a.m51546a(Integer.valueOf(this.f227374t), Integer.valueOf(fdVar.f227374t)) && C46238a.m51546a(this.f227375u, fdVar.f227375u) && C46238a.m51546a(Integer.valueOf(this.f227376v), Integer.valueOf(fdVar.f227376v)) && C46238a.m51546a(this.f227377w, fdVar.f227377w) && C46238a.m51546a(this.f227378x, fdVar.f227378x) && C46238a.m51546a(this.f227379y, fdVar.f227379y) && C46238a.m51546a(this.f227380z, fdVar.f227380z) && C46238a.m51546a(this.f227355A, fdVar.f227355A) && C46238a.m51546a(this.f227356B, fdVar.f227356B) && C46238a.m51546a(this.f227357C, fdVar.f227357C) && C46238a.m51546a(this.f227358D, fdVar.f227358D) && C46238a.m51546a(this.f227359E, fdVar.f227359E) && C46238a.m51546a(Integer.valueOf(this.f227360F), Integer.valueOf(fdVar.f227360F));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f227361d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f227362e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f227363f);
            String str3 = this.f227364g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f227365h);
            String str4 = this.f227366i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f227367j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74318e(9, this.f227368n);
            String str6 = this.f227369o;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            String str7 = this.f227370p;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            C51018qv3 qv32 = this.f227371q;
            if (qv32 != null) {
                aVar.mo74322i(12, qv32.computeSize());
                this.f227371q.writeFields(aVar);
            }
            String str8 = this.f227372r;
            if (str8 != null) {
                aVar.mo74323j(13, str8);
            }
            aVar.mo74318e(14, this.f227373s);
            aVar.mo74318e(15, this.f227374t);
            String str9 = this.f227375u;
            if (str9 != null) {
                aVar.mo74323j(16, str9);
            }
            aVar.mo74318e(17, this.f227376v);
            String str10 = this.f227377w;
            if (str10 != null) {
                aVar.mo74323j(18, str10);
            }
            C51018qv3 qv33 = this.f227378x;
            if (qv33 != null) {
                aVar.mo74322i(19, qv33.computeSize());
                this.f227378x.writeFields(aVar);
            }
            C51018qv3 qv34 = this.f227379y;
            if (qv34 != null) {
                aVar.mo74322i(20, qv34.computeSize());
                this.f227379y.writeFields(aVar);
            }
            String str11 = this.f227380z;
            if (str11 != null) {
                aVar.mo74323j(21, str11);
            }
            b64 b64 = this.f227355A;
            if (b64 != null) {
                aVar.mo74322i(22, b64.computeSize());
                this.f227355A.writeFields(aVar);
            }
            C64305d33 d332 = this.f227356B;
            if (d332 != null) {
                aVar.mo74322i(23, d332.computeSize());
                this.f227356B.writeFields(aVar);
            }
            String str12 = this.f227357C;
            if (str12 != null) {
                aVar.mo74323j(24, str12);
            }
            String str13 = this.f227358D;
            if (str13 != null) {
                aVar.mo74323j(25, str13);
            }
            String str14 = this.f227359E;
            if (str14 != null) {
                aVar.mo74323j(26, str14);
            }
            aVar.mo74318e(27, this.f227360F);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str15 = this.f227361d;
            if (str15 != null) {
                i3 += C52418a.m58683j(2, str15);
            }
            String str16 = this.f227362e;
            if (str16 != null) {
                i3 += C52418a.m58683j(3, str16);
            }
            int e = i3 + C52418a.m58678e(4, this.f227363f);
            String str17 = this.f227364g;
            if (str17 != null) {
                e += C52418a.m58683j(5, str17);
            }
            int e2 = e + C52418a.m58678e(6, this.f227365h);
            String str18 = this.f227366i;
            if (str18 != null) {
                e2 += C52418a.m58683j(7, str18);
            }
            String str19 = this.f227367j;
            if (str19 != null) {
                e2 += C52418a.m58683j(8, str19);
            }
            int e3 = e2 + C52418a.m58678e(9, this.f227368n);
            String str20 = this.f227369o;
            if (str20 != null) {
                e3 += C52418a.m58683j(10, str20);
            }
            String str21 = this.f227370p;
            if (str21 != null) {
                e3 += C52418a.m58683j(11, str21);
            }
            C51018qv3 qv35 = this.f227371q;
            if (qv35 != null) {
                e3 += C52418a.m58682i(12, qv35.computeSize());
            }
            String str22 = this.f227372r;
            if (str22 != null) {
                e3 += C52418a.m58683j(13, str22);
            }
            int e4 = e3 + C52418a.m58678e(14, this.f227373s) + C52418a.m58678e(15, this.f227374t);
            String str23 = this.f227375u;
            if (str23 != null) {
                e4 += C52418a.m58683j(16, str23);
            }
            int e5 = e4 + C52418a.m58678e(17, this.f227376v);
            String str24 = this.f227377w;
            if (str24 != null) {
                e5 += C52418a.m58683j(18, str24);
            }
            C51018qv3 qv36 = this.f227378x;
            if (qv36 != null) {
                e5 += C52418a.m58682i(19, qv36.computeSize());
            }
            C51018qv3 qv37 = this.f227379y;
            if (qv37 != null) {
                e5 += C52418a.m58682i(20, qv37.computeSize());
            }
            String str25 = this.f227380z;
            if (str25 != null) {
                e5 += C52418a.m58683j(21, str25);
            }
            b64 b642 = this.f227355A;
            if (b642 != null) {
                e5 += C52418a.m58682i(22, b642.computeSize());
            }
            C64305d33 d333 = this.f227356B;
            if (d333 != null) {
                e5 += C52418a.m58682i(23, d333.computeSize());
            }
            String str26 = this.f227357C;
            if (str26 != null) {
                e5 += C52418a.m58683j(24, str26);
            }
            String str27 = this.f227358D;
            if (str27 != null) {
                e5 += C52418a.m58683j(25, str27);
            }
            String str28 = this.f227359E;
            if (str28 != null) {
                e5 += C52418a.m58683j(26, str28);
            }
            return e5 + C52418a.m58678e(27, this.f227360F);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77928fd fdVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        fdVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    fdVar.f227361d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fdVar.f227362e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fdVar.f227363f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    fdVar.f227364g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fdVar.f227365h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    fdVar.f227366i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    fdVar.f227367j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    fdVar.f227368n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    fdVar.f227369o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    fdVar.f227370p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv38 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv38.mo73348f(bArr2);
                        }
                        fdVar.f227371q = qv38;
                    }
                    return 0;
                case 13:
                    fdVar.f227372r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    fdVar.f227373s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    fdVar.f227374t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    fdVar.f227375u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    fdVar.f227376v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    fdVar.f227377w = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51018qv3 qv39 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv39.mo73348f(bArr3);
                        }
                        fdVar.f227378x = qv39;
                    }
                    return 0;
                case 20:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51018qv3 qv310 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv310.mo73348f(bArr4);
                        }
                        fdVar.f227379y = qv310;
                    }
                    return 0;
                case 21:
                    fdVar.f227380z = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        b64 b643 = new b64();
                        if (bArr5 != null && bArr5.length > 0) {
                            b643.parseFrom(bArr5);
                        }
                        fdVar.f227355A = b643;
                    }
                    return 0;
                case 23:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C64305d33 d334 = new C64305d33();
                        if (bArr6 != null && bArr6.length > 0) {
                            d334.parseFrom(bArr6);
                        }
                        fdVar.f227356B = d334;
                    }
                    return 0;
                case 24:
                    fdVar.f227357C = aVar3.mo141633k(intValue);
                    return 0;
                case 25:
                    fdVar.f227358D = aVar3.mo141633k(intValue);
                    return 0;
                case 26:
                    fdVar.f227359E = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    fdVar.f227360F = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C90417ia iaVar = this.BaseRequest;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseRequest", iaVar, false);
            aVar.mo71655d(jSONObject, "UserName", this.f227361d, false);
            aVar.mo71655d(jSONObject, "Mobile", this.f227362e, false);
            aVar.mo71655d(jSONObject, "Opcode", Integer.valueOf(this.f227363f), false);
            aVar.mo71655d(jSONObject, "Verifycode", this.f227364g, false);
            aVar.mo71655d(jSONObject, "DialFlag", Integer.valueOf(this.f227365h), false);
            aVar.mo71655d(jSONObject, "DialLang", this.f227366i, false);
            aVar.mo71655d(jSONObject, "AuthTicket", this.f227367j, false);
            aVar.mo71655d(jSONObject, "ForceReg", Integer.valueOf(this.f227368n), false);
            aVar.mo71655d(jSONObject, "SafeDeviceName", this.f227369o, false);
            aVar.mo71655d(jSONObject, "SafeDeviceType", this.f227370p, false);
            aVar.mo71655d(jSONObject, "RandomEncryKey", this.f227371q, false);
            aVar.mo71655d(jSONObject, "Language", this.f227372r, false);
            aVar.mo71655d(jSONObject, "InputMobileRetrys", Integer.valueOf(this.f227373s), false);
            aVar.mo71655d(jSONObject, "AdjustRet", Integer.valueOf(this.f227374t), false);
            aVar.mo71655d(jSONObject, "ClientSeqID", this.f227375u, false);
            aVar.mo71655d(jSONObject, "MobileCheckType", Integer.valueOf(this.f227376v), false);
            aVar.mo71655d(jSONObject, "RegSessionId", this.f227377w, false);
            aVar.mo71655d(jSONObject, "SpamBuffer", this.f227378x, false);
            aVar.mo71655d(jSONObject, "ExtSpamInfo", this.f227379y, false);
            aVar.mo71655d(jSONObject, "ThirdAppAuthTicket", this.f227380z, false);
            aVar.mo71655d(jSONObject, "SmsUpCheckExtInfo", this.f227355A, false);
            aVar.mo71655d(jSONObject, "networkCheckExtInfo", this.f227356B, false);
            aVar.mo71655d(jSONObject, "ExtRegUrl", this.f227357C, false);
            aVar.mo71655d(jSONObject, "PolicyAgreementTicket", this.f227358D, false);
            aVar.mo71655d(jSONObject, "VerifyTicket", this.f227359E, false);
            aVar.mo71655d(jSONObject, "IsAffiliated", Integer.valueOf(this.f227360F), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
