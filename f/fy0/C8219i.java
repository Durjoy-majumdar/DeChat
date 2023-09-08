package fy0;

import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: fy0.i */
public final class C8219i {

    /* renamed from: a */
    public static final C8219i f27144a = new C8219i();

    /* renamed from: b */
    public static final C13601g f27145b = C36568h.m40985a(C8221b.f27147d);

    /* renamed from: fy0.i$a */
    public static final class C8220a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C8220a f27146d = new C8220a();

        public C8220a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: fy0.i$b */
    public static final class C8221b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C8221b f27147d = new C8221b();

        public C8221b() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_time_line_only_show_stat_data, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        C36568h.m40985a(C8220a.f27146d);
    }

    /* renamed from: a */
    public final void mo9270a(TextView textView) {
        TextPaint textPaint = null;
        TextPaint paint = textView != null ? textView.getPaint() : null;
        if (paint != null) {
            paint.setStyle(Paint.Style.FILL);
        }
        if (textView != null) {
            textPaint = textView.getPaint();
        }
        if (textPaint != null) {
            textPaint.setStrokeWidth(0.0f);
        }
    }

    /* renamed from: b */
    public final void mo9271b(TextView textView) {
        TextPaint textPaint = null;
        TextPaint paint = textView != null ? textView.getPaint() : null;
        if (paint != null) {
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        if (textView != null) {
            textPaint = textView.getPaint();
        }
        if (textPaint != null) {
            textPaint.setStrokeWidth(0.8f);
        }
    }

    /* renamed from: c */
    public final void mo9272c(MMNeat7extView mMNeat7extView) {
        TextPaint textPaint = null;
        TextPaint paint = mMNeat7extView != null ? mMNeat7extView.getPaint() : null;
        if (paint != null) {
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        if (mMNeat7extView != null) {
            textPaint = mMNeat7extView.getPaint();
        }
        if (textPaint != null) {
            textPaint.setStrokeWidth(0.8f);
        }
    }
}
