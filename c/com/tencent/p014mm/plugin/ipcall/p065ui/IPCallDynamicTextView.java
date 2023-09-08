package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView */
public class IPCallDynamicTextView extends TextView {

    /* renamed from: d */
    public double f346165d;

    /* renamed from: e */
    public String f346166e;

    /* renamed from: f */
    public double f346167f;

    /* renamed from: g */
    public double f346168g;

    /* renamed from: h */
    public int f346169h = 4000;

    /* renamed from: i */
    public int f346170i = 50;

    /* renamed from: j */
    public DecimalFormat f346171j = new DecimalFormat("0.00");

    /* renamed from: n */
    public String f346172n = "";

    /* renamed from: o */
    public String f346173o = "";

    /* renamed from: p */
    public MMHandler f346174p = new C115459a();

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView$a */
    public class C115459a extends MMHandler {
        public C115459a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                IPCallDynamicTextView iPCallDynamicTextView = IPCallDynamicTextView.this;
                double d = iPCallDynamicTextView.f346165d;
                if ((d <= 0.0d || iPCallDynamicTextView.f346167f >= iPCallDynamicTextView.f346168g) && (d >= 0.0d || iPCallDynamicTextView.f346167f <= iPCallDynamicTextView.f346168g)) {
                    iPCallDynamicTextView.getClass();
                    IPCallDynamicTextView iPCallDynamicTextView2 = IPCallDynamicTextView.this;
                    IPCallDynamicTextView.m162315a(iPCallDynamicTextView2, iPCallDynamicTextView2.f346168g);
                    return;
                }
                iPCallDynamicTextView.getClass();
                IPCallDynamicTextView iPCallDynamicTextView3 = IPCallDynamicTextView.this;
                IPCallDynamicTextView.m162315a(iPCallDynamicTextView3, iPCallDynamicTextView3.f346167f);
                IPCallDynamicTextView iPCallDynamicTextView4 = IPCallDynamicTextView.this;
                iPCallDynamicTextView4.f346167f += iPCallDynamicTextView4.f346165d;
                iPCallDynamicTextView4.f346174p.sendEmptyMessageDelayed(1, (long) iPCallDynamicTextView4.f346170i);
            }
        }
    }

    public IPCallDynamicTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getViewTreeObserver().addOnGlobalLayoutListener(new C115460c0(this));
    }

    /* renamed from: a */
    public static void m162315a(IPCallDynamicTextView iPCallDynamicTextView, double d) {
        if (d == iPCallDynamicTextView.f346168g) {
            iPCallDynamicTextView.setText(iPCallDynamicTextView.f346166e);
            return;
        }
        iPCallDynamicTextView.setText(iPCallDynamicTextView.f346172n + iPCallDynamicTextView.f346171j.format(d) + iPCallDynamicTextView.f346173o);
    }

    /* renamed from: b */
    public void mo175397b(String str, String str2) {
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            setText(str2);
            return;
        }
        int i = 0;
        String str3 = "";
        int i2 = 0;
        while (true) {
            try {
                if (i2 >= str.length()) {
                    break;
                } else if (Character.isDigit(str.charAt(i2))) {
                    break;
                } else {
                    str3 = str3 + str.charAt(i2);
                    i2++;
                }
            } catch (NumberFormatException unused) {
                setText(str2);
                return;
            }
        }
        int length = str.length() - 1;
        String str4 = "";
        while (true) {
            if (length <= 0) {
                break;
            } else if (Character.isDigit(str.charAt(length))) {
                break;
            } else {
                str4 = str4 + str.charAt(length);
                length--;
            }
        }
        this.f346167f = Double.parseDouble(str.substring(str3.length(), str.length() - str4.length()));
        this.f346172n = "";
        while (i < str2.length() && !Character.isDigit(str2.charAt(i))) {
            this.f346172n += str2.charAt(i);
            i++;
        }
        this.f346173o = "";
        int length2 = str2.length() - 1;
        while (length2 > 0 && !Character.isDigit(str2.charAt(length2))) {
            this.f346173o += str2.charAt(length2);
            length2--;
        }
        try {
            double parseDouble = Double.parseDouble(str2.substring(this.f346172n.length(), str2.length() - this.f346173o.length()));
            this.f346168g = parseDouble;
            this.f346166e = str2;
            double d = (parseDouble - this.f346167f) / ((double) (this.f346169h / this.f346170i));
            this.f346165d = d;
            if (d == 0.0d) {
                setText(str2);
                return;
            }
            this.f346165d = new BigDecimal(this.f346165d).setScale(2, 4).doubleValue();
            if (isShown()) {
                this.f346174p.sendEmptyMessage(1);
            }
        } catch (NumberFormatException unused2) {
            setText(str2);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getMeasuredHeight();
    }

    public void setLocHeight(int i) {
    }

    public IPCallDynamicTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getViewTreeObserver().addOnGlobalLayoutListener(new C115460c0(this));
    }
}
