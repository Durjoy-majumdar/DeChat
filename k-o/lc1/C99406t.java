package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import kg3.C76577a;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import pb1.C47450f1;
import te3.C101755ad0;
import te3.C101756ae0;
import te3.C101760bd0;
import te3.C101801kd0;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C52097yc0;
import wc3.C102430l;

/* renamed from: lc1.t */
public class C99406t extends C99373c {

    /* renamed from: c */
    public final int f291483c;

    /* renamed from: lc1.t$a */
    public static class C99407a extends c$$e {

        /* renamed from: k */
        public ImageView f291484k;

        /* renamed from: l */
        public ImageView f291485l;

        /* renamed from: m */
        public TextView f291486m;

        /* renamed from: n */
        public TextView f291487n;
    }

    public C99406t(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
        this.f291483c = C76577a.m92157h(favoriteImageServer.f269877a, C0966R.dimen.f3804ex);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        C99407a aVar;
        View view2;
        String str;
        LinkedList<C52097yc0> linkedList;
        C100755z zVar2 = zVar;
        Context context = viewGroup.getContext();
        if (view == null) {
            C99407a aVar2 = new C99407a();
            View inflate = View.inflate(context, C0966R.C0971layout.a6q, (ViewGroup) null);
            mo138843a(inflate, aVar2, zVar2);
            aVar2.f291484k = (ImageView) inflate.findViewById(C0966R.C0970id.cv_);
            aVar2.f291485l = (ImageView) inflate.findViewById(C0966R.C0970id.cve);
            aVar2.f291486m = (TextView) inflate.findViewById(C0966R.C0970id.cww);
            aVar2.f291487n = (TextView) inflate.findViewById(C0966R.C0970id.cuv);
            aVar2.f291486m.setMaxLines(2);
            aVar = aVar2;
            view2 = inflate;
        } else {
            view2 = view;
            aVar = (C99407a) view.getTag();
        }
        aVar.f291388b.setImageResource(C0966R.raw.icons_outlined_subscriptions);
        aVar.f291388b.setIconColor(C76577a.m92153d(context, C0966R.color.FG_2));
        aVar.f291388b.setVisibility(0);
        mo138844d(aVar, zVar2);
        C101834rc0 D = C100734q.m131813D(zVar);
        C101756ae0 ae02 = zVar2.field_favProto.f298622j;
        TextView textView = aVar.f291486m;
        C101834rc0 D2 = C100734q.m131813D(zVar);
        String str2 = ae02 != null ? ae02.f297863d : "";
        if (Util.isNullOrNil(str2) && D2 != null) {
            str2 = D2.f299297d;
        }
        if (Util.isNullOrNil(str2)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str2);
            textView.setVisibility(0);
        }
        TextView textView2 = aVar.f291486m;
        TextView textView3 = aVar.f291487n;
        C101834rc0 D3 = C100734q.m131813D(zVar);
        if (ae02 == null || (linkedList = ae02.f297881y) == null || linkedList.size() == 0) {
            str = "";
        } else {
            str = ae02.f297865f;
            if (Util.isNullOrNil(str) && D3 != null) {
                str = D3.f299301f;
            }
            if (Util.isNullOrNil(str)) {
                String Sh0 = ((C47450f1) C86312j.m106911c(C47450f1.class)).Sh0(ae02.f297881y.size());
                StringBuilder sb = new StringBuilder();
                sb.append(Sh0);
                Iterator<C52097yc0> it = ae02.f297881y.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().f145226e);
                }
                str = sb.toString();
            }
        }
        if (Util.isNullOrNil(str)) {
            textView3.setVisibility(8);
            textView2.setMaxLines(2);
        } else {
            textView3.setText(str);
            textView3.setVisibility(0);
            textView3.setBackground(C76577a.m92158i(MMApplicationContext.getContext(), C0966R.C0969drawable.f357155cp3));
            textView3.setTextColor(C76577a.m92153d(MMApplicationContext.getContext(), C0966R.color.FG_0_5));
            textView2.setMaxLines(1);
        }
        int a = C102430l.m135146a(D.f299262K);
        FavoriteImageServer favoriteImageServer = this.f291378a;
        ImageView imageView = aVar.f291484k;
        int i = a == C0966R.raw.app_attach_file_icon_unknow ? C0966R.C0969drawable.f4997zs : a;
        int i2 = this.f291483c;
        favoriteImageServer.mo128330c(imageView, D, zVar, i, i2, i2);
        C101755ad0 ad02 = zVar2.field_favProto.f298612K;
        if ((ad02 == null || ad02.f297848d != 16) && (ae02 == null || Util.isNullOrNil(ae02.f297877u))) {
            aVar.f291485l.setVisibility(8);
        } else {
            aVar.f291485l.setImageResource(C0966R.raw.shortvideo_play_btn);
            aVar.f291485l.setVisibility(0);
        }
        ImageView imageView2 = aVar.f291485l;
        if (imageView2 != null) {
            imageView2.setContentDescription("");
        }
        C99373c.m129676f(aVar.f291484k, 5);
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        C101755ad0 ad02;
        C99407a aVar = (C99407a) view.getTag();
        Context context = view.getContext();
        ImageView imageView = aVar.f291484k;
        C100755z zVar = aVar.f291387a;
        C101801kd0 kd02 = zVar.field_favProto;
        if (!(kd02 == null || (ad02 = kd02.f298612K) == null || ad02.f297848d < 0)) {
            int[] iArr = new int[2];
            if (imageView != null) {
                int width = imageView.getWidth();
                int height = imageView.getHeight();
                imageView.getLocationInWindow(iArr);
                C101755ad0 ad03 = zVar.field_favProto.f298612K;
                C101760bd0 bd02 = new C101760bd0();
                ad03.f297858q = bd02;
                bd02.f297979d = iArr[0];
                bd02.f297980e = iArr[1];
                bd02.f297981f = width;
                bd02.f297982g = height;
            }
        }
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(context, aVar.f291387a, md02);
    }

    /* renamed from: e */
    public void mo138842e(c$$e c__e) {
        try {
            C101756ae0 ae02 = c__e.f291387a.field_favProto.f298622j;
            if (ae02 == null || Util.isNullOrNil(ae02.f297877u)) {
                super.mo138842e(c__e);
            } else {
                c__e.f291389c.setText(C0966R.string.k5h);
            }
        } catch (Exception unused) {
        }
    }
}
