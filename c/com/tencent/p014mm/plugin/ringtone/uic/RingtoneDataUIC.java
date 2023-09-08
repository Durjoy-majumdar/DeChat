package com.tencent.p014mm.plugin.ringtone.uic;

import a14.C53895h;
import a14.C53934p0;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import ck2.C54875b;
import ck2.C54883d0;
import ck2.C54885e0;
import ck2.C54891f0;
import ck2.C54913i0;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.ringtone.p100ui.RingtoneHistoryUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dk2.C58318a;
import eb0.C31543z5;
import eb0.C75592q0;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60200t1;
import j03.C60700d;
import java.util.ArrayList;
import java.util.List;
import jq3.C60898l;
import jq3.C60905o;
import ke3.C88144b;
import org.json.JSONObject;
import p145dx.C58449n;
import p145dx.C58455v;
import pj2.C62323d;
import pj2.C62324e;
import pj2.C62330l;
import qc0.C101093a;
import rc0.C63389c;
import rj2.C63449b;
import sx3.C110818d0;
import ve3.C52844o0;
import ve3.C65680f;
import ve3.C65682g;
import ve3.C65683h0;
import ve3.C65685n0;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC */
public final class RingtoneDataUIC extends UIComponent implements C58449n {

    /* renamed from: d */
    public int f164071d = 1;

    /* renamed from: e */
    public int f164072e = 1;

    /* renamed from: f */
    public String f164073f = "";

