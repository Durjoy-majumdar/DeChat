package kf1;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0747l;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import rs1.C13442s8;
import te3.C52271zj0;

/* renamed from: kf1.f9 */
public final class C9719f9 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C9673c9 f30146d;

    public C9719f9(C9673c9 c9Var) {
        this.f30146d = c9Var;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        String str;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        C60898l lVar = (C60898l) eVar;
        if (lVar.mo85796c6() <= 0 || i != 0) {
            C0747l lVar2 = this.f30146d.f30050f.f13222h.get(i - lVar.mo85796c6());
            C87412m.m108593f(lVar2, "presenter.getData()[activityItemPos]");
            C9673c9 c9Var = this.f30146d;
            c9Var.getClass();
            Class cls = C58417y0.class;
            C52271zj0 zj02 = lVar2.f1765d;
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            String xx02 = ((C58417y0) C86312j.m106911c(cls)).xx0(zj02.f146005d);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(c9Var.f30048d);
            y0Var.yy0(1, "2", 4, xx02, f != null ? f.mo12861q3() : null);
            Intent intent = new Intent();
            String str2 = C9673c9.f30047s;
            Log.m105924i(str2, "onSelectActivity: eventTopicId:" + zj02.f146005d + "  eventName:" + zj02.f146007f + " description:" + zj02.f146008g + " cover:" + zj02.f146010i);
            intent.putExtra("key_activity_id", zj02.f146005d);
            intent.putExtra("key_activity_name", zj02.f146007f);
            intent.putExtra("key_activity_desc", zj02.f146008g);
            intent.putExtra("key_cover_url", zj02.f146010i);
            FinderContact finderContact = zj02.f146006e;
            if (finderContact == null || (str = finderContact.headUrl) == null) {
                str = "";
            }
            intent.putExtra("key_avatar_url", str);
            intent.putExtra("key_activity_participate_count", zj02.f146009h);
            intent.putExtra("key_activity_display_mask", zj02.f146022x);
            intent.putExtra("key_feed_ref_id", zj02.f146011j);
            intent.putExtra("key_display_mask", zj02.f146022x);
            intent.putExtra("key_topic_type", 7);
            C7335d c = C86312j.m106911c(C58684b.class);
            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
            ((C58684b) c).vx0(c9Var.f30048d, intent, false);
        }
    }
}
