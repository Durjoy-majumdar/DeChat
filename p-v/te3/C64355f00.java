package te3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f00 */
public class C64355f00 extends C47465a {

    /* renamed from: d */
    public String f183065d;

    /* renamed from: e */
    public wc4 f183066e;

    /* renamed from: f */
    public int f183067f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64355f00)) {
            return false;
        }
        C64355f00 f002 = (C64355f00) aVar;
        return C46238a.m51546a(this.f183065d, f002.f183065d) && C46238a.m51546a(this.f183066e, f002.f183066e) && C46238a.m51546a(Integer.valueOf(this.f183067f), Integer.valueOf(f002.f183067f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183065d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            wc4 wc4 = this.f183066e;
            if (wc4 != null) {
                aVar.mo74322i(2, wc4.computeSize());
                this.f183066e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f183067f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f183065d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            wc4 wc42 = this.f183066e;
            if (wc42 != null) {
                i2 += C52418a.m58682i(2, wc42.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f183067f);
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
            C64355f00 f002 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                f002.f183065d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    wc4 wc43 = new wc4();
                    if (bArr != null && bArr.length > 0) {
                        wc43.parseFrom(bArr);
                    }
                    f002.f183066e = wc43;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                f002.f183067f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f183065d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, str, true);
            aVar.mo71655d(jSONObject, "subContent", this.f183066e, true);
            aVar.mo71655d(jSONObject, "redDotControl", Integer.valueOf(this.f183067f), true);
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
                    int hashCode = next.hashCode();
                    if (hashCode != -530086375) {
                        if (hashCode != 110371416) {
                            if (hashCode == 1139504965) {
                                if (next.equals("redDotControl")) {
                                    c = 2;
                                }
                            }
                        } else if (next.equals(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                            c = 0;
                        }
                    } else if (next.equals("subContent")) {
                        c = 1;
                    }
                    if (c == 0) {
                        this.f183065d = (String) jSONObject.opt(next);
                    } else if (c == 1) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            wc4 wc4 = new wc4();
                            wc4.toPb(((JSONObject) opt).toString());
                            this.f183066e = wc4;
                        }
                    } else if (c == 2) {
                        this.f183067f = ((Integer) jSONObject.opt(next)).intValue();
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("Content", e, "", new Object[0]);
            }
        }
        return this;
    }
}
