package kb2;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import n03.C61598b;
import sx3.C110818d0;

/* renamed from: kb2.h */
public final class C60994h extends C60896i<C60995i> {

    /* renamed from: e */
    public final C61598b f173710e;

    public C60994h(C61598b bVar) {
        C87412m.m108594g(bVar, "videoLayoutRecycler");
        this.f173710e = bVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.bip;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        C60995i iVar = (C60995i) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(iVar, "item");
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.kk6);
        FinderObject finderObject = iVar.f173713f.f183798f;
        if (!(finderObject == null || (finderObjectDesc = finderObject.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null)) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59345a = true;
            bVar.f59347c = true;
            bVar.f59359o = C0966R.C0969drawable.c_d;
            C20828a.m22825b().mo32519h(finderMedia.thumbUrl + finderMedia.thumb_url_token, imageView, bVar.mo32666a());
        }
        FrameLayout frameLayout = (FrameLayout) oVar.mo85812D(C0966R.C0970id.f359485l50);
        frameLayout.setVisibility(0);
        View D = oVar.mo85812D(C0966R.C0970id.hwy);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = D;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setOnClickListener(new C60993g(this, frameLayout, iVar, D));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
