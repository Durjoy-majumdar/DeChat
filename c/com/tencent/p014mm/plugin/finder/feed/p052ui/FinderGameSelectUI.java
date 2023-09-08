package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Metadata;
import nj3.C88989a;
import rx3.C13601g;
import rx3.C36568h;
import sk1.C63950d;
import te3.C48757as1;
import te3.C50169kr1;
import te3.C51006qs1;
import tf0.C13883o1;
import wc1.C15094k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameSelectUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveBaseUI;", "Landroid/view/View;", "t", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "root", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI */
public final class FinderGameSelectUI extends FinderGameLiveBaseUI {

    /* renamed from: p */
    public final String f158921p = "Finder.FinderGameSelectUI";

    /* renamed from: q */
    public final ArrayList<C63950d> f158922q = new ArrayList<>();

    /* renamed from: r */
    public C63950d f158923r;

    /* renamed from: s */
    public WxRecyclerView f158924s;

    /* renamed from: t */
    public View f158925t;

    /* renamed from: u */
    public EditText f158926u;

    /* renamed from: v */
    public RelativeLayout f158927v;

    /* renamed from: w */
    public boolean f158928w;

    /* renamed from: x */
    public final C13601g f158929x = C36568h.m40985a(new C55814a(this));

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI$a */
    public static final class C55814a extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderGameSelectUI f158930d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55814a(FinderGameSelectUI finderGameSelectUI) {
            super(0);
            this.f158930d = finderGameSelectUI;
        }

