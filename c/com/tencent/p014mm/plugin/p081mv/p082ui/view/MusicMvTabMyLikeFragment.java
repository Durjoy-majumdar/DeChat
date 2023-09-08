package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabFragment;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jb2.C9289o;
import kotlin.Metadata;
import lb2.C61275h;
import ob0.C117747y;
import p749xh.C102658n6;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C51129rn0;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabMyLikeFragment;", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment;", "Lob0/n;", "", "getFeedFrom", "getType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment */
public final class MusicMvTabMyLikeFragment extends MusicMvTabFragment {

    /* renamed from: w */
    public C89349b f163655w;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicMvTabMyLikeFragment(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public void mo80601c(C102658n6 n6Var, String str) {
        this.f163633g = n6Var;
        this.f163634h = str;
        C86709a0.m107524d().mo123460f(new C9289o(C66785b.f191882e.mo90662O5(), this.f163655w));
    }

    public int getFeedFrom() {
        return 6;
    }

    public int getType() {
        return 4;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        C117747y yVar2 = yVar;
        if (yVar2 instanceof C9289o) {
            if (i == 0 && i2 == 0) {
                C9289o oVar = (C9289o) yVar2;
                C51129rn0 rn02 = oVar.f29052n;
                Integer num = null;
                this.f163655w = rn02 != null ? rn02.f141037e : null;
                if (rn02 != null) {
                    Iterator<FinderObject> it = rn02.f141036d.iterator();
                    while (it.hasNext()) {
                        FinderObject next = it.next();
                        if (next != null) {
                            C61275h.f174381a.mo86259a(next);
                            FinderObjectDesc finderObjectDesc = next.objectDesc;
                            if (finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null || finderMedia.mediaType != 2) {
                                long j = next.f164794id;
                                String str2 = next.objectNonceId;
                                if (!getFeedIdMap().contains(Long.valueOf(j))) {
                                    ArrayList<MusicMvTabFragment.C57117c> dataList = getDataList();
                                    MusicMvTabFragment.C57119e eVar = r7;
                                    MusicMvTabFragment.C57119e eVar2 = new MusicMvTabFragment.C57119e(j, str2, next, false, 8, (C8480h) null);
                                    dataList.add(new MusicMvTabFragment.C57117c(eVar));
                                }
                            }
                        }
                    }
                    getAdapter().notifyDataSetChanged();
                    C51129rn0 rn03 = oVar.f29052n;
                    if (rn03 != null) {
                        num = Integer.valueOf(rn03.f141038f);
                    }
                    setHasMore(num == null || num.intValue() != 0);
                    C32224a<C13598b0> onSceneEndListener = getOnSceneEndListener();
                    if (onSceneEndListener != null) {
                        onSceneEndListener.invoke();
                    }
                    Log.m105924i("Music.MusicMvTabFragment", "onSceneEnd GetFinderLikeFeed " + getDataList().size() + ", hasMore:" + getHasMore());
                }
            }
            getRlLayout().mo82440F(0);
            MusicMvTabFragment.C57116b resultListener = getResultListener();
            if (resultListener != null) {
                resultListener.mo80635a(3, getAdapter().getItemCount());
            }
            WxRecyclerAdapter<MusicMvTabFragment.C57117c> adapter = getAdapter();
            if (adapter != null && adapter.getItemCount() == 0) {
                LinearLayout emptyLL = getEmptyLL();
                if (emptyLL != null) {
                    emptyLL.setVisibility(0);
                }
            } else {
                LinearLayout emptyLL2 = getEmptyLL();
                if (emptyLL2 != null) {
                    emptyLL2.setVisibility(8);
                }
            }
            TextView loadingTv = getLoadingTv();
            if (loadingTv != null) {
                loadingTv.setVisibility(8);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvTabMyLikeFragment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        C87412m.m108594g(context, "context");
        C86709a0.m107524d().mo123455a(3965, this);
    }
}
