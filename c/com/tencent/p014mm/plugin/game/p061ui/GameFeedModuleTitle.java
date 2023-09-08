package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.model.C42043c;
import com.tencent.p014mm.sdk.platformtools.Util;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedModuleTitle */
public class GameFeedModuleTitle extends LinearLayout implements C111847h {

    /* renamed from: d */
    public TextView f113891d;

    public GameFeedModuleTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113891d = (TextView) findViewById(C0966R.C0970id.eke);
    }

    public void setData(C42043c cVar) {
        if (cVar == null || Util.isNullOrNil(cVar.f113281c)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f113891d.setText(cVar.f113281c);
    }
}
