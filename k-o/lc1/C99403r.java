package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import di3.C86312j;
import p629ny.C76979h;
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101811md0;

/* renamed from: lc1.r */
public class C99403r extends C99373c {

    /* renamed from: lc1.r$a */
    public static class C99404a extends c$$e {

        /* renamed from: k */
        public TextView f291482k;
    }

    public C99403r(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        View view2;
        C99404a aVar;
        Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new C99404a();
            view2 = View.inflate(context, C0966R.C0971layout.a6z, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            aVar.f291482k = (TextView) view2.findViewById(C0966R.C0970id.cwu);
        } else {
            view2 = view;
            aVar = (C99404a) view.getTag();
        }
        mo138844d(aVar, zVar);
        String str = zVar.field_favProto.f298628s;
        if (str == null || str.length() <= 0) {
            aVar.f291482k.setText("");
            return view2;
        }
        aVar.f291482k.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(aVar.f291482k.getContext(), zVar.field_favProto.f298628s, aVar.f291482k.getTextSize()));
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99404a) view.getTag()).f291387a, md02);
    }
}
