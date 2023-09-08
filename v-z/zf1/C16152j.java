package zf1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.gallery.FinderGalleryTabView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C60898l;
import jq3.C60905o;

/* renamed from: zf1.j */
public final class C16152j implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ WxRecyclerAdapter<C16151i> f43346d;

    /* renamed from: e */
    public final /* synthetic */ FinderGalleryTabView f43347e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList<C16151i> f43348f;

    /* renamed from: g */
    public final /* synthetic */ C66795c f43349g;

    public C16152j(WxRecyclerAdapter<C16151i> wxRecyclerAdapter, FinderGalleryTabView finderGalleryTabView, ArrayList<C16151i> arrayList, C66795c cVar) {
        this.f43346d = wxRecyclerAdapter;
        this.f43347e = finderGalleryTabView;
        this.f43348f = arrayList;
        this.f43349g = cVar;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        Object obj;
        RecyclerView.C16613e adapter;
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        int c6 = i - this.f43346d.mo85796c6();
        String str = this.f43347e.f14998d;
        StringBuilder sb = new StringBuilder();
        sb.append("click item ");
        if (c6 < 0 || c6 >= this.f43348f.size()) {
            obj = "";
        } else {
            obj = this.f43348f.get(c6);
            C87412m.m108593f(obj, "dataList[clickPos]");
        }
        sb.append(obj);
        sb.append(" pos:");
        sb.append(c6);
        Log.m105924i(str, sb.toString());
        C16151i iVar = (C16151i) oVar.f173503E;
        if (iVar != null) {
            int i2 = iVar.f43344d.f43342a;
            String str2 = this.f43347e.f14998d;
            Log.m105924i(str2, "select item hash:" + iVar.hashCode() + ", title:" + iVar.f43344d.f43343b + ", selected:" + iVar.f43345e);
            Iterator<T> it = this.f43348f.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                C16151i iVar2 = (C16151i) it.next();
                if (iVar2.f43344d.f43342a != i2) {
                    z = false;
                }
                iVar2.f43345e = z;
            }
            WxRecyclerView recyclerView = this.f43347e.getRecyclerView();
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                FinderGalleryTabView finderGalleryTabView = this.f43347e;
                adapter.notifyItemRangeChanged(0, adapter.getItemCount(), 1);
                String str3 = finderGalleryTabView.f14998d;
                Log.m105924i(str3, "refresh itemCount:" + adapter.getItemCount());
            }
            C66795c cVar = this.f43349g;
            C16150h hVar = iVar.f43344d;
            cVar.getClass();
            C87412m.m108594g(hVar, "galleryTabData");
            Iterator<C16151i> it4 = cVar.f191902f.iterator();
            int i3 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (it4.next().f43344d.f43342a == hVar.f43342a) {
                    break;
                }
                i3++;
            }
            String str4 = cVar.f191900d;
            Log.m105924i(str4, "onSelectTab title:" + hVar.f43343b + ", index:" + i3);
            if (cVar.f191903g.getCurrentItem() != i3) {
                cVar.f191903g.setCurrentItem(i3, false);
            }
        }
    }
}
