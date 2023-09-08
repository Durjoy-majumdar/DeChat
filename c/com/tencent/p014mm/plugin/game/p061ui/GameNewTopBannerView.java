package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import uy1.C52642c;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameNewTopBannerView */
public class GameNewTopBannerView extends FrameLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public Context f114095d;

    /* renamed from: e */
    public ImageView f114096e;

    /* renamed from: f */
    public ImageView f114097f;

    /* renamed from: g */
    public int f114098g;

    /* renamed from: h */
    public int f114099h;

    /* renamed from: i */
    public int f114100i;

    /* renamed from: j */
    public String f114101j = "";

    /* renamed from: n */
    public String f114102n = null;

    public GameNewTopBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114095d = context;
    }

    /* renamed from: a */
    public final int mo66253a(ImageView imageView, int i, int i2) {
        int h = C52642c.m58990h(this.f114095d);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            Log.m105920e("MicroMsg.GameTopBannerView", "resizeGameThemePic, params is null");
            return 0;
        }
        layoutParams.height = (int) ((((float) i) / ((float) i2)) * ((float) h));
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return layoutParams.height;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameNewTopBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof String)) {
            String str = (String) view.getTag();
            if (!Util.isNullOrNil(str)) {
                C40314g.m43485d(this.f114095d, 10, 1017, 1, C52642c.m59002t(this.f114095d, str, "game_center_top_banner"), 0, (String) null, this.f114100i, 0, (String) null, (String) null, this.f114102n);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameNewTopBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f114096e = (ImageView) findViewById(C0966R.C0970id.a8y);
        this.f114097f = (ImageView) findViewById(C0966R.C0970id.jna);
        Log.m105924i("MicroMsg.GameTopBannerView", "initView finished");
    }
}
