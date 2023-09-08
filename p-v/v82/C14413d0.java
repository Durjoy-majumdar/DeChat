package v82;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: v82.d0 */
public final class C14413d0 {

    /* renamed from: a */
    public View f40010a;

    /* renamed from: b */
    public View f40011b;

    /* renamed from: c */
    public WeImageView f40012c;

    /* renamed from: d */
    public WeImageView f40013d;

    /* renamed from: e */
    public Context f40014e;

    /* renamed from: f */
    public boolean f40015f;

    /* renamed from: g */
    public boolean f40016g;

    public C14413d0(View view) {
        C87412m.m108594g(view, "rootView");
        this.f40010a = view;
        this.f40014e = view.getContext();
        WeImageView weImageView = (WeImageView) this.f40010a.findViewById(C0966R.C0970id.h4x);
        this.f40012c = weImageView;
        if (weImageView != null) {
            weImageView.setImageResource(C0966R.raw.icons_filled_video_call);
        }
        WeImageView weImageView2 = this.f40012c;
        if (weImageView2 != null) {
            weImageView2.setIconColor(Color.parseColor("#07C160"));
        }
        WeImageView weImageView3 = this.f40012c;
        if (weImageView3 != null) {
            weImageView3.setVisibility(8);
        }
        WeImageView weImageView4 = (WeImageView) this.f40010a.findViewById(C0966R.C0970id.h4y);
        this.f40013d = weImageView4;
        if (weImageView4 != null) {
            weImageView4.setImageResource(C0966R.raw.icons_filled_mike);
        }
        WeImageView weImageView5 = this.f40013d;
        if (weImageView5 != null) {
            Context context = this.f40014e;
            C87412m.m108591d(context);
            weImageView5.setIconColor(context.getResources().getColor(C0966R.color.f2939n));
        }
        WeImageView weImageView6 = this.f40013d;
        if (weImageView6 != null) {
            weImageView6.setVisibility(8);
        }
        View findViewById = this.f40010a.findViewById(C0966R.C0970id.f1p);
        this.f40011b = findViewById;
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniStatusLayout", "<init>", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniStatusLayout", "<init>", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: a */
    public final void mo13700a(boolean z, boolean z2) {
        View view = this.f40011b;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniStatusLayout", "setDoubleIcon", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniStatusLayout", "setDoubleIcon", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        WeImageView weImageView = this.f40013d;
        if (weImageView != null) {
            weImageView.setVisibility(0);
        }
        WeImageView weImageView2 = this.f40012c;
        if (weImageView2 != null) {
            weImageView2.setVisibility(0);
        }
        if (!z) {
            WeImageView weImageView3 = this.f40013d;
            if (weImageView3 != null) {
                weImageView3.setImageResource(C0966R.raw.icons_filled_mike);
            }
            WeImageView weImageView4 = this.f40013d;
            if (weImageView4 != null) {
                Context context = this.f40014e;
                C87412m.m108591d(context);
                weImageView4.setIconColor(context.getResources().getColor(C0966R.color.f2939n));
            }
        } else {
            WeImageView weImageView5 = this.f40013d;
            if (weImageView5 != null) {
                weImageView5.setImageResource(C0966R.raw.icons_filled_mike);
            }
            WeImageView weImageView6 = this.f40013d;
            if (weImageView6 != null) {
                Context context2 = this.f40014e;
                C87412m.m108591d(context2);
                weImageView6.setIconColor(context2.getResources().getColor(C0966R.color.FG_2));
            }
        }
        if (z2) {
            WeImageView weImageView7 = this.f40012c;
            if (weImageView7 != null) {
                weImageView7.setImageResource(C0966R.raw.icons_filled_video_call);
            }
            WeImageView weImageView8 = this.f40012c;
            if (weImageView8 != null) {
                Context context3 = this.f40014e;
                C87412m.m108591d(context3);
                weImageView8.setIconColor(context3.getResources().getColor(C0966R.color.f2939n));
                return;
            }
            return;
        }
        WeImageView weImageView9 = this.f40012c;
        if (weImageView9 != null) {
            weImageView9.setImageResource(C0966R.raw.icons_filled_video_call);
        }
        WeImageView weImageView10 = this.f40012c;
        if (weImageView10 != null) {
            Context context4 = this.f40014e;
            C87412m.m108591d(context4);
            weImageView10.setIconColor(context4.getResources().getColor(C0966R.color.FG_2));
        }
    }
}
