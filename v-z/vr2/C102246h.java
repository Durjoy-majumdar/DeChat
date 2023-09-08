package vr2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: vr2.h */
public class C102246h {

    /* renamed from: a */
    public int f301117a = -1;

    /* renamed from: b */
    public int f301118b = -1;

    /* renamed from: c */
    public int f301119c = -1;

    /* renamed from: d */
    public int f301120d = 0;

    /* renamed from: e */
    public String f301121e = "";

    /* renamed from: f */
    public String f301122f = "";

    /* renamed from: g */
    public String f301123g = "";

    /* renamed from: h */
    public int f301124h = -1;

    /* renamed from: i */
    public int f301125i = 0;

    /* renamed from: j */
    public int f301126j = -1;

    /* renamed from: k */
    public int f301127k = -1;

    /* renamed from: l */
    public int f301128l = 0;

    /* renamed from: a */
    public void mo141808a() {
        SnsMethodCalculate.markStartTimeMs("initCal", "com.tencent.mm.plugin.sns.data.CalInfo");
        this.f301118b = -1;
        this.f301126j = -1;
        this.f301117a = -1;
        this.f301121e = "";
        this.f301122f = "";
        this.f301123g = "";
        this.f301127k = -1;
        this.f301119c = -1;
        this.f301124h = -1;
        this.f301125i = 0;
        this.f301120d = 0;
        this.f301128l = 0;
        SnsMethodCalculate.markEndTimeMs("initCal", "com.tencent.mm.plugin.sns.data.CalInfo");
    }

    /* renamed from: b */
    public boolean mo141809b(int i) {
        SnsMethodCalculate.markStartTimeMs("isOneLineType", "com.tencent.mm.plugin.sns.data.CalInfo");
        if (!(i == 15 || i == 18 || i == 26 || i == 34 || i == 28 || i == 29)) {
            switch (i) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i) {
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i) {
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                    break;
                                default:
                                    SnsMethodCalculate.markEndTimeMs("isOneLineType", "com.tencent.mm.plugin.sns.data.CalInfo");
                                    return false;
                            }
                    }
            }
        }
        SnsMethodCalculate.markEndTimeMs("isOneLineType", "com.tencent.mm.plugin.sns.data.CalInfo");
        return true;
    }

    /* renamed from: c */
    public boolean mo141810c() {
        SnsMethodCalculate.markStartTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
        int i = this.f301124h;
        if (i == 2) {
            SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        } else if (this.f301118b == -1) {
            SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        } else if (i != this.f301119c) {
            SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        } else if (mo141809b(i)) {
            SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        } else if (mo141809b(this.f301119c)) {
            SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        } else if (this.f301125i > 1 || this.f301120d > 1) {
            SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        } else {
            String str = this.f301123g;
            if (str == null || str.equals("")) {
                String str2 = this.f301121e;
                if (str2 != null && !str2.equals("")) {
                    SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
                    return true;
                } else if (this.f301117a != this.f301118b) {
                    SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
                    return true;
                } else {
                    SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
                    return false;
                }
            } else {
                SnsMethodCalculate.markEndTimeMs("isOnlyOne", "com.tencent.mm.plugin.sns.data.CalInfo");
                return true;
            }
        }
    }

    /* renamed from: d */
    public boolean mo141811d() {
        SnsMethodCalculate.markStartTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
        if (this.f301126j == -1) {
            SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        }
        int i = this.f301119c;
        int i2 = this.f301127k;
        if (i != i2) {
            SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        } else if (mo141809b(i2)) {
            SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        } else if (this.f301128l > 1) {
            SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
            return true;
        } else {
            String str = this.f301122f;
            if (str != null && !str.equals("")) {
                SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
                return true;
            } else if (this.f301118b != this.f301126j) {
                SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
                return true;
            } else {
                SnsMethodCalculate.markEndTimeMs("isOnlyTwo", "com.tencent.mm.plugin.sns.data.CalInfo");
                return false;
            }
        }
    }
}
