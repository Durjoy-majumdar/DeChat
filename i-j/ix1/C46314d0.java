package ix1;

import android.view.View;
import bx1.C39865r;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import yw1.C53591c;

/* renamed from: ix1.d0 */
public class C46314d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46337n f124780d;

    public C46314d0(C46337n nVar) {
        this.f124780d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f124780d.f124866Y.getTag() instanceof C53591c.C53595d) {
            C53591c.C53595d dVar = (C53591c.C53595d) this.f124780d.f124866Y.getTag();
            Log.m105925i("GameChatRoom.GameChatItemVH", "retry send msg, cliMsgId:%s", dVar.f150617d);
            this.f124780d.f124866Y.setVisibility(8);
            this.f124780d.f124864X.setVisibility(0);
            C86709a0.m107524d().mo123460f(new C39865r(dVar));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
