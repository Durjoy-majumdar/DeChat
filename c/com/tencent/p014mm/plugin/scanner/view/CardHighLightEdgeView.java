package com.tencent.p014mm.plugin.scanner.view;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.Arrays;
import p996kj.C88155a;

/* renamed from: com.tencent.mm.plugin.scanner.view.CardHighLightEdgeView */
public class CardHighLightEdgeView extends View {

    /* renamed from: d */
    public boolean[] f205565d = new boolean[4];

    /* renamed from: e */
    public boolean[] f205566e = new boolean[4];

    /* renamed from: f */
    public Rect f205567f;

    /* renamed from: g */
    public Paint f205568g;

    /* renamed from: h */
    public int f205569h;

    /* renamed from: i */
    public long f205570i;

    /* renamed from: j */
    public MMHandler f205571j = new C71026a();

    /* renamed from: com.tencent.mm.plugin.scanner.view.CardHighLightEdgeView$a */
    public class C71026a extends MMHandler {
        public C71026a() {
        }

        public void handleMessage(Message message) {
            CardHighLightEdgeView.this.f205570i = System.currentTimeMillis();
            CardHighLightEdgeView cardHighLightEdgeView = CardHighLightEdgeView.this;
            cardHighLightEdgeView.f205565d = Arrays.copyOf(cardHighLightEdgeView.f205566e, 4);
            CardHighLightEdgeView.this.invalidate();
        }
    }

    public CardHighLightEdgeView(Context context) {
        super(context);
        mo97669a();
    }

    /* renamed from: a */
    public final void mo97669a() {
        this.f205569h = C88155a.decodeResource(getResources(), C0966R.C0969drawable.cb8, (BitmapFactory.Options) null).getWidth() / 4;
        Paint paint = new Paint();
        this.f205568g = paint;
        paint.setColor(508256);
        this.f205568g.setAlpha(255);
        this.f205568g.setStrokeWidth((float) this.f205569h);
        this.f205568g.setStyle(Paint.Style.STROKE);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.f205567f;
        if (rect != null) {
            if (this.f205565d[0]) {
                int i = rect.left;
                int i2 = this.f205569h;
                canvas.drawLine((float) ((i2 / 2) + i), (float) rect.top, (float) (i + (i2 / 2)), (float) rect.bottom, this.f205568g);
            }
            if (this.f205565d[1]) {
                Rect rect2 = this.f205567f;
                int i3 = rect2.right;
                int i4 = this.f205569h;
                canvas.drawLine((float) (i3 - (i4 / 2)), (float) rect2.top, (float) (i3 - (i4 / 2)), (float) rect2.bottom, this.f205568g);
            }
            if (this.f205565d[2]) {
                Rect rect3 = this.f205567f;
                float f = (float) rect3.left;
                int i5 = rect3.top;
                int i6 = this.f205569h;
                canvas.drawLine(f, (float) ((i6 / 2) + i5), (float) rect3.right, (float) (i5 + (i6 / 2)), this.f205568g);
            }
            if (this.f205565d[3]) {
                Rect rect4 = this.f205567f;
                float f2 = (float) rect4.left;
                int i7 = rect4.bottom;
                int i8 = this.f205569h;
                canvas.drawLine(f2, (float) (i7 - (i8 / 2)), (float) rect4.right, (float) (i7 - (i8 / 2)), this.f205568g);
            }
        }
    }

    public void setCardRect(Rect rect) {
        this.f205567f = new Rect(rect);
    }

    public void setHighLightEdges(boolean[] zArr) {
        if (zArr.length == 4) {
            boolean z = false;
            Log.m105919d("MicroMsg.CardHighLightEdgeView", "%s,%s,%s,%s", Boolean.valueOf(zArr[0]), Boolean.valueOf(zArr[1]), Boolean.valueOf(zArr[2]), Boolean.valueOf(zArr[3]));
            int i = 0;
            while (true) {
                if (i >= 4) {
                    z = true;
                    break;
                } else if (this.f205565d[i]) {
                    break;
                } else {
                    i++;
                }
            }
            long j = 0;
            long currentTimeMillis = !z ? 600 - (System.currentTimeMillis() - this.f205570i) : 0;
            this.f205566e = Arrays.copyOf(zArr, 4);
            this.f205571j.removeMessages(1);
            MMHandler mMHandler = this.f205571j;
            if (currentTimeMillis > 0) {
                j = currentTimeMillis;
            }
            mMHandler.sendEmptyMessageDelayed(1, j);
        }
    }

    public CardHighLightEdgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo97669a();
    }

    public CardHighLightEdgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo97669a();
    }
}
