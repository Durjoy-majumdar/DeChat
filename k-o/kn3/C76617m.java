package kn3;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.anim.content.AnimTextView;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C45612m0;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import hk3.C76227e;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l31.C61212e;
import ln3.C76719m;
import mn3.C76800l;
import nj3.C11184p0;
import nj3.C76912y0;
import on3.C77029o;
import su0.C13781a;
import z04.C112551y;
import zj3.C79368l;

/* renamed from: kn3.m */
public final class C76617m extends C61118a<C76719m> {

    /* renamed from: h */
    public static WeakReference<AnimTextView> f224237h;

    /* renamed from: e */
    public final C67391b f224238e;

    /* renamed from: f */
    public final ChatTipsBarGroup.C74825d f224239f;

    /* renamed from: g */
    public final C76800l f224240g;

    /* renamed from: kn3.m$a */
    public static final class C76618a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76617m f224241d;

        /* renamed from: e */
        public final /* synthetic */ AnimTextView f224242e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f224243f;

        /* renamed from: g */
        public final /* synthetic */ C76719m f224244g;

        public C76618a(C76617m mVar, AnimTextView animTextView, C60905o oVar, C76719m mVar2) {
            this.f224241d = mVar;
            this.f224242e = animTextView;
            this.f224243f = oVar;
            this.f224244g = mVar2;
        }

