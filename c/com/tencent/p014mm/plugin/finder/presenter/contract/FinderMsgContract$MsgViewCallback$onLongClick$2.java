package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Context;
import android.view.MenuItem;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import dp1.C58417y0;
import f40.C86709a0;
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
import wp1.C66169h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "menuItem", "", "index", "Lrx3/b0;", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$2 */
final class FinderMsgContract$MsgViewCallback$onLongClick$2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160428d;

    /* renamed from: e */
    public final /* synthetic */ C66276va f160429e;

    /* renamed from: f */
    public final /* synthetic */ int f160430f;

    public FinderMsgContract$MsgViewCallback$onLongClick$2(FinderMsgContract.MsgViewCallback msgViewCallback, C66276va vaVar, int i) {
        this.f160428d = msgViewCallback;
        this.f160429e = vaVar;
        this.f160430f = i;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == this.f160428d.f160388e) {
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Ix0(0, 1, this.f160429e.field_type);
            C89349b a = C89349b.m111674a(C60806o3.C60807a.m71190c(C60806o3.f173187p, 2, 0, (String) null, 4, (Object) null));
            C66276va vaVar = this.f160429e;
            C46548x2 x2Var = new C46548x2("", vaVar.field_id, (C49712hj1) null, vaVar.field_objectId, vaVar.field_commentId, a, vaVar.field_type);
            MMActivity mMActivity = this.f160428d.f160390g;
            x2Var.mo85584j1(mMActivity, mMActivity.getResources().getString(C0966R.string.ett), 200);
            C86709a0.m107524d().mo123460f(x2Var);
            C89137b0 d = C86709a0.m107524d();
            final FinderMsgContract.MsgViewCallback msgViewCallback = this.f160428d;
            final C66276va vaVar2 = this.f160429e;
            final int i2 = this.f160430f;
            d.mo123455a(6690, new C11385n() {
                public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                    if (yVar instanceof C46548x2) {
                        C86709a0.m107524d().mo123470p(6690, this);
                        if (i == 0 && i2 == 0) {
                            String str2 = msgViewCallback.f160387d;
                            Log.m105924i(str2, "mentionId: " + ((C46548x2) yVar).f125428g);
                            C66169h.f190180a.mo90242a(vaVar2, msgViewCallback.f160389f.f160376d);
                            msgViewCallback.f160389f.f160381i.remove(i2);
                            WxRecyclerAdapter<C55011a> wxRecyclerAdapter = msgViewCallback.f160397q;
                            if (wxRecyclerAdapter != null) {
                                wxRecyclerAdapter.notifyItemRemoved(i2);
                            }
                            MMActivity mMActivity = msgViewCallback.f160390g;
                            C76912y0.makeText((Context) mMActivity, (CharSequence) mMActivity.getResources().getString(C0966R.string.ef9), 0).show();
                            return;
                        }
                        String str3 = msgViewCallback.f160387d;
                        Log.m105924i(str3, "del mention network error!: " + ((C46548x2) yVar).f125428g);
                        MMActivity mMActivity2 = msgViewCallback.f160390g;
                        C76912y0.makeText((Context) mMActivity2, (CharSequence) mMActivity2.getResources().getString(C0966R.string.ef8), 0).show();
                    }
                }
            });
        }
    }
}
