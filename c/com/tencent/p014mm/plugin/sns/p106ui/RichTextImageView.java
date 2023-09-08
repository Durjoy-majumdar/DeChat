package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.sns.ui.RichTextImageView */
public class RichTextImageView extends LinearLayout {

    /* renamed from: n */
    public static final /* synthetic */ int f206080n = 0;

    /* renamed from: d */
    public Activity f206081d;

    /* renamed from: e */
    public TextView f206082e;

    /* renamed from: f */
    public TextView f206083f;

    /* renamed from: g */
    public TextView f206084g;

    /* renamed from: h */
    public ImageView f206085h;

    /* renamed from: i */
    public boolean f206086i = false;

    /* renamed from: j */
    public String f206087j;

    /* renamed from: com.tencent.mm.plugin.sns.ui.RichTextImageView$a */
    public class C71201a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f206088d;

        public C71201a(int i) {
            this.f206088d = i;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.RichTextImageView$1");
            RichTextImageView richTextImageView = RichTextImageView.this;
            int i = RichTextImageView.f206080n;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            TextView textView = richTextImageView.f206083f;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            RichTextImageView richTextImageView2 = RichTextImageView.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            String str = richTextImageView2.f206087j;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            textView.setText(str.substring(0, this.f206088d));
            RichTextImageView richTextImageView3 = RichTextImageView.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            TextView textView2 = richTextImageView3.f206084g;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            RichTextImageView richTextImageView4 = RichTextImageView.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            String str2 = richTextImageView4.f206087j;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            int i2 = this.f206088d;
            RichTextImageView richTextImageView5 = RichTextImageView.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            String str3 = richTextImageView5.f206087j;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            textView2.setText(str2.substring(i2, str3.length()));
            RichTextImageView richTextImageView6 = RichTextImageView.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            TextView textView3 = richTextImageView6.f206084g;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            textView3.invalidate();
            RichTextImageView richTextImageView7 = RichTextImageView.this;
            SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            richTextImageView7.f206086i = false;
            SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            StringBuilder sb = new StringBuilder();
            sb.append("bottomH:");
            RichTextImageView richTextImageView8 = RichTextImageView.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            TextView textView4 = richTextImageView8.f206084g;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
            sb.append(textView4.getHeight());
            Log.m105920e(APMidasPayAPI.ENV_TEST, sb.toString());
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.RichTextImageView$1");
        }
    }

    public RichTextImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f206081d = (Activity) context;
        SnsMethodCalculate.markStartTimeMs("iniViews", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        View inflate = View.inflate(this.f206081d, C0966R.C0971layout.f360014c43, this);
        this.f206083f = (TextView) inflate.findViewById(C0966R.C0970id.iub);
        this.f206082e = (TextView) inflate.findViewById(C0966R.C0970id.kpq);
        this.f206084g = (TextView) inflate.findViewById(C0966R.C0970id.ai8);
        this.f206085h = (ImageView) inflate.findViewById(C0966R.C0970id.f4p);
        SnsMethodCalculate.markEndTimeMs("iniViews", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    public ImageView getImageView() {
        SnsMethodCalculate.markStartTimeMs("getImageView", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        ImageView imageView = this.f206085h;
        SnsMethodCalculate.markEndTimeMs("getImageView", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        return imageView;
    }

    public TextView getTitle() {
        SnsMethodCalculate.markStartTimeMs("getTitle", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        TextView textView = this.f206082e;
        SnsMethodCalculate.markEndTimeMs("getTitle", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        return textView;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f206086i) {
            SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        } else if (this.f206087j == null) {
            SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        } else {
            Log.m105918d("MicroMsg.RichTextImageView", "onLayout  Heighth:" + this.f206083f.getHeight() + " LineHeight:" + this.f206083f.getLineHeight());
            int height = this.f206083f.getHeight() / this.f206083f.getLineHeight();
            int lineCount = this.f206083f.getLineCount();
            Rect rect = new Rect();
            int i5 = 0;
            int i6 = 0;
            while (i5 < height) {
                try {
                    this.f206083f.getLineBounds(i5, rect);
                    i6 += rect.height();
                    if (i6 > this.f206083f.getHeight()) {
                        break;
                    }
                    i5++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (lineCount >= i5 && this.f206086i) {
                if (i5 < 1) {
                    i5 = 1;
                }
                int lineVisibleEnd = this.f206083f.getLayout().getLineVisibleEnd(i5 - 1);
                StringBuilder sb = new StringBuilder();
                sb.append("bottomH:");
                sb.append(this.f206084g.getHeight());
                sb.append("length");
                String str = this.f206087j;
                sb.append(str.substring(lineVisibleEnd, str.length()).length());
                Log.m105920e(APMidasPayAPI.ENV_TEST, sb.toString());
                Log.m105920e(APMidasPayAPI.ENV_TEST, "bottomH:" + this.f206084g.getHeight());
                if (this.f206084g.getText().length() > 0) {
                    this.f206084g.setVisibility(0);
                    this.f206086i = false;
                    new MMHandler().post(new C71201a(lineVisibleEnd));
                }
                Log.m105920e(APMidasPayAPI.ENV_TEST, "bottom:" + i4 + "   mesH:" + this.f206084g.getMeasuredHeight());
            }
            SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        }
    }

    public void setImage(int i) {
        SnsMethodCalculate.markStartTimeMs("setImage", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        this.f206085h.setImageResource(i);
        SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    public void setText(String str) {
        SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        this.f206086i = true;
        if (str == null) {
            str = "";
        }
        this.f206087j = str;
        this.f206083f.setText(str);
        requestLayout();
        SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    public void setTitle(String str) {
        SnsMethodCalculate.markStartTimeMs("setTitle", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        this.f206082e.setText(str);
        SnsMethodCalculate.markEndTimeMs("setTitle", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }

    public void setImage(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setImage", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        this.f206085h.setImageBitmap(bitmap);
        SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
    }
}
