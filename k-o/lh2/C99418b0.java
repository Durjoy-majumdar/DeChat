package lh2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import gy3.C87412m;
import hi2.C98453h;
import lh2.C109344g0;
import qh2.C101198e;

/* renamed from: lh2.b0 */
public final class C99418b0 implements C109344g0 {

    /* renamed from: d */
    public ImageView f291494d;

    /* renamed from: e */
    public String f291495e = "MicroMsg.EditVideoBgPlugin";

    /* renamed from: f */
    public Bitmap f291496f;

    /* renamed from: g */
    public Context f291497g;

    public C99418b0(ImageView imageView, C101198e eVar) {
        C87412m.m108594g(imageView, "bgView");
        C87412m.m108594g(eVar, "status");
        this.f291494d = imageView;
        this.f291497g = imageView.getContext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (r10 != null) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0089 A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138858a(h90.C98324b r9, com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider r10) {
        /*
            r8 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = r8.f291495e
            java.lang.String r1 = "initLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = 0
            if (r10 == 0) goto L_0x0018
            java.lang.Boolean r1 = r10.f272930r
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 == 0) goto L_0x00b4
            hi2.o r1 = hi2.C98464o.f288797a
            java.lang.String r2 = r9.mo137615e()
            hi2.o$a r1 = r1.mo137832a(r2)
            if (r1 == 0) goto L_0x00b4
            int r2 = r1.f288801d
            r3 = 1
            if (r2 == 0) goto L_0x0038
            r4 = 180(0xb4, float:2.52E-43)
            if (r2 != r4) goto L_0x0031
            goto L_0x0038
        L_0x0031:
            int r2 = r1.f288799b
            int r1 = r1.f288798a
            if (r2 <= r1) goto L_0x0040
            goto L_0x003e
        L_0x0038:
            int r2 = r1.f288798a
            int r1 = r1.f288799b
            if (r2 <= r1) goto L_0x0040
        L_0x003e:
            r1 = 1
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            r2 = 0
            if (r1 == 0) goto L_0x00aa
            int r10 = r10.f272905F
            r1 = 3
            if (r10 != r1) goto L_0x00aa
            tj3.h r10 = new tj3.h     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
            android.content.Context r1 = r8.f291497g     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
            r10.<init>(r1)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
            java.lang.String r1 = r9.f288180a     // Catch:{ Exception -> 0x0073 }
            int r9 = r9.f288183d     // Catch:{ Exception -> 0x0073 }
            long r4 = (long) r9     // Catch:{ Exception -> 0x0073 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            android.graphics.Bitmap r9 = f72.C97842b.m126301r(r1, r4)     // Catch:{ Exception -> 0x0073 }
            android.graphics.Bitmap r9 = o40.C61926c.m72664I(r9)     // Catch:{ Exception -> 0x0073 }
            if (r9 == 0) goto L_0x006f
            r1 = 1101004800(0x41a00000, float:20.0)
            r10.mo162692b(r9, r1)     // Catch:{ Exception -> 0x0073 }
            r8.f291496f = r9     // Catch:{ Exception -> 0x0073 }
            android.widget.ImageView r1 = r8.f291494d     // Catch:{ Exception -> 0x0073 }
            r1.setImageBitmap(r9)     // Catch:{ Exception -> 0x0073 }
        L_0x006f:
            r10.destroy()
            goto L_0x0099
        L_0x0073:
            r9 = move-exception
            goto L_0x0079
        L_0x0075:
            r9 = move-exception
            goto L_0x00a4
        L_0x0077:
            r9 = move-exception
            r10 = r2
        L_0x0079:
            java.lang.String r1 = "MicroMsg.EditVideoPlayPlugin"
            java.lang.String r4 = "rsblur exception"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x00a2 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r9, r4, r5)     // Catch:{ all -> 0x00a2 }
            int r9 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()     // Catch:{ all -> 0x00a2 }
            if (r9 < r3) goto L_0x0094
            android.content.Context r9 = r8.f291497g     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = "RenderScript Exception"
            android.widget.Toast r9 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r1, (int) r0)     // Catch:{ all -> 0x00a2 }
            r9.show()     // Catch:{ all -> 0x00a2 }
        L_0x0094:
            r8.f291496f = r2     // Catch:{ all -> 0x00a2 }
            if (r10 == 0) goto L_0x0099
            goto L_0x006f
        L_0x0099:
            th2.d r9 = th2.C110992d.f332425a
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct r9 = th2.C110992d.f332428d
            r0 = 2
            r9.f310290D = r0
            goto L_0x00b4
        L_0x00a2:
            r9 = move-exception
            r2 = r10
        L_0x00a4:
            if (r2 == 0) goto L_0x00a9
            r2.destroy()
        L_0x00a9:
            throw r9
        L_0x00aa:
            r8.f291496f = r2
            th2.d r9 = th2.C110992d.f332425a
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct r9 = th2.C110992d.f332428d
            r0 = 1
            r9.f310290D = r0
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.C99418b0.mo138858a(h90.b, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    /* renamed from: b */
    public final String mo138859b() {
        String str;
        if (this.f291496f == null) {
            return null;
        }
        C98453h hVar = C98453h.f288774a;
        String valueOf = String.valueOf(System.currentTimeMillis());
        if (valueOf == null) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder();
            String str2 = C98453h.f288776c;
            sb.append(str2 + valueOf + ".p");
            sb.append(".blurt");
            str = sb.toString();
        }
        BitmapUtil.saveBitmapToImage(this.f291496f, 100, Bitmap.CompressFormat.JPEG, str, false);
        return str;
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C99418b0.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
        Bitmap bitmap = this.f291496f;
        boolean z = false;
        if (bitmap != null && !bitmap.isRecycled()) {
            z = true;
        }
        if (z) {
            Bitmap bitmap2 = this.f291496f;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f291496f = null;
        }
    }

    public void reset() {
        ImageView imageView = this.f291494d;
        imageView.setBackgroundColor(imageView.getContext().getResources().getColor(C0966R.color.ahf));
    }

    public void setVisibility(int i) {
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
