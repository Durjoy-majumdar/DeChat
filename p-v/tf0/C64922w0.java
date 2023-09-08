package tf0;

import a11.C39479c;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.autogen.mmdata.rpt.DiscoverFinderClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderChatEnterStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderChatProfileStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveEntranceShowStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.RedDotTitleDropStruct;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderTipsShowEntranceExtInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86301e;
import di3.C86312j;
import dp1.C45431e2;
import dp1.C58363h;
import dp1.C58372i;
import dp1.C58378j1;
import dp1.C58389m1;
import dp1.C58408t0;
import dp1.C58413v0;
import dp1.C58417y0;
import e60.C58532b;
import eb0.C31543z5;
import eb0.C75592q0;
import ei3.C86522b;
import er1.C58739j4;
import er1.C58784w3;
import f40.C86709a0;
import fp1.C59266a;
import fp1.C59267b;
import fp1.C59268c;
import ft3.C116895f;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60165e4;
import ht1.C60169f4;
import ht1.C60200t1;
import ht1.C8777j5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import jq3.C9508q;
import mr1.C61572r;
import o40.C61926c;
import o40.C61937h;
import os1.C11739f;
import os1.C62153d;
import p147ea.C7606d;
import p185kq.C10383h;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C51978xi1;
import te3.C64586nn1;
import te3.C64682rk1;
import te3.C64867yw;
import te3.C64888zo1;
import te3.db4;

@C86522b
/* renamed from: tf0.w0 */
public final class C64922w0 extends C86301e implements C60165e4 {

    /* renamed from: d */
    public LinkedList<C58378j1> f186948d = new LinkedList<>();

    /* renamed from: Bd */
    public void mo85141Bd() {
        C58363h hVar = C58363h.f167137a;
        C58363h.f167142f.f167154h++;
    }

    public void C00(String str, long j, String str2, String str3) {
        C87412m.m108594g(str, "talker");
        C58363h hVar = C58363h.f167137a;
        C58363h.C58366d dVar = C58363h.f167142f;
        dVar.getClass();
        FinderChatEnterStruct finderChatEnterStruct = new FinderChatEnterStruct();
        finderChatEnterStruct.f155096d = j;
        if (str2 == null) {
            str2 = "";
        }
        finderChatEnterStruct.f155099g = finderChatEnterStruct.mo86045b("sessionid", str2, true);
        if (str3 == null) {
            str3 = "";
        }
        finderChatEnterStruct.f155100h = finderChatEnterStruct.mo86045b("clicktabcontextid", str3, true);
        finderChatEnterStruct.f155097e = dVar.f167148b;
        finderChatEnterStruct.f155098f = finderChatEnterStruct.mo86045b("talkerUsername", dVar.f167149c, true);
        finderChatEnterStruct.f155102j = finderChatEnterStruct.mo86045b("chatSessionid", dVar.f167151e, true);
        finderChatEnterStruct.f155101i = finderChatEnterStruct.mo86045b("chatListSessionid", dVar.f167150d, true);
        finderChatEnterStruct.f155103k = C31543z5.m39453c() - dVar.f167155i;
        finderChatEnterStruct.f155104l = finderChatEnterStruct.mo86045b("chatName", dVar.f167152f, true);
        finderChatEnterStruct.f155105m = dVar.f167153g;
        finderChatEnterStruct.f155108p = dVar.f167154h;
        dVar.f167147a.post(new C58372i(str, dVar.f167155i, finderChatEnterStruct, dVar));
        dVar.f167148b = 0;
        dVar.f167149c = "";
        dVar.f167150d = "";
        dVar.f167151e = "";
        dVar.f167152f = "";
        dVar.f167153g = 0;
        dVar.f167154h = 0;
        dVar.f167155i = 0;
    }

