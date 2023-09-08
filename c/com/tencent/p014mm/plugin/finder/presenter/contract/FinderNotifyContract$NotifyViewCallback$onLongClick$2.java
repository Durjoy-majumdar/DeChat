package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Context;
import android.view.MenuItem;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import com.tencent.p014mm.plugin.finder.service.C3603n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import dp1.C58417y0;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C8794p5;
import je1.C46548x2;
import je1.C60806o3;
import kotlin.Metadata;
import nj3.C11184p0;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p749xh.C66276va;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C50542nh0;
import te3.C64707sc1;
import wp1.C66169h;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "menuItem", "", "index", "Lrx3/b0;", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$onLongClick$2 */
final class FinderNotifyContract$NotifyViewCallback$onLongClick$2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderNotifyContract.NotifyViewCallback f160506d;

    /* renamed from: e */
    public final /* synthetic */ C66276va f160507e;

    /* renamed from: f */
    public final /* synthetic */ int f160508f;

    /* renamed from: g */
    public final /* synthetic */ int f160509g;

    public FinderNotifyContract$NotifyViewCallback$onLongClick$2(FinderNotifyContract.NotifyViewCallback notifyViewCallback, C66276va vaVar, int i, int i2) {
        this.f160506d = notifyViewCallback;
        this.f160507e = vaVar;
        this.f160508f = i;
        this.f160509g = i2;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C58417y0.class;
        int itemId = menuItem.getItemId();
        FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f160506d;
        if (itemId == notifyViewCallback.f160466u) {
            ((C58417y0) C86312j.m106911c(cls)).Ix0(1, 1, this.f160507e.field_type);
            C60806o3.C60807a aVar = C60806o3.f173187p;
            FinderNotifyContract.NotifyPresenter notifyPresenter = this.f160506d.f160455g;
            C89349b a = C89349b.m111674a(C60806o3.C60807a.m71190c(aVar, notifyPresenter.f160440d, notifyPresenter.f160441e[this.f160508f], (String) null, 4, (Object) null));
            String O5 = this.f160506d.f160455g.f160440d == 1 ? C66785b.f191882e.mo90662O5() : "";
            C66276va vaVar = this.f160507e;
            C46548x2 x2Var = new C46548x2(O5, vaVar.field_id, (C49712hj1) null, vaVar.field_objectId, vaVar.field_commentId, a, vaVar.field_type);
            MMActivity mMActivity = this.f160506d.f160456h;
            x2Var.mo85584j1(mMActivity, mMActivity.getResources().getString(C0966R.string.ett), 200);
            C86709a0.m107524d().mo123460f(x2Var);
            C89137b0 d = C86709a0.m107524d();
            final FinderNotifyContract.NotifyViewCallback notifyViewCallback2 = this.f160506d;
            final C66276va vaVar2 = this.f160507e;
            final int i2 = this.f160508f;
            final int i3 = this.f160509g;
            d.mo123455a(6690, new C11385n() {
                public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                    if (yVar instanceof C46548x2) {
                        C86709a0.m107524d().mo123470p(6690, this);
                        if (i == 0 && i2 == 0) {
                            String str2 = notifyViewCallback2.f160453e;
                            Log.m105924i(str2, "mentionId: " + ((C46548x2) yVar).f125428g);
                            C66169h.f190180a.mo90242a(vaVar2, notifyViewCallback2.f160455g.f160440d);
                            notifyViewCallback2.f160455g.mo78485n(i2).remove(i3);
                            WxRecyclerAdapter<C55011a> wxRecyclerAdapter = notifyViewCallback2.f160458j;
                            if (wxRecyclerAdapter != null) {
                                wxRecyclerAdapter.notifyItemRemoved(i3);
                            }
                            MMActivity mMActivity = notifyViewCallback2.f160456h;
                            C76912y0.makeText((Context) mMActivity, (CharSequence) mMActivity.getResources().getString(C0966R.string.ef9), 0).show();
                            return;
                        }
                        String str3 = notifyViewCallback2.f160453e;
                        Log.m105924i(str3, "del mention network error!: " + ((C46548x2) yVar).f125428g);
                        MMActivity mMActivity2 = notifyViewCallback2.f160456h;
                        C76912y0.makeText((Context) mMActivity2, (CharSequence) mMActivity2.getResources().getString(C0966R.string.ef8), 0).show();
                    }
                }
            });
        } else if (itemId == notifyViewCallback.f160467v) {
            ((C58417y0) C86312j.m106911c(cls)).Ix0(1, 2, this.f160507e.field_type);
            C66276va vaVar3 = this.f160507e;
            long j = vaVar3.field_commentId;
            long j2 = vaVar3.field_objectId;
            String str = vaVar3.field_objectNonceId;
            C87412m.m108593f(str, "mention.field_objectNonceId");
            final FinderNotifyContract.NotifyViewCallback notifyViewCallback3 = this.f160506d;
            ((C3603n1) C86312j.m106911c(C3603n1.class)).vv0(j, j2, str, true, new C8794p5<C64707sc1>() {
                /* renamed from: c5 */
                public void mo705c5(Object obj, C50542nh0 nh02) {
                    C87412m.m108594g((C64707sc1) obj, "req");
                    C87412m.m108594g(nh02, "ret");
                    if (nh02.f138603e == 0) {
                        Log.m105924i(notifyViewCallback3.f160453e, "MENU_ID_BLOCK_MENTION list succ");
                        MMActivity mMActivity = notifyViewCallback3.f160456h;
                        C76912y0.makeText((Context) mMActivity, (CharSequence) mMActivity.getResources().getString(C0966R.string.e3x), 0).show();
                        return;
                    }
                    String str = notifyViewCallback3.f160453e;
                    Log.m105924i(str, "MENU_ID_BLOCK_MENTION failed:" + nh02.f138603e);
                    MMActivity mMActivity2 = notifyViewCallback3.f160456h;
                    C76912y0.makeText((Context) mMActivity2, (CharSequence) mMActivity2.getResources().getString(C0966R.string.e3y), 0).show();
                }
            });
        }
    }
}