    /* renamed from: g */
    public final int f164074g = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ringtone_video_timeline, 0);

    /* renamed from: h */
    public C54219z<Boolean> f164075h = new C54219z<>();

    /* renamed from: i */
    public WxRecyclerAdapter<C62323d> f164076i;

    /* renamed from: j */
    public long f164077j = -1;

    /* renamed from: n */
    public int f164078n = -1;

    /* renamed from: o */
    public C62324e f164079o;

    /* renamed from: p */
    public int f164080p = -1;

    /* renamed from: q */
    public C62324e f164081q;

    /* renamed from: r */
    public boolean f164082r;

    /* renamed from: s */
    public int f164083s = -1;

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC$a */
    public static final class C57287a implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ RingtoneDataUIC f164084d;

        public C57287a(RingtoneDataUIC ringtoneDataUIC) {
            this.f164084d = ringtoneDataUIC;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C65680f fVar;
            C66132f a;
            String str;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) eVar;
            if (i < 0 || i >= (wxRecyclerAdapter.getItemCount() - wxRecyclerAdapter.f173486j.size()) - wxRecyclerAdapter.mo85796c6()) {
                Log.m105920e("MicroMsg.RingtoneDataUIC", "invalid position:" + i);
            } else if (i < wxRecyclerAdapter.mo85796c6()) {
                C60898l.C60899a aVar = wxRecyclerAdapter.f173485i.get(i);
                C87412m.m108593f(aVar, "headerInfoList[headerPosition]");
                if (aVar instanceof C62330l) {
                    ((RingtoneDataUIC) C39818r.f106831a.mo62444c(this.f164084d.getActivity()).mo75002a(RingtoneDataUIC.class)).mo80832f3();
                }
            } else {
                int c6 = i - wxRecyclerAdapter.mo85796c6();
                C62323d dVar = (C62323d) C110818d0.m150917O(wxRecyclerAdapter.getData(), c6);
                if (dVar != null) {
                    C54913i0 i0Var = (C54913i0) C39818r.f106831a.mo62444c(this.f164084d.getActivity()).mo75002a(C54913i0.class);
                    i0Var.getClass();
                    i0Var.f153918i = dVar;
                    C58455v.C58456a.m67861a(i0Var, 7, c6, dVar, 0, 8, (Object) null);
                    i0Var.f153918i = null;
                    C65682g gVar = dVar.mo87403e().f189022f;
                    if (gVar != null && (fVar = gVar.f188994d) != null && (a = C63449b.m74791a(fVar.f188983d)) != null) {
                        C52844o0 o0Var = gVar.f189009v;
                        RingtoneDataUIC ringtoneDataUIC = this.f164084d;
                        int i2 = ringtoneDataUIC.getActivity() instanceof RingtoneHistoryUI ? 26 : 25;
                        long j = o0Var != null ? o0Var.f147614f : 0;
                        if (o0Var == null || (str = o0Var.f147615g) == null) {
                            str = "";
                        }
                        ringtoneDataUIC.mo80830d3(a, 38, i2, j, str, c6);
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RingtoneDataUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: e3 */
    public static /* synthetic */ void m66025e3(RingtoneDataUIC ringtoneDataUIC, C66132f fVar, int i, int i2, long j, String str, int i3, int i4, Object obj) {
        ringtoneDataUIC.mo80830d3(fVar, i, i2, (i4 & 8) != 0 ? 0 : j, (i4 & 16) != 0 ? "" : str, (i4 & 32) != 0 ? 0 : i3);
    }

    /* renamed from: P1 */
    public WxRecyclerAdapter<C62323d> mo80827P1(boolean z) {
        ArrayList arrayList = new ArrayList();
        if ((this.f164071d == 1) && z) {
            C65685n0 n0Var = new C65685n0();
            n0Var.f189020d = 3;
            arrayList.add(new C62324e(n0Var));
        }
        WxRecyclerAdapter<C62323d> wxRecyclerAdapter = new WxRecyclerAdapter<>(new RingtoneDataUIC$initRingtoneSelectListAdapter$adapter$1(this), arrayList, true);
        wxRecyclerAdapter.setHasStableIds(true);
        wxRecyclerAdapter.f173488o = new C57287a(this);
        this.f164076i = wxRecyclerAdapter;
        return wxRecyclerAdapter;
    }

    /* renamed from: T */
    public boolean mo80828T() {
        return mo80829c3();
    }

    /* renamed from: c3 */
    public final boolean mo80829c3() {
        return this.f164074g > 1 && ((C54913i0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54913i0.class)).f153915f != 3;
    }

    /* renamed from: d3 */
    public final void mo80830d3(C66132f fVar, int i, int i2, long j, String str, int i3) {
        Class cls = C60200t1.class;
        Class cls2 = C54913i0.class;
        C87412m.m108594g(fVar, "ringtoneInfo");
        C87412m.m108594g(str, "itemContext");
        C39818r rVar = C39818r.f106831a;
        int i4 = ((C54913i0) rVar.mo62444c(getActivity()).mo75002a(cls2)).f153915f;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("session_id", ((C54913i0) rVar.mo62444c(getActivity()).mo75002a(cls2)).f153914e);
        jSONObject.put("feed_id", fVar.mo90173d());
        jSONObject.put("position", i3);
        jSONObject.put("entrance", this.f164072e);
        jSONObject.put("search_request_id", String.valueOf(((C54885e0) rVar.mo62444c(getActivity()).mo75002a(C54885e0.class)).mo75828c3().f181219f));
        jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i4);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …ene)\n        }.toString()");
        boolean z = false;
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        Intent intent = new Intent();
        intent.putExtra("from_user", C75592q0.m90789s());
        intent.putExtra("feed_object_id", fVar.f190092o);
        intent.putExtra("feed_object_nonceId", fVar.f190093p);
        intent.putExtra("key_session_id", C31543z5.m39451a());
        intent.putExtra("key_feed_report_enter", i);
        intent.putExtra("key_feed_report_enter_type", i2);
        intent.putExtra("key_reuqest_scene", 28);
        intent.putExtra("key_comment_scene", 25);
        intent.putExtra("KEY_RINGTONE_RECALL_ID", j);
        intent.putExtra("key_session_id", str);
        intent.putExtra("KEY_RINGTONE_REPORT_JSON", n);
        int i5 = this.f164072e;
        intent.putExtra("KEY_RINGTONE_TO_USERNAME", (i5 == 6 || i5 == 9 || i5 == 10) ? "" : this.f164073f);
        intent.putExtra("KEY_RINGTONE_CHANNEL", this.f164072e);
        intent.putExtra("KEY_RINGTONE_CHOOSE_SCENE", i4);
        intent.putExtra("KEY_RINGTONE_REC_REQUEST_ID", String.valueOf(((C54891f0) rVar.mo62444c(getActivity()).mo75002a(C54891f0.class)).mo75830c3().f181230f));
        if (this.f164074g > 1) {
            z = true;
        }
        intent.putExtra("KEY_IS_VIDEO_STREAM", z);
        C60700d dVar = ((C54883d0) rVar.mo62444c(getActivity()).mo75002a(C54883d0.class)).f153833d.f179981j;
        intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", dVar != null ? dVar.getCurrentPositionMs() : 0);
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(i, i2, 25, intent);
        intent.putExtra("key_extra_info", "");
        intent.putExtra("key_enable_ringtone_bubble", true);
        ((C60200t1) C86312j.m106911c(cls)).mo76864nr(getContext(), intent);
    }

    /* renamed from: e2 */
    public C54219z<Boolean> mo80831e2() {
        return this.f164075h;
    }

    /* renamed from: f3 */
    public final void mo80832f3() {
        Intent intent = new Intent();
        intent.putExtra("ringtone_caller", this.f164071d);
        intent.putExtra("ringtone_channel", this.f164072e);
        intent.putExtra("exclusvie_name", this.f164073f);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76867qD(getActivity(), intent, 5);
    }

    /* renamed from: g3 */
    public final void mo80833g3(int i, C62324e eVar) {
        C65680f fVar;
        C66132f a;
        C87412m.m108594g(eVar, "ringtoneConvertData");
        C65682g gVar = eVar.f177154d.f189022f;
        if (gVar != null && (fVar = gVar.f188994d) != null && (a = C63449b.m74791a(fVar.f188983d)) != null) {
            C65683h0 h0Var = gVar.f189010w;
            String str = a.f190102y ? h0Var != null ? h0Var.f189013f : null : gVar.f189001n;
            String str2 = h0Var != null ? h0Var.f189014g : null;
            boolean z = false;
            if (!(str == null || str.length() == 0)) {
                Intent intent = new Intent();
                intent.putExtra("finder_username", str);
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76819V1(getActivity(), intent);
                return;
            }
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                Intent intent2 = new Intent();
                intent2.putExtra("rawUrl", str2);
                C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
                return;
            }
            Log.m105920e("MicroMsg.RingtoneDataUIC", "singerFinderUsername and singerBaikeUrl is null!");
        }
    }

    /* renamed from: i3 */
    public final void mo80834i3(int i, boolean z, C62324e eVar) {
        mo80835j3();
        if (z) {
            this.f164080p = i != -1 ? i : this.f164080p;
            if (i == -1 || eVar == null) {
                eVar = this.f164081q;
            }
            this.f164081q = eVar;
            this.f164077j = Util.nowMilliSecond();
            this.f164078n = this.f164080p;
            this.f164079o = this.f164081q;
        } else if (this.f164080p == i) {
            this.f164080p = -1;
            this.f164081q = null;
            this.f164077j = 0;
            this.f164078n = -1;
            this.f164079o = null;
        }
        Log.m105924i("MicroMsg.RingtoneDataUIC", "onPlayStateChange, position:" + i + ", play:" + z + ", curPlayPosition:" + this.f164080p);
    }

    /* renamed from: j3 */
    public final void mo80835j3() {
        int i = this.f164078n;
        C62324e eVar = this.f164079o;
        long j = this.f164077j;
        if (i >= 0 && eVar != null) {
            ((C54913i0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54913i0.class)).mo75841s1(2, i, eVar, Util.milliSecondsToNow(j));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f164071d = getIntent().getIntExtra("ringtone_caller", 1);
        String stringExtra = getIntent().getStringExtra("exclusvie_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f164073f = stringExtra;
        this.f164072e = getIntent().getIntExtra("ringtone_channel", 0);
        Log.m105924i("MicroMsg.RingtoneDataUIC", "userName:" + this.f164073f);
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        if (((C54913i0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54913i0.class)).f153915f != 0) {
            Log.m105924i("MicroMsg.RingtoneDataUIC", "hookPlayState");
            C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C54875b(this, (C15601d<? super C54875b>) null), 3, (Object) null);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (C58318a.f166995b) {
            C101093a.m132486h();
            ((C63389c) C86312j.m106911c(C63389c.class)).mo88298vr();
        }
        C58318a.f166995b = false;
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54913i0.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…ectReportUIC::class.java)");
        C58455v.C58456a.m67861a((C58455v) a, 10, this.f164080p, this.f164081q, 0, 8, (Object) null);
    }

    public void onPause() {
        C62323d dVar;
        List<C62323d> data;
        super.onPause();
        if (this.f164080p >= 0) {
            WxRecyclerAdapter<C62323d> wxRecyclerAdapter = this.f164076i;
            int i = 0;
            if (wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null) {
                dVar = null;
            } else {
                WxRecyclerAdapter<C62323d> wxRecyclerAdapter2 = this.f164076i;
                dVar = (C62323d) C110818d0.m150917O(data, (wxRecyclerAdapter2 != null ? wxRecyclerAdapter2.mo85796c6() : 0) + this.f164080p);
            }
            if (dVar != null) {
                dVar.mo87404h(false);
            }
            WxRecyclerAdapter<C62323d> wxRecyclerAdapter3 = this.f164076i;
            if (wxRecyclerAdapter3 != null) {
                if (wxRecyclerAdapter3 != null) {
                    i = wxRecyclerAdapter3.mo85796c6();
                }
                wxRecyclerAdapter3.notifyItemChanged(i + this.f164080p, Boolean.FALSE);
            }
            this.f164082r = true;
            this.f164083s = this.f164080p;
        }
        mo80835j3();
        this.f164080p = -1;
        this.f164081q = null;
        this.f164078n = -1;
        this.f164079o = null;
        this.f164077j = 0;
    }

    public void onResume() {
        C62323d dVar;
        List<C62323d> data;
        super.onResume();
        if (mo80829c3() && this.f164082r) {
            WxRecyclerAdapter<C62323d> wxRecyclerAdapter = this.f164076i;
            if (wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null) {
                dVar = null;
            } else {
                WxRecyclerAdapter<C62323d> wxRecyclerAdapter2 = this.f164076i;
                dVar = (C62323d) C110818d0.m150917O(data, (wxRecyclerAdapter2 != null ? wxRecyclerAdapter2.mo85796c6() : 0) + this.f164083s);
            }
            if (dVar != null) {
                dVar.mo87404h(true);
            }
            WxRecyclerAdapter<C62323d> wxRecyclerAdapter3 = this.f164076i;
            if (wxRecyclerAdapter3 != null) {
                wxRecyclerAdapter3.notifyItemChanged((wxRecyclerAdapter3 != null ? wxRecyclerAdapter3.mo85796c6() : 0) + this.f164083s, Boolean.TRUE);
            }
        }
        this.f164082r = false;
    }
}
