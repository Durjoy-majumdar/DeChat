package zn1;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import rs1.C13442s8;
import te3.C51108rh0;

/* renamed from: zn1.x */
public final class C16342x implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C23541z f43696d;

    public C16342x(C23541z zVar) {
        this.f43696d = zVar;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("Finder.FinderPlayListPresenter", "onItemClick: position:" + i);
        Intent intent = new Intent();
        intent.putExtra("key_topic_type", 16);
        C51108rh0 rh02 = ((C16313c) oVar.f173503E).f43616d;
        String str = rh02.f140918e;
        if (str == null) {
            str = "";
        }
        long j = rh02.f140917d;
        intent.putExtra("key_topic_title", str);
        intent.putExtra("KEY_TOPIC_ID", j);
        intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", true);
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this.f43696d.f67507a, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
        ((C58684b) C86312j.m106911c(C58684b.class)).ty0(this.f43696d.f67507a, intent);
    }
}
