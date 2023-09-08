package sb2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bl3.C39818r;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import hb2.C59822f;
import hb2.C59833q;
import j20.C117292a;
import java.util.ArrayList;
import jb2.C46464p;
import ob0.C89137b0;
import qc0.C101093a;
import qc0.C101106m;
import te3.C64488kb1;
import ub2.C65257a;

/* renamed from: sb2.e1 */
public final class C63758e1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f180763d;

    /* renamed from: e */
    public final /* synthetic */ MusicMvSongInfoUIC f180764e;

    /* renamed from: f */
    public final /* synthetic */ ViewGroup f180765f;

    /* renamed from: g */
    public final /* synthetic */ C59822f f180766g;

    /* renamed from: h */
    public final /* synthetic */ C63756e f180767h;

    public C63758e1(int i, MusicMvSongInfoUIC musicMvSongInfoUIC, ViewGroup viewGroup, C59822f fVar, C63756e eVar) {
        this.f180763d = i;
        this.f180764e = musicMvSongInfoUIC;
        this.f180765f = viewGroup;
        this.f180766g = fVar;
        this.f180767h = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        StringBuilder sb = new StringBuilder();
        sb.append("onClick, position:");
        sb.append(this.f180763d);
        sb.append(", snapPositin:");
        C65257a aVar = this.f180764e.f163372e;
        sb.append(aVar != null ? Integer.valueOf(aVar.f187878m) : null);
        Log.m105924i("MicroMsg.Mv.MusicMvSongInfoUIC", sb.toString());
        long currentTimeMillis = System.currentTimeMillis();
        MusicMvSongInfoUIC musicMvSongInfoUIC = this.f180764e;
        if (currentTimeMillis - musicMvSongInfoUIC.f163376i < 2000) {
            Log.m105920e("MicroMsg.Mv.MusicMvSongInfoUIC", "don't click again in 2s");
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        musicMvSongInfoUIC.f163376i = currentTimeMillis;
        Log.m105924i("MicroMsg.Mv.MusicMvSongInfoUIC", "do getTicketToQQMusic");
        C39818r rVar = C39818r.f106831a;
        Context context = this.f180765f.getContext();
        C87412m.m108593f(context, "parent.context");
        MusicMvMainUIC musicMvMainUIC = (MusicMvMainUIC) rVar.mo62443b(context).mo75002a(MusicMvMainUIC.class);
        musicMvMainUIC.getClass();
        C101106m b = C101093a.m132480b();
        C89137b0 d = C86709a0.m107524d();
        C87412m.m108593f(b, "wrapper");
        d.mo123460f(new C46464p(b, musicMvMainUIC.getActivity().hashCode()));
        Context context2 = this.f180765f.getContext();
        C87412m.m108593f(context2, "parent.context");
        C64488kb1 kb12 = ((C63756e) rVar.mo62443b(context2).mo75002a(C63756e.class)).f180744i;
        C59833q qVar = C59833q.f170832a;
        Context context3 = this.f180765f.getContext();
        C87412m.m108593f(context3, "parent.context");
        C59833q.m69726g(qVar, context3, kb12, this.f180766g, 8, 1, 7, 0, this.f180767h.mo88571e3(), this.f180767h.mo88569c3(), this.f180767h.mo88570d3(), this.f180767h.f180736H, 64, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
