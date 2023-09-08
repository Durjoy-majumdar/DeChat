package sk3;

import android.graphics.Bitmap;
import android.text.SpannableString;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74310y2;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C97625j3;
import gy3.C87412m;
import kg3.C76577a;
import kv1.C99254i;
import nj3.C11184p0;
import nk3.C61801g;
import nk3.C61802h;
import nk3.C61805j;
import nk3.C61806k;
import ok3.C62069d;
import ok3.C62070e;
import p158gt.C98201k;
import p763ym.C79138l;
import qo3.C77407n;
import rk3.C63462a;

/* renamed from: sk3.c0 */
public final class C63971c0 extends C63994l0 implements C61806k, C61805j {

    /* renamed from: r */
    public C61802h f181366r;

    /* renamed from: sk3.c0$a */
    public static final class C63972a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ C63971c0 f181367d;

        /* renamed from: e */
        public final /* synthetic */ View f181368e;

        public C63972a(C63971c0 c0Var, View view) {
            this.f181367d = c0Var;
            this.f181368e = view;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            this.f181367d.getClass();
            contextMenu.add(0, 0, 0, this.f181368e.getContext().getString(C0966R.string.i4e));
            contextMenu.add(0, this.f181367d.f181416e, 0, this.f181368e.getContext().getString(C0966R.string.b7o));
            contextMenu.add(0, this.f181367d.f181417f, 0, this.f181368e.getContext().getString(C0966R.string.n3j));
            contextMenu.add(0, this.f181367d.f181418g, 0, this.f181368e.getContext().getString(C0966R.string.b_1));
        }
    }

    /* renamed from: sk3.c0$b */
    public static final class C63973b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C62070e f181369d;

        /* renamed from: e */
        public final /* synthetic */ C63971c0 f181370e;

        public C63973b(C62070e eVar, C63971c0 c0Var) {
            this.f181369d = eVar;
            this.f181370e = c0Var;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f181369d.f176459d);
            C63971c0 c0Var = this.f181370e;
            c0Var.mo88759g3(menuItem.getItemId(), b002, c0Var.f181423o);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63971c0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: M0 */
    public void mo86728M0(View view, int i, C62070e eVar) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(eVar, "item");
        Log.m105924i("MicroMsg.FTSMultiItemMusicUIC", "onItemClick");
        mo88760i3();
        C63462a.m74799d(C63462a.f180011a, 4, 0, 0, 6, (Object) null);
        if (WeChatBrands.Business.Entries.SessionMusic.checkAvailable(view.getContext())) {
            Log.m105924i("MicroMsg.FTSMultiItemMusicUIC", "go to music " + eVar.f176459d);
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(eVar.f176459d);
            C74310y2.m88648c(C68070l.C68072b.m80422u(b002.getContent(), (String) null), getActivity(), "", b002);
        }
    }

    /* renamed from: R1 */
    public void mo86729R1(View view, int i, C62070e eVar) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(eVar, "item");
        Log.m105925i("MicroMsg.FTSMultiItemMusicUIC", "[onItemLongClick] position:%s", Integer.valueOf(i));
        C45082x0 x0Var = new C45082x0(view.getContext());
        C63462a.f180011a.mo88328b(14);
        x0Var.mo70436b(view, new C63972a(this, view), new C63973b(eVar, this), (C77407n.C47880p) null);
    }

    /* renamed from: V0 */
    public void mo86730V0(C61801g gVar, int i, int i2) {
        C87412m.m108594g(gVar, "holder");
        C63984i0 i0Var = (C63984i0) gVar;
        C62069d dVar = (C62069d) getItem(i);
        Bitmap jo = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127188jo(dVar.f176455k, C76577a.m92156g(getActivity()), false);
        if (jo == null || jo.isRecycled()) {
            Bitmap ub = ((C79138l) C86312j.m106911c(C79138l.class)).mo74018ub(dVar.f176453i, 1, C76577a.m92156g(getActivity()));
            if (ub == null || ub.isRecycled()) {
                i0Var.f181396F.setImageResource(C0966R.raw.app_attach_file_icon_webpage);
            } else {
                i0Var.f181396F.setImageBitmap(ub);
            }
        } else {
            i0Var.f181396F.setImageBitmap(jo);
        }
        i0Var.f181397G.setText(Util.nullAs(dVar.f176454j, ""));
        TextView textView = i0Var.f181397G;
        C61802h hVar = this.f181366r;
        gVar.mo86724y(textView, hVar != null ? hVar.f175729g : null);
    }

    /* renamed from: c3 */
    public SpannableString mo88749c3() {
        String str = ((C64004q0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C64004q0.class)).f181449f;
        Log.m105924i("MicroMsg.FTSMultiItemMusicUIC", "getEmptyResultString >> " + str);
        return C99254i.m129316m(getString(C0966R.string.mhl), getString(C0966R.string.mhj), str);
    }

    /* renamed from: d3 */
    public C61802h mo88750d3() {
        if (this.f181366r == null) {
            this.f181366r = new C61802h(getActivity(), this, this);
        }
        C61802h hVar = this.f181366r;
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
        return new C63984i0(inflate);
    }
}
