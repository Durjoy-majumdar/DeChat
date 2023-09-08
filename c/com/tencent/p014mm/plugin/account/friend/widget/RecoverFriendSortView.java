package com.tencent.p014mm.plugin.account.friend.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.import_old_account_contactsStruct;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.base.sortview.BaseSortView;
import com.tencent.p014mm.p136ui.base.sortview.C44721b;
import com.tencent.p014mm.plugin.account.friend.model.C68397a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import ke3.C88144b;
import nj3.C76879j;
import p011cm.C39989b;
import p196ln.C76705f;
import p629ny.C76979h;
import qj3.C47864f;
import wd3.C78543a;

/* renamed from: com.tencent.mm.plugin.account.friend.widget.RecoverFriendSortView */
public class RecoverFriendSortView extends BaseSortView {

    /* renamed from: s */
    public String f196618s;

    /* renamed from: com.tencent.mm.plugin.account.friend.widget.RecoverFriendSortView$a */
    public class C68429a implements C44721b.C44723b {

        /* renamed from: com.tencent.mm.plugin.account.friend.widget.RecoverFriendSortView$a$a */
        public class C68430a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C68433b f196620d;

            /* renamed from: com.tencent.mm.plugin.account.friend.widget.RecoverFriendSortView$a$a$a */
            public class C68431a implements C39989b.C0705b {
                public C68431a() {
                }

                /* renamed from: a */
                public void mo677a(boolean z, boolean z2, String str, String str2) {
                    Class cls = C75700k0.class;
                    Log.m105925i("MicroMsg.RecoverFriendSortView", "canAddContact %s,%s", str, Boolean.valueOf(z));
                    if (z) {
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(C68430a.this.f196620d.f196630g.f196538a.field_encryptUsername);
                        if (((int) z1Var.f108320R1) == 0) {
                            if (!Util.isNullOrNil(str)) {
                                z1Var.setUsername(str);
                            } else {
                                z1Var.setUsername(C68430a.this.f196620d.f196630g.f196538a.field_encryptUsername);
                            }
                            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69667P3(z1Var);
                            z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(z1Var.getUsername());
                        }
                        if (((int) z1Var.f108320R1) <= 0) {
                            Log.m105920e("MicroMsg.RecoverFriendSortView", "addContact : insert contact failed");
                            return;
                        }
                        C45628s0.m50775g0(z1Var);
                        C76879j.m92726T(RecoverFriendSortView.this.getContext(), RecoverFriendSortView.this.getContext().getString(C0966R.string.f7568jx));
                        C68397a.m80737c(C68430a.this.f196620d.f196630g.f196538a.field_encryptUsername, 0);
                        C44721b bVar = RecoverFriendSortView.this.f121300g;
                        bVar.mo69954b(bVar.f121310d);
                    } else if (z2) {
                        C68397a.m80737c(C68430a.this.f196620d.f196630g.f196538a.field_encryptUsername, 1);
                        C44721b bVar2 = RecoverFriendSortView.this.f121300g;
                        bVar2.mo69954b(bVar2.f121310d);
                    }
                }
            }

            /* renamed from: com.tencent.mm.plugin.account.friend.widget.RecoverFriendSortView$a$a$b */
            public class C68432b implements C39989b.C0706c {
                public C68432b() {
                }

                /* renamed from: a */
                public boolean mo678a(String str, String str2, String str3, int i, String str4) {
                    Class cls = C32735h.class;
                    Intent intent = new Intent();
                    intent.putExtra("Contact_User", C68430a.this.f196620d.f196630g.f196538a.field_encryptUsername);
                    intent.putExtra("Contact_Nick", C68430a.this.f196620d.f196630g.f196538a.field_nickname);
                    intent.putExtra("Contact_Scene", 17);
                    intent.putExtra("sayhi_with_sns_perm_send_verify", true);
                    intent.putExtra("sayhi_with_sns_perm_add_remark", true);
                    intent.putExtra("sayhi_with_sns_perm_set_label", false);
                    intent.putExtra("AntispamTicket", C68430a.this.f196620d.f196630g.f196538a.field_ticket);
                    intent.putExtra("sayhi_verify_add_errcode", i);
                    int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_set_default_chatonly, 2);
                    C88144b.m109791i(RecoverFriendSortView.this.getContext(), Scopes.PROFILE, (C72996z1.m85843n5(C68430a.this.f196620d.f196630g.f196538a.field_encryptUsername) || Qe != 1) ? (C72996z1.m85843n5(C68430a.this.f196620d.f196630g.f196538a.field_encryptUsername) || Qe != 2 || C45628s0.m50780j() < ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2", intent, (Bundle) null);
                    return true;
                }
            }

