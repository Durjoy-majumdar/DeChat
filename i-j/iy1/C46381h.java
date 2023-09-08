package iy1;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import rx3.C13604l;

/* renamed from: iy1.h */
public final class C46381h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PostCommentDialogUI f124976d;

    public C46381h(PostCommentDialogUI postCommentDialogUI) {
        this.f124976d = postCommentDialogUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MMEditText mMEditText = this.f124976d.f113142e;
        if (mMEditText != null) {
            int selectionStart = mMEditText.getSelectionStart();
            if (this.f124976d.f113138D.f113165e.size() == 0) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            for (Map.Entry next : this.f124976d.f113138D.f113165e.entrySet()) {
                if (selectionStart > ((Number) ((C13604l) next.getValue()).f38555d).intValue() && selectionStart <= ((Number) ((C13604l) next.getValue()).f38556e).intValue()) {
                    MMEditText mMEditText2 = this.f124976d.f113142e;
                    if (mMEditText2 != null) {
                        mMEditText2.setSelection(((Number) ((C13604l) next.getValue()).f38556e).intValue());
                        C117292a.m165361g(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    C87412m.m108603p("gameCommentInputTxt");
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("gameCommentInputTxt");
        throw null;
    }
}
