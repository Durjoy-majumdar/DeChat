package com.tencent.p014mm.pluginsdk.forward;

import android.content.Context;
import android.os.SystemClock;
import android.view.MenuItem;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.p136ui.transmit.recent.C57853e;
import com.tencent.p014mm.p136ui.transmit.recent.C74925d;
import com.tencent.p014mm.p136ui.transmit.recent.C74927f;
import com.tencent.p014mm.p136ui.transmit.recent.ForwardConversationInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C47269o0;
import nj3.C61772i0;
import nj3.C76874e0;
import nj3.C76875f0;
import p244tt.C14088e;
import p640ox.C77049b;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C64291co3;
import uo3.C78253a;
import wc3.C15133e0;
import wc3.C78536j0;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.pluginsdk.forward.b */
public final class C72671b extends C86301e implements C15133e0 {

    /* renamed from: d */
    public ArrayList<ForwardConversationInfo> f211434d = new ArrayList<>();

    /* renamed from: e */
    public int f211435e;

    /* renamed from: f */
    public C78253a f211436f;

    /* renamed from: g */
    public C76874e0 f211437g;

    /* renamed from: h */
    public Context f211438h;

    /* renamed from: i */
    public final int f211439i = 2;

    /* renamed from: com.tencent.mm.pluginsdk.forward.b$a */
    public static final class C57533a implements C77407n.C77420r {

        /* renamed from: a */
        public final /* synthetic */ Context f164777a;

        /* renamed from: b */
        public final /* synthetic */ C72671b f164778b;

        public C57533a(Context context, C72671b bVar) {
            this.f164777a = context;
            this.f164778b = bVar;
        }

