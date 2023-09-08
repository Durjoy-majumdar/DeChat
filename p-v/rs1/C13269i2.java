package rs1;

import android.app.Activity;
import android.text.SpannableString;
import androidx.lifecycle.C0120a0;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.view.FinderHotCommentLayout;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import java.util.LinkedList;
import jq3.C60905o;
import p629ny.C76979h;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: rs1.i2 */
public final class C13269i2<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C60905o f37650d;

    /* renamed from: e */
    public final /* synthetic */ C0740i2 f37651e;

    /* renamed from: f */
    public final /* synthetic */ C0740i2 f37652f;

    /* renamed from: g */
    public final /* synthetic */ FinderHotCommentLayout f37653g;

    /* renamed from: h */
    public final /* synthetic */ C13282j2 f37654h;

    /* renamed from: i */
    public final /* synthetic */ C32226l<FinderCommentInfo, C13598b0> f37655i;

    public C13269i2(C60905o oVar, C0740i2 i2Var, C0740i2 i2Var2, FinderHotCommentLayout finderHotCommentLayout, C13282j2 j2Var, C32226l<? super FinderCommentInfo, C13598b0> lVar) {
        this.f37650d = oVar;
        this.f37651e = i2Var;
        this.f37652f = i2Var2;
        this.f37653g = finderHotCommentLayout;
        this.f37654h = j2Var;
        this.f37655i = lVar;
    }

    public void onChanged(Object obj) {
        LinkedList linkedList = (LinkedList) obj;
        Object obj2 = this.f37650d.f173503E;
        C0740i2 i2Var = obj2 instanceof C0740i2 ? (C0740i2) obj2 : null;
        if (i2Var != null) {
            if (this.f37651e.getItemId() == i2Var.getItemId()) {
                C87412m.m108593f(linkedList, "commentList");
                FinderCommentInfo finderCommentInfo = (FinderCommentInfo) C110818d0.m150916N(linkedList);
                if (finderCommentInfo != null) {
                    C0740i2 i2Var2 = this.f37652f;
                    FinderHotCommentLayout finderHotCommentLayout = this.f37653g;
                    C13282j2 j2Var = this.f37654h;
                    C32226l<FinderCommentInfo, C13598b0> lVar = this.f37655i;
                    if (!Util.isNullOrNil(finderCommentInfo.content)) {
                        Log.m105924i("Finder.FeedHotCommentUIC", "observeWithNotify feedId=" + i2Var2.getItemId() + " comment=" + finderCommentInfo.content);
                        finderHotCommentLayout.setVisibility(0);
                        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                        Activity context = j2Var.getContext();
                        String str = finderCommentInfo.content;
                        if (str == null) {
                            str = "";
                        }
                        SpannableString T1 = hVar.mo107057T1(context, str);
                        C87412m.m108593f(T1, "getService(ISpannableSer…t, comment.content ?: \"\")");
                        finderHotCommentLayout.mo4578a(T1, finderCommentInfo.likeCount);
                        finderHotCommentLayout.setOnClickListener(new C13257h2(lVar, finderCommentInfo, j2Var));
                    }
                }
            }
        }
    }
}
