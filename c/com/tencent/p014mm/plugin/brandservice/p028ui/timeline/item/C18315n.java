package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.happybubble.BubbleLayout;
import com.tencent.p014mm.p136ui.widget.happybubble.C19857a;
import com.tencent.p014mm.p136ui.widget.happybubble.LabelsView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19636w0;
import eb0.C20583z;
import eb0.C7622a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kw0.C46746a;
import ob0.C47350c;
import ob0.C89144l0;
import sx3.C36907w;
import sx3.C64197v;
import te3.C22491bj2;
import te3.C22508lo3;
import te3.C22533wo3;
import te3.C50157ko3;
import te3.C50992qo3;
import te3.C64546m72;
import te3.C64708sd;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.n */
public final class C18315n extends C19857a implements View.OnClickListener {

    /* renamed from: q */
    public final C19623o0 f50677q;

    /* renamed from: r */
    public final C18508z2 f50678r;

    /* renamed from: s */
    public final C18316a f50679s;

    /* renamed from: t */
    public final C22508lo3 f50680t;

    /* renamed from: u */
    public LinkedList<String> f50681u;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.n$a */
    public static final class C18316a {

        /* renamed from: a */
        public Button f50682a;

        /* renamed from: b */
        public LabelsView f50683b;

        public C18316a(View view) {
            C87412m.m108594g(view, "rootView");
            View findViewById = view.findViewById(C0966R.C0970id.hll);
            C87412m.m108593f(findViewById, "rootView.findViewById(R.id.ok_btn)");
            this.f50682a = (Button) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.ke8);
            C87412m.m108593f(findViewById2, "rootView.findViewById(R.id.tag_layout)");
            this.f50683b = (LabelsView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.abr);
            C87412m.m108593f(findViewById3, "rootView.findViewById(R.id.biz_rec_card_reason_tv)");
            ((TextView) findViewById3).getPaint().setFakeBoldText(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18315n(Context context, C19623o0 o0Var, C18508z2 z2Var, int i) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(z2Var, "adapter");
        this.f50677q = o0Var;
        this.f50678r = z2Var;
        C22508lo3 lo32 = o0Var.f55539x1;
        C87412m.m108593f(lo32, "info.recFeed");
        this.f50680t = lo32;
        int i2 = 0;
        this.f56546i = new C19857a.C19860d[]{C19857a.C19860d.BOTTOM, C19857a.C19860d.TOP};
        BubbleLayout bubbleLayout = new BubbleLayout(context, (AttributeSet) null);
        bubbleLayout.setBubbleColor(context.getResources().getColor(C0966R.color.BW_100));
        bubbleLayout.setBubbleRadius(C76577a.m92151b(context, 8));
        bubbleLayout.setShadowColor(0);
        bubbleLayout.setLookWidth(C76577a.m92151b(context, 14));
        bubbleLayout.setLookLength(C76577a.m92151b(context, 7));
        this.f56541d = bubbleLayout;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6621jy, (ViewGroup) null);
        C87412m.m108593f(inflate, "rootView");
        this.f50679s = new C18316a(inflate);
        View findViewById = inflate.findViewById(C0966R.C0970id.bsb);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.content_root_layout)");
        int f = C46746a.f125826a.mo71973f(context);
        int j = C76577a.m92159j(context);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.width = (f >= j ? j : f) - C76577a.m92151b(context, 82);
        findViewById.setLayoutParams(layoutParams);
        LinkedList<C18237e> linkedList = new LinkedList<>();
        LinkedList<String> linkedList2 = lo32.f64176i;
        if (linkedList2 != null) {
            for (T next : linkedList2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    linkedList.add(new C18237e((String) next, i2));
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        this.f50679s.f50683b.mo154537i(linkedList, C18319o.f50691a);
        this.f50679s.f50683b.mo154511a();
        this.f50679s.f50683b.setOnLabelClickListener(new C18325p(this));
        String str = "";
        for (C18237e eVar : linkedList) {
            if (!Util.isNullOrNil(str)) {
                str = str + '#';
            }
            str = str + eVar.f50429a;
        }
        this.f56542e = inflate;
        this.f50679s.f50682a.setOnClickListener(this);
    }

    public void dismiss() {
        LinkedList<String> linkedList = new LinkedList<>();
        List<C18237e> labels = this.f50679s.f50683b.getLabels();
        C87412m.m108593f(labels, "mViewHolder.labelsView.getLabels<BizRecCardTag>()");
        ArrayList<String> arrayList = new ArrayList<>(C36907w.m41090l(labels, 10));
        for (C18237e eVar : labels) {
            arrayList.add(eVar.f50429a);
        }
        for (String add : arrayList) {
            linkedList.add(add);
        }
        C20583z.C20584b bVar = C20583z.f57949a;
        C19623o0 o0Var = this.f50677q;
        LinkedList<String> linkedList2 = this.f50681u;
        C87412m.m108594g(o0Var, "info");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C50992qo3 qo32 = new C50992qo3();
        LinkedList<C50157ko3> linkedList3 = new LinkedList<>();
        qo32.f140440d = linkedList3;
        C50157ko3 ko32 = new C50157ko3();
        ko32.f136917f = linkedList2;
        ko32.f136918g = linkedList;
        ko32.f136915d = o0Var.f55539x1.f64171d;
        ko32.f136916e = o0Var.field_orderFlag;
        qo32.f140441e = C19636w0.f55626c;
        linkedList3.add(ko32);
        bVar2.f127066a = qo32;
        bVar2.f127067b = new C64546m72();
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/timeline/recommendfeedsfeedback";
        bVar2.f127069d = 5198;
        C89144l0.m111429e(bVar2.mo72403a(), C7622a0.f25906d, false);
        super.dismiss();
    }

    public void onClick(View view) {
        C18315n nVar;
        String str;
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecFeedNegativeDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view2, "v");
        if (view.getId() == C0966R.C0970id.hll) {
            LinkedList<String> linkedList = new LinkedList<>();
            List<C18237e> selectLabelDatas = this.f50679s.f50683b.getSelectLabelDatas();
            if (selectLabelDatas != null) {
                str = "";
                for (C18237e eVar : selectLabelDatas) {
                    if (!Util.isNullOrNil(str)) {
                        str = str + '#';
                    }
                    str = str + eVar.f50429a;
                    linkedList.add(eVar.f50429a);
                }
            } else {
                str = "";
            }
            this.f50681u = linkedList;
            int i = 0;
            C22533wo3 wo32 = this.f50680t.f64172e.get(0);
            C22491bj2 bj22 = wo32.f64690e;
            C64708sd sdVar = wo32.f64689d;
            if (!(bj22 == null || sdVar == null || Util.isNullOrNil(bj22.f63729f))) {
                String str2 = bj22.f63729f;
                C87412m.m108593f(str2, "appMsg.ContentUrl");
                String[] e = C19613h1.m21032e(str2);
                long j = Util.getLong(e[0], 0);
                int i2 = Util.getInt(e[1], 0);
                C18412m3 m3Var = this.f50678r.f51443n;
                String str3 = sdVar.f185413d;
                C22508lo3 lo32 = this.f50680t;
                String str4 = lo32.f64175h;
                int i3 = lo32.f64173f;
                String str5 = wo32.f64691f;
                int b = C19613h1.m21029b(this.f50677q);
                m3Var.getClass();
                C115669n.INSTANCE.mo160131h(15721, str3, Long.valueOf(j), 16, Integer.valueOf((int) (System.currentTimeMillis() / 1000)), Integer.valueOf(m3Var.f51069c), Integer.valueOf(i2), 0L, str, Integer.valueOf(b), 0, "", "", str4, 0, Integer.valueOf(i3), str5);
            }
            nVar = this;
            C18508z2 z2Var = nVar.f50678r;
            C19623o0 o0Var = nVar.f50677q;
            z2Var.getClass();
            C87412m.m108594g(o0Var, "info");
            Log.m105924i("MicroMsg.BizTimeLineAdapter", "onFeedBack");
            z2Var.mo23142g(o0Var);
            int indexOf = z2Var.f51440h.indexOf(o0Var);
            LinkedList linkedList2 = new LinkedList();
            for (T next : z2Var.f51440h) {
                int i4 = i + 1;
                if (i >= 0) {
                    C19623o0 o0Var2 = (C19623o0) next;
                    if (i > indexOf && o0Var2.field_isRead == 0) {
                        linkedList2.add(o0Var2);
                    }
                    i = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            if (!linkedList2.isEmpty()) {
                Log.m105924i("MicroMsg.BizTimeLineAdapter", "deleteUnExposeRecFeed size " + linkedList2.size());
                z2Var.f51440h.removeAll(linkedList2);
                z2Var.mo23163t(z2Var.getCount() + -1);
            }
            dismiss();
        } else {
            nVar = this;
        }
        C117292a.m165361g(nVar, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecFeedNegativeDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
