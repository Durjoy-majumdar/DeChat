package v21;

import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.C93088r;
import com.tencent.p014mm.plugin.component.editor.EditorUI;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import k20.C60958c;
import k20.C9556a;
import p21.C100616a;
import p21.C100628m;
import p21.C100631p;
import p910lj.C76701a;
import s21.C101496a;
import s21.C101498c;
import t21.C101712a;
import u21.C101941c;
import v21.C102123a;

/* renamed from: v21.i */
public class C102132i implements C102123a.C102124a {

    /* renamed from: J */
    public static volatile C102132i f300743J;

    /* renamed from: K */
    public static boolean f300744K;

    /* renamed from: A */
    public MMHandler f300745A = null;

    /* renamed from: B */
    public TextView f300746B = null;

    /* renamed from: C */
    public TextView f300747C = null;

    /* renamed from: D */
    public TextView f300748D = null;

    /* renamed from: E */
    public TextView f300749E = null;

    /* renamed from: F */
    public TextView f300750F = null;

    /* renamed from: G */
    public TextView f300751G = null;

    /* renamed from: H */
    public TextView f300752H = null;

    /* renamed from: I */
    public TextView f300753I = null;

    /* renamed from: a */
    public boolean f300754a = true;

    /* renamed from: b */
    public int f300755b = 0;

    /* renamed from: c */
    public int f300756c = 0;

    /* renamed from: d */
    public int f300757d = 14;

    /* renamed from: e */
    public int f300758e = 0;

    /* renamed from: f */
    public int f300759f = 0;

    /* renamed from: g */
    public int f300760g = 0;

    /* renamed from: h */
    public int f300761h = 0;

    /* renamed from: i */
    public int f300762i = 0;

    /* renamed from: j */
    public int f300763j = 0;

    /* renamed from: k */
    public int f300764k = 0;

    /* renamed from: l */
    public int f300765l = 0;

    /* renamed from: m */
    public int f300766m = 0;

    /* renamed from: n */
    public int[] f300767n = null;

    /* renamed from: o */
    public int[] f300768o = null;

    /* renamed from: p */
    public int[] f300769p = null;

    /* renamed from: q */
    public int[] f300770q = null;

    /* renamed from: r */
    public PopupWindow f300771r = null;

    /* renamed from: s */
    public PopupWindow f300772s = null;

    /* renamed from: t */
    public PopupWindow f300773t = null;

    /* renamed from: u */
    public PopupWindow f300774u = null;

    /* renamed from: v */
    public C101712a f300775v = null;

    /* renamed from: w */
    public C102127d f300776w = null;

    /* renamed from: x */
    public C102125b f300777x = null;

    /* renamed from: y */
    public MTimerHandler f300778y = null;

    /* renamed from: z */
    public MTimerHandler f300779z = null;

    /* renamed from: v21.i$a */
    public class C102133a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f300780d;

        public C102133a(boolean z) {
            this.f300780d = z;
        }

