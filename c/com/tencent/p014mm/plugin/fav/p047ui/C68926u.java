package com.tencent.p014mm.plugin.fav.p047ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;

/* renamed from: com.tencent.mm.plugin.fav.ui.u */
public class C68926u implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DialogInterface.OnClickListener f198041d;

    /* renamed from: e */
    public final /* synthetic */ Fragment f198042e;

    /* renamed from: f */
    public final /* synthetic */ C75018a.C75024d f198043f;

    /* renamed from: g */
    public final /* synthetic */ C75018a.C75025e f198044g;

    /* renamed from: h */
    public final /* synthetic */ Activity f198045h;

    public C68926u(DialogInterface.OnClickListener onClickListener, Fragment fragment, C75018a.C75024d dVar, C75018a.C75025e eVar, Activity activity) {
        this.f198041d = onClickListener;
        this.f198042e = fragment;
        this.f198043f = dVar;
        this.f198044g = eVar;
        this.f198045h = activity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        DialogInterface.OnClickListener onClickListener = this.f198041d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -2);
        }
        Fragment fragment = this.f198042e;
        if (fragment != null) {
            View view = fragment.getView();
            Fragment fragment2 = this.f198042e;
            if (fragment2 instanceof MMFragment) {
                view = ((MMFragment) fragment2).getContentView();
            }
            C75026b.m89955e(this.f198042e.getContext(), view, this.f198042e.getActivity().getString(C0966R.string.cph), this.f198042e.getActivity().getString(C0966R.string.cmy), this.f198043f, this.f198044g);
            return;
        }
        Activity activity = this.f198045h;
        C75026b.m89954d(activity, activity.getString(C0966R.string.cph), this.f198045h.getString(C0966R.string.cmy), this.f198043f, this.f198044g);
    }
}
