package rs1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: rs1.u6 */
public final class C48086u6 extends UIComponent {

    /* renamed from: d */
    public final C13601g f128940d = C36568h.m40985a(new C48088b(this));

    /* renamed from: e */
    public boolean f128941e;

    /* renamed from: rs1.u6$a */
    public static final class C48087a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C48086u6 f128942d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48087a(C48086u6 u6Var) {
            super(0);
            this.f128942d = u6Var;
        }

        public Object invoke() {
            this.f128942d.mo72830c3("Timeout");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.u6$b */
    public static final class C48088b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C48086u6 f128943d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48088b(C48086u6 u6Var) {
            super(0);
            this.f128943d = u6Var;
        }

        public Object invoke() {
            return new ImageView(this.f128943d.getContext());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48086u6(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo72830c3(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        if (this.f128941e) {
            Log.m105924i("FinderMultiTaskSnapshotUIC", "dismissSnapshot: success, source = " + str);
            this.f128941e = false;
            View decorView = getActivity().getWindow().getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                viewGroup.removeView(mo72831d3());
            }
            mo72831d3().setImageDrawable((Drawable) null);
        }
    }

    /* renamed from: d3 */
    public final ImageView mo72831d3() {
        return (ImageView) ((C36570n) this.f128940d).getValue();
    }

    /* JADX WARNING: type inference failed for: r6v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "KEY_VIDEO_THUMB_LOCAL_PATH"
            java.lang.String r6 = r6.getStringExtra(r0)
            r0 = 1
            if (r6 == 0) goto L_0x0016
            int r1 = r6.length()
            if (r1 != 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r1 = 0
            goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onCreate: snapshotPath = "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FinderMultiTaskSnapshotUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            ba2.b r1 = ba2.C39748b.f106642a
            r3 = 0
            android.graphics.Bitmap r6 = r1.mo62384a(r6, r3)
            if (r6 == 0) goto L_0x00aa
            boolean r1 = r6.isRecycled()
            if (r1 != 0) goto L_0x00aa
            int r1 = r6.getWidth()
            if (r1 == 0) goto L_0x00aa
            int r1 = r6.getHeight()
            if (r1 != 0) goto L_0x004c
            goto L_0x00aa
        L_0x004c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "onCreate: add snapshot to decor, width = "
            r1.append(r4)
            int r4 = r6.getWidth()
            r1.append(r4)
            java.lang.String r4 = "  height = "
            r1.append(r4)
            int r4 = r6.getHeight()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.widget.ImageView r1 = r5.mo72831d3()
            r1.setImageBitmap(r6)
            android.widget.ImageView r6 = r5.mo72831d3()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setBackgroundColor(r1)
            androidx.appcompat.app.AppCompatActivity r6 = r5.getActivity()
            android.view.Window r6 = r6.getWindow()
            android.view.View r6 = r6.getDecorView()
            boolean r1 = r6 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0093
            r3 = r6
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x0093:
            if (r3 == 0) goto L_0x009f
            android.widget.ImageView r6 = r5.mo72831d3()
            r1 = -1
            r3.addView(r6, r1, r1)
            r5.f128941e = r0
        L_0x009f:
            r0 = 3000(0xbb8, double:1.482E-320)
            rs1.u6$a r6 = new rs1.u6$a
            r6.<init>(r5)
            o40.C61926c.m72666K(r0, r6)
            return
        L_0x00aa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCreate: snapshot error, contentViewBitmap = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C48086u6.onCreate(android.os.Bundle):void");
    }
}
