package ft2;

import android.view.View;
import com.tencent.p014mm.p136ui.contact.C74551q1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gl3.C75922b;
import gt2.C76065a;
import java.util.List;
import lv1.C99681n;
import p240sx.C77804m;
import p240sx.C77805n;
import p418rx.C77578g;

/* renamed from: ft2.b */
public class C75797b extends C74551q1 {

    /* renamed from: n */
    public View.OnClickListener f222417n = null;

    public C75797b(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z) {
        super(mMBaseSelectContactUI, list, z, 0);
    }

    /* renamed from: f */
    public C75922b mo103611f(int i) {
        SnsMethodCalculate.markStartTimeMs("createChatroomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        C76065a aVar = new C76065a(i);
        C77804m mVar = this.f219151j;
        aVar.f222619p = ((C77578g) mVar).f226168n;
        aVar.f222915D = this.f222417n;
        List<C99681n> b = ((C77805n) mVar).mo107751b();
        SnsMethodCalculate.markStartTimeMs("setMatchInfo", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        aVar.f222916E = b.get((i - ((C77578g) this.f219151j).f226160f) - 1);
        SnsMethodCalculate.markEndTimeMs("setMatchInfo", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
        aVar.f222608e = this.f219057f;
        SnsMethodCalculate.markEndTimeMs("createChatroomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        return aVar;
    }
}
