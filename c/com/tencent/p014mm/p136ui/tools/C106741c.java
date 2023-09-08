package com.tencent.p014mm.p136ui.tools;

import android.app.Activity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.WXActionMenuView;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76874e0;
import p206nj.C76860a;

/* renamed from: com.tencent.mm.ui.tools.c */
public class C106741c {

    /* renamed from: a */
    public int f319107a;

    /* renamed from: b */
    public WXActionMenuView.C74963a f319108b;

    /* renamed from: c */
    public boolean f319109c = false;

    /* renamed from: d */
    public C76874e0 f319110d;

    /* renamed from: e */
    public int f319111e;

    /* renamed from: f */
    public int f319112f;

    public C106741c(Activity activity, WXActionMenuView.C74963a aVar) {
        this.f319110d = new C76874e0(activity);
        this.f319108b = aVar;
        int b = C76860a.m92656b(activity, (int) activity.getResources().getDimension(activity.getResources().getConfiguration().orientation == 2 ? C0966R.dimen.f3678b8 : C0966R.dimen.f3679b9));
        this.f319107a = b;
        this.f319111e = b * 3;
        this.f319112f = (int) activity.getResources().getDimension(C0966R.dimen.f4151u6);
        Log.m105925i("MicroMsg.ActionBarMenuViewHelper", "mDefaultNormalActionbarHeight: %s, needTitleCenterMode: %s.", Integer.valueOf(this.f319107a), Boolean.valueOf(this.f319108b.f220471a));
    }
}
