package mj1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import nj1.C61755b;
import oj1.C62034b;

/* renamed from: mj1.a */
public final class C61485a extends RecyclerView.C16613e<C61486a> {

    /* renamed from: d */
    public final LinkedList<C62034b> f174810d;

    /* renamed from: e */
    public final C61755b f174811e;

    /* renamed from: mj1.a$a */
    public static final class C61486a extends RecyclerView.C16631z {

        /* renamed from: z */
        public final FinderLiveMultiStreamViewLayout f174812z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61486a(FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout) {
            super(finderLiveMultiStreamViewLayout);
            C87412m.m108594g(finderLiveMultiStreamViewLayout, "view");
            this.f174812z = finderLiveMultiStreamViewLayout;
        }
    }

    public C61485a(LinkedList<C62034b> linkedList, C61755b bVar) {
        C87412m.m108594g(linkedList, "dataList");
        C87412m.m108594g(bVar, "service");
        this.f174810d = linkedList;
        this.f174811e = bVar;
    }

    /* renamed from: F4 */
    public final C62034b mo86464F4(int i) {
        LinkedList<C62034b> linkedList = this.f174810d;
        int size = linkedList.size();
        if (size != 0 && (i = i % size) >= size) {
            i = size - 1;
        }
        return linkedList.get(i);
    }

    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        int i2;
        C61486a aVar = (C61486a) zVar;
        C87412m.m108594g(aVar, "holder");
        FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout = aVar.f174812z;
        LinkedList<C62034b> linkedList = this.f174810d;
        int size = linkedList.size();
        if (size != 0) {
            i2 = i % size;
            if (i2 >= size) {
                i2 = size - 1;
            }
        } else {
            i2 = i;
        }
        C62034b bVar = linkedList.get(i2);
        C87412m.m108593f(bVar, "dataList[getValidPos(position)]");
        finderLiveMultiStreamViewLayout.mo77666b(bVar);
        Log.m105924i("MultiStreamAdapter", "onBindViewHolder ori: " + i + " position: " + (i % this.f174810d.size()));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ct5, viewGroup, false);
        Log.m105924i("MultiStreamAdapter", "onCreateViewHolder");
        C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout");
        FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout = (FinderLiveMultiStreamViewLayout) inflate;
        C61755b bVar = this.f174811e;
        C87412m.m108594g(bVar, "service");
        finderLiveMultiStreamViewLayout.f159425g = bVar;
        return new C61486a(finderLiveMultiStreamViewLayout);
    }
}
