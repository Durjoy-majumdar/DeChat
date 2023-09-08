package jz2;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import az2.C39674e;
import b03.C67131h;
import b03.C67133s;
import bj3.C67284e;
import bl3.C39818r;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.autogen.mmdata.rpt.LuckyMoneyNewYearReportStruct;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.FlowLayout;
import com.tencent.p014mm.plugin.textstatus.p112ui.LongTextView;
import com.tencent.p014mm.plugin.textstatus.p112ui.card.TextStatusCardFeedUIC;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import hz2.C60235a;
import iz2.C46390a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import lz2.C46926k;
import nz2.C47313a;
import ob0.C11385n;
import ob0.C117747y;
import p008bq.C0363p0;
import p640ox.C77049b;
import p773yy.C66710j;
import p773yy.C79168k;
import p907k3.C108879d;
import p907k3.C108880e;
import qy2.C47894a0;
import qy2.C47896n;
import qy2.C63347a;
import qy2.C77448f0;
import qy2.C77452i;
import rx3.C13598b0;
import rz2.C48201c;
import rz2.C48203e;
import su0.C13781a;
import uz2.C52678e0;
import uz2.C52713s;
import uz2.C78315f0;
import vz2.C78501d;
import yz2.C79224c;
import yz2.C79225c0;
import yz2.C79255p;
import yz2.C79258q;
import z04.C112551y;
import zp3.C23555k;

/* renamed from: jz2.e */
public class C76474e implements C76486l, C11385n {

    /* renamed from: A */
    public TextView f223849A;

    /* renamed from: B */
    public TextView f223850B;

    /* renamed from: C */
    public ImageView f223851C;

    /* renamed from: D */
    public TextView f223852D;

    /* renamed from: E */
    public TextView f223853E;

    /* renamed from: F */
    public View f223854F;

    /* renamed from: G */
    public FrameLayout f223855G;

    /* renamed from: H */
    public TextView f223856H;

    /* renamed from: I */
    public View f223857I;

    /* renamed from: J */
    public View f223858J;

    /* renamed from: K */
    public View f223859K;

    /* renamed from: L */
    public C48201c f223860L;

    /* renamed from: M */
    public EmojiStatusView f223861M;

    /* renamed from: N */
    public ViewGroup f223862N;

    /* renamed from: P */
    public FlowLayout f223863P;

    /* renamed from: Q */
    public View f223864Q;

    /* renamed from: R */
    public boolean f223865R;

    /* renamed from: S */
    public View f223866S;

    /* renamed from: T */
    public TextView f223867T;

    /* renamed from: U */
    public C77452i f223868U;

    /* renamed from: V */
    public C52678e0 f223869V;

    /* renamed from: W */
    public C32224a<C13598b0> f223870W;

    /* renamed from: X */
    public C47896n.C47897a f223871X;

    /* renamed from: Y */
    public C67131h f223872Y = new C67131h(false, (C77448f0.C77449a) null, 3, (C8480h) null);

    /* renamed from: d */
    public final C47894a0 f223873d;

    /* renamed from: e */
    public TextView f223874e;

    /* renamed from: f */
    public Context f223875f;

    /* renamed from: g */
    public LongTextView f223876g;

    /* renamed from: h */
    public String f223877h = "";

    /* renamed from: i */
    public TextView f223878i;

    /* renamed from: j */
    public ImageView f223879j;

    /* renamed from: n */
    public ImageView f223880n;

    /* renamed from: o */
    public ImageView f223881o;

    /* renamed from: p */
    public View f223882p;

    /* renamed from: q */
    public TextView f223883q;

    /* renamed from: r */
    public LinearLayout f223884r;

    /* renamed from: s */
    public LinearLayout f223885s;

    /* renamed from: t */
    public ImageView f223886t;

    /* renamed from: u */
    public TextView f223887u;

    /* renamed from: v */
    public View f223888v;

    /* renamed from: w */
    public ImageView f223889w;

    /* renamed from: x */
    public View f223890x;

    /* renamed from: y */
    public ImageView f223891y;

    /* renamed from: z */
    public TextView f223892z;

    /* renamed from: jz2.e$a */
    public static final class C76475a extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C76474e f223893a;

        /* renamed from: b */
        public final /* synthetic */ LongTextView f223894b;

        /* renamed from: jz2.e$a$a */
        public static final class C76476a implements C67133s.C67134a {

            /* renamed from: a */
            public final /* synthetic */ View f223895a;

            /* renamed from: b */
            public final /* synthetic */ C76474e f223896b;

            public C76476a(View view, C76474e eVar) {
                this.f223895a = view;
                this.f223896b = eVar;
            }

            public void onChange(int i) {
                Log.m105919d("MicroMsg.TextStatus.BaseStatusLoadLogic", "onChange: count:%s view:%s", Integer.valueOf(i), this.f223895a);
                C76474e eVar = this.f223896b;
                LongTextView longTextView = eVar.f223876g;
                if (longTextView != null) {
                    longTextView.f206733s = null;
                }
                eVar.mo106704T(i);
            }
        }

