package com.tencent.p014mm.plugin.finder.feed.p052ui;

import ak1.C54116w;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WebViewExWindowCloseEvent;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import ke3.C88144b;
import kotlin.Metadata;
import nj3.C76912y0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI */
public final class FinderLivePostSecurityUI extends MMFinderUI {

    /* renamed from: o */
    public final String f14543o = "FinderLivePostSecurityUI";

    /* renamed from: p */
    public final C13601g f14544p = C36568h.m40985a(new C2971d(this));

    /* renamed from: q */
    public final C13601g f14545q = C36568h.m40985a(new C2973f(this));

    /* renamed from: r */
    public final C13601g f14546r = C36568h.m40985a(new C2970c(this));

    /* renamed from: s */
    public final C13601g f14547s = C36568h.m40985a(new C2969b(this));

    /* renamed from: t */
    public final C13601g f14548t = C36568h.m40985a(new C2968a(this));

    /* renamed from: u */
    public final int f14549u = 10000;

    /* renamed from: v */
    public final int f14550v = 10001;

    /* renamed from: w */
    public int f14551w = -1;

    /* renamed from: x */
    public long f14552x;

    /* renamed from: y */
    public final IListener<WebViewExWindowCloseEvent> f14553y = new FinderLivePostSecurityUI$exWindowCloseEventIListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI$a */
    public static final class C2968a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePostSecurityUI f14554d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2968a(FinderLivePostSecurityUI finderLivePostSecurityUI) {
            super(0);
            this.f14554d = finderLivePostSecurityUI;
        }

