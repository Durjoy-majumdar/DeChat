package com.tencent.p014mm.plugin.finder.nearby.newlivesquare;

import android.content.Intent;
import bl3.C0324s;
import bl3.C39818r;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C31543z5;
import fm1.C8138e;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C87412m;
import h81.C59774i;
import ht1.C8815x4;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import ln1.C10584f;
import nj3.C88989a;
import p185kq.C10383h;
import p204mr.C61567i;
import p204mr.C61570q;
import p565ir.C60606n;
import rs1.C13442s8;
import sx3.C110826x0;
import vo3.C90852c;
import xm1.C15834h;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI */
public class FinderLiveSquareNewEntranceUI extends MMFinderUI {

    /* renamed from: o */
    public final LiveEntranceFragment f15694o = new LiveEntranceFragment();

    /* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI$a */
    public static final class C3315a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveSquareNewEntranceUI f15695d;

        public C3315a(FinderLiveSquareNewEntranceUI finderLiveSquareNewEntranceUI) {
            this.f15695d = finderLiveSquareNewEntranceUI;
        }

        public final void run() {
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86186vx(this.f15695d, false);
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        if (mo3621N7()) {
            return WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS;
        }
        return 135;
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return "FinderLiveSquareNewEntranceUI";
    }

    /* renamed from: N7 */
    public final boolean mo3621N7() {
        Intent intent = getIntent();
        return (intent != null ? (Intent) intent.getParcelableExtra("KEY_ENTER_LIVE_PARAM_INTENT_DATA") : null) != null;
    }

