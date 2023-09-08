package er1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import al1.C0081n;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import bd1.C0264h;
import bl3.C39818r;
import cj1.C54738b1;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderEnterMentionListStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderVstStruct;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.finder.activity.C2300a;
import com.tencent.p014mm.plugin.finder.activity.FinderActivityProfileUI;
import com.tencent.p014mm.plugin.finder.activity.music.p049ui.FinderMusicTopicUI;
import com.tencent.p014mm.plugin.finder.activity.topic.p051ui.FinderNewTopicUI;
import com.tencent.p014mm.plugin.finder.feed.jumper.FinderWeAppHalfScreenScListener;
import com.tencent.p014mm.plugin.finder.feed.model.FinderParcelTopicInfo;
import com.tencent.p014mm.plugin.finder.feed.p052ui.BizProfileTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAlbumTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAtTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFavTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFeedRelatedTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFloatBallDetailUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFriendLikeTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGalleryTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGalleryUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderInteractionSearchUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderMultiTaskUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiManageUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiRelateListUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileTimeLineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderRealnameVerifyRouteUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderRelatedTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderWxProfileShowUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.FinderBlockListSearchUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderBlockListUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderConversationTempUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderCreateContactUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderEditTextUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderFansListUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderFinderMsgUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderFinderSysMsgUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderImagePreviewUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderImmersiveFeedUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderLikedFeedUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderMediaPreviewUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderModifyNameUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderMsgFeedDetailUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderSelfUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderUnOpenUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderWxMsgUI;
import com.tencent.p014mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource;
import com.tencent.p014mm.plugin.finder.search.FinderContactSearchIncludeFollowUI;
import com.tencent.p014mm.plugin.finder.search.FinderContactSearchUI;
import com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI;
import com.tencent.p014mm.plugin.finder.search.FinderMixSearchUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvMainUI;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvRouterUI;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.VideoCaptureReportInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di0.C86295k;
import di0.C86299o;
import di0.C86300q;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58358d0;
import dp1.C58363h;
import dp1.C58417y0;
import dp1.C58418z1;
import ds1.C7515a;
import eb0.C31543z5;
import eb0.C75592q0;
import ei3.C86522b;
import fy3.C32224a;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import hh2.C8532a;
import hp1.C8703w0;
import ht1.C60179k4;
import ht1.C60200t1;
import ht1.C60204t3;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import je1.C60796c2;
import jm2.C117361f;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kj2.C117407d;
import kr0.C76630x0;
import ky2.C10432i;
import nj3.C76879j;
import nj3.C76912y0;
import o40.C61926c;
import o40.C61937h;
import on1.C11528h0;
import on1.C11548q;
import org.json.JSONObject;
import ot1.C11767a;
import p274xx.C15907f;
import p498dv.C75457c;
import p565ir.C60606n;
import p599lr.C61381b;
import pe1.C35464c;
import pe3.C89349b;
import pf1.C62262d0;
import pt1.C35640b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C36570n;
import sd1.C13652a;
import te3.C48814b61;
import te3.C48924by0;
import te3.C49007cj0;
import te3.C49098d51;
import te3.C49567gj0;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C50019jp1;
import te3.C50326ly0;
import te3.C50681oh0;
import te3.C50972qk0;
import te3.C51270sn1;
import te3.C51333t21;
import te3.C51538uf1;
import te3.C51745vv0;
import te3.C51773w21;
import te3.C52312zv0;
import te3.C64273c21;
import te3.C64383g31;
import te3.C64636pq2;
import te3.C64848y91;
import tf0.C13883o1;
import tf0.C13887q1;
import up1.C37521f;
import vp1.C65834e;
import wi0.C66117m;
import wi0.C90973a0;
import wx3.C15601d;
import wx3.C66212f;
import z04.C112551y;
import zb3.C66782d;
import zc1.C66785b;
import zp3.C79406f;

@C86522b
/* renamed from: er1.b */
public final class C58684b extends C86301e implements C13883o1 {

    /* renamed from: er1.b$a */
    public static final class C7781a implements C86295k {

        /* renamed from: d */
        public final String f26281d;