        public C76475a(C76474e eVar, LongTextView longTextView) {
            this.f223893a = eVar;
            this.f223894b = longTextView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
            r5 = r5.getTextviewSuffixWrapper();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo53b(android.view.View r3, long r4, long r6, boolean r8) {
            /*
                r2 = this;
                java.lang.String r4 = "view"
                gy3.C87412m.m108594g(r3, r4)
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
                r6 = 0
                r4[r6] = r5
                jz2.e r5 = r2.f223893a
                com.tencent.mm.plugin.textstatus.ui.LongTextView r5 = r5.f223876g
                if (r5 == 0) goto L_0x0023
                b03.s r5 = r5.getTextviewSuffixWrapper()
                if (r5 == 0) goto L_0x0023
                int r5 = r5.f192751e
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x0024
            L_0x0023:
                r5 = 0
            L_0x0024:
                r7 = 1
                r4[r7] = r5
                r5 = 2
                r4[r5] = r3
                java.lang.String r0 = "MicroMsg.TextStatus.BaseStatusLoadLogic"
                java.lang.String r1 = "onViewExposed:  isNotReport isExposed:%s , fullTextLineCount:%s view:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r4)
                if (r8 == 0) goto L_0x0064
                com.tencent.mm.plugin.textstatus.ui.LongTextView r4 = r2.f223894b
                b03.s r4 = r4.getTextviewSuffixWrapper()
                if (r4 == 0) goto L_0x0064
                jz2.e r8 = r2.f223893a
                boolean r1 = r4.f192752f
                if (r1 == 0) goto L_0x0058
                java.lang.Object[] r5 = new java.lang.Object[r5]
                int r1 = r4.f192751e
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r5[r6] = r1
                r5[r7] = r3
                java.lang.String r3 = "onViewExposed: it.isAfterMeasureFullTextLineCount:%s view:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r3, r5)
                int r3 = r4.f192751e
                r8.mo106704T(r3)
                goto L_0x0064
            L_0x0058:
                com.tencent.mm.plugin.textstatus.ui.LongTextView r4 = r8.f223876g
                if (r4 == 0) goto L_0x0064
                jz2.e$a$a r5 = new jz2.e$a$a
                r5.<init>(r3, r8)
                r4.setFullTextLineCountChangeListener(r5)
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jz2.C76474e.C76475a.mo53b(android.view.View, long, long, boolean):void");
        }
    }

    /* renamed from: jz2.e$b */
    public static final class C76477b implements C79255p {

        /* renamed from: a */
        public final /* synthetic */ C76474e f223897a;

        public C76477b(C76474e eVar) {
            this.f223897a = eVar;
        }

        /* renamed from: a */
        public void mo106681a() {
            LongTextView longTextView = this.f223897a.f223876g;
            if (longTextView != null) {
                ViewGroup.LayoutParams layoutParams = longTextView.getLayoutParams();
                layoutParams.height = -2;
                longTextView.setLayoutParams(layoutParams);
            }
            this.f223897a.mo106706W();
            this.f223897a.mo106702R();
        }
    }

    /* renamed from: jz2.e$c */
    public static final class C76478c implements C79258q {

        /* renamed from: a */
        public final /* synthetic */ C76474e f223898a;

        public C76478c(C76474e eVar) {
            this.f223898a = eVar;
        }

        /* renamed from: a */
        public void mo106680a() {
            LongTextView longTextView = this.f223898a.f223876g;
            if (longTextView != null) {
                ViewGroup.LayoutParams layoutParams = longTextView.getLayoutParams();
                layoutParams.height = 0;
                longTextView.setLayoutParams(layoutParams);
            }
            this.f223898a.mo106665M();
            this.f223898a.mo106703S();
        }
    }

    /* renamed from: jz2.e$d */
    public static final class C76479d implements C79225c0 {

        /* renamed from: a */
        public final /* synthetic */ C76474e f223899a;

        public C76479d(C76474e eVar) {
            this.f223899a = eVar;
        }

        /* renamed from: a */
        public void mo106718a() {
            this.f223899a.mo106668X();
        }
    }

    /* renamed from: jz2.e$e */
    public static final class C76480e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76474e f223900d;

        public C76480e(C76474e eVar) {
            this.f223900d = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f223900d.mo106677w();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jz2.e$f */
    public static final class C76481f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76474e f223901d;

        public C76481f(C76474e eVar) {
            this.f223901d = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76474e eVar = this.f223901d;
            eVar.getClass();
            Intent intent = new Intent();
            intent.putExtra("Contact_User", eVar.f223877h);
            int i = eVar.f223873d.f128519g;
            intent.putExtra("CONTACT_INFO_UI_SOURCE", i == 2 ? 52 : i == 8 ? 59 : 51);
            C88144b.m109795m(eVar.mo106716y(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, 213);
            C78501d.m94806h(C78501d.f229945a, eVar.mo106716y(), 22, (String) null, eVar.f223860L, 0, 0, 0, 0, (Integer) null, 500, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jz2.e$g */
    public static final class C76482g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76474e f223902d;

        public C76482g(C76474e eVar) {
            this.f223902d = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$update$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f223902d.mo106666O();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$update$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jz2.e$h */
    public static final class C76483h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76474e f223903d;

        public C76483h(C76474e eVar) {
            this.f223903d = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$update$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f223903d.mo106667U();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$update$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jz2.e$i */
    public static final class C76484i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C76474e f223904d;

        public C76484i(C76474e eVar) {
            this.f223904d = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
            if ((r0 != null && r0.getVisibility() == 0) != false) goto L_0x002a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r12 = this;
                jz2.e r0 = r12.f223904d
                android.view.View r9 = r0.f223888v
                if (r9 != 0) goto L_0x0008
                goto L_0x0095
            L_0x0008:
                android.widget.LinearLayout r0 = r0.f223884r
                r1 = 1
                r10 = 0
                if (r0 == 0) goto L_0x0016
                int r0 = r0.getVisibility()
                if (r0 != 0) goto L_0x0016
                r0 = 1
                goto L_0x0017
            L_0x0016:
                r0 = 0
            L_0x0017:
                if (r0 != 0) goto L_0x002a
                jz2.e r0 = r12.f223904d
                android.widget.LinearLayout r0 = r0.f223885s
                if (r0 == 0) goto L_0x0027
                int r0 = r0.getVisibility()
                if (r0 != 0) goto L_0x0027
                r0 = 1
                goto L_0x0028
            L_0x0027:
                r0 = 0
            L_0x0028:
                if (r0 == 0) goto L_0x0056
            L_0x002a:
                jz2.e r0 = r12.f223904d
                android.widget.ImageView r0 = r0.f223891y
                if (r0 == 0) goto L_0x0038
                int r0 = r0.getVisibility()
                if (r0 != 0) goto L_0x0038
                r0 = 1
                goto L_0x0039
            L_0x0038:
                r0 = 0
            L_0x0039:
                if (r0 == 0) goto L_0x0056
                jz2.e r0 = r12.f223904d
                com.tencent.mm.ui.base.FlowLayout r0 = r0.f223863P
                if (r0 == 0) goto L_0x004a
                int r0 = r0.getRealLineCount()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L_0x004b
            L_0x004a:
                r0 = 0
            L_0x004b:
                gy3.C87412m.m108591d(r0)
                int r0 = r0.intValue()
                if (r0 > r1) goto L_0x0056
                r0 = 0
                goto L_0x0057
            L_0x0056:
                r0 = 4
            L_0x0057:
                k20.a r11 = new k20.a
                r11.<init>()
                java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r11.mo10233c(r0)
                java.lang.Object[] r2 = r11.mo10232b()
                java.lang.String r3 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$updateBrandStatusSplitLine$1"
                java.lang.String r4 = "run"
                java.lang.String r5 = "()V"
                java.lang.String r6 = "android/view/View_EXEC_"
                java.lang.String r7 = "setVisibility"
                java.lang.String r8 = "(I)V"
                r1 = r9
                j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
                java.lang.Object r0 = r11.mo10231a(r10)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r9.setVisibility(r0)
                java.lang.String r2 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$updateBrandStatusSplitLine$1"
                java.lang.String r3 = "run"
                java.lang.String r4 = "()V"
                java.lang.String r5 = "android/view/View_EXEC_"
                java.lang.String r6 = "setVisibility"
                java.lang.String r7 = "(I)V"
                j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            L_0x0095:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jz2.C76474e.C76484i.run():void");
        }
    }

    public C76474e(C47894a0 a0Var) {
        C87412m.m108594g(a0Var, "showParam");
        this.f223873d = a0Var;
    }

    /* renamed from: A */
    public final int mo106690A() {
        return mo106696J() ? 1 : 3;
    }

    /* renamed from: B */
    public long mo106691B(int i) {
        if (i != 3) {
            return 0;
        }
        View view = this.f223864Q;
        Integer valueOf = view != null ? Integer.valueOf(view.getVisibility()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            return 1;
        }
        return (valueOf != null && valueOf.intValue() == 8) ? 2 : 0;
    }

    /* renamed from: C */
    public final TextView mo106692C() {
        TextView textView = this.f223849A;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("tvLikeNum");
        throw null;
    }

    /* renamed from: D */
    public final void mo106693D(boolean z) {
        Intent intent = new Intent();
        C48201c cVar = this.f223860L;
        intent.putExtra("Chat_User", cVar != null ? cVar.field_UserName : null);
        intent.putExtra("Chat_Mode", 1);
        intent.putExtra("finish_direct", z);
        C88144b.m109791i(mo106716y(), "luckymoney", "com.tencent.mm.ui.chatting.ChattingUI", intent, (Bundle) null);
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r3v3, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo106662E(java.lang.String r7) {
        /*
            r6 = this;
            com.tencent.mm.plugin.textstatus.ui.LongTextView r0 = r6.f223876g
            r1 = 0
            if (r0 == 0) goto L_0x0012
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r0.getRootView()
            if (r0 != 0) goto L_0x000f
            goto L_0x0012
        L_0x000f:
            r0.setVisibility(r1)
        L_0x0012:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r2 = ""
            r3 = 0
            if (r0 != 0) goto L_0x00b2
            android.content.Context r0 = r6.mo106716y()
            java.lang.CharSequence r0 = vl3.C102226d.m134696a(r0, r7)
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r0)
            java.lang.String r0 = r6.f223877h
            java.lang.String r4 = su0.C13781a.m13082a()
            gy3.C87412m.m108589b(r0, r4)
            com.tencent.mm.plugin.textstatus.ui.LongTextView r0 = r6.f223876g
            if (r0 == 0) goto L_0x006d
            if (r0 == 0) goto L_0x0044
            r0.setVisibility(r1)
            android.view.ViewGroup r4 = r0.getRootView()
            if (r4 != 0) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            r4.setVisibility(r1)
        L_0x0044:
            int r4 = r6.mo106690A()
            r0.setMaxLineCount(r4)
            com.tencent.mm.plugin.textstatus.ui.LongTextView r4 = r6.f223876g
            if (r4 == 0) goto L_0x0054
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0055
        L_0x0054:
            r4 = r3
        L_0x0055:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x005c
            r3 = r4
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x005c:
            r0.setSceneRoot(r3)
            if (r7 != 0) goto L_0x0062
            r7 = r2
        L_0x0062:
            r0.setTextContent(r7)
            jz2.e$a r7 = new jz2.e$a
            r7.<init>(r6, r0)
            zp3.C23564m.m28138h(r0, r7)
        L_0x006d:
            com.tencent.mm.plugin.textstatus.ui.LongTextView r7 = r6.f223876g
            if (r7 != 0) goto L_0x0072
            goto L_0x007a
        L_0x0072:
            jz2.e$b r0 = new jz2.e$b
            r0.<init>(r6)
            r7.setOnCollapseListener(r0)
        L_0x007a:
            com.tencent.mm.plugin.textstatus.ui.LongTextView r7 = r6.f223876g
            if (r7 != 0) goto L_0x007f
            goto L_0x0087
        L_0x007f:
            jz2.e$c r0 = new jz2.e$c
            r0.<init>(r6)
            r7.setOnExpandListener(r0)
        L_0x0087:
            com.tencent.mm.plugin.textstatus.ui.LongTextView r7 = r6.f223876g
            if (r7 != 0) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            jz2.e$d r0 = new jz2.e$d
            r0.<init>(r6)
            r7.setSuffixOnClickListener(r0)
        L_0x0094:
            com.tencent.mm.plugin.textstatus.ui.LongTextView r7 = r6.f223876g
            if (r7 == 0) goto L_0x00d1
            android.widget.TextView r7 = r7.getTvLongText()
            if (r7 == 0) goto L_0x00d1
            android.content.Context r0 = r6.mo106716y()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131167298(0x7f070842, float:1.7948866E38)
            int r0 = r0.getDimensionPixelSize(r2)
            float r0 = (float) r0
            r7.setTextSize(r1, r0)
            goto L_0x00d1
        L_0x00b2:
            com.tencent.mm.plugin.textstatus.ui.LongTextView r7 = r6.f223876g
            if (r7 == 0) goto L_0x00ba
            android.widget.TextView r3 = r7.getTvLongText()
        L_0x00ba:
            if (r3 != 0) goto L_0x00bd
            goto L_0x00c0
        L_0x00bd:
            r3.setText(r2)
        L_0x00c0:
            com.tencent.mm.plugin.textstatus.ui.LongTextView r7 = r6.f223876g
            if (r7 == 0) goto L_0x00ce
            android.widget.TextView r7 = r7.getTvLongText()
            if (r7 == 0) goto L_0x00ce
            r0 = 0
            r7.setTextSize(r1, r0)
        L_0x00ce:
            r6.mo106704T(r1)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jz2.C76474e.mo106662E(java.lang.String):void");
    }

    /* renamed from: F */
    public void mo106663F() {
        EmojiStatusView emojiStatusView = this.f223861M;
        if (emojiStatusView != null) {
            emojiStatusView.setVisibility(8);
        }
        C48201c cVar = this.f223860L;
        if (cVar != null) {
            C52713s n2 = cVar.mo72945n2();
            String str = n2.f147197d;
            if (!(str == null || C112551y.m153811k(str))) {
                IEmojiInfo r2 = ((C0363p0) C86312j.m106911c(C0363p0.class)).mo403r2(n2.f147197d);
                if (r2 == null) {
                    r2 = C46390a.m51721a(n2);
                }
                EmojiStatusView emojiStatusView2 = this.f223861M;
                if (emojiStatusView2 != null) {
                    emojiStatusView2.setEmojiInfo(r2);
                }
                EmojiStatusView emojiStatusView3 = this.f223861M;
                if (emojiStatusView3 != null) {
                    emojiStatusView3.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: G */
    public void mo106664G() {
        mo106666O();
    }

    /* renamed from: H */
    public final void mo106694H() {
        if (C87412m.m108589b(C13781a.m13082a(), this.f223877h)) {
            mo106715x().setContentDescription(mo106716y().getString(C0966R.string.me_));
            return;
        }
        mo106715x().setContentDescription(C87412m.m108589b(mo106715x().getTag(), Boolean.TRUE) ? mo106716y().getString(C0966R.string.meb) : mo106716y().getString(C0966R.string.mea));
    }

    /* renamed from: I */
    public final boolean mo106695I() {
        C77452i z = mo106711c();
        if (z != null ? z.mo87469l() : true) {
            TextView textView = this.f223867T;
            CharSequence text = textView != null ? textView.getText() : null;
            if (!(text == null || C112551y.m153811k(text))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public boolean mo106696J() {
        C48201c cVar = this.f223860L;
        if (cVar != null) {
            String str = cVar.mo72945n2().f147197d;
            if (!(str == null || C112551y.m153811k(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public final boolean mo106697K() {
        C48201c cVar = this.f223860L;
        String str = cVar != null ? cVar.field_PoiName : null;
        return !(str == null || C112551y.m153811k(str));
    }

    /* renamed from: L */
    public final void mo106698L(View view, int i) {
        C87412m.m108594g(view, "<this>");
        if (view.getVisibility() == 0) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "hide", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "hide", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: M */
    public void mo106665M() {
        mo106699N(8);
    }

    /* renamed from: N */
    public final void mo106699N(int i) {
        EmojiStatusView emojiStatusView = this.f223861M;
        if (emojiStatusView != null) {
            mo106698L(emojiStatusView, i);
        }
        TextView textView = this.f223883q;
        if (textView != null) {
            mo106698L(textView, i);
        }
        LinearLayout linearLayout = this.f223884r;
        if (linearLayout != null) {
            mo106698L(linearLayout, i);
        }
        View view = this.f223888v;
        if (view != null) {
            mo106698L(view, i);
        }
        TextView textView2 = this.f223867T;
        if (textView2 != null) {
            mo106698L(textView2, i);
        }
    }

    /* renamed from: O */
    public boolean mo106666O() {
        return false;
    }

    /* renamed from: P */
    public final boolean mo106700P(C52678e0 e0Var) {
        C87412m.m108594g(e0Var, "<this>");
        String d = C60235a.m70504d(e0Var);
        return !(d == null || C112551y.m153811k(d));
    }

    /* renamed from: Q */
    public final void mo106701Q(ImageView imageView, C48201c cVar) {
        C87412m.m108594g(imageView, "iv");
        C87412m.m108594g(cVar, "info");
        if (C79224c.m95930b(cVar, mo106711c())) {
            imageView.setVisibility(0);
            IStatusIconHelperKt.m39109a().mo62285O(imageView, cVar.field_IconID, C63347a.C47893d.FILLED, C63347a.C47891b.DEFAULT, (C48201c) null);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: R */
    public final void mo106702R() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        View view = this.f223866S;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "maskLayoutHideAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "maskLayoutHideAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f223866S;
        if (view2 != null && (animate = view2.animate()) != null && (alpha = animate.alpha(0.0f)) != null) {
            LongTextView longTextView = this.f223876g;
            ViewPropertyAnimator duration = alpha.setDuration(longTextView != null ? longTextView.getAnimationDuration() : 0);
            if (duration != null) {
                duration.start();
            }
        }
    }

    /* renamed from: S */
    public final void mo106703S() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        View view = this.f223866S;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "maskLayoutShowAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "maskLayoutShowAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f223866S;
        if (view2 != null && (animate = view2.animate()) != null && (alpha = animate.alpha(1.0f)) != null) {
            LongTextView longTextView = this.f223876g;
            ViewPropertyAnimator duration = alpha.setDuration(longTextView != null ? longTextView.getAnimationDuration() : 0);
            if (duration != null) {
                duration.start();
            }
        }
    }

    /* renamed from: T */
    public final void mo106704T(int i) {
        C78501d.m94806h(C78501d.f229945a, mo106716y(), 87, (String) null, (C48201c) null, 0, 0, 0, 0, Integer.valueOf(i > mo106690A() ? 1 : 2), 252, (Object) null);
    }

    /* renamed from: U */
    public void mo106667U() {
        if (this.f223873d.f128519g == 8) {
            mo106693D(true);
        }
        ((C79168k) C86312j.m106911c(C79168k.class)).sj0();
        Intent intent = new Intent();
        C48201c cVar = this.f223860L;
        intent.putExtra("key_username", cVar != null ? cVar.field_UserName : null);
        intent.putExtra("key_way", 8);
        intent.putExtra("pay_channel", 11);
        C88144b.m109791i(mo106716y(), "luckymoney", ".ui.LuckyMoneyNewYearSendUIV2", intent, (Bundle) null);
        C78501d.m94806h(C78501d.f229945a, mo106716y(), 45, (String) null, this.f223860L, 0, 0, 0, 0, (Integer) null, 500, (Object) null);
        LuckyMoneyNewYearReportStruct luckyMoneyNewYearReportStruct = new LuckyMoneyNewYearReportStruct();
        luckyMoneyNewYearReportStruct.f194255e = 1;
        luckyMoneyNewYearReportStruct.f194254d = 18;
        luckyMoneyNewYearReportStruct.mo86054n();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d8  */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo106705V(boolean r38, boolean r39) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            rz2.c r7 = r0.f223860L
            r14 = 0
            if (r7 != 0) goto L_0x000a
            return r14
        L_0x000a:
            java.lang.String r2 = su0.C13781a.m13082a()
            java.lang.String r3 = r0.f223877h
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x0017
            return r14
        L_0x0017:
            android.widget.ImageView r2 = r37.mo106715x()
            java.lang.Object r2 = r2.getTag()
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x0026
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            if (r2 == 0) goto L_0x002e
            boolean r2 = r2.booleanValue()
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            if (r2 != r1) goto L_0x0032
            return r14
        L_0x0032:
            java.lang.String r2 = "info.field_StatusID"
            java.lang.String r3 = "info.field_TopicId"
            r15 = 1
            if (r1 != 0) goto L_0x0076
            lz2.k r4 = new lz2.k
            java.lang.String r9 = r7.field_TopicId
            gy3.C87412m.m108593f(r9, r3)
            java.lang.String r10 = r7.field_StatusID
            gy3.C87412m.m108593f(r10, r2)
            java.lang.String r11 = r0.f223877h
            r12 = 1
            r13 = 1
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123460f(r4)
            r0.mo106710b0(r14)
            vz2.d r2 = vz2.C78501d.f229945a
            android.content.Context r3 = r37.mo106716y()
            r4 = 12
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r16 = 0
            r14 = r16
            r16 = 0
            r17 = 500(0x1f4, float:7.0E-43)
            r18 = 0
            vz2.C78501d.m94806h(r2, r3, r4, r6, r7, r8, r10, r12, r14, r16, r17, r18)
        L_0x0073:
            r20 = 1
            goto L_0x00d6
        L_0x0076:
            r6 = 1
            r0.mo106710b0(r6)
            lz2.k r4 = new lz2.k
            java.lang.String r9 = r7.field_TopicId
            gy3.C87412m.m108593f(r9, r3)
            java.lang.String r10 = r7.field_StatusID
            gy3.C87412m.m108593f(r10, r2)
            java.lang.String r11 = r0.f223877h
            r12 = 0
            r13 = 1
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r2.mo123460f(r4)
            if (r39 == 0) goto L_0x00b7
            vz2.d r20 = vz2.C78501d.f229945a
            android.content.Context r21 = r37.mo106716y()
            rz2.c r2 = r0.f223860L
            r25 = r2
            r22 = 15
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r35 = 500(0x1f4, float:7.0E-43)
            r36 = 0
            vz2.C78501d.m94806h(r20, r21, r22, r24, r25, r26, r28, r30, r32, r34, r35, r36)
            goto L_0x0073
        L_0x00b7:
            vz2.d r2 = vz2.C78501d.f229945a
            android.content.Context r3 = r37.mo106716y()
            r4 = 13
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 496(0x1f0, float:6.95E-43)
            r18 = 0
            java.lang.String r19 = "1"
            r20 = 1
            r6 = r19
            vz2.C78501d.m94806h(r2, r3, r4, r6, r7, r8, r10, r12, r14, r16, r17, r18)
        L_0x00d6:
            if (r1 == 0) goto L_0x00e1
            android.widget.ImageView r1 = r37.mo106715x()
            r2 = 3
            r3 = 0
            r1.performHapticFeedback(r3, r2)
        L_0x00e1:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: jz2.C76474e.mo106705V(boolean, boolean):boolean");
    }

    /* renamed from: W */
    public final void mo106706W() {
        TextView textView;
        LinearLayout linearLayout;
        TextView textView2;
        EmojiStatusView emojiStatusView;
        if (mo106696J() && (emojiStatusView = this.f223861M) != null) {
            emojiStatusView.setVisibility(0);
        }
        if (mo106697K() && (textView2 = this.f223883q) != null) {
            textView2.setVisibility(0);
        }
        C48201c cVar = this.f223860L;
        C52678e0 e0Var = null;
        boolean z = true;
        if (cVar != null) {
            e0Var = C66710j.C53637a.m60171a(cVar, false, 1, (Object) null);
        }
        if (e0Var == null || !mo106700P(e0Var)) {
            z = false;
        }
        if (z && (linearLayout = this.f223884r) != null) {
            linearLayout.setVisibility(0);
        }
        if (mo106695I() && (textView = this.f223867T) != null) {
            textView.setVisibility(0);
        }
        mo106707Y();
    }

    /* renamed from: X */
    public boolean mo106668X() {
        return true;
    }

    /* renamed from: Y */
    public final void mo106707Y() {
        View view = this.f223888v;
        if (view != null) {
            view.post(new C76484i(this));
        }
    }

    /* renamed from: Z */
    public final void mo106708Z(C48201c cVar, boolean z) {
        TextStatusCardFeedUIC textStatusCardFeedUIC;
        if (cVar != null && (textStatusCardFeedUIC = (TextStatusCardFeedUIC) C39818r.f106831a.mo62443b(mo106716y()).mo62449e(TextStatusCardFeedUIC.class)) != null) {
            HashMap<String, Boolean> hashMap = textStatusCardFeedUIC.f117022j;
            String str = cVar.field_StatusID;
            C87412m.m108593f(str, "info.field_StatusID");
            hashMap.put(str, Boolean.valueOf(z));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cf, code lost:
        if (com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a().mo62289a(r2.f147088e) != false) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x06b9  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x06c3  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x06cc  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x06e3  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x06e9  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x06fb  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x070f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0212  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo106661a(java.lang.String r33, rz2.C48201c r34, uz2.C52691j0 r35) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r12 = r34
            java.lang.Class<l31.e> r2 = l31.C61212e.class
            java.lang.String r3 = "username"
            gy3.C87412m.m108594g(r1, r3)
            r0.f223877h = r1
            r0.f223860L = r12
            r13 = 2
            java.lang.Object[] r3 = new java.lang.Object[r13]
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r3[r14] = r12
            java.text.SimpleDateFormat r4 = qy2.C77448f0.f225876a
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r11 = 1
            r3[r11] = r4
            java.lang.String r10 = "MicroMsg.TextStatus.BaseStatusLoadLogic"
            java.lang.String r4 = "[update status]info:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r3)
            if (r12 != 0) goto L_0x002d
            return r14
        L_0x002d:
            java.lang.String r3 = r12.field_IconID
            java.lang.String r4 = "1020"
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x0074
            di3.d r3 = di3.C86312j.m106911c(r2)
            l31.e r3 = (l31.C61212e) r3
            android.widget.LinearLayout r4 = r0.f223884r
            java.lang.String r5 = "status_live_room_card"
            r3.o30(r4, r5)
            di3.d r3 = di3.C86312j.m106911c(r2)
            l31.e r3 = (l31.C61212e) r3
            android.widget.LinearLayout r4 = r0.f223884r
            r5 = 40
            r6 = 26236(0x667c, float:3.6764E-41)
            r3.mo86175pO(r4, r5, r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r3 = t91.C64208c.f181949P
            if (r3 == 0) goto L_0x0061
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r4 = 0
            goto L_0x0062
        L_0x0061:
            r4 = 1
        L_0x0062:
            if (r4 != 0) goto L_0x0074
            java.lang.String r4 = "share_username"
            r3.put(r4, r1)
            di3.d r2 = di3.C86312j.m106911c(r2)
            l31.e r2 = (l31.C61212e) r2
            android.widget.LinearLayout r4 = r0.f223884r
            r2.mo86149PM(r4, r3)
        L_0x0074:
            java.lang.Class<ox.b> r2 = p640ox.C77049b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ox.b r2 = (p640ox.C77049b) r2
            android.content.Context r3 = r32.mo106716y()
            java.lang.Class<uz2.f0> r4 = uz2.C78315f0.class
            r5 = 9
            pe3.a r2 = r2.Wi0(r3, r5, r4)
            uz2.f0 r2 = (uz2.C78315f0) r2
            if (r2 == 0) goto L_0x0094
            qy2.a0 r3 = r0.f223873d
            r3.getClass()
            long r3 = (long) r14
            r2.f229441t = r3
        L_0x0094:
            b03.c r2 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            r9 = 0
            uz2.e0 r3 = p773yy.C66710j.C53637a.m60171a(r12, r14, r11, r9)
            java.lang.String r8 = r2.mo62301m(r3)
            java.lang.String r2 = r12.field_StatusID
            java.lang.String r3 = "info.field_StatusID"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r2 = r12.field_Description
            java.lang.String r4 = r12.field_IconID
            r0.mo106662E(r2)
            uz2.e0 r2 = p773yy.C66710j.C53637a.m60171a(r12, r14, r11, r9)
            qy2.a0 r3 = r0.f223873d
            r7 = 8
            boolean r3 = r3.mo72635a(r7)
            r6 = 1065353216(0x3f800000, float:1.0)
            r13 = 6
            if (r3 != 0) goto L_0x00d1
            java.lang.String r3 = "<this>"
            gy3.C87412m.m108594g(r2, r3)
            b03.c r3 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            java.lang.String r2 = r2.f147088e
            boolean r2 = r3.mo62289a(r2)
            if (r2 == 0) goto L_0x014e
        L_0x00d1:
            if (r4 == 0) goto L_0x014e
            android.widget.ImageView r2 = r0.f223891y
            if (r2 != 0) goto L_0x00d8
            goto L_0x00db
        L_0x00d8:
            r2.setAlpha(r6)
        L_0x00db:
            android.widget.ImageView r2 = r0.f223891y
            if (r2 != 0) goto L_0x00e0
            goto L_0x00e3
        L_0x00e0:
            r2.setAlpha(r6)
        L_0x00e3:
            android.widget.ImageView r2 = r0.f223891y
            if (r2 != 0) goto L_0x00e8
            goto L_0x00eb
        L_0x00e8:
            r2.setVisibility(r14)
        L_0x00eb:
            b03.c r2 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            android.widget.ImageView r3 = r0.f223891y
            qy2.a$d r16 = qy2.C63347a.C47893d.OUTLINED
            qy2.a$b r17 = qy2.C63347a.C47891b.WHITE
            qy2.a0 r6 = r0.f223873d
            int r6 = r6.f128519g
            if (r6 == r5) goto L_0x0101
            if (r6 != r13) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r18 = 0
            goto L_0x0103
        L_0x0101:
            r18 = 1
        L_0x0103:
            r19 = 0
            r20 = 64
            r21 = 0
            r5 = r16
            r13 = 1065353216(0x3f800000, float:1.0)
            r6 = r17
            r13 = 8
            r7 = r34
            r22 = r8
            r8 = r18
            r13 = r9
            r9 = r19
            r23 = r10
            r10 = r20
            r11 = r21
            b03.C39691c.m42340S(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            android.widget.TextView r2 = r0.f223892z
            if (r2 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r2.setVisibility(r14)
        L_0x012b:
            android.widget.TextView r2 = r0.f223892z
            if (r2 != 0) goto L_0x0131
            r9 = 1
            goto L_0x0141
        L_0x0131:
            b03.c r3 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            r9 = 1
            uz2.e0 r4 = p773yy.C66710j.C53637a.m60171a(r12, r14, r9, r13)
            java.lang.String r3 = r3.mo62301m(r4)
            r2.setText(r3)
        L_0x0141:
            android.widget.ImageView r2 = r0.f223891y
            if (r2 == 0) goto L_0x015e
            jz2.e$g r3 = new jz2.e$g
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            goto L_0x015e
        L_0x014e:
            r22 = r8
            r13 = r9
            r23 = r10
            r9 = 1
            android.widget.ImageView r2 = r0.f223891y
            if (r2 != 0) goto L_0x0159
            goto L_0x015e
        L_0x0159:
            r3 = 8
            r2.setVisibility(r3)
        L_0x015e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "update: iconId:"
            r2.append(r3)
            uz2.e0 r3 = p773yy.C66710j.C53637a.m60171a(r12, r14, r9, r13)
            java.lang.String r3 = r3.f147088e
            r2.append(r3)
            java.lang.String r3 = " username:"
            r2.append(r3)
            java.lang.String r3 = r12.field_UserName
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r10 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            java.lang.String r2 = su0.C13781a.m13082a()
            java.lang.String r3 = r12.field_UserName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01cf
            java.lang.Class<lc3.b> r2 = lc3.C10485b.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r3 = "TextStatusShowRedEnvelopeEntry"
            int r2 = r2.mo107404b(r3, r9)
            if (r2 != r9) goto L_0x01a7
            r11 = 1
            goto L_0x01a8
        L_0x01a7:
            r11 = 0
        L_0x01a8:
            if (r11 == 0) goto L_0x01cf
            uz2.e0 r2 = p773yy.C66710j.C53637a.m60171a(r12, r14, r9, r13)
            java.lang.String r2 = r2.f147088e
            b03.c r3 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r2 = r3.mo62280J(r2)
            if (r2 == 0) goto L_0x01cf
            android.view.ViewGroup r2 = r0.f223862N
            if (r2 != 0) goto L_0x01bf
            goto L_0x01c2
        L_0x01bf:
            r2.setVisibility(r14)
        L_0x01c2:
            android.view.ViewGroup r2 = r0.f223862N
            if (r2 == 0) goto L_0x01d9
            jz2.e$h r3 = new jz2.e$h
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            goto L_0x01d9
        L_0x01cf:
            android.view.ViewGroup r2 = r0.f223862N
            if (r2 != 0) goto L_0x01d4
            goto L_0x01d9
        L_0x01d4:
            r3 = 8
            r2.setVisibility(r3)
        L_0x01d9:
            android.widget.TextView r2 = r0.f223874e
            if (r2 != 0) goto L_0x01de
            goto L_0x01e3
        L_0x01de:
            r3 = r22
            r2.setText(r3)
        L_0x01e3:
            rz2.c r2 = r0.f223860L
            if (r2 != 0) goto L_0x01e8
            goto L_0x020c
        L_0x01e8:
            r32.mo106709a0()
            jz2.f r3 = new jz2.f
            r3.<init>(r1, r0, r2)
            android.widget.TextView r2 = r0.f223850B
            if (r2 == 0) goto L_0x01f7
            r2.setOnClickListener(r3)
        L_0x01f7:
            android.view.View r2 = r0.f223890x
            if (r2 == 0) goto L_0x01fe
            r2.setOnClickListener(r3)
        L_0x01fe:
            android.widget.ImageView r2 = r32.mo106715x()
            r2.setOnClickListener(r3)
            android.widget.TextView r2 = r32.mo106692C()
            r2.setOnClickListener(r3)
        L_0x020c:
            qy2.a0 r2 = r0.f223873d
            boolean r3 = r2.f128520h
            if (r3 == 0) goto L_0x02ed
            android.widget.ImageView r6 = r0.f223879j
            if (r6 == 0) goto L_0x02a4
            boolean r2 = r2.f128517e
            if (r2 == 0) goto L_0x029b
            kz2.a r2 = kz2.C76641a.f224261a
            android.content.Context r8 = r32.mo106716y()
            int r7 = r34.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r4 = 2131301188(0x7f091344, float:1.8220427E38)
            r6.setTag(r4, r3)
            java.lang.String r11 = r12.field_MediaThumbUrl
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r3 != 0) goto L_0x0297
            java.lang.Class<gt.i> r3 = p158gt.C8451i.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            gt.i r3 = (p158gt.C8451i) r3
            android.graphics.Bitmap r3 = r3.get(r11)
            if (r3 != 0) goto L_0x028a
            b03.f r3 = b03.C39696f.f106501a
            java.lang.String r4 = "imgUrl"
            gy3.C87412m.m108593f(r11, r4)
            java.lang.String r4 = su0.C13781a.m13082a()
            java.lang.String r5 = "username()"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.String r3 = r3.mo62319b(r11, r4)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r4 == 0) goto L_0x026f
            kz2.d r18 = new kz2.d
            r2 = r18
            r4 = r11
            r5 = r6
            r6 = r34
            r7 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            kz2.C76658g.m92307a(r18)
            goto L_0x02a4
        L_0x026f:
            r2.mo106918c(r6, r12)
            java.lang.Class<gt.w> r2 = p158gt.C76057w.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            r5 = r2
            gt.w r5 = (p158gt.C76057w) r5
            kz2.e r4 = new kz2.e
            r2 = r4
            r9 = r4
            r4 = r34
            r13 = r5
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r13.h60(r11, r9)
            goto L_0x02a4
        L_0x028a:
            boolean r2 = r34.mo72933B0()
            kz2.f r4 = new kz2.f
            r4.<init>(r2, r3, r6)
            r6.post(r4)
            goto L_0x02a4
        L_0x0297:
            r2.mo106918c(r6, r12)
            goto L_0x02a4
        L_0x029b:
            kz2.a r2 = kz2.C76641a.f224261a
            android.content.Context r3 = r32.mo106716y()
            r2.mo106919d(r3, r1, r6, r14)
        L_0x02a4:
            android.widget.ImageView r2 = r0.f223880n
            if (r2 == 0) goto L_0x02ed
            b03.c r3 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r3 = r3.mo62309u()
            if (r3 == 0) goto L_0x02ea
            boolean r3 = r32.mo106696J()
            if (r3 == 0) goto L_0x02c2
            android.widget.ImageView r2 = r0.f223880n
            if (r2 != 0) goto L_0x02bd
            goto L_0x02ed
        L_0x02bd:
            r3 = 4
            r2.setVisibility(r3)
            goto L_0x02ed
        L_0x02c2:
            r3 = 0
            r4 = 1
            uz2.e0 r5 = p773yy.C66710j.C53637a.m60171a(r12, r14, r4, r3)
            int r3 = r5.f147099s
            if (r3 != 0) goto L_0x02d3
            r3 = 1050253722(0x3e99999a, float:0.3)
            r2.setAlpha(r3)
            goto L_0x02d8
        L_0x02d3:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r3)
        L_0x02d8:
            r0.mo106701Q(r2, r12)
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x02ed
            android.widget.ImageView r2 = r0.f223881o
            if (r2 != 0) goto L_0x02e6
            goto L_0x02ed
        L_0x02e6:
            r2.setVisibility(r14)
            goto L_0x02ed
        L_0x02ea:
            r0.mo106701Q(r2, r12)
        L_0x02ed:
            java.lang.String r2 = r12.field_PoiName
            if (r2 == 0) goto L_0x02fa
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x02f8
            goto L_0x02fa
        L_0x02f8:
            r11 = 0
            goto L_0x02fb
        L_0x02fa:
            r11 = 1
        L_0x02fb:
            if (r11 == 0) goto L_0x0308
            android.widget.TextView r2 = r0.f223883q
            if (r2 != 0) goto L_0x0302
            goto L_0x031a
        L_0x0302:
            r3 = 8
            r2.setVisibility(r3)
            goto L_0x031a
        L_0x0308:
            android.widget.TextView r2 = r0.f223883q
            if (r2 != 0) goto L_0x030d
            goto L_0x0310
        L_0x030d:
            r2.setVisibility(r14)
        L_0x0310:
            android.widget.TextView r2 = r0.f223883q
            if (r2 != 0) goto L_0x0315
            goto L_0x031a
        L_0x0315:
            java.lang.String r3 = r12.field_PoiName
            r2.setText(r3)
        L_0x031a:
            qy2.a0 r2 = r0.f223873d
            r3 = 1
            boolean r2 = r2.mo72635a(r3)
            if (r2 == 0) goto L_0x0339
            android.widget.ImageView r2 = r0.f223851C
            if (r2 != 0) goto L_0x0328
            goto L_0x032b
        L_0x0328:
            r2.setVisibility(r14)
        L_0x032b:
            java.lang.Class<ln.f> r2 = p196ln.C76705f.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ln.f r2 = (p196ln.C76705f) r2
            android.widget.ImageView r3 = r0.f223851C
            r2.mo106849z(r3, r1)
            goto L_0x0343
        L_0x0339:
            android.widget.ImageView r2 = r0.f223851C
            if (r2 != 0) goto L_0x033e
            goto L_0x0343
        L_0x033e:
            r3 = 8
            r2.setVisibility(r3)
        L_0x0343:
            qy2.a0 r2 = r0.f223873d
            r3 = 2
            boolean r2 = r2.mo72635a(r3)
            if (r2 == 0) goto L_0x0369
            android.widget.TextView r2 = r0.f223852D
            if (r2 != 0) goto L_0x0351
            goto L_0x0354
        L_0x0351:
            r2.setVisibility(r14)
        L_0x0354:
            java.lang.Class<d62.i> r2 = d62.C75339i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            d62.i r2 = (d62.C75339i) r2
            java.lang.String r1 = r2.getDisplayName(r1)
            android.widget.TextView r2 = r0.f223852D
            if (r2 != 0) goto L_0x0365
            goto L_0x0373
        L_0x0365:
            r2.setText(r1)
            goto L_0x0373
        L_0x0369:
            android.widget.TextView r1 = r0.f223852D
            if (r1 != 0) goto L_0x036e
            goto L_0x0373
        L_0x036e:
            r2 = 8
            r1.setVisibility(r2)
        L_0x0373:
            qy2.a0 r1 = r0.f223873d
            r2 = 1024(0x400, float:1.435E-42)
            boolean r1 = r1.mo72635a(r2)
            if (r1 == 0) goto L_0x03d7
            android.widget.TextView r1 = r0.f223853E
            if (r1 != 0) goto L_0x0382
            goto L_0x0385
        L_0x0382:
            r1.setVisibility(r14)
        L_0x0385:
            android.widget.TextView r1 = r0.f223853E
            if (r1 != 0) goto L_0x038a
            goto L_0x03e1
        L_0x038a:
            int r2 = eb0.C31543z5.m39455e()
            int r3 = r12.field_CreateTime
            int r2 = r2 - r3
            if (r2 >= 0) goto L_0x0394
            r2 = 0
        L_0x0394:
            r3 = 60
            int r11 = r2 / 60
            r2 = 1
            if (r11 >= r2) goto L_0x039c
            r11 = 1
        L_0x039c:
            if (r11 >= r3) goto L_0x03b7
            android.content.Context r3 = r32.mo106716y()
            r4 = 2131837977(0x7f114419, float:1.9309164E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r5[r14] = r6
            java.lang.String r3 = r3.getString(r4, r5)
            java.lang.String r4 = "context.getString(R.stri…iutes, durationInMinutes)"
            gy3.C87412m.m108593f(r3, r4)
            goto L_0x03d3
        L_0x03b7:
            int r11 = r11 / r3
            if (r11 >= r2) goto L_0x03bb
            r11 = 1
        L_0x03bb:
            android.content.Context r3 = r32.mo106716y()
            r4 = 2131837976(0x7f114418, float:1.9309162E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r5[r14] = r2
            java.lang.String r3 = r3.getString(r4, r5)
            java.lang.String r2 = "context.getString(R.stri…ps_hours, durationInHour)"
            gy3.C87412m.m108593f(r3, r2)
        L_0x03d3:
            r1.setText(r3)
            goto L_0x03e1
        L_0x03d7:
            android.widget.TextView r1 = r0.f223853E
            if (r1 != 0) goto L_0x03dc
            goto L_0x03e1
        L_0x03dc:
            r2 = 8
            r1.setVisibility(r2)
        L_0x03e1:
            qy2.i r1 = r32.mo106711c()
            android.widget.TextView r2 = r0.f223867T
            if (r2 != 0) goto L_0x03ea
            goto L_0x03f5
        L_0x03ea:
            if (r1 == 0) goto L_0x03f1
            java.lang.CharSequence r9 = r1.mo84145i()
            goto L_0x03f2
        L_0x03f1:
            r9 = 0
        L_0x03f2:
            r2.setText(r9)
        L_0x03f5:
            android.widget.TextView r1 = r0.f223867T
            if (r1 != 0) goto L_0x03fc
        L_0x03f9:
            r1 = 0
            r2 = 1
            goto L_0x0416
        L_0x03fc:
            java.lang.CharSequence r2 = r1.getText()
            if (r2 == 0) goto L_0x040b
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x0409
            goto L_0x040b
        L_0x0409:
            r11 = 0
            goto L_0x040c
        L_0x040b:
            r11 = 1
        L_0x040c:
            if (r11 == 0) goto L_0x0411
            r7 = 8
            goto L_0x0412
        L_0x0411:
            r7 = 0
        L_0x0412:
            r1.setVisibility(r7)
            goto L_0x03f9
        L_0x0416:
            uz2.e0 r3 = p773yy.C66710j.C53637a.m60171a(r12, r14, r2, r1)
            boolean r1 = r0.mo106700P(r3)
            if (r1 == 0) goto L_0x04da
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[handleBrand] "
            r1.append(r2)
            java.lang.String r2 = hz2.C60235a.m70503c(r3)
            if (r2 == 0) goto L_0x0439
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x0437
            goto L_0x0439
        L_0x0437:
            r11 = 0
            goto L_0x043a
        L_0x0439:
            r11 = 1
        L_0x043a:
            r1.append(r11)
            r2 = 44
            r1.append(r2)
            java.lang.String r2 = hz2.C60235a.m70505e(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            android.widget.LinearLayout r1 = r0.f223884r
            if (r1 != 0) goto L_0x0455
            goto L_0x0458
        L_0x0455:
            r1.setVisibility(r14)
        L_0x0458:
            android.widget.TextView r1 = r0.f223887u
            if (r1 != 0) goto L_0x045d
            goto L_0x0464
        L_0x045d:
            java.lang.String r2 = hz2.C60235a.m70505e(r3)
            r1.setText(r2)
        L_0x0464:
            qy2.i r1 = r32.mo106711c()
            android.widget.FrameLayout r2 = r0.f223855G
            if (r2 == 0) goto L_0x046f
            r2.removeAllViews()
        L_0x046f:
            if (r1 == 0) goto L_0x047c
            android.widget.FrameLayout r2 = r0.f223855G
            boolean r1 = r1.mo84851p(r2)
            r2 = 1
            if (r1 != r2) goto L_0x047c
            r11 = 1
            goto L_0x047d
        L_0x047c:
            r11 = 0
        L_0x047d:
            if (r11 == 0) goto L_0x0492
            android.widget.FrameLayout r1 = r0.f223855G
            if (r1 != 0) goto L_0x0484
            goto L_0x0487
        L_0x0484:
            r1.setVisibility(r14)
        L_0x0487:
            android.widget.ImageView r1 = r0.f223886t
            if (r1 != 0) goto L_0x048c
            goto L_0x04e4
        L_0x048c:
            r2 = 8
            r1.setVisibility(r2)
            goto L_0x04e4
        L_0x0492:
            r2 = 8
            android.widget.FrameLayout r1 = r0.f223855G
            if (r1 != 0) goto L_0x0499
            goto L_0x049c
        L_0x0499:
            r1.setVisibility(r2)
        L_0x049c:
            java.lang.String r1 = hz2.C60235a.m70503c(r3)
            if (r1 == 0) goto L_0x04ab
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x04a9
            goto L_0x04ab
        L_0x04a9:
            r11 = 0
            goto L_0x04ac
        L_0x04ab:
            r11 = 1
        L_0x04ac:
            if (r11 != 0) goto L_0x04cf
            android.widget.ImageView r1 = r0.f223886t
            if (r1 == 0) goto L_0x04e4
            r1.setVisibility(r14)
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r3 = hz2.C60235a.m70503c(r3)
            r2.mo32518g(r3, r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            b03.d0 r3 = new b03.d0
            r3.<init>(r2)
            r1.setOutlineProvider(r3)
            r2 = 1
            r1.setClipToOutline(r2)
            goto L_0x04e4
        L_0x04cf:
            android.widget.ImageView r1 = r0.f223886t
            if (r1 != 0) goto L_0x04d4
            goto L_0x04e4
        L_0x04d4:
            r2 = 8
            r1.setVisibility(r2)
            goto L_0x04e4
        L_0x04da:
            r2 = 8
            android.widget.LinearLayout r1 = r0.f223884r
            if (r1 != 0) goto L_0x04e1
            goto L_0x04e4
        L_0x04e1:
            r1.setVisibility(r2)
        L_0x04e4:
            android.widget.LinearLayout r1 = r0.f223884r
            if (r1 == 0) goto L_0x04f0
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x04f0
            r11 = 1
            goto L_0x04f1
        L_0x04f0:
            r11 = 0
        L_0x04f1:
            if (r11 == 0) goto L_0x04fa
            android.widget.TextView r1 = r0.f223883q
            if (r1 == 0) goto L_0x04fa
            r1.getVisibility()
        L_0x04fa:
            android.widget.LinearLayout r1 = r0.f223884r
            if (r1 == 0) goto L_0x0506
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0506
            r11 = 1
            goto L_0x0507
        L_0x0506:
            r11 = 0
        L_0x0507:
            if (r11 != 0) goto L_0x0510
            android.widget.TextView r1 = r0.f223883q
            if (r1 == 0) goto L_0x0510
            r1.getVisibility()
        L_0x0510:
            rz2.c r1 = r0.f223860L
            if (r1 != 0) goto L_0x0516
            goto L_0x06b4
        L_0x0516:
            int r1 = r1.field_state
            r2 = 5
            if (r1 == r2) goto L_0x0608
            r2 = 6
            if (r1 == r2) goto L_0x0566
            android.view.View r1 = r0.f223857I
            if (r1 != 0) goto L_0x0524
            goto L_0x06b4
        L_0x0524:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r4 = r2.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic"
            java.lang.String r6 = "handleSecurity"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic"
            java.lang.String r5 = "handleSecurity"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x06b4
        L_0x0566:
            android.view.View r1 = r0.f223857I
            if (r1 != 0) goto L_0x056b
            goto L_0x05a6
        L_0x056b:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r15)
            java.lang.Object[] r25 = r2.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic"
            java.lang.String r27 = "handleSecurity"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r25 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic"
            java.lang.String r26 = "handleSecurity"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x05a6:
            android.view.View r1 = r0.f223858J
            if (r1 != 0) goto L_0x05ab
            goto L_0x05e6
        L_0x05ab:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r10.mo10233c(r15)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic"
            java.lang.String r5 = "handleSecurity"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r1
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic"
            java.lang.String r4 = "handleSecurity"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r1
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x05e6:
            tz2.g r1 = tz2.C78120g.f228929a
            uz2.u1 r1 = r1.mo108101a()
            if (r1 == 0) goto L_0x05f1
            java.lang.String r9 = r1.f229457p
            goto L_0x05f2
        L_0x05f1:
            r9 = 0
        L_0x05f2:
            android.widget.TextView r1 = r0.f223856H
            if (r1 != 0) goto L_0x05f7
            goto L_0x05fa
        L_0x05f7:
            r1.setText(r9)
        L_0x05fa:
            android.view.View r1 = r0.f223857I
            if (r1 == 0) goto L_0x06b4
            jz2.i r2 = new jz2.i
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            goto L_0x06b4
        L_0x0608:
            android.view.View r1 = r0.f223857I
            if (r1 != 0) goto L_0x060d
            goto L_0x0647
        L_0x060d:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r15)
            java.lang.Object[] r4 = r2.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic"
            java.lang.String r6 = "handleSecurity"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic"
            java.lang.String r5 = "handleSecurity"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x0647:
            android.content.Context r1 = r32.mo106716y()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131837980(0x7f11441c, float:1.930917E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "context.resources.getStr….text_status_tips_resend)"
            gy3.C87412m.m108593f(r1, r2)
            android.widget.TextView r2 = r0.f223856H
            if (r2 != 0) goto L_0x0660
            goto L_0x0663
        L_0x0660:
            r2.setText(r1)
        L_0x0663:
            android.view.View r1 = r0.f223858J
            if (r1 != 0) goto L_0x0668
            goto L_0x06a8
        L_0x0668:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r4 = r2.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic"
            java.lang.String r6 = "handleSecurity"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic"
            java.lang.String r5 = "handleSecurity"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x06a8:
            android.view.View r1 = r0.f223857I
            if (r1 == 0) goto L_0x06b4
            jz2.h r2 = new jz2.h
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x06b4:
            android.widget.TextView r1 = r0.f223878i
            if (r1 != 0) goto L_0x06b9
            goto L_0x06be
        L_0x06b9:
            java.lang.String r2 = ""
            r1.setText(r2)
        L_0x06be:
            android.widget.TextView r1 = r0.f223878i
            if (r1 != 0) goto L_0x06c3
            goto L_0x06c8
        L_0x06c3:
            r2 = 8
            r1.setVisibility(r2)
        L_0x06c8:
            android.widget.TextView r1 = r0.f223878i
            if (r1 == 0) goto L_0x06d4
            jz2.g r2 = new jz2.g
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x06d4:
            r32.mo106663F()
            r32.mo106707Y()
            b03.c r1 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            rz2.c r2 = r0.f223860L
            r3 = 0
            if (r2 == 0) goto L_0x06e9
            r4 = 1
            uz2.e0 r9 = p773yy.C66710j.C53637a.m60171a(r2, r14, r4, r3)
            goto L_0x06ea
        L_0x06e9:
            r9 = r3
        L_0x06ea:
            java.lang.String r1 = r1.mo62301m(r9)
            if (r1 == 0) goto L_0x070f
            boolean r2 = z04.C112551y.m153811k(r1)
            if (r2 != 0) goto L_0x070f
            android.widget.ImageView r2 = r0.f223891y
            if (r2 != 0) goto L_0x06fb
            goto L_0x070f
        L_0x06fb:
            android.content.Context r3 = r32.mo106716y()
            r4 = 2131837921(0x7f1143e1, float:1.930905E38)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r14] = r1
            java.lang.String r1 = r3.getString(r4, r6)
            r2.setContentDescription(r1)
            goto L_0x0710
        L_0x070f:
            r5 = 1
        L_0x0710:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jz2.C76474e.mo106661a(java.lang.String, rz2.c, uz2.j0):boolean");
    }

    /* renamed from: a0 */
    public void mo106709a0() {
        String str;
        C48201c cVar = this.f223860L;
        if (cVar != null) {
            CharSequence charSequence = null;
            boolean z = true;
            boolean z2 = false;
            if (C87412m.m108589b(this.f223877h, C13781a.m13082a())) {
                View view = this.f223890x;
                if (view != null) {
                    view.setBackground((Drawable) null);
                }
                C47313a f0 = this.f223873d.f128521i ? C39674e.f106452d.mo62248f0() : null;
                if (f0 == null || f0.mo72361a() != 1) {
                    z = false;
                }
                if (z) {
                    int i = f0.f126986b;
                    mo106692C().setVisibility(8);
                    TextView textView = this.f223850B;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    TextView textView2 = this.f223850B;
                    if (textView2 != null) {
                        if (i > 99) {
                            str = mo106716y().getString(C0966R.string.k1b);
                            C87412m.m108593f(str, "{\n            context.ge…oo_many_simple)\n        }");
                        } else {
                            str = String.valueOf(i);
                        }
                        textView2.setText(str);
                    }
                    View view2 = this.f223890x;
                    if (view2 != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "updateLikeNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "updateLikeNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    mo106715x().setVisibility(0);
                } else {
                    TextView textView3 = this.f223850B;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    int i2 = cVar.field_LikeCount + cVar.field_referenceCount;
                    if (i2 > 0) {
                        mo106692C().setText(String.valueOf(i2));
                        mo106692C().setVisibility(0);
                        mo106715x().setVisibility(0);
                        View view4 = this.f223890x;
                        if (view4 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view5 = view4;
                            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "updateLikeNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view5, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "updateLikeNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        View view6 = this.f223890x;
                        if (view6 != null) {
                            view6.setBackground(mo106716y().getResources().getDrawable(C0966R.C0969drawable.axe));
                        }
                        View view7 = this.f223890x;
                        if (view7 != null) {
                            view7.setBackground((Drawable) null);
                        }
                    } else {
                        mo106692C().setVisibility(8);
                        mo106715x().setVisibility(8);
                        View view8 = this.f223890x;
                        if (view8 != null) {
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                            aVar3.mo10233c(8);
                            View view9 = view8;
                            C117292a.m165358d(view9, aVar3.mo10232b(), "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "updateLikeNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view8.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view9, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "updateLikeNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                ImageView x = mo106715x();
                Drawable drawable = mo106716y().getResources().getDrawable(C0966R.raw.finder_filled_like_private_status);
                C74933u4.m89769f(drawable, mo106716y().getResources().getColor(C0966R.color.f2975b6));
                x.setImageDrawable(drawable);
            } else {
                View view10 = this.f223890x;
                if (view10 != null) {
                    view10.setBackground(mo106716y().getResources().getDrawable(C0966R.C0969drawable.b6c));
                }
                TextStatusCardFeedUIC textStatusCardFeedUIC = (TextStatusCardFeedUIC) C39818r.f106831a.mo62443b(mo106716y()).mo62449e(TextStatusCardFeedUIC.class);
                if (textStatusCardFeedUIC == null || !textStatusCardFeedUIC.f117022j.containsKey(cVar.field_StatusID)) {
                    C48203e S = C39674e.f106452d.mo62246S();
                    String str2 = cVar.field_StatusID;
                    S.getClass();
                    if (!(str2 == null || C112551y.m153811k(str2))) {
                        Cursor rawQuery = S.f129184d.rawQuery("select count(rowid) from TextStatusLike where TextStatusId = ? and HashUserName = ?", new String[]{str2, C13781a.m13082a()});
                        C87412m.m108593f(rawQuery, "db.rawQuery(sql, arrayOf…sId, Account.username()))");
                        int i3 = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
                        rawQuery.close();
                        Log.m105925i("MicroMsg.TextStatus.TextStatusLikeStorage", "[getIsLikeOther]statusId:%s result:%s", str2, Integer.valueOf(i3));
                        if (i3 <= 0) {
                            z = false;
                        }
                        z2 = z;
                    }
                } else {
                    Boolean bool = textStatusCardFeedUIC.f117022j.get(cVar.field_StatusID);
                    if (bool == null) {
                        bool = Boolean.FALSE;
                    }
                    z2 = bool.booleanValue();
                }
                mo106692C().setText(mo106716y().getString(C0966R.string.k0r));
                mo106692C().setVisibility(8);
                StringBuilder sb = new StringBuilder();
                sb.append("update like num : tag=");
                sb.append(mo106715x().getTag());
                sb.append(" isLike=");
                sb.append(z2);
                sb.append(" tvnick=");
                TextView textView4 = this.f223852D;
                if (textView4 != null) {
                    charSequence = textView4.getText();
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                sb.append(charSequence);
                Log.m105924i("MicroMsg.TextStatus.BaseStatusLoadLogic", sb.toString());
                mo106715x().setTag(Boolean.valueOf(z2));
                mo106708Z(cVar, z2);
                if (z2) {
                    ImageView x2 = mo106715x();
                    Drawable drawable2 = mo106716y().getResources().getDrawable(C0966R.raw.icon_filled_awesome_status);
                    C74933u4.m89769f(drawable2, mo106716y().getResources().getColor(C0966R.color.Red_100));
                    x2.setImageDrawable(drawable2);
                } else {
                    ImageView x3 = mo106715x();
                    Drawable drawable3 = mo106716y().getResources().getDrawable(C0966R.raw.icon_filled_awesome_status);
                    C74933u4.m89769f(drawable3, mo106716y().getResources().getColor(C0966R.color.f2975b6));
                    x3.setImageDrawable(drawable3);
                }
            }
            C78315f0 f0Var = (C78315f0) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(mo106716y(), 9, C78315f0.class);
            if (f0Var != null) {
                f0Var.f229431g = mo106715x().getVisibility() == 0 ? "1" : "0";
            }
            mo106694H();
        }
    }

    /* renamed from: b0 */
    public final void mo106710b0(boolean z) {
        mo106715x().setTag(Boolean.valueOf(z));
        mo106708Z(this.f223860L, z);
        View view = this.f223890x;
        if (view != null) {
            view.setBackground(mo106716y().getResources().getDrawable(C0966R.C0969drawable.b6c));
        }
        if (z) {
            ImageView x = mo106715x();
            Drawable drawable = mo106716y().getResources().getDrawable(C0966R.raw.icon_filled_awesome_status);
            C74933u4.m89769f(drawable, mo106716y().getResources().getColor(C0966R.color.Red_100));
            x.setImageDrawable(drawable);
            ImageView x2 = mo106715x();
            C67284e eVar = C67284e.f193117a;
            C87412m.m108594g(eVar, "property");
            C108880e eVar2 = new C108880e(1.0f);
            eVar2.mo159992a(0.5f);
            eVar2.mo159993b(200.0f);
            int a = C74942w4.m89784a(x2.getContext(), (int) 2.0f);
            C108879d dVar = new C108879d(x2, eVar.mo91412a());
            float b = eVar.mo91413b();
            if (b > 0.0f) {
                dVar.f326022i = b;
                dVar.f326027s = eVar2;
                dVar.f326014a = (float) a;
                dVar.mo159991e();
                return;
            }
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        ImageView x3 = mo106715x();
        Drawable drawable2 = mo106716y().getResources().getDrawable(C0966R.raw.icon_filled_awesome_status);
        C74933u4.m89769f(drawable2, mo106716y().getResources().getColor(C0966R.color.f2975b6));
        x3.setImageDrawable(drawable2);
    }

    /* renamed from: h */
    public void mo106674h(View view) {
        C87412m.m108594g(view, "contentView");
        Context context = view.getContext();
        C87412m.m108593f(context, "contentView.context");
        this.f223875f = context;
        this.f223874e = (TextView) view.findViewById(C0966R.C0970id.kyg);
        this.f223878i = (TextView) view.findViewById(C0966R.C0970id.kxy);
        this.f223876g = (LongTextView) view.findViewById(C0966R.C0970id.f359429kw2);
        this.f223883q = (TextView) view.findViewById(C0966R.C0970id.kxe);
        View findViewById = view.findViewById(C0966R.C0970id.alw);
        C87412m.m108593f(findViewById, "contentView.findViewById(R.id.btn_like)");
        this.f223889w = (ImageView) findViewById;
        this.f223890x = view.findViewById(C0966R.C0970id.fkr);
        this.f223891y = (ImageView) view.findViewById(C0966R.C0970id.f2o);
        this.f223892z = (TextView) view.findViewById(C0966R.C0970id.ky8);
        View findViewById2 = view.findViewById(C0966R.C0970id.f359441kx1);
        C87412m.m108593f(findViewById2, "contentView.findViewById(R.id.tv_like_num)");
        this.f223849A = (TextView) findViewById2;
        this.f223850B = (TextView) view.findViewById(C0966R.C0970id.mkb);
        this.f223879j = (ImageView) view.findViewById(C0966R.C0970id.l2t);
        this.f223880n = (ImageView) view.findViewById(C0966R.C0970id.m2c);
        this.f223881o = (ImageView) view.findViewById(C0966R.C0970id.nnu);
        this.f223867T = (TextView) view.findViewById(C0966R.C0970id.kvm);
        this.f223882p = view.findViewById(C0966R.C0970id.fkc);
        this.f223884r = (LinearLayout) view.findViewById(C0966R.C0970id.fk6);
        this.f223885s = (LinearLayout) view.findViewById(C0966R.C0970id.f358510fk0);
        this.f223886t = (ImageView) view.findViewById(C0966R.C0970id.fck);
        this.f223887u = (TextView) view.findViewById(C0966R.C0970id.kvk);
        this.f223851C = (ImageView) view.findViewById(C0966R.C0970id.fd6);
        this.f223852D = (TextView) view.findViewById(C0966R.C0970id.kx_);
        this.f223854F = view.findViewById(C0966R.C0970id.fku);
        this.f223853E = (TextView) view.findViewById(C0966R.C0970id.m8b);
        this.f223855G = (FrameLayout) view.findViewById(C0966R.C0970id.fk7);
        this.f223857I = view.findViewById(C0966R.C0970id.f358526fl1);
        this.f223858J = view.findViewById(C0966R.C0970id.fdf);
        this.f223856H = (TextView) view.findViewById(C0966R.C0970id.f359444ky0);
        this.f223859K = view.findViewById(C0966R.C0970id.m2q);
        this.f223861M = (EmojiStatusView) view.findViewById(C0966R.C0970id.cie);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C0966R.C0970id.m2r);
        this.f223888v = view.findViewById(C0966R.C0970id.l3_);
        this.f223863P = (FlowLayout) view.findViewById(C0966R.C0970id.eak);
        this.f223864Q = view.findViewById(C0966R.C0970id.mms);
        this.f223866S = view.findViewById(C0966R.C0970id.mtm);
        LinearLayout linearLayout = this.f223884r;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C76480e(this));
        }
        View view2 = this.f223854F;
        if (view2 != null) {
            view2.setOnClickListener(new C76481f(this));
        }
        this.f223862N = (ViewGroup) view.findViewById(C0966R.C0970id.m2w);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.m8a);
        C85875k4.m106191k0(textView != null ? textView.getPaint() : null);
    }

    /* renamed from: k */
    public void mo106712k(C32224a<C13598b0> aVar) {
        this.f223870W = aVar;
    }

    /* renamed from: m */
    public void mo106713m() {
        C77452i iVar = this.f223868U;
        if (iVar != null) {
            iVar.mo84148n();
        }
        this.f223868U = null;
        this.f223869V = null;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = yVar instanceof C46926k;
    }

    /* renamed from: t */
    public void mo106714t() {
    }

    /* renamed from: w */
    public void mo106677w() {
        C48201c cVar = this.f223860L;
        if (cVar != null) {
            C47896n.C47897a aVar = this.f223871X;
            if (aVar != null) {
                aVar.mo67431a(4, (Object) null);
            }
            C52678e0 a = C66710j.C53637a.m60171a(cVar, false, 1, (Object) null);
            String str = this.f223877h;
            Bundle bundle = new Bundle();
            bundle.putString("userName", str);
            Context y = mo106716y();
            C60235a.m70504d(a);
            C77452i z = mo106711c();
            if (z != null) {
                z.mo84142d(y, bundle);
            }
            C78501d.m94806h(C78501d.f229945a, mo106716y(), 23, (String) null, this.f223860L, 0, 0, 0, 0, (Integer) null, 500, (Object) null);
        }
    }

    /* renamed from: x */
    public final ImageView mo106715x() {
        ImageView imageView = this.f223889w;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("btnLike");
        throw null;
    }

    /* renamed from: y */
    public final Context mo106716y() {
        Context context = this.f223875f;
        if (context != null) {
            return context;
        }
        C87412m.m108603p("context");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if ((r4 != null && yz2.C79224c.m95929a(r4, r0)) == false) goto L_0x0011;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qy2.C77452i mo106711c() {
        /*
            r6 = this;
            rz2.c r0 = r6.f223860L
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x000c
            uz2.e0 r0 = p773yy.C66710j.C53637a.m60171a(r0, r2, r1, r3)
            goto L_0x000d
        L_0x000c:
            r0 = r3
        L_0x000d:
            qy2.i r4 = r6.f223868U
            if (r4 != 0) goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0023
        L_0x0013:
            uz2.e0 r4 = r6.f223869V
            if (r4 == 0) goto L_0x001f
            boolean r4 = yz2.C79224c.m95929a(r4, r0)
            if (r4 != r1) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            if (r4 != 0) goto L_0x0023
            goto L_0x0011
        L_0x0023:
            if (r1 != 0) goto L_0x007c
            r6.mo106713m()
            xz2.r r1 = xz2.C79019r.f232026a     // Catch:{ all -> 0x0030 }
            xz2.o r1 = new xz2.o     // Catch:{ all -> 0x0030 }
            r1.<init>()     // Catch:{ all -> 0x0030 }
            goto L_0x003b
        L_0x0030:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "MicroMsg.TextStatus.BaseStatusLoadLogic"
            java.lang.String r5 = "customps err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r5, r2)
            r1 = r3
        L_0x003b:
            r6.f223868U = r1
            if (r1 == 0) goto L_0x0058
            rz2.c r2 = r6.f223860L
            if (r2 == 0) goto L_0x0046
            java.lang.String r2 = r2.field_StatusID
            goto L_0x0047
        L_0x0046:
            r2 = r3
        L_0x0047:
            if (r0 == 0) goto L_0x004e
            java.util.LinkedList r4 = hz2.C60235a.m70502b(r0)
            goto L_0x004f
        L_0x004e:
            r4 = r3
        L_0x004f:
            if (r0 == 0) goto L_0x0054
            java.util.LinkedList<uz2.a0> r5 = r0.f147090g
            goto L_0x0055
        L_0x0054:
            r5 = r3
        L_0x0055:
            r1.mo107628t(r2, r4, r5)
        L_0x0058:
            r6.f223869V = r0
            java.lang.Class<ox.b> r0 = p640ox.C77049b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ox.b r0 = (p640ox.C77049b) r0
            android.content.Context r1 = r6.mo106716y()
            r2 = 9
            java.lang.Class<uz2.f0> r4 = uz2.C78315f0.class
            pe3.a r0 = r0.Wi0(r1, r2, r4)
            uz2.f0 r0 = (uz2.C78315f0) r0
            if (r0 == 0) goto L_0x007c
            qy2.i r1 = r6.f223868U
            if (r1 == 0) goto L_0x007a
            java.lang.String r3 = r1.mo84144h()
        L_0x007a:
            r0.f229438q = r3
        L_0x007c:
            qy2.i r0 = r6.f223868U
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jz2.C76474e.mo106711c():qy2.i");
    }
}
