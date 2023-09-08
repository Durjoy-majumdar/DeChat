package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l;
import com.tencent.p014mm.storage.C19623o0;
import fy0.C8219i;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import s90.C77630j;
import te3.C22491bj2;
import te3.C22533wo3;
import te3.mr4;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.b0 */
public final class C18213b0 extends C18368v {

    /* renamed from: r */
    public TextView f50344r;

    /* renamed from: s */
    public View f50345s;

    /* renamed from: t */
    public int f50346t = 5;

    /* renamed from: u */
    public int f50347u = C0966R.C0970id.l9p;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.b0$a */
    public static final class C18214a implements C22906q.C22907a {

        /* renamed from: a */
        public final /* synthetic */ C18213b0 f50348a;

        public C18214a(C18213b0 b0Var) {
            this.f50348a = b0Var;
        }

        public void onFinish() {
            C18213b0 b0Var = this.f50348a;
            TextView textView = b0Var.f50344r;
            if (textView != null) {
                textView.setTextColor(b0Var.f50872a.getResources().getColor(C0966R.color.al_));
            }
        }

        public void onStart() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18213b0(Context context, C18508z2 z2Var) {
        super(context, z2Var);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(z2Var, "adapter");
    }

    /* renamed from: a */
    public void mo22820a(C19623o0 o0Var, int i, View view, View view2) {
        C19623o0 o0Var2 = o0Var;
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(view, "convertView");
        C87412m.m108594g(view2, "parent");
        super.mo22820a(o0Var, i, view, view2);
        C22533wo3 wo32 = o0Var2.f55539x1.f64172e.get(0);
        C22491bj2 bj22 = o0Var2.f55539x1.f64172e.get(0).f64690e;
        MMNeat7extView mMNeat7extView = this.f50879h;
        if (mMNeat7extView != null) {
            mMNeat7extView.mo104279b(bj22.f63727d);
        }
        mr4 mr4 = wo32.f64690e.f63735o;
        if (mr4.f184395g > 0) {
            View view3 = this.f50345s;
            if (view3 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedVideo", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedVideo", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView = this.f50344r;
            if (textView != null) {
                textView.setVisibility(0);
            }
            C92721n.m116876d(mr4.f184395g);
            TextView textView2 = this.f50344r;
            if (textView2 != null) {
                textView2.setText(C92721n.m116876d(mr4.f184395g));
            }
        } else {
            TextView textView3 = this.f50344r;
            if (textView3 != null) {
                textView3.setText("");
            }
            TextView textView4 = this.f50344r;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            View view4 = this.f50345s;
            if (view4 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedVideo", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedVideo", "filling", "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        C8219i.f27144a.mo9271b(this.f50344r);
        TextView textView5 = this.f50344r;
        if (textView5 != null) {
            textView5.setShadowLayer(10.0f, 0.0f, 1.0f, this.f50872a.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
        }
        int i2 = C18508z2.f51415P;
        mo22931h(this.f50876e, i2);
        this.f50873b.f51445p.mo23101b(o0Var.mo25768r2());
        this.f50873b.f51445p.mo23109k(o0Var2.field_orderFlag, 0, this.f50888q, bj22.f63730g, this.f50877f, this.f50887p, i2, false, new C18214a(this), false, o0Var2.f55523h1);
        C40726l lVar = C40726l.f109414a;
        C77630j jVar = this.f50888q;
        lVar.mo63636e(jVar.f226326e, jVar.f226333o);
    }

    /* renamed from: b */
    public int mo22821b() {
        return this.f50346t;
    }

    /* renamed from: c */
    public int mo22822c() {
        return this.f50347u;
    }

    /* renamed from: d */
    public void mo22823d() {
        View view = this.f50875d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedVideo", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedVideo", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: g */
    public void mo22827g() {
        View view = this.f50875d;
        View view2 = null;
        this.f50344r = view != null ? (TextView) view.findViewById(C0966R.C0970id.hx8) : null;
        View view3 = this.f50875d;
        if (view3 != null) {
            view2 = view3.findViewById(C0966R.C0970id.hx9);
        }
        this.f50345s = view2;
    }
}
