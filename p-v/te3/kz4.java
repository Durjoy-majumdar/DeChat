package te3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class kz4 extends C101820nt3 {

    /* renamed from: d */
    public double f137107d;

    /* renamed from: e */
    public double f137108e;

    /* renamed from: f */
    public String f137109f;

    /* renamed from: g */
    public int f137110g;

    /* renamed from: h */
    public String f137111h;

    /* renamed from: i */
    public int f137112i;

    /* renamed from: j */
    public LinkedList<kp4> f137113j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof kz4)) {
            return false;
        }
        kz4 kz4 = (kz4) aVar;
        return C46238a.m51546a(this.BaseRequest, kz4.BaseRequest) && C46238a.m51546a(Double.valueOf(this.f137107d), Double.valueOf(kz4.f137107d)) && C46238a.m51546a(Double.valueOf(this.f137108e), Double.valueOf(kz4.f137108e)) && C46238a.m51546a(this.f137109f, kz4.f137109f) && C46238a.m51546a(Integer.valueOf(this.f137110g), Integer.valueOf(kz4.f137110g)) && C46238a.m51546a(this.f137111h, kz4.f137111h) && C46238a.m51546a(Integer.valueOf(this.f137112i), Integer.valueOf(kz4.f137112i)) && C46238a.m51546a(this.f137113j, kz4.f137113j);
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
            aVar.mo74316c(2, this.f137107d);
            aVar.mo74316c(3, this.f137108e);
            String str = this.f137109f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f137110g);
            String str2 = this.f137111h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f137112i);
            aVar.mo74320g(8, 8, this.f137113j);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int c = i2 + C52418a.m58676c(2, this.f137107d) + C52418a.m58676c(3, this.f137108e);
            String str3 = this.f137109f;
            if (str3 != null) {
                c += C52418a.m58683j(4, str3);
            }
            int e = c + C52418a.m58678e(5, this.f137110g);
            String str4 = this.f137111h;
            if (str4 != null) {
                e += C52418a.m58683j(6, str4);
            }
            return e + C52418a.m58678e(7, this.f137112i) + C52418a.m58680g(8, 8, this.f137113j);
        } else if (i == 2) {
            this.f137113j.clear();
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
            kz4 kz4 = objArr[1];
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
                        kz4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    kz4.f137107d = aVar3.mo141627e(intValue);
                    return 0;
                case 3:
                    kz4.f137108e = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    kz4.f137109f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    kz4.f137110g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    kz4.f137111h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    kz4.f137112i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        kp4 kp4 = new kp4();
                        if (bArr2 != null && bArr2.length > 0) {
                            kp4.parseFrom(bArr2);
                        }
                        kz4.f137113j.add(kp4);
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
            C90417ia iaVar = this.BaseRequest;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseRequest", iaVar, false);
            aVar.mo71655d(jSONObject, "locationX", Double.valueOf(this.f137107d), false);
            aVar.mo71655d(jSONObject, "locationY", Double.valueOf(this.f137108e), false);
            aVar.mo71655d(jSONObject, TPReportKeys.LiveExKeys.LIVE_EX_NET_TYPE, this.f137109f, false);
            aVar.mo71655d(jSONObject, "h5Version", Integer.valueOf(this.f137110g), false);
            aVar.mo71655d(jSONObject, "sessionId", this.f137111h, false);
            aVar.mo71655d(jSONObject, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.f137112i), false);
            aVar.mo71655d(jSONObject, "ExtReqParams", this.f137113j, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
