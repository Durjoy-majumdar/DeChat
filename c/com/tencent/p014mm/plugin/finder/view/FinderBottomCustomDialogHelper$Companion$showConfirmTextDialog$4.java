package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import kotlin.Metadata;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lnj3/e0;", "kotlin.jvm.PlatformType", "menu", "Lrx3/b0;", "onCreateMMMenu", "(Lnj3/e0;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$4 */
public final class FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$4 implements C11182m0 {
    public final /* synthetic */ C77407n $dialog;
    public final /* synthetic */ RoundedCornerFrameLayout $rootViewContainer;

    public FinderBottomCustomDialogHelper$Companion$showConfirmTextDialog$4(C77407n nVar, RoundedCornerFrameLayout roundedCornerFrameLayout) {
        this.$dialog = nVar;
        this.$rootViewContainer = roundedCornerFrameLayout;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        this.$dialog.mo107567l((View) null);
        this.$dialog.mo107567l(this.$rootViewContainer);
    }
}
