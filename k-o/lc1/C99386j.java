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
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kg3.C76577a;
import nj3.C76912y0;
import p206nj.C88955f;
import p652pu.C100910b;
import p823sg.C90193h;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import qc0.C101093a;
import qc0.C101106m;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C64719t23;

/* renamed from: lc1.j */
public class C99386j extends C99373c {

    /* renamed from: c */
    public final int f291418c;

    /* renamed from: d */
    public Set<ImageView> f291419d;

    /* renamed from: e */
    public View.OnClickListener f291420e = new C99387a();

    /* renamed from: lc1.j$a */
    public class C99387a implements View.OnClickListener {
        public C99387a() {
        }

        public void onClick(View view) {
            C64719t23 t232;
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/listitem/FavMusicListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!C88955f.m111058b()) {
                C76912y0.m92771j(C99386j.this.f291378a.f269877a, (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (view.getTag() instanceof C100755z) {
                C100755z zVar = (C100755z) view.getTag();
                C101835rd0 rd02 = zVar.field_favProto.f298616d;
                C101834rc0 D = C100734q.m131813D(zVar);
                if (D == null) {
                    Log.m105928w("MicroMsg.FavBaseListItem", "data item is null");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (C100734q.m131839b0(D)) {
                    Log.m105924i("MicroMsg.FavBaseListItem", "same song, do release");
                    C101093a.m132490l();
                    C99386j.m129698h(C99386j.this, (ImageView) null);
                } else if (!WeChatBrands.Business.Entries.SessionMusic.checkAvailable(view.getContext())) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else {
                    C86009m1 m1Var = new C86009m1(C100734q.m131826Q(D));
                    String str = "";
                    if (m1Var.mo119967g()) {
                        str = m1Var.mo119971i();
                    } else if (D.f299254G != null) {
                        C86009m1 m1Var2 = new C86009m1(C100734q.m131812C() + C90193h.m112878f(D.f299254G.getBytes()));
                        if (m1Var2.mo119967g()) {
                            str = m1Var2.mo119971i();
                        }
                    }
                    String str2 = str;
                    String str3 = D.f299297d;
                    String str4 = D.f299301f;
                    String str5 = D.f299242A;
                    String str6 = D.f299250E;
                    String str7 = D.f299246C;
                    String str8 = str5;
                    String str9 = str6;
                    String str10 = str7;
                    C101106m K40 = ((C100910b) C86312j.m106911c(C100910b.class)).K40(6, (String) null, str3, str4, str8, str9, str10, D.f299280T, C100734q.m131809A(), str2, "", rd02.f299362w);
                    K40.f295976x = D.f299251E1;
                    K40.f295969q = D.f299255G1;
                    C101841sc0 sc02 = D.f299296c1;
                    if (!(sc02 == null || (t232 = sc02.f299401C) == null || Util.isNullOrNil(t232.f185470r))) {
                        K40.f295954P = D.f299296c1.f299401C.f185470r;
                    }
                    K40.f295949J = D.f299280T;
                    C101093a.m132488j(K40);
                    C99386j.m129698h(C99386j.this, (ImageView) view2);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: lc1.j$b */
    public static class C99388b extends c$$e {

        /* renamed from: k */
        public ImageView f291422k;

        /* renamed from: l */
        public ImageView f291423l;

        /* renamed from: m */
        public TextView f291424m;

        /* renamed from: n */
        public TextView f291425n;
    }

    public C99386j(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
        this.f291418c = C76577a.m92157h(favoriteImageServer.f269877a, C0966R.dimen.f3804ex);
        this.f291419d = new HashSet();
    }

    /* renamed from: h */
    public static void m129698h(C99386j jVar, ImageView imageView) {
        Log.m105925i("MicroMsg.FavBaseListItem", "mask iv set size is %d", Integer.valueOf(((HashSet) jVar.f291419d).size()));
        Iterator it = ((HashSet) jVar.f291419d).iterator();
        while (it.hasNext()) {
            ImageView imageView2 = (ImageView) it.next();
            if (imageView2 == imageView) {
                imageView2.setImageResource(C0966R.C0969drawable.ajq);
            } else {
                imageView2.setImageResource(C0966R.C0969drawable.ajs);
            }
        }
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        C99388b bVar;
        View view2;
        Context context = viewGroup.getContext();
        if (view == null) {
            bVar = new C99388b();
            view2 = View.inflate(context, C0966R.C0971layout.a6q, (ViewGroup) null);
            mo138843a(view2, bVar, zVar);
            bVar.f291422k = (ImageView) view2.findViewById(C0966R.C0970id.cv_);
            bVar.f291424m = (TextView) view2.findViewById(C0966R.C0970id.cww);
            bVar.f291425n = (TextView) view2.findViewById(C0966R.C0970id.cuv);
            bVar.f291423l = (ImageView) view2.findViewById(C0966R.C0970id.cve);
            ((TextView) view2.findViewById(C0966R.C0970id.cw9)).setVisibility(8);
            bVar.f291423l.setOnClickListener(this.f291420e);
            bVar.f291423l.setVisibility(0);
            ((HashSet) this.f291419d).add(bVar.f291423l);
        } else {
            try {
                view2 = view;
                bVar = (C99388b) view.getTag();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.FavBaseListItem", "invalid type, message:" + e.getMessage());
                return view;
            }
        }
        bVar.f291388b.setImageResource(C0966R.raw.fav_type_music);
        bVar.f291388b.setIconColor(C76577a.m92153d(context, C0966R.color.FG_2));
        bVar.f291388b.setVisibility(0);
        mo138844d(bVar, zVar);
        C101834rc0 D = C100734q.m131813D(zVar);
        bVar.f291424m.setText(D.f299297d);
        C99373c.m129676f(bVar.f291422k, 7);
        bVar.f291425n.setText(D.f299301f);
        bVar.f291425n.setVisibility(0);
        FavoriteImageServer favoriteImageServer = this.f291378a;
        ImageView imageView = bVar.f291422k;
        int i = this.f291418c;
        favoriteImageServer.mo128330c(imageView, D, zVar, C0966R.raw.app_attach_file_icon_music, i, i);
        bVar.f291423l.setTag(zVar);
        if (C100734q.m131839b0(D)) {
            bVar.f291423l.setImageResource(C0966R.C0969drawable.ajq);
            bVar.f291423l.setContentDescription(context.getString(C0966R.string.a1a));
        } else {
            bVar.f291423l.setImageResource(C0966R.C0969drawable.ajs);
            bVar.f291423l.setContentDescription(context.getString(C0966R.string.a1s));
        }
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        if (WeChatBrands.Business.Entries.SessionMusic.checkAvailable(view.getContext())) {
            ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99388b) view.getTag()).f291387a, md02);
        }
    }
}
