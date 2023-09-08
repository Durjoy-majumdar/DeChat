package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import com.tencent.p014mm.p136ui.chatting.viewitems.C73953d7;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import de3.C75359b0;
import j20.C117292a;
import java.util.ArrayList;
import sc0.C36652a;
import uj3.C78208e;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.v6 */
public class C74280v6 extends C75359b0 {

    /* renamed from: d */
    public final /* synthetic */ C36652a f218164d;

    /* renamed from: e */
    public final /* synthetic */ C36652a.C36654b f218165e;

    /* renamed from: f */
    public final /* synthetic */ C73953d7.C73955b f218166f;

    /* renamed from: g */
    public final /* synthetic */ C72963f4 f218167g;

    /* renamed from: h */
    public final /* synthetic */ C78208e f218168h;

    /* renamed from: i */
    public final /* synthetic */ int f218169i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74280v6(C74305x6 x6Var, int i, int i2, C36652a aVar, C36652a.C36654b bVar, C73953d7.C73955b bVar2, C72963f4 f4Var, C78208e eVar, int i3) {
        super(i, i2);
        this.f218164d = aVar;
        this.f218165e = bVar;
        this.f218166f = bVar2;
        this.f218167g = f4Var;
        this.f218168h = eVar;
        this.f218169i = i3;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemNewXmlSysImpl$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.ChattingItemNewXmlSysImpl", "[onClick] pBaseNewXmlMsg:%s", this.f218164d);
        this.f218165e.mo60786y5(this.f218166f.f217056c, this.f218167g, this.f218168h.getAdapterPosition(), this.f218164d, this.f218169i);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemNewXmlSysImpl$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
