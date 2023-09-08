package com.tencent.kinda.framework.widget.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KProgressDialog;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import nj3.C76879j;

public class MMKProgressDialogImpl implements KProgressDialog {
    private static final String TAG = "MMKProgressDialogImpl";
    private KindaCacheServiceImpl kindaCacheService = new KindaCacheServiceImpl();
    /* access modifiers changed from: private */
    public Dialog mDialogImpl;
    /* access modifiers changed from: private */
    public Dialog mLoadingImpl;
    /* access modifiers changed from: private */
    public Dialog mPayProcessImpl;

    /* access modifiers changed from: private */
    public void finishUIPageFragmentActivity() {
        Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity instanceof UIPageFragmentActivity) {
            UIPageFragmentActivity uIPageFragmentActivity = (UIPageFragmentActivity) topOrUIPageFragmentActivity;
            if (uIPageFragmentActivity.mo93520I7()) {
                uIPageFragmentActivity.finish();
            } else {
                Log.m105924i(TAG, "finishUIPageFragmentActivity, UIPageFragmentActivity shouldn't finish!");
            }
        } else {
            Log.m105924i(TAG, "finishUIPageFragmentActivity, UIPageFragmentActivity no found!");
        }
    }

    private void runInMainThread(Runnable runnable) {
        if (MMHandlerThread.isMainThread()) {
            runnable.run();
        } else {
            MMHandlerThread.postToMainThread(runnable);
        }
    }

    /* access modifiers changed from: private */
    public void setKindaDismissDialog() {
        KindaCacheServiceImpl kindaCacheServiceImpl = this.kindaCacheService;
        if (kindaCacheServiceImpl != null) {
            kindaCacheServiceImpl.setBool("kindaShowingDialog", false, 0);
            Log.m105924i(TAG, "setKindaDismissDialog");
        }
    }

    /* access modifiers changed from: private */
    public void setKindaShowingDialog() {
        KindaCacheServiceImpl kindaCacheServiceImpl = this.kindaCacheService;
        if (kindaCacheServiceImpl != null) {
            kindaCacheServiceImpl.setBool("kindaShowingDialog", true, 0);
            Log.m105924i(TAG, "setKindaShowingDialog");
        }
    }

    public void dismiss() {
        Dialog dialog = this.mDialogImpl;
        if (dialog != null && dialog.isShowing()) {
            this.mDialogImpl.dismiss();
        }
        Dialog dialog2 = this.mPayProcessImpl;
        if (dialog2 != null && dialog2.isShowing()) {
            this.mPayProcessImpl.dismiss();
        }
        Dialog dialog3 = this.mLoadingImpl;
        if (dialog3 != null && dialog3.isShowing()) {
            this.mLoadingImpl.dismiss();
        }
    }

    public void showCustomLoading(final String str, final boolean z) {
        final Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            Log.m105920e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            runInMainThread(new Runnable() {
                public void run() {
                    Dialog unused = MMKProgressDialogImpl.this.mLoadingImpl = C75197d0.m90162c(topOrUIPageFragmentActivity, str, !z, new DialogInterface.OnCancelListener() {
                        public void onCancel(DialogInterface dialogInterface) {
                            if (MMKProgressDialogImpl.this.mLoadingImpl != null) {
                                MMKProgressDialogImpl.this.mLoadingImpl.dismiss();
                                Dialog unused = MMKProgressDialogImpl.this.mLoadingImpl = null;
                            }
                        }
                    });
                    Context context = topOrUIPageFragmentActivity;
                    if (context instanceof MMActivity) {
                        ((MMActivity) context).addDialog(MMKProgressDialogImpl.this.mLoadingImpl);
                    }
                }
            });
        }
    }

    public void showImpl(String str, final boolean z, final VoidCallback voidCallback) {
        final Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            Log.m105920e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            runInMainThread(new Runnable() {
                public void run() {
                    Dialog unused = MMKProgressDialogImpl.this.mDialogImpl = C75197d0.m90164e(topOrUIPageFragmentActivity, z, new DialogInterface.OnCancelListener() {
                        public void onCancel(DialogInterface dialogInterface) {
                            voidCallback.call();
                            Dialog unused = MMKProgressDialogImpl.this.mDialogImpl = null;
                        }
                    });
                    Context context = topOrUIPageFragmentActivity;
                    if (context instanceof MMActivity) {
                        ((MMActivity) context).addDialog(MMKProgressDialogImpl.this.mDialogImpl);
                    }
                }
            });
        }
    }

    public void showNormalGlobalLoading(final boolean z) {
        final Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
            return;
        }
        final String string = context.getString(C0966R.string.l4g);
        runInMainThread(new Runnable() {
            public void run() {
                Dialog unused = MMKProgressDialogImpl.this.mLoadingImpl = C75197d0.m90162c(context, string, !z, new DialogInterface.OnCancelListener() {
                    public void onCancel(DialogInterface dialogInterface) {
                        if (MMKProgressDialogImpl.this.mLoadingImpl != null) {
                            MMKProgressDialogImpl.this.mLoadingImpl.dismiss();
                            Dialog unused = MMKProgressDialogImpl.this.mLoadingImpl = null;
                        }
                    }
                });
                Context context = context;
                if (context instanceof MMActivity) {
                    ((MMActivity) context).addDialog(MMKProgressDialogImpl.this.mLoadingImpl);
                }
            }
        });
    }

    public void showNormalLoading(final boolean z) {
        final Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            Log.m105920e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
            return;
        }
        final String string = topOrUIPageFragmentActivity.getString(C0966R.string.l4g);
        runInMainThread(new Runnable() {
            public void run() {
                Dialog unused = MMKProgressDialogImpl.this.mLoadingImpl = C75197d0.m90162c(topOrUIPageFragmentActivity, string, !z, new DialogInterface.OnCancelListener() {
                    public void onCancel(DialogInterface dialogInterface) {
                        if (MMKProgressDialogImpl.this.mLoadingImpl != null) {
                            MMKProgressDialogImpl.this.mLoadingImpl.dismiss();
                            Dialog unused = MMKProgressDialogImpl.this.mLoadingImpl = null;
                        }
                    }
                });
                Context context = topOrUIPageFragmentActivity;
                if (context instanceof MMActivity) {
                    ((MMActivity) context).addDialog(MMKProgressDialogImpl.this.mLoadingImpl);
                }
            }
        });
    }

    public void showPayGlobalLoading(final boolean z) {
        final Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            Log.m105920e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            runInMainThread(new Runnable() {
                public void run() {
                    Dialog unused = MMKProgressDialogImpl.this.mDialogImpl = C75197d0.m90164e(topOrUIPageFragmentActivity, !z, new DialogInterface.OnCancelListener() {
                        public void onCancel(DialogInterface dialogInterface) {
                            Dialog unused = MMKProgressDialogImpl.this.mDialogImpl = null;
                        }
                    });
                    MMKProgressDialogImpl.this.mDialogImpl.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        public void onDismiss(DialogInterface dialogInterface) {
                            MMKProgressDialogImpl.this.setKindaDismissDialog();
                            MMKProgressDialogImpl.this.finishUIPageFragmentActivity();
                        }
                    });
                    if (topOrUIPageFragmentActivity instanceof MMActivity) {
                        MMKProgressDialogImpl.this.setKindaShowingDialog();
                        ((MMActivity) topOrUIPageFragmentActivity).addDialog(MMKProgressDialogImpl.this.mDialogImpl);
                    }
                }
            });
        }
    }

    public void showPayProcessImpl(final boolean z, final VoidCallback voidCallback) {
        final Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "MMKProgressDialogImpl showPayProcessImpl() KindaContext.get() return null! case 2");
        } else {
            runInMainThread(new Runnable() {
                public void run() {
                    Dialog unused = MMKProgressDialogImpl.this.mPayProcessImpl = C75197d0.m90164e(context, z, new DialogInterface.OnCancelListener() {
                        public void onCancel(DialogInterface dialogInterface) {
                            voidCallback.call();
                            Dialog unused = MMKProgressDialogImpl.this.mPayProcessImpl = null;
                        }
                    });
                    Context context = context;
                    if (context instanceof MMActivity) {
                        ((MMActivity) context).addDialog(MMKProgressDialogImpl.this.mPayProcessImpl);
                    }
                }
            });
        }
    }

    public void showToast(String str) {
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "MMKProgressDialogImpl showToast() KindaContext.get() return null! case 3");
        } else {
            C76879j.m92726T(context, str);
        }
    }

    public void showTopLoading(String str, final boolean z) {
        final Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "MMKProgressDialogImpl can't startLoading because the context is null!");
            return;
        }
        final String string = context.getString(C0966R.string.l4f);
        runInMainThread(new Runnable() {
            public void run() {
                Dialog unused = MMKProgressDialogImpl.this.mLoadingImpl = C75197d0.m90162c(context, string, !z, new DialogInterface.OnCancelListener() {
                    public void onCancel(DialogInterface dialogInterface) {
                        if (MMKProgressDialogImpl.this.mLoadingImpl != null) {
                            MMKProgressDialogImpl.this.mLoadingImpl.dismiss();
                            Dialog unused = MMKProgressDialogImpl.this.mLoadingImpl = null;
                        }
                    }
                });
                Context context = context;
                if (context instanceof MMActivity) {
                    ((MMActivity) context).addDialog(MMKProgressDialogImpl.this.mLoadingImpl);
                }
            }
        });
    }
}
