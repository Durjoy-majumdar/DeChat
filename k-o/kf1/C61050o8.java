package kf1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.C56660w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C31543z5;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60166f;
import java.util.List;
import ke3.C88144b;
import nj3.C76875f0;
import p1081gi.C98121d;
import qo3.C77398g;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C49712hj1;
import wr1.C66184f;
import wr1.C66189h;

/* renamed from: kf1.o8 */
public final class C61050o8 implements C66189h {

    /* renamed from: a */
    public final /* synthetic */ AppCompatActivity f173869a;

    /* renamed from: b */
    public final /* synthetic */ C76875f0 f173870b;

    /* renamed from: c */
    public final /* synthetic */ FinderItem f173871c;

    /* renamed from: d */
    public final /* synthetic */ C60166f f173872d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<List<String>, C13598b0> f173873e;

    /* renamed from: f */
    public final /* synthetic */ C56660w0 f173874f;

    public C61050o8(AppCompatActivity appCompatActivity, C76875f0 f0Var, FinderItem finderItem, C60166f fVar, C32226l<? super List<String>, C13598b0> lVar, C56660w0 w0Var) {
        this.f173869a = appCompatActivity;
        this.f173870b = f0Var;
        this.f173871c = finderItem;
        this.f173872d = fVar;
        this.f173873e = lVar;
        this.f173874f = w0Var;
    }

    /* renamed from: a */
    public final void mo85992a(boolean z, String str, int i) {
        C77398g gVar;
        if (z) {
            C56660w0.C30033a aVar = C56660w0.f162410d;
            C13604l<Boolean, Long> lVar = new C13604l<>(Boolean.TRUE, Long.valueOf(C31543z5.m39453c()));
            C56660w0.f162412f = 0;
            Log.m105924i("Finder.TimelineShareDialog", "reset count=0");
            C56660w0.f162411e = lVar;
            AppCompatActivity appCompatActivity = this.f173869a;
            if (str == null) {
                str = "";
            }
            String str2 = this.f173870b.f224730y;
            C87412m.m108593f(str2, "menu.webUrl");
            FinderItem finderItem = this.f173871c;
            C60166f fVar = this.f173872d;
            C32226l<List<String>, C13598b0> lVar2 = this.f173873e;
            C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C13442s8.class)).mo12861q3();
            C68070l.C68072b bVar = new C68070l.C68072b();
            bVar.mo93545f(fVar);
            bVar.f195582i = 51;
            bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
            bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
            Intent intent = new Intent();
            intent.putExtra("Retr_Msg_Type", 18);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("Retr_NeedReport", false);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", str2);
            intent.putExtra("Retr_finder_in_stream", true);
            C88144b.m109804v((MMFragmentActivity) appCompatActivity, ".ui.transmit.MsgRetransmitUI", intent, 1001, new C9877n8(finderItem, appCompatActivity, 6, q3, lVar2));
        }
        C66184f.C66185a aVar2 = this.f173874f.f162415c;
        if (aVar2 != null && (gVar = aVar2.f190207c) != null) {
            gVar.dismiss();
        }
    }
}
