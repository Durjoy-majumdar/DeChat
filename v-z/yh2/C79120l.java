package yh2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import fy3.C32224a;
import gh2.C98116a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: yh2.l */
public final class C79120l extends C104428a {

    /* renamed from: n */
    public View f232340n;

    /* renamed from: o */
    public TextView f232341o;

    /* renamed from: p */
    public ImageView f232342p;

    /* renamed from: q */
    public View f232343q;

    /* renamed from: r */
    public View f232344r;

    /* renamed from: s */
    public C32224a<C13598b0> f232345s;

    /* renamed from: t */
    public boolean f232346t = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79120l(Context context) {
        super(context, 0);
        C87412m.m108594g(context, "context");
        setContentView((int) C0966R.C0971layout.c6k);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(134218752);
            window.clearFlags(2);
        }
        this.f232343q = findViewById(C0966R.C0970id.f359309k61);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f359311k63);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f359310k62);
        this.f232340n = findViewById(C0966R.C0970id.k64);
        this.f232341o = (TextView) findViewById(C0966R.C0970id.k66);
        this.f232342p = (ImageView) findViewById(C0966R.C0970id.k65);
        this.f232344r = findViewById(C0966R.C0970id.k67);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.k69);
        ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.k68);
        if (!((C98116a.C98117a) C98116a.f287596b.mo138761d()).f287601e) {
            View view = this.f232340n;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initNotifySnsBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initNotifySnsBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view2 = this.f232340n;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initNotifySnsBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initNotifySnsBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view4 = this.f232340n;
            if (view4 != null) {
                view4.setOnClickListener(new C53528k(this));
            }
            if (this.f232346t) {
                TextView textView3 = this.f232341o;
                if (textView3 != null) {
                    textView3.setText(getContext().getResources().getString(C0966R.string.f361417jq2));
                }
                ImageView imageView3 = this.f232342p;
                if (imageView3 != null) {
                    imageView3.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_outlined_moment_off, getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9)));
                }
            } else {
                TextView textView4 = this.f232341o;
                if (textView4 != null) {
                    textView4.setText(getContext().getResources().getString(C0966R.string.f361418jq3));
                }
                ImageView imageView4 = this.f232342p;
                if (imageView4 != null) {
                    imageView4.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_outlined_moment, getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9)));
                }
            }
        }
        View view5 = this.f232343q;
        if (view5 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initFavoriteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initFavoriteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view7 = this.f232344r;
        if (view7 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initRangeBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog", "initRangeBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById = findViewById(C0966R.C0970id.c2m);
        if (findViewById != null) {
            findViewById.setBackgroundResource(C0966R.color.ahf);
        }
    }
}