        public Object invoke() {
            return (LinearLayout) this.f158930d.findViewById(C0966R.C0970id.enj);
        }
    }

    /* renamed from: N7 */
    public static final void m63554N7(FinderGameSelectUI finderGameSelectUI, C51006qs1 qs12) {
        String str;
        String str2;
        String str3;
        String str4 = finderGameSelectUI.f158921p;
        StringBuilder sb = new StringBuilder();
        sb.append("go postui, game:");
        C50169kr1 kr12 = qs12.f140523e;
        String str5 = null;
        sb.append(kr12 != null ? kr12.f137002e : null);
        sb.append(", ");
        C50169kr1 kr13 = qs12.f140523e;
        if (kr13 != null) {
            str5 = kr13.f137001d;
        }
        sb.append(str5);
        Log.m105924i(str4, sb.toString());
        Intent intent = new Intent();
        C48757as1 as12 = qs12.f140525g;
        String str6 = "";
        if (as12 == null || (str = as12.f130749e) == null) {
            str = str6;
        }
        intent.putExtra("COVER_URL", str);
        C48757as1 as13 = qs12.f140525g;
        if (as13 == null || (str2 = as13.f130748d) == null) {
            str2 = str6;
        }
        intent.putExtra("DESC", str2);
        intent.putExtra("TICKET", str6);
        C50169kr1 kr14 = qs12.f140523e;
        if (!(kr14 == null || (str3 = kr14.f137001d) == null)) {
            str6 = str3;
        }
        intent.putExtra("APPID", str6);
        intent.putExtra("POST_FROM_SCENE", 0);
        intent.putExtra("GameUserInfo", qs12.toByteArray());
        intent.putExtra("MINI_GAME_SCENE", 1);
        AppCompatActivity context = finderGameSelectUI.getContext();
        C87412m.m108593f(context, "context");
        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13281h6(context, intent);
    }

    /* renamed from: O7 */
    public static final void m63555O7(FinderGameSelectUI finderGameSelectUI) {
        finderGameSelectUI.getClass();
        AppCompatActivity context = finderGameSelectUI.getContext();
        C87412m.m108593f(context, "context");
        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13258Ig(context, new Intent());
    }

    /* renamed from: P7 */
    public final WxRecyclerView mo77415P7() {
        WxRecyclerView wxRecyclerView = this.f158924s;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        C87412m.m108603p("rv");
        throw null;
    }

    public int getCustomBounceId() {
        return C0966R.C0970id.enc;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.acr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e4 A[LOOP:1: B:17:0x00de->B:19:0x00e4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x011f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = 1
            r11.supportRequestWindowFeature(r0)
            super.onCreate(r12)
            r12 = 8
            r11.setSelfNavigationBarVisible(r12)
            android.view.Window r1 = r11.getWindow()
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r2)
            android.view.Window r1 = r11.getWindow()
            r1.clearFlags(r2)
            android.view.Window r1 = r11.getWindow()
            android.view.View r1 = r1.getDecorView()
            r2 = 1792(0x700, float:2.511E-42)
            r1.setSystemUiVisibility(r2)
            android.view.Window r1 = r11.getWindow()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r2)
            android.view.Window r1 = r11.getWindow()
            r2 = 0
            r1.setStatusBarColor(r2)
            android.view.Window r1 = r11.getWindow()
            r1.setNavigationBarColor(r2)
            android.view.Window r1 = r11.getWindow()
            r3 = -3
            r1.setFormat(r3)
            android.view.Window r1 = r11.getWindow()
            r3 = 51
            r1.setSoftInputMode(r3)
            r1 = 2131305576(0x7f092468, float:1.8229327E38)
            android.view.View r3 = r11.findViewById(r1)
            er1.w0 r4 = er1.C58782w0.f168290a
            r4.mo83842a(r3)
            te3.m11 r3 = new te3.m11
            r3.<init>()
            android.content.Intent r4 = r11.getIntent()
            java.lang.String r5 = "APP_LIST"
            byte[] r4 = r4.getByteArrayExtra(r5)
            r5 = 0
            java.lang.String r6 = ""
            if (r4 != 0) goto L_0x0073
            goto L_0x0081
        L_0x0073:
            r3.parseFrom(r4)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0082
        L_0x0077:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r3
            java.lang.String r3 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r6, r4)
        L_0x0081:
            r3 = r5
        L_0x0082:
            if (r3 == 0) goto L_0x00ba
            java.util.ArrayList<sk1.d> r4 = r11.f158922q
            java.util.LinkedList<te3.qs1> r3 = r3.f137744d
            java.lang.String r7 = "this.game_user_info_list"
            gy3.C87412m.m108593f(r3, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = sx3.C36907w.m41090l(r3, r8)
            r7.<init>(r8)
            java.util.Iterator r3 = r3.iterator()
        L_0x009d:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00b7
            java.lang.Object r8 = r3.next()
            te3.qs1 r8 = (te3.C51006qs1) r8
            sk1.d r9 = new sk1.d
            java.lang.String r10 = "it"
            gy3.C87412m.m108593f(r8, r10)
            r9.<init>(r8)
            r7.add(r9)
            goto L_0x009d
        L_0x00b7:
            r4.addAll(r7)
        L_0x00ba:
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r4 = "SHOW_SEARCH_LAYOUT"
            boolean r3 = r3.getBooleanExtra(r4, r2)
            r11.f158928w = r3
            java.util.ArrayList<sk1.d> r3 = r11.f158922q
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00d8
            java.lang.String r3 = r11.f158921p
            java.lang.String r4 = "gameList empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r4)
            r11.finish()
        L_0x00d8:
            java.util.ArrayList<sk1.d> r3 = r11.f158922q
            java.util.Iterator r3 = r3.iterator()
        L_0x00de:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00ed
            java.lang.Object r4 = r3.next()
            sk1.d r4 = (sk1.C63950d) r4
            r4.f181277e = r2
            goto L_0x00de
        L_0x00ed:
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LIVE_GAME_SELECT_APPID_STRING_SYNC
            java.lang.String r3 = r3.mo119675I(r4, r6)
            java.util.ArrayList<sk1.d> r4 = r11.f158922q
            java.util.Iterator r4 = r4.iterator()
        L_0x0101:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x011f
            java.lang.Object r7 = r4.next()
            r8 = r7
            sk1.d r8 = (sk1.C63950d) r8
            te3.qs1 r8 = r8.f181276d
            te3.kr1 r8 = r8.f140523e
            if (r8 == 0) goto L_0x0117
            java.lang.String r8 = r8.f137001d
            goto L_0x0118
        L_0x0117:
            r8 = r5
        L_0x0118:
            boolean r8 = gy3.C87412m.m108589b(r8, r3)
            if (r8 == 0) goto L_0x0101
            goto L_0x0120
        L_0x011f:
            r7 = r5
        L_0x0120:
            sk1.d r7 = (sk1.C63950d) r7
            if (r7 == 0) goto L_0x0128
            r7.f181277e = r0
            r11.f158923r = r7
        L_0x0128:
            r0 = 2131305577(0x7f092469, float:1.8229329E38)
            android.view.View r0 = r11.findViewById(r0)
            r3 = 2131310504(0x7f0937a8, float:1.8239322E38)
            r11.findViewById(r3)
            android.view.View r1 = r11.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.game_select_root)"
            gy3.C87412m.m108593f(r1, r3)
            r11.setRoot(r1)
            r1 = 2131305569(0x7f092461, float:1.8229313E38)
            android.view.View r1 = r11.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.game_rv)"
            gy3.C87412m.m108593f(r1, r3)
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r1
            r11.f158924s = r1
            r1 = 2131303508(0x7f091c54, float:1.8225132E38)
            android.view.View r1 = r11.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.finder_live_game_search_icon)"
            gy3.C87412m.m108593f(r1, r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 2131303504(0x7f091c50, float:1.8225124E38)
            android.view.View r1 = r11.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.finder_live_game_search_edit)"
            gy3.C87412m.m108593f(r1, r3)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r11.f158926u = r1
            r1 = 2131303507(0x7f091c53, float:1.822513E38)
            android.view.View r1 = r11.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.finder…e_game_search_group_root)"
            gy3.C87412m.m108593f(r1, r3)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r11.f158927v = r1
            rx3.g r1 = r11.f158929x
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            gy3.C87412m.m108592e(r1, r3)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r3 = r1.leftMargin
            int r4 = r1.topMargin
            int r7 = r1.rightMargin
            android.view.View r8 = r11.f158925t
            java.lang.String r9 = "root"
            if (r8 == 0) goto L_0x0274
            android.content.Context r8 = r8.getContext()
            int r8 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r8)
            r1.setMargins(r3, r4, r7, r8)
            nk1.b r1 = nk1.C11193b.f33003a
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r3 = r3.mo90662O5()
            android.view.View r4 = r11.f158925t
            if (r4 == 0) goto L_0x0270
            r1.mo11281b(r3, r6, r4, r5)
            vf1.h0 r1 = new vf1.h0
            r1.<init>(r0)
            r0.post(r1)
            vf1.i0 r1 = new vf1.i0
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r11.mo77415P7()
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r11)
            r0.setLayoutManager(r1)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r11.mo77415P7()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI$initViews$3 r3 = new com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI$initViews$3
            r3.<init>(r11)
            java.util.ArrayList<sk1.d> r4 = r11.f158922q
            r1.<init>(r3, r4, r2)
            vf1.j0 r3 = new vf1.j0
            r3.<init>(r11)
            r1.f173488o = r3
            r0.setAdapter(r1)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r11.mo77415P7()
            vf1.k0 r1 = new vf1.k0
            r1.<init>()
            zp3.C23564m.m28137g(r0, r1)
            boolean r0 = r11.f158928w
            java.lang.String r1 = "searchViewContainer"
            if (r0 == 0) goto L_0x0264
            android.widget.EditText r12 = r11.f158926u
            java.lang.String r0 = "searchEdit"
            if (r12 == 0) goto L_0x0260
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            boolean r3 = r12 instanceof android.widget.RelativeLayout.LayoutParams
            if (r3 == 0) goto L_0x0213
            android.widget.RelativeLayout$LayoutParams r12 = (android.widget.RelativeLayout.LayoutParams) r12
            goto L_0x0214
        L_0x0213:
            r12 = r5
        L_0x0214:
            if (r12 == 0) goto L_0x021e
            r3 = -2
            r12.width = r3
            r3 = 13
            r12.addRule(r3)
        L_0x021e:
            android.widget.EditText r12 = r11.f158926u
            if (r12 == 0) goto L_0x025c
            vf1.l0 r3 = new vf1.l0
            r3.<init>(r11)
            r12.setOnClickListener(r3)
            android.widget.EditText r12 = r11.f158926u
            if (r12 == 0) goto L_0x0258
            r12.setInputType(r2)
            android.widget.EditText r12 = r11.f158926u
            if (r12 == 0) goto L_0x0254
            r12.setFocusable(r2)
            android.widget.EditText r12 = r11.f158926u
            if (r12 == 0) goto L_0x0250
            r12.setFocusableInTouchMode(r2)
            android.widget.RelativeLayout r12 = r11.f158927v
            if (r12 == 0) goto L_0x024c
            vf1.m0 r0 = new vf1.m0
            r0.<init>(r11)
            r12.setOnClickListener(r0)
            goto L_0x026b
        L_0x024c:
            gy3.C87412m.m108603p(r1)
            throw r5
        L_0x0250:
            gy3.C87412m.m108603p(r0)
            throw r5
        L_0x0254:
            gy3.C87412m.m108603p(r0)
            throw r5
        L_0x0258:
            gy3.C87412m.m108603p(r0)
            throw r5
        L_0x025c:
            gy3.C87412m.m108603p(r0)
            throw r5
        L_0x0260:
            gy3.C87412m.m108603p(r0)
            throw r5
        L_0x0264:
            android.widget.RelativeLayout r0 = r11.f158927v
            if (r0 == 0) goto L_0x026c
            r0.setVisibility(r12)
        L_0x026b:
            return
        L_0x026c:
            gy3.C87412m.m108603p(r1)
            throw r5
        L_0x0270:
            gy3.C87412m.m108603p(r9)
            throw r5
        L_0x0274:
            gy3.C87412m.m108603p(r9)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameSelectUI.onCreate(android.os.Bundle):void");
    }

    public final void setRoot(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f158925t = view;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C15094k.class);
    }
}
