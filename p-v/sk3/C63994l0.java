package sk3;

import a14.C53973z1;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableString;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96789p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C97625j3;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import k20.C9556a;
import nj3.C76879j;
import nk3.C61802h;
import ok3.C62070e;
import ok3.C62074i;
import rk3.C63462a;
import rx3.C13598b0;
import te3.C64878zd0;
import z04.C112551y;

/* renamed from: sk3.l0 */
public abstract class C63994l0 extends UIComponent {

    /* renamed from: d */
    public final String f181415d = "MiscroMsg.FTSMultiNormalBasicUIC";

    /* renamed from: e */
    public final int f181416e = 1;

    /* renamed from: f */
    public final int f181417f = 2;

    /* renamed from: g */
    public final int f181418g = 3;

    /* renamed from: h */
    public final C54219z<C62074i> f181419h;

    /* renamed from: i */
    public LiveData<C62074i> f181420i;

    /* renamed from: j */
    public ArrayList<C62070e> f181421j;

    /* renamed from: n */
    public C53973z1 f181422n;

    /* renamed from: o */
    public String f181423o;

    /* renamed from: p */
    public boolean f181424p;

    /* renamed from: q */
    public long f181425q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63994l0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C54219z<C62074i> zVar = new C54219z<>(C62074i.IDLE);
        this.f181419h = zVar;
        this.f181420i = zVar;
        this.f181421j = new ArrayList<>();
        this.f181423o = "";
    }

    /* renamed from: c3 */
    public abstract SpannableString mo88749c3();

    /* renamed from: d3 */
    public abstract C61802h mo88750d3();

    /* renamed from: e3 */
    public boolean mo88757e3() {
        long j = this.f181425q + ((long) 30000);
        long currentTimeMillis = System.currentTimeMillis();
        this.f181425q = currentTimeMillis;
        C13598b0 b0Var = C13598b0.f38549a;
        if (j < currentTimeMillis) {
            this.f181424p = C97625j3.m125812b().mo105883I();
        }
        return this.f181424p;
    }

    /* renamed from: f3 */
    public final void mo88758f3(String str, long j) {
        String str2 = str;
        if (str2 == null) {
            Log.m105920e(this.f181415d, "[gotoChattingUIWithPosition] username is null");
            return;
        }
        long msgId = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j).getMsgId();
        Log.m105925i(this.f181415d, "[gotoChattingUIWithPosition] msgLocalId:%s", Long.valueOf(msgId));
        if (!C72996z1.m85820U5(str)) {
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str2);
            if (z1Var == null || !z1Var.mo62927s3()) {
                if (z1Var == null) {
                    Log.m105929w(this.f181415d, "[gotoChattingUIWithPosition] contact is null! username:%s", str2);
                } else {
                    Log.m105929w(this.f181415d, "[gotoChattingUIWithPosition] isContact not ! username:%s", str2);
                }
                C76879j.m92749t(getActivity(), getActivity().getString(C0966R.string.hze), getActivity().getString(C0966R.string.f361465k34), (DialogInterface.OnClickListener) null);
                return;
            }
        } else if (((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(str2) == null) {
            Log.m105929w(this.f181415d, "[gotoChattingUIWithPosition] member is null! username:%s", str2);
            C76879j.m92749t(getActivity(), getActivity().getString(C0966R.string.hze), getActivity().getString(C0966R.string.f361465k34), (DialogInterface.OnClickListener) null);
            return;
        }
        Intent putExtra = new Intent().putExtra("Chat_User", str2).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", msgId);
        C87412m.m108593f(putExtra, "Intent()\n            .pu….KMsgLocalId, msgLocalId)");
        putExtra.setClass(getActivity(), ChattingUI.class);
        AppCompatActivity activity = getActivity();
        C9556a aVar = new C9556a();
        aVar.mo10233c(putExtra);
        AppCompatActivity appCompatActivity = activity;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiNormalBasicUIC", "goToChattingUI", "(Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiNormalBasicUIC", "goToChattingUI", "(Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: g3 */
    public final void mo88759g3(int i, C72963f4 f4Var, String str) {
        int i2 = i;
        C72963f4 f4Var2 = f4Var;
        C87412m.m108594g(f4Var2, "msgInfo");
        Log.m105925i(this.f181415d, "[handleSelectedItem] index:%s", Integer.valueOf(i));
        if (i2 == this.f181416e) {
            C63462a.f180011a.mo88328b(16);
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(f4Var2);
            if (C96789p0.m124273f(getActivity(), doFavoriteEvent, this.f181423o, arrayList, false, false)) {
                DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                aVar.f264688m = 45;
                aVar.f264684i = getActivity();
                doFavoriteEvent.publish();
                int i3 = doFavoriteEvent.f264675e.f9046a;
                if (i3 != -2 && i3 <= 0 && i3 <= 0) {
                    DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                    if (14 != aVar2.f264678c) {
                        Log.m105918d(this.f181415d, "not record type, do not report");
                        return;
                    }
                    C64878zd0 zd02 = aVar2.f264677b;
                    if (zd02 == null) {
                        Log.m105920e(this.f181415d, "want to report record fav, but type count is null");
                        return;
                    }
                    C115669n.INSTANCE.mo160131h(11142, Integer.valueOf(zd02.f186671d), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186672e), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186673f), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186675h), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186676i), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186677j), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186678n), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186679o), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186680p), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186681q), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186682r), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186683s), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186684t), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186685u));
                    return;
                }
                return;
            }
            Log.m105920e(this.f181415d, "[handleFav] err!");
        } else if (i2 == 0) {
            C63462a.f180011a.mo88328b(15);
            C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
            if (u == null || 51 != u.f195582i || WeChatBrands.Business.Entries.SessionChannels.checkAvailable(getActivity())) {
                C115669n.INSTANCE.idkeyStat(219, 19, 1, true);
                String lowerCase = this.f181423o.toLowerCase();
                C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
                boolean h = C112551y.m153808h(lowerCase, "@chatroom", false, 2, (Object) null);
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(f4Var2);
                C73313b1.m86457c(getActivity(), arrayList2, h, this.f181423o, new C63991k0());
            }
        } else if (i2 == this.f181417f) {
            C63462a.f180011a.mo88328b(17);
            mo88758f3(str, f4Var.getMsgId());
        } else if (i2 == this.f181418g) {
            C63462a.f180011a.mo88328b(18);
            C115669n.INSTANCE.mo160131h(11627, 5);
            TreeSet treeSet = new TreeSet();
            treeSet.add(Long.valueOf(f4Var.getMsgId()));
            C76879j.m92707A(getActivity(), getActivity().getString(C0966R.string.bj6), "", getActivity().getString(C0966R.string.byd), getActivity().getString(C0966R.string.f7926wf), new C63987j0(this, treeSet, f4Var2), (DialogInterface.OnClickListener) null);
        }
    }

    /* renamed from: i3 */
    public final void mo88760i3() {
        ((C64004q0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C64004q0.class)).mo88771c3();
    }

    public void onDestroy() {
        super.onDestroy();
        C53973z1 z1Var = this.f181422n;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }

    public void onViewCreated(View view) {
        C87412m.m108594g(view, "contentView");
        super.onViewCreated(view);
        String stringExtra = getIntent().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f181423o = stringExtra;
    }
}
