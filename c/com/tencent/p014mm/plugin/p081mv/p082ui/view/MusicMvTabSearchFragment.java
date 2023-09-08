package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCreateActionStruct;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabFragment;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.UUID;
import je1.C9320i4;
import kotlin.Metadata;
import lb2.C61275h;
import ob0.C117747y;
import ob0.C89137b0;
import p749xh.C102658n6;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49572gk1;
import te3.C49712hj1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabSearchFragment;", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment;", "Lob0/n;", "", "getFeedFrom", "getType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment */
public final class MusicMvTabSearchFragment extends MusicMvTabFragment {

    /* renamed from: w */
    public int f163657w;

    /* renamed from: x */
    public C89349b f163658x;

    /* renamed from: y */
    public String f163659y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicMvTabSearchFragment(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public void mo80601c(C102658n6 n6Var, String str) {
        String str2 = str;
        this.f163633g = n6Var;
        this.f163634h = str2;
        if (this.f163659y == null) {
            this.f163659y = UUID.randomUUID().toString();
        }
        String str3 = this.f163659y;
        if (str3 != null && str2 != null) {
            String str4 = str.length() > 0 ? str2 : null;
            if (str4 != null) {
                C49712hj1 hj12 = new C49712hj1();
                hj12.f134675i = 93;
                C89137b0 d = C86709a0.m107524d();
                C9320i4 i4Var = r2;
                C9320i4 i4Var2 = new C9320i4(str4, this.f163657w, str3, this.f163658x, 12, hj12, (C89349b) null, (C89349b) null, (C89349b) null, false, 0, Exif.PARSE_EXIF_ERROR_UNKNOWN_BYTEALIGN, (C8480h) null);
                d.mo123460f(i4Var);
                MvCreateActionStruct c = MvCreateReportHelper.f163005a.mo80352c();
                c.f156561t = c.mo86045b("KeyWord", str4, true);
                c.f156562u = c.mo86045b("ExpId", "", true);
                c.f156552k = 3;
                c.mo86054n();
                c.mo86056r();
            }
        }
    }

    public int getFeedFrom() {
        return 7;
    }

    public int getType() {
        return 5;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C9320i4) {
            if (i == 0 && i2 == 0) {
                C49572gk1 gk12 = ((C9320i4) yVar).f29125v;
                this.f163658x = gk12.f134092h;
                this.f163657w = gk12.f134089e;
                setHasMore(gk12.f134090f != 0);
                Iterator<FinderObject> it = gk12.f134091g.iterator();
                while (it.hasNext()) {
                    FinderObject next = it.next();
                    if (next != null) {
                        C61275h.f174381a.mo86259a(next);
                        long j = next.f164794id;
                        String str2 = next.objectNonceId;
                        if (!getFeedIdMap().contains(Long.valueOf(j))) {
                            getDataList().add(new MusicMvTabFragment.C57117c(new MusicMvTabFragment.C57119e(j, str2, next, false, 8, (C8480h) null)));
                        }
                    }
                }
                getAdapter().notifyDataSetChanged();
                C32224a<C13598b0> onSceneEndListener = getOnSceneEndListener();
                if (onSceneEndListener != null) {
                    onSceneEndListener.invoke();
                }
                Log.m105924i("Music.MusicMvTabFragment", "onSceneEnd BGFinderFeed " + getDataList().size());
            }
            getRlLayout().mo82440F(0);
            MusicMvTabFragment.C57116b resultListener = getResultListener();
            if (resultListener != null) {
                resultListener.mo80635a(4, getAdapter().getItemCount());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvTabSearchFragment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        C87412m.m108594g(context, "context");
        C86709a0.m107524d().mo123455a(3820, this);
    }
}
