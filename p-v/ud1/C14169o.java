package ud1;

import com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC;
import java.util.Map;
import q31.C118148a;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: ud1.o */
public final class C14169o implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ FinderMusicTopicHeaderUIC f39610a;

    public C14169o(FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
        this.f39610a = finderMusicTopicHeaderUIC;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        C13604l[] lVarArr = new C13604l[4];
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f39610a.getActivity());
        Integer num = null;
        lVarArr[0] = new C13604l("session_id", f != null ? f.f38099o : null);
        C13442s8 f2 = aVar.mo12873f(this.f39610a.getActivity());
        lVarArr[1] = new C13604l("finder_context_id", f2 != null ? f2.f38098n : null);
        C13442s8 f3 = aVar.mo12873f(this.f39610a.getActivity());
        lVarArr[2] = new C13604l("finder_tab_context_id", f3 != null ? f3.f38100p : null);
        C13442s8 f4 = aVar.mo12873f(this.f39610a.getActivity());
        if (f4 != null) {
            num = Integer.valueOf(f4.f38096i);
        }
        lVarArr[3] = new C13604l("comment_scene", num);
        return C90364q0.m113147f(lVarArr);
    }
}
