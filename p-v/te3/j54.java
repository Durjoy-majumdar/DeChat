package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class j54 extends C47465a {

    /* renamed from: d */
    public String f298489d;

    /* renamed from: e */
    public int f298490e;

    /* renamed from: f */
    public int f298491f;

    /* renamed from: g */
    public String f298492g;

    /* renamed from: h */
    public String f298493h;

    /* renamed from: i */
    public int f298494i;

    /* renamed from: j */
    public C48884bn2 f298495j;

    /* renamed from: n */
    public int f298496n;

    /* renamed from: o */
    public String f298497o;

    /* renamed from: p */
    public int f298498p;

    /* renamed from: q */
    public String f298499q;

    /* renamed from: r */
    public String f298500r;

    /* renamed from: s */
    public C64816wv f298501s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof j54)) {
            return false;
        }
        j54 j54 = (j54) aVar;
        return C46238a.m51546a(this.f298489d, j54.f298489d) && C46238a.m51546a(Integer.valueOf(this.f298490e), Integer.valueOf(j54.f298490e)) && C46238a.m51546a(Integer.valueOf(this.f298491f), Integer.valueOf(j54.f298491f)) && C46238a.m51546a(this.f298492g, j54.f298492g) && C46238a.m51546a(this.f298493h, j54.f298493h) && C46238a.m51546a(Integer.valueOf(this.f298494i), Integer.valueOf(j54.f298494i)) && C46238a.m51546a(this.f298495j, j54.f298495j) && C46238a.m51546a(Integer.valueOf(this.f298496n), Integer.valueOf(j54.f298496n)) && C46238a.m51546a(this.f298497o, j54.f298497o) && C46238a.m51546a(Integer.valueOf(this.f298498p), Integer.valueOf(j54.f298498p)) && C46238a.m51546a(this.f298499q, j54.f298499q) && C46238a.m51546a(this.f298500r, j54.f298500r) && C46238a.m51546a(this.f298501s, j54.f298501s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298489d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f298490e);
            aVar.mo74318e(3, this.f298491f);
            String str2 = this.f298492g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f298493h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f298494i);
            C48884bn2 bn22 = this.f298495j;
            if (bn22 != null) {
                aVar.mo74322i(7, bn22.computeSize());
                this.f298495j.writeFields(aVar);
            }
            aVar.mo74318e(8, this.f298496n);
            String str4 = this.f298497o;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            aVar.mo74318e(10, this.f298498p);
            String str5 = this.f298499q;
            if (str5 != null) {
                aVar.mo74323j(11, str5);
            }
            String str6 = this.f298500r;
            if (str6 != null) {
                aVar.mo74323j(12, str6);
            }
            C64816wv wvVar = this.f298501s;
            if (wvVar == null) {
                return 0;
            }
            aVar.mo74322i(13, wvVar.computeSize());
            this.f298501s.writeFields(aVar);
            return 0;
        } else if (i2 == 1) {
            String str7 = this.f298489d;
            int j = (str7 != null ? 0 + C52418a.m58683j(1, str7) : 0) + C52418a.m58678e(2, this.f298490e) + C52418a.m58678e(3, this.f298491f);
            String str8 = this.f298492g;
            if (str8 != null) {
                j += C52418a.m58683j(4, str8);
            }
            String str9 = this.f298493h;
            if (str9 != null) {
                j += C52418a.m58683j(5, str9);
            }
            int e = j + C52418a.m58678e(6, this.f298494i);
            C48884bn2 bn23 = this.f298495j;
            if (bn23 != null) {
                e += C52418a.m58682i(7, bn23.computeSize());
            }
            int e2 = e + C52418a.m58678e(8, this.f298496n);
            String str10 = this.f298497o;
            if (str10 != null) {
                e2 += C52418a.m58683j(9, str10);
            }
            int e3 = e2 + C52418a.m58678e(10, this.f298498p);
            String str11 = this.f298499q;
            if (str11 != null) {
                e3 += C52418a.m58683j(11, str11);
            }
            String str12 = this.f298500r;
            if (str12 != null) {
                e3 += C52418a.m58683j(12, str12);
            }
            C64816wv wvVar2 = this.f298501s;
            return wvVar2 != null ? e3 + C52418a.m58682i(13, wvVar2.computeSize()) : e3;
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
            j54 j54 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    j54.f298489d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    j54.f298490e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    j54.f298491f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    j54.f298492g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    j54.f298493h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    j54.f298494i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C48884bn2 bn24 = new C48884bn2();
                        if (bArr != null && bArr.length > 0) {
                            bn24.parseFrom(bArr);
                        }
                        j54.f298495j = bn24;
                    }
                    return 0;
                case 8:
                    j54.f298496n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    j54.f298497o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    j54.f298498p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    j54.f298499q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    j54.f298500r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size2 = j3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j3.get(i4);
                        C64816wv wvVar3 = new C64816wv();
                        if (bArr2 != null && bArr2.length > 0) {
                            wvVar3.parseFrom(bArr2);
                        }
                        j54.f298501s = wvVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f298489d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Md5", str, false);
            aVar.mo71655d(jSONObject, "Offset", Integer.valueOf(this.f298490e), false);
            aVar.mo71655d(jSONObject, "Scene", Integer.valueOf(this.f298491f), false);
            aVar.mo71655d(jSONObject, "SearchId", this.f298492g, false);
            aVar.mo71655d(jSONObject, "SessionId", this.f298493h, false);
            aVar.mo71655d(jSONObject, "H5Version", Integer.valueOf(this.f298494i), false);
            aVar.mo71655d(jSONObject, "Location", this.f298495j, false);
            aVar.mo71655d(jSONObject, "Tab", Integer.valueOf(this.f298496n), false);
            aVar.mo71655d(jSONObject, "RequestId", this.f298497o, false);
            aVar.mo71655d(jSONObject, "RequestType", Integer.valueOf(this.f298498p), false);
            aVar.mo71655d(jSONObject, "EmojiUrl", this.f298499q, false);
            aVar.mo71655d(jSONObject, "AesKey", this.f298500r, false);
            aVar.mo71655d(jSONObject, "ChildMode", this.f298501s, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
