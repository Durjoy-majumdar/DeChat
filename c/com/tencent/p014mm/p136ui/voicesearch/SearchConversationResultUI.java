package com.tencent.p014mm.p136ui.voicesearch;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import eo3.C75630a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.voicesearch.SearchConversationResultUI */
public class SearchConversationResultUI extends MMActivity {

    /* renamed from: d */
    public ListView f220315d;

    /* renamed from: e */
    public C75630a f220316e;

    /* renamed from: f */
    public String f220317f;

    /* renamed from: g */
    public TextView f220318g;

    /* renamed from: com.tencent.mm.ui.voicesearch.SearchConversationResultUI$a */
    public class C74935a implements C6975i1.C6977b {
        public C74935a(SearchConversationResultUI searchConversationResultUI) {
        }

        /* renamed from: a */
        public void mo1327a(Object obj) {
        }

        /* renamed from: b */
        public void mo1328b(Object obj) {
        }
    }

    /* renamed from: com.tencent.mm.ui.voicesearch.SearchConversationResultUI$b */
    public class C74936b implements MenuItem.OnMenuItemClickListener {
        public C74936b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SearchConversationResultUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.voicesearch.SearchConversationResultUI$c */
    public class C74937c implements AdapterView.OnItemClickListener {
        public C74937c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = i;
            Class<ChattingUI> cls = ChattingUI.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (i2 < SearchConversationResultUI.this.f220315d.getHeaderViewsCount()) {
                C117292a.m165361g(this, "com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            int headerViewsCount = i2 - SearchConversationResultUI.this.f220315d.getHeaderViewsCount();
            C72976h2 h2Var = (C72976h2) SearchConversationResultUI.this.f220316e.getItem(headerViewsCount);
            if (h2Var == null) {
                Log.m105920e("MicroMsg.VoiceSearchResultUI", "null user at position = " + headerViewsCount);
                C117292a.m165361g(this, "com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            Log.m105918d("MicroMsg.VoiceSearchResultUI", "username " + h2Var.getUsername());
            if (C72996z1.m85838i5(h2Var.getUsername())) {
                if ((C75592q0.m90785o() & 2) == 0) {
                    C88144b.m109791i(SearchConversationResultUI.this.getContext(), "tmessage", ".ui.TConversationUI", new Intent().putExtra("finish_direct", true), (Bundle) null);
                } else {
                    C88144b.m109791i(SearchConversationResultUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", h2Var.getUsername()), (Bundle) null);
                }
            } else if (C72996z1.m85850u5(h2Var.getUsername())) {
                C88144b.m109791i(SearchConversationResultUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", h2Var.getUsername()), (Bundle) null);
            } else if (C72996z1.m85827Y4(h2Var.getUsername())) {
                C88144b.m109791i(SearchConversationResultUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", h2Var.getUsername()), (Bundle) null);
            } else if (C72996z1.m85851v5(h2Var.getUsername())) {
                MMAppMgr.m85983c(h2Var.getUsername());
                C88144b.m109791i(SearchConversationResultUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", h2Var.getUsername()), (Bundle) null);
            } else if (C72996z1.m85849t5(h2Var.getUsername())) {
                if ((C75592q0.m90785o() & 1) == 0) {
                    SearchConversationResultUI.this.startActivity(cls, new Intent().putExtra("Chat_User", h2Var.getUsername()).putExtra("finish_direct", true));
                } else {
                    C88144b.m109791i(SearchConversationResultUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", h2Var.getUsername()), (Bundle) null);
                }
            } else if (C72996z1.m85853x5(h2Var.getUsername())) {
                if (C75592q0.m90758F()) {
                    Intent intent = new Intent();
                    intent.putExtra("type", 20);
                    C88144b.m109791i(SearchConversationResultUI.this, "readerapp", ".ui.ReaderAppUI", intent, (Bundle) null);
                } else {
                    C88144b.m109791i(SearchConversationResultUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", h2Var.getUsername()), (Bundle) null);
                }
            } else if (C72996z1.m85854y5(h2Var.getUsername())) {
                if (C75592q0.m90759G()) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("type", 11);
                    C88144b.m109791i(SearchConversationResultUI.this, "readerapp", ".ui.ReaderAppUI", intent2, (Bundle) null);
                } else {
                    C88144b.m109791i(SearchConversationResultUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", h2Var.getUsername()), (Bundle) null);
                }
            } else if (C72996z1.m85815R4(h2Var.getUsername())) {
                C88144b.m109791i(SearchConversationResultUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", h2Var.getUsername()), (Bundle) null);
            } else if (C72996z1.m85836g5(h2Var.getUsername())) {
                if (C75592q0.m90756D()) {
                    C88144b.m109791i(SearchConversationResultUI.this, "masssend", ".ui.MassSendHistoryUI", new Intent().putExtra("finish_direct", true), (Bundle) null);
                } else {
                    C88144b.m109791i(SearchConversationResultUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", h2Var.getUsername()), (Bundle) null);
                }
            } else if (C72996z1.m85837h5(h2Var.getUsername())) {
                if ((C75592q0.m90785o() & 16) == 0) {
                    SearchConversationResultUI.this.startActivity(cls, new Intent().putExtra("Chat_User", h2Var.getUsername()).putExtra("finish_direct", true));
                } else {
                    C88144b.m109791i(SearchConversationResultUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", h2Var.getUsername()), (Bundle) null);
                }
            } else {
                if (!C72996z1.m85834e5(SearchConversationResultUI.this.f220317f) && !C72996z1.m85794B5(SearchConversationResultUI.this.f220317f)) {
                    String str = SearchConversationResultUI.this.f220317f;
                    if (!(str != null && str.equalsIgnoreCase("feedsapp"))) {
                        String str2 = SearchConversationResultUI.this.f220317f;
                        if (!(str2 != null && str2.equalsIgnoreCase("voipapp"))) {
                            String str3 = SearchConversationResultUI.this.f220317f;
                            if (!(str3 != null && str3.equalsIgnoreCase("voicevoipapp")) && !C72996z1.m85830a5(SearchConversationResultUI.this.f220317f)) {
                                String str4 = SearchConversationResultUI.this.f220317f;
                                if (!(str4 != null && str4.equalsIgnoreCase("qqfriend"))) {
                                    SearchConversationResultUI.this.startActivity(cls, new Intent().putExtra("Chat_User", h2Var.getUsername()).putExtra("finish_direct", true));
                                }
                            }
                        }
                    }
                }
                C88144b.m109791i(SearchConversationResultUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", h2Var.getUsername()), (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/voicesearch/SearchConversationResultUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ccq;
    }

    public void initView() {
        this.f220315d = (ListView) findViewById(C0966R.C0970id.lbk);
        this.f220318g = (TextView) findViewById(C0966R.C0970id.cjj);
        C75630a aVar = new C75630a(getApplicationContext(), new C74935a(this));
        this.f220316e = aVar;
        aVar.f222184o = new LinkedList();
        aVar.onNotifyChange((String) null, (MStorageEventData) null);
        this.f220315d.setAdapter(this.f220316e);
        this.f220318g.setVisibility(8);
        this.f220317f = getIntent().getStringExtra("SearchConversationResult_User");
        getIntent().getStringExtra("SearchConversationResult_Error");
        setMMTitle(getString(C0966R.string.kdw));
        setBackBtn(new C74936b());
        this.f220315d.setOnItemClickListener(new C74937c());
        String str = this.f220317f;
        this.f220318g.setVisibility(8);
        C75630a aVar2 = this.f220316e;
        if (aVar2 != null) {
            aVar2.f222188s = str;
            aVar2.mo5580b();
            aVar2.mo1333o();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f220316e.mo5580b();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }
}
