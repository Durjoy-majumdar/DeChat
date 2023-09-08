package com.tencent.kinda.framework.widget.base;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.framework.app.ModalFragment;
import com.tencent.kinda.gen.IUIModalPlatformFuncDelegate;
import com.tencent.kinda.gen.VoidBoolI32Callback;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import zt3.C119157j;
import zt3.C119179t;

public class UIModalFuncDelegateImpl implements IUIModalPlatformFuncDelegate {
    private static final String TAG = "MicroMsg.kinda.UIModalFuncDelegateImpl";
    private byte _hellAccFlag_;
    /* access modifiers changed from: private */
    public VoidBoolI32Callback onKeyboardShowCallback;
    public WeakReference<MMFragment> weakFragment;

    public UIModalFuncDelegateImpl(MMFragment mMFragment) {
        this.weakFragment = new WeakReference<>(mMFragment);
    }

    public void endEditing() {
        BaseFragment baseFragment;
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
            return;
        }
        mMFragment.hideVKB();
        if (mMFragment.getActivity() != null) {
            View kBLayout = getKBLayout();
            if (kBLayout != null && kBLayout.isShown()) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(kBLayout, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "endEditing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                kBLayout.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(kBLayout, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "endEditing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            WcPayKeyboard wcPayKeyboard = getWcPayKeyboard();
            if (wcPayKeyboard != null && (baseFragment = (BaseFragment) this.weakFragment.get()) != null) {
                baseFragment.hideWcPayKeyboard();
                EditText editText = wcPayKeyboard.f220918y;
                if (editText != null) {
                    editText.clearFocus();
                }
            }
        }
    }

    public void fragmentShow(boolean z) {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
        } else if (z) {
            Log.m105924i(TAG, "show fragment.");
            mMFragment.getActivity().getSupportFragmentManager().beginTransaction().mo165171o(mMFragment).mo165163e();
        } else {
            Log.m105924i(TAG, "hide fragment.");
            mMFragment.getActivity().getSupportFragmentManager().beginTransaction().mo165168j(mMFragment).mo165163e();
        }
    }

    public void genSnapshotImpl(boolean z, final VoidCallback voidCallback) {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
        } else if (!z) {
            Log.m105924i(TAG, "hide snapshot.");
            View findViewById = mMFragment.findViewById(C67448R.C67449id.container);
            final ImageView imageView = (ImageView) mMFragment.findViewById(C67448R.C67449id.jo_);
            if (mMFragment instanceof ModalFragment) {
                float animationCutLinePosition = (float) ((int) ((ModalFragment) mMFragment).getPage().animationCutLinePosition());
                Log.m105925i(TAG, "cutPosDp %s", Float.valueOf(animationCutLinePosition));
                if (animationCutLinePosition > 0.0f) {
                    int a = C76577a.m92150a(mMFragment.getContext(), animationCutLinePosition);
                    Bitmap createBitmap = Bitmap.createBitmap(findViewById.getWidth(), findViewById.getHeight(), Bitmap.Config.ARGB_8888);
                    findViewById.draw(new Canvas(createBitmap));
                    imageView.setImageBitmap(Bitmap.createBitmap(createBitmap, 0, a, findViewById.getWidth(), findViewById.getHeight() - a));
                    imageView.postDelayed(new Runnable() {
                        public void run() {
                            imageView.setVisibility(4);
                        }
                    }, 200);
                } else {
                    imageView.setVisibility(4);
                }
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.post(new Runnable() {
                public void run() {
                    voidCallback.call();
                }
            });
        } else {
            Log.m105924i(TAG, "show snapshot.");
            View findViewById2 = mMFragment.findViewById(C67448R.C67449id.container);
            ImageView imageView2 = (ImageView) mMFragment.findViewById(C67448R.C67449id.jo_);
            Bitmap createBitmap2 = Bitmap.createBitmap(findViewById2.getWidth(), findViewById2.getHeight(), Bitmap.Config.ARGB_8888);
            findViewById2.draw(new Canvas(createBitmap2));
            imageView2.setImageBitmap(createBitmap2);
            imageView2.setVisibility(0);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.post(new Runnable() {
                public void run() {
                    voidCallback.call();
                }
            });
        }
    }

    public View getKBLayout() {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment != null) {
            return mMFragment.findViewById(C0966R.C0970id.f359359kh1);
        }
        Log.m105924i(TAG, "activity == null.");
        return null;
    }

    public WcPayKeyboard getWcPayKeyboard() {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment != null) {
            return (WcPayKeyboard) mMFragment.findViewById(C67448R.C67449id.lkw);
        }
        Log.m105924i(TAG, "activity == null.");
        return null;
    }

    public void onKeyboardShow(final boolean z, final int i) {
        if (this.onKeyboardShowCallback != null) {
            C119179t tVar = C119157j.f356862d;
            C676344 r1 = new Runnable() {
                public void run() {
                    UIModalFuncDelegateImpl.this.onKeyboardShowCallback.call(z, i);
                }
            };
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(r1, 100, false);
        }
    }

    public void refreshNavigationBar() {
        MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            Log.m105924i(TAG, "activity == null.");
        } else if (mMFragment instanceof ModalFragment) {
            ((ModalFragment) mMFragment).refreshNavigationBar();
        }
    }

    public void setKeyBoardShowCallbackImpl(VoidBoolI32Callback voidBoolI32Callback) {
        this.onKeyboardShowCallback = voidBoolI32Callback;
    }
}
