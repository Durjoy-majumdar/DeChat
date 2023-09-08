package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kg3.C76577a;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101811md0;
import te3.C101834rc0;

/* renamed from: lc1.m */
public class C99394m extends C99373c {

    /* renamed from: c */
    public final int f291454c;

    /* renamed from: d */
    public final String f291455d;

    /* renamed from: lc1.m$a */
    public static class C99395a extends c$$e {

        /* renamed from: k */
        public ImageView f291456k;

        /* renamed from: l */
        public TextView f291457l;

        /* renamed from: m */
        public TextView f291458m;
    }

    public C99394m(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
        this.f291454c = C76577a.m92157h(favoriteImageServer.f269877a, C0966R.dimen.f3804ex);
        this.f291455d = favoriteImageServer.f269877a.getString(C0966R.string.cpz);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        C99395a aVar;
        View view2;
        Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new C99395a();
            view2 = View.inflate(context, C0966R.C0971layout.a6q, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            aVar.f291456k = (ImageView) view2.findViewById(C0966R.C0970id.cv_);
            aVar.f291457l = (TextView) view2.findViewById(C0966R.C0970id.cww);
            ((TextView) view2.findViewById(C0966R.C0970id.cuv)).setVisibility(8);
            TextView textView = (TextView) view2.findViewById(C0966R.C0970id.cw9);
            aVar.f291458m = textView;
            textView.setVisibility(0);
            C99373c.m129676f(aVar.f291456k, 11);
        } else {
            view2 = view;
            aVar = (C99395a) view.getTag();
        }
        mo138844d(aVar, zVar);
        aVar.f291457l.setText(Util.nullAsNil(zVar.field_favProto.f298634y.f298511d));
        aVar.f291458m.setText(Util.nullAs(C100734q.m131876u(context, zVar.field_favProto.f298616d.f299362w), this.f291455d));
        FavoriteImageServer favoriteImageServer = this.f291378a;
        ImageView imageView = aVar.f291456k;
        int i = this.f291454c;
        favoriteImageServer.mo128330c(imageView, (C101834rc0) null, zVar, C0966R.raw.app_attach_file_icon_unknow, i, i);
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99395a) view.getTag()).f291387a, md02);
    }
}
