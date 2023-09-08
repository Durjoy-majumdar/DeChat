package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.n3 */
public final class C69651n3 extends UIComponent {

    /* renamed from: d */
    public C77994sf2 f201027d;

    /* renamed from: e */
    public ImageView f201028e;

    /* renamed from: f */
    public ImageView f201029f;

    /* renamed from: g */
    public TextView f201030g;

    /* renamed from: h */
    public TextView f201031h;

    /* renamed from: i */
    public TextView f201032i;

    /* renamed from: j */
    public TextView f201033j;

    /* renamed from: n */
    public boolean f201034n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69651n3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final ImageView mo95878c3() {
        ImageView imageView = this.f201028e;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("envelopeIv");
        throw null;
    }
}
