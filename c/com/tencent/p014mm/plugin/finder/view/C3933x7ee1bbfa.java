package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.FinderBottomCustomDialogHelper;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import nj3.C76912y0;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"", "it", "Lrx3/b0;", "invoke", "(Z)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showUserInfoConfirmDialogOnLiveRedPacket$1$1 */
public final class C3933x7ee1bbfa extends C87413o implements C32226l<Boolean, C13598b0> {
    public final /* synthetic */ String $cancel;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ DialogInterface.OnClickListener $lcancel;
    public final /* synthetic */ DialogInterface.OnClickListener $lok;
    public final /* synthetic */ String $ok;
    public final /* synthetic */ String $title;
    public final /* synthetic */ View $userInfoContainer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3933x7ee1bbfa(Context context, String str, View view, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        super(1);
        this.$context = context;
        this.$title = str;
        this.$userInfoContainer = view;
        this.$ok = str2;
        this.$cancel = str3;
        this.$lok = onClickListener;
        this.$lcancel = onClickListener2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C13598b0.f38549a;
    }

    public final void invoke(boolean z) {
        if (z) {
            FinderBottomCustomDialogHelper.Companion companion = FinderBottomCustomDialogHelper.Companion;
            C39341 r122 = C39341.INSTANCE;
            Context context = this.$context;
            String str = this.$title;
            View view = this.$userInfoContainer;
            C87412m.m108593f(view, "userInfoContainer");
            FinderBottomCustomDialogHelper.Companion.showConfirmDialog$default(companion, context, (Drawable) null, 0, str, view, this.$ok, this.$cancel, 1, this.$lok, this.$lcancel, r122, false, 2054, (Object) null);
            return;
        }
        Context context2 = this.$context;
        C76912y0.m92769h(context2, context2.getString(C0966R.string.jgi), C0966R.raw.icons_filled_error);
    }
}
