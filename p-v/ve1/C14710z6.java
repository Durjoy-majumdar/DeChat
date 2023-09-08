package ve1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0709a2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import dp1.C58413v0;
import eb0.C75597w2;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C60905o;
import rs1.C13442s8;
import te3.C64586nn1;
import tl3.C78039a;

/* renamed from: ve1.z6 */
public final class C14710z6 extends C60896i<C0709a2> {

    /* renamed from: ve1.z6$a */
    public static final class C14711a implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ C60905o f40666a;

        /* renamed from: b */
        public final /* synthetic */ String f40667b;

        public C14711a(C60905o oVar, String str) {
            this.f40666a = oVar;
            this.f40667b = str;
        }

        /* renamed from: a */
        public final void mo1109a(String str, boolean z) {
            Log.m105924i("Finder.PrivateMsgNotifyConvert", "[getNow] username=" + str + " succ=" + z);
            C78039a.m94190b((ImageView) this.f40666a.mo85812D(C0966R.C0970id.h19), this.f40667b);
        }
    }

    /* renamed from: ve1.z6$b */
    public static final class C14712b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C55718s0 f40668d;

        /* renamed from: e */
        public final /* synthetic */ C64586nn1 f40669e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f40670f;

        public C14712b(C55718s0 s0Var, C64586nn1 nn12, C60905o oVar) {
            this.f40668d = s0Var;
            this.f40669e = nn12;
            this.f40670f = oVar;
        }

        public final void onClick(View view) {
            C64586nn1 nn12;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderPrivateMsgNotifyConvert$onBindViewHolder$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C55718s0 s0Var = this.f40668d;
            if (!(s0Var == null || (nn12 = this.f40669e) == null)) {
                C58413v0 v0Var = C58413v0.f167346a;
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = this.f40670f.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13442s8 f = aVar.mo12873f(context);
                C58413v0.m67781i(v0Var, "7", s0Var, nn12, 2, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
            }
            C7335d c = C86312j.m106911c(C58684b.class);
            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
            Context context2 = this.f40670f.f173499A;
            C87412m.m108593f(context2, "holder.context");
            C58684b.cy0((C58684b) c, context2, (Intent) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderPrivateMsgNotifyConvert$onBindViewHolder$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6245j;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0098, code lost:
        r10 = r10.f12910c;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r9, cm1.C0709a2 r10, int r11, int r12, boolean r13, java.util.List<java.lang.Object> r14) {
        /*
            r8 = this;
            java.lang.String r11 = "holder"
            gy3.C87412m.m108594g(r9, r11)
            java.lang.String r11 = "item"
            gy3.C87412m.m108594g(r10, r11)
            com.tencent.mm.plugin.finder.extension.reddot.n0 r10 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12955a
            androidx.lifecycle.z<com.tencent.mm.plugin.finder.extension.reddot.n0$a> r10 = com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.f12975u
            java.lang.Object r11 = r10.getValue()
            com.tencent.mm.plugin.finder.extension.reddot.n0$a r11 = (com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.C2480a) r11
            r12 = 1
            r13 = 0
            if (r11 == 0) goto L_0x001d
            boolean r11 = r11.f12908a
            if (r11 != r12) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r12 = 0
        L_0x001e:
            r11 = 2131309599(0x7f09341f, float:1.8237486E38)
            if (r12 == 0) goto L_0x00df
            android.view.View r12 = r9.mo85812D(r11)
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r14.mo10233c(r0)
            java.lang.Object[] r1 = r14.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/convert/FinderPrivateMsgNotifyConvert"
            java.lang.String r3 = "onBindViewHolder"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPrivateMsgNotifyData;IIZLjava/util/List;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r12
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r13 = r14.mo10231a(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r12.setVisibility(r13)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/convert/FinderPrivateMsgNotifyConvert"
            java.lang.String r2 = "onBindViewHolder"
            java.lang.String r3 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPrivateMsgNotifyData;IIZLjava/util/List;)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r13 = 2131309192(0x7f093288, float:1.823666E38)
            android.view.View r13 = r9.mo85812D(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            android.text.TextPaint r13 = r13.getPaint()
            r14 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r13, r14)
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            er1.m3 r14 = er1.C7832m3.f26372a
            int r14 = r14.mo8946n()
            int r0 = r13.width
            if (r0 >= r14) goto L_0x008d
            r13.width = r14
            r12.setLayoutParams(r13)
        L_0x008d:
            java.lang.Object r10 = r10.getValue()
            com.tencent.mm.plugin.finder.extension.reddot.n0$a r10 = (com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.C2480a) r10
            java.lang.String r12 = "TLWxPrivateMsgBubble"
            r13 = 0
            if (r10 == 0) goto L_0x00a1
            com.tencent.mm.plugin.finder.extension.reddot.s0 r10 = r10.f12910c
            if (r10 == 0) goto L_0x00a1
            te3.nn1 r10 = r10.mo77308o2(r12)
            goto L_0x00a2
        L_0x00a1:
            r10 = r13
        L_0x00a2:
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r14 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            com.tencent.mm.plugin.FinderCommonFeatureService r14 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r14
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r14 = r14.Nt0()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r12 = r14.mo77227G5(r12)
            if (r10 == 0) goto L_0x00b7
            java.lang.String r14 = r10.f184505g
            goto L_0x00b8
        L_0x00b7:
            r14 = r13
        L_0x00b8:
            java.lang.Class<ht1.k4> r0 = ht1.C60179k4.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.k4 r0 = (ht1.C60179k4) r0
            java.lang.String r14 = r0.mo78770n(r14)
            if (r14 == 0) goto L_0x0128
            eb0.w2 r0 = eb0.C31519v2.m39436a()
            ve1.z6$a r1 = new ve1.z6$a
            r1.<init>(r9, r14)
            r0.mo55988e(r14, r13, r1)
            android.view.View r11 = r9.mo85812D(r11)
            ve1.z6$b r13 = new ve1.z6$b
            r13.<init>(r12, r10, r9)
            r11.setOnClickListener(r13)
            goto L_0x0128
        L_0x00df:
            android.view.View r9 = r9.mo85812D(r11)
            if (r9 != 0) goto L_0x00e6
            goto L_0x0128
        L_0x00e6:
            r10 = 8
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.mo10233c(r10)
            java.lang.Object[] r1 = r11.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/convert/FinderPrivateMsgNotifyConvert"
            java.lang.String r3 = "onBindViewHolder"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPrivateMsgNotifyData;IIZLjava/util/List;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r9
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r10 = r11.mo10231a(r13)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r9.setVisibility(r10)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/convert/FinderPrivateMsgNotifyConvert"
            java.lang.String r2 = "onBindViewHolder"
            java.lang.String r3 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderPrivateMsgNotifyData;IIZLjava/util/List;)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14710z6.mo44e(jq3.o, cm1.a2, int, int, boolean, java.util.List):void");
    }
}
