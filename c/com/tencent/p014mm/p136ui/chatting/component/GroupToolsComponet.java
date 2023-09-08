package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NotifyGroupToolsEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatRoomToolPanelOperateLogStruct;
import com.tencent.p014mm.chatroom.p015ui.GroupToolsManagereUI;
import com.tencent.p014mm.chatroom.storage.GroupToolItem;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.p136ui.chatting.view.C73884e;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.util.FrequentLimiter;
import di0.C86299o;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kr0.C76629w0;
import kr0.C76630x0;
import ky2.C10432i;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76879j;
import p182kk.C61104a;
import p270xi.C91212b;
import p447aw.C103918d;
import p644pi.C77089d;
import p684si.C36674e;
import p744wt.C66190c;
import qo3.C77407n;
import qo3.C89779i0;
import wm0.C91035a;
import zj3.C79340b0;

@C91212b(exportInterface = C79340b0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet */
public class GroupToolsComponet extends C73412a implements C79340b0 {

    /* renamed from: G */
    public static final Long f215590G = Long.valueOf(FrequentLimiter.WEEK_MILLS);

    /* renamed from: A */
    public boolean f215591A = false;

    /* renamed from: B */
    public C73372j f215592B = new C73368e();

    /* renamed from: C */
    public C73372j f215593C = new C73369f();

    /* renamed from: D */
    public IListener<NotifyGroupToolsEvent> f215594D = new IListener<NotifyGroupToolsEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1721696603;
        }

        public boolean callback(IEvent iEvent) {
            NotifyGroupToolsEvent notifyGroupToolsEvent = (NotifyGroupToolsEvent) iEvent;
            if (notifyGroupToolsEvent != null) {
                Log.m105925i("MicroMsg.roomtools.GroupToolsComponet", "NotifyGroupToolsEvent %s", Util.nullAs(notifyGroupToolsEvent.f78878d.f78879a, ""));
                if (Util.isEqual(GroupToolsComponet.this.f215752d.mo91577r(), notifyGroupToolsEvent.f78878d.f78879a)) {
                    C73884e eVar = GroupToolsComponet.this.f215609t;
                    if (eVar != null) {
                        eVar.mo102946b();
                    }
                    GroupToolsComponet.this.mo102227c6(true);
                }
            }
            return true;
        }
    };

    /* renamed from: E */
    public View.OnClickListener f215595E = new C57672g();

    /* renamed from: F */
    public Runnable f215596F = new C30812d();

    /* renamed from: e */
    public View f215597e;

    /* renamed from: f */
    public LinearLayout f215598f;

    /* renamed from: g */
    public NestedScrollView f215599g;

    /* renamed from: h */
    public LinearLayout f215600h;

    /* renamed from: i */
    public LinearLayout f215601i;

    /* renamed from: j */
    public RecyclerView f215602j;

    /* renamed from: n */
    public LinearLayout f215603n;

    /* renamed from: o */
    public LinearLayout f215604o;

    /* renamed from: p */
    public RecyclerView f215605p;

    /* renamed from: q */
    public RelativeLayout f215606q;

    /* renamed from: r */
    public ImageView f215607r;

    /* renamed from: s */
    public View f215608s;

    /* renamed from: t */
    public C73884e f215609t;

    /* renamed from: u */
    public C89779i0 f215610u = null;

    /* renamed from: v */
    public C73374m f215611v;

    /* renamed from: w */
    public C73374m f215612w;

    /* renamed from: x */
    public Thread f215613x;

    /* renamed from: y */
    public C36674e f215614y = null;

    /* renamed from: z */
    public ArrayList<GroupToolItem> f215615z = new ArrayList<>();

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$a */
    public class C30811a implements Comparator<GroupToolItem> {
        public C30811a(GroupToolsComponet groupToolsComponet) {
        }

        public int compare(Object obj, Object obj2) {
            return Long.compare(((GroupToolItem) obj2).f79320f, ((GroupToolItem) obj).f79320f);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$d */
    public class C30812d implements Runnable {

        /* renamed from: d */
        public ArrayList<GroupToolItem> f82817d = new ArrayList<>();

        /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$d$a */
        public class C30813a implements Comparator<GroupToolItem> {
            public C30813a(C30812d dVar) {
            }

            public int compare(Object obj, Object obj2) {
                return Long.compare(((GroupToolItem) obj2).f79320f, ((GroupToolItem) obj).f79320f);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$d$b */
        public class C30814b implements Runnable {
            public C30814b() {
            }

            public void run() {
                C89779i0 i0Var = GroupToolsComponet.this.f215610u;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                GroupToolsComponet.this.mo102228d6();
            }
        }

        public C30812d() {
        }

        /* renamed from: a */
        public final boolean mo57730a() {
            return this.f82817d.size() >= 20;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
            if ((r12.f195582i == 44) != false) goto L_0x00f3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
            r11 = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r1 = r22
                java.lang.Class<pi.d> r0 = p644pi.C77089d.class
                java.lang.String r2 = "MicroMsg.roomtools.GroupToolsComponet"
                long r3 = eb0.C31543z5.m39453c()
                long r5 = java.lang.System.currentTimeMillis()
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x0016
                long r3 = java.lang.System.currentTimeMillis()
            L_0x0016:
                long r5 = eb0.C31543z5.m39453c()
                di3.d r7 = di3.C86312j.m106911c(r0)
                pi.d r7 = (p644pi.C77089d) r7
                si.f r7 = r7.xx0()
                com.tencent.mm.ui.chatting.component.GroupToolsComponet r8 = com.tencent.p014mm.p136ui.chatting.component.GroupToolsComponet.this
                ck3.b r8 = r8.f215752d
                java.lang.String r8 = r8.mo91577r()
                si.e r7 = r7.mo60800jo(r8)
                r8 = 2
                java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r11 = r1.f82817d     // Catch:{ Exception -> 0x023c }
                r11.clear()     // Catch:{ Exception -> 0x023c }
                r11 = 0
                r12 = 0
            L_0x0038:
                boolean r13 = java.lang.Thread.interrupted()     // Catch:{ Exception -> 0x023c }
                r14 = 4
                if (r13 != 0) goto L_0x0172
                boolean r13 = r22.mo57730a()     // Catch:{ Exception -> 0x023c }
                if (r13 != 0) goto L_0x0172
                if (r11 != 0) goto L_0x0172
                r13 = 26
                if (r12 >= r13) goto L_0x0172
                java.lang.Class<f62.k0> r13 = f62.C75700k0.class
                k40.a r13 = f40.C86709a0.m107533q(r13)     // Catch:{ Exception -> 0x023c }
                f62.k0 r13 = (f62.C75700k0) r13     // Catch:{ Exception -> 0x023c }
                g62.l r13 = r13.mo96095LE()     // Catch:{ Exception -> 0x023c }
                com.tencent.mm.ui.chatting.component.GroupToolsComponet r15 = com.tencent.p014mm.p136ui.chatting.component.GroupToolsComponet.this     // Catch:{ Exception -> 0x023c }
                ck3.b r15 = r15.f215752d     // Catch:{ Exception -> 0x023c }
                java.lang.String r17 = r15.mo91577r()     // Catch:{ Exception -> 0x023c }
                int r15 = r12 + 1
                long r9 = (long) r15     // Catch:{ Exception -> 0x023c }
                java.lang.Long r16 = com.tencent.p014mm.p136ui.chatting.component.GroupToolsComponet.f215590G     // Catch:{ Exception -> 0x023c }
                long r18 = r16.longValue()     // Catch:{ Exception -> 0x023c }
                java.lang.Long.signum(r9)
                long r9 = r9 * r18
                long r18 = r3 - r9
                long r9 = (long) r12
                long r20 = r16.longValue()     // Catch:{ Exception -> 0x023c }
                java.lang.Long.signum(r9)
                long r9 = r9 * r20
                long r20 = r3 - r9
                r16 = r13
                com.tencent.mm.storage.g4 r16 = (com.tencent.p014mm.storage.C72972g4) r16     // Catch:{ Exception -> 0x023c }
                java.util.List r9 = r16.mo101113fY(r17, r18, r20)     // Catch:{ Exception -> 0x023c }
                java.lang.String r10 = "getRecentUseToolTask i:%s size:%s"
                java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x023c }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x023c }
                r16 = 0
                r13[r16] = r12     // Catch:{ Exception -> 0x023c }
                if (r9 == 0) goto L_0x0099
                r12 = r9
                java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ Exception -> 0x023c }
                int r12 = r12.size()     // Catch:{ Exception -> 0x023c }
                goto L_0x009a
            L_0x0099:
                r12 = 0
            L_0x009a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x023c }
                r16 = 1
                r13[r16] = r12     // Catch:{ Exception -> 0x023c }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r13)     // Catch:{ Exception -> 0x023c }
                if (r9 == 0) goto L_0x0169
                java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ Exception -> 0x023c }
                int r10 = r9.size()     // Catch:{ Exception -> 0x023c }
                if (r10 != 0) goto L_0x00b1
                goto L_0x0169
            L_0x00b1:
                java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x023c }
            L_0x00b5:
                boolean r10 = r9.hasNext()     // Catch:{ Exception -> 0x023c }
                if (r10 == 0) goto L_0x0160
                java.lang.Object r10 = r9.next()     // Catch:{ Exception -> 0x023c }
                com.tencent.mm.storage.f4 r10 = (com.tencent.p014mm.storage.C72963f4) r10     // Catch:{ Exception -> 0x023c }
                int r12 = r10.f230723F     // Catch:{ Exception -> 0x023c }
                r12 = r12 & r14
                if (r12 == r14) goto L_0x0158
                int r12 = r10.getType()     // Catch:{ Exception -> 0x023c }
                r13 = 10000(0x2710, float:1.4013E-41)
                if (r12 != r13) goto L_0x00d0
                goto L_0x0158
            L_0x00d0:
                java.lang.String r12 = r10.getContent()     // Catch:{ Exception -> 0x023c }
                r13 = 0
                com.tencent.mm.message.l$b r12 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r12, r13)     // Catch:{ Exception -> 0x023c }
                if (r12 != 0) goto L_0x00e2
                java.lang.String r10 = "content is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r10)     // Catch:{ Exception -> 0x023c }
                goto L_0x0158
            L_0x00e2:
                boolean r13 = kb0.C33860c.m40172a(r12)     // Catch:{ Exception -> 0x023c }
                if (r13 != 0) goto L_0x00f3
                int r12 = r12.f195582i     // Catch:{ Exception -> 0x023c }
                r13 = 44
                if (r12 != r13) goto L_0x00f0
                r12 = 1
                goto L_0x00f1
            L_0x00f0:
                r12 = 0
            L_0x00f1:
                if (r12 == 0) goto L_0x0124
            L_0x00f3:
                com.tencent.mm.chatroom.storage.GroupToolItem r12 = p203mi.C34572d0.m40391b(r10)     // Catch:{ Exception -> 0x023c }
                if (r12 == 0) goto L_0x0124
                java.lang.String r13 = "getRecentUseToolTask add:%s"
                r14 = 1
                java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x023c }
                java.lang.String r14 = r12.toString()     // Catch:{ Exception -> 0x023c }
                r18 = 0
                r8[r18] = r14     // Catch:{ Exception -> 0x023c }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r13, r8)     // Catch:{ Exception -> 0x023c }
                java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r8 = r1.f82817d     // Catch:{ Exception -> 0x023c }
                boolean r8 = r8.contains(r12)     // Catch:{ Exception -> 0x023c }
                if (r8 == 0) goto L_0x0113
                r8 = 0
                goto L_0x0119
            L_0x0113:
                java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r8 = r1.f82817d     // Catch:{ Exception -> 0x023c }
                r8.add(r12)     // Catch:{ Exception -> 0x023c }
                r8 = 1
            L_0x0119:
                if (r8 == 0) goto L_0x0124
                boolean r8 = r22.mo57730a()     // Catch:{ Exception -> 0x023c }
                if (r8 == 0) goto L_0x0124
                r18 = r3
                goto L_0x0156
            L_0x0124:
                boolean r8 = p203mi.C34572d0.m40393d(r10)     // Catch:{ Exception -> 0x023c }
                if (r8 == 0) goto L_0x0158
                java.lang.String r8 = "getRecentUseToolTask add:AAPay"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r8)     // Catch:{ Exception -> 0x023c }
                com.tencent.mm.chatroom.storage.GroupToolItem r8 = new com.tencent.mm.chatroom.storage.GroupToolItem     // Catch:{ Exception -> 0x023c }
                java.lang.String r12 = "roomaa@app.origin"
                java.lang.String r13 = ""
                r18 = r3
                long r3 = r10.getCreateTime()     // Catch:{ Exception -> 0x023c }
                r8.<init>(r12, r13, r3)     // Catch:{ Exception -> 0x023c }
                java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r3 = r1.f82817d     // Catch:{ Exception -> 0x023c }
                boolean r3 = r3.contains(r8)     // Catch:{ Exception -> 0x023c }
                if (r3 == 0) goto L_0x0148
                r3 = 0
                goto L_0x014e
            L_0x0148:
                java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r3 = r1.f82817d     // Catch:{ Exception -> 0x023c }
                r3.add(r8)     // Catch:{ Exception -> 0x023c }
                r3 = 1
            L_0x014e:
                if (r3 == 0) goto L_0x015a
                boolean r3 = r22.mo57730a()     // Catch:{ Exception -> 0x023c }
                if (r3 == 0) goto L_0x015a
            L_0x0156:
                r11 = 1
                goto L_0x0162
            L_0x0158:
                r18 = r3
            L_0x015a:
                r3 = r18
                r8 = 2
                r14 = 4
                goto L_0x00b5
            L_0x0160:
                r18 = r3
            L_0x0162:
                boolean r3 = r22.mo57730a()     // Catch:{ Exception -> 0x023c }
                if (r3 == 0) goto L_0x016c
                goto L_0x016b
            L_0x0169:
                r18 = r3
            L_0x016b:
                r11 = 1
            L_0x016c:
                r12 = r15
                r3 = r18
                r8 = 2
                goto L_0x0038
            L_0x0172:
                java.lang.String r3 = "getRecentUseToolTask recentItemList:%s %s"
                r4 = 2
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x023c }
                java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r4 = r1.f82817d     // Catch:{ Exception -> 0x023c }
                int r4 = r4.size()     // Catch:{ Exception -> 0x023c }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x023c }
                r9 = 0
                r8[r9] = r4     // Catch:{ Exception -> 0x023c }
                com.tencent.mm.ui.chatting.component.GroupToolsComponet r4 = com.tencent.p014mm.p136ui.chatting.component.GroupToolsComponet.this     // Catch:{ Exception -> 0x023c }
                java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r9 = r1.f82817d     // Catch:{ Exception -> 0x023c }
                r4.getClass()     // Catch:{ Exception -> 0x023c }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023c }
                r4.<init>()     // Catch:{ Exception -> 0x023c }
                java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x023c }
            L_0x0194:
                boolean r10 = r9.hasNext()     // Catch:{ Exception -> 0x023c }
                if (r10 == 0) goto L_0x01a9
                java.lang.Object r10 = r9.next()     // Catch:{ Exception -> 0x023c }
                com.tencent.mm.chatroom.storage.GroupToolItem r10 = (com.tencent.p014mm.chatroom.storage.GroupToolItem) r10     // Catch:{ Exception -> 0x023c }
                r4.append(r10)     // Catch:{ Exception -> 0x023c }
                java.lang.String r10 = ","
                r4.append(r10)     // Catch:{ Exception -> 0x023c }
                goto L_0x0194
            L_0x01a9:
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x023c }
                r9 = 1
                r8[r9] = r4     // Catch:{ Exception -> 0x023c }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r8)     // Catch:{ Exception -> 0x023c }
                if (r7 != 0) goto L_0x01c9
                si.e r3 = new si.e     // Catch:{ Exception -> 0x023c }
                r3.<init>()     // Catch:{ Exception -> 0x023c }
                com.tencent.mm.ui.chatting.component.GroupToolsComponet r4 = com.tencent.p014mm.p136ui.chatting.component.GroupToolsComponet.this     // Catch:{ Exception -> 0x01c7 }
                ck3.b r4 = r4.f215752d     // Catch:{ Exception -> 0x01c7 }
                java.lang.String r4 = r4.mo91577r()     // Catch:{ Exception -> 0x01c7 }
                r3.field_chatroomname = r4     // Catch:{ Exception -> 0x01c7 }
                r7 = r3
                r3 = 0
                goto L_0x01ca
            L_0x01c7:
                r0 = move-exception
                goto L_0x023e
            L_0x01c9:
                r3 = 1
            L_0x01ca:
                r4 = 1
                r7.field_queryState = r4     // Catch:{ Exception -> 0x023c }
                java.util.LinkedList<com.tencent.mm.chatroom.storage.GroupToolItem> r4 = r7.f97470u     // Catch:{ Exception -> 0x023c }
                int r4 = r4.size()     // Catch:{ Exception -> 0x023c }
                java.util.LinkedList<com.tencent.mm.chatroom.storage.GroupToolItem> r8 = r7.f97470u     // Catch:{ Exception -> 0x023c }
                r8.clear()     // Catch:{ Exception -> 0x023c }
                java.util.LinkedList<com.tencent.mm.chatroom.storage.GroupToolItem> r8 = r7.f97470u     // Catch:{ Exception -> 0x023c }
                java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r9 = r1.f82817d     // Catch:{ Exception -> 0x023c }
                r8.addAll(r9)     // Catch:{ Exception -> 0x023c }
                java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r8 = r1.f82817d     // Catch:{ Exception -> 0x023c }
                java.lang.String r8 = p684si.C36674e.m41039m2(r8)     // Catch:{ Exception -> 0x023c }
                r7.field_recentUseToolList = r8     // Catch:{ Exception -> 0x023c }
                if (r3 == 0) goto L_0x01fb
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x023c }
                pi.d r0 = (p644pi.C77089d) r0     // Catch:{ Exception -> 0x023c }
                si.f r0 = r0.xx0()     // Catch:{ Exception -> 0x023c }
                r8 = 0
                java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ Exception -> 0x023c }
                boolean r0 = r0.update(r7, r9)     // Catch:{ Exception -> 0x023c }
                goto L_0x0209
            L_0x01fb:
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x023c }
                pi.d r0 = (p644pi.C77089d) r0     // Catch:{ Exception -> 0x023c }
                si.f r0 = r0.xx0()     // Catch:{ Exception -> 0x023c }
                boolean r0 = r0.insert(r7)     // Catch:{ Exception -> 0x023c }
            L_0x0209:
                java.lang.String r8 = "getRecentUseToolTask oldRecent:%s newRecent:%s exist:%s queryEnd:%s result:%s"
                r9 = 5
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x023c }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x023c }
                r10 = 0
                r9[r10] = r4     // Catch:{ Exception -> 0x023c }
                java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r4 = r1.f82817d     // Catch:{ Exception -> 0x023c }
                int r4 = r4.size()     // Catch:{ Exception -> 0x023c }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x023c }
                r10 = 1
                r9[r10] = r4     // Catch:{ Exception -> 0x023c }
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x023c }
                r4 = 2
                r9[r4] = r3     // Catch:{ Exception -> 0x023c }
                r3 = 3
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x023c }
                r9[r3] = r4     // Catch:{ Exception -> 0x023c }
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x023c }
                r3 = 4
                r9[r3] = r0     // Catch:{ Exception -> 0x023c }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r9)     // Catch:{ Exception -> 0x023c }
                r4 = 2
                goto L_0x0259
            L_0x023c:
                r0 = move-exception
                r3 = r7
            L_0x023e:
                r4 = 2
                java.lang.Object[] r7 = new java.lang.Object[r4]
                java.lang.Class r8 = r0.getClass()
                java.lang.String r8 = r8.getSimpleName()
                r9 = 0
                r7[r9] = r8
                java.lang.String r0 = r0.getMessage()
                r8 = 1
                r7[r8] = r0
                java.lang.String r0 = "getRecentUseToolTask Exception:%s %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r7)
                r7 = r3
            L_0x0259:
                long r8 = eb0.C31543z5.m39453c()
                long r8 = r8 - r5
                java.lang.Object[] r0 = new java.lang.Object[r4]
                com.tencent.mm.ui.chatting.component.GroupToolsComponet r3 = com.tencent.p014mm.p136ui.chatting.component.GroupToolsComponet.this
                ck3.b r3 = r3.f215752d
                java.lang.String r3 = r3.mo91577r()
                r4 = 0
                r0[r4] = r3
                java.lang.Long r3 = java.lang.Long.valueOf(r8)
                r4 = 1
                r0[r4] = r3
                java.lang.String r3 = "getRecentUseToolTask roomname:%s interTime:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
                com.tencent.mm.ui.chatting.component.GroupToolsComponet r0 = com.tencent.p014mm.p136ui.chatting.component.GroupToolsComponet.this
                java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r0 = r0.f215615z
                r0.clear()
                com.tencent.mm.ui.chatting.component.GroupToolsComponet r0 = com.tencent.p014mm.p136ui.chatting.component.GroupToolsComponet.this
                java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r0 = r0.f215615z
                java.util.LinkedList<com.tencent.mm.chatroom.storage.GroupToolItem> r2 = r7.f97470u
                r0.addAll(r2)
                com.tencent.mm.ui.chatting.component.GroupToolsComponet r0 = com.tencent.p014mm.p136ui.chatting.component.GroupToolsComponet.this
                java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r0 = r0.f215615z
                com.tencent.mm.ui.chatting.component.GroupToolsComponet$d$a r2 = new com.tencent.mm.ui.chatting.component.GroupToolsComponet$d$a
                r2.<init>(r1)
                java.util.Collections.sort(r0, r2)
                com.tencent.mm.ui.chatting.component.GroupToolsComponet$d$b r0 = new com.tencent.mm.ui.chatting.component.GroupToolsComponet$d$b
                r0.<init>()
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.GroupToolsComponet.C30812d.run():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$g */
    public class C57672g implements View.OnClickListener {
        public C57672g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/GroupToolsComponet$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.roomtools.GroupToolsComponet", "stickManagerLl click");
            Intent intent = new Intent(GroupToolsComponet.this.f215752d.mo91565f(), GroupToolsManagereUI.class);
            intent.putExtra("key_chatroomname", GroupToolsComponet.this.f215752d.mo91577r());
            intent.putParcelableArrayListExtra("key_recent_use_tools", GroupToolsComponet.this.f215615z);
            Activity f = GroupToolsComponet.this.f215752d.mo91565f();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Activity activity = f;
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/GroupToolsComponet$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            f.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/component/GroupToolsComponet$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            GroupToolsComponet.this.f215594D.alive();
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/GroupToolsComponet$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$l */
    public static class C57673l extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f165080d;

        /* renamed from: e */
        public final int f165081e;

        public C57673l(int i, int i2) {
            this.f165081e = i;
            this.f165080d = i2;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            rect.left = this.f165081e * (recyclerView.mo17029N0(view) % this.f165080d);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$b */
    public class C73366b implements Runnable {
        public C73366b() {
        }

        public void run() {
            Object[] objArr = new Object[1];
            Thread thread = GroupToolsComponet.this.f215613x;
            objArr[0] = thread != null ? Boolean.valueOf(thread.isAlive()) : "null";
            Log.m105925i("MicroMsg.roomtools.GroupToolsComponet", "getRecentToolsThread interrupt() %s", objArr);
            Thread thread2 = GroupToolsComponet.this.f215613x;
            if (thread2 != null && thread2.isAlive()) {
                GroupToolsComponet.this.f215613x.interrupt();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$c */
    public class C73367c implements Runnable {
        public C73367c() {
        }

        public void run() {
            Thread thread = GroupToolsComponet.this.f215613x;
            if (thread != null && thread.isAlive()) {
                GroupToolsComponet groupToolsComponet = GroupToolsComponet.this;
                C89779i0 i0Var = groupToolsComponet.f215610u;
                if (i0Var == null) {
                    groupToolsComponet.f215610u = C76879j.m92723Q(groupToolsComponet.f215752d.mo91565f(), groupToolsComponet.f215752d.mo91565f().getString(C0966R.string.a3h), groupToolsComponet.f215752d.mo91565f().getString(C0966R.string.f360085a04), true, true, new C73600t2(groupToolsComponet));
                } else if (!i0Var.isShowing()) {
                    groupToolsComponet.f215610u.show();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$e */
    public class C73368e implements C73372j {
        public C73368e() {
        }

        public void onClick(View view) {
            Log.m105924i("MicroMsg.roomtools.GroupToolsComponet", "iStickToolsCallback click");
            Object tag = view.getTag();
            if (tag instanceof GroupToolItem) {
                GroupToolItem groupToolItem = (GroupToolItem) tag;
                if (Util.isEqual(groupToolItem.f79318d, "roomaa@app.origin")) {
                    GroupToolsComponet.m86573Y5(GroupToolsComponet.this);
                } else if (Util.isEqual(groupToolItem.f79318d, "roomlive@app.origin")) {
                    GroupToolsComponet.m86574Z5(GroupToolsComponet.this);
                } else {
                    GroupToolsComponet.m86575a6(GroupToolsComponet.this, groupToolItem, "1", true);
                }
                GroupToolsComponet.m86576b6(GroupToolsComponet.this, groupToolItem, true);
            }
            C73884e eVar = GroupToolsComponet.this.f215609t;
            if (eVar != null) {
                eVar.mo102946b();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$f */
    public class C73369f implements C73372j {
        public C73369f() {
        }

        public void onClick(View view) {
            Log.m105924i("MicroMsg.roomtools.GroupToolsComponet", "iRecentUseToolsCallback click");
            Object tag = view.getTag();
            if (tag instanceof GroupToolItem) {
                GroupToolItem groupToolItem = (GroupToolItem) tag;
                if (Util.isEqual(groupToolItem.f79318d, "roomaa@app.origin")) {
                    GroupToolsComponet.m86573Y5(GroupToolsComponet.this);
                } else if (Util.isEqual(groupToolItem.f79318d, "roomlive@app.origin")) {
                    GroupToolsComponet.m86574Z5(GroupToolsComponet.this);
                } else {
                    GroupToolsComponet.m86575a6(GroupToolsComponet.this, groupToolItem, "2", false);
                }
                GroupToolsComponet.m86576b6(GroupToolsComponet.this, groupToolItem, false);
            }
            C73884e eVar = GroupToolsComponet.this.f215609t;
            if (eVar != null) {
                eVar.mo102946b();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$h */
    public class C73370h implements C77407n.C47880p {
        public C73370h() {
        }

        public void onDismiss() {
            NestedScrollView nestedScrollView = GroupToolsComponet.this.f215599g;
            if (nestedScrollView != null) {
                nestedScrollView.mo144970f(33);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$i */
    public class C73371i implements Runnable {
        public C73371i() {
        }

        public void run() {
            GroupToolsComponet.this.f215599g.mo144970f(33);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$j */
    public interface C73372j {
        void onClick(View view);
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$k */
    public static class C73373k extends RecyclerView.C16631z {

        /* renamed from: C */
        public static final C20937c f215622C;

        /* renamed from: A */
        public ImageView f215623A;

        /* renamed from: B */
        public TextView f215624B;

        /* renamed from: z */
        public View f215625z;

        static {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59359o = C0966R.raw.app_brand_app_default_icon_for_tail;
            int b = C76577a.m92151b(MMApplicationContext.getContext(), 20);
            int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 20);
            bVar.f59354j = b;
            bVar.f59355k = b2;
            bVar.f59364t = true;
            bVar.f59346b = true;
            bVar.f59345a = true;
            f215622C = bVar.mo32666a();
        }

        public C73373k(View view) {
            super(view);
            this.f215625z = view;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.kqk);
            this.f215623A = (ImageView) view.findViewById(C0966R.C0970id.kqo);
            this.f215624B = (TextView) view.findViewById(C0966R.C0970id.kqq);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$m */
    public static class C73374m extends RecyclerView.C16613e {

        /* renamed from: d */
        public Context f215626d;

        /* renamed from: e */
        public List<GroupToolItem> f215627e;

        /* renamed from: f */
        public C73372j f215628f;

        /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$m$a */
        public class C73375a implements C76629w0.C61144a {

            /* renamed from: a */
            public final /* synthetic */ C73373k f215629a;

            /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$m$a$a */
            public class C73376a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ WxaAttributes f215631d;

                public C73376a(WxaAttributes wxaAttributes) {
                    this.f215631d = wxaAttributes;
                }

                public void run() {
                    C73375a aVar = C73375a.this;
                    C73374m.this.mo102233F4(aVar.f215629a, this.f215631d);
                }
            }

            public C73375a(C73373k kVar) {
                this.f215629a = kVar;
            }

            /* renamed from: a */
            public void mo21208a(WxaAttributes wxaAttributes) {
                MMHandlerThread.postToMainThread(new C73376a(wxaAttributes));
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.GroupToolsComponet$m$b */
        public class C73377b implements View.OnClickListener {
            public C73377b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/component/GroupToolsComponet$ToolAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C73372j jVar = C73374m.this.f215628f;
                if (jVar != null) {
                    jVar.onClick(view);
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/GroupToolsComponet$ToolAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C73374m(Context context, List<GroupToolItem> list, C73372j jVar) {
            this.f215626d = context;
            this.f215627e = list;
            this.f215628f = jVar;
        }

        /* renamed from: F4 */
        public final void mo102233F4(C73373k kVar, WxaAttributes wxaAttributes) {
            String str = "";
            C20828a.m22825b().mo32519h(wxaAttributes != null ? wxaAttributes.field_smallHeadURL : str, kVar.f215623A, C73373k.f215622C);
            TextView textView = kVar.f215624B;
            if (wxaAttributes != null) {
                str = wxaAttributes.field_nickname;
            }
            textView.setText(str);
        }

        public int getItemCount() {
            return this.f215627e.size();
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            Class cls = C76629w0.class;
            List<GroupToolItem> list = this.f215627e;
            if (list != null && i >= 0 && i < list.size()) {
                C73373k kVar = (C73373k) zVar;
                GroupToolItem groupToolItem = this.f215627e.get(i);
                View view = kVar.f215625z;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/GroupToolsComponet$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/component/GroupToolsComponet$ToolAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (Util.isEqual(groupToolItem.f79318d, "roomaa@app.origin")) {
                    kVar.f215623A.setImageResource(C0966R.C0969drawable.bgw);
                    kVar.f215624B.setText(C0966R.string.fg6);
                } else if (Util.isEqual(groupToolItem.f79318d, "roomlive@app.origin")) {
                    kVar.f215623A.setImageDrawable(C76577a.m92158i(this.f215626d, C0966R.C0969drawable.bgx));
                    kVar.f215624B.setText(C0966R.string.mji);
                } else {
                    WxaAttributes N2 = ((C76629w0) C86312j.m106911c(cls)).mo106879N2(groupToolItem.f79318d);
                    if (N2 == null) {
                        ((C76629w0) C86312j.m106911c(cls)).mo106884tG(groupToolItem.f79318d, new C73375a(kVar));
                    } else {
                        mo102233F4(kVar, N2);
                    }
                }
                kVar.f215625z.setTag(groupToolItem);
                kVar.f215625z.setOnClickListener(new C73377b());
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C73373k(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6849q8, viewGroup, false));
        }
    }

    /* renamed from: Y5 */
    public static void m86573Y5(GroupToolsComponet groupToolsComponet) {
        if (C72996z1.m85844o5(groupToolsComponet.f215752d.mo91577r())) {
            C76879j.m92711E(groupToolsComponet.f215752d.mo91565f(), groupToolsComponet.f215752d.mo91565f().getString(C0966R.string.fg5), "", groupToolsComponet.f215752d.mo91565f().getString(C0966R.string.lkg), false, new C57677o2(groupToolsComponet));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(groupToolsComponet.f215752d.mo91565f(), "com.tencent.mm.plugin.aa.ui.LaunchAAUI");
        intent.putExtra("enter_scene", 7);
        intent.putExtra("chatroom_name", groupToolsComponet.f215752d.mo91577r());
        Activity f = groupToolsComponet.f215752d.mo91565f();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity = f;
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/GroupToolsComponet", "gotoAAPay", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        f.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/component/GroupToolsComponet", "gotoAAPay", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: Z5 */
    public static void m86574Z5(GroupToolsComponet groupToolsComponet) {
        groupToolsComponet.getClass();
        Class cls = C103918d.class;
        Class cls2 = C10432i.class;
        if (((C10432i) C86312j.m106911c(cls2)).mo10750e()) {
            Log.m105924i("MicroMsg.roomtools.GroupToolsComponet", "exit in teen mode");
            ((C10432i) C86312j.m106911c(cls2)).mo10755m4(groupToolsComponet.f215752d.mo91565f());
            return;
        }
        Log.m105924i("MicroMsg.roomtools.GroupToolsComponet", "gotoRoomLiveEntrance");
        boolean z1 = ((C103918d) C86312j.m106911c(cls)).mo125788z1(groupToolsComponet.f215752d.mo91565f(), "android.permission.CAMERA", 25, "", "");
        Log.m105925i("MicroMsg.roomtools.GroupToolsComponet", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), groupToolsComponet.f215752d.mo91565f());
        if (z1) {
            boolean z15 = ((C103918d) C86312j.m106911c(cls)).mo125788z1(groupToolsComponet.f215752d.mo91565f(), "android.permission.RECORD_AUDIO", 25, "", "");
            Log.m105925i("MicroMsg.roomtools.GroupToolsComponet", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", Boolean.valueOf(z15), Util.getStack(), groupToolsComponet.f215752d.mo91565f());
            if (!z15 || C61104a.m71651g(groupToolsComponet.f215752d.mo91565f()) || C61104a.m71669y(groupToolsComponet.f215752d.mo91565f()) || C61104a.m71665u(groupToolsComponet.f215752d.mo91565f()) || C61104a.m71649e(groupToolsComponet.f215752d.mo91565f())) {
                return;
            }
            if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_LIVE_MODE_INT_SYNC, 0) == 1) {
                Activity f = groupToolsComponet.f215752d.mo91565f();
                LayoutInflater.from(f);
                C77407n nVar = new C77407n((Context) f, 1, false);
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                C73571p2 p2Var = new C73571p2(groupToolsComponet, f);
                C57678q2 q2Var = new C57678q2(groupToolsComponet);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
                    f0Var.f224728w = null;
                    f0Var.f224729x = null;
                }
                arrayList.clear();
                C76874e0 e0Var = new C76874e0(f);
                p2Var.onCreateMMMenu(e0Var);
                if (e0Var.mo107176v()) {
                    Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                    return;
                }
                nVar.f225771i = p2Var;
                nVar.f225782p = q2Var;
                nVar.f225761d = null;
                nVar.f225725D = null;
                nVar.mo107573q();
                return;
            }
            ((C66190c) C86312j.m106911c(C66190c.class)).mo89934OG().mo90323c(groupToolsComponet.f215752d.mo91565f(), LiveConfig.m62801a(groupToolsComponet.f215752d.mo91577r(), 2));
        }
    }

    /* renamed from: a6 */
    public static void m86575a6(GroupToolsComponet groupToolsComponet, GroupToolItem groupToolItem, String str, boolean z) {
        groupToolsComponet.getClass();
        C86299o oVar = new C86299o();
        oVar.f250929a = groupToolItem.f79318d;
        if (z) {
            oVar.f250934f = groupToolItem.f79319e;
        } else {
            oVar.f250934f = "";
        }
        oVar.f250939k = C91035a.CTRL_INDEX;
        oVar.f250948t = groupToolsComponet.f215752d.mo91577r();
        oVar.f250940l = str;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(groupToolsComponet.f215752d.mo91565f(), oVar);
    }

    /* renamed from: b6 */
    public static void m86576b6(GroupToolsComponet groupToolsComponet, GroupToolItem groupToolItem, boolean z) {
        String str;
        groupToolsComponet.getClass();
        if (Util.isEqual(groupToolItem.f79318d, "roomaa@app.origin")) {
            str = MMApplicationContext.getContext().getString(C0966R.string.fg6);
        } else if (Util.isEqual(groupToolItem.f79318d, "roomlive@app.origin")) {
            str = MMApplicationContext.getContext().getString(C0966R.string.mji);
        } else {
            WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(groupToolItem.f79318d);
            str = N2 == null ? "" : N2.field_nickname;
        }
        String r = groupToolsComponet.f215752d.mo91577r();
        String str2 = groupToolItem.f79318d;
        int i = C45628s0.m50750O(r) ? 2 : C45628s0.m50752Q(r) ? 1 : 0;
        ChatRoomToolPanelOperateLogStruct chatRoomToolPanelOperateLogStruct = new ChatRoomToolPanelOperateLogStruct();
        chatRoomToolPanelOperateLogStruct.f194158d = chatRoomToolPanelOperateLogStruct.mo86045b("roomusrname", r, true);
        chatRoomToolPanelOperateLogStruct.f194159e = 2;
        chatRoomToolPanelOperateLogStruct.f194162h = (long) i;
        chatRoomToolPanelOperateLogStruct.f194163i = chatRoomToolPanelOperateLogStruct.mo86045b("appid", str2, true);
        chatRoomToolPanelOperateLogStruct.f194164j = chatRoomToolPanelOperateLogStruct.mo86045b("appname", str, true);
        chatRoomToolPanelOperateLogStruct.f194165k = z ? 1 : 0;
        chatRoomToolPanelOperateLogStruct.mo86054n();
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        Log.m105924i("MicroMsg.roomtools.GroupToolsComponet", "onChattingResume");
        this.f215594D.dead();
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        Log.m105924i("MicroMsg.roomtools.GroupToolsComponet", "onChattingPause");
    }

    /* renamed from: L1 */
    public void mo102226L1() {
        mo102227c6(true);
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        Log.m105925i("MicroMsg.roomtools.GroupToolsComponet", "onChattingEnterAnimStart: user %s hashCode:%s", this.f215752d.mo91577r(), Integer.valueOf(hashCode()));
    }

    /* renamed from: c6 */
    public final void mo102227c6(boolean z) {
        Class cls = C77089d.class;
        C36674e jo = ((C77089d) C86312j.m106911c(cls)).xx0().mo60800jo(this.f215752d.mo91577r());
        this.f215614y = jo;
        if (jo == null) {
            C36674e eVar = new C36674e();
            eVar.field_chatroomname = this.f215752d.mo91577r();
            boolean Lo = ((C77089d) C86312j.m106911c(cls)).xx0().insert(eVar);
            if (Lo) {
                this.f215614y = ((C77089d) C86312j.m106911c(cls)).xx0().mo60800jo(this.f215752d.mo91577r());
            }
            Log.m105925i("MicroMsg.roomtools.GroupToolsComponet", "getGroupTools insert GroupTools: result(%s)", Boolean.valueOf(Lo));
        }
        Log.m105925i("MicroMsg.roomtools.GroupToolsComponet", "getGroupTools start:%s queryRecentUse:%s state:%s", this.f215752d.mo91577r(), Boolean.valueOf(z), Integer.valueOf(this.f215614y.field_queryState));
        if (!z) {
            return;
        }
        if (this.f215614y.field_queryState == 1) {
            this.f215615z.clear();
            this.f215615z.addAll(this.f215614y.f97470u);
            Collections.sort(this.f215615z, new C30811a(this));
            mo102228d6();
            return;
        }
        MMHandlerThread.postToMainThreadDelayed(new C73366b(), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        Thread thread = new Thread(this.f215596F);
        this.f215613x = thread;
        thread.start();
        MMHandlerThread.postToMainThreadDelayed(new C73367c(), 200);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x039a A[LOOP:0: B:62:0x0391->B:64:0x039a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x03ba A[LOOP:1: B:66:0x03b4->B:68:0x03ba, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x03f1  */
    /* renamed from: d6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102228d6() {
        /*
            r13 = this;
            ck3.b r0 = r13.f215752d
            android.app.Activity r0 = r0.mo91565f()
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            r1 = 2131493629(0x7f0c02fd, float:1.8610744E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r13.f215597e = r0
            r1 = 2131312646(0x7f094006, float:1.8243666E38)
            android.view.View r0 = r0.findViewById(r1)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r13.f215599g = r0
            android.view.View r0 = r13.f215597e
            r1 = 2131305786(0x7f09253a, float:1.8229753E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r13.f215606q = r0
            android.view.View r0 = r13.f215597e
            r1 = 2131305787(0x7f09253b, float:1.8229755E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r13.f215598f = r0
            android.view.View r0 = r13.f215597e
            r1 = 2131305792(0x7f092540, float:1.8229765E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r13.f215600h = r0
            android.view.View r0 = r13.f215597e
            r1 = 2131305793(0x7f092541, float:1.8229767E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r13.f215601i = r0
            android.view.View r0 = r13.f215597e
            r1 = 2131305794(0x7f092542, float:1.8229769E38)
            android.view.View r0 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r13.f215602j = r0
            android.view.View r0 = r13.f215597e
            r1 = 2131305789(0x7f09253d, float:1.8229759E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r13.f215603n = r0
            android.view.View r0 = r13.f215597e
            r1 = 2131305790(0x7f09253e, float:1.822976E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r13.f215604o = r0
            android.view.View r0 = r13.f215597e
            r1 = 2131305791(0x7f09253f, float:1.8229763E38)
            android.view.View r0 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r13.f215605p = r0
            android.view.View r0 = r13.f215597e
            r1 = 2131305788(0x7f09253c, float:1.8229757E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r13.f215607r = r0
            android.view.View r0 = r13.f215597e
            r1 = 2131305784(0x7f092538, float:1.8229749E38)
            android.view.View r0 = r0.findViewById(r1)
            r13.f215608s = r0
            android.widget.RelativeLayout r0 = r13.f215606q
            com.tencent.mm.ui.chatting.component.r2 r1 = new com.tencent.mm.ui.chatting.component.r2
            r1.<init>(r13)
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r13.f215601i
            android.view.View$OnClickListener r1 = r13.f215595E
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r13.f215604o
            android.view.View$OnClickListener r1 = r13.f215595E
            r0.setOnClickListener(r1)
            boolean r0 = r13.f215591A
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L_0x00e6
            si.e r0 = r13.f215614y
            java.util.LinkedList<com.tencent.mm.chatroom.storage.GroupToolItem> r0 = r0.f97469t
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00d3
            android.widget.LinearLayout r0 = r13.f215601i
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r13.f215604o
            r0.setVisibility(r2)
            goto L_0x00f0
        L_0x00d3:
            java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r0 = r13.f215615z
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00e6
            android.widget.LinearLayout r0 = r13.f215601i
            r0.setVisibility(r2)
            android.widget.LinearLayout r0 = r13.f215604o
            r0.setVisibility(r1)
            goto L_0x00f0
        L_0x00e6:
            android.widget.LinearLayout r0 = r13.f215601i
            r0.setVisibility(r2)
            android.widget.LinearLayout r0 = r13.f215604o
            r0.setVisibility(r2)
        L_0x00f0:
            si.e r0 = r13.f215614y
            java.util.LinkedList<com.tencent.mm.chatroom.storage.GroupToolItem> r0 = r0.f97469t
            int r0 = r0.size()
            r3 = 1
            if (r0 <= 0) goto L_0x0102
            android.widget.LinearLayout r0 = r13.f215600h
            r0.setVisibility(r1)
            r0 = 1
            goto L_0x0108
        L_0x0102:
            android.widget.LinearLayout r0 = r13.f215600h
            r0.setVisibility(r2)
            r0 = 0
        L_0x0108:
            java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r4 = r13.f215615z
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0117
            android.widget.LinearLayout r4 = r13.f215603n
            r4.setVisibility(r1)
            r4 = 1
            goto L_0x011d
        L_0x0117:
            android.widget.LinearLayout r4 = r13.f215603n
            r4.setVisibility(r2)
            r4 = 0
        L_0x011d:
            if (r4 != 0) goto L_0x0168
            if (r0 != 0) goto L_0x0168
            android.widget.LinearLayout r0 = r13.f215598f
            r0.setVisibility(r1)
            android.view.View r0 = r13.f215608s
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/ui/chatting/component/GroupToolsComponet"
            java.lang.String r7 = "refreshRcViewVisible"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r0
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r12.mo10231a(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/ui/chatting/component/GroupToolsComponet"
            java.lang.String r6 = "refreshRcViewVisible"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r0
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x01ae
        L_0x0168:
            android.widget.LinearLayout r0 = r13.f215598f
            r0.setVisibility(r2)
            android.view.View r0 = r13.f215608s
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/ui/chatting/component/GroupToolsComponet"
            java.lang.String r7 = "refreshRcViewVisible"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r0
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r12.mo10231a(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/ui/chatting/component/GroupToolsComponet"
            java.lang.String r6 = "refreshRcViewVisible"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r0
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x01ae:
            androidx.core.widget.NestedScrollView r0 = r13.f215599g
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            int r4 = r0.height
            si.e r5 = r13.f215614y
            java.util.LinkedList<com.tencent.mm.chatroom.storage.GroupToolItem> r5 = r5.f97469t
            int r5 = r5.size()
            java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r6 = r13.f215615z
            int r6 = r6.size()
            int r5 = r5 + r6
            if (r5 <= r2) goto L_0x01d6
            ck3.b r5 = r13.f215752d
            android.app.Activity r5 = r5.mo91565f()
            r6 = 344(0x158, float:4.82E-43)
            int r5 = kg3.C76577a.m92151b(r5, r6)
            goto L_0x01e2
        L_0x01d6:
            ck3.b r5 = r13.f215752d
            android.app.Activity r5 = r5.mo91565f()
            r6 = 264(0x108, float:3.7E-43)
            int r5 = kg3.C76577a.m92151b(r5, r6)
        L_0x01e2:
            if (r4 == r5) goto L_0x01eb
            r0.height = r5
            androidx.core.widget.NestedScrollView r4 = r13.f215599g
            r4.setLayoutParams(r0)
        L_0x01eb:
            android.widget.ImageView r0 = r13.f215607r
            r0.setVisibility(r2)
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            ck3.b r4 = r13.f215752d
            android.app.Activity r4 = r4.mo91565f()
            r5 = 4
            r0.<init>(r4, r5)
            androidx.recyclerview.widget.RecyclerView r4 = r13.f215602j
            r4.setLayoutManager(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r13.f215602j
            r0.setNestedScrollingEnabled(r1)
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            ck3.b r4 = r13.f215752d
            android.app.Activity r4 = r4.mo91565f()
            r0.<init>(r4, r5)
            androidx.recyclerview.widget.RecyclerView r4 = r13.f215605p
            r4.setLayoutManager(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r13.f215605p
            r0.setNestedScrollingEnabled(r1)
            ck3.b r0 = r13.f215752d
            android.app.Activity r0 = r0.mo91565f()
            com.tencent.mm.ui.i3$a r0 = com.tencent.p014mm.p136ui.C74783i3.m89537a(r0)
            int r0 = r0.f24704a
            ck3.b r4 = r13.f215752d
            android.app.Activity r4 = r4.mo91565f()
            r6 = 2131165351(0x7f0700a7, float:1.7944917E38)
            int r4 = kg3.C76577a.m92155f(r4, r6)
            r6 = 2
            int r4 = r4 * 2
            int r0 = r0 - r4
            ck3.b r4 = r13.f215752d
            android.app.Activity r4 = r4.mo91565f()
            r7 = 2131165363(0x7f0700b3, float:1.794494E38)
            int r4 = kg3.C76577a.m92155f(r4, r7)
            int r4 = r4 * 4
            int r0 = r0 - r4
            int r0 = r0 / 12
            com.tencent.mm.ui.chatting.component.GroupToolsComponet$m r4 = new com.tencent.mm.ui.chatting.component.GroupToolsComponet$m
            ck3.b r7 = r13.f215752d
            android.app.Activity r7 = r7.mo91565f()
            si.e r8 = r13.f215614y
            java.util.LinkedList<com.tencent.mm.chatroom.storage.GroupToolItem> r8 = r8.f97469t
            com.tencent.mm.ui.chatting.component.GroupToolsComponet$j r9 = r13.f215592B
            r4.<init>(r7, r8, r9)
            r13.f215611v = r4
            androidx.recyclerview.widget.RecyclerView r7 = r13.f215602j
            r7.setAdapter(r4)
            com.tencent.mm.ui.chatting.component.GroupToolsComponet$l r4 = new com.tencent.mm.ui.chatting.component.GroupToolsComponet$l
            r4.<init>(r0, r5)
            androidx.recyclerview.widget.RecyclerView r7 = r13.f215602j
            r7.mo17085h0(r4)
            com.tencent.mm.ui.chatting.component.GroupToolsComponet$m r4 = r13.f215611v
            r4.notifyDataSetChanged()
            com.tencent.mm.ui.chatting.component.GroupToolsComponet$m r4 = new com.tencent.mm.ui.chatting.component.GroupToolsComponet$m
            ck3.b r7 = r13.f215752d
            android.app.Activity r7 = r7.mo91565f()
            java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r8 = r13.f215615z
            com.tencent.mm.ui.chatting.component.GroupToolsComponet$j r9 = r13.f215593C
            r4.<init>(r7, r8, r9)
            r13.f215612w = r4
            androidx.recyclerview.widget.RecyclerView r7 = r13.f215605p
            r7.setAdapter(r4)
            com.tencent.mm.ui.chatting.component.GroupToolsComponet$l r4 = new com.tencent.mm.ui.chatting.component.GroupToolsComponet$l
            r4.<init>(r0, r5)
            androidx.recyclerview.widget.RecyclerView r0 = r13.f215605p
            r0.mo17085h0(r4)
            com.tencent.mm.ui.chatting.component.GroupToolsComponet$m r0 = r13.f215612w
            r0.notifyDataSetChanged()
            androidx.core.widget.NestedScrollView r0 = r13.f215599g
            com.tencent.mm.ui.chatting.component.s2 r4 = new com.tencent.mm.ui.chatting.component.s2
            r4.<init>(r13)
            r0.setOnScrollChangeListener(r4)
            androidx.core.widget.NestedScrollView r0 = r13.f215599g
            r0.setFocusable(r1)
            com.tencent.mm.ui.chatting.view.e r0 = new com.tencent.mm.ui.chatting.view.e
            ck3.b r4 = r13.f215752d
            android.app.Activity r4 = r4.mo91565f()
            android.view.View r5 = r13.f215597e
            r0.<init>(r4, r5)
            r13.f215609t = r0
            com.tencent.mm.ui.chatting.component.GroupToolsComponet$h r4 = new com.tencent.mm.ui.chatting.component.GroupToolsComponet$h
            r4.<init>()
            r0.f216824d = r4
            boolean r4 = r0.mo102945a()
            r0.f216828h = r4
            android.content.Context r4 = r0.f216826f
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L_0x02da
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.Window r4 = r4.getWindow()
            android.view.WindowManager r4 = r4.getWindowManager()
            android.view.Display r4 = r4.getDefaultDisplay()
            int r4 = r4.getRotation()
            goto L_0x02db
        L_0x02da:
            r4 = 0
        L_0x02db:
            r0.f216829i = r4
            android.app.Dialog r4 = r0.f216825e
            if (r4 == 0) goto L_0x0378
            android.view.View r4 = r0.f216827g
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            boolean r5 = r0.f216828h
            if (r5 == 0) goto L_0x02ff
            android.view.View r5 = r0.f216830j
            if (r5 == 0) goto L_0x02ff
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            android.view.View r7 = r0.f216830j
            r7.getWindowVisibleDisplayFrame(r5)
            int r5 = r5.right
            r4.width = r5
        L_0x02ff:
            android.view.View r5 = r0.f216827g
            r5.setLayoutParams(r4)
            android.app.Dialog r4 = r0.f216825e
            android.view.Window r4 = r4.getWindow()
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.addFlags(r5)
            android.app.Dialog r4 = r0.f216825e
            android.view.Window r4 = r4.getWindow()
            r4.clearFlags(r2)
            android.app.Dialog r2 = r0.f216825e
            android.view.Window r2 = r2.getWindow()
            r4 = 131072(0x20000, float:1.83671E-40)
            r2.clearFlags(r4)
            android.app.Dialog r2 = r0.f216825e
            android.view.Window r2 = r2.getWindow()
            r4 = 128(0x80, float:1.794E-43)
            r2.clearFlags(r4)
            android.app.Dialog r2 = r0.f216825e
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r2.setSystemUiVisibility(r1)
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r0.f216831n
            if (r2 == 0) goto L_0x0341
            r2.f309230p = r1
        L_0x0341:
            qo3.n$p r2 = r0.f216824d
            if (r2 == 0) goto L_0x034f
            android.app.Dialog r2 = r0.f216825e
            com.tencent.mm.ui.chatting.view.d r4 = new com.tencent.mm.ui.chatting.view.d
            r4.<init>(r0)
            r2.setOnDismissListener(r4)
        L_0x034f:
            android.view.View r2 = r0.f216830j
            if (r2 == 0) goto L_0x0365
            android.view.ViewTreeObserver r4 = r0.f216832o
            if (r4 != 0) goto L_0x0359
            r4 = 1
            goto L_0x035a
        L_0x0359:
            r4 = 0
        L_0x035a:
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r0.f216832o = r2
            if (r4 == 0) goto L_0x0365
            r2.addOnGlobalLayoutListener(r0)
        L_0x0365:
            android.content.Context r2 = r0.f216826f
            boolean r4 = r2 instanceof android.app.Activity
            if (r4 == 0) goto L_0x0378
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isFinishing()
            if (r2 != 0) goto L_0x0378
            android.app.Dialog r0 = r0.f216825e
            r0.show()
        L_0x0378:
            androidx.core.widget.NestedScrollView r0 = r13.f215599g
            if (r0 == 0) goto L_0x0384
            com.tencent.mm.ui.chatting.component.GroupToolsComponet$i r2 = new com.tencent.mm.ui.chatting.component.GroupToolsComponet$i
            r2.<init>()
            r0.post(r2)
        L_0x0384:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            si.e r2 = r13.f215614y
            java.util.LinkedList<com.tencent.mm.chatroom.storage.GroupToolItem> r2 = r2.f97469t
            java.util.Iterator r2 = r2.iterator()
        L_0x0391:
            boolean r4 = r2.hasNext()
            java.lang.String r5 = "|"
            if (r4 == 0) goto L_0x03a9
            java.lang.Object r4 = r2.next()
            com.tencent.mm.chatroom.storage.GroupToolItem r4 = (com.tencent.p014mm.chatroom.storage.GroupToolItem) r4
            java.lang.String r4 = r4.f79318d
            r0.append(r4)
            r0.append(r5)
            goto L_0x0391
        L_0x03a9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r4 = r13.f215615z
            java.util.Iterator r4 = r4.iterator()
        L_0x03b4:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x03c9
            java.lang.Object r7 = r4.next()
            com.tencent.mm.chatroom.storage.GroupToolItem r7 = (com.tencent.p014mm.chatroom.storage.GroupToolItem) r7
            java.lang.String r7 = r7.f79318d
            r2.append(r7)
            r2.append(r5)
            goto L_0x03b4
        L_0x03c9:
            ck3.b r4 = r13.f215752d
            java.lang.String r4 = r4.mo91577r()
            si.e r5 = r13.f215614y
            if (r5 != 0) goto L_0x03d5
            r5 = 0
            goto L_0x03db
        L_0x03d5:
            java.util.LinkedList<com.tencent.mm.chatroom.storage.GroupToolItem> r5 = r5.f97469t
            int r5 = r5.size()
        L_0x03db:
            java.util.ArrayList<com.tencent.mm.chatroom.storage.GroupToolItem> r7 = r13.f215615z
            int r7 = r7.size()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r2.toString()
            boolean r8 = eb0.C45628s0.m50750O(r4)
            if (r8 == 0) goto L_0x03f1
            r1 = 2
            goto L_0x03f8
        L_0x03f1:
            boolean r6 = eb0.C45628s0.m50752Q(r4)
            if (r6 == 0) goto L_0x03f8
            r1 = 1
        L_0x03f8:
            com.tencent.mm.autogen.mmdata.rpt.ChatRoomToolPanelOperateLogStruct r6 = new com.tencent.mm.autogen.mmdata.rpt.ChatRoomToolPanelOperateLogStruct
            r6.<init>()
            java.lang.String r8 = "roomusrname"
            java.lang.String r4 = r6.mo86045b(r8, r4, r3)
            r6.f194158d = r4
            r8 = 2
            r6.f194159e = r8
            long r4 = (long) r5
            r6.f194160f = r4
            long r4 = (long) r7
            r6.f194161g = r4
            long r4 = (long) r1
            r6.f194162h = r4
            java.lang.String r1 = "topAppList"
            java.lang.String r0 = r6.mo86045b(r1, r0, r3)
            r6.f194166l = r0
            java.lang.String r0 = "usedAppList"
            java.lang.String r0 = r6.mo86045b(r0, r2, r3)
            r6.f194167m = r0
            r6.mo86054n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.GroupToolsComponet.mo102228d6():void");
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        String r = this.f215752d.mo91577r();
        if (Util.isNullOrNil(r)) {
            this.f215591A = false;
        } else if (!C72996z1.m85807K5(r) || !C45628s0.m50752Q(r)) {
            this.f215591A = false;
        } else {
            this.f215591A = true;
        }
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        View view = this.f215597e;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/GroupToolsComponet", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/component/GroupToolsComponet", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        Log.m105924i("MicroMsg.roomtools.GroupToolsComponet", "onChattingExitAnimStart");
        this.f215594D.dead();
    }
}