        public void run() {
            RecyclerView i = C102132i.this.mo141660i();
            if (i != null) {
                for (int i2 = 0; i2 < i.getChildCount(); i2++) {
                    View childAt = i.getChildAt(i2);
                    C102126c a = C102142r.m134570a(childAt);
                    if (a != null) {
                        WXRTEditText wXRTEditText = a.f300732a;
                        if (wXRTEditText != null) {
                            if (this.f300780d) {
                                wXRTEditText.postInvalidate();
                            }
                        } else if (!(a.f300733b == null || a.f300734c == null)) {
                            C102132i.this.mo141650D((LinearLayout) childAt.findViewById(C0966R.C0970id.hpr), (LinearLayout) childAt.findViewById(C0966R.C0970id.hpv), (LinearLayout) childAt.findViewById(C0966R.C0970id.hpt), a.f300733b.getPosInDataList());
                        }
                    }
                }
            }
        }
    }

    public C102132i() {
        f300744K = false;
    }

    /* renamed from: a */
    public static boolean m134537a(C102132i iVar) {
        if (iVar.mo141664m() != 3) {
            return false;
        }
        for (int i = iVar.f300776w.f300735a; i <= iVar.f300776w.f300737c; i++) {
            C100616a l = C101941c.m134173q().mo141456l(i);
            if (l != null && l.mo140076b() == 4 && ((C100631p) l).f294830w.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static C102132i m134538h() {
        if (f300743J == null) {
            synchronized (C101941c.class) {
                if (f300743J == null) {
                    f300743J = new C102132i();
                }
            }
        }
        return f300743J;
    }

    /* renamed from: A */
    public void mo141647A(boolean z, boolean z2, long j) {
        if (f300744K) {
            mo141665n();
            mo141667p();
            mo141651E(true, 50);
            mo141675x(z);
            this.f300745A.postDelayed(new C102134j(this, z2), j);
        }
    }

    /* renamed from: B */
    public final boolean mo141648B(int i, RecyclerView recyclerView, PopupWindow popupWindow, int i2, int i3) {
        int i4;
        if (f300744K && recyclerView != null && popupWindow != null && i3 >= mo141662k(recyclerView)) {
            int i5 = this.f300763j;
            C101712a aVar = this.f300775v;
            if (aVar != null) {
                EditorUI editorUI = (EditorUI) aVar;
                i4 = (editorUI.f268054s ? KeyBoardUtil.getKeyBordHeightPx(editorUI) : 0) + ((EditorUI) this.f300775v).mo127483R7();
            } else {
                i4 = 0;
            }
            if (i3 <= i5 - i4) {
                if (popupWindow.isShowing()) {
                    popupWindow.update(i2, i3, -1, -1, false);
                    mo141672u(i, i2, i3);
                } else {
                    popupWindow.showAtLocation(recyclerView, 0, i2, i3);
                    mo141672u(i, i2, i3);
                }
                if (i != 2) {
                    return true;
                }
                MTimerHandler mTimerHandler = this.f300779z;
                if (mTimerHandler == null) {
                    this.f300779z = new MTimerHandler(new C102135k(this), false);
                } else {
                    mTimerHandler.stopTimer();
                }
                this.f300779z.startTimer(3000, 0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public final boolean mo141649C(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (f300744K && recyclerView != null && this.f300774u != null && i2 >= mo141662k(recyclerView)) {
            int i4 = this.f300763j;
            C101712a aVar = this.f300775v;
            if (aVar != null) {
                EditorUI editorUI = (EditorUI) aVar;
                i3 = (editorUI.f268054s ? KeyBoardUtil.getKeyBordHeightPx(editorUI) : 0) + ((EditorUI) this.f300775v).mo127483R7();
            } else {
                i3 = 0;
            }
            if (i2 <= i4 - i3) {
                if (this.f300774u.isShowing()) {
                    this.f300774u.update(i, i2, -1, -1, false);
                    return true;
                }
                this.f300774u.showAtLocation(recyclerView, 0, i, i2);
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public void mo141650D(View view, View view2, View view3, int i) {
        if (f300744K && view != null && view2 != null && view3 != null && this.f300776w != null) {
            int g = mo141659g(i);
            if (g == 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view4 = view;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(4);
                View view5 = view2;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(4);
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (g == 1) {
                C102127d dVar = this.f300776w;
                if (dVar.f300736b == dVar.f300738d) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view6 = view;
                    C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    View view7 = view;
                    C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(4);
                View view8 = view2;
                C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(4);
                C117292a.m165358d(view3, aVar7.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (g == 2) {
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar8.mo10233c(0);
                View view9 = view;
                C117292a.m165358d(view9, aVar8.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(0);
                View view10 = view2;
                C117292a.m165358d(view10, aVar9.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar10 = new C9556a();
                aVar10.mo10233c(0);
                C117292a.m165358d(view3, aVar10.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (g != 3) {
                if (g != 4) {
                    C9556a aVar11 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar11.mo10233c(8);
                    View view11 = view;
                    C117292a.m165358d(view11, aVar11.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                    C117292a.m165359e(view11, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar12 = new C9556a();
                    aVar12.mo10233c(4);
                    View view12 = view2;
                    C117292a.m165358d(view12, aVar12.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                    C117292a.m165359e(view12, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar13 = new C9556a();
                    aVar13.mo10233c(4);
                    C117292a.m165358d(view3, aVar13.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (this.f300776w.f300736b == 0) {
                    C9556a aVar14 = new C9556a();
                    ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                    aVar14.mo10233c(0);
                    View view13 = view;
                    C117292a.m165358d(view13, aVar14.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
                    C117292a.m165359e(view13, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar15 = new C9556a();
                    aVar15.mo10233c(4);
                    View view14 = view2;
                    C117292a.m165358d(view14, aVar15.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
                    C117292a.m165359e(view14, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar16 = new C9556a();
                    aVar16.mo10233c(0);
                    C117292a.m165358d(view3, aVar16.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar16.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    C9556a aVar17 = new C9556a();
                    ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                    aVar17.mo10233c(8);
                    View view15 = view;
                    C117292a.m165358d(view15, aVar17.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
                    C117292a.m165359e(view15, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar18 = new C9556a();
                    aVar18.mo10233c(4);
                    View view16 = view2;
                    C117292a.m165358d(view16, aVar18.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar18.mo10231a(0)).intValue());
                    C117292a.m165359e(view16, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar19 = new C9556a();
                    aVar19.mo10233c(4);
                    C117292a.m165358d(view3, aVar19.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar19.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (this.f300776w.f300738d == 0) {
                C9556a aVar20 = new C9556a();
                ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                aVar20.mo10233c(8);
                View view17 = view;
                C117292a.m165358d(view17, aVar20.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar20.mo10231a(0)).intValue());
                C117292a.m165359e(view17, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar21 = new C9556a();
                aVar21.mo10233c(4);
                View view18 = view2;
                C117292a.m165358d(view18, aVar21.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar21.mo10231a(0)).intValue());
                C117292a.m165359e(view18, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar22 = new C9556a();
                aVar22.mo10233c(4);
                C117292a.m165358d(view3, aVar22.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar22.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar23 = new C9556a();
                ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
                aVar23.mo10233c(0);
                View view19 = view;
                C117292a.m165358d(view19, aVar23.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar23.mo10231a(0)).intValue());
                C117292a.m165359e(view19, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar24 = new C9556a();
                aVar24.mo10233c(0);
                View view20 = view2;
                C117292a.m165358d(view20, aVar24.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar24.mo10231a(0)).intValue());
                C117292a.m165359e(view20, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar25 = new C9556a();
                aVar25.mo10233c(4);
                C117292a.m165358d(view3, aVar25.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar25.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "updateCoverViewInOtherItem", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: E */
    public void mo141651E(boolean z, long j) {
        MMHandler mMHandler;
        if (f300744K && (mMHandler = this.f300745A) != null) {
            mMHandler.postDelayed(new C102133a(z), j);
        }
    }

    /* renamed from: F */
    public final int mo141652F(int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        if (!f300744K) {
            return 0;
        }
        if (i == 2) {
            z = mo141673v(i2, i3, i2, i3);
        } else if (i == 3) {
            C102127d dVar = this.f300776w;
            if (dVar == null || i2 > (i4 = dVar.f300737c) || (i2 == i4 && i3 >= dVar.f300738d)) {
                return 1;
            }
            z = mo141673v(i2, i3, i4, dVar.f300738d);
        } else if (i != 4) {
            return 0;
        } else {
            C102127d dVar2 = this.f300776w;
            if (dVar2 == null || i2 < (i5 = dVar2.f300735a) || (i2 == i5 && i3 <= dVar2.f300736b)) {
                return 1;
            }
            z = mo141673v(i5, dVar2.f300736b, i2, i3);
        }
        return z ? 3 : 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0158  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141653G(boolean r19) {
        /*
            r18 = this;
            r6 = r18
            boolean r0 = f300744K
            if (r0 == 0) goto L_0x025f
            android.widget.PopupWindow r0 = r6.f300771r
            if (r0 == 0) goto L_0x025f
            android.widget.PopupWindow r0 = r6.f300772s
            if (r0 == 0) goto L_0x025f
            android.widget.PopupWindow r0 = r6.f300773t
            if (r0 == 0) goto L_0x025f
            v21.d r0 = r6.f300776w
            if (r0 != 0) goto L_0x0018
            goto L_0x025f
        L_0x0018:
            androidx.recyclerview.widget.RecyclerView r7 = r18.mo141660i()
            if (r7 != 0) goto L_0x001f
            return
        L_0x001f:
            v21.b r0 = r6.f300777x
            if (r0 == 0) goto L_0x025f
            int r0 = r0.mo141641a()
            r8 = 1
            if (r0 == r8) goto L_0x002c
            goto L_0x025f
        L_0x002c:
            v21.b r0 = r6.f300777x
            int r9 = r0.f300721a
            r10 = 4
            r11 = 3
            r12 = 2
            if (r9 == r12) goto L_0x003a
            if (r9 == r11) goto L_0x003a
            if (r9 == r10) goto L_0x003a
            return
        L_0x003a:
            float r1 = r0.f300722b
            float r2 = r0.f300724d
            float r1 = r1 - r2
            float r2 = r0.f300723c
            float r0 = r0.f300725e
            float r2 = r2 - r0
            int r0 = r6.f300755b
            int r0 = r0 / r12
            float r0 = (float) r0
            float r2 = r2 + r0
            if (r9 != r12) goto L_0x0053
            android.widget.PopupWindow r0 = r6.f300771r
            int r0 = r0.getWidth()
            int r0 = r0 / r12
            goto L_0x005b
        L_0x0053:
            if (r9 != r11) goto L_0x005d
            android.widget.PopupWindow r0 = r6.f300772s
            int r0 = r0.getWidth()
        L_0x005b:
            float r0 = (float) r0
            float r1 = r1 + r0
        L_0x005d:
            int[] r0 = r6.f300767n
            r7.getLocationOnScreen(r0)
            int[] r0 = r6.f300767n
            r13 = 0
            r3 = r0[r13]
            float r3 = (float) r3
            float r3 = r1 - r3
            r0 = r0[r8]
            float r0 = (float) r0
            float r0 = r2 - r0
            android.view.View r14 = r7.mo17019D0(r3, r0)
            v21.c r0 = v21.C102142r.m134570a(r14)
            r3 = 0
            if (r0 != 0) goto L_0x007d
            r0 = 2
            goto L_0x0156
        L_0x007d:
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r4 = r0.f300732a
            if (r4 == 0) goto L_0x009d
            int[] r0 = new int[r12]
            r4.getLocationOnScreen(r0)
            r3 = r0[r13]
            float r3 = (float) r3
            float r1 = r1 - r3
            r0 = r0[r8]
            float r0 = (float) r0
            float r2 = r2 - r0
            int r0 = r4.getOffsetForPosition(r1, r2)
            int r1 = r4.getPosInDataList()
            int r0 = r6.mo141652F(r9, r1, r0)
            r3 = r4
            goto L_0x0156
        L_0x009d:
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r15 = r0.f300733b
            if (r15 == 0) goto L_0x0155
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r5 = r0.f300734c
            if (r5 == 0) goto L_0x0155
            if (r9 != r11) goto L_0x00d9
            int r0 = r15.getPosInDataList()
            int r5 = r6.mo141652F(r9, r0, r13)
            if (r5 == r12) goto L_0x00b7
            if (r5 != r11) goto L_0x00b4
            goto L_0x00b7
        L_0x00b4:
            r17 = r5
            goto L_0x00d4
        L_0x00b7:
            android.widget.PopupWindow r3 = r6.f300772s
            v21.b r0 = r6.f300777x
            float r1 = r0.f300722b
            float r2 = r0.f300724d
            float r1 = r1 - r2
            int r4 = (int) r1
            float r1 = r0.f300723c
            float r0 = r0.f300725e
            float r1 = r1 - r0
            int r2 = (int) r1
            r0 = r18
            r1 = r9
            r16 = r2
            r2 = r7
            r17 = r5
            r5 = r16
            r0.mo141648B(r1, r2, r3, r4, r5)
        L_0x00d4:
            r3 = r15
            r0 = r17
            goto L_0x0156
        L_0x00d9:
            if (r9 != r10) goto L_0x010c
            int r0 = r5.getPosInDataList()
            int r15 = r6.mo141652F(r9, r0, r8)
            if (r15 == r12) goto L_0x00eb
            if (r15 != r11) goto L_0x00e8
            goto L_0x00eb
        L_0x00e8:
            r17 = r5
            goto L_0x0108
        L_0x00eb:
            android.widget.PopupWindow r3 = r6.f300773t
            v21.b r0 = r6.f300777x
            float r1 = r0.f300722b
            float r2 = r0.f300724d
            float r1 = r1 - r2
            int r4 = (int) r1
            float r1 = r0.f300723c
            float r0 = r0.f300725e
            float r1 = r1 - r0
            int r2 = (int) r1
            r0 = r18
            r1 = r9
            r16 = r2
            r2 = r7
            r17 = r5
            r5 = r16
            r0.mo141648B(r1, r2, r3, r4, r5)
        L_0x0108:
            r0 = r15
            r3 = r17
            goto L_0x0156
        L_0x010c:
            int[] r2 = new int[r12]
            r14.getLocationOnScreen(r2)
            r2 = r2[r13]
            int r3 = r14.getWidth()
            int r3 = r3 / r12
            int r2 = r2 + r3
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0129
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r0 = r0.f300733b
            int r1 = r0.getPosInDataList()
            int r1 = r6.mo141652F(r9, r1, r13)
            goto L_0x0133
        L_0x0129:
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r0 = r0.f300734c
            int r1 = r0.getPosInDataList()
            int r1 = r6.mo141652F(r9, r1, r8)
        L_0x0133:
            r16 = r0
            r15 = r1
            if (r15 == r12) goto L_0x013a
            if (r15 != r11) goto L_0x0151
        L_0x013a:
            android.widget.PopupWindow r3 = r6.f300771r
            v21.b r0 = r6.f300777x
            float r1 = r0.f300722b
            float r2 = r0.f300724d
            float r1 = r1 - r2
            int r4 = (int) r1
            float r1 = r0.f300723c
            float r0 = r0.f300725e
            float r1 = r1 - r0
            int r5 = (int) r1
            r0 = r18
            r1 = r9
            r2 = r7
            r0.mo141648B(r1, r2, r3, r4, r5)
        L_0x0151:
            r0 = r15
            r3 = r16
            goto L_0x0156
        L_0x0155:
            r0 = 0
        L_0x0156:
            if (r0 == r8) goto L_0x0207
            if (r0 == r12) goto L_0x0206
            if (r0 == r11) goto L_0x015d
            return
        L_0x015d:
            android.text.Editable r0 = r3.getText()
            int r1 = r18.mo141664m()
            boolean r2 = r6.f300754a
            if (r2 == 0) goto L_0x01a5
            if (r0 == 0) goto L_0x01a5
            if (r1 != r8) goto L_0x01a5
            boolean r2 = r3.hasFocus()
            if (r2 != 0) goto L_0x0176
            r3.requestFocus()
        L_0x0176:
            int r2 = r3.getEditTextType()
            if (r2 == r8) goto L_0x019b
            int r2 = r3.getEditTextType()
            if (r2 != r12) goto L_0x0183
            goto L_0x019b
        L_0x0183:
            v21.d r2 = r6.f300776w
            int r2 = r2.f300736b
            int r0 = r0.length()
            if (r2 > r0) goto L_0x01eb
            r3.setIgnoreSelectChangeByMultiSelect(r8)
            v21.d r0 = r6.f300776w
            int r0 = r0.f300736b
            r3.setSelection(r0)
            r3.setIgnoreSelectChangeByMultiSelect(r13)
            goto L_0x01eb
        L_0x019b:
            r3.setIgnoreSelectChangeByMultiSelect(r8)
            r3.setSelection(r13)
            r3.setIgnoreSelectChangeByMultiSelect(r13)
            goto L_0x01eb
        L_0x01a5:
            if (r2 == 0) goto L_0x01eb
            if (r0 == 0) goto L_0x01eb
            if (r1 != r12) goto L_0x01eb
            boolean r2 = r3.hasFocus()
            if (r2 == 0) goto L_0x01eb
            int r2 = r3.getEditTextType()
            if (r2 == r8) goto L_0x01e2
            int r2 = r3.getEditTextType()
            if (r2 != r12) goto L_0x01be
            goto L_0x01e2
        L_0x01be:
            v21.d r2 = r6.f300776w
            int r2 = r2.f300736b
            int r4 = r0.length()
            if (r2 > r4) goto L_0x01eb
            v21.d r2 = r6.f300776w
            int r2 = r2.f300738d
            int r0 = r0.length()
            if (r2 > r0) goto L_0x01eb
            r3.setIgnoreSelectChangeByMultiSelect(r8)
            v21.d r0 = r6.f300776w
            int r2 = r0.f300736b
            int r0 = r0.f300738d
            r3.setSelection(r2, r0)
            r3.setIgnoreSelectChangeByMultiSelect(r13)
            goto L_0x01eb
        L_0x01e2:
            r3.setIgnoreSelectChangeByMultiSelect(r8)
            r3.setSelection(r13)
            r3.setIgnoreSelectChangeByMultiSelect(r13)
        L_0x01eb:
            if (r1 == r11) goto L_0x01ef
            if (r1 != 0) goto L_0x01f2
        L_0x01ef:
            r18.mo141654b()
        L_0x01f2:
            r18.mo141667p()
            r0 = 0
            r6.mo141651E(r8, r0)
            v21.d r0 = r6.f300776w
            if (r9 != r10) goto L_0x0201
            int r0 = r0.f300738d
            goto L_0x0203
        L_0x0201:
            int r0 = r0.f300736b
        L_0x0203:
            r6.mo141676y(r9, r7, r14, r0)
        L_0x0206:
            r13 = 1
        L_0x0207:
            if (r13 == 0) goto L_0x024b
            if (r19 == 0) goto L_0x025f
            v21.b r0 = r6.f300777x
            float r0 = r0.f300723c
            int r1 = r6.mo141662k(r7)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0225
            v21.b r0 = r6.f300777x
            float r0 = r0.f300723c
            int r1 = r18.mo141661j()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x025f
        L_0x0225:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r6.f300778y
            if (r0 == 0) goto L_0x022f
            boolean r0 = r0.stopped()
            if (r0 == 0) goto L_0x025f
        L_0x022f:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r6.f300778y
            if (r0 != 0) goto L_0x0240
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            v21.m r1 = new v21.m
            r1.<init>(r6)
            r0.<init>(r1, r8)
            r6.f300778y = r0
            goto L_0x0243
        L_0x0240:
            r0.stopTimer()
        L_0x0243:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r6.f300778y
            r1 = 100
            r0.startTimer(r1)
            goto L_0x025f
        L_0x024b:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r6.f300778y
            if (r0 != 0) goto L_0x025c
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            v21.m r1 = new v21.m
            r1.<init>(r6)
            r0.<init>(r1, r8)
            r6.f300778y = r0
            goto L_0x025f
        L_0x025c:
            r0.stopTimer()
        L_0x025f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v21.C102132i.mo141653G(boolean):void");
    }

    /* renamed from: b */
    public final void mo141654b() {
        C101712a aVar = this.f300775v;
        if (aVar != null) {
            ((EditorUI) aVar).mo127481O7();
        }
    }

    /* renamed from: c */
    public void mo141655c() {
        if (f300744K) {
            mo141673v(-1, -1, -1, -1);
            mo141651E(true, 0);
            mo141665n();
            mo141667p();
        }
    }

    /* renamed from: d */
    public void mo141656d() {
        Log.m105924i("MicroMsg.Editor.EditorSelectManager", "deleteSelectedData");
        if (!f300744K) {
            Log.m105920e("MicroMsg.Editor.EditorSelectManager", "deleteSelectedData: not init");
            return;
        }
        mo141667p();
        int m = mo141664m();
        if (m == 2) {
            mo141658f(true, (ArrayList<C100616a>) null, "");
        } else if (m == 3) {
            mo141657e(true, (ArrayList<C100616a>) null, "");
        } else {
            Log.m105920e("MicroMsg.Editor.EditorSelectManager", "deleteSelectedData: not in select");
            mo141669r();
        }
    }

    /* renamed from: e */
    public final ArrayList<C100616a> mo141657e(boolean z, ArrayList<C100616a> arrayList, String str) {
        int i;
        boolean z2;
        int i2;
        int i3;
        C101712a aVar;
        ArrayList<C100616a> arrayList2 = arrayList;
        C102127d l = mo141663l();
        mo141655c();
        ArrayList<C100616a> arrayList3 = new ArrayList<>();
        if (l.mo141642a() != 3) {
            Log.m105920e("MicroMsg.Editor.EditorSelectManager", "getAndProcessSelectedDataInMultiSelect: incorrect select");
            return null;
        }
        int i4 = l.f300735a;
        int i5 = l.f300737c;
        while (true) {
            i = 0;
            if (i5 < l.f300735a) {
                break;
            }
            C100616a l2 = C101941c.m134173q().mo141456l(i5);
            if (l2 != null) {
                if (i5 == l.f300737c && l2.mo140076b() == 1) {
                    C100628m mVar = (C100628m) l2;
                    C100628m mVar2 = mVar;
                    SpannableStringBuilder s = mo141670s(mVar, 0, l.f300738d, false, z, "", false);
                    if (!Util.isNullOrNil((CharSequence) s)) {
                        C100628m mVar3 = new C100628m();
                        mVar3.f294819s = C101498c.m133261a(s);
                        mVar3.f294797c = -1;
                        mVar3.f294796b = false;
                        arrayList3.add(mVar3);
                    }
                    if (z && Util.isNullOrNil(mVar2.f294819s)) {
                        C101941c.m134173q().mo141466w(i5, true);
                    }
                } else if (i5 == l.f300735a && l2.mo140076b() == 1) {
                    C100628m mVar4 = (C100628m) l2;
                    SpannableStringBuilder s2 = mo141670s(mVar4, l.f300736b, 0, true, z, "", false);
                    if (!Util.isNullOrNil((CharSequence) s2)) {
                        C100628m mVar5 = new C100628m();
                        mVar5.f294819s = C101498c.m133261a(s2);
                        mVar5.f294797c = -1;
                        mVar5.f294796b = false;
                        arrayList3.add(mVar5);
                    }
                    if (!z || !Util.isNullOrNil(mVar4.f294819s)) {
                        i4++;
                    } else {
                        C101941c.m134173q().mo141466w(i5, true);
                    }
                } else {
                    arrayList3.add(C93088r.m117431a(l2));
                    if (z) {
                        C101941c.m134173q().mo141466w(i5, true);
                    }
                }
            }
            i5--;
        }
        if (z) {
            int i6 = i4 - 1;
            int i7 = i4 + 1;
            if (arrayList2 == null || arrayList.size() <= 0) {
                C100628m mVar6 = new C100628m();
                mVar6.f294819s = str != null ? str : "";
                mVar6.f294796b = false;
                mVar6.f294797c = -1;
                z2 = true;
                C101941c.m134173q().mo141445a(i4, mVar6, true);
            } else {
                C101941c q = C101941c.m134173q();
                q.getClass();
                if (arrayList.size() > 0) {
                    synchronized (q) {
                        if (q.f300117a != null) {
                            i2 = i4;
                            i3 = 0;
                            while (i < arrayList.size() && i2 >= 0 && i2 <= q.f300117a.size()) {
                                C100616a aVar2 = arrayList2.get(i);
                                if (aVar2 != null) {
                                    q.mo141464u(aVar2);
                                    q.f300117a.add(i2, aVar2);
                                    i3++;
                                    i2++;
                                    q.mo141444C(aVar2, true);
                                }
                                i++;
                            }
                            i = 1;
                        } else {
                            i2 = i4;
                            i3 = 0;
                        }
                    }
                    if (!(i == 0 || (aVar = q.f300118b) == null)) {
                        aVar.mo94193n4(i2 - i3, i3);
                    }
                }
                i7 = i4 + arrayList.size();
                z2 = true;
            }
            C101941c.m134173q().mo141448d(i6, i7, z2);
        }
        Collections.reverse(arrayList3);
        return arrayList3;
    }

    /* renamed from: f */
    public final SpannableStringBuilder mo141658f(boolean z, ArrayList<C100616a> arrayList, String str) {
        ArrayList<C100616a> arrayList2;
        C102127d l = mo141663l();
        mo141655c();
        int a = l.mo141642a();
        if (a == 1 || a == 2) {
            C100616a l2 = C101941c.m134173q().mo141456l(l.f300735a);
            if (l2 == null) {
                Log.m105920e("MicroMsg.Editor.EditorSelectManager", "getAndProcessSelectedDataInSingleSelect: item is null");
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (l2.mo140076b() != 1) {
                if (a != 1 || !z) {
                    return spannableStringBuilder;
                }
                int i = l.f300736b == 0 ? 1 : 2;
                if (arrayList != null && arrayList.size() > 0) {
                    arrayList2 = arrayList;
                } else if (Util.isNullOrNil(str)) {
                    return spannableStringBuilder;
                } else {
                    arrayList2 = new ArrayList<>();
                    C100628m mVar = new C100628m();
                    mVar.f294819s = str;
                    mVar.f294796b = false;
                    mVar.f294797c = -1;
                    arrayList2.add(mVar);
                }
                C101941c.m134173q().mo141463t(arrayList2, i, l.f300735a, l.f300736b, l.f300738d, true, true);
                C101941c q = C101941c.m134173q();
                int i2 = l.f300735a;
                q.mo141448d(i2 - 1, i2 + arrayList2.size() + 1, true);
                return spannableStringBuilder;
            } else if (!z || arrayList == null || arrayList.size() <= 0) {
                SpannableStringBuilder s = mo141670s((C100628m) l2, l.f300736b, l.f300738d, false, z, str, true);
                C101712a aVar = this.f300775v;
                if (aVar != null) {
                    aVar.mo94191h2(l.f300735a, 0);
                }
                if (!z) {
                    return s;
                }
                C101941c.m134173q().mo141465v();
                return s;
            } else {
                SpannableStringBuilder s2 = mo141670s((C100628m) l2, l.f300736b, l.f300738d, false, false, "", true);
                C101941c.m134173q().mo141463t(arrayList, 0, l.f300735a, l.f300736b, l.f300738d, true, true);
                C101941c q2 = C101941c.m134173q();
                int i3 = l.f300735a;
                q2.mo141448d(i3, arrayList.size() + i3 + 1, true);
                return s2;
            }
        } else {
            Log.m105920e("MicroMsg.Editor.EditorSelectManager", "getAndProcessSelectedDataInSingleSelect: incorrect select");
            return null;
        }
    }

    /* renamed from: g */
    public int mo141659g(int i) {
        C102127d dVar;
        int i2;
        int i3;
        if (f300744K && this.f300776w != null && mo141664m() != 0 && i >= (i2 = (dVar = this.f300776w).f300735a) && i <= (i3 = dVar.f300737c)) {
            if (i == i2 && i == i3) {
                return 1;
            }
            if (i > i2 && i < i3) {
                return 2;
            }
            if (i != i2 || i >= i3) {
                return (i <= i2 || i != i3) ? 0 : 3;
            }
            return 4;
        }
    }

    /* renamed from: i */
    public final RecyclerView mo141660i() {
        C101712a aVar = this.f300775v;
        if (aVar != null) {
            return ((EditorUI) aVar).f268042d;
        }
        return null;
    }

    /* renamed from: j */
    public final int mo141661j() {
        C101712a aVar;
        C101712a aVar2 = this.f300775v;
        int i = 0;
        if (aVar2 != null) {
            EditorUI editorUI = (EditorUI) aVar2;
            if (editorUI.f268054s) {
                i = KeyBoardUtil.getKeyBordHeightPx(editorUI);
            }
        }
        if (i == 0 && (aVar = this.f300775v) != null) {
            i = ((EditorUI) aVar).mo127483R7();
        }
        if (i == 0) {
            i = 150;
        }
        return this.f300763j - i;
    }

    /* renamed from: k */
    public final int mo141662k(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.getLocationOnScreen(this.f300767n);
            if (mo141668q(this.f300767n)) {
                return this.f300767n[1];
            }
        }
        return 150;
    }

    /* renamed from: l */
    public C102127d mo141663l() {
        if (!f300744K) {
            return new C102127d();
        }
        if (this.f300776w == null) {
            this.f300776w = new C102127d();
        }
        C102127d dVar = this.f300776w;
        return new C102127d(dVar.f300735a, dVar.f300736b, dVar.f300737c, dVar.f300738d);
    }

    /* renamed from: m */
    public int mo141664m() {
        if (!f300744K) {
            return 0;
        }
        if (this.f300776w == null) {
            this.f300776w = new C102127d();
        }
        return this.f300776w.mo141642a();
    }

    /* renamed from: n */
    public void mo141665n() {
        if (f300744K) {
            mo141666o(2);
            mo141666o(3);
            mo141666o(4);
        }
    }

    /* renamed from: o */
    public final boolean mo141666o(int i) {
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        PopupWindow popupWindow3;
        C102125b bVar = this.f300777x;
        if (bVar != null && bVar.f300721a == i && bVar.mo141641a() == 1) {
            return false;
        }
        if (i == 2 && (popupWindow3 = this.f300771r) != null) {
            popupWindow3.dismiss();
            mo141672u(2, -1, -1);
        } else if (i == 3 && (popupWindow2 = this.f300772s) != null) {
            popupWindow2.dismiss();
            mo141672u(3, -1, -1);
        } else if (i != 4 || (popupWindow = this.f300773t) == null) {
            return false;
        } else {
            popupWindow.dismiss();
            mo141672u(4, -1, -1);
        }
        return true;
    }

    /* renamed from: p */
    public void mo141667p() {
        PopupWindow popupWindow = this.f300774u;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: q */
    public final boolean mo141668q(int[] iArr) {
        return (!f300744K || iArr == null || iArr.length != 2 || iArr[0] == -1 || iArr[1] == -1) ? false : true;
    }

    /* renamed from: r */
    public final void mo141669r() {
        C101712a aVar = this.f300775v;
        if (aVar != null) {
            EditorUI editorUI = (EditorUI) aVar;
            C76701a.makeText((Context) editorUI.getContext(), (CharSequence) editorUI.getString(C0966R.string.hg5), 0).show();
        }
    }

    /* renamed from: s */
    public final SpannableStringBuilder mo141670s(C100628m mVar, int i, int i2, boolean z, boolean z2, String str, boolean z3) {
        Spanned a;
        if (mVar == null) {
            Log.m105920e("MicroMsg.Editor.EditorSelectManager", "processTextDataItem: textDataItem is null");
            return null;
        }
        Spanned a2 = C101496a.m133260a(mVar.f294819s);
        if (a2 == null) {
            Log.m105920e("MicroMsg.Editor.EditorSelectManager", "processTextDataItem: spannedText is null");
            return null;
        }
        if (z) {
            i2 = a2.length();
        }
        if (str == null) {
            str = "";
        }
        if (i < 0 || i > a2.length() || r6 < 0 || r6 > a2.length() || i > r6) {
            Log.m105920e("MicroMsg.Editor.EditorSelectManager", "processTextDataItem: incorrect offset");
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) a2.subSequence(0, i);
        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) a2.subSequence(i, r6);
        SpannableStringBuilder spannableStringBuilder3 = (SpannableStringBuilder) a2.subSequence(r6, a2.length());
        if (z2) {
            r6 = spannableStringBuilder.length();
            if (!Util.isNullOrNil(str) && (a = C101496a.m133260a(str)) != null) {
                r6 += a.length();
            }
            mVar.f294819s = C101498c.m133261a(spannableStringBuilder) + str + C101498c.m133261a(spannableStringBuilder3);
        }
        if (z3) {
            mVar.f294796b = true;
            mVar.f294797c = r6;
        } else {
            mVar.f294796b = false;
            mVar.f294797c = -1;
        }
        return spannableStringBuilder2;
    }

    /* renamed from: t */
    public final boolean mo141671t(View view, boolean z) {
        if (view == null) {
            return false;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager", "refreshOperationItem", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return false;
    }

    /* renamed from: u */
    public final void mo141672u(int i, int i2, int i3) {
        int[] iArr;
        if (f300744K) {
            if (i == 2) {
                int[] iArr2 = this.f300768o;
                if (iArr2 != null && iArr2.length == 2) {
                    iArr2[0] = i2;
                    iArr2[1] = i3;
                }
            } else if (i == 3) {
                int[] iArr3 = this.f300769p;
                if (iArr3 != null && iArr3.length == 2) {
                    iArr3[0] = i2;
                    iArr3[1] = i3;
                }
            } else if (i == 4 && (iArr = this.f300770q) != null && iArr.length == 2) {
                iArr[0] = i2;
                iArr[1] = i3;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo141673v(int r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            boolean r0 = f300744K
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            v21.d r0 = r4.f300776w
            r2 = 1
            if (r0 != 0) goto L_0x0013
            v21.d r0 = new v21.d
            r0.<init>(r5, r6, r7, r8)
            r4.f300776w = r0
            goto L_0x002e
        L_0x0013:
            int r3 = r0.f300735a
            if (r3 != r5) goto L_0x0026
            int r3 = r0.f300736b
            if (r3 != r6) goto L_0x0026
            int r3 = r0.f300737c
            if (r3 != r7) goto L_0x0026
            int r3 = r0.f300738d
            if (r3 == r8) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r5 = 0
            goto L_0x002f
        L_0x0026:
            r0.f300735a = r5
            r0.f300736b = r6
            r0.f300737c = r7
            r0.f300738d = r8
        L_0x002e:
            r5 = 1
        L_0x002f:
            if (r5 == 0) goto L_0x0066
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            v21.d r7 = r4.f300776w
            int r7 = r7.f300735a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r1] = r7
            v21.d r7 = r4.f300776w
            int r7 = r7.f300736b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r2] = r7
            r7 = 2
            v21.d r8 = r4.f300776w
            int r8 = r8.f300737c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            r7 = 3
            v21.d r8 = r4.f300776w
            int r8 = r8.f300738d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            java.lang.String r7 = "MicroMsg.Editor.EditorSelectManager"
            java.lang.String r8 = "setSelectInfo: %d:%d - %d:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r8, r6)
        L_0x0066:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v21.C102132i.mo141673v(int, int, int, int):boolean");
    }

    /* renamed from: w */
    public final void mo141674w(TextView textView, int i) {
        if (textView != null) {
            textView.setTextSize(1, (float) i);
        }
    }

    /* renamed from: x */
    public void mo141675x(boolean z) {
        if (f300744K) {
            RecyclerView i = mo141660i();
            int m = mo141664m();
            if (i == null || m == 0 || (m == 1 && !z)) {
                mo141665n();
                return;
            }
            View b = C102142r.m134571b(i, this.f300776w.f300735a);
            View b2 = C102142r.m134571b(i, this.f300776w.f300737c);
            if (m == 1) {
                mo141666o(3);
                mo141666o(4);
                mo141676y(2, i, b, this.f300776w.f300736b);
                return;
            }
            mo141666o(2);
            mo141676y(3, i, b, this.f300776w.f300736b);
            mo141676y(4, i, b2, this.f300776w.f300738d);
        }
    }

    /* renamed from: y */
    public final void mo141676y(int i, RecyclerView recyclerView, View view, int i2) {
        int i3;
        WXRTEditText wXRTEditText;
        if (f300744K && recyclerView != null) {
            C102126c a = C102142r.m134570a(view);
            if (a == null) {
                mo141666o(i);
                return;
            }
            WXRTEditText wXRTEditText2 = null;
            WXRTEditText wXRTEditText3 = a.f300732a;
            boolean z = false;
            if (wXRTEditText3 != null) {
                i3 = i2;
                wXRTEditText2 = wXRTEditText3;
            } else {
                WXRTEditText wXRTEditText4 = a.f300733b;
                if (!(wXRTEditText4 == null || (wXRTEditText = a.f300734c) == null)) {
                    if (i2 == 0) {
                        wXRTEditText2 = wXRTEditText4;
                    } else if (i2 == 1) {
                        wXRTEditText2 = wXRTEditText;
                    }
                    i3 = 0;
                }
                i3 = i2;
            }
            if (wXRTEditText2 == null) {
                mo141666o(i);
                return;
            }
            Editable text = wXRTEditText2.getText();
            if (text == null || i3 < 0 || i3 > text.length()) {
                mo141666o(i);
                return;
            }
            Layout layout = wXRTEditText2.getLayout();
            if (layout == null) {
                mo141666o(i);
                return;
            }
            float primaryHorizontal = layout.getPrimaryHorizontal(i3) + ((float) wXRTEditText2.getPaddingLeft());
            float paddingTop = (float) (wXRTEditText2.getPaddingTop() + layout.getLineTop(layout.getLineForOffset(i3)));
            if (wXRTEditText2.getEditTextType() != 0) {
                paddingTop = (paddingTop + ((float) wXRTEditText2.getHeight())) - ((float) this.f300755b);
                if (i == 3) {
                    primaryHorizontal += (float) this.f300766m;
                } else if (i == 4) {
                    primaryHorizontal -= (float) this.f300766m;
                }
            }
            int[] iArr = new int[2];
            wXRTEditText2.getLocationOnScreen(iArr);
            if (i == 2) {
                z = mo141648B(2, recyclerView, this.f300771r, (int) ((((float) iArr[0]) + primaryHorizontal) - ((float) this.f300765l)), (int) (((float) iArr[1]) + paddingTop));
            } else if (i == 3) {
                PopupWindow popupWindow = this.f300772s;
                z = mo141648B(3, recyclerView, popupWindow, (int) ((((float) iArr[0]) + primaryHorizontal) - ((float) popupWindow.getWidth())), (int) (((float) iArr[1]) + paddingTop));
            } else if (i == 4) {
                z = mo141648B(4, recyclerView, this.f300773t, (int) (((float) iArr[0]) + primaryHorizontal), (int) (((float) iArr[1]) + paddingTop));
            }
            if (!z) {
                mo141666o(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r7 = u21.C101941c.m134173q().mo141456l(r0.f300776w.f300735a);
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x024f  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141677z(boolean r18) {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = f300744K
            if (r1 == 0) goto L_0x02b2
            android.widget.PopupWindow r1 = r0.f300774u
            if (r1 != 0) goto L_0x000c
            goto L_0x02b2
        L_0x000c:
            androidx.recyclerview.widget.RecyclerView r1 = r17.mo141660i()
            int r2 = r17.mo141664m()
            if (r1 == 0) goto L_0x02af
            if (r2 == 0) goto L_0x02af
            r3 = 1
            if (r2 != r3) goto L_0x001d
            if (r18 == 0) goto L_0x02af
        L_0x001d:
            v21.b r2 = r0.f300777x
            if (r2 == 0) goto L_0x0029
            int r2 = r2.mo141641a()
            if (r2 != r3) goto L_0x0029
            goto L_0x02af
        L_0x0029:
            android.widget.TextView r2 = r0.f300746B
            r4 = 0
            boolean r2 = r0.mo141671t(r2, r4)
            android.widget.TextView r5 = r0.f300747C
            boolean r5 = r0.mo141671t(r5, r4)
            android.widget.TextView r6 = r0.f300748D
            int r7 = r17.mo141664m()
            if (r7 == r3) goto L_0x003f
            goto L_0x0069
        L_0x003f:
            u21.c r7 = u21.C101941c.m134173q()
            v21.d r8 = r0.f300776w
            int r8 = r8.f300735a
            p21.a r7 = r7.mo141456l(r8)
            if (r7 == 0) goto L_0x0069
            u21.c r8 = u21.C101941c.m134173q()
            int r8 = r8.mo141443B()
            if (r8 > r3) goto L_0x0067
            int r8 = r7.mo140076b()
            if (r8 != r3) goto L_0x0067
            p21.m r7 = (p21.C100628m) r7
            java.lang.String r7 = r7.f294819s
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0069
        L_0x0067:
            r7 = 1
            goto L_0x006a
        L_0x0069:
            r7 = 0
        L_0x006a:
            boolean r6 = r0.mo141671t(r6, r7)
            android.widget.TextView r7 = r0.f300749E
            u21.c r8 = u21.C101941c.m134173q()
            int r8 = r8.mo141458n()
            u21.c r9 = u21.C101941c.m134173q()
            int r9 = r9.mo141460p()
            u21.c r10 = u21.C101941c.m134173q()
            p21.a r10 = r10.mo141456l(r8)
            u21.c r11 = u21.C101941c.m134173q()
            p21.a r11 = r11.mo141456l(r9)
            if (r10 == 0) goto L_0x00d0
            if (r11 != 0) goto L_0x0095
            goto L_0x00d0
        L_0x0095:
            v21.d r10 = r0.f300776w
            if (r10 == 0) goto L_0x00ce
            int r12 = r10.f300735a
            if (r12 != r8) goto L_0x00ce
            int r8 = r10.f300736b
            if (r8 != 0) goto L_0x00ce
            int r8 = r10.f300737c
            if (r8 != r9) goto L_0x00ce
            int r8 = r11.mo140076b()
            if (r8 != r3) goto L_0x00c1
            p21.m r11 = (p21.C100628m) r11
            java.lang.String r8 = r11.f294819s
            android.text.Spanned r8 = s21.C101496a.m133260a(r8)
            if (r8 != 0) goto L_0x00b6
            goto L_0x00d0
        L_0x00b6:
            v21.d r9 = r0.f300776w
            int r9 = r9.f300738d
            int r8 = r8.length()
            if (r9 != r8) goto L_0x00ce
            goto L_0x00d0
        L_0x00c1:
            int r8 = r11.mo140076b()
            if (r8 == r3) goto L_0x00ce
            v21.d r8 = r0.f300776w
            int r8 = r8.f300738d
            if (r8 != r3) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            r8 = 1
            goto L_0x00d1
        L_0x00d0:
            r8 = 0
        L_0x00d1:
            boolean r7 = r0.mo141671t(r7, r8)
            android.widget.TextView r8 = r0.f300750F
            boolean r9 = r0.f300754a
            if (r9 != 0) goto L_0x00dc
            goto L_0x00fc
        L_0x00dc:
            int r9 = r17.mo141664m()
            if (r9 == 0) goto L_0x00fc
            if (r9 != r3) goto L_0x00e5
            goto L_0x00fc
        L_0x00e5:
            t21.a r9 = r0.f300775v
            if (r9 == 0) goto L_0x00fa
            com.tencent.mm.plugin.component.editor.EditorUI r9 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r9
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.b r9 = r9.f268048j
            if (r9 == 0) goto L_0x00f7
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r9 = r9.mo127568b()
            if (r9 == 0) goto L_0x00f7
            r9 = 1
            goto L_0x00f8
        L_0x00f7:
            r9 = 0
        L_0x00f8:
            r9 = r9 ^ r3
            goto L_0x00fd
        L_0x00fa:
            r9 = 1
            goto L_0x00fd
        L_0x00fc:
            r9 = 0
        L_0x00fd:
            boolean r8 = r0.mo141671t(r8, r9)
            android.widget.TextView r9 = r0.f300751G
            int r10 = r17.mo141664m()
            boolean r11 = r0.f300754a
            r12 = 3
            r13 = 2
            if (r11 == 0) goto L_0x0113
            if (r10 == r13) goto L_0x0111
            if (r10 != r12) goto L_0x0113
        L_0x0111:
            r10 = 1
            goto L_0x0114
        L_0x0113:
            r10 = 0
        L_0x0114:
            boolean r9 = r0.mo141671t(r9, r10)
            android.widget.TextView r10 = r0.f300752H
            int r11 = r17.mo141664m()
            if (r11 == r13) goto L_0x0125
            if (r11 != r12) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            r11 = 0
            goto L_0x0126
        L_0x0125:
            r11 = 1
        L_0x0126:
            boolean r10 = r0.mo141671t(r10, r11)
            android.widget.TextView r11 = r0.f300753I
            boolean r14 = r0.f300754a
            if (r14 == 0) goto L_0x0139
            int r14 = r17.mo141664m()
            if (r14 != 0) goto L_0x0137
            goto L_0x0139
        L_0x0137:
            r14 = 1
            goto L_0x013a
        L_0x0139:
            r14 = 0
        L_0x013a:
            boolean r11 = r0.mo141671t(r11, r14)
            if (r2 != 0) goto L_0x0151
            if (r5 != 0) goto L_0x0151
            if (r6 != 0) goto L_0x0151
            if (r7 != 0) goto L_0x0151
            if (r8 != 0) goto L_0x0151
            if (r9 != 0) goto L_0x0151
            if (r10 != 0) goto L_0x0151
            if (r11 == 0) goto L_0x014f
            goto L_0x0151
        L_0x014f:
            r2 = 0
            goto L_0x0152
        L_0x0151:
            r2 = 1
        L_0x0152:
            if (r2 != 0) goto L_0x0158
            r17.mo141667p()
            return
        L_0x0158:
            int r2 = r0.mo141662k(r1)
            int r5 = r17.mo141661j()
            android.widget.PopupWindow r6 = r0.f300774u
            if (r6 == 0) goto L_0x0192
            android.view.View r6 = r6.getContentView()
            if (r6 == 0) goto L_0x0192
            android.widget.PopupWindow r6 = r0.f300774u
            android.view.View r6 = r6.getContentView()
            r6.measure(r4, r4)
            android.widget.PopupWindow r6 = r0.f300774u
            android.view.View r6 = r6.getContentView()
            int r6 = r6.getMeasuredHeight()
            int r7 = r0.f300758e
            int r7 = r7 * 2
            int r6 = r6 + r7
            android.widget.PopupWindow r7 = r0.f300774u
            android.view.View r7 = r7.getContentView()
            int r7 = r7.getMeasuredWidth()
            int r8 = r0.f300758e
            int r8 = r8 * 2
            int r7 = r7 + r8
            goto L_0x0194
        L_0x0192:
            r6 = 0
            r7 = 0
        L_0x0194:
            if (r6 != 0) goto L_0x0198
            int r6 = r0.f300760g
        L_0x0198:
            if (r7 != 0) goto L_0x019c
            int r7 = r0.f300761h
        L_0x019c:
            android.widget.PopupWindow r8 = r0.f300771r
            r9 = -1000(0xfffffffffffffc18, float:NaN)
            r10 = -1
            if (r8 == 0) goto L_0x01db
            boolean r8 = r8.isShowing()
            if (r8 == 0) goto L_0x01db
            int[] r8 = r0.f300768o
            boolean r8 = r0.mo141668q(r8)
            if (r8 == 0) goto L_0x01db
            int[] r8 = r0.f300768o
            r3 = r8[r3]
            int r6 = r3 - r6
            android.widget.PopupWindow r8 = r0.f300771r
            int r8 = r8.getHeight()
            int r3 = r3 + r8
            int r8 = r0.f300762i
            int r3 = r3 - r8
            if (r6 < r2) goto L_0x01cb
            if (r6 > r5) goto L_0x01cb
            int[] r2 = r0.f300768o
            r2 = r2[r4]
            goto L_0x0260
        L_0x01cb:
            if (r3 < r2) goto L_0x01d6
            if (r3 > r5) goto L_0x01d6
            int[] r2 = r0.f300768o
            r2 = r2[r4]
            r6 = r3
            goto L_0x0260
        L_0x01d6:
            r2 = -1000(0xfffffffffffffc18, float:NaN)
            r6 = -1
            goto L_0x0260
        L_0x01db:
            android.widget.PopupWindow r8 = r0.f300772s
            if (r8 == 0) goto L_0x0214
            boolean r8 = r8.isShowing()
            if (r8 == 0) goto L_0x0214
            int[] r8 = r0.f300769p
            boolean r8 = r0.mo141668q(r8)
            if (r8 == 0) goto L_0x0214
            int[] r8 = r0.f300769p
            r8 = r8[r3]
            int r11 = r8 - r6
            android.widget.PopupWindow r14 = r0.f300772s
            int r14 = r14.getHeight()
            int r8 = r8 + r14
            int r14 = r0.f300762i
            int r8 = r8 - r14
            if (r11 < r2) goto L_0x0206
            if (r11 > r5) goto L_0x0206
            int[] r8 = r0.f300769p
            r8 = r8[r4]
            goto L_0x0217
        L_0x0206:
            if (r8 < r2) goto L_0x0214
            if (r8 > r5) goto L_0x0214
            int[] r11 = r0.f300769p
            r11 = r11[r4]
            r16 = r11
            r11 = r8
            r8 = r16
            goto L_0x0217
        L_0x0214:
            r8 = -1000(0xfffffffffffffc18, float:NaN)
            r11 = -1
        L_0x0217:
            android.widget.PopupWindow r14 = r0.f300773t
            if (r14 == 0) goto L_0x025e
            boolean r14 = r14.isShowing()
            if (r14 == 0) goto L_0x025e
            int[] r14 = r0.f300770q
            boolean r14 = r0.mo141668q(r14)
            if (r14 == 0) goto L_0x025e
            int[] r14 = r0.f300770q
            r14 = r14[r3]
            int r15 = r14 - r6
            android.widget.PopupWindow r13 = r0.f300773t
            int r13 = r13.getHeight()
            int r14 = r14 + r13
            int r13 = r0.f300762i
            int r13 = r14 - r13
            if (r11 != r10) goto L_0x024f
            if (r15 < r2) goto L_0x0246
            if (r15 > r5) goto L_0x0246
            int[] r2 = r0.f300770q
            r2 = r2[r4]
            r6 = r15
            goto L_0x0260
        L_0x0246:
            if (r13 < r2) goto L_0x025e
            if (r13 > r5) goto L_0x025e
            int[] r2 = r0.f300770q
            r2 = r2[r4]
            goto L_0x025c
        L_0x024f:
            int r6 = r6 + r11
            int[] r14 = r0.f300770q
            r3 = r14[r3]
            if (r6 <= r3) goto L_0x025e
            if (r13 < r2) goto L_0x025e
            if (r13 > r5) goto L_0x025e
            r2 = r14[r4]
        L_0x025c:
            r6 = r13
            goto L_0x0260
        L_0x025e:
            r2 = r8
            r6 = r11
        L_0x0260:
            if (r6 != r10) goto L_0x0284
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r1.getLayoutManager()
            if (r2 == 0) goto L_0x0282
            boolean r3 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r3 == 0) goto L_0x0282
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            int r3 = r2.mo16957C()
            int r2 = r2.mo16959E()
            v21.d r4 = r0.f300776w
            int r5 = r4.f300735a
            if (r5 > r3) goto L_0x0282
            int r3 = r4.f300737c
            if (r3 < r2) goto L_0x0282
            r6 = 300(0x12c, float:4.2E-43)
        L_0x0282:
            r2 = -1000(0xfffffffffffffc18, float:NaN)
        L_0x0284:
            if (r6 != r10) goto L_0x028a
            r17.mo141667p()
            goto L_0x02ae
        L_0x028a:
            int r3 = r0.f300764k
            int r4 = r3 / 3
            int r5 = r3 * 2
            int r5 = r5 / r12
            if (r2 == r9) goto L_0x02a8
            if (r2 < r4) goto L_0x0298
            if (r2 > r5) goto L_0x0298
            goto L_0x02a8
        L_0x0298:
            if (r2 >= r4) goto L_0x02a0
            int r2 = r0.f300759f
            r0.mo141649C(r1, r2, r6)
            goto L_0x02ae
        L_0x02a0:
            int r3 = r3 - r7
            int r2 = r0.f300759f
            int r3 = r3 - r2
            r0.mo141649C(r1, r3, r6)
            goto L_0x02ae
        L_0x02a8:
            int r3 = r3 - r7
            r2 = 2
            int r3 = r3 / r2
            r0.mo141649C(r1, r3, r6)
        L_0x02ae:
            return
        L_0x02af:
            r17.mo141667p()
        L_0x02b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v21.C102132i.mo141677z(boolean):void");
    }
}
