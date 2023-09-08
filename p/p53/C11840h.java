package p53;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import m53.C10761g;
import n53.C11128k;
import r53.C12951a;
import te3.C51526uc2;

/* renamed from: p53.h */
public final class C11840h extends C39622i0 {

    /* renamed from: d */
    public final C10761g f34611d;

    /* renamed from: e */
    public final C54219z<String> f34612e = new C54219z<>();

    /* renamed from: f */
    public final C54219z<Integer> f34613f = new C54219z<>();

    /* renamed from: g */
    public final C54219z<C11828a> f34614g = new C54219z<>();

    /* renamed from: h */
    public final C54219z<Long> f34615h = new C54219z<>();

    /* renamed from: i */
    public final C54219z<Boolean> f34616i = new C54219z<>();

    /* renamed from: j */
    public C54219z<C51526uc2> f34617j = new C54219z<>();

    /* renamed from: n */
    public C11128k f34618n;

    /* renamed from: o */
    public int f34619o;

    /* renamed from: p */
    public boolean f34620p;

    /* renamed from: q */
    public int f34621q = -1;

    /* renamed from: r */
    public String f34622r;

    /* renamed from: s */
    public String f34623s;

    public C11840h(C10761g gVar) {
        C87412m.m108594g(gVar, "mParams");
        this.f34611d = gVar;
    }

    /* renamed from: c3 */
    public final void mo11723c3(int i, int i2, int i3, String str) {
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[7];
        objArr[0] = Integer.valueOf(this.f34621q);
        String str2 = this.f34622r;
        if (str2 != null) {
            objArr[1] = str2;
            String str3 = this.f34623s;
            if (str3 != null) {
                objArr[2] = str3;
                objArr[3] = Integer.valueOf(i);
                objArr[4] = Integer.valueOf(i2);
                objArr[5] = Integer.valueOf(i3);
                objArr[6] = str;
                nVar.mo160131h(22129, objArr);
                return;
            }
            C87412m.m108603p("mSessionid");
            throw null;
        }
        C87412m.m108603p("mSceneSessionID");
        throw null;
    }

    /* renamed from: d3 */
    public final void mo11724d3(int i) {
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(this.f34621q);
        String str = this.f34622r;
        if (str != null) {
            objArr[1] = str;
            String str2 = this.f34623s;
            if (str2 != null) {
                objArr[2] = str2;
                objArr[3] = Integer.valueOf(i);
                nVar.mo160131h(21651, objArr);
                return;
            }
            C87412m.m108603p("mSessionid");
            throw null;
        }
        C87412m.m108603p("mSceneSessionID");
        throw null;
    }

    /* renamed from: e3 */
    public final void mo11725e3() {
        Log.m105924i("MicroMsg.RechargeProductsDialogViewModel", "resetCacheValue:");
        C12951a.m12391a(this.f34614g, null);
        C12951a.m12391a(this.f34616i, null);
    }
}
