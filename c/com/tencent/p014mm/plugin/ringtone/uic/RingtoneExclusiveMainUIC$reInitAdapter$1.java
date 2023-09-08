package com.tencent.p014mm.plugin.ringtone.uic;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C54492n;
import ck2.C0649l;
import ck2.C54915m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import kotlin.Metadata;
import pj2.C62318a;
import pj2.C62319b;
import qo3.C77407n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$reInitAdapter$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-ringtone_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$reInitAdapter$1 */
public final class RingtoneExclusiveMainUIC$reInitAdapter$1 implements C9500j {
    public final /* synthetic */ RingtoneExclusiveMainUIC this$0;

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC$reInitAdapter$1$a */
    public static final class C57303a implements C62319b.C62320a {

        /* renamed from: a */
        public final /* synthetic */ RingtoneExclusiveMainUIC f164102a;

        public C57303a(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
            this.f164102a = ringtoneExclusiveMainUIC;
        }

        /* renamed from: a */
        public void mo80838a(C62318a aVar, C60905o oVar) {
            C87412m.m108594g(aVar, "ringback");
            C87412m.m108594g(oVar, "holder");
            RecyclerView.C16613e eVar = oVar.f173500B;
            C87412m.m108592e(eVar, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.ringtone.data.ExclusiveConvertData>");
            RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC = this.f164102a;
            C62318a aVar2 = (C62318a) ((WxRecyclerAdapter) eVar).getData().get(oVar.mo17364k());
            ringtoneExclusiveMainUIC.getClass();
            String str = aVar2.f177144d.f147588d;
            if (str != null) {
                C77407n nVar = new C77407n((Context) ringtoneExclusiveMainUIC.getContext(), 1, true);
                nVar.f225771i = new C0649l(ringtoneExclusiveMainUIC);
                nVar.f225782p = new C54915m(str, ringtoneExclusiveMainUIC, aVar2);
                nVar.mo107570o(false);
                nVar.mo107559d(false);
                nVar.mo107573q();
            }
        }
    }

    public RingtoneExclusiveMainUIC$reInitAdapter$1(RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC) {
        this.this$0 = ringtoneExclusiveMainUIC;
    }

    public C60896i<?> getItemConvert(int i) {
        Log.m105924i(C54492n.TAG, "getItemConvert, type:" + i);
        C62319b bVar = new C62319b();
        bVar.f177146e = new C57303a(this.this$0);
        return bVar;
    }
}
