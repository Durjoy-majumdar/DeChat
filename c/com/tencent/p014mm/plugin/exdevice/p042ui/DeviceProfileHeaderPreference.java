package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.DeviceProfileHeaderPreference */
public class DeviceProfileHeaderPreference extends Preference {

    /* renamed from: J */
    public ImageView f110966J;

    /* renamed from: K */
    public TextView f110967K;

    /* renamed from: L */
    public TextView f110968L;

    /* renamed from: M */
    public TextView f110969M;

    /* renamed from: N */
    public View f110970N;

    /* renamed from: P */
    public TextView f110971P;

    /* renamed from: Q */
    public boolean[] f110972Q = new boolean[6];

    /* renamed from: R */
    public View.OnClickListener[] f110973R = new View.OnClickListener[6];

    /* renamed from: S */
    public String f110974S;

    /* renamed from: T */
    public String f110975T;

    /* renamed from: U */
    public CharSequence f110976U;

    /* renamed from: V */
    public String f110977V;

    /* renamed from: W */
    public MMActivity f110978W;

    public DeviceProfileHeaderPreference(Context context) {
        super(context);
        this.f110978W = (MMActivity) context;
    }

    /* renamed from: I */
    public final void mo64267I(View view, int i) {
        int i2 = this.f110972Q[i] ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/DeviceProfileHeaderPreference", "attachToView", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/exdevice/ui/DeviceProfileHeaderPreference", "attachToView", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setOnClickListener(this.f110973R[i]);
    }

    /* renamed from: J */
    public void mo64268J(String str) {
        this.f110977V = str;
        if (this.f110966J != null) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            Bitmap bitmapNative = BitmapUtil.getBitmapNative((int) C0966R.C0969drawable.bfs);
            if (bitmapNative != null && !bitmapNative.isRecycled() && (bitmapNative = BitmapUtil.getRoundedCornerBitmap(bitmapNative, true, ((float) bitmapNative.getWidth()) * 0.5f)) != null && !bitmapNative.isRecycled()) {
                bVar.f59360p = new BitmapDrawable(bitmapNative);
            }
            if (bitmapNative == null || bitmapNative.isRecycled()) {
                bVar.f59359o = C0966R.C0969drawable.bfs;
            }
            bVar.f59364t = true;
            C20828a.m22825b().mo32519h(this.f110977V, this.f110966J, bVar.mo32666a());
        }
    }

    /* renamed from: K */
    public void mo64269K(int i, View.OnClickListener onClickListener) {
        View view;
        if (i == 0) {
            view = this.f110966J;
        } else if (i == 1) {
            view = this.f110968L;
        } else if (i == 2) {
            view = this.f110967K;
        } else if (i == 3) {
            view = this.f110969M;
        } else if (i == 4) {
            view = this.f110970N;
        } else if (i == 5) {
            view = this.f110971P;
        } else {
            return;
        }
        this.f110973R[i] = onClickListener;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: L */
    public void mo64270L(int i, boolean z) {
        View view;
        if (i == 0) {
            view = this.f110966J;
        } else if (i == 1) {
            view = this.f110968L;
        } else if (i == 2) {
            view = this.f110967K;
        } else if (i == 3) {
            view = this.f110969M;
        } else if (i == 4) {
            view = this.f110970N;
        } else if (i == 5) {
            view = this.f110971P;
        } else {
            return;
        }
        this.f110972Q[i] = !z;
        if (view != null) {
            int i2 = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/DeviceProfileHeaderPreference", "setViewVisible", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/exdevice/ui/DeviceProfileHeaderPreference", "setViewVisible", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        Log.m105918d("MicroMsg.DeviceProfileHeaderPreference", "onBindView");
        this.f110966J = (ImageView) view.findViewById(C0966R.C0970id.a1q);
        this.f110967K = (TextView) view.findViewById(C0966R.C0970id.h_3);
        this.f110968L = (TextView) view.findViewById(C0966R.C0970id.cap);
        this.f110969M = (TextView) view.findViewById(C0966R.C0970id.c49);
        this.f110970N = view.findViewById(C0966R.C0970id.caq);
        this.f110971P = (TextView) view.findViewById(C0966R.C0970id.c48);
        mo64267I(this.f110966J, 0);
        mo64267I(this.f110967K, 2);
        mo64267I(this.f110968L, 1);
        mo64267I(this.f110969M, 3);
        mo64267I(this.f110970N, 4);
        mo64267I(this.f110971P, 5);
        this.f110967K.setText(this.f110976U);
        this.f110969M.setText(this.f110975T);
        this.f110971P.setText(this.f110974S);
        mo64268J(this.f110977V);
        super.mo1086w(view);
    }

    public DeviceProfileHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f110978W = (MMActivity) context;
    }

    public DeviceProfileHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f110978W = (MMActivity) context;
    }
}
