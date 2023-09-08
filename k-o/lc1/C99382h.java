package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.C93697s1;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import p629ny.C76979h;
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101801kd0;
import te3.C101811md0;
import te3.C101871zc0;

/* renamed from: lc1.h */
public class C99382h extends C99373c {

    /* renamed from: lc1.h$a */
    public static class C99383a extends c$$e {

        /* renamed from: k */
        public ImageView f291411k;

        /* renamed from: l */
        public TextView f291412l;

        /* renamed from: m */
        public TextView f291413m;
    }

    public C99382h(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        View view2;
        C99383a aVar;
        Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new C99383a();
            view2 = View.inflate(context, C0966R.C0971layout.a6r, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            aVar.f291411k = (ImageView) view2.findViewById(C0966R.C0970id.cv_);
            aVar.f291412l = (TextView) view2.findViewById(C0966R.C0970id.cww);
            aVar.f291413m = (TextView) view2.findViewById(C0966R.C0970id.cuy);
            C99373c.m129677g(aVar.f291412l, zVar);
        } else {
            view2 = view;
            aVar = (C99383a) view.getTag();
        }
        mo138844d(aVar, zVar);
        aVar.f291411k.setImageResource(C0966R.C0969drawable.f4989u9);
        C101801kd0 kd02 = zVar.field_favProto;
        C101871zc0 zc02 = kd02.f298620h;
        String str = kd02.f298624o;
        String str2 = "";
        if (!Util.isNullOrNil(str)) {
            aVar.f291412l.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(aVar.f291412l.getContext(), str, aVar.f291412l.getTextSize()));
            if (C93697s1.m118412c(mo138848h(zc02))) {
                aVar.f291413m.setText(mo138848h(zc02));
            } else {
                TextView textView = aVar.f291413m;
                if (zc02 == null) {
                    Log.m105924i("MicroMsg.FavBaseListItem", "getLabel but locItem is null");
                } else {
                    str2 = zc02.f299956j;
                }
                textView.setText(str2);
            }
        } else if (C93697s1.m118412c(mo138848h(zc02))) {
            aVar.f291412l.setText(mo138848h(zc02));
            TextView textView2 = aVar.f291413m;
            if (zc02 == null) {
                Log.m105924i("MicroMsg.FavBaseListItem", "getLabel but locItem is null");
            } else {
                str2 = zc02.f299956j;
            }
            textView2.setText(str2);
        } else {
            TextView textView3 = aVar.f291412l;
            if (zc02 == null) {
                Log.m105924i("MicroMsg.FavBaseListItem", "getLabel but locItem is null");
            } else {
                str2 = zc02.f299956j;
            }
            textView3.setText(str2);
            aVar.f291413m.setVisibility(8);
        }
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        if (WeChatBrands.Business.Entries.SessionLocation.checkAvailable(view.getContext())) {
            ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99383a) view.getTag()).f291387a, md02);
        }
    }

    /* renamed from: h */
    public final String mo138848h(C101871zc0 zc02) {
        if (zc02 != null) {
            return zc02.f299958o;
        }
        Log.m105924i("MicroMsg.FavBaseListItem", "getPoiname but locItem is null");
        return "";
    }
}
