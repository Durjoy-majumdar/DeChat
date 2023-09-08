package ix1;

import android.view.View;
import com.tencent.p014mm.autogen.events.ChatRoomLocateInfoEvent;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ix1.q */
public class C46343q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46337n f124903d;

    public C46343q(C46337n nVar) {
        this.f124903d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null && (view.getTag() instanceof Integer)) {
            int intValue = ((Integer) view.getTag()).intValue();
            if (intValue == this.f124903d.f124874e1) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ChatRoomLocateInfoEvent chatRoomLocateInfoEvent = new ChatRoomLocateInfoEvent();
            ChatRoomLocateInfoEvent.C40051a aVar = chatRoomLocateInfoEvent.f107403d;
            aVar.f107404a = intValue;
            aVar.f107407d = true;
            chatRoomLocateInfoEvent.publish();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
