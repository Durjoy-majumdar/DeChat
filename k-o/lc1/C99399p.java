package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.C68924p1;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import di3.C86312j;
import f40.C86709a0;
import java.util.HashSet;
import java.util.LinkedList;
import kg3.C76577a;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101811md0;
import te3.C101834rc0;

/* renamed from: lc1.p */
public class C99399p extends C99373c {

    /* renamed from: c */
    public HashSet<Long> f291472c = new HashSet<>();

    /* renamed from: d */
    public final int f291473d;

    /* renamed from: lc1.p$a */
    public static class C99400a extends c$$e {

        /* renamed from: k */
        public ImageView f291474k;

        /* renamed from: l */
        public TextView f291475l;
    }

    public C99399p(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
        this.f291473d = C76577a.m92157h(favoriteImageServer.f269877a, C0966R.dimen.f3805ey);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        C99400a aVar;
        View view2;
        Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new C99400a();
            view2 = View.inflate(context, C0966R.C0971layout.a6y, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            aVar.f291474k = (ImageView) view2.findViewById(C0966R.C0970id.cvh);
            aVar.f291475l = (TextView) view2.findViewById(C0966R.C0970id.cx7);
            C99373c.m129677g(aVar.f291474k, zVar);
        } else {
            view2 = view;
            aVar = (C99400a) view.getTag();
        }
        LinkedList<C101834rc0> linkedList = zVar.field_favProto.f298618f;
        if (linkedList.size() > 0) {
            int i = linkedList.getFirst().f299338y;
            aVar.f291475l.setText(C68924p1.m81172a(context, i));
            if (i <= 1 && !this.f291472c.contains(Long.valueOf(zVar.field_localId))) {
                this.f291472c.add(Long.valueOf(zVar.field_localId));
                C86709a0.m107525e().postToWorker(new C99398o(this, zVar));
            }
            aVar.f291475l.setVisibility(0);
        } else {
            aVar.f291475l.setVisibility(8);
        }
        mo138844d(aVar, zVar);
        C101834rc0 D = C100734q.m131813D(zVar);
        FavoriteImageServer favoriteImageServer = this.f291378a;
        ImageView imageView = aVar.f291474k;
        int i2 = this.f291473d;
        favoriteImageServer.mo128330c(imageView, D, zVar, C0966R.raw.app_attach_file_icon_video, i2, i2);
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99400a) view.getTag()).f291387a, md02);
    }
}
