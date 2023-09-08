package ub2;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import di3.C86312j;
import nj3.C11184p0;
import o40.C61926c;
import p529fv.C59331r;
import p910lj.C76701a;
import tb2.C64216a;

/* renamed from: ub2.b0 */
public final class C65267b0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f187890d;

    /* renamed from: e */
    public final /* synthetic */ MusicMvCommentView f187891e;

    /* renamed from: f */
    public final /* synthetic */ Long f187892f;

    /* renamed from: g */
    public final /* synthetic */ String f187893g;

    /* renamed from: h */
    public final /* synthetic */ long f187894h;

    /* renamed from: i */
    public final /* synthetic */ String f187895i;

    public C65267b0(String str, MusicMvCommentView musicMvCommentView, Long l, String str2, long j, String str3) {
        this.f187890d = str;
        this.f187891e = musicMvCommentView;
        this.f187892f = l;
        this.f187893g = str2;
        this.f187894h = j;
        this.f187895i = str3;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            ClipboardHelper.setText(this.f187890d);
            C76701a.makeText(this.f187891e.getContext(), (int) C0966R.string.f7938wv, 0).show();
            C64216a aVar = this.f187891e.f163544g;
            if (aVar != null) {
                aVar.mo80464a(this.f187892f, this.f187893g, this.f187894h);
            }
        } else if (itemId == 2) {
            ((C59331r) C86312j.m106911c(C59331r.class)).mo84024ZA(this.f187891e.getContext(), 71, this.f187895i, C61926c.m72691p(this.f187894h));
            C64216a aVar2 = this.f187891e.f163544g;
            if (aVar2 != null) {
                aVar2.mo80466c(this.f187892f, this.f187893g, this.f187894h);
            }
        }
    }
}
