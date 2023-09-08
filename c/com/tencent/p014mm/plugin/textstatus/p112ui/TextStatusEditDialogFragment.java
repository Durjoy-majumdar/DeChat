package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.halfscreen.MMHalfScreenDialogFragment;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C36570n;
import vn3.C78456a;
import zl3.C79402d;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusEditDialogFragment;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroidx/lifecycle/r;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "activityClassName", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;", "drawerListener", "<init>", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$c;)V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditDialogFragment */
public final class TextStatusEditDialogFragment extends MMHalfScreenDialogFragment {

    /* renamed from: D */
    public static final /* synthetic */ int f207049D = 0;

    /* renamed from: A */
    public final int f207050A;

    /* renamed from: B */
    public int f207051B;

    /* renamed from: C */
    public VASActivity f207052C;

    /* renamed from: y */
    public final int f207053y;

    /* renamed from: z */
    public final int f207054z;

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditDialogFragment$a */
    public static final class C71451a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditDialogFragment f207055d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71451a(TextStatusEditDialogFragment textStatusEditDialogFragment) {
            super(0);
            this.f207055d = textStatusEditDialogFragment;
        }

        public Object invoke() {
            TextStatusEditDialogFragment textStatusEditDialogFragment = this.f207055d;
            textStatusEditDialogFragment.mo103947S(textStatusEditDialogFragment.f207050A);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditDialogFragment$b */
    public static final class C71452b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditDialogFragment f207056d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71452b(TextStatusEditDialogFragment textStatusEditDialogFragment) {
            super(0);
            this.f207056d = textStatusEditDialogFragment;
        }

        public Object invoke() {
            TextStatusEditDialogFragment textStatusEditDialogFragment = this.f207056d;
            textStatusEditDialogFragment.mo103947S(textStatusEditDialogFragment.f207051B);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditDialogFragment$c */
    public static final class C71453c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditDialogFragment f207057d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71453c(TextStatusEditDialogFragment textStatusEditDialogFragment) {
            super(1);
            this.f207057d = textStatusEditDialogFragment;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            TextStatusEditDialogFragment textStatusEditDialogFragment = this.f207057d;
            int min = Math.min(textStatusEditDialogFragment.f207054z + intValue + textStatusEditDialogFragment.f207053y, textStatusEditDialogFragment.f207050A);
            ViewGroup.LayoutParams layoutParams = this.f207057d.mo103943L().getLayoutParams();
            int i = 0;
            if (min > (layoutParams != null ? layoutParams.height : 0)) {
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(intValue);
                objArr[1] = Integer.valueOf(min);
                ViewGroup.LayoutParams layoutParams2 = this.f207057d.mo103943L().getLayoutParams();
                if (layoutParams2 != null) {
                    i = layoutParams2.height;
                }
                objArr[2] = Integer.valueOf(i);
                Log.m105925i("TextStatusEditDialogFragment", "onVASActivityAttach: onKeyboardHeightChangeListener  keyboardHeight:%s height:%s getContainerHeight():%s ", objArr);
                this.f207057d.mo103943L().post(new C71539e(this.f207057d, min));
                this.f207057d.f207051B = min;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditDialogFragment$d */
    public static final class C71454d extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditDialogFragment f207058d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71454d(TextStatusEditDialogFragment textStatusEditDialogFragment) {
            super(1);
            this.f207058d = textStatusEditDialogFragment;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue != 0) {
                TextStatusEditDialogFragment textStatusEditDialogFragment = this.f207058d;
                ViewGroup.LayoutParams layoutParams = textStatusEditDialogFragment.mo103943L().getLayoutParams();
                textStatusEditDialogFragment.mo103947S(Math.max(Math.min((layoutParams != null ? layoutParams.height : 0) + intValue, this.f207058d.f207050A), this.f207058d.f207051B));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStatusEditDialogFragment(Context context, Intent intent, String str, RecyclerViewDrawerSquares.C45117c cVar) {
        super(context, intent, str, cVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "activityClassName");
        int j = C85875k4.m106188j(context);
        this.f207053y = j;
        int a = C79406f.m96347a(context, 260.0f);
        this.f207054z = a;
        int i = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getInt(KeyBoardUtil.KEYBORD_HEIGHT_PX_PREFS, KeyBoardUtil.getKeyBordHeightPx(context)) + C79406f.m96347a(context, 50.0f);
        int min = Math.min(Math.max((int) ((((float) ((Number) ((C36570n) this.f219866h).getValue()).intValue()) / ((float) 9)) * ((float) 16)), this.f219868j), (int) (((double) ((Number) ((C36570n) this.f219867i).getValue()).intValue()) * 0.95d));
        this.f207050A = min;
        this.f207051B = Math.min(Math.max(this.f219868j + j, i + a + j), min);
    }

    /* renamed from: K */
    public C79402d mo98534K(Context context) {
        C87412m.m108594g(context, "context");
        return new C79402d(context, 0, 2, (C8480h) null);
    }

    /* renamed from: N */
    public float mo98535N() {
        return 0.8f;
    }

    /* renamed from: Q */
    public void mo98536Q(VASActivity vASActivity) {
        super.mo98536Q(vASActivity);
        this.f207052C = vASActivity;
        if ((vASActivity instanceof C78456a) && (vASActivity instanceof TextStatusEditHalfScreenActivity)) {
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = (TextStatusEditHalfScreenActivity) vASActivity;
            textStatusEditHalfScreenActivity.f207143i1 = new C71451a(this);
            textStatusEditHalfScreenActivity.f207146j1 = new C71452b(this);
            textStatusEditHalfScreenActivity.f207148k1 = new C71453c(this);
            textStatusEditHalfScreenActivity.f207150l1 = new C71454d(this);
        }
    }

    public void dismiss() {
        VASActivity vASActivity = this.f207052C;
        if (vASActivity == null || !(vASActivity instanceof TextStatusEditHalfScreenActivity)) {
            super.dismiss();
            return;
        }
        C87412m.m108592e(vASActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.ui.TextStatusEditHalfScreenActivity");
        ((TextStatusEditHalfScreenActivity) vASActivity).finish();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        Log.m105925i("TextStatusEditDialogFragment", "onViewCreated: MIN_HEIGHT:%s , getDefaultHeight:%s", Integer.valueOf(this.f207051B), Integer.valueOf(this.f219868j));
        int i = this.f207051B;
        int i2 = this.f219868j;
        if (i > i2) {
            mo103947S(i);
        } else {
            this.f207051B = i2;
        }
    }
}
