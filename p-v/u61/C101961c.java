package u61;

import android.app.Activity;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import i61.C76300m;
import nj3.C11184p0;
import p441aq.C92054g;

/* renamed from: u61.c */
public final class C101961c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ Activity f300160d;

    /* renamed from: e */
    public final /* synthetic */ int f300161e;

    /* renamed from: f */
    public final /* synthetic */ int f300162f;

    /* renamed from: g */
    public final /* synthetic */ String f300163g;

    /* renamed from: h */
    public final /* synthetic */ String f300164h;

    /* renamed from: i */
    public final /* synthetic */ String f300165i;

    /* renamed from: j */
    public final /* synthetic */ String f300166j;

    /* renamed from: n */
    public final /* synthetic */ int f300167n;

    public C101961c(int i, Activity activity, int i2, int i3, int i4, String str, String str2, String str3, String str4, int i5) {
        this.f300160d = activity;
        this.f300161e = i2;
        this.f300162f = i3;
        this.f300163g = str;
        this.f300164h = str2;
        this.f300165i = str3;
        this.f300166j = str4;
        this.f300167n = i5;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1001) {
            C76300m.m91725a(this.f300160d, this.f300161e);
            this.f300160d.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
            C115669n.INSTANCE.mo160131h(13224, 2, 2, "", Integer.valueOf(this.f300162f));
        } else if (itemId == 1000) {
            C76300m.m91726b(this.f300160d, this.f300163g, this.f300164h, this.f300165i, ((C92054g) C86312j.m106911c(C92054g.class)).xx0().mo138005L(), EmojiLogic.m117471b(this.f300162f, this.f300163g, this.f300164h, this.f300165i, this.f300166j, this.f300167n, (String) null), 12);
            C115669n.INSTANCE.mo160131h(13224, 2, 1, "", Integer.valueOf(this.f300162f));
        }
    }
}
