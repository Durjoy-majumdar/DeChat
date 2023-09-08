package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct;
import com.tencent.p014mm.modelvoiceaddr.p878ui.C114760b;
import com.tencent.p014mm.modelvoiceaddr.p878ui.VoiceSearchLayout;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.voicesearch.VoiceSearchResultUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import eo3.C75635b;
import eo3.C75645e;
import f62.C45759r0;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import l31.C61212e;
import lj3.C46863b;
import nc0.C76850a;
import nj3.C11184p0;
import o31.C11345b;
import o31.C76986a;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76979h;
import p716uu.C52617d;
import te3.C51043r10;
import te3.C77961kx3;
import uo3.C78253a;
import vd3.C78399i;
import xi3.C15691d;

/* renamed from: com.tencent.mm.ui.contact.ChatroomContactUI */
public class ChatroomContactUI extends MMActivity implements C11385n, MStorage.IOnStorageChange {

    /* renamed from: u */
    public static final /* synthetic */ int f218474u = 0;

    /* renamed from: d */
    public ListView f218475d;

    /* renamed from: e */
    public ContactCountView f218476e;

    /* renamed from: f */
    public VoiceSearchLayout f218477f;

    /* renamed from: g */
    public View f218478g;

    /* renamed from: h */
    public C114760b f218479h;

    /* renamed from: i */
    public TextView f218480i;

    /* renamed from: j */
    public C74576w f218481j;

    /* renamed from: n */
    public C75635b f218482n;

    /* renamed from: o */
    public C78253a f218483o;

    /* renamed from: p */
    public String f218484p;

    /* renamed from: q */
    public int f218485q = 0;

    /* renamed from: r */
    public int f218486r = 0;

    /* renamed from: s */
    public C11184p0 f218487s = new C44873e();

    /* renamed from: t */
    public C78399i f218488t = new C78399i(new C6816f(this));

