package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import ex0.C20642c;
import fy0.C20739g;
import fy0.C8219i;
import java.util.Map;
import s90.C77629i;
import s90.C77630j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.j4 */
public class C18302j4 extends C18349r3 {

    /* renamed from: B */
    public ImageView f50623B;

    /* renamed from: C */
    public TextView f50624C;

    /* renamed from: D */
    public MMNeat7extView f50625D;

    /* renamed from: E */
    public MMNeat7extView f50626E;

    /* renamed from: f */
    public void mo22848f(int i, C77630j jVar, C19623o0 o0Var, int i2, C77629i iVar, int i3) {
        C77630j jVar2 = jVar;
        C19623o0 o0Var2 = o0Var;
        super.mo22848f(i, jVar, o0Var, i2, iVar, i3);
        this.f50816x = i;
        this.f50817y = true;
        if (Util.isNullOrNil(jVar2.f226325d)) {
            this.f50625D.mo104279b(this.f50824c.getResources().getString(C0966R.string.ap8));
        } else {
            this.f50625D.setVisibility(0);
            this.f50625D.mo104279b(jVar2.f226325d);
        }
        if (Util.isNullOrNil(jVar2.f226332n) || this.f50816x != 1) {
            this.f50626E.setVisibility(8);
        } else {
            String str = jVar2.f226332n;
            Map<Long, Integer> map = C20739g.f58625a;
            String replaceAll = str != null ? str.replaceAll("(?m)^\\s*$(\\n|\\r\\n)", "") : null;
            this.f50626E.setVisibility(0);
            this.f50626E.setMaxLines(2);
            this.f50626E.setEllipsize(TextUtils.TruncateAt.END);
            this.f50626E.mo104279b(replaceAll);
        }
        String d = C92721n.m116876d(jVar2.f226335q);
        if (!TextUtils.isEmpty(d)) {
            this.f50624C.setVisibility(0);
            this.f50624C.setText(d);
        } else {
            this.f50624C.setVisibility(8);
        }
        Drawable drawable = this.f50623B.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            if (animationDrawable.isRunning()) {
                animationDrawable.stop();
            }
        }
        if ((o0Var2.field_msgId + "_" + 0).equals(C20739g.m22692d())) {
            this.f50623B.setImageResource(C0966R.C0969drawable.f4603hh);
            if (this.f50623B.getDrawable() instanceof AnimationDrawable) {
                ((AnimationDrawable) this.f50623B.getDrawable()).start();
            }
        } else {
            this.f50623B.setImageResource(C0966R.C0969drawable.f4601hg);
        }
        ImageView imageView = this.f50623B;
        ((C20642c) C86312j.m106911c(C20642c.class)).mo32314DF(imageView, o0Var2.field_msgId, jVar2.f226330i, o0Var2.field_content, 0);
        imageView.setOnClickListener(this.f50833l);
        mo22920b(this.f50807o, this.f50808p, o0Var2, jVar2);
        this.f50825d.mo23168z(jVar, o0Var, i2, iVar, this.f50827f, this.f50816x > 1, 0);
        if (this.f50816x == 1) {
            this.f50827f.setBackgroundResource(C0966R.C0969drawable.f4588h4);
        } else {
            this.f50827f.setBackgroundResource(C0966R.C0969drawable.f4595ha);
        }
        if (Util.isNullOrNil(jVar2.f226332n)) {
            View view = this.f50827f;
            view.setPadding(view.getPaddingLeft(), 0, this.f50827f.getPaddingRight(), C18508z2.f51417R);
            return;
        }
        View view2 = this.f50827f;
        view2.setPadding(view2.getPaddingLeft(), C18508z2.f51419T, this.f50827f.getPaddingRight(), C18508z2.f51417R);
    }

    /* renamed from: g */
    public void mo22825g(View view, C18508z2 z2Var) {
        ViewStub viewStub;
        this.f50824c = view.getContext();
        this.f50825d = z2Var;
        if (this.f50826e == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.l9q)) != null) {
            viewStub.inflate();
            this.f50826e = view.findViewById(C0966R.C0970id.adz);
            this.f50827f = view.findViewById(C0966R.C0970id.b5y);
            mo22915h();
            this.f50625D = (MMNeat7extView) this.f50826e.findViewById(C0966R.C0970id.kpm);
            this.f50624C = (TextView) this.f50826e.findViewById(C0966R.C0970id.hx8);
            this.f50623B = (ImageView) this.f50826e.findViewById(C0966R.C0970id.a8z);
            this.f50626E = (MMNeat7extView) this.f50826e.findViewById(C0966R.C0970id.ady);
            C8219i iVar = C8219i.f27144a;
        }
    }
}
