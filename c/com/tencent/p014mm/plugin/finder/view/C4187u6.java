package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import dp1.C7435f2;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import rs1.C13442s8;

/* renamed from: com.tencent.mm.plugin.finder.view.u6 */
public final class C4187u6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f18444d;

    /* renamed from: e */
    public final /* synthetic */ HorizontalVideoPreviewLayout f18445e;

    /* renamed from: com.tencent.mm.plugin.finder.view.u6$a */
    public static final class C4188a implements View.OnClickListener {

        /* renamed from: d */
        public int f18446d;

        /* renamed from: e */
        public final /* synthetic */ HorizontalVideoPreviewLayout f18447e;

        public C4188a(HorizontalVideoPreviewLayout horizontalVideoPreviewLayout) {
            this.f18447e = horizontalVideoPreviewLayout;
            this.f18446d = horizontalVideoPreviewLayout.getLongVideoSeekBarLayout().getHiddenTv().getScrollY();
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$3$1$closeDetailTextListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f18447e.getFgView().getVisibility() == 0 && this.f18446d == this.f18447e.getLongVideoSeekBarLayout().getHiddenTv().getScrollY()) {
                View fgView = this.f18447e.getFgView();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(fgView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$3$1$closeDetailTextListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                fgView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(fgView, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$3$1$closeDetailTextListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f18447e.getLongVideoSeekBarLayout().getHiddenTv().setVisibility(4);
                this.f18447e.getLongVideoSeekBarLayout().getDescTv().setVisibility(0);
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                Context context = this.f18447e.getContext();
                C87412m.m108593f(context, "context");
                C13442s8 f = aVar2.mo12873f(context);
                f2Var.mo8577a(f != null ? f.mo12861q3() : null, "transpose_video_card_caption_detail", 1, (JSONObject) null);
            }
            this.f18446d = this.f18447e.getLongVideoSeekBarLayout().getHiddenTv().getScrollY();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$3$1$closeDetailTextListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C4187u6(TextView textView, HorizontalVideoPreviewLayout horizontalVideoPreviewLayout) {
        this.f18444d = textView;
        this.f18445e = horizontalVideoPreviewLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int lineCount = this.f18444d.getLineCount();
        if (this.f18444d.getVisibility() == 0 && lineCount > 0) {
            Layout layout = this.f18444d.getLayout();
            if ((layout != null ? layout.getEllipsisCount(lineCount - 1) : 0) > 0) {
                TextView hiddenTv = this.f18445e.getLongVideoSeekBarLayout().getHiddenTv();
                hiddenTv.setVisibility(0);
                hiddenTv.scrollTo(0, 0);
                this.f18444d.setVisibility(4);
                View fgView = this.f18445e.getFgView();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = fgView;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$3$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                fgView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$3$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                Context context = this.f18445e.getContext();
                C87412m.m108593f(context, "context");
                C13442s8 f = aVar2.mo12873f(context);
                f2Var.mo8577a(f != null ? f.mo12861q3() : null, "transpose_video_card_caption", 1, (JSONObject) null);
                C4188a aVar3 = new C4188a(this.f18445e);
                this.f18445e.getFgView().setOnClickListener(aVar3);
                this.f18445e.getLongVideoSeekBarLayout().getHiddenTv().setOnClickListener(aVar3);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
