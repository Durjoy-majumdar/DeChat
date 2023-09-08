package w23;

import android.graphics.Bitmap;
import android.util.Size;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.PhotoEditText;
import com.tencent.p014mm.xeffect.effect.IStickerDecoder;

/* renamed from: w23.b */
public final class C102326b implements IStickerDecoder {

    /* renamed from: a */
    public PhotoEditText f301369a;

    /* renamed from: b */
    public Bitmap f301370b;

    /* renamed from: c */
    public int f301371c;

    /* renamed from: d */
    public int f301372d;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fc A[Catch:{ Exception -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011e A[Catch:{ Exception -> 0x0153 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C102326b(android.content.Context r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "bg_color"
            java.lang.String r1 = "font_color"
            java.lang.String r2 = "context"
            gy3.C87412m.m108594g(r9, r2)
            java.lang.String r2 = "path"
            gy3.C87412m.m108594g(r10, r2)
            r8.<init>()
            r2 = 2131166306(0x7f070462, float:1.7946854E38)
            int r2 = kg3.C76577a.m92157h(r9, r2)
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r3 = new com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText
            r3.<init>(r9)
            r8.f301369a = r3
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8
            r4 = 1
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r4, r4, r3)
            java.lang.String r5 = "createBitmap(1, 1, Bitmap.Config.ALPHA_8)"
            gy3.C87412m.m108593f(r3, r5)
            r8.f301370b = r3
            r3 = 16
            int r3 = kg3.C76577a.m92151b(r9, r3)
            r5 = 8
            int r9 = kg3.C76577a.m92151b(r9, r5)
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r5 = r8.f301369a
            r5.setPadding(r3, r9, r3, r9)
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r5 = r8.f301369a
            r6 = 0
            r5.setSingleLine(r6)
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r5 = r8.f301369a
            float r2 = (float) r2
            r7 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r7
            r5.setTextSize(r6, r2)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0153 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x0153 }
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r10 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            int r5 = r2.optInt(r1)     // Catch:{ Exception -> 0x0153 }
            r10.setTextColor(r5)     // Catch:{ Exception -> 0x0153 }
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r10 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            int r5 = r2.optInt(r0)     // Catch:{ Exception -> 0x0153 }
            r10.setTextBackground(r5)     // Catch:{ Exception -> 0x0153 }
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r10 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            java.lang.String r5 = "text"
            java.lang.String r5 = r2.optString(r5)     // Catch:{ Exception -> 0x0153 }
            r10.setText(r5)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r10 = "font_style"
            java.lang.String r10 = r2.optString(r10)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r5 = "fontStyle"
            gy3.C87412m.m108593f(r10, r5)     // Catch:{ Exception -> 0x0153 }
            int r5 = r10.length()     // Catch:{ Exception -> 0x0153 }
            if (r5 <= 0) goto L_0x0085
            r5 = 1
            goto L_0x0086
        L_0x0085:
            r5 = 0
        L_0x0086:
            if (r5 == 0) goto L_0x00a0
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)     // Catch:{ Exception -> 0x0153 }
            if (r5 == 0) goto L_0x0098
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r5 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            android.graphics.Typeface r10 = android.graphics.Typeface.createFromFile(r10)     // Catch:{ Exception -> 0x0153 }
            r5.setTypeface(r10)     // Catch:{ Exception -> 0x0153 }
            goto L_0x00a9
        L_0x0098:
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r10 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT     // Catch:{ Exception -> 0x0153 }
            r10.setTypeface(r5)     // Catch:{ Exception -> 0x0153 }
            goto L_0x00a9
        L_0x00a0:
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r10 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            android.graphics.Typeface r5 = r10.getTypeface()     // Catch:{ Exception -> 0x0153 }
            r10.setTypeface(r5, r4)     // Catch:{ Exception -> 0x0153 }
        L_0x00a9:
            int r10 = r2.optInt(r0)     // Catch:{ Exception -> 0x0153 }
            if (r10 != 0) goto L_0x00bc
            int r10 = r2.optInt(r1)     // Catch:{ Exception -> 0x0153 }
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r10 == r0) goto L_0x00bc
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r10 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            o40.C61926c.m72678c(r10)     // Catch:{ Exception -> 0x0153 }
        L_0x00bc:
            android.graphics.Rect r10 = zg2.C103020m.f303987c     // Catch:{ Exception -> 0x0153 }
            int r10 = r10.width()     // Catch:{ Exception -> 0x0153 }
            if (r10 <= 0) goto L_0x00c9
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r0 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            r0.setMaxWidth(r10)     // Catch:{ Exception -> 0x0153 }
        L_0x00c9:
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r10 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            r10.measure(r6, r6)     // Catch:{ Exception -> 0x0153 }
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r10 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            int r10 = r10.getMeasuredWidth()     // Catch:{ Exception -> 0x0153 }
            if (r10 <= 0) goto L_0x00ec
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r10 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            int r10 = r10.getMeasuredWidth()     // Catch:{ Exception -> 0x0153 }
            android.graphics.Rect r0 = zg2.C103020m.f303987c     // Catch:{ Exception -> 0x0153 }
            int r0 = r0.width()     // Catch:{ Exception -> 0x0153 }
            if (r10 <= r0) goto L_0x00e5
            goto L_0x00ec
        L_0x00e5:
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r10 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            int r10 = r10.getMeasuredWidth()     // Catch:{ Exception -> 0x0153 }
            goto L_0x00f2
        L_0x00ec:
            android.graphics.Rect r10 = zg2.C103020m.f303987c     // Catch:{ Exception -> 0x0153 }
            int r10 = r10.width()     // Catch:{ Exception -> 0x0153 }
        L_0x00f2:
            r8.f301371c = r10     // Catch:{ Exception -> 0x0153 }
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r10 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            int r10 = r10.getMeasuredHeight()     // Catch:{ Exception -> 0x0153 }
            if (r10 <= 0) goto L_0x0112
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r10 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            int r10 = r10.getMeasuredHeight()     // Catch:{ Exception -> 0x0153 }
            android.graphics.Rect r0 = zg2.C103020m.f303987c     // Catch:{ Exception -> 0x0153 }
            int r0 = r0.height()     // Catch:{ Exception -> 0x0153 }
            if (r10 <= r0) goto L_0x010b
            goto L_0x0112
        L_0x010b:
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r10 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            int r10 = r10.getMeasuredHeight()     // Catch:{ Exception -> 0x0153 }
            goto L_0x0118
        L_0x0112:
            android.graphics.Rect r10 = zg2.C103020m.f303987c     // Catch:{ Exception -> 0x0153 }
            int r10 = r10.height()     // Catch:{ Exception -> 0x0153 }
        L_0x0118:
            r8.f301372d = r10     // Catch:{ Exception -> 0x0153 }
            int r0 = r8.f301371c     // Catch:{ Exception -> 0x0153 }
            if (r0 <= 0) goto L_0x0128
            if (r10 > 0) goto L_0x0121
            goto L_0x0128
        L_0x0121:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0153 }
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r0, r10, r1)     // Catch:{ Exception -> 0x0153 }
            goto L_0x012e
        L_0x0128:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x0153 }
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r4, r4, r10)     // Catch:{ Exception -> 0x0153 }
        L_0x012e:
            android.graphics.Canvas r0 = new android.graphics.Canvas     // Catch:{ Exception -> 0x0153 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x0153 }
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r1 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            r1.draw(r0)     // Catch:{ Exception -> 0x0153 }
            r0.save()     // Catch:{ Exception -> 0x0153 }
            float r1 = (float) r3     // Catch:{ Exception -> 0x0153 }
            float r9 = (float) r9     // Catch:{ Exception -> 0x0153 }
            r0.translate(r1, r9)     // Catch:{ Exception -> 0x0153 }
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoEditText r9 = r8.f301369a     // Catch:{ Exception -> 0x0153 }
            android.text.Layout r9 = r9.getLayout()     // Catch:{ Exception -> 0x0153 }
            r9.draw(r0)     // Catch:{ Exception -> 0x0153 }
            r0.restore()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r9 = "bitmap"
            gy3.C87412m.m108593f(r10, r9)     // Catch:{ Exception -> 0x0153 }
            r8.f301370b = r10     // Catch:{ Exception -> 0x0153 }
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w23.C102326b.<init>(android.content.Context, java.lang.String):void");
    }

    public void destroy() {
    }

    public long duration() {
        return 1073741824;
    }

    public Bitmap getFrame() {
        return this.f301370b;
    }

    public void seekTo(long j) {
    }

    public Size size() {
        return new Size(this.f301371c, this.f301372d);
    }
}
