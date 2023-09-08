package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import java.util.Objects;
import p1094c4.C104293d;

public class DialogFragment extends HellAndroidXFragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId = -1;
    private boolean mCancelable = true;
    private boolean mCreatingDialog;
    /* access modifiers changed from: private */
    public Dialog mDialog;
    private boolean mDialogCreated = false;
    private Runnable mDismissRunnable = new C112867a();
    private boolean mDismissed;
    private Handler mHandler;
    private C0120a0<C0125s> mObserver = new C112870d();
    private DialogInterface.OnCancelListener mOnCancelListener = new C112868b();
    /* access modifiers changed from: private */
    public DialogInterface.OnDismissListener mOnDismissListener = new C112869c();
    private boolean mShownByMe;
    /* access modifiers changed from: private */
    public boolean mShowsDialog = true;
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mViewDestroyed;

    /* renamed from: androidx.fragment.app.DialogFragment$a */
    public class C112867a implements Runnable {
        public C112867a() {
        }

        public void run() {
            DialogFragment.this.mOnDismissListener.onDismiss(DialogFragment.this.mDialog);
        }
    }

    /* renamed from: androidx.fragment.app.DialogFragment$b */
    public class C112868b implements DialogInterface.OnCancelListener {
        public C112868b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (DialogFragment.this.mDialog != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onCancel(dialogFragment.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.DialogFragment$c */
    public class C112869c implements DialogInterface.OnDismissListener {
        public C112869c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogFragment.this.mDialog != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onDismiss(dialogFragment.mDialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.DialogFragment$d */
    public class C112870d implements C0120a0<C0125s> {
        public C112870d() {
        }

        public void onChanged(Object obj) {
            if (((C0125s) obj) != null && DialogFragment.this.mShowsDialog) {
                View requireView = DialogFragment.this.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (DialogFragment.this.mDialog != null) {
                    if (FragmentManager.isLoggingEnabled(3)) {
                        Objects.toString(DialogFragment.this.mDialog);
                    }
                    DialogFragment.this.mDialog.setContentView(requireView);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.DialogFragment$e */
    public class C112871e extends C112946o {

        /* renamed from: d */
        public final /* synthetic */ C112946o f337907d;

        public C112871e(C112946o oVar) {
            this.f337907d = oVar;
        }

        /* renamed from: b */
        public View mo164813b(int i) {
            View onFindViewById = DialogFragment.this.onFindViewById(i);
            if (onFindViewById != null) {
                return onFindViewById;
            }
            if (this.f337907d.mo164814c()) {
                return this.f337907d.mo164813b(i);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo164814c() {
            return DialogFragment.this.onHasView() || this.f337907d.mo164814c();
        }
    }

    public DialogFragment() {
    }

    private void dismissInternal(boolean z, boolean z2) {
        if (!this.mDismissed) {
            this.mDismissed = true;
            this.mShownByMe = false;
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.mDialog.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.mHandler.getLooper()) {
                        onDismiss(this.mDialog);
                    } else {
                        this.mHandler.post(this.mDismissRunnable);
                    }
                }
            }
            this.mViewDestroyed = true;
            if (this.mBackStackId >= 0) {
                getParentFragmentManager().popBackStack(this.mBackStackId, 1);
                this.mBackStackId = -1;
                return;
            }
            C112919c0 beginTransaction = getParentFragmentManager().beginTransaction();
            beginTransaction.mo165169k(this);
            if (z) {
                beginTransaction.mo165163e();
            } else {
                beginTransaction.mo165162d();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void prepareDialog(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(onCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
                this.mCreatingDialog = false;
            } catch (Throwable th) {
                this.mCreatingDialog = false;
                throw th;
            }
        }
    }

    public C112946o createFragmentContainer() {
        return new C112871e(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.mObserver);
        if (!this.mShownByMe) {
            this.mDismissed = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (FragmentManager.isLoggingEnabled(3)) {
            toString();
        }
        return new Dialog(requireContext(), getTheme());
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.mObserver);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.mViewDestroyed) {
            if (FragmentManager.isLoggingEnabled(3)) {
                toString();
            }
            dismissInternal(true, true);
        }
    }

    /* access modifiers changed from: package-private */
    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.mShowsDialog || this.mCreatingDialog) {
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("getting layout inflater for DialogFragment ");
                sb.append(this);
            }
            return onGetLayoutInflater;
        }
        prepareDialog(bundle);
        if (FragmentManager.isLoggingEnabled(2)) {
            toString();
        }
        Dialog dialog = this.mDialog;
        return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
    }

    /* access modifiers changed from: package-private */
    public boolean onHasView() {
        return this.mDialogCreated;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            decorView.setTag(C0966R.C0970id.l8r, this);
            decorView.setTag(C0966R.C0970id.l8t, this);
            C104293d.m139245b(decorView, this);
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i, int i2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            toString();
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = 16973913;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C112919c0 beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.mo165167i(0, this, str, 1);
        beginTransaction.mo165162d();
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C112919c0 beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.mo165167i(0, this, str, 1);
        beginTransaction.mo165164f();
    }

    public int show(C112919c0 c0Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        c0Var.mo165167i(0, this, str, 1);
        this.mViewDestroyed = false;
        int d = c0Var.mo165162d();
        this.mBackStackId = d;
        return d;
    }

    public DialogFragment(int i) {
        super(i);
    }
}
