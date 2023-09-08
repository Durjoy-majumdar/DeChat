package com.tencent.p014mm.plugin.story;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.StorySyncEvent;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.plugin.story.model.sync.ContactSyncFetcher;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import cw2.C75307f;
import cw2.C97389m;
import cw2.C97398t;
import di3.C86301e;
import di3.C86312j;
import dw2.C45457f;
import ei3.C86522b;
import f40.C86709a0;
import gw2.C98266k;
import gy3.C87412m;
import h81.C32735h;
import iw2.C98862q;
import java.util.ArrayList;
import java.util.List;
import jw2.C99069d;
import kotlin.Metadata;
import kw2.C99264e;
import kw2.C99265f;
import o40.C61926c;
import ow2.C100604w;
import pe3.C47465a;
import sx3.C26236u;
import te3.qc4;
import xv2.C102775d;
import xv2.C102776e;
import xv2.C102781j;
import xv2.C79002b;
import xv2.C79004h;
import xv2.C79005m;
import zv2.C103105a;
import zv2.C103109c;

@C86522b
/* renamed from: com.tencent.mm.plugin.story.PluginStory */
public final class PluginStory extends C86301e implements C102775d {

    /* renamed from: d */
    public final String f281734d = "oneday/";

    /* renamed from: e */
    public final String f281735e = "oneday/temp/";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/PluginStory$StorySynclistener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/StorySyncEvent;", "<init>", "()V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.story.PluginStory$StorySynclistener */
    public static final class StorySynclistener extends IListener<StorySyncEvent> {
        public StorySynclistener() {
            super(C40008f.f107254d);
        }

        public boolean callback(IEvent iEvent) {
            C87412m.m108594g((StorySyncEvent) iEvent, "event");
            C86709a0.m107529k().f251779b.mo123460f(new C45457f(128));
            return false;
        }
    }

    public C79005m Eg0() {
        return C97398t.f285896a;
    }

    /* renamed from: Po */
    public void mo134164Po(String str, qc4 qc4) {
        C99265f g = StoryCore.f281736t.mo134189g();
        if (str != null && qc4 != null) {
            C99264e jo = g.mo138646jo(str);
            jo.field_userInfo = qc4.toByteArray();
            g.mo138641SE(jo);
        }
    }

    /* renamed from: Sf */
    public String mo134165Sf() {
        return C86709a0.m107535s().f251806d + this.f281735e;
    }

    /* renamed from: TA */
    public C79002b mo134166TA() {
        return C75307f.f221459a;
    }

    /* renamed from: UO */
    public C102776e mo134167UO() {
        return C103105a.f304209b;
    }

    /* renamed from: WB */
    public void mo134168WB(String str, boolean z) {
        C98266k e;
        Class cls = C32735h.class;
        if (str != null) {
            int Qe = z ? ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_story_preload_with_enter_sns, 1) : ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_story_preload_with_change_sns, 0);
            Log.m105924i("MicroMsg.PluginStory", "preloadForSnsUser: " + Qe + " isEnter: " + z + " username " + str + ' ' + Util.getStack());
            if (Qe == 1 && (e = C98862q.f289801d.mo138224e(str, false)) != null) {
                C100604w.m131613b(C100604w.f294753a, C26236u.m33719b(e.f288082e), 0, 2, (Object) null);
            }
        }
    }

    /* renamed from: YT */
    public String mo134169YT() {
        return MMApplicationContext.getContext().getCacheDir().getAbsolutePath() + XVFSFile.SEPARATOR_CHAR + this.f281734d;
    }

    public C102781j e10() {
        return ContactSyncFetcher.f281758d;
    }

    public qc4 ge0() {
        StoryCore.C96337h hVar = StoryCore.f281736t;
        C99264e jo = hVar.mo134189g().mo138646jo(hVar.mo134187e());
        if (jo.field_userInfo == null) {
            return new qc4();
        }
        try {
            C47465a parseFrom = new qc4().parseFrom(jo.field_userInfo);
            C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryUserInfo");
            return (qc4) parseFrom;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.StoryExtInfo", "error get storyUserInfo!");
            return new qc4();
        }
    }

    public C79004h ik0() {
        return C103109c.f304232b;
    }

    public void kx0(List<String> list, long j) {
        C87412m.m108594g(list, "userList");
        long j2 = C99069d.f290421d.f266270j;
        ArrayList arrayList = new ArrayList();
        synchronized (list) {
            for (String add : list) {
                arrayList.add(add);
            }
        }
        C61926c.m72657B("reportWaitPlayList", true, new C97389m(j2, j, arrayList));
    }

    /* renamed from: rA */
    public String mo134174rA() {
        return C86709a0.m107535s().f251806d + this.f281734d;
    }
}