    public boolean convertActivityFromTranslucent() {
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359738cn2;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C8138e.class, C0324s.m265a(C24560g0.m30725a(C8815x4.class)), C10584f.class, C13442s8.class, C15834h.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x03e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r31) {
        /*
            r30 = this;
            r9 = r30
            java.lang.Class<ln1.f> r10 = ln1.C10584f.class
            java.lang.Class<l31.e> r11 = l31.C61212e.class
            r12 = 1
            r9.supportRequestWindowFeature(r12)
            super.onCreate(r31)
            r0 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r9.setSelfNavigationBarVisible(r0)
            android.view.Window r0 = r30.getWindow()
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r2)
            android.view.Window r0 = r30.getWindow()
            r3 = 1024(0x400, float:1.435E-42)
            r0.clearFlags(r3)
            android.view.Window r0 = r30.getWindow()
            r3 = 512(0x200, float:7.175E-43)
            r0.clearFlags(r3)
            android.view.Window r0 = r30.getWindow()
            r0.clearFlags(r2)
            android.view.Window r0 = r30.getWindow()
            android.view.View r0 = r0.getDecorView()
            r2 = 1792(0x700, float:2.511E-42)
            r0.setSystemUiVisibility(r2)
            android.view.Window r0 = r30.getWindow()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r2)
            android.view.Window r0 = r30.getWindow()
            r13 = 0
            r0.setStatusBarColor(r13)
            android.view.Window r0 = r30.getWindow()
            r0.setNavigationBarColor(r13)
            android.view.Window r0 = r30.getWindow()
            r2 = -3
            r0.setFormat(r2)
            java.lang.Class<rs1.s8> r0 = rs1.C13442s8.class
            androidx.lifecycle.i0 r0 = r9.component(r0)
            rs1.s8 r0 = (rs1.C13442s8) r0
            int r2 = r30.mo2194I7()
            r0.f38096i = r2
            androidx.lifecycle.i0 r0 = r9.component(r10)
            ln1.f r0 = (ln1.C10584f) r0
            int r2 = r30.mo2194I7()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.f31926h = r2
            androidx.appcompat.app.ActionBar r0 = r30.getSupportActionBar()
            if (r0 == 0) goto L_0x008c
            r0.mo91104o()
        L_0x008c:
            com.tencent.mm.ui.MMActivityController r0 = r30.getController()
            androidx.appcompat.app.AppCompatActivity r2 = r30.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099792(0x7f060090, float:1.7811947E38)
            int r2 = r2.getColor(r3)
            r0.mo177081j0(r2)
            r9.setBackGroundColorResource(r3)
            r0 = 2131296437(0x7f0900b5, float:1.821079E38)
            android.view.View r0 = r9.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r2 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            r3 = 0
            if (r2 == 0) goto L_0x00ba
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L_0x00bb
        L_0x00ba:
            r0 = r3
        L_0x00bb:
            if (r0 == 0) goto L_0x00c3
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r30)
            r0.topMargin = r2
        L_0x00c3:
            r0 = 2131297519(0x7f0904ef, float:1.8212985E38)
            android.view.View r2 = r9.findViewById(r0)
            xm1.b r4 = new xm1.b
            r4.<init>(r9)
            r2.setOnClickListener(r4)
            r2 = 2131304342(0x7f091f96, float:1.8226824E38)
            android.view.View r4 = r9.findViewById(r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            androidx.appcompat.app.AppCompatActivity r5 = r30.getContext()
            r6 = 2131165186(0x7f070002, float:1.7944582E38)
            int r5 = kg3.C76577a.m92155f(r5, r6)
            float r5 = (float) r5
            androidx.appcompat.app.AppCompatActivity r6 = r30.getContext()
            float r6 = kg3.C76577a.m92161l(r6)
            float r5 = r5 * r6
            r4.setTextSize(r13, r5)
            boolean r4 = r30.mo3621N7()
            if (r4 == 0) goto L_0x01e1
            android.view.View r0 = r9.findViewById(r0)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r4.mo10233c(r1)
            java.lang.Object[] r15 = r4.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI"
            java.lang.String r17 = "initActionBar"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r4 = r4.mo10231a(r13)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.setVisibility(r4)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI"
            java.lang.String r16 = "initActionBar"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.view.View r0 = r9.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.Resources r2 = r0.getResources()
            r4 = 2131828161(0x7f111dc1, float:1.9289255E38)
            java.lang.String r2 = r2.getString(r4)
            r0.setText(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            r0.setTypeface(r2)
            r0 = 2131309516(0x7f0933cc, float:1.8237318E38)
            android.view.View r0 = r9.findViewById(r0)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r1)
            java.lang.Object[] r15 = r2.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI"
            java.lang.String r17 = "initActionBar"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r1 = r2.mo10231a(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI"
            java.lang.String r16 = "initActionBar"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            r0 = 2131299709(0x7f090d7d, float:1.8217427E38)
            android.view.View r0 = r9.findViewById(r0)
            xm1.c r1 = new xm1.c
            r1.<init>(r9)
            r0.setOnClickListener(r1)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1.mo10233c(r2)
            java.lang.Object[] r15 = r1.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI"
            java.lang.String r17 = "initActionBar"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r1 = r1.mo10231a(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI"
            java.lang.String r16 = "initActionBar"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x01e1:
            com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragment r0 = r9.f15694o
            android.content.Intent r1 = r30.getIntent()
            if (r1 == 0) goto L_0x01ee
            android.os.Bundle r1 = r1.getExtras()
            goto L_0x01ef
        L_0x01ee:
            r1 = r3
        L_0x01ef:
            r0.setArguments(r1)
            androidx.fragment.app.FragmentManager r0 = r30.getSupportFragmentManager()
            androidx.fragment.app.c0 r0 = r0.beginTransaction()
            com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragment r1 = r9.f15694o
            r2 = 2131304947(0x7f0921f3, float:1.822805E38)
            r0.mo165167i(r2, r1, r3, r12)
            com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragment r1 = r9.f15694o
            androidx.fragment.app.c0 r0 = r0.mo165171o(r1)
            r0.mo165163e()
            boolean r0 = r30.mo3621N7()
            java.lang.String r14 = ""
            if (r0 == 0) goto L_0x02c4
            android.content.Intent r0 = r30.getIntent()
            if (r0 == 0) goto L_0x02c1
            java.lang.String r1 = "KEY_ENTER_LIVE_PARAM_INTENT_DATA"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            if (r0 == 0) goto L_0x02c1
            android.view.Window r1 = r30.getWindow()
            android.view.View r1 = r1.getDecorView()
            r2 = 0
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r4.mo10233c(r2)
            java.lang.Object[] r16 = r4.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI"
            java.lang.String r18 = "checkScrollSquareEnterLive"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            r15 = r1
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r2 = r4.mo10231a(r13)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.setAlpha(r2)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI"
            java.lang.String r17 = "checkScrollSquareEnterLive"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setAlpha"
            java.lang.String r21 = "(F)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            androidx.appcompat.app.AppCompatActivity r1 = r30.getContext()
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r0)
            java.lang.Object[] r23 = r2.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI"
            java.lang.String r25 = "checkScrollSquareEnterLive"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "Undefined"
            java.lang.String r28 = "startActivity"
            java.lang.String r29 = "(Landroid/content/Intent;)V"
            r22 = r1
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r0 = r2.mo10231a(r13)
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            java.lang.String r23 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/FinderLiveSquareNewEntranceUI"
            java.lang.String r24 = "checkScrollSquareEnterLive"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "Undefined"
            java.lang.String r27 = "startActivity"
            java.lang.String r28 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            androidx.appcompat.app.AppCompatActivity r0 = r30.getContext()
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x02b0
            r3 = r0
        L_0x02b0:
            if (r3 == 0) goto L_0x02b8
            r0 = 2130771992(0x7f010018, float:1.714709E38)
            r3.overridePendingTransition(r0, r0)
        L_0x02b8:
            di3.d r0 = di3.C86312j.m106911c(r11)
            l31.e r0 = (l31.C61212e) r0
            r0.mo86186vx(r9, r12)
        L_0x02c1:
            r15 = r14
            goto L_0x03f3
        L_0x02c4:
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "FinderLiveEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r4 = r0.mo77227G5(r2)
            if (r4 == 0) goto L_0x03de
            te3.nn1 r2 = r4.mo77308o2(r2)
            if (r2 == 0) goto L_0x03de
            te3.xi1 r2 = r4.field_ctrInfo
            int r2 = r2.f144670e
            r5 = 16
            if (r2 != r5) goto L_0x03de
            r0.mo77242O(r4)
            java.lang.String r2 = "NearbyLiveTab"
            te3.yi1 r4 = r0.mo77279s(r2)
            if (r4 == 0) goto L_0x02fa
            int r4 = r4.f186558s
            r8 = r4
            goto L_0x02fb
        L_0x02fa:
            r8 = 0
        L_0x02fb:
            te3.yi1 r4 = r0.mo77279s(r2)
            if (r4 == 0) goto L_0x0304
            int r4 = r4.f186559t
            goto L_0x0305
        L_0x0304:
            r4 = 0
        L_0x0305:
            te3.yi1 r5 = r0.mo77279s(r2)
            r15 = r14
            if (r5 == 0) goto L_0x030f
            long r13 = r5.f186549g
            goto L_0x0311
        L_0x030f:
            r13 = 0
        L_0x0311:
            te3.yi1 r5 = r0.mo77279s(r2)
            if (r5 == 0) goto L_0x031b
            java.lang.String r5 = r5.f186554o
            if (r5 != 0) goto L_0x031c
        L_0x031b:
            r5 = r15
        L_0x031c:
            te3.yi1 r3 = r0.mo77279s(r2)
            if (r3 == 0) goto L_0x0326
            java.lang.String r3 = r3.f186560u
            if (r3 != 0) goto L_0x0327
        L_0x0326:
            r3 = r15
        L_0x0327:
            te3.yi1 r6 = r0.mo77279s(r2)
            if (r6 == 0) goto L_0x0334
            java.lang.String r6 = r6.f186561v
            if (r6 != 0) goto L_0x0332
            goto L_0x0334
        L_0x0332:
            r7 = r6
            goto L_0x0335
        L_0x0334:
            r7 = r15
        L_0x0335:
            te3.yi1 r0 = r0.mo77279s(r2)
            if (r0 == 0) goto L_0x0342
            java.lang.String r0 = r0.f186562w
            if (r0 != 0) goto L_0x0340
            goto L_0x0342
        L_0x0340:
            r6 = r0
            goto L_0x0343
        L_0x0342:
            r6 = r15
        L_0x0343:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "checkRedDotEnterLive targetTabId:"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r2 = " enterLiveAction:"
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = " targetObjectId:"
            r0.append(r2)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FinderLiveSquareNewEntranceUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r0.intValue()
            if (r4 != r12) goto L_0x0374
            r2 = 1
            goto L_0x0375
        L_0x0374:
            r2 = 0
        L_0x0375:
            if (r2 == 0) goto L_0x037a
            r16 = r0
            goto L_0x037c
        L_0x037a:
            r16 = 0
        L_0x037c:
            if (r16 == 0) goto L_0x03df
            r16.intValue()
            r16 = 0
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x03df
            java.lang.String r0 = "nearby_live_target_object_id_params_key"
            r1.putLong(r0, r13)
            java.lang.String r0 = "nearby_live_target_tab_id_params_key"
            r1.putInt(r0, r8)
            java.lang.String r0 = "nearby_live_target_nonce_id_params_key"
            r1.putString(r0, r5)
            java.lang.String r0 = "nearby_live_target_user_name_params_key"
            r1.putString(r0, r3)
            java.lang.String r0 = "nearby_live_target_nick_name_params_key"
            r1.putString(r0, r7)
            java.lang.String r0 = "nearby_live_target_cover_url_params_key"
            r1.putString(r0, r6)
            mm1.b r16 = mm1.C10935b.f32585a
            r17 = 0
            int r18 = r30.mo2194I7()
            r19 = 0
            r0 = r16
            r1 = r30
            r20 = r3
            r2 = r13
            r4 = r5
            r21 = r5
            r5 = r17
            r17 = r6
            r6 = r18
            r18 = r7
            r7 = r19
            r0.mo11135a(r1, r2, r4, r5, r6, r7)
            r2 = r8
            r3 = r13
            r5 = r21
            r6 = r20
            r7 = r18
            r8 = r17
            r0.mo11136d(r1, r2, r3, r5, r6, r7, r8)
            di3.d r0 = di3.C86312j.m106911c(r11)
            l31.e r0 = (l31.C61212e) r0
            r0.mo86186vx(r9, r12)
            r0 = 0
            goto L_0x03e0
        L_0x03de:
            r15 = r14
        L_0x03df:
            r0 = 1
        L_0x03e0:
            if (r0 == 0) goto L_0x03f3
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r0 = r0.mo62444c(r9)
            java.lang.Class<ht1.x4> r1 = ht1.C8815x4.class
            bl3.c r0 = r0.mo62447c(r1)
            ht1.x4 r0 = (ht1.C8815x4) r0
            r0.mo9641e1()
        L_0x03f3:
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r1 = r0.mo62444c(r9)
            java.lang.Class<fm1.e> r2 = fm1.C8138e.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            fm1.e r1 = (fm1.C8138e) r1
            r1.mo9204f3()
            bl3.r$a r0 = r0.mo62444c(r9)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r10)
            ln1.f r0 = (ln1.C10584f) r0
            r0.getClass()
            c30.g r1 = new c30.g
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.String r3 = "is_new_square"
            r1.mo145967r(r3, r2)
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct
            r2.<init>()
            long r3 = eb0.C31543z5.m39453c()
            r2.f9756d = r3
            java.lang.String r3 = "1001"
            r2.mo1022u(r3)
            java.lang.Class<h81.i> r3 = h81.C59774i.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.i r3 = (h81.C59774i) r3
            java.lang.String r3 = r3.mo84751Wb()
            if (r3 != 0) goto L_0x043e
            r3 = r15
        L_0x043e:
            java.lang.String r4 = "sessionid"
            java.lang.String r3 = r2.mo86045b(r4, r3, r12)
            r2.f9760h = r3
            java.lang.Class<kq.h> r3 = p185kq.C10383h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            kq.h r3 = (p185kq.C10383h) r3
            java.lang.String r3 = r3.mo10696E()
            if (r3 != 0) goto L_0x0456
            r3 = r15
        L_0x0456:
            r2.mo1021t(r3)
            java.lang.String r3 = r0.f31926h
            if (r3 != 0) goto L_0x045f
            r14 = r15
            goto L_0x0460
        L_0x045f:
            r14 = r3
        L_0x0460:
            r2.mo1020s(r14)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "pgUdfKv.toString()"
            gy3.C87412m.m108593f(r1, r3)
            java.lang.String r3 = ","
            java.lang.String r4 = ";"
            r5 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r1, r3, r4, r5)
            r2.mo1023v(r1)
            java.lang.Class<ir.n> r1 = p565ir.C60606n.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ir.n r1 = (p565ir.C60606n) r1
            java.lang.String r1 = r1.tx0()
            java.lang.String r3 = "switch_extra"
            java.lang.String r1 = r2.mo86045b(r3, r1, r12)
            r2.f9767o = r1
            r2.mo86054n()
            long r1 = eb0.C31543z5.m39453c()
            r0.f31932q = r1
            r30.mo79123H7()
            di3.d r0 = di3.C86312j.m106911c(r11)
            l31.e r0 = (l31.C61212e) r0
            o31.b r1 = o31.C11345b.FinderLiveSquareNewEntranceUI
            r0.mo86178qr(r9, r1)
            di3.d r0 = di3.C86312j.m106911c(r11)
            l31.e r0 = (l31.C61212e) r0
            o31.a r1 = o31.C76986a.FinderLive
            r0.mo86179qs(r9, r1)
            di3.d r0 = di3.C86312j.m106911c(r11)
            l31.e r0 = (l31.C61212e) r0
            java.lang.Class r1 = r30.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.mo86136FZ(r9, r1)
            di3.d r0 = di3.C86312j.m106911c(r11)
            l31.e r0 = (l31.C61212e) r0
            r1 = 40
            r2 = 25388(0x632c, float:3.5576E-41)
            r0.mo86148No(r9, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI.onCreate(android.os.Bundle):void");
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        if (mo3621N7()) {
            setTheme(C0966R.style.f8621p2);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        String str = "";
        ((C61567i) C86312j.m106911c(C61567i.class)).Dh0(C61570q.SQUARE, str, (C32224a<String>) null);
        C10584f fVar = (C10584f) C39818r.f106831a.mo62444c(this).mo75002a(C10584f.class);
        fVar.getClass();
        FinderBroadcastPageOutStruct finderBroadcastPageOutStruct = new FinderBroadcastPageOutStruct();
        finderBroadcastPageOutStruct.f9768d = C31543z5.m39453c();
        finderBroadcastPageOutStruct.mo1026u("1001");
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = str;
        }
        finderBroadcastPageOutStruct.f9772h = finderBroadcastPageOutStruct.mo86045b("sessionid", Wb, true);
        String E = ((C10383h) C86312j.m106911c(C10383h.class)).mo10696E();
        if (E == null) {
            E = str;
        }
        finderBroadcastPageOutStruct.mo1025t(E);
        String str2 = fVar.f31926h;
        if (str2 == null) {
            str2 = str;
        }
        finderBroadcastPageOutStruct.mo1024s(str2);
        if (fVar.f31932q > 0) {
            C104289g gVar = new C104289g();
            gVar.mo145954o("staytime", C31543z5.m39453c() - fVar.f31932q);
            gVar.mo145967r("is_new_square", 1);
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "pgUdfKv.toString()");
            str = C112551y.m153814n(gVar2, ",", ";", false);
        }
        finderBroadcastPageOutStruct.mo1027v(str);
        finderBroadcastPageOutStruct.f9778n = finderBroadcastPageOutStruct.mo86045b("switch_extra", ((C60606n) C86312j.m106911c(C60606n.class)).tx0(), true);
        finderBroadcastPageOutStruct.mo86054n();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f15694o.setArguments(intent != null ? intent.getExtras() : null);
    }

    public void onResume() {
        super.onResume();
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86160cK(new C3315a(this));
    }
}
