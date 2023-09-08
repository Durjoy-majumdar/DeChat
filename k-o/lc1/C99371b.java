package lc1;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86299o;
import di3.C86312j;
import kg3.C76577a;
import kr0.C76629w0;
import kr0.C76630x0;
import kr0.C88274h0;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C90431pc0;

/* renamed from: lc1.b */
public class C99371b extends C99373c {

    /* renamed from: c */
    public final int f291374c;

    /* renamed from: lc1.b$a */
    public static class C99372a extends c$$e {

        /* renamed from: k */
        public ImageView f291375k;

        /* renamed from: l */
        public ImageView f291376l;

        /* renamed from: m */
        public TextView f291377m;
    }

    public C99371b(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
        this.f291374c = C76577a.m92157h(favoriteImageServer.f269877a, C0966R.dimen.f3804ex);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        C99372a aVar;
        View view2;
        Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new C99372a();
            view2 = View.inflate(context, C0966R.C0971layout.a6p, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            aVar.f291375k = (ImageView) view2.findViewById(C0966R.C0970id.cv_);
            aVar.f291376l = (ImageView) view2.findViewById(C0966R.C0970id.cvg);
            aVar.f291377m = (TextView) view2.findViewById(C0966R.C0970id.cww);
        } else {
            view2 = view;
            aVar = (C99372a) view.getTag();
        }
        mo138844d(aVar, zVar);
        C101834rc0 D = C100734q.m131813D(zVar);
        String str = zVar.field_favProto.f298626q;
        if (Util.isNullOrNil(str)) {
            str = D.f299297d;
        }
        aVar.f291377m.setText(str);
        aVar.f291388b.setImageResource(C0966R.raw.icons_outlined_mini_program);
        aVar.f291388b.setIconColor(C76577a.m92153d(context, C0966R.color.FG_2));
        aVar.f291388b.setVisibility(0);
        C90431pc0 pc02 = zVar.field_favProto.f298610I;
        if (pc02 == null || pc02.f259752r != 1) {
            aVar.f291376l.setVisibility(8);
        } else {
            aVar.f291376l.setVisibility(0);
        }
        Pair<String, Integer> b0 = zVar.field_favProto.f298610I != null ? ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113308b0(zVar.field_favProto.f298610I.f259743f) : null;
        if (b0 == null || Util.isNullOrNil((String) b0.first)) {
            aVar.f291390d.setText((CharSequence) null);
            aVar.f291390d.setVisibility(8);
        } else {
            aVar.f291390d.setText((CharSequence) b0.first);
            aVar.f291390d.setBackgroundResource(((Integer) b0.second).intValue());
            aVar.f291390d.setVisibility(0);
        }
        ImageView imageView = aVar.f291375k;
        int i = this.f291374c;
        FavoriteImageServer.m118077d(imageView, C0966R.raw.fav_list_icon_miniprogram_default, D, zVar, false, i, i);
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        C90431pc0 pc02 = ((c$$e) view.getTag()).f291387a.field_favProto.f298610I;
        if (pc02 == null) {
            Log.m105920e("MicroMsg.FavAppBrandListItem", "onListItemClick appBrandItem null");
            return;
        }
        C86299o oVar = new C86299o();
        oVar.f250929a = pc02.f259741d;
        oVar.f250930b = pc02.f259742e;
        oVar.f250931c = pc02.f259743f;
        oVar.f250932d = pc02.f259748n;
        oVar.f250934f = pc02.f259746i;
        oVar.f250939k = 1010;
        AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
        oVar.f250947s = appBrandLaunchReferrer;
        appBrandLaunchReferrer.f239400h = pc02.f259751q;
        appBrandLaunchReferrer.f239396d = 6;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(view.getContext(), oVar);
    }

    /* renamed from: e */
    public void mo138842e(c$$e c__e) {
        String string = c__e.f291389c.getContext().getString(C0966R.string.a4n);
        C90431pc0 pc02 = c__e.f291387a.field_favProto.f298610I;
        if (pc02 != null) {
            WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(pc02.f259741d);
            string = N2 != null ? N2.field_nickname : c__e.f291389c.getContext().getString(C0966R.string.a4n);
        }
        c__e.f291389c.setText(string);
    }
}
