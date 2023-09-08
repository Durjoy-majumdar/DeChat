package com.tencent.p014mm.p136ui.conversation;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.conversation.C74697k;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C30757l4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import k20.C9556a;
import p255vr.C65873e;

/* renamed from: com.tencent.mm.ui.conversation.ServiceNotifyConversationUI */
public class ServiceNotifyConversationUI extends MMActivity {

    /* renamed from: d */
    public TextView f121881d;

    /* renamed from: e */
    public ListView f121882e;

    /* renamed from: f */
    public C44935e f121883f;

    /* renamed from: g */
    public C72976h2 f121884g;

    /* renamed from: h */
    public String f121885h;

    /* renamed from: i */
    public String f121886i;

    /* renamed from: j */
    public String f121887j = "";

    /* renamed from: n */
    public C75875l.C75877b f121888n;

    /* renamed from: com.tencent.mm.ui.conversation.ServiceNotifyConversationUI$b */
    public class C6950b implements View.OnClickListener {
        public C6950b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("Search_Scene", 2);
            ((C65873e) C86312j.m106911c(C65873e.class)).mo89915LO(ServiceNotifyConversationUI.this.getContext(), ".ui.FTSServiceNotifyUI", intent);
            C115669n.INSTANCE.mo160131h(23903, 6, Long.valueOf(Util.nowSecond()), null, 0);
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ServiceNotifyConversationUI$a */
    public class C44932a implements C75875l.C75877b {
        public C44932a() {
        }

