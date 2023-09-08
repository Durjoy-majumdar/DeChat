package nw2;

import android.view.View;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nw2.n */
public final class C100229n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ StoryMsgView f293655d;

    public C100229n(StoryMsgView storyMsgView) {
        this.f293655d = storyMsgView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryMsgView$initBackArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f293655d.getCommentInputView().getInputType() != -1) {
            this.f293655d.getCommentInputView().mo134274b();
        } else {
            this.f293655d.mo134305a();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$initBackArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
