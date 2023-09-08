package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import be0.C16790h;
import ck3.C67391b;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData;
import com.tencent.p014mm.p136ui.C44701a2;
import com.tencent.p014mm.p136ui.C45034p3;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.conversation.ServiceNotifyConversationUI;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProfileUI;
import com.tencent.p014mm.plugin.profile.p088ui.ContactInfoUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30757l4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C97625j3;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jp3.C9486a;
import jp3.C9487b;
import k20.C9556a;
import p196ln.C76705f;
import p255vr.C65873e;
import p270xi.C91212b;
import rd0.C22222c;
import rd0.C48018e;
import u90.C37355b;
import v90.C78374b;
import zj3.C79343c0;
import zj3.C79368l;
import zj3.C79375p;
import zt3.C119157j;
import zt3.C119179t;

@C91212b(exportInterface = C79375p.class)
/* renamed from: com.tencent.mm.ui.chatting.component.h1 */
public class C44825h1 extends C73412a implements C79375p {

    /* renamed from: e */
    public String f121649e;

    /* renamed from: f */
    public Map<Long, Long> f121650f;

    /* renamed from: g */
    public Map<Long, Set<Long>> f121651g;

    /* renamed from: h */
    public List<Long> f121652h;

    /* renamed from: i */
    public List<C72963f4> f121653i = null;

    /* renamed from: j */
    public int f121654j;

    /* renamed from: n */
    public boolean f121655n = false;

    /* renamed from: o */
    public final C44701a2 f121656o = new C44826a();

    /* renamed from: com.tencent.mm.ui.chatting.component.h1$a */
    public class C44826a extends C44701a2 {
        public C44826a() {
        }

