package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceHeaderPreference */
public final class VoiceHeaderPreference extends Preference {

    /* renamed from: J */
    public MMActivity f21690J;

    /* renamed from: K */
    public TextView f21691K;

    /* renamed from: L */
    public TextView f21692L;

    /* renamed from: M */
    public Button f21693M;

    /* renamed from: N */
    public View f21694N;

    /* renamed from: P */
    public View.OnClickListener f21695P;

    /* renamed from: Q */
    public String f21696Q;

    /* renamed from: R */
    public String f21697R;

    public VoiceHeaderPreference(Context context) {
        this(context, (AttributeSet) null);
        this.f21690J = (MMActivity) context;
    }

    /* renamed from: I */
    public void mo6728I(View.OnClickListener onClickListener) {
        this.f21695P = onClickListener;
        Button button = this.f21693M;
        if (button != null && this.f21694N != null) {
            if (button == null || onClickListener == null) {
                button.setVisibility(8);
                View view = this.f21694N;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceHeaderPreference", "setButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/voiceprint/ui/VoiceHeaderPreference", "setButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            button.setOnClickListener(onClickListener);
            this.f21693M.setVisibility(0);
            View view3 = this.f21694N;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceHeaderPreference", "setButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/voiceprint/ui/VoiceHeaderPreference", "setButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: J */
    public void mo6729J(String str, String str2) {
        this.f21696Q = str;
        this.f21697R = str2;
        if (this.f21691K != null) {
            if (!Util.isNullOrNil(str)) {
                this.f21691K.setText(this.f21696Q);
                this.f21691K.setVisibility(0);
            } else {
                this.f21691K.setVisibility(8);
            }
        }
        if (this.f21692L == null) {
            return;
        }
        if (!Util.isNullOrNil(this.f21697R)) {
            this.f21692L.setText(this.f21697R);
            this.f21692L.setVisibility(0);
            return;
        }
        this.f21692L.setVisibility(8);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        View.OnClickListener onClickListener;
        View view2 = view;
        super.mo1086w(view);
        ImageView imageView = (ImageView) view2.findViewById(C0966R.C0970id.f359519lb2);
        this.f21691K = (TextView) view2.findViewById(C0966R.C0970id.f359520lb3);
        this.f21692L = (TextView) view2.findViewById(C0966R.C0970id.lb5);
        this.f21693M = (Button) view2.findViewById(C0966R.C0970id.itd);
        this.f21694N = view2.findViewById(C0966R.C0970id.aon);
        if (!Util.isNullOrNil(this.f21696Q)) {
            this.f21691K.setText(this.f21696Q);
            this.f21691K.setVisibility(0);
        } else {
            this.f21691K.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f21697R)) {
            this.f21692L.setText(this.f21697R);
            this.f21692L.setVisibility(0);
        } else {
            this.f21692L.setVisibility(8);
        }
        Button button = this.f21693M;
        if (button == null || (onClickListener = this.f21695P) == null) {
            button.setVisibility(8);
            View view3 = this.f21694N;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceHeaderPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/voiceprint/ui/VoiceHeaderPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        button.setOnClickListener(onClickListener);
        this.f21693M.setVisibility(0);
        View view5 = this.f21694N;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceHeaderPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/voiceprint/ui/VoiceHeaderPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public VoiceHeaderPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f21690J = (MMActivity) context;
    }

    public VoiceHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21695P = null;
        this.f21696Q = "";
        this.f21697R = "";
        this.f21690J = (MMActivity) context;
        this.f121271G = C0966R.C0971layout.ccm;
    }
}
