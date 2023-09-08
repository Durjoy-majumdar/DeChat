package nw2;

import android.view.View;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nw2.m */
public final class C100228m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ StoryMsgView f293654d;

    public C100228m(StoryMsgView storyMsgView) {
        this.f293654d = storyMsgView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryMsgView$initBackArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        StoryMsgView storyMsgView = this.f293654d;
        int i = StoryMsgView.f281961H;
        storyMsgView.mo134305a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$initBackArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
