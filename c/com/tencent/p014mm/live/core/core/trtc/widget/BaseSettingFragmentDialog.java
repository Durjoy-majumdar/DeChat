package com.tencent.p014mm.live.core.core.trtc.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;

/* renamed from: com.tencent.mm.live.core.core.trtc.widget.BaseSettingFragmentDialog */
public abstract class BaseSettingFragmentDialog extends DialogFragment {
    public abstract int getLayoutId();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(getLayoutId(), viewGroup, false);
    }

    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            window.setAttributes(attributes);
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.getWindow().setLayout((int) (((double) displayMetrics.widthPixels) * 0.9d), (int) (((double) displayMetrics.heightPixels) * 0.8d));
            }
        }
    }
}
