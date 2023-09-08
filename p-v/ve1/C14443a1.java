package ve1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0731g;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: ve1.a1 */
public final class C14443a1 extends C60896i<C0731g> {

    /* renamed from: e */
    public final C32224a<C13598b0> f40057e;

    /* renamed from: f */
    public final C32224a<C13598b0> f40058f;

    /* renamed from: g */
    public final boolean f40059g;

    /* renamed from: ve1.a1$a */
    public static final class C14444a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40060d;

        /* renamed from: e */
        public final /* synthetic */ C14443a1 f40061e;

        public C14444a(C60905o oVar, C14443a1 a1Var) {
            this.f40060d = oVar;
            this.f40061e = a1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60905o oVar = this.f40060d;
            C0731g gVar = (C0731g) oVar.f173503E;
            if (gVar != null && gVar.f1745e == -1) {
                View D = oVar.mo85812D(C0966R.C0970id.knd);
                if (D != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = D;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$onCreateViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$onCreateViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View D2 = this.f40060d.mo85812D(C0966R.C0970id.i7r);
                if (D2 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view3 = D2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$onCreateViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$onCreateViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C32224a<C13598b0> aVar3 = this.f40061e.f40057e;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14443a1(C32224a aVar, C32224a aVar2, boolean z, int i, C8480h hVar) {
        this(aVar, (i & 2) != 0 ? null : aVar2, (i & 4) != 0 ? false : z);
    }

    /* renamed from: c */
    public int mo43c() {
        return this.f40059g ? C0966R.C0971layout.aqg : C0966R.C0971layout.aqf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b4  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r40, jq3.C9493c r41, int r42, int r43, boolean r44, java.util.List r45) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            r2 = r41
            cm1.g r2 = (cm1.C0731g) r2
            java.lang.Class<ht1.v4> r3 = ht1.C8808v4.class
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r2, r4)
            android.view.View r4 = r1.f44854d
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r13.mo10233c(r15)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r8 = "onBindViewHolder"
            java.lang.String r9 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r4
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r13.mo10231a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r7 = "onBindViewHolder"
            java.lang.String r8 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r4
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r1.f173503E
            cm1.g r4 = (cm1.C0731g) r4
            int r5 = r2.f1746f
            r6 = 2
            r7 = 4
            r9 = 1
            r10 = 3
            r11 = 2131312452(0x7f093f44, float:1.8243273E38)
            if (r5 == r10) goto L_0x006b
            if (r5 == r9) goto L_0x006b
            if (r5 != r7) goto L_0x00d9
        L_0x006b:
            android.view.View r5 = r1.f44854d
            android.content.Context r12 = r1.f173499A
            android.content.res.Resources r12 = r12.getResources()
            int r13 = r2.f1746f
            if (r13 != r10) goto L_0x00a2
            up1.f r13 = up1.C37521f.f99374d
            r13.getClass()
            pe1.c<java.lang.Integer> r13 = up1.C37521f.f99315W0
            java.lang.Object r16 = r13.mo60266n()
            java.lang.Number r16 = (java.lang.Number) r16
            int r8 = r16.intValue()
            if (r8 == r9) goto L_0x0096
            java.lang.Object r8 = r13.mo60266n()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r6) goto L_0x00a2
        L_0x0096:
            boolean r8 = r0.f40059g
            if (r8 == 0) goto L_0x009e
            r8 = 2131099792(0x7f060090, float:1.7811947E38)
            goto L_0x00a5
        L_0x009e:
            r8 = 2131100919(0x7f0604f7, float:1.7814233E38)
            goto L_0x00a5
        L_0x00a2:
            r8 = 2131100803(0x7f060483, float:1.7813998E38)
        L_0x00a5:
            int r8 = r12.getColor(r8)
            r5.setBackgroundColor(r8)
            android.view.View r5 = r1.mo85812D(r11)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00d9
            boolean r8 = r0.f40059g
            if (r8 == 0) goto L_0x00c9
            android.content.Context r8 = r1.f173499A
            android.content.res.Resources r8 = r8.getResources()
            r12 = 2131100930(0x7f060502, float:1.7814255E38)
            int r8 = r8.getColor(r12)
            r5.setTextColor(r8)
            goto L_0x00d9
        L_0x00c9:
            android.content.Context r8 = r1.f173499A
            android.content.res.Resources r8 = r8.getResources()
            r12 = 2131100937(0x7f060509, float:1.781427E38)
            int r8 = r8.getColor(r12)
            r5.setTextColor(r8)
        L_0x00d9:
            if (r4 == 0) goto L_0x00e2
            int r5 = r4.f1745e
            r8 = -2
            if (r5 != r8) goto L_0x00e2
            r5 = 1
            goto L_0x00e3
        L_0x00e2:
            r5 = 0
        L_0x00e3:
            r8 = 2131301616(0x7f0914f0, float:1.8221295E38)
            r12 = 1005(0x3ed, float:1.408E-42)
            r13 = 1001(0x3e9, float:1.403E-42)
            r7 = 2131307205(0x7f092ac5, float:1.823263E38)
            r16 = 8
            r17 = 2131099688(0x7f060028, float:1.7811736E38)
            r6 = 2131312632(0x7f093ff8, float:1.8243638E38)
            if (r5 == 0) goto L_0x01c3
            int r2 = r2.f1746f
            if (r2 == r13) goto L_0x0102
            r3 = 1002(0x3ea, float:1.404E-42)
            if (r2 == r3) goto L_0x0102
            if (r2 == r12) goto L_0x0102
            goto L_0x011a
        L_0x0102:
            android.view.View r2 = r1.mo85812D(r6)
            android.content.Context r3 = r1.f173499A
            boolean r4 = r0.f40059g
            if (r4 == 0) goto L_0x0110
            r4 = 2131099792(0x7f060090, float:1.7811947E38)
            goto L_0x0113
        L_0x0110:
            r4 = 2131099688(0x7f060028, float:1.7811736E38)
        L_0x0113:
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
            r2.setBackground(r3)
        L_0x011a:
            android.view.View r2 = r1.mo85812D(r7)
            if (r2 != 0) goto L_0x0121
            goto L_0x015c
        L_0x0121:
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r15)
            java.lang.Object[] r18 = r3.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r3 = r3.mo10231a(r14)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r19 = "onBindViewHolder"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x015c:
            android.view.View r2 = r1.mo85812D(r8)
            if (r2 != 0) goto L_0x0163
            goto L_0x01a2
        L_0x0163:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r3.mo10233c(r4)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r2
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r3 = r3.mo10231a(r14)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r26 = "onBindViewHolder"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x01a2:
            r2 = 2131307206(0x7f092ac6, float:1.8232633E38)
            android.view.View r3 = r1.mo85812D(r2)
            ve1.w0 r4 = new ve1.w0
            r4.<init>(r0)
            r3.setOnClickListener(r4)
            android.view.View r1 = r1.mo85812D(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.text.TextPaint r1 = r1.getPaint()
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r1, r2)
            goto L_0x096b
        L_0x01c3:
            android.view.View r5 = r1.mo85812D(r7)
            if (r5 != 0) goto L_0x01ca
            goto L_0x0209
        L_0x01ca:
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)
            r7.mo10233c(r6)
            java.lang.Object[] r19 = r7.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r5
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r6 = r7.mo10231a(r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x0209:
            android.view.View r5 = r1.mo85812D(r8)
            if (r5 != 0) goto L_0x0210
            goto L_0x024b
        L_0x0210:
            k20.a r6 = new k20.a
            r6.<init>()
            r6.mo10233c(r15)
            java.lang.Object[] r26 = r6.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r5
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r6 = r6.mo10231a(r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x024b:
            r5 = 2131315332(0x7f094a84, float:1.8249114E38)
            android.view.View r5 = r1.mo85812D(r5)
            if (r5 != 0) goto L_0x0255
            goto L_0x0290
        L_0x0255:
            k20.a r6 = new k20.a
            r6.<init>()
            r6.mo10233c(r15)
            java.lang.Object[] r19 = r6.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r5
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r6 = r6.mo10231a(r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x0290:
            java.lang.CharSequence r5 = r2.f1744d
            if (r5 == 0) goto L_0x029d
            int r5 = r5.length()
            if (r5 != 0) goto L_0x029b
            goto L_0x029d
        L_0x029b:
            r5 = 0
            goto L_0x029e
        L_0x029d:
            r5 = 1
        L_0x029e:
            r6 = 2131311504(0x7f093b90, float:1.824135E38)
            r7 = 2131312448(0x7f093f40, float:1.8243265E38)
            r8 = 2131305699(0x7f0924e3, float:1.8229576E38)
            if (r5 == 0) goto L_0x03c0
            android.view.View r2 = r1.mo85812D(r6)
            if (r2 != 0) goto L_0x02b0
            goto L_0x02eb
        L_0x02b0:
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r15)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r3 = r3.mo10231a(r14)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x02eb:
            android.view.View r2 = r1.mo85812D(r11)
            if (r2 != 0) goto L_0x02f2
            goto L_0x0331
        L_0x02f2:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r3.mo10233c(r4)
            java.lang.Object[] r26 = r3.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r3 = r3.mo10231a(r14)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x0331:
            android.view.View r2 = r1.mo85812D(r7)
            if (r2 != 0) goto L_0x0338
            goto L_0x0377
        L_0x0338:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r3.mo10233c(r4)
            java.lang.Object[] r18 = r3.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r3 = r3.mo10231a(r14)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r19 = "onBindViewHolder"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x0377:
            android.view.View r1 = r1.mo85812D(r8)
            if (r1 != 0) goto L_0x037f
            goto L_0x096b
        L_0x037f:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r2.mo10233c(r3)
            java.lang.Object[] r25 = r2.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r26 = "onBindViewHolder"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            goto L_0x096b
        L_0x03c0:
            android.view.View r5 = r1.mo85812D(r6)
            if (r5 != 0) goto L_0x03c7
            goto L_0x0408
        L_0x03c7:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r16)
            r6.mo10233c(r12)
            java.lang.Object[] r32 = r6.mo10232b()
            java.lang.String r33 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r34 = "onBindViewHolder"
            java.lang.String r35 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            r31 = r5
            j20.C117292a.m165358d(r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.Object r6 = r6.mo10231a(r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r18 = r5
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x0408:
            android.view.View r5 = r1.mo85812D(r11)
            if (r5 != 0) goto L_0x040f
            goto L_0x044a
        L_0x040f:
            k20.a r6 = new k20.a
            r6.<init>()
            r6.mo10233c(r15)
            java.lang.Object[] r26 = r6.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r5
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r6 = r6.mo10231a(r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x044a:
            if (r4 == 0) goto L_0x0453
            int r4 = r4.f1745e
            r5 = -1
            if (r4 != r5) goto L_0x0453
            r4 = 1
            goto L_0x0454
        L_0x0453:
            r4 = 0
        L_0x0454:
            if (r4 == 0) goto L_0x04f0
            android.view.View r2 = r1.mo85812D(r7)
            if (r2 != 0) goto L_0x045d
            goto L_0x0498
        L_0x045d:
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r15)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r3 = r3.mo10231a(r14)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x0498:
            android.view.View r2 = r1.mo85812D(r8)
            if (r2 != 0) goto L_0x049f
            goto L_0x04de
        L_0x049f:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r3.mo10233c(r4)
            java.lang.Object[] r26 = r3.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r3 = r3.mo10231a(r14)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x04de:
            android.content.Context r2 = r1.f173499A
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131830044(0x7f11251c, float:1.9293074E38)
            java.lang.String r2 = r2.getString(r3)
            r1.mo85815G(r11, r2)
            goto L_0x096b
        L_0x04f0:
            android.view.View r4 = r1.mo85812D(r7)
            if (r4 != 0) goto L_0x04f7
            goto L_0x0536
        L_0x04f7:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)
            r5.mo10233c(r6)
            java.lang.Object[] r19 = r5.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r4
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r5 = r5.mo10231a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x0536:
            java.lang.CharSequence r4 = r2.f1744d
            r1.mo85815G(r11, r4)
            int r4 = r2.f1746f
            r5 = 17170445(0x106000d, float:2.461195E-38)
            r6 = 33
            java.lang.String r7 = "holder.getView<TextView>(R.id.retry_tip)"
            r12 = 2131829304(0x7f112238, float:1.9291573E38)
            if (r4 == r9) goto L_0x079d
            if (r4 == r10) goto L_0x079d
            if (r4 == r13) goto L_0x0596
            r10 = 1005(0x3ed, float:1.408E-42)
            if (r4 == r10) goto L_0x0596
            android.view.View r1 = r1.mo85812D(r8)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r2.mo10233c(r3)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x096b
        L_0x0596:
            r4 = 2131312632(0x7f093ff8, float:1.8243638E38)
            android.view.View r4 = r1.mo85812D(r4)
            android.content.Context r10 = r1.f173499A
            boolean r13 = r0.f40059g
            if (r13 == 0) goto L_0x05a7
            r13 = 2131099792(0x7f060090, float:1.7811947E38)
            goto L_0x05aa
        L_0x05a7:
            r13 = 2131099688(0x7f060028, float:1.7811736E38)
        L_0x05aa:
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r13)
            r4.setBackground(r10)
            int r4 = r2.f1747g
            r10 = 1000(0x3e8, float:1.401E-42)
            if (r4 == r10) goto L_0x074d
            r10 = 2000(0x7d0, float:2.803E-42)
            if (r4 == r10) goto L_0x06b0
            di3.d r2 = di3.C86312j.m106911c(r3)
            ht1.v4 r2 = (ht1.C8808v4) r2
            boolean r2 = r2.mo9635e()
            if (r2 == 0) goto L_0x061f
            android.view.View r2 = r1.mo85812D(r11)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r3 = r1.f173499A
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getString(r12)
            r2.setText(r3)
            android.view.View r1 = r1.mo85812D(r8)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r2.mo10233c(r3)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r19 = "onBindViewHolder"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x096b
        L_0x061f:
            er1.w3 r2 = er1.C58784w3.f168295a
            android.view.View r3 = r1.mo85812D(r11)
            gy3.C87412m.m108593f(r3, r7)
            android.widget.TextView r3 = (android.widget.TextView) r3
            ve1.z0 r4 = new ve1.z0
            r4.<init>(r1)
            r2.getClass()
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131833468(0x7f11327c, float:1.9300019E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "tv.context.resources.get…rby_more_reomm_live_tips)"
            gy3.C87412m.m108593f(r1, r2)
            android.content.Context r2 = r3.getContext()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r7[r14] = r1
            r8 = 2131833469(0x7f11327d, float:1.930002E38)
            java.lang.String r2 = r2.getString(r8, r7)
            java.lang.String r7 = "tv.context.resources.get…_data_tips, gotoPageTips)"
            gy3.C87412m.m108593f(r2, r7)
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r40 = r2
            r41 = r1
            r42 = r7
            r43 = r8
            r44 = r9
            r45 = r10
            int r7 = z04.C112550d0.m153769E(r40, r41, r42, r43, r44, r45)
            int r1 = r1.length()
            int r1 = r1 + r7
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r2)
            if (r7 <= 0) goto L_0x0689
            int r9 = r2.length()
            if (r1 <= r9) goto L_0x0687
            goto L_0x0689
        L_0x0687:
            r14 = r7
            goto L_0x068d
        L_0x0689:
            int r1 = r2.length()
        L_0x068d:
            er1.f4 r2 = new er1.f4
            r2.<init>(r4, r3)
            r8.setSpan(r2, r14, r1, r6)
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r5)
            r3.setHighlightColor(r1)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r3.setMovementMethod(r1)
            r3.setText(r8)
            goto L_0x096b
        L_0x06b0:
            er1.w3 r3 = er1.C58784w3.f168295a
            android.view.View r1 = r1.mo85812D(r11)
            gy3.C87412m.m108593f(r1, r7)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r4 = r2.f1744d
            java.lang.String r4 = r4.toString()
            boolean r7 = r0.f40059g
            ve1.y0 r8 = new ve1.y0
            r8.<init>(r2)
            r3.getClass()
            java.lang.String r2 = "tabName"
            gy3.C87412m.m108594g(r4, r2)
            android.content.Context r2 = r1.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131833463(0x7f113277, float:1.9300009E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "tv.context.resources.get…quare_tab_more_live_tips)"
            gy3.C87412m.m108593f(r2, r3)
            android.content.Context r3 = r1.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r14] = r4
            r10[r9] = r2
            r4 = 2131833464(0x7f113278, float:1.930001E38)
            java.lang.String r3 = r3.getString(r4, r10)
            java.lang.String r4 = "tv.context.resources.get…   gotoPageTips\n        )"
            gy3.C87412m.m108593f(r3, r4)
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            r15 = r3
            r16 = r2
            int r4 = z04.C112550d0.m153769E(r15, r16, r17, r18, r19, r20)
            int r2 = r2.length()
            int r2 = r2 + r4
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r3)
            if (r4 <= 0) goto L_0x0726
            int r10 = r3.length()
            if (r2 <= r10) goto L_0x0724
            goto L_0x0726
        L_0x0724:
            r14 = r4
            goto L_0x072a
        L_0x0726:
            int r2 = r3.length()
        L_0x072a:
            er1.g4 r3 = new er1.g4
            r3.<init>(r8, r1, r7)
            r9.setSpan(r3, r14, r2, r6)
            android.content.Context r2 = r1.getContext()
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r5)
            r1.setHighlightColor(r2)
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            r1.setText(r9)
            goto L_0x096b
        L_0x074d:
            android.view.View r3 = r1.mo85812D(r11)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.CharSequence r2 = r2.f1744d
            r3.setText(r2)
            android.view.View r1 = r1.mo85812D(r8)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r2.mo10233c(r3)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r19 = "onBindViewHolder"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x096b
        L_0x079d:
            di3.d r2 = di3.C86312j.m106911c(r3)
            ht1.v4 r2 = (ht1.C8808v4) r2
            boolean r2 = r2.mo9635e()
            if (r2 == 0) goto L_0x0801
            android.view.View r2 = r1.mo85812D(r11)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r3 = r1.f173499A
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getString(r12)
            r2.setText(r3)
            android.view.View r1 = r1.mo85812D(r8)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r2.mo10233c(r3)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r19 = "onBindViewHolder"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x096b
        L_0x0801:
            zc1.b r2 = zc1.C66785b.f191882e
            bd1.e r3 = r2.mo90673n0()
            te3.qq2 r3 = r3.mo62397b()
            te3.oi1 r3 = r3.f140461E
            if (r3 == 0) goto L_0x0815
            int r3 = r3.f139196d
            if (r3 != r9) goto L_0x0815
            r3 = 1
            goto L_0x0816
        L_0x0815:
            r3 = 0
        L_0x0816:
            if (r3 == 0) goto L_0x0860
            android.view.View r3 = r1.mo85812D(r8)
            if (r3 != 0) goto L_0x0820
            goto L_0x08a2
        L_0x0820:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            r4.mo10233c(r8)
            java.lang.Object[] r18 = r4.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r4 = r4.mo10231a(r14)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r19 = "onBindViewHolder"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x08a2
        L_0x0860:
            android.view.View r3 = r1.mo85812D(r8)
            if (r3 != 0) goto L_0x0867
            goto L_0x08a2
        L_0x0867:
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r15)
            java.lang.Object[] r25 = r4.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r3
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r4 = r4.mo10231a(r14)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert"
            java.lang.String r26 = "onBindViewHolder"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedHeaderEmptyData;IIZLjava/util/List;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x08a2:
            er1.w3 r3 = er1.C58784w3.f168295a
            boolean r4 = r0.f40059g
            android.view.View r8 = r1.mo85812D(r11)
            gy3.C87412m.m108593f(r8, r7)
            android.widget.TextView r8 = (android.widget.TextView) r8
            ve1.x0 r7 = new ve1.x0
            r7.<init>(r1)
            r3.getClass()
            bd1.e r1 = r2.mo90673n0()
            te3.qq2 r1 = r1.mo62397b()
            te3.oi1 r1 = r1.f140461E
            if (r1 == 0) goto L_0x08c9
            int r1 = r1.f139196d
            if (r1 != r9) goto L_0x08c9
            r1 = 1
            goto L_0x08ca
        L_0x08c9:
            r1 = 0
        L_0x08ca:
            if (r1 == 0) goto L_0x08e0
            android.content.Context r1 = r8.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131829305(0x7f112239, float:1.9291575E38)
            java.lang.String r1 = r1.getString(r2)
            r8.setText(r1)
            goto L_0x096b
        L_0x08e0:
            android.content.Context r1 = r8.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131826800(0x7f111870, float:1.9286495E38)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            up1.f r10 = up1.C37521f.f99374d
            java.lang.String r11 = ""
            r12 = 4
            java.lang.String r13 = r10.mo61159M(r12, r11)
            r3[r14] = r13
            java.lang.String r1 = r1.getString(r2, r3)
            java.lang.String r2 = "tv.context.resources.get…B_TYPE_MACHINE)\n        )"
            gy3.C87412m.m108593f(r1, r2)
            android.content.Context r3 = r8.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r12 = 2131826801(0x7f111871, float:1.9286497E38)
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r13 = 4
            java.lang.String r10 = r10.mo61159M(r13, r11)
            r9[r14] = r10
            java.lang.String r3 = r3.getString(r12, r9)
            gy3.C87412m.m108593f(r3, r2)
            r2 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r40 = r1
            r41 = r3
            r42 = r2
            r43 = r9
            r44 = r10
            r45 = r11
            int r2 = z04.C112550d0.m153769E(r40, r41, r42, r43, r44, r45)
            int r3 = r3.length()
            int r3 = r3 + r2
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r1)
            if (r2 <= 0) goto L_0x0946
            int r10 = r1.length()
            if (r3 <= r10) goto L_0x0944
            goto L_0x0946
        L_0x0944:
            r14 = r2
            goto L_0x094a
        L_0x0946:
            int r3 = r1.length()
        L_0x094a:
            er1.e4 r1 = new er1.e4
            r1.<init>(r7, r4, r8)
            r9.setSpan(r1, r14, r3, r6)
            android.content.Context r1 = r8.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r5)
            r8.setHighlightColor(r1)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r8.setMovementMethod(r1)
            r8.setText(r9)
        L_0x096b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14443a1.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        oVar.f44854d.setOnClickListener(new C14444a(oVar, this));
    }

    public C14443a1(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, boolean z) {
        this.f40057e = aVar;
        this.f40058f = aVar2;
        this.f40059g = z;
    }
}