        public C7781a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isSheetLaunchMode", 1);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …, 1)\n        }.toString()");
            this.f26281d = jSONObject2;
        }

        /* renamed from: a */
        public String mo3693a() {
            return this.f26281d;
        }
    }

    /* renamed from: er1.b$b */
    public static final class C58685b implements C86300q {
        /* renamed from: a */
        public void mo63853a() {
            C62262d0.f176978a.getClass();
            C62262d0.f176980c = false;
        }

        /* renamed from: b */
        public void mo63854b(String str) {
        }

        /* renamed from: c */
        public void mo63855c() {
        }

        /* renamed from: d */
        public /* synthetic */ void mo63856d() {
        }

        /* renamed from: e */
        public void mo63857e() {
        }

        /* renamed from: f */
        public void mo63858f(boolean z) {
            C62262d0.f176978a.getClass();
            C62262d0.f176980c = false;
        }
    }

    /* renamed from: er1.b$c */
    public static final class C58686c implements C60179k4.C60180a {

        /* renamed from: a */
        public final /* synthetic */ String f167982a;

        /* renamed from: b */
        public final /* synthetic */ Context f167983b;

        /* renamed from: c */
        public final /* synthetic */ C32224a<C13598b0> f167984c;

        /* renamed from: d */
        public final /* synthetic */ String f167985d;

        /* renamed from: er1.b$c$a */
        public static final class C58687a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Context f167986d;

            /* renamed from: e */
            public final /* synthetic */ int f167987e;

            /* renamed from: f */
            public final /* synthetic */ int f167988f;

            /* renamed from: g */
            public final /* synthetic */ String f167989g;

            /* renamed from: h */
            public final /* synthetic */ String f167990h;

            /* renamed from: i */
            public final /* synthetic */ C32224a<C13598b0> f167991i;

            /* renamed from: j */
            public final /* synthetic */ String f167992j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58687a(Context context, int i, int i2, String str, String str2, C32224a<C13598b0> aVar, String str3) {
                super(0);
                this.f167986d = context;
                this.f167987e = i;
                this.f167988f = i2;
                this.f167989g = str;
                this.f167990h = str2;
                this.f167991i = aVar;
                this.f167992j = str3;
            }

            public Object invoke() {
                if (!C58784w3.f168295a.mo83954p(this.f167986d, this.f167987e, this.f167988f, this.f167989g)) {
                    String str = this.f167990h;
                    C87412m.m108593f(str, "sessionId");
                    if (str.length() > 0) {
                        C32224a<C13598b0> aVar = this.f167991i;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        Intent intent = new Intent();
                        intent.putExtra("Chat_Self", this.f167992j);
                        intent.putExtra("Chat_User", this.f167990h);
                        intent.putExtra("finish_direct", true);
                        C13442s8.f38060Q0.mo12871c(this.f167986d, intent);
                        C88144b.m109801s(this.f167986d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C58686c(String str, Context context, C32224a<C13598b0> aVar, String str2) {
            this.f167982a = str;
            this.f167983b = context;
            this.f167984c = aVar;
            this.f167985d = str2;
        }

        /* renamed from: a */
        public final void mo83611a(String str, int i, int i2, String str2) {
            Log.m105924i("Finder.ActivityRouter", "[enterChattingUIFromLive] toUsername=" + this.f167982a + " sessionId=" + str);
            C61926c.m72668M(new C58687a(this.f167983b, i, i2, str2, str, this.f167984c, this.f167985d));
        }
    }

    /* renamed from: er1.b$d */
    public static final class C58688d implements C60179k4.C60180a {

        /* renamed from: a */
        public final /* synthetic */ Context f167993a;

        /* renamed from: b */
        public final /* synthetic */ C49712hj1 f167994b;

        /* renamed from: c */
        public final /* synthetic */ int f167995c;

        /* renamed from: er1.b$d$a */
        public static final class C58689a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Context f167996d;

            /* renamed from: e */
            public final /* synthetic */ int f167997e;

            /* renamed from: f */
            public final /* synthetic */ int f167998f;

            /* renamed from: g */
            public final /* synthetic */ String f167999g;

            /* renamed from: h */
            public final /* synthetic */ String f168000h;

            /* renamed from: i */
            public final /* synthetic */ C49712hj1 f168001i;

            /* renamed from: j */
            public final /* synthetic */ int f168002j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58689a(Context context, int i, int i2, String str, String str2, C49712hj1 hj12, int i3) {
                super(0);
                this.f167996d = context;
                this.f167997e = i;
                this.f167998f = i2;
                this.f167999g = str;
                this.f168000h = str2;
                this.f168001i = hj12;
                this.f168002j = i3;
            }

            public Object invoke() {
                if (!C58784w3.f168295a.mo83954p(this.f167996d, this.f167997e, this.f167998f, this.f167999g)) {
                    String str = this.f168000h;
                    C87412m.m108593f(str, "sessionId");
                    if (str.length() > 0) {
                        C58363h.C58364b.m67608a(C58363h.f167143g, this.f168001i, 4, 1, (Long) null, 8, (Object) null);
                        Intent intent = new Intent();
                        int i = this.f168002j;
                        intent.putExtra("Chat_Self", i == 2 ? C75592q0.m90789s() : i == 1 ? C66785b.f191882e.mo90662O5() : C75592q0.m90782l());
                        intent.putExtra("Chat_User", this.f168000h);
                        intent.putExtra("finish_direct", true);
                        C13442s8.f38060Q0.mo12871c(this.f167996d, intent);
                        C88144b.m109801s(this.f167996d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                        return C13598b0.f38549a;
                    }
                }
                C58363h.C58364b.m67608a(C58363h.f167143g, this.f168001i, 4, 2, (Long) null, 8, (Object) null);
                return C13598b0.f38549a;
            }
        }

        public C58688d(Context context, C49712hj1 hj12, int i) {
            this.f167993a = context;
            this.f167994b = hj12;
            this.f167995c = i;
        }

        /* renamed from: a */
        public final void mo83611a(String str, int i, int i2, String str2) {
            C61926c.m72668M(new C58689a(this.f167993a, i, i2, str2, str, this.f167994b, this.f167995c));
        }
    }

    /* renamed from: er1.b$e */
    public static final class C58690e implements C60179k4.C60180a {

        /* renamed from: a */
        public final /* synthetic */ String f168003a;

        /* renamed from: b */
        public final /* synthetic */ Context f168004b;

        /* renamed from: c */
        public final /* synthetic */ int f168005c;

        /* renamed from: er1.b$e$a */
        public static final class C58691a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Context f168006d;

            /* renamed from: e */
            public final /* synthetic */ int f168007e;

            /* renamed from: f */
            public final /* synthetic */ int f168008f;

            /* renamed from: g */
            public final /* synthetic */ String f168009g;

            /* renamed from: h */
            public final /* synthetic */ String f168010h;

            /* renamed from: i */
            public final /* synthetic */ String f168011i;

            /* renamed from: j */
            public final /* synthetic */ int f168012j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58691a(Context context, int i, int i2, String str, String str2, String str3, int i3) {
                super(0);
                this.f168006d = context;
                this.f168007e = i;
                this.f168008f = i2;
                this.f168009g = str;
                this.f168010h = str2;
                this.f168011i = str3;
                this.f168012j = i3;
            }

            public Object invoke() {
                String str;
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                C13442s8 f = aVar.mo12873f(this.f168006d);
                C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                if (!C58784w3.f168295a.mo83954p(this.f168006d, this.f168007e, this.f168008f, this.f168009g)) {
                    String str2 = this.f168010h;
                    C87412m.m108593f(str2, "sessionId");
                    if (str2.length() > 0) {
                        Intent intent = new Intent();
                        C66785b bVar = C66785b.f191882e;
                        int i = bVar.mo90673n0().f131584h;
                        if (i == 1) {
                            str = C75592q0.m90789s();
                            C87412m.m108593f(str, "{\n                Config…mUserInfo()\n            }");
                        } else if (i == 2) {
                            str = C75592q0.m90782l();
                            C87412m.m108593f(str, "{\n                Config…sUsername()\n            }");
                        } else if (i != 3) {
                            str = C75592q0.m90789s();
                            C87412m.m108593f(str, "{\n                Config…mUserInfo()\n            }");
                        } else {
                            str = bVar.mo90662O5();
                        }
                        intent.putExtra("Chat_Self", str);
                        intent.putExtra("Chat_User", this.f168010h);
                        intent.putExtra("finish_direct", true);
                        intent.putExtra("key_finder_need_choose_id", true);
                        intent.putExtra("key_finder_talker_user_name", this.f168011i);
                        aVar.mo12871c(this.f168006d, intent);
                        C88144b.m109801s(this.f168006d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                        if (this.f168012j == 2) {
                            C58363h.C58364b.m67608a(C58363h.f167143g, q3, 3, 1, (Long) null, 8, (Object) null);
                        }
                        return C13598b0.f38549a;
                    }
                }
                if (this.f168012j == 2) {
                    C58363h.C58364b.m67608a(C58363h.f167143g, q3, 3, 2, (Long) null, 8, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        public C58690e(String str, Context context, int i) {
            this.f168003a = str;
            this.f168004b = context;
            this.f168005c = i;
        }

        /* renamed from: a */
        public final void mo83611a(String str, int i, int i2, String str2) {
            Log.m105924i("Finder.ActivityRouter", "[enterChattingUI] ]username=" + this.f168003a + " sessionId=" + str);
            C61926c.m72668M(new C58691a(this.f168004b, i, i2, str2, str, this.f168003a, this.f168005c));
        }
    }

    /* renamed from: er1.b$f */
    public static final class C58692f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54738b1 f168013d;

        /* renamed from: e */
        public final /* synthetic */ boolean f168014e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58692f(C54738b1 b1Var, boolean z) {
            super(0);
            this.f168013d = b1Var;
            this.f168014e = z;
        }

        public Object invoke() {
            LiveConfig d = this.f168013d.mo75635d();
            if (d != null && this.f168014e) {
                Util.isNullOrNil(d.f157072p);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: er1.b$g */
    public static final class C58693g implements C15907f.C15909b {

        /* renamed from: a */
        public final /* synthetic */ C58684b f168015a;

        /* renamed from: b */
        public final /* synthetic */ Context f168016b;

        /* renamed from: c */
        public final /* synthetic */ Intent f168017c;

        public C58693g(C58684b bVar, Context context, Intent intent) {
            this.f168015a = bVar;
            this.f168016b = context;
            this.f168017c = intent;
        }

        /* renamed from: a */
        public void mo6380a() {
        }

        public void onSuccess() {
            this.f168015a.yy0(this.f168016b, this.f168017c);
        }
    }

    /* renamed from: er1.b$h */
    public static final class C58694h implements C15907f.C15909b {

        /* renamed from: a */
        public final /* synthetic */ C58684b f168018a;

        /* renamed from: b */
        public final /* synthetic */ Context f168019b;

        /* renamed from: c */
        public final /* synthetic */ Intent f168020c;

        /* renamed from: d */
        public final /* synthetic */ boolean f168021d;

        public C58694h(C58684b bVar, Context context, Intent intent, boolean z) {
            this.f168018a = bVar;
            this.f168019b = context;
            this.f168020c = intent;
            this.f168021d = z;
        }

        /* renamed from: a */
        public void mo6380a() {
            ((C75457c) C86312j.m106911c(C75457c.class)).mo105804on(this.f168019b, false);
        }

        public void onSuccess() {
            this.f168018a.zy0(this.f168019b, this.f168020c, this.f168021d);
        }
    }

    public static void Cx0(C58684b bVar, Context context, Intent intent, int i, int i2, Object obj) {
        Intent intent2 = null;
        if ((i2 & 2) != 0) {
            intent = null;
        }
        bVar.getClass();
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        if (!(context instanceof Activity)) {
            intent2 = intent;
        }
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderBlockListUI.class);
        intent.putExtra("BLOCK_LIST_TYPE", i);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderBlockListUi", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderBlockListUi", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void Qx0(C58684b bVar, Activity activity, Intent intent, C64636pq2 pq22, C51538uf1 uf12, boolean z, boolean z2, int i, Object obj) {
        Activity activity2 = activity;
        C64636pq2 pq23 = pq22;
        byte[] bArr = null;
        C51538uf1 uf13 = (i & 8) != 0 ? null : uf12;
        boolean z3 = (i & 16) != 0 ? false : z;
        boolean z4 = (i & 32) != 0 ? false : z2;
        bVar.getClass();
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(pq22, "localContent");
        Intent intent2 = intent == null ? new Intent() : intent;
        intent2.setClass(activity, FinderMediaPreviewUI.class);
        intent2.putExtra("media_list_", pq22.toByteArray());
        intent2.putExtra("media_list_count", pq23.f184875d.size());
        if (uf13 != null) {
            bArr = uf13.toByteArray();
        }
        intent2.putExtra("ref_feed_info", bArr);
        intent2.putExtra("long_video_preview", z3);
        intent2.putExtra("KEY_SHOW_SEEK_BAR", z4);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent2);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderMediaPreviewUI", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/protocal/protobuf/LocalFinderContent;Lcom/tencent/mm/protocal/protobuf/FinderObjectRefInfo;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderMediaPreviewUI", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/protocal/protobuf/LocalFinderContent;Lcom/tencent/mm/protocal/protobuf/FinderObjectRefInfo;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void Ux0(C58684b bVar, Context context, Intent intent, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = Boolean.FALSE;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            num = -1;
        }
        bVar.getClass();
        C87412m.m108594g(context, "context");
        ((C61381b) C86312j.m106911c(C61381b.class)).Yp0().mo88194e(context, intent, 3, 9, bool2, num);
    }

    public static void Wx0(C58684b bVar, Context context, Intent intent, int i, int i2, Object obj) {
        Intent intent2 = null;
        if ((i2 & 2) != 0) {
            intent = null;
        }
        bVar.getClass();
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        if (!(context instanceof Activity)) {
            intent2 = intent;
        }
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClassName(context, "com.tencent.mm.ui.contact.privacy.FinderBlockListUI");
        intent.putExtra("BLOCK_LIST_TYPE", i);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderPrivacyBlockListNewUi", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderPrivacyBlockListNewUi", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static /* synthetic */ void by0(C58684b bVar, Context context, Intent intent, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 2;
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        bVar.ay0(context, intent, i, z);
    }

    public static void cy0(C58684b bVar, Context context, Intent intent, int i, Object obj) {
        Intent intent2 = null;
        if ((i & 2) != 0) {
            intent = null;
        }
        bVar.getClass();
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("KEY_TALKER_TYPE", 1);
        intent.putExtra("KEY_TALKER_SCENE", 1);
        if (!(context instanceof Activity)) {
            intent2 = intent;
        }
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        C13442s8.f38060Q0.mo12871c(context, intent);
        intent.setClass(context, FinderConversationTempUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderWxConversationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderWxConversationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void ly0(C58684b bVar, Context context, Intent intent, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        bVar.getClass();
        C87412m.m108594g(context, "context");
        if (!bVar.xy0(context, intent)) {
            if (intent == null) {
                intent = new Intent();
            }
            if (!z) {
                intent.putExtra("key_to_comment_scene", 138);
                C13442s8.f38060Q0.mo12871c(context, intent);
            }
            Intent intent2 = !(context instanceof Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            intent.setClass(context, FinderMusicTopicUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterMusicTopicUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterMusicTopicUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void Ax0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(context, FinderFeedRelatedTimelineUI.class);
        C13442s8.f38060Q0.mo12871c(context, intent);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFeedRelatedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFeedRelatedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Ay0(Activity activity, String str) {
        String str2;
        C87412m.m108594g(activity, "context");
        Bundle bundle = new Bundle();
        if (Util.isNullOrNil(str)) {
            String className = activity.getComponentName().getClassName();
            C87412m.m108593f(className, "context.componentName.className");
            String str3 = MMApplicationContext.getSourcePackageName() + ".plugin.finder";
            if (C112551y.m153819s(className, str3, false)) {
                str2 = className.substring(str3.length());
                C87412m.m108593f(str2, "this as java.lang.String).substring(startIndex)");
            } else {
                str2 = className;
            }
            Log.m105924i("Finder.ActivityRouter", "fullActivity " + className + ", fromActivity " + str2);
            bundle.putString("realname_verify_process_jump_activity", str2);
        } else {
            bundle.putString("realname_verify_process_jump_activity", str);
        }
        bundle.putString("realname_verify_process_jump_plugin", "finder");
        ((C66782d) C86312j.m106911c(C66782d.class)).mo72982Co(activity, bundle);
    }

    public final void Bx0(Context context, Intent intent, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "type");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderBlockListSearchUI.class);
        int i = FinderBlockListSearchUI.f16778u;
        intent.putExtra("BLOCK_LIST_SEARCH_TYPE", str);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderBlockListSearchUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderBlockListSearchUI", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: CN */
    public void mo13250CN(Activity activity, Intent intent, int i) {
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(activity, (Class) ((C36570n) C35640b.f95308y).getValue());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderCreateLotteryUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        activity.overridePendingTransition(C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2333y);
    }

    public final void Dx0(Context context, C50972qk0 qk02, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "i");
        C8703w0 w0Var = C8703w0.f27927a;
        C8703w0.f27929c = qk02;
        C117407d.INSTANCE.idkeyStat(1265, 2, 1, false);
        intent.setClass(context, FinderContactSearchIncludeFollowUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderContactSearchIncludeFollowUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderFeedSearchObj;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderContactSearchIncludeFollowUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderFeedSearchObj;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void E50(AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed, Bundle bundle, int i) {
        C87412m.m108594g(appCompatActivity, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        C7888v2.f26513a.mo9023x(appCompatActivity, baseFinderFeed, bundle, i);
    }

    public void Ee0(Context context, long j, String str, C64273c21 c212, C0081n nVar, C49098d51 d512, String str2, LinkedList<C64848y91> linkedList, C64848y91 y912, String str3, String str4, LinkedList<C51745vv0> linkedList2, Intent intent) {
        Context context2 = context;
        C64273c21 c213 = c212;
        String str5 = str3;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "nonceId");
        C87412m.m108594g(c212, "liveInfo");
        C87412m.m108594g(str5, "contextId");
        LiveConfig.C55204b bVar = new LiveConfig.C55204b();
        bVar.f157091a = 0;
        bVar.f157093c = c213.f182392d;
        bVar.f157101k = j;
        bVar.f157106p = str;
        bVar.f157096f = C66785b.f191882e.mo90662O5();
        bVar.f157107q = "";
        bVar.f157110t = 0;
        bVar.f157111u = 0;
        bVar.f157108r = "";
        bVar.f157109s = "";
        bVar.f157102l = str2;
        bVar.f157112v = str4;
        LiveConfig a = bVar.mo76374a();
        Log.m105924i("Finder.ActivityRouter", "enterFinderLiveAnchorUI " + a.mo76369b());
        C54738b1 b1Var = new C54738b1();
        b1Var.f153423l.add(a);
        b1Var.f153412a = d512;
        b1Var.f153424m = c213.f182356B;
        b1Var.f153414c = linkedList;
        b1Var.f153415d = y912;
        b1Var.f153416e = linkedList2;
        ((C60606n) C86312j.m106911c(C60606n.class)).fs0(c213.f182392d);
        Intent intent2 = intent == null ? new Intent() : intent;
        intent2.putExtra("KEY_PARAMS_SOURCE_TYPE", c213.f182405s);
        Ox0(context, b1Var, str5, intent2);
    }

    public final void Ex0(Context context, C50972qk0 qk02, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "i");
        C8703w0 w0Var = C8703w0.f27927a;
        C8703w0.f27929c = qk02;
        C117407d.INSTANCE.idkeyStat(1265, 2, 1, false);
        intent.setClass(context, FinderContactSearchUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderContactSearchUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderFeedSearchObj;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderContactSearchUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderFeedSearchObj;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void F50(Context context, Intent intent) {
        Activity ub02;
        C87412m.m108594g(context, "context");
        if (!xy0(context, intent)) {
            if (!(context instanceof Activity) && (ub02 = ((C60204t3) C86312j.m106911c(C60204t3.class)).ub0()) != null) {
                context = ub02;
            }
            boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_IGNORE_REPORT_INIT", false) : false;
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra("key_to_comment_scene", 22);
            if (!booleanExtra) {
                C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
            }
            Intent intent2 = !(context instanceof Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            if (intent.getIntExtra("key_topic_type", 1) == 1) {
                C37521f.f99374d.getClass();
                if (C37521f.f99163E7.mo60266n().intValue() == 1) {
                    intent.setClass(context, FinderNewTopicUI.class);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterTopicFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterTopicFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            intent.setClass(context, FinderTopicFeedUI.class);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context22 = context;
            C117292a.m165358d(context22, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterTopicFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context22, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterTopicFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public final void Fx0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setClass(context, FinderEditTextUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderEditTextUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderEditTextUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Gx0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderFansListUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderFansListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderFansListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: H9 */
    public void mo13254H9(Context context, int i, C51773w21 w212, String str, long j, C49712hj1 hj12, boolean z) {
        Context context2 = context;
        C51773w21 w213 = w212;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w212, "toUser");
        String str2 = str;
        C87412m.m108594g(str, "lotteryId");
        if (w213.f143829i) {
            C76912y0.makeText(context, (int) C0966R.string.ebr, 0).show();
            return;
        }
        String str3 = w213.f143824d;
        if (str3 == null) {
            str3 = "";
        }
        ((C60179k4) C86312j.m106911c(C60179k4.class)).mo78773vl(context, i, str3, str, Long.valueOf(j), z ? 1 : 7, new C58688d(context, hj12, i));
    }

    public int Hg0(Context context, C54738b1 b1Var, String str, String str2, Intent intent, boolean z) {
        C54738b1 b1Var2 = b1Var;
        String str3 = str;
        String str4 = str2;
        Context context2 = context;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(b1Var, "config");
        C87412m.m108594g(str, "contextId");
        C87412m.m108594g(str2, "clickTabContextId");
        Log.m105924i("Finder.ActivityRouter", "[enterFinderLiveVisitorUI] " + b1Var + ",contextId:" + str + ",clickTabContextId:" + str2);
        C32444a aVar = C32444a.f86121a;
        boolean z2 = C32444a.f86054F1.mo60266n().intValue() == 1;
        C58418z1.C58419a aVar2 = new C58418z1.C58419a();
        aVar2.f167361a = System.currentTimeMillis();
        aVar2.f167366f = z2;
        C58418z1.f167360a = aVar2;
        C58358d0.f167118d = null;
        long j = 0;
        C58358d0.f167116b = 0;
        C58358d0.f167117c = 0;
        C58358d0.f167119e = false;
        C58358d0.f167121g = true;
        C58358d0.C58359a aVar3 = new C58358d0.C58359a();
        aVar3.f167123a = SystemClock.elapsedRealtime();
        C58358d0.f167118d = aVar3;
        C58358d0.f167116b = 1;
        C58358d0.f167117c = 1;
        aVar3.f167124b = 0;
        aVar3.f167125c = 0;
        aVar3.f167126d = 0;
        aVar3.f167127e = 0;
        aVar3.f167128f = 0;
        C60606n nVar = (C60606n) C86312j.m106911c(C60606n.class);
        LiveConfig d = b1Var.mo75635d();
        if (d != null) {
            j = d.f157064e;
        }
        nVar.fs0(j);
        if ((b1Var2.f153426o & 4) > 0) {
            return 0;
        }
        return ((C13887q1) C86312j.m106911c(C13887q1.class)).Id0(context, b1Var, str, str2, intent, z, new C58692f(b1Var, z2));
    }

    /* renamed from: Hl */
    public void mo13256Hl(Activity activity, Intent intent) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (intent == null) {
            intent = new Intent();
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(activity, (Class) ((C36570n) C35640b.f95277H).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderAnchorVerifyWebviewUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderAnchorVerifyWebviewUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Hx0(Context context, C50972qk0 qk02, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(intent2, "i");
        C8703w0 w0Var = C8703w0.f27927a;
        C8703w0.f27929c = qk02;
        intent2.setClass(context2, FinderFeedSearchUI.class);
        intent2.putExtra("key_to_comment_scene", 6);
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
        Intent intent3 = !(context2 instanceof Activity) ? intent2 : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        C58784w3.m68435a(C58784w3.f168295a, intent, 0, (String) null, 6, (Object) null);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent2);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderFeedSearchUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderFeedSearchObj;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderFeedSearchUI", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderFeedSearchObj;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117407d.INSTANCE.idkeyStat(1265, 1, 1, false);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void I00(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r10, r0)
            boolean r0 = r9.xy0(r10, r11)
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            if (r11 != 0) goto L_0x0013
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
        L_0x0013:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99172F7
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L_0x002d
            java.lang.Class<com.tencent.mm.plugin.finder.activity.poi.ui.FinderNewPoiUI> r0 = com.tencent.p014mm.plugin.finder.activity.poi.p050ui.FinderNewPoiUI.class
            r11.setClass(r10, r0)
            goto L_0x0032
        L_0x002d:
            java.lang.Class<com.tencent.mm.plugin.finder.feed.ui.FinderPoiFeedUI> r0 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiFeedUI.class
            r11.setClass(r10, r0)
        L_0x0032:
            boolean r0 = r10 instanceof android.app.Activity
            r1 = 0
            if (r0 != 0) goto L_0x0039
            r0 = r11
            goto L_0x003a
        L_0x0039:
            r0 = r1
        L_0x003a:
            if (r0 == 0) goto L_0x0041
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r2)
        L_0x0041:
            r0 = -1
            java.lang.String r2 = "key_entrance_type"
            int r0 = r11.getIntExtra(r2, r0)
            java.lang.String r2 = "key_from_type"
            java.io.Serializable r2 = r11.getSerializableExtra(r2)
            boolean r3 = r2 instanceof ht1.C98522w3.C8810a
            if (r3 == 0) goto L_0x0055
            r1 = r2
            ht1.w3$a r1 = (ht1.C98522w3.C8810a) r1
        L_0x0055:
            ht1.w3$a r2 = ht1.C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS
            if (r1 != r2) goto L_0x005c
            r1 = 81
            goto L_0x005e
        L_0x005c:
            r1 = 26
        L_0x005e:
            er1.a1 r2 = er1.C58679a1.f167972a
            r2.mo83554a(r10, r11, r1, r0)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r11)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/utils/ActivityRouter"
            java.lang.String r4 = "enterPoiFeedUI"
            java.lang.String r5 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r10
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r11 = 0
            java.lang.Object r11 = r0.mo10231a(r11)
            android.content.Intent r11 = (android.content.Intent) r11
            r10.startActivity(r11)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/utils/ActivityRouter"
            java.lang.String r2 = "enterPoiFeedUI"
            java.lang.String r3 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r10
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58684b.I00(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: Ig */
    public void mo13258Ig(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.ActivityRouter", "enterFinderGameLiveSearchUI");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95274E).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGameSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGameSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: Ix */
    public void mo13259Ix(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.ActivityRouter", "enterFinderLiveFansListUI");
        if (intent == null) {
            intent = new Intent();
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95302s).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveFansListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveFansListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Ix0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        C13442s8.f38060Q0.mo12871c(context, intent);
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setClass(context, FinderFinderSysMsgUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderFinderSysMsgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderFinderSysMsgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Jl0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.ActivityRouter", "FinderGameLivePostVerifyUI");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95273D).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGameLivePostVerifyUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGameLivePostVerifyUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Jx0(Context context, Intent intent, int i) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        boolean z = context instanceof Activity;
        Intent intent2 = !z ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderGalleryUI.class);
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            aVar.mo10233c(intent);
            C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGalleryUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGalleryUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGalleryUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: KH */
    public void mo13261KH(Intent intent, Context context, long j, long j2, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, Integer num, int i2, byte[] bArr, FinderObject finderObject, boolean z) {
        String str8;
        String str9;
        String str10;
        String str11;
        Intent intent2 = intent;
        long j3 = j2;
        String str12 = str;
        String str13 = str2;
        String str14 = str3;
        Context context2 = context;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str12, "anchorUserName");
        C87412m.m108594g(str13, "nonceId");
        C87412m.m108594g(str14, "desc");
        C87412m.m108594g(str4, "contextId");
        LiveConfig.C55204b bVar = new LiveConfig.C55204b();
        C58763p pVar = C58763p.f168245a;
        bVar.f157091a = 1;
        bVar.f157093c = j3;
        bVar.f157106p = str13;
        bVar.f157099i = str7;
        bVar.f157100j = num != null ? num.intValue() : 1;
        bVar.f157101k = j;
        bVar.f157096f = str12;
        bVar.f157102l = str14;
        bVar.f157112v = str5;
        bVar.f157113w = str6;
        if (intent2 == null || (str8 = intent.getStringExtra("key_enter_live_export_id")) == null) {
            str8 = "";
        }
        bVar.f157115y = str8;
        bVar.f157084B = bArr;
        bVar.f157103m = intent2 != null ? intent.getIntExtra("key_enter_live_param_bind_type", 0) : 0;
        if (intent2 == null || (str9 = intent.getStringExtra("key_enter_live_param_by_biz_username")) == null) {
            str9 = "";
        }
        bVar.f157104n = str9;
        if (intent2 == null || (str10 = intent.getStringExtra("key_enter_live_param_by_biz_nickname")) == null) {
            str10 = "";
        }
        bVar.f157105o = str10;
        if (intent2 == null || (str11 = intent.getStringExtra("key_enter_live_cover_url")) == null) {
            str11 = "";
        }
        bVar.f157095e = str11;
        bVar.f157085C = intent2 != null ? intent.getIntExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", 0) : 0;
        C48924by0 by02 = new C48924by0();
        byte[] byteArrayExtra = intent2 != null ? intent.getByteArrayExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO") : null;
        if (byteArrayExtra != null) {
            try {
                by02.parseFrom(byteArrayExtra);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
            pVar.mo83799a(bVar, "enterFinderLiveVisitorUI", by02);
            LiveConfig a = bVar.mo76374a();
            C54738b1 b1Var = new C54738b1();
            b1Var.f153423l.add(a);
            b1Var.f153426o = i;
            b1Var.f153422k = i2;
            b1Var.f153429r = finderObject;
            b1Var.mo75634c(intent);
            b1Var.mo75633b(intent);
            b1Var.mo75632a(intent, j3);
            C13883o1.C13884a.m13251c(this, context, b1Var, str4, (String) null, intent, z, 8, (Object) null);
        }
        by02 = null;
        pVar.mo83799a(bVar, "enterFinderLiveVisitorUI", by02);
        LiveConfig a2 = bVar.mo76374a();
        C54738b1 b1Var2 = new C54738b1();
        b1Var2.f153423l.add(a2);
        b1Var2.f153426o = i;
        b1Var2.f153422k = i2;
        b1Var2.f153429r = finderObject;
        b1Var2.mo75634c(intent);
        b1Var2.mo75633b(intent);
        b1Var2.mo75632a(intent, j3);
        C13883o1.C13884a.m13251c(this, context, b1Var2, str4, (String) null, intent, z, 8, (Object) null);
    }

    public void Ki0(AppCompatActivity appCompatActivity, FinderItem finderItem, Bundle bundle, int i, C32226l<? super List<String>, C13598b0> lVar) {
        C87412m.m108594g(appCompatActivity, "context");
        C87412m.m108594g(finderItem, "feedObject");
        C7888v2.f26513a.mo9020s(appCompatActivity, finderItem, bundle, i, lVar);
    }

    public void Kx0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(context, FinderImagePreviewUI.class);
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderImagePreviewUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderImagePreviewUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Lx0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setClass(context, FinderImmersiveFeedUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderImmersiveFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderImmersiveFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Mc0(Activity activity, Intent intent, int i) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(activity, FinderWxProfileShowUI.class);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderAffiliateAccountDoneUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: Mw */
    public void mo13264Mw(Context context, C49007cj0 cj02, Intent intent, boolean z) {
        C64273c21 c212;
        FinderJumpInfo finderJumpInfo;
        C50681oh0 oh02;
        C50326ly0 ly02;
        FinderObject finderObject;
        C49007cj0 cj03 = cj02;
        C87412m.m108594g(context, "context");
        if (cj03 == null || (finderObject = cj03.f131759i) == null || (c212 = finderObject.liveInfo) == null) {
            c212 = new C64273c21();
        }
        C49098d51 d512 = cj03 != null ? cj03.f131755e : null;
        LinkedList<C64848y91> linkedList = cj03 != null ? cj03.f131760j : null;
        C64848y91 y912 = cj03 != null ? cj03.f131761n : null;
        LinkedList<C51745vv0> linkedList2 = cj03 != null ? cj03.f131762o : null;
        Integer valueOf = cj03 != null ? Integer.valueOf(cj03.f131763p) : null;
        Integer valueOf2 = cj03 != null ? Integer.valueOf(cj03.f131766s) : null;
        C52312zv0 zv02 = cj03 != null ? cj03.f131768u : null;
        C51333t21 t212 = new C51333t21();
        t212.f141907d = cj03 != null ? cj03.f131771x : null;
        C32444a aVar = C32444a.f86121a;
        C35464c<Integer> cVar = C32444a.f86127b1;
        if (cVar.mo60266n().intValue() > 0) {
            valueOf2 = cVar.mo60266n();
            Log.m105924i("Finder.ActivityRouter", "debug enterFinderLivePrepareUI maxUserCount " + valueOf2);
        }
        C64383g31 g312 = new C64383g31();
        g312.f183271d = cj03 != null ? cj03.f131764q : 0;
        g312.f183272e = cj03 != null ? cj03.f131765r : 0;
        int i = cj03 != null ? cj03.f131773z : 0;
        LiveConfig.C55204b bVar = new LiveConfig.C55204b();
        bVar.f157091a = 0;
        String str = "Finder.ActivityRouter";
        bVar.f157093c = c212.f182392d;
        bVar.f157096f = C66785b.f191882e.mo90662O5();
        LiveConfig a = bVar.mo76374a();
        StringBuilder sb = new StringBuilder();
        sb.append("enterFinderLiveAnchorUI ");
        sb.append(a.mo76369b());
        sb.append(", bgMusicInfo:");
        sb.append(C61937h.m72709h(zv02 == null ? "" : zv02));
        sb.append("prepareResp:");
        sb.append(cj03);
        sb.append(" tagInfoList:");
        sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
        Log.m105924i(str, sb.toString());
        C54738b1 b1Var = new C54738b1();
        b1Var.f153423l.add(a);
        b1Var.f153412a = d512;
        b1Var.f153413b = t212;
        b1Var.f153424m = c212.f182356B;
        b1Var.f153414c = linkedList;
        b1Var.f153415d = y912;
        b1Var.f153416e = linkedList2;
        b1Var.f153417f = valueOf != null ? valueOf.intValue() : 0;
        Integer num = valueOf2;
        b1Var.f153418g = num != null ? num.intValue() : 0;
        b1Var.f153419h = g312.toByteArray();
        ((C60606n) C86312j.m106911c(C60606n.class)).fs0(c212.f182392d);
        Intent intent2 = intent == null ? new Intent() : intent;
        intent2.putExtra("KEY_PARAMS_BG_MUSIC_ID_LIST", zv02 != null ? zv02.toByteArray() : null);
        intent2.putExtra("KEY_PARAMS_SOURCE_TYPE", c212.f182405s);
        intent2.putExtra("KEY_PARAMS_RANDOM_MIC_MATCH_TIMEOUT", i);
        intent2.putExtra("KEY_PARAMS_FANS_CLUB", (cj03 == null || (ly02 = cj03.f131738A) == null) ? null : ly02.toByteArray());
        intent2.putExtra("KEY_PARAMS_LIVE_CO_CERT_REWARD_INFO", (cj03 == null || (oh02 = cj03.f131739B) == null) ? null : oh02.toByteArray());
        intent2.putExtra("KEY_PARAMS_LIVE_IS_FROM_SCAN", z);
        if ((cj03 != null ? cj03.f131752P : null) != null) {
            C48814b61 b612 = cj03.f131752P;
            intent2.putExtra("KEY_PARAMS_ANCHOR_MINI_APP", b612 != null ? b612.toByteArray() : null);
        } else {
            if ((cj03 != null ? cj03.f131744G : null) != null) {
                C48814b61 b613 = new C48814b61();
                b613.f130979d = cj03.f131744G;
                C13598b0 b0Var = C13598b0.f38549a;
                intent2.putExtra("KEY_PARAMS_ANCHOR_MINI_APP", b613.toByteArray());
            }
        }
        intent2.putExtra("KEY_PARAMS_ANCHOR_OP_MINI_APP", (cj03 == null || (finderJumpInfo = cj03.f131750M) == null) ? null : finderJumpInfo.toByteArray());
        Ox0(context, b1Var, "", intent2);
    }

    public void Mx0(Context context, Intent intent, int i, List<? extends C51270sn1> list) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(list, "topicList");
        if (intent == null) {
            intent = new Intent();
        }
        ArrayList arrayList = new ArrayList(list.size());
        intent.setClass(context, FinderInteractionSearchUI.class);
        for (C51270sn1 finderParcelTopicInfo : list) {
            arrayList.add(new FinderParcelTopicInfo(finderParcelTopicInfo));
        }
        intent.putExtra("KEY_TOPIC_LIST", arrayList);
        intent.putExtra("KEY_SCENE", i);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderInteractionSearchUI", "(Landroid/content/Context;Landroid/content/Intent;ILjava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderInteractionSearchUI", "(Landroid/content/Context;Landroid/content/Intent;ILjava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Nx0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderLikedFeedUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLikedFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLikedFeedUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: OD */
    public void mo13265OD(Activity activity, Intent intent, int i) {
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(activity, (Class) ((C36570n) C35640b.f95291h).getValue());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLivePrecheckLicenseUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void Or0(Context context, String str, C49765hx0 hx02, int i, C32224a<C13598b0> aVar) {
        String str2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "fromUsername");
        C87412m.m108594g(hx02, "toUser");
        if (hx02.f134929q) {
            C76912y0.makeText(context, (int) C0966R.string.ebr, 0).show();
            return;
        }
        FinderContact finderContact = hx02.f134919d;
        if (finderContact == null || (str2 = finderContact.username) == null) {
            str2 = "";
        }
        String str3 = str2;
        Log.m105924i("Finder.ActivityRouter", "[enterChattingUIFromLive] fromUsername=" + str + " toUsername=" + str3 + " scene=" + i);
        C89349b bVar = C60796c2.f173165s;
        C60796c2.f173165s = hx02.f134928p;
        ((C60179k4) C86312j.m106911c(C60179k4.class)).A50(context, i, str3, 3, new C58686c(str3, context, aVar, str));
    }

    public final void Ox0(Context context, C54738b1 b1Var, String str, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(b1Var, "config");
        C87412m.m108594g(str, "contextId");
        Log.m105924i("Finder.ActivityRouter", "[enterFinderLiveAnchorUI] " + b1Var);
        C7335d c = C86312j.m106911c(C13887q1.class);
        C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
        ((C13887q1) c).mo13323QM(context, b1Var, str, "", intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Px0(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "userName"
            gy3.C87412m.m108594g(r6, r0)
            zc1.b r0 = zc1.C66785b.f191882e
            bd1.h r6 = r0.mo90663P2(r6)
            r0 = 0
            if (r6 == 0) goto L_0x0043
            int r1 = r6.f818a
            r2 = 1
            if (r1 != r2) goto L_0x0043
            java.lang.String r1 = r6.f819b
            if (r1 == 0) goto L_0x002a
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0025
            r1 = 1
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            if (r1 != r2) goto L_0x002a
            r1 = 1
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            if (r1 == 0) goto L_0x0043
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r6 = r6.f819b
            java.lang.String r1 = "rawUrl"
            r0.putExtra(r1, r6)
            r6 = 0
            java.lang.String r1 = "webview"
            java.lang.String r3 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r5, r1, r3, r0, r6)
            r0 = 1
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58684b.Px0(android.content.Context, java.lang.String):boolean");
    }

    public void Rd0(C7777a0 a0Var, String str, String str2, int i, float f, int i2, boolean z) {
        C87412m.m108594g(a0Var, "helper");
        String str3 = str;
        C87412m.m108594g(str, "inputPath");
        String str4 = str2;
        C87412m.m108594g(str2, "outputPath");
        RecordConfigProvider b = RecordConfigProvider.m119432b(str, str2);
        b.f272905F = 11;
        Bundle bundle = new Bundle();
        float f2 = f;
        bundle.putFloat("crop_fix_ratio", f);
        bundle.putInt("button_custom_color", i2);
        bundle.putBoolean("can_show_preview", z);
        b.f272912M = bundle;
        b.mo129804a(1, ((C61381b) C86312j.m106911c(C61381b.class)).pa0().mo12422c());
        CaptureDataManager.f272890c.f272891a = null;
        C8532a.f27585a.mo9446e(a0Var.f26272a, i, C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em, b, 1, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004c, code lost:
        if (r0 != 3) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Ro0(android.content.Context r9, java.lang.String r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "username"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[startChattingUI] username="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = " scene="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.ActivityRouter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            zc1.b r0 = zc1.C66785b.f191882e
            bd1.e r1 = r0.mo90673n0()
            int r6 = r1.f131584h
            java.lang.Class<ht1.k4> r1 = ht1.C60179k4.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r2 = r1
            ht1.k4 r2 = (ht1.C60179k4) r2
            er1.w3 r1 = er1.C58784w3.f168295a
            r1.getClass()
            bd1.e r0 = r0.mo90673n0()
            int r0 = r0.f131584h
            r1 = 3
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L_0x0051
            if (r0 == r3) goto L_0x004f
            if (r0 == r1) goto L_0x0052
            goto L_0x0051
        L_0x004f:
            r4 = 3
            goto L_0x0052
        L_0x0051:
            r4 = 2
        L_0x0052:
            er1.b$e r7 = new er1.b$e
            r7.<init>(r10, r9, r11)
            r3 = r9
            r5 = r10
            r2.mo78776zG(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58684b.Ro0(android.content.Context, java.lang.String, int):void");
    }

    public final void Rx0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        C11767a aVar = C11767a.f34453a;
        Activity activity = null;
        if (aVar.mo11660b("search") != 0) {
            C76879j.m92754y(context, aVar.mo11661c("search"), "", context.getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
            return;
        }
        C117407d.INSTANCE.idkeyStat(1265, 0, 1, false);
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(context, FinderMixSearchUI.class);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderMixSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderMixSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        if (activity != null) {
            activity.overridePendingTransition(0, 0);
        }
    }

    public final void Sx0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderMsgFeedDetailUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderMsgFeedDetailUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderMsgFeedDetailUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: T8 */
    public void mo13269T8(Activity activity, int i, String str, String str2, float f, int i2, boolean z) {
        Activity activity2 = activity;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        String str3 = str;
        C87412m.m108594g(str, "inputPath");
        String str4 = str2;
        C87412m.m108594g(str2, "outputPath");
        RecordConfigProvider b = RecordConfigProvider.m119432b(str, str2);
        Bundle bundle = new Bundle();
        float f2 = f;
        bundle.putFloat("crop_fix_ratio", f);
        int i3 = i2;
        bundle.putInt("button_custom_color", i2);
        bundle.putBoolean("can_show_preview", z);
        b.f272912M = bundle;
        b.f272937y = true;
        b.f272938z = false;
        b.mo129804a(1, ((C61381b) C86312j.m106911c(C61381b.class)).pa0().mo12422c());
        VideoCaptureReportInfo videoCaptureReportInfo = new VideoCaptureReportInfo();
        videoCaptureReportInfo.f272940d = 17;
        b.f272908I = videoCaptureReportInfo;
        b.f272905F = 11;
        UICustomParam uICustomParam = new UICustomParam();
        ((HashMap) uICustomParam.f266575h).put("plugin_filter", Boolean.TRUE);
        ((HashMap) uICustomParam.f266575h).put("plugin_poi", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_tip", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_menu", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_music", true);
        b.f272927o = uICustomParam;
        C8532a.f27585a.mo9446e(activity, i, C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em, b, 1, 1);
    }

    public final void Tx0(Context context, Intent intent) {
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        Intent intent2 = intent == null ? new Intent() : intent;
        Intent intent3 = !(context2 instanceof Activity) ? intent2 : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        intent2.addFlags(67108864);
        intent2.setClass(context2, FinderFinderMsgUI.class);
        ArrayList<int[]> arrayList = FinderFinderMsgUI.f161048o;
        int[] iArr = FinderFinderMsgUI.f161049p;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            int i4 = i2 + 1;
            C11548q.C11553c cVar = C11548q.f33884r;
            int[] iArr2 = FinderFinderMsgUI.f161048o.get(i2);
            C87412m.m108593f(iArr2, "msgTypes[index]");
            C11548q.C11553c.m11370a(cVar, new FinderMessageCgiSource(1, i3, iArr2, (String) null, 8, (C8480h) null), (C0000n0) null, (C0125s) null, 6, (Object) null);
            i++;
            i2 = i4;
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent2);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderNotifyMsgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderNotifyMsgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: U5 */
    public void mo13270U5(Context context, String str, String str2, int i, String str3) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "enterPath");
        C87412m.m108594g(str3, "sceneNote");
        Log.m105924i("Finder.ActivityRouter", "enter we app appId:" + str + ",enterPath:" + str2 + ",scene:" + i + ",sceneNote:" + str3);
        if (!Util.isNullOrNil(str)) {
            C86299o oVar = new C86299o();
            oVar.f250930b = str;
            oVar.f250934f = str2;
            oVar.f250939k = i;
            oVar.f250940l = str3;
            oVar.f250931c = ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13313J();
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0041, code lost:
        r5 = r5.getLiveInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Uq0(android.content.Intent r3, android.content.Context r4, long r5, long r7, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "nonceId"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "contextId"
            gy3.C87412m.m108594g(r11, r0)
            com.tencent.mm.live.api.LiveConfig$b r0 = new com.tencent.mm.live.api.LiveConfig$b
            r0.<init>()
            r1 = 0
            r0.f157091a = r1
            r0.f157093c = r7
            r0.f157106p = r9
            r0.f157101k = r5
            zc1.b r9 = zc1.C66785b.f191882e
            java.lang.String r9 = r9.mo90662O5()
            r0.f157096f = r9
            r0.f157102l = r10
            r0.f157113w = r13
            r0.f157112v = r12
            com.tencent.mm.live.api.LiveConfig r9 = r0.mo76374a()
            cj1.b1 r10 = new cj1.b1
            r10.<init>()
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r12 = r10.f153423l
            r12.add(r9)
            vp1.e r9 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r9.mo89871e(r5)
            if (r5 == 0) goto L_0x004a
            te3.c21 r5 = r5.getLiveInfo()
            if (r5 == 0) goto L_0x004a
            int r5 = r5.f182356B
            goto L_0x004b
        L_0x004a:
            r5 = -1
        L_0x004b:
            r10.f153424m = r5
            java.lang.Class<ir.n> r5 = p565ir.C60606n.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ir.n r5 = (p565ir.C60606n) r5
            r5.fs0(r7)
            r2.Ox0(r4, r10, r11, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58684b.Uq0(android.content.Intent, android.content.Context, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: V1 */
    public void mo13272V1(Context context, Intent intent) {
        Context context2;
        Intent intent2;
        Class cls = C10432i.class;
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        C58784w3.m68435a(C58784w3.f168295a, intent, 0, (String) null, 6, (Object) null);
        C10432i iVar = (C10432i) C86312j.m106911c(cls);
        boolean e = iVar != null ? iVar.mo10750e() : false;
        boolean booleanExtra = intent.getBooleanExtra("KEY_FROM_TIMELINE", false);
        if (!e || booleanExtra) {
            String stringExtra = intent.getStringExtra("finder_username");
            boolean z = context instanceof Activity;
            if (z || (context2 = ((C60204t3) C86312j.m106911c(C60204t3.class)).ub0()) == null) {
                context2 = context;
            }
            C66785b bVar = C66785b.f191882e;
            String str = "";
            C0264h P2 = bVar.mo90663P2(stringExtra == null ? str : stringExtra);
            if (P2 != null && P2.f818a == 1) {
                if (stringExtra != null) {
                    str = stringExtra;
                }
                if (Px0(context2, str)) {
                    return;
                }
            }
            C58679a1.f167972a.mo83554a(context2, intent, C87412m.m108589b(bVar.mo90662O5(), stringExtra) ? 33 : 32, intent.getIntExtra("key_entrance_type", -1));
            Activity activity = null;
            Intent intent3 = !(context2 instanceof Activity) ? intent : null;
            if (intent3 != null) {
                intent3.addFlags(268435456);
            }
            intent.setClass(context2, FinderProfileUI.class);
            if (z) {
                activity = (Activity) context;
            }
            if ((activity == null || (intent2 = activity.getIntent()) == null || !intent2.getBooleanExtra("KEY_IS_FROM_FINDER_TASK", false)) ? false : true) {
                intent.putExtra("KEY_IS_FROM_FINDER_TASK", true);
            }
            int intExtra = intent.getIntExtra("key_enter_profile_type", 0);
            if (intExtra == 1 || intExtra == 2 || intExtra == 5 || intExtra == 6 || intExtra == 7 || intExtra == 10) {
                C117361f.INSTANCE.mo182041q(540999704);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderProfileUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderProfileUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        ((C10432i) C86312j.m106911c(cls)).mo10755m4(context);
    }

    public final void Vx0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        ((C61381b) C86312j.m106911c(C61381b.class)).Yp0().mo88189a(context, intent);
    }

    public void Wb0(Context context, long j, JSONObject jSONObject) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(jSONObject, "necessaryParams");
        C62262d0.f176978a.mo87323o(context, j, jSONObject, 0);
    }

    public final void Xx0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (C58784w3.f168295a.mo83915a1()) {
            ((C15907f) C86312j.m106911c(C15907f.class)).K00(context, 34359738368L, (CheckBoxPreference) null, new C58693g(this, context, intent), 3);
            return;
        }
        yy0(context, intent);
    }

    /* renamed from: YX */
    public void mo13274YX(Activity activity, Intent intent, int i) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (intent == null) {
            intent = new Intent();
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(activity, (Class) ((C36570n) C35640b.f95280K).getValue());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveShoppingManagerUIForResult", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        activity.overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
    }

    public final void Yx0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setClass(context, FinderSelfUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderSelfUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderSelfUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: Z3 */
    public void mo13275Z3(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.ActivityRouter", "enterFinderGameLiveAuthUI");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95270A).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGameLiveAuthUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGameLiveAuthUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: ZK */
    public void mo13276ZK(Context context, String str, String str2, String str3, long j, long j2) {
        long j3 = j2;
        C87412m.m108594g(context, "context");
        Intent intent = new Intent();
        boolean z = context instanceof Activity;
        intent.addFlags(268435456);
        String str4 = "";
        intent.putExtra("key_anchor_finder_username", str == null ? str4 : str);
        intent.putExtra("key_anchor_finder_nickname", str2 == null ? str4 : str2);
        if (str3 != null) {
            str4 = str3;
        }
        intent.putExtra("key_anchor_finder_avatar", str4);
        intent.putExtra("key_anchor_finder_object_id", j);
        intent.putExtra("key_anchor_finder_live_id", j3);
        ((C60606n) C86312j.m106911c(C60606n.class)).fs0(j3);
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95303t).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveInvitedUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveInvitedUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Zx0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        long longExtra = intent.getLongExtra("KEY_INTENT_ENTER_ITEM_ID", 0);
        if (C65834e.f189316a.mo89871e(longExtra) != null) {
            C37521f.f99374d.getClass();
            if (C37521f.f99300U3.mo60266n().intValue() > 0) {
                intent.putExtra("intent_feed_id", longExtra);
                Lx0(context, intent);
                return;
            }
        }
        C58784w3.m68435a(C58784w3.f168295a, intent, 0, (String) null, 6, (Object) null);
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderShareFeedRelUI.class);
        C20480e0.f57583a.mo32031d();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderShareFeedDetailUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderShareFeedDetailUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void ay0(Context context, Intent intent, int i, boolean z) {
        boolean z2;
        Context context2 = context;
        int i2 = i;
        Class cls = C60204t3.class;
        C87412m.m108594g(context2, "context");
        Intent intent2 = intent == null ? new Intent() : intent;
        boolean z3 = context2 instanceof Activity;
        Intent intent3 = !z3 ? intent2 : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        intent2.putExtra("FROM_SCENE_KEY", i2);
        intent2.addFlags(67108864);
        intent2.addFlags(536870912);
        C58784w3.m68435a(C58784w3.f168295a, intent2, 0, (String) null, 6, (Object) null);
        C37521f fVar = C37521f.f99374d;
        boolean n = fVar.mo61188n();
        C60204t3 t3Var = (C60204t3) C86312j.m106911c(cls);
        if (n) {
            z2 = (z3 && t3Var.iu0((Activity) context2)) || t3Var.Kv0(context2);
            if (!z2 && z) {
                String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                String str = "";
                if (Wb == null) {
                    Wb = str;
                }
                String stringExtra = intent2.getStringExtra("key_context_id");
                if (stringExtra != null) {
                    str = stringExtra;
                }
                boolean fe02 = ((C60204t3) C86312j.m106911c(cls)).fe0();
                FinderVstStruct finderVstStruct = new FinderVstStruct();
                finderVstStruct.f156256d = finderVstStruct.mo86045b("sessionid", Wb, true);
                finderVstStruct.f156257e = finderVstStruct.mo86045b("contextid", str, true);
                finderVstStruct.f156258f = finderVstStruct.mo86045b("event_id", "1", true);
                finderVstStruct.f156259g = C31543z5.m39453c();
                finderVstStruct.f156260h = finderVstStruct.mo86045b("vst_type", "1", true);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("has_multi_task_window", fe02 ? 1 : 0);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …e 0)\n        }.toString()");
                finderVstStruct.f156262j = finderVstStruct.mo86045b("udf_kv", C112551y.m153814n(jSONObject2, ",", ";", false), true);
                finderVstStruct.mo86054n();
                ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderVstStruct);
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(IFinderMultiTaskService::class.java)");
                C60204t3.C8805a.m8622a((C60204t3) c, false, 1, (Object) null);
            }
        } else {
            z2 = false;
        }
        Log.m105924i("Finder.ActivityRouter", "enterFinderTimelineUI: isEnterFinderTask = " + z2 + ", fromUI = " + context.getClass().getName() + ", scene = " + i2);
        intent2.setClass(context2, fVar.mo61188n() ? FinderHomeAffinityUI.class : FinderHomeUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent2);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void b30(Activity activity, Intent intent, int i) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (intent == null) {
            intent = new Intent();
        }
        intent.addFlags(67108864);
        intent.setClass(activity, FinderCreateContactUI.class);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderCreateContactUIForResult", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: c0 */
    public final void mo83582c0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
        ((C61381b) C86312j.m106911c(C61381b.class)).Yp0().mo88192c0(context, intent);
    }

    /* renamed from: cd */
    public void mo13278cd(AppCompatActivity appCompatActivity, BaseFinderFeed baseFinderFeed, Bundle bundle, int i, int i2) {
        C87412m.m108594g(appCompatActivity, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        C7888v2.f26513a.mo9022v(appCompatActivity, baseFinderFeed, bundle, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: ch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13279ch(android.content.Context r6, android.content.Intent r7, int r8, java.lang.String r9) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r6, r0)
            if (r7 != 0) goto L_0x000c
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
        L_0x000c:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MY_FINDER_LIVE_TASK_GUIDE_FLAG_BOOLEAN_SYNC
            r2 = 0
            boolean r0 = r0.mo119686g(r1, r2)
            r3 = 1
            r0 = r0 ^ r3
            if (r9 == 0) goto L_0x002c
            int r4 = r9.length()
            if (r4 <= 0) goto L_0x0027
            r4 = 1
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            if (r4 != r3) goto L_0x002c
            r4 = 1
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            if (r4 == 0) goto L_0x0030
            goto L_0x0037
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            java.lang.String r9 = "https://channels.weixin.qq.com/mobile-support/pages/anchor-tasks/whatsnew"
            goto L_0x0037
        L_0x0035:
            java.lang.String r9 = "https://channels.weixin.qq.com/mobile-support/pages/anchor-tasks/tasks"
        L_0x0037:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            android.net.Uri$Builder r9 = r9.buildUpon()
            java.lang.String r4 = "parse(urlStr).buildUpon()"
            gy3.C87412m.m108593f(r9, r4)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r4 = "SourceScene"
            r9.appendQueryParameter(r4, r8)
            android.net.Uri r8 = r9.build()
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "builder.build().toString()"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.String r9 = "showShare"
            r7.putExtra(r9, r2)
            java.lang.String r9 = "KRightBtn"
            r7.putExtra(r9, r3)
            java.lang.String r9 = "rawUrl"
            r7.putExtra(r9, r8)
            r8 = 0
            java.lang.String r9 = "webview"
            java.lang.String r2 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r6, r9, r2, r7, r8)
            if (r0 == 0) goto L_0x0082
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.mo119677K(r1, r7)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58684b.mo13279ch(android.content.Context, android.content.Intent, int, java.lang.String):void");
    }

    public final void dk0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            ((C10432i) C86312j.m106911c(C10432i.class)).mo10755m4(context);
            Log.m105928w("Finder.ActivityRouter", "青少年模式只看关注时，禁止进入专辑.");
            return;
        }
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderAlbumTimelineUI.class);
        C13442s8.f38060Q0.mo12871c(context, intent);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterAlbumRelatedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterAlbumRelatedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void dy0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        C13442s8.f38060Q0.mo12871c(context, intent);
        intent.setClass(context, FinderWxMsgUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderWxMsgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderWxMsgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: eM */
    public void mo13280eM(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.ActivityRouter", "enterFinderLiveChargeAnchorIncomeUI");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95307x).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveChargeAnchorIncomeUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveChargeAnchorIncomeUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void ey0(Context context, Intent intent, boolean z) {
        C87412m.m108594g(context, "context");
        if (C58784w3.f168295a.mo83915a1()) {
            ((C15907f) C86312j.m106911c(C15907f.class)).K00(context, 34359738368L, (CheckBoxPreference) null, new C58694h(this, context, intent, z), 3);
            return;
        }
        zy0(context, intent, z);
    }

    public final void fy0(String str, Context context) {
        C87412m.m108594g(context, "context");
        Intent intent = new Intent();
        if (str == null) {
            str = "";
        }
        intent.putExtra("Contact_User", str);
        C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
    }

    public final void gy0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderFriendLikeTimelineUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFriendLikeTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFriendLikeTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: h6 */
    public void mo13281h6(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.ActivityRouter", "enterFinderGameLivePostUI");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95272C).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGameLivePostUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGameLivePostUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void hy0(Activity activity, Intent intent, int i) {
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(activity, FinderGalleryTimelineUI.class);
        C13442s8.f38060Q0.mo12871c(activity, intent);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterGalleryTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void iy0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderModifyNameUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterModifyNameUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterModifyNameUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void jy0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (((C60200t1) C86312j.m106911c(C60200t1.class)).mo76822Vm()) {
            if (intent == null) {
                intent = new Intent();
            }
            Intent intent2 = !(context instanceof Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            Class<MusicMvMainUI> cls = MusicMvMainUI.class;
            try {
                int i = MusicMvMainUI.f163017h;
                intent.setClass(context, cls);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterMusicMvMainUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterMusicMvMainUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (ClassNotFoundException e) {
                Log.m105920e("Finder.ActivityRouter", "enterMusicMvMainUI : " + e);
            }
        }
    }

    /* renamed from: k4 */
    public void mo13282k4(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95283N).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveGiftPkgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveGiftPkgUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: k9 */
    public void mo13283k9(Activity activity, Intent intent, int i, C49567gj0 gj02, Integer num) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(gj02, "info");
        if (intent == null) {
            intent = new Intent();
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(activity, (Class) ((C36570n) C35640b.f95282M).getValue());
        intent.putExtra("INTENT_KEY_ERROR_PAGE_INFO", gj02.toByteArray());
        intent.putExtra("INTENT_KEY_ERROR_PAGE_TYPE", num);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLivePostSecurityUI", "(Landroid/app/Activity;Landroid/content/Intent;ILcom/tencent/mm/protocal/protobuf/FinderCreateLiveWarnPageCommon;Ljava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: kI */
    public void mo13284kI(Activity activity, int i, String str, String str2, float f, int i2) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "inputPath");
        C87412m.m108594g(str2, "outputPath");
        RecordConfigProvider b = RecordConfigProvider.m119432b(str, str2);
        Bundle bundle = new Bundle();
        bundle.putFloat("crop_fix_ratio", f);
        bundle.putInt("button_custom_color", i2);
        b.f272912M = bundle;
        b.f272937y = true;
        b.f272938z = false;
        b.mo129804a(1, ((C61381b) C86312j.m106911c(C61381b.class)).pa0().mo12423d());
        VideoCaptureReportInfo videoCaptureReportInfo = new VideoCaptureReportInfo();
        videoCaptureReportInfo.f272940d = 17;
        b.f272908I = videoCaptureReportInfo;
        b.f272905F = 11;
        UICustomParam uICustomParam = new UICustomParam();
        ((HashMap) uICustomParam.f266575h).put("plugin_filter", Boolean.TRUE);
        ((HashMap) uICustomParam.f266575h).put("plugin_poi", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_tip", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_menu", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_music", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_photo_crop", true);
        b.f272927o = uICustomParam;
        C8532a.f27585a.mo9446e(activity, i, C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em, b, 1, 1);
    }

    public final void ky0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        Class<MusicMvRouterUI> cls = MusicMvRouterUI.class;
        try {
            int i = MusicMvRouterUI.f272340g;
            intent.putExtra("KEY_MUSIC_ROUTER", 3);
            intent.setClass(context, cls);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterMusicMvMakerUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterMusicMvMakerUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (ClassNotFoundException e) {
            Log.m105920e("Finder.ActivityRouter", "enterMusicMvMakerUI : " + e);
        }
    }

    public final void my0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setClass(context, FinderPoiManageUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterPoiManageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterPoiManageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: ny */
    public void mo13285ny(Activity activity, Intent intent, int i) {
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(activity, (Class) ((C36570n) C35640b.f95293j).getValue());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveCreateVisitorRoleUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void ny0(Activity activity, Intent intent, int i) {
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        intent.addFlags(67108864);
        intent.setClass(activity, FinderPoiRelateListUI.class);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterPoiRelativeList", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void oy0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(context, FinderPoiTimelineUI.class);
        C13442s8.f38060Q0.mo12871c(context, intent);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterPoiTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterPoiTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void py0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        ((C61381b) C86312j.m106911c(C61381b.class)).Yp0().mo88203n(context, intent);
    }

    public final void qy0(Activity activity, String str) {
        C87412m.m108594g(activity, "context");
        if (!Util.isNullOrNil(str) || (activity instanceof FinderHomeUI) || (activity instanceof FinderTimelineUI) || (activity instanceof FinderSelfUI)) {
            Ay0(activity, str);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(activity, FinderRealnameVerifyRouteUI.class);
        intent.putExtra("enterRealnameVerifyUI", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterRealnameVerifyUI", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterRealnameVerifyUI", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void ry0(Context context, Intent intent, int i) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(context, FinderRelatedTimelineUI.class);
        if (context instanceof Activity) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            aVar.mo10233c(intent);
            C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterRelatedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        intent.addFlags(268435456);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterRelatedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterRelatedTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: s3 */
    public void mo13286s3(Activity activity, Intent intent) {
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(activity, (Class) ((C36570n) C35640b.f95281L).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLotteryAudienceUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLotteryAudienceUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void sy0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClassName(context, "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterSnsAlbumPickerUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterSnsAlbumPickerUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void tb0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.ActivityRouter", "enterFinderGameSelectUI");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95275F).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGameSelectUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGameSelectUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: tj */
    public void mo13288tj(Context context, Intent intent, int i) {
        C87412m.m108594g(context, "context");
        if (context instanceof MMActivity) {
            if (intent == null) {
                intent = new Intent();
            }
            C35640b bVar = C35640b.f95284a;
            intent.setClass(context, (Class) ((C36570n) C35640b.f95276G).getValue());
            ((MMActivity) context).startActivityForResult(intent, i);
        }
    }

    /* renamed from: tu */
    public void mo13289tu(Activity activity, Intent intent, FinderContact finderContact, int i, boolean z, C50019jp1 jp12) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderContact, "contact");
        StringBuilder sb = new StringBuilder();
        sb.append("#enterFinderLiveNoticeUI coupon.appUrl=");
        sb.append(jp12 != null ? jp12.f136238e : null);
        Log.m105924i("Finder.ActivityRouter", sb.toString());
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_CONTACT", finderContact.toByteArray());
        if (jp12 != null) {
            intent.putExtra("KEY_FINDER_LIVE_COUPON", jp12.toByteArray());
        }
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_CAN_CREATE", z);
        C35640b bVar = C35640b.f95284a;
        intent.setClass(activity, (Class) ((C36570n) C35640b.f95278I).getValue());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveNoticeUI", "(Landroid/app/Activity;Landroid/content/Intent;Lcom/tencent/mm/protocal/protobuf/FinderContact;IZLcom/tencent/mm/protocal/protobuf/FinderWxAppInfo;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        activity.overridePendingTransition(C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2333y);
    }

    public void ty0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderTopicTimelineUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterTopicTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterTopicTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void uy0(Context context) {
        C87412m.m108594g(context, "context");
        Intent intent = new Intent(context, FinderUnOpenUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterUnOpenUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterUnOpenUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: v1 */
    public void mo13290v1(Activity activity, Intent intent) {
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(activity, (Class) ((C36570n) C35640b.f95304u).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLotteryWinnerListUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLotteryWinnerListUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void vx0(Context context, Intent intent, boolean z) {
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        if (!xy0(context, intent)) {
            Intent intent2 = intent == null ? new Intent() : intent;
            if (!z) {
                intent2.putExtra("key_to_comment_scene", 59);
                C13442s8.f38060Q0.mo12871c(context2, intent2);
            }
            Intent intent3 = !(context2 instanceof Activity) ? intent2 : null;
            if (intent3 != null) {
                intent3.addFlags(268435456);
            }
            intent2.setClass(context2, FinderActivityProfileUI.class);
            FinderActivityProfileUI.C2299a aVar = FinderActivityProfileUI.f12447q;
            long longExtra = intent2.getLongExtra("key_activity_id", 0);
            String stringExtra = intent2.getStringExtra("key_encrypted_topic_id");
            String str = stringExtra == null ? "" : stringExtra;
            long longExtra2 = intent2.getLongExtra("key_feed_ref_id", 0);
            String stringExtra2 = intent2.getStringExtra("key_by_pass_info");
            String a = aVar.mo2198a(longExtra, str, 1);
            String a2 = aVar.mo2198a(longExtra, str, 2);
            long j = longExtra;
            String str2 = str;
            String str3 = stringExtra2;
            C13652a aVar2 = new C13652a(7, j, Long.valueOf(longExtra2), str, 1, (C89349b) null, (C49712hj1) null, str3, a);
            C13652a aVar3 = new C13652a(7, j, Long.valueOf(longExtra2), str, 2, (C89349b) null, (C49712hj1) null, str3, a2);
            C11548q.C11553c cVar = C11548q.f33884r;
            C11548q.C11553c.m11370a(cVar, aVar2, (C0000n0) null, (C0125s) null, 6, (Object) null);
            C11548q.C11553c.m11370a(cVar, aVar3, (C0000n0) null, (C0125s) null, 6, (Object) null);
            long longExtra3 = intent2.getLongExtra("key_activity_id", 0);
            String stringExtra3 = intent2.getStringExtra("key_encrypted_topic_id");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            C39622i0 a3 = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11528h0.class);
            C87412m.m108593f(a3, "UICProvider.of(FinderCom…reloadLoader::class.java)");
            C53895h.m60466d(((C11528h0) a3).getLifecycleScope(), (C66212f) null, (C53934p0) null, new C2300a(longExtra3, stringExtra3, (C15601d<? super C2300a>) null), 3, (Object) null);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(intent2);
            C117292a.m165358d(context, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterActivityProfileUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar4.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterActivityProfileUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: vy */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13291vy(android.content.Context r12, android.content.Intent r13, te3.m74 r14, int r15) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "i"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "location"
            gy3.C87412m.m108594g(r14, r0)
            boolean r0 = r11.xy0(r12, r13)
            if (r0 == 0) goto L_0x0016
            return
        L_0x0016:
            boolean r0 = r12 instanceof android.app.Activity
            r1 = 0
            if (r0 != 0) goto L_0x001d
            r2 = r13
            goto L_0x001e
        L_0x001d:
            r2 = r1
        L_0x001e:
            if (r2 == 0) goto L_0x0025
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r3)
        L_0x0025:
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r13.addFlags(r2)
            r2 = -1
            java.lang.String r3 = "key_entrance_type"
            int r2 = r13.getIntExtra(r3, r2)
            java.lang.String r3 = "key_from_type"
            java.io.Serializable r3 = r13.getSerializableExtra(r3)
            boolean r4 = r3 instanceof ht1.C98522w3.C8810a
            if (r4 == 0) goto L_0x003e
            r1 = r3
            ht1.w3$a r1 = (ht1.C98522w3.C8810a) r1
        L_0x003e:
            ht1.w3$a r3 = ht1.C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS
            if (r1 != r3) goto L_0x0045
            r1 = 81
            goto L_0x0047
        L_0x0045:
            r1 = 26
        L_0x0047:
            r3 = 1
            r14.f184235w = r3
            er1.a1 r3 = er1.C58679a1.f167972a
            r3.mo83554a(r12, r13, r1, r2)
            er1.w3 r4 = er1.C58784w3.f168295a
            r9 = 1
            r10 = 15
            r5 = r12
            r6 = r13
            r7 = r15
            r8 = r14
            r4.mo83926e1(r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x0068
            android.app.Activity r12 = (android.app.Activity) r12
            r13 = 2130772171(0x7f0100cb, float:1.7147453E38)
            r14 = 2130771992(0x7f010018, float:1.714709E38)
            r12.overridePendingTransition(r13, r14)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58684b.mo13291vy(android.content.Context, android.content.Intent, te3.m74, int):void");
    }

    public final void vy0(Context context, String str, String str2, int i, String str3, Boolean bool) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appName");
        C87412m.m108594g(str2, "enterPath");
        C87412m.m108594g(str3, "sceneNote");
        Log.m105924i("Finder.ActivityRouter", "enter we app appId:" + str + ",enterPath:" + str2 + ",scene:" + i + ",sceneNote:" + str3);
        if (!Util.isNullOrNil(str)) {
            C86299o oVar = new C86299o();
            oVar.f250929a = str;
            oVar.f250934f = str2;
            oVar.f250939k = i;
            oVar.f250940l = str3;
            if (C87412m.m108589b(bool, Boolean.TRUE)) {
                oVar.f250931c = 2;
            }
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
        }
    }

    public void ww0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.ActivityRouter", "enterFinderGameLiveFinishUI");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95271B).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGameLiveFinishUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderGameLiveFinishUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void wx0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderAtTimelineUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterAtTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterAtTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        y0Var.getClass();
        FinderEnterMentionListStruct finderEnterMentionListStruct = new FinderEnterMentionListStruct();
        long c = C31543z5.m39453c();
        finderEnterMentionListStruct.f155179d = c;
        finderEnterMentionListStruct.mo86048e("EnterTimeStampMs", c);
        finderEnterMentionListStruct.f155180e = finderEnterMentionListStruct.mo86045b("FinerUsername", C66785b.f191882e.mo90662O5(), true);
        finderEnterMentionListStruct.f155181f = finderEnterMentionListStruct.mo86045b("SessionId", ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb(), true);
        finderEnterMentionListStruct.mo86054n();
        y0Var.Ec0(finderEnterMentionListStruct);
    }

    public final void wy0(Intent intent, Intent intent2) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(intent2, "curIntent");
        intent.putExtra("key_finder_post_from", intent2.getIntExtra("key_finder_post_from", -1));
        intent.putExtra("KEY_POST_DIRECTLY_FROM_SNS", intent2.getBooleanExtra("KEY_POST_DIRECTLY_FROM_SNS", false));
        intent.putExtra("key_context_id", intent2.getStringExtra("key_context_id"));
        intent.putExtra("key_jump_id", intent2.getStringExtra("key_jump_id"));
        intent.putExtra("key_click_tab_context_id", intent2.getStringExtra("key_click_tab_id"));
        intent.putExtra("vst_id", intent2.getStringExtra("vst_id"));
        intent.putExtra("post_entry_type", intent2.getIntExtra("post_entry_type", 3));
        intent.putExtra("key_post_has_show_safe_dialog", intent2.getBooleanExtra("key_post_has_show_safe_dialog", false));
        intent.putExtra("CLIENT_KV_REPORTINFO", intent2.getStringExtra("CLIENT_KV_REPORTINFO"));
        boolean booleanExtra = intent2.getBooleanExtra("KEY_POST_WARM_GOODS_SELECT_MEDIA", false);
        intent.putExtra("KEY_POST_WARM_GOODS_SELECT_MEDIA", booleanExtra);
        if (booleanExtra) {
            intent.putExtra("JUMP_INFO", intent2.getByteArrayExtra("JUMP_INFO"));
        }
    }

    /* renamed from: xI */
    public void mo13293xI(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.ActivityRouter", "enterFinderLiveWeCoinHotUI");
        if (intent == null) {
            intent = new Intent();
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95306w).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveWeCoinHotUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveWeCoinHotUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: xt */
    public void mo13294xt(Activity activity, Intent intent, int i, boolean z) {
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("KEY_IS_FROM_SETTING", z);
        C35640b bVar = C35640b.f95284a;
        intent.setClass(activity, (Class) ((C36570n) C35640b.f95300q).getValue());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveVisitorRoleUI", "(Landroid/app/Activity;Landroid/content/Intent;IZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        activity.overridePendingTransition(C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2333y);
    }

    public final void xx0(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str3, "appId");
        C87412m.m108594g(str4, "enterPath");
        C86299o oVar = new C86299o();
        C37521f.f99374d.getClass();
        if (((Boolean) C37521f.f99441k5.mo60266n()).booleanValue()) {
            oVar.f250931c = 2;
        }
        oVar.f250913B = C90973a0.OPAQUE;
        oVar.f250929a = str3;
        oVar.f250934f = Util.nullAs(str4, "");
        oVar.f250939k = 1201;
        HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig = r4;
        HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig2 = new HalfScreenConfig.BackgroundShapeConfig(MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3723cd), true, true, false, false, 24, (C8480h) null);
        float a = (((float) C7865r3.f26468a.mo8968a()) * C7515a.f25777a.mo8637a(context2)) + ((float) C79406f.m96347a(context2, 10.0f));
        FinderWeAppHalfScreenScListener finderWeAppHalfScreenScListener = r2;
        FinderWeAppHalfScreenScListener finderWeAppHalfScreenScListener2 = new FinderWeAppHalfScreenScListener(true, (RecyclerViewDrawerSquares.C45117c) null);
        oVar.f250912A = new HalfScreenConfig(true, (int) a, HalfScreenConfig.C55451a.POPUP, true, backgroundShapeConfig, false, (HalfScreenConfig.CloseWhenClickEmptyAreaConfig) null, HalfScreenConfig.C55453c.HIDE, true, false, finderWeAppHalfScreenScListener, HalfScreenConfig.C55456f.FAKE_NATIVE, false, false, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, 0, 0, false, false, false, (HalfScreenConfig.C55455e) null, false, (HalfScreenConfig.CustomSubjectInfo) null, (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3745cw), false, false, -1, false, false, false, -1812991904, 0, (C8480h) null);
        oVar.f250937i = new C7781a();
        oVar.f250916E = new C58685b();
        C62262d0.f176978a.getClass();
        C62262d0.f176980c = true;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context2, oVar);
    }

    public final boolean xy0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            return false;
        }
        ((C10432i) C86312j.m106911c(C10432i.class)).mo10755m4(context);
        int stringExtra = intent != null ? intent.getStringExtra("key_finder_teen_mode_scene") : null;
        if (stringExtra == null) {
            stringExtra = 5;
        }
        C115669n.INSTANCE.mo160131h(20912, 3, stringExtra, "", "");
        return true;
    }

    /* renamed from: yB */
    public void mo13295yB(Context context, Intent intent, boolean z) {
        Activity ub02;
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        if (z) {
            intent.putExtra("KEY_IS_FROM_SETTING", true);
        }
        if (!(context instanceof Activity) && (ub02 = ((C60204t3) C86312j.m106911c(C60204t3.class)).ub0()) != null) {
            context = ub02;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95301r).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLotteryHistoryUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLotteryHistoryUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void yx0(Activity activity, Intent intent, int i) {
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(activity, BizProfileTimelineUI.class);
        C13442s8.f38060Q0.mo12871c(activity, intent);
        C58784w3.m68435a(C58784w3.f168295a, intent, 0, (String) null, 6, (Object) null);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterBizProfileTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void yy0(Context context, Intent intent) {
        Intent intent2;
        if (intent == null) {
            intent = new Intent();
        }
        C58784w3.m68435a(C58784w3.f168295a, intent, 0, (String) null, 6, (Object) null);
        boolean z = context instanceof Activity;
        Activity activity = null;
        Intent intent3 = !z ? intent : null;
        if (intent3 != null) {
            intent3.addFlags(268435456);
        }
        intent.setClass(context, FinderProfileTimeLineUI.class);
        if (z) {
            activity = (Activity) context;
        }
        if ((activity == null || (intent2 = activity.getIntent()) == null || !intent2.getBooleanExtra("KEY_IS_FROM_FINDER_TASK", false)) ? false : true) {
            intent.putExtra("KEY_IS_FROM_FINDER_TASK", true);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "realEnterFinderProfileTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "realEnterFinderProfileTimelineUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void za0(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.ActivityRouter", "enterFinderLiveCountDownUI");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(context, (Class) ((C36570n) C35640b.f95305v).getValue());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveCountDownUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveCountDownUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: zc */
    public void mo13297zc(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.addFlags(67108864);
        intent.setClass(context, FinderCreateContactUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderCreateContactUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderCreateContactUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void zf0(Activity activity, Intent intent, int i) {
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        C35640b bVar = C35640b.f95284a;
        intent.setClass(activity, (Class) ((C36570n) C35640b.f95295l).getValue());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderLiveVisitorWhiteListUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void zx0(Activity activity, Intent intent, int i) {
        C87412m.m108594g(activity, "context");
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(activity, FinderFavTimelineUI.class);
        C13442s8.f38060Q0.mo12871c(activity, intent);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFavTimelineUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void zy0(Context context, Intent intent, boolean z) {
        Activity ub02;
        if (intent == null) {
            intent = new Intent();
        }
        if (!(context instanceof Activity) && (ub02 = ((C60204t3) C86312j.m106911c(C60204t3.class)).ub0()) != null) {
            context = ub02;
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, z ? FinderFloatBallDetailUI.class : FinderMultiTaskUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "realEnterFloatBallDetailUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "realEnterFloatBallDetailUI", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
