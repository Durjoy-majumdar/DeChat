package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import gy3.C87412m;
import kotlin.Metadata;
import p749xh.C66276va;
import te3.C64392gc1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, mo182094d2 = {"Landroid/view/ContextMenu;", "kotlin.jvm.PlatformType", "menu", "Landroid/view/View;", "v", "Landroid/view/ContextMenu$ContextMenuInfo;", "menuInfo", "Lrx3/b0;", "onCreateContextMenu", "(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$onLongClick$1 */
final class FinderNotifyContractNew$NotifyViewCallback$onLongClick$1 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ int f160570d;

    /* renamed from: e */
    public final /* synthetic */ FinderNotifyContractNew.NotifyViewCallback f160571e;

    /* renamed from: f */
    public final /* synthetic */ C66276va f160572f;

    /* renamed from: g */
    public final /* synthetic */ View f160573g;

    public FinderNotifyContractNew$NotifyViewCallback$onLongClick$1(int i, FinderNotifyContractNew.NotifyViewCallback notifyViewCallback, C66276va vaVar, View view) {
        this.f160570d = i;
        this.f160571e = notifyViewCallback;
        this.f160572f = vaVar;
        this.f160573g = view;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        String str;
        if (this.f160570d == 1) {
            FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f160571e;
            C66276va vaVar = this.f160572f;
            String str2 = FinderNotifyContractNew.NotifyViewCallback.f160541s;
            notifyViewCallback.getClass();
            C64392gc1 gc12 = vaVar.field_extInfo;
            if (gc12 == null || (str = gc12.f183301d) == null) {
                str = "";
            }
            if (!C87412m.m108589b(str, "music")) {
                contextMenu.add(0, 101, 0, this.f160573g.getResources().getString(C0966R.string.d0c));
            }
        }
        contextMenu.add(1, 100, 0, this.f160573g.getResources().getString(C0966R.string.f360743ei1));
    }
}
