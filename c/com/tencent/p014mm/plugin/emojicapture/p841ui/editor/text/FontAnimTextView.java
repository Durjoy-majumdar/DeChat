package com.tencent.p014mm.plugin.emojicapture.p841ui.editor.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.FontTextView;
import gy3.C87412m;
import i71.C108374c;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\rJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/FontAnimTextView;", "Landroid/widget/ImageView;", "", "getText", "", "getTextColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView */
public final class FontAnimTextView extends ImageView {

    /* renamed from: r */
    public static final /* synthetic */ int f312566r = 0;

    /* renamed from: d */
    public String[] f312567d;

    /* renamed from: e */
    public Typeface[] f312568e;

    /* renamed from: f */
    public int f312569f;

    /* renamed from: g */
    public final Runnable f312570g;

    /* renamed from: h */
    public CharSequence f312571h;

    /* renamed from: i */
    public final int f312572i;

    /* renamed from: j */
    public int f312573j;

    /* renamed from: n */
    public final Bitmap[] f312574n;

    /* renamed from: o */
    public C108374c f312575o;

    /* renamed from: p */
    public int f312576p;

    /* renamed from: q */
    public int f312577q;

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView$a */
    public static final class C105221a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FontAnimTextView f312578d;

        public C105221a(FontAnimTextView fontAnimTextView) {
            this.f312578d = fontAnimTextView;
        }

        public final void run() {
            FontAnimTextView fontAnimTextView = this.f312578d;
            int i = FontAnimTextView.f312566r;
            fontAnimTextView.mo149566b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x009e A[LOOP:1: B:14:0x009c->B:15:0x009e, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FontAnimTextView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView$a r8 = new com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView$a
            r8.<init>(r6)
            r6.f312570g = r8
            r8 = -1
            r6.f312576p = r8
            r6.f312577q = r8
            gy3.C87412m.m108591d(r7)
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131166305(0x7f070461, float:1.7946852E38)
            float r7 = r7.getDimension(r8)
            zb0.f r8 = zb0.C39332f.m42087b()
            boolean r8 = r8.mo62022a()
            r9 = 0
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x0077
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            java.lang.String r2 = "zh_TW"
            boolean r2 = gy3.C87412m.m108589b(r8, r2)
            if (r2 == 0) goto L_0x0039
            r8 = 1
            goto L_0x0040
        L_0x0039:
            java.lang.String r2 = "zh_HK"
            boolean r8 = gy3.C87412m.m108589b(r8, r2)
        L_0x0040:
            r8 = r8 ^ r0
            if (r8 == 0) goto L_0x0077
            zb0.f r8 = zb0.C39332f.m42087b()
            r8.getClass()
            r8 = 2
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.String r2 = zb0.C39332f.f105731e
            r8[r9] = r2
            java.lang.String r2 = zb0.C39332f.f105730d
            r8[r0] = r2
            r6.f312567d = r8
            i71.b r0 = new i71.b
            int r7 = (int) r7
            r0.<init>(r8, r7)
            r6.f312575o = r0
            java.lang.String[] r7 = r6.f312567d
            int r7 = r7.length
            android.graphics.Typeface[] r8 = new android.graphics.Typeface[r7]
            r0 = 0
        L_0x0065:
            if (r0 >= r7) goto L_0x0074
            java.lang.String[] r2 = r6.f312567d
            r2 = r2[r0]
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r2)
            r8[r0] = r2
            int r0 = r0 + 1
            goto L_0x0065
        L_0x0074:
            r6.f312568e = r8
            goto L_0x0095
        L_0x0077:
            java.lang.String r7 = ""
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r6.f312567d = r7
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 933(0x3a5, double:4.61E-321)
            r4 = 3
            r7.mo175912v(r2, r4)
            i71.a r7 = new i71.a
            r7.<init>()
            r6.f312575o = r7
            android.graphics.Typeface[] r7 = new android.graphics.Typeface[r0]
            r7[r9] = r1
            r6.f312568e = r7
        L_0x0095:
            android.graphics.Typeface[] r7 = r6.f312568e
            int r7 = r7.length
            r6.f312572i = r7
            android.graphics.Bitmap[] r8 = new android.graphics.Bitmap[r7]
        L_0x009c:
            if (r9 >= r7) goto L_0x00a3
            r8[r9] = r1
            int r9 = r9 + 1
            goto L_0x009c
        L_0x00a3:
            r6.f312574n = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emojicapture.p841ui.editor.text.FontAnimTextView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if ((r0.length() > 0) == true) goto L_0x0013;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo149565a() {
        /*
            r9 = this;
            java.lang.CharSequence r0 = r9.f312571h
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 != r1) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            if (r1 == 0) goto L_0x0027
            android.graphics.Bitmap[] r3 = r9.f312574n
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            sx3.C110821n.m150969p(r3, r4, r5, r6, r7, r8)
            r9.f312573j = r2
            r9.f312569f = r2
            r9.mo149566b()
            goto L_0x0030
        L_0x0027:
            java.lang.Runnable r0 = r9.f312570g
            r9.removeCallbacks(r0)
            r0 = 0
            r9.setImageBitmap(r0)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emojicapture.p841ui.editor.text.FontAnimTextView.mo149565a():void");
    }

    /* renamed from: b */
    public final void mo149566b() {
        int i = this.f312573j + 1;
        this.f312573j = i;
        this.f312573j = i % this.f312572i;
        Typeface[] typefaceArr = this.f312568e;
        int i2 = this.f312569f;
        Typeface typeface = typefaceArr[i2];
        this.f312575o.mo158886b(this.f312567d[i2]);
        int i3 = this.f312569f + 1;
        this.f312569f = i3;
        this.f312569f = i3 % this.f312568e.length;
        if (this.f312574n[this.f312573j] == null) {
            FontTextView fontTextView = new FontTextView(getContext(), (AttributeSet) null);
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            fontTextView.setMaxWidth((float) width);
            fontTextView.setTextDrawer(this.f312575o);
            fontTextView.setTypeface(typeface);
            fontTextView.mo149547b(this.f312571h, this.f312576p, this.f312577q, true);
            fontTextView.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), 0);
            Bitmap createBitmap = Bitmap.createBitmap(fontTextView.getMeasuredWidth(), fontTextView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.save();
            fontTextView.draw(canvas);
            canvas.restore();
            C87412m.m108593f(createBitmap, "bitmap");
            this.f312574n[this.f312573j] = createBitmap;
        }
        removeCallbacks(this.f312570g);
        postDelayed(this.f312570g, 100);
        setImageBitmap(this.f312574n[this.f312573j]);
    }

    /* renamed from: c */
    public final void mo149567c(CharSequence charSequence, int i, int i2) {
        this.f312571h = charSequence;
        this.f312576p = i;
        this.f312577q = i2;
        mo149565a();
    }

    public final CharSequence getText() {
        return this.f312571h;
    }

    public final int getTextColor() {
        return this.f312576p;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            mo149565a();
        }
    }

    public FontAnimTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
