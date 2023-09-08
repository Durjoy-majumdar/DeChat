package com.tencent.p014mm.p136ui.bizchat;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.preference.SignaturePreference;
import com.tencent.p014mm.p136ui.base.preference.C73244a;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import com.tencent.p014mm.pluginsdk.p133ui.applet.ContactListExpandPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import gc0.C20828a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p248ug.C52558c;
import p609mp.C76803c;
import p629ny.C76979h;
import p910lj.C76701a;
import pj3.C47510b;
import pj3.C47511g;
import rb0.C47964c0;
import rb0.C47969h;
import rb0.C48009v0;
import sb0.C48329b;
import sb0.C48334c;
import sb0.C48335d;
import sb0.C48340e;
import sb0.C48349h;
import sb0.C48353j;
import sb0.C48354k;
import sb0.C48360o;
import sb0.C48368x;
import sj3.C48411w;
import sj3.C48413y;
import sj3.C48414z;
import te3.C48702af;
import te3.C51960xe;
import te3.C52251ze;
import vd3.C78399i;
import yl3.C53534a;

/* renamed from: com.tencent.mm.ui.bizchat.BizChatroomInfoUI */
public class BizChatroomInfoUI extends MMPreference implements C11385n, C47964c0 {

    /* renamed from: H */
    public static final /* synthetic */ int f121441H = 0;

    /* renamed from: A */
    public C48353j f121442A = null;

    /* renamed from: B */
    public int f121443B;

    /* renamed from: C */
    public C47969h f121444C;

    /* renamed from: D */
    public C78399i f121445D = new C78399i(new C6766b(this));

    /* renamed from: E */
    public boolean f121446E = false;

    /* renamed from: F */
    public boolean f121447F = false;

    /* renamed from: G */
    public C48335d.C48337b f121448G = new C44746a();

    /* renamed from: d */
    public ProgressDialog f121449d = null;

    /* renamed from: e */
    public C47511g f121450e;

    /* renamed from: f */
    public SignaturePreference f121451f;

    /* renamed from: g */
    public ContactListExpandPreference f121452g;

    /* renamed from: h */
    public CheckBoxPreference f121453h;

    /* renamed from: i */
    public CheckBoxPreference f121454i;

    /* renamed from: j */
    public CheckBoxPreference f121455j;

    /* renamed from: n */
    public SharedPreferences f121456n = null;

    /* renamed from: o */
    public String f121457o;

    /* renamed from: p */
    public long f121458p;

    /* renamed from: q */
    public String f121459q;

    /* renamed from: r */
    public boolean f121460r = false;

    /* renamed from: s */
    public int f121461s;

    /* renamed from: t */
    public boolean f121462t = false;

    /* renamed from: u */
    public boolean f121463u;

    /* renamed from: v */
    public boolean f121464v;

    /* renamed from: w */
    public boolean f121465w;

    /* renamed from: x */
    public int f121466x;

    /* renamed from: y */
    public C48334c f121467y = null;

