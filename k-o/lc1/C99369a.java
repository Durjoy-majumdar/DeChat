package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavAlbumContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import kg3.C76577a;
import pb1.C100752x0;
import pb1.C100755z;
import pc1.C100770a;
import te3.C101811md0;
import te3.C101834rc0;

/* renamed from: lc1.a */
public final class C99369a extends C99373c {

    /* renamed from: c */
    public final int f291371c = 85;

    /* renamed from: lc1.a$a */
    public final class C99370a extends c$$e {

        /* renamed from: k */
        public FavAlbumContainer f291372k;

        /* renamed from: l */
        public TextView f291373l;

        public C99370a(C99369a aVar) {
        }
    }

    public C99369a(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        C99370a aVar;
        View view2;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(zVar, "itemInfo");
        Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new C99370a(this);
            view2 = View.inflate(context, C0966R.C0971layout.d7s, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            C87412m.m108593f(context, "context");
            aVar.f291372k = new FavAlbumContainer(context, C76577a.m92151b(context, this.f291371c), C76577a.m92151b(context, 1));
            View findViewById = view2.findViewById(C0966R.C0970id.o6o);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
            ((LinearLayout) findViewById).addView(aVar.f291372k, 0);
            View findViewById2 = view2.findViewById(C0966R.C0970id.cww);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            aVar.f291373l = (TextView) findViewById2;
        } else {
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavAlbumListItem.FavAlbumHolder");
            view2 = view;
            aVar = (C99370a) tag;
        }
        mo138844d(aVar, zVar);
        TextView textView = aVar.f291373l;
        if (textView != null) {
            Context context2 = viewGroup.getContext();
            C87412m.m108593f(context2, "parent.context");
            LinkedList<C101834rc0> linkedList = zVar.field_favProto.f298618f;
            C87412m.m108593f(linkedList, "itemInfo.favProto.dataList");
            if (!linkedList.isEmpty()) {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((C101834rc0) it.next()).f299258I == 2) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (!z4) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                str = context2.getString(C0966R.string.ctv, new Object[]{Integer.valueOf(zVar.field_favProto.f298618f.size())});
                C87412m.m108593f(str, "context.getString(R.stri…o.favProto.dataList.size)");
            } else {
                LinkedList<C101834rc0> linkedList2 = zVar.field_favProto.f298618f;
                C87412m.m108593f(linkedList2, "itemInfo.favProto.dataList");
                if (!linkedList2.isEmpty()) {
                    Iterator<T> it4 = linkedList2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        if (((C101834rc0) it4.next()).f299258I == 4) {
                            z3 = true;
                            continue;
                        } else {
                            z3 = false;
                            continue;
                        }
                        if (!z3) {
                            z2 = false;
                            break;
                        }
                    }
                }
                z2 = true;
                if (z2) {
                    str = context2.getString(C0966R.string.ctx, new Object[]{Integer.valueOf(zVar.field_favProto.f298618f.size())});
                    C87412m.m108593f(str, "context.getString(R.stri…o.favProto.dataList.size)");
                } else {
                    str = context2.getString(C0966R.string.ctw, new Object[]{Integer.valueOf(zVar.field_favProto.f298618f.size())});
                    C87412m.m108593f(str, "context.getString(R.stri…o.favProto.dataList.size)");
                }
            }
            textView.setText(str);
        }
        FavAlbumContainer favAlbumContainer = aVar.f291372k;
        if (favAlbumContainer != null) {
            favAlbumContainer.setAlbumFiller(new C100770a(zVar));
            favAlbumContainer.mo104368f(zVar.field_favProto.f298618f.size());
        }
        Log.m105924i("MicroMsg.FavAlbumListItem", "filling album item");
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        C87412m.m108594g(view, "view");
        Object tag = view.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavAlbumListItem.FavAlbumHolder");
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(view.getContext(), ((C99370a) tag).f291387a, md02);
    }
}
