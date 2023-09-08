package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import bp3.C104160f;
import bp3.C79758p;
import bv1.C28426b;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.base.preference.C73244a;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.chatting.search.multi.FTSChattingConvMultiTabUI;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.C74584x;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileHdHeadImg;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import com.tencent.p014mm.pluginsdk.p133ui.applet.ContactListExpandPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.util.WXWebReporter;
import dd0.C45322a;
import dd0.C75350g;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import fy3.C32226l;
import gy3.C87412m;
import h81.C32735h;
import ht1.C33050g5;
import ht1.C33056k3;
import ht1.C46117w1;
import ht1.C60165e4;
import ht1.C60179k4;
import ht1.C60200t1;
import ht1.C60208v1;
import ht1.C76246h5;
import iv1.C60634a;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import js0.C9514m;
import k20.C9556a;
import ke3.C88144b;
import ne0.C47224a;
import nj3.C76879j;
import p244tt.C14088e;
import p249ui.C14193c;
import p255vr.C65873e;
import p609mp.C76802a;
import p609mp.C76803c;
import p687sr.C64153e;
import pj3.C47510b;
import pj3.C47511g;
import qy2.C47902u;
import rx3.C13598b0;
import sx2.C48497j;
import un3.C14265j;
import un3.C78244i;
import uz2.C52684h;
import vd3.C78399i;
import vm3.C65764a;
import vm3.C78436b;
import vm3.C78444g;
import wy1.C53221c;
import wy1.C53224d;
import xi3.C15711o;
import xm3.C78870a;
import xm3.C78877c0;
import xm3.C78889f0;
import xm3.C78904i;
import xm3.C78917n;
import xm3.C78928r;
import xm3.C78938y;
import xm3.C78944z;
import xy1.C53474j;
import xy1.C53475k;
import yb2.C79062b;
import yl3.C53534a;

@C86737h0
/* renamed from: com.tencent.mm.ui.SingleChatInfoUI */
public class SingleChatInfoUI extends MMPreference implements C45322a {

    /* renamed from: y */
    public static boolean f121192y;

    /* renamed from: d */
    public C47511g f121193d;

    /* renamed from: e */
    public C72996z1 f121194e;

    /* renamed from: f */
    public MMHandler f121195f = new MMHandler(Looper.getMainLooper());

    /* renamed from: g */
    public ContactListExpandPreference f121196g;

    /* renamed from: h */
    public CheckBoxPreference f121197h;

    /* renamed from: i */
    public CheckBoxPreference f121198i;

    /* renamed from: j */
    public SharedPreferences f121199j = null;

    /* renamed from: n */
    public String f121200n;

    /* renamed from: o */
    public boolean f121201o;

    /* renamed from: p */
    public final C9514m<Boolean> f121202p = new C9514m<>();

    /* renamed from: q */
    public C9514m<Boolean> f121203q = new C9514m<>();

    /* renamed from: r */
    public boolean f121204r = false;

    /* renamed from: s */
    public C60179k4.C46110b f121205s = null;

    /* renamed from: t */
    public C78399i f121206t = new C78399i(new C6751a(this));

    /* renamed from: u */
    public C47902u.C36207b f121207u = null;

    /* renamed from: v */
    public MStorage.IOnStorageChange f121208v = new C44692c();

    /* renamed from: w */
    public boolean f121209w = false;

    /* renamed from: x */
    public String f121210x = "";

