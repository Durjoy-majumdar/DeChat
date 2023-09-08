package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kg3.C76577a;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101850ud0;

/* renamed from: lc1.q */
public class C99401q extends C99373c {

    /* renamed from: c */
    public final int f291476c;

    /* renamed from: d */
    public final String f291477d = "";

    /* renamed from: lc1.q$a */
    public static class C99402a extends c$$e {

        /* renamed from: k */
        public MMImageView f291478k;

        /* renamed from: l */
        public TextView f291479l;

        /* renamed from: m */
        public TextView f291480m;

        /* renamed from: n */
        public TextView f291481n;
    }

    public C99401q(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
        this.f291476c = C76577a.m92157h(favoriteImageServer.f269877a, C0966R.dimen.f3804ex);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        C99402a aVar;
        View view2;
        Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new C99402a();
            view2 = View.inflate(context, C0966R.C0971layout.a6q, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            aVar.f291478k = (MMImageView) view2.findViewById(C0966R.C0970id.cv_);
            aVar.f291479l = (TextView) view2.findViewById(C0966R.C0970id.cww);
            aVar.f291480m = (TextView) view2.findViewById(C0966R.C0970id.cuv);
            TextView textView = (TextView) view2.findViewById(C0966R.C0970id.cw9);
            aVar.f291481n = textView;
            textView.setVisibility(0);
            C99373c.m129677g(aVar.f291479l, zVar);
        } else {
            view2 = view;
            aVar = (C99402a) view.getTag();
        }
        mo138844d(aVar, zVar);
        C101850ud0 ud02 = zVar.field_favProto.f298604C;
        if (ud02 != null) {
            aVar.f291479l.setText(Util.nullAsNil(ud02.f299618d));
            aVar.f291480m.setText(Util.nullAsNil(ud02.f299620f));
        } else {
            aVar.f291479l.setText("");
            aVar.f291480m.setText("");
        }
        aVar.f291481n.setText(Util.nullAs(C100734q.m131876u(context, zVar.field_favProto.f298616d.f299362w), this.f291477d));
        FavoriteImageServer favoriteImageServer = this.f291378a;
        MMImageView mMImageView = aVar.f291478k;
        int i = this.f291476c;
        favoriteImageServer.mo128330c(mMImageView, (C101834rc0) null, zVar, C0966R.raw.app_attach_file_icon_unknow, i, i);
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99402a) view.getTag()).f291387a, md02);
    }
}