    public void Dr0(C49712hj1 hj12) {
        C58363h hVar = C58363h.f167137a;
        C58363h.C58367e eVar = C58363h.f167140d;
        eVar.getClass();
        FinderChatProfileStruct finderChatProfileStruct = new FinderChatProfileStruct();
        if (hj12 != null) {
            String str = hj12.f134670d;
            if (str == null) {
                str = "";
            }
            finderChatProfileStruct.f155109d = finderChatProfileStruct.mo86045b("sessionid", str, true);
            String str2 = hj12.f134672f;
            if (str2 == null) {
                str2 = "";
            }
            finderChatProfileStruct.f155110e = finderChatProfileStruct.mo86045b("clicktabcontextid", str2, true);
        }
        String str3 = finderChatProfileStruct.f155109d;
        if (str3 == null) {
            str3 = "";
        }
        finderChatProfileStruct.f155109d = finderChatProfileStruct.mo86045b("sessionid", str3, true);
        String str4 = finderChatProfileStruct.f155110e;
        if (str4 == null) {
            str4 = "";
        }
        finderChatProfileStruct.f155110e = finderChatProfileStruct.mo86045b("clicktabcontextid", str4, true);
        finderChatProfileStruct.f155111f = finderChatProfileStruct.mo86045b("chatSessionid", eVar.f167159d, true);
        finderChatProfileStruct.f155112g = eVar.f167156a;
        finderChatProfileStruct.f155113h = finderChatProfileStruct.mo86045b("chatName", eVar.f167157b, true);
        finderChatProfileStruct.f155114i = finderChatProfileStruct.mo86045b("talkerUsername", eVar.f167158c, true);
        finderChatProfileStruct.f155115j = eVar.f167163h;
        finderChatProfileStruct.f155116k = eVar.f167160e;
        finderChatProfileStruct.f155117l = eVar.f167162g;
        finderChatProfileStruct.f155118m = eVar.f167161f;
        finderChatProfileStruct.mo86054n();
        C58363h.m67607a(hVar, "RecordFinderChatProfile", finderChatProfileStruct);
        eVar.f167156a = 0;
        eVar.f167157b = "";
        eVar.f167158c = "";
        eVar.f167160e = 0;
        eVar.f167161f = 0;
        eVar.f167162g = 0;
        eVar.f167163h = 0;
    }

