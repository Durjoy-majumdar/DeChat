package zk3;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C57761h6;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import gy3.C87412m;
import j20.C117292a;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import p749xh.C38616n3;
import zk3.C66894c;

/* renamed from: zk3.b */
public final class C66893b extends C66894c {

    /* renamed from: j */
    public static final /* synthetic */ int f192190j = 0;

    /* renamed from: i */
    public final String f192191i = "FinderLiveGameTeamUpNotifyTmpl";

    /* renamed from: a */
    public void mo90889a(C57761h6.C57762a aVar, Map<String, String> map, C72963f4 f4Var, C67391b bVar) {
        C57761h6.C57762a aVar2 = aVar;
        Map<String, String> map2 = map;
        C87412m.m108594g(map2, "values");
        C87412m.m108594g(bVar, "ui");
        C66894c.C66896b bVar2 = aVar2 != null ? (C66894c.C66896b) aVar2.mo82215a("TipsTempl_GamePurchaseRefund_Success") : null;
        long P = C61926c.m72671P(Util.nullAsNil(map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id")));
        long P2 = C61926c.m72671P(Util.nullAsNil(map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id")));
        String str = map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_nonce_id");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String nullAsNil = Util.nullAsNil(str);
        C87412m.m108593f(nullAsNil, "nullAsNil(values[\"$xmlPr….object_nonce_id\"] ?: \"\")");
        String str3 = map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id");
        if (str3 == null) {
            str3 = str2;
        }
        String nullAsNil2 = Util.nullAsNil(str3);
        C87412m.m108593f(nullAsNil2, "nullAsNil(values[\"$xmlPr…tipsinfo.tips_id\"] ?: \"\")");
        String str4 = map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_id");
        if (str4 != null) {
            str2 = str4;
        }
        String nullAsNil3 = Util.nullAsNil(str2);
        String nullAsNil4 = Util.nullAsNil(map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username"));
        String nullAsNil5 = Util.nullAsNil(map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.msg_type"));
        String str5 = this.f192191i;
        Log.m105924i(str5, "msgType: " + nullAsNil5 + ", " + Util.safeParseInt(nullAsNil5));
        C87412m.m108593f(nullAsNil3, "noticeId");
        mo90894e(map, ".msg.appmsg.extinfo.notifymsg", bVar2, false, nullAsNil3, bVar, P, P2, nullAsNil, f4Var, nullAsNil4, nullAsNil2, Util.safeParseInt(nullAsNil5));
        C66894c.C66896b bVar3 = bVar2;
        View view = bVar3.f192209e;
        if (view != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpRefundTmpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveNotifyTmpl$FinderLiveNotifyHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpRefundTmpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveNotifyTmpl$FinderLiveNotifyHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = bVar3.f192205a;
        if (view2 != null) {
            view2.setOnClickListener((View.OnClickListener) null);
        }
        View view3 = bVar3.f192214j;
        if (view3 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(8);
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpRefundTmpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveNotifyTmpl$FinderLiveNotifyHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpRefundTmpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveNotifyTmpl$FinderLiveNotifyHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view4 = bVar3.f192212h;
        if (view4 != null) {
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpRefundTmpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveNotifyTmpl$FinderLiveNotifyHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveGameTeamUpRefundTmpl", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemFinderLiveNotifyTmpl$FinderLiveNotifyHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: c */
    public String mo90890c() {
        return this.f192191i;
    }

    /* renamed from: d */
    public void mo90891d(String str, long j, C38616n3 n3Var, long j2, String str2, String str3) {
        C87412m.m108594g(n3Var, "info");
        C87412m.m108594g(str2, "tipsId");
        C87412m.m108594g(str3, "noticeId");
    }
}
