package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.pluginsdk.model.app.u1 */
public class C72693u1 {

    /* renamed from: a */
    public String f211520a = null;

    /* renamed from: b */
    public String f211521b = null;

    /* renamed from: c */
    public String f211522c = null;

    /* renamed from: d */
    public int f211523d = 0;

    /* renamed from: e */
    public boolean f211524e = false;

    /* renamed from: com.tencent.mm.pluginsdk.model.app.u1$a */
    public enum C72694a {
        OK(1),
        TOKEN_EMPTY(2),
        TOKEN_DATA_NOT_MATCH(3),
        PACKAGE_NAME_INVALID(4),
        GET_TOKEN(99);
        

        /* renamed from: d */
        public int f211531d;

        /* access modifiers changed from: public */
        C72694a(int i) {
            this.f211531d = i;
        }

        public String toString() {
            return String.format("%s(%s)", new Object[]{super.toString(), Integer.valueOf(this.f211531d)});
        }
    }

    /* renamed from: a */
    public String mo100163a(String str) {
        return (!this.f211524e || Util.isNullOrNil(this.f211521b)) ? Util.nullAs(str, "") : this.f211521b;
    }

    public String toString() {
        return "OpenSDKTokenData{packageName=" + this.f211521b + ", openSDKVersion=" + this.f211523d + ", isValid=" + this.f211524e + "}";
    }
}