        public final void onClick(View view) {
            AnimTextView animTextView;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76617m mVar = this.f224241d;
            AnimTextView animTextView2 = this.f224242e;
            C87412m.m108593f(animTextView2, "tvCancel");
            if (!mVar.mo106866m(animTextView2)) {
                C76617m mVar2 = this.f224241d;
                AnimTextView animTextView3 = this.f224242e;
                C87412m.m108593f(animTextView3, "tvCancel");
                mVar2.getClass();
                if (!mVar2.mo106866m(animTextView3)) {
                    String string = animTextView3.getContext().getResources().getString(C0966R.string.mio);
                    C87412m.m108593f(string, "context.resources.getStr…_bar_top_msg_cancel_real)");
                    int h = C76577a.m92157h(animTextView3.getContext(), C0966R.dimen.f3723cd);
                    int color = animTextView3.getContext().getResources().getColor(C0966R.color.f3133gi);
                    animTextView3.f214693g = string;
                    animTextView3.f214694h = color;
                    animTextView3.f214695i = h;
                    animTextView3.f214696j = h;
                    animTextView3.f214697n = C0966R.C0969drawable.b_k;
                    animTextView3.f214698o = true;
                    animTextView3.f214699p = 200;
                    animTextView3.mo101572a(true);
                    animTextView3.setTag(Boolean.TRUE);
                }
                mVar2.mo106868o(animTextView3);
                WeakReference<AnimTextView> weakReference = C76617m.f224237h;
                if (!(weakReference == null || (animTextView = weakReference.get()) == null)) {
                    AnimTextView animTextView4 = this.f224242e;
                    C76617m mVar3 = this.f224241d;
                    if (!C87412m.m108589b(animTextView, animTextView4)) {
                        mVar3.mo106865l(animTextView, true);
                    }
                }
                C76617m.f224237h = new WeakReference<>(this.f224242e);
            } else {
                Context context = this.f224243f.f44854d.getContext();
                C87412m.m108593f(context, "holder.itemView.context");
                ((C77029o) C86312j.m106911c(C77029o.class)).wx0(context, 2, this.f224244g.f224452u, (C72963f4) null);
                this.f224244g.f224436e = 4;
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kn3.m$b */
    public static final class C76619b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76617m f224245d;

        /* renamed from: e */
        public final /* synthetic */ AnimTextView f224246e;

        /* renamed from: f */
        public final /* synthetic */ C76719m f224247f;

        /* renamed from: g */
        public final /* synthetic */ C60905o f224248g;

        public C76619b(C76617m mVar, AnimTextView animTextView, C76719m mVar2, C60905o oVar) {
            this.f224245d = mVar;
            this.f224246e = animTextView;
            this.f224247f = mVar2;
            this.f224248g = oVar;
        }

        public final void onClick(View view) {
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76617m mVar = this.f224245d;
            AnimTextView animTextView = this.f224246e;
            C87412m.m108593f(animTextView, "tvCancel");
            if (mVar.mo106866m(animTextView)) {
                C76617m mVar2 = this.f224245d;
                AnimTextView animTextView2 = this.f224246e;
                C87412m.m108593f(animTextView2, "tvCancel");
                mVar2.mo106865l(animTextView2, true);
                C117292a.m165361g(this, "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30("msginfo@fakeuser", this.f224247f.f224452u.mo108716n2().f183488f);
            boolean z = !C45612m0.m50674A(this.f224245d.f224238e.mo91577r(), C13781a.m13082a());
            if ((h302.getMsgId() == 0 || h302.getType() == 268445456) ? false : true) {
                C76617m mVar3 = this.f224245d;
                C87412m.m108593f(view2, "clickView");
                ((C79368l) mVar3.f224238e.f193278b.mo102812a(C79368l.class)).mo108214y2(h302.getMsgId(), false, true, true, C76577a.m92151b(mVar3.f224238e.mo91565f(), 120), true, C76227e.C76228a.ACTION_POSITION);
                this.f224245d.f224240g.mo107033O0();
            } else {
                C76912y0.m92769h(this.f224248g.f44854d.getContext(), this.f224248g.f44854d.getContext().getString(C0966R.string.f360274mb2), C0966R.raw.icons_outlined_info);
            }
            if (z) {
                String l2 = this.f224247f.f224452u.mo108714l2();
                C87412m.m108593f(l2, "item.record.chatRoomName");
                ((C77029o) C86312j.m106911c(C77029o.class)).vx0(l2, this.f224247f.f224452u.getId());
                this.f224247f.f224436e = 1;
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kn3.m$c */
    public static final class C76620c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C76719m f224249d;

        public C76620c(C76719m mVar) {
            this.f224249d = mVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 0) {
                String l2 = this.f224249d.f224452u.mo108714l2();
                C87412m.m108593f(l2, "item.record.chatRoomName");
                ((C77029o) C86312j.m106911c(C77029o.class)).vx0(l2, this.f224249d.f224452u.getId());
                this.f224249d.f224436e = 3;
            }
        }
    }

    public C76617m(C67391b bVar, ChatTipsBarGroup.C74825d dVar, C76800l lVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "shareData");
        C87412m.m108594g(lVar, "processor");
        this.f224238e = bVar;
        this.f224239f = dVar;
        this.f224240g = lVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cuf;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: l */
    public final void mo106865l(AnimTextView animTextView, boolean z) {
        C87412m.m108594g(animTextView, "<this>");
        if (mo106866m(animTextView)) {
            String string = animTextView.getContext().getResources().getString(C0966R.string.min);
            C87412m.m108593f(string, "context.resources.getStr…_bar_top_msg_cancel_fake)");
            int color = animTextView.getContext().getResources().getColor(C0966R.color.f2958ae);
            animTextView.f214693g = string;
            animTextView.f214694h = color;
            animTextView.f214695i = 0;
            animTextView.f214696j = 0;
            animTextView.f214697n = C0966R.C0969drawable.b_k;
            animTextView.f214698o = false;
            animTextView.f214699p = 200;
            animTextView.mo101572a(z);
            animTextView.setTag(Boolean.FALSE);
        }
        mo106868o(animTextView);
    }

    /* renamed from: m */
    public final boolean mo106866m(AnimTextView animTextView) {
        C87412m.m108594g(animTextView, "<this>");
        Object tag = animTextView.getTag();
        return C87412m.m108589b(tag instanceof Boolean ? (Boolean) tag : null, Boolean.TRUE);
    }

    /* renamed from: n */
    public void mo44e(C60905o oVar, C76719m mVar, int i, int i2, boolean z, List<Object> list) {
        C60905o oVar2 = oVar;
        C76719m mVar2 = mVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(mVar2, "item");
        super.mo86076k(oVar, mVar, i, i2, z, list);
        View D = oVar2.mo85812D(C0966R.C0970id.ale);
        AnimTextView animTextView = (AnimTextView) oVar2.mo85812D(C0966R.C0970id.n4l);
        String yx02 = ((C77029o) C86312j.m106911c(C77029o.class)).yx0(mVar2.f224452u.mo108714l2(), mVar2.f224452u.mo108716n2().f183491i);
        StringBuilder sb = new StringBuilder();
        sb.append(yx02);
        sb.append(": ");
        String str = mVar2.f224452u.mo108716n2().f183490h;
        C87412m.m108593f(str, "item.record.topMsgInfoItem.MsgSummary");
        sb.append(C112551y.m153815o(str, 10, ' ', false, 4, (Object) null));
        ((TextView) oVar2.mo85812D(C0966R.C0970id.n4n)).setText(sb.toString());
        boolean A = C45612m0.m50674A(this.f224238e.mo91577r(), C13781a.m13082a());
        if (A) {
            animTextView.setVisibility(0);
        } else {
            animTextView.setVisibility(8);
        }
        if (this.f224239f.mo104003a()) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/TopMsgTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(D, "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/TopMsgTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            animTextView.setVisibility(8);
        }
        C87412m.m108593f(animTextView, "tvCancel");
        mo106865l(animTextView, false);
        animTextView.setOnClickListener(new C76618a(this, animTextView, oVar2, mVar2));
        oVar2.f44854d.setOnClickListener(new C76619b(this, animTextView, mVar2, oVar2));
        if (!A) {
            View view = oVar2.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            mo86075j(view, i, this.f224239f, new C76620c(mVar2));
            return;
        }
        View view2 = oVar2.f44854d;
        C87412m.m108593f(view2, "holder.itemView");
        view2.setOnLongClickListener((View.OnLongClickListener) null);
    }

    /* renamed from: o */
    public final void mo106868o(AnimTextView animTextView) {
        C87412m.m108594g(animTextView, "<this>");
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        eVar.o30(animTextView, mo106866m(animTextView) ? "group_msg_set_top_bar_remove_confirm" : "group_msg_set_top_bar_remove");
        eVar.mo86175pO(animTextView, 8, 26356);
    }
}
