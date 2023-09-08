package ix1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ix1.c0 */
public class C46312c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46337n f124776d;

    public C46312c0(C46337n nVar) {
        this.f124776d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f124776d.mo71707K(view);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
