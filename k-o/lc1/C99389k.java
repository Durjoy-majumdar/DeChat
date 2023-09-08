package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCardActionReportStruct;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kg3.C76577a;
import nj3.C76912y0;
import p204mr.C34648o;
import p206nj.C88955f;
import p652pu.C100910b;
import p823sg.C90193h;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C62602o;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C64719t23;
import za2.C102984b;

/* renamed from: lc1.k */
public class C99389k extends C99373c {

    /* renamed from: c */
    public final int f291426c;

    /* renamed from: d */
    public Set<ImageView> f291427d;

    /* renamed from: e */
    public View.OnClickListener f291428e = new C99390a();

    /* renamed from: lc1.k$a */
    public class C99390a implements View.OnClickListener {
        public C99390a() {
        }

        public void onClick(View view) {
            String str;
            String str2;
            C64719t23 t232;
            View view2 = view;
            Class cls = C34648o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C64719t23 t233 = null;
            if (!C88955f.m111058b()) {
                C76912y0.m92771j(C99389k.this.f291378a.f269877a, (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (view.getTag() instanceof C100755z) {
                C100755z zVar = (C100755z) view.getTag();
                C101835rd0 rd02 = zVar.field_favProto.f298616d;
                C101834rc0 D = C100734q.m131813D(zVar);
                if (D == null) {
                    Log.m105928w("MicroMsg.FavBaseListItem", "data item is null");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (C100734q.m131839b0(D)) {
                    Log.m105924i("MicroMsg.FavBaseListItem", "same song, do release");
                    MvCardActionReportStruct mvCardActionReportStruct = new MvCardActionReportStruct();
                    mvCardActionReportStruct.f156518j = 2;
                    mvCardActionReportStruct.f156519k = 9;
                    ((C34648o) C86312j.m106911c(cls)).mo59203Jr(mvCardActionReportStruct);
                    C101093a.m132490l();
                    C99389k.m129701h(C99389k.this, (ImageView) null);
                } else if (!WeChatBrands.Business.Entries.SessionMusic.checkAvailable(view.getContext())) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else {
                    C86009m1 m1Var = new C86009m1(C100734q.m131826Q(D));
                    String str3 = "";
                    if (m1Var.mo119967g()) {
                        str3 = m1Var.mo119971i();
                    } else if (D.f299254G != null) {
                        C86009m1 m1Var2 = new C86009m1(C100734q.m131812C() + C90193h.m112878f(D.f299254G.getBytes()));
                        if (m1Var2.mo119967g()) {
                            str3 = m1Var2.mo119971i();
                        }
                    }
                    String str4 = str3;
                    C101841sc0 sc02 = D.f299296c1;
                    if (sc02 != null) {
                        t233 = sc02.f299401C;
                    }
                    String str5 = D.f299297d;
                    String str6 = D.f299301f;
                    String str7 = D.f299242A;
                    String str8 = D.f299250E;
                    String str9 = D.f299246C;
                    String str10 = "(Landroid/view/View;)V";
                    String str11 = D.f299280T;
                    String str12 = "onClick";
                    String str13 = str5;
                    String str14 = str6;
                    String str15 = str7;
                    String str16 = str8;
                    String str17 = str9;
                    String str18 = str11;
                    C101106m sL = ((C100910b) C86312j.m106911c(C100910b.class)).mo139948sL(6, (String) null, str13, str14, str15, str16, str17, str18, C100734q.m131809A(), str4, "", rd02.f299362w, C62602o.m73561a(D.f299280T, t233));
                    sL.f295976x = D.f299251E1;
                    sL.f295969q = D.f299255G1;
                    C101841sc0 sc03 = D.f299296c1;
                    if (!(sc03 == null || (t232 = sc03.f299401C) == null || Util.isNullOrNil(t232.f185470r))) {
                        sL.f295954P = D.f299296c1.f299401C.f185470r;
                    }
                    sL.f295949J = D.f299280T;
                    C101093a.m132488j(sL);
                    C99389k.m129701h(C99389k.this, (ImageView) view2);
                    MvCardActionReportStruct mvCardActionReportStruct2 = new MvCardActionReportStruct();
                    mvCardActionReportStruct2.f156518j = 1;
                    mvCardActionReportStruct2.f156519k = 9;
                    ((C34648o) C86312j.m106911c(cls)).mo59203Jr(mvCardActionReportStruct2);
                    str2 = str10;
                    str = str12;
                    C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", str, str2);
                }
            }
            str2 = "(Landroid/view/View;)V";
            str = "onClick";
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", str, str2);
        }
    }

    /* renamed from: lc1.k$b */
    public static class C99391b extends c$$e {

        /* renamed from: k */
        public ImageView f291430k;

        /* renamed from: l */
        public ImageView f291431l;

        /* renamed from: m */
        public TextView f291432m;

        /* renamed from: n */
        public TextView f291433n;
    }

    public C99389k(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
        this.f291426c = C76577a.m92157h(favoriteImageServer.f269877a, C0966R.dimen.f3804ex);
        this.f291427d = new HashSet();
    }

    /* renamed from: h */
    public static void m129701h(C99389k kVar, ImageView imageView) {
        Log.m105925i("MicroMsg.FavBaseListItem", "mask iv set size is %d", Integer.valueOf(((HashSet) kVar.f291427d).size()));
        Iterator it = ((HashSet) kVar.f291427d).iterator();
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
        C99391b bVar;
        View view2;
        String str;
        C100755z zVar2 = zVar;
        Context context = viewGroup.getContext();
        C64719t23 t232 = null;
        if (view == null) {
            C99391b bVar2 = new C99391b();
            View inflate = View.inflate(context, C0966R.C0971layout.a6q, (ViewGroup) null);
            mo138843a(inflate, bVar2, zVar2);
            bVar2.f291430k = (ImageView) inflate.findViewById(C0966R.C0970id.cv_);
            bVar2.f291432m = (TextView) inflate.findViewById(C0966R.C0970id.cww);
            bVar2.f291433n = (TextView) inflate.findViewById(C0966R.C0970id.cuv);
            bVar2.f291431l = (ImageView) inflate.findViewById(C0966R.C0970id.cve);
            ((TextView) inflate.findViewById(C0966R.C0970id.cw9)).setVisibility(8);
            bVar2.f291431l.setOnClickListener(this.f291428e);
            bVar2.f291431l.setVisibility(0);
            ((HashSet) this.f291427d).add(bVar2.f291431l);
            C99373c.m129676f(bVar2.f291430k, 7);
            bVar = bVar2;
            view2 = inflate;
        } else {
            try {
                view2 = view;
                bVar = (C99391b) view.getTag();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.FavBaseListItem", "invalid type, message:" + e.getMessage());
                return view;
            }
        }
        bVar.f291388b.setImageResource(C0966R.raw.fav_type_music);
        bVar.f291388b.setIconColor(C76577a.m92153d(context, C0966R.color.FG_2));
        bVar.f291388b.setVisibility(0);
        mo138844d(bVar, zVar2);
        if (zVar2.field_sourceType == 31) {
            TextView textView = bVar.f291389c;
            textView.setText(textView.getContext().getString(C0966R.string.d0s));
        }
        C101834rc0 D = C100734q.m131813D(zVar);
        if (D == null) {
            Log.m105928w("MicroMsg.FavBaseListItem", "getView, data item is null");
            return view2;
        }
        String str2 = D.f299297d;
        String str3 = D.f299301f;
        C101841sc0 sc02 = D.f299296c1;
        if (sc02 != null) {
            t232 = sc02.f299401C;
        }
        if (t232 != null) {
            if (!Util.isNullOrNil(t232.f185462g)) {
                str3 = t232.f185462g + context.getString(C0966R.string.h2w);
                str2 = str2 + String.format("·%s", new Object[]{D.f299301f});
            } else if (!Util.isNullOrNil(t232.f185463h)) {
                str3 = t232.f185463h;
            }
            str = t232.f185461f;
        } else {
            str = "";
        }
        bVar.f291432m.setText(str2);
        if (!Util.isNullOrNil(str3)) {
            bVar.f291433n.setText(str3);
            bVar.f291433n.setVisibility(0);
        }
        if (D.f299296c1 == null) {
            D.f299296c1 = new C101841sc0();
        }
        C101841sc0 sc03 = D.f299296c1;
        if (sc03.f299401C == null) {
            sc03.f299401C = new C64719t23();
        }
        if (!Util.isNullOrNil(str)) {
            C20937c.C20939b bVar3 = new C20937c.C20939b();
            String c = C102984b.m136166c(str);
            bVar3.f59350f = c;
            bVar3.f59346b = true;
            bVar3.f59364t = true;
            bVar3.f59345a = true;
            bVar3.f59363s = true;
            bVar3.f59365u = (float) C76577a.m92151b(context, 2);
            C20828a.m22825b().mo32519h(str, bVar.f291430k, bVar3.mo32666a());
            D.f299296c1.f299401C.f185472t = c;
        } else {
            FavoriteImageServer favoriteImageServer = this.f291378a;
            ImageView imageView = bVar.f291430k;
            int i = this.f291426c;
            favoriteImageServer.mo128330c(imageView, D, zVar, C0966R.raw.app_attach_file_icon_music, i, i);
        }
        bVar.f291431l.setTag(zVar2);
        if (C100734q.m131839b0(D)) {
            bVar.f291431l.setImageResource(C0966R.C0969drawable.ajq);
            bVar.f291431l.setContentDescription(context.getString(C0966R.string.a1a));
        } else {
            bVar.f291431l.setImageResource(C0966R.C0969drawable.ajs);
            bVar.f291431l.setContentDescription(context.getString(C0966R.string.a1s));
        }
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        if (WeChatBrands.Business.Entries.SessionMusic.checkAvailable(view.getContext())) {
            ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99391b) view.getTag()).f291387a, md02);
        }
    }
}
