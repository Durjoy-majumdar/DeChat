package p53;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.wecoin.model.WecoinEncashKVData;
import te3.C48943c22;
import te3.C49028cn3;
import te3.C50292lo2;
import te3.C51310sx;

/* renamed from: p53.r */
public final class C11851r extends C39622i0 {

    /* renamed from: d */
    public final int f34655d;

    /* renamed from: e */
    public C54219z<String> f34656e = new C54219z<>();

    /* renamed from: f */
    public C54219z<String> f34657f = new C54219z<>();

    /* renamed from: g */
    public C54219z<Long> f34658g = new C54219z<>();

    /* renamed from: h */
    public C54219z<Long> f34659h = new C54219z<>();

    /* renamed from: i */
    public C54219z<C49028cn3> f34660i = new C54219z<>();

    /* renamed from: j */
    public final C54219z<C51310sx> f34661j = new C54219z<>();

    /* renamed from: n */
    public final C54219z<C11828a> f34662n = new C54219z<>();

    /* renamed from: o */
    public final C54219z<Boolean> f34663o = new C54219z<>();

    /* renamed from: p */
    public final C54219z<Boolean> f34664p = new C54219z<>();

    /* renamed from: q */
    public C48943c22 f34665q;

    /* renamed from: r */
    public C50292lo2 f34666r;

    /* renamed from: s */
    public WecoinEncashKVData f34667s;

    /* renamed from: t */
    public boolean f34668t;

    /* renamed from: u */
    public String f34669u = "";

    public C11851r(int i) {
        this.f34655d = i;
    }

    /* renamed from: c3 */
    public final String mo11730c3() {
        StringBuilder sb = new StringBuilder();
        sb.append("appid:");
        C50292lo2 lo22 = this.f34666r;
        String str = null;
        sb.append(lo22 != null ? lo22.f137549d : null);
        sb.append(", query:");
        C50292lo2 lo23 = this.f34666r;
        sb.append(lo23 != null ? lo23.f137550e : null);
        sb.append(", path:");
        C50292lo2 lo24 = this.f34666r;
        sb.append(lo24 != null ? lo24.f137551f : null);
        sb.append(", default_url:");
        C50292lo2 lo25 = this.f34666r;
        if (lo25 != null) {
            str = lo25.f137552g;
        }
        sb.append(str);
        sb.append(", ");
        return sb.toString();
    }

    /* renamed from: d3 */
    public final void mo11731d3(String str, int i, int i2, int i3, String str2) {
        String str3;
        WecoinEncashKVData wecoinEncashKVData = this.f34667s;
        if (wecoinEncashKVData == null || (str3 = wecoinEncashKVData.f21838e) == null) {
            str3 = "";
        }
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[7];
        objArr[0] = Integer.valueOf(wecoinEncashKVData != null ? wecoinEncashKVData.f21837d : 1);
        objArr[1] = str3;
        objArr[2] = str;
        objArr[3] = Integer.valueOf(i);
        objArr[4] = Integer.valueOf(i2);
        objArr[5] = Integer.valueOf(i3);
        objArr[6] = str2;
        nVar.mo160131h(22129, objArr);
    }

    /* renamed from: e3 */
    public final void mo11732e3(int i) {
        WecoinEncashKVData wecoinEncashKVData = this.f34667s;
        if (wecoinEncashKVData != null) {
            int i2 = wecoinEncashKVData.f21837d;
            String str = wecoinEncashKVData.f21838e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = wecoinEncashKVData.f21839f;
            if (str3 != null) {
                str2 = str3;
            }
            C115669n.INSTANCE.mo160131h(21655, Integer.valueOf(i2), str, Integer.valueOf(i), str2);
        }
    }
}
