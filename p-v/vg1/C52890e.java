package vg1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.C39622i0;
import bl1.C39775b;
import cl1.C39975j;
import com.tencent.p014mm.plugin.finder.live.comment.BoxCommentConfig;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C87412m;
import java.util.List;
import ks3.C46739p;
import ky2.C10432i;
import nk1.C47272h;
import ok1.C62042e;
import te3.C52013xs0;
import zc1.C66785b;

/* renamed from: vg1.e */
public final class C52890e {

    /* renamed from: a */
    public final Context f147700a;

    /* renamed from: b */
    public final FinderLiveBoxCommentPlugin f147701b;

    /* renamed from: c */
    public final String f147702c = "BoxCommentActionPresenter";

    /* renamed from: d */
    public Drawable f147703d;

    public C52890e(Context context, int i, FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(finderLiveBoxCommentPlugin, "plugin");
        this.f147700a = context;
        this.f147701b = finderLiveBoxCommentPlugin;
    }

    /* renamed from: a */
    public static final boolean m59208a(C52890e eVar, C39775b bVar) {
        eVar.getClass();
        return !C87412m.m108589b(bVar.mo62408b(), C75592q0.m90789s()) && !C87412m.m108589b(bVar.mo62408b(), C66785b.f191882e.mo90662O5()) && !C87412m.m108589b(bVar.mo62408b(), C75592q0.m90782l());
    }

    /* renamed from: b */
    public final <T extends C39622i0> T mo73647b(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        return this.f147701b.mo87684A0().mo71262a(cls);
    }

    /* renamed from: c */
    public final boolean mo73648c(C39775b bVar) {
        if (!((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            List<Integer> list = BoxCommentConfig.f111608a;
            if (BoxCommentConfig.f111608a.contains(Integer.valueOf(bVar.f106734e.f144903e))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo73649d(C39775b bVar) {
        C87412m.m108594g(bVar, "msg");
        boolean c = mo73648c(bVar);
        C52013xs0 xs02 = bVar.f106734e;
        if (xs02.f144913r <= 0 || !c) {
            String str = this.f147702c;
            Log.m105920e(str, "dislike failed,msg " + bVar.f106734e.f144903e + " seq:" + bVar.f106734e.f144913r + ",canLike:" + c);
            return false;
        }
        C47272h hVar = C47272h.f126894a;
        int i = bVar.f106735f;
        int i2 = C46739p.f125819a;
        C52013xs0 a = hVar.mo72296a(xs02, i, 2);
        C62042e eVar = C62042e.f176370a;
        String str2 = this.f147702c;
        eVar.mo86998D1(str2, "boxCommentLikeTrack dislike msg seq:" + bVar.f106734e.f144913r + ",likeCount:" + bVar.f106735f);
        if (a != null) {
            ((C39975j) mo73647b(C39975j.class)).mo62581i3(a);
            return true;
        }
        Log.m105928w(this.f147702c, "dislike failed, boxId is null");
        return false;
    }

    /* renamed from: e */
    public final boolean mo73650e(C39775b bVar) {
        C87412m.m108594g(bVar, "msg");
        boolean c = mo73648c(bVar);
        C52013xs0 xs02 = bVar.f106734e;
        if (xs02.f144913r <= 0 || !c) {
            String str = this.f147702c;
            Log.m105920e(str, "like failed,msg " + bVar.f106734e.f144903e + " seq:" + bVar.f106734e.f144913r + ",canLike:" + c);
        } else {
            C47272h hVar = C47272h.f126894a;
            int i = bVar.f106735f;
            int i2 = C46739p.f125819a;
            C52013xs0 a = hVar.mo72296a(xs02, i, 1);
            C62042e eVar = C62042e.f176370a;
            String str2 = this.f147702c;
            eVar.mo86998D1(str2, "boxCommentLikeTrack like msg seq:" + bVar.f106734e.f144913r + ",likeCount:" + bVar.f106735f);
            if (a != null) {
                ((C39975j) mo73647b(C39975j.class)).mo62581i3(a);
                return true;
            }
            Log.m105928w(this.f147702c, "like failed, boxId is null");
        }
        return false;
    }
}
