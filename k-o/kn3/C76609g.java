package kn3;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.anim.content.AnimTextView;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import hk3.C76227e;
import ie3.C76328d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ln3.C76714h;
import mn3.C76794h;
import nj3.C11184p0;
import nj3.C76912y0;
import zj3.C79368l;

/* renamed from: kn3.g */
public final class C76609g extends C61118a<C76714h> {

    /* renamed from: e */
    public final C67391b f224221e;

    /* renamed from: f */
    public final ChatTipsBarGroup.C74825d f224222f;

    /* renamed from: g */
    public final C76794h f224223g;

    /* renamed from: kn3.g$a */
    public static final class C76610a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76714h f224224d;

        /* renamed from: e */
        public final /* synthetic */ C76609g f224225e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f224226f;

        public C76610a(C76714h hVar, C76609g gVar, C60905o oVar) {
            this.f224224d = hVar;
            this.f224225e = gVar;
            this.f224226f = oVar;
        }

        public final void onClick(View view) {
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tipsbar/convert/PayPluginTopMsgTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = this.f224224d.f224442u.f227709d;
            C87412m.m108593f(str, "item.record.msg_svrId");
            C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(this.f224225e.f224221e.mo91577r(), Long.parseLong(str));
            if ((h302.getMsgId() == 0 || h302.getType() == 268445456) ? false : true) {
                C76609g gVar = this.f224225e;
                C87412m.m108593f(view2, "clickView");
                gVar.getClass();
                C115669n.INSTANCE.mo160131h(27193, 1, 2);
                ((C79368l) gVar.f224221e.f193278b.mo102812a(C79368l.class)).mo108214y2(h302.getMsgId(), false, true, true, C76577a.m92151b(gVar.f224221e.mo91565f(), 120), true, C76227e.C76228a.ACTION_POSITION);
                this.f224225e.f224223g.mo107033O0();
            } else {
                C76912y0.m92769h(this.f224226f.f44854d.getContext(), this.f224226f.f44854d.getContext().getString(C0966R.string.f360274mb2), C0966R.raw.icons_outlined_info);
            }
            ((C76328d) C86312j.m106911c(C76328d.class)).mo106559Ll(this.f224225e.f224221e.mo91577r(), this.f224224d.f224442u);
            this.f224224d.f224436e = 1;
            C117292a.m165361g(this, "com/tencent/mm/ui/tipsbar/convert/PayPluginTopMsgTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kn3.g$b */
    public static final class C76611b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C76609g f224227d;

        /* renamed from: e */
        public final /* synthetic */ C76714h f224228e;

        public C76611b(C76609g gVar, C76714h hVar) {
            this.f224227d = gVar;
            this.f224228e = hVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                C115669n.INSTANCE.mo160131h(27193, 1, 3);
                ((C76328d) C86312j.m106911c(C76328d.class)).mo106559Ll(this.f224227d.f224221e.mo91577r(), this.f224228e.f224442u);
                this.f224228e.f224436e = 3;
            }
        }
    }

    public C76609g(C67391b bVar, ChatTipsBarGroup.C74825d dVar, C76794h hVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "shareData");
        C87412m.m108594g(hVar, "processor");
        this.f224221e = bVar;
        this.f224222f = dVar;
        this.f224223g = hVar;
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
    public void mo44e(C60905o oVar, C76714h hVar, int i, int i2, boolean z, List<Object> list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(hVar, "item");
        super.mo86076k(oVar, hVar, i, i2, z, list);
        View D = oVar.mo85812D(C0966R.C0970id.ale);
        ((TextView) oVar.mo85812D(C0966R.C0970id.n4n)).setText(hVar.f224442u.f227710e);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/ui/tipsbar/convert/PayPluginTopMsgTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/PayPluginTopMsgTipBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(D, "com/tencent/mm/ui/tipsbar/convert/PayPluginTopMsgTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/PayPluginTopMsgTipBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((AnimTextView) oVar.mo85812D(C0966R.C0970id.n4l)).setVisibility(8);
        oVar.f44854d.setOnClickListener(new C76610a(hVar, this, oVar));
        View view = oVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        mo86075j(view, i, this.f224222f, new C76611b(this, hVar));
    }
}