    /* renamed from: z */
    public C48353j f121468z = null;

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatroomInfoUI$b */
    public class C6766b implements AbsListView.OnScrollListener {
        public C6766b(BizChatroomInfoUI bizChatroomInfoUI) {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/bizchat/BizChatroomInfoUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/bizchat/BizChatroomInfoUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/bizchat/BizChatroomInfoUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C20828a.m22825b().mo32525n(i);
            C117292a.m165361g(this, "com/tencent/mm/ui/bizchat/BizChatroomInfoUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatroomInfoUI$a */
    public class C44746a implements C48335d.C48337b {
        public C44746a() {
        }

        /* renamed from: a */
        public void mo69970a(C48335d.C48337b.C48339b bVar) {
            if (bVar != null && bVar.f129425c != null && bVar.f129424b == BizChatroomInfoUI.this.f121458p && bVar.f129423a != C48335d.C48337b.C48338a.DELETE) {
                Log.m105924i("MicroMsg.BizChatroomInfoUI", "bizChatExtension bizChat change");
                C48334c a0 = C48009v0.Ax0().mo73042a0(BizChatroomInfoUI.this.f121458p);
                BizChatroomInfoUI bizChatroomInfoUI = BizChatroomInfoUI.this;
                bizChatroomInfoUI.f121467y = a0;
                bizChatroomInfoUI.onDataChanged();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatroomInfoUI$c */
    public class C44747c implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C48368x f121470d;

        public C44747c(BizChatroomInfoUI bizChatroomInfoUI, C48368x xVar) {
            this.f121470d = xVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123458d(this.f121470d);
        }
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatroomInfoUI$d */
    public class C44748d implements ContactListExpandPreference.C72740a {
        public C44748d() {
        }

        /* renamed from: a */
        public void mo5953a(ViewGroup viewGroup, View view, int i) {
            C48353j jVar;
            BizChatroomInfoUI bizChatroomInfoUI = BizChatroomInfoUI.this;
            int i2 = BizChatroomInfoUI.f121441H;
            ContactListExpandPreference contactListExpandPreference = bizChatroomInfoUI.f121452g;
            C76803c cVar = contactListExpandPreference.f211662K;
            if (((cVar == null || !((C72741a) cVar).f211670g.mo108546d(i)) ? null : ((C72741a) contactListExpandPreference.f211662K).f211670g.getItem(i)) instanceof C48353j) {
                ContactListExpandPreference contactListExpandPreference2 = bizChatroomInfoUI.f121452g;
                C76803c cVar2 = contactListExpandPreference2.f211662K;
                jVar = (C48353j) ((cVar2 == null || !((C72741a) cVar2).f211670g.mo108546d(i)) ? null : ((C72741a) contactListExpandPreference2.f211662K).f211670g.getItem(i));
            } else {
                jVar = null;
            }
            boolean z = true;
            if (jVar == null) {
                Object[] objArr = new Object[1];
                if (jVar != null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                Log.m105929w("MicroMsg.BizChatroomInfoUI", "onItemNormalClick userInfo == null:%s", objArr);
                return;
            }
            Log.m105925i("MicroMsg.BizChatroomInfoUI", "onItemNormalClick field_userId:%s", jVar.field_userId);
            String str = jVar.field_userId;
            C48702af afVar = new C48702af();
            C52251ze zeVar = new C52251ze();
            zeVar.f145847d = str;
            afVar.f130476d.add(zeVar);
            bizChatroomInfoUI.mo70003J7((C48702af) null, afVar);
        }

        /* renamed from: b */
        public void mo5954b(ViewGroup viewGroup, View view, int i) {
        }

        /* renamed from: c */
        public void mo5955c(ViewGroup viewGroup, View view, int i) {
            BizChatroomInfoUI bizChatroomInfoUI = BizChatroomInfoUI.this;
            int i2 = BizChatroomInfoUI.f121441H;
            bizChatroomInfoUI.getClass();
            Intent intent = new Intent();
            if (!bizChatroomInfoUI.f121462t) {
                C48353j jVar = bizChatroomInfoUI.f121468z;
                if (jVar == null || Util.isNullOrNil(jVar.field_addMemberUrl)) {
                    Log.m105928w("MicroMsg.BizChatroomInfoUI", "dealAddMemberBtn: addMemberUrl is null");
                    C76701a.makeText((Context) bizChatroomInfoUI, (CharSequence) bizChatroomInfoUI.getString(C0966R.string.ark), 0).show();
                    return;
                }
                intent.putExtra("rawUrl", bizChatroomInfoUI.f121468z.field_addMemberUrl);
            } else if (Util.isNullOrNil(bizChatroomInfoUI.f121467y.field_addMemberUrl)) {
                Log.m105928w("MicroMsg.BizChatroomInfoUI", "dealAddMemberBtn: addMemberUrl is null");
                C76701a.makeText((Context) bizChatroomInfoUI, (CharSequence) bizChatroomInfoUI.getString(C0966R.string.ark), 0).show();
                return;
            } else {
                intent.putExtra("rawUrl", bizChatroomInfoUI.f121467y.field_addMemberUrl);
            }
            intent.putExtra("useJs", true);
            C88144b.m109795m(bizChatroomInfoUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, 1);
        }

        /* renamed from: d */
        public void mo5956d(ViewGroup viewGroup, View view, int i) {
            ContactListExpandPreference contactListExpandPreference = BizChatroomInfoUI.this.f121452g;
            if (contactListExpandPreference != null) {
                contactListExpandPreference.mo100300J();
            }
        }

        /* renamed from: e */
        public void mo5957e(ViewGroup viewGroup, View view, int i) {
            C48353j jVar;
            BizChatroomInfoUI bizChatroomInfoUI = BizChatroomInfoUI.this;
            ContactListExpandPreference contactListExpandPreference = bizChatroomInfoUI.f121452g;
            C76803c cVar = contactListExpandPreference.f211662K;
            if (((cVar == null || !((C72741a) cVar).f211670g.mo108546d(i)) ? null : ((C72741a) contactListExpandPreference.f211662K).f211670g.getItem(i)) instanceof C48353j) {
                ContactListExpandPreference contactListExpandPreference2 = bizChatroomInfoUI.f121452g;
                C76803c cVar2 = contactListExpandPreference2.f211662K;
                jVar = (C48353j) ((cVar2 == null || !((C72741a) cVar2).f211670g.mo108546d(i)) ? null : ((C72741a) contactListExpandPreference2.f211662K).f211670g.getItem(i));
            } else {
                jVar = null;
            }
            boolean z = true;
            if (jVar == null || Util.isNullOrNil(jVar.field_profileUrl)) {
                Object[] objArr = new Object[1];
                if (jVar != null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                Log.m105929w("MicroMsg.BizChatroomInfoUI", "onItemNormalClick userInfo == null:%s", objArr);
                return;
            }
            Log.m105925i("MicroMsg.BizChatroomInfoUI", "onItemNormalClick Url:%s", jVar.field_profileUrl);
            C48009v0.yx0().mo73063i(jVar.field_userId, jVar.field_brandUserName, BizChatroomInfoUI.this);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", jVar.field_profileUrl);
            intent.putExtra("useJs", true);
            C88144b.m109791i(BizChatroomInfoUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatroomInfoUI$e */
    public class C44749e implements MenuItem.OnMenuItemClickListener {
        public C44749e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BizChatroomInfoUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo70001H7() {
        Log.m105924i("MicroMsg.BizChatroomInfoUI", "dealModChatNameFail reset bizChatName");
        C48334c cVar = this.f121467y;
        cVar.field_chatName = this.f121459q;
        cVar.field_bitFlag = this.f121466x;
        this.f121463u = cVar.mo73033l2(1);
        this.f121464v = this.f121467y.mo73033l2(8);
        this.f121465w = this.f121467y.mo73033l2(16);
        C48009v0.Ax0().mo73040Ow(this.f121467y);
        boolean z = this.f121465w;
        if (z) {
            C48009v0.Dx0().mo73029mI(this.f121467y.field_bizChatLocalId);
        } else if (!z) {
            C48009v0.Dx0().mo73030mL(this.f121467y.field_bizChatLocalId);
        }
        SharedPreferences.Editor edit = this.f121456n.edit();
        C48329b Dx0 = C48009v0.Dx0();
        edit.putBoolean("room_placed_to_the_top", Dx0.mo73026bF(Dx0.mo73024Yt(this.f121467y.field_bizChatLocalId))).commit();
        mo70006M7();
        mo70004K7();
        mo70005L7();
        mo70008O7();
        C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.i5r), 0).show();
    }

    /* renamed from: I7 */
    public final void mo70002I7(boolean z, int i) {
        C48334c cVar = this.f121467y;
        int i2 = cVar.field_bitFlag;
        this.f121466x = i2;
        this.f121459q = cVar.field_chatName;
        if (this.f121462t) {
            if (z) {
                cVar.field_bitFlag = i2 | i;
            } else {
                cVar.field_bitFlag = (~i) & i2;
            }
            Log.m105925i("MicroMsg.BizChatroomInfoUI", "dealSetMute:bitFlag %s", Integer.valueOf(cVar.field_bitFlag));
            C48009v0.Ax0().mo73040Ow(this.f121467y);
        } else {
            if (z) {
                C48353j jVar = this.f121468z;
                jVar.field_bitFlag = i | jVar.field_bitFlag;
            } else {
                C48353j jVar2 = this.f121468z;
                jVar2.field_bitFlag = (~i) & jVar2.field_bitFlag;
            }
            C48009v0.Bx0().mo73075Lo(this.f121468z);
            this.f121467y.field_bitFlag = this.f121468z.field_bitFlag;
            C48009v0.Ax0().mo73040Ow(this.f121467y);
        }
        C51960xe xeVar = new C51960xe();
        C48334c cVar2 = this.f121467y;
        xeVar.f144611d = cVar2.field_bizChatServId;
        xeVar.f144616i = cVar2.field_bitFlag;
        C48009v0.yx0().mo73067m(this.f121467y.field_brandUserName, xeVar, this);
    }

    /* renamed from: J7 */
    public final void mo70003J7(C48702af afVar, C48702af afVar2) {
        Log.m105924i("MicroMsg.BizChatroomInfoUI", "updateBizChatMemberList()");
        String string = getString(afVar == null ? C0966R.string.i64 : C0966R.string.f7411fj);
        C48349h yx02 = C48009v0.yx0();
        C48334c cVar = this.f121467y;
        String str = cVar.field_brandUserName;
        String str2 = cVar.field_bizChatServId;
        yx02.getClass();
        C48368x xVar = new C48368x(str, str2, afVar, afVar2, this);
        C86709a0.m107529k().f251779b.mo123460f(xVar);
        this.f121449d = C76879j.m92723Q(this, getString(C0966R.string.a3h), string, true, true, new C44747c(this, xVar));
    }

    /* renamed from: K7 */
    public final void mo70004K7() {
        if (this.f121456n == null) {
            this.f121456n = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (this.f121462t) {
            this.f121463u = this.f121467y.mo73033l2(1);
            this.f121466x = this.f121467y.field_bitFlag;
        } else {
            this.f121463u = this.f121468z.mo73073l2(1);
            this.f121466x = this.f121468z.field_bitFlag;
        }
        if (this.f121463u) {
            setTitleMuteIconVisibility(0);
            if (this.f121453h != null) {
                this.f121456n.edit().putBoolean("room_notify_new_msg", true).commit();
            }
        } else {
            setTitleMuteIconVisibility(8);
            if (this.f121453h != null) {
                this.f121456n.edit().putBoolean("room_notify_new_msg", false).commit();
            }
        }
        this.f121450e.notifyDataSetChanged();
    }

    /* renamed from: L7 */
    public final void mo70005L7() {
        Log.m105918d("MicroMsg.BizChatroomInfoUI", "updatePlaceTop()");
        if (this.f121456n == null) {
            this.f121456n = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (this.f121462t) {
            this.f121465w = this.f121467y.mo73033l2(16);
            this.f121466x = this.f121467y.field_bitFlag;
        } else {
            this.f121465w = this.f121468z.mo73073l2(16);
            this.f121466x = this.f121468z.field_bitFlag;
        }
        if (this.f121454i != null) {
            this.f121456n.edit().putBoolean("room_placed_to_the_top", this.f121465w).commit();
        }
        this.f121450e.notifyDataSetChanged();
    }

    /* renamed from: M7 */
    public final void mo70006M7() {
        if (this.f121451f != null) {
            if (!Util.isNullOrNil(this.f121462t ? this.f121467y.field_chatName : this.f121468z.field_userName)) {
                String str = this.f121467y.field_chatName;
                if (str != null && str.length() > 50) {
                    str = str.substring(0, 32);
                }
                Log.m105925i("MicroMsg.BizChatroomInfoUI", "updateRoomName chatName:%s", str);
                SignaturePreference signaturePreference = this.f121451f;
                C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                if (str == null || str.length() <= 0) {
                    str = getString(C0966R.string.iyt);
                }
                signaturePreference.mo7741E(hVar.mo107057T1(this, str));
                return;
            }
            this.f121451f.mo7741E(getString(C0966R.string.i6y));
        }
    }

    /* renamed from: N7 */
    public final void mo70007N7() {
        List<String> list;
        if (this.f121452g != null) {
            if (this.f121462t) {
                long j = this.f121458p;
                String str = C48340e.f129426a;
                list = C48009v0.Ax0().mo73042a0(j).mo73036o2();
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(this.f121467y.field_bizChatServId);
                list = linkedList;
            }
            if (list != null) {
                this.f121461s = list.size();
            } else {
                this.f121461s = 0;
            }
            if (this.f121461s <= 1) {
                ContactListExpandPreference contactListExpandPreference = this.f121452g;
                contactListExpandPreference.mo100304N(true);
                contactListExpandPreference.mo100305P(false);
            } else {
                ContactListExpandPreference contactListExpandPreference2 = this.f121452g;
                contactListExpandPreference2.mo100304N(true);
                contactListExpandPreference2.mo100305P(this.f121460r);
            }
            C47969h hVar = this.f121444C;
            if (hVar != null && hVar.field_hide_mod_chat_member) {
                ContactListExpandPreference contactListExpandPreference3 = this.f121452g;
                contactListExpandPreference3.mo100304N(false);
                contactListExpandPreference3.mo100305P(false);
            }
            this.f121452g.mo100301K(this.f121457o, list);
        }
    }

    /* renamed from: O7 */
    public final void mo70008O7() {
        Log.m105918d("MicroMsg.BizChatroomInfoUI", "updateSaveToContact()");
        if (this.f121456n == null) {
            this.f121456n = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (this.f121462t) {
            this.f121464v = this.f121467y.mo73033l2(8);
            this.f121466x = this.f121467y.field_bitFlag;
        } else {
            this.f121464v = this.f121468z.mo73073l2(8);
            this.f121466x = this.f121468z.field_bitFlag;
        }
        if (this.f121464v) {
            if (this.f121455j != null) {
                this.f121456n.edit().putBoolean("room_save_to_contact", true).commit();
            }
        } else if (this.f121455j != null) {
            this.f121456n.edit().putBoolean("room_save_to_contact", false).commit();
        }
        this.f121450e.notifyDataSetChanged();
    }

    /* renamed from: P7 */
    public final void mo70009P7() {
        if (this.f121462t) {
            int i = C48340e.m53668i(this.f121458p);
            this.f121461s = i;
            if (i == 0) {
                setMMTitle(getString(C0966R.string.i_8));
                return;
            }
            setMMTitle(getString(C0966R.string.eyf, new Object[]{getString(C0966R.string.i_8), Integer.valueOf(this.f121461s)}));
            return;
        }
        setMMTitle(getString(C0966R.string.i_8));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r12 = r12.f127055a.f127080a;
     */
    /* renamed from: c7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7311c7(int r11, ob0.C117747y r12) {
        /*
            r10 = this;
            android.app.ProgressDialog r0 = r10.f121449d
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r0.dismiss()
            r10.f121449d = r1
        L_0x000a:
            int r0 = r12.getType()
            r2 = 1355(0x54b, float:1.899E-42)
            if (r0 != r2) goto L_0x00d4
            sb0.n r12 = (sb0.C48359n) r12
            te3.x00 r11 = r12.mo73080j1()
            ob0.c r12 = r12.f129464e
            if (r12 == 0) goto L_0x0025
            ob0.c$c r12 = r12.f127055a
            pe3.a r12 = r12.f127080a
            if (r12 == 0) goto L_0x0025
            te3.w00 r12 = (te3.C51762w00) r12
            goto L_0x0026
        L_0x0025:
            r12 = r1
        L_0x0026:
            sb0.d r0 = rb0.C48009v0.Ax0()
            te3.vq1 r11 = r11.f144378e
            te3.xe r11 = r11.f143623d
            java.lang.String r11 = r11.f144611d
            sb0.c r11 = r0.mo73039Lo(r11)
            r0 = 0
            if (r11 != 0) goto L_0x004a
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12 = 2131834918(0x7f113826, float:1.930296E38)
            java.lang.String r12 = r10.getString(r12)
            android.widget.Toast r11 = p910lj.C76701a.makeText((android.content.Context) r11, (java.lang.CharSequence) r12, (int) r0)
            r11.show()
            return
        L_0x004a:
            int r2 = r10.f121443B
            r3 = 2
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r5 = 1
            if (r2 != r3) goto L_0x0074
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.addFlags(r4)
            java.lang.String r2 = "biz_chat_need_to_jump_to_chatting_ui"
            r0.putExtra(r2, r5)
            java.lang.String r12 = r12.f143792d
            java.lang.String r2 = "Contact_User"
            r0.putExtra(r2, r12)
            long r11 = r11.field_bizChatLocalId
            java.lang.String r2 = "biz_chat_chat_id"
            r0.putExtra(r2, r11)
            java.lang.String r11 = ".ui.bizchat.BizChatConversationUI"
            ke3.C88144b.m109801s(r10, r11, r0, r1)
            goto L_0x0101
        L_0x0074:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.addFlags(r4)
            java.lang.String r12 = r12.f143792d
            java.lang.String r2 = "Chat_User"
            r1.putExtra(r2, r12)
            long r11 = r11.field_bizChatLocalId
            java.lang.String r2 = "key_biz_chat_id"
            r1.putExtra(r2, r11)
            java.lang.String r11 = "finish_direct"
            r1.putExtra(r11, r5)
            java.lang.String r11 = "key_need_send_video"
            r1.putExtra(r11, r0)
            java.lang.String r11 = "key_is_biz_chat"
            r1.putExtra(r11, r5)
            java.lang.Class<com.tencent.mm.ui.chatting.ChattingUI> r11 = com.tencent.p014mm.p136ui.chatting.ChattingUI.class
            r1.setClass(r10, r11)
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r1)
            java.lang.Object[] r3 = r11.mo10232b()
            java.lang.String r4 = "com/tencent/mm/ui/bizchat/BizChatroomInfoUI"
            java.lang.String r5 = "onBizChatSceneEnd"
            java.lang.String r6 = "(ILcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r2 = r10
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r11 = r11.mo10231a(r0)
            android.content.Intent r11 = (android.content.Intent) r11
            r10.startActivity(r11)
            java.lang.String r1 = "com/tencent/mm/ui/bizchat/BizChatroomInfoUI"
            java.lang.String r2 = "onBizChatSceneEnd"
            java.lang.String r3 = "(ILcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r10
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0101
        L_0x00d4:
            int r0 = r12.getType()
            r1 = 1356(0x54c, float:1.9E-42)
            if (r0 != r1) goto L_0x00e2
            if (r11 == 0) goto L_0x0101
            r10.mo70001H7()
            goto L_0x0101
        L_0x00e2:
            int r12 = r12.getType()
            r0 = 1353(0x549, float:1.896E-42)
            if (r12 != r0) goto L_0x0101
            if (r11 < 0) goto L_0x0101
            sb0.j r11 = r10.f121468z
            if (r11 == 0) goto L_0x0101
            sb0.k r11 = rb0.C48009v0.Bx0()
            sb0.j r12 = r10.f121468z
            java.lang.String r12 = r12.field_userId
            sb0.j r11 = r11.get(r12)
            r10.f121468z = r11
            r10.onDataChanged()
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.bizchat.BizChatroomInfoUI.mo7311c7(int, ob0.y):void");
    }

    public C73244a createAdapter(SharedPreferences sharedPreferences) {
        return new C47510b(this, getListView(), sharedPreferences);
    }

    public int getResourceId() {
        return C0966R.xml.f8861n;
    }

    public void initView() {
        this.f121450e = getPreferenceScreen();
        C48334c cVar = this.f121467y;
        String str = cVar.field_ownerUserId;
        this.f121461s = cVar.mo73036o2().size();
        if (Util.isNullOrNil(str)) {
            this.f121460r = false;
        } else {
            this.f121460r = str.equals(C48009v0.Bx0().mo73076Pk(this.f121457o));
        }
        C52558c SE = C48009v0.Fx0().mo72757SE(this.f121457o);
        this.f121444C = C48009v0.Ex0().mo72749jo(SE.mo73498p2());
        Log.m105925i("MicroMsg.BizChatroomInfoUI", "getMainBrandAttr father %s", SE.mo73498p2());
        Log.m105918d("MicroMsg.BizChatroomInfoUI", "initBaseChatRoomView()");
        ContactListExpandPreference contactListExpandPreference = (ContactListExpandPreference) this.f121450e.mo72519a("roominfo_contact_anchor");
        this.f121452g = contactListExpandPreference;
        contactListExpandPreference.mo100302L(this.f121450e, contactListExpandPreference.f121285r);
        this.f121451f = (SignaturePreference) this.f121450e.mo72519a("room_name");
        this.f121453h = (CheckBoxPreference) this.f121450e.mo72519a("room_notify_new_msg");
        this.f121454i = (CheckBoxPreference) this.f121450e.mo72519a("room_placed_to_the_top");
        this.f121455j = (CheckBoxPreference) this.f121450e.mo72519a("room_save_to_contact");
        ContactListExpandPreference contactListExpandPreference2 = this.f121452g;
        boolean z = this.f121462t;
        C76803c cVar2 = contactListExpandPreference2.f211662K;
        if (cVar2 != null) {
            ((C72741a) cVar2).f211670g.f230148o = z;
        }
        boolean z2 = this.f121460r;
        if (cVar2 != null) {
            ((C72741a) cVar2).f211670g.f230147n = z2;
        }
        if (z2) {
            contactListExpandPreference2.mo100304N(true);
            contactListExpandPreference2.mo100305P(true);
        } else {
            contactListExpandPreference2.mo100304N(true);
            contactListExpandPreference2.mo100305P(false);
        }
        C47969h hVar = this.f121444C;
        if (hVar != null && hVar.field_hide_mod_chat_member) {
            ContactListExpandPreference contactListExpandPreference3 = this.f121452g;
            contactListExpandPreference3.mo100304N(false);
            contactListExpandPreference3.mo100305P(false);
        }
        ContactListExpandPreference contactListExpandPreference4 = this.f121452g;
        String str2 = this.f121467y.field_ownerUserId;
        C76803c cVar3 = contactListExpandPreference4.f211662K;
        if (cVar3 != null) {
            ((C72741a) cVar3).f211670g.f230136C = str2;
        }
        if (cVar3 != null) {
            ((C72741a) cVar3).f211670g.getClass();
        }
        C76803c cVar4 = this.f121452g.f211662K;
        if (cVar4 != null) {
            ((C72741a) cVar4).f211668e = false;
        }
        if (!this.f121462t) {
            this.f121450e.mo72529n("room_save_to_contact", true);
            this.f121450e.mo72529n("room_name", true);
            this.f121450e.mo72529n("room_del_quit", true);
        }
        mo70008O7();
        mo70005L7();
        mo70004K7();
        if (this.f121452g != null) {
            getListView().setOnScrollListener(this.f121445D);
            ContactListExpandPreference contactListExpandPreference5 = this.f121452g;
            C78399i iVar = this.f121445D;
            C76803c cVar5 = contactListExpandPreference5.f211662K;
            if (cVar5 != null) {
                ((C72741a) cVar5).f211670g.f230154u = iVar;
            }
            contactListExpandPreference5.mo100307S(new C44748d());
        }
        setBackBtn(new C44749e());
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = -1
            if (r9 == r0) goto L_0x0007
            return
        L_0x0007:
            r9 = 1
            if (r8 == r9) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r8 = "result_data"
            android.os.Bundle r8 = r10.getBundleExtra(r8)
            r10 = 0
            if (r8 == 0) goto L_0x010e
            java.lang.String r0 = "MicroMsg.BizChatroomInfoUI"
            java.lang.String r1 = "bundle != null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r1 = "enterprise_members"
            java.lang.String r8 = r8.getString(r1)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r8
            java.lang.String r2 = "enterprise_members:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r1)
            boolean r1 = r7.f121462t
            r2 = 0
            if (r1 == 0) goto L_0x00c7
            if (r8 == 0) goto L_0x010e
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00b1 }
            r1.<init>(r8)     // Catch:{ JSONException -> 0x00b1 }
            te3.af r8 = new te3.af     // Catch:{ JSONException -> 0x00b1 }
            r8.<init>()     // Catch:{ JSONException -> 0x00b1 }
            r3 = 0
        L_0x003c:
            int r4 = r1.length()     // Catch:{ JSONException -> 0x00b1 }
            if (r3 >= r4) goto L_0x00ad
            org.json.JSONObject r4 = r1.getJSONObject(r3)     // Catch:{ JSONException -> 0x00b1 }
            java.lang.String r5 = "id"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ JSONException -> 0x00b1 }
            sb0.k r6 = rb0.C48009v0.Bx0()     // Catch:{ JSONException -> 0x00b1 }
            sb0.j r6 = r6.get(r5)     // Catch:{ JSONException -> 0x00b1 }
            if (r6 != 0) goto L_0x005d
            sb0.j r6 = new sb0.j     // Catch:{ JSONException -> 0x00b1 }
            r6.<init>()     // Catch:{ JSONException -> 0x00b1 }
            r6.field_userId = r5     // Catch:{ JSONException -> 0x00b1 }
        L_0x005d:
            java.lang.String r5 = "nick_name"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ JSONException -> 0x00b1 }
            r6.field_userName = r5     // Catch:{ JSONException -> 0x00b1 }
            java.lang.String r5 = r7.f121457o     // Catch:{ JSONException -> 0x00b1 }
            r6.field_brandUserName = r5     // Catch:{ JSONException -> 0x00b1 }
            java.lang.String r5 = "head_img_url"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ JSONException -> 0x00b1 }
            r6.field_headImageUrl = r5     // Catch:{ JSONException -> 0x00b1 }
            java.lang.String r5 = "profile_url"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ JSONException -> 0x00b1 }
            r6.field_profileUrl = r5     // Catch:{ JSONException -> 0x00b1 }
            java.lang.String r5 = "ver"
            int r4 = r4.getInt(r5)     // Catch:{ JSONException -> 0x00b1 }
            r6.field_UserVersion = r4     // Catch:{ JSONException -> 0x00b1 }
            sb0.j r4 = r7.f121442A     // Catch:{ JSONException -> 0x00b1 }
            if (r4 == 0) goto L_0x0088
            java.lang.String r4 = r4.field_addMemberUrl     // Catch:{ JSONException -> 0x00b1 }
            goto L_0x0089
        L_0x0088:
            r4 = r2
        L_0x0089:
            r6.field_addMemberUrl = r4     // Catch:{ JSONException -> 0x00b1 }
            sb0.k r4 = rb0.C48009v0.Bx0()     // Catch:{ JSONException -> 0x00b1 }
            boolean r4 = r4.mo73075Lo(r6)     // Catch:{ JSONException -> 0x00b1 }
            if (r4 != 0) goto L_0x009c
            sb0.k r4 = rb0.C48009v0.Bx0()     // Catch:{ JSONException -> 0x00b1 }
            r4.insert(r6)     // Catch:{ JSONException -> 0x00b1 }
        L_0x009c:
            te3.ze r4 = new te3.ze     // Catch:{ JSONException -> 0x00b1 }
            r4.<init>()     // Catch:{ JSONException -> 0x00b1 }
            java.lang.String r5 = r6.field_userId     // Catch:{ JSONException -> 0x00b1 }
            r4.f145847d = r5     // Catch:{ JSONException -> 0x00b1 }
            java.util.LinkedList<te3.ze> r5 = r8.f130476d     // Catch:{ JSONException -> 0x00b1 }
            r5.add(r4)     // Catch:{ JSONException -> 0x00b1 }
            int r3 = r3 + 1
            goto L_0x003c
        L_0x00ad:
            r7.mo70003J7(r8, r2)     // Catch:{ JSONException -> 0x00b1 }
            goto L_0x010f
        L_0x00b1:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r1 = r8.getMessage()
            r9[r10] = r1
            java.lang.String r1 = "parse memberJson Exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r9)
            java.lang.Object[] r9 = new java.lang.Object[r10]
            java.lang.String r1 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r8, r1, r9)
            goto L_0x010e
        L_0x00c7:
            te3.vq1 r0 = new te3.vq1
            r0.<init>()
            sb0.c r1 = new sb0.c
            r1.<init>()
            sb0.j r3 = r7.f121442A
            if (r3 == 0) goto L_0x00d7
            java.lang.String r2 = r3.field_addMemberUrl
        L_0x00d7:
            r1.field_addMemberUrl = r2
            java.lang.String r2 = r7.f121457o
            r1.field_brandUserName = r2
            sb0.j r2 = r7.f121468z
            java.lang.String r2 = r2.field_userId
            boolean r8 = sb0.C48340e.m53660a(r1, r8, r2, r0)
            if (r8 == 0) goto L_0x010e
            sb0.h r8 = rb0.C48009v0.yx0()
            java.lang.String r1 = r7.f121457o
            sb0.n r8 = r8.mo73058e(r1, r0, r7)
            r0 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r2 = r7.getString(r0)
            r0 = 2131820761(0x7f1100d9, float:1.9274246E38)
            java.lang.String r3 = r7.getString(r0)
            r4 = 1
            r5 = 1
            sj3.x r6 = new sj3.x
            r6.<init>(r7, r8)
            r1 = r7
            qo3.i0 r8 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            r7.f121449d = r8
            goto L_0x010f
        L_0x010e:
            r9 = 0
        L_0x010f:
            if (r9 != 0) goto L_0x011f
            r8 = 2131834918(0x7f113826, float:1.930296E38)
            java.lang.String r8 = r7.getString(r8)
            android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r7, (java.lang.CharSequence) r8, (int) r10)
            r8.show()
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.bizchat.BizChatroomInfoUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C48335d Ax0 = C48009v0.Ax0();
        Ax0.f129418e.add(this.f121448G, Looper.getMainLooper());
        this.f121443B = getIntent().getIntExtra("key_biz_chat_info_from_scene", -1);
        this.f121457o = getIntent().getStringExtra("Chat_User");
        this.f121458p = getIntent().getLongExtra("key_biz_chat_id", -1);
        C48334c a0 = C48009v0.Ax0().mo73042a0(this.f121458p);
        this.f121467y = a0;
        this.f121459q = a0.field_chatName;
        boolean p = C48340e.m53675p(a0.field_bizChatServId);
        this.f121462t = p;
        if (!p) {
            this.f121468z = C48009v0.Bx0().get(this.f121467y.field_bizChatServId);
        }
        C48354k Bx0 = C48009v0.Bx0();
        String str = this.f121457o;
        C48353j jVar = null;
        if (str == null) {
            Bx0.getClass();
            Log.m105924i("MicroMsg.BizChatUserInfoStorage", "getMyUserInfo brandUserName is null");
        } else {
            String Pk = Bx0.mo73076Pk(str);
            if (Pk == null) {
                Log.m105924i("MicroMsg.BizChatUserInfoStorage", "getMyUserInfo myUserIdString is null");
            } else {
                jVar = Bx0.get(Pk);
            }
        }
        this.f121442A = jVar;
        initView();
        C48334c cVar = this.f121467y;
        if (cVar != null && cVar.field_bizChatServId != null && this.f121457o != null) {
            if (cVar.mo73037p2()) {
                C48349h yx02 = C48009v0.yx0();
                String str2 = this.f121467y.field_bizChatServId;
                String str3 = this.f121457o;
                yx02.getClass();
                C86709a0.m107529k().f251779b.mo123460f(new C48360o(str2, str3, true));
                return;
            }
            C48009v0.yx0().mo73063i(this.f121467y.field_bizChatServId, this.f121457o, this);
        }
    }

    public final void onDataChanged() {
        if (this.f121452g != null) {
            mo70006M7();
            mo70009P7();
            mo70004K7();
            mo70007N7();
            mo70008O7();
            mo70005L7();
            this.f121452g.mo69931v();
        }
        this.f121450e.notifyDataSetChanged();
    }

    public void onDestroy() {
        C53534a.m60079b();
        C53534a.m60079b();
        C48335d Ax0 = C48009v0.Ax0();
        C48335d.C48337b bVar = this.f121448G;
        MStorageEvent<C48335d.C48337b, C48335d.C48337b.C48339b> mStorageEvent = Ax0.f129418e;
        if (mStorageEvent != null) {
            mStorageEvent.remove(bVar);
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        String str2 = "";
        if (str.equals("room_name")) {
            if (!Util.isNullOrNil(this.f121462t ? this.f121467y.field_chatName : this.f121468z.field_userName)) {
                str2 = this.f121467y.field_chatName;
            }
            String str3 = str2;
            C76879j.m92720N(getContext(), getString(C0966R.string.i7u), str3, "", 32, new C48413y(this, str3));
            return false;
        } else if (str.equals("room_notify_new_msg")) {
            boolean z = !this.f121463u;
            this.f121463u = z;
            mo70002I7(z, 1);
            mo70004K7();
            return false;
        } else if (str.equals("room_placed_to_the_top")) {
            boolean z2 = !this.f121465w;
            this.f121465w = z2;
            mo70002I7(z2, 16);
            if (this.f121465w) {
                C48009v0.Dx0().mo73029mI(this.f121467y.field_bizChatLocalId);
                return false;
            }
            C48009v0.Dx0().mo73030mL(this.f121467y.field_bizChatLocalId);
            return false;
        } else if (str.equals("room_del_quit")) {
            Log.m105918d("MicroMsg.BizChatroomInfoUI", " quit " + this.f121458p);
            C76879j.m92750u(getContext(), getString(C0966R.string.bxy), str2, new C48414z(this), (DialogInterface.OnClickListener) null);
            return false;
        } else if (!str.equals("room_save_to_contact")) {
            return false;
        } else {
            boolean z3 = !this.f121464v;
            this.f121464v = z3;
            mo70002I7(z3, 8);
            mo70008O7();
            return false;
        }
    }

    public void onResume() {
        mo70006M7();
        mo70009P7();
        mo70004K7();
        mo70005L7();
        mo70008O7();
        mo70007N7();
        this.f121450e.notifyDataSetChanged();
        super.onResume();
        if (!this.f121446E) {
            String stringExtra = getIntent().getStringExtra("need_matte_high_light_item");
            if (!Util.isNullOrNil(stringExtra)) {
                int g = this.f121450e.mo72523g(stringExtra);
                setSelection(g - 3);
                new MMHandler().postDelayed(new C48411w(this, g), 10);
            }
            this.f121446E = true;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar == null) {
            Log.m105921e("MicroMsg.BizChatroomInfoUI", "onSceneEnd: [%d], [%d], [%s], scene is null", Integer.valueOf(i), Integer.valueOf(i2), str);
            return;
        }
        Log.m105925i("MicroMsg.BizChatroomInfoUI", "onSceneEnd: [%d], [%d], [%s], sceneType[%d]", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
        this.f121461s = C48340e.m53668i(this.f121458p);
        Log.m105918d("MicroMsg.BizChatroomInfoUI", "now is " + this.f121461s);
        ProgressDialog progressDialog = this.f121449d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        C7660a a = C7660a.m7782a(str);
        if (a != null) {
            a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
        } else if (i == 0 && i2 == 0) {
            yVar.getType();
        } else {
            Log.m105928w("MicroMsg.BizChatroomInfoUI", "willen onSceneEnd err:Network not ok");
            mo70001H7();
        }
    }
}
