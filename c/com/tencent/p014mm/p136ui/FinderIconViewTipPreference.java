package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C39623j;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.render.C18747a;
import com.tencent.p014mm.plugin.finder.extension.reddot.render.C41411b;
import com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C7865r3;
import ht1.C60165e4;
import ht1.C60200t1;
import ht1.C76243a5;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l31.C61212e;
import l31.C61213g;
import p151er.C20609s;
import p151er.C75651n;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import te3.C49308en1;
import te3.C64586nn1;
import te3.tg4;
import up1.C27696y;
import zp3.C79406f;

/* renamed from: com.tencent.mm.ui.FinderIconViewTipPreference */
public class FinderIconViewTipPreference extends NormalIconNewTipPreference {

    /* renamed from: A1 */
    public View f55760A1;

    /* renamed from: B1 */
    public ImageView f55761B1;

    /* renamed from: C1 */
    public ImageView f55762C1;

    /* renamed from: D1 */
    public ImageView f55763D1;

    /* renamed from: E1 */
    public ImageView f55764E1;

    /* renamed from: F1 */
    public ImageView f55765F1;

    /* renamed from: G1 */
    public ImageView f55766G1;

    /* renamed from: H1 */
    public WeImageView f55767H1;

    /* renamed from: I1 */
    public TextView f55768I1;

    /* renamed from: J1 */
    public TextView f55769J1;

    /* renamed from: K1 */
    public ImageView f55770K1;

    /* renamed from: L1 */
    public ArrayList<View> f55771L1;

    /* renamed from: M1 */
    public ArrayList<ImageView> f55772M1;

    /* renamed from: N1 */
    public TextView f55773N1;

    /* renamed from: O1 */
    public View f55774O1;

    /* renamed from: P1 */
    public ImageView f55775P1;

    /* renamed from: Q1 */
    public ImageView f55776Q1;

    /* renamed from: R1 */
    public ImageView f55777R1;

    /* renamed from: S1 */
    public ImageView f55778S1;

    /* renamed from: T1 */
    public C20609s f55779T1;

    /* renamed from: U1 */
    public C20609s f55780U1;

    /* renamed from: V1 */
    public int f55781V1;

    /* renamed from: W1 */
    public boolean f55782W1;

    /* renamed from: X1 */
    public int f55783X1;

    /* renamed from: Y1 */
    public tg4 f55784Y1;

    /* renamed from: Z1 */
    public boolean f55785Z1;

    /* renamed from: a2 */
    public boolean f55786a2;

    /* renamed from: b2 */
    public boolean f55787b2;

    /* renamed from: c2 */
    public boolean f55788c2;

    /* renamed from: d2 */
    public boolean f55789d2;

    /* renamed from: e2 */
    public C18747a f55790e2;

    /* renamed from: f2 */
    public C49308en1 f55791f2;

    /* renamed from: g2 */
    public RelativeLayout f55792g2;

    /* renamed from: h2 */
    public WeImageView f55793h2;

    /* renamed from: i2 */
    public LinearLayout f55794i2;

    /* renamed from: j2 */
    public RelativeLayout f55795j2;

    /* renamed from: k2 */
    public LinearLayout.LayoutParams f55796k2;

    /* renamed from: l2 */
    public LinearLayout.LayoutParams f55797l2;

    /* renamed from: m2 */
    public LinearLayout.LayoutParams f55798m2;

    /* renamed from: n2 */
    public LinearLayout.LayoutParams f55799n2;

    /* renamed from: o2 */
    public C64586nn1 f55800o2;

    /* renamed from: p2 */
    public C55718s0 f55801p2;

    /* renamed from: q2 */
    public C64586nn1 f55802q2;

    /* renamed from: r2 */
    public C55718s0 f55803r2;

    /* renamed from: v1 */
    public Context f55804v1;

    /* renamed from: w1 */
    public ViewGroup f55805w1;

    /* renamed from: x1 */
    public View f55806x1;

    /* renamed from: y1 */
    public View f55807y1;

    /* renamed from: z1 */
    public View f55808z1;

    public FinderIconViewTipPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A0 */
    public final boolean mo25947A0() {
        String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        Log.m105924i("FinderIconViewTipPreference", "language :" + currentLanguage);
        int zQ = ((C75651n) C86312j.m106911c(C75651n.class)).mo55953zQ();
        Log.m105924i("FinderIconViewTipPreference", "isZh language:" + currentLanguage + " testValue:" + zQ);
        return (!TextUtils.isEmpty(currentLanguage) && currentLanguage.startsWith("zh")) || zQ == 1;
    }

    /* renamed from: B0 */
    public void mo25948B0() {
        RelativeLayout relativeLayout;
        C64586nn1 nn12;
        Class cls = C61213g.class;
        Class cls2 = C60200t1.class;
        String s0 = mo25973s0();
        C64586nn1 R5 = ((C60200t1) C86312j.m106911c(cls2)).Nt0().mo77246R5(s0);
        C55718s0 G5 = ((C60200t1) C86312j.m106911c(cls2)).Nt0().mo77227G5(s0);
        if (LauncherUI.getCurrentTabIndex() == 2 && (relativeLayout = this.f55795j2) != null && relativeLayout.getVisibility() == 0) {
            Context context = this.f121274d;
            if ((context instanceof LauncherUI) && ((LauncherUI) context).getLifecycle().getCurrentState().mo62187a(C39623j.C39626c.RESUMED) && (nn12 = this.f55800o2) != R5 && nn12 != null) {
                Log.m105924i("FinderIconViewTipPreference", "onChangeRedDotInfo");
                this.f55802q2 = this.f55800o2;
                this.f55803r2 = this.f55801p2;
                this.f55800o2 = R5;
                this.f55801p2 = G5;
                ((C61213g) C86312j.m106911c(cls)).Uw0(this.f55795j2, false);
                ((C61213g) C86312j.m106911c(cls)).Uw0(this.f55795j2, true);
                return;
            }
        }
        this.f55800o2 = R5;
        this.f55801p2 = G5;
    }

    /* renamed from: C0 */
    public final void mo25949C0(View view, String str, String str2) {
        Class cls = C61212e.class;
        C55718s0 G5 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77227G5(str);
        if (G5 != null) {
            ((C61212e) C86312j.m106911c(cls)).mo86165fW(view, G5.field_tipsId);
        }
        ((C61212e) C86312j.m106911c(cls)).o30(view, str2).mo86175pO(view, 128, 27166).E60(view, new FinderIconViewTipPreference$$a(this, str));
    }

    /* renamed from: D0 */
    public final void mo25950D0(tg4 tg4, int i) {
        for (int size = tg4.f354438g.size(); size > i; size--) {
            tg4.f354438g.removeLast();
        }
    }

    /* renamed from: F0 */
    public final void mo25951F0(C20609s sVar) {
        if (sVar != null && sVar.getView().getVisibility() == 0) {
            sVar.setDropStat(0);
        }
    }

    /* renamed from: G0 */
    public final void mo25952G0(tg4 tg4, boolean z, boolean z2) {
        C20609s sVar;
        C20609s sVar2;
        int i;
        int i2;
        tg4 tg42 = tg4;
        if (z2) {
            mo25953H0(this.f55767H1, 0);
        } else {
            mo25953H0(this.f55767H1, 8);
        }
        if (!mo25980z0(tg4)) {
            if (z) {
                mo25953H0(this.f55769J1, 8);
                mo25953H0(this.f55779T1.getView(), 8);
            } else {
                mo25953H0(this.f55768I1, 8);
                mo25953H0(this.f55780U1.getView(), 8);
            }
            boolean z3 = tg42.f354443o;
            C20609s sVar3 = this.f55779T1;
            C20609s sVar4 = this.f55780U1;
            if (z) {
                sVar = sVar4;
            } else {
                sVar = sVar3;
                sVar3 = sVar4;
            }
            TextView textView = null;
            Log.m105924i("FinderIconViewTipPreference", "setNewTitleView: isZh" + mo25947A0());
            if (z) {
                ViewGroup.LayoutParams layoutParams = this.f55768I1.getLayoutParams();
                if (layoutParams.width != -2) {
                    layoutParams.width = -2;
                    this.f55768I1.setLayoutParams(layoutParams);
                }
                textView = this.f55768I1;
            } else if (!mo25947A0()) {
                textView = this.f55769J1;
            } else {
                TextView textView2 = this.f55769J1;
                if (textView2 != null) {
                    mo25953H0(textView2, 8);
                }
            }
            if (mo25980z0(tg4)) {
                mo25953H0(textView, 8);
                mo25953H0(this.f55779T1.getView(), 8);
                mo25953H0(this.f55780U1.getView(), 8);
            } else if (textView != null) {
                mo25953H0(textView, 0);
                mo25953H0(this.f55779T1.getView(), 8);
                mo25953H0(this.f55780U1.getView(), 8);
                textView.setText(tg42.f354436e);
            } else {
                mo25953H0(sVar3.getView(), 8);
                mo25953H0(sVar.getView(), 0);
                String str = tg42.f354440i;
                if (C85875k4.m106211z()) {
                    str = tg42.f354442n;
                }
                String str2 = tg42.f354446r;
                if (C85875k4.m106211z()) {
                    str2 = tg42.f354447s;
                }
                if (Util.isNullOrNil(str2)) {
                    str2 = str;
                }
                int n0 = mo25968n0(str);
                int n05 = mo25968n0(str2);
                if (!z3) {
                    i2 = this.f55804v1.getResources().getColor(C0966R.color.FG_1);
                    i = this.f55804v1.getResources().getColor(C0966R.color.FG_1);
                } else {
                    i2 = n0;
                    i = n05;
                }
                if (tg42.f354436e == null) {
                    tg42.f354436e = "";
                }
                if (tg42.f354439h == null) {
                    tg42.f354439h = "";
                }
                if (tg42.f354441j == null) {
                    tg42.f354441j = "";
                }
                sVar.mo32263a(mo25972r0(tg42, false, true, false), tg42.f354436e, tg42.f354439h, C0966R.dimen.f3964lm, i2, i, tg42.f354441j, true);
            }
            C20609s sVar5 = this.f55779T1;
            if ((sVar5 != null && sVar5.getView().getVisibility() == 0 && this.f55779T1.getDropStat() == 1) || ((sVar2 = this.f55780U1) != null && sVar2.getView().getVisibility() == 0 && this.f55780U1.getDropStat() == 1 && mo25979y0(tg4))) {
                tg42.f354439h = "";
                tg42.f354441j = "";
                mo25951F0(this.f55779T1);
                mo25951F0(this.f55780U1);
                mo25955J0(this.f55782W1, tg4, this.f55781V1, true, this.f55787b2, this.f55788c2, this.f55789d2, this.f55783X1);
            }
            if (z) {
                mo25976v0(this.f55780U1);
            } else {
                mo25976v0(this.f55779T1);
            }
        } else {
            mo25953H0(this.f55768I1, 8);
            mo25953H0(this.f55769J1, 8);
            mo25953H0(this.f55779T1.getView(), 8);
            mo25953H0(this.f55780U1.getView(), 8);
        }
    }

