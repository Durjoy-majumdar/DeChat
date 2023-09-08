package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Set;
import p196ln.C76705f;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101811md0;
import te3.C101834rc0;

/* renamed from: lc1.d */
public class C99374d extends C99373c {

    /* renamed from: lc1.d$a */
    public static class C99375a extends c$$e {

        /* renamed from: k */
        public ImageView f291397k;

        /* renamed from: l */
        public TextView f291398l;

        /* renamed from: m */
        public TextView f291399m;

        /* renamed from: n */
        public TextView f291400n;
    }

    public C99374d(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        View view2;
        C99375a aVar;
        Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new C99375a();
            view2 = View.inflate(context, C0966R.C0971layout.a6q, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            aVar.f291397k = (ImageView) view2.findViewById(C0966R.C0970id.cv_);
            TextView textView = (TextView) view2.findViewById(C0966R.C0970id.cww);
            aVar.f291398l = textView;
            textView.setSingleLine(false);
            aVar.f291398l.setMaxLines(2);
            aVar.f291399m = (TextView) view2.findViewById(C0966R.C0970id.cuv);
            aVar.f291400n = (TextView) view2.findViewById(C0966R.C0970id.cw9);
        } else {
            view2 = view;
            aVar = (C99375a) view.getTag();
        }
        mo138844d(aVar, zVar);
        C101834rc0 D = C100734q.m131813D(zVar);
        C72963f4.C72964b Rv0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Rv0(D.f299301f);
        String str = Rv0.f212675a;
        if (str == null || str.length() <= 0) {
            Log.m105920e("MicroMsg.FavCardListItem", "parse possible friend msg failed");
        }
        if (Util.isNullOrNil(mo138847h(Rv0))) {
            aVar.f291399m.setVisibility(8);
        } else {
            aVar.f291399m.setText(mo138847h(Rv0));
        }
        aVar.f291400n.setText(C0966R.string.f360424com);
        aVar.f291400n.setVisibility(0);
        ImageView imageView = aVar.f291397k;
        String str2 = Rv0.f212675a;
        if (Util.isNullOrNil(str2)) {
            imageView.setImageResource(C0966R.C0969drawable.bfa);
        } else {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, str2);
        }
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99375a) view.getTag()).f291387a, md02);
    }

    /* renamed from: h */
    public String mo138847h(C72963f4.C72964b bVar) {
        String str = bVar.f212677c;
        boolean z = true;
        boolean z2 = false;
        if (Util.isNullOrNil(str)) {
            str = bVar.f212675a;
            if (C72996z1.m85802I4(str) || C72996z1.m85796D5(str)) {
                z2 = true;
            }
        }
        if (z2 || ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69724s3(str)) {
            z = z2;
        }
        int i = bVar.f212691q;
        Set<String> set = C45628s0.f123410p;
        return (z || C72996z1.m85810M4(i)) ? "" : str;
    }
}
