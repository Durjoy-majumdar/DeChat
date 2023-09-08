package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.comps.offlinemap.OfflineItem;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import java.io.File;

/* renamed from: com.tencent.mapsdk.internal.ca */
public final class C113584ca extends JsonComposer {
    @Json(ignore = true)

    /* renamed from: a */
    public String f339933a;
    @Json(name = "md5")

    /* renamed from: b */
    public String f339934b;
    @Json(name = "pinyin")

    /* renamed from: c */
    public String f339935c;
    @Json(name = "size")

    /* renamed from: d */
    public int f339936d;
    @Json(name = "ver")

    /* renamed from: e */
    public int f339937e;

    /* renamed from: a */
    private boolean m156435a(OfflineItem offlineItem) {
        return offlineItem.getPinyin().equals(this.f339935c);
    }

    /* renamed from: b */
    private String m156437b() {
        return this.f339935c + ".zip";
    }

    /* renamed from: c */
    private String m156439c() {
        return this.f339933a + File.separator + this.f339935c + this.f339937e + ".zip";
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("OfflineMapConfigCity{");
        stringBuffer.append("url='");
        stringBuffer.append(this.f339933a);
        stringBuffer.append('\'');
        stringBuffer.append(", md5='");
        stringBuffer.append(this.f339934b);
        stringBuffer.append('\'');
        stringBuffer.append(", pinyin='");
        stringBuffer.append(this.f339935c);
        stringBuffer.append('\'');
        stringBuffer.append(", size=");
        stringBuffer.append(this.f339936d);
        stringBuffer.append(", version=");
        stringBuffer.append(this.f339937e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private void m156438b(C113955mh mhVar) {
        if (mhVar != null) {
            mhVar.mo172395a(this.f339935c + "-md5", this.f339934b);
            mhVar.mo172393a(this.f339935c + "-version", this.f339937e);
        }
    }

    /* renamed from: a */
    public final String mo171904a() {
        return this.f339935c + ".dat";
    }

    /* renamed from: a */
    private boolean m156436a(C113955mh mhVar) {
        if (mhVar == null) {
            return false;
        }
        String a = mhVar.mo172391a(this.f339935c + "-md5");
        if (this.f339937e != mhVar.mo172398b(this.f339935c + "-version", -1)) {
            return true;
        }
        if (a == null || a.equals(this.f339934b)) {
            return false;
        }
        return true;
    }
}
