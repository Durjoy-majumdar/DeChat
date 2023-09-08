package nw2;

import android.view.View;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nw2.l */
public final class C100227l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ StoryMsgView f293653d;

    public C100227l(StoryMsgView storyMsgView) {
        this.f293653d = storyMsgView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryMsgView$initBackArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f293653d.getCommentInputView().getInputType() != -1) {
            this.f293653d.getCommentInputView().mo134274b();
        } else {
            this.f293653d.mo134305a();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$initBackArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
