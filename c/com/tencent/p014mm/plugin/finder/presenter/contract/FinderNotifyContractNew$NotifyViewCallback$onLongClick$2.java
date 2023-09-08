package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.MenuItem;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import com.tencent.p014mm.plugin.finder.service.C3603n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
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

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "menuItem", "", "index", "Lrx3/b0;", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$2 */
final class FinderNotifyContractNew$NotifyViewCallback$onLongClick$2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C66276va f160574d;

    /* renamed from: e */
    public final /* synthetic */ FinderNotifyContractNew.NotifyViewCallback f160575e;

    /* renamed from: f */
    public final /* synthetic */ int f160576f;

    public FinderNotifyContractNew$NotifyViewCallback$onLongClick$2(C66276va vaVar, FinderNotifyContractNew.NotifyViewCallback notifyViewCallback, int i) {
        this.f160574d = vaVar;
        this.f160575e = notifyViewCallback;
        this.f160576f = i;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C58417y0.class;
        int itemId = menuItem.getItemId();
        if (itemId == 100) {
            ((C58417y0) C86312j.m106911c(cls)).Ix0(1, 1, this.f160574d.field_type);
            C60806o3.C60807a aVar = C60806o3.f173187p;
            FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f160575e.f160543e;
            C89349b a = C89349b.m111674a(C60806o3.C60807a.m71190c(aVar, notifyPresenter.f160526e, notifyPresenter.f160527f, (String) null, 4, (Object) null));
            String str = this.f160575e.f160543e.f160530i;
            C66276va vaVar = this.f160574d;
            C46548x2 x2Var = new C46548x2(str, vaVar.field_id, (C49712hj1) null, vaVar.field_objectId, vaVar.field_commentId, a, vaVar.field_type);
            x2Var.mo85584j1(this.f160575e.getActivity(), MMApplicationContext.getContext().getResources().getString(C0966R.string.ett), 200);
            C86709a0.m107524d().mo123460f(x2Var);
            C89137b0 d = C86709a0.m107524d();
            final C66276va vaVar2 = this.f160574d;
            final FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f160575e;
            final int i2 = this.f160576f;
            d.mo123455a(6690, new C11385n() {
                public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                    if (yVar instanceof C46548x2) {
                        C86709a0.m107524d().mo123470p(6690, this);
                        if (i == 0 && i2 == 0) {
                            String str2 = FinderNotifyContractNew.NotifyViewCallback.f160541s;
                            Log.m105924i(str2, "mentionId: " + ((C46548x2) yVar).f125428g);
                            C66169h.f190180a.mo90242a(vaVar2, notifyViewCallback.f160543e.f160526e);
                            notifyViewCallback.f160543e.mo78501e().remove(i2);
                            WxRecyclerAdapter<C55011a> wxRecyclerAdapter = notifyViewCallback.f160553r;
                            if (wxRecyclerAdapter != null) {
                                wxRecyclerAdapter.notifyItemRemoved(i2);
                            }
                            C76912y0.makeText(notifyViewCallback.f160547i, (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.ef9), 0).show();
                            return;
                        }
                        String str3 = FinderNotifyContractNew.NotifyViewCallback.f160541s;
                        Log.m105924i(str3, "del mention network error!: " + ((C46548x2) yVar).f125428g);
                        C76912y0.makeText(notifyViewCallback.f160547i, (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.ef8), 0).show();
                    }
                }
            });
        } else if (itemId == 101) {
            ((C58417y0) C86312j.m106911c(cls)).Ix0(1, 2, this.f160574d.field_type);
            C66276va vaVar3 = this.f160574d;
            long j = vaVar3.field_commentId;
            long j2 = vaVar3.field_objectId;
            String str2 = vaVar3.field_objectNonceId;
            C87412m.m108593f(str2, "mention.field_objectNonceId");
            final FinderNotifyContractNew.NotifyViewCallback notifyViewCallback2 = this.f160575e;
            ((C3603n1) C86312j.m106911c(C3603n1.class)).vv0(j, j2, str2, true, new C8794p5<C64707sc1>() {
                /* renamed from: c5 */
                public void mo705c5(Object obj, C50542nh0 nh02) {
                    C87412m.m108594g((C64707sc1) obj, "req");
                    C87412m.m108594g(nh02, "ret");
                    if (nh02.f138603e == 0) {
                        Log.m105924i(FinderNotifyContractNew.NotifyViewCallback.f160541s, "MENU_ID_BLOCK_MENTION list succ");
                        C76912y0.makeText(notifyViewCallback2.f160547i, (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.e3x), 0).show();
                        return;
                    }
                    String str = FinderNotifyContractNew.NotifyViewCallback.f160541s;
                    Log.m105924i(str, "MENU_ID_BLOCK_MENTION failed:" + nh02.f138603e);
                    C76912y0.makeText(notifyViewCallback2.f160547i, (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.e3y), 0).show();
                }
            });
        }
    }
}
