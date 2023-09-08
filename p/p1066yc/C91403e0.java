package p1066yc;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import com.tencent.p014mm.sdk.platformtools.Log;
import hm0.C87557d;
import hm0.C87558e;
import hm0.C87559f;
import hm0.C87562h;
import java.lang.ref.WeakReference;

/* renamed from: yc.e0 */
public class C91403e0 implements C87562h<View> {

    /* renamed from: c */
    public static C87557d f262111c = new C91404a();

    /* renamed from: d */
    public static WeakReference<byte[]> f262112d;

    /* renamed from: a */
    public final String f262113a = ("MicroMsg.AppBrand.XWebVideoContainerChannel4AudioPlay#" + hashCode());

    /* renamed from: b */
    public final C91418n f262114b;

    /* renamed from: yc.e0$a */
    public class C91404a implements C87557d {
        /* renamed from: a */
        public boolean mo122015a() {
            return false;
        }
    }

    /* renamed from: yc.e0$b */
    public abstract class C91405b extends LinearLayout implements C87559f {

        /* renamed from: d */
        public final Space f262115d;

        /* renamed from: e */
        public final View f262116e;

        /* renamed from: f */
        public final Space f262117f;

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00f9  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x006c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C91405b(android.content.Context r10) {
            /*
                r8 = this;
                p1066yc.C91403e0.this = r9
                r8.<init>(r10)
                android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
                r1 = -1
                r0.<init>(r1, r1)
                r8.setLayoutParams(r0)
                r0 = 0
                r8.setOrientation(r0)
                android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
                r3 = 127(0x7f, float:1.78E-43)
                int r3 = android.graphics.Color.argb(r3, r0, r0, r0)
                r2.<init>(r3)
                yc.n r3 = r9.f262114b
                java.lang.Class<yc.p> r4 = p1066yc.C91420p.class
                yc.o r3 = r3.mo109509c(r4)
                yc.p r3 = (p1066yc.C91420p) r3
                r4 = 1
                r5 = 2
                if (r3 != 0) goto L_0x0034
                java.lang.String r3 = r9.f262113a
                java.lang.String r6 = "setBackground4AudioPlayViewContainer, videoPlayerAddOnGetSnapshot is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r6)
                goto L_0x0042
            L_0x0034:
                android.graphics.Bitmap r3 = r3.mo109547c()
                if (r3 != 0) goto L_0x0044
                java.lang.String r3 = r9.f262113a
                java.lang.String r6 = "setBackground4AudioPlayViewContainer, bitmap is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r6)
            L_0x0042:
                r3 = 0
                goto L_0x006a
            L_0x0044:
                java.lang.String r6 = r9.f262113a
                java.lang.String r7 = "setBackground4AudioPlayViewContainer, real set"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                r6 = 50
                android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.fastblur(r3, r6)
                android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
                android.content.res.Resources r7 = r8.getResources()
                r6.<init>(r7, r3)
                android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable
                android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[r5]
                r7[r0] = r6
                r7[r4] = r2
                r3.<init>(r7)
                r8.setBackground(r3)
                r3 = 1
            L_0x006a:
                if (r3 != 0) goto L_0x0085
                android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
                java.lang.String r6 = "#F7F7F7"
                int r6 = android.graphics.Color.parseColor(r6)
                r3.<init>(r6)
                android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable
                android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[r5]
                r5[r0] = r3
                r5[r4] = r2
                r6.<init>(r5)
                r8.setBackground(r6)
            L_0x0085:
                r2 = 16
                r8.setGravity(r2)
                android.widget.Space r2 = new android.widget.Space
                r2.<init>(r10)
                android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
                r4 = 1100480512(0x41980000, float:19.0)
                r3.<init>(r0, r1, r4)
                r2.setLayoutParams(r3)
                r8.f262115d = r2
                r8.addView(r2)
                r2 = r8
                yc.f0 r2 = (p1066yc.C91407f0) r2
                java.lang.Class<ht0.b> r3 = ht0.C87587b.class
                ra.b r3 = p224ra.C89909e.m112436a(r3)
                ht0.b r3 = (ht0.C87587b) r3
                if (r3 != 0) goto L_0x00b6
                yc.e0 r2 = r2.f262120h
                java.lang.String r2 = r2.f262113a
                java.lang.String r3 = "createAudioPlayView, gifCoverViewFactory is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
                r2 = 0
                goto L_0x00f5
            L_0x00b6:
                ht0.a r2 = r3.mo115840RN(r10)
                java.lang.ref.WeakReference<byte[]> r3 = p1066yc.C91403e0.f262112d
                if (r3 == 0) goto L_0x00ce
                java.lang.Object r3 = r3.get()
                if (r3 != 0) goto L_0x00c5
                goto L_0x00ce
            L_0x00c5:
                java.lang.ref.WeakReference<byte[]> r3 = p1066yc.C91403e0.f262112d
                java.lang.Object r3 = r3.get()
                byte[] r3 = (byte[]) r3
                goto L_0x00e4
            L_0x00ce:
                android.content.res.Resources r3 = r10.getResources()
                r5 = 2131757099(0x7f10082b, float:1.9145124E38)
                java.io.InputStream r3 = r3.openRawResource(r5)
                byte[] r3 = js0.C88016e.m109545b(r3)
                java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
                r5.<init>(r3)
                p1066yc.C91403e0.f262112d = r5
            L_0x00e4:
                r2.setImageByteArray(r3)
                android.view.View r2 = r2.getView()
                android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
                r5 = 1086324736(0x40c00000, float:6.0)
                r3.<init>(r0, r1, r5)
                r2.setLayoutParams(r3)
            L_0x00f5:
                r8.f262116e = r2
                if (r2 != 0) goto L_0x0101
                java.lang.String r9 = r9.f262113a
                java.lang.String r2 = "createVideoContainerView, audioPlayView is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r2)
                goto L_0x0104
            L_0x0101:
                r8.addView(r2)
            L_0x0104:
                android.widget.Space r9 = new android.widget.Space
                r9.<init>(r10)
                android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
                r10.<init>(r0, r1, r4)
                r9.setLayoutParams(r10)
                r8.f262117f = r9
                r8.addView(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1066yc.C91403e0.C91405b.<init>(yc.e0, android.content.Context):void");
        }

        /* renamed from: a */
        public void mo122016a(C87558e eVar) {
            String str = C91403e0.this.f262113a;
            Log.m105924i(str, "onModeConfirmed, mode: " + eVar);
            if (C87558e.PORTRAIT == eVar) {
                ((LinearLayout.LayoutParams) this.f262115d.getLayoutParams()).weight = 75.0f;
                ((LinearLayout.LayoutParams) this.f262117f.getLayoutParams()).weight = 75.0f;
                ((LinearLayout.LayoutParams) this.f262116e.getLayoutParams()).weight = 48.0f;
            }
        }
    }

    public C91403e0(C91418n nVar) {
        this.f262114b = nVar;
    }

    /* renamed from: a */
    public void mo109565a(View view, Runnable runnable) {
        String str = this.f262113a;
        Log.m105924i(str, "transferTo, view: " + view);
        if (runnable != null) {
            Log.m105924i(this.f262113a, "transferTo, run afterTransferToTask");
            runnable.run();
        }
    }

    /* renamed from: b */
    public void mo109554b(View view, Runnable runnable) {
        String str = this.f262113a;
        Log.m105924i(str, "transferFrom, view: " + view);
        if (runnable != null) {
            Log.m105924i(this.f262113a, "transferFrom, run afterTransferFromTask");
            runnable.run();
        }
    }
}
