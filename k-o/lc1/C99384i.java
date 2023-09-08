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
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101793jd0;
import te3.C101811md0;
import te3.C101834rc0;

/* renamed from: lc1.i */
public class C99384i extends C99373c {

    /* renamed from: c */
    public final int f291414c;

    /* renamed from: lc1.i$a */
    public static class C99385a extends c$$e {

        /* renamed from: k */
        public ImageView f291415k;

        /* renamed from: l */
        public TextView f291416l;

        /* renamed from: m */
        public TextView f291417m;
    }

    public C99384i(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
        this.f291414c = C76577a.m92157h(favoriteImageServer.f269877a, C0966R.dimen.f3804ex);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        View view2;
        C99385a aVar;
        Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new C99385a();
            view2 = View.inflate(context, C0966R.C0971layout.a6q, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            aVar.f291415k = (ImageView) view2.findViewById(C0966R.C0970id.cv_);
            aVar.f291416l = (TextView) view2.findViewById(C0966R.C0970id.cww);
            aVar.f291417m = (TextView) view2.findViewById(C0966R.C0970id.cuv);
            ((TextView) view2.findViewById(C0966R.C0970id.cw9)).setVisibility(8);
            C99373c.m129676f(aVar.f291415k, 11);
        } else {
            view2 = view;
            aVar = (C99385a) view.getTag();
        }
        mo138844d(aVar, zVar);
        C101793jd0 jd02 = zVar.field_favProto.f298634y;
        aVar.f291416l.setText(Util.nullAsNil(jd02.f298511d));
        aVar.f291417m.setText(Util.nullAsNil(jd02.f298513f));
        aVar.f291416l.setSingleLine(false);
        aVar.f291416l.setMaxLines(2);
        FavoriteImageServer favoriteImageServer = this.f291378a;
        ImageView imageView = aVar.f291415k;
        int i = this.f291414c;
        favoriteImageServer.mo128330c(imageView, (C101834rc0) null, zVar, C0966R.raw.app_attach_file_icon_unknow, i, i);
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99385a) view.getTag()).f291387a, md02);
    }
}
