package com.tencent.kinda.framework.widget.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.framework.widget.tools.ResourcesUtils;
import com.tencent.kinda.gen.KAlertDialog;
import com.tencent.kinda.gen.KImage;
import com.tencent.kinda.gen.KView;
import com.tencent.kinda.gen.TextAlign;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.kinda.gen.VoidStringCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import g63.C45890a;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kg3.C76577a;
import nj3.C76879j;
import p1035sf.C90183c;
import qo3.C77389a;
import qo3.C77390c0;
import qo3.C77398g;

public class AlertDialogImpl implements KAlertDialog {
    private static final String PATTERN_FILE = "file://";
    private static final String PATTERN_HTTP = "http://";
    private static final String PATTERN_HTTPS = "https://";
    private static final String TAG = "AlertDialogImpl";
    private KindaCacheServiceImpl kindaCacheService = new KindaCacheServiceImpl();
    private WeakReference<Dialog> mDialog = null;

    public class TipsImage extends MMKImageView {
        public TipsImage() {
        }

        public void updateView(CdnImageView cdnImageView) {
            this.view = cdnImageView;
        }
    }

    private void finishUIPageFragmentActivity() {
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

    private Dialog getDialog() {
        WeakReference<Dialog> weakReference = this.mDialog;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private Drawable getDrawable(String str) {
        Bitmap bitmap;
        if (str == null) {
            return null;
        }
        if (str.startsWith(PATTERN_FILE)) {
            bitmap = BitmapUtil.getBitmapNative(str.replaceFirst(PATTERN_FILE, ""));
        } else {
            int drawableId = ResourcesUtils.getDrawableId(MMApplicationContext.getContext(), str);
            if (drawableId == 0) {
                drawableId = ResourcesUtils.getResId(MMApplicationContext.getContext(), str, ShareConstants.DEXMODE_RAW);
            }
            bitmap = BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), drawableId);
            if (bitmap == null) {
                try {
                    Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(drawableId);
                    if (drawable != null) {
                        return drawable;
                    }
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (bitmap != null) {
            return new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap);
        }
        return null;
    }

    private void setDialog(Dialog dialog) {
        this.mDialog = new WeakReference<>(dialog);
    }

    private void setKindaDismissDialog() {
        KindaCacheServiceImpl kindaCacheServiceImpl = this.kindaCacheService;
        if (kindaCacheServiceImpl != null) {
            kindaCacheServiceImpl.setBool("kindaShowingDialog", false, 0);
            Log.m105924i(TAG, "setKindaDismissDialog");
        }
    }

    private void setKindaShowingDialog() {
        KindaCacheServiceImpl kindaCacheServiceImpl = this.kindaCacheService;
        if (kindaCacheServiceImpl != null) {
            kindaCacheServiceImpl.setBool("kindaShowingDialog", true, 0);
            Log.m105924i(TAG, "setKindaShowingDialog");
        }
    }

    public void dismiss() {
        if (getDialog() == null) {
            Log.m105920e(TAG, "getDialog() == null");
            return;
        }
        getDialog().dismiss();
        setKindaDismissDialog();
        finishUIPageFragmentActivity();
    }

    public void setContentAlign(TextAlign textAlign) {
    }

    public void showImpl(String str, String str2, String str3, final VoidCallback voidCallback) {
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 1");
            return;
        }
        setDialog(C76879j.m92711E(context, str2, str, str3, false, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                VoidCallback voidCallback = voidCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
            }
        }));
        setKindaShowingDialog();
    }

    public void showInputAlertImpl(String str, String str2, String str3, int i, VoidStringCallback voidStringCallback, VoidCallback voidCallback) {
        Log.m105924i(TAG, "showInputAlertImpl");
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "AlertDialogImpl showInputAlertImpl() KindaContext.get() return null!");
            return;
        }
        final VoidStringCallback voidStringCallback2 = voidStringCallback;
        C6755519 r9 = new C76879j.C47267l() {
            public boolean onFinish(CharSequence charSequence) {
                Log.m105925i(AlertDialogImpl.TAG, "ok: %s", charSequence);
                VoidStringCallback voidStringCallback = voidStringCallback2;
                voidStringCallback.call(charSequence + "");
                return true;
            }
        };
        final VoidCallback voidCallback2 = voidCallback;
        setDialog(C45890a.m51175a(context, str, str2, str3, false, i, r9, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105925i(AlertDialogImpl.TAG, "cancel: %s", voidCallback2);
                voidCallback2.call();
                AlertDialogImpl.this.dismiss();
            }
        }));
        setKindaShowingDialog();
    }

    public void showTipsImpl(String str, String str2, String str3, final VoidCallback voidCallback) {
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 4");
            return;
        }
        setDialog(C76879j.m92711E(context, str2, str, str3, false, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                VoidCallback voidCallback = voidCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
            }
        }));
        setKindaShowingDialog();
    }

    public void showTouchIdAuthViewImpl(String str, VoidStringCallback voidStringCallback, VoidCallback voidCallback, VoidCallback voidCallback2, VoidCallback voidCallback3) {
    }

    public void showImpl(String str, String str2, String str3, String str4, final VoidCallback voidCallback, final VoidCallback voidCallback2) {
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 2");
            return;
        }
        setDialog(C76879j.m92709C(context, str2, str, str4, str3, false, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                VoidCallback voidCallback = voidCallback2;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
            }
        }, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                VoidCallback voidCallback = voidCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
            }
        }));
        setKindaShowingDialog();
    }

    public void showTipsImpl(String str, String str2, String str3, String str4, final VoidCallback voidCallback, final VoidCallback voidCallback2) {
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 5");
            return;
        }
        setDialog(C76879j.m92709C(context, str2, str, str4, str3, false, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                VoidCallback voidCallback = voidCallback2;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
            }
        }, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                VoidCallback voidCallback = voidCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
            }
        }));
        setKindaShowingDialog();
    }

    public void showImpl(String str, String str2, String str3, String str4, String str5, final VoidCallback voidCallback, VoidCallback voidCallback2, VoidCallback voidCallback3) {
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 3");
            return;
        }
        VoidCallback voidCallback4 = voidCallback;
        final VoidCallback voidCallback5 = voidCallback2;
        C77398g C = C76879j.m92709C(context, str2, str, str3, str4, false, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                VoidCallback voidCallback = voidCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
            }
        }, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                VoidCallback voidCallback = voidCallback5;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
            }
        });
        final VoidCallback voidCallback6 = voidCallback3;
        C.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                VoidCallback voidCallback = voidCallback6;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
            }
        });
        setDialog(C);
        setKindaShowingDialog();
    }

    public void showTipsImpl(String str, String str2, String str3, String str4, String str5, final VoidCallback voidCallback, VoidCallback voidCallback2, VoidCallback voidCallback3) {
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 6");
            return;
        }
        C77390c0 c0Var = new C77390c0(context, C0966R.style.a66);
        c0Var.setContentView(C67448R.C67450layout.b3i);
        TextView textView = (TextView) c0Var.findViewById(C67448R.C67449id.fgn);
        TextView textView2 = (TextView) c0Var.findViewById(C67448R.C67449id.fgm);
        TextView textView3 = (TextView) c0Var.findViewById(C67448R.C67449id.fgj);
        TextView textView4 = (TextView) c0Var.findViewById(C67448R.C67449id.fgk);
        TextView textView5 = (TextView) c0Var.findViewById(C67448R.C67449id.fgl);
        if (!C90183c.m112859g(str)) {
            textView.setVisibility(0);
            String str6 = str;
            textView.setText(str);
        }
        if (!C90183c.m112859g(str2)) {
            textView2.setVisibility(0);
            String str7 = str2;
            textView2.setText(str2);
        }
        String str8 = str3;
        textView3.setText(str3);
        String str9 = str4;
        textView4.setText(str4);
        String str10 = str5;
        textView5.setText(str5);
        VoidCallback voidCallback4 = voidCallback;
        textView3.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/AlertDialogImpl$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                VoidCallback voidCallback = voidCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/AlertDialogImpl$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        final VoidCallback voidCallback5 = voidCallback2;
        textView4.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/AlertDialogImpl$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                VoidCallback voidCallback = voidCallback5;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/AlertDialogImpl$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        final VoidCallback voidCallback6 = voidCallback3;
        textView5.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/AlertDialogImpl$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                VoidCallback voidCallback = voidCallback6;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/AlertDialogImpl$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        c0Var.setCancelable(false);
        c0Var.show();
        setDialog(c0Var);
        setKindaShowingDialog();
    }

    public void showImpl(String str, KView kView, String str2, String str3, final VoidCallback voidCallback, final VoidCallback voidCallback2) {
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 8");
        } else if (kView instanceof MMKView) {
            C77389a aVar = new C77389a();
            aVar.f225669z = true;
            aVar.f225668y = false;
            aVar.f225627J = ((MMKView) kView).getView();
            aVar.f225644a = str;
            aVar.f225664u = str2;
            aVar.f225621D = new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    VoidCallback voidCallback = voidCallback;
                    if (voidCallback != null) {
                        voidCallback.call();
                    }
                    AlertDialogImpl.this.dismiss();
                }
            };
            aVar.f225663t = str3;
            aVar.f225620C = new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    VoidCallback voidCallback = voidCallback2;
                    if (voidCallback != null) {
                        voidCallback.call();
                    }
                    AlertDialogImpl.this.dismiss();
                }
            };
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
            setDialog(gVar);
            setKindaShowingDialog();
        } else {
            Log.m105920e(TAG, "show alert with contentView, contentView requires to be MMKView");
            showImpl(str, "", str2, str3, voidCallback, voidCallback2);
        }
    }

    public void showTipsImpl(String str, String str2, String str3, String str4, final VoidCallback voidCallback) {
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 7");
            return;
        }
        C77390c0 c0Var = new C77390c0(context, C0966R.style.a66);
        c0Var.setContentView(C67448R.C67450layout.b3e);
        TextView textView = (TextView) c0Var.findViewById(C67448R.C67449id.f361860titleTv);
        CdnImageView cdnImageView = (CdnImageView) c0Var.findViewById(C67448R.C67449id.brv);
        TextView textView2 = (TextView) c0Var.findViewById(C67448R.C67449id.bsk);
        TextView textView3 = (TextView) c0Var.findViewById(C67448R.C67449id.f361848btn1);
        textView.setText(str);
        if (Util.isNullOrNil(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        if (str2 != null) {
            cdnImageView.setVisibility(0);
            if (str2.startsWith("http://") || str2.startsWith("https://")) {
                cdnImageView.setUrl(str2);
            } else {
                Drawable drawable = getDrawable(str2);
                if (drawable != null) {
                    cdnImageView.setImageDrawable(drawable);
                }
            }
        } else {
            cdnImageView.setVisibility(8);
        }
        textView2.setText(str3);
        if (Util.isNullOrNil(str3)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
        textView3.setText(str4);
        textView3.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/AlertDialogImpl$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                VoidCallback voidCallback = voidCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/AlertDialogImpl$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        c0Var.setCancelable(false);
        c0Var.show();
        setDialog(c0Var);
        setKindaShowingDialog();
    }

    public void showTipsImpl(String str, KImage kImage, String str2, String str3, VoidCallback voidCallback) {
        KImage kImage2 = kImage;
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 7");
            return;
        }
        C77390c0 c0Var = new C77390c0(context, C0966R.style.a66);
        c0Var.setContentView(C67448R.C67450layout.b3e);
        TextView textView = (TextView) c0Var.findViewById(C67448R.C67449id.f361860titleTv);
        CdnImageView cdnImageView = (CdnImageView) c0Var.findViewById(C67448R.C67449id.brv);
        TextView textView2 = (TextView) c0Var.findViewById(C67448R.C67449id.bsk);
        TextView textView3 = (TextView) c0Var.findViewById(C67448R.C67449id.f361848btn1);
        String str4 = str;
        textView.setText(str);
        if (Util.isNullOrNil(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        final TipsImage tipsImage = new TipsImage();
        if (kImage2 != null) {
            cdnImageView.setVisibility(0);
            tipsImage.initWithPlatformDelegate(new UIPagePlatformDelegateImpl(context));
            tipsImage.setView(cdnImageView);
            if (kImage2 instanceof MMKImage) {
                MMKImage mMKImage = (MMKImage) kImage2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((CdnImageView) tipsImage.getView()).getLayoutParams();
                if ((layoutParams instanceof LinearLayout.LayoutParams) && (mMKImage.getInputWidth() > 0.0f || mMKImage.getInputHeight() > 0.0f)) {
                    layoutParams.width = C76577a.m92150a(context, mMKImage.getInputWidth());
                    layoutParams.height = C76577a.m92150a(context, mMKImage.getInputHeight());
                    ((CdnImageView) tipsImage.getView()).setLayoutParams(layoutParams);
                }
            }
            tipsImage.setImage(kImage2);
        } else {
            cdnImageView.setVisibility(8);
        }
        textView2.setText(str2);
        if (Util.isNullOrNil(str2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            if (Util.isNullOrNil(str)) {
                textView2.setTypeface((Typeface) null, 1);
            }
        }
        textView3.setText(str3);
        final VoidCallback voidCallback2 = voidCallback;
        textView3.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/AlertDialogImpl$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                VoidCallback voidCallback = voidCallback2;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                tipsImage.setViewId("");
                AlertDialogImpl.this.dismiss();
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/AlertDialogImpl$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        c0Var.setCancelable(false);
        c0Var.show();
        setDialog(c0Var);
        setKindaShowingDialog();
    }

    public void showTipsImpl(String str, String str2, String str3, String str4, String str5, final VoidCallback voidCallback, final VoidCallback voidCallback2) {
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 8");
            return;
        }
        C77390c0 c0Var = new C77390c0(context, C0966R.style.a66);
        c0Var.setContentView(C67448R.C67450layout.b3f);
        TextView textView = (TextView) c0Var.findViewById(C67448R.C67449id.f361860titleTv);
        CdnImageView cdnImageView = (CdnImageView) c0Var.findViewById(C67448R.C67449id.brv);
        TextView textView2 = (TextView) c0Var.findViewById(C67448R.C67449id.bsk);
        TextView textView3 = (TextView) c0Var.findViewById(C67448R.C67449id.fmq);
        TextView textView4 = (TextView) c0Var.findViewById(C67448R.C67449id.itd);
        textView.setText(str);
        if (Util.isNullOrNil(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        if (str2 != null) {
            cdnImageView.setVisibility(0);
            if (str2.startsWith("http://") || str2.startsWith("https://")) {
                cdnImageView.setUrl(str2);
            } else {
                Drawable drawable = getDrawable(str2);
                if (drawable != null) {
                    cdnImageView.setImageDrawable(drawable);
                }
            }
        } else {
            cdnImageView.setVisibility(8);
        }
        textView2.setText(str3);
        if (Util.isNullOrNil(str3)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
        textView3.setText(str4);
        textView4.setText(str5);
        textView3.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/AlertDialogImpl$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                VoidCallback voidCallback = voidCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/AlertDialogImpl$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/AlertDialogImpl$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                VoidCallback voidCallback = voidCallback2;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                AlertDialogImpl.this.dismiss();
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/AlertDialogImpl$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        c0Var.setCancelable(false);
        c0Var.show();
        setDialog(c0Var);
        setKindaShowingDialog();
    }

    public void showTipsImpl(String str, KImage kImage, String str2, String str3, String str4, VoidCallback voidCallback, VoidCallback voidCallback2) {
        KImage kImage2 = kImage;
        Context context = KindaContext.get();
        if (context == null) {
            Log.m105920e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 8");
            return;
        }
        C77390c0 c0Var = new C77390c0(context, C0966R.style.a66);
        c0Var.setContentView(C67448R.C67450layout.b3f);
        TextView textView = (TextView) c0Var.findViewById(C67448R.C67449id.f361860titleTv);
        CdnImageView cdnImageView = (CdnImageView) c0Var.findViewById(C67448R.C67449id.brv);
        TextView textView2 = (TextView) c0Var.findViewById(C67448R.C67449id.bsk);
        TextView textView3 = (TextView) c0Var.findViewById(C67448R.C67449id.fmq);
        TextView textView4 = (TextView) c0Var.findViewById(C67448R.C67449id.itd);
        textView.setText(str);
        if (Util.isNullOrNil(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        final TipsImage tipsImage = new TipsImage();
        if (kImage2 != null) {
            cdnImageView.setVisibility(0);
            tipsImage.initWithPlatformDelegate(new UIPagePlatformDelegateImpl(context));
            tipsImage.setView(cdnImageView);
            if (kImage2 instanceof MMKImage) {
                MMKImage mMKImage = (MMKImage) kImage2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((CdnImageView) tipsImage.getView()).getLayoutParams();
                if ((layoutParams instanceof LinearLayout.LayoutParams) && (mMKImage.getInputWidth() > 0.0f || mMKImage.getInputHeight() > 0.0f)) {
                    layoutParams.width = C76577a.m92150a(context, mMKImage.getInputWidth());
                    layoutParams.height = C76577a.m92150a(context, mMKImage.getInputHeight());
                    ((CdnImageView) tipsImage.getView()).setLayoutParams(layoutParams);
                }
            }
            tipsImage.setImage(kImage2);
        } else {
            cdnImageView.setVisibility(8);
        }
        textView2.setText(str2);
        if (Util.isNullOrNil(str2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            if (Util.isNullOrNil(str)) {
                textView2.setTypeface((Typeface) null, 1);
            }
        }
        textView3.setText(str3);
        textView4.setText(str4);
        final VoidCallback voidCallback3 = voidCallback;
        textView3.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/AlertDialogImpl$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                VoidCallback voidCallback = voidCallback3;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                tipsImage.setViewId("");
                AlertDialogImpl.this.dismiss();
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/AlertDialogImpl$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        final VoidCallback voidCallback4 = voidCallback2;
        textView4.setOnClickListener(new View.OnClickListener() {
            private byte _hellAccFlag_;

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/kinda/framework/widget/base/AlertDialogImpl$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                VoidCallback voidCallback = voidCallback4;
                if (voidCallback != null) {
                    voidCallback.call();
                }
                tipsImage.setViewId("");
                AlertDialogImpl.this.dismiss();
                C117292a.m165361g(this, "com/tencent/kinda/framework/widget/base/AlertDialogImpl$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        c0Var.setCancelable(false);
        c0Var.show();
        setDialog(c0Var);
        setKindaShowingDialog();
    }
}
