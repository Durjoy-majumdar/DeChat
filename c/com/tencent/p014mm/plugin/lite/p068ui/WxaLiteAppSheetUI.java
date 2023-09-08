package com.tencent.p014mm.plugin.lite.p068ui;

import android.graphics.Outline;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.FragmentManager;
import com.tencent.liteapp.p877ui.WxaLiteAppBaseFragment;
import com.tencent.liteapp.p877ui.WxaLiteAppFragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import kg3.C76577a;
import kotlin.Metadata;
import o40.C61926c;
import p1204oa.C117728a;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.embedding.android.TransparencyMode;
import p244tt.C14088e;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/lite/ui/WxaLiteAppSheetUI;", "Landroidx/appcompat/app/AppCompatActivity;", "Loa/a;", "<init>", "()V", "a", "luggage-lite-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI */
public final class WxaLiteAppSheetUI extends AppCompatActivity implements C117728a {

    /* renamed from: d */
    public static WxaLiteAppFragment f198750d;

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI$a */
    public static final class C69116a {
        public C69116a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI$b */
    public static final class C69117b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WxaLiteAppSheetUI f198751d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69117b(WxaLiteAppSheetUI wxaLiteAppSheetUI) {
            super(0);
            this.f198751d = wxaLiteAppSheetUI;
        }

        public Object invoke() {
            this.f198751d.onBackPressed();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI$c */
    public static final class C69118c extends ViewOutlineProvider {
        public void getOutline(View view, Outline outline) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(outline, "outline");
            float b = (float) C76577a.m92151b(MMApplicationContext.getContext(), 8);
            outline.setRoundRect(0, 0, view.getWidth(), (int) (((float) view.getHeight()) + b), b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI$d */
    public static final class C69119d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WxaLiteAppSheetUI f198752d;

        public C69119d(WxaLiteAppSheetUI wxaLiteAppSheetUI) {
            this.f198752d = wxaLiteAppSheetUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/lite/ui/WxaLiteAppSheetUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f198752d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/lite/ui/WxaLiteAppSheetUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    static {
        new C69116a((C8480h) null);
    }

    /* renamed from: Z3 */
    public void mo95219Z3() {
    }

    /* renamed from: b1 */
    public void mo95220b1(Map<Object, Object> map) {
    }

    /* renamed from: d6 */
    public void mo95221d6() {
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2328p, C0966R.C0968anim.f2443d6);
        ((C14088e) C86312j.m106911c(C14088e.class)).mo13514aF(Boolean.FALSE);
    }

    public void hideKeyboard() {
    }

    /* renamed from: m2 */
    public void mo95223m2(boolean z) {
    }

    public void navigateBack(boolean z) {
        C61926c.m72668M(new C69117b(this));
    }

    public void onBackPressed() {
        WxaLiteAppFragment wxaLiteAppFragment = f198750d;
        if (wxaLiteAppFragment != null) {
            wxaLiteAppFragment.f339305e.mo180441e(true);
        } else {
            C87412m.m108603p("fragment");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        ((C14088e) C86312j.m106911c(C14088e.class)).mo13514aF(Boolean.TRUE);
        super.onCreate(bundle);
        setContentView((int) C0966R.C0971layout.f359854b62);
        overridePendingTransition(C0966R.C0968anim.f2328p, C0966R.C0968anim.f2329q);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C112919c0 beginTransaction = supportFragmentManager != null ? supportFragmentManager.beginTransaction() : null;
        View findViewById = findViewById(C0966R.C0970id.eek);
        C87412m.m108593f(findViewById, "findViewById(R.id.fragment_container)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        Bundle bundleExtra = getIntent().getBundleExtra("bundle");
        if (bundleExtra != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            double d = 0.75d;
            if (bundleExtra.containsKey("heightPercent")) {
                double d2 = bundleExtra.getDouble("heightPercent");
                if (d2 > 0.0d && d2 < 1.0d) {
                    d = d2;
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) (((double) i) * d));
            layoutParams.gravity = 80;
            frameLayout.setLayoutParams(layoutParams);
        }
        frameLayout.setOutlineProvider(new C69118c());
        frameLayout.setClipToOutline(true);
        Class<WxaLiteAppFragment> cls = WxaLiteAppFragment.class;
        RenderMode renderMode = RenderMode.surface;
        TransparencyMode transparencyMode = TransparencyMode.transparent;
        try {
            WxaLiteAppBaseFragment newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("flutterview_render_mode", renderMode.name());
                bundle2.putString("flutterview_transparency_mode", transparencyMode != null ? transparencyMode.name() : transparencyMode.name());
                bundle2.putBoolean("should_attach_engine_to_activity", true);
                bundle2.putBoolean("destroy_engine_with_fragment", true);
                bundle2.putBoolean("openWithNewTab", false);
                newInstance.setArguments(bundle2);
                WxaLiteAppFragment wxaLiteAppFragment = (WxaLiteAppFragment) newInstance;
                f198750d = wxaLiteAppFragment;
                if (beginTransaction != null) {
                    beginTransaction.mo165167i(C0966R.C0970id.eek, wxaLiteAppFragment, (String) null, 1);
                }
                if (beginTransaction != null) {
                    beginTransaction.mo165162d();
                }
                View findViewById2 = findViewById(C0966R.C0970id.no6);
                C87412m.m108593f(findViewById2, "findViewById(R.id.lite_app_sheet_ui)");
                FrameLayout frameLayout2 = (FrameLayout) findViewById2;
                if (bundleExtra != null) {
                    frameLayout2.setBackgroundResource(bundleExtra.getInt("KHalfScreenBackGroundColor", C0966R.color.ahf));
                }
                frameLayout2.setOnClickListener(new C69119d(this));
                return;
            }
            throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + cls.getCanonicalName() + ") does not match the expected return type.");
        } catch (Exception e) {
            throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + cls.getName() + ")", e);
        }
    }

    /* renamed from: p */
    public void mo95225p() {
    }
}