    /* renamed from: H0 */
    public final void mo25953H0(View view, int i) {
        if (!(view == null || view.getVisibility() == i)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/FinderIconViewTipPreference", "setViewVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/FinderIconViewTipPreference", "setViewVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view != null && view == this.f55805w1 && i == 8) {
            mo25965k0(true);
        }
    }

    /* renamed from: I0 */
    public void mo25954I0(boolean z, C49308en1 en12, int i, int i2) {
        Log.m105925i("FinderIconViewTipPreference", "[showDslView] show=%s redDotCount:%s", Boolean.valueOf(z), Integer.valueOf(i2));
        this.f55782W1 = z;
        this.f55781V1 = i;
        this.f55791f2 = en12;
        this.f55783X1 = i2;
        if (!mo25978x0(i, en12)) {
            Log.m105928w("FinderIconViewTipPreference", "showDslView return for initWidgetFrame");
        } else {
            mo25975u0(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:189:0x065a, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x065d, code lost:
        if (r3 > r2) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0661, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x072e  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0730  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0735  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0762  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0764  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0767  */
    /* JADX WARNING: Removed duplicated region for block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x018a  */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25955J0(boolean r40, te3.tg4 r41, int r42, boolean r43, boolean r44, boolean r45, boolean r46, int r47) {
        /*
            r39 = this;
            r10 = r39
            r9 = r40
            r11 = r41
            r0 = r42
            r12 = r43
            r13 = r44
            r14 = r47
            pl1.e0$a r1 = pl1.C11978e0.C11979a.AVATAR
            up1.y r2 = up1.C27696y.MEDIUM_AVATAR_IMAGE
            java.lang.Class<pl1.t0> r3 = pl1.C62368t0.class
            java.lang.Class<pl1.s0> r4 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r15 = ht1.C60200t1.class
            r5 = 10
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r40)
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = r11.f354436e
            r16 = r4
            r4 = 1
            r6[r4] = r7
            java.lang.String r7 = r11.f354437f
            r8 = 2
            r6[r8] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r42)
            r8 = 3
            r6[r8] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r43)
            r5 = 4
            r6[r5] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r44)
            r8 = 5
            r6[r8] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r45)
            r8 = 6
            r6[r8] = r7
            android.widget.RelativeLayout r7 = r10.f55795j2
            r8 = 7
            r6[r8] = r7
            java.lang.String r7 = r11.f354439h
            r4 = 8
            r6[r4] = r7
            java.lang.String r7 = r11.f354440i
            r24 = 9
            r6[r24] = r7
            java.lang.String r7 = "FinderIconViewTipPreference"
            java.lang.String r8 = "[showFinderAvatars] show=%s title=%s url=%s style=%s withRedDot=%s isRightTitle=%s isLiveRedDot=%s mThirdLayoutContainer:%s subTitle:%s, subIcon:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
            r6 = 0
            boolean r8 = r10.mo25978x0(r0, r6)
            if (r8 != 0) goto L_0x0071
            java.lang.String r0 = "showFinderAvatars return for initWidgetFrame"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            return
        L_0x0071:
            r10.f55786a2 = r12
            boolean r8 = r39.mo25947A0()
            if (r8 == 0) goto L_0x0083
            boolean r8 = r10.mo25979y0(r11)
            if (r8 == 0) goto L_0x0083
            if (r12 == 0) goto L_0x0083
            r8 = 0
            goto L_0x0084
        L_0x0083:
            r8 = r12
        L_0x0084:
            r11.f354435d = r14
            r10.f55782W1 = r9
            r10.f55783X1 = r14
            r10.f55784Y1 = r11
            r10.f55781V1 = r0
            r10.f55785Z1 = r8
            r10.f55787b2 = r13
            r4 = r45
            r10.f55788c2 = r4
            r4 = r46
            r10.f55789d2 = r4
            android.widget.TextView r6 = r10.f55773N1
            r5 = 8
            r10.mo25953H0(r6, r5)
            r6 = 1
            if (r0 != r6) goto L_0x00cd
            r4 = 0
            r10.mo25965k0(r4)
            r0 = 0
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r45)
            java.lang.Boolean r17 = java.lang.Boolean.FALSE
            r1 = r39
            r2 = r40
            r3 = r41
            r6 = 8
            r9 = 1
            r19 = 0
            r4 = r0
            r5 = r8
            r6 = r44
            r13 = r7
            r7 = r16
            r18 = r8
            r8 = r17
            r14 = 1
            r9 = r46
            r1.mo25961h0(r2, r3, r4, r5, r6, r7, r8, r9)
            r9 = 0
            goto L_0x00eb
        L_0x00cd:
            r18 = r8
            r8 = 2
            r14 = 1
            if (r0 != r8) goto L_0x00f0
            r6 = 0
            r10.mo25965k0(r6)
            r4 = 0
            r1 = r39
            r2 = r40
            r3 = r41
            r5 = r18
            r9 = 0
            r6 = r44
            r13 = r7
            r7 = r45
            r8 = r46
            r1.mo25963i0(r2, r3, r4, r5, r6, r7, r8)
        L_0x00eb:
            r14 = r13
        L_0x00ec:
            r13 = 8
            goto L_0x0377
        L_0x00f0:
            r4 = 4
            r8 = 0
            if (r0 != r4) goto L_0x0114
            r10.mo25965k0(r8)
            r4 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r45)
            java.lang.Boolean r16 = java.lang.Boolean.FALSE
            r1 = r39
            r2 = r40
            r3 = r41
            r5 = r18
            r6 = r44
            r13 = r7
            r7 = r0
            r9 = 0
            r8 = r16
            r14 = 0
            r9 = r46
            r1.mo25961h0(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00eb
        L_0x0114:
            r8 = r7
            r4 = 5
            r14 = 0
            if (r0 != r4) goto L_0x013d
            r10.mo25965k0(r14)
            r4 = 1
            r1 = r39
            r2 = r40
            r3 = r41
            r5 = r18
            r6 = r44
            r7 = r45
            r31 = r8
            r8 = r46
            r1.mo25963i0(r2, r3, r4, r5, r6, r7, r8)
            r4 = 0
            r6 = 1
            r7 = r44
            r1.mo25957f0(r2, r3, r4, r5, r6, r7)
            r39.mo25964j0(r40, r41)
            r14 = r31
            goto L_0x00ec
        L_0x013d:
            r31 = r8
            r4 = 3
            if (r0 != r4) goto L_0x02eb
            r10.mo25965k0(r14)
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r40)
            r0[r14] = r4
            java.lang.String r4 = "bindAvatars() show:%s"
            r8 = r31
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r4, r0)
            if (r9 == 0) goto L_0x02d4
            java.util.LinkedList<java.lang.String> r0 = r11.f354438g
            if (r0 == 0) goto L_0x02d1
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x02d1
            java.util.ArrayList<android.view.View> r0 = r10.f55771L1
            if (r0 == 0) goto L_0x0182
            java.util.ArrayList<android.widget.ImageView> r4 = r10.f55772M1
            if (r4 != 0) goto L_0x016a
            goto L_0x0182
        L_0x016a:
            int r0 = r0.size()
            java.util.ArrayList<android.widget.ImageView> r4 = r10.f55772M1
            int r4 = r4.size()
            r5 = 3
            if (r0 != r5) goto L_0x017c
            if (r0 == r4) goto L_0x017a
            goto L_0x017c
        L_0x017a:
            r0 = 1
            goto L_0x0188
        L_0x017c:
            java.lang.String r0 = "friend avatar size illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x0187
        L_0x0182:
            java.lang.String r0 = "friend avatar is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
        L_0x0187:
            r0 = 0
        L_0x0188:
            if (r0 == 0) goto L_0x02d1
            r7 = 8
            r10.mo96250V(r7)
            r10.mo101934R(r7)
            r10.mo101932N(r7)
            r10.mo101933P(r7)
            r10.mo101940Z(r14)
            java.util.ArrayList<android.view.View> r0 = r10.f55771L1
            if (r0 != 0) goto L_0x01a0
            goto L_0x01fe
        L_0x01a0:
            int r0 = r0.size()
            r4 = 0
        L_0x01a5:
            if (r4 >= r0) goto L_0x01fe
            java.util.ArrayList<android.view.View> r5 = r10.f55771L1
            java.lang.Object r5 = r5.get(r4)
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x01fb
            int r6 = r5.getVisibility()
            if (r6 == 0) goto L_0x01b8
            goto L_0x01fb
        L_0x01b8:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r9)
            java.lang.Object[] r32 = r6.mo10232b()
            java.lang.String r33 = "com/tencent/mm/ui/FinderIconViewTipPreference"
            java.lang.String r34 = "resetFriendAvatarState"
            java.lang.String r35 = "()V"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            r31 = r5
            j20.C117292a.m165358d(r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.Object r6 = r6.mo10231a(r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r25 = "com/tencent/mm/ui/FinderIconViewTipPreference"
            java.lang.String r26 = "resetFriendAvatarState"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r24 = r5
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x01fb:
            int r4 = r4 + 1
            goto L_0x01a5
        L_0x01fe:
            java.util.LinkedList<java.lang.String> r0 = r11.f354438g
            int r4 = r0.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "url size = "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            r5 = 3
            int r4 = java.lang.Math.min(r4, r5)
            r5 = 0
        L_0x021f:
            if (r4 <= 0) goto L_0x02be
            int r4 = r4 + -1
            java.util.ArrayList<android.view.View> r6 = r10.f55771L1
            java.lang.Object r6 = r6.get(r4)
            android.view.View r6 = (android.view.View) r6
            java.util.ArrayList<android.widget.ImageView> r9 = r10.f55772M1
            java.lang.Object r9 = r9.get(r4)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            bl3.r r13 = bl3.C39818r.f106831a
            bl3.r$a r7 = r13.mo62446e(r15)
            r14 = r16
            bl3.c r7 = r7.mo62447c(r14)
            pl1.s0 r7 = (pl1.C11990s0) r7
            k60.d r7 = r7.mo11872i2()
            di3.d r16 = di3.C86312j.m106911c(r3)
            r40 = r4
            r4 = r16
            pl1.t0 r4 = (pl1.C62368t0) r4
            int r16 = r5 + 1
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            pl1.g0 r4 = r4.Rt0(r5, r2)
            bl3.r$a r5 = r13.mo62446e(r15)
            bl3.c r5 = r5.mo62447c(r14)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r5 = r5.mo11867O2(r1)
            r7.mo85957c(r4, r9, r5)
            if (r6 == 0) goto L_0x02b3
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r5 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r7)
            java.lang.Object[] r32 = r4.mo10232b()
            java.lang.String r33 = "com/tencent/mm/ui/FinderIconViewTipPreference"
            java.lang.String r34 = "bindAvatarsTask"
            java.lang.String r35 = "(Lcom/tencent/mm/protocal/protobuf/TipsInfo;)V"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            r31 = r6
            j20.C117292a.m165358d(r31, r32, r33, r34, r35, r36, r37, r38)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6.setVisibility(r4)
            java.lang.String r25 = "com/tencent/mm/ui/FinderIconViewTipPreference"
            java.lang.String r26 = "bindAvatarsTask"
            java.lang.String r27 = "(Lcom/tencent/mm/protocal/protobuf/TipsInfo;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r24 = r6
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x02b3:
            r4 = r40
            r5 = r16
            r7 = 8
            r16 = r14
            r14 = 0
            goto L_0x021f
        L_0x02be:
            android.widget.ImageView r0 = r10.f55765F1
            r1 = 0
            r10.mo25953H0(r0, r1)
            android.view.View r0 = r10.f55774O1
            r7 = 8
            r10.mo25953H0(r0, r7)
            android.view.ViewGroup r0 = r10.f55805w1
            r10.mo25953H0(r0, r1)
            goto L_0x02e7
        L_0x02d1:
            r7 = 8
            goto L_0x02e7
        L_0x02d4:
            r7 = 8
            r10.mo96250V(r7)
            r10.mo101937U(r7)
            r10.mo101934R(r7)
            r10.mo101936T(r7)
            android.view.ViewGroup r0 = r10.f55805w1
            r10.mo25953H0(r0, r7)
        L_0x02e7:
            r39.mo96253d0()
            goto L_0x0350
        L_0x02eb:
            r14 = r16
            r8 = r31
            r4 = 6
            r7 = 8
            if (r0 != r4) goto L_0x0338
            r4 = 0
            r10.mo25965k0(r4)
            r10.mo96250V(r7)
            r10.mo101937U(r7)
            r10.mo101934R(r7)
            r10.mo101936T(r7)
            r10.mo101940Z(r4)
            android.widget.TextView r0 = r10.f55773N1
            r10.mo25953H0(r0, r7)
            if (r9 == 0) goto L_0x031e
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r0 = 0
            r1 = r39
            r2 = r41
            r9 = 8
            r7 = r0
            r1.mo25959g0(r2, r3, r4, r5, r6, r7)
            goto L_0x0325
        L_0x031e:
            r9 = 8
            android.view.ViewGroup r0 = r10.f55805w1
            r10.mo25953H0(r0, r9)
        L_0x0325:
            java.lang.String r0 = r11.f354436e
            if (r0 == 0) goto L_0x032f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0334
        L_0x032f:
            android.widget.ImageView r0 = r10.f55766G1
            r10.mo25953H0(r0, r9)
        L_0x0334:
            r39.mo96253d0()
            goto L_0x0350
        L_0x0338:
            r4 = 7
            if (r0 != r4) goto L_0x0353
            r4 = 0
            r10.mo25965k0(r4)
            r4 = 1
            r6 = 0
            r0 = 0
            r1 = r39
            r2 = r40
            r3 = r41
            r5 = r18
            r9 = 8
            r7 = r0
            r1.mo25957f0(r2, r3, r4, r5, r6, r7)
        L_0x0350:
            r14 = r8
            goto L_0x00ec
        L_0x0353:
            r4 = 10
            if (r0 != r4) goto L_0x037b
            r4 = 0
            r10.mo25965k0(r4)
            r4 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r45)
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r1 = r39
            r2 = r40
            r3 = r41
            r5 = r18
            r6 = r44
            r13 = 8
            r7 = r0
            r9 = r8
            r8 = r14
            r14 = r9
            r9 = r46
            r1.mo25961h0(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0377:
            r9 = r14
            r8 = 2
            goto L_0x0720
        L_0x037b:
            r7 = r8
            r8 = 8
            r4 = 11
            if (r0 < r4) goto L_0x06c5
            r5 = 12
            if (r0 > r5) goto L_0x06c5
            r5 = 0
            r10.mo25965k0(r5)
            if (r0 != r4) goto L_0x038e
            r4 = 1
            goto L_0x038f
        L_0x038e:
            r4 = 0
        L_0x038f:
            r10.mo96250V(r8)
            r10.mo101937U(r8)
            r10.mo101934R(r8)
            r10.mo101936T(r8)
            r10.mo101940Z(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r10.f55767H1
            r10.mo25953H0(r0, r8)
            android.widget.RelativeLayout r0 = r10.f55792g2
            r10.mo25953H0(r0, r8)
            if (r9 == 0) goto L_0x06a6
            android.view.View r0 = r10.f55774O1
            if (r0 != 0) goto L_0x03b1
            r8 = 2
            goto L_0x06ae
        L_0x03b1:
            r10.mo25953H0(r0, r5)
            android.widget.ImageView r0 = r10.f55766G1
            r10.mo25953H0(r0, r8)
            java.util.LinkedList<java.lang.String> r0 = r11.f354438g
            java.util.Iterator r0 = r0.iterator()
        L_0x03bf:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x03e2
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "bindMultiAvatarTask url:"
            r6.append(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            r8 = 8
            goto L_0x03bf
        L_0x03e2:
            boolean r0 = r39.mo25947A0()
            if (r0 != 0) goto L_0x03f4
            java.util.LinkedList<java.lang.String> r0 = r11.f354438g
            int r0 = r0.size()
            r5 = 1
            if (r0 <= r5) goto L_0x03f4
            r10.mo25950D0(r11, r5)
        L_0x03f4:
            java.util.LinkedList<java.lang.String> r0 = r11.f354438g
            int r0 = r0.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "bindMultiAvatarTask urlSize:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            if (r0 <= 0) goto L_0x05aa
            r5 = 3
            if (r0 >= r5) goto L_0x0415
            r5 = r0
            goto L_0x0416
        L_0x0415:
            r5 = 3
        L_0x0416:
            r8 = 0
        L_0x0417:
            if (r8 >= r5) goto L_0x053b
            android.widget.ImageView r0 = r10.mo25971q0(r8)
            if (r0 == 0) goto L_0x052e
            r6 = 0
            r10.mo25953H0(r0, r6)
            java.lang.String r6 = "avatar/default_nor_avatar.png"
            if (r4 == 0) goto L_0x04aa
            r16 = r5
            java.util.LinkedList<java.lang.String> r5 = r11.f354438g
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r17 != 0) goto L_0x0473
            r9 = 1
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r9 = 0
            r6[r9] = r5
            java.lang.String r9 = "[setWxAvatar] set=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r6)
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r9 = r6.mo62446e(r15)
            bl3.c r9 = r9.mo62447c(r14)
            pl1.s0 r9 = (pl1.C11990s0) r9
            k60.d r9 = r9.mo11865K1()
            di3.d r17 = di3.C86312j.m106911c(r3)
            r12 = r17
            pl1.t0 r12 = (pl1.C62368t0) r12
            pl1.g0 r5 = r12.Rt0(r5, r2)
            pl1.e0$a r12 = pl1.C11978e0.C11979a.WX_AVATAR
            bl3.r$a r6 = r6.mo62446e(r15)
            bl3.c r6 = r6.mo62447c(r14)
            pl1.s0 r6 = (pl1.C11990s0) r6
            n60.f r6 = r6.mo11867O2(r12)
            r9.mo85957c(r5, r0, r6)
            goto L_0x0530
        L_0x0473:
            android.content.Context r5 = r10.f55804v1     // Catch:{ IOException -> 0x048a }
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch:{ IOException -> 0x048a }
            java.io.InputStream r5 = r5.open(r6)     // Catch:{ IOException -> 0x048a }
            r6 = 0
            float r9 = kg3.C76577a.m92156g(r6)     // Catch:{ IOException -> 0x048a }
            android.graphics.Bitmap r5 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.decodeStream(r5, r9)     // Catch:{ IOException -> 0x048a }
            r0.setImageBitmap(r5)     // Catch:{ IOException -> 0x048a }
            goto L_0x04a3
        L_0x048a:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[setWxAvatar] e:"
            r5.append(r6)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
        L_0x04a3:
            java.lang.String r0 = "[setWxAvatar] url is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x0530
        L_0x04aa:
            r16 = r5
            java.util.LinkedList<java.lang.String> r5 = r11.f354438g
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r9 != 0) goto L_0x04f5
            r9 = 1
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r9 = 0
            r6[r9] = r5
            java.lang.String r9 = "[setOvalAvatar] load=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r6)
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r9 = r6.mo62446e(r15)
            bl3.c r9 = r9.mo62447c(r14)
            pl1.s0 r9 = (pl1.C11990s0) r9
            k60.d r9 = r9.mo11872i2()
            di3.d r12 = di3.C86312j.m106911c(r3)
            pl1.t0 r12 = (pl1.C62368t0) r12
            pl1.g0 r5 = r12.Rt0(r5, r2)
            bl3.r$a r6 = r6.mo62446e(r15)
            bl3.c r6 = r6.mo62447c(r14)
            pl1.s0 r6 = (pl1.C11990s0) r6
            n60.f r6 = r6.mo11867O2(r1)
            r9.mo85957c(r5, r0, r6)
            r5 = 0
            r0.setVisibility(r5)
            goto L_0x0530
        L_0x04f5:
            android.content.Context r5 = r10.f55804v1     // Catch:{ IOException -> 0x050e }
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch:{ IOException -> 0x050e }
            java.io.InputStream r5 = r5.open(r6)     // Catch:{ IOException -> 0x050e }
            r6 = 0
            float r9 = kg3.C76577a.m92156g(r6)     // Catch:{ IOException -> 0x050c }
            android.graphics.Bitmap r5 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.decodeStream(r5, r9)     // Catch:{ IOException -> 0x050c }
            r0.setImageBitmap(r5)     // Catch:{ IOException -> 0x050c }
            goto L_0x0528
        L_0x050c:
            r0 = move-exception
            goto L_0x0510
        L_0x050e:
            r0 = move-exception
            r6 = 0
        L_0x0510:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "[setOvalAvatar] e:"
            r5.append(r9)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
        L_0x0528:
            java.lang.String r0 = "[setOvalAvatar] tipsInfo.url is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x0531
        L_0x052e:
            r16 = r5
        L_0x0530:
            r6 = 0
        L_0x0531:
            int r8 = r8 + 1
            r9 = r40
            r12 = r43
            r5 = r16
            goto L_0x0417
        L_0x053b:
            r16 = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bindMultiAvatarTask load avatar: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " isSquare:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r0 = r8
        L_0x055a:
            r2 = 3
            if (r0 >= r2) goto L_0x056b
            android.widget.ImageView r2 = r10.mo25971q0(r0)
            if (r2 == 0) goto L_0x0568
            r3 = 8
            r10.mo25953H0(r2, r3)
        L_0x0568:
            int r0 = r0 + 1
            goto L_0x055a
        L_0x056b:
            r10.mo25950D0(r11, r8)
            if (r13 != 0) goto L_0x058c
            int r0 = r8 + -1
            if (r0 <= 0) goto L_0x058c
            java.lang.String r2 = "bindMultiAvatarTask adjust avatarView marginEnd"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            android.widget.ImageView r0 = r10.mo25971q0(r0)
            if (r0 == 0) goto L_0x058c
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r3 = 0
            r2.setMarginEnd(r3)
            r0.setLayoutParams(r2)
        L_0x058c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "bindMultiAvatarTask dismiss avatar: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r4 = r16
            r1 = 1
            goto L_0x05ac
        L_0x05aa:
            r1 = 1
            r4 = 3
        L_0x05ac:
            if (r4 != r1) goto L_0x05bd
            if (r18 == 0) goto L_0x05bd
            boolean r0 = r10.mo25979y0(r11)
            if (r0 != 0) goto L_0x05bd
            android.widget.ImageView r0 = r10.f55778S1
            r1 = 0
            r10.mo25953H0(r0, r1)
            goto L_0x05c4
        L_0x05bd:
            android.widget.ImageView r0 = r10.f55778S1
            r1 = 8
            r10.mo25953H0(r0, r1)
        L_0x05c4:
            int r0 = r11.f354445q
            r8 = 2
            if (r0 != r8) goto L_0x05cb
            r1 = 1
            goto L_0x05cc
        L_0x05cb:
            r1 = 0
        L_0x05cc:
            r2 = 1
            if (r0 != r2) goto L_0x05d1
            r0 = 1
            goto L_0x05d2
        L_0x05d1:
            r0 = 0
        L_0x05d2:
            if (r4 != r2) goto L_0x05dc
            if (r1 == 0) goto L_0x05dc
            android.widget.ImageView r1 = r10.f55778S1
            r2 = 0
            r10.mo25953H0(r1, r2)
        L_0x05dc:
            if (r0 == 0) goto L_0x05e5
            android.widget.ImageView r0 = r10.f55778S1
            r1 = 8
            r10.mo25953H0(r0, r1)
        L_0x05e5:
            java.lang.String r0 = r11.f354436e
            android.widget.TextView r1 = r10.f55769J1
            if (r13 == 0) goto L_0x05ed
            android.widget.TextView r1 = r10.f55768I1
        L_0x05ed:
            er1.r3 r2 = er1.C7865r3.f26468a
            int r2 = r2.mo8970c()
            android.widget.TextView r3 = r10.f55769J1
            android.content.res.Resources r3 = r3.getResources()
            android.view.View r5 = r10.f201747m1
            r6 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.text.TextPaint r5 = r5.getPaint()
            java.lang.CharSequence r6 = r10.f121279i
            java.lang.String r6 = r6.toString()
            float r5 = r5.measureText(r6)
            int r5 = (int) r5
            r6 = 2131165299(0x7f070073, float:1.7944811E38)
            float r6 = r3.getDimension(r6)
            int r6 = (int) r6
            if (r13 == 0) goto L_0x0625
            r6 = 2131166440(0x7f0704e8, float:1.7947125E38)
            float r6 = r3.getDimension(r6)
            int r6 = (int) r6
        L_0x0625:
            int r9 = r39.mo25966l0()
            int r2 = r2 - r6
            int r2 = r2 - r5
            int r2 = r2 - r9
            r5 = 2131165348(0x7f0700a4, float:1.794491E38)
            float r3 = r3.getDimension(r5)
            float r5 = (float) r4
            float r3 = r3 * r5
            int r3 = (int) r3
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x065d
            android.text.TextPaint r1 = r1.getPaint()
            int r2 = r2 - r3
            float r2 = (float) r2
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r0, r1, r2, r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "…"
            boolean r1 = r0.endsWith(r1)
            if (r1 != 0) goto L_0x065f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0661
            goto L_0x065f
        L_0x065d:
            if (r3 <= r2) goto L_0x0661
        L_0x065f:
            r0 = 1
            goto L_0x0662
        L_0x0661:
            r0 = 0
        L_0x0662:
            if (r0 == 0) goto L_0x0689
            r1 = 1
            if (r4 <= r1) goto L_0x0689
            r1 = 1
            r2 = 3
        L_0x0669:
            if (r1 >= r2) goto L_0x0679
            android.widget.ImageView r3 = r10.mo25971q0(r1)
            if (r3 == 0) goto L_0x0676
            r5 = 8
            r10.mo25953H0(r3, r5)
        L_0x0676:
            int r1 = r1 + 1
            goto L_0x0669
        L_0x0679:
            r1 = 1
            r10.mo25950D0(r11, r1)
            boolean r1 = r10.mo25979y0(r11)
            if (r1 != 0) goto L_0x0689
            android.widget.ImageView r1 = r10.f55778S1
            r2 = 0
            r10.mo25953H0(r1, r2)
        L_0x0689:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isAdjust :"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "  maxAvatars:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x06ae
        L_0x06a6:
            r8 = 2
            android.view.ViewGroup r0 = r10.f55805w1
            r1 = 8
            r10.mo25953H0(r0, r1)
        L_0x06ae:
            r39.mo96253d0()
            r4 = 0
            r6 = 1
            r1 = r39
            r2 = r40
            r3 = r41
            r5 = r18
            r9 = r7
            r7 = r44
            r1.mo25957f0(r2, r3, r4, r5, r6, r7)
            r39.mo25964j0(r40, r41)
            goto L_0x0720
        L_0x06c5:
            r9 = r7
            r8 = 2
            r1 = 14
            if (r0 != r1) goto L_0x06e1
            r1 = 0
            r10.mo25965k0(r1)
            r4 = 0
            r6 = 0
            r7 = 0
            r1 = r39
            r2 = r40
            r3 = r41
            r5 = r18
            r1.mo25957f0(r2, r3, r4, r5, r6, r7)
            r39.mo25964j0(r40, r41)
            goto L_0x0720
        L_0x06e1:
            r1 = 15
            if (r0 != r1) goto L_0x0720
            r1 = 0
            r10.mo25965k0(r1)
            android.view.ViewGroup r0 = r10.f55805w1
            r10.mo25953H0(r0, r1)
            r2 = 8
            r10.mo96250V(r2)
            r10.mo101937U(r2)
            r10.mo101934R(r2)
            r10.mo101940Z(r1)
            android.widget.ImageView r0 = r10.f55766G1
            r10.mo25953H0(r0, r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r10.f55767H1
            r10.mo25953H0(r0, r2)
            android.widget.ImageView r0 = r10.f55770K1
            r10.mo25953H0(r0, r2)
            android.view.ViewGroup r0 = r10.f55805w1
            r1 = 2131304593(0x7f092091, float:1.8227333E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = 4
            r10.mo25953H0(r0, r1)
            android.view.View r0 = r10.f55774O1
            r10.mo25953H0(r0, r2)
            r39.mo96253d0()
        L_0x0720:
            if (r43 == 0) goto L_0x0730
            boolean r0 = r10.mo25979y0(r11)
            if (r0 == 0) goto L_0x072e
            boolean r0 = r39.mo25947A0()
            if (r0 != 0) goto L_0x0730
        L_0x072e:
            r0 = 1
            goto L_0x0731
        L_0x0730:
            r0 = 0
        L_0x0731:
            r10.f55785Z1 = r0
            if (r0 != 0) goto L_0x073f
            android.widget.ImageView r0 = r10.f55765F1
            r1 = 8
            r10.mo25953H0(r0, r1)
            r10.mo101933P(r1)
        L_0x073f:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            boolean r1 = r10.f55785Z1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r18)
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "showFinderAvatars mWithRedDot:%s  withRedDot:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r0)
            r1 = r47
            r10.mo25975u0(r1)
            int r0 = r39.mo25969o0()
            if (r0 != r8) goto L_0x0764
            r8 = 1
            goto L_0x0765
        L_0x0764:
            r8 = 0
        L_0x0765:
            if (r8 == 0) goto L_0x07ac
            java.lang.String r0 = "showFinderAvatars return for checkIsDrop"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            java.lang.String r0 = r39.mo25973s0()
            di3.d r1 = di3.C86312j.m106911c(r15)
            ht1.t1 r1 = (ht1.C60200t1) r1
            ht1.b4 r1 = r1.Nt0()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r1 = r1.mo77227G5(r0)
            if (r1 == 0) goto L_0x07ac
            java.lang.Class<ht1.e4> r2 = ht1.C60165e4.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            r16 = r2
            ht1.e4 r16 = (ht1.C60165e4) r16
            te3.xi1 r2 = r1.field_ctrInfo
            java.lang.String r3 = r11.f354436e
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r4 = r1.mo77309p2()
            long r4 = r4.object_id
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r1 = r1.mo77309p2()
            java.lang.String r1 = r1.report_ext_info
            r23 = 1
            r24 = 1
            r17 = r0
            r18 = r2
            r19 = r3
            r20 = r4
            r22 = r1
            r16.un0(r17, r18, r19, r20, r22, r23, r24)
        L_0x07ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.FinderIconViewTipPreference.mo25955J0(boolean, te3.tg4, int, boolean, boolean, boolean, boolean, int):void");
    }

    /* renamed from: f */
    public boolean mo25956f(boolean z) {
        if (z) {
            mo25967m0();
        } else {
            mo25965k0(true);
        }
        this.f55781V1 = 8;
        super.mo25956f(z);
        return true;
    }

    /* renamed from: f0 */
    public final void mo25957f0(boolean z, tg4 tg4, boolean z2, boolean z3, boolean z4, boolean z5) {
        mo96250V(8);
        mo101937U(8);
        mo101934R(8);
        mo101936T(8);
        mo25953H0(this.f55773N1, 8);
        mo101940Z(false);
        if (z) {
            mo25959g0(tg4, true, z2, z3, z4, z5);
        } else {
            mo25953H0(this.f55805w1, 8);
        }
        mo96253d0();
    }

    /* renamed from: g */
    public boolean mo25958g(boolean z, tg4 tg4) {
        mo25967m0();
        Log.m105925i("FinderIconViewTipPreference", "showCounter() show:%s", Boolean.valueOf(z));
        if (z) {
            mo101936T(0);
            String str = tg4.f354435d + "";
            int i = tg4.f354435d;
            if (i > 999) {
                str = "· · ·";
            }
            mo101941a0(str, C45081s1.m49933b(this.f121274d, i));
        } else {
            mo96250V(8);
            mo101937U(8);
            mo101934R(8);
            mo101936T(8);
        }
        this.f55782W1 = z;
        this.f55781V1 = 9;
        this.f55784Y1 = tg4;
        mo96253d0();
        return true;
    }

    /* renamed from: g0 */
    public final void mo25959g0(tg4 tg4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C20609s sVar;
        tg4 tg42 = tg4;
        boolean z6 = z5;
        boolean z7 = true;
        if (z) {
            TextView textView = this.f55769J1;
            if (textView != null) {
                textView.setMaxLines(2);
                this.f55769J1.setMaxWidth((int) (((double) C7865r3.f26468a.mo8970c()) * 0.4d));
            }
        } else {
            this.f55769J1.setMaxLines(1);
            this.f55769J1.setMaxWidth(C7865r3.f26468a.mo8970c());
        }
        mo25953H0(this.f55769J1, 8);
        if (z6) {
            mo25953H0(this.f55779T1.getView(), 8);
            mo25953H0(this.f55780U1.getView(), 0);
        } else {
            mo25953H0(this.f55779T1.getView(), 0);
            mo25953H0(this.f55780U1.getView(), 8);
        }
        mo25953H0(this.f55766G1, 8);
        mo25953H0(this.f55768I1, 8);
        mo25953H0(this.f55767H1, 8);
        if (!z4) {
            mo25953H0(this.f55792g2, 8);
            mo25953H0(this.f55774O1, 8);
        }
        mo25953H0(this.f55773N1, 8);
        C20609s sVar2 = this.f55779T1;
        if (z6) {
            sVar2 = this.f55780U1;
        }
        C20609s sVar3 = sVar2;
        String str = tg42.f354446r;
        if (C85875k4.m106211z()) {
            str = tg42.f354447s;
        }
        if (Util.isNullOrNil(str)) {
            str = tg42.f354440i;
        }
        int n0 = mo25968n0(str);
        if (sVar3 == null) {
            return;
        }
        if (!TextUtils.isEmpty(tg42.f354439h) || !TextUtils.isEmpty(tg42.f354441j)) {
            C20609s sVar4 = sVar3;
            sVar4.mo32263a(mo25972r0(tg42, z6, true, true), tg42.f354436e, tg42.f354439h, C0966R.dimen.f3964lm, mo25968n0(tg42.f354440i), n0, tg42.f354441j, !z6);
            if (sVar3.getDropStat() != 1 || !mo25979y0(tg4)) {
                sVar = sVar3;
                mo25976v0(sVar);
                z7 = false;
            } else {
                tg42.f354439h = "";
                tg42.f354441j = "";
                sVar = sVar3;
                mo25959g0(tg4, z, !z4, this.f55786a2, z4, z5);
            }
            Log.m105924i("FinderIconViewTipPreference", "getDropStat:" + mo25969o0() + " checkResult:" + z7);
            if (!z7) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.getView().getLayoutParams();
                marginLayoutParams.setMarginEnd(0);
                sVar.getView().setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        if (z2) {
            mo25953H0(this.f55766G1, 0);
        }
        if (z3) {
            View view = this.f55774O1;
            if (view == null || view.getVisibility() != 0) {
                mo25953H0(this.f55770K1, 0);
            } else {
                mo25953H0(this.f55778S1, 0);
            }
        }
        sVar3.mo32263a(mo25972r0(tg42, z6, true, true), tg42.f354436e, "", C0966R.dimen.f3964lm, mo25968n0(tg42.f354440i), n0, "", !z6);
        mo25976v0(sVar3);
    }

    /* renamed from: h */
    public boolean mo25960h(boolean z) {
        mo25967m0();
        this.f55781V1 = 8;
        if (z) {
            mo96250V(4);
        }
        super.mo25960h(z);
        return true;
    }

    /* renamed from: h0 */
    public final void mo25961h0(boolean z, tg4 tg4, boolean z2, boolean z3, boolean z4, Boolean bool, Boolean bool2, boolean z5) {
        tg4 tg42 = tg4;
        mo96250V(8);
        mo101937U(8);
        mo101934R(8);
        mo101936T(8);
        mo101940Z(false);
        mo25953H0(this.f55767H1, 8);
        mo25953H0(this.f55774O1, 8);
        if (z) {
            boolean booleanValue = bool.booleanValue();
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            if (!(this.f55761B1 == null || this.f55806x1 == null)) {
                mo25953H0(this.f55792g2, 0);
                mo25953H0(this.f55766G1, 8);
                boolean z6 = true;
                if (z2) {
                    ViewGroup.LayoutParams layoutParams = this.f55761B1.getLayoutParams();
                    if (bool2.booleanValue()) {
                        int dimension = (int) this.f55761B1.getContext().getResources().getDimension(C0966R.dimen.a6v);
                        layoutParams.width = dimension;
                        layoutParams.height = dimension;
                        int dimensionPixelOffset = this.f55761B1.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv);
                        this.f55761B1.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                        ViewGroup.LayoutParams layoutParams2 = this.f55806x1.getLayoutParams();
                        if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                            ((RelativeLayout.LayoutParams) layoutParams2).rightMargin = this.f55761B1.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.a65) + 1;
                        }
                        TextView textView = this.f55769J1;
                        if (textView != null) {
                            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                            if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                                ((LinearLayout.LayoutParams) layoutParams3).rightMargin = this.f55761B1.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv) + this.f55761B1.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.a65) + 1;
                            }
                        }
                        this.f55761B1.setBackground(this.f55761B1.getContext().getResources().getDrawable(C0966R.C0969drawable.f5026uj));
                    } else {
                        int dimension2 = (int) this.f55761B1.getContext().getResources().getDimension(C0966R.dimen.f3749d0);
                        layoutParams.width = dimension2;
                        layoutParams.height = dimension2;
                        this.f55761B1.setPadding(0, 0, 0, 0);
                        ViewGroup.LayoutParams layoutParams4 = this.f55806x1.getLayoutParams();
                        if (layoutParams4 instanceof RelativeLayout.LayoutParams) {
                            ((RelativeLayout.LayoutParams) layoutParams4).rightMargin = this.f55761B1.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv) + 1;
                        }
                        TextView textView2 = this.f55769J1;
                        if (textView2 != null) {
                            ViewGroup.LayoutParams layoutParams5 = textView2.getLayoutParams();
                            if (layoutParams5 instanceof LinearLayout.LayoutParams) {
                                ((LinearLayout.LayoutParams) layoutParams5).rightMargin = this.f55761B1.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
                            }
                        }
                        this.f55761B1.setBackground((Drawable) null);
                    }
                    this.f55761B1.setLayoutParams(layoutParams);
                } else {
                    ViewGroup.LayoutParams layoutParams6 = this.f55761B1.getLayoutParams();
                    int dimension3 = (int) this.f55761B1.getContext().getResources().getDimension(C0966R.dimen.f3738cr);
                    layoutParams6.width = dimension3;
                    layoutParams6.height = dimension3;
                    this.f55761B1.setLayoutParams(layoutParams6);
                }
                if (!Util.isNullOrNil(tg42.f354437f)) {
                    Log.m105925i("FinderIconViewTipPreference", "[bindSingleAvatarTask] load=%s isBigAvatar=%s isWithRedDot=%s", tg42.f354437f, Boolean.valueOf(z2), Boolean.valueOf(z3));
                    C39818r rVar = C39818r.f106831a;
                    ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(((C62368t0) C86312j.m106911c(C62368t0.class)).Rt0(tg42.f354437f, C27696y.MEDIUM_AVATAR_IMAGE), this.f55761B1, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                    this.f55761B1.setVisibility(0);
                } else {
                    try {
                        this.f55761B1.setImageBitmap(BackwardSupportUtil.BitmapFactory.decodeStream(this.f55804v1.getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null)));
                    } catch (IOException e) {
                        Log.m105928w("FinderIconViewTipPreference", "[bindSingleAvatarTask] e:" + e.toString());
                    }
                    Log.m105928w("FinderIconViewTipPreference", "[bindSingleAvatarTask] tipsInfo.url is null.");
                }
                mo25953H0(this.f55806x1, 0);
                mo25953H0(this.f55807y1, 8);
                mo25953H0(this.f55762C1, 8);
                mo25953H0(this.f55770K1, 8);
                mo25953H0(this.f55805w1, 0);
                if (z3) {
                    mo25953H0(this.f55765F1, 0);
                    if (!booleanValue) {
                        ViewGroup.LayoutParams layoutParams7 = this.f55765F1.getLayoutParams();
                        layoutParams7.width = -2;
                        layoutParams7.height = -2;
                        this.f55765F1.setLayoutParams(layoutParams7);
                        this.f55765F1.setImageResource(C0966R.C0969drawable.az5);
                    } else if (bool2.booleanValue()) {
                        this.f55765F1.setVisibility(8);
                    } else {
                        ViewGroup.LayoutParams layoutParams8 = this.f55765F1.getLayoutParams();
                        int a = (int) (((float) C79406f.m96347a(this.f55765F1.getContext(), 11.1f)) * C76577a.m92165p(this.f121274d));
                        layoutParams8.width = a;
                        layoutParams8.height = a;
                        this.f55765F1.setLayoutParams(layoutParams8);
                        this.f55765F1.setImageResource(C0966R.raw.finder_live_icon);
                    }
                } else {
                    mo25953H0(this.f55765F1, 8);
                }
                int i = tg42.f354445q;
                boolean z7 = i == 2;
                if (i != 1) {
                    z6 = false;
                }
                if (z7) {
                    mo25953H0(this.f55765F1, 0);
                }
                if (z6) {
                    mo25953H0(this.f55765F1, 8);
                }
                mo25952G0(tg42, z4, z5);
            }
        } else {
            mo25953H0(this.f55805w1, 8);
        }
        mo96253d0();
    }

    /* renamed from: i */
    public boolean mo25962i(boolean z, tg4 tg4) {
        mo25967m0();
        this.f55781V1 = 8;
        super.mo25962i(z, tg4);
        return true;
    }

    /* renamed from: i0 */
    public final void mo25963i0(boolean z, tg4 tg4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        tg4 tg42 = tg4;
        mo96250V(8);
        mo101937U(8);
        mo101934R(8);
        mo101936T(8);
        mo101940Z(false);
        mo25953H0(this.f55767H1, 8);
        mo25953H0(this.f55773N1, 8);
        mo25953H0(this.f55774O1, 8);
        if (z) {
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            if (!(this.f55762C1 == null || this.f55807y1 == null)) {
                mo25953H0(this.f55792g2, 0);
                mo25953H0(this.f55766G1, 8);
                if (z2) {
                    ViewGroup.LayoutParams layoutParams = this.f55762C1.getLayoutParams();
                    int dimension = (int) this.f55762C1.getContext().getResources().getDimension(C0966R.dimen.f3749d0);
                    layoutParams.width = dimension;
                    layoutParams.height = dimension;
                    this.f55762C1.setLayoutParams(layoutParams);
                } else {
                    ViewGroup.LayoutParams layoutParams2 = this.f55762C1.getLayoutParams();
                    int dimension2 = (int) this.f55762C1.getContext().getResources().getDimension(C0966R.dimen.f3738cr);
                    layoutParams2.width = dimension2;
                    layoutParams2.height = dimension2;
                    this.f55762C1.setLayoutParams(layoutParams2);
                }
                if (!Util.isNullOrNil(tg42.f354437f)) {
                    Log.m105925i("FinderIconViewTipPreference", "[bindSingleSquareAvatarTask] load=%s isBigAvatar=%s isWithRedDot=%s", tg42.f354437f, Boolean.valueOf(z2), Boolean.valueOf(z3));
                    C39818r rVar = C39818r.f106831a;
                    ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1().mo85957c(((C62368t0) C86312j.m106911c(C62368t0.class)).Rt0(tg42.f354437f, C27696y.MEDIUM_AVATAR_IMAGE), this.f55762C1, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
                } else {
                    try {
                        this.f55762C1.setImageBitmap(BackwardSupportUtil.BitmapFactory.decodeStream(this.f55804v1.getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null)));
                    } catch (IOException e) {
                        Log.m105928w("FinderIconViewTipPreference", "[bindSingleSquareAvatarTask] e:" + e.toString());
                    }
                    Log.m105928w("FinderIconViewTipPreference", "[bindSingleSquareAvatarTask] tipsInfo.url is null.");
                }
                mo25953H0(this.f55806x1, 8);
                mo25953H0(this.f55807y1, 0);
                mo25953H0(this.f55762C1, 0);
                mo25953H0(this.f55765F1, 8);
                mo25953H0(this.f55805w1, 0);
                if (z3) {
                    mo25953H0(this.f55770K1, 0);
                    if (!z5) {
                        ViewGroup.LayoutParams layoutParams3 = this.f55770K1.getLayoutParams();
                        layoutParams3.width = -2;
                        layoutParams3.height = -2;
                        this.f55770K1.setLayoutParams(layoutParams3);
                        this.f55770K1.setImageResource(C0966R.C0969drawable.az5);
                    } else {
                        ViewGroup.LayoutParams layoutParams4 = this.f55765F1.getLayoutParams();
                        int a = (int) (((float) C79406f.m96347a(this.f55765F1.getContext(), 11.1f)) * C76577a.m92165p(this.f121274d));
                        layoutParams4.width = a;
                        layoutParams4.height = a;
                        this.f55770K1.setLayoutParams(layoutParams4);
                        this.f55770K1.setImageResource(C0966R.raw.finder_live_icon);
                    }
                } else {
                    mo25953H0(this.f55770K1, 8);
                }
                int i = tg42.f354445q;
                boolean z7 = i == 2;
                boolean z8 = i == 1;
                if (z7) {
                    this.f55786a2 = true;
                    mo25953H0(this.f55770K1, 0);
                }
                if (z8) {
                    this.f55786a2 = false;
                    mo25953H0(this.f55770K1, 8);
                }
                mo25952G0(tg4, z4, z6);
            }
        } else {
            mo25953H0(this.f55805w1, 8);
        }
        mo96253d0();
    }

    /* renamed from: j0 */
    public final void mo25964j0(boolean z, tg4 tg4) {
        mo96250V(8);
        mo101937U(8);
        mo101934R(8);
        mo101936T(8);
        mo101940Z(false);
        if (this.f55773N1 == null || !z || Util.isNullOrNil(tg4.f354444p)) {
            mo25953H0(this.f55773N1, 8);
        } else {
            C85875k4.m106189j0(this.f55773N1.getPaint(), 0.8f);
            this.f55773N1.setText(tg4.f354444p);
            this.f55773N1.setBackgroundResource(C0966R.C0969drawable.ake);
            mo25953H0(this.f55773N1, 0);
        }
        mo96253d0();
    }

    /* renamed from: k0 */
    public final void mo25965k0(boolean z) {
        Log.m105924i("FinderIconViewTipPreference", "changeContentLayoutParam :" + z);
        View view = this.f201747m1;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(C0966R.C0970id.br8);
            if (z) {
                viewGroup.setLayoutParams(this.f55798m2);
                this.f55794i2.setLayoutParams(this.f55796k2);
                mo25953H0(this.f55795j2, 8);
                mo25953H0(this.f55793h2, 0);
            } else {
                viewGroup.setLayoutParams(this.f55799n2);
                this.f55794i2.setLayoutParams(this.f55797l2);
                mo25953H0(this.f55795j2, 0);
                mo25953H0(this.f55805w1, 0);
                mo25953H0(this.f55793h2, 8);
                ViewGroup viewGroup2 = this.f55805w1;
                if (viewGroup2 != null) {
                    mo25953H0(viewGroup2.findViewById(C0966R.C0970id.e4g), 0);
                }
                Log.m105924i("FinderIconViewTipPreference", "changeContentLayoutParam mThirdLayoutContainer:" + this.f55795j2);
            }
            this.f55795j2.requestLayout();
        }
    }

    /* renamed from: l0 */
    public final int mo25966l0() {
        Class cls = C76243a5.class;
        int i = this.f55783X1;
        if (i <= 0) {
            return 0;
        }
        String str = i + "";
        if (i > 999) {
            str = "· · ·";
        }
        int zm = ((C76243a5) C86312j.m106911c(cls)).mo13249zm(this.f201747m1.getContext(), this.f55783X1);
        if (this.f55783X1 >= 10) {
            zm = ((int) this.f215072Y0.getPaint().measureText(str)) + ((C76243a5) C86312j.m106911c(cls)).mo13249zm(this.f201747m1.getContext(), this.f55783X1);
        }
        Log.m105924i("FinderIconViewTipPreference", "countWidth :" + zm + " mRedDotCount:" + this.f55783X1);
        return zm;
    }

    /* renamed from: m0 */
    public final void mo25967m0() {
        Log.m105924i("FinderIconViewTipPreference", "dismissWidgetFrame");
        mo25953H0(this.f55805w1, 8);
    }

    /* renamed from: n0 */
    public final int mo25968n0(String str) {
        int i;
        int i2 = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (!str.startsWith("#")) {
            str = "#" + str;
        }
        try {
            if (str.length() == 9) {
                i = Color.parseColor(str.charAt(0) + str.substring(7, 9) + str.substring(1, 7));
            } else {
                i = Color.parseColor(str);
            }
            i2 = i;
        } catch (Exception e) {
            Log.printErrStackTrace("FinderIconViewTipPreference", e, "getColor", new Object[0]);
        }
        Log.m105924i("FinderIconViewTipPreference", "getColor  color:" + str + " colorInt:" + i2);
        return i2;
    }

    /* renamed from: o0 */
    public int mo25969o0() {
        C20609s sVar = this.f55779T1;
        if (sVar != null && sVar.getView().getVisibility() == 0) {
            return this.f55779T1.getDropStat();
        }
        C20609s sVar2 = this.f55780U1;
        if (sVar2 == null || sVar2.getView().getVisibility() != 0) {
            return 0;
        }
        return this.f55780U1.getDropStat();
    }

    /* renamed from: p0 */
    public C60165e4.C46105a mo25970p0() {
        C18747a aVar = this.f55790e2;
        return aVar != null ? aVar.mo23617b() : new C60165e4.C46105a();
    }

    /* renamed from: q0 */
    public final ImageView mo25971q0(int i) {
        if (i == 0) {
            return this.f55775P1;
        }
        if (i == 1) {
            return this.f55776Q1;
        }
        if (i != 2) {
            return null;
        }
        return this.f55777R1;
    }

    /* renamed from: r0 */
    public final int mo25972r0(tg4 tg4, boolean z, boolean z2, boolean z3) {
        TextView textView;
        View view;
        View view2;
        Resources resources = this.f55769J1.getResources();
        tg4.f354438g.size();
        int dimension = (int) resources.getDimension(C0966R.dimen.f3750d1);
        RelativeLayout relativeLayout = this.f55792g2;
        int i = 0;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0 && (((view = this.f55806x1) != null && view.getVisibility() == 0) || ((view2 = this.f55807y1) != null && view2.getVisibility() == 0))) {
            i = 0 + dimension;
        }
        View view3 = this.f55774O1;
        if (view3 != null && view3.getVisibility() == 0) {
            ImageView imageView = this.f55775P1;
            if (imageView != null && imageView.getVisibility() == 0) {
                i += dimension;
            }
            ImageView imageView2 = this.f55776Q1;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                i += dimension;
            }
            ImageView imageView3 = this.f55777R1;
            if (imageView3 != null && imageView3.getVisibility() == 0) {
                i += dimension;
            }
        }
        ImageView imageView4 = this.f55766G1;
        if (imageView4 != null && imageView4.getVisibility() == 0) {
            i += (int) resources.getDimension(C0966R.dimen.f3766df);
        }
        WeImageView weImageView = this.f55767H1;
        if (weImageView != null && weImageView.getVisibility() == 0) {
            i += (int) resources.getDimension(C0966R.dimen.f3738cr);
        }
        int c = C7865r3.f26468a.mo8970c();
        TextView textView2 = (TextView) this.f201747m1.findViewById(16908310);
        int measureText = (int) textView2.getPaint().measureText(this.f121279i.toString());
        int dimension2 = (int) resources.getDimension(C0966R.dimen.f3718c_);
        TextView textView3 = this.f55768I1;
        if ((textView3 != null && textView3.getVisibility() == 0) || ((textView = this.f55773N1) != null && textView.getVisibility() == 0)) {
            dimension2 = (int) resources.getDimension(C0966R.dimen.f3717c9);
        }
        int l0 = mo25966l0();
        int i2 = (((c - dimension2) - measureText) - i) - l0;
        Log.m105924i("FinderIconViewTipPreference", "getNewLeftTitleMaxWidth availableWidth :" + i2 + " titleTv:" + textView2 + " countRedDotWidth:" + l0);
        return i2;
    }

    /* renamed from: s0 */
    public final String mo25973s0() {
        String str = this.f121285r;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -822443309:
                if (str.equals("find_friends_by_finder_live_above_look")) {
                    c = 0;
                    break;
                }
                break;
            case -497456467:
                if (str.equals("find_friends_by_finder_live")) {
                    c = 1;
                    break;
                }
                break;
            case 974172121:
                if (str.equals("find_live_friends_by_near")) {
                    c = 2;
                    break;
                }
                break;
            case 1529575902:
                if (str.equals("find_friends_by_finder")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return "FinderLiveEntrance";
            case 2:
                return "NearbyEntrance";
            default:
                return "FinderEntrance";
        }
    }

    /* renamed from: t0 */
    public final String mo25974t0(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -58348260:
                if (str.equals("FinderEntrance")) {
                    c = 0;
                    break;
                }
                break;
            case 691368744:
                if (str.equals("FinderLiveEntrance")) {
                    c = 1;
                    break;
                }
                break;
            case 935133594:
                if (str.equals("FinderMentionEntrance")) {
                    c = 2;
                    break;
                }
                break;
            case 1122432629:
                if (str.equals("NearbyEntrance")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "finder_entrance";
            case 1:
                return "finder_live_entrance";
            case 2:
                return "finder_mention_entrance";
            case 3:
                return "nearby_entrance";
            default:
                return null;
        }
    }

    /* renamed from: u0 */
    public final void mo25975u0(int i) {
        if (i > 0) {
            mo101936T(0);
            String str = i + "";
            if (i > 999) {
                str = "· · ·";
            }
            mo101941a0(str, C45081s1.m49933b(this.f121274d, i));
            return;
        }
        mo96250V(8);
        mo101937U(8);
        mo101934R(8);
        mo101936T(8);
    }

    /* renamed from: v0 */
    public final void mo25976v0(C20609s sVar) {
        if (sVar != null && sVar.getView().getVisibility() == 0 && sVar.getDropStat() == 2) {
            Log.m105924i("FinderIconViewTipPreference", "handleDropAll: " + sVar);
            mo25953H0(sVar.getView(), 8);
            if (!"find_friends_by_finder".equals(this.f121285r)) {
                this.f55784Y1.f354436e = this.f55804v1.getString(C0966R.string.efu);
                tg4 tg4 = this.f55784Y1;
                tg4.f354439h = "";
                tg4.f354441j = "";
                mo25951F0(sVar);
                mo25955J0(true, this.f55784Y1, this.f55781V1, true, this.f55787b2, this.f55788c2, this.f55789d2, this.f55783X1);
                return;
            }
            mo25965k0(true);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        Log.m105924i("FinderIconViewTipPreference", "onBindView title:" + this.f121279i + " hashCode:" + hashCode() + " view:" + view);
        this.f201747m1 = view;
        this.f55793h2 = (WeImageView) view.findViewById(C0966R.C0970id.it4);
        this.f55794i2 = (LinearLayout) this.f201747m1.findViewById(C0966R.C0970id.j7c);
        this.f55795j2 = (RelativeLayout) this.f201747m1.findViewById(C0966R.C0970id.kje);
        mo25977w0();
        Log.m105924i("FinderIconViewTipPreference", "onBindView mStyle:" + this.f55781V1 + " mTipsInfo:" + this.f55784Y1);
        tg4 tg4 = this.f55784Y1;
        if (tg4 != null) {
            int i = this.f55781V1;
            if (i == 9) {
                mo25958g(this.f55782W1, tg4);
            } else if (i > 0 && i <= 7) {
                mo25955J0(this.f55782W1, tg4, i, this.f55785Z1, this.f55787b2, this.f55788c2, this.f55789d2, this.f55783X1);
            } else if (i == 10 || ((i >= 11 && i < 12) || i == 14)) {
                mo25955J0(this.f55782W1, tg4, i, this.f55785Z1, this.f55787b2, this.f55788c2, this.f55789d2, this.f55783X1);
            } else if (i == 999) {
                mo25954I0(this.f55782W1, this.f55791f2, i, this.f55783X1);
            }
        } else {
            int i2 = this.f55781V1;
            if (i2 == 999) {
                mo25954I0(this.f55782W1, this.f55791f2, i2, this.f55783X1);
            }
        }
    }

    /* renamed from: w0 */
    public final void mo25977w0() {
        Log.m105924i("FinderIconViewTipPreference", "initContentLayoutParam mThirdLayoutContainer：" + this.f55795j2);
        View view = this.f201747m1;
        if (view != null) {
            if (this.f55798m2 == null) {
                this.f55798m2 = (LinearLayout.LayoutParams) ((ViewGroup) view.findViewById(C0966R.C0970id.br8)).getLayoutParams();
            }
            if (this.f55799n2 == null) {
                this.f55799n2 = new LinearLayout.LayoutParams(-2, this.f55798m2.height, 0.0f);
            }
            if (this.f55796k2 == null) {
                this.f55796k2 = (LinearLayout.LayoutParams) this.f55794i2.getLayoutParams();
            }
            if (this.f55797l2 == null) {
                this.f55797l2 = new LinearLayout.LayoutParams(-1, -1, 0.0f);
            }
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        Log.m105924i("FinderIconViewTipPreference", "onCreateView title:" + this.f121279i + " hashCode:" + hashCode() + " view:" + x);
        RelativeLayout relativeLayout = (RelativeLayout) this.f201747m1.findViewById(C0966R.C0970id.kje);
        TextView textView = (TextView) x.findViewById(C0966R.C0970id.kiq);
        String s0 = mo25973s0();
        if (relativeLayout != null && (s0.equals("FinderEntrance") || s0.equals("FinderLiveEntrance") || s0.equals("NearbyEntrance"))) {
            mo25949C0(relativeLayout, s0, mo25974t0(s0));
        }
        if (textView != null && s0.equals("FinderEntrance")) {
            mo25949C0(textView, "FinderMentionEntrance", mo25974t0("FinderMentionEntrance"));
        }
        return x;
    }

    /* renamed from: x0 */
    public final boolean mo25978x0(int i, C49308en1 en12) {
        int i2 = i;
        C49308en1 en13 = en12;
        Log.m105924i("FinderIconViewTipPreference", "initWidgetFrame mWidgetFrame:" + this.f55805w1);
        View view = this.f215084j1;
        ViewGroup viewGroup = (ViewGroup) (view == null ? null : view.findViewById(16908312));
        mo25977w0();
        if (viewGroup == null) {
            Log.m105924i("FinderIconViewTipPreference", "[initWidgetFrame] fail,WidgetFrame has child!");
            return false;
        }
        this.f55805w1 = viewGroup;
        if (i2 == 2 || i2 == 5 || i2 == 1 || i2 == 4 || i2 == 6 || i2 == 7 || i2 == 10 || i2 == 11 || i2 == 12 || i2 == 14 || i2 == 15) {
            if (viewGroup.getChildCount() != 1 || !"singleAvatar".equals(viewGroup.getChildAt(0).getTag())) {
                viewGroup.removeAllViews();
                View.inflate(this.f121274d, C0966R.C0971layout.f359891bf0, viewGroup).findViewById(C0966R.C0970id.e4g).setTag("singleAvatar");
            }
            this.f55806x1 = viewGroup.findViewById(C0966R.C0970id.f358322ef1);
            this.f55807y1 = viewGroup.findViewById(C0966R.C0970id.efb);
            this.f55761B1 = (ImageView) viewGroup.findViewById(C0966R.C0970id.f358321ef0);
            this.f55762C1 = (ImageView) viewGroup.findViewById(C0966R.C0970id.efo);
            this.f55765F1 = (ImageView) viewGroup.findViewById(C0966R.C0970id.itw);
            mo101933P(8);
            this.f55770K1 = (ImageView) viewGroup.findViewById(C0966R.C0970id.f359099iu3);
            this.f55768I1 = (TextView) viewGroup.findViewById(C0966R.C0970id.iu8);
            this.f55769J1 = (TextView) viewGroup.findViewById(C0966R.C0970id.fmx);
            this.f55766G1 = (ImageView) viewGroup.findViewById(C0966R.C0970id.hho);
            this.f55767H1 = (WeImageView) viewGroup.findViewById(C0966R.C0970id.iu_);
            LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.iu9);
            this.f55792g2 = (RelativeLayout) viewGroup.findViewById(C0966R.C0970id.a1z);
            this.f55774O1 = viewGroup.findViewById(C0966R.C0970id.h2v);
            this.f55775P1 = (ImageView) viewGroup.findViewById(C0966R.C0970id.efp);
            this.f55778S1 = (ImageView) viewGroup.findViewById(C0966R.C0970id.f359098iu2);
            this.f55776Q1 = (ImageView) viewGroup.findViewById(C0966R.C0970id.efq);
            this.f55777R1 = (ImageView) viewGroup.findViewById(C0966R.C0970id.efr);
            this.f55779T1 = (C20609s) viewGroup.findViewById(C0966R.C0970id.hdi);
            this.f55780U1 = (C20609s) viewGroup.findViewById(C0966R.C0970id.l1d);
            this.f55773N1 = (TextView) viewGroup.findViewById(C0966R.C0970id.md8);
        } else if (i2 == 3) {
            viewGroup.removeAllViews();
            View inflate = View.inflate(this.f121274d, C0966R.C0971layout.beq, viewGroup);
            this.f55806x1 = inflate.findViewById(C0966R.C0970id.f358322ef1);
            this.f55808z1 = inflate.findViewById(C0966R.C0970id.f358324ef3);
            this.f55760A1 = inflate.findViewById(C0966R.C0970id.ef5);
            ArrayList<View> arrayList = new ArrayList<>(3);
            this.f55771L1 = arrayList;
            arrayList.add(this.f55806x1);
            this.f55771L1.add(this.f55808z1);
            this.f55771L1.add(this.f55760A1);
            this.f55761B1 = (ImageView) inflate.findViewById(C0966R.C0970id.f358321ef0);
            this.f55763D1 = (ImageView) inflate.findViewById(C0966R.C0970id.f358323ef2);
            this.f55764E1 = (ImageView) inflate.findViewById(C0966R.C0970id.ef4);
            ArrayList<ImageView> arrayList2 = new ArrayList<>(3);
            this.f55772M1 = arrayList2;
            arrayList2.add(this.f55761B1);
            this.f55772M1.add(this.f55763D1);
            this.f55772M1.add(this.f55764E1);
            this.f55765F1 = (ImageView) inflate.findViewById(C0966R.C0970id.itw);
        } else if (!this.f55782W1) {
            viewGroup.removeAllViews();
        } else {
            List<C41411b> a = this.f55790e2.mo23616a(en13.f133024d);
            int width = this.f201747m1.getWidth();
            if (width <= 0) {
                Log.m105929w("FinderIconViewTipPreference", "[getDslMaxWidth] screenWidth=%s", Integer.valueOf(width));
                width = this.f201747m1.getContext().getResources().getDisplayMetrics().widthPixels;
            }
            TextView textView = (TextView) this.f201747m1.findViewById(16908310);
            Resources resources = textView.getResources();
            Rect rect = new Rect();
            textView.getGlobalVisibleRect(rect);
            int i3 = rect.right;
            int l0 = mo25966l0();
            int dimension = (int) resources.getDimension(C0966R.dimen.f3745cw);
            int dimension2 = (((width - i3) - l0) - dimension) - ((int) resources.getDimension(C0966R.dimen.f3743cv));
            Log.m105925i("FinderIconViewTipPreference", "[getDslMaxWidth] screenWidth=%s availableWidth=%s occupiedWidth=%s titleTextEnd=%s countRedDotWidth=%s", Integer.valueOf(width), Integer.valueOf(dimension2), Integer.valueOf(dimension), Integer.valueOf(i3), Integer.valueOf(l0));
            C18747a.C18748a aVar = new C18747a.C18748a(dimension2, false);
            boolean d = this.f55790e2.mo23619d(aVar, a);
            Log.m105924i("FinderIconViewTipPreference", "intDslView isShouldUpdate:" + d);
            if (viewGroup.getChildCount() != 1 || !"dslTag".equals(viewGroup.getChildAt(0).getTag()) || d) {
                viewGroup.removeAllViews();
                ViewGroup c = this.f55790e2.mo23618c(aVar, a, en13);
                if (c.getParent() != null && (c.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) c.getParent()).removeView(c);
                }
                viewGroup.addView(c);
            } else {
                Log.m105924i("FinderIconViewTipPreference", "reuse last view!");
            }
            mo25965k0(false);
        }
        return true;
    }

    /* renamed from: y0 */
    public final boolean mo25979y0(tg4 tg4) {
        if (tg4 != null) {
            return !TextUtils.isEmpty(tg4.f354439h) || !TextUtils.isEmpty(tg4.f354441j);
        }
        return false;
    }

    /* renamed from: z0 */
    public final boolean mo25980z0(tg4 tg4) {
        return TextUtils.isEmpty(tg4.f354436e) && TextUtils.isEmpty(tg4.f354439h) && TextUtils.isEmpty(tg4.f354441j);
    }

    public FinderIconViewTipPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FinderIconViewTipPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55804v1 = context;
        this.f55790e2 = ((C76243a5) C86312j.m106911c(C76243a5.class)).Hc0(context);
        this.f215083i1 = true;
        this.f121271G = C0966R.C0971layout.f359770am0;
    }
}
