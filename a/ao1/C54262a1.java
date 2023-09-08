package ao1;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import bl3.C39818r;
import bt1.C54556b;
import bt1.C54563e;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderMediaExtra;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import nj3.C11184p0;
import rx3.C13604l;
import te3.C64365fh0;
import te3.C64689rq2;
import te3.C64775vi0;
import wq1.C66171a;

/* renamed from: ao1.a1 */
public final class C54262a1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ PostMainUIC f152301d;

    public C54262a1(PostMainUIC postMainUIC) {
        this.f152301d = postMainUIC;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        LinkedList<String> linkedList;
        FinderObject finderObject;
        LinkedList<String> linkedList2;
        FinderObject feedObject;
        FinderObject feedObject2;
        FinderObjectDesc finderObjectDesc;
        C64365fh0 fh02;
        LinkedList<C64775vi0> linkedList3;
        FinderObject feedObject3;
        FinderObjectDesc finderObjectDesc2;
        FinderMediaExtra finderMediaExtra;
        LinkedList<String> linkedList4;
        FinderObject feedObject4;
        FinderObjectDesc finderObjectDesc3;
        LinkedList<FinderMedia> linkedList5;
        LinkedList<C64689rq2> mediaExtList;
        C13604l<Integer, Integer> f;
        if (menuItem.getItemId() == 20003) {
            PostMainUIC.m64165c3(this.f152301d, 1);
            PostMainUIC postMainUIC = this.f152301d;
            C54556b bVar = postMainUIC.f160283t;
            if (!(bVar == null || (f = bVar.mo75442f()) == null)) {
                postMainUIC.mo78430l3().getLayoutParams().width = ((Number) f.f38555d).intValue();
                postMainUIC.mo78430l3().getLayoutParams().height = ((Number) f.f38556e).intValue();
            }
            ViewGroup viewGroup = postMainUIC.f160276j;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                C54556b bVar2 = postMainUIC.f160283t;
                if (bVar2 != null) {
                    bVar2.mo75440d();
                }
                postMainUIC.mo78410F3().f152963d = -1;
                postMainUIC.mo78410F3().f152973n = false;
                C54563e F3 = postMainUIC.mo78410F3();
                F3.f152960a.removeExtra("postType");
                F3.f152960a.removeExtra("postMediaList");
                F3.f152960a.removeExtra("key_post_media_quality_list");
                F3.f152960a.removeExtra("video_composition");
                F3.f152960a.removeExtra("postTypeList");
                F3.f152960a.removeExtra("postRefMediaList");
                F3.f152960a.removeExtra("postRefFeedInfo");
                F3.f152960a.removeExtra("KEY_POST_FROM_CAMERA");
                F3.f152960a.removeExtra("postVideoCropList");
                F3.f152960a.removeExtra("postThumbList");
                F3.f152960a.removeExtra("KEY_POST_VLOG_CROP_RECT");
                F3.f152960a.removeExtra("MEDIA_EXTRA_MUSIC");
                F3.f152960a.removeExtra("ORIGIN_MUSIC_ID");
                F3.f152960a.removeExtra("ORIGIN_MUSIC_INFO");
                F3.f152960a.removeExtra("ORIGIN_MUSIC_PATH");
                F3.f152960a.removeExtra("ORIGIN_BGM_URL");
                F3.f152960a.removeExtra("MEDIA_IS_MUTE");
                F3.f152960a.removeExtra("MUSIC_IS_MUTE");
                F3.f152960a.removeExtra("SOUND_TRACK_TYPE");
                F3.f152960a.removeExtra("MUSIC_FEED_ID");
                F3.f152960a.removeExtra("isLongVideoPost");
                F3.f152960a.removeExtra("KEY_POST_HALF_IMAGE_LIST");
                F3.f152960a.removeExtra("KEY_POST_HALF_RECT_LIST");
                F3.f152960a.removeExtra("VIDEO_COVER_URL");
                F3.f152960a.removeExtra("VIDEO_FULL_COVER_URL");
                F3.f152960a.removeExtra("VIDEO_COVER_QUALITY");
                F3.f152960a.removeExtra("VIDEO_COVER_STYLE");
                F3.f152960a.removeExtra("KEY_POST_MIAOJIAN_TONGKUAN_META");
                F3.f152958P = null;
                FinderItem finderItem = F3.f152943A;
                if (!(finderItem == null || (mediaExtList = finderItem.getMediaExtList()) == null)) {
                    mediaExtList.clear();
                }
                FinderItem finderItem2 = F3.f152943A;
                if (finderItem2 != null) {
                    finderItem2.setMediaType(-1);
                }
                FinderItem finderItem3 = F3.f152943A;
                if (!(finderItem3 == null || (feedObject4 = finderItem3.getFeedObject()) == null || (finderObjectDesc3 = feedObject4.objectDesc) == null || (linkedList5 = finderObjectDesc3.media) == null)) {
                    linkedList5.clear();
                }
                FinderItem finderItem4 = F3.f152943A;
                if (!(finderItem4 == null || (feedObject3 = finderItem4.getFeedObject()) == null || (finderObjectDesc2 = feedObject3.objectDesc) == null || (finderMediaExtra = finderObjectDesc2.mediaExtra) == null || (linkedList4 = finderMediaExtra.cover_url_word) == null)) {
                    linkedList4.clear();
                }
                FinderItem finderItem5 = F3.f152943A;
                if (!(finderItem5 == null || (feedObject2 = finderItem5.getFeedObject()) == null || (finderObjectDesc = feedObject2.objectDesc) == null || (fh02 = finderObjectDesc.client_draft_ext_info) == null || (linkedList3 = fh02.f183137h) == null)) {
                    linkedList3.clear();
                }
                Intent intent = F3.f152960a;
                FinderItem finderItem6 = F3.f152943A;
                intent.putExtra("KEY_POST_DRAFT_FINDER_ITEM", finderItem6 != null ? FinderItem.Companion.mo79059e(finderItem6).toByteArray() : null);
                C66171a aVar = C66171a.f190181a;
                FinderItem finderItem7 = F3.f152943A;
                FinderObjectDesc finderObjectDesc4 = (finderItem7 == null || (feedObject = finderItem7.getFeedObject()) == null) ? null : feedObject.objectDesc;
                aVar.getClass();
                if (finderObjectDesc4 != null) {
                    finderObjectDesc4.imgFeedBgmInfo = null;
                    finderObjectDesc4.feedBgmInfo = null;
                    finderObjectDesc4.media.clear();
                    finderObjectDesc4.mediaType = 0;
                    FinderMediaExtra finderMediaExtra2 = finderObjectDesc4.mediaExtra;
                    if (!(finderMediaExtra2 == null || (linkedList2 = finderMediaExtra2.cover_url_word) == null)) {
                        linkedList2.clear();
                    }
                }
                FinderItem finderItem8 = F3.f152943A;
                FinderObjectDesc finderObjectDesc5 = (finderItem8 == null || (finderObject = finderItem8.field_finderObject) == null) ? null : finderObject.objectDesc;
                if (finderObjectDesc5 != null) {
                    finderObjectDesc5.imgFeedBgmInfo = null;
                    finderObjectDesc5.feedBgmInfo = null;
                    finderObjectDesc5.media.clear();
                    finderObjectDesc5.mediaType = 0;
                    FinderMediaExtra finderMediaExtra3 = finderObjectDesc5.mediaExtra;
                    if (!(finderMediaExtra3 == null || (linkedList = finderMediaExtra3.cover_url_word) == null)) {
                        linkedList.clear();
                    }
                }
                ((C54270m1) C39818r.f106831a.mo62443b(postMainUIC.getContext()).mo75002a(C54270m1.class)).f152325p.clear();
                postMainUIC.getIntent().removeExtra("postType");
                postMainUIC.f160283t = null;
                postMainUIC.mo78425f3();
                View l3 = postMainUIC.mo78430l3();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view = l3;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/post/PostMainUIC", "delMediaInternal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                l3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/post/PostMainUIC", "delMediaInternal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View m3 = postMainUIC.mo78431m3();
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view2 = m3;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/post/PostMainUIC", "delMediaInternal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/post/PostMainUIC", "delMediaInternal", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C87412m.m108603p("mediaViewContainer");
            throw null;
        }
    }
}
