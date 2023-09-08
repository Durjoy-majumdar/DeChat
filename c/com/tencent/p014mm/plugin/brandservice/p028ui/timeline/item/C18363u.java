package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19623o0;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ky3.C88334c;
import te3.C22491bj2;
import te3.C22533wo3;
import wd3.C22906q;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.u */
public final class C18363u extends C18368v {

    /* renamed from: r */
    public int f50861r = C0966R.C0970id.l9i;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.u$a */
    public static final class C18364a implements C22906q.C22907a {
        public void onFinish() {
        }

        public void onStart() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18363u(Context context, C18508z2 z2Var) {
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
        boolean z = false;
        C22533wo3 wo32 = o0Var2.f55539x1.f64172e.get(0);
        C22491bj2 bj22 = wo32.f64690e;
        MMNeat7extView mMNeat7extView = this.f50879h;
        if (mMNeat7extView != null) {
            mMNeat7extView.mo104279b(bj22.f63727d);
        }
        C88334c cVar = C19613h1.f55490a;
        if (!(wo32.f64695j == 3) || Util.isNullOrNil(bj22.f63728e)) {
            MMNeat7extView mMNeat7extView2 = this.f50881j;
            if (mMNeat7extView2 != null) {
                mMNeat7extView2.setVisibility(8);
            }
            MMNeat7extView mMNeat7extView3 = this.f50881j;
            if (mMNeat7extView3 != null) {
                mMNeat7extView3.mo104279b("");
            }
        } else {
            MMNeat7extView mMNeat7extView4 = this.f50881j;
            if (mMNeat7extView4 != null) {
                mMNeat7extView4.setVisibility(0);
            }
            MMNeat7extView mMNeat7extView5 = this.f50881j;
            if (mMNeat7extView5 != null) {
                mMNeat7extView5.mo104279b(bj22.f63728e);
            }
        }
        int i2 = C18508z2.f51413M;
        mo22931h(this.f50876e, i2);
        String str = bj22.f63732i;
        if (str == null || C112551y.m153811k(str)) {
            z = true;
        }
        String str2 = z ? bj22.f63730g : bj22.f63732i;
        this.f50873b.f51445p.mo23101b(o0Var.mo25768r2());
        this.f50873b.f51445p.mo23109k(o0Var2.field_orderFlag, 0, this.f50888q, str2, this.f50877f, this.f50887p, i2, false, new C18364a(), false, o0Var2.f55523h1);
    }

    /* renamed from: b */
    public int mo22821b() {
        return 0;
    }

    /* renamed from: c */
    public int mo22822c() {
        return this.f50861r;
    }

    /* renamed from: d */
    public void mo22823d() {
        View view = this.f50875d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedArticle", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedArticle", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
}
