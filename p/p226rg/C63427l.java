package p226rg;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.album.p836ui.preview.uic.AlbumPreviewUIC;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import jq3.C60897k;
import jq3.C9493c;
import p434ig.C98674g;
import p861pg.C62279a;

/* renamed from: rg.l */
public final class C63427l implements C60897k<C62279a> {

    /* renamed from: a */
    public final /* synthetic */ AlbumPreviewUIC f179911a;

    public C63427l(AlbumPreviewUIC albumPreviewUIC) {
        this.f179911a = albumPreviewUIC;
    }

    /* renamed from: a */
    public boolean mo2039a(View view, C9493c cVar, int i) {
        C60897k.C9501a.m9192a(this, view, (C62279a) cVar, i);
        return false;
    }

    /* renamed from: b */
    public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
        C60897k.C9501a.m9193b(this, view, motionEvent, (C62279a) cVar, i);
        return false;
    }

    /* renamed from: c */
    public void mo2041c(View view, C9493c cVar, int i) {
        List<C62279a> list;
        C62279a aVar = (C62279a) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "data");
        if (aVar.mo75c() != -1 && aVar.mo75c() != -2) {
            C98674g g3 = AlbumPreviewUIC.m62215g3(this.f179911a);
            C63408b bVar = this.f179911a.f154713h;
            int i2 = 0;
            if (!(bVar == null || (list = bVar.f179891d) == null)) {
                ArrayList arrayList = new ArrayList();
                for (T next : list) {
                    if (((C62279a) next).mo75c() == -1) {
                        arrayList.add(next);
                    }
                }
                i2 = arrayList.size();
            }
            int i3 = i - i2;
            UIStateCenter<C63426k> k3 = this.f179911a.mo76239k3();
            if (i3 >= 0) {
                i = i3;
            }
            k3.dispatch(new C63414e(view, g3, aVar, i));
        }
    }
}
