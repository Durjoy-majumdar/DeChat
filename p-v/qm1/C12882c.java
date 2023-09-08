package qm1;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import cm1.C0740i2;
import cm1.C0797z;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import mm1.C10934a;
import pm1.C62381d;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C48501y0;

/* renamed from: qm1.c */
public final class C12882c implements C63285a {

    /* renamed from: a */
    public final ArrayList<C0740i2> f36860a;

    public C12882c(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "feedList");
        this.f36860a = arrayList;
    }

    /* renamed from: a */
    public Set<C62381d.C62382a> mo12393a(StaggeredGridLayoutManager staggeredGridLayoutManager, HashSet<C62381d.C62382a> hashSet) {
        T t;
        boolean z;
        C87412m.m108594g(staggeredGridLayoutManager, "layoutManager");
        C87412m.m108594g(hashSet, "curLivePreviewDataSet");
        HashSet hashSet2 = new HashSet();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        staggeredGridLayoutManager.mo17394A(iArr);
        staggeredGridLayoutManager.mo17395B(iArr2);
        for (int i : mo12397c(staggeredGridLayoutManager, iArr, iArr2)) {
            Iterator<T> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (i == ((C62381d.C62382a) t).f177311a) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C62381d.C62382a aVar = (C62381d.C62382a) t;
            if (aVar != null) {
                hashSet2.add(aVar);
                Log.m105928w("NearbyLiveAutoPlaySelectorHorizontal", "findAutoStopItem hit cur play view index:" + aVar.f177311a + " size:" + hashSet2.size());
            }
        }
        Set<C62381d.C62382a> f = C48501y0.m53871f(hashSet, hashSet2);
        StringBuilder sb = new StringBuilder();
        sb.append("findAutoStopItem list ");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(f, 10));
        for (C62381d.C62382a aVar2 : f) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(aVar2.f177311a);
            sb4.append(' ');
            arrayList.add(sb4.toString());
        }
        sb.append(arrayList);
        Log.m105924i("NearbyLiveAutoPlaySelectorHorizontal", sb.toString());
        return f;
    }

    /* renamed from: b */
    public int[] mo12394b(StaggeredGridLayoutManager staggeredGridLayoutManager, int[] iArr, int[] iArr2) {
        C87412m.m108594g(staggeredGridLayoutManager, "layoutManager");
        C87412m.m108594g(iArr, "firstVisibleItemPos");
        C87412m.m108594g(iArr2, "lastVisibleItemPos");
        return mo12397c(staggeredGridLayoutManager, iArr, iArr2);
    }

    /* renamed from: c */
    public final int[] mo12397c(StaggeredGridLayoutManager staggeredGridLayoutManager, int[] iArr, int[] iArr2) {
        ArrayList arrayList = new ArrayList();
        int i = iArr[0];
        int i2 = iArr2[0];
        if (i <= i2) {
            while (true) {
                ArrayList<C0740i2> arrayList2 = this.f36860a;
                C0740i2 i2Var = null;
                if (arrayList2 == null) {
                    Log.m105928w("NearbyLiveAutoPlaySelectorHorizontal", "getFeedByPos return for feedList:" + this.f36860a);
                } else if (i < 0 || i >= arrayList2.size()) {
                    Log.m105928w("NearbyLiveAutoPlaySelectorHorizontal", "getFeedByPos return for invalid pos:" + i);
                } else {
                    i2Var = this.f36860a.get(i);
                }
                if (!(i2Var instanceof C0797z)) {
                    Log.m105928w("NearbyLiveAutoPlaySelectorHorizontal", "findAutoPlayItem invalid feed:" + i2Var + " index:" + i);
                } else {
                    View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i);
                    if (findViewByPosition != null) {
                        findViewByPosition.getGlobalVisibleRect(new Rect());
                        C10934a aVar = C10934a.f32583a;
                        Rect rect = new Rect();
                        findViewByPosition.getGlobalVisibleRect(rect);
                        if ((((float) rect.height()) * 1.0f) / ((float) findViewByPosition.getHeight()) >= 0.5f && (((float) rect.width()) * 1.0f) / ((float) findViewByPosition.getWidth()) >= 0.5f) {
                            arrayList.add(Integer.valueOf(i));
                            Log.m105928w("NearbyLiveAutoPlaySelectorHorizontal", "findAutoPlayItem hit view index:" + i + ' ' + arrayList);
                        }
                    } else {
                        Log.m105928w("NearbyLiveAutoPlaySelectorHorizontal", "findAutoPlayItem invalid view index:" + i);
                    }
                }
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        return C110818d0.m150952x0(arrayList);
    }
}
