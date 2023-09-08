package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h00 */
public class C49633h00 extends C47465a {

    /* renamed from: d */
    public String f134375d;

    /* renamed from: e */
    public C51245sh2 f134376e;

    /* renamed from: f */
    public C51429tp3 f134377f;

    /* renamed from: g */
    public C49493g00 f134378g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49633h00)) {
            return false;
        }
        C49633h00 h002 = (C49633h00) aVar;
        return C46238a.m51546a(this.f134375d, h002.f134375d) && C46238a.m51546a(this.f134376e, h002.f134376e) && C46238a.m51546a(this.f134377f, h002.f134377f) && C46238a.m51546a(this.f134378g, h002.f134378g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f134375d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C51245sh2 sh22 = this.f134376e;
            if (sh22 != null) {
                aVar.mo74322i(2, sh22.computeSize());
                this.f134376e.writeFields(aVar);
            }
            C51429tp3 tp32 = this.f134377f;
            if (tp32 != null) {
                aVar.mo74322i(3, tp32.computeSize());
                this.f134377f.writeFields(aVar);
            }
            C49493g00 g002 = this.f134378g;
            if (g002 != null) {
                aVar.mo74322i(4, g002.computeSize());
                this.f134378g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f134375d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C51245sh2 sh23 = this.f134376e;
            if (sh23 != null) {
                i2 += C52418a.m58682i(2, sh23.computeSize());
            }
            C51429tp3 tp33 = this.f134377f;
            if (tp33 != null) {
                i2 += C52418a.m58682i(3, tp33.computeSize());
            }
            C49493g00 g003 = this.f134378g;
            return g003 != null ? i2 + C52418a.m58682i(4, g003.computeSize()) : i2;
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
            C49633h00 h002 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                h002.f134375d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51245sh2 sh24 = new C51245sh2();
                    if (bArr != null && bArr.length > 0) {
                        sh24.parseFrom(bArr);
                    }
                    h002.f134376e = sh24;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51429tp3 tp34 = new C51429tp3();
                    if (bArr2 != null && bArr2.length > 0) {
                        tp34.parseFrom(bArr2);
                    }
                    h002.f134377f = tp34;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49493g00 g004 = new C49493g00();
                    if (bArr3 != null && bArr3.length > 0) {
                        g004.parseFrom(bArr3);
                    }
                    h002.f134378g = g004;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f134375d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, MimeTypes.BASE_TYPE_TEXT, str, true);
            aVar.mo71655d(jSONObject, "icon", this.f134376e, true);
            aVar.mo71655d(jSONObject, "reddot_pendant", this.f134377f, true);
            aVar.mo71655d(jSONObject, "content_attr", this.f134378g, true);
        } catch (Exception unused) {
        }
        return jSONObject;
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
                        case 3226745:
                            if (next.equals("icon")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (next.equals(MimeTypes.BASE_TYPE_TEXT)) {
                                c = 0;
                                break;
                            }
                            break;
                        case 831275511:
                            if (next.equals("content_attr")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1474965877:
                            if (next.equals("reddot_pendant")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        this.f134375d = (String) jSONObject.opt(next);
                    } else if (c == 1) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            C51245sh2 sh22 = new C51245sh2();
                            sh22.toPb(((JSONObject) opt).toString());
                            this.f134376e = sh22;
                        }
                    } else if (c == 2) {
                        Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof JSONObject) {
                            C51429tp3 tp32 = new C51429tp3();
                            tp32.toPb(((JSONObject) opt2).toString());
                            this.f134377f = tp32;
                        }
                    } else if (c == 3) {
                        Object opt3 = jSONObject.opt(next);
                        if (opt3 instanceof JSONObject) {
                            C49493g00 g002 = new C49493g00();
                            g002.toPb(((JSONObject) opt3).toString());
                            this.f134378g = g002;
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("ContentDetail", e, "", new Object[0]);
            }
        }
        return this;
    }
}
