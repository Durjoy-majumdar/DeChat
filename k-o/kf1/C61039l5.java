package kf1;

import ak1.C54067f0;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.C56660w0;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import er1.C58784w3;
import er1.C7888v2;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60151b;
import ht1.C8777j5;
import java.util.List;
import java.util.Map;
import ke3.C88144b;
import ls3.C61397g;
import nj3.C76875f0;
import p1081gi.C98121d;
import p565ir.C60606n;
import p749xh.C66261f3;
import qo3.C77398g;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C64273c21;
import te3.C64623p81;
import wr1.C66184f;
import wr1.C66189h;

/* renamed from: kf1.l5 */
public final class C61039l5 implements C66189h {

    /* renamed from: a */
    public final /* synthetic */ AppCompatActivity f173826a;

    /* renamed from: b */
    public final /* synthetic */ C76875f0 f173827b;

    /* renamed from: c */
    public final /* synthetic */ FinderItem f173828c;

    /* renamed from: d */
    public final /* synthetic */ C32226l<List<String>, C13598b0> f173829d;

    /* renamed from: e */
    public final /* synthetic */ C56660w0 f173830e;

    public C61039l5(AppCompatActivity appCompatActivity, C76875f0 f0Var, FinderItem finderItem, C32226l<? super List<String>, C13598b0> lVar, C56660w0 w0Var) {
        this.f173826a = appCompatActivity;
        this.f173827b = f0Var;
        this.f173828c = finderItem;
        this.f173829d = lVar;
        this.f173830e = w0Var;
    }

    /* renamed from: a */
    public final void mo85992a(boolean z, String str, int i) {
        C77398g gVar;
        if (z) {
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.SHARE_SEND_RECENT, (Map) null, (String) null, 6, (Object) null);
            AppCompatActivity appCompatActivity = this.f173826a;
            if (str == null) {
                str = "";
            }
            String str2 = this.f173827b.f224730y;
            C87412m.m108593f(str2, "menu.webUrl");
            FinderItem finderItem = this.f173828c;
            C32226l<List<String>, C13598b0> lVar = this.f173829d;
            C58784w3 w3Var = C58784w3.f168295a;
            FinderObject feedObject = finderItem.getFeedObject();
            w3Var.getClass();
            C87412m.m108594g(feedObject, C66261f3.COL_FINDEROBJECT);
            if (!((feedObject.permissionFlag & 1) == 0)) {
                String string = appCompatActivity.getString(C0966R.string.ej_);
                C87412m.m108593f(string, "context.getString(R.stri…finder_private_ban_share)");
                w3Var.mo83879J1(appCompatActivity, string);
            } else {
                C7888v2.f26513a.getClass();
                String str3 = C7888v2.C7889a.f26515b;
                StringBuilder sb = new StringBuilder();
                sb.append("share live  ");
                sb.append(finderItem.getId());
                sb.append(' ');
                FinderObject feedObject2 = finderItem.getFeedObject();
                sb.append(feedObject2 != null ? Integer.valueOf(feedObject2.forward_style) : null);
                sb.append(" to conversation,liveId:");
                C64273c21 liveInfo = finderItem.getLiveInfo();
                sb.append(liveInfo != null ? Long.valueOf(liveInfo.f182392d) : null);
                sb.append(",desc:");
                sb.append(finderItem.getDescription());
                sb.append(",liveStatus ");
                C64273c21 liveInfo2 = finderItem.getLiveInfo();
                sb.append(liveInfo2 != null ? Integer.valueOf(liveInfo2.f182394f) : null);
                Log.m105924i(str3, sb.toString());
                C68070l.C68072b bVar = new C68070l.C68072b();
                C60151b bVar2 = new C60151b();
                C64623p81 finderLive = finderItem.getFinderLive();
                C87412m.m108594g(finderLive, "<set-?>");
                bVar2.f171698b = finderLive;
                bVar.mo93545f(bVar2);
                C13604l lVar2 = (((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(finderItem.getLiveInfo()) || ((C61397g) C86312j.m106911c(C61397g.class)).Da0(finderItem.getLiveInfo())) ? new C13604l(88, 31) : new C13604l(63, 23);
                bVar.f195582i = ((Number) lVar2.f38555d).intValue();
                bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
                bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
                Intent intent = new Intent();
                intent.putExtra("Retr_Msg_Type", ((Number) lVar2.f38556e).intValue());
                intent.putExtra("Multi_Retr", true);
                intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null));
                intent.putExtra("Retr_go_to_chattingUI", false);
                intent.putExtra("Retr_show_success_tips", true);
                intent.putExtra("Retr_MsgQuickShare", true);
                intent.putExtra("custom_send_text", str);
                intent.putExtra("Select_Conv_User", str2);
                intent.putExtra("Retr_finder_in_stream", true);
                C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                C88144b.m109804v((MMFragmentActivity) appCompatActivity, ".ui.transmit.MsgRetransmitUI", intent, 1005, new C9826k5(finderItem, lVar));
            }
        }
        C66184f.C66185a aVar = this.f173830e.f162415c;
        if (aVar != null && (gVar = aVar.f190207c) != null) {
            gVar.dismiss();
        }
    }
}
