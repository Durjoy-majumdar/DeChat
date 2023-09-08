package com.tencent.p014mm.plugin.finder.uniComments;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter;
import hp3.C87581a;
import java.util.List;
import nj3.C76912y0;
import rx3.C13598b0;
import rx3.C13604l;
import sq1.C64151e;
import u60.C14121l;
import u60.C65234n;

/* renamed from: com.tencent.mm.plugin.finder.uniComments.e */
public final class C56469e<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ UniCommentDrawerPresenter f161456a;

    /* renamed from: b */
    public final /* synthetic */ C64151e f161457b;

    /* renamed from: c */
    public final /* synthetic */ boolean f161458c;

    /* renamed from: d */
    public final /* synthetic */ C14121l f161459d;

    public C56469e(UniCommentDrawerPresenter uniCommentDrawerPresenter, C64151e eVar, boolean z, C14121l lVar) {
        this.f161456a = uniCommentDrawerPresenter;
        this.f161457b = eVar;
        this.f161458c = z;
        this.f161459d = lVar;
    }

    public Object call(Object obj) {
        C13604l lVar = (C13604l) obj;
        int intValue = ((Number) lVar.f38555d).intValue();
        List list = (List) lVar.f38556e;
        if (intValue == -1) {
            UniCommentDrawerPresenter.C56449a aVar = this.f161456a.f161383n;
            if (aVar != null) {
                aVar.mo79249a(this.f161457b.f181868d.mo88875m2(), this.f161457b.f181868d.field_localCommentId, true);
            }
            C76912y0.makeText(this.f161456a.f161376d, (int) C0966R.string.emv, 0).show();
        } else if (intValue == 0) {
            UniCommentDrawerPresenter.m64756x(this.f161456a, list, this.f161457b, this.f161458c);
        }
        this.f161459d.mo11853b(C65234n.OK);
        return C13598b0.f38549a;
    }
}
