package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import di3.C86312j;
import kg3.C76577a;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101811md0;
import te3.C101834rc0;

/* renamed from: lc1.g */
public class C99380g extends C99373c {

    /* renamed from: c */
    public static int f291409c;

    /* renamed from: lc1.g$a */
    public static class C99381a extends c$$e {

        /* renamed from: k */
        public ImageView f291410k;
    }

    public C99380g(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
        f291409c = C76577a.m92157h(favoriteImageServer.f269877a, C0966R.dimen.f3805ey);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        View view2;
        C99381a aVar;
        Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new C99381a();
            view2 = View.inflate(context, C0966R.C0971layout.a6w, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            aVar.f291410k = (ImageView) view2.findViewById(C0966R.C0970id.cvh);
        } else {
            view2 = view;
            aVar = (C99381a) view.getTag();
        }
        mo138844d(aVar, zVar);
        C99373c.m129677g(aVar.f291410k, zVar);
        C101834rc0 D = C100734q.m131813D(zVar);
        ImageView imageView = aVar.f291410k;
        int i = f291409c;
        FavoriteImageServer.m118077d(imageView, C0966R.raw.fav_list_img_default, D, zVar, false, i, i);
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99381a) view.getTag()).f291387a, md02);
    }
}
