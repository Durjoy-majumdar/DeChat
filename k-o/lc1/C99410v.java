package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import di3.C86312j;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101811md0;

/* renamed from: lc1.v */
public class C99410v extends C99373c {

    /* renamed from: lc1.v$a */
    public static class C99411a extends c$$e {

        /* renamed from: k */
        public TextView f291491k;
    }

    public C99410v(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        View view2;
        C99411a aVar;
        String str;
        Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new C99411a();
            view2 = View.inflate(context, C0966R.C0971layout.f359669a70, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            aVar.f291491k = (TextView) view2.findViewById(C0966R.C0970id.cww);
        } else {
            view2 = view;
            aVar = (C99411a) view.getTag();
        }
        mo138844d(aVar, zVar);
        float f = ((float) ((long) C100734q.m131813D(zVar).f299338y)) / 1000.0f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f > 60.0f) {
            f = 60.0f;
        }
        int round = (int) ((float) Math.round(f));
        TextView textView = aVar.f291491k;
        Context context2 = this.f291378a.f269877a;
        if (round <= 0) {
            str = context2.getString(C0966R.string.cs_, new Object[]{0});
        } else {
            str = context2.getString(C0966R.string.cs_, new Object[]{Integer.valueOf(round)});
        }
        textView.setText(str);
        C99373c.m129677g(aVar.f291491k, zVar);
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99411a) view.getTag()).f291387a, md02);
    }
}
