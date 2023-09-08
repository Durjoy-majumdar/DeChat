package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101811md0;
import te3.C101834rc0;

/* renamed from: lc1.e */
public class C99376e extends C99373c {

    /* renamed from: lc1.e$a */
    public static class C99377a extends c$$e {

        /* renamed from: k */
        public ImageView f291401k;

        /* renamed from: l */
        public TextView f291402l;

        /* renamed from: m */
        public TextView f291403m;
    }

    public C99376e(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        View view2;
        C99377a aVar;
        String str;
        Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new C99377a();
            view2 = View.inflate(context, C0966R.C0971layout.a6r, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            aVar.f291401k = (ImageView) view2.findViewById(C0966R.C0970id.cv_);
            aVar.f291402l = (TextView) view2.findViewById(C0966R.C0970id.cww);
            aVar.f291403m = (TextView) view2.findViewById(C0966R.C0970id.cuy);
        } else {
            view2 = view;
            aVar = (C99377a) view.getTag();
        }
        mo138844d(aVar, zVar);
        C101834rc0 D = C100734q.m131813D(zVar);
        String str2 = zVar.field_favProto.f298626q;
        if (Util.isNullOrNil(str2) || (zVar.f295172Q0 && D != null)) {
            str2 = D.f299297d;
        }
        if (!Util.isNullOrNil(str2)) {
            int lastIndexOf = str2.lastIndexOf(".");
            if (lastIndexOf != -1) {
                String upperCase = str2.substring(lastIndexOf + 1).toUpperCase();
                str2 = str2.substring(0, lastIndexOf);
                str = upperCase + " " + C100734q.m131818I((float) D.f299276R);
            } else {
                str = C100734q.m131818I((float) D.f299276R);
            }
            aVar.f291402l.setText(str2);
            aVar.f291403m.setText(str);
        } else {
            aVar.f291402l.setText("");
            aVar.f291403m.setText(C100734q.m131818I((float) D.f299276R));
        }
        if (D.f299322q1 == 2) {
            aVar.f291403m.setText(">" + ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128211cX(true) + "MB");
        }
        C99373c.m129677g(aVar.f291402l, zVar);
        aVar.f291401k.setImageResource(C93693r.m118403d(D.f299262K));
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        C100755z zVar = ((C99377a) view.getTag()).f291387a;
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), zVar, md02);
    }
}
