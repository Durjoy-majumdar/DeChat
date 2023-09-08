package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kr3 */
public class C50170kr3 extends C47465a {

    /* renamed from: d */
    public C49633h00 f137019d;

    /* renamed from: e */
    public C49633h00 f137020e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50170kr3)) {
            return false;
        }
        C50170kr3 kr32 = (C50170kr3) aVar;
        return C46238a.m51546a(this.f137019d, kr32.f137019d) && C46238a.m51546a(this.f137020e, kr32.f137020e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49633h00 h002 = this.f137019d;
            if (h002 != null) {
                aVar.mo74322i(1, h002.computeSize());
                this.f137019d.writeFields(aVar);
            }
            C49633h00 h003 = this.f137020e;
            if (h003 != null) {
                aVar.mo74322i(2, h003.computeSize());
                this.f137020e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49633h00 h004 = this.f137019d;
            if (h004 != null) {
                i2 = 0 + C52418a.m58682i(1, h004.computeSize());
            }
            C49633h00 h005 = this.f137020e;
            return h005 != null ? i2 + C52418a.m58682i(2, h005.computeSize()) : i2;
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
            C50170kr3 kr32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49633h00 h006 = new C49633h00();
                    if (bArr != null && bArr.length > 0) {
                        h006.parseFrom(bArr);
                    }
                    kr32.f137019d = h006;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49633h00 h007 = new C49633h00();
                    if (bArr2 != null && bArr2.length > 0) {
                        h007.parseFrom(bArr2);
                    }
                    kr32.f137020e = h007;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C49633h00 h002 = this.f137019d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "original", h002, true);
            aVar.mo71655d(jSONObject, AssetExtension.SCENE_THUMBNAIL, this.f137020e, true);
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
                    if (hashCode != 1330532588) {
                        if (hashCode == 1379043793) {
                            if (next.equals("original")) {
                                c = 0;
                            }
                        }
                    } else if (next.equals(AssetExtension.SCENE_THUMBNAIL)) {
                        c = 1;
                    }
                    if (c == 0) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            C49633h00 h002 = new C49633h00();
                            h002.toPb(((JSONObject) opt).toString());
                            this.f137019d = h002;
                        }
                    } else if (c == 1) {
                        Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof JSONObject) {
                            C49633h00 h003 = new C49633h00();
                            h003.toPb(((JSONObject) opt2).toString());
                            this.f137020e = h003;
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("RenderContent", e, "", new Object[0]);
            }
        }
        return this;
    }
}
