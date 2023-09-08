package ux2;

import android.view.View;
import com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ux2.g */
public class C78311g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TalkRoomUI f229394d;

    public C78311g(TalkRoomUI talkRoomUI) {
        this.f229394d = talkRoomUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f229394d.onBackPressed();
        C117292a.m165361g(this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