        public final void onShow() {
            C64291co3 co32 = (C64291co3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(this.f164777a, 14, C64291co3.class);
            if (co32 != null) {
                co32.f182548p = this.f164778b.f211439i;
                co32.f182550r = SystemClock.elapsedRealtime();
                co32.f182541f = null;
                co32.f182540e = 0;
                co32.f182542g = 0;
                co32.f182543h = 0;
                co32.f182549q = null;
                co32.f182547o = 0;
                co32.f182539d = 0;
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.forward.b$b */
    public static final class C72672b implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C72671b f211440d;

        /* renamed from: e */
        public final /* synthetic */ Context f211441e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f211442f;

        /* renamed from: g */
        public final /* synthetic */ int f211443g;

        /* renamed from: h */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f211444h;

        public C72672b(C72671b bVar, Context context, C77407n nVar, int i, C32226l<? super Boolean, C13598b0> lVar) {
            this.f211440d = bVar;
            this.f211441e = context;
            this.f211442f = nVar;
            this.f211443g = i;
            this.f211444h = lVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.clear();
            this.f211440d.mo14095wW(this.f211441e, e0Var, this.f211442f, this.f211443g, this.f211444h);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.forward.b$c */
    public static final class C72673c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C72671b f211445d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<String, C13598b0> f211446e;

        /* renamed from: com.tencent.mm.pluginsdk.forward.b$c$a */
        public static final class C72674a extends C87413o implements C32226l<String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C32226l<String, C13598b0> f211447d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C72674a(C32226l<? super String, C13598b0> lVar) {
                super(1);
                this.f211447d = lVar;
            }

            public Object invoke(Object obj) {
                String str = (String) obj;
                C87412m.m108594g(str, LocaleUtil.ITALIAN);
                C32226l<String, C13598b0> lVar = this.f211447d;
                if (lVar != null) {
                    lVar.invoke(str);
                }
                return C13598b0.f38549a;
            }
        }

        public C72673c(C72671b bVar, C32226l<? super String, C13598b0> lVar) {
            this.f211445d = bVar;
            this.f211446e = lVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C72671b bVar = this.f211445d;
            C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            bVar.xc0((C76875f0) menuItem, new C72674a(this.f211446e));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.forward.b$d */
    public static final class C72675d implements C47269o0 {

        /* renamed from: a */
        public final /* synthetic */ C72671b f211448a;

        /* renamed from: b */
        public final /* synthetic */ C77407n f211449b;

        public C72675d(C72671b bVar, C77407n nVar) {
            this.f211448a = bVar;
            this.f211449b = nVar;
        }

        /* renamed from: a */
        public final void mo2584a(MenuItem menuItem, int i) {
            C72671b bVar = this.f211448a;
            C77407n nVar = this.f211449b;
            C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            bVar.mo14089YM(nVar, (C76875f0) menuItem);
        }
    }

    public ArrayList<C78536j0> Bv0() {
        vx0();
        ArrayList<C78536j0> arrayList = new ArrayList<>();
        if (!this.f211434d.isEmpty()) {
            Iterator<ForwardConversationInfo> it = this.f211434d.iterator();
            while (it.hasNext()) {
                ForwardConversationInfo next = it.next();
                C87412m.m108593f(next, "conversationList");
                ForwardConversationInfo forwardConversationInfo = next;
                String str = forwardConversationInfo.f220303g;
                if (Util.isNullOrNil(str)) {
                    str = forwardConversationInfo.f220301e;
                }
                if (Util.isNullOrNil(str)) {
                    str = forwardConversationInfo.f220302f;
                }
                String str2 = forwardConversationInfo.f220300d;
                C87412m.m108591d(str2);
                String str3 = ((IPCString) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new IPCString(forwardConversationInfo.f220300d), ((C14088e) C86312j.m106911c(C14088e.class)).mo13503Jb())).f10315d;
                C87412m.m108593f(str3, "result.value");
                arrayList.add(new C78536j0(str2, str, str3));
            }
        }
        return arrayList;
    }

    public C15133e0 Ct0() {
        return new C72671b();
    }

    /* renamed from: LS */
    public void mo14086LS(C77407n nVar, C76874e0 e0Var) {
        C87412m.m108594g(nVar, "sheet");
        C87412m.m108594g(e0Var, "menu");
        if (nVar.mo107563h()) {
            wx0(e0Var, true);
            nVar.mo107564i();
        }
    }

    public void Q60(Context context, C77407n nVar, int i, C32226l<? super Boolean, C13598b0> lVar, C32226l<? super String, C13598b0> lVar2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(nVar, "bottomSheet");
        nVar.f225778n = new C72672b(this, context, nVar, i, lVar);
        nVar.f225789s = new C72673c(this, lVar2);
        nVar.f225791t = new C72675d(this, nVar);
    }

    public void Sd0(Context context, C76874e0 e0Var, C77407n nVar, C61772i0 i0Var, int i, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(nVar, "sheet");
        this.f211438h = context;
        this.f211437g = e0Var;
        nVar.f225765f = new C57533a(context, this);
        vx0();
        if (this.f211434d.size() == 0) {
            Log.m105924i("MircoMsg.RecentForwardMenuHelper", "addMenus return for conversationList empty!");
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        C74927f.f220307a.mo104182a(context, nVar, i);
        if (i0Var != null) {
            nVar.f225728F = i0Var;
        } else {
            nVar.f225728F = C57853e.f165489a;
        }
        wx0(e0Var, false);
        if (lVar != null) {
            lVar.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: YM */
    public boolean mo14089YM(C77407n nVar, C76875f0 f0Var) {
        C87412m.m108594g(nVar, "bottomSheet");
        C87412m.m108594g(f0Var, "menu");
        return m20(nVar, f0Var, 1);
    }

    public void dead() {
    }

    public void el0(Context context, C76874e0 e0Var, C77407n nVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(nVar, "sheet");
        mo14095wW(context, e0Var, nVar, 1, (C32226l<? super Boolean, C13598b0>) null);
    }

    public int getItemCount() {
        return this.f211435e;
    }

    public void hw0() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r0 = r0.getLayoutManager();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m20(qo3.C77407n r17, nj3.C76875f0 r18, int r19) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            java.lang.String r0 = "bottomSheet"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "menu"
            gy3.C87412m.m108594g(r8, r0)
            java.util.ArrayList<com.tencent.mm.ui.transmit.recent.ForwardConversationInfo> r0 = r6.f211434d
            int r9 = r0.size()
            r10 = 0
            r0 = 0
            r1 = 0
            r11 = 0
        L_0x001a:
            if (r11 >= r9) goto L_0x00b4
            java.util.ArrayList<com.tencent.mm.ui.transmit.recent.ForwardConversationInfo> r1 = r6.f211434d
            java.lang.Object r1 = r1.get(r11)
            com.tencent.mm.ui.transmit.recent.ForwardConversationInfo r1 = (com.tencent.p014mm.p136ui.transmit.recent.ForwardConversationInfo) r1
            java.lang.String r1 = r1.f220300d
            java.lang.String r2 = r8.f224730y
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            r12 = 1
            if (r1 == 0) goto L_0x00b0
            uo3.a r0 = r6.f211436f
            if (r0 == 0) goto L_0x0036
            r0.mo108266a()
        L_0x0036:
            androidx.recyclerview.widget.RecyclerView r0 = r7.f225749V0
            if (r0 == 0) goto L_0x0045
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            if (r0 == 0) goto L_0x0045
            android.view.View r0 = r0.findViewByPosition(r11)
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            r13 = r0
            if (r13 == 0) goto L_0x00af
            uo3.a r0 = new uo3.a
            android.content.Context r1 = r13.getContext()
            r0.<init>(r1)
            r0.f229225A = r12
            com.tencent.mm.pluginsdk.forward.d r1 = new com.tencent.mm.pluginsdk.forward.d
            r1.<init>(r6)
            r0.f229227C = r1
            r6.f211436f = r0
            r0 = 2
            int[] r14 = new int[r0]
            r14 = {0, 0} // fill-array
            r13.getLocationInWindow(r14)
            com.tencent.mm.pluginsdk.forward.e r15 = new com.tencent.mm.pluginsdk.forward.e
            r0 = r15
            r1 = r16
            r2 = r18
            r3 = r17
            r4 = r19
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            uo3.a r0 = r6.f211436f
            if (r0 == 0) goto L_0x00af
            r1 = r14[r10]
            float r1 = (float) r1
            int r2 = r13.getWidth()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 + r2
            int r1 = (int) r1
            r2 = r14[r12]
            r0.f229251t = r15
            r0.f229240f = r13
            boolean r3 = r13 instanceof android.widget.TextView
            if (r3 != 0) goto L_0x0097
            if (r1 == 0) goto L_0x0094
            if (r2 != 0) goto L_0x0097
        L_0x0094:
            r0.mo108277l()
        L_0x0097:
            nj3.e0 r3 = r0.f229254w
            r3.clear()
            nj3.e0 r3 = r0.f229254w
            r4 = 2131835525(0x7f113a85, float:1.9304191E38)
            r3.mo107125a(r10, r4)
            if (r1 != 0) goto L_0x00ac
            if (r2 != 0) goto L_0x00ac
            r0.mo70679m()
            goto L_0x00af
        L_0x00ac:
            r0.mo71743n(r1, r2)
        L_0x00af:
            r0 = 1
        L_0x00b0:
            int r11 = r11 + 1
            goto L_0x001a
        L_0x00b4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.forward.C72671b.m20(qo3.n, nj3.f0, int):boolean");
    }

    public final void vx0() {
        this.f211434d.clear();
        ArrayList<ForwardConversationInfo> a = MMApplicationContext.isMainProcess() ? new C74925d().mo104180a() : new C74925d().mo104181b();
        this.f211434d = a;
        this.f211435e = a.size();
    }

    /* renamed from: wW */
    public void mo14095wW(Context context, C76874e0 e0Var, C77407n nVar, int i, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(nVar, "sheet");
        Sd0(context, e0Var, nVar, (C61772i0) null, i, lVar);
    }

    public final void wx0(C76874e0 e0Var, boolean z) {
        ((ArrayList) e0Var.f224704d).clear();
        int size = this.f211434d.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                int i2 = i + 10000;
                String str = this.f211434d.get(i).f220303g;
                if (Util.isNullOrNil(str)) {
                    str = this.f211434d.get(i).f220301e;
                }
                if (Util.isNullOrNil(str)) {
                    str = this.f211434d.get(i).f220302f;
                }
                String str2 = this.f211434d.get(i).f220300d;
                C76875f0 f0Var = new C76875f0(e0Var.f224706f, i2, 0);
                f0Var.f224719n = str;
                f0Var.f224730y = str2;
                f0Var.f224722q = z;
                ((ArrayList) e0Var.f224704d).add(f0Var);
            }
        }
    }

    public boolean xc0(C76875f0 f0Var, C32226l<? super String, C13598b0> lVar) {
        C64291co3 co32;
        C87412m.m108594g(f0Var, "menu");
        C87412m.m108594g(lVar, "callback");
        int i = f0Var.f224715g - 10000;
        if (this.f211434d.size() <= i || i < 0) {
            return false;
        }
        Context context = this.f211438h;
        if (!(context == null || (co32 = (C64291co3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(context, 14, C64291co3.class)) == null)) {
            co32.f182542g = i + 1;
        }
        String str = this.f211434d.get(i).f220300d;
        if (str == null) {
            str = "";
        }
        lVar.invoke(str);
        return true;
    }
}
