package com.tencent.p014mm.p136ui.voicesearch;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.contact.C74584x;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import eo3.C75635b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.voicesearch.VoiceSearchResultUI */
public class VoiceSearchResultUI extends MMActivity {

    /* renamed from: d */
    public ListView f220321d;

    /* renamed from: e */
    public C75635b f220322e;

    /* renamed from: f */
    public String[] f220323f;

    /* renamed from: g */
    public String f220324g = null;

    /* renamed from: h */
    public TextView f220325h;

    /* renamed from: i */
    public int f220326i = -1;

    /* renamed from: j */
    public int f220327j = 1;

    /* renamed from: n */
    public int f220328n = 2;

    /* renamed from: o */
    public boolean f220329o = false;

    /* renamed from: p */
    public boolean f220330p = false;

    /* renamed from: com.tencent.mm.ui.voicesearch.VoiceSearchResultUI$a */
    public class C74938a implements MenuItem.OnMenuItemClickListener {
        public C74938a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!VoiceSearchResultUI.this.f220329o) {
                C115669n nVar = C115669n.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append(VoiceSearchResultUI.this.f220328n);
                sb.append(",");
                sb.append(VoiceSearchResultUI.this.f220326i);
                sb.append(",");
                String[] strArr = VoiceSearchResultUI.this.f220323f;
                sb.append(strArr == null ? 0 : strArr.length);
                sb.append(",");
                sb.append(0);
                nVar.kvStat(10452, sb.toString());
            }
            VoiceSearchResultUI voiceSearchResultUI = VoiceSearchResultUI.this;
            if (voiceSearchResultUI.f220330p) {
                voiceSearchResultUI.moveTaskToBack(true);
            }
            VoiceSearchResultUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.voicesearch.VoiceSearchResultUI$b */
    public class C74939b implements AdapterView.OnItemClickListener {
        public C74939b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            boolean z;
            int i2 = i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/voicesearch/VoiceSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (!VoiceSearchResultUI.this.f220329o) {
                C115669n nVar = C115669n.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append(VoiceSearchResultUI.this.f220328n);
                sb.append(",");
                sb.append(VoiceSearchResultUI.this.f220326i);
                sb.append(",");
                String[] strArr = VoiceSearchResultUI.this.f220323f;
                sb.append(strArr == null ? 0 : strArr.length);
                sb.append(",");
                sb.append(i2);
                nVar.kvStat(10452, sb.toString());
            }
            C72996z1 s = VoiceSearchResultUI.this.f220322e.getItem(i2);
            VoiceSearchResultUI voiceSearchResultUI = VoiceSearchResultUI.this;
            String username = s.getUsername();
            String f = s.mo62898f();
            voiceSearchResultUI.getClass();
            Class<ChattingUI> cls = ChattingUI.class;
            if (username != null && username.length() > 0) {
                Log.m105918d("MicroMsg.VoiceSearchResultUI", "dealSelectContact " + username);
                int i3 = voiceSearchResultUI.f220327j;
                if (i3 == 3) {
                    Intent intent = new Intent();
                    intent.putExtra("Select_Conv_User", username);
                    voiceSearchResultUI.setResult(-1, intent);
                    voiceSearchResultUI.finish();
                } else {
                    if (i3 == 1 || C45628s0.m50751P(username) || C45628s0.m50738C(username) || C72996z1.m85820U5(username) || C45628s0.m50743H(username)) {
                        z = true;
                    } else {
                        Cursor[] cursorArr = new Cursor[2];
                        cursorArr[0] = C97625j3.m125812b().mo105879E().mo71147a(C45628s0.f123398d, (List<String>) null, f);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        while (cursorArr[0].moveToNext()) {
                            try {
                                Cursor cursor = cursorArr[0];
                                String string = cursor.getString(cursor.getColumnIndex("username"));
                                arrayList2.add(string);
                                if (!C72996z1.m85820U5(string)) {
                                    arrayList3.add(string);
                                }
                                Log.m105918d("MicroMsg.VoiceSearchResultUI", "block user " + string);
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.VoiceSearchResultUI", e, "", new Object[0]);
                            }
                        }
                        Cursor[] cursorArr2 = cursorArr;
                        z = true;
                        Cursor c = C97625j3.m125812b().mo105878D().mo71146c(f, "@micromsg.with.all.biz.qq.com", (String) null, arrayList2, false, true, true, 2, arrayList3);
                        cursorArr2[1] = c;
                        int count = c.getCount();
                        int count2 = cursorArr2[0].getCount();
                        cursorArr2[0].close();
                        cursorArr2[1].close();
                        Log.m105918d("MicroMsg.VoiceSearchResultUI", "contactCount " + count + " conversationCount " + count2);
                        if (!(count + count2 <= 1)) {
                            Intent intent2 = new Intent(voiceSearchResultUI, SearchConversationResultUI.class);
                            intent2.putExtra("SearchConversationResult_User", f);
                            C9556a aVar = new C9556a();
                            aVar.mo10233c(intent2);
                            VoiceSearchResultUI voiceSearchResultUI2 = voiceSearchResultUI;
                            C117292a.m165358d(voiceSearchResultUI2, aVar.mo10232b(), "com/tencent/mm/ui/voicesearch/VoiceSearchResultUI", "dealSelectContact", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            voiceSearchResultUI.startActivity((Intent) aVar.mo10231a(0));
                            C117292a.m165359e(voiceSearchResultUI2, "com/tencent/mm/ui/voicesearch/VoiceSearchResultUI", "dealSelectContact", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    }
                    boolean z2 = false;
                    int i4 = voiceSearchResultUI.f220327j;
                    if (i4 == z) {
                        Intent intent3 = new Intent();
                        intent3.putExtra("Contact_User", username);
                        if (C45628s0.m50743H(username)) {
                            intent3.putExtra("Is_group_card", z);
                        }
                        if (username.length() > 0) {
                            C74584x.m89302e(intent3, username);
                            if (voiceSearchResultUI.f220330p) {
                                voiceSearchResultUI.startActivity(cls, new Intent().putExtra("Chat_User", username).putExtra("finish_direct", z));
                                voiceSearchResultUI.finish();
                            } else {
                                C88144b.m109791i(voiceSearchResultUI, Scopes.PROFILE, ".ui.ContactInfoUI", intent3, (Bundle) null);
                            }
                        }
                    } else if (i4 == 2) {
                        if (Util.isNullOrNil(username)) {
                            Log.m105920e("MicroMsg.VoiceSearchResultUI", "username is null " + username);
                        } else if (C72996z1.m85838i5(username)) {
                            if ((C75592q0.m90785o() & 2) == 0) {
                                z2 = true;
                            }
                            if (z2) {
                                C88144b.m109791i(voiceSearchResultUI.getContext(), "tmessage", ".ui.TConversationUI", new Intent().putExtra("finish_direct", z), (Bundle) null);
                            } else {
                                C88144b.m109791i(voiceSearchResultUI, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", username), (Bundle) null);
                            }
                        } else if (C72996z1.m85850u5(username)) {
                            C88144b.m109791i(voiceSearchResultUI, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", username), (Bundle) null);
                        } else if (C72996z1.m85827Y4(username)) {
                            C88144b.m109791i(voiceSearchResultUI, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", username), (Bundle) null);
                        } else if (C72996z1.m85851v5(username)) {
                            MMAppMgr.m85983c(username);
                            C88144b.m109791i(voiceSearchResultUI, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", username), (Bundle) null);
                        } else if (C72996z1.m85849t5(username)) {
                            if (C75592q0.m90785o() == false || !z) {
                                z2 = true;
                            }
                            if (z2) {
                                voiceSearchResultUI.startActivity(cls, new Intent().putExtra("Chat_User", username).putExtra("finish_direct", z));
                            } else {
                                C88144b.m109791i(voiceSearchResultUI, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", username), (Bundle) null);
                            }
                        } else if (C72996z1.m85853x5(username)) {
                            if (C75592q0.m90758F()) {
                                Intent intent4 = new Intent();
                                intent4.putExtra("type", 20);
                                C88144b.m109791i(voiceSearchResultUI, "readerapp", ".ui.ReaderAppUI", intent4, (Bundle) null);
                            } else {
                                C88144b.m109791i(voiceSearchResultUI, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", username), (Bundle) null);
                            }
                        } else if (C72996z1.m85854y5(username)) {
                            if (C75592q0.m90759G()) {
                                Intent intent5 = new Intent();
                                intent5.putExtra("type", 11);
                                C88144b.m109791i(voiceSearchResultUI, "readerapp", ".ui.ReaderAppUI", intent5, (Bundle) null);
                            } else {
                                C88144b.m109791i(voiceSearchResultUI, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", username), (Bundle) null);
                            }
                        } else if (C72996z1.m85815R4(username)) {
                            C88144b.m109791i(voiceSearchResultUI, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", username), (Bundle) null);
                        } else if (C72996z1.m85836g5(username)) {
                            if (C75592q0.m90756D()) {
                                C88144b.m109791i(voiceSearchResultUI, "masssend", ".ui.MassSendHistoryUI", new Intent().putExtra("finish_direct", z), (Bundle) null);
                            } else {
                                C88144b.m109791i(voiceSearchResultUI, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", username), (Bundle) null);
                            }
                        } else if (C72996z1.m85837h5(username)) {
                            if ((C75592q0.m90785o() & 16) == 0) {
                                z2 = true;
                            }
                            if (z2) {
                                voiceSearchResultUI.startActivity(cls, new Intent().putExtra("Chat_User", username).putExtra("finish_direct", z));
                            } else {
                                C88144b.m109791i(voiceSearchResultUI, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", username), (Bundle) null);
                            }
                        } else {
                            if (!C72996z1.m85834e5(username) && !C72996z1.m85794B5(username)) {
                                if (!(username.equalsIgnoreCase("feedsapp"))) {
                                    if (!(username.equalsIgnoreCase("voipapp"))) {
                                        if (!(username.equalsIgnoreCase("voicevoipapp")) && !C72996z1.m85830a5(username)) {
                                            if (username.equalsIgnoreCase("qqfriend")) {
                                                z2 = true;
                                            }
                                            if (!z2) {
                                                voiceSearchResultUI.startActivity(cls, new Intent().putExtra("Chat_User", username).putExtra("finish_direct", z));
                                            }
                                        }
                                    }
                                }
                            }
                            C88144b.m109791i(voiceSearchResultUI, Scopes.PROFILE, ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", username), (Bundle) null);
                        }
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/voicesearch/VoiceSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ccq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0169, code lost:
        if (r2 == false) goto L_0x016b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r13 = this;
            r0 = 2131316460(0x7f094eec, float:1.8251402E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r13.f220321d = r0
            r0 = 2131301643(0x7f09150b, float:1.822135E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.f220325h = r0
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r1 = "VoiceSearchResultUI_Resultlist"
            java.lang.String[] r0 = r0.getStringArrayExtra(r1)
            r13.f220323f = r0
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r1 = "VoiceSearchResultUI_Error"
            java.lang.String r0 = r0.getStringExtra(r1)
            r13.f220324g = r0
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r1 = "VoiceSearchResultUI_VoiceId"
            r2 = -1
            int r0 = r0.getIntExtra(r1, r2)
            r13.f220326i = r0
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r1 = "VoiceSearchResultUI_ShowType"
            r2 = 1
            int r0 = r0.getIntExtra(r1, r2)
            r13.f220327j = r0
            r1 = 2
            if (r0 != r2) goto L_0x004d
            r0 = 2
            goto L_0x004e
        L_0x004d:
            r0 = 1
        L_0x004e:
            r13.f220328n = r0
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r3 = "VoiceSearchResultUI_IsVoiceControl"
            r4 = 0
            boolean r0 = r0.getBooleanExtra(r3, r4)
            r13.f220330p = r0
            java.lang.Object[] r0 = new java.lang.Object[r1]
            int r3 = r13.f220327j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r4] = r3
            boolean r3 = r13.f220330p
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0[r2] = r3
            java.lang.String r3 = "MicroMsg.VoiceSearchResultUI"
            java.lang.String r5 = "showType = %s, isVoiceControl = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r0)
            eo3.b r0 = new eo3.b
            android.content.Context r5 = r13.getApplicationContext()
            int r6 = r13.f220327j
            r0.<init>(r5, r6)
            r13.f220322e = r0
            eo3.d r5 = new eo3.d
            r5.<init>(r0, r4)
            r0.mo105988x(r5)
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            int r6 = r13.f220327j
            if (r6 == r1) goto L_0x0098
            goto L_0x017d
        L_0x0098:
            java.lang.String r6 = "lbsapp"
            r5.add(r6)
            java.lang.String r6 = "shakeapp"
            r5.add(r6)
            java.lang.String r6 = "qqfriend"
            r5.add(r6)
            java.lang.String r6 = "facebookapp"
            r5.add(r6)
            java.lang.String r6 = "feedsapp"
            r5.add(r6)
            java.lang.String r6 = "fmessage"
            r5.add(r6)
            java.lang.String r6 = "voipapp"
            r5.add(r6)
            java.lang.String r6 = "voicevoipapp"
            r5.add(r6)
            java.lang.String r6 = "voiceinputapp"
            r5.add(r6)
            java.lang.String r7 = "linkedinplugin"
            r5.add(r7)
            java.lang.String r7 = "notifymessage"
            r5.add(r7)
            java.lang.String r7 = "appbrand_notify_message"
            r5.add(r7)
            int r7 = eb0.C75592q0.m90785o()
            r8 = r7 & 1
            if (r8 == 0) goto L_0x00e4
            java.lang.String r8 = "qqmail"
            r5.add(r8)
        L_0x00e4:
            java.util.Set<java.lang.String> r8 = eb0.C45628s0.f123410p
            boolean r8 = eb0.C75592q0.m90790t()
            java.lang.String r9 = "@t.qq.com"
            if (r8 != 0) goto L_0x00ef
            goto L_0x0110
        L_0x00ef:
            k40.a r8 = f40.C86709a0.m107533q(r0)
            f62.k0 r8 = (f62.C75700k0) r8
            g62.p r8 = r8.V50()
            com.tencent.mm.storage.s4 r8 = (com.tencent.p014mm.storage.C44667s4) r8
            com.tencent.mm.storage.r4 r8 = r8.mo69821jo(r9)
            if (r8 == 0) goto L_0x0110
            java.lang.String r8 = r8.f121095b
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            int r8 = r8.length()
            if (r8 != 0) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r8 = 1
            goto L_0x0111
        L_0x0110:
            r8 = 0
        L_0x0111:
            if (r8 == 0) goto L_0x0117
            r8 = r7 & 2
            if (r8 == 0) goto L_0x011d
        L_0x0117:
            java.lang.String r8 = "tmessage"
            r5.add(r8)
        L_0x011d:
            r8 = r7 & 32
            if (r8 == 0) goto L_0x0126
            java.lang.String r8 = "qmessage"
            r5.add(r8)
        L_0x0126:
            r8 = r7 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x012f
            java.lang.String r8 = "qqsync"
            r5.add(r8)
        L_0x012f:
            r8 = r7 & 16
            if (r8 == 0) goto L_0x0138
            java.lang.String r8 = "medianote"
            r5.add(r8)
        L_0x0138:
            r8 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 & r7
            if (r8 == 0) goto L_0x0142
            java.lang.String r8 = "newsapp"
            r5.add(r8)
        L_0x0142:
            r8 = 262144(0x40000, float:3.67342E-40)
            r8 = r8 & r7
            if (r8 != 0) goto L_0x016b
            boolean r8 = eb0.C75592q0.m90790t()
            if (r8 != 0) goto L_0x014e
            goto L_0x0168
        L_0x014e:
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.p r0 = r0.V50()
            com.tencent.mm.storage.s4 r0 = (com.tencent.p014mm.storage.C44667s4) r0
            com.tencent.mm.storage.r4 r0 = r0.mo69821jo(r9)
            if (r0 == 0) goto L_0x0168
            java.lang.String r0 = r0.f121095b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0169
        L_0x0168:
            r2 = 0
        L_0x0169:
            if (r2 != 0) goto L_0x0170
        L_0x016b:
            java.lang.String r0 = "blogapp"
            r5.add(r0)
        L_0x0170:
            r0 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r7
            if (r0 == 0) goto L_0x017a
            java.lang.String r0 = "masssendapp"
            r5.add(r0)
        L_0x017a:
            r5.add(r6)
        L_0x017d:
            eo3.b r0 = r13.f220322e
            if (r0 == 0) goto L_0x0189
            eo3.c r2 = new eo3.c
            r2.<init>(r0, r5)
            r0.mo105988x(r2)
        L_0x0189:
            android.widget.ListView r0 = r13.f220321d
            eo3.b r2 = r13.f220322e
            r0.setAdapter(r2)
            android.widget.TextView r0 = r13.f220325h
            r2 = 8
            r0.setVisibility(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "voiceId  "
            r0.append(r5)
            int r5 = r13.f220326i
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
            int r0 = r13.f220327j
            r5 = 2131838508(0x7f11462c, float:1.9310241E38)
            if (r0 != r1) goto L_0x0242
            java.lang.String r0 = ""
            r13.setMMTitle((java.lang.String) r0)
            java.lang.String[] r0 = r13.f220323f
            if (r0 == 0) goto L_0x023f
            int r1 = r0.length
            if (r1 != 0) goto L_0x01c3
            goto L_0x023f
        L_0x01c3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "oldlist.length "
            r1.append(r6)
            int r6 = r0.length
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r0.length
            r8 = 0
        L_0x01e4:
            if (r8 >= r7) goto L_0x0233
            r9 = r0[r8]
            java.lang.Class<d62.i> r10 = d62.C75339i.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            d62.i r10 = (d62.C75339i) r10
            java.lang.String r10 = r10.getDisplayName(r9)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "displayname "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r11)
            boolean r11 = r1.containsValue(r10)
            if (r11 == 0) goto L_0x0215
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            if (r11 == 0) goto L_0x0215
            goto L_0x0230
        L_0x0215:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "username "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r11)
            r1.put(r10, r9)
            r6.add(r9)
        L_0x0230:
            int r8 = r8 + 1
            goto L_0x01e4
        L_0x0233:
            int r0 = r6.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r6.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x023f:
            r13.f220323f = r0
            goto L_0x0249
        L_0x0242:
            java.lang.String r0 = r13.getString(r5)
            r13.setMMTitle((java.lang.String) r0)
        L_0x0249:
            java.lang.String r0 = r13.getString(r5)
            r13.setMMTitle((java.lang.String) r0)
            com.tencent.mm.ui.voicesearch.VoiceSearchResultUI$a r0 = new com.tencent.mm.ui.voicesearch.VoiceSearchResultUI$a
            r0.<init>()
            r13.setBackBtn(r0)
            android.widget.ListView r0 = r13.f220321d
            com.tencent.mm.ui.voicesearch.VoiceSearchResultUI$b r1 = new com.tencent.mm.ui.voicesearch.VoiceSearchResultUI$b
            r1.<init>()
            r0.setOnItemClickListener(r1)
            java.lang.String[] r0 = r13.f220323f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L_0x0283
            eo3.b r3 = r13.f220322e
            if (r3 == 0) goto L_0x0283
            int r3 = r0.length
            r5 = 0
        L_0x0271:
            if (r5 >= r3) goto L_0x0283
            r6 = r0[r5]
            eo3.b r7 = r13.f220322e
            boolean r7 = r7.mo105987w(r6)
            if (r7 == 0) goto L_0x0280
            r1.add(r6)
        L_0x0280:
            int r5 = r5 + 1
            goto L_0x0271
        L_0x0283:
            int r0 = r1.size()
            if (r0 != 0) goto L_0x02a5
            android.widget.TextView r0 = r13.f220325h
            r0.setVisibility(r4)
            java.lang.String r0 = r13.f220324g
            if (r0 == 0) goto L_0x0298
            android.widget.TextView r2 = r13.f220325h
            r2.setText(r0)
            goto L_0x02aa
        L_0x0298:
            android.widget.TextView r0 = r13.f220325h
            r2 = 2131820808(0x7f110108, float:1.9274341E38)
            java.lang.String r2 = r13.getString(r2)
            r0.setText(r2)
            goto L_0x02aa
        L_0x02a5:
            android.widget.TextView r0 = r13.f220325h
            r0.setVisibility(r2)
        L_0x02aa:
            eo3.b r0 = r13.f220322e
            if (r0 == 0) goto L_0x02ca
            int r2 = r1.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.f222204o = r1
            r1 = 0
            r0.f222205p = r1
            r0.mo5580b()
            eo3.f r1 = new eo3.f
            r1.<init>(r0, r4)
            r0.mo105988x(r1)
        L_0x02ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.voicesearch.VoiceSearchResultUI.initView():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        this.f220329o = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f220322e.mo5580b();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 == i) {
            if (!this.f220329o) {
                C115669n nVar = C115669n.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f220328n);
                sb.append(",");
                sb.append(this.f220326i);
                sb.append(",");
                String[] strArr = this.f220323f;
                sb.append(strArr == null ? 0 : strArr.length);
                sb.append(",");
                sb.append(0);
                nVar.kvStat(10452, sb.toString());
            }
            if (this.f220330p) {
                moveTaskToBack(true);
                finish();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.f220329o = true;
    }
}
