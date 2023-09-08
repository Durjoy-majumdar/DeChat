package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.neattextview.textview.layout.NeatLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C29763t;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import de3.C107029o;
import de3.C75355a0;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import kg3.C76577a;
import p629ny.C76979h;
import s90.C77629i;
import s90.C77630j;
import yr3.C79150a;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.g4 */
public class C18249g4 extends C18349r3 {

    /* renamed from: B */
    public TextView f50467B;

    /* renamed from: C */
    public MMNeat7extView f50468C;

    /* renamed from: D */
    public LinearLayout f50469D;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.g4$a */
    public class C18250a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77630j f50470d;

        public C18250a(C77630j jVar) {
            this.f50470d = jVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineTopTextSlot$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (((HashSet) C18249g4.this.f50825d.f51451v).contains(this.f50470d)) {
                C18249g4.this.f50468C.setMaxLines(3);
                C18249g4.this.f50467B.setText(C0966R.string.ap4);
                ((HashSet) C18249g4.this.f50825d.f51451v).remove(this.f50470d);
            } else {
                C18249g4.this.f50468C.setMaxLines(Integer.MAX_VALUE);
                C18249g4.this.f50467B.setText(C0966R.string.f360192ap3);
                ((HashSet) C18249g4.this.f50825d.f51451v).add(this.f50470d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineTopTextSlot$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: f */
    public void mo22848f(int i, C77630j jVar, C19623o0 o0Var, int i2, C77629i iVar, int i3) {
        C77630j jVar2 = jVar;
        C19623o0 o0Var2 = o0Var;
        super.mo22848f(i, jVar, o0Var, i2, iVar, i3);
        o0Var2.f55518c1 = C29763t.m38871b(o0Var2.field_talker);
        if (Util.isNullOrNil(jVar2.f226325d)) {
            this.f50468C.mo104279b("");
            this.f50468C.setVisibility(8);
        } else {
            this.f50468C.setVisibility(0);
            this.f50468C.mo104279b(((C76979h) C86312j.m106911c(C76979h.class)).mo107081qu(this.f50824c, jVar2.f226325d, (int) this.f50468C.getTextSize()));
        }
        C79150a i4 = this.f50468C.mo154990i(C76577a.m92145A(this.f50824c) - C76577a.m92151b(this.f50824c, 72), Integer.MAX_VALUE);
        int i5 = i4 != null ? ((NeatLayout) i4).f319992L : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f50468C.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f50469D.getLayoutParams();
        if (i5 <= 3) {
            this.f50467B.setVisibility(8);
            layoutParams2.gravity = 16;
            this.f50469D.setLayoutParams(layoutParams2);
            layoutParams.topMargin = 0;
            layoutParams.gravity = 17;
            this.f50468C.setMaxLines(3);
        } else {
            boolean contains = ((HashSet) this.f50825d.f51451v).contains(jVar);
            this.f50467B.setVisibility(0);
            layoutParams2.gravity = 48;
            this.f50469D.setLayoutParams(layoutParams2);
            layoutParams.topMargin = C76577a.m92151b(this.f50824c, 12);
            layoutParams.gravity = 8388627;
            if (contains) {
                this.f50468C.setMaxLines(Integer.MAX_VALUE);
                this.f50467B.setText(C0966R.string.f360192ap3);
            } else {
                this.f50468C.setMaxLines(3);
                this.f50467B.setText(C0966R.string.ap4);
            }
            this.f50467B.setOnClickListener(new C18250a(jVar));
        }
        this.f50468C.setLayoutParams(layoutParams);
        this.f50827f.setBackgroundResource(C0966R.C0969drawable.f4588h4);
        mo22920b(this.f50807o, this.f50808p, o0Var, jVar);
        this.f50825d.mo23168z(jVar, o0Var, i2, iVar, this.f50827f, i > 1, 0);
    }

    /* renamed from: g */
    public void mo22825g(View view, C18508z2 z2Var) {
        ViewStub viewStub;
        this.f50824c = view.getContext();
        this.f50825d = z2Var;
        if (this.f50826e == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.l9o)) != null) {
            viewStub.inflate();
            this.f50826e = view.findViewById(C0966R.C0970id.b5t);
            this.f50827f = view.findViewById(C0966R.C0970id.b5u);
            mo22915h();
            MMNeat7extView mMNeat7extView = (MMNeat7extView) view.findViewById(C0966R.C0970id.aek);
            this.f50468C = mMNeat7extView;
            mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(this.f50468C.getContext())));
            this.f50467B = (TextView) view.findViewById(C0966R.C0970id.ael);
            this.f50469D = (LinearLayout) view.findViewById(C0966R.C0970id.kib);
        }
    }
}
