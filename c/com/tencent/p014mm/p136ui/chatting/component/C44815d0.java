package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Intent;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import fe1.C58969q;
import go3.C76018x;
import h81.C59774i;
import ht1.C33042b2;
import ht1.C46117w1;
import ht1.C60165e4;
import ht1.C60179k4;
import ht1.C60187m5;
import ht1.C60200t1;
import ht1.C60208v1;
import ht1.C76243a5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kg3.C76577a;
import p151er.C75651n;
import p270xi.C91212b;
import p565ir.C60606n;
import sy0.C48502a;
import te3.C48770aw0;
import te3.C48915bw0;
import te3.C64284cg;
import ue1.C37429f0;
import zj3.C79343c0;
import zj3.C79345d;
import zj3.C79365j;
import zj3.C79387w;
import zt3.C119157j;

@C91212b(exportInterface = C79365j.class)
/* renamed from: com.tencent.mm.ui.chatting.component.d0 */
public class C44815d0 extends C73412a implements C79365j {

    /* renamed from: e */
    public MStorage.IOnStorageChange f121616e = new C44816a();

    /* renamed from: f */
    public final MStorage.IOnStorageChange f121617f = new C44817b();

    /* renamed from: g */
    public FrameLayout f121618g = null;

    /* renamed from: h */
    public View f121619h = null;

