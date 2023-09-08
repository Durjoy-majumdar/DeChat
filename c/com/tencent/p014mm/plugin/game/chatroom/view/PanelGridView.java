package com.tencent.p014mm.plugin.game.chatroom.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Panel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p140cw.C7138g;
import rx3.C13598b0;
import uy1.C52645f;
import yw1.C53601h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/chatroom/view/PanelGridView;", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView;", "", "Lcom/tencent/mm/plugin/game/autogen/chatroom/Panel;", "panel_list", "Lrx3/b0;", "setData", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "game-chatroom_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.chatroom.view.PanelGridView */
public final class PanelGridView extends MRecyclerView {

    /* renamed from: C1 */
    public long f112626C1;

    /* renamed from: D1 */
    public long f112627D1;

    /* renamed from: E1 */
    public C32224a<C13598b0> f112628E1;

    /* renamed from: F1 */
    public C41787a f112629F1;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.PanelGridView$b */
    public static final class C4436b extends RecyclerView.C0129l {

        /* renamed from: d */
        public int f19170d;

        /* renamed from: e */
        public int f19171e;

        public C4436b(int i) {
            this.f19170d = i;
            this.f19171e = i;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            C87412m.m108591d(gridLayoutManager);
            int i = gridLayoutManager.f44669w;
            recyclerView.mo17029N0(view);
            int i2 = ((GridLayoutManager.LayoutParams) layoutParams).f44673h;
            int i3 = i - 1;
            int i4 = this.f19171e;
            int i5 = ((this.f19170d * i3) + (i4 * 2)) / i;
            int i6 = ((((i5 - i4) - i4) * i2) / i3) + i4;
            rect.set(i6, 0, i5 - i6, 0);
            Log.m105919d("MicroMsg.PanelGridView", "getItemOffsets, spanCount = %d, index = %d, left = %d, right = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(rect.left), Integer.valueOf(rect.right));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.PanelGridView$a */
    public final class C41787a extends RecyclerView.C16613e<C41788c> {

        /* renamed from: d */
        public Context f112630d;

        /* renamed from: e */
        public ArrayList<Panel> f112631e = new ArrayList<>();

        /* renamed from: f */
        public final /* synthetic */ PanelGridView f112632f;

        public C41787a(PanelGridView panelGridView, Context context) {
            C87412m.m108594g(context, "context");
            this.f112632f = panelGridView;
            this.f112630d = context;
        }

        public int getItemCount() {
            return this.f112631e.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C41788c cVar = (C41788c) zVar;
            C87412m.m108594g(cVar, "holder");
            if (i < this.f112631e.size()) {
                Panel panel = this.f112631e.get(i);
                C87412m.m108593f(panel, "panelList[position]");
                Panel panel2 = panel;
                cVar.f112636z = panel2;
                C52645f.m59023a().mo73595e(cVar.f112633A, panel2.icon, (C52645f.C52650d) null, (C52645f.C52652e) null);
                cVar.f112634B.setText(panel2.desc);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            PanelGridView panelGridView = this.f112632f;
            View inflate = LayoutInflater.from(this.f112630d).inflate(C0966R.C0971layout.cjz, viewGroup, false);
            C87412m.m108593f(inflate, "from(context).inflate(R.…anel_item, parent, false)");
            return new C41788c(panelGridView, inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.PanelGridView$c */
    public final class C41788c extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f112633A;

        /* renamed from: B */
        public TextView f112634B;

        /* renamed from: C */
        public final /* synthetic */ PanelGridView f112635C;

        /* renamed from: z */
        public Panel f112636z;

        /* renamed from: com.tencent.mm.plugin.game.chatroom.view.PanelGridView$c$a */
        public static final class C41789a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C41788c f112637d;

            /* renamed from: e */
            public final /* synthetic */ View f112638e;

            /* renamed from: f */
            public final /* synthetic */ PanelGridView f112639f;

            public C41789a(C41788c cVar, View view, PanelGridView panelGridView) {
                this.f112637d = cVar;
                this.f112638e = view;
                this.f112639f = panelGridView;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/PanelGridView$PanelViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C41788c cVar = this.f112637d;
                Panel panel = cVar.f112636z;
                if (panel != null) {
                    View view2 = this.f112638e;
                    PanelGridView panelGridView = this.f112639f;
                    int i = panel.type;
                    if (i == 1) {
                        JumpInfo jumpInfo = panel.jump_info;
                        if (jumpInfo != null) {
                            C53601h.m60129h(view2.getContext(), jumpInfo);
                            String str = panel.desc;
                            String str2 = str == null ? "" : str;
                            cVar.getClass();
                            int i2 = jumpInfo.jump_type;
                            if (i2 == 1) {
                                C40308d.C40309a aVar = C40308d.f108375a;
                                long j = (long) (cVar.mo17363j() + 1);
                                PanelGridView panelGridView2 = cVar.f112635C;
                                aVar.mo62993c(j, 7, panelGridView2.f112626C1, panelGridView2.f112627D1, str2);
                            } else if (i2 == 2) {
                                C40308d.C40309a aVar2 = C40308d.f108375a;
                                long j2 = (long) (cVar.mo17363j() + 1);
                                PanelGridView panelGridView3 = cVar.f112635C;
                                aVar2.mo62993c(j2, 28, panelGridView3.f112626C1, panelGridView3.f112627D1, str2);
                            }
                        }
                    } else if (i == 2) {
                        Context context = view2.getContext();
                        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                        ((C7138g) C86312j.m106911c(C7138g.class)).mo8311H7((Activity) context, 14, 1, 15, (Intent) null);
                    }
                    C40308d.C40309a aVar3 = C40308d.f108375a;
                    long j3 = (long) (cVar.mo17363j() + 1);
                    long j4 = panelGridView.f112626C1;
                    long j5 = panelGridView.f112627D1;
                    String str3 = panel.desc;
                    aVar3.mo62993c(j3, 2, j4, j5, str3 == null ? "" : str3);
                    C32224a<C13598b0> aVar4 = panelGridView.f112628E1;
                    if (aVar4 != null) {
                        aVar4.invoke();
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/PanelGridView$PanelViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41788c(PanelGridView panelGridView, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f112635C = panelGridView;
            View findViewById = view.findViewById(C0966R.C0970id.lwh);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.panel_icon)");
            this.f112633A = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.lwi);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.panel_title)");
            this.f112634B = (TextView) findViewById2;
            view.setOnClickListener(new C41789a(this, view, panelGridView));
        }
    }

    public PanelGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f112629F1 = new C41787a(this, context2);
        mo65578B1();
    }

    /* renamed from: B1 */
    public final void mo65578B1() {
        setLayoutManager(new GridLayoutManager(getContext(), 4));
        mo17085h0(new C4436b((MMApplicationContext.getContext().getResources().getDisplayMetrics().widthPixels - (getContext().getResources().getDimensionPixelSize(C0966R.dimen.f357008av3) * 4)) / 5));
        setAdapter(this.f112629F1);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDimensionPixelSize(C0966R.dimen.f357007av2), Integer.MIN_VALUE) * 2);
    }

    public final void setData(List<Panel> list) {
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                C41787a aVar = this.f112629F1;
                aVar.getClass();
                list.isEmpty();
                aVar.f112631e.addAll(list);
                aVar.notifyDataSetChanged();
            }
        }
    }

    public PanelGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f112629F1 = new C41787a(this, context2);
        mo65578B1();
    }
}
