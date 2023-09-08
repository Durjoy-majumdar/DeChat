package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19623o0;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C22491bj2;
import te3.C22533wo3;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.y */
public final class C18385y extends C18368v {

    /* renamed from: r */
    public int f50945r = C0966R.C0970id.l9j;

    /* renamed from: s */
    public ImageView f50946s;

    /* renamed from: t */
    public ImageView f50947t;

    /* renamed from: u */
    public ImageView f50948u;

    /* renamed from: v */
    public final int f50949v;

    /* renamed from: w */
    public final int f50950w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18385y(Context context, C18508z2 z2Var) {
        super(context, z2Var);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(z2Var, "adapter");
        int i = this.f50887p;
        int i2 = C18508z2.f51423X;
        this.f50949v = (i - i2) / 3;
        this.f50950w = i2 * 10;
    }

    /* renamed from: a */
    public void mo22820a(C19623o0 o0Var, int i, View view, View view2) {
        C13598b0 b0Var;
        C19623o0 o0Var2 = o0Var;
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(view, "convertView");
        C87412m.m108594g(view2, "parent");
        super.mo22820a(o0Var, i, view, view2);
        View view3 = this.f50875d;
        if (view3 != null) {
            this.f50946s = (ImageView) view3.findViewById(C0966R.C0970id.iey);
            this.f50947t = (ImageView) view3.findViewById(C0966R.C0970id.iez);
            this.f50948u = (ImageView) view3.findViewById(C0966R.C0970id.f359014if0);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var != null) {
            int i2 = 0;
            C22491bj2 bj22 = o0Var2.f55539x1.f64172e.get(0).f64690e;
            MMNeat7extView mMNeat7extView = this.f50879h;
            if (mMNeat7extView != null) {
                mMNeat7extView.mo104279b(bj22.f63727d);
            }
            mo22931h(this.f50876e, -2);
            this.f50873b.f51445p.mo23101b(o0Var.mo25768r2());
            ImageView[] imageViewArr = {this.f50946s, this.f50947t, this.f50948u};
            LinkedList<String> linkedList = bj22.f63737q.f142138e;
            C87412m.m108593f(linkedList, "itemInfo.PictureInfo.PictureUrl");
            for (T next : C110818d0.m150947s0(linkedList, 3)) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str = (String) next;
                    this.f50888q.f226330i = str;
                    ImageView imageView = imageViewArr[i2];
                    C87412m.m108591d(imageView);
                    C87412m.m108593f(str, "url");
                    this.f50873b.f51445p.mo23109k(o0Var2.field_orderFlag, 0, this.f50888q, str, imageView, this.f50949v, this.f50950w, false, new C18379x(), false, o0Var2.f55523h1);
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: b */
    public int mo22821b() {
        return 0;
    }

    /* renamed from: c */
    public int mo22822c() {
        return this.f50945r;
    }

    /* renamed from: d */
    public void mo22823d() {
        View view = this.f50875d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedMultiPicArticle", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedMultiPicArticle", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public void mo22928e(C22491bj2 bj22) {
        C87412m.m108594g(bj22, "itemInfo");
        super.mo22928e(bj22);
        String str = bj22.f63732i;
        if (str != null) {
            this.f50888q.f226330i = str;
        }
    }

    /* renamed from: i */
    public boolean mo22932i(C22533wo3 wo32) {
        if (wo32 == null) {
            return false;
        }
        return C19613h1.m21041n(wo32);
    }
}
