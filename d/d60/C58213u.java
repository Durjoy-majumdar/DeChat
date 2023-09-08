package d60;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c50.C54655b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: d60.u */
public final class C58213u extends C58121a {

    /* renamed from: f */
    public final C58124b f166699f;

    /* renamed from: g */
    public final TextView f166700g;

    /* renamed from: h */
    public final TextView f166701h;

    /* renamed from: i */
    public final TextView f166702i;

    /* renamed from: j */
    public final View f166703j;

    /* renamed from: n */
    public final View f166704n;

    /* renamed from: o */
    public final View f166705o;

    /* renamed from: p */
    public final ImageView f166706p;

    /* renamed from: q */
    public final Drawable f166707q = mo82957x0(C0966R.raw.live_net_good_icon);

    /* renamed from: r */
    public final Drawable f166708r = mo82957x0(C0966R.raw.live_net_normal_icon);

    /* renamed from: s */
    public final Drawable f166709s = mo82957x0(C0966R.raw.live_net_bad_icon);

    /* renamed from: t */
    public int f166710t = 0;

    /* renamed from: u */
    public String f166711u = "00:00:00";

    /* renamed from: v */
    public boolean f166712v;

    /* renamed from: d60.u$a */
    public static final class C58214a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58213u f166713d;

        public C58214a(C58213u uVar) {
            this.f166713d = uVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveCommonInfoPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f166713d.f166699f.getLiveRole() == 0) {
                Log.m105924i("MicroMsg.LiveVisitorIDKeyStat", "markClickOnlineUserList");
                C115669n.INSTANCE.mo175913w(1381, 2, 1);
            } else {
                Log.m105924i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorClickOnlineUserList");
                C115669n.INSTANCE.mo175913w(1380, 9, 1);
            }
            C58124b.C7172a.m7372a(this.f166713d.f166699f, C58124b.C58125b.SHOW_MEMBERS_LIST, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveCommonInfoPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58213u(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166699f = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.ftc);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.l…e_common_info_members_tv)");
        this.f166700g = (TextView) findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.f358568ft3);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.l…_common_info_duration_tv)");
        this.f166701h = (TextView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.ft6);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.live_common_info_like_tv)");
        this.f166702i = (TextView) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.fta);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.l…ommon_info_members_group)");
        this.f166703j = findViewById4;
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.f358566ft1);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.l…mmon_info_duration_group)");
        this.f166704n = findViewById5;
        View findViewById6 = viewGroup.findViewById(C0966R.C0970id.ft4);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.l…e_common_info_like_group)");
        this.f166705o = findViewById6;
        View findViewById7 = viewGroup.findViewById(C0966R.C0970id.f358567ft2);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.l…ommon_info_duration_icon)");
        this.f166706p = (ImageView) findViewById7;
        View findViewById8 = viewGroup.findViewById(C0966R.C0970id.f358565ft0);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.l…e_common_info_arrow_icon)");
        ImageView imageView = (ImageView) findViewById8;
        findViewById4.setOnClickListener(new C58214a(this));
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
    }

    /* renamed from: t0 */
    public void mo82897t0() {
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            super.mo10792g(0);
        } else if (ordinal == 27) {
            super.mo10792g(8);
        } else if (ordinal == 39 && this.f166699f.getLiveRole() == 0) {
            boolean z = true;
            if (bundle == null || !bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
                z = false;
            }
            if (z) {
                super.mo10792g(4);
            } else {
                super.mo10792g(0);
            }
        }
    }

    /* renamed from: v0 */
    public void mo12287v0() {
    }

    /* renamed from: w0 */
    public void mo3211w0() {
    }

    /* renamed from: x0 */
    public final Drawable mo82957x0(int i) {
        Drawable drawable = this.f166287d.getContext().getResources().getDrawable(i);
        C87412m.m108593f(drawable, "root.context.resources.getDrawable(resId)");
        return drawable;
    }

    /* renamed from: y0 */
    public final void mo82958y0(LiveConfig liveConfig) {
        boolean z = C54655b.f153178f1 != null;
        this.f166712v = z;
        if (z) {
            View view = this.f166703j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/live/plugin/LiveCommonInfoPlugin", "setupConfig", "(Lcom/tencent/mm/live/api/LiveConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/live/plugin/LiveCommonInfoPlugin", "setupConfig", "(Lcom/tencent/mm/live/api/LiveConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f166704n;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/live/plugin/LiveCommonInfoPlugin", "setupConfig", "(Lcom/tencent/mm/live/api/LiveConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/live/plugin/LiveCommonInfoPlugin", "setupConfig", "(Lcom/tencent/mm/live/api/LiveConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f166705o;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/live/plugin/LiveCommonInfoPlugin", "setupConfig", "(Lcom/tencent/mm/live/api/LiveConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/live/plugin/LiveCommonInfoPlugin", "setupConfig", "(Lcom/tencent/mm/live/api/LiveConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view6 = this.f166703j;
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar4.mo10233c(0);
        View view7 = view6;
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/live/plugin/LiveCommonInfoPlugin", "setupConfig", "(Lcom/tencent/mm/live/api/LiveConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/live/plugin/LiveCommonInfoPlugin", "setupConfig", "(Lcom/tencent/mm/live/api/LiveConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view8 = this.f166704n;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(8);
        C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/live/plugin/LiveCommonInfoPlugin", "setupConfig", "(Lcom/tencent/mm/live/api/LiveConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/live/plugin/LiveCommonInfoPlugin", "setupConfig", "(Lcom/tencent/mm/live/api/LiveConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view9 = this.f166705o;
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(8);
        View view10 = view9;
        C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/live/plugin/LiveCommonInfoPlugin", "setupConfig", "(Lcom/tencent/mm/live/api/LiveConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view10, "com/tencent/mm/live/plugin/LiveCommonInfoPlugin", "setupConfig", "(Lcom/tencent/mm/live/api/LiveConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