    /* renamed from: com.tencent.mm.ui.chatting.component.d0$a */
    public class C44816a implements MStorage.IOnStorageChange {
        public C44816a() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (mStorageEventData.event.equals(C44815d0.this.f215752d.mo91574o().getUsername())) {
                C44815d0.this.mo70103Z5();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.d0$b */
    public class C44817b implements MStorage.IOnStorageChange {
        public C44817b() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            C72996z1 z1Var;
            Class cls = C79343c0.class;
            Log.m105924i("MicroMsg.ChattingBypComponent", "onNotifyChange " + str);
            if ((mStorageEventData.event.equals("FinderContact") || mStorageEventData.event.equals(((C76243a5) C86312j.m106911c(C76243a5.class)).C90())) && (z1Var = C97625j3.m125812b().mo105907v().get(C44815d0.this.f215752d.mo91577r())) != null && ((int) z1Var.f108320R1) != 0) {
                if (Util.isNullOrNil(z1Var.getNickname())) {
                    z1Var.mo62878U2(C44815d0.this.f215752d.mo91574o().getNickname());
                }
                C44815d0.this.f215752d.mo91548I(z1Var);
                ((C79343c0) C44815d0.this.f215752d.f193278b.mo102812a(cls)).mo102611a();
                ((C79343c0) C44815d0.this.f215752d.f193278b.mo102812a(cls)).mo102623k3(true);
                C44815d0.this.f215752d.mo91540A();
                C44815d0.this.mo70104a();
                C44815d0.this.mo70103Z5();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.d0$c */
    public class C44818c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C39969i f121622d;

        public C44818c(C44815d0 d0Var, C39969i iVar) {
            this.f121622d = iVar;
        }

        public void run() {
            Class cls = C75700k0.class;
            ArrayList arrayList = (ArrayList) ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Qx0(Collections.singletonList(((C76243a5) C86312j.m106911c(C76243a5.class)).mo13210IJ()));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C72963f4 f4Var = (C72963f4) it.next();
                Set<Long> set = C48502a.f129711g;
                if (!C48502a.f129711g.contains(Long.valueOf(f4Var.getMsgId()))) {
                    f4Var.mo100991d(5);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(f4Var.getMsgId(), f4Var);
                }
            }
            C39969i iVar = this.f121622d;
            Log.m105925i("MicroMsg.ChattingBypComponent", "sending msg size=%s talker=%s username=%s", Integer.valueOf(arrayList.size()), iVar.f107142b, iVar.f107141a);
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        if (mo70105e4()) {
            if (((C79345d) this.f215752d.f193278b.mo102812a(C79345d.class)).mo70144G5()) {
                FrameLayout frameLayout = this.f121618g;
                if (frameLayout != null) {
                    frameLayout.getChildAt(0).setBackgroundResource(C0966R.C0969drawable.f4747lp);
                }
                View view = this.f121619h;
                if (view != null) {
                    view.findViewById(C0966R.C0970id.mz7).setBackgroundResource(C0966R.C0969drawable.f4747lp);
                }
            }
            mo70103Z5();
        }
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        if (i == 1010 && intent != null && intent.getBooleanExtra("KEY_HAS_CHANGE_ROLE", false)) {
            this.f215752d.mo91565f().finish();
            this.f215752d.mo91565f().overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2493eh);
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        Class cls = C75651n.class;
        Class cls2 = C75700k0.class;
        Class cls3 = C60200t1.class;
        ((C60200t1) C86312j.m106911c(cls3)).mo76848gJ().mo58972a(false);
        if (mo70105e4()) {
            ((C60200t1) C86312j.m106911c(cls3)).mo76736Au().add(this.f121616e);
            ((C60208v1) C86312j.m106911c(C60208v1.class)).mo78712i(this.f121617f);
            mo70104a();
            boolean booleanValue = this.f215752d.f193286j.getBooleanExtra("key_finder_need_choose_id", false).booleanValue();
            String stringExtra = this.f215752d.f193286j.getStringExtra("Chat_User");
            C86709a0.m107528h();
            if (booleanValue && ((((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).Vx0(stringExtra) == 0) || (!C75592q0.m90778h().isEmpty() || !C75592q0.m90782l().isEmpty()) || ((C75651n) C86312j.m106911c(cls)).mo55940Ia())) {
                View da02 = ((C76243a5) C86312j.m106911c(C76243a5.class)).da0(this.f215752d.mo91565f());
                this.f121619h = da02;
                ((BaseChattingUIFragment) this.f215752d.f193287k).mo102031Z().addHeaderView(da02);
                mo70102Y5();
            } else {
                mo70102Y5();
            }
            C86709a0.m107528h();
            boolean z = ((ArrayList) ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).Hx0(stringExtra, true, 1)).size() <= 0;
            boolean z2 = ((C60179k4) C86312j.m106911c(C60179k4.class)).mo78772uE(this.f215752d.mo91577r()) == 0;
            if (((C75651n) C86312j.m106911c(cls)).fp0() != 1 || !z2 || !z) {
                FrameLayout frameLayout = this.f121618g;
                if (frameLayout != null) {
                    ((BaseChattingUIFragment) this.f215752d.f193287k).mo102031Z().removeHeaderView(frameLayout);
                    return;
                }
                return;
            }
            if (this.f121618g == null) {
                FrameLayout frameLayout2 = new FrameLayout(this.f215752d.mo91565f());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 17;
                frameLayout2.setLayoutParams(layoutParams);
                layoutParams.setMargins(0, (int) frameLayout2.getResources().getDimension(C0966R.dimen.f3743cv), 0, 0);
                TextView textView = new TextView(this.f215752d.mo91565f());
                textView.setTextColor(this.f215752d.mo91565f().getResources().getColor(C0966R.color.FG_2));
                textView.setTextSize(1, (this.f215752d.mo91565f().getResources().getDimension(C0966R.dimen.f3879hn) * C76577a.m92165p(this.f215752d.mo91565f())) / C76577a.m92156g(this.f215752d.mo91565f()));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                int dimension = (int) textView.getResources().getDimension(C0966R.dimen.f3766df);
                layoutParams2.gravity = 17;
                int i = dimension / 2;
                textView.setPadding(dimension, dimension, i, i);
                textView.setLayoutParams(layoutParams2);
                textView.setIncludeFontPadding(false);
                textView.setGravity(17);
                textView.setText(this.f215752d.mo91565f().getResources().getString(C0966R.string.mdv));
                frameLayout2.addView(textView);
                this.f121618g = frameLayout2;
            }
            ((BaseChattingUIFragment) this.f215752d.f193287k).mo102031Z().removeHeaderView(this.f121618g);
            ((BaseChattingUIFragment) this.f215752d.f193287k).mo102031Z().addHeaderView(this.f121618g);
        }
    }

    /* renamed from: X */
    public boolean mo70101X(String str) {
        return C72996z1.m85823W4(str);
    }

    /* renamed from: Y5 */
    public final void mo70102Y5() {
        ((C46117w1) C86312j.m106911c(C46117w1.class)).mo64579K(this.f215752d.mo91577r());
        if (!Util.isNullOrNil(this.f215752d.mo91577r())) {
            ((C119157j) C119157j.f356862d).mo183884o(new C44818c(this, this.f215752d.mo91575p()));
        }
        String n = ((C60179k4) C86312j.m106911c(C60179k4.class)).mo78770n(this.f215752d.mo91577r());
        if (C72996z1.m85817T4(this.f215752d.mo91573n())) {
            ((C33042b2) C86312j.m106911c(C33042b2.class)).mo57043wh(this.f215752d.mo91577r());
        }
        ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85155PJ(C72996z1.m85817T4(n) ? 2 : 1, n, this.f215752d.mo91577r());
    }

    /* renamed from: Z5 */
    public final void mo70103Z5() {
        C37429f0 G2 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76736Au().mo71553G2(this.f215752d.mo91574o().getUsername());
        ChatFooter k1 = ((C79387w) this.f215752d.f193278b.mo102812a(C79387w.class)).mo102193k1();
        if (k1 != null && C72996z1.m85825X4(this.f215752d.mo91574o().getUsername())) {
            ChatFooterPanel chatFooterPanel = k1.getChatFooterPanel();
            if (chatFooterPanel != null) {
                chatFooterPanel.setShowSearch(false);
                chatFooterPanel.mo100198j();
            }
            k1.setFooterStatus(G2.field_disableSendMsg != 1);
            String n = this.f215752d.mo91573n();
            C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2(n);
            Boolean valueOf = Boolean.valueOf(C72996z1.m85817T4(this.f215752d.mo91573n()));
            if (valueOf.booleanValue()) {
                if (N2 != null) {
                    k1.mo100358J0(this.f215752d.mo91573n(), valueOf, this.f215752d.mo91565f().getString(C0966R.string.ejl, new Object[]{N2.mo62909j3()}));
                }
            } else if (((C60208v1) C86312j.m106911c(C60208v1.class)).x40(n) != null) {
                Boolean valueOf2 = Boolean.valueOf(C72996z1.m85817T4(n));
                if (N2 != null) {
                    k1.mo100358J0(this.f215752d.mo91573n(), valueOf2, this.f215752d.mo91565f().getString(C0966R.string.ejl, new Object[]{N2.mo62909j3()}));
                }
            } else if (N2 != null) {
                k1.mo100358J0(this.f215752d.mo91573n(), valueOf, this.f215752d.mo91565f().getString(C0966R.string.ejl, new Object[]{N2.mo62909j3()}));
            }
        }
    }

    /* renamed from: a */
    public void mo70104a() {
        String str;
        C79343c0 c0Var;
        SpannableString spannableString;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        String str6;
        LinkedList<C48770aw0> linkedList;
        Class cls = C60208v1.class;
        Class cls2 = C79343c0.class;
        String n = ((C60179k4) C86312j.m106911c(C60179k4.class)).mo78770n(this.f215752d.mo91577r());
        if (Boolean.valueOf(C72996z1.m85817T4(n)).booleanValue()) {
            C60187m5 x402 = ((C60208v1) C86312j.m106911c(cls)).x40(n);
            str = x402 != null ? x402.mo84171f() : "";
            if (x402 != null) {
                C58969q qVar = (C58969q) x402;
                if (qVar.field_authInfo != null) {
                    ((C76243a5) C86312j.m106911c(C76243a5.class)).mo13228X(((C79343c0) this.f215752d.f193278b.mo102812a(cls2)).mo102605J0(), qVar.field_authInfo, 1, (C64284cg) null);
                }
            }
        } else {
            C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2(n);
            str = N2 != null ? N2.mo62909j3() : "";
        }
        if (str == null) {
            ((C79343c0) this.f215752d.f193278b.mo102812a(cls2)).mo102629o0("");
        } else {
            ((C79343c0) this.f215752d.f193278b.mo102812a(cls2)).mo102629o0(str);
        }
        C60187m5 Ff = ((C60208v1) C86312j.m106911c(cls)).mo78700Ff(n);
        if (Ff != null) {
            C79343c0 c0Var2 = (C79343c0) this.f215752d.f193278b.mo102812a(cls2);
            Class cls3 = C60606n.class;
            StringBuilder sb = new StringBuilder();
            LinkedList linkedList2 = new LinkedList();
            StringBuilder sb4 = new StringBuilder();
            try {
                if (Ff instanceof C58969q) {
                    C58969q qVar2 = (C58969q) Ff;
                    C48915bw0 bw02 = qVar2.field_badgeInfoList;
                    if (!(bw02 == null || (linkedList = bw02.f131341d) == null || linkedList.size() == 0)) {
                        if (C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_LIVE_HAS_GET_REWARD_BOOLEAN_SYNC, false)) {
                            linkedList2.addAll(((C60606n) C86312j.m106911c(cls3)).Tv0((View) null, qVar2.field_badgeInfoList.f131341d, new int[]{2, 4}, 1, 0));
                        } else {
                            linkedList2.addAll(((C60606n) C86312j.m106911c(cls3)).Tv0((View) null, qVar2.field_badgeInfoList.f131341d, new int[]{4}, 1, 0));
                        }
                    }
                    z = qVar2.field_badgeInfoList.f131341d.size() <= 1;
                    sb4.append("isLocalFinderContact=true;");
                } else {
                    z = false;
                }
                boolean z2 = Ff.getFollowFlag() == 1;
                if (!z2 || !z) {
                    sb4.append("isFinderContact=true;no follow;");
                    str3 = "";
                } else {
                    str3 = this.f215752d.mo91565f().getResources().getString(C0966R.string.n17);
                    sb4.append("isFinderContact=true;followed;");
                }
                long Y0 = Ff.mo84167Y0();
                int i = (Y0 > 0 ? 1 : (Y0 == 0 ? 0 : -1));
                if (i > 0) {
                    c0Var = c0Var2;
                    str4 = "";
                    try {
                        str5 = this.f215752d.mo91565f().getResources().getString(C0966R.string.d38, new Object[]{Long.valueOf(Y0)});
                        sb4.append("isFinderContact=true;have wecoin;");
                    } catch (Exception e) {
                        e = e;
                        str2 = "MicroMsg.ChattingBypComponent";
                        Log.m105920e(str2, "buildFinderCustomerInfo:" + e.getMessage());
                        spannableString = new SpannableString(sb);
                        c0Var.mo102604I1(spannableString);
                    }
                } else {
                    c0Var = c0Var2;
                    str4 = "";
                    sb4.append("isFinderContact=true;no wecoin;");
                    str5 = str4;
                }
                long m = Ff.mo84188m();
                if (i != 0 || m <= 0) {
                    sb4.append("interactionCount=0;");
                    str6 = str4;
                } else {
                    str6 = this.f215752d.mo91565f().getResources().getString(C0966R.string.d37, new Object[]{Long.valueOf(m)});
                    sb4.append("interactionCount=" + m + ";");
                }
                int size = linkedList2.size();
                StringBuilder sb5 = new StringBuilder();
                String str7 = "MicroMsg.ChattingBypComponent";
                try {
                    sb5.append("spanSize=");
                    sb5.append(size);
                    sb4.append(sb5.toString());
                    for (int i2 = 0; i2 < size; i2++) {
                        sb.append(" ");
                    }
                    sb.append(str3);
                    sb.append(str5);
                    sb.append(str6);
                    if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && size > 0) {
                        sb.append(" ");
                    }
                    spannableString = new SpannableString(sb);
                    StringBuilder sb6 = sb4;
                    int i3 = 0;
                    while (i3 < size) {
                        int i4 = size;
                        int i5 = i3 + 1;
                        spannableString.setSpan(linkedList2.get(i3), i3, i5, 33);
                        i3 = i5;
                        size = i4;
                        linkedList2 = linkedList2;
                    }
                    if (z2 && z) {
                        int indexOf = sb.indexOf(str3);
                        spannableString.setSpan(new C76018x(12, Color.parseColor("#E6000000"), Color.parseColor("#F7F7F7"), C76577a.m92151b(MMApplicationContext.getContext(), 18), C76577a.m92155f(this.f215752d.mo91565f(), C0966R.dimen.f3766df)), indexOf, str3.length() + indexOf, 33);
                    }
                    if (i > 0) {
                        int indexOf2 = sb.indexOf(str5);
                        spannableString.setSpan(new C76018x(12, Color.parseColor("#FF6146"), Color.parseColor("#26FF6146"), C76577a.m92151b(MMApplicationContext.getContext(), 18), C76577a.m92155f(this.f215752d.mo91565f(), C0966R.dimen.f3766df)), indexOf2, str5.length() + indexOf2, 33);
                    }
                    if (i == 0 && m > 0) {
                        int indexOf3 = sb.indexOf(str6);
                        spannableString.setSpan(new C76018x(12, Color.parseColor("#FA9D3B"), Color.parseColor("#26FA9D3B"), C76577a.m92151b(MMApplicationContext.getContext(), 18), C76577a.m92155f(this.f215752d.mo91565f(), C0966R.dimen.f3766df)), indexOf3, str6.length() + indexOf3, 33);
                    }
                    str2 = str7;
                    try {
                        Log.m105924i(str2, "buildFinderCustomerInfo:" + sb6);
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    str2 = str7;
                    Log.m105920e(str2, "buildFinderCustomerInfo:" + e.getMessage());
                    spannableString = new SpannableString(sb);
                    c0Var.mo102604I1(spannableString);
                }
            } catch (Exception e4) {
                e = e4;
                c0Var = c0Var2;
                str2 = "MicroMsg.ChattingBypComponent";
                Log.m105920e(str2, "buildFinderCustomerInfo:" + e.getMessage());
                spannableString = new SpannableString(sb);
                c0Var.mo102604I1(spannableString);
            }
            c0Var.mo102604I1(spannableString);
        }
    }

    /* renamed from: e4 */
    public boolean mo70105e4() {
        return C72996z1.m85825X4(this.f215752d.mo91577r());
    }

    /* renamed from: j0 */
    public boolean mo70106j0(String str) {
        return C72996z1.m85817T4(str);
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        Class cls = C60200t1.class;
        ((C60200t1) C86312j.m106911c(cls)).mo76848gJ().mo58972a(true);
        if (mo70105e4()) {
            ((C60200t1) C86312j.m106911c(cls)).mo76776L4().mo71566K(this.f215752d.mo91577r());
            ((C60200t1) C86312j.m106911c(cls)).mo76736Au().remove(this.f121616e);
            ((C60208v1) C86312j.m106911c(C60208v1.class)).mo78711g(this.f121617f);
            if (C72996z1.m85817T4(((C60200t1) C86312j.m106911c(cls)).mo76736Au().mo71553G2(this.f215752d.mo91574o().getUsername()).field_talker)) {
                ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77237L5().mo2442b();
            } else {
                ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77237L5().mo2441a();
            }
            Class cls2 = C60165e4.class;
            String r = this.f215752d.mo91577r();
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            C67391b bVar = this.f215752d;
            int i = 0;
            if (!(bVar == null || bVar.mo91565f() == null)) {
                i = this.f215752d.mo91565f().getIntent().getIntExtra("key_from_comment_scene", 0);
            }
            String ly = ((C60165e4) C86312j.m106911c(cls2)).mo85167ly(i + 100);
            C60165e4 e4Var = (C60165e4) C86312j.m106911c(cls2);
            if (r == null) {
                r = "";
            }
            long j = (long) i;
            e4Var.C00(r, j, Wb, ly);
        }
    }
}
