package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.game.model.C42143x;
import p823sg.C101611g;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameMessageListUserIconView */
public class GameMessageListUserIconView extends LinearLayout implements C111847h {

    /* renamed from: d */
    public Context f114068d;

    /* renamed from: e */
    public C42143x f114069e;

    /* renamed from: f */
    public C101611g<String, Bitmap> f114070f;

    public GameMessageListUserIconView(Context context) {
        super(context);
        this.f114068d = context;
        if (this.f114069e == null) {
            this.f114069e = new C42143x(context);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f114069e == null) {
            this.f114069e = new C42143x(this.f114068d);
        }
    }

    public void setSourceScene(int i) {
        C42143x xVar = this.f114069e;
        if (xVar != null) {
            xVar.f113589d = i;
        } else {
            this.f114069e = new C42143x(this.f114068d, i);
        }
    }

    public GameMessageListUserIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114068d = context;
        if (this.f114069e == null) {
            this.f114069e = new C42143x(context);
        }
    }
}
