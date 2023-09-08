package rg0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38524a8;
import te3.C51145rr2;

/* renamed from: rg0.e */
public class C13000e extends C38524a8 {

    /* renamed from: v */
    public static IAutoDBItem.MAutoDBInfo f37063v = C38524a8.initAutoDBInfo(C13000e.class);

    public C13000e() {
        this.field_uid = "0";
        this.field_name = "";
        this.field_devicetype = "";
        this.field_createtime = 0;
        this.field_online = false;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f37063v;
    }

    public C13000e(String str, String str2, String str3, long j, boolean z) {
        this.field_uid = str;
        this.field_name = str2;
        this.field_devicetype = str3;
        this.field_createtime = j;
        this.field_online = z;
    }

    public C13000e(C51145rr2 rr22) {
        this.field_uid = rr22.f141096d;
        this.field_devicetype = rr22.f141098f;
        this.field_name = rr22.f141097e;
        this.field_createtime = (long) rr22.f141099g;
        this.field_online = rr22.f141100h;
    }
}
