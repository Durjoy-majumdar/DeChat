package pq1;

import com.google.android.gms.common.internal.ImagesContract;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import p629ny.C76979h;
import sq1.C64147b;
import sq1.C64151e;
import te3.C64854ye0;

/* renamed from: pq1.a */
public final class C62490a {

    /* renamed from: a */
    public static final C62490a f177529a = new C62490a();

    /* renamed from: a */
    public final C64151e mo87519a(FinderCommentInfo finderCommentInfo, long j) {
        C87412m.m108594g(finderCommentInfo, "level1CommentInfo");
        C64147b bVar = new C64147b();
        bVar.field_feedId = j;
        bVar.field_state = 2;
        C64854ye0 ye02 = bVar.field_actionInfo;
        ye02.f186497e = finderCommentInfo;
        ye02.f186500h = 0;
        return mo87521c(bVar);
    }

    /* renamed from: b */
    public final C64151e mo87520b(FinderCommentInfo finderCommentInfo, long j, long j2) {
        C87412m.m108594g(finderCommentInfo, "level2CommentInfo");
        C64147b bVar = new C64147b();
        bVar.field_feedId = j;
        bVar.field_state = 2;
        C64854ye0 ye02 = bVar.field_actionInfo;
        ye02.f186497e = finderCommentInfo;
        ye02.f186500h = j2;
        return mo87521c(bVar);
    }

    /* renamed from: c */
    public final C64151e mo87521c(C64147b bVar) {
        C87412m.m108594g(bVar, ImagesContract.LOCAL);
        C64151e eVar = new C64151e(bVar);
        ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), eVar.f181868d.getContent());
        return eVar;
    }
}
