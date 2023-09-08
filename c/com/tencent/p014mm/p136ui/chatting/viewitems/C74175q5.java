package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.q5 */
public class C74175q5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f217729d;

    /* renamed from: e */
    public final /* synthetic */ Map f217730e;

    /* renamed from: f */
    public final /* synthetic */ String f217731f;

    /* renamed from: g */
    public final /* synthetic */ String f217732g;

    /* renamed from: h */
    public final /* synthetic */ ChattingItemDyeingTemplate f217733h;

    public C74175q5(ChattingItemDyeingTemplate chattingItemDyeingTemplate, int i, Map map, String str, String str2) {
        this.f217733h = chattingItemDyeingTemplate;
        this.f217729d = i;
        this.f217730e = map;
        this.f217731f = str;
        this.f217732g = str2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i = this.f217729d;
        if (i == 1) {
            String str = (String) this.f217730e.get(".msg.appmsg.mmreader.category.item.schedule_username");
            long j = Util.getLong((String) this.f217730e.get(".msg.appmsg.mmreader.category.item.schedule_messvrid"), -1);
            ChattingItemDyeingTemplate.m87578q0(this.f217733h, view.getContext(), str, j);
            C115669n.INSTANCE.idkeyStat(795, 2, 1, false);
            Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "[onClick] Remind! username:%s svrMsgId:%s", str, Long.valueOf(j));
        } else if (i == 2) {
            C88144b.m109801s(view.getContext(), ".ui.AllRemindMsgUI", new Intent(), (Bundle) null);
        }
        ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f217733h;
        Map map = this.f217730e;
        String str2 = this.f217731f;
        String str3 = this.f217732g;
        String str4 = ChattingItemDyeingTemplate.f216840y0;
        chattingItemDyeingTemplate.mo102967U0(5, map, str2, "", str3);
        ChattingItemDyeingTemplate.m87587z0(this.f217733h, (C74243t8) view.getTag(), this.f217730e);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
