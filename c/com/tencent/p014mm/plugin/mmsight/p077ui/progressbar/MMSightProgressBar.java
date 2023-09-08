package com.tencent.p014mm.plugin.mmsight.p077ui.progressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg3.C76577a;
import n72.C109692a;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.progressbar.MMSightProgressBar */
public class MMSightProgressBar extends View {

    /* renamed from: h */
    public static final int f313970h = C76577a.m92151b(MMApplicationContext.getContext(), 3);

    /* renamed from: i */
    public static final int f313971i = C76577a.m92151b(MMApplicationContext.getContext(), 5);

    /* renamed from: d */
    public List<C109692a> f313972d = new ArrayList(5);

    /* renamed from: e */
    public int f313973e = 0;

    /* renamed from: f */
    public Paint f313974f;

    /* renamed from: g */
    public MMHandler f313975g = null;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.progressbar.MMSightProgressBar$a */
    public class C105560a extends MMHandler {
        public C105560a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 233) {
                MMSightProgressBar.this.getClass();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.progressbar.MMSightProgressBar$b */
    public interface C105561b {
    }

    static {
        Color.parseColor("#F5B3B2");
        Color.parseColor("#EB6866");
        Color.parseColor("#E64340");
    }

    public MMSightProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo150412a();
    }

    /* renamed from: a */
    public final void mo150412a() {
        Paint paint = new Paint();
        this.f313974f = paint;
        paint.setColor(-65536);
        this.f313974f.setAntiAlias(true);
        this.f313975g = new C105560a(Looper.getMainLooper());
        Log.m164298i("MicroMsg.MMSightProgressBar", "init, pointRadius: %s, pointDistance: %s", Integer.valueOf(f313970h), Integer.valueOf(f313971i));
    }

    public void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        super.onDraw(canvas);
        int save = canvas.save();
        int size = ((ArrayList) this.f313972d).size();
        this.f313973e = size;
        if (size % 2 == 0) {
            int i3 = f313971i;
            f = (((float) i3) / 2.0f) + ((float) (((size / 2) - 1) * i3));
            i2 = size / 2;
            i = f313970h;
        } else {
            i = f313970h;
            f = (((float) i) / 2.0f) + ((float) ((size / 2) * f313971i));
            i2 = size / 2;
        }
        float f2 = -(f + ((float) (i2 * i)));
        Log.m164292d("MicroMsg.MMSightProgressBar", "draw, translateX: %s, currentPointCount: %s", Float.valueOf(f2), Integer.valueOf(this.f313973e));
        canvas.translate(f2, 0.0f);
        Iterator it = ((ArrayList) this.f313972d).iterator();
        while (it.hasNext()) {
            C109692a aVar = (C109692a) it.next();
            Paint paint = this.f313974f;
            aVar.getClass();
            paint.setColor(0);
            aVar.getClass();
            aVar.getClass();
            int i4 = f313971i;
            int i5 = f313970h;
            aVar.f328333a = (float) (0 + ((i4 + (i5 * 2)) * 0));
            aVar.getClass();
            aVar.f328334b = (float) 0;
            Log.m164292d("MicroMsg.MMSightProgressPoint", "draw, index: %s, pointX: %s", 0, Float.valueOf(aVar.f328333a));
            canvas.drawCircle(aVar.f328333a, aVar.f328334b, (float) i5, paint);
            paint.setShader((Shader) null);
        }
        canvas.restoreToCount(save);
    }

    public void setProgressCallback(C105561b bVar) {
    }

    public MMSightProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo150412a();
    }
}