            public C68430a(C68433b bVar) {
                this.f196620d = bVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/account/friend/widget/RecoverFriendSortView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                import_old_account_contactsStruct import_old_account_contactsstruct = new import_old_account_contactsStruct();
                import_old_account_contactsstruct.f108034d = 4;
                import_old_account_contactsstruct.f108036f = import_old_account_contactsstruct.mo86045b("newaccountusername", C75592q0.m90772b(), true);
                import_old_account_contactsstruct.f108035e = import_old_account_contactsstruct.mo86045b("oldaccountusername", RecoverFriendSortView.this.f196618s, true);
                import_old_account_contactsstruct.f108037g = import_old_account_contactsstruct.mo86045b("friendusername", this.f196620d.f196630g.f196538a.field_encryptUsername, true);
                import_old_account_contactsstruct.mo86054n();
                C78543a aVar = (C78543a) ((C39989b) C86312j.m106911c(C39989b.class)).mo62454mg(RecoverFriendSortView.this.getContext(), new C68431a());
                aVar.mo108509l(this.f196620d.f196630g.f196538a.field_ticket);
                LinkedList linkedList = new LinkedList();
                linkedList.add(17);
                aVar.f230036e = new C68432b();
                aVar.mo108501b(this.f196620d.f196630g.f196538a.field_encryptUsername, linkedList, false, "");
                C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/widget/RecoverFriendSortView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C68429a() {
        }

        /* renamed from: a */
        public View mo63508a(C47864f fVar, View view, ViewGroup viewGroup, int i, int i2, boolean z, boolean z2) {
            C68433b bVar;
            Class cls = C76979h.class;
            if (view == null) {
                view = View.inflate(RecoverFriendSortView.this.getContext(), C0966R.C0971layout.bqu, (ViewGroup) null);
                bVar = new C68433b(RecoverFriendSortView.this);
                bVar.f196624a = (ImageView) view.findViewById(C0966R.C0970id.eez);
                bVar.f196625b = (TextView) view.findViewById(C0966R.C0970id.efl);
                bVar.f196626c = (TextView) view.findViewById(C0966R.C0970id.ay5);
                bVar.f196627d = (TextView) view.findViewById(C0966R.C0970id.efj);
                bVar.f196628e = (TextView) view.findViewById(C0966R.C0970id.f5598jf);
                bVar.f196629f = (Button) view.findViewById(C0966R.C0970id.f5585j3);
            } else {
                bVar = (C68433b) view.getTag();
            }
            C68397a.C68398a aVar = (C68397a.C68398a) fVar.f128466b;
            bVar.f196630g = aVar;
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(bVar.f196624a, aVar.f196538a.field_encryptUsername);
            bVar.f196625b.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(view.getContext(), aVar.f196538a.field_nickname));
            C72985m3 m3Var = aVar.f196539b;
            if (m3Var == null || Util.isNullOrNil(m3Var.field_msgContent)) {
                bVar.f196627d.setVisibility(8);
            } else {
                bVar.f196627d.setVisibility(0);
                bVar.f196625b.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(view.getContext(), aVar.f196539b.field_msgContent));
            }
            if (!RecoverFriendSortView.this.f121306p || !z) {
                bVar.f196626c.setVisibility(8);
            } else {
                bVar.f196626c.setText(fVar.f128465a);
                bVar.f196626c.setVisibility(0);
            }
            if ((!Util.isNullOrNil(aVar.f196538a.field_encryptUsername) && C45628s0.m50740E(aVar.f196538a.field_encryptUsername)) || (!Util.isNullOrNil(aVar.f196538a.field_username) && C45628s0.m50740E(aVar.f196538a.field_username))) {
                bVar.f196628e.setVisibility(0);
                bVar.f196628e.setText(C0966R.string.f7568jx);
                bVar.f196629f.setVisibility(8);
            } else if (aVar.f196538a.field_addState == 1) {
                bVar.f196628e.setVisibility(0);
                bVar.f196628e.setText(C0966R.string.f2c);
                bVar.f196629f.setVisibility(8);
            } else {
                bVar.f196628e.setVisibility(8);
                bVar.f196629f.setVisibility(0);
                bVar.f196629f.setOnClickListener(new C68430a(bVar));
            }
            view.setTag(bVar);
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.widget.RecoverFriendSortView$b */
    public class C68433b {

        /* renamed from: a */
        public ImageView f196624a;

        /* renamed from: b */
        public TextView f196625b;

        /* renamed from: c */
        public TextView f196626c;

        /* renamed from: d */
        public TextView f196627d;

        /* renamed from: e */
        public TextView f196628e;

        /* renamed from: f */
        public Button f196629f;

        /* renamed from: g */
        public C68397a.C68398a f196630g;

        public C68433b(RecoverFriendSortView recoverFriendSortView) {
        }
    }

    public RecoverFriendSortView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public View mo63491b() {
        return View.inflate(getContext(), C0966R.C0971layout.bqw, this);
    }

    /* renamed from: c */
    public boolean mo63492c(String str, C47864f fVar) {
        return false;
    }

    public C44721b.C44723b getItemViewCreator() {
        return new C68429a();
    }

    public ListView getListView() {
        return (ListView) findViewById(C0966R.C0970id.fpc);
    }

    public View getNoResultView() {
        return findViewById(C0966R.C0970id.hgp);
    }

    public VerticalScrollBar getScrollBar() {
        return (VerticalScrollBar) findViewById(C0966R.C0970id.jy6);
    }
}
