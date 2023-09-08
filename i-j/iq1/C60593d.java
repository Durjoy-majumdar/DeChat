package iq1;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.p056ui.ShareRelPresenter;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import df1.C58259c;
import eb0.C31543z5;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C60172g4;
import je1.C33554b4;
import o40.C61926c;
import org.json.JSONObject;
import pl1.C62369u0;
import qo3.C77426q;
import rs1.C13442s8;
import te3.C64561mp1;
import up1.C37521f;

/* renamed from: iq1.d */
public final class C60593d extends UIComponent {

    /* renamed from: d */
    public final String f172691d = "Finder.WxaAdUIC";

    /* renamed from: e */
    public C64561mp1 f172692e;

    /* renamed from: f */
    public C60592c f172693f;

    /* renamed from: g */
    public TextView f172694g;

    /* renamed from: h */
    public final int f172695h;

    /* renamed from: i */
    public boolean f172696i;

    /* renamed from: j */
    public int f172697j;

    /* renamed from: n */
    public boolean f172698n;

    /* renamed from: o */
    public C62369u0 f172699o;

    /* renamed from: p */
    public int f172700p;

    /* renamed from: q */
    public ShareRelPresenter f172701q;

    /* renamed from: iq1.d$a */
    public static final class C60594a extends C58555d {

        /* renamed from: g */
        public final /* synthetic */ C60593d f172702g;

        public C60594a(C60593d dVar) {
            this.f172702g = dVar;
        }

        /* renamed from: B1 */
        public void mo2331B1(C7637b bVar) {
            C87412m.m108594g(bVar, "ev");
            if (bVar instanceof C58259c.C58260a) {
                C58259c.C58260a aVar = (C58259c.C58260a) bVar;
                if (aVar.f166811b == 3) {
                    String str = this.f172702g.f172691d;
                    StringBuilder sb = new StringBuilder();
                    sb.append("PlayEvent ev.video:");
                    C62369u0 u0Var = aVar.f166814e;
                    sb.append(u0Var != null ? u0Var.hashCode() : 0);
                    sb.append(", offset:");
                    sb.append(aVar.f166815f);
                    Log.m105924i(str, sb.toString());
                    if (C87412m.m108589b(this.f172702g.f172699o, aVar.f166814e) && Math.abs(aVar.f166815f - this.f172702g.f172700p) <= 2) {
                        C60593d dVar = this.f172702g;
                        if (dVar.f172700p != aVar.f166815f) {
                            dVar.f172697j++;
                        }
                    }
                    C60593d dVar2 = this.f172702g;
                    dVar2.f172699o = aVar.f166814e;
                    dVar2.f172700p = aVar.f166815f;
                    if (Math.max(dVar2.f172695h - dVar2.f172697j, 0) > 0) {
                        C60593d dVar3 = this.f172702g;
                        if (!dVar3.f172698n) {
                            C60592c cVar = dVar3.f172693f;
                            if (cVar != null) {
                                cVar.mo85549a();
                                try {
                                    String str2 = cVar.f172682b.f184372i;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    JSONObject jSONObject = new JSONObject(str2);
                                    JSONObject optJSONObject = jSONObject.optJSONObject("weapp_extra_data");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    jSONObject.put("report_type", 1);
                                    jSONObject.put("report_link", cVar.f172682b.f184370g);
                                    jSONObject.put("viewable", true);
                                    jSONObject.put("exposure_type", 1);
                                    optJSONObject.put("exp_time", cVar.f172686f);
                                    optJSONObject.put("clk_time", 0);
                                    jSONObject.put("weapp_extra_data", optJSONObject.toString());
                                    String jSONObject2 = jSONObject.toString();
                                    C87412m.m108593f(jSONObject2, "json.toString()");
                                    C86709a0.m107524d().mo123460f(new C33554b4(1, jSONObject2));
                                } catch (Throwable th) {
                                    Log.printErrStackTrace(cVar.f172683c, th, "reportFirstPlay", new Object[0]);
                                }
                            }
                            this.f172702g.f172698n = true;
                        }
                    }
                    C60593d dVar4 = this.f172702g;
                    dVar4.getClass();
                    C61926c.m72668M(new C60595e(dVar4));
                }
            }
        }

