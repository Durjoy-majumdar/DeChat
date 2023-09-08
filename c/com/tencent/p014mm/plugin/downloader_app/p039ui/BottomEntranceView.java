package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j51.C46398a;
import j51.C46399b;
import kg3.C76577a;
import u41.C52427g;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.BottomEntranceView */
public class BottomEntranceView extends RelativeLayout implements C111847h {

    /* renamed from: i */
    public static final /* synthetic */ int f110412i = 0;

    /* renamed from: d */
    public C52427g f110413d;

    /* renamed from: e */
    public TextView f110414e;

    /* renamed from: f */
    public ImageView f110415f;

    /* renamed from: g */
    public int f110416g;

    /* renamed from: h */
    public int f110417h;

    public BottomEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private int getDisplayHeight() {
        return C75044y4.m89990b(getContext()).y;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f110414e = (TextView) findViewById(C0966R.C0970id.ckl);
        this.f110415f = (ImageView) findViewById(C0966R.C0970id.ckj);
        float p = C76577a.m92165p(getContext());
        this.f110415f.getLayoutParams().height = (int) (((float) this.f110415f.getLayoutParams().height) * p);
        this.f110415f.getLayoutParams().width = (int) (((float) this.f110415f.getLayoutParams().width) * p);
        this.f110415f.requestLayout();
        int displayHeight = getDisplayHeight();
        int a = C75044y4.m89989a(getContext());
        this.f110417h = ((displayHeight - a) - C75044y4.m89994f(getContext())) - C75044y4.m89991c(getContext());
        this.f110416g = getResources().getDimensionPixelSize(C0966R.dimen.f4174v4);
        Log.m105919d("MicroMsg.BottomEntranceView", "mContentH = %d", Integer.valueOf(this.f110417h));
        getViewTreeObserver().addOnGlobalLayoutListener(new C46398a(this));
        setOnClickListener(new C46399b(this));
    }

    public void setData(C52427g gVar) {
        if (gVar == null || Util.isNullOrNil(gVar.f146517d) || Util.isNullOrNil(gVar.f146518e)) {
            setVisibility(8);
            return;
        }
        this.f110413d = gVar;
        setVisibility(0);
        this.f110414e.setText(this.f110413d.f146517d);
    }
}
