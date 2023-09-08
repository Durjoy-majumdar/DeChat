package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.storage.C19623o0;
import fy0.C8219i;
import gy3.C87412m;
import j20.C117292a;
import java.util.Arrays;
import k20.C60958c;
import k20.C9556a;
import te3.C22491bj2;
import te3.C51381td3;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.z */
public final class C18398z extends C18368v {

    /* renamed from: r */
    public int f51007r = 8;

    /* renamed from: s */
    public int f51008s = C0966R.C0970id.l9l;

    /* renamed from: t */
    public TextView f51009t;

    /* renamed from: u */
    public View f51010u;

    /* renamed from: v */
    public MMNeat7extView f51011v;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.z$a */
    public static final class C18399a implements C22906q.C22907a {
        public void onFinish() {
        }

        public void onStart() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18398z(Context context, C18508z2 z2Var) {
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
        C22491bj2 bj22 = o0Var2.f55539x1.f64172e.get(0).f64690e;
        C51381td3 td32 = bj22.f63737q;
        int i2 = td32 != null ? td32.f142137d : 0;
        if (i2 > 0) {
            TextView textView = this.f51009t;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f51009t;
            if (textView2 != null) {
                C51381td3 td33 = bj22.f63737q;
                textView2.setText(String.valueOf(td33 != null ? Integer.valueOf(td33.f142137d) : null));
            }
            View view3 = this.f51010u;
            if (view3 != null) {
                String string = this.f50872a.getResources().getString(C0966R.string.apy);
                C87412m.m108593f(string, "context.resources.getStr…z_timeline_msg_img_multi)");
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                view3.setContentDescription(format);
            }
        } else {
            TextView textView3 = this.f51009t;
            if (textView3 != null) {
                textView3.setText("");
            }
            TextView textView4 = this.f51009t;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            View view4 = this.f51010u;
            if (view4 != null) {
                view4.setContentDescription(this.f50872a.getResources().getString(C0966R.string.apz));
            }
        }
        int i3 = C18508z2.f51415P;
        mo22931h(this.f50876e, i3);
        this.f50873b.f51445p.mo23101b(o0Var.mo25768r2());
        this.f50873b.f51445p.mo23109k(o0Var2.field_orderFlag, 0, this.f50888q, bj22.f63730g, this.f50877f, this.f50887p, i3, false, new C18399a(), false, o0Var2.f55523h1);
        C8219i.f27144a.mo9272c(this.f51011v);
        MMNeat7extView mMNeat7extView = this.f51011v;
        if (mMNeat7extView != null) {
            mMNeat7extView.mo104279b(bj22.f63727d);
        }
    }

    /* renamed from: b */
    public int mo22821b() {
        return this.f51007r;
    }

    /* renamed from: c */
    public int mo22822c() {
        return this.f51008s;
    }

    /* renamed from: d */
    public void mo22823d() {
        View view = this.f50875d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedPic", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedPic", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22827g() {
        /*
            r3 = this;
            android.view.View r0 = r3.f50875d
            r1 = 0
            if (r0 == 0) goto L_0x000f
            r2 = 2131310976(0x7f093980, float:1.824028E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            r3.f51009t = r0
            android.view.View r0 = r3.f50875d
            if (r0 == 0) goto L_0x001e
            r2 = 2131311847(0x7f093ce7, float:1.8242046E38)
            android.view.View r0 = r0.findViewById(r2)
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            r3.f51010u = r0
            android.view.View r0 = r3.f50875d
            if (r0 == 0) goto L_0x002f
            r1 = 2131300539(0x7f0910bb, float:1.821911E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            com.tencent.mm.ui.widget.MMNeat7extView r1 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r1
        L_0x002f:
            r3.f51011v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18398z.mo22827g():void");
    }
}