    /* renamed from: E8 */
    public Map<String, Object> mo85144E8(C55718s0 s0Var, C64586nn1 nn12, int i) {
        String str;
        String str2;
        String str3;
        C87412m.m108594g(s0Var, "ctrInfo");
        C87412m.m108594g(nn12, "showInfo");
        C58413v0 v0Var = C58413v0.f167346a;
        v0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("reddot_show_info_type", Integer.valueOf(nn12.f184502d));
        hashMap.put("reddot_showinfo_count_num", Long.valueOf((long) nn12.f184503e));
        Integer num = null;
        String a = v0Var.mo83267a(nn12, C61937h.m72709h(s0Var.mo77309p2()), i, (String) null);
        String str4 = "";
        if (a == null) {
            a = str4;
        }
        hashMap.put("reddot_showinfo_title", a);
        hashMap.put("reddot_count_num_detail", v0Var.mo83268b(s0Var, nn12));
        hashMap.put("showtitle_completetype", Integer.valueOf(i));
        C64867yw ywVar = nn12.f184512q;
        hashMap.put("expose_order", Integer.valueOf(ywVar != null ? ywVar.f186604d : 0));
        hashMap.put("reddot_ctrltype", Long.valueOf((long) s0Var.field_ctrInfo.f144670e));
        String str5 = s0Var.field_tipsId;
        C87412m.m108593f(str5, "ctrInfo.field_tipsId");
        hashMap.put("reddot_tipsid", str5);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = str4;
        }
        hashMap.put("behaviour_session_id", Wb);
        String XQ = ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(s0Var.mo77309p2().object_id);
        C87412m.m108593f(XQ, "getService(IHellHoundUti…ranceExtInfo().object_id)");
        hashMap.put("feed_id", XQ);
        String str6 = nn12.f184507i;
        if (str6 == null) {
            str6 = str4;
        }
        hashMap.put("reddot_path", str6);
        Object[] objArr = new Object[1];
        FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = s0Var.field_tipsShowEntranceExtInfo;
        objArr[0] = (finderTipsShowEntranceExtInfo == null || (str3 = finderTipsShowEntranceExtInfo.report_ext_info) == null) ? null : Integer.valueOf(str3.length());
        Log.m105925i("FinderRedDotReporter", "old ext %d", objArr);
        Object[] objArr2 = new Object[1];
        C51978xi1 xi12 = s0Var.field_ctrInfo;
        if (!(xi12 == null || (str2 = xi12.f144682t) == null)) {
            num = Integer.valueOf(str2.length());
        }
        objArr2[0] = num;
        Log.m105925i("FinderRedDotReporter", "new ext %d", objArr2);
        C51978xi1 xi13 = s0Var.field_ctrInfo;
        if (!(xi13 == null || (str = xi13.f144682t) == null)) {
            str4 = str;
        }
        hashMap.put("reddot_report_exinfo", str4);
        return hashMap;
    }

    /* renamed from: Fw */
    public void mo85145Fw(C64888zo1 zo12) {
        C87412m.m108594g(zo12, "videoInfo");
        C58378j1 j1Var = (C58378j1) C110818d0.m150916N(this.f186948d);
        if (this.f186948d.size() > 20) {
            C116895f.m164891c("startPlayVideoInMp", "startPlayVideoInMp remove:" + C61926c.m72691p(this.f186948d.getFirst().f167241a));
            this.f186948d.remove(0);
        }
        if (j1Var != null) {
            this.f186948d.remove(j1Var);
        }
        FinderObject finderObject = zo12.f186758d;
        if (finderObject != null) {
            this.f186948d.add(new C58378j1(finderObject.f164794id, C31543z5.m39453c(), FinderItem.Companion.mo79056a(finderObject, 0), (C9508q) null, false, (C61572r) null, 56, (C8480h) null));
        }
    }

    /* renamed from: GI */
    public void mo85146GI() {
        C13604l<C55718s0, ? extends C64586nn1> lVar = C2483o0.f12988e;
        if (lVar != null) {
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77275o("FinderEntrance");
            C58413v0.m67778f(C58413v0.f167346a, "1", (C55718s0) lVar.f38555d, (C64586nn1) lVar.f38556e, 1, (String) null, 0, 0, 0, 240, (Object) null);
        }
        C2483o0.f12988e = null;
    }

    /* renamed from: I3 */
    public void mo85147I3(int i, int i2, long j, Map<String, ? extends Object> map) {
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9599I3(i, i2, j, map);
    }

    /* renamed from: KR */
    public void mo85148KR(String str, String str2) {
        C13598b0 b0Var;
        C87412m.m108594g(str, "contextId");
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        y0Var.getClass();
        Class<FinderCommonFeatureService> cls = FinderCommonFeatureService.class;
        DiscoverFinderClickStruct discoverFinderClickStruct = new DiscoverFinderClickStruct();
        discoverFinderClickStruct.f154969n = discoverFinderClickStruct.mo86045b("ContextId", str, true);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        discoverFinderClickStruct.f154968m = discoverFinderClickStruct.mo86045b("SessionId", Wb, true);
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62446e(cls).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        C11739f fVar = (C11739f) a;
        discoverFinderClickStruct.f154966k = (long) fVar.mo11602e3();
        C39622i0 a2 = rVar.mo62446e(cls).mo75002a(C62153d.class);
        C87412m.m108593f(a2, "UICProvider.of(FinderCom…alLocationVM::class.java)");
        C62153d dVar = (C62153d) a2;
        long j = 1;
        long j2 = 0;
        discoverFinderClickStruct.f154961f = dVar.mo9103H() ? 1 : 0;
        C13598b0 b0Var2 = null;
        if (dVar.f176721e != null) {
            discoverFinderClickStruct.f154960e = 1;
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            discoverFinderClickStruct.f154960e = 0;
        }
        if (str2 != null) {
            discoverFinderClickStruct.f154959d = 1;
            discoverFinderClickStruct.f154967l = discoverFinderClickStruct.mo86045b("EnterRedDotId", str2, true);
            discoverFinderClickStruct.f154965j = 0;
            discoverFinderClickStruct.f154964i = 0;
            discoverFinderClickStruct.f154962g = 0;
            discoverFinderClickStruct.f154963h = 0;
            discoverFinderClickStruct.f154970o = 1;
            b0Var2 = C13598b0.f38549a;
        }
        if (b0Var2 == null) {
            discoverFinderClickStruct.f154959d = 0;
            discoverFinderClickStruct.f154967l = discoverFinderClickStruct.mo86045b("EnterRedDotId", "", true);
            if (fVar.mo11603f3(fVar.mo11602e3())) {
                j = 2;
            }
            discoverFinderClickStruct.f154970o = j;
            long j3 = (long) fVar.mo11600c3(3).f34371d;
            if (j3 < 0) {
                j3 = 0;
            }
            discoverFinderClickStruct.f154962g = j3;
            long j4 = (long) fVar.mo11600c3(2).f34371d;
            if (j4 < 0) {
                j4 = 0;
            }
            discoverFinderClickStruct.f154964i = j4;
            long j5 = (long) fVar.mo11600c3(1).f34371d;
            if (j5 < 0) {
                j5 = 0;
            }
            discoverFinderClickStruct.f154963h = j5;
            long j6 = (long) fVar.mo11600c3(4).f34371d;
            if (j6 >= 0) {
                j2 = j6;
            }
            discoverFinderClickStruct.f154965j = j2;
        }
        discoverFinderClickStruct.mo86054n();
        y0Var.Ec0(discoverFinderClickStruct);
    }

    /* renamed from: Lb */
    public void mo85149Lb(String str) {
        C59266a aVar = C59266a.f169452a;
        if (str == null) {
            str = "";
        }
        C59268c cVar = C59267b.f169453a;
        aVar.mo84410b(str, C59267b.f169455c);
    }

    public void Lc0(String str, C55718s0 s0Var, C64586nn1 nn12, int i, String str2, int i2, int i3, int i4) {
        C87412m.m108594g(str, "currUI");
        C87412m.m108594g(s0Var, "ctrInfo");
        C87412m.m108594g(nn12, "showInfo");
        C87412m.m108594g(str2, "contextId");
        C58413v0.f167346a.mo83271e(str, s0Var, nn12, i, str2, i2, i3, i4);
    }

    /* renamed from: MA */
    public void mo85151MA() {
        Log.m105924i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorClickIconEnterLive");
        C115669n.INSTANCE.mo175913w(1380, 0, 1);
    }

    public void N40(String str, String str2) {
        C87412m.m108594g(str, "contextId");
        C87412m.m108594g(str2, "action");
        ((C58417y0) C86312j.m106911c(C58417y0.class)).N40(str, "Enter");
    }

    /* renamed from: NF */
    public void mo85153NF() {
        C58363h hVar = C58363h.f167137a;
        C58363h.C58367e eVar = C58363h.f167140d;
        eVar.f167160e++;
        Log.m105924i("RecordFinderChatProfile", "incChatInfoClickCount:" + eVar.f167160e);
    }

    /* renamed from: NZ */
    public void mo85154NZ(String str) {
        C87412m.m108594g(str, "liveRoomId");
        C58532b.f167566a = str;
    }

    /* renamed from: PJ */
    public void mo85155PJ(long j, String str, String str2) {
        C87412m.m108594g(str, "talkUserName");
        C87412m.m108594g(str2, "chatName");
        C58363h hVar = C58363h.f167137a;
        C58363h.C58366d dVar = C58363h.f167142f;
        dVar.getClass();
        dVar.f167148b = j;
        dVar.f167149c = str;
        dVar.f167152f = str2;
        long c = C31543z5.m39453c();
        dVar.f167155i = c;
        dVar.f167151e = String.valueOf(c);
        C45431e2 e2Var = C58363h.f167139c;
        if (e2Var.f122957a) {
            dVar.f167150d = e2Var.f122958b.f122967b;
        } else {
            C45431e2 e2Var2 = C58363h.f167138b;
            if (e2Var2.f122957a) {
                dVar.f167150d = e2Var2.f122958b.f122967b;
            }
        }
        Log.m105924i("RecordFinderChatEnter", "onEnterChat:talkUserNameL" + dVar.f167149c + ", chatNameL" + dVar.f167152f + "， accountTypeL" + dVar.f167148b);
    }

    /* renamed from: Qn */
    public void mo85156Qn(Context context, int i, int i2) {
        C87412m.m108594g(context, "context");
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        if (f != null) {
            f.mo12842I3(i, i2);
        }
    }

    public void T10(int i) {
        int i2;
        String str = C58532b.f167566a;
        LiveEntranceShowStruct liveEntranceShowStruct = new LiveEntranceShowStruct();
        String s = C75592q0.m90789s();
        C87412m.m108593f(s, "getUsernameFromUserInfo()");
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(C58532b.f167566a);
        boolean z = false;
        if (Lo != null && Lo.mo69793u2(s)) {
            i2 = 2;
        } else {
            if (Lo != null && Lo.mo69796x2(s)) {
                z = true;
            }
            i2 = z ? 1 : 3;
        }
        liveEntranceShowStruct.f156375f = (long) i2;
        liveEntranceShowStruct.f156374e = liveEntranceShowStruct.mo86045b("roomid", C58532b.f167566a, true);
        liveEntranceShowStruct.f156373d = 1;
        liveEntranceShowStruct.f156376g = (long) i;
        liveEntranceShowStruct.mo86054n();
    }

    /* renamed from: TJ */
    public void mo85158TJ(Context context, Intent intent, long j, String str, int i, int i2, boolean z, int i3) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C13442s8.f38060Q0.mo12872d(context, intent, j, str, i, i2, z, i3);
    }

    /* renamed from: U3 */
    public void mo85159U3(C64682rk1 rk12, int i, long j, String str, C49712hj1 hj12, long j2) {
        C87412m.m108594g(rk12, "shareObj");
        C87412m.m108594g(str, "receiver");
        ((C60169f4) C86312j.m106911c(C60169f4.class)).mo83314U3(rk12, i, j, str, hj12, j2);
    }

    /* renamed from: V8 */
    public void mo85160V8(Context context, int i) {
        C87412m.m108594g(context, "context");
        C58408t0.f167336a.mo83263i(context, i);
    }

    /* renamed from: WM */
    public void mo85161WM(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
    }

    public void c70() {
        C58363h hVar = C58363h.f167137a;
        C58363h.C58367e eVar = C58363h.f167140d;
        eVar.f167162g++;
        Log.m105924i("RecordFinderChatProfile", "incClearHistoryCount:" + eVar.f167162g);
    }

    public void ct0() {
        C58363h hVar = C58363h.f167137a;
        C58363h.C58367e eVar = C58363h.f167140d;
        eVar.f167161f++;
        Log.m105924i("RecordFinderChatProfile", "incCompanionCount:" + eVar.f167161f);
    }

    public void cv0(long j, String str, String str2) {
        C87412m.m108594g(str, "talkUserName");
        C87412m.m108594g(str2, "chatName");
        C58363h hVar = C58363h.f167137a;
        C58363h.C58367e eVar = C58363h.f167140d;
        eVar.getClass();
        eVar.f167156a = j;
        eVar.f167157b = str;
        eVar.f167158c = str2;
        eVar.f167159d = String.valueOf(C31543z5.m39453c());
    }

    /* renamed from: dP */
    public long mo85165dP() {
        return 1;
    }

    /* renamed from: dj */
    public C49712hj1 mo85166dj(Context context) {
        C87412m.m108594g(context, "context");
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        if (f != null) {
            return f.mo12861q3();
        }
        return null;
    }

    /* renamed from: ly */
    public String mo85167ly(int i) {
        return C13442s8.f38060Q0.mo12869a(i);
    }

    public void m60(String str, int i) {
        C87412m.m108594g(str, "contextId");
        C2483o0.f12984a.mo2453c(str, i);
    }

    /* renamed from: nQ */
    public void mo85169nQ(C64888zo1 zo12) {
        T t;
        boolean z;
        C87412m.m108594g(zo12, "videoInfo");
        Iterator<T> it = this.f186948d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            C58378j1 j1Var = (C58378j1) t;
            FinderObject finderObject = zo12.f186758d;
            if ((finderObject != null ? finderObject.f164794id : 0) == j1Var.f167241a) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C58378j1 j1Var2 = (C58378j1) t;
        C49712hj1 hj12 = new C49712hj1();
        hj12.f134675i = WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED;
        hj12.f134671e = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76802R1(26, 33, hj12.f134675i);
        if (j1Var2 != null) {
            long c = C31543z5.m39453c();
            j1Var2.f167257i = c;
            j1Var2.f167225K = c - j1Var2.f167243b;
            C58378j1.C58379a aVar = C58378j1.f167214j0;
            db4 d = aVar.mo83214d(j1Var2, hj12);
            StringBuilder sb = new StringBuilder();
            sb.append("stat:");
            aVar.mo83213c(d, "stopPlayVideoInMp");
            sb.append(C13598b0.f38549a);
            C116895f.m164891c("stopPlayVideoInMp", sb.toString());
            C58389m1 m1Var = C58389m1.f167287a;
            LinkedList linkedList = new LinkedList();
            linkedList.add(d);
            m1Var.mo83224a(linkedList, hj12, 0);
            this.f186948d.remove(j1Var2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: os */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85170os(boolean r33, int r34, int r35, ht1.C60165e4.C46105a r36) {
        /*
            r32 = this;
            java.lang.String r0 = "dslRenderInfo"
            r14 = r36
            gy3.C87412m.m108594g(r14, r0)
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            boolean r1 = r1.mo77253Y5()
            if (r1 != 0) goto L_0x001b
            goto L_0x021f
        L_0x001b:
            di3.d r1 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            java.lang.String r15 = "FinderEntrance"
            te3.nn1 r4 = r1.mo77246R5(r15)
            di3.d r1 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r3 = r1.mo77227G5(r15)
            er1.w3 r1 = er1.C58784w3.f168295a
            r17 = 0
            if (r3 == 0) goto L_0x0042
            te3.xi1 r1 = r3.field_ctrInfo
            goto L_0x0044
        L_0x0042:
            r1 = r17
        L_0x0044:
            er1.j4 r2 = er1.C58739j4.f168176a
            java.lang.String r13 = ""
            if (r4 == 0) goto L_0x014f
            if (r1 == 0) goto L_0x014f
            java.lang.String r12 = r1.f144673h
            di3.d r2 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r2 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r2
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r2 = r2.Nt0()
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r2 = r2.mo77275o(r15)
            java.lang.String r2 = r2.report_ext_info
            if (r2 != 0) goto L_0x0063
            r29 = r13
            goto L_0x0065
        L_0x0063:
            r29 = r2
        L_0x0065:
            java.lang.String r2 = com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0.f12989f
            boolean r2 = gy3.C87412m.m108589b(r2, r12)
            if (r2 == 0) goto L_0x006f
            if (r33 == 0) goto L_0x014f
        L_0x006f:
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r5 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r2, r5)
            r18 = r2
            dp1.y0 r18 = (dp1.C58417y0) r18
            int r2 = r1.f144670e
            r21 = 1
            if (r12 != 0) goto L_0x0087
            r23 = r13
            goto L_0x0089
        L_0x0087:
            r23 = r12
        L_0x0089:
            java.lang.String r5 = r4.f184504f
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r13)
            java.lang.String r6 = "nullAs(showInfo.title, \"\")"
            gy3.C87412m.m108593f(r5, r6)
            long r6 = r1.f144686x
            int r1 = r4.f184502d
            r22 = 0
            r30 = 0
            java.lang.String r19 = "1"
            java.lang.String r27 = ""
            r20 = r2
            r24 = r5
            r25 = r6
            r28 = r1
            r18.Mx0(r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30)
            int r1 = r4.f184502d
            r2 = 3
            if (r1 != r2) goto L_0x00c1
            rx3.l r1 = new rx3.l
            gy3.C87412m.m108591d(r3)
            r1.<init>(r3, r4)
            com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0.f12988e = r1
            r20 = r12
            r21 = r13
            r31 = r15
            goto L_0x0105
        L_0x00c1:
            dp1.v0 r1 = dp1.C58413v0.f167346a
            gy3.C87412m.m108591d(r3)
            r5 = 1
            r7 = 0
            r1.getClass()
            te3.hj1 r6 = new te3.hj1
            r6.<init>()
            java.lang.Class<h81.i> r2 = h81.C59774i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.i r2 = (h81.C59774i) r2
            java.lang.String r2 = r2.mo84751Wb()
            if (r2 != 0) goto L_0x00df
            r2 = r13
        L_0x00df:
            r6.f134670d = r2
            r6.f134671e = r13
            r6.f134672f = r13
            r8 = 0
            r9 = 0
            r11 = 0
            r16 = 0
            r18 = 1728(0x6c0, float:2.421E-42)
            r19 = 0
            java.lang.String r2 = "1"
            r10 = r34
            r20 = r12
            r12 = r16
            r21 = r13
            r13 = r35
            r14 = r36
            r31 = r15
            r15 = r18
            r16 = r19
            dp1.C58413v0.m67780h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0105:
            r1 = 2
            r2 = r35
            if (r2 != r1) goto L_0x0145
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            di3.d r2 = di3.C86312j.m106911c(r1)
            ht1.t1 r2 = (ht1.C60200t1) r2
            int r2 = r2.Pe0()
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.t1 r1 = (ht1.C60200t1) r1
            r3 = 1
            java.lang.String r8 = r1.mo76802R1(r3, r3, r2)
            di3.d r1 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            r2 = r31
            com.tencent.mm.plugin.finder.extension.reddot.s0 r5 = r1.mo77227G5(r2)
            if (r5 == 0) goto L_0x0145
            te3.nn1 r6 = r5.mo77308o2(r2)
            if (r6 == 0) goto L_0x0145
            dp1.v0 r4 = dp1.C58413v0.f167346a
            r7 = 12
            r9 = 0
            r11 = 16
            r12 = 0
            dp1.C58413v0.m67783l(r4, r5, r6, r7, r8, r9, r11, r12)
        L_0x0145:
            if (r20 != 0) goto L_0x014a
            r13 = r21
            goto L_0x014c
        L_0x014a:
            r13 = r20
        L_0x014c:
            com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0.f12989f = r13
            goto L_0x0151
        L_0x014f:
            r21 = r13
        L_0x0151:
            di3.d r1 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            java.lang.String r2 = "FinderMentionEntrance"
            te3.nn1 r6 = r1.mo77246R5(r2)
            di3.d r1 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r5 = r1.mo77227G5(r2)
            if (r5 == 0) goto L_0x0174
            te3.xi1 r1 = r5.field_ctrInfo
            goto L_0x0176
        L_0x0174:
            r1 = r17
        L_0x0176:
            if (r6 == 0) goto L_0x01a1
            if (r1 == 0) goto L_0x01a1
            java.lang.String r13 = r1.f144673h
            if (r13 != 0) goto L_0x0181
            r1 = r21
            goto L_0x0182
        L_0x0181:
            r1 = r13
        L_0x0182:
            java.lang.String r2 = com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0.f12990g
            boolean r2 = gy3.C87412m.m108589b(r2, r1)
            if (r2 == 0) goto L_0x018c
            if (r33 == 0) goto L_0x019f
        L_0x018c:
            dp1.v0 r3 = dp1.C58413v0.f167346a
            gy3.C87412m.m108591d(r5)
            r7 = 1
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 176(0xb0, float:2.47E-43)
            r13 = 0
            java.lang.String r4 = "1"
            r10 = r34
            dp1.C58413v0.m67778f(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x019f:
            com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0.f12990g = r1
        L_0x01a1:
            vc1.b r1 = vc1.C37715b.f99914a
            boolean r1 = r1.mo61298a()
            if (r1 == 0) goto L_0x01bf
            di3.d r1 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            r1.Nt0()
            java.lang.Class<xx.g> r1 = p274xx.C66446g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            xx.g r1 = (p274xx.C66446g) r1
            boolean r1 = r1.mo61610jK()
            goto L_0x01cd
        L_0x01bf:
            di3.d r1 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            boolean r1 = r1.mo77229H5()
        L_0x01cd:
            if (r1 != 0) goto L_0x01d0
            goto L_0x021f
        L_0x01d0:
            di3.d r1 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            java.lang.String r2 = "NearbyEntrance"
            te3.nn1 r6 = r1.mo77246R5(r2)
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r5 = r0.mo77227G5(r2)
            if (r5 == 0) goto L_0x01f3
            te3.xi1 r0 = r5.field_ctrInfo
            goto L_0x01f5
        L_0x01f3:
            r0 = r17
        L_0x01f5:
            if (r6 == 0) goto L_0x021f
            if (r0 == 0) goto L_0x021f
            java.lang.String r0 = r0.f144673h
            java.lang.String r1 = com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0.f12991h
            boolean r1 = gy3.C87412m.m108589b(r1, r0)
            if (r1 == 0) goto L_0x0205
            if (r33 == 0) goto L_0x021f
        L_0x0205:
            dp1.v0 r3 = dp1.C58413v0.f167346a
            gy3.C87412m.m108591d(r5)
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 240(0xf0, float:3.36E-43)
            r13 = 0
            java.lang.String r4 = "1"
            dp1.C58413v0.m67778f(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r0 != 0) goto L_0x021c
            r13 = r21
            goto L_0x021d
        L_0x021c:
            r13 = r0
        L_0x021d:
            com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0.f12991h = r13
        L_0x021f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tf0.C64922w0.mo85170os(boolean, int, int, ht1.e4$a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
        r0 = r3.f158583D;
     */
    /* renamed from: pZ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85171pZ(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = "overwriteTipsId"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r0.Nt0()
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.lang.String r2 = "NearbyEntrance"
            java.util.List r0 = ht1.C60152b4.C8759a.m8564d(r1, r2, r3, r4, r5, r6)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r3 = r1
        L_0x0021:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r2
            te3.xi1 r4 = r2.field_ctrInfo
            int r4 = r4.f144670e
            r5 = 16
            if (r4 != r5) goto L_0x0021
            r3 = r2
            goto L_0x0021
        L_0x0037:
            if (r3 == 0) goto L_0x0047
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.nn1> r0 = r3.f158583D
            if (r0 == 0) goto L_0x0047
            java.lang.String r2 = "NearbyEntrance"
            java.lang.Object r0 = r0.get(r2)
            te3.nn1 r0 = (te3.C64586nn1) r0
            r4 = r0
            goto L_0x0048
        L_0x0047:
            r4 = r1
        L_0x0048:
            er1.w3 r0 = er1.C58784w3.f168295a
            if (r3 == 0) goto L_0x004e
            te3.xi1 r1 = r3.field_ctrInfo
        L_0x004e:
            er1.j4 r0 = er1.C58739j4.f168176a
            if (r4 == 0) goto L_0x0063
            if (r1 == 0) goto L_0x0063
            dp1.v0 r2 = dp1.C58413v0.f167346a
            gy3.C87412m.m108591d(r3)
            r5 = 6
            r6 = 1
            r7 = 0
            r9 = 16
            r10 = 0
            r8 = r12
            dp1.C58413v0.m67782j(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tf0.C64922w0.mo85171pZ(java.lang.String):void");
    }

    /* renamed from: sg */
    public void mo85172sg(long j) {
        C58363h hVar = C58363h.f167137a;
        C58363h.f167140d.f167163h = j;
    }

    /* renamed from: sz */
    public void mo85173sz(String str, int i, C60165e4.C46105a aVar) {
        C87412m.m108594g(str, "contextId");
        C87412m.m108594g(aVar, "dslRenderInfo");
        C2483o0.f12984a.mo2452b(str, i, aVar);
    }

    public void un0(String str, C51978xi1 xi12, String str2, long j, String str3, int i, int i2) {
        C87412m.m108594g(str, "showInfoPath");
        C87412m.m108594g(xi12, "ctrlInfo");
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        y0Var.getClass();
        RedDotTitleDropStruct redDotTitleDropStruct = new RedDotTitleDropStruct();
        redDotTitleDropStruct.f156777d = (long) xi12.f144670e;
        redDotTitleDropStruct.f156778e = redDotTitleDropStruct.mo86045b("redDotTipsId", xi12.f144673h, true);
        redDotTitleDropStruct.f156779f = redDotTitleDropStruct.mo86045b("feedid", C61926c.m72691p(j), true);
        if (str3 == null) {
            str3 = "";
        }
        redDotTitleDropStruct.f156780g = redDotTitleDropStruct.mo86045b("reportText", str3, true);
        if (str2 == null) {
            str2 = "";
        }
        redDotTitleDropStruct.f156781h = redDotTitleDropStruct.mo86045b(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2, true);
        redDotTitleDropStruct.f156782i = (long) i;
        redDotTitleDropStruct.f156783j = (long) i2;
        redDotTitleDropStruct.f156784k = redDotTitleDropStruct.mo86045b("showInfoPath", str, true);
        redDotTitleDropStruct.mo86054n();
        y0Var.Ec0(redDotTitleDropStruct);
    }

    /* renamed from: vS */
    public String mo85175vS(String str, int i, int i2, C60165e4.C46105a aVar) {
        C87412m.m108594g(str, "contextId");
        C87412m.m108594g(aVar, "dslRenderInfo");
        return C2483o0.f12984a.mo2454d(str, i, i2, aVar);
    }

    public void wf0(boolean z, boolean z2, C60165e4.C46105a aVar) {
        C87412m.m108594g(aVar, "dslRenderInfo");
        Class cls = FinderCommonFeatureService.class;
        if (((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77235K5() && z2) {
            C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderLiveEntrance");
            C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderLiveEntrance");
            C58784w3 w3Var = C58784w3.f168295a;
            C51978xi1 xi12 = G5 != null ? G5.field_ctrInfo : null;
            C58739j4 j4Var = C58739j4.f168176a;
            if (R5 != null && xi12 != null) {
                String str = xi12.f144673h;
                if (!C87412m.m108589b(C2483o0.f12992i, str) || z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(((C7606d) C86312j.m106911c(C7606d.class)).mo8743rq());
                    sb.append('-');
                    sb.append(C31543z5.m39453c());
                    String sb4 = sb.toString();
                    C58413v0 v0Var = C58413v0.f167346a;
                    C87412m.m108591d(G5);
                    C58413v0.m67779g(v0Var, "1", G5, R5, 1, "", 0, "8001-" + C31543z5.m39453c(), sb4, 0, aVar, 256, (Object) null);
                    if (str == null) {
                        str = "";
                    }
                    C2483o0.f12992i = str;
                }
            }
        }
    }

    /* renamed from: x6 */
    public C49712hj1 mo85177x6(Fragment fragment) {
        C87412m.m108594g(fragment, "fragment");
        C13442s8 s8Var = (C13442s8) C39818r.f106831a.mo62445d(fragment).mo62449e(C13442s8.class);
        if (s8Var != null) {
            return s8Var.mo12861q3();
        }
        return null;
    }
}
