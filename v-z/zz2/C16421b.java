package zz2;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import qy2.C77448f0;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: zz2.b */
public final class C16421b extends UIComponent {

    /* renamed from: d */
    public final C13601g f43834d = C36568h.m40985a(C16422a.f43838d);

    /* renamed from: e */
    public boolean f43835e;

    /* renamed from: f */
    public WeakReference<ViewGroup> f43836f;

    /* renamed from: g */
    public WeakReference<View> f43837g;

    /* renamed from: zz2.b$a */
    public static final class C16422a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C16422a f43838d = new C16422a();

        public C16422a() {
            super(0);
        }

        public Object invoke() {
            SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
            return Boolean.TRUE;
        }
    }

    /* renamed from: zz2.b$b */
    public static final class C16423b implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f43839d;

        /* renamed from: e */
        public final /* synthetic */ LinearLayout f43840e;

        public C16423b(ViewGroup viewGroup, LinearLayout linearLayout) {
            this.f43839d = viewGroup;
            this.f43840e = linearLayout;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardLikeEducationUIC$tryShowEducation$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                this.f43839d.removeView(this.f43840e);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardLikeEducationUIC$tryShowEducation$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16421b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo14879c3() {
        ViewGroup viewGroup;
        WeakReference<View> weakReference;
        View view;
        WeakReference<ViewGroup> weakReference2 = this.f43836f;
        if (weakReference2 != null && (viewGroup = weakReference2.get()) != null && (weakReference = this.f43837g) != null && (view = weakReference.get()) != null) {
            viewGroup.removeView(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r13 = f40.C86709a0.m107535s().mo121142i();
        r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_LIKE_EDUCATION_SHOWED_INT;
     */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14880d3(android.view.ViewGroup r12, java.lang.String r13) {
        /*
            r11 = this;
            rx3.g r0 = r11.f43834d
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            if (r12 != 0) goto L_0x0014
            return
        L_0x0014:
            java.lang.String r0 = su0.C13781a.m13082a()
            boolean r13 = gy3.C87412m.m108589b(r13, r0)
            if (r13 == 0) goto L_0x001f
            return
        L_0x001f:
            boolean r13 = r11.f43835e
            if (r13 == 0) goto L_0x0024
            return
        L_0x0024:
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_LIKE_EDUCATION_SHOWED_INT
            r1 = 0
            int r13 = r13.mo119689j(r0, r1)
            r2 = 3
            if (r13 >= r2) goto L_0x0126
            r2 = 1
            r11.f43835e = r2
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            androidx.appcompat.app.AppCompatActivity r4 = r11.getActivity()
            r3.<init>(r4)
            r3.setOrientation(r2)
            r4 = 17
            r3.setGravity(r4)
            java.lang.String r5 = "#4d000000"
            int r5 = android.graphics.Color.parseColor(r5)
            r3.setBackgroundColor(r5)
            org.libpag.PAGView r5 = new org.libpag.PAGView
            androidx.appcompat.app.AppCompatActivity r6 = r11.getActivity()
            r5.<init>(r6)
            androidx.appcompat.app.AppCompatActivity r6 = r11.getActivity()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131165292(0x7f07006c, float:1.7944797E38)
            float r6 = r6.getDimension(r7)
            int r6 = (int) r6
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r6, r6)
            r7.gravity = r4
            rx3.b0 r6 = rx3.C13598b0.f38549a
            r3.addView(r5, r7)
            android.widget.TextView r6 = new android.widget.TextView
            androidx.appcompat.app.AppCompatActivity r7 = r11.getActivity()
            r6.<init>(r7)
            androidx.appcompat.app.AppCompatActivity r7 = r11.getActivity()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131837967(0x7f11440f, float:1.9309144E38)
            java.lang.String r7 = r7.getString(r8)
            r6.setText(r7)
            r7 = -1
            r6.setTextColor(r7)
            r8 = 1101004800(0x41a00000, float:20.0)
            r6.setTextSize(r2, r8)
            android.text.TextPaint r8 = r6.getPaint()
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r8, r9)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            androidx.appcompat.app.AppCompatActivity r9 = r11.getActivity()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131165337(0x7f070099, float:1.7944888E38)
            float r9 = r9.getDimension(r10)
            int r9 = (int) r9
            r8.topMargin = r9
            r8.gravity = r4
            r3.addView(r6, r8)
            r5.setRepeatCount(r7)
            android.app.Activity r6 = r11.getContext()
            android.content.res.AssetManager r6 = r6.getAssets()
            java.lang.String r8 = "finder_full_like_guide.pag"
            org.libpag.PAGFile r6 = org.libpag.PAGFile.Load(r6, r8)
            r5.setComposition(r6)
            r5.play()
            boolean r5 = r12 instanceof android.widget.FrameLayout
            if (r5 == 0) goto L_0x00e6
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r7, r7)
            r5.gravity = r4
            goto L_0x00fa
        L_0x00e6:
            boolean r4 = r12 instanceof android.widget.RelativeLayout
            if (r4 == 0) goto L_0x00f5
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            r5.<init>(r7, r7)
            r4 = 13
            r5.addRule(r4, r7)
            goto L_0x00fa
        L_0x00f5:
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r5.<init>(r7, r7)
        L_0x00fa:
            r12.addView(r3, r5)
            r3.setClickable(r1)
            zz2.b$b r1 = new zz2.b$b
            r1.<init>(r12, r3)
            r3.setOnTouchListener(r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r12)
            r11.f43836f = r1
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r3)
            r11.f43837g = r12
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            int r13 = r13 + r2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.mo119677K(r0, r13)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zz2.C16421b.mo14880d3(android.view.ViewGroup, java.lang.String):void");
    }
}