    /* renamed from: com.tencent.mm.ui.contact.ChatroomContactUI$b */
    public class C6814b implements MenuItem.OnMenuItemClickListener {
        public C6814b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ChatroomContactUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ChatroomContactUI$c */
    public class C6815c implements View.OnClickListener {
        public C6815c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ChatroomContactUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = ChatroomContactUI.this.f218475d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/ui/contact/ChatroomContactUI$12", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/ui/contact/ChatroomContactUI$12", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ChatroomContactUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ChatroomContactUI$f */
    public class C6816f implements AbsListView.OnScrollListener {
        public C6816f(ChatroomContactUI chatroomContactUI) {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ChatroomContactUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ChatroomContactUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ChatroomContactUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ChatroomContactUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ChatroomContactUI$e */
    public class C44873e implements C11184p0 {
        public C44873e() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 1) {
                String str = ChatroomContactUI.this.f218484p;
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
                if (z1Var == null) {
                    Log.m105921e("MicroMsg.ChatroomContactUI", "userName=%s get Contact is null", str);
                } else if (C72996z1.m85847r5(str)) {
                    z1Var.mo62935u4();
                    ((C45759r0) C86312j.m106911c(C45759r0.class)).Er0(z1Var.getUsername());
                    C97625j3.m125812b().mo105907v().mo69719p3(str, z1Var);
                } else {
                    z1Var.mo62935u4();
                    C45628s0.m50761Z(z1Var, true);
                    if (C72996z1.m85820U5(str)) {
                        C97625j3.m125812b().mo105907v().mo69688c(str);
                        ((C44662n1) C97625j3.m125812b().mo105902q()).mo69807jo(str);
                        return;
                    }
                    C97625j3.m125812b().mo105907v().mo69719p3(str, z1Var);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ChatroomContactUI$a */
    public class C74371a implements View.OnTouchListener {
        public C74371a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C46863b bVar;
            C46863b bVar2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ChatroomContactUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                ChatroomContactUI.this.hideVKB();
                ChatroomContactUI.this.f218485q = (int) motionEvent.getRawX();
                ChatroomContactUI.this.f218486r = (int) motionEvent.getRawY();
            }
            C74576w wVar = ChatroomContactUI.this.f218481j;
            if (!(wVar == null || (bVar2 = wVar.f219225q) == null)) {
                bVar2.mo72073c(motionEvent);
            }
            C75635b bVar3 = ChatroomContactUI.this.f218482n;
            if (!(bVar3 == null || (bVar = bVar3.f222215z) == null)) {
                bVar.mo72073c(motionEvent);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/ChatroomContactUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ChatroomContactUI$d */
    public class C74372d implements VoiceSearchLayout.C68147e {

        /* renamed from: com.tencent.mm.ui.contact.ChatroomContactUI$d$a */
        public class C74373a implements Runnable {
            public C74373a() {
            }

            public void run() {
                ChatroomContactUI.this.f218475d.setSelection(0);
            }
        }

        public C74372d() {
        }

        /* renamed from: a */
        public void mo103336a(boolean z) {
            Log.m105918d("MicroMsg.ChatroomContactUI", "visible " + z);
            if (z) {
                int firstVisiblePosition = ChatroomContactUI.this.f218475d.getFirstVisiblePosition();
                Log.m105918d("MicroMsg.ChatroomContactUI", "getFirstVisiblePosition  " + firstVisiblePosition);
                if (firstVisiblePosition > 0) {
                    ChatroomContactUI.this.f218475d.post(new C74373a());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ChatroomContactUI$g */
    public class C74374g implements View.OnTouchListener {
        public C74374g() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ChatroomContactUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C114760b bVar = ChatroomContactUI.this.f218479h;
            bVar.mo153850b();
            bVar.mo174407s();
            C117292a.m165362h(true, this, "com/tencent/mm/ui/contact/ChatroomContactUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ChatroomContactUI$h */
    public class C74375h implements C52617d.C52618a {
        public C74375h() {
        }

        /* renamed from: H1 */
        public void mo63485H1(boolean z, String[] strArr, long j, int i) {
            long j2 = j;
            int i2 = i;
            Class<VoiceSearchResultUI> cls = VoiceSearchResultUI.class;
            Log.m105926v("MicroMsg.ChatroomContactUI", "onVoiceReturn");
            if (z) {
                Intent intent = new Intent(ChatroomContactUI.this.getContext(), cls);
                intent.putExtra("VoiceSearchResultUI_Resultlist", strArr);
                intent.putExtra("VoiceSearchResultUI_VoiceId", j2);
                intent.putExtra("VoiceSearchResultUI_ShowType", i2);
                AppCompatActivity context = ChatroomContactUI.this.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                AppCompatActivity appCompatActivity = context;
                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onVoiceReturn", "(Z[Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity, "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onVoiceReturn", "(Z[Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            Intent intent2 = new Intent(ChatroomContactUI.this.getContext(), cls);
            intent2.putExtra("VoiceSearchResultUI_Resultlist", new String[0]);
            intent2.putExtra("VoiceSearchResultUI_Error", ChatroomContactUI.this.getContext().getString(C0966R.string.f360087a11));
            intent2.putExtra("VoiceSearchResultUI_VoiceId", j2);
            intent2.putExtra("VoiceSearchResultUI_ShowType", i2);
            AppCompatActivity context2 = ChatroomContactUI.this.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            AppCompatActivity appCompatActivity2 = context2;
            C117292a.m165358d(appCompatActivity2, aVar2.mo10232b(), "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onVoiceReturn", "(Z[Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(appCompatActivity2, "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onVoiceReturn", "(Z[Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }

        /* renamed from: H5 */
        public void mo1321H5() {
            ChatroomContactUI chatroomContactUI = ChatroomContactUI.this;
            chatroomContactUI.f218475d.setAdapter(chatroomContactUI.f218481j);
            ChatroomContactUI.this.f218481j.notifyDataSetChanged();
            ChatroomContactUI.this.f218482n.mo105989z(false);
            View view = ChatroomContactUI.this.f218478g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            return false;
        }

        /* renamed from: T3 */
        public void mo63486T3() {
            Log.m105926v("MicroMsg.ChatroomContactUI", "onVoiceSearchStart");
            ChatroomContactUI.this.hideVKB();
        }

        /* renamed from: U1 */
        public void mo63487U1() {
        }

        /* renamed from: i7 */
        public void mo1323i7() {
            View view = ChatroomContactUI.this.f218478g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x010c  */
        /* renamed from: l3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1324l3(java.lang.String r14) {
            /*
                r13 = this;
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
                r1[r2] = r14
                java.lang.String r3 = "MicroMsg.ChatroomContactUI"
                java.lang.String r4 = "onSearchBarChange %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r1)
                java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r14)
                com.tencent.mm.ui.contact.ChatroomContactUI r1 = com.tencent.p014mm.p136ui.contact.ChatroomContactUI.this
                if (r14 == 0) goto L_0x0028
                int r3 = com.tencent.p014mm.p136ui.contact.ChatroomContactUI.f218474u
                r1.getClass()
                int r3 = r14.length()
                if (r3 <= 0) goto L_0x0028
                com.tencent.mm.ui.contact.ContactCountView r3 = r1.f218476e
                if (r3 == 0) goto L_0x002f
                r3.setVisible(r2)
                goto L_0x002f
            L_0x0028:
                com.tencent.mm.ui.contact.ContactCountView r3 = r1.f218476e
                if (r3 == 0) goto L_0x002f
                r3.setVisible(r0)
            L_0x002f:
                if (r14 == 0) goto L_0x010c
                int r3 = r14.length()
                if (r3 != 0) goto L_0x0039
                goto L_0x010c
            L_0x0039:
                android.view.View r3 = r1.f218478g
                r4 = 8
                k20.a r12 = new k20.a
                r12.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r12.mo10233c(r4)
                java.lang.Object[] r5 = r12.mo10232b()
                java.lang.String r6 = "com/tencent/mm/ui/contact/ChatroomContactUI"
                java.lang.String r7 = "doQuery"
                java.lang.String r8 = "(Ljava/lang/String;)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                r4 = r3
                j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Object r2 = r12.mo10231a(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r3.setVisibility(r2)
                java.lang.String r5 = "com/tencent/mm/ui/contact/ChatroomContactUI"
                java.lang.String r6 = "doQuery"
                java.lang.String r7 = "(Ljava/lang/String;)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
                android.widget.ListView r2 = r1.f218475d
                eo3.b r3 = r1.f218482n
                r2.setAdapter(r3)
                android.widget.ListView r2 = r1.f218475d
                android.content.res.Resources r3 = r1.getResources()
                r4 = 2131101833(0x7f060889, float:1.7816087E38)
                int r3 = r3.getColor(r4)
                r2.setBackgroundColor(r3)
                eo3.b r2 = r1.f218482n
                r2.mo105989z(r0)
                eo3.b r2 = r1.f218482n
                r2.getClass()
                java.lang.String r14 = r14.trim()
                java.lang.String r3 = "@"
                boolean r3 = r14.startsWith(r3)
                if (r3 == 0) goto L_0x00c2
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r14 = r14.substring(r0)
                r3.append(r14)
                java.lang.String r14 = "%"
                r3.append(r14)
                java.lang.String r14 = "@micromsg.with.all.biz.qq.com"
                r3.append(r14)
                java.lang.String r14 = r3.toString()
            L_0x00c2:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "translateQueryText ["
                r3.append(r4)
                r3.append(r14)
                java.lang.String r4 = "]"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "MicroMsg.SearchResultAdapter"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
                if (r14 == 0) goto L_0x00f0
                java.lang.String r3 = r2.f222205p
                boolean r3 = r14.equals(r3)
                if (r3 != 0) goto L_0x00f0
                eo3.g r3 = new eo3.g
                r3.<init>(r2)
                r2.mo105988x(r3)
            L_0x00f0:
                r2.f222205p = r14
                r3 = 0
                r2.f222204o = r3
                if (r14 != 0) goto L_0x00fb
                java.lang.String r14 = ""
                r2.f222205p = r14
            L_0x00fb:
                r2.mo5580b()
                eo3.f r14 = new eo3.f
                r14.<init>(r2, r0)
                r2.mo105988x(r14)
                eo3.b r14 = r1.f218482n
                r14.notifyDataSetChanged()
                goto L_0x0132
            L_0x010c:
                android.widget.ListView r14 = r1.f218475d
                com.tencent.mm.ui.contact.w r0 = r1.f218481j
                r14.setAdapter(r0)
                android.widget.ListView r14 = r1.f218475d
                android.content.res.Resources r0 = r1.getResources()
                r3 = 2131101433(0x7f0606f9, float:1.7815276E38)
                int r0 = r0.getColor(r3)
                r14.setBackgroundColor(r0)
                com.tencent.mm.ui.contact.w r14 = r1.f218481j
                r14.notifyDataSetChanged()
                eo3.b r14 = r1.f218482n
                r14.mo105989z(r2)
                com.tencent.mm.ui.contact.w r14 = r1.f218481j
                r14.mo1333o()
            L_0x0132:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.ChatroomContactUI.C74375h.mo1324l3(java.lang.String):void");
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ChatroomContactUI$i */
    public class C74376i implements AdapterView.OnItemClickListener {
        public C74376i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            String str2;
            int i2 = i;
            Class<ChattingUI> cls = ChattingUI.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            StringBuilder sb = new StringBuilder();
            sb.append("onItemClick ");
            sb.append(i2);
            C75635b bVar = ChatroomContactUI.this.f218482n;
            Object obj = bVar;
            if (bVar != null) {
                obj = Boolean.valueOf(bVar.f222213x);
            }
            sb.append(obj);
            Log.m105918d("MicroMsg.ChatroomContactUI", sb.toString());
            String str3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V";
            String str4 = "onItemClick";
            if (i2 < ChatroomContactUI.this.f218475d.getHeaderViewsCount()) {
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", str4, str3);
                return;
            }
            int headerViewsCount = i2 - ChatroomContactUI.this.f218475d.getHeaderViewsCount();
            ChatroomContactUI chatroomContactUI = ChatroomContactUI.this;
            C75635b bVar2 = chatroomContactUI.f218482n;
            if (bVar2 == null || !bVar2.f222213x) {
                C72996z1 z1Var = (C72996z1) chatroomContactUI.f218481j.getItem(headerViewsCount);
                if (z1Var == null) {
                    Log.m105921e("MicroMsg.ChatroomContactUI", "position=%s cont is null", Integer.valueOf(headerViewsCount));
                    C117292a.m165361g(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", str4, str3);
                    return;
                }
                if (C72996z1.m85847r5(z1Var.getUsername())) {
                    OpenIMChatRoomLogStruct openIMChatRoomLogStruct = new OpenIMChatRoomLogStruct();
                    openIMChatRoomLogStruct.mo93194s(z1Var.getUsername());
                    openIMChatRoomLogStruct.f194303e = 2;
                    openIMChatRoomLogStruct.mo86054n();
                }
                String username = z1Var.getUsername();
                ChatroomContactUI chatroomContactUI2 = ChatroomContactUI.this;
                chatroomContactUI2.getClass();
                if (username != null && username.length() > 0) {
                    if (C72996z1.m85841l5(username)) {
                        Log.m105921e("MicroMsg.ChatroomContactUI", "error, 4.5 do not contain this contact %s", username);
                    } else {
                        Intent intent = new Intent(chatroomContactUI2.getContext(), cls);
                        intent.putExtra("Chat_User", username);
                        intent.putExtra("Chat_Mode", 1);
                        intent.putExtra("finish_direct", true);
                        intent.putExtra("specific_chat_from_scene", 10);
                        intent.putExtra("chat_from_scene_for_group_chats", 4);
                        AppCompatActivity context = chatroomContactUI2.getContext();
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        AppCompatActivity appCompatActivity = context;
                        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/ui/contact/ChatroomContactUI", "dealSelectContact", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(appCompatActivity, "com/tencent/mm/ui/contact/ChatroomContactUI", "dealSelectContact", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", str4, str3);
                return;
            }
            boolean n = bVar2.mo7996n(headerViewsCount);
            boolean u = ChatroomContactUI.this.f218482n.mo105986u(headerViewsCount);
            Log.m105918d("MicroMsg.ChatroomContactUI", "onItemClick " + u);
            String str5 = "";
            if (u) {
                ChatroomContactUI chatroomContactUI3 = ChatroomContactUI.this;
                C75635b bVar3 = chatroomContactUI3.f218482n;
                C114760b bVar4 = chatroomContactUI3.f218479h;
                if (bVar4 != null) {
                    str5 = bVar4.mo153855g();
                }
                bVar3.getClass();
                bVar3.mo105988x(new C75645e(bVar3, str5));
            } else if (n) {
                C77961kx3 t = ChatroomContactUI.this.f218482n.mo105985t(headerViewsCount);
                String str6 = t.f227763d.f141175d;
                C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(str6);
                if (z1Var2.mo62927s3()) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Contact_User", str6);
                    intent2.putExtra("Contact_Scene", 3);
                    if (str6 != null && str6.length() > 0) {
                        if (z1Var2.mo62916m3()) {
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.kvStat(10298, str6 + "," + 3);
                        }
                        C74584x.m89302e(intent2, str6);
                        C88144b.m109791i(ChatroomContactUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                    }
                    str2 = str3;
                    str = str4;
                } else {
                    Intent intent3 = new Intent();
                    intent3.putExtra("Contact_User", t.f227763d.f141175d);
                    intent3.putExtra("Contact_Alias", t.f227776t);
                    intent3.putExtra("Contact_Nick", t.f227764e.f141175d);
                    intent3.putExtra("Contact_Signature", t.f227771o);
                    intent3.putExtra("Contact_RegionCode", RegionCodeDecoder.m124564q(t.f227756A, t.f227769j, t.f227770n));
                    intent3.putExtra("Contact_Sex", t.f227767h);
                    intent3.putExtra("Contact_VUser_Info", t.f227774r);
                    intent3.putExtra("Contact_VUser_Info_Flag", t.f227773q);
                    intent3.putExtra("Contact_KWeibo_flag", t.f227778v);
                    intent3.putExtra("Contact_KWeibo", t.f227775s);
                    intent3.putExtra("Contact_KWeiboNick", t.f227777u);
                    intent3.putExtra("Contact_KSnsIFlag", t.f227782z.f130392d);
                    str2 = str3;
                    str = str4;
                    intent3.putExtra("Contact_KSnsBgId", t.f227782z.f130394f);
                    intent3.putExtra("Contact_KSnsBgUrl", t.f227782z.f130393e);
                    C51043r10 r102 = t.f227758C;
                    if (r102 != null) {
                        try {
                            intent3.putExtra("Contact_customInfo", r102.toByteArray());
                        } catch (IOException e) {
                            Log.printErrStackTrace("MicroMsg.ChatroomContactUI", e, str5, new Object[0]);
                        }
                    }
                    if ((t.f227773q & 8) > 0) {
                        C115669n nVar2 = C115669n.INSTANCE;
                        nVar2.kvStat(10298, str6 + "," + 3);
                    }
                    C88144b.m109791i(ChatroomContactUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", intent3, (Bundle) null);
                }
                str3 = str2;
                str4 = str;
            } else {
                String str7 = str3;
                String str8 = str4;
                C72996z1 s = ChatroomContactUI.this.f218482n.getItem(headerViewsCount);
                if (s == null) {
                    Log.m105921e("MicroMsg.ChatroomContactUI", "on Contact ListView ItemClick, the item contact shoud not be null. count:%d, pos:%d ", Integer.valueOf(ChatroomContactUI.this.f218482n.getCount()), Integer.valueOf(headerViewsCount));
                    C117292a.m165361g(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", str8, str7);
                    return;
                }
                str3 = str7;
                str4 = str8;
                C44879k3.m49760a(ChatroomContactUI.this.f218479h.mo153855g(), 9, 3, headerViewsCount + 1);
                String username2 = s.getUsername();
                if (C72996z1.m85847r5(username2)) {
                    OpenIMChatRoomLogStruct openIMChatRoomLogStruct2 = new OpenIMChatRoomLogStruct();
                    openIMChatRoomLogStruct2.mo93194s(username2);
                    openIMChatRoomLogStruct2.f194303e = 2;
                    openIMChatRoomLogStruct2.mo86054n();
                }
                Intent intent4 = new Intent(ChatroomContactUI.this.getContext(), cls);
                intent4.putExtra("Chat_User", username2);
                intent4.putExtra("finish_direct", true);
                intent4.putExtra("Chat_Mode", 1);
                AppCompatActivity context2 = ChatroomContactUI.this.getContext();
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent4);
                AppCompatActivity appCompatActivity2 = context2;
                C117292a.m165358d(appCompatActivity2, aVar2.mo10232b(), "com/tencent/mm/ui/contact/ChatroomContactUI$8", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(appCompatActivity2, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/ChatroomContactUI$8", "android/widget/AdapterView$OnItemClickListener", str4, str3);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ChatroomContactUI$j */
    public class C74377j implements AdapterView.OnItemLongClickListener {
        public C74377j() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = i;
            Log.m105918d("MicroMsg.ChatroomContactUI", "onItemLongClick, targetview is SearchBar::ListView, pos = " + i);
            if (i2 < ChatroomContactUI.this.f218475d.getHeaderViewsCount()) {
                Log.m105928w("MicroMsg.ChatroomContactUI", "on item long click, but match header view");
                return true;
            }
            ChatroomContactUI chatroomContactUI = ChatroomContactUI.this;
            C75635b bVar = chatroomContactUI.f218482n;
            if (bVar != null && bVar.f222213x) {
                return true;
            }
            C72996z1 z1Var = (C72996z1) chatroomContactUI.f218481j.getItem(i2 - chatroomContactUI.f218475d.getHeaderViewsCount());
            if (z1Var == null) {
                Log.m105929w("MicroMsg.ChatroomContactUI", "null == ct position=%s", Integer.valueOf(i));
                return false;
            }
            String username = z1Var.getUsername();
            if (!C72996z1.m85841l5(username) && !C72996z1.m85833d5(username)) {
                ChatroomContactUI chatroomContactUI2 = ChatroomContactUI.this;
                chatroomContactUI2.f218484p = username;
                chatroomContactUI2.f218483o.mo108272g(view, i, j, chatroomContactUI2, chatroomContactUI2.f218487s, chatroomContactUI2.f218485q, chatroomContactUI2.f218486r);
            }
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6806p2;
    }

    public void initView() {
        TextView textView = (TextView) findViewById(C0966R.C0970id.cjj);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(textView, aVar.mo10232b(), "com/tencent/mm/ui/contact/ChatroomContactUI", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(textView, "com/tencent/mm/ui/contact/ChatroomContactUI", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ListView listView = (ListView) findViewById(C0966R.C0970id.f5610jr);
        this.f218475d = listView;
        listView.setAdapter((ListAdapter) null);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.cjj);
        this.f218480i = textView2;
        textView2.setText(C0966R.string.f7456gr);
        View findViewById = findViewById(C0966R.C0970id.kro);
        this.f218478g = findViewById;
        findViewById.setOnTouchListener(new C74374g());
        C74576w wVar = new C74576w(this, "@all.chatroom.contact");
        this.f218481j = wVar;
        wVar.mo7997q(true);
        C75635b bVar = new C75635b(getContext(), 1);
        this.f218482n = bVar;
        bVar.f222206q = "@all.chatroom.contact";
        C114760b bVar2 = new C114760b(true, true);
        this.f218479h = bVar2;
        C74375h hVar = new C74375h();
        bVar2.f344100u = hVar;
        bVar2.f319122j = hVar;
        addSearchMenu(true, bVar2);
        this.f218481j.getClass();
        this.f218481j.getClass();
        this.f218481j.getClass();
        this.f218475d.setOnScrollListener(this.f218488t);
        this.f218481j.f219227s = this.f218488t;
        this.f218483o = new C78253a(getContext());
        this.f218475d.setOnItemClickListener(new C74376i());
        this.f218475d.setOnItemLongClickListener(new C74377j());
        this.f218475d.setOnTouchListener(new C74371a());
        ListView listView2 = this.f218475d;
        ContactCountView contactCountView = new ContactCountView(this);
        this.f218476e = contactCountView;
        listView2.addFooterView(contactCountView, (Object) null, false);
        setBackBtn(new C6814b());
        setToTop(new C6815c());
        this.f218475d.setAdapter(this.f218481j);
        this.f218482n.mo105989z(false);
        this.f218475d.setVisibility(0);
        this.f218477f = new VoiceSearchLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(14);
        this.f218477f.setLayoutParams(layoutParams);
        this.f218477f.setTopMargin(BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 100.0f));
        this.f218477f.setVisibility(8);
        ((ViewGroup) findViewById(C0966R.C0970id.f359523lc2)).addView(this.f218477f);
        VoiceSearchLayout voiceSearchLayout = this.f218477f;
        if (voiceSearchLayout != null) {
            voiceSearchLayout.setOnVisibleChangeListener(new C74372d());
        }
        if (this.f218481j.getCount() == 0) {
            this.f218480i.setSingleLine(false);
            this.f218480i.setPadding(40, 0, 40, 0);
            this.f218480i.setVisibility(0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f7421ft);
        initView();
        C97625j3.m125815e().mo123455a(138, this);
        C97625j3.m125812b().mo105907v().add(this.f218481j);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.ChatroomContactUI).mo86179qs(this, C76986a.GroupChatList);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        if (C97625j3.m125812b().mo105907v().get(this.f218484p) == null) {
            Log.m105920e("MicroMsg.ChatroomContactUI", "onCreateContextMenu, contact is null, username = " + this.f218484p);
        } else if (C45628s0.m50743H(this.f218484p)) {
            contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(view.getContext(), ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f218484p)));
            contextMenu.add(adapterContextMenuInfo.position, 1, 0, C0966R.string.f7452gn);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C97625j3.m125815e().mo123470p(138, this);
        C97625j3.m125812b().mo105907v().remove(this.f218481j);
        C74576w wVar = this.f218481j;
        C46863b bVar = wVar.f219225q;
        if (bVar != null) {
            bVar.mo72071a();
            wVar.f219225q = null;
        }
        this.f218481j.mo5580b();
        this.f218481j.f24699h = null;
        C75635b bVar2 = this.f218482n;
        C46863b bVar3 = bVar2.f222215z;
        if (bVar3 != null) {
            bVar3.mo72071a();
            bVar2.f222215z = null;
        }
        this.f218482n.mo5580b();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        ContactCountView contactCountView = this.f218476e;
        if (contactCountView != null) {
            contactCountView.setContactType(2);
            this.f218476e.mo7802a();
        }
    }

    public void onPause() {
        super.onPause();
        C97625j3.m125812b().mo105902q().remove(this);
        C114760b bVar = this.f218479h;
        if (bVar != null) {
            bVar.mo153850b();
            bVar.mo174407s();
        }
        C75635b bVar2 = this.f218482n;
        if (bVar2 != null) {
            C97625j3.m125815e().mo123470p(106, bVar2);
        }
    }

    public void onResume() {
        super.onResume();
        ContactCountView contactCountView = this.f218476e;
        if (contactCountView != null) {
            contactCountView.setContactType(2);
            this.f218476e.mo7802a();
        }
        C97625j3.m125812b().mo105902q().add(this);
        if (!(this.f218479h == null || this.f218477f == null)) {
            if (C76850a.m92642n() || !LocaleUtil.getApplicationLanguage().equals("zh_CN")) {
                this.f218479h.f344097r = false;
            } else {
                C114760b bVar = this.f218479h;
                bVar.f344097r = false;
                bVar.f344101v = this.f218477f;
                bVar.f344099t = 1;
                bVar.f344098s = 2;
            }
        }
        C75635b bVar2 = this.f218482n;
        if (bVar2 != null) {
            C97625j3.m125815e().mo123455a(106, bVar2);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (Util.isTopActivity(this) && !C74785j2.C6981a.m7247a(this, i, i2, str, 4) && i == 0 && i2 == 0 && yVar.getType() == 138) {
            C74576w wVar = this.f218481j;
            if (wVar != null) {
                wVar.mo7991f();
            }
            C75635b bVar = this.f218482n;
            if (bVar != null) {
                bVar.mo7991f();
            }
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C15691d.class);
    }
}