        /* renamed from: z1 */
        public boolean mo2333z1(C58553c cVar, C7637b bVar) {
            C87412m.m108594g(cVar, "dispatcher");
            C87412m.m108594g(bVar, "event");
            return bVar instanceof C58259c.C58260a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60593d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C37521f.f99374d.getClass();
        this.f172695h = C37521f.f99174G.mo60266n().intValue();
    }

    public boolean onBackPressed() {
        FinderVideoCore finderVideoCore;
        if (!(this.f172692e != null) || this.f172696i) {
            return super.onBackPressed();
        }
        ShareRelPresenter shareRelPresenter = this.f172701q;
        if (!(shareRelPresenter == null || (finderVideoCore = shareRelPresenter.f29969o) == null)) {
            finderVideoCore.mo79538z1().mo80068N(MMApplicationContext.getContext());
        }
        C77426q qVar = new C77426q(getContext());
        qVar.mo107595g(getResources().getString(C0966R.string.czw));
        qVar.mo107602n(getResources().getString(C0966R.string.f7935ws));
        qVar.mo107600l(C60596f.f172704a);
        qVar.mo107598j(getResources().getString(C0966R.string.d26));
        qVar.mo107597i(new C60597g(this));
        qVar.mo107593e(new C60598h(this));
        qVar.mo107603o();
        return true;
    }

    public void onCreate(Bundle bundle) {
        C58553c a;
        super.onCreate(bundle);
        View findViewById = findViewById(C0966R.C0970id.egf);
        if (this.f172692e != null) {
            WeImageView weImageView = (WeImageView) findViewById.findViewById(C0966R.C0970id.a2z);
            if (weImageView != null) {
                weImageView.setImageResource(C0966R.raw.icons_filled_close);
            }
            if (weImageView != null) {
                weImageView.setIconColor(getResources().getColor(C0966R.color.f3593yt));
            }
            weImageView.getLayoutParams().width = (int) getResources().getDimension(C0966R.dimen.f3743cv);
            weImageView.getLayoutParams().height = (int) getResources().getDimension(C0966R.dimen.f3743cv);
            LayoutInflater b = C85868k2.m106137b(getContext());
            View decorView = getActivity().getWindow().getDecorView();
            C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            b.inflate(C0966R.C0971layout.a8s, (ViewGroup) decorView, true);
            View findViewById2 = findViewById(C0966R.C0970id.f5534hn);
            this.f172694g = (TextView) findViewById2.findViewById(C0966R.C0970id.f5535ho);
            findViewById2.setPadding(0, C75044y4.m89994f(getActivity()), 0, 0);
            C61926c.m72668M(new C60595e(this));
            C64561mp1 mp12 = this.f172692e;
            if (mp12 != null) {
                C60592c cVar = new C60592c(getContext(), mp12);
                this.f172693f = cVar;
                cVar.f172686f = C31543z5.m39453c();
                try {
                    String str = cVar.f172682b.f184372i;
                    if (str == null) {
                        str = "";
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject optJSONObject = jSONObject.optJSONObject("weapp_extra_data");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    jSONObject.put("report_type", 1);
                    jSONObject.put("report_link", cVar.f172682b.f184370g);
                    jSONObject.put("viewable", false);
                    jSONObject.put("exposure_type", 0);
                    optJSONObject.put("exp_time", cVar.f172686f);
                    optJSONObject.put("clk_time", 0);
                    jSONObject.put("weapp_extra_data", optJSONObject.toString());
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "json.toString()");
                    C86709a0.m107524d().mo123460f(new C33554b4(1, jSONObject2));
                } catch (Throwable th) {
                    Log.printErrStackTrace(cVar.f172683c, th, "reportExpose", new Object[0]);
                }
                Activity context = getContext();
                C60592c cVar2 = this.f172693f;
                C87412m.m108591d(cVar2);
                new C60579b(context, findViewById2, mp12, cVar2);
            }
            C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
            if (f != null && (a = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) != null) {
                a.mo83450a(new C60594a(this));
            }
        }
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        C64561mp1 mp12 = new C64561mp1();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_MINI_APP_AD_FLOW_INFO");
        if (byteArrayExtra != null) {
            try {
                mp12.parseFrom(byteArrayExtra);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
            this.f172692e = mp12;
        }
        mp12 = null;
        this.f172692e = mp12;
    }
}
