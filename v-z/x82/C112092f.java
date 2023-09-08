package x82;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.HashSet;
import x82.C112095g;

/* renamed from: x82.f */
public final class C112092f extends C112124u {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112092f(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        int[] iArr = {1, 3, 4};
        for (int i = 0; i < 3; i++) {
            hashSet.add(Integer.valueOf(iArr[i]));
        }
        String string = getContext().getResources().getString(C0966R.string.if6);
        C87412m.m108593f(string, "context.resources.getStr…_func_send_to_friend_btn)");
        String string2 = getContext().getResources().getString(C0966R.string.if4);
        C87412m.m108593f(string2, "context.resources.getStr…screen_more_func_fav_btn)");
        String string3 = getContext().getResources().getString(C0966R.string.if5);
        C87412m.m108593f(string3, "context.resources.getStr…more_func_sav_to_picture)");
        String string4 = getContext().getResources().getString(C0966R.string.ifm);
        C87412m.m108593f(string4, "context.resources.getStr…n_projector_clear_screen)");
        C112095g.C38462a[] aVarArr = {new C112095g.C38462a(string, 5), new C112095g.C38462a(string2, 6), new C112095g.C38462a(string3, 7), new C112095g.C38462a(string4, 8)};
        for (int i2 = 0; i2 < 4; i2++) {
            hashSet2.add(aVarArr[i2]);
        }
        int[] iArr2 = {11, 9};
        for (int i3 = 0; i3 < 2; i3++) {
            hashSet3.add(Integer.valueOf(iArr2[i3]));
        }
        setScreenFuncConfig(new C112095g(hashSet, hashSet2, hashSet3, 3));
        LayoutInflater.from(getContext()).inflate(getLayoutId(), this);
        setMReadyLayout((FrameLayout) findViewById(C0966R.C0970id.afp));
        setMEditLayout((FrameLayout) findViewById(C0966R.C0970id.afo));
        setBottomRoot((FrameLayout) findViewById(C0966R.C0970id.afn));
        setTopRoot((FrameLayout) findViewById(C0966R.C0970id.afq));
        setAvatarRoot((FrameLayout) findViewById(C0966R.C0970id.afm));
        FrameLayout mEditLayout = getMEditLayout();
        if (mEditLayout != null) {
            mEditLayout.setVisibility(8);
        }
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        setMultiTalkStrokeContext(new C112079b(context2, this, getScreenFuncConfig()));
        Context context3 = getContext();
        C87412m.m108593f(context3, "context");
        setTopUiLayout(new C112083c0(context3, this));
        Context context4 = getContext();
        C87412m.m108593f(context4, "context");
        setAvatarLayout(new C112113q(context4, this));
        Context context5 = getContext();
        C87412m.m108593f(context5, "context");
        setBottomUiLayout(new C112114r(context5, this, getScreenFuncConfig()));
        setMScreenReportData(new C112096g0());
        Context context6 = getContext();
        C87412m.m108593f(context6, "context");
        setReadyUI(new C112093f0(context6, this, getScreenFuncConfig()));
        mo163807o();
        mo163809q(true);
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C112090e(this));
        }
    }

    public View getBackgroundView() {
        return getMEditLayout();
    }

    public String getCurrentFileMd5() {
        return null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bhq;
    }
}