        public Object invoke() {
            return (TextView) this.f14554d.findViewById(C0966R.C0970id.n_x);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI$b */
    public static final class C2969b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePostSecurityUI f14555d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2969b(FinderLivePostSecurityUI finderLivePostSecurityUI) {
            super(0);
            this.f14555d = finderLivePostSecurityUI;
        }

        public Object invoke() {
            return (TextView) this.f14555d.findViewById(C0966R.C0970id.n_v);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI$c */
    public static final class C2970c extends C87413o implements C32224a<MMNeat7extView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePostSecurityUI f14556d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2970c(FinderLivePostSecurityUI finderLivePostSecurityUI) {
            super(0);
            this.f14556d = finderLivePostSecurityUI;
        }

        public Object invoke() {
            return (MMNeat7extView) this.f14556d.findViewById(C0966R.C0970id.n_w);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI$d */
    public static final class C2971d extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePostSecurityUI f14557d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2971d(FinderLivePostSecurityUI finderLivePostSecurityUI) {
            super(0);
            this.f14557d = finderLivePostSecurityUI;
        }

        public Object invoke() {
            return (ImageView) this.f14557d.findViewById(C0966R.C0970id.n_y);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI$e */
    public static final class C2972e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePostSecurityUI f14558d;

        public C2972e(FinderLivePostSecurityUI finderLivePostSecurityUI) {
            this.f14558d = finderLivePostSecurityUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14558d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI$f */
    public static final class C2973f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePostSecurityUI f14559d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2973f(FinderLivePostSecurityUI finderLivePostSecurityUI) {
            super(0);
            this.f14559d = finderLivePostSecurityUI;
        }

        public Object invoke() {
            return (TextView) this.f14559d.findViewById(C0966R.C0970id.n_z);
        }
    }

    /* renamed from: N7 */
    public static final void m2864N7(FinderLivePostSecurityUI finderLivePostSecurityUI, String str) {
        finderLivePostSecurityUI.getClass();
        Intent intent = new Intent();
        if (C58739j4.f168176a.mo83692U()) {
            AppCompatActivity context = finderLivePostSecurityUI.getContext();
            C76912y0.makeText((Context) context, (CharSequence) "url: " + str, 0).show();
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", true);
        intent.putExtra("forceHideShare", true);
        C88144b.m109796n(finderLivePostSecurityUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, finderLivePostSecurityUI.f14550v, true);
    }

    /* renamed from: Q7 */
    public static /* synthetic */ String m2865Q7(FinderLivePostSecurityUI finderLivePostSecurityUI, Boolean bool, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i & 2) != 0) {
            l = 0L;
        }
        return finderLivePostSecurityUI.mo3027O7(bool, l);
    }

    /* renamed from: O7 */
    public final String mo3027O7(Boolean bool, Long l) {
        Class cls = LiveAnchorSlice.class;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        int i = bVar != null ? ((LiveAnchorSlice) bVar.mo71262a(cls)).f160032h : 0;
        finderLiveService.getClass();
        C45795b bVar2 = FinderLiveService.f159348A;
        long j = bVar2 != null ? ((LiveAnchorSlice) bVar2.mo71262a(cls)).f160033i : 0;
        try {
            C104289g gVar = new C104289g();
            gVar.put("finder_username", C66785b.f191882e.mo90662O5());
            gVar.mo145953n("entrance_type", i);
            gVar.mo145954o("entrance_id", j);
            if (C87412m.m108589b(bool, Boolean.TRUE)) {
                gVar.put("staytime", l);
            }
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "{\n            val json =…json.toString()\n        }");
            return gVar2;
        } catch (Exception unused) {
            return "{}";
        }
    }

    /* renamed from: P7 */
    public final HashMap<String, String> mo3028P7(String str) {
        Class cls = LiveAnchorSlice.class;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        int i = bVar != null ? ((LiveAnchorSlice) bVar.mo71262a(cls)).f160032h : 0;
        finderLiveService.getClass();
        C45795b bVar2 = FinderLiveService.f159348A;
        long j = bVar2 != null ? ((LiveAnchorSlice) bVar2.mo71262a(cls)).f160033i : 0;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("page_id", str);
        hashMap.put("fidner_username", C66785b.f191882e.mo90662O5());
        hashMap.put("entrance_type", String.valueOf(i));
        hashMap.put("entrance_id", String.valueOf(j));
        return hashMap;
    }

    /* renamed from: R7 */
    public final MMNeat7extView mo3029R7() {
        return (MMNeat7extView) ((C36570n) this.f14546r).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cyp;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Class cls = C54116w.class;
        String str = this.f14543o;
        Log.m105924i(str, "onActivityResult requestCode:" + i + " , resultCode:" + i2);
        if (i == this.f14549u) {
            ((C54116w) C86312j.m106911c(cls)).Ey0("159", mo3027O7(Boolean.TRUE, Long.valueOf(C31543z5.m39453c() - this.f14552x)));
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (i2 == -1 && bundleExtra != null) {
                String string = bundleExtra.getString("result_json");
                if (!Util.isNullOrNil(string)) {
                    int i3 = new C104289g(string).getInt("code");
                    String str2 = this.f14543o;
                    Log.m105924i(str2, "onFaceVertifyResult, code:" + i3);
                    if (i3 == 0) {
                        setResult(-1);
                        finish();
                    }
                }
            }
        } else if (i == this.f14550v) {
            ((C54116w) C86312j.m106911c(cls)).Ey0("161", mo3027O7(Boolean.TRUE, Long.valueOf(C31543z5.m39453c() - this.f14552x)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x02b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r8 = r22
            java.lang.Class<ht1.j5> r9 = ht1.C8777j5.class
            super.onCreate(r23)
            java.lang.String r0 = ""
            r8.setMMTitle((java.lang.String) r0)
            androidx.appcompat.app.AppCompatActivity r0 = r22.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131101835(0x7f06088b, float:1.781609E38)
            int r0 = r0.getColor(r1)
            r8.setActionbarColor(r0)
            r22.hideActionbarLine()
            com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI$e r0 = new com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI$e
            r0.<init>(r8)
            r8.setBackBtn(r0)
            androidx.appcompat.app.AppCompatActivity r0 = r22.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            r8.setNavigationbarColor(r0)
            android.content.Intent r0 = r22.getIntent()
            java.lang.String r1 = "INTENT_KEY_ERROR_PAGE_TYPE"
            r2 = -1
            int r0 = r0.getIntExtra(r1, r2)
            r8.f14551w = r0
            long r0 = eb0.C31543z5.m39453c()
            r8.f14552x = r0
            android.content.Intent r0 = r22.getIntent()
            java.lang.String r1 = "INTENT_KEY_ERROR_PAGE_INFO"
            byte[] r0 = r0.getByteArrayExtra(r1)
            java.lang.String r10 = "getService(IHellLiveReport::class.java)"
            java.lang.String r11 = "160"
            r12 = 4
            r13 = 0
            if (r0 == 0) goto L_0x0202
            te3.gj0 r1 = new te3.gj0     // Catch:{ Exception -> 0x0067 }
            r1.<init>()     // Catch:{ Exception -> 0x0067 }
            r1.parseFrom(r0)     // Catch:{ Exception -> 0x0067 }
            r0 = r1
            goto L_0x0083
        L_0x0067:
            r0 = move-exception
            java.lang.String r1 = r8.f14543o
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "invaild data, exception = "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = r13
        L_0x0083:
            if (r0 == 0) goto L_0x0202
            java.lang.String r1 = r8.f14543o
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "data = "
            r2.append(r3)
            org.json.JSONObject r3 = o40.C61937h.m72709h(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.Class<pl1.s0> r1 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r3 == 0) goto L_0x00ac
            java.lang.String r3 = r0.f134073o
            goto L_0x00ae
        L_0x00ac:
            java.lang.String r3 = r0.f134065d
        L_0x00ae:
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r2)
            bl3.c r5 = r5.mo62447c(r1)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            pl1.n0 r6 = new pl1.n0
            up1.y r7 = up1.C27696y.THUMB_IMAGE
            r6.<init>(r3, r7)
            rx3.g r3 = r8.f14544p
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.String r7 = "iconView"
            gy3.C87412m.m108593f(r3, r7)
            pl1.e0$a r7 = pl1.C11978e0.C11979a.DEFAULT
            bl3.r$a r2 = r4.mo62446e(r2)
            bl3.c r1 = r2.mo62447c(r1)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r7)
            r5.mo85957c(r6, r3, r1)
            rx3.g r1 = r8.f14545q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = "titleView"
            gy3.C87412m.m108593f(r1, r2)
            er1.C7919x.m8091a(r1)
            rx3.g r1 = r8.f14545q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r0.f134066e
            r1.setText(r2)
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            java.lang.String r3 = r0.f134067f
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r22.mo3029R7()
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r5 = 1
            r6 = 0
            r7 = 0
            r2 = r22
            android.text.SpannableString r1 = r1.hv0(r2, r3, r4, r5, r6, r7)
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r22.mo3029R7()
            r3 = 2131165281(0x7f070061, float:1.7944775E38)
            int r3 = kg3.C76577a.m92157h(r8, r3)
            r2.setSpacingAdd(r3)
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r22.mo3029R7()
            android.widget.TextView$BufferType r3 = android.widget.TextView.BufferType.SPANNABLE
            r2.mo104280c(r1, r3, r13)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r22.mo3029R7()
            de3.o r2 = new de3.o
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r22.mo3029R7()
            de3.a0 r4 = new de3.a0
            com.tencent.mm.ui.widget.MMNeat7extView r5 = r22.mo3029R7()
            android.content.Context r5 = r5.getContext()
            r4.<init>(r5)
            r2.<init>(r3, r4)
            r1.setOnTouchListener(r2)
            rx3.g r1 = r8.f14547s
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = "confirmBtnView"
            gy3.C87412m.m108593f(r1, r2)
            er1.C7919x.m8091a(r1)
            rx3.g r1 = r8.f14547s
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r0.f134068g
            r1.setText(r2)
            rx3.g r1 = r8.f14547s
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            vf1.i3 r2 = new vf1.i3
            r2.<init>(r8, r0)
            r1.setOnClickListener(r2)
            java.lang.String r1 = r0.f134072n
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x019b
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0199
            goto L_0x019b
        L_0x0199:
            r4 = 0
            goto L_0x019c
        L_0x019b:
            r4 = 1
        L_0x019c:
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x01a0
            goto L_0x01a1
        L_0x01a0:
            r1 = r13
        L_0x01a1:
            if (r1 == 0) goto L_0x01ef
            rx3.g r3 = r8.f14548t
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setText(r1)
            rx3.g r1 = r8.f14548t
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setVisibility(r2)
            di3.d r1 = di3.C86312j.m106911c(r9)
            gy3.C87412m.m108593f(r1, r10)
            r14 = r1
            ht1.j5 r14 = (ht1.C8777j5) r14
            ak1.f0$n r15 = ak1.C54067f0.C0066n.LIVE_SAFETY_PROHIBIT_APPEAL
            java.util.HashMap r16 = r8.mo3028P7(r11)
            r17 = 0
            r19 = 0
            r20 = 20
            r21 = 0
            java.lang.String r18 = "160"
            ht1.C8777j5.C8778a.m8609j(r14, r15, r16, r17, r18, r19, r20, r21)
            rx3.g r1 = r8.f14548t
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            vf1.j3 r2 = new vf1.j3
            r2.<init>(r8, r0)
            r1.setOnClickListener(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x01f0
        L_0x01ef:
            r0 = r13
        L_0x01f0:
            if (r0 != 0) goto L_0x01ff
            rx3.g r0 = r8.f14548t
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r12)
        L_0x01ff:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0203
        L_0x0202:
            r0 = r13
        L_0x0203:
            if (r0 != 0) goto L_0x020f
            java.lang.String r0 = r8.f14543o
            java.lang.String r1 = "invaild data, finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r22.finish()
        L_0x020f:
            java.lang.Class<ak1.w> r0 = ak1.C54116w.class
            int r1 = r8.f14551w
            java.lang.String r2 = "158"
            java.lang.String r3 = "157"
            r4 = 3
            r5 = 2
            if (r1 == r5) goto L_0x023c
            if (r1 == r4) goto L_0x022e
            if (r1 == r12) goto L_0x0220
            goto L_0x0249
        L_0x0220:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ak1.w r0 = (ak1.C54116w) r0
            java.lang.String r1 = m2865Q7(r8, r13, r13, r4, r13)
            r0.Dy0(r11, r1)
            goto L_0x0249
        L_0x022e:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ak1.w r0 = (ak1.C54116w) r0
            java.lang.String r1 = m2865Q7(r8, r13, r13, r4, r13)
            r0.Dy0(r2, r1)
            goto L_0x0249
        L_0x023c:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ak1.w r0 = (ak1.C54116w) r0
            java.lang.String r1 = m2865Q7(r8, r13, r13, r4, r13)
            r0.Dy0(r3, r1)
        L_0x0249:
            int r0 = r8.f14551w
            if (r0 == r5) goto L_0x028c
            if (r0 == r4) goto L_0x026f
            if (r0 == r12) goto L_0x0252
            goto L_0x02a8
        L_0x0252:
            di3.d r0 = di3.C86312j.m106911c(r9)
            gy3.C87412m.m108593f(r0, r10)
            r12 = r0
            ht1.j5 r12 = (ht1.C8777j5) r12
            ak1.f0$n r13 = ak1.C54067f0.C0066n.LIVE_SAFETY_PROHIBIT_KNOW
            java.util.HashMap r14 = r8.mo3028P7(r11)
            r15 = 0
            r17 = 0
            r18 = 20
            r19 = 0
            java.lang.String r16 = "160"
            ht1.C8777j5.C8778a.m8609j(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x02a8
        L_0x026f:
            di3.d r0 = di3.C86312j.m106911c(r9)
            gy3.C87412m.m108593f(r0, r10)
            r11 = r0
            ht1.j5 r11 = (ht1.C8777j5) r11
            ak1.f0$n r12 = ak1.C54067f0.C0066n.LIVE_SAFETY_GUIDE_GO
            java.util.HashMap r13 = r8.mo3028P7(r2)
            r14 = 0
            r16 = 0
            r17 = 20
            r18 = 0
            java.lang.String r15 = "158"
            ht1.C8777j5.C8778a.m8609j(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02a8
        L_0x028c:
            di3.d r0 = di3.C86312j.m106911c(r9)
            gy3.C87412m.m108593f(r0, r10)
            r11 = r0
            ht1.j5 r11 = (ht1.C8777j5) r11
            ak1.f0$n r12 = ak1.C54067f0.C0066n.LIVE_SAFETY_REVISE_GO
            java.util.HashMap r13 = r8.mo3028P7(r3)
            r14 = 0
            r16 = 0
            r17 = 20
            r18 = 0
            java.lang.String r15 = "157"
            ht1.C8777j5.C8778a.m8609j(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x02a8:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewExWindowCloseEvent> r0 = r8.f14553y
            r0.alive()
            int r0 = r8.f14551w
            if (r0 != r5) goto L_0x02b8
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r22.mo3029R7()
            r0.setTextGravity(r4)
        L_0x02b8:
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            o31.b r1 = o31.C11345b.FinderLivePostSecurityUI
            l31.e r0 = r0.mo86178qr(r8, r1)
            o31.a r1 = o31.C76986a.Finder
            r0.mo86179qs(r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePostSecurityUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        Class cls = C54116w.class;
        int i = this.f14551w;
        if (i == 2) {
            ((C54116w) C86312j.m106911c(cls)).Ey0("157", mo3027O7(Boolean.TRUE, Long.valueOf(C31543z5.m39453c() - this.f14552x)));
        } else if (i == 3) {
            ((C54116w) C86312j.m106911c(cls)).Ey0("158", mo3027O7(Boolean.TRUE, Long.valueOf(C31543z5.m39453c() - this.f14552x)));
        } else if (i == 4) {
            ((C54116w) C86312j.m106911c(cls)).Ey0("160", mo3027O7(Boolean.TRUE, Long.valueOf(C31543z5.m39453c() - this.f14552x)));
        }
        this.f14553y.dead();
        super.onDestroy();
    }
}
