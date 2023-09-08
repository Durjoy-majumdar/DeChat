package oc1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import te3.C101825od0;

/* renamed from: oc1.a */
public class C100324a {

    /* renamed from: a */
    public int f293905a = 1;

    /* renamed from: b */
    public int f293906b;

    /* renamed from: c */
    public int f293907c;

    /* renamed from: d */
    public int f293908d;

    /* renamed from: e */
    public String f293909e;

    /* renamed from: f */
    public int f293910f;

    /* renamed from: g */
    public String f293911g;

    /* renamed from: h */
    public int f293912h;

    /* renamed from: i */
    public String f293913i;

    /* renamed from: j */
    public int f293914j;

    /* renamed from: k */
    public long f293915k;

    /* renamed from: l */
    public long f293916l;

    /* renamed from: a */
    public static String m131159a() {
        return String.format("%s_%s", new Object[]{C75592q0.m90789s(), Long.valueOf(System.currentTimeMillis())});
    }

    /* renamed from: c */
    public static int m131160c(int i) {
        if (i == 3) {
            return 6;
        }
        if (i == 5) {
            return 2;
        }
        if (i == 6) {
            return 8;
        }
        if (i == 7) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 17) {
            return 5;
        }
        if (i == 18) {
            return 7;
        }
        switch (i) {
            case 20:
                return 10;
            case 21:
                return 1;
            case 22:
                return 9;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public void mo139616b() {
        Log.m105918d("MicroMsg.ReportSearchCTR", String.format("zst, 15488 on report, actionType %s, subScene %s, scene %s, actionTime %s, query %s, tabId %s, searchId:%s, searchCost:%s, localPosition %s, localResultCount %s", new Object[]{Integer.valueOf(this.f293905a), Integer.valueOf(this.f293906b), Integer.valueOf(this.f293907c), Integer.valueOf(this.f293908d), this.f293909e, Integer.valueOf(this.f293910f), this.f293911g, Integer.valueOf(this.f293912h), this.f293913i, Integer.valueOf(this.f293914j)}));
        C115669n.INSTANCE.mo160131h(15488, Integer.valueOf(this.f293905a), Integer.valueOf(this.f293906b), Integer.valueOf(this.f293907c), 0, Integer.valueOf(this.f293908d), this.f293909e, 0L, Integer.valueOf(this.f293910f), this.f293911g, Integer.valueOf(this.f293912h), "0", this.f293913i, 0, Integer.valueOf(this.f293914j), "0");
    }

    /* renamed from: d */
    public boolean mo139617d(C101825od0 od02) {
        if (od02 == null) {
            return false;
        }
        this.f293910f = od02.f299031f;
        this.f293907c = od02.f299029d;
        this.f293906b = od02.f299030e;
        this.f293913i = od02.f299032g;
        this.f293914j = od02.f299033h;
        this.f293909e = od02.f299034i;
        return true;
    }

    /* renamed from: e */
    public boolean mo139618e(C101825od0 od02) {
        if (od02 == null) {
            return false;
        }
        od02.f299031f = this.f293910f;
        od02.f299029d = this.f293907c;
        od02.f299030e = this.f293906b;
        od02.f299032g = this.f293913i;
        od02.f299033h = this.f293914j;
        od02.f299034i = this.f293909e;
        return true;
    }
}
