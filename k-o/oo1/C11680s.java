package oo1;

import ak1.C0077k0;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import nj3.C11184p0;
import nj3.C76912y0;
import p204mr.C61568m;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C49098d51;

/* renamed from: oo1.s */
public final class C11680s implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C49098d51 f34223d;

    /* renamed from: e */
    public final /* synthetic */ String f34224e;

    /* renamed from: f */
    public final /* synthetic */ C11625e f34225f;

    /* renamed from: g */
    public final /* synthetic */ C32224a<C13598b0> f34226g;

    public C11680s(C49098d51 d512, String str, C11625e eVar, C32224a<C13598b0> aVar) {
        this.f34223d = d512;
        this.f34224e = str;
        this.f34225f = eVar;
        this.f34226g = aVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 4) {
            this.f34223d.f132119e = 1;
            C7335d c = C86312j.m106911c(C61568m.class);
            C87412m.m108593f(c, "getService(IHellLiveVisitorReoprter::class.java)");
            C61568m mVar = (C61568m) c;
            C0077k0 k0Var = C0077k0.Cancle;
            String str = this.f34224e;
            C49098d51 d512 = this.f34223d;
            String str2 = d512.f132121g;
            if (str2 == null) {
                str2 = "";
            }
            C61568m.C61569a.m72263a(mVar, k0Var, str, 0, 0, "temp_5", (String) null, (Long) null, (String) null, (String) null, str2, (String) null, d512.f132122h, (String) null, ((Number) ((C36570n) this.f34225f.f34109w).getValue()).longValue(), ((Number) ((C36570n) this.f34225f.f34110x).getValue()).intValue(), 5600, (Object) null);
            this.f34226g.invoke();
            AppCompatActivity appCompatActivity = this.f34225f.f34087a;
            C76912y0.m92769h(appCompatActivity, appCompatActivity.getString(C0966R.string.d2w), C0966R.raw.icons_filled_done);
        }
    }
}
