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
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19636w0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kw0.C46746a;
import rb0.C48009v0;
import te3.C64444ie0;
import te3.me4;
import te3.qe4;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.b */
public final class C18211b extends C19857a implements View.OnClickListener {

    /* renamed from: q */
    public final C19623o0 f50338q;

    /* renamed from: r */
    public final C18508z2 f50339r;

    /* renamed from: s */
    public final int f50340s;

    /* renamed from: t */
    public final C18212a f50341t;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.b$a */
    public static final class C18212a {

        /* renamed from: a */
        public Button f50342a;

        /* renamed from: b */
        public LabelsView f50343b;

        public C18212a(View view) {
            C87412m.m108594g(view, "rootView");
            View findViewById = view.findViewById(C0966R.C0970id.hll);
            C87412m.m108593f(findViewById, "rootView.findViewById(R.id.ok_btn)");
            this.f50342a = (Button) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.ke8);
            C87412m.m108593f(findViewById2, "rootView.findViewById(R.id.tag_layout)");
            this.f50343b = (LabelsView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.abr);
            C87412m.m108593f(findViewById3, "rootView.findViewById(R.id.biz_rec_card_reason_tv)");
            ((TextView) findViewById3).getPaint().setFakeBoldText(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18211b(Context context, C19623o0 o0Var, C18508z2 z2Var, int i) {
        super(context);
        me4 me4;
        qe4 qe4;
        C64444ie0 ie02;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(z2Var, "adapter");
        this.f50338q = o0Var;
        this.f50339r = z2Var;
        this.f50340s = i;
        this.f56546i = new C19857a.C19860d[]{C19857a.C19860d.BOTTOM, C19857a.C19860d.TOP};
        LinkedList<String> linkedList = null;
        BubbleLayout bubbleLayout = new BubbleLayout(context, (AttributeSet) null);
        bubbleLayout.setBubbleColor(context.getResources().getColor(C0966R.color.BW_100));
        bubbleLayout.setBubbleRadius(C76577a.m92151b(context, 8));
        bubbleLayout.setShadowColor(0);
        bubbleLayout.setLookWidth(C76577a.m92151b(context, 14));
        bubbleLayout.setLookLength(C76577a.m92151b(context, 7));
        this.f56541d = bubbleLayout;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6621jy, (ViewGroup) null);
        C87412m.m108593f(inflate, "rootView");
        this.f50341t = new C18212a(inflate);
        View findViewById = inflate.findViewById(C0966R.C0970id.bsb);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.content_root_layout)");
        int f = C46746a.f125826a.mo71973f(context);
        int j = C76577a.m92159j(context);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.width = (f >= j ? j : f) - C76577a.m92151b(context, 82);
        findViewById.setLayoutParams(layoutParams);
        ArrayList arrayList = new ArrayList();
        re4 x2 = o0Var.mo25774x2();
        if (!(x2 == null || (me4 = x2.f64515d) == null || (qe4 = me4.f64245j) == null || (ie02 = qe4.f185009e) == null)) {
            linkedList = ie02.f183682d;
        }
        re4 x25 = o0Var.mo25774x2();
        C87412m.m108591d(x25);
        LinkedList<String> linkedList2 = x25.f64520i;
        if (!Util.isNullOrNil((List) linkedList)) {
            C87412m.m108591d(linkedList);
            int size = linkedList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new C18237e(linkedList.get(i2), i2));
            }
        } else {
            int size2 = linkedList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList.add(new C18237e(linkedList2.get(i3), i3));
            }
        }
        this.f50341t.f50343b.mo154537i(arrayList, C18218c.f50360a);
        this.f50341t.f50343b.mo154511a();
        this.f50341t.f50343b.setOnLabelClickListener(new C18232d(this));
        Iterator it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            C18237e eVar = (C18237e) it.next();
            if (!Util.isNullOrNil(str)) {
                str = str + '#';
            }
            str = str + eVar.f50429a;
        }
        C115669n.INSTANCE.mo160131h(18644, o0Var.mo25773w2().f64240e.f64334d, Long.valueOf(o0Var.mo25774x2().f64519h), str, Integer.valueOf(C19636w0.f55626c), Integer.valueOf(this.f50340s));
        this.f56542e = inflate;
        this.f50341t.f50342a.setOnClickListener(this);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardOperateDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "v");
        if (view.getId() == C0966R.C0970id.hll) {
            List<C18237e> selectLabelDatas = this.f50341t.f50343b.getSelectLabelDatas();
            String str = "";
            if (selectLabelDatas != null) {
                for (C18237e eVar : selectLabelDatas) {
                    if (!Util.isNullOrNil(str)) {
                        str = str + '#';
                    }
                    str = str + eVar.f50429a;
                }
            }
            C18412m3 m3Var = this.f50339r.f51443n;
            String str2 = this.f50338q.mo25773w2().f64240e.f64334d;
            long j = this.f50338q.mo25774x2().f64519h;
            m3Var.getClass();
            C115669n.INSTANCE.mo160131h(15721, str2, 0L, 17, Integer.valueOf((int) (System.currentTimeMillis() / 1000)), Integer.valueOf(m3Var.f51069c), 0, Long.valueOf(j), str, 1, 0);
            C48009v0.Jx0().mo25785Lo(this.f50338q.field_msgId);
            dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardOperateDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
