package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C29763t;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l;
import com.tencent.p014mm.storage.C19623o0;
import fy0.C8219i;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kw0.C46746a;
import s90.C77629i;
import s90.C77630j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.i4 */
public class C18294i4 extends C18349r3 {

    /* renamed from: B */
    public TextView f50596B;

    /* renamed from: C */
    public View f50597C;

    /* renamed from: D */
    public View f50598D;

    /* renamed from: E */
    public View f50599E;

    /* renamed from: F */
    public View f50600F;

    /* renamed from: G */
    public ImageView f50601G;

    /* renamed from: d */
    public void mo22880d(int i, C77630j jVar, C19623o0 o0Var) {
        super.mo22880d(i, jVar, o0Var);
        MMNeat7extView mMNeat7extView = this.f50811s;
        if (mMNeat7extView != null && mMNeat7extView.getVisibility() == 0) {
            if (C76577a.m92165p(this.f50824c) >= 1.125f) {
                this.f50811s.setMaxLines(1);
            } else {
                this.f50811s.setMaxLines(2);
            }
        }
    }

    /* renamed from: f */
    public void mo22848f(int i, C77630j jVar, C19623o0 o0Var, int i2, C77629i iVar, int i3) {
        int i4;
        float f;
        int i5;
        C77630j jVar2 = jVar;
        C19623o0 o0Var2 = o0Var;
        super.mo22848f(i, jVar, o0Var, i2, iVar, i3);
        String str = jVar2.f226315G;
        this.f50816x = i;
        this.f50817y = false;
        this.f50806n.setVisibility(8);
        o0Var2.f55518c1 = C29763t.m38871b(o0Var2.field_talker);
        View view = this.f50598D;
        int i6 = C18508z2.f51414N;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i6;
        view.setLayoutParams(layoutParams);
        String d = C92721n.m116876d(jVar2.f226335q);
        if (!TextUtils.isEmpty(d)) {
            View view2 = this.f50597C;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineTopVideoSlot", "fillPlayTime", "(Lcom/tencent/mm/message/BizReaderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineTopVideoSlot", "fillPlayTime", "(Lcom/tencent/mm/message/BizReaderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f50596B.setVisibility(0);
            this.f50596B.setText(d);
            this.f50596B.setTextColor(this.f50824c.getResources().getColor(C0966R.color.a18));
        } else {
            this.f50596B.setText("");
            View view3 = this.f50597C;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineTopVideoSlot", "fillPlayTime", "(Lcom/tencent/mm/message/BizReaderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineTopVideoSlot", "fillPlayTime", "(Lcom/tencent/mm/message/BizReaderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f50596B.setVisibility(8);
        }
        this.f50596B.setShadowLayer(10.0f, 0.0f, 1.0f, this.f50824c.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
        this.f50601G.setVisibility(0);
        this.f50811s.setTextColor(this.f50824c.getResources().getColor(C0966R.color.a18));
        this.f50600F.setBackgroundResource(C0966R.C0969drawable.ags);
        this.f50808p.setTextColor(this.f50824c.getResources().getColor(C0966R.color.a18));
        C18479j jVar3 = this.f50825d.f51445p;
        jVar3.getClass();
        this.f50825d.f51445p.mo23109k(o0Var2.field_msgId, 0, jVar, jVar2.f226330i, this.f50601G, C46746a.f125826a.mo71973f(jVar3.f51309a) - C18508z2.f51418S, C18508z2.f51414N, false, new C18287h4(this, o0Var2, i2), false, this.f50804A);
        mo22880d(this.f50816x, jVar2, o0Var2);
        if (this.f50811s.getVisibility() == 0) {
            i4 = 0;
            this.f50811s.measure(C76577a.m92145A(this.f50824c) - C76577a.m92151b(this.f50824c, 48), 0);
            i5 = (this.f50598D.getLayoutParams().height - this.f50811s.getMeasuredHeight()) - C18508z2.f51423X;
            f = 0.56f;
        } else {
            i4 = 0;
            i5 = this.f50598D.getLayoutParams().height;
            f = 0.5f;
        }
        View view4 = this.f50599E;
        if (view4 != null) {
            ((RelativeLayout.LayoutParams) view4.getLayoutParams()).topMargin = (int) ((((float) i5) * f) - ((float) (C76577a.m92151b(this.f50824c, 48) / 2)));
        }
        C40726l.f109414a.mo63636e(jVar2.f226326e, jVar2.f226333o);
        if (!mo22917j(i, jVar)) {
            mo22920b(this.f50807o, this.f50808p, o0Var2, jVar2);
        }
        this.f50825d.mo23168z(jVar, o0Var, i2, iVar, this.f50827f, this.f50816x > 1, 0);
        if (this.f50816x == 1) {
            this.f50827f.setBackgroundResource(C0966R.C0969drawable.f4588h4);
            View view5 = this.f50827f;
            view5.setPadding(view5.getPaddingLeft(), i4, this.f50827f.getPaddingRight(), C18508z2.f51417R);
        } else {
            this.f50827f.setBackgroundResource(C0966R.C0969drawable.f4595ha);
            View view6 = this.f50827f;
            view6.setPadding(view6.getPaddingLeft(), i4, this.f50827f.getPaddingRight(), i4);
        }
        this.f50806n.setBackgroundResource(C0966R.C0969drawable.f4587h3);
    }

    /* renamed from: g */
    public void mo22825g(View view, C18508z2 z2Var) {
        ViewStub viewStub;
        this.f50824c = view.getContext();
        this.f50825d = z2Var;
        if (this.f50826e == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.l9p)) != null) {
            viewStub.inflate();
            this.f50826e = view.findViewById(C0966R.C0970id.adw);
            this.f50827f = view.findViewById(C0966R.C0970id.b5w);
            mo22915h();
            this.f50601G = (ImageView) this.f50826e.findViewById(C0966R.C0970id.buo);
            ImageView imageView = (ImageView) this.f50826e.findViewById(C0966R.C0970id.l5y);
            this.f50811s = (MMNeat7extView) this.f50826e.findViewById(C0966R.C0970id.kpm);
            this.f50596B = (TextView) this.f50826e.findViewById(C0966R.C0970id.hx8);
            this.f50597C = this.f50826e.findViewById(C0966R.C0970id.hx9);
            this.f50598D = this.f50826e.findViewById(C0966R.C0970id.b9b);
            this.f50806n = (ImageView) this.f50826e.findViewById(C0966R.C0970id.i1x);
            this.f50599E = this.f50826e.findViewById(C0966R.C0970id.l5z);
            this.f50600F = this.f50826e.findViewById(C0966R.C0970id.mae);
            this.f50812t = (LinearLayout) this.f50826e.findViewById(C0966R.C0970id.jmn);
            this.f50813u = (MMNeat7extView) this.f50826e.findViewById(C0966R.C0970id.jmk);
            this.f50814v = (MMNeat7extView) this.f50826e.findViewById(C0966R.C0970id.jmf);
            this.f50809q = this.f50826e.findViewById(C0966R.C0970id.k0r);
            this.f50810r = (TextView) this.f50826e.findViewById(C0966R.C0970id.efv);
            C8219i iVar = C8219i.f27144a;
        }
    }
}
