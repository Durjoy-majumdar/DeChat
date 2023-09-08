package il1;

import ak1.C54067f0;
import ak1.C54108o;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import qj1.C62660c;
import zj1.C16217b;

/* renamed from: il1.o */
public final class C9077o {

    /* renamed from: a */
    public final ViewGroup f28635a;

    /* renamed from: b */
    public final C58124b f28636b;

    /* renamed from: c */
    public final C62660c f28637c;

    /* renamed from: d */
    public final View f28638d;

    /* renamed from: e */
    public final String f28639e = "anchorlive.bottom.videosetting";

    /* renamed from: f */
    public final String f28640f = "anchorlive.bottom.audiosetting";

    /* renamed from: g */
    public boolean f28641g = true;

    /* renamed from: h */
    public final View f28642h;

    /* renamed from: i */
    public final TextView f28643i;

    /* renamed from: il1.o$a */
    public static final class C9078a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9077o f28644d;

        public C9078a(C9077o oVar) {
            this.f28644d = oVar;
        }

        public final void onClick(View view) {
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorCameraOptionWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.FRAME, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
            Bundle bundle = new Bundle();
            C9077o oVar = this.f28644d;
            bundle.putInt("PARAM_FINDER_LIVE_CAMERA_OPT_SCENE", 1);
            oVar.f28636b.statusChange(C58124b.C58125b.FINDER_LIVE_SHOW_CAMERA_OPT_SHEET, bundle);
            C16217b bVar = C16217b.f43438a;
            bVar.mo14745b(this.f28644d.f28639e, false);
            bVar.mo14745b(this.f28644d.f28640f, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorCameraOptionWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C9077o(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f28635a = viewGroup;
        this.f28636b = bVar;
        this.f28637c = cVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.dh5);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…ve_camera_opt_click_area)");
        this.f28638d = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.dh6);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…der_live_camera_opt_icon)");
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.hyv);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.camera_count_red_dot)");
        this.f28643i = (TextView) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.iiu);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.camera_red_dot)");
        this.f28642h = findViewById4;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById4, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorCameraOptionWidget", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/live/plugin/ILiveStatus;Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorCameraOptionWidget", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/live/plugin/ILiveStatus;Lcom/tencent/mm/plugin/finder/live/plugin/FinderBaseLivePlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new C9078a(this));
        Drawable drawable = viewGroup.getContext().getResources().getDrawable(C0966R.raw.finder_live_view_setting_icon);
        C74933u4.m89769f(drawable, viewGroup.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
        ((ImageView) findViewById2).setImageDrawable(drawable);
    }
}
