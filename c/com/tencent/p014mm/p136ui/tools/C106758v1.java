package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import android.widget.EditText;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.ui.tools.v1 */
public class C106758v1 {

    /* renamed from: a */
    public List<C106759b> f319153a;

    /* renamed from: b */
    public WeakReference<EditText> f319154b;

    /* renamed from: c */
    public ArrayList<String> f319155c;

    /* renamed from: d */
    public String f319156d;

    /* renamed from: e */
    public boolean f319157e;

    /* renamed from: com.tencent.mm.ui.tools.v1$a */
    public static class C74862a extends Drawable {

        /* renamed from: h */
        public static int f220104h;

        /* renamed from: a */
        public Paint f220105a;

        /* renamed from: b */
        public Paint f220106b;

        /* renamed from: c */
        public String f220107c;

        /* renamed from: d */
        public float f220108d;

        /* renamed from: e */
        public float f220109e;

        /* renamed from: f */
        public float f220110f;

        /* renamed from: g */
        public RectF f220111g;

        public C74862a(Context context, String str, Paint paint) {
            Paint paint2 = new Paint(1);
            this.f220105a = paint2;
            paint2.setColor(-7829368);
            this.f220106b = paint;
            int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 2.0f);
            f220104h = fromDPToPix;
            float f = (float) fromDPToPix;
            this.f220108d = f;
            this.f220109e = f;
            this.f220107c = str;
            this.f220110f = this.f220106b.measureText(str);
            Paint.FontMetrics fontMetrics = this.f220106b.getFontMetrics();
            float f2 = this.f220110f;
            float f3 = (float) (f220104h * 2);
            setBounds(0, 0, (int) (f2 + f3 + f3), (int) ((float) Math.ceil((double) (fontMetrics.bottom - fontMetrics.top))));
            Log.m105925i("MicroMsg.TextDrawable", "setText(%s).", str);
        }

        public void draw(Canvas canvas) {
            canvas.drawRoundRect(this.f220111g, this.f220108d, this.f220109e, this.f220105a);
            Rect bounds = getBounds();
            RectF rectF = this.f220111g;
            Paint.FontMetricsInt fontMetricsInt = this.f220106b.getFontMetricsInt();
            int i = bounds.top;
            int i2 = fontMetricsInt.top;
            canvas.drawText(this.f220107c, (float) ((int) (((((float) (bounds.right - bounds.left)) - (rectF.right - rectF.left)) + ((float) (f220104h * 2))) / 2.0f)), (float) ((i + ((((bounds.bottom - i) - fontMetricsInt.bottom) + i2) / 2)) - i2), this.f220106b);
        }

        public int getOpacity() {
            return this.f220105a.getAlpha() < 255 ? -3 : -1;
        }

        public void setAlpha(int i) {
            if (i != this.f220105a.getAlpha()) {
                this.f220105a.setAlpha(i);
                invalidateSelf();
            }
        }

        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            Paint.FontMetrics fontMetrics = this.f220106b.getFontMetrics();
            int i5 = f220104h;
            this.f220111g = new RectF((float) (i + i5), ((float) i2) + (fontMetrics.ascent - fontMetrics.top), (float) (i3 - i5), (float) i4);
            invalidateSelf();
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.f220105a.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.v1$b */
    public static class C106759b {

        /* renamed from: a */
        public int f319158a;

        /* renamed from: b */
        public int f319159b;

        /* renamed from: c */
        public boolean f319160c;

        public C106759b(int i, int i2, boolean z) {
            this.f319158a = i;
            this.f319159b = i2;
            this.f319160c = z;
        }
    }

    public C106758v1(EditText editText) {
        this.f319154b = new WeakReference<>(editText);
    }

    /* renamed from: a */
    public static List<C106759b> m144164a(String str, ArrayList<String> arrayList) {
        int indexOf;
        if (Util.isNullOrNil(str) || arrayList == null || arrayList.size() == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i > length) {
                break;
            }
            Iterator<String> it = arrayList.iterator();
            int i2 = length;
            int i3 = 0;
            while (it.hasNext()) {
                String next = it.next();
                if (!Util.isNullOrNil(next) && (indexOf = str.indexOf(next, i)) >= 0) {
                    if (indexOf < i2 || (indexOf == i2 && next.length() > i3)) {
                        i3 = next.length();
                        i2 = indexOf;
                    }
                }
            }
            if (i2 < length) {
                if (i2 > i) {
                    arrayList2.add(new C106759b(i, i2 - i, false));
                }
                arrayList2.add(new C106759b(i2, i3, true));
                i = i2 + i3;
            } else if (i2 > i) {
                arrayList2.add(new C106759b(i, i2 - i, false));
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    public static boolean m144165b(EditText editText, ArrayList<String> arrayList) {
        int i;
        String obj = editText.getText().toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List<C106759b> a = m144164a(obj, arrayList);
        if (a != null) {
            ArrayList arrayList2 = (ArrayList) a;
            if (arrayList2.size() > 0) {
                int selectionStart = editText.getSelectionStart();
                int selectionEnd = editText.getSelectionEnd();
                Context context = editText.getContext();
                TextPaint paint = editText.getPaint();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C106759b bVar = (C106759b) it.next();
                    int i2 = bVar.f319158a;
                    int i3 = bVar.f319159b;
                    if (i2 < 0 || i3 <= 0 || (i = i2 + i3) > obj.length()) {
                        Log.m105925i("MicroMsg.WordsChecker", "start : %d, length : %d.", Integer.valueOf(i2), Integer.valueOf(i3));
                    } else if (bVar.f319160c) {
                        String substring = obj.substring(i2, i);
                        SpannableString spannableString = new SpannableString(substring);
                        spannableString.setSpan(new ImageSpan(new C74862a(context, substring, paint), 0), 0, substring.length(), 33);
                        spannableStringBuilder.append(spannableString);
                    } else {
                        spannableStringBuilder.append(obj.substring(i2, i));
                    }
                }
                if (spannableStringBuilder.length() > 0) {
                    editText.setText(spannableStringBuilder);
                    editText.setTextKeepState(spannableStringBuilder);
                    if (selectionStart == selectionEnd && selectionStart >= 0) {
                        editText.setSelection(selectionStart);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final C106759b mo153870c(Editable editable, int i) {
        List<C106759b> list = this.f319153a;
        if (list == null) {
            return null;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C106759b bVar = (C106759b) it.next();
            int i2 = bVar.f319158a;
            if (i <= bVar.f319159b + i2 && i > i2) {
                return bVar;
            }
        }
        return null;
    }
}
