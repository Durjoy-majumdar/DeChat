package te3;

import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ti */
public class C51399ti extends C47465a {

    /* renamed from: d */
    public int f142235d;

    /* renamed from: e */
    public C50028jr3 f142236e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51399ti)) {
            return false;
        }
        C51399ti tiVar = (C51399ti) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142235d), Integer.valueOf(tiVar.f142235d)) && C46238a.m51546a(this.f142236e, tiVar.f142236e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142235d);
            C50028jr3 jr32 = this.f142236e;
            if (jr32 != null) {
                aVar.mo74322i(2, jr32.computeSize());
                this.f142236e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142235d) + 0;
            C50028jr3 jr33 = this.f142236e;
            return jr33 != null ? e + C52418a.m58682i(2, jr33.computeSize()) : e;
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
            C51399ti tiVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tiVar.f142235d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50028jr3 jr34 = new C50028jr3();
                    if (bArr != null && bArr.length > 0) {
                        jr34.parseFrom(bArr);
                    }
                    tiVar.f142236e = jr34;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f142235d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "size", valueOf, true);
            aVar.mo71655d(jSONObject, "color", this.f142236e, true);
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
                    if (hashCode != 3530753) {
                        if (hashCode == 94842723) {
                            if (next.equals("color")) {
                                c = 1;
                            }
                        }
                    } else if (next.equals("size")) {
                        c = 0;
                    }
                    if (c == 0) {
                        this.f142235d = ((Integer) jSONObject.opt(next)).intValue();
                    } else if (c == 1) {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof JSONObject) {
                            C50028jr3 jr32 = new C50028jr3();
                            jr32.toPb(((JSONObject) opt).toString());
                            this.f142236e = jr32;
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("BorderAttr", e, "", new Object[0]);
            }
        }
        return this;
    }
}
