package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import ex0.C20642c;
import fy0.C20739g;
import fy0.C8219i;
import s90.C77629i;
import s90.C77630j;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.z3 */
public class C18404z3 extends C18349r3 {

    /* renamed from: B */
    public TextView f51045B;

    /* renamed from: C */
    public ImageView f51046C;

    /* renamed from: D */
    public ImageView f51047D;

    /* renamed from: E */
    public ImageView f51048E;

    /* renamed from: F */
    public MMNeat7extView f51049F;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.z3$a */
    public class C18405a implements C22906q.C22907a {

        /* renamed from: a */
        public final /* synthetic */ C19623o0 f51050a;

        /* renamed from: b */
        public final /* synthetic */ int f51051b;

        public C18405a(C19623o0 o0Var, int i) {
            this.f51050a = o0Var;
            this.f51051b = i;
        }

        public void onFinish() {
            C18404z3.this.f50805m.setVisibility(0);
            if ((this.f51050a.field_msgId + "_" + 0).equals(C20739g.m22692d())) {
                C18404z3.this.f51047D.setImageResource(C0966R.C0969drawable.f4770mf);
            } else {
                C18404z3.this.f51047D.setImageResource(C0966R.C0969drawable.f4771mg);
            }
            C18404z3.this.f50825d.f51445p.mo23110l(this.f51050a.field_msgId, this.f51051b);
        }

        public void onStart() {
        }
    }

    /* renamed from: f */
    public void mo22848f(int i, C77630j jVar, C19623o0 o0Var, int i2, C77629i iVar, int i3) {
        int i4 = i;
        C77630j jVar2 = jVar;
        C19623o0 o0Var2 = o0Var;
        super.mo22848f(i, jVar, o0Var, i2, iVar, i3);
        if (Util.isNullOrNil(jVar2.f226325d)) {
            this.f51049F.setVisibility(8);
        } else {
            this.f51049F.setVisibility(0);
            this.f51049F.mo104279b(jVar2.f226325d);
        }
        if (!TextUtils.isEmpty(jVar2.f226309A)) {
            this.f51045B.setVisibility(0);
            this.f51045B.setText(jVar2.f226309A);
        } else {
            this.f51045B.setVisibility(8);
        }
        if (jVar2.f226310B == 2) {
            this.f51048E.setImageResource(C0966R.raw.chatting_item_biz_kugou_music_watermark);
        } else {
            this.f51048E.setImageResource(C0966R.raw.chatting_item_biz_qq_music_watermark);
        }
        ImageView imageView = this.f51047D;
        ((C20642c) C86312j.m106911c(C20642c.class)).mo32314DF(imageView, o0Var2.field_msgId, jVar2.f226330i, o0Var2.field_content, 0);
        imageView.setOnClickListener(this.f50833l);
        mo22920b(this.f50807o, this.f50808p, o0Var2, jVar2);
        this.f50825d.mo23168z(jVar, o0Var, i2, iVar, this.f50827f, i4 > 1, 0);
        if ((o0Var2.field_msgId + "_" + 0).equals(C20739g.m22692d())) {
            this.f51047D.setImageResource(C0966R.raw.chatting_item_biz_music_pause_loading_icon);
        } else {
            this.f51047D.setImageResource(C0966R.raw.chatting_item_biz_music_play_loading_icon);
        }
        this.f50805m.setVisibility(8);
        C18479j jVar3 = this.f50825d.f51445p;
        long j = o0Var2.field_msgId;
        String str = jVar2.f226330i;
        ImageView imageView2 = this.f51046C;
        int i5 = C18508z2.f51416Q;
        jVar3.mo23107i(j, 0, jVar, str, imageView2, i5, i5, false, new C18405a(o0Var2, i2), i3, 2.0f);
        if (i4 == 1) {
            this.f50827f.setBackgroundResource(C0966R.C0969drawable.f4789mz);
        } else {
            this.f50827f.setBackgroundResource(C0966R.C0969drawable.f4790n0);
        }
        View view = this.f50827f;
        if (i4 > 1) {
            int i6 = C18508z2.f51418S;
            view.setPadding(i6, i6, i6, i6);
            return;
        }
        int i7 = C18508z2.f51418S;
        view.setPadding(i7, i7, i7, C18508z2.f51417R);
    }

    /* renamed from: g */
    public void mo22825g(View view, C18508z2 z2Var) {
        ViewStub viewStub;
        this.f50824c = view.getContext();
        this.f50825d = z2Var;
        if (this.f50826e == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.l9k)) != null) {
            viewStub.inflate();
            this.f50826e = view.findViewById(C0966R.C0970id.adq);
            this.f50827f = view.findViewById(C0966R.C0970id.b5q);
            mo22915h();
            this.f51046C = (ImageView) this.f50826e.findViewById(C0966R.C0970id.buo);
            this.f51049F = (MMNeat7extView) this.f50826e.findViewById(C0966R.C0970id.kpm);
            this.f51045B = (TextView) this.f50826e.findViewById(C0966R.C0970id.hxq);
            this.f51047D = (ImageView) this.f50826e.findViewById(C0966R.C0970id.f358928hx1);
            this.f51048E = (ImageView) this.f50826e.findViewById(C0966R.C0970id.lkn);
            this.f50805m = (ImageView) this.f50826e.findViewById(C0966R.C0970id.bv_);
            C8219i iVar = C8219i.f27144a;
        }
    }
}