        /* renamed from: a */
        public void mo62772a(MenuItem menuItem) {
            String str;
            C22222c cVar;
            int i = 7;
            if (menuItem.getItemId() == 4) {
                Intent intent = new Intent();
                if (C44825h1.this.mo70122s3()) {
                    intent.putExtra("detail_username", C44825h1.this.f121649e);
                    intent.putExtra("Search_Scene", 3);
                } else {
                    intent.putExtra("Search_Scene", 1);
                    i = 1;
                }
                ((C65873e) C86312j.m106911c(C65873e.class)).mo89915LO(C44825h1.this.f215752d.mo91565f(), ".ui.FTSServiceNotifyUI", intent);
                C115669n.INSTANCE.mo160131h(23903, Integer.valueOf(i), Long.valueOf(Util.nowSecond()), null, 0);
            } else if (menuItem.getItemId() != 5) {
            } else {
                if (C44825h1.this.mo70122s3()) {
                    String str2 = C44825h1.this.f121649e;
                    if (C72996z1.m85804J4(str2)) {
                        cVar = C48018e.f128802a.mo72802a("name_wxa");
                        WxaProfileAttributes b = C81661j.m100177b(str2, false);
                        if (b != null) {
                            str = b.f239577f;
                        } else {
                            Log.m105920e("MicroMsg.ChattingServiceNotifyComponent", "attrs is null");
                            str = null;
                        }
                    } else {
                        cVar = C48018e.f128802a.mo72802a("name_biz");
                        str = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str2);
                    }
                    if (cVar != null) {
                        cVar.mo35366g(C44825h1.this.f215752d.mo91565f(), 4, str2, str);
                    } else {
                        Log.m105920e("MicroMsg.ChattingServiceNotifyComponent", "service is null");
                    }
                    C115669n.INSTANCE.mo160131h(21825, 7, str2, Long.valueOf(Util.nowSecond()), null, null, 0, 0, 0);
                    return;
                }
                Activity f = C44825h1.this.f215752d.mo91565f();
                Intent intent2 = new Intent(C44825h1.this.f215752d.mo91565f(), ServiceNotifyConversationUI.class);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                Activity activity = f;
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent$1", "onRealClick", "(Landroid/view/MenuItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                f.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent$1", "onRealClick", "(Landroid/view/MenuItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C115669n.INSTANCE.mo160131h(21825, 1, null, Long.valueOf(Util.nowSecond()), null, null, 0, 0, 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.h1$b */
    public class C44827b implements Runnable {
        public C44827b() {
        }

        public void run() {
            BaseChattingUIFragment baseChattingUIFragment;
            C67391b bVar = C44825h1.this.f215752d;
            if (bVar != null && (baseChattingUIFragment = bVar.f193286j) != null && baseChattingUIFragment.getBodyView() != null) {
                Util.hideVKB(C44825h1.this.f215752d.f193286j.getBodyView());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.h1$c */
    public class C44828c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f121659d;

        /* renamed from: e */
        public final /* synthetic */ Context f121660e;

        public C44828c(boolean z, Context context) {
            this.f121659d = z;
            this.f121660e = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f121659d) {
                AppBrandProfileUI.m104017R7(this.f121660e, C44825h1.this.f121649e, 5, (String) null, true, (WxaExposedParams) null, (Bundle) null, (ActivityStarterIpcDelegate) null);
            } else {
                C44825h1 h1Var = C44825h1.this;
                Context context = this.f121660e;
                h1Var.getClass();
                Intent intent = new Intent();
                intent.setClass(context, ContactInfoUI.class);
                intent.putExtra("Contact_User", h1Var.f121649e);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent", "startContactUIActivity", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent", "startContactUIActivity", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C115669n.INSTANCE.mo160131h(21825, 6, C44825h1.this.f121649e, Long.valueOf(Util.nowSecond()), null, null, 0, 0, 0);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        if (mo70111L3()) {
            C119179t tVar = C119157j.f356862d;
            C44827b bVar = new C44827b();
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(bVar, 128, false);
        }
    }

    /* renamed from: L3 */
    public boolean mo70111L3() {
        String r = this.f215752d.mo91577r();
        if (Util.isNullOrNil(r)) {
            return false;
        }
        return C72996z1.m85840k5(r);
    }

    /* renamed from: M0 */
    public void mo70112M0(long j, int i) {
        Map<Long, Long> map;
        if (mo70111L3() && (map = this.f121650f) != null && this.f121652h != null && this.f121651g != null) {
            Long remove = map.remove(Long.valueOf(j));
            if (remove != null) {
                if (j < remove.longValue()) {
                    Log.m105920e("MicroMsg.ChattingServiceNotifyComponent", "head msg id is large than end msg id!");
                    return;
                }
                for (long longValue = remove.longValue(); longValue <= j; longValue++) {
                    this.f121652h.remove(Long.valueOf(longValue));
                }
            }
            Set remove2 = this.f121651g.remove(remove);
            int i2 = 0;
            if (remove2 != null) {
                i2 = (i - remove2.size()) + 1;
            }
            C79368l lVar = (C79368l) this.f215752d.f193278b.mo102812a(C79368l.class);
            if (lVar != null) {
                lVar.mo108201i0(i2);
            }
        }
    }

    /* renamed from: N2 */
    public boolean mo70113N2(long j) {
        if (!mo70111L3()) {
            return false;
        }
        mo70116Z5();
        return this.f121652h.contains(Long.valueOf(j));
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        if (mo70122s3() && i == 100 && intent != null) {
            Log.m105924i("MicroMsg.ChattingServiceNotifyComponent", "receive data from subscribe msg");
            SubscribeMsgSettingData subscribeMsgSettingData = (SubscribeMsgSettingData) intent.getParcelableExtra("key_biz_data");
            if (subscribeMsgSettingData != null) {
                C16790h hVar = C16790h.f45352a;
                String str = this.f121649e;
                C45034p3 p3Var = new C45034p3(this.f215752d.mo91565f(), this.f121649e);
                C87412m.m108594g(str, "userName");
                hVar.mo17819a(str, subscribeMsgSettingData, (C9487b<? super C9486a>) null, p3Var);
            }
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        if (mo70111L3()) {
            Log.m105924i("MicroMsg.ChattingServiceNotifyComponent", "onChattingEnterAnimStart");
            mo70116Z5();
        }
    }

    /* renamed from: W5 */
    public void mo26189W5(View view, int i, int i2, int i3) {
        if (mo70111L3()) {
            this.f121654j = Math.max(this.f121654j, i3 - i);
        }
    }

    /* renamed from: X4 */
    public void mo70114X4(int i, C72963f4 f4Var) {
        if (mo70111L3()) {
            long g2 = mo70118g2(f4Var.getMsgId());
            int size = this.f121651g.get(Long.valueOf(g2)) == null ? 0 : this.f121651g.get(Long.valueOf(g2)).size();
            if (g2 >= 0) {
                C78374b a = C78374b.m94638a(f4Var.getContent());
                int i2 = a.f229666g;
                int i3 = 2;
                int i4 = i2 != 2 ? i2 != 3 ? 0 : 3 : 2;
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[6];
                objArr[0] = Integer.valueOf(i);
                objArr[1] = a.f229661b;
                objArr[2] = a.f229663d;
                objArr[3] = Integer.valueOf(i4);
                objArr[4] = Integer.valueOf(size);
                if (a.f229660a != 1 || TextUtils.isEmpty(a.f229664e)) {
                    i3 = 1;
                }
                objArr[5] = Integer.valueOf(i3);
                nVar.mo160131h(22906, objArr);
            }
        }
    }

    /* renamed from: Y5 */
    public final boolean mo70115Y5(C72963f4 f4Var, C72963f4 f4Var2) {
        List<C72963f4> list = this.f121653i;
        if (list == null || list.isEmpty()) {
            return false;
        }
        List<C72963f4> list2 = this.f121653i;
        long msgId = list2.get(list2.size() - 1).getMsgId();
        long msgId2 = f4Var.getMsgId();
        long msgId3 = f4Var2.getMsgId();
        String content = f4Var.getContent();
        String content2 = f4Var2.getContent();
        if (Util.isNullOrNil(content) || Util.isNullOrNil(content2)) {
            return false;
        }
        C78374b a = C78374b.m94638a(content);
        C78374b a2 = C78374b.m94638a(content2);
        return Util.nullAsNil(a.f229661b).equals(a2.f229661b) && Util.nullAsNil(a.f229662c).equals(a2.f229662c) && msgId2 >= msgId && msgId3 > msgId2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ChattingServiceNotifyComponent", "unread msg count: %d", java.lang.Integer.valueOf(r1.f121653i.size()));
        r0 = new java.util.HashMap();
        r6 = 0;
        r9 = 0;
        r10 = null;
        r11 = null;
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b8, code lost:
        if (r9 >= java.lang.Math.min(r1.f121653i.size(), 200)) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ba, code lost:
        r13 = r1.f121653i.get(r9);
        r14 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ca, code lost:
        if (r14 >= r1.f121653i.size()) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
        r15 = r1.f121653i.get(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d5, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d6, code lost:
        if (r15 == null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
        if (mo70115Y5(r15, r13) == false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
        if (r12 != false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e0, code lost:
        r6 = r13.getMsgId();
        r11 = new java.util.HashSet();
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        r0.put(java.lang.Long.valueOf(r6), java.lang.Long.valueOf(r15.getMsgId()));
        r11.add(java.lang.Long.valueOf(r15.getMsgId()));
        r11.add(java.lang.Long.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        if (r11.size() < 10) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0113, code lost:
        r1.f121651g.put(java.lang.Long.valueOf(r15.getMsgId()), r11);
        r9 = r14;
        r10 = r15;
        r11 = null;
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0125, code lost:
        r10 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0134, code lost:
        if (r1.f121652h.contains(java.lang.Long.valueOf(r13.getMsgId())) != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0136, code lost:
        r1.f121652h.add(java.lang.Long.valueOf(r13.getMsgId()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0151, code lost:
        if (r1.f121652h.contains(java.lang.Long.valueOf(r15.getMsgId())) != false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0153, code lost:
        r1.f121652h.add(java.lang.Long.valueOf(r15.getMsgId()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0162, code lost:
        if (r11 == null) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0164, code lost:
        r1.f121651g.put(java.lang.Long.valueOf(r13.getMsgId()), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0171, code lost:
        r10 = r13;
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0174, code lost:
        if (r10 == null) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017a, code lost:
        if (mo70115Y5(r13, r10) == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017c, code lost:
        if (r12 == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x017e, code lost:
        r0.put(java.lang.Long.valueOf(r6), java.lang.Long.valueOf(r13.getMsgId()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018d, code lost:
        if (r11 != null) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018f, code lost:
        r11 = new java.util.HashSet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0195, code lost:
        r1.f121651g.put(java.lang.Long.valueOf(r13.getMsgId()), r11);
        r11.add(java.lang.Long.valueOf(r13.getMsgId()));
        r11.add(java.lang.Long.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c2, code lost:
        if (r1.f121652h.contains(java.lang.Long.valueOf(r13.getMsgId())) != false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c4, code lost:
        r1.f121652h.add(java.lang.Long.valueOf(r13.getMsgId()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d2, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d3, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d6, code lost:
        r1.f121650f.putAll(r0);
        r0.clear();
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ChattingServiceNotifyComponent", "initMessageGroupInfo cost: %dms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r2));
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ChattingServiceNotifyComponent", "end to head msg id size: %d, group by info size: %d, msg in group total size: %d", java.lang.Integer.valueOf(r1.f121650f.size()), java.lang.Integer.valueOf(r1.f121651g.size()), java.lang.Integer.valueOf(r1.f121652h.size()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0221, code lost:
        return;
     */
    /* renamed from: Z5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70116Z5() {
        /*
            r18 = this;
            r1 = r18
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.util.Map<java.lang.Long, java.lang.Long> r2 = r1.f121650f
            if (r2 == 0) goto L_0x0011
            java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> r2 = r1.f121651g
            if (r2 == 0) goto L_0x0011
            java.util.List<java.lang.Long> r2 = r1.f121652h
            if (r2 == 0) goto L_0x0011
            return
        L_0x0011:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "MicroMsg.ChattingServiceNotifyComponent"
            monitor-enter(r4)
            java.util.Map<java.lang.Long, java.lang.Long> r5 = r1.f121650f     // Catch:{ all -> 0x0224 }
            if (r5 == 0) goto L_0x0026
            java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> r5 = r1.f121651g     // Catch:{ all -> 0x0224 }
            if (r5 == 0) goto L_0x0026
            java.util.List<java.lang.Long> r5 = r1.f121652h     // Catch:{ all -> 0x0224 }
            if (r5 == 0) goto L_0x0026
            monitor-exit(r4)     // Catch:{ all -> 0x0224 }
            return
        L_0x0026:
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0224 }
            r5.<init>()     // Catch:{ all -> 0x0224 }
            r1.f121650f = r5     // Catch:{ all -> 0x0224 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0224 }
            r5.<init>()     // Catch:{ all -> 0x0224 }
            r1.f121651g = r5     // Catch:{ all -> 0x0224 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0224 }
            r5.<init>()     // Catch:{ all -> 0x0224 }
            r1.f121652h = r5     // Catch:{ all -> 0x0224 }
            k40.a r5 = f40.C86709a0.m107533q(r0)     // Catch:{ all -> 0x0224 }
            f62.k0 r5 = (f62.C75700k0) r5     // Catch:{ all -> 0x0224 }
            com.tencent.mm.storage.v3 r5 = r5.mo96094Ku()     // Catch:{ all -> 0x0224 }
            ck3.b r6 = r1.f215752d     // Catch:{ all -> 0x0224 }
            java.lang.String r6 = r6.mo91577r()     // Catch:{ all -> 0x0224 }
            com.tencent.mm.storage.i2 r5 = (com.tencent.p014mm.storage.C44660i2) r5     // Catch:{ all -> 0x0224 }
            com.tencent.mm.storage.h2 r5 = r5.mo69771j(r6)     // Catch:{ all -> 0x0224 }
            if (r5 == 0) goto L_0x007d
            int r6 = r5.mo108786G2()     // Catch:{ all -> 0x0224 }
            if (r6 <= 0) goto L_0x007d
            int r5 = r5.mo108786G2()     // Catch:{ all -> 0x0224 }
            r6 = 100
            int r5 = java.lang.Math.min(r5, r6)     // Catch:{ all -> 0x0224 }
            if (r5 <= 0) goto L_0x007d
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ all -> 0x0224 }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ all -> 0x0224 }
            g62.l r0 = r0.mo96095LE()     // Catch:{ all -> 0x0224 }
            ck3.b r6 = r1.f215752d     // Catch:{ all -> 0x0224 }
            java.lang.String r6 = r6.mo91577r()     // Catch:{ all -> 0x0224 }
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0     // Catch:{ all -> 0x0224 }
            java.util.List r0 = r0.Gx0(r6, r5)     // Catch:{ all -> 0x0224 }
            r1.f121653i = r0     // Catch:{ all -> 0x0224 }
        L_0x007d:
            java.util.List<com.tencent.mm.storage.f4> r0 = r1.f121653i     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x0222
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x0089
            goto L_0x0222
        L_0x0089:
            monitor-exit(r4)     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = "MicroMsg.ChattingServiceNotifyComponent"
            java.lang.String r4 = "unread msg count: %d"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.util.List<com.tencent.mm.storage.f4> r7 = r1.f121653i
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 0
            r6[r8] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r6)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x00ac:
            java.util.List<com.tencent.mm.storage.f4> r13 = r1.f121653i
            int r13 = r13.size()
            r14 = 200(0xc8, float:2.8E-43)
            int r13 = java.lang.Math.min(r13, r14)
            if (r9 >= r13) goto L_0x01d6
            java.util.List<com.tencent.mm.storage.f4> r13 = r1.f121653i
            java.lang.Object r13 = r13.get(r9)
            com.tencent.mm.storage.f4 r13 = (com.tencent.p014mm.storage.C72963f4) r13
            int r14 = r9 + 1
            java.util.List<com.tencent.mm.storage.f4> r15 = r1.f121653i
            int r15 = r15.size()
            if (r14 >= r15) goto L_0x00d5
            java.util.List<com.tencent.mm.storage.f4> r15 = r1.f121653i
            java.lang.Object r15 = r15.get(r14)
            com.tencent.mm.storage.f4 r15 = (com.tencent.p014mm.storage.C72963f4) r15
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            if (r15 == 0) goto L_0x0174
            boolean r10 = r1.mo70115Y5(r15, r13)
            if (r10 == 0) goto L_0x0162
            if (r12 != 0) goto L_0x00ea
            long r6 = r13.getMsgId()
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            r12 = 1
        L_0x00ea:
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            long r16 = r15.getMsgId()
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r0.put(r10, r4)
            long r16 = r15.getMsgId()
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r11.add(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r11.add(r4)
            int r4 = r11.size()
            r10 = 10
            if (r4 < r10) goto L_0x0125
            java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> r4 = r1.f121651g
            long r9 = r15.getMsgId()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r4.put(r9, r11)
            r9 = r14
            r10 = r15
            r11 = 0
            r12 = 0
            goto L_0x0126
        L_0x0125:
            r10 = r13
        L_0x0126:
            java.util.List<java.lang.Long> r4 = r1.f121652h
            long r16 = r13.getMsgId()
            java.lang.Long r14 = java.lang.Long.valueOf(r16)
            boolean r4 = r4.contains(r14)
            if (r4 != 0) goto L_0x0143
            java.util.List<java.lang.Long> r4 = r1.f121652h
            long r13 = r13.getMsgId()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r4.add(r13)
        L_0x0143:
            java.util.List<java.lang.Long> r4 = r1.f121652h
            long r13 = r15.getMsgId()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            boolean r4 = r4.contains(r13)
            if (r4 != 0) goto L_0x01d3
            java.util.List<java.lang.Long> r4 = r1.f121652h
            long r13 = r15.getMsgId()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r4.add(r13)
            goto L_0x01d3
        L_0x0162:
            if (r11 == 0) goto L_0x0171
            java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> r4 = r1.f121651g
            long r14 = r13.getMsgId()
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r4.put(r10, r11)
        L_0x0171:
            r10 = r13
            r11 = 0
            goto L_0x01d2
        L_0x0174:
            if (r10 == 0) goto L_0x01d3
            boolean r4 = r1.mo70115Y5(r13, r10)
            if (r4 == 0) goto L_0x01d2
            if (r12 == 0) goto L_0x01d2
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            long r14 = r13.getMsgId()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r0.put(r4, r14)
            if (r11 != 0) goto L_0x0195
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r11 = r4
        L_0x0195:
            java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> r4 = r1.f121651g
            long r14 = r13.getMsgId()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r4.put(r14, r11)
            long r14 = r13.getMsgId()
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r11.add(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r11.add(r4)
            java.util.List<java.lang.Long> r4 = r1.f121652h
            long r14 = r13.getMsgId()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r4 = r4.contains(r14)
            if (r4 != 0) goto L_0x01d3
            java.util.List<java.lang.Long> r4 = r1.f121652h
            long r13 = r13.getMsgId()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r4.add(r13)
            goto L_0x01d3
        L_0x01d2:
            r12 = 0
        L_0x01d3:
            int r9 = r9 + r5
            goto L_0x00ac
        L_0x01d6:
            java.util.Map<java.lang.Long, java.lang.Long> r4 = r1.f121650f
            r4.putAll(r0)
            r0.clear()
            java.lang.String r0 = "MicroMsg.ChattingServiceNotifyComponent"
            java.lang.String r4 = "initMessageGroupInfo cost: %dms"
            java.lang.Object[] r6 = new java.lang.Object[r5]
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r6[r8] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r6)
            java.lang.String r0 = "MicroMsg.ChattingServiceNotifyComponent"
            java.lang.String r2 = "end to head msg id size: %d, group by info size: %d, msg in group total size: %d"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.util.Map<java.lang.Long, java.lang.Long> r4 = r1.f121650f
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r8] = r4
            java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> r4 = r1.f121651g
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r5] = r4
            r4 = 2
            java.util.List<java.lang.Long> r5 = r1.f121652h
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
            return
        L_0x0222:
            monitor-exit(r4)     // Catch:{ all -> 0x0224 }
            return
        L_0x0224:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0224 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C44825h1.mo70116Z5():void");
    }

    /* renamed from: a6 */
    public final void mo70117a6(int i, int i2, int i3, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        if (this.f215752d.f193286j.findMenuInfo(i) == null) {
            this.f215752d.f193286j.addIconOptionMenu(i, i2, i3, onMenuItemClickListener);
        } else {
            this.f215752d.f193286j.updateOptionMenu(i, i2, i3, onMenuItemClickListener);
        }
    }

    /* renamed from: e */
    public void mo70065e() {
        this.f121649e = this.f215752d.f193286j.getStringExtra("key_notify_message_real_username");
        if (mo70122s3() || mo70111L3()) {
            this.f121654j = 0;
        }
    }

    /* renamed from: g2 */
    public long mo70118g2(long j) {
        if (!mo70111L3()) {
            return -1;
        }
        mo70116Z5();
        Long l = this.f121650f.get(Long.valueOf(j));
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    /* renamed from: i */
    public boolean mo70119i() {
        if (!mo70111L3()) {
            return false;
        }
        this.f215752d.f193286j.removeOptionMenu(0);
        boolean z = true;
        if (mo70122s3()) {
            mo70117a6(4, C0966R.string.k3j, C0966R.raw.actionbar_icon_dark_search, this.f121656o);
            if (!mo70122s3() || !C72996z1.m85804J4(this.f121649e)) {
                z = false;
            }
            if (z) {
                mo70117a6(5, C0966R.string.f7375ef, C0966R.raw.actionbar_setting_icon, this.f121656o);
            }
        } else {
            ((C30757l4) C97625j3.m125812b().mo105875A()).getClass();
            if (C30757l4.f82706f) {
                this.f215752d.mo91554O(false);
                return true;
            }
            mo70117a6(4, C0966R.string.k3j, C0966R.raw.actionbar_icon_dark_search, this.f121656o);
            mo70117a6(5, C0966R.string.f7373ed, C0966R.raw.actionbar_menu_list_icon, this.f121656o);
        }
        return false;
    }

    /* renamed from: i5 */
    public Set<Long> mo70120i5(long j) {
        if (!mo70111L3()) {
            return null;
        }
        mo70116Z5();
        return this.f121651g.get(Long.valueOf(j));
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        Map<Long, Long> map;
        Class cls = C79368l.class;
        if (mo70111L3()) {
            Log.m105924i("MicroMsg.ChattingServiceNotifyComponent", "onChattingExitAnimEnd");
            this.f215752d.f193286j.removeOptionMenu(4);
            this.f215752d.f193286j.removeOptionMenu(5);
            int count = ((C79368l) this.f215752d.f193278b.mo102812a(cls)).getCount();
            for (int i = count - this.f121654j; i < count; i++) {
                C72963f4 item = ((C79368l) this.f215752d.f193278b.mo102812a(cls)).getItem(i);
                if (!(item == null || (map = this.f121650f) == null || !map.containsKey(Long.valueOf(item.getMsgId())))) {
                    mo70114X4(1, item);
                }
            }
            Map<Long, Long> map2 = this.f121650f;
            if (map2 != null) {
                map2.clear();
            }
            this.f121650f = null;
            Map<Long, Set<Long>> map3 = this.f121651g;
            if (map3 != null) {
                map3.clear();
            }
            this.f121651g = null;
            List<Long> list = this.f121652h;
            if (list != null) {
                list.clear();
            }
            this.f121652h = null;
            synchronized ("MicroMsg.ChattingServiceNotifyComponent") {
                List<C72963f4> list2 = this.f121653i;
                if (list2 != null) {
                    list2.clear();
                }
                this.f121653i = null;
            }
            if (!this.f121655n && !mo70122s3()) {
                Log.m105924i("MicroMsg.ChattingServiceNotifyComponent", "check record");
                C37355b A = C97625j3.m125812b().mo105875A();
                if (A == null) {
                    Log.m105920e("MicroMsg.ChattingServiceNotifyComponent", "get message notify storage return null");
                } else {
                    ((C119157j) C119157j.f356862d).mo183870a(new C30820i1(this, A));
                }
                this.f121655n = true;
            }
        }
    }

    /* renamed from: o */
    public boolean mo70121o() {
        if (!mo70122s3()) {
            return false;
        }
        ((C79343c0) this.f215752d.f193278b.mo102812a(C79343c0.class)).mo102599A4();
        return true;
    }

    /* renamed from: s3 */
    public boolean mo70122s3() {
        return !Util.isNullOrNil(this.f215752d.mo91577r()) && C72996z1.m85840k5(this.f215752d.mo91577r()) && !Util.isNullOrNil(this.f121649e);
    }

    /* renamed from: u0 */
    public boolean mo70123u0(C72963f4 f4Var, C72963f4 f4Var2, String str) {
        if (!(Util.isNullOrNil(str) ? false : C72996z1.m85840k5(str))) {
            return false;
        }
        Log.m105924i("MicroMsg.ChattingServiceNotifyComponent", "checkIfNeedGroupMsg");
        mo70116Z5();
        return mo70115Y5(f4Var, f4Var2);
    }

    /* renamed from: x3 */
    public void mo70124x3(LinearLayout linearLayout) {
        String str;
        Class cls = C75339i.class;
        if (mo70122s3()) {
            if (Util.isNullOrNil(this.f121649e)) {
                Log.m105920e("MicroMsg.ChattingServiceNotifyComponent", "username is null");
                return;
            }
            boolean J4 = C72996z1.m85804J4(this.f121649e);
            Activity f = this.f215752d.mo91565f();
            View findViewById = linearLayout.findViewById(C0966R.C0970id.b8a);
            ImageView imageView = (ImageView) linearLayout.findViewById(C0966R.C0970id.i4g);
            TextView textView = (TextView) linearLayout.findViewById(C0966R.C0970id.f358975i63);
            TextView textView2 = (TextView) linearLayout.findViewById(C0966R.C0970id.i78);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C44828c(J4, f));
            }
            if (imageView != null) {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(imageView, this.f121649e);
            }
            if (textView != null) {
                if (J4) {
                    WxaProfileAttributes b = C81661j.m100177b(this.f121649e, false);
                    str = b != null ? b.f239577f : "";
                } else {
                    str = ((C75339i) C86312j.m106911c(cls)).getDisplayName(this.f121649e);
                }
                textView.setText(((C75339i) C86312j.m106911c(cls)).getDisplayName(str));
            }
            if (textView2 != null) {
                textView2.setText(f.getString(J4 ? C0966R.string.a4n : C0966R.string.f2o));
            }
        }
    }

    /* renamed from: z5 */
    public List<C72963f4> mo70125z5(long j) {
        ArrayList arrayList = new ArrayList();
        if (!mo70111L3()) {
            return arrayList;
        }
        Set<Long> set = null;
        if (mo70111L3()) {
            long g2 = mo70118g2(j);
            if (g2 > 0) {
                set = mo70120i5(g2);
            }
        }
        if (set == null) {
            return arrayList;
        }
        for (C72963f4 next : this.f121653i) {
            if (set.contains(Long.valueOf(next.getMsgId()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
