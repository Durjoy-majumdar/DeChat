package yz2;

import android.content.DialogInterface;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import az2.C39674e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusLikeListFragment;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import nj3.C76879j;
import rz2.C48201c;
import su0.C13781a;
import vz2.C78501d;

/* renamed from: yz2.k2 */
public final class C53692k2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusLikeListFragment f150786d;

    /* renamed from: yz2.k2$a */
    public static final class C53693a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusLikeListFragment f150787d;

        public C53693a(TextStatusLikeListFragment textStatusLikeListFragment) {
            this.f150787d = textStatusLikeListFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            C78501d dVar = C78501d.f229945a;
            int i2 = TextStatusLikeListFragment.f116937x;
            C39674e eVar = C39674e.f106452d;
            C48201c kD = eVar.mo62255t0().mo72970kD(C13781a.m13082a());
            if (kD == null || (str = kD.field_StatusID) == null) {
                str = "";
            }
            C78501d.m94805g(dVar, 24, (String) null, (String) null, 0, str, 0, 46, (Object) null);
            this.f150787d.f116941p.clear();
            WxRecyclerView wxRecyclerView = this.f150787d.f116939n;
            if (wxRecyclerView != null) {
                RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                eVar.mo62246S().f129184d.execSQL("TextStatusLike", "update TextStatusLike set DeleteInMsgList = 1 where DeleteInMsgList != 1");
                eVar.mo62249g0().f129187d.execSQL("TextStatusReference", "update TextStatusReference set DeleteInMsgList = 1 where DeleteInMsgList != 1");
                return;
            }
            C87412m.m108603p("rvLikeList");
            throw null;
        }
    }

    public C53692k2(TextStatusLikeListFragment textStatusLikeListFragment) {
        this.f150786d = textStatusLikeListFragment;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C76879j.m92750u(this.f150786d.getContext(), this.f150786d.getString(C0966R.string.f361383jf3), "", new C53693a(this.f150786d), (DialogInterface.OnClickListener) null);
        return true;
    }
}
