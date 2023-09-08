package te3;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ey3 */
public class C64352ey3 extends C47465a {

    /* renamed from: d */
    public String f183051d;

    /* renamed from: e */
    public String f183052e;

    /* renamed from: f */
    public int f183053f;

    /* renamed from: g */
    public String f183054g;

    /* renamed from: h */
    public C64307d73 f183055h;

    /* renamed from: i */
    public String f183056i;

    /* renamed from: j */
    public int f183057j;

    /* renamed from: n */
    public C89349b f183058n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64352ey3)) {
            return false;
        }
        C64352ey3 ey32 = (C64352ey3) aVar;
        return C46238a.m51546a(this.f183051d, ey32.f183051d) && C46238a.m51546a(this.f183052e, ey32.f183052e) && C46238a.m51546a(Integer.valueOf(this.f183053f), Integer.valueOf(ey32.f183053f)) && C46238a.m51546a(this.f183054g, ey32.f183054g) && C46238a.m51546a(this.f183055h, ey32.f183055h) && C46238a.m51546a(this.f183056i, ey32.f183056i) && C46238a.m51546a(Integer.valueOf(this.f183057j), Integer.valueOf(ey32.f183057j)) && C46238a.m51546a(this.f183058n, ey32.f183058n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183051d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183052e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f183053f);
            String str3 = this.f183054g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            C64307d73 d732 = this.f183055h;
            if (d732 != null) {
                aVar.mo74322i(5, d732.computeSize());
                this.f183055h.writeFields(aVar);
            }
            String str4 = this.f183056i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f183057j);
            C89349b bVar = this.f183058n;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f183051d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f183052e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f183053f);
            String str7 = this.f183054g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            C64307d73 d733 = this.f183055h;
            if (d733 != null) {
                e += C52418a.m58682i(5, d733.computeSize());
            }
            String str8 = this.f183056i;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            int e2 = e + C52418a.m58678e(7, this.f183057j);
            C89349b bVar2 = this.f183058n;
            return bVar2 != null ? e2 + C52418a.m58675b(8, bVar2) : e2;
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
            C64352ey3 ey32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ey32.f183051d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ey32.f183052e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ey32.f183053f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ey32.f183054g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64307d73 d734 = new C64307d73();
                        if (bArr != null && bArr.length > 0) {
                            d734.parseFrom(bArr);
                        }
                        ey32.f183055h = d734;
                    }
                    return 0;
                case 6:
                    ey32.f183056i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ey32.f183057j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ey32.f183058n = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public C47465a toPb(String str) {
        if (!(str == null || "" == str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    char c = 65535;
                    switch (next.hashCode()) {
                        case -1569063082:
                            if (next.equals("openim_finder_info")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -1125980387:
                            if (next.equals("tp_type")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1068855134:
                            if (next.equals("mobile")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 116079:
                            if (next.equals("url")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 109254796:
                            if (next.equals(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
                                c = 6;
                                break;
                            }
                            break;
                        case 171880113:
                            if (next.equals("tp_qrcode")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 253328057:
                            if (next.equals("spam_context")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 893190521:
                            if (next.equals("tp_multi_user_qrcode")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f183051d = (String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f183052e = (String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f183053f = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            this.f183054g = (String) jSONObject.opt(next);
                            break;
                        case 4:
                            Object opt = jSONObject.opt(next);
                            if (!(opt instanceof JSONObject)) {
                                break;
                            } else {
                                C64307d73 d732 = new C64307d73();
                                d732.toPb(((JSONObject) opt).toString());
                                this.f183055h = d732;
                                break;
                            }
                        case 5:
                            this.f183056i = (String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f183057j = ((Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 7:
                            Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof String)) {
                                break;
                            } else {
                                this.f183058n = C89349b.m111674a(Base64.decode((String) opt2, 0));
                                break;
                            }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("SearchOpenIMContactReq", e, "", new Object[0]);
            }
        }
        return this;
    }
}
