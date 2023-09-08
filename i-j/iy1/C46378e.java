package iy1;

import android.view.View;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: iy1.e */
public final class C46378e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PostCommentDialogUI f124973d;

    public C46378e(PostCommentDialogUI postCommentDialogUI) {
        this.f124973d = postCommentDialogUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        PostCommentDialogUI postCommentDialogUI = this.f124973d;
        if (postCommentDialogUI.f113154t != null) {
            postCommentDialogUI.mo65911Q7((IEmojiInfo) null);
        } else {
            postCommentDialogUI.mo65909O7();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
