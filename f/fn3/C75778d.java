package fn3;

import com.tencent.p014mm.autogen.mmdata.rpt.GroupLiveSessionExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.GroupLiveTipsBarUserActionStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72976h2;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.HashSet;
import y50.C66541q0;

/* renamed from: fn3.d */
public final class C75778d {

    /* renamed from: a */
    public static final C75778d f222377a = new C75778d();

    /* renamed from: b */
    public static final HashSet<Long> f222378b = new HashSet<>();

    /* renamed from: c */
    public static final HashSet<Long> f222379c = new HashSet<>();

    /* renamed from: a */
    public final void mo106087a(C72976h2 h2Var, int i) {
        C66541q0 q0Var;
        C87412m.m108594g(h2Var, "con");
        C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(h2Var.getContent()), (String) null);
        if (u != null && u.f195582i == 60 && h2Var.mo108832y2() == 0 && (q0Var = (C66541q0) u.mo93555w(C66541q0.class)) != null) {
            long parseLong = Long.parseLong(q0Var.f191394b);
            String username = h2Var.getUsername();
            C87412m.m108593f(username, "chatName");
            f222379c.add(Long.valueOf(parseLong));
            GroupLiveSessionExposeStruct groupLiveSessionExposeStruct = new GroupLiveSessionExposeStruct();
            groupLiveSessionExposeStruct.f194211d = groupLiveSessionExposeStruct.mo86045b("ChatName", username, true);
            groupLiveSessionExposeStruct.f194214g = System.currentTimeMillis();
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_chat_list_show_live, false);
            Log.m105924i("MicroMsg.LiveExptConfig", "ChatListShowFlashingSwitch: " + wf);
            groupLiveSessionExposeStruct.f194212e = wf ? 3 : 2;
            groupLiveSessionExposeStruct.f194213f = 1;
            groupLiveSessionExposeStruct.f194215h = groupLiveSessionExposeStruct.mo86045b("LiveIDList", String.valueOf(parseLong), true);
            groupLiveSessionExposeStruct.f194216i = (long) i;
            groupLiveSessionExposeStruct.mo86054n();
        }
    }

    /* renamed from: b */
    public final void mo106088b(String str, long j, String str2, long j2, long j3) {
        C87412m.m108594g(str, "chatName");
        C87412m.m108594g(str2, "actionToLiveId");
        GroupLiveTipsBarUserActionStruct groupLiveTipsBarUserActionStruct = new GroupLiveTipsBarUserActionStruct();
        int i = 1;
        groupLiveTipsBarUserActionStruct.f194217d = groupLiveTipsBarUserActionStruct.mo86045b("ChatName", str, true);
        groupLiveTipsBarUserActionStruct.f194218e = j;
        groupLiveTipsBarUserActionStruct.f194219f = groupLiveTipsBarUserActionStruct.mo86045b("ActionToLiveId", str2, true);
        groupLiveTipsBarUserActionStruct.f194220g = j2;
        groupLiveTipsBarUserActionStruct.f194221h = j3;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_chat_room_live_bar_flashing, false);
        Log.m105924i("MicroMsg.LiveExptConfig", "ChatRoomBarFlashingSwitch: " + wf);
        if (!wf) {
            i = 2;
        }
        groupLiveTipsBarUserActionStruct.f194222i = i;
        groupLiveTipsBarUserActionStruct.mo86054n();
    }
}
