package com.tencent.wework.api.model;

import android.os.Bundle;
import com.tencent.wework.api.model.WWMediaMessage;

public class WWMediaMiniProgram extends WWMediaMessage.WWMediaObject {

    /* renamed from: f */
    public String f285821f;

    /* renamed from: g */
    public String f285822g;

    /* renamed from: h */
    public byte[] f285823h;

    /* renamed from: i */
    public String f285824i;

    /* renamed from: j */
    public String f285825j;

    /* renamed from: k */
    public int f285826k;

    /* renamed from: l */
    public boolean f285827l = false;

    /* renamed from: m */
    public Bundle f285828m = new Bundle();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r4.f285821f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r0 = r4.f285823h;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo136616b() {
        /*
            r4 = this;
            boolean r0 = super.mo136616b()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = r4.f285821f
            if (r0 == 0) goto L_0x0022
            int r0 = r0.length()
            r2 = 1
            if (r0 >= r2) goto L_0x0014
            goto L_0x0022
        L_0x0014:
            byte[] r0 = r4.f285823h
            if (r0 == 0) goto L_0x0022
            int r3 = r0.length
            if (r3 < r2) goto L_0x0022
            int r0 = r0.length
            r3 = 134217728(0x8000000, float:3.85186E-34)
            if (r0 <= r3) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            return r2
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wework.api.model.WWMediaMiniProgram.mo136616b():boolean");
    }

    /* renamed from: f */
    public void mo136619f(Bundle bundle) {
        bundle.putString("_wwwxaobject_userName", this.f285821f);
        String str = this.f285822g;
        if (str == null) {
            str = "";
        }
        bundle.putString("_wwwxaobject_path", str);
        String str2 = this.f285824i;
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString("_wwwxaobject_iconUrl", str2);
        String str3 = this.f285825j;
        if (str3 == null) {
            str3 = "";
        }
        bundle.putString("_wwwxaobject_name", str3);
        bundle.putByteArray("_wwwxaobject_hdImageData", this.f285823h);
        bundle.putInt("_wwwxaobject_type", this.f285826k);
        bundle.putString("_wwwxaobject_webpageurl", "");
        bundle.putInt("_wwwxaobject_programtype", 0);
        bundle.putBoolean("_wwwxminiprogram_issecretmsg", this.f285827l);
        bundle.putBundle("_wwwxminiprogram_ext", this.f285828m);
        super.mo136619f(bundle);
    }
}
