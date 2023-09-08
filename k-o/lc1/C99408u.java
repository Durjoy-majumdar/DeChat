package lc1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.C68924p1;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.io.IOException;
import java.util.LinkedList;
import ke3.C88144b;
import kg3.C76577a;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import s90.C48300n;
import te3.C101755ad0;
import te3.C101760bd0;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101841sc0;

/* renamed from: lc1.u */
public class C99408u extends C99373c {

    /* renamed from: c */
    public final int f291488c;

    /* renamed from: lc1.u$a */
    public static class C99409a extends c$$e {

        /* renamed from: k */
        public ImageView f291489k;

        /* renamed from: l */
        public TextView f291490l;
    }

    public C99408u(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
        this.f291488c = C76577a.m92157h(favoriteImageServer.f269877a, C0966R.dimen.f3805ey);
    }

    /* renamed from: h */
    public static boolean m129726h(Context context, C101755ad0 ad02, C101834rc0 rc02, boolean z) {
        Log.m105925i("MicroMsg.FavVideoListItem", "handleMpVideoItem %s/%s", ad02.f297855n, ad02.f297854j);
        C48300n nVar = new C48300n();
        nVar.f133375p = ad02.f297855n;
        nVar.f133376q = ad02.f297856o;
        nVar.f133366d = ad02.f297860s;
        nVar.f133367e = ad02.f297861t;
        nVar.f133368f = ad02.f297854j;
        nVar.f133369g = rc02.f299297d;
        nVar.f133370h = ad02.f297859r;
        nVar.f133372j = ad02.f297850f;
        nVar.f133373n = ad02.f297851g;
        nVar.f133371i = ad02.f297853i;
        nVar.f133374o = rc02.f299242A;
        Log.m105924i("MicroMsg.FavVideoListItem", "[ImageGalleryUI] showImgGallery");
        Intent intent = new Intent();
        intent.putExtra("show_search_chat_content_result", false);
        intent.putExtra("img_gallery_msg_id", 0);
        intent.putExtra("img_gallery_talker", ad02.f297855n);
        intent.putExtra("img_gallery_chatroom_name", false);
        C101760bd0 bd02 = ad02.f297858q;
        if (bd02 != null) {
            intent.putExtra("img_gallery_width", bd02.f297981f).putExtra("img_gallery_height", ad02.f297858q.f297982g).putExtra("img_gallery_left", ad02.f297858q.f297979d).putExtra("img_gallery_top", ad02.f297858q.f297980e);
        }
        intent.putExtra("img_gallery_is_mp_video_without_msg", true);
        intent.putExtra("img_gallery_mp_video_click_from", 0);
        intent.putExtra("img_gallery_path", rc02.f299280T);
        intent.putExtra("show_enter_grid", false);
        intent.putExtra("KOpenArticleSceneFromScene", 24);
        intent.putExtra("img_preview_only", z);
        try {
            intent.putExtra("img_gallery_mp_share_video_info", nVar.toByteArray());
        } catch (IOException e) {
            Log.m105921e("MicroMsg.FavVideoListItem", "handleMpVideoItem toByteArray ex %s", e.getMessage());
        }
        C88144b.m109801s(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, (Bundle) null);
        ((Activity) context).overridePendingTransition(0, 0);
        return true;
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        C99409a aVar;
        View view2;
        Context context = viewGroup.getContext();
        if (view == null) {
            aVar = new C99409a();
            view2 = View.inflate(context, C0966R.C0971layout.a6y, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            aVar.f291489k = (ImageView) view2.findViewById(C0966R.C0970id.cvh);
            aVar.f291490l = (TextView) view2.findViewById(C0966R.C0970id.cx7);
        } else {
            view2 = view;
            aVar = (C99409a) view.getTag();
        }
        aVar.f291490l.setVisibility(0);
        LinkedList<C101834rc0> linkedList = zVar.field_favProto.f298618f;
        if (linkedList.size() <= 0 || linkedList.getFirst().f299338y <= 0) {
            aVar.f291490l.setText("");
        } else {
            aVar.f291490l.setText(C68924p1.m81172a(context, linkedList.getFirst().f299338y));
        }
        mo138844d(aVar, zVar);
        C99373c.m129677g(aVar.f291489k, zVar);
        C101834rc0 D = C100734q.m131813D(zVar);
        FavoriteImageServer favoriteImageServer = this.f291378a;
        ImageView imageView = aVar.f291489k;
        int i = this.f291488c;
        favoriteImageServer.mo128330c(imageView, D, zVar, C0966R.raw.app_attach_file_icon_video, i, i);
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        C101841sc0 sc02;
        C99409a aVar = (C99409a) view.getTag();
        Context context = view.getContext();
        C101834rc0 D = C100734q.m131813D(aVar.f291387a);
        View findViewById = view.findViewById(C0966R.C0970id.cvh);
        if (!(D == null || (sc02 = D.f299296c1) == null || sc02.f299422x == null)) {
            int[] iArr = new int[2];
            if (findViewById != null) {
                int width = findViewById.getWidth();
                int height = findViewById.getHeight();
                findViewById.getLocationInWindow(iArr);
                C101755ad0 ad02 = D.f299296c1.f299422x;
                C101760bd0 bd02 = new C101760bd0();
                ad02.f297858q = bd02;
                bd02.f297979d = iArr[0];
                bd02.f297980e = iArr[1];
                bd02.f297981f = width;
                bd02.f297982g = height;
            }
        }
        ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(context, aVar.f291387a, md02);
    }
}
