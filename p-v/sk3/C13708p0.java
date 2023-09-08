package sk3;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.gallery.MediaHistoryGalleryUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import rk3.C63462a;
import rx3.C13598b0;

/* renamed from: sk3.p0 */
public final class C13708p0 extends C87413o implements C32226l<View, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13704n0 f38788d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13708p0(C13704n0 n0Var) {
        super(1);
        this.f38788d = n0Var;
    }

    public Object invoke(Object obj) {
        View view = (View) obj;
        C87412m.m108594g(view, LocaleUtil.ITALIAN);
        if (view instanceof TextView) {
            ((C64004q0) C39818r.f106831a.mo62444c(this.f38788d.getActivity()).mo75002a(C64004q0.class)).mo88771c3();
            Object tag = ((TextView) view).getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) tag).intValue();
            if (!C72996z1.m85820U5(this.f38788d.f38781f)) {
                intValue++;
            }
            Bundle bundle = null;
            switch (intValue) {
                case 0:
                    C13704n0 n0Var = this.f38788d;
                    n0Var.getClass();
                    Log.m105924i("MicroMsg.FTSMultiSearchEduUIC", "onSearchMemberDetail");
                    Intent intent = new Intent();
                    intent.putExtra("from_scene", 1);
                    intent.putExtra("RoomInfo_Id", n0Var.f38781f);
                    intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, n0Var.getActivity().getResources().getString(C0966R.string.ig7));
                    C88144b.m109801s(n0Var.getActivity(), "com.tencent.mm.chatroom.ui.SeeMemberRecordUI", intent, (Bundle) null);
                    break;
                case 1:
                    C13704n0 n0Var2 = this.f38788d;
                    n0Var2.getClass();
                    Log.m105924i("MicroMsg.FTSMultiSearchEduUIC", "onSearchDateDetail");
                    Intent intent2 = new Intent();
                    intent2.putExtra("detail_username", n0Var2.f38781f);
                    C88144b.m109801s(n0Var2.getActivity(), "com.tencent.mm.chatroom.ui.SelectDateUI", intent2, (Bundle) null);
                    break;
                case 2:
                    C13704n0 n0Var3 = this.f38788d;
                    n0Var3.getClass();
                    Log.m105924i("MicroMsg.FTSMultiSearchEduUIC", "onSeeImageVideoHistory");
                    Intent intent3 = new Intent();
                    intent3.putExtra("kintent_talker", n0Var3.f38781f);
                    intent3.putExtra("key_media_type", 1);
                    intent3.putExtra("key_gallery_enter_scene", 4);
                    intent3.setClass(n0Var3.getActivity(), MediaHistoryGalleryUI.class);
                    intent3.addFlags(67108864);
                    n0Var3.getActivity().startActivityForResult(intent3, 1);
                    break;
                case 3:
                    C13704n0 n0Var4 = this.f38788d;
                    n0Var4.getClass();
                    Log.m105924i("MicroMsg.FTSMultiSearchEduUIC", "onSeeFileHistory");
                    Intent intent4 = new Intent();
                    intent4.putExtra("kintent_talker", n0Var4.f38781f);
                    intent4.putExtra("key_media_type", 2);
                    if (!C85875k4.m106211z()) {
                        bundle = ActivityOptions.makeSceneTransitionAnimation(n0Var4.getActivity(), new Pair[0]).toBundle();
                    }
                    intent4.putExtra("detail_user_dismiss", n0Var4.f38782g);
                    C63462a.f180011a.mo88333h(9, 1);
                    C88144b.m109801s(n0Var4.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent4, bundle);
                    break;
                case 4:
                    C13704n0 n0Var5 = this.f38788d;
                    n0Var5.getClass();
                    Log.m105924i("MicroMsg.FTSMultiSearchEduUIC", "onSeeUrlHistory");
                    Intent intent5 = new Intent();
                    intent5.putExtra("kintent_talker", n0Var5.f38781f);
                    intent5.putExtra("key_media_type", 3);
                    if (!C85875k4.m106211z()) {
                        bundle = ActivityOptions.makeSceneTransitionAnimation(n0Var5.getActivity(), new Pair[0]).toBundle();
                    }
                    C63462a.f180011a.mo88333h(9, 2);
                    intent5.putExtra("detail_user_dismiss", n0Var5.f38782g);
                    C88144b.m109801s(n0Var5.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent5, bundle);
                    break;
                case 5:
                    C13704n0 n0Var6 = this.f38788d;
                    n0Var6.getClass();
                    Log.m105924i("MicroMsg.FTSMultiSearchEduUIC", "onSeeUrlHistory");
                    Intent intent6 = new Intent();
                    intent6.putExtra("kintent_talker", n0Var6.f38781f);
                    intent6.putExtra("key_media_type", 4);
                    if (!C85875k4.m106211z()) {
                        bundle = ActivityOptions.makeSceneTransitionAnimation(n0Var6.getActivity(), new Pair[0]).toBundle();
                    }
                    C63462a.f180011a.mo88333h(9, 3);
                    intent6.putExtra("detail_user_dismiss", n0Var6.f38782g);
                    C88144b.m109801s(n0Var6.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent6, bundle);
                    break;
                case 6:
                    C13704n0 n0Var7 = this.f38788d;
                    n0Var7.getClass();
                    Log.m105924i("MicroMsg.FTSMultiSearchEduUIC", "onSeePayHistory");
                    Intent intent7 = new Intent();
                    intent7.putExtra("kintent_talker", n0Var7.f38781f);
                    intent7.putExtra("key_media_type", 5);
                    if (!C85875k4.m106211z()) {
                        bundle = ActivityOptions.makeSceneTransitionAnimation(n0Var7.getActivity(), new Pair[0]).toBundle();
                    }
                    C63462a.f180011a.mo88333h(9, 4);
                    intent7.putExtra("detail_user_dismiss", n0Var7.f38782g);
                    C88144b.m109801s(n0Var7.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent7, bundle);
                    break;
                case 7:
                    C13704n0 n0Var8 = this.f38788d;
                    n0Var8.getClass();
                    Log.m105924i("MicroMsg.FTSMultiSearchEduUIC", "onSeeAppBrandHistory");
                    Intent intent8 = new Intent();
                    intent8.putExtra("kintent_talker", n0Var8.f38781f);
                    intent8.putExtra("key_media_type", 6);
                    if (!C85875k4.m106211z()) {
                        bundle = ActivityOptions.makeSceneTransitionAnimation(n0Var8.getActivity(), new Pair[0]).toBundle();
                    }
                    C63462a.f180011a.mo88333h(9, 5);
                    intent8.putExtra("detail_user_dismiss", n0Var8.f38782g);
                    C88144b.m109801s(n0Var8.getActivity(), "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", intent8, bundle);
                    break;
                case 8:
                    C13704n0 n0Var9 = this.f38788d;
                    n0Var9.getClass();
                    Log.m105924i("MicroMsg.FTSMultiSearchEduUIC", "onSeeFinderFeedHistory");
                    Intent intent9 = new Intent();
                    intent9.putExtra("kintent_talker", n0Var9.f38781f);
                    if (!C85875k4.m106211z()) {
                        bundle = ActivityOptions.makeSceneTransitionAnimation(n0Var9.getActivity(), new Pair[0]).toBundle();
                    }
                    intent9.putExtra("detail_user_dismiss", n0Var9.f38782g);
                    C88144b.m109801s(n0Var9.getActivity(), "com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI", intent9, bundle);
                    break;
            }
        }
        return C13598b0.f38549a;
    }
}
