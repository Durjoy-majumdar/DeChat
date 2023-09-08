package com.tencent.p014mm.plugin.multitalk.p078ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aw0.C103928o;
import b82.C0250b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MultiTalkActionEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74502i1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import gl3.C75922b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import nj3.C88989a;
import v82.C14412b1;
import v82.C52797q1;
import v82.C52800x;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI */
public class MultiTalkSelectContactUI extends MMBaseSelectContactUI {

    /* renamed from: C */
    public String f115193C;

    /* renamed from: D */
    public boolean f115194D = true;

    /* renamed from: E */
    public HashSet<String> f115195E;

    /* renamed from: F */
    public HashSet<String> f115196F;

    /* renamed from: G */
    public ArrayList<String> f115197G;

    /* renamed from: H */
    public boolean f115198H;

    /* renamed from: I */
    public C14412b1 f115199I;

    /* renamed from: J */
    public RecyclerView f115200J;

    /* renamed from: K */
    public FrameLayout f115201K;

    /* renamed from: L */
    public boolean f115202L = false;

    /* renamed from: M */
    public C52800x f115203M;

    /* renamed from: N */
    public View.OnClickListener f115204N = new C42578b();

    /* renamed from: P */
    public IListener f115205P = new IListener<MultiTalkActionEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1177822575;
        }

        public boolean callback(IEvent iEvent) {
            MultiTalkActionEvent multiTalkActionEvent = (MultiTalkActionEvent) iEvent;
            if (!(multiTalkActionEvent instanceof MultiTalkActionEvent) || multiTalkActionEvent.f154837d.f107635a != 0) {
                return false;
            }
            MultiTalkSelectContactUI.this.finish();
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI$b */
    public class C42578b implements View.OnClickListener {
        public C42578b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view instanceof ImageView) {
                String str = (String) view.getTag();
                C74502i1 N7 = MultiTalkSelectContactUI.this.mo103379N7();
                if (C75592q0.m90789s().equals(str)) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                MultiTalkSelectContactUI.this.mo103378K7();
                if (MultiTalkSelectContactUI.this.f115196F.contains(str)) {
                    MultiTalkSelectContactUI multiTalkSelectContactUI = MultiTalkSelectContactUI.this;
                    if (multiTalkSelectContactUI.f115198H) {
                        multiTalkSelectContactUI.f115199I.mo13696b(str);
                    }
                    MultiTalkSelectContactUI.this.f115196F.remove(str);
                    MultiTalkSelectContactUI.this.f115197G.remove(str);
                }
                MultiTalkSelectContactUI multiTalkSelectContactUI2 = MultiTalkSelectContactUI.this;
                ((C52797q1) MultiTalkSelectContactUI.this.f115200J.getAdapter()).mo73617g5(multiTalkSelectContactUI2.f115197G, multiTalkSelectContactUI2.f115204N);
                RecyclerView recyclerView = MultiTalkSelectContactUI.this.f115200J;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(recyclerView.getAdapter().getItemCount() - 1));
                C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                N7.notifyDataSetChanged();
                MultiTalkSelectContactUI.this.mo66670g8();
                MultiTalkSelectContactUI multiTalkSelectContactUI3 = MultiTalkSelectContactUI.this;
                multiTalkSelectContactUI3.f115201K.setContentDescription(((C52797q1) multiTalkSelectContactUI3.f115200J.getAdapter()).mo73615G4().toString());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI$a */
    public class C42579a implements MenuItem.OnMenuItemClickListener {
        public C42579a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00e1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onMenuItemClick(android.view.MenuItem r23) {
            /*
                r22 = this;
                r1 = r22
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isNetworkConnected(r0)
                r2 = 1
                r3 = 0
                if (r0 != 0) goto L_0x0018
                com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI r0 = com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkSelectContactUI.this
                r4 = 2131821610(0x7f11042a, float:1.9275968E38)
                dd0.C75346e.m90356b(r0, r4, r3)
                goto L_0x028a
            L_0x0018:
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI r4 = com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkSelectContactUI.this
                java.util.HashSet<java.lang.String> r4 = r4.f115196F
                r0.addAll(r4)
                java.lang.String r4 = eb0.C75592q0.m90789s()
                r0.add(r4)
                java.lang.String r4 = ","
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r0, r4)
                com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI r0 = com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkSelectContactUI.this
                boolean r6 = r0.f115198H
                r8 = 2
                r9 = 0
                if (r6 == 0) goto L_0x025b
                java.util.HashSet<java.lang.String> r0 = r0.f115196F
                int r0 = r0.size()
                com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI r6 = com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkSelectContactUI.this
                boolean r10 = r6.f115202L
                v82.b1 r6 = r6.f115199I
                int r6 = r6.f40009r
                java.lang.String r11 = ""
                com.tencent.p014mm.plugin.multitalk.model.C105853x.m142236g(r0, r10, r2, r11, r6)
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r6 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI r10 = com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkSelectContactUI.this
                java.lang.String r11 = r10.f115193C
                r0 = 5
                java.lang.Object[] r0 = new java.lang.Object[r0]
                boolean r12 = r6.f314493e
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
                r0[r9] = r12
                boolean r12 = r6.f314494f
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
                r0[r2] = r12
                boolean r12 = r6.f314497i
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
                r0[r8] = r12
                v82.h1 r12 = r6.f314505s
                java.lang.String r12 = r12.toString()
                r13 = 3
                r0[r13] = r12
                com.tencent.pb.talkroom.sdk.MultiTalkGroup r12 = r6.f314506t
                if (r12 != 0) goto L_0x007e
                r12 = 1
                goto L_0x007f
            L_0x007e:
                r12 = 0
            L_0x007f:
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
                r13 = 4
                r0[r13] = r12
                java.lang.String r12 = "MicroMsg.MT.MultiTalkManager"
                java.lang.String r13 = "createMultiTalk All Var Value:\n isMute: %b isHandsFree: %b isCameraFace: %b multiTalkStatus: %s groupIsNull: %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r0)
                com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r15 = 220(0xdc, double:1.087E-321)
                r17 = 0
                r19 = 1
                r21 = 0
                r14.idkeyStat(r15, r17, r19, r21)
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00c5 }
                java.lang.String r13 = "phone"
                java.lang.Object r0 = r0.getSystemService(r13)     // Catch:{ Exception -> 0x00c5 }
                android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x00c5 }
                if (r0 == 0) goto L_0x00c3
                int r0 = r0.getCallState()     // Catch:{ Exception -> 0x00c5 }
                if (r0 == r2) goto L_0x00b2
                if (r0 == r8) goto L_0x00b2
                r13 = 0
                goto L_0x00b3
            L_0x00b2:
                r13 = 1
            L_0x00b3:
                java.lang.String r14 = "TelephoneManager.callState is %d"
                java.lang.Object[] r15 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00c1 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00c1 }
                r15[r9] = r0     // Catch:{ Exception -> 0x00c1 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r14, r15)     // Catch:{ Exception -> 0x00c1 }
                goto L_0x00d4
            L_0x00c1:
                r0 = move-exception
                goto L_0x00c7
            L_0x00c3:
                r13 = 0
                goto L_0x00d4
            L_0x00c5:
                r0 = move-exception
                r13 = 0
            L_0x00c7:
                java.lang.Object[] r14 = new java.lang.Object[r2]
                java.lang.String r0 = r0.getLocalizedMessage()
                r14[r9] = r0
                java.lang.String r0 = "get callState error , errMsg is %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r0, r14)
            L_0x00d4:
                r0 = 2131821704(0x7f110488, float:1.9276159E38)
                if (r13 == 0) goto L_0x00e1
                r3 = 2131831439(0x7f112a8f, float:1.9295904E38)
                nj3.C76879j.m92738i(r10, r3, r0)
                goto L_0x028a
            L_0x00e1:
                boolean r13 = z33.C91617n.m114968f()
                if (r13 == 0) goto L_0x00ef
                r3 = 2131831444(0x7f112a94, float:1.9295914E38)
                nj3.C76879j.m92738i(r10, r3, r0)
                goto L_0x028a
            L_0x00ef:
                boolean r13 = z33.C91617n.m114970h()
                if (r13 == 0) goto L_0x00fd
                r3 = 2131831443(0x7f112a93, float:1.9295912E38)
                nj3.C76879j.m92738i(r10, r3, r0)
                goto L_0x028a
            L_0x00fd:
                boolean r13 = dd0.C75346e.m90355a()
                if (r13 == 0) goto L_0x010b
                r3 = 2131831438(0x7f112a8e, float:1.9295902E38)
                nj3.C76879j.m92738i(r10, r3, r0)
                goto L_0x028a
            L_0x010b:
                boolean r13 = z33.C91617n.m114969g()
                if (r13 == 0) goto L_0x0119
                r3 = 2131831442(0x7f112a92, float:1.929591E38)
                nj3.C76879j.m92738i(r10, r3, r0)
                goto L_0x028a
            L_0x0119:
                boolean r0 = r6.mo150682x()
                if (r0 == 0) goto L_0x0127
                r0 = 2131833187(0x7f113163, float:1.929945E38)
                dd0.C75346e.m90356b(r10, r0, r3)
                goto L_0x028a
            L_0x0127:
                long r13 = r6.f314460B
                long r13 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r13)
                boolean r0 = r6.f314459A
                if (r0 == 0) goto L_0x0184
                long r7 = r6.f314461C
                int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r0 >= 0) goto L_0x0184
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "createMultiTalk, isOverLoadFail is true! elapsedWaitMs:"
                r0.append(r3)
                r0.append(r13)
                java.lang.String r3 = ", overLoadFailTimeLimit:"
                r0.append(r3)
                long r3 = r6.f314461C
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
                long r3 = r6.f314461C
                long r3 = r3 - r13
                double r3 = (double) r3
                r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
                double r3 = r3 / r5
                double r3 = java.lang.Math.ceil(r3)
                int r0 = (int) r3
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r5 = 2131833230(0x7f11318e, float:1.9299536E38)
                java.lang.Object[] r6 = new java.lang.Object[r2]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r6[r9] = r0
                java.lang.String r0 = r4.getString(r5, r6)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r3, (java.lang.CharSequence) r0, (int) r9)
                r0.show()
                goto L_0x028a
            L_0x0184:
                r6.f314459A = r9
                java.lang.String[] r0 = r5.split(r4)
                java.util.ArrayList r0 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r0)
                h81.h$c r4 = h81.C32735h.C32737c.voipmt_mode
                java.lang.Class<h81.h> r7 = h81.C32735h.class
                gj.m r8 = p156gj.C107835h0.f322856m
                int r8 = r8.f322865E
                r10 = -1
                if (r8 == r10) goto L_0x01ad
                if (r8 == r2) goto L_0x01ab
                r3 = 2
                if (r8 == r3) goto L_0x01a9
                di3.d r7 = di3.C86312j.m106911c(r7)
                h81.h r7 = (h81.C32735h) r7
                int r4 = r7.mo58779Qe(r4, r9)
                goto L_0x01b7
            L_0x01a9:
                r4 = 0
                goto L_0x01b7
            L_0x01ab:
                r4 = 1
                goto L_0x01b7
            L_0x01ad:
                di3.d r7 = di3.C86312j.m106911c(r7)
                h81.h r7 = (h81.C32735h) r7
                int r4 = r7.mo58779Qe(r4, r9)
            L_0x01b7:
                java.lang.Object[] r7 = new java.lang.Object[r2]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
                r7[r9] = r8
                java.lang.String r8 = "getMultiTalkSDKMode sdk mode:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r8, r7)
                bp3.p r7 = bp3.C79758p.f233760a
                bp3.f r8 = bp3.C104160f.RepairerConfig_VOIP_MultitalkSDK_Int
                int r7 = r7.mo109882e(r8, r9)
                if (r7 == 0) goto L_0x01cf
                r4 = r7
            L_0x01cf:
                if (r4 != r2) goto L_0x01d6
                r3 = 2
                r6.mo150654c(r5, r11, r3)
                goto L_0x0242
            L_0x01d6:
                com.tencent.mm.plugin.multitalk.ilinkservice.z r3 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
                com.tencent.mm.plugin.multitalk.model.z r4 = new com.tencent.mm.plugin.multitalk.model.z
                r4.<init>(r6, r7, r5, r11)
                r3.getClass()
                java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r5 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                com.tencent.mm.ipcinvoker.wx_extension.j r5 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r5
                com.tencent.mm.plugin.multitalk.ilinkservice.q r7 = r3.f314394i
                r7.getClass()
                ob0.c$b r7 = new ob0.c$b
                r7.<init>()
                te3.ns4 r8 = new te3.ns4
                r8.<init>()
                r7.f127066a = r8
                te3.os4 r8 = new te3.os4
                r8.<init>()
                r7.f127067b = r8
                r8 = 5949(0x173d, float:8.336E-42)
                r7.f127069d = r8
                java.lang.String r8 = "/cgi-bin/micromsg-bin/voipmtgetsdkmode"
                r7.f127068c = r8
                r7.f127070e = r9
                r7.f127071f = r9
                java.util.LinkedList r8 = new java.util.LinkedList
                r8.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x0215:
                boolean r9 = r0.hasNext()
                if (r9 == 0) goto L_0x022c
                java.lang.Object r9 = r0.next()
                java.lang.String r9 = (java.lang.String) r9
                te3.et4 r10 = new te3.et4
                r10.<init>()
                r10.f133116d = r9
                r8.add(r10)
                goto L_0x0215
            L_0x022c:
                ob0.c r0 = r7.mo72403a()
                ob0.c$c r7 = r0.f127055a
                pe3.a r7 = r7.f127080a
                te3.ns4 r7 = (te3.ns4) r7
                r7.f138751g = r8
                r7.f138748d = r11
                com.tencent.mm.plugin.multitalk.ilinkservice.n0 r7 = new com.tencent.mm.plugin.multitalk.ilinkservice.n0
                r7.<init>(r3, r4)
                r5.mo63014eH(r0, r7)
            L_0x0242:
                com.tencent.mm.autogen.events.MultiTalkStatusEvent r0 = new com.tencent.mm.autogen.events.MultiTalkStatusEvent
                r0.<init>()
                com.tencent.mm.autogen.events.MultiTalkStatusEvent$a r3 = r0.f154840d
                r3.f154841a = r2
                r0.publish()
                oe.m r0 = new oe.m
                java.lang.String r3 = "MultiTalk"
                r0.<init>(r3)
                r6.f314488X = r0
                r0.mo182519b()
                goto L_0x028a
            L_0x025b:
                java.util.HashSet<java.lang.String> r0 = r0.f115196F
                int r0 = r0.size()
                com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI r4 = com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkSelectContactUI.this
                boolean r4 = r4.f115202L
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r6 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
                com.tencent.pb.talkroom.sdk.MultiTalkGroup r6 = r6.f314506t
                java.lang.String r6 = com.tencent.p014mm.plugin.multitalk.model.C105806i0.m142152e(r6)
                r3 = 2
                com.tencent.p014mm.plugin.multitalk.model.C105853x.m142236g(r0, r4, r3, r6, r9)
                com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI r0 = com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkSelectContactUI.this
                android.content.Intent r3 = r0.getIntent()
                java.lang.String r4 = "Select_Contact"
                android.content.Intent r3 = r3.putExtra(r4, r5)
                r4 = -1
                r0.setResult(r4, r3)
                com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI r0 = com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkSelectContactUI.this
                r0.f115194D = r9
                r0.finish()
            L_0x028a:
                com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI r0 = com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkSelectContactUI.this
                r0.hideVKB()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkSelectContactUI.C42579a.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return this.f115195E.contains(str);
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        return new C42580e(this, this.f115193C);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return new C42581f(this, this.f115193C);
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return getIntent().getStringExtra("titile");
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0193  */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64517R7(android.widget.AdapterView<?> r21, android.view.View r22, int r23, long r24) {
        /*
            r20 = this;
            r8 = r20
            com.tencent.mm.ui.contact.i1 r0 = r20.mo103379N7()
            android.widget.ListView r1 = r8.f218605d
            int r1 = r1.getHeaderViewsCount()
            int r1 = r23 - r1
            gl3.b r1 = r0.getItem(r1)
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r2 = r1.f222621r
            if (r2 != 0) goto L_0x001a
            return
        L_0x001a:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r2
            java.lang.String r2 = "MicroMsg.multitalk.MultiTalkSelectContactUI"
            java.lang.String r6 = "ClickUser=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r4)
            java.lang.String r1 = r1.f222621r
            java.lang.String r2 = eb0.C75592q0.m90789s()
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0034
            return
        L_0x0034:
            r20.mo103378K7()
            java.util.HashSet<java.lang.String> r2 = r8.f115195E
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L_0x0040
            return
        L_0x0040:
            java.util.HashSet<java.lang.String> r2 = r8.f115196F
            boolean r2 = r2.contains(r1)
            java.lang.String r4 = "userNameList[i]"
            r6 = 5
            java.lang.String r7 = "onClickListener"
            java.lang.String r9 = "userNameList"
            if (r2 == 0) goto L_0x00ee
            boolean r2 = r8.f115198H
            if (r2 == 0) goto L_0x0058
            v82.b1 r2 = r8.f115199I
            r2.mo13696b(r1)
        L_0x0058:
            java.util.HashSet<java.lang.String> r2 = r8.f115196F
            r2.remove(r1)
            java.util.ArrayList<java.lang.String> r2 = r8.f115197G
            int r2 = r2.indexOf(r1)
            java.util.ArrayList<java.lang.String> r10 = r8.f115197G
            r10.remove(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r8.f115200J
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            v82.q1 r1 = (v82.C52797q1) r1
            java.util.ArrayList<java.lang.String> r10 = r8.f115197G
            android.view.View$OnClickListener r11 = r8.f115204N
            r1.getClass()
            gy3.C87412m.m108594g(r10, r9)
            gy3.C87412m.m108594g(r11, r7)
            java.util.ArrayList<java.lang.String> r7 = r1.f147502e
            r7.clear()
            java.util.ArrayList<java.lang.String> r7 = r1.f147502e
            java.lang.String r9 = eb0.C75592q0.m90789s()
            r7.add(r9)
            int r7 = r10.size()
            r9 = 0
        L_0x0090:
            if (r9 >= r7) goto L_0x00bb
            java.lang.Object r12 = r10.get(r9)
            gy3.C87412m.m108593f(r12, r4)
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = r1.mo73614F4(r12)
            if (r12 != 0) goto L_0x00b8
            java.lang.Object r12 = r10.get(r9)
            java.lang.String r13 = eb0.C75592q0.m90789s()
            boolean r12 = gy3.C87412m.m108589b(r12, r13)
            if (r12 != 0) goto L_0x00b8
            java.util.ArrayList<java.lang.String> r12 = r1.f147502e
            java.lang.Object r13 = r10.get(r9)
            r12.add(r13)
        L_0x00b8:
            int r9 = r9 + 1
            goto L_0x0090
        L_0x00bb:
            r1.f147503f = r11
            java.util.ArrayList<java.lang.String> r4 = r1.f147502e
            int r4 = r4.size()
            if (r4 >= r6) goto L_0x00d1
            r4 = 0
        L_0x00c6:
            if (r4 >= r6) goto L_0x00d1
            int r7 = r1.f147504g
            int r7 = r7 + r4
            r1.notifyItemChanged(r7)
            int r4 = r4 + 1
            goto L_0x00c6
        L_0x00d1:
            int r4 = r1.f147504g
            int r2 = r2 + r4
            r1.notifyItemRemoved(r2)
            android.widget.FrameLayout r1 = r8.f115201K
            androidx.recyclerview.widget.RecyclerView r2 = r8.f115200J
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            v82.q1 r2 = (v82.C52797q1) r2
            java.lang.StringBuffer r2 = r2.mo73615G4()
            java.lang.String r2 = r2.toString()
            r1.setContentDescription(r2)
            goto L_0x0252
        L_0x00ee:
            java.util.HashSet<java.lang.String> r2 = r8.f115195E
            int r2 = r2.size()
            java.util.HashSet<java.lang.String> r10 = r8.f115196F
            int r10 = r10.size()
            int r2 = r2 + r10
            int r10 = c92.C104331h.m139313e()
            if (r2 != r10) goto L_0x01ba
            r8.f115202L = r3
            boolean r0 = c92.C39929d.m42713k()
            if (r0 == 0) goto L_0x019b
            java.lang.String r0 = c92.C39929d.m42706d()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0128
            java.lang.String r0 = c92.C39929d.m42707e()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0128
            java.lang.String r0 = c92.C39929d.m42706d()
            java.lang.String r1 = c92.C39929d.m42707e()
            goto L_0x0151
        L_0x0128:
            boolean r0 = c92.C39929d.m42714l()
            if (r0 == 0) goto L_0x013d
            r0 = 2131833222(0x7f113186, float:1.929952E38)
            java.lang.String r0 = r8.getString(r0)
            r1 = 2131833200(0x7f113170, float:1.9299475E38)
            java.lang.String r1 = r8.getString(r1)
            goto L_0x0151
        L_0x013d:
            boolean r0 = c92.C39929d.m42716n()
            if (r0 == 0) goto L_0x0154
            r0 = 2131833223(0x7f113187, float:1.9299522E38)
            java.lang.String r0 = r8.getString(r0)
            r1 = 2131833201(0x7f113171, float:1.9299477E38)
            java.lang.String r1 = r8.getString(r1)
        L_0x0151:
            r3 = r1
            r1 = r0
            goto L_0x0155
        L_0x0154:
            r3 = r1
        L_0x0155:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 != 0) goto L_0x0193
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x0162
            goto L_0x0193
        L_0x0162:
            r0 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r4 = r8.getString(r0)
            c92.b r5 = new c92.b
            r5.<init>(r8)
            c92.c r6 = new c92.c
            r6.<init>()
            r7 = 2131099850(0x7f0600ca, float:1.7812065E38)
            java.lang.String r2 = ""
            r0 = r20
            nj3.C76879j.m92708B(r0, r1, r2, r3, r4, r5, r6, r7)
            int r9 = c92.C39929d.m42711i()
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            java.lang.String r18 = ""
            c92.C39930e.m42720c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x01b9
        L_0x0193:
            java.lang.String r0 = "MicroMsg.MeetingLinkHelper"
            java.lang.String r1 = "cannot get dialog wording, ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x01b9
        L_0x019b:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131833240(0x7f113198, float:1.9299556E38)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            int r3 = c92.C104331h.m139313e()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r5] = r3
            java.lang.String r0 = r0.getString(r1, r2)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r8, (java.lang.CharSequence) r0, (int) r5)
            r0.show()
        L_0x01b9:
            return
        L_0x01ba:
            boolean r2 = r8.f115198H
            if (r2 == 0) goto L_0x01c3
            v82.b1 r2 = r8.f115199I
            r2.mo13695a(r1)
        L_0x01c3:
            java.util.HashSet<java.lang.String> r2 = r8.f115196F
            r2.add(r1)
            java.util.ArrayList<java.lang.String> r2 = r8.f115197G
            r2.add(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r8.f115200J
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            v82.q1 r1 = (v82.C52797q1) r1
            java.util.ArrayList<java.lang.String> r2 = r8.f115197G
            android.view.View$OnClickListener r10 = r8.f115204N
            r1.getClass()
            gy3.C87412m.m108594g(r2, r9)
            gy3.C87412m.m108594g(r10, r7)
            java.util.ArrayList<java.lang.String> r7 = r1.f147502e
            r7.clear()
            java.util.ArrayList<java.lang.String> r7 = r1.f147502e
            java.lang.String r9 = eb0.C75592q0.m90789s()
            r7.add(r9)
            int r7 = r2.size()
            r9 = 0
        L_0x01f5:
            if (r9 >= r7) goto L_0x0220
            java.lang.Object r11 = r2.get(r9)
            gy3.C87412m.m108593f(r11, r4)
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = r1.mo73614F4(r11)
            if (r11 != 0) goto L_0x021d
            java.lang.Object r11 = r2.get(r9)
            java.lang.String r12 = eb0.C75592q0.m90789s()
            boolean r11 = gy3.C87412m.m108589b(r11, r12)
            if (r11 != 0) goto L_0x021d
            java.util.ArrayList<java.lang.String> r11 = r1.f147502e
            java.lang.Object r12 = r2.get(r9)
            r11.add(r12)
        L_0x021d:
            int r9 = r9 + 1
            goto L_0x01f5
        L_0x0220:
            r1.f147503f = r10
            java.util.ArrayList<java.lang.String> r2 = r1.f147502e
            int r2 = r2.size()
            if (r2 >= r6) goto L_0x0236
            r2 = 0
        L_0x022b:
            if (r2 >= r6) goto L_0x0236
            int r4 = r1.f147504g
            int r4 = r4 + r2
            r1.notifyItemChanged(r4)
            int r2 = r2 + 1
            goto L_0x022b
        L_0x0236:
            int r2 = r1.getItemCount()
            r1.notifyItemInserted(r2)
            android.widget.FrameLayout r1 = r8.f115201K
            androidx.recyclerview.widget.RecyclerView r2 = r8.f115200J
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            v82.q1 r2 = (v82.C52797q1) r2
            java.lang.StringBuffer r2 = r2.mo73615G4()
            java.lang.String r2 = r2.toString()
            r1.setContentDescription(r2)
        L_0x0252:
            androidx.recyclerview.widget.RecyclerView r1 = r8.f115200J
            androidx.recyclerview.widget.RecyclerView$e r2 = r1.getAdapter()
            int r2 = r2.getItemCount()
            int r2 = r2 - r3
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r10 = r3.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI"
            java.lang.String r12 = "handleItemClick"
            java.lang.String r13 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r14 = "Undefined"
            java.lang.String r15 = "scrollToPosition"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r3.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.mo17115r1(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI"
            java.lang.String r11 = "handleItemClick"
            java.lang.String r12 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "scrollToPosition"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            r0.notifyDataSetChanged()
            r20.mo66670g8()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkSelectContactUI.mo64517R7(android.widget.AdapterView, android.view.View, int, long):void");
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f115198H = getIntent().getBooleanExtra("key_need_gallery", false);
        String stringExtra = getIntent().getStringExtra("chatroomName");
        this.f115193C = stringExtra;
        if (!C72996z1.m85820U5(stringExtra)) {
            finish();
        }
        this.f115196F = new HashSet<>();
        this.f115195E = new HashSet<>();
        this.f115197G = new ArrayList<>();
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return false;
    }

    /* renamed from: Z7 */
    public void mo66629Z7() {
        super.mo66629Z7();
        hideVKB();
        if (this.f115194D) {
            C103928o.m138642b();
        }
    }

    /* renamed from: g8 */
    public final void mo66670g8() {
        if (this.f115196F.size() > 0) {
            updateOptionMenuText(1, getString(C0966R.string.h0e, new Object[]{Integer.valueOf(this.f115195E.size() + this.f115196F.size())}));
            enableOptionMenu(1, true);
            return;
        }
        updateOptionMenuText(1, getString(C0966R.string.h0f));
        enableOptionMenu(1, false);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359903bi2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r11 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            super.initView()
            v82.x r1 = new v82.x
            r1.<init>(r11)
            r11.f115203M = r1
            boolean r1 = r1.f147509b
            r2 = 1
            r3 = 0
            r4 = -1
            if (r1 != 0) goto L_0x0143
            boolean r1 = c92.C39929d.m42713k()
            if (r1 == 0) goto L_0x0143
            v82.x r1 = r11.f115203M
            android.widget.ListView r5 = r11.f218605d
            android.content.Context r6 = r1.f147508a
            r7 = 2131496725(0x7f0c0f15, float:1.8617023E38)
            r8 = 0
            android.view.View r6 = android.view.View.inflate(r6, r7, r8)
            r1.f147510c = r6
            android.view.ViewTreeObserver r6 = r6.getViewTreeObserver()
            android.view.ViewTreeObserver$OnDrawListener r7 = r1.f147515h
            r6.addOnDrawListener(r7)
            android.view.View r6 = r1.f147510c
            v82.y r7 = new v82.y
            r7.<init>(r1)
            r6.setOnClickListener(r7)
            android.view.View r6 = r1.f147510c
            r7 = 2131309195(0x7f09328b, float:1.8236667E38)
            android.view.View r6 = r6.findViewById(r7)
            com.tencent.mm.ui.base.WxImageView r6 = (com.tencent.p014mm.p136ui.base.WxImageView) r6
            r1.f147511d = r6
            android.view.View r6 = r1.f147510c
            r7 = 2131309096(0x7f093228, float:1.8236466E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.f147513f = r6
            android.view.View r6 = r1.f147510c
            r7 = 2131309097(0x7f093229, float:1.8236468E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.f147512e = r6
            android.view.View r6 = r1.f147510c
            r7 = 2131309488(0x7f0933b0, float:1.8237261E38)
            android.view.View r6 = r6.findViewById(r7)
            com.tencent.mm.ui.base.WxImageView r6 = (com.tencent.p014mm.p136ui.base.WxImageView) r6
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 2131755951(0x7f1003af, float:1.9142796E38)
            android.graphics.drawable.Drawable r7 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r7, r9, r4)
            r6.setBackground(r7)
            java.lang.String r6 = c92.C39929d.m42705c()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x00a3
            java.lang.String r6 = c92.C39929d.m42704b()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x00a3
            android.widget.TextView r6 = r1.f147512e
            java.lang.String r7 = c92.C39929d.m42705c()
            r6.setText(r7)
            android.widget.TextView r6 = r1.f147513f
            java.lang.String r7 = c92.C39929d.m42704b()
            r6.setText(r7)
            goto L_0x00d0
        L_0x00a3:
            boolean r6 = c92.C39929d.m42714l()
            if (r6 == 0) goto L_0x00ba
            android.widget.TextView r6 = r1.f147512e
            r7 = 2131833263(0x7f1131af, float:1.9299603E38)
            r6.setText(r7)
            android.widget.TextView r6 = r1.f147513f
            r7 = 2131832830(0x7f112ffe, float:1.9298725E38)
            r6.setText(r7)
            goto L_0x00d0
        L_0x00ba:
            boolean r6 = c92.C39929d.m42716n()
            if (r6 == 0) goto L_0x00d2
            android.widget.TextView r6 = r1.f147512e
            r7 = 2131833264(0x7f1131b0, float:1.9299605E38)
            r6.setText(r7)
            android.widget.TextView r6 = r1.f147513f
            r7 = 2131840226(0x7f114ce2, float:1.9313726E38)
            r6.setText(r7)
        L_0x00d0:
            r6 = 1
            goto L_0x00d3
        L_0x00d2:
            r6 = 0
        L_0x00d3:
            di3.d r7 = di3.C86312j.m106911c(r0)
            h81.h r7 = (h81.C32735h) r7
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_multitalk_ad_icon1
            java.lang.String r10 = ""
            java.lang.String r7 = r7.Y60(r9, r10)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x00fe
            gc0.a r7 = gc0.C20828a.m22825b()
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            java.lang.String r0 = r0.Y60(r9, r10)
            v82.z r9 = new v82.z
            r9.<init>(r1)
            r7.mo32524m(r0, r8, r9)
            goto L_0x012b
        L_0x00fe:
            boolean r0 = c92.C39929d.m42714l()
            if (r0 == 0) goto L_0x0115
            com.tencent.mm.ui.base.WxImageView r0 = r1.f147511d
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 2131756464(0x7f1005b0, float:1.9143836E38)
            android.graphics.drawable.Drawable r7 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r7, r8, r4)
            r0.setBackground(r7)
            goto L_0x012b
        L_0x0115:
            boolean r0 = c92.C39929d.m42716n()
            if (r0 == 0) goto L_0x012b
            com.tencent.mm.ui.base.WxImageView r0 = r1.f147511d
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 2131756488(0x7f1005c8, float:1.9143885E38)
            android.graphics.drawable.Drawable r7 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r7, r8, r4)
            r0.setBackground(r7)
        L_0x012b:
            android.view.View r0 = r1.f147510c
            r5.removeFooterView(r0)
            if (r6 == 0) goto L_0x013a
            r1.f147509b = r2
            android.view.View r0 = r1.f147510c
            r5.addFooterView(r0)
            goto L_0x0143
        L_0x013a:
            r1.f147509b = r2
            java.lang.String r0 = "MicroMsg.MeetingLinkFooter"
            java.lang.String r1 = "not get wording, not show footer"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x0143:
            android.content.res.Resources r0 = r11.getResources()
            r1 = 2131100364(0x7f0602cc, float:1.7813107E38)
            int r0 = r0.getColor(r1)
            r11.setActionbarColor(r0)
            r11.hideActionbarLine()
            java.lang.String r0 = "#232323"
            int r0 = android.graphics.Color.parseColor(r0)
            r11.setNavigationbarColor(r0)
            v82.b1 r0 = new v82.b1
            r0.<init>(r11)
            r11.f115199I = r0
            r0 = 2131833228(0x7f11318c, float:1.9299532E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.util.HashSet<java.lang.String> r5 = r11.f115195E
            int r5 = r5.size()
            java.util.HashSet<java.lang.String> r6 = r11.f115196F
            int r6 = r6.size()
            int r5 = r5 + r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r3] = r5
            java.lang.String r0 = r11.getString(r0, r1)
            boolean r1 = r11.f115198H
            if (r1 == 0) goto L_0x01a0
            r0 = 2131833248(0x7f1131a0, float:1.9299573E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.util.HashSet<java.lang.String> r2 = r11.f115195E
            int r2 = r2.size()
            java.util.HashSet<java.lang.String> r5 = r11.f115196F
            int r5 = r5.size()
            int r2 = r2 + r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r3] = r2
            java.lang.String r0 = r11.getString(r0, r1)
        L_0x01a0:
            r7 = r0
            r6 = 1
            com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI$a r8 = new com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI$a
            r8.<init>()
            r9 = 0
            com.tencent.mm.ui.MMActivityController$r r10 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.GREEN
            r5 = r11
            r5.addTextOptionMenu(r6, r7, r8, r9, r10)
            r11.mo66670g8()
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView r0 = r11.f218609h
            r1 = 2131100377(0x7f0602d9, float:1.7813134E38)
            r0.setBackgroundResource(r1)
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView r0 = r11.f218609h
            android.widget.EditText r0 = r0.getInputText()
            if (r0 == 0) goto L_0x01c4
            r0.setTextColor(r4)
        L_0x01c4:
            r11.mo103385d8()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkSelectContactUI.initView():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        C52800x xVar = this.f115203M;
        View view = xVar.f147510c;
        if (!(view == null || xVar.f147515h == null)) {
            view.getViewTreeObserver().removeOnDrawListener(xVar.f147515h);
            xVar.f147508a = null;
        }
        this.f115205P.dead();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C103928o.m138641a(true, false, true);
    }

    public void onStart() {
        super.onStart();
        String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!Util.isNullOrNil(stringExtra)) {
            this.f115195E.addAll(Util.stringsToList(stringExtra.split(",")));
        }
        this.f115195E.add(C75592q0.m90789s());
        this.f115197G.addAll(this.f115195E);
        if (this.f115198H) {
            this.f115199I.mo13695a(C75592q0.m90789s());
        }
        this.f115200J = (RecyclerView) findViewById(C0966R.C0970id.jn4);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.mo16974W(0);
        this.f115200J.setLayoutManager(linearLayoutManager);
        this.f115200J.setAdapter(new C52797q1(this));
        ((C52797q1) this.f115200J.getAdapter()).mo73617g5(this.f115197G, this.f115204N);
        this.f115205P.alive();
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.jn5);
        this.f115201K = frameLayout;
        frameLayout.setContentDescription(((C52797q1) this.f115200J.getAdapter()).mo73615G4().toString());
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C0250b.class);
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return this.f115196F.contains(str);
    }
}