    /* renamed from: com.tencent.mm.ui.SingleChatInfoUI$a */
    public class C6751a implements AbsListView.OnScrollListener {
        public C6751a(SingleChatInfoUI singleChatInfoUI) {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/SingleChatInfoUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/SingleChatInfoUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/SingleChatInfoUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/SingleChatInfoUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.SingleChatInfoUI$b */
    public class C44691b implements C47902u.C36207b {
        public C44691b() {
        }

        /* renamed from: a */
        public void mo60567a(boolean z, List<C52684h> list) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(z);
            objArr[1] = list != null ? Integer.valueOf(list.size()) : "null";
            Log.m105925i("MicroMsg.SingleChatInfoUI", "tsessionInfos result:%s size:%s", objArr);
            if (list != null) {
                Iterator<C52684h> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C52684h next = it.next();
                        if (next != null && next.f147112d == 0) {
                            Log.m105924i("MicroMsg.SingleChatInfoUI", "rspInfo" + next.f147112d + ",block:" + next.f147125t);
                            SingleChatInfoUI singleChatInfoUI = SingleChatInfoUI.this;
                            boolean z2 = next.f147125t;
                            boolean z3 = SingleChatInfoUI.f121192y;
                            singleChatInfoUI.mo69886I7(z2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            SingleChatInfoUI.this.f121207u = null;
        }
    }

    /* renamed from: com.tencent.mm.ui.SingleChatInfoUI$c */
    public class C44692c implements MStorage.IOnStorageChange {
        public C44692c() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            SingleChatInfoUI singleChatInfoUI = SingleChatInfoUI.this;
            boolean z = SingleChatInfoUI.f121192y;
            singleChatInfoUI.mo69887J7();
        }
    }

    /* renamed from: com.tencent.mm.ui.SingleChatInfoUI$e */
    public class C44693e implements MenuItem.OnMenuItemClickListener {
        public C44693e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SingleChatInfoUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.SingleChatInfoUI$f */
    public class C44694f implements C64153e.C64155b {
        public C44694f() {
        }

        /* renamed from: a */
        public void mo4980a(boolean z) {
            Class cls = C28426b.class;
            if (z) {
                ((C28426b) C86312j.m106911c(cls)).mo55959Dy(SingleChatInfoUI.this.f121194e.getUsername());
                long u202 = ((C28426b) C86312j.m106911c(cls)).u20(SingleChatInfoUI.this.f121194e.getUsername());
                SingleChatInfoUI singleChatInfoUI = SingleChatInfoUI.this;
                singleChatInfoUI.f121198i.mo7741E(singleChatInfoUI.getResources().getString(C0966R.string.f1l, new Object[]{new SimpleDateFormat("HH:mm").format(new Date(u202))}));
                return;
            }
            SingleChatInfoUI.this.f121198i.mo6808N(false);
        }
    }

    /* renamed from: com.tencent.mm.ui.SingleChatInfoUI$g */
    public static class C44695g implements DialogInterface.OnCancelListener {
        public C44695g(C6751a aVar) {
        }

        public void onCancel(DialogInterface dialogInterface) {
            SingleChatInfoUI.f121192y = true;
        }
    }

    /* renamed from: com.tencent.mm.ui.SingleChatInfoUI$d */
    public class C44696d implements ContactListExpandPreference.C72740a {
        public C44696d() {
        }

        /* renamed from: a */
        public void mo5953a(ViewGroup viewGroup, View view, int i) {
        }

        /* renamed from: b */
        public void mo5954b(ViewGroup viewGroup, View view, int i) {
        }

        /* renamed from: c */
        public void mo5955c(ViewGroup viewGroup, View view, int i) {
            SingleChatInfoUI singleChatInfoUI = SingleChatInfoUI.this;
            boolean z = SingleChatInfoUI.f121192y;
            singleChatInfoUI.getClass();
            C115669n.INSTANCE.kvStat(10170, "1");
            LinkedList linkedList = new LinkedList();
            linkedList.add(singleChatInfoUI.f121200n);
            linkedList.add(C75592q0.m90789s());
            String listToString = Util.listToString(linkedList, ",");
            Intent intent = new Intent();
            intent.putExtra("titile", singleChatInfoUI.getString(C0966R.string.f7495ht));
            intent.putExtra("list_type", 0);
            C74560s1.m89276e();
            intent.putExtra("list_attr", C74560s1.f219163d);
            intent.putExtra("always_select_contact", listToString);
            intent.putExtra("recommend_chatroom", true);
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
            intent.putExtra("block_contact", Util.setToString(C74560s1.m89274c(), ","));
            C79062b.m95631b(intent, C14193c.class);
            C79062b.m95631b(intent, C78904i.class);
            C79062b.m95631b(intent, C78244i.class);
            C79062b.m95631b(intent, C14265j.class);
            C79062b.m95631b(intent, C78436b.class);
            C79062b.m95631b(intent, C78444g.class);
            C79062b.m95631b(intent, C65764a.class);
            C79062b.m95631b(intent, C78877c0.class);
            C79062b.m95631b(intent, C78889f0.class);
            C79062b.m95631b(intent, C78928r.class);
            C79062b.m95631b(intent, C78917n.class);
            C79062b.m95631b(intent, C78870a.class);
            C79062b.m95631b(intent, C78938y.class);
            C79062b.m95631b(intent, C78944z.class);
            C88144b.m109801s(singleChatInfoUI, ".ui.mvvm.MvvmSelectContactUI", intent, (Bundle) null);
        }

        /* renamed from: d */
        public void mo5956d(ViewGroup viewGroup, View view, int i) {
            ContactListExpandPreference contactListExpandPreference = SingleChatInfoUI.this.f121196g;
            if (contactListExpandPreference != null) {
                contactListExpandPreference.mo100300J();
            }
        }

        /* renamed from: e */
        public void mo5957e(ViewGroup viewGroup, View view, int i) {
            C44673z4 Lo;
            int i2 = i;
            Class cls = C76246h5.class;
            Class cls2 = C60179k4.class;
            Class cls3 = C60165e4.class;
            String c = C76802a.m92581c(SingleChatInfoUI.this.f121196g, i2);
            String nullAsNil = Util.nullAsNil(C76802a.m92580b(SingleChatInfoUI.this.f121196g, i2));
            if (Util.isNullOrNil(nullAsNil) && (Lo = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(c)) != null && !Util.isNullOrNil(Lo.field_encryptUsername)) {
                nullAsNil = Lo.field_conRemark;
            }
            if (!Util.isNullOrNil(c)) {
                if (C72996z1.m85825X4(SingleChatInfoUI.this.f121200n)) {
                    ((C60165e4) C86312j.m106911c(cls3)).mo85153NF();
                    String n = ((C60179k4) C86312j.m106911c(cls2)).mo78770n(SingleChatInfoUI.this.f121200n);
                    if (C72996z1.m85817T4(n)) {
                        Intent intent = new Intent();
                        intent.putExtra("finder_username", n);
                        ((C60165e4) C86312j.m106911c(cls3)).mo85158TJ(viewGroup.getContext(), intent, 0, (String) null, 0, 10, false, -1);
                        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76819V1(viewGroup.getContext(), intent);
                    } else if (C72996z1.m85823W4(n)) {
                        Intent intent2 = new Intent();
                        ((C76246h5) C86312j.m106911c(cls)).mo80016hk(((C60208v1) C86312j.m106911c(C60208v1.class)).mo78709aq(n), intent2);
                        String ds02 = ((C60179k4) C86312j.m106911c(cls2)).ds0(n, 3);
                        intent2.putExtra("IsPoster", true);
                        intent2.putExtra("Action", 1);
                        intent2.putExtra("SessionId", ds02);
                        ((C76246h5) C86312j.m106911c(cls)).mo80017zR(viewGroup.getContext(), intent2, 2, (C32226l<? super String, C13598b0>) null);
                    } else {
                        Log.m105924i("MicroMsg.SingleChatInfoUI", "talkerName :" + n);
                    }
                } else if (C72996z1.m85799F5(SingleChatInfoUI.this.f121200n)) {
                    Intent intent3 = new Intent(SingleChatInfoUI.this, ProfileHdHeadImg.class);
                    intent3.putExtra("username", SingleChatInfoUI.this.f121200n);
                    ((C47902u) C86312j.m106911c(C47902u.class)).mo72655dS(SingleChatInfoUI.this.f121200n, 154);
                    SingleChatInfoUI singleChatInfoUI = SingleChatInfoUI.this;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent3);
                    SingleChatInfoUI singleChatInfoUI2 = singleChatInfoUI;
                    C117292a.m165358d(singleChatInfoUI2, aVar.mo10232b(), "com/tencent/mm/ui/SingleChatInfoUI$6", "onItemNormalClick", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    singleChatInfoUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(singleChatInfoUI2, "com/tencent/mm/ui/SingleChatInfoUI$6", "onItemNormalClick", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (C72996z1.m85832c5(SingleChatInfoUI.this.f121200n)) {
                    ((C53224d) C86312j.m106911c(C53224d.class)).mo73894KV(SingleChatInfoUI.this.getContext(), SingleChatInfoUI.this.f121200n, 1);
                } else {
                    if (C72996z1.m85846q5(c)) {
                        C47224a.m52531b(c, 10, 0);
                    }
                    Intent intent4 = new Intent();
                    intent4.putExtra("Contact_User", c);
                    intent4.putExtra("Contact_RemarkName", nullAsNil);
                    intent4.putExtra("Contact_Nick", Util.nullAsNil(C76802a.m92579a(SingleChatInfoUI.this.f121196g, i2)));
                    intent4.putExtra("Contact_RoomMember", true);
                    intent4.putExtra("CONTACT_INFO_UI_SOURCE", 9);
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(c);
                    if (z1Var != null && ((int) z1Var.f108320R1) > 0 && z1Var.mo62927s3()) {
                        C74584x.m89302e(intent4, c);
                    }
                    intent4.putExtra("Kdel_from", 0);
                    C88144b.m109795m(SingleChatInfoUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", intent4, 0);
                }
            }
        }
    }

    /* renamed from: H7 */
    public final void mo69885H7() {
        Intent intent = new Intent();
        intent.putExtra("showShare", false);
        if (C72996z1.m85832c5(this.f121200n)) {
            C53224d dVar = (C53224d) C86312j.m106911c(C53224d.class);
            AppCompatActivity context = getContext();
            String str = this.f121200n;
            dVar.getClass();
            C87412m.m108594g(str, "sessionId");
            C53474j G2 = ((C53475k) C86312j.m106911c(C53475k.class)).mo59160G2(str);
            String t = G2.mo59157t();
            Log.m105919d("GameLife.PluginGameLife", "talkerName:%s", t);
            intent.putExtra("k_username", t);
            String str2 = C74928u.C45092d.f122308c;
            C87412m.m108593f(str2, "KExposeGameLifeUrl");
            String format = String.format(str2, Arrays.copyOf(new Object[]{39}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            intent.putExtra("rawUrl", format);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            String t1 = G2.mo59158t1();
            String sessionId = G2.getSessionId();
            C87412m.m108593f(sessionId, "sessionInfo.sessionId");
            C87412m.m108593f(t1, "selfUserName");
            C87412m.m108593f(t, "talkerName");
            C53224d.Fx0(dVar, 8, 40, sessionId, t1, t, (Boolean) null, (Integer) null, (Boolean) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
            return;
        }
        if (C72996z1.m85825X4(this.f121200n)) {
            intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{61}));
        } else if (C72996z1.m85799F5(this.f121200n)) {
            ((C47902u) C86312j.m106911c(C47902u.class)).mo72655dS(this.f121200n, 159);
            intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{76}));
        } else {
            intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{39}));
        }
        intent.putExtra("k_username", this.f121200n);
        C88144b.m109791i(this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: I7 */
    public final void mo69886I7(boolean z) {
        boolean X4 = C72996z1.m85825X4(this.f121200n);
        boolean F5 = C72996z1.m85799F5(this.f121200n);
        this.f121193d.mo72529n("room_accept_message", true ^ (X4 || F5));
        if (X4 || F5) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f121193d.mo72519a("room_accept_message");
            checkBoxPreference.mo69923G(C0966R.string.b3q);
            checkBoxPreference.mo6805K(z);
            checkBoxPreference.f121290w = false;
            this.f121193d.notifyDataSetChanged();
        }
    }

    /* renamed from: J7 */
    public final void mo69887J7() {
        Class cls = C28426b.class;
        this.f121198i = (CheckBoxPreference) this.f121193d.mo72519a("force_notify");
        if (C72996z1.m85843n5(this.f121194e.getUsername()) || C75592q0.m90764L(this.f121194e.getUsername()) || C72996z1.m85846q5(this.f121194e.getUsername())) {
            this.f121193d.mo72529n("force_notify", true);
            return;
        }
        long u202 = ((C28426b) C86312j.m106911c(cls)).u20(this.f121194e.getUsername());
        boolean ia = ((C28426b) C86312j.m106911c(cls)).mo55965ia(this.f121194e.getUsername());
        this.f121198i.mo6805K(ia);
        this.f121198i.mo6808N(ia);
        if (this.f121198i.mo6804J()) {
            this.f121198i.mo7741E(getResources().getString(C0966R.string.f1l, new Object[]{new SimpleDateFormat("HH:mm").format(new Date(u202))}));
        } else {
            this.f121198i.mo7741E((CharSequence) null);
            setTitleMuteIconVisibility(C45628s0.m50746K(this.f121194e) ? 0 : 8);
        }
        if (this.f121199j == null) {
            this.f121199j = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        this.f121199j.edit().putBoolean("force_notify", this.f121198i.mo6804J()).commit();
        this.f121193d.notifyDataSetChanged();
    }

    /* renamed from: K7 */
    public final void mo69888K7() {
        if (C72996z1.m85825X4(this.f121200n) || C72996z1.m85832c5(this.f121200n) || C72996z1.m85799F5(this.f121200n)) {
            this.f121193d.mo72529n(this.f121197h.f121285r, true);
            return;
        }
        if (this.f121199j == null) {
            this.f121199j = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        boolean K = C45628s0.m50746K(this.f121194e);
        this.f121201o = K;
        ((C15711o) C39818r.f106831a.mo62444c(getContext()).mo75002a(C15711o.class)).setValue("is_mute", K ? getResources().getString(C0966R.string.bvl) : "");
        if (this.f121201o) {
            setTitleMuteIconVisibility(0);
            if (this.f121197h != null) {
                this.f121199j.edit().putBoolean("room_notify_new_msg", true).commit();
            }
        } else {
            setTitleMuteIconVisibility(8);
            if (this.f121197h != null) {
                this.f121199j.edit().putBoolean("room_notify_new_msg", false).commit();
            }
        }
        this.f121193d.notifyDataSetChanged();
    }

    /* renamed from: L7 */
    public final void mo69889L7() {
        this.f121207u = new C44691b();
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.f121200n);
        ((C47902u) C86312j.m106911c(C47902u.class)).bu0(linkedList, this.f121207u, this);
    }

    public C73244a createAdapter(SharedPreferences sharedPreferences) {
        return new C47510b(this, getListView(), sharedPreferences);
    }

    public int getResourceId() {
        return C0966R.xml.f8934br;
    }

    public void initView() {
        boolean z;
        C72996z1 z1Var;
        if (this.f121194e == null) {
            Log.m105920e("MicroMsg.SingleChatInfoUI", "[initView] contact is null!");
            finish();
        }
        this.f121193d = getPreferenceScreen();
        setMMTitle(getString(C0966R.string.i_8));
        ContactListExpandPreference contactListExpandPreference = (ContactListExpandPreference) this.f121193d.mo72519a("roominfo_contact_anchor");
        this.f121196g = contactListExpandPreference;
        contactListExpandPreference.mo100302L(this.f121193d, contactListExpandPreference.f121285r);
        ContactListExpandPreference contactListExpandPreference2 = this.f121196g;
        contactListExpandPreference2.mo100304N(true);
        contactListExpandPreference2.mo100305P(false);
        C72996z1 z1Var2 = this.f121194e;
        if (z1Var2 != null && z1Var2.mo73975s2() == 1) {
            this.f121196g.mo100304N(false);
        }
        if (!C74560s1.m89277f() && (z1Var = this.f121194e) != null && C72996z1.m85843n5(z1Var.getUsername())) {
            this.f121196g.mo100304N(false);
        }
        this.f121197h = (CheckBoxPreference) this.f121193d.mo72519a("room_notify_new_msg");
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f121193d.mo72519a("room_placed_to_the_top");
        this.f121193d.mo72529n("force_notify", !this.f121194e.mo62927s3());
        if (this.f121199j == null) {
            this.f121199j = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (this.f121194e != null) {
            if (C72996z1.m85825X4(this.f121200n)) {
                z = ((C46117w1) C86312j.m106911c(C46117w1.class)).P20(this.f121200n);
            } else {
                z = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69755a0(this.f121194e.getUsername());
            }
            this.f121199j.edit().putBoolean("room_placed_to_the_top", z).commit();
            this.f121201o = C45628s0.m50746K(this.f121194e);
            this.f121199j.edit().putBoolean("room_notify_new_msg", this.f121201o).commit();
        } else {
            this.f121199j.edit().putBoolean("room_notify_new_msg", false).commit();
            this.f121201o = false;
        }
        if (C72996z1.m85825X4(this.f121200n)) {
            this.f121193d.mo72529n("room_search_chatting_content", true);
            this.f121193d.mo72529n("force_notify", true);
        }
        if (C72996z1.m85799F5(this.f121200n)) {
            this.f121193d.mo72529n("room_search_chatting_content", true);
            this.f121193d.mo72529n("force_notify", true);
            this.f121193d.mo72529n("room_set_chatting_background", true);
        }
        ((C72972g4) C97625j3.m125812b().mo105911z()).yx0(this.f121200n);
        this.f121193d.notifyDataSetChanged();
        if (this.f121196g != null) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(this.f121200n);
            this.f121196g.mo100301K(this.f121200n, linkedList);
            getListView().setOnScrollListener(this.f121206t);
            ContactListExpandPreference contactListExpandPreference3 = this.f121196g;
            C78399i iVar = this.f121206t;
            C76803c cVar = contactListExpandPreference3.f211662K;
            if (cVar != null) {
                ((C72741a) cVar).f211670g.f230154u = iVar;
            }
            contactListExpandPreference3.mo100307S(new C44696d());
        }
        setBackBtn(new C44693e());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 2 && i2 == -1) {
            finish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<ht1.k4> r1 = ht1.C60179k4.class
            super.onCreate(r18)
            java.lang.Class<bv1.b> r2 = bv1.C28426b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            bv1.b r2 = (bv1.C28426b) r2
            com.tencent.mm.sdk.storage.MAutoStorage r2 = r2.mo55960Hq()
            com.tencent.mm.sdk.storage.MStorage$IOnStorageChange r3 = r0.f121208v
            r2.add(r3)
            dd0.b r2 = dd0.C75350g.m90357a()
            if (r2 == 0) goto L_0x0027
            dd0.b r2 = dd0.C75350g.m90357a()
            sx2.j r2 = (sx2.C48497j) r2
            r2.mo73127a(r0)
        L_0x0027:
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r3 = "Single_Chat_Talker"
            java.lang.String r2 = r2.getStringExtra(r3)
            r0.f121200n = r2
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r3 = "fromChatting"
            r4 = 0
            boolean r2 = r2.getBooleanExtra(r3, r4)
            r0.f121204r = r2
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            java.lang.String r3 = r0.f121200n
            com.tencent.mm.storage.z1 r2 = r2.get(r3)
            r0.f121194e = r2
            r3 = 1
            if (r2 != 0) goto L_0x0068
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = r0.f121200n
            r1[r4] = r2
            java.lang.String r2 = "MicroMsg.SingleChatInfoUI"
            java.lang.String r3 = "contact is null! talker:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r1)
            r17.finish()
            return
        L_0x0068:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r17.getPackageName()
            r2.append(r5)
            java.lang.String r5 = "_preferences"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.f121210x = r2
            r17.initView()
            java.lang.Class<sr.g> r2 = p687sr.C64156g.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            sr.g r2 = (p687sr.C64156g) r2
            com.tencent.mm.storage.z1 r5 = r0.f121194e
            java.lang.String r5 = r5.getUsername()
            long r6 = eb0.C31543z5.m39453c()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            r8 = 3
            r2.mo58063xl(r5, r8, r6)
            java.lang.String r2 = r0.f121200n
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85832c5(r2)
            r5 = 1
            java.lang.String r7 = "seperate_line_between_force_notify_and_background"
            java.lang.String r9 = "room_set_chatting_background"
            java.lang.String r10 = "force_notify"
            java.lang.String r11 = "room_placed_to_the_top"
            if (r2 != 0) goto L_0x00b5
            pj3.g r2 = r0.f121193d
            java.lang.String r12 = "room_add_blacklist"
            r2.mo72529n(r12, r3)
            goto L_0x00f1
        L_0x00b5:
            pj3.g r2 = r0.f121193d
            java.lang.String r12 = "room_search_chatting_content"
            r2.mo72529n(r12, r3)
            pj3.g r2 = r0.f121193d
            r2.mo72529n(r9, r3)
            pj3.g r2 = r0.f121193d
            r2.mo72529n(r11, r3)
            pj3.g r2 = r0.f121193d
            r2.mo72529n(r10, r3)
            pj3.g r2 = r0.f121193d
            r2.mo72529n(r7, r3)
            pj3.g r2 = r0.f121193d
            java.lang.String r12 = "seperate_line_between_background_and_clear_history"
            r2.mo72529n(r12, r3)
            java.lang.Class<wy1.d> r2 = wy1.C53224d.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            wy1.d r2 = (wy1.C53224d) r2
            androidx.appcompat.app.AppCompatActivity r12 = r17.getContext()
            java.lang.String r13 = r0.f121200n
            com.tencent.mm.ui.w3 r14 = new com.tencent.mm.ui.w3
            r14.<init>(r0)
            r2.getClass()
            java.lang.Class<xy1.g> r2 = xy1.C15913g.class
            if (r12 != 0) goto L_0x00f4
        L_0x00f1:
            r16 = r9
            goto L_0x015d
        L_0x00f4:
            r3 = 4
            r16 = r9
            r8 = 301(0x12d, double:1.487E-321)
            com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct r15 = new com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct
            r15.<init>()
            r15.f107922d = r3
            r3 = 0
            r15.f107923e = r3
            r15.f107924f = r3
            r15.f107925g = r5
            r15.f107926h = r8
            r15.mo86054n()
            android.content.res.Resources r3 = r12.getResources()
            r4 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r3 = r3.getString(r4)
            r4 = 0
            r8 = 3
            r9 = 1
            qo3.i0 r3 = qo3.C89779i0.m112248e(r12, r3, r9, r8, r4)
            r3.show()
            java.lang.Class<xy1.k> r4 = xy1.C53475k.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            xy1.k r4 = (xy1.C53475k) r4
            java.lang.String r4 = r4.mo59162n(r13)
            di3.d r8 = di3.C86312j.m106911c(r2)
            xy1.g r8 = (xy1.C15913g) r8
            xy1.f r4 = r8.mo440X3(r4)
            java.lang.String r8 = r4.getUsername()
            int r4 = r4.mo422D0()
            if (r4 > 0) goto L_0x014f
            r2 = 2131830967(0x7f1128b7, float:1.9294946E38)
            r3 = 0
            android.widget.Toast r2 = p910lj.C76701a.makeText((android.content.Context) r12, (int) r2, (int) r3)
            r2.show()
            goto L_0x015d
        L_0x014f:
            di3.d r2 = di3.C86312j.m106911c(r2)
            xy1.g r2 = (xy1.C15913g) r2
            wy1.m r4 = new wy1.m
            r4.<init>(r3, r14, r12)
            r2.mo439VN(r8, r4)
        L_0x015d:
            com.tencent.mm.storage.z1 r2 = r0.f121194e
            java.lang.String r3 = "close_chat"
            if (r2 == 0) goto L_0x0192
            java.lang.String r2 = r2.getUsername()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85846q5(r2)
            if (r2 == 0) goto L_0x0192
            pj3.g r2 = r0.f121193d
            r4 = 1
            r2.mo72529n(r11, r4)
            pj3.g r2 = r0.f121193d
            r2.mo72529n(r10, r4)
            pj3.g r2 = r0.f121193d
            r2.mo72529n(r7, r4)
            pj3.g r2 = r0.f121193d
            r7 = r16
            r2.mo72529n(r7, r4)
            pj3.g r2 = r0.f121193d
            java.lang.String r7 = "room_notify_new_msg"
            r8 = 0
            r2.mo72529n(r7, r8)
            pj3.g r2 = r0.f121193d
            r2.mo72529n(r3, r8)
            goto L_0x0198
        L_0x0192:
            r4 = 1
            pj3.g r2 = r0.f121193d
            r2.mo72529n(r3, r4)
        L_0x0198:
            java.lang.String r2 = r0.f121200n
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85825X4(r2)
            if (r2 == 0) goto L_0x0223
            pj3.g r2 = r0.f121193d
            r2.mo72529n(r11, r4)
            com.tencent.mm.ui.b4 r2 = new com.tencent.mm.ui.b4
            r2.<init>(r0)
            r0.f121205s = r2
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            te3.qd1 r3 = new te3.qd1
            r3.<init>()
            di3.d r4 = di3.C86312j.m106911c(r1)
            ht1.k4 r4 = (ht1.C60179k4) r4
            java.lang.String r7 = r0.f121200n
            java.lang.String r4 = r4.mo78770n(r7)
            di3.d r7 = di3.C86312j.m106911c(r1)
            ht1.k4 r7 = (ht1.C60179k4) r7
            java.lang.String r8 = r0.f121200n
            java.lang.String r7 = r7.mo78768d3(r8)
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85817T4(r7)
            if (r8 == 0) goto L_0x01d8
            r8 = 1
            r3.f140245d = r8
            goto L_0x01e5
        L_0x01d8:
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85821V4(r7)
            if (r7 == 0) goto L_0x01e2
            r7 = 3
            r3.f140245d = r7
            goto L_0x01e5
        L_0x01e2:
            r7 = 2
            r3.f140245d = r7
        L_0x01e5:
            java.lang.String r7 = r0.f121200n
            r3.f140247f = r7
            r3.f140246e = r4
            r2.add(r3)
            di3.d r3 = di3.C86312j.m106911c(r1)
            ht1.k4 r3 = (ht1.C60179k4) r3
            ht1.k4$b r4 = r0.f121205s
            r3.Hp0(r2, r4)
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.k4 r1 = (ht1.C60179k4) r1
            java.lang.String r2 = r0.f121200n
            java.lang.String r1 = r1.mo78770n(r2)
            java.lang.Class<ht1.e4> r2 = ht1.C60165e4.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.e4 r2 = (ht1.C60165e4) r2
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85817T4(r1)
            if (r3 == 0) goto L_0x0214
            goto L_0x0216
        L_0x0214:
            r5 = 2
        L_0x0216:
            java.lang.String r3 = r0.f121200n
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x021d
            r3 = r4
        L_0x021d:
            if (r1 != 0) goto L_0x0220
            r1 = r4
        L_0x0220:
            r2.cv0(r5, r3, r1)
        L_0x0223:
            java.lang.String r1 = r0.f121200n
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85799F5(r1)
            if (r1 == 0) goto L_0x0235
            pj3.g r1 = r0.f121193d
            r2 = 1
            r1.mo72529n(r11, r2)
            r17.mo69889L7()
            goto L_0x0236
        L_0x0235:
            r2 = 1
        L_0x0236:
            com.tencent.mm.storage.z1 r1 = r0.f121194e
            java.lang.String r1 = r1.getUsername()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85816S4(r1)
            if (r1 == 0) goto L_0x0257
            pj3.g r1 = r0.f121193d
            java.lang.String r3 = "room_expose"
            r1.mo72529n(r3, r2)
            pj3.g r1 = r0.f121193d
            r1.mo72529n(r10, r2)
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference r1 = r0.f121196g
            r2 = 0
            r1.mo100304N(r2)
            r17.mo69889L7()
        L_0x0257:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.SingleChatInfoUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        ContactListExpandPreference contactListExpandPreference = this.f121196g;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.getClass();
        }
        ((C28426b) C86312j.m106911c(C28426b.class)).mo55960Hq().remove(this.f121208v);
        C53534a.m60079b();
        if (C75350g.m90357a() != null) {
            ((C48497j) C75350g.m90357a()).mo73132f(this);
        }
        super.onDestroy();
        Class cls = C60165e4.class;
        ((C60165e4) C86312j.m106911c(cls)).mo85156Qn(getContext(), 0, 0);
        ((C60165e4) C86312j.m106911c(cls)).Dr0(((C60165e4) C86312j.m106911c(cls)).mo85166dj(getContext()));
    }

    public void onPause() {
        super.onPause();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        AppCompatActivity context;
        Class cls = C47902u.class;
        Class cls2 = C60165e4.class;
        String str = preference.f121285r;
        if (str.equals("room_notify_new_msg")) {
            boolean z = !this.f121201o;
            this.f121201o = z;
            if (z) {
                C45628s0.m50779i0(this.f121194e, true);
            } else {
                C45628s0.m50797r0(this.f121194e, true);
            }
            this.f121194e = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f121200n);
            if (this.f121199j == null) {
                this.f121199j = getSharedPreferences(getPackageName() + "_preferences", 0);
            }
            this.f121199j.edit().putBoolean("room_notify_new_msg", this.f121201o).commit();
            mo69888K7();
        } else if (str.equals("room_placed_to_the_top")) {
            Class cls3 = C46117w1.class;
            SharedPreferences sharedPreferences = getSharedPreferences(this.f121210x, 0);
            if (this.f121194e != null) {
                if (C72996z1.m85825X4(this.f121200n)) {
                    ((C46117w1) C86312j.m106911c(cls3)).cn0(this.f121194e.getUsername(), !((C46117w1) C86312j.m106911c(cls3)).P20(this.f121200n));
                } else {
                    if (((C44660i2) C97625j3.m125812b().mo105908w()).mo69755a0(this.f121194e.getUsername())) {
                        C45628s0.m50803u0(this.f121194e.getUsername(), true);
                    } else {
                        C45628s0.m50787m0(this.f121194e.getUsername(), true, true);
                    }
                    sharedPreferences.edit().putBoolean("room_placed_to_the_top", ((C44660i2) C97625j3.m125812b().mo105908w()).mo69755a0(this.f121194e.getUsername())).commit();
                }
            }
        } else if (str.equals("force_notify")) {
            if (!this.f121198i.mo6804J()) {
                ((C28426b) C86312j.m106911c(C28426b.class)).mo55962W0(this.f121194e.getUsername() + "@wxcontact", 3);
                this.f121198i.mo7741E((CharSequence) null);
            } else {
                C60634a.f172741a.mo85587a(getContext(), 1, false, new C44694f());
            }
        } else if (str.equals("room_set_chatting_background")) {
            Intent intent = new Intent();
            intent.putExtra("isApplyToAll", false);
            intent.putExtra("username", this.f121194e.getUsername());
            C88144b.m109795m(this, "setting", ".ui.setting.SettingsChattingBackgroundUI", intent, 2);
        } else if (str.equals("room_search_chatting_content")) {
            Intent intent2 = new Intent();
            intent2.putExtra("detail_username", this.f121200n);
            boolean z2 = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_FTSMultiTabSearch_Int, 0) == 1;
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_fts_multi_tab_search_entrance, false);
            Log.m105924i("MicroMsg.FTSMultiTabEntranceConfig", "FTSMultiTabEntranceConfig >> " + z2 + ", " + wf);
            if (z2 || wf) {
                intent2.setClass(this, FTSChattingConvMultiTabUI.class);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/SingleChatInfoUI", "searchChattingContent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/SingleChatInfoUI", "searchChattingContent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                ((C65873e) C86312j.m106911c(C65873e.class)).mo89915LO(this, ".ui.FTSChattingConvUI", intent2);
            }
            C115669n.INSTANCE.mo160131h(14569, 1, 0, 0, 0, 0, 0, 0, 0, 0);
        } else if (str.equals("room_clear_chatting_history")) {
            ((C60165e4) C86312j.m106911c(cls2)).c70();
            if (C72996z1.m85799F5(this.f121200n)) {
                ((C47902u) C86312j.m106911c(cls)).mo72655dS(this.f121200n, 157);
            }
            C76879j.m92708B(getContext(), getString(C0966R.string.eym, new Object[]{this.f121194e.mo62898f()}), "", getString(C0966R.string.f7930wk), getString(C0966R.string.f7926wf), new C45039s3(this), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
        } else if (str.equals("room_expose")) {
            Class cls4 = C14088e.class;
            ((C60165e4) C86312j.m106911c(cls2)).ct0();
            if (C72996z1.m85832c5(this.f121200n) || C72996z1.m85825X4(this.f121200n) || C72996z1.m85799F5(this.f121200n)) {
                mo69885H7();
            } else if (((C14088e) C86312j.m106911c(cls4)).mo13530uu("wxalited4df4810a40b1d9ddc0cbea44d263fd9")) {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
                bundle.putString(SearchIntents.EXTRA_QUERY, "{\"scene\":39}");
                bundle2.putString("k_username", this.f121200n);
                bundle.putBundle("extraData", bundle2);
                Log.m105924i("MicroMsg.SingleChatInfoUI", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
                ((C14088e) C86312j.m106911c(cls4)).mo13510OP(this, bundle, true, true, new C45095u3(this));
            } else {
                mo69885H7();
            }
        } else if (str.equals("chat_app_brand")) {
            Intent intent3 = new Intent();
            intent3.putExtra("Chat_User", this.f121200n);
            C88144b.m109801s(this, ".ui.chatting.gallery.AppBrandHistoryListUI", intent3, (Bundle) null);
            C115669n.INSTANCE.idkeyStat(219, 25, 1, true);
        } else if (str.equals("room_accept_message")) {
            Class cls5 = C33050g5.class;
            Class cls6 = C60179k4.class;
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f121193d.mo72519a("room_accept_message");
            if (checkBoxPreference != null) {
                boolean J = checkBoxPreference.mo6804J();
                if (C72996z1.m85799F5(this.f121200n)) {
                    ((C47902u) C86312j.m106911c(cls)).mo72658mz(this, J, this.f121200n);
                } else {
                    String n = ((C60179k4) C86312j.m106911c(cls6)).mo78770n(this.f121200n);
                    String d3 = ((C60179k4) C86312j.m106911c(cls6)).mo78768d3(this.f121200n);
                    if (!C72996z1.m85817T4(n)) {
                        ((C33050g5) C86312j.m106911c(cls5)).mo58969q6(J, this.f121200n);
                    } else if (C72996z1.m85817T4(d3)) {
                        ((C33050g5) C86312j.m106911c(cls5)).mo58969q6(J, this.f121200n);
                    } else {
                        ((C33056k3) C86312j.m106911c(C33056k3.class)).mo58970Cj(J, this.f121200n);
                    }
                    ((C60165e4) C86312j.m106911c(cls2)).mo85172sg(J ? 1 : 0);
                }
            }
        } else if (str.equals("room_add_blacklist")) {
            if (C72996z1.m85832c5(this.f121200n)) {
                ((C53221c) C86312j.m106911c(C53221c.class)).mo73896jX(getContext(), this.f121200n, this.f121203q, this.f121202p, new C45110y3(this));
            }
        } else if (str.equals("close_chat") && (context = getContext()) != null) {
            C47224a.m52531b(this.f121200n, 8, 0);
            C76879j.m92708B(context, context.getResources().getString(C0966R.string.hez), "", context.getString(C0966R.string.hex), context.getString(C0966R.string.f7926wf), new C45111z3(this, context), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
        }
        return false;
    }

    public void onResume() {
        mo69888K7();
        boolean z = false;
        if (this.f121196g != null) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(this.f121200n);
            this.f121196g.mo100301K(this.f121200n, linkedList);
            if (C72996z1.m85825X4(this.f121200n)) {
                this.f121196g.mo100304N(false);
                this.f121196g.mo100305P(false);
            }
            if (C72996z1.m85799F5(this.f121200n)) {
                this.f121196g.mo100304N(false);
                this.f121196g.mo100305P(false);
            }
            if (C72996z1.m85832c5(this.f121200n)) {
                this.f121196g.mo100304N(false);
                this.f121196g.mo100305P(false);
            }
            this.f121196g.mo100306R(true);
            if (C72996z1.m85846q5(this.f121200n)) {
                this.f121196g.mo100304N(false);
                this.f121196g.mo100305P(false);
                this.f121196g.mo100306R(false);
            }
        }
        boolean X4 = C72996z1.m85825X4(this.f121200n);
        boolean F5 = C72996z1.m85799F5(this.f121200n);
        if (X4 || F5) {
            z = true;
        }
        this.f121193d.mo72529n("room_accept_message", !z);
        if (X4) {
            mo69886I7(((C60208v1) C86312j.m106911c(C60208v1.class)).mo78704O1(this.f121200n));
        }
        if (F5) {
            mo69886I7(((C47902u) C86312j.m106911c(C47902u.class)).mo72652O1(this.f121200n));
        }
        mo69887J7();
        this.f121193d.notifyDataSetChanged();
        super.onResume();
        if (!this.f121209w) {
            String stringExtra = getIntent().getStringExtra("need_matte_high_light_item");
            if (!Util.isNullOrNil(stringExtra)) {
                int g = this.f121193d.mo72523g(stringExtra);
                setSelection(g - 3);
                new MMHandler().postDelayed(new C44765c4(this, g), 10);
            }
            this.f121209w = true;
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C15711o.class);
    }

    /* renamed from: y1 */
    public void mo69890y1(String str, String str2, String str3) {
        ContactListExpandPreference contactListExpandPreference;
        if (str.equals(this.f121200n) && (contactListExpandPreference = this.f121196g) != null) {
            contactListExpandPreference.mo69931v();
        }
    }
}