        /* renamed from: w5 */
        public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
            ArrayList<C72963f4> arrayList;
            C44935e eVar2;
            if (lVar != null && (arrayList = eVar.f123846c) != null) {
                Iterator<C72963f4> it = arrayList.iterator();
                while (it.hasNext()) {
                    C72963f4 next = it.next();
                    if (next != null && "notifymessage".equals(eVar.f123844a)) {
                        String Yt = ((C30757l4) C97625j3.m125812b().mo105875A()).mo57661Yt(next);
                        if (!Util.isNullOrNil(Yt) && (eVar2 = ServiceNotifyConversationUI.this.f121883f) != null) {
                            eVar2.onNotifyChange(Yt, (MStorageEventData) null);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ServiceNotifyConversationUI$c */
    public class C44933c implements C6975i1.C6977b {
        public C44933c() {
        }

        /* renamed from: a */
        public void mo1327a(Object obj) {
            ServiceNotifyConversationUI serviceNotifyConversationUI = ServiceNotifyConversationUI.this;
            if (serviceNotifyConversationUI.f121883f.getCount() <= 0) {
                serviceNotifyConversationUI.f121881d.setVisibility(0);
                serviceNotifyConversationUI.f121882e.setVisibility(8);
                return;
            }
            serviceNotifyConversationUI.f121881d.setVisibility(8);
            serviceNotifyConversationUI.f121882e.setVisibility(0);
        }

        /* renamed from: b */
        public void mo1328b(Object obj) {
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ServiceNotifyConversationUI$d */
    public class C44934d implements AdapterView.OnItemClickListener {
        public C44934d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            ServiceNotifyConversationUI serviceNotifyConversationUI = ServiceNotifyConversationUI.this;
            serviceNotifyConversationUI.f121884g = (C72976h2) serviceNotifyConversationUI.f121883f.getItem(i2);
            ServiceNotifyConversationUI serviceNotifyConversationUI2 = ServiceNotifyConversationUI.this;
            serviceNotifyConversationUI2.f121887j = serviceNotifyConversationUI2.f121884g.getUsername();
            C72976h2 h2Var = ServiceNotifyConversationUI.this.f121884g;
            if (h2Var == null) {
                Log.m105921e("MicroMsg.ServiceNotifyConversationUI", "user should not be null. position:%d, size:%d", Integer.valueOf(i), Integer.valueOf(ServiceNotifyConversationUI.this.f121883f.getCount()));
                ServiceNotifyConversationUI.this.f121883f.notifyDataSetChanged();
                C117292a.m165361g(this, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            Intent intent = new Intent(ServiceNotifyConversationUI.this, ChattingUI.class);
            intent.putExtra("Chat_User", Util.isNullOrNil(h2Var.mo108782C2()) ? h2Var.getUsername() : h2Var.mo108782C2());
            intent.putExtra("key_notify_message_real_username", h2Var.getUsername());
            intent.putExtra("finish_direct", true);
            intent.putExtra("biz_click_item_unread_count", ServiceNotifyConversationUI.this.f121884g.mo108786G2());
            intent.putExtra("biz_click_item_position", i2 + 1);
            intent.putExtra("KOpenArticleSceneFromScene", 92);
            intent.putExtra("specific_chat_from_scene", 6);
            ServiceNotifyConversationUI serviceNotifyConversationUI3 = ServiceNotifyConversationUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            ServiceNotifyConversationUI serviceNotifyConversationUI4 = serviceNotifyConversationUI3;
            C117292a.m165358d(serviceNotifyConversationUI4, aVar.mo10232b(), "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            serviceNotifyConversationUI3.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(serviceNotifyConversationUI4, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ServiceNotifyConversationUI.this.f121883f.getClass();
            C115669n.INSTANCE.mo160131h(21825, 5, h2Var.getUsername(), Long.valueOf(Util.nowSecond()), null, null, 0, 0, 0);
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ServiceNotifyConversationUI$e */
    public static class C44935e extends C74697k {

        /* renamed from: H */
        public Set<String> f121892H = new HashSet();

        public C44935e(Context context, String str, C6975i1.C6977b bVar) {
            super(context, bVar);
        }

        /* renamed from: D */
        public void mo70227D() {
            C44936f fVar;
            Cursor g = mo7992g();
            if (g != null) {
                if (g.isClosed() || !g.moveToFirst()) {
                    fVar = null;
                } else {
                    HashSet hashSet = new HashSet();
                    do {
                        int columnIndex = g.getColumnIndex("talker");
                        String string = columnIndex >= 0 ? g.getString(columnIndex) : null;
                        if (!Util.isNullOrNil(string)) {
                            hashSet.add(string);
                        }
                    } while (g.moveToNext());
                    fVar = new C44936f((C44932a) null);
                    if (!hashSet.isEmpty()) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (C72996z1.m85804J4(str)) {
                                fVar.f121893a++;
                            } else if (Util.nullAsNil(str).startsWith("gh_")) {
                                fVar.f121894b++;
                            } else {
                                fVar.f121895c++;
                            }
                        }
                    }
                }
                if (fVar != null) {
                    C115669n.INSTANCE.mo160131h(21825, 4, null, Long.valueOf(Util.nowSecond()), String.format(Locale.US, "%d:%d:%d", new Object[]{Integer.valueOf(fVar.f121894b), Integer.valueOf(fVar.f121893a), Integer.valueOf(fVar.f121895c)}), null, 0, 0, 0);
                }
            }
            super.mo70227D();
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            C74697k.C74703f fVar = (C74697k.C74703f) view2.getTag();
            if (fVar.f219645c.getText() == null) {
                return view2;
            }
            String charSequence = fVar.f219645c.getText().toString();
            String str = null;
            if (C72996z1.m85804J4(charSequence)) {
                WxaProfileAttributes b = C81661j.m100177b(charSequence, false);
                if (b != null) {
                    str = b.f239577f;
                }
            } else {
                str = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(charSequence);
            }
            if (!Util.nullAsNil(charSequence).equals(str)) {
                fVar.f219645c.setText((CharSequence) str);
            }
            return view2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1333o() {
            /*
                r4 = this;
                r4.mo5580b()
                eb0.c r0 = eb0.C97625j3.m125812b()
                u90.b r0 = r0.mo105875A()
                com.tencent.mm.storage.l4 r0 = (com.tencent.p014mm.storage.C30757l4) r0
                r0.getClass()
                r1 = 0
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f82707d     // Catch:{ Exception -> 0x001f }
                java.lang.String r2 = "SELECT talker,msgId,MAX(createTime) AS createTime,digest FROM NotifyMessageRecord WHERE talker IS NOT NULL AND LENGTH(talker) > 0 AND talker != 'notifymessage' GROUP BY talker ORDER BY createTime DESC"
                android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ Exception -> 0x001f }
                if (r0 == 0) goto L_0x0031
                r0.moveToFirst()     // Catch:{ Exception -> 0x001f }
                goto L_0x0032
            L_0x001f:
                r0 = move-exception
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = r0.toString()
                r2[r3] = r0
                java.lang.String r0 = "MicroMsg.NotifyMessageRecordStorage"
                java.lang.String r3 = "dz[getNotifyMsgConversationCursor] exception %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r3, r2)
            L_0x0031:
                r0 = r1
            L_0x0032:
                r4.mo7998r(r0)
                com.tencent.mm.ui.i1$b r0 = r4.f24699h
                if (r0 == 0) goto L_0x003c
                r0.mo1327a(r1)
            L_0x003c:
                r4.notifyDataSetChanged()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.ServiceNotifyConversationUI.C44935e.mo1333o():void");
        }

        /* renamed from: s */
        public C72976h2 mo1330d(C72976h2 h2Var, Cursor cursor) {
            if (h2Var == null) {
                h2Var = new C72976h2();
            }
            int columnIndex = cursor.getColumnIndex("talker");
            String str = null;
            h2Var.setUsername(columnIndex >= 0 ? cursor.getString(columnIndex) : null);
            int columnIndex2 = cursor.getColumnIndex("createTime");
            h2Var.mo108793N2(columnIndex2 >= 0 ? cursor.getLong(columnIndex2) : 0);
            int columnIndex3 = cursor.getColumnIndex("digest");
            if (columnIndex3 >= 0) {
                str = cursor.getString(columnIndex3);
            }
            h2Var.mo108794O2(str);
            h2Var.mo108807c3("notifymessage");
            h2Var.mo108808d(2);
            h2Var.mo108803Y2(1);
            h2Var.mo108812g3(0);
            h2Var.mo108806b3(Integer.toString(1));
            h2Var.mo108795P2("");
            return h2Var;
        }

        /* renamed from: x */
        public void mo70218x(C72976h2 h2Var, boolean z, int i, boolean z2) {
            if (!Util.isNullOrNil(h2Var.getUsername())) {
                ((HashSet) this.f121892H).add(h2Var.getUsername());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ServiceNotifyConversationUI$f */
    public static class C44936f {

        /* renamed from: a */
        public int f121893a;

        /* renamed from: b */
        public int f121894b;

        /* renamed from: c */
        public int f121895c;

        public C44936f(C44932a aVar) {
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bwp;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet();
        hashSet.add(C6970r2.class);
        return hashSet;
    }

    public void initView() {
        setMMTitle(this.f121886i);
        setBackBtn(new C6972t2(this));
        setTitleBarDoubleClickListener(new C45012u2(this));
        this.f121882e = (ListView) findViewById(C0966R.C0970id.kpr);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f357933cj2);
        this.f121881d = textView;
        textView.setText(C0966R.string.hch);
        ((MMEditText) findViewById(C0966R.C0970id.j_b)).setOnClickListener(new C6950b());
        this.f121883f = new C44935e(this, this.f121885h, new C44933c());
        this.f121882e.setAdapter(this.f121883f);
        this.f121882e.setOnItemClickListener(new C44934d());
        this.f121883f.getClass();
        this.f121883f.getClass();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = this.f121887j;
        if (str != null && !str.isEmpty()) {
            this.f121887j = "";
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C97625j3.m125811a()) {
            Log.m105920e("MicroMsg.ServiceNotifyConversationUI", "onCreate acc not ready!!!");
            finish();
            return;
        }
        this.f121885h = "notifymessage";
        String stringExtra = getIntent().getStringExtra("enterprise_biz_display_name");
        this.f121886i = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            this.f121886i = getString(C0966R.string.f360873fi2);
        }
        initView();
        removeAllOptionMenu();
        addIconOptionMenu(0, (int) C0966R.string.f7375ef, (int) C0966R.raw.actionbar_setting_icon, false, (MenuItem.OnMenuItemClickListener) new C6971s2(this));
        C97625j3.m125812b().mo105908w().add(this.f121883f);
        this.f121888n = new C44932a();
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101137qq(this.f121888n, Looper.getMainLooper());
    }

    public void onDestroy() {
        if (this.f121888n != null) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).sy0(this.f121888n);
            this.f121888n = null;
        }
        if (C97625j3.m125811a()) {
            C97625j3.m125812b().mo105908w().remove(this.f121883f);
        }
        C44935e eVar = this.f121883f;
        if (eVar != null) {
            eVar.mo70227D();
        }
        super.onDestroy();
    }

    public void onPause() {
        Log.m105924i("MicroMsg.ServiceNotifyConversationUI", "on pause");
        C44935e eVar = this.f121883f;
        if (eVar != null) {
            eVar.mo103859E();
        }
        super.onPause();
    }

    public void onResume() {
        Log.m105926v("MicroMsg.ServiceNotifyConversationUI", "on resume");
        C44935e eVar = this.f121883f;
        if (eVar != null) {
            eVar.mo103860F();
        }
        super.onResume();
    }
}
