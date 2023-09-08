package lc1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import p910lj.C76701a;
import pb1.C100755z;
import te3.C101811md0;

/* renamed from: lc1.s */
public class C99405s extends C99373c {
    public C99405s(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        return new View(viewGroup.getContext());
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        if (view != null) {
            C76701a.makeText(view.getContext(), (int) C0966R.string.cs5, 0).show();
        }
    }
}
