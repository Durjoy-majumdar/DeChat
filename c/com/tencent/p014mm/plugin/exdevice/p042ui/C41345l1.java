package com.tencent.p014mm.plugin.exdevice.p042ui;

import v71.C52778d;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.l1 */
public class C41345l1 {

    /* renamed from: a */
    public C52778d f111320a;

    /* renamed from: b */
    public int f111321b;

    /* renamed from: c */
    public int f111322c;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.l1$b */
    public static class C41347b {

        /* renamed from: a */
        public int f111323a;

        /* renamed from: b */
        public int f111324b;

        /* renamed from: c */
        public String f111325c;

        /* renamed from: d */
        public String f111326d;

        /* renamed from: e */
        public C52778d f111327e = null;

        /* renamed from: a */
        public C41345l1 mo64423a() {
            return new C41345l1(this.f111323a, this.f111324b, this.f111325c, this.f111326d, this.f111327e, (C41346a) null);
        }
    }

    public C41345l1(int i, int i2, String str, String str2, C52778d dVar, C41346a aVar) {
        this.f111321b = i;
        this.f111322c = i2;
        if (i == 0) {
            return;
        }
        if (dVar != null) {
            this.f111320a = dVar;
            return;
        }
        C52778d dVar2 = new C52778d();
        dVar2.field_username = str2;
        dVar2.field_appusername = str;
        dVar2.field_ranknum = 0;
        dVar2.field_selfLikeState = 0;
        dVar2.field_rankID = "";
        dVar2.field_likecount = 0;
        dVar2.field_score = 0;
        this.f111320a = dVar2;
    }

    public String toString() {
        String str;
        String str2 = "{ view type: " + this.f111321b + " display flag: " + this.f111322c;
        if (this.f111320a != null) {
            str = str2 + this.f111320a.toString();
        } else {
            str = str2 + " mExdeviceRankInfo is null";
        }
        return str + "}";
    }
}
