package vo1;

import al1.C54127h;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import bl3.C39818r;
import bp1.C54515a;
import bp1.C54518c;
import bp1.C54519d;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveLayoutManager;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayViewCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ks3.C61162l;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import vo1.C65770a0;
import yo1.C16058c;
import yo1.C39143f;
import yo1.C66686a;

/* renamed from: vo1.j0 */
public final class C65801j0 extends C87413o implements C32228q<Integer, View, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveReplayViewCallback f189247d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65801j0(FinderLiveReplayViewCallback finderLiveReplayViewCallback) {
        super(3);
        this.f189247d = finderLiveReplayViewCallback;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        long j;
        C13598b0 b0Var;
        C54127h a;
        C54127h a2;
        C54519d dVar;
        C54519d dVar2;
        C54519d dVar3;
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        C87412m.m108594g((View) obj2, "<anonymous parameter 1>");
        FinderLiveLayoutManager finderLiveLayoutManager = this.f189247d.f160734i;
        View findViewByPosition = finderLiveLayoutManager != null ? finderLiveLayoutManager.findViewByPosition(intValue) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("selectItemView onItemSelected pos:");
        sb.append(intValue);
        sb.append(",itemView is null:");
        int i = 1;
        boolean z = false;
        sb.append(findViewByPosition == null);
        sb.append(",reSelect:");
        sb.append(booleanValue);
        sb.append('!');
        Log.m105924i("FinderLiveReplayViewCallback", sb.toString());
        if (findViewByPosition != null) {
            FinderLiveReplayViewCallback finderLiveReplayViewCallback = this.f189247d;
            finderLiveReplayViewCallback.getClass();
            FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = (FinderLiveReplayPluginLayout) findViewByPosition.findViewById(C0966R.C0970id.dyc);
            Log.m105924i("FinderLiveReplayViewCallback", "updateLayoutManager:" + intValue + ", pluginLayout:" + finderLiveReplayPluginLayout.hashCode() + ",reStart:" + booleanValue + '!');
            C65805l0 l0Var = finderLiveReplayViewCallback.f160736n;
            l0Var.getClass();
            Class cls = C54519d.class;
            Log.m105924i("FinderLiveReplayViewCallback", "before update plugins,pos:" + l0Var.f189253b + ' ' + l0Var.f189252a + ' ' + finderLiveReplayPluginLayout);
            FinderLiveReplayPluginLayout finderLiveReplayPluginLayout2 = l0Var.f189252a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("replay_step100:deactivate plugin pos:");
            sb4.append(l0Var.f189253b);
            sb4.append('(');
            sb4.append(finderLiveReplayPluginLayout2 != null ? finderLiveReplayPluginLayout2.hashCode() : 0);
            sb4.append(")!");
            Log.m105924i("FinderLiveReplayViewCallback", sb4.toString());
            C54518c cVar = (C54518c) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C54518c.class);
            if (finderLiveReplayPluginLayout2 == null || (dVar3 = (C54519d) finderLiveReplayPluginLayout2.business(cls)) == null) {
                str = ")!";
                j = 0;
            } else {
                str = ")!";
                j = dVar3.mo75371d3();
            }
            cVar.mo75360c3(j, (finderLiveReplayPluginLayout2 == null || (dVar2 = (C54519d) finderLiveReplayPluginLayout2.business(cls)) == null) ? 0 : dVar2.f152854q);
            if (finderLiveReplayPluginLayout2 != null) {
                finderLiveReplayPluginLayout2.mo78589l();
                finderLiveReplayPluginLayout2.unMount();
            }
            C65770a0.C65771b bVar = C65770a0.f189184r;
            bVar.mo89819a().mo89811l(8, (finderLiveReplayPluginLayout2 == null || (dVar = (C54519d) finderLiveReplayPluginLayout2.business(cls)) == null) ? 0 : dVar.mo75371d3(), false);
            Log.m105924i("FinderLiveReplayViewCallback", "after deactivate plugin!");
            l0Var.f189252a = finderLiveReplayPluginLayout;
            l0Var.f189253b = intValue;
            C16058c cVar2 = bVar.mo89819a().f189188b;
            if (cVar2 != null) {
                cVar2.mo14673b(intValue);
            }
            if (((C55001u) finderLiveReplayPluginLayout.getBuContext().mo71262a(C55001u.class)).f154420q.f182392d == 0) {
                C16058c cVar3 = bVar.mo89819a().f189188b;
                if (!(cVar3 == null || (a2 = cVar3.mo14672a()) == null)) {
                    C65799i0.f189246a.mo89848c(a2, 2);
                }
                Log.m105924i("FinderLiveReplayViewCallback", "replay_step2-2-1#:recoverFromLiveConfig!");
            }
            Log.m105924i("FinderLiveReplayViewCallback", "replay_step2-2:activate liveId:" + ((C54519d) finderLiveReplayPluginLayout.business(cls)).mo75371d3() + ", plugin pos:" + l0Var.f189253b + '(' + finderLiveReplayPluginLayout.hashCode() + str);
            bVar.mo89819a().mo89814o(finderLiveReplayPluginLayout.getBuContext(), new C66686a());
            Context context = finderLiveReplayPluginLayout.getContext();
            C87412m.m108593f(context, "plugin.context");
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                boolean booleanExtra = activity.getIntent().getBooleanExtra("KEY_PARAMS_IS_LIVING", false);
                int intExtra = activity.getIntent().getIntExtra("KEY_PARAMS_START_OFFSET", 0);
                String stringExtra = activity.getIntent().getStringExtra("KEY_PARAMS_REPLAY_SONG_ID");
                String str2 = "";
                if (stringExtra == null) {
                    stringExtra = str2;
                }
                String stringExtra2 = activity.getIntent().getStringExtra("KEY_PARAMS_REPLAY_SONG_NAME");
                if (stringExtra2 != null) {
                    str2 = stringExtra2;
                }
                C54519d dVar4 = (C54519d) bVar.mo89819a().mo89804e(cls);
                if (dVar4 != null) {
                    dVar4.f152861x = booleanExtra;
                }
                C54515a aVar = (C54515a) bVar.mo89819a().mo89804e(C54515a.class);
                if (aVar != null) {
                    aVar.mo75358f3(intExtra);
                }
                C54519d dVar5 = (C54519d) bVar.mo89819a().mo89804e(cls);
                if (dVar5 != null) {
                    dVar5.f152862y = stringExtra;
                }
                C54519d dVar6 = (C54519d) bVar.mo89819a().mo89804e(cls);
                if (dVar6 != null) {
                    dVar6.f152863z = str2;
                }
            }
            if (((C54519d) finderLiveReplayPluginLayout.getBuContext().mo71262a(cls)).f152861x) {
                i = 4;
            }
            C65770a0 a3 = bVar.mo89819a();
            C65768a aVar2 = (C65768a) ((C36570n) new C65779b(bVar.mo89819a(), new C39143f(i)).f189214c).getValue();
            C87412m.m108594g(aVar2, "liveMsgOffsetProcess");
            a3.f189202p = aVar2;
            C16058c cVar4 = bVar.mo89819a().f189188b;
            if (cVar4 == null || (a = cVar4.mo14672a()) == null) {
                b0Var = null;
            } else {
                C16058c cVar5 = bVar.mo89819a().f189188b;
                if (cVar5 != null) {
                    long d3 = ((C54519d) finderLiveReplayPluginLayout.business(cls)).mo75371d3();
                    C13604l<Long, Boolean> lVar = cVar5.f43189d;
                    if (lVar != null && ((Number) lVar.f38555d).longValue() == d3) {
                        z = ((Boolean) lVar.f38556e).booleanValue();
                    }
                }
                finderLiveReplayPluginLayout.activate(a, z, booleanValue);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("FinderLiveReplayViewCallback", "replay_step2-2-1#:FinderLiveData is null!");
            }
            finderLiveReplayPluginLayout.mount();
            bVar.mo89819a().mo89815p(finderLiveReplayPluginLayout, C61162l.Replay);
            Log.m105924i("FinderLiveReplayViewCallback", "after activate plugin!");
            Log.m105924i("FinderLiveReplayViewCallback", "after update plugins,pos:" + l0Var.f189253b);
        }
        return C13598b0.f38549a;
    }
}
