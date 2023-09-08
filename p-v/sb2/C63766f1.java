package sb2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bl3.C39818r;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hb2.C59822f;
import hb2.C59833q;
import j20.C117292a;
import java.util.ArrayList;
import te3.C64488kb1;
import ub2.C65257a;

/* renamed from: sb2.f1 */
public final class C63766f1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f180789d;

    /* renamed from: e */
    public final /* synthetic */ MusicMvSongInfoUIC f180790e;

    /* renamed from: f */
    public final /* synthetic */ ViewGroup f180791f;

    /* renamed from: g */
    public final /* synthetic */ C59822f f180792g;

    /* renamed from: h */
    public final /* synthetic */ C63756e f180793h;

    /* renamed from: sb2.f1$a */
    public static final class C63767a implements C44580q1 {

        /* renamed from: a */
        public final /* synthetic */ C64488kb1 f180794a;

        /* renamed from: b */
        public final /* synthetic */ C59822f f180795b;

        /* renamed from: c */
        public final /* synthetic */ ViewGroup f180796c;

        /* renamed from: d */
        public final /* synthetic */ C63756e f180797d;

        public C63767a(C64488kb1 kb12, C59822f fVar, ViewGroup viewGroup, C63756e eVar) {
            this.f180794a = kb12;
            this.f180795b = fVar;
            this.f180796c = viewGroup;
            this.f180797d = eVar;
        }

        /* renamed from: a */
        public final void mo1579a(boolean z, boolean z2) {
            C63756e eVar;
            String str;
            C59822f fVar;
            ViewGroup viewGroup;
            C64488kb1 kb12 = this.f180794a;
            C59822f fVar2 = this.f180795b;
            ViewGroup viewGroup2 = this.f180796c;
            C63756e eVar2 = this.f180797d;
            if (kb12 != null && fVar2 != null) {
                if (z) {
                    C59833q qVar = C59833q.f170832a;
                    Context context = viewGroup2.getContext();
                    C87412m.m108593f(context, "parent.context");
                    str = "parent.context";
                    eVar = eVar2;
                    viewGroup = viewGroup2;
                    fVar = fVar2;
                    C59833q.m69726g(qVar, context, kb12, fVar2, 2, 1, 2, 0, eVar2.mo88571e3(), eVar2.mo88569c3(), eVar2.mo88570d3(), eVar2.f180736H, 64, (Object) null);
                } else {
                    str = "parent.context";
                    eVar = eVar2;
                    viewGroup = viewGroup2;
                    fVar = fVar2;
                }
                if (z2) {
                    C59833q qVar2 = C59833q.f170832a;
                    Context context2 = viewGroup.getContext();
                    C87412m.m108593f(context2, str);
                    C59833q.m69726g(qVar2, context2, kb12, fVar, 2, 3, 2, 0, eVar.mo88571e3(), eVar.mo88569c3(), eVar.mo88570d3(), eVar.f180736H, 64, (Object) null);
                }
            }
        }
    }

    public C63766f1(int i, MusicMvSongInfoUIC musicMvSongInfoUIC, ViewGroup viewGroup, C59822f fVar, C63756e eVar) {
        this.f180789d = i;
        this.f180790e = musicMvSongInfoUIC;
        this.f180791f = viewGroup;
        this.f180792g = fVar;
        this.f180793h = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        StringBuilder sb = new StringBuilder();
        sb.append("song_copyright_ll onClick, position:");
        sb.append(this.f180789d);
        sb.append(", snapPositin:");
        C65257a aVar = this.f180790e.f163372e;
        sb.append(aVar != null ? Integer.valueOf(aVar.f187878m) : null);
        Log.m105924i("MicroMsg.Mv.MusicMvSongInfoUIC", sb.toString());
        C39818r rVar = C39818r.f106831a;
        Context context = this.f180791f.getContext();
        C87412m.m108593f(context, "parent.context");
        C64488kb1 kb12 = ((C63756e) rVar.mo62443b(context).mo75002a(C63756e.class)).f180744i;
        Context context2 = this.f180791f.getContext();
        C87412m.m108593f(context2, "parent.context");
        int i3 = ((MusicMvMainUIC) rVar.mo62443b(context2).mo75002a(MusicMvMainUIC.class)).mo80453i3(kb12, new C63767a(kb12, this.f180792g, this.f180791f, this.f180793h));
        if (i3 != 7) {
            C59822f fVar = this.f180792g;
            ViewGroup viewGroup = this.f180791f;
            C63756e eVar = this.f180793h;
            if (fVar != null) {
                C59833q qVar = C59833q.f170832a;
                Context context3 = viewGroup.getContext();
                C87412m.m108593f(context3, "parent.context");
                C59833q.m69726g(qVar, context3, kb12, fVar, 2, i3, 2, 0, eVar.mo88571e3(), eVar.mo88569c3(), eVar.mo88570d3(), eVar.f180736H, 64, (Object) null);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
