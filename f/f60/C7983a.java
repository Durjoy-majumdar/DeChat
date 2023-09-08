package f60;

import android.view.MenuItem;
import com.tencent.p014mm.live.p016ui.LiveUIC;

/* renamed from: f60.a */
public final class C7983a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ LiveUIC f26667d;

    public C7983a(LiveUIC liveUIC) {
        this.f26667d = liveUIC;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f26667d.finish();
        return true;
    }
}
