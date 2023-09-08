package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42043c;
import com.tencent.p014mm.plugin.game.model.C42056f0;
import com.tencent.p014mm.plugin.game.model.C42112t;
import com.tencent.p014mm.plugin.game.widget.AutoResizeTextView;
import com.tencent.p014mm.plugin.game.widget.GameTagListView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.TXLiveConstants;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import py1.C47589h;
import py1.C47626m1;
import py1.C47639o0;
import py1.C47693w0;
import qy1.C12934a;
import uy1.C52642c;
import uy1.C52645f;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameBestSellingItemView */
public class GameBestSellingItemView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public AutoResizeTextView f113642d;

    /* renamed from: e */
    public ImageView f113643e;

    /* renamed from: f */
    public TextView f113644f;

    /* renamed from: g */
    public GameTagListView f113645g;

    /* renamed from: h */
    public GameDownloadView f113646h;

    /* renamed from: i */
    public View f113647i;

    /* renamed from: j */
    public int f113648j;

    /* renamed from: n */
    public C47639o0 f113649n;

    /* renamed from: o */
    public C42043c f113650o;

    public GameBestSellingItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C47639o0 o0Var = this.f113649n;
        if (o0Var == null || Util.isNullOrNil(o0Var.f127896d.f127731i)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C40314g.m43487f(getContext(), 10, TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, this.f113650o.f113283e + 1, C52642c.m59002t(getContext(), this.f113649n.f127896d.f127731i, (String) null), this.f113649n.f127896d.f127726d, GameIndexListView.getSourceScene(), C12934a.m12382d(this.f113650o.f113282d.f128096f));
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113642d = (AutoResizeTextView) findViewById(C0966R.C0970id.emy);
        this.f113643e = (ImageView) findViewById(C0966R.C0970id.ekt);
        this.f113644f = (TextView) findViewById(C0966R.C0970id.emr);
        this.f113645g = (GameTagListView) findViewById(C0966R.C0970id.ke_);
        this.f113646h = (GameDownloadView) findViewById(C0966R.C0970id.ei6);
        this.f113647i = findViewById(C0966R.C0970id.jxn);
        this.f113648j = C52642c.m58990h(getContext()) - C76577a.m92151b(getContext(), 190);
        setOnClickListener(this);
    }

    public void setData(C42043c cVar) {
        C47693w0 w0Var;
        C47626m1 m1Var;
        C47589h hVar;
        if (cVar == null || (w0Var = cVar.f113282d) == null || (m1Var = w0Var.f128105r) == null || Util.isNullOrNil((List) m1Var.f127865d)) {
            setVisibility(8);
            return;
        }
        this.f113650o = cVar;
        C47639o0 o0Var = cVar.f113282d.f128105r.f127865d.get(cVar.f113283e);
        int i = cVar.f113283e + 1;
        if (o0Var == null || (hVar = o0Var.f127896d) == null) {
            setVisibility(8);
        } else {
            this.f113649n = o0Var;
            C42039b a = C42056f0.m45762a(hVar);
            a.f113254G1 = 10;
            a.f113255H1 = TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED;
            a.f113256I1 = this.f113650o.f113283e + 1;
            this.f113646h.setDownloadInfo(new C42112t(a));
            setVisibility(0);
            AutoResizeTextView autoResizeTextView = this.f113642d;
            autoResizeTextView.setText("" + i);
            if (i == 1) {
                this.f113642d.setTextColor(C52642c.m59005w("#EED157"));
            } else if (i == 2) {
                this.f113642d.setTextColor(C52642c.m59005w("#BDC5CB"));
            } else if (i == 3) {
                this.f113642d.setTextColor(C52642c.m59005w("#D4B897"));
            } else {
                this.f113642d.setTextColor(C52642c.m59005w("#B2B2B2"));
            }
            C52645f.m59023a().mo73592b(this.f113643e, o0Var.f127896d.f127726d, C76577a.m92156g(getContext()));
            this.f113644f.setText(o0Var.f127896d.f127728f);
            this.f113645g.mo5432a(o0Var.f127896d.f127725C, this.f113648j);
            if (Util.isNullOrNil((List) o0Var.f127897e) && o0Var.f127898f == null && o0Var.f127899g == null) {
                View view = this.f113647i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "setData", "(Lcom/tencent/mm/plugin/game/protobuf/Game;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "setData", "(Lcom/tencent/mm/plugin/game/protobuf/Game;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = this.f113647i;
                if (view3 instanceof ViewStub) {
                    this.f113647i = ((ViewStub) view3).inflate();
                }
                ((GameFeedSocialInfoView) this.f113647i.findViewById(C0966R.C0970id.enq)).setData(o0Var);
            }
        }
        if (!cVar.f113284f) {
            C12934a.m12380b(getContext(), 10, TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, cVar.f113283e + 1, 1, o0Var.f127896d.f127726d, GameIndexListView.getSourceScene(), C12934a.m12382d(cVar.f113282d.f128096f));
            cVar.f113284f = true;
        }
    }
}
