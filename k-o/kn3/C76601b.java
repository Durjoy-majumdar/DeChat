package kn3;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import ln3.C76710b;
import mn3.C76788b;
import nj3.C11184p0;
import p644pi.C77088c;

/* renamed from: kn3.b */
public final class C76601b extends C61118a<C76710b> {

    /* renamed from: e */
    public final C67391b f224203e;

    /* renamed from: f */
    public final ChatTipsBarGroup.C74825d f224204f;

    /* renamed from: kn3.b$a */
    public static final class C76602a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76601b f224205d;

        /* renamed from: e */
        public final /* synthetic */ C76710b f224206e;

        public C76602a(C76601b bVar, C76710b bVar2) {
            this.f224205d = bVar;
            this.f224206e = bVar2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tipsbar/convert/ChatRoomInviteTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C77088c) C86312j.m106911c(C77088c.class)).D70(this.f224205d.f224203e.mo91565f(), this.f224205d.f224203e.mo91577r(), true);
            this.f224206e.f224436e = 1;
            C117292a.m165361g(this, "com/tencent/mm/ui/tipsbar/convert/ChatRoomInviteTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kn3.b$b */
    public static final class C76603b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C76601b f224207d;

        public C76603b(C76601b bVar) {
            this.f224207d = bVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                ((C77088c) C86312j.m106911c(C77088c.class)).m80(this.f224207d.f224203e.mo91577r());
            }
        }
    }

    public C76601b(C67391b bVar, ChatTipsBarGroup.C74825d dVar, C76788b bVar2) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        C87412m.m108594g(bVar2, "processor");
        this.f224203e = bVar;
        this.f224204f = dVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cuk;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: l */
    public void mo44e(C60905o oVar, C76710b bVar, int i, int i2, boolean z, List<Object> list) {
        C60905o oVar2 = oVar;
        C76710b bVar2 = bVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(bVar2, "item");
        super.mo86076k(oVar, bVar, i, i2, z, list);
        ((TextView) oVar2.mo85812D(C0966R.C0970id.f5588j6)).setText(this.f224203e.mo91565f().getString(C0966R.string.fox, new Object[]{Integer.valueOf(bVar2.f224438u)}));
        View D = oVar2.mo85812D(C0966R.C0970id.isy);
        int i3 = this.f224204f.mo104003a() ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i3));
        View view = D;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/tipsbar/convert/ChatRoomInviteTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/ChatRoomInviteTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/tipsbar/convert/ChatRoomInviteTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/ChatRoomInviteTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        oVar2.f44854d.setOnClickListener(new C76602a(this, bVar2));
        ((WeImageView) oVar2.mo85812D(C0966R.C0970id.f5590j8)).mo104518r(C0966R.raw.icons_filled_invite_group, C0966R.color.akw);
        View view2 = oVar2.f44854d;
        C87412m.m108593f(view2, "holder.itemView");
        mo86075j(view2, i, this.f224204f, new C76603b(this));
    }
}
