package ux2;

import android.view.View;
import com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77390c0;

/* renamed from: ux2.b */
public class C78309b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77390c0 f229392d;

    public C78309b(TalkRoomUI talkRoomUI, C77390c0 c0Var) {
        this.f229392d = c0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f229392d.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
