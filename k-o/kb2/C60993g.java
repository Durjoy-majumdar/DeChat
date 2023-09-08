package kb2;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.vfs.C86009m1;
import d03.C58010a;
import gy3.C87412m;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ma2.C61454t;
import n03.C61597a;
import sx3.C110818d0;

/* renamed from: kb2.g */
public final class C60993g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60994h f173706d;

    /* renamed from: e */
    public final /* synthetic */ FrameLayout f173707e;

    /* renamed from: f */
    public final /* synthetic */ C60995i f173708f;

    /* renamed from: g */
    public final /* synthetic */ View f173709g;

    public C60993g(C60994h hVar, FrameLayout frameLayout, C60995i iVar, View view) {
        this.f173706d = hVar;
        this.f173707e = frameLayout;
        this.f173708f = iVar;
        this.f173709g = view;
    }

    public final void onClick(View view) {
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        LinkedList<FinderMedia> linkedList2;
        FinderMedia finderMedia2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C61597a b = this.f173706d.f173710e.mo86536b();
        this.f173707e.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        FrameLayout frameLayout = this.f173707e;
        C87412m.m108592e(b, "null cannot be cast to non-null type android.view.View");
        frameLayout.addView((View) b, layoutParams);
        FinderObject finderObject = this.f173708f.f173713f.f183798f;
        if (finderObject != null) {
            String str = "video_" + finderObject.f164794id;
            C87412m.m108594g(str, "mediaId");
            String i = new C86009m1(C61454t.f174766a.mo86431c(str)).mo119971i();
            C87412m.m108593f(i, "VFSFile(MusicFileNameUti…th(mediaId)).absolutePath");
            FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
            if (!(finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null)) {
                String str2 = finderMedia.url;
                String str3 = "";
                C58010a aVar = new C58010a(str, i, str2 == null ? str3 : str2, C60641c.m70921b(finderMedia.width), C60641c.m70921b(finderMedia.height));
                aVar.f165929a = 2;
                aVar.f165930b = "xV2";
                String str4 = finderMedia.url_token;
                if (str4 == null) {
                    str4 = str3;
                }
                aVar.f165931c = str4;
                aVar.f165932d = finderMedia.decodeKey;
                String str5 = finderMedia.thumbUrl;
                if (str5 == null) {
                    str5 = str3;
                }
                aVar.f165936h = str5;
                String str6 = finderMedia.thumb_url_token;
                if (str6 != null) {
                    str3 = str6;
                }
                aVar.f165937i = str3;
                FinderObjectDesc finderObjectDesc2 = finderObject.objectDesc;
                aVar.f165935g = ((finderObjectDesc2 == null || (linkedList2 = finderObjectDesc2.media) == null || (finderMedia2 = (FinderMedia) C110818d0.m150914L(linkedList2)) == null) ? 0 : (long) finderMedia2.videoDuration) * ((long) 1000);
                aVar.f165933e = false;
                aVar.f165945q = finderObject;
                b.mo81156b();
                b.setMediaInfo(aVar);
                b.mo81155a();
                b.start();
                b.setLoop(true);
                b.setMute(true);
            }
        }
        View view2 = this.f173709g;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert$onBindViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert$onBindViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
