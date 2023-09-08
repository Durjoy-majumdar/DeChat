package i33;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import l23.C34168k;
import p143ds.C31274p;

/* renamed from: i33.b */
public final class C98595b {

    /* renamed from: a */
    public static final C98595b f289089a = new C98595b();

    /* renamed from: b */
    public static final float f289090b = ((C32735h) C86312j.m106911c(C32735h.class)).mo58785xe(C32735h.C32737c.clicfg_finder_full_screen_inside_radio, 1.7777778f);

    /* renamed from: i33.b$a */
    public static final class C8849a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f28099d;

        public C8849a(View view) {
            this.f28099d = view;
        }

        public final void run() {
            C98595b bVar = C98595b.f289089a;
            Context context = this.f28099d.getContext();
            C87412m.m108593f(context, "context");
            Context context2 = this.f28099d.getContext();
            C87412m.m108593f(context2, "context");
            Context context3 = this.f28099d.getContext();
            C87412m.m108593f(context3, "context");
            int a = (int) bVar.mo137983a(context3, (float) this.f28099d.getPaddingTop());
            Context context4 = this.f28099d.getContext();
            C87412m.m108593f(context4, "context");
            this.f28099d.setPadding((int) bVar.mo137983a(context, (float) this.f28099d.getPaddingLeft()), a, (int) bVar.mo137983a(context2, (float) this.f28099d.getPaddingRight()), (int) bVar.mo137983a(context4, (float) this.f28099d.getPaddingBottom()));
            ViewGroup.LayoutParams layoutParams = this.f28099d.getLayoutParams();
            if (layoutParams.width > 0) {
                Context context5 = this.f28099d.getContext();
                C87412m.m108593f(context5, "context");
                layoutParams.width = (int) bVar.mo137983a(context5, (float) layoutParams.width);
            }
            if (layoutParams.height > 0) {
                Context context6 = this.f28099d.getContext();
                C87412m.m108593f(context6, "context");
                layoutParams.height = (int) bVar.mo137983a(context6, (float) layoutParams.height);
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                Context context7 = this.f28099d.getContext();
                C87412m.m108593f(context7, "context");
                layoutParams2.leftMargin = (int) bVar.mo137983a(context7, (float) layoutParams2.leftMargin);
                Context context8 = this.f28099d.getContext();
                C87412m.m108593f(context8, "context");
                layoutParams2.rightMargin = (int) bVar.mo137983a(context8, (float) layoutParams2.rightMargin);
                Context context9 = this.f28099d.getContext();
                C87412m.m108593f(context9, "context");
                layoutParams2.topMargin = (int) bVar.mo137983a(context9, (float) layoutParams2.topMargin);
                Context context10 = this.f28099d.getContext();
                C87412m.m108593f(context10, "context");
                layoutParams2.bottomMargin = (int) bVar.mo137983a(context10, (float) layoutParams2.bottomMargin);
            }
            this.f28099d.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final float mo137983a(Context context, float f) {
        C87412m.m108594g(context, "context");
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return (f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        r0.mo161388g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        throw r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[ExcHandler: all (r9v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x0042] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo137984b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "path"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_finder_jumpe_check_gop_size
            r2 = 1
            boolean r0 = r0.mo58784wf(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "getGOPSize path:"
            r1.append(r3)
            r1.append(r9)
            java.lang.String r3 = " enable:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.FinderEditUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            r4 = 0
            if (r1 != 0) goto L_0x003d
            if (r0 == 0) goto L_0x003d
            return r4
        L_0x003d:
            oj.b r0 = new oj.b
            r0.<init>()
            r0.mo161392k(r9)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
            int r1 = r0.mo161385d()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
            r5 = 0
        L_0x004a:
            if (r5 >= r1) goto L_0x0073
            android.media.MediaFormat r6 = r0.mo161386e(r5)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
            java.lang.String r7 = "extractor.getTrackFormat(i)"
            gy3.C87412m.m108593f(r6, r7)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
            java.lang.String r7 = "mime"
            java.lang.String r6 = r6.getString(r7)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
            java.lang.String r7 = "video"
            if (r6 == 0) goto L_0x0069
            boolean r6 = z04.C112550d0.m153801u(r6, r7, r4)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
            if (r6 != r2) goto L_0x0069
            r6 = 1
            goto L_0x006a
        L_0x0069:
            r6 = 0
        L_0x006a:
            if (r6 == 0) goto L_0x0070
            r0.mo161390i(r5)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
            goto L_0x0073
        L_0x0070:
            int r5 = r5 + 1
            goto L_0x004a
        L_0x0073:
            r1 = 102400(0x19000, float:1.43493E-40)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
            r5 = 0
        L_0x007b:
            int r6 = r0.mo161387f(r1, r4)     // Catch:{ Exception -> 0x0098, all -> 0x009a }
            if (r6 <= 0) goto L_0x0094
            android.media.MediaExtractor r6 = r0.f329324a     // Catch:{ Exception -> 0x0098, all -> 0x009a }
            int r6 = r6.getSampleFlags()     // Catch:{ Exception -> 0x0098, all -> 0x009a }
            if (r6 != r2) goto L_0x008e
            if (r5 <= 0) goto L_0x008e
            int r5 = r5 + 1
            goto L_0x0094
        L_0x008e:
            int r5 = r5 + 1
            r0.mo161382a()     // Catch:{ Exception -> 0x0098, all -> 0x009a }
            goto L_0x007b
        L_0x0094:
            r0.mo161388g()
            goto L_0x00a3
        L_0x0098:
            r4 = r5
            goto L_0x009f
        L_0x009a:
            r9 = move-exception
            r0.mo161388g()
            throw r9
        L_0x009f:
            r0.mo161388g()
            r5 = r4
        L_0x00a3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "path:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = "  gop:"
            r0.append(r9)
            r0.append(r5)
            java.lang.String r9 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i33.C98595b.mo137984b(java.lang.String):int");
    }

    /* renamed from: c */
    public final float mo137985c() {
        return C34168k.f92165a.mo59471a() ? 1.3333334f : 1.1666666f;
    }

    /* renamed from: d */
    public final void mo137986d(String str, String str2) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(str2, "dst");
        ((C31274p) C86312j.m106911c(C31274p.class)).mo57880LG(str, str2);
    }

    /* renamed from: e */
    public final void mo137987e(long j, int i, Bitmap bitmap, String str) {
        C87412m.m108594g(bitmap, "bitmap");
        C87412m.m108594g(str, "path");
        BitmapUtil.saveBitmapToImage(bitmap, i, Bitmap.CompressFormat.JPEG, str, false);
        int i2 = 0;
        while (j > 0 && C86013q1.m106451l(str) > j && i > 0 && i2 <= 5) {
            i -= 5;
            BitmapUtil.saveBitmapToImage(bitmap, i, Bitmap.CompressFormat.JPEG, str, false);
            i2++;
        }
        Log.m105924i("MicroMsg.FinderEditUtil", "makePhotoSizeConformity  maxSize:" + j + "  compressQuality:" + i + " size:" + C86013q1.m106450k(str));
    }

    /* renamed from: f */
    public final void mo137988f(View view) {
        C87412m.m108594g(view, "<this>");
        view.post(new C8849a(view));
    }
}
