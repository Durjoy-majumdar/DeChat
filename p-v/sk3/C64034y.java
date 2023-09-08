package sk3;

import android.content.Intent;
import android.text.SpannableString;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C97625j3;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import kv1.C99254i;
import nj3.C11184p0;
import nj3.C76912y0;
import nk3.C61801g;
import nk3.C61802h;
import nk3.C61805j;
import nk3.C61806k;
import ok3.C62068c;
import ok3.C62070e;
import qo3.C77407n;
import rk3.C63462a;

/* renamed from: sk3.y */
public final class C64034y extends C63994l0 implements C61806k, C61805j {

    /* renamed from: r */
    public C61802h f181555r;

    /* renamed from: sk3.y$a */
    public static final class C64035a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ C64034y f181556d;

        /* renamed from: e */
        public final /* synthetic */ C62070e f181557e;

        /* renamed from: f */
        public final /* synthetic */ View f181558f;

        public C64035a(C64034y yVar, C62070e eVar, View view) {
            this.f181556d = yVar;
            this.f181557e = eVar;
            this.f181558f = view;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            this.f181556d.getClass();
            contextMenu.add(0, 0, 0, view.getContext().getString(C0966R.string.i4e));
            if (!C72996z1.m85843n5(this.f181557e.f176460e) && !C72996z1.m85847r5(this.f181557e.f176460e)) {
                contextMenu.add(0, this.f181556d.f181416e, 0, view.getContext().getString(C0966R.string.b7o));
            }
            contextMenu.add(0, this.f181556d.f181417f, 0, this.f181558f.getContext().getString(C0966R.string.n3j));
            contextMenu.add(0, this.f181556d.f181418g, 0, this.f181558f.getContext().getString(C0966R.string.b_1));
        }
    }

    /* renamed from: sk3.y$b */
    public static final class C64036b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C62070e f181559d;

        /* renamed from: e */
        public final /* synthetic */ C64034y f181560e;

        public C64036b(C62070e eVar, C64034y yVar) {
            this.f181559d = eVar;
            this.f181560e = yVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f181559d.f176459d);
            C64034y yVar = this.f181560e;
            yVar.mo88759g3(menuItem.getItemId(), b002, yVar.f181423o);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64034y(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: M0 */
    public void mo86728M0(View view, int i, C62070e eVar) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(eVar, "item");
        Log.m105925i("MicroMsg.FTSMultiItemFileUIC", "[onItemClick] position:%s", Integer.valueOf(i));
        mo88760i3();
        C63462a.m74799d(C63462a.f180011a, 2, 0, 0, 6, (Object) null);
        if (!mo88757e3()) {
            C76912y0.m92771j(getActivity(), (View) null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(getActivity(), "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
        intent.putExtra("app_msg_id", eVar.f176459d);
        AppCompatActivity activity = getActivity();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = activity;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiItemFileUIC", "enterFileProfile", "(Lcom/tencent/mm/ui/chatting/search/multi/bean/FTSMultiNormalResultItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiItemFileUIC", "enterFileProfile", "(Lcom/tencent/mm/ui/chatting/search/multi/bean/FTSMultiNormalResultItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: R1 */
    public void mo86729R1(View view, int i, C62070e eVar) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(eVar, "item");
        Log.m105925i("MicroMsg.FTSMultiItemFileUIC", "[onItemLongClick] position:%s", Integer.valueOf(i));
        C45082x0 x0Var = new C45082x0(view.getContext());
        C63462a.f180011a.mo88328b(14);
        x0Var.mo70436b(view, new C64035a(this, eVar, view), new C64036b(eVar, this), (C77407n.C47880p) null);
    }

    /* renamed from: V0 */
    public void mo86730V0(C61801g gVar, int i, int i2) {
        C87412m.m108594g(gVar, "holder");
        C62068c cVar = (C62068c) getItem(i);
        if (Util.isNullOrNil(cVar.f176452j)) {
            ((C63969b) gVar).f181364G.setVisibility(8);
        } else {
            C63969b bVar = (C63969b) gVar;
            bVar.f181364G.setVisibility(0);
            bVar.f181364G.setText(Util.nullAs(cVar.f176452j, ""));
        }
        ((C63969b) gVar).f181363F.setImageResource(cVar.f176451i);
    }

    /* renamed from: c3 */
    public SpannableString mo88749c3() {
        String str = ((C64004q0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C64004q0.class)).f181449f;
        Log.m105924i("MicroMsg.FTSMultiItemFileUIC", "getEmptyResultString >> " + str);
        return C99254i.m129316m(getString(C0966R.string.mhl), getString(C0966R.string.mhh), str);
    }

    /* renamed from: d3 */
    public C61802h mo88750d3() {
        if (this.f181555r == null) {
            this.f181555r = new C61802h(getActivity(), this, this);
        }
        C61802h hVar = this.f181555r;
        C87412m.m108591d(hVar);
        return hVar;
    }

    public int getCount() {
        return this.f181421j.size();
    }

    public C62070e getItem(int i) {
        C62070e eVar = this.f181421j.get(i);
        C87412m.m108593f(eVar, "normalDataList[position]");
        return eVar;
    }

    /* renamed from: o */
    public RecyclerView.C16631z mo86733o(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cvv, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…list_item, parent, false)");
        return new C63969b(inflate);
    }
}
