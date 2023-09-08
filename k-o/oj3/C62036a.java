package oj3;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import l23.C61196g;
import l23.C61204i;
import qh2.C101198e;

/* renamed from: oj3.a */
public abstract class C62036a<T, V extends View> extends RecyclerView.C16613e<C62040b> {

    /* renamed from: d */
    public List<T> f176359d = new ArrayList();

    /* renamed from: e */
    public C62039c f176360e = null;

    /* renamed from: f */
    public RecyclerView f176361f;

    /* renamed from: oj3.a$a */
    public class C62037a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62040b f176362d;

        public C62037a(C62040b bVar) {
            this.f176362d = bVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C62036a.this.f176360e != null) {
                int j = ((C62040b) ((RecyclerView) this.f176362d.f44854d.getParent()).mo17021F0(this.f176362d.f44854d)).mo17363j();
                if (j < 0) {
                    Log.m105921e("MicroMsg.RecyclerViewAdapterBase", "[onBindViewHolder#setOnClickListener] pos=%s", Integer.valueOf(j));
                    C117292a.m165361g(this, "com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C62036a aVar = C62036a.this;
                C62039c cVar = aVar.f176360e;
                Object F4 = aVar.mo86983F4(j);
                C61204i iVar = (C61204i) cVar;
                iVar.getClass();
                GalleryItem$MediaItem galleryItem$MediaItem = (GalleryItem$MediaItem) F4;
                C87412m.m108594g(view, "view");
                C87412m.m108594g(galleryItem$MediaItem, "item");
                C61196g gVar = iVar.f174239a;
                gVar.f174218i = galleryItem$MediaItem.f162751h;
                C61196g.C61197a aVar2 = gVar.f174217h;
                if (aVar2 != null) {
                    aVar2.notifyDataSetChanged();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("PARAM_VLOG_MULTI_IMAGE_SELECT_VALUE", galleryItem$MediaItem);
                    iVar.f174239a.f291492d.mo14585p(C101198e.C101199b.EDIT_VLOG_MULTI_IMAGE_SELECT, bundle);
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: oj3.a$b */
    public class C62038b implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f176364d;

        public C62038b(int i) {
            this.f176364d = i;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C62036a aVar = C62036a.this;
            C62039c cVar = aVar.f176360e;
            if (cVar != null) {
                int i = this.f176364d;
                boolean a = cVar.mo86127a(i, view, aVar.mo86983F4(i));
                C117292a.m165362h(a, this, "com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return a;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: oj3.a$c */
    public interface C62039c<T> {
        /* renamed from: a */
        boolean mo86127a(int i, View view, T t);
    }

    /* renamed from: F4 */
    public T mo86983F4(int i) {
        return this.f176359d.get(i);
    }

    /* renamed from: G4 */
    public void onBindViewHolder(C62040b bVar, int i) {
        bVar.f44854d.setOnClickListener(new C62037a(bVar));
        bVar.f44854d.setOnLongClickListener(new C62038b(i));
    }

    /* renamed from: O4 */
    public void onBindViewHolder(C62040b bVar, int i, List<Object> list) {
        super.onBindViewHolder(bVar, i, list);
        bVar.f173504F = this.f176361f;
    }

    /* renamed from: g5 */
    public abstract V mo13137g5(ViewGroup viewGroup, int i);

    public int getItemCount() {
        return this.f176359d.size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f176361f = recyclerView;
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C62040b bVar = new C62040b(mo13137g5(viewGroup, i));
        bVar.f173504F = this.f176361f;
        return bVar;
    }

    /* renamed from: u5 */
    public void mo86984u5(int i) {
        if (i > 0 || i < this.f176359d.size()) {
            this.f176359d.remove(i);
            notifyItemRemoved(i);
        }
    }
}
