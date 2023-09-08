package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j;
import com.tencent.p014mm.storage.C19623o0;
import fy0.C8219i;
import kw0.C46746a;
import s90.C77629i;
import s90.C77630j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.f4 */
public class C18245f4 extends C18349r3 {

    /* renamed from: B */
    public ImageView f50456B;

    /* renamed from: C */
    public RelativeLayout f50457C;

    /* renamed from: f */
    public void mo22848f(int i, C77630j jVar, C19623o0 o0Var, int i2, C77629i iVar, int i3) {
        C77630j jVar2 = jVar;
        C19623o0 o0Var2 = o0Var;
        super.mo22848f(i, jVar, o0Var, i2, iVar, i3);
        this.f50816x = i;
        this.f50817y = false;
        this.f50806n.setVisibility(8);
        RelativeLayout relativeLayout = this.f50457C;
        int i4 = C18508z2.f51412L;
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.height = i4;
        relativeLayout.setLayoutParams(layoutParams);
        ImageView imageView = this.f50456B;
        int i5 = C18508z2.f51412L;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.height = i5;
        imageView.setLayoutParams(layoutParams2);
        this.f50456B.setVisibility(0);
        this.f50811s.setTextColor(this.f50824c.getResources().getColor(C0966R.color.a18));
        this.f50815w.setBackgroundResource(C0966R.C0969drawable.ags);
        this.f50808p.setTextColor(this.f50824c.getResources().getColor(C0966R.color.a18));
        C18479j jVar3 = this.f50825d.f51445p;
        jVar3.getClass();
        C19623o0 o0Var3 = o0Var2;
        this.f50825d.f51445p.mo23109k(o0Var2.field_msgId, 0, jVar, jVar2.f226330i, this.f50456B, C46746a.f125826a.mo71973f(jVar3.f51309a) - C18508z2.f51418S, C18508z2.f51412L, false, new C18240e4(this, jVar2, o0Var2, i2), mo22916i(jVar2), this.f50804A);
        mo22880d(this.f50816x, jVar2, o0Var3);
        if (mo22917j(this.f50816x, jVar2)) {
            View view = this.f50827f;
            view.setPadding(view.getPaddingLeft(), 0, this.f50827f.getPaddingRight(), C18508z2.f51417R);
        } else {
            View view2 = this.f50827f;
            view2.setPadding(view2.getPaddingLeft(), 0, this.f50827f.getPaddingRight(), 0);
        }
        if (mo22916i(jVar2)) {
            this.f50806n.setBackgroundResource(C0966R.C0969drawable.f4585h1);
            this.f50827f.setBackgroundResource(C0966R.C0969drawable.f4588h4);
        } else {
            this.f50806n.setBackgroundResource(C0966R.C0969drawable.f4587h3);
            if (mo22917j(this.f50816x, jVar2)) {
                this.f50827f.setBackgroundResource(C0966R.C0969drawable.f4588h4);
            } else {
                this.f50827f.setBackgroundResource(C0966R.C0969drawable.f4595ha);
            }
        }
        if (!mo22917j(i, jVar)) {
            mo22920b(this.f50807o, this.f50808p, o0Var3, jVar2);
        }
        this.f50825d.mo23168z(jVar, o0Var, i2, iVar, this.f50827f, i > 1, 0);
    }

    /* renamed from: g */
    public void mo22825g(View view, C18508z2 z2Var) {
        ViewStub viewStub;
        this.f50824c = view.getContext();
        this.f50825d = z2Var;
        if (this.f50826e == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.l9n)) != null) {
            viewStub.inflate();
            this.f50826e = view.findViewById(C0966R.C0970id.adu);
            this.f50827f = view.findViewById(C0966R.C0970id.kqz);
            mo22915h();
            this.f50456B = (ImageView) this.f50826e.findViewById(C0966R.C0970id.bv8);
            this.f50457C = (RelativeLayout) this.f50826e.findViewById(C0966R.C0970id.bv9);
            this.f50811s = (MMNeat7extView) this.f50826e.findViewById(C0966R.C0970id.kpm);
            this.f50805m = (ImageView) this.f50826e.findViewById(C0966R.C0970id.bv_);
            this.f50806n = (ImageView) this.f50826e.findViewById(C0966R.C0970id.i1x);
            this.f50815w = (LinearLayout) this.f50826e.findViewById(C0966R.C0970id.aeq);
            this.f50812t = (LinearLayout) this.f50826e.findViewById(C0966R.C0970id.jmm);
            this.f50813u = (MMNeat7extView) this.f50826e.findViewById(C0966R.C0970id.jmk);
            this.f50814v = (MMNeat7extView) this.f50826e.findViewById(C0966R.C0970id.jmf);
            this.f50809q = this.f50826e.findViewById(C0966R.C0970id.k0r);
            this.f50810r = (TextView) this.f50826e.findViewById(C0966R.C0970id.efv);
            C8219i iVar = C8219i.f27144a;
        }
    }
}
