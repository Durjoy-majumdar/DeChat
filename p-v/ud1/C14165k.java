package ud1;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONObject;
import pf1.C62262d0;
import rs1.C13442s8;
import te3.C51270sn1;
import te3.C64726td1;
import te3.C64793w23;
import vd1.C14429a;

/* renamed from: ud1.k */
public final class C14165k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64726td1 f39603d;

    /* renamed from: e */
    public final /* synthetic */ FinderMusicTopicHeaderUIC f39604e;

    /* renamed from: f */
    public final /* synthetic */ View f39605f;

    public C14165k(C64726td1 td12, FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, View view) {
        this.f39603d = td12;
        this.f39604e = finderMusicTopicHeaderUIC;
        this.f39605f = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initMusic$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C64726td1 td12 = this.f39603d;
        if (td12 != null) {
            FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f39604e;
            View view2 = this.f39605f;
            finderMusicTopicHeaderUIC.getClass();
            if (td12 != null) {
                C64793w23 w232 = new C64793w23();
                String uuid = UUID.randomUUID().toString();
                C87412m.m108593f(uuid, "randomUUID().toString()");
                w232.f186034e = uuid;
                w232.f186035f = 86;
                w232.f186036g = td12.f185546s;
                w232.f186033d = 21;
                w232.f186038i = ((C13442s8) C39818r.f106831a.mo62443b(finderMusicTopicHeaderUIC.getContext()).mo75002a(C13442s8.class)).f38098n;
                C62262d0.m73171t(C62262d0.f176978a, finderMusicTopicHeaderUIC.getContext(), td12, (String) null, w232, 4, (Object) null);
            }
            C14429a aVar = C14429a.f40033a;
            Context context = view2.getContext();
            C87412m.m108593f(context, "context");
            C51270sn1 sn12 = (C51270sn1) finderMusicTopicHeaderUIC.f33564d;
            C14429a.m13715a(aVar, context, "music_play", 1, 0, sn12 != null ? sn12.f141636z : null, (JSONObject) null, 40, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initMusic$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
