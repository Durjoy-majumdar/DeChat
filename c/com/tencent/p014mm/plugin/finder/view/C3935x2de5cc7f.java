package com.tencent.p014mm.plugin.finder.view;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.FinderBottomCustomDialogHelper;
import kotlin.Metadata;
import qo3.C89779i0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$1 */
public final class C3935x2de5cc7f implements Runnable {
    public final /* synthetic */ FinderBottomCustomDialogHelper.UserInfoHelper this$0;

    public C3935x2de5cc7f(FinderBottomCustomDialogHelper.UserInfoHelper userInfoHelper) {
        this.this$0 = userInfoHelper;
    }

    public final void run() {
        FinderBottomCustomDialogHelper.UserInfoHelper userInfoHelper = this.this$0;
        userInfoHelper.loadingDialog = C89779i0.m112248e(userInfoHelper.getContext(), this.this$0.getContext().getString(C0966R.string.gat), true, 3, (DialogInterface.OnCancelListener) null);
    }
}
