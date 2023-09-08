package ez2;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import az2.C39674e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import rz2.C48201c;
import su0.C13781a;
import sz2.C48518b;
import yz2.C16089v2;
import z04.C112551y;
import zb2.C103001d;

/* renamed from: ez2.q */
public final class C45733q extends C60896i<C48518b> {

    /* renamed from: e */
    public int f123577e = -1;

    /* renamed from: f */
    public final HashMap<String, MvvmList<C45723c>> f123578f = new HashMap<>();

    /* renamed from: g */
    public final HashMap<String, List<C45723c>> f123579g = new HashMap<>();

    /* renamed from: h */
    public final float f123580h = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3766df);

    /* renamed from: i */
    public final float f123581i = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3736cp);

    /* renamed from: j */
    public final float f123582j = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3723cd);

    /* renamed from: n */
    public final float f123583n = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3743cv);

    /* renamed from: o */
    public final float f123584o = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3758d_);

    /* renamed from: p */
    public final C48201c f123585p = C39674e.f106452d.mo62253n0(C13781a.m13082a());

    public C45733q(int i) {
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cmo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v30, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r10, jq3.C9493c r11, int r12, int r13, boolean r14, java.util.List r15) {
        /*
            r9 = this;
            sz2.b r11 = (sz2.C48518b) r11
            java.lang.String r12 = "holder"
            gy3.C87412m.m108594g(r10, r12)
            java.lang.String r12 = "item"
            gy3.C87412m.m108594g(r11, r12)
            r12 = 2131312696(0x7f094038, float:1.8243768E38)
            android.view.View r12 = r10.mo85812D(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            android.content.Context r13 = r10.f173499A
            java.lang.String r14 = "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity"
            gy3.C87412m.m108592e(r13, r14)
            com.tencent.mm.ui.MMFragmentActivity r13 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r13
            android.view.WindowManager r14 = r13.getWindowManager()
            android.view.Display r14 = r14.getDefaultDisplay()
            int r14 = r14.getWidth()
            android.view.WindowManager r13 = r13.getWindowManager()
            android.view.Display r13 = r13.getDefaultDisplay()
            int r13 = r13.getHeight()
            int r13 = java.lang.Math.min(r14, r13)
            b03.c r14 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r14 = r14.mo62279I()
            if (r14 == 0) goto L_0x0047
            float r14 = r9.f123581i
            goto L_0x0049
        L_0x0047:
            float r14 = r9.f123584o
        L_0x0049:
            b03.c r15 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r15 = r15.mo62279I()
            if (r15 == 0) goto L_0x0056
            float r15 = r9.f123581i
            goto L_0x0058
        L_0x0056:
            float r15 = r9.f123583n
        L_0x0058:
            float r13 = (float) r13
            float r13 = r13 - r14
            float r13 = r13 - r15
            b03.c r0 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r0 = r0.mo62279I()
            r1 = 0
            if (r0 == 0) goto L_0x0083
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            boolean r2 = r0 instanceof android.widget.LinearLayout.LayoutParams
            if (r2 == 0) goto L_0x0071
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            goto L_0x0072
        L_0x0071:
            r0 = r1
        L_0x0072:
            if (r0 != 0) goto L_0x0075
            goto L_0x0079
        L_0x0075:
            int r14 = (int) r14
            r0.setMarginStart(r14)
        L_0x0079:
            if (r0 != 0) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            int r14 = (int) r15
            r0.setMarginEnd(r14)
        L_0x0080:
            r12.setLayoutParams(r0)
        L_0x0083:
            android.content.Context r14 = r10.f173499A
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131165351(0x7f0700a7, float:1.7944917E38)
            float r14 = r14.getDimension(r15)
            float r15 = r9.f123580h
            float r14 = r14 + r15
            float r13 = r13 / r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            rz2.h$b r15 = r11.f129772d
            java.util.List<rz2.c> r15 = r15.f129193b
            ez2.h r0 = new ez2.h
            r0.<init>()
            java.util.List r15 = sx3.C110818d0.m150943o0(r15, r0)
            int r13 = (int) r13
            int r0 = r13 * 4
            r2 = 1
            int r0 = r0 - r2
            r9.f123577e = r0
            java.util.Iterator r15 = r15.iterator()
        L_0x00b1:
            boolean r0 = r15.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r15.next()
            rz2.c r0 = (rz2.C48201c) r0
            ez2.c r4 = new ez2.c
            java.lang.String r5 = r0.field_UserName
            java.lang.String r6 = "userItem.field_UserName"
            gy3.C87412m.m108593f(r5, r6)
            int r7 = r0.field_CreateTime
            r4.<init>(r11, r5, r7, r0)
            r14.add(r4)
            java.text.SimpleDateFormat r4 = qy2.C77448f0.f225876a
            bp3.p r4 = bp3.C79758p.f233760a
            bp3.f r5 = bp3.C104160f.RepairerConfig_TextStatus_NewTextStatusSquareFakeData_Int
            int r4 = r4.mo109882e(r5, r3)
            if (r4 != r2) goto L_0x00de
            r4 = 1
            goto L_0x00df
        L_0x00de:
            r4 = 0
        L_0x00df:
            if (r4 == 0) goto L_0x00b1
            r4 = 22
        L_0x00e3:
            if (r3 >= r4) goto L_0x00b1
            ez2.c r5 = new ez2.c
            java.lang.String r7 = r0.field_UserName
            gy3.C87412m.m108593f(r7, r6)
            int r8 = r0.field_CreateTime
            int r8 = r8 - r3
            int r8 = r8 - r2
            r5.<init>(r11, r7, r8, r1)
            r14.add(r5)
            int r3 = r3 + 1
            goto L_0x00e3
        L_0x00f9:
            rz2.h$b r15 = r11.f129772d
            java.lang.String r15 = r15.f129192a
            java.util.HashMap<java.lang.String, java.util.List<ez2.c>> r0 = r9.f123579g
            r0.put(r15, r14)
            bl3.r r0 = bl3.C39818r.f106831a
            android.content.Context r4 = r10.f173499A
            java.lang.String r5 = "holder.context"
            gy3.C87412m.m108593f(r4, r5)
            bl3.r$a r0 = r0.mo62443b(r4)
            java.lang.Class<yz2.v2> r4 = yz2.C16089v2.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r4)
            yz2.v2 r0 = (yz2.C16089v2) r0
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r0.f43236d
            rz2.h$b r4 = r11.f129772d
            java.lang.String r4 = r4.f129192a
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r4 = r0.containsKey(r4)
            if (r4 == 0) goto L_0x0135
            rz2.h$b r4 = r11.f129772d
            java.lang.String r4 = r4.f129192a
            java.lang.Object r4 = r0.get(r4)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 != 0) goto L_0x013f
        L_0x0135:
            rz2.h$b r4 = r11.f129772d
            java.lang.String r4 = r4.f129192a
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L_0x0141
        L_0x013f:
            r0 = 1
            goto L_0x0142
        L_0x0141:
            r0 = 0
        L_0x0142:
            int r4 = r9.f123577e
            r5 = -1
            if (r4 == r5) goto L_0x0172
            int r4 = r14.size()
            int r5 = r9.f123577e
            if (r4 <= r5) goto L_0x0172
            if (r0 == 0) goto L_0x0172
            java.util.List r0 = r14.subList(r3, r5)
            java.lang.String r3 = "dataList.subList(0, maxCount)"
            gy3.C87412m.m108593f(r0, r3)
            ez2.c r3 = new ez2.c
            int r4 = r9.f123577e
            int r4 = r4 - r2
            java.lang.Object r14 = r14.get(r4)
            ez2.c r14 = (ez2.C45723c) r14
            int r14 = r14.f123558f
            int r14 = r14 + -1000
            java.lang.String r4 = "arrow@name"
            r3.<init>(r11, r4, r14, r1)
            r0.add(r3)
            r14 = r0
        L_0x0172:
            ez2.d r0 = new ez2.d
            r0.<init>(r14)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.mvvmlist.MvvmList<ez2.c>> r3 = r9.f123578f
            java.lang.Object r3 = r3.get(r15)
            com.tencent.mm.plugin.mvvmlist.MvvmList r3 = (com.tencent.p014mm.plugin.mvvmlist.MvvmList) r3
            if (r12 == 0) goto L_0x0186
            androidx.recyclerview.widget.RecyclerView$e r4 = r12.getAdapter()
            goto L_0x0187
        L_0x0186:
            r4 = r1
        L_0x0187:
            boolean r5 = r4 instanceof zb2.C103009m
            if (r5 == 0) goto L_0x018e
            zb2.m r4 = (zb2.C103009m) r4
            goto L_0x018f
        L_0x018e:
            r4 = r1
        L_0x018f:
            if (r3 == 0) goto L_0x01a2
            if (r4 == 0) goto L_0x0196
            com.tencent.mm.plugin.mvvmlist.MvvmList<T> r4 = r4.f303959G
            goto L_0x0197
        L_0x0196:
            r4 = r1
        L_0x0197:
            boolean r4 = gy3.C87412m.m108589b(r4, r3)
            if (r4 == 0) goto L_0x01a2
            r3.mo129613q(r14)
            goto L_0x0214
        L_0x01a2:
            ez2.o r14 = new ez2.o
            r14.<init>(r0, r10)
            rx3.g r14 = rx3.C36568h.m40985a(r14)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.mvvmlist.MvvmList<ez2.c>> r0 = r9.f123578f
            r3 = r14
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r4 = r3.getValue()
            com.tencent.mm.plugin.mvvmlist.MvvmList r4 = (com.tencent.p014mm.plugin.mvvmlist.MvvmList) r4
            r0.put(r15, r4)
            ez2.l r15 = new ez2.l
            r15.<init>(r9, r10, r14)
            rx3.g r14 = rx3.C36568h.m40985a(r15)
            rx3.n r14 = (rx3.C36570n) r14
            java.lang.Object r15 = r14.getValue()
            zb2.m r15 = (zb2.C103009m) r15
            r15.setHasStableIds(r2)
            if (r12 != 0) goto L_0x01d0
            goto L_0x01d9
        L_0x01d0:
            java.lang.Object r14 = r14.getValue()
            zb2.m r14 = (zb2.C103009m) r14
            r12.setAdapter(r14)
        L_0x01d9:
            java.lang.Object r14 = r3.getValue()
            com.tencent.mm.plugin.mvvmlist.MvvmList r14 = (com.tencent.p014mm.plugin.mvvmlist.MvvmList) r14
            androidx.lifecycle.LiveData<ac2.j<T>> r14 = r14.f272358t
            android.content.Context r15 = r10.f173499A
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner"
            gy3.C87412m.m108592e(r15, r0)
            androidx.lifecycle.s r15 = (androidx.lifecycle.C0125s) r15
            ez2.i r0 = new ez2.i
            r0.<init>(r9, r10, r11)
            r14.observe(r15, r0)
            androidx.recyclerview.widget.GridLayoutManager r14 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r15 = r10.f173499A
            r14.<init>(r15, r13)
            if (r12 != 0) goto L_0x01fc
            goto L_0x01ff
        L_0x01fc:
            r12.setLayoutManager(r14)
        L_0x01ff:
            if (r12 == 0) goto L_0x0206
            androidx.recyclerview.widget.RecyclerView$j r13 = r12.getItemAnimator()
            goto L_0x0207
        L_0x0206:
            r13 = r1
        L_0x0207:
            if (r13 != 0) goto L_0x020a
            goto L_0x020e
        L_0x020a:
            r14 = 0
            r13.f44810f = r14
        L_0x020e:
            if (r12 != 0) goto L_0x0211
            goto L_0x0214
        L_0x0211:
            r12.setItemAnimator(r1)
        L_0x0214:
            ez2.p r13 = new ez2.p
            r13.<init>(r11, r10)
            android.view.View r11 = r10.f44854d
            ez2.j r14 = new ez2.j
            r14.<init>(r13)
            r11.setOnClickListener(r14)
            android.view.View r10 = r10.f44854d
            android.content.Context r10 = r10.getContext()
            ez2.n r11 = new ez2.n
            r11.<init>(r13)
            ez2.m r13 = new ez2.m
            r13.<init>(r10, r11)
            ez2.k r10 = new ez2.k
            r10.<init>(r13)
            r12.setOnTouchListener(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ez2.C45733q.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: j */
    public final void mo71230j(Context context, String str) {
        C87412m.m108594g(context, "context");
        if (!(str == null || C112551y.m153811k(str))) {
            MvvmList mvvmList = this.f123578f.get(str);
            List list = this.f123579g.get(str);
            if (list != null && this.f123577e > 0) {
                int size = list.size();
                int i = this.f123577e;
                if (size >= i + 1) {
                    if (mvvmList != null) {
                        mvvmList.mo129612p((C103001d) list.get(i));
                    }
                    List subList = list.subList(this.f123577e + 1, list.size());
                    if (mvvmList != null) {
                        mvvmList.mo129607j(subList, false);
                    }
                }
            }
            ((HashMap) ((C16089v2) C39818r.f106831a.mo62443b(context).mo75002a(C16089v2.class)).f43236d).put(str, Boolean.FALSE);
        }
    }
}
