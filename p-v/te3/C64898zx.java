package te3;

import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zx */
public class C64898zx extends C47465a {

    /* renamed from: d */
    public long f186894d;

    /* renamed from: e */
    public String f186895e;

    /* renamed from: f */
    public String f186896f;

    /* renamed from: g */
    public String f186897g;

    /* renamed from: h */
    public C64786vx f186898h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64898zx)) {
            return false;
        }
        C64898zx zxVar = (C64898zx) aVar;
        return C46238a.m51546a(Long.valueOf(this.f186894d), Long.valueOf(zxVar.f186894d)) && C46238a.m51546a(this.f186895e, zxVar.f186895e) && C46238a.m51546a(this.f186896f, zxVar.f186896f) && C46238a.m51546a(this.f186897g, zxVar.f186897g) && C46238a.m51546a(this.f186898h, zxVar.f186898h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f186894d);
            String str = this.f186895e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f186896f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f186897g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            C64786vx vxVar = this.f186898h;
            if (vxVar != null) {
                aVar.mo74322i(5, vxVar.computeSize());
                this.f186898h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f186894d) + 0;
            String str4 = this.f186895e;
            if (str4 != null) {
                h += C52418a.m58683j(2, str4);
            }
            String str5 = this.f186896f;
            if (str5 != null) {
                h += C52418a.m58683j(3, str5);
            }
            String str6 = this.f186897g;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            C64786vx vxVar2 = this.f186898h;
            return vxVar2 != null ? h + C52418a.m58682i(5, vxVar2.computeSize()) : h;
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
            C64898zx zxVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zxVar.f186894d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                zxVar.f186895e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                zxVar.f186896f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                zxVar.f186897g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64786vx vxVar3 = new C64786vx();
                    if (bArr != null && bArr.length > 0) {
                        vxVar3.parseFrom(bArr);
                    }
                    zxVar.f186898h = vxVar3;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f186894d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, AppMeasurement.Param.TIMESTAMP, valueOf, false);
            aVar.mo71655d(jSONObject, "objectBuffer", this.f186895e, false);
            aVar.mo71655d(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_COMMENT, this.f186896f, false);
            aVar.mo71655d(jSONObject, "requestId", this.f186897g, false);
            aVar.mo71655d(jSONObject, "appInfo", this.f186898h, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
