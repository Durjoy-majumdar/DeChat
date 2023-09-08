package com.tencent.p014mm.p136ui.halfscreen.custom;

import android.content.Context;
import android.content.Intent;
import android.view.Window;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.halfscreen.MMHalfScreenDialogFragment;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import zl3.C79402d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/ui/halfscreen/custom/WebSearchMoreHalfScreen;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "activityContext", "Landroid/content/Intent;", "intent", "", "activityClassName", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "drawerListener", "<init>", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.halfscreen.custom.WebSearchMoreHalfScreen */
public final class WebSearchMoreHalfScreen extends MMHalfScreenDialogFragment {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebSearchMoreHalfScreen(Context context, Intent intent, String str, RecyclerViewDrawerSquares.C45117c cVar, int i, C8480h hVar) {
        this(context, intent, str, (i & 8) != 0 ? null : cVar);
    }

    /* renamed from: K */
    public C79402d mo98534K(Context context) {
        C87412m.m108594g(context, "context");
        C79402d dVar = new C79402d(context, C0966R.style.a8k);
        Window window = dVar.getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        return dVar;
    }

    /* renamed from: N */
    public float mo98535N() {
        return 0.0f;
    }

    /* renamed from: R */
    public void mo103946R(Window window) {
        C87412m.m108594g(window, "window");
        window.setWindowAnimations(C0966R.style.a8j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebSearchMoreHalfScreen(Context context, Intent intent, String str, RecyclerViewDrawerSquares.C45117c cVar) {
        super(context, intent, str, cVar);
        C87412m.m108594g(context, "activityContext");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "activityClassName");
    }
}
