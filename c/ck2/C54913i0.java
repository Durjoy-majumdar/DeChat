package ck2;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.autogen.mmdata.rpt.voipRingToneRecommendReportStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C75592q0;
import gy3.C87412m;
import java.util.List;
import nj2.C61768p;
import p145dx.C58455v;
import pj2.C62323d;
import rj2.C63447a;
import rj2.C63449b;
import sx3.C110818d0;
import ve3.C52844o0;
import ve3.C65682g;
import ve3.C65685n0;
import wj2.C66132f;

/* renamed from: ck2.i0 */
public final class C54913i0 extends UIComponent implements C58455v {

    /* renamed from: d */
    public String f153913d = "";

    /* renamed from: e */
    public long f153914e;

    /* renamed from: f */
    public int f153915f;

    /* renamed from: g */
    public int f153916g;

    /* renamed from: h */
    public long f153917h = Util.nowMilliSecond();

    /* renamed from: i */
    public C62323d f153918i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54913i0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: K0 */
    public void mo75839K0(List<? extends C62323d> list) {
        C87412m.m108594g(list, "data");
        C62323d dVar = (C62323d) C110818d0.m150916N(list);
        if (dVar != null) {
            dVar.getItemId();
        }
    }

    /* renamed from: g1 */
    public void mo75840g1(String str) {
        C87412m.m108594g(str, "key");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        getIntent().getIntExtra("ringtone_caller", 1);
        String stringExtra = getIntent().getStringExtra("exclusvie_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f153913d = stringExtra;
        if (stringExtra.length() != 0) {
            z = false;
        }
        if (z) {
            Log.m105920e("MicroMsg.RingtoneKVReportUIC", "not pass exclusive ringtone name, default my username");
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            this.f153913d = s;
        }
        if (C63447a.m74787a((long) this.f153913d.hashCode()) == null) {
            C61768p.m72477d(this.f153913d);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        getIntent().getIntExtra("ringtone_caller", 1);
        String stringExtra = getIntent().getStringExtra("exclusvie_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f153913d = stringExtra;
        this.f153916g = getIntent().getIntExtra("ringtone_channel", 0);
        if (this.f153915f == 0) {
            this.f153915f = getIntent().getIntExtra("ringtone_scene", 0);
        }
        if (this.f153913d.length() != 0) {
            z = false;
        }
        if (z) {
            Log.m105920e("MicroMsg.RingtoneKVReportUIC", "not pass exclusive ringtone name, default my username");
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            this.f153913d = s;
        }
        long longExtra = getIntent().getLongExtra("ringtone_session_id", 0);
        this.f153914e = longExtra;
        if (longExtra == 0) {
            this.f153914e = Util.nowMilliSecond();
        }
        if (C63447a.m74787a((long) this.f153913d.hashCode()) == null) {
            C61768p.m72477d(this.f153913d);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    /* renamed from: s1 */
    public void mo75841s1(long j, int i, C62323d dVar, long j2) {
        String str;
        String str2;
        String str3;
        String str4;
        C52844o0 o0Var;
        C65685n0 e;
        long j3 = j2;
        Class cls = C54885e0.class;
        Class cls2 = RingtoneDataUIC.class;
        C39818r rVar = C39818r.f106831a;
        boolean z = false;
        long j4 = ((RingtoneDataUIC) rVar.mo62444c(getActivity()).mo75002a(cls2)).f164071d == 1 ? 1 : 2;
        String str5 = ((RingtoneDataUIC) rVar.mo62444c(getActivity()).mo75002a(cls2)).f164073f;
        C54885e0 e0Var = (C54885e0) rVar.mo62444c(getActivity()).mo62449e(cls);
        if (e0Var == null || (str = String.valueOf(e0Var.mo75828c3().f181219f)) == null) {
            str = "";
        }
        C54885e0 e0Var2 = (C54885e0) rVar.mo62444c(getActivity()).mo62449e(cls);
        if (e0Var2 == null || (str2 = e0Var2.mo75828c3().f181222i) == null) {
            str2 = "";
        }
        long j5 = C61768p.m72481i(str5) == null ? 1 : 2;
        C54891f0 f0Var = (C54891f0) rVar.mo62444c(getActivity()).mo62449e(C54891f0.class);
        if (f0Var == null || (str3 = String.valueOf(f0Var.mo75830c3().f181230f)) == null) {
            str3 = "";
        }
        if (((RingtoneDataUIC) rVar.mo62444c(getActivity()).mo75002a(cls2)).f164074g > 1) {
            z = true;
        }
        long j6 = this.f153914e;
        long j7 = this.f153917h;
        int i2 = this.f153915f;
        int i3 = this.f153916g;
        voipRingToneRecommendReportStruct voipringtonerecommendreportstruct = new voipRingToneRecommendReportStruct();
        String str6 = str5;
        boolean z2 = z;
        voipringtonerecommendreportstruct.f156985f = (long) i;
        voipringtonerecommendreportstruct.f156993n = voipringtonerecommendreportstruct.mo86045b("session_ID", String.valueOf(j6), true);
        long milliSecondsToNow = Util.milliSecondsToNow(j7);
        voipringtonerecommendreportstruct.f156990k = milliSecondsToNow;
        voipringtonerecommendreportstruct.mo86046c("chooseTimeMs", milliSecondsToNow);
        voipringtonerecommendreportstruct.f156989j = j3;
        voipringtonerecommendreportstruct.mo86046c("previewTimeMs", j3);
        long j8 = 0;
        C66132f a = C63449b.m74791a(dVar != null ? dVar.getItemId() : 0);
        voipringtonerecommendreportstruct.f156984e = a != null ? a.mo90172c() : 0;
        C65682g gVar = null;
        voipringtonerecommendreportstruct.f156983d = voipringtonerecommendreportstruct.mo86045b("FeedID", a != null ? a.mo90174e() : null, true);
        voipringtonerecommendreportstruct.f156986g = j;
        voipringtonerecommendreportstruct.f156987h = (long) i2;
        voipringtonerecommendreportstruct.f156991l = j4;
        voipringtonerecommendreportstruct.f156998s = voipringtonerecommendreportstruct.mo86045b("search_request_id", str, true);
        voipringtonerecommendreportstruct.f156988i = voipringtonerecommendreportstruct.mo86045b("searchKeyword", str2, true);
        voipringtonerecommendreportstruct.f156999t = voipringtonerecommendreportstruct.mo86045b("rec_request_id", str3, true);
        voipringtonerecommendreportstruct.f157000u = z2 ? 2 : 1;
        voipringtonerecommendreportstruct.f156995p = (long) i3;
        if (j4 == 2) {
            voipringtonerecommendreportstruct.f156992m = voipringtonerecommendreportstruct.mo86045b("toUserName", str6, true);
        }
        voipringtonerecommendreportstruct.f156994o = j5;
        if (!(dVar == null || (e = dVar.mo87403e()) == null)) {
            gVar = e.f189022f;
        }
        if (gVar != null) {
            j8 = (long) gVar.f189008u;
        }
        voipringtonerecommendreportstruct.f156996q = j8;
        if (gVar == null || (o0Var = gVar.f189009v) == null || (str4 = Long.valueOf(o0Var.f147614f).toString()) == null) {
            str4 = "";
        }
        voipringtonerecommendreportstruct.f156997r = voipringtonerecommendreportstruct.mo86045b("recall_cmdid", str4, true);
        voipringtonerecommendreportstruct.mo86054n();
    }

    /* renamed from: x1 */
    public void mo75842x1(int i) {
        this.f153915f = i;
    }
}
