package iy1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: iy1.d */
public final class C46377d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PostCommentDialogUI f124972d;

    public C46377d(PostCommentDialogUI postCommentDialogUI) {
        this.f124972d = postCommentDialogUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        PostCommentDialogUI postCommentDialogUI = this.f124972d;
        int i = PostCommentDialogUI.f113134G;
        boolean z = false;
        C77407n nVar = new C77407n((Context) postCommentDialogUI.getContext(), false, 1);
        String str = postCommentDialogUI.f113155u;
        if (str == null || str.length() == 0) {
            z = true;
        }
        String string = z ? postCommentDialogUI.getString(C0966R.string.mhv) : postCommentDialogUI.getString(C0966R.string.mhw);
        C87412m.m108593f(string, "if (selectedImagePath.is…enu_delete_img)\n        }");
        nVar.f225771i = new C46387n(postCommentDialogUI, string);
        nVar.f225782p = new C46388o(postCommentDialogUI);
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
