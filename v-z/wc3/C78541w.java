package wc3;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.p136ui.MMActivityController;
import di3.C7335d;
import nj3.C76901s0;
import qo3.C77398g;
import wd3.C65953v0;

/* renamed from: wc3.w */
public interface C78541w extends C7335d {

    /* renamed from: wc3.w$a */
    public interface C78542a {
        /* renamed from: a */
        void mo108499a(String str, IEmojiInfo iEmojiInfo, boolean z, long j);
    }

    C77398g Ac0(MMActivityController mMActivityController, String str, String str2, String str3, String str4, boolean z, String str5, String str6, C65953v0 v0Var);

    /* renamed from: Em */
    void mo108483Em(Context context, String str, String str2, String str3, String str4, String str5, C65953v0 v0Var);

    /* renamed from: Gd */
    C77398g mo108484Gd(Context context, String str, Bitmap bitmap, String str2, int i, C65953v0 v0Var);

    C76901s0 Iu0(MMActivityController mMActivityController, Bitmap bitmap, String str, String str2, String str3, String str4, String str5, C65953v0 v0Var);

    void Lj0(Context context, String str, String str2, C65953v0 v0Var);

    void Op0(Context context, String str, String str2, String str3, String str4, String str5, C65953v0 v0Var);

    void Q10(Context context, String str, String str2, String str3, C65953v0 v0Var);

    /* renamed from: Qb */
    void mo108489Qb(Context context, String str, byte[] bArr, C65953v0 v0Var, int i, long j, C78542a aVar);

    /* renamed from: SX */
    void mo108490SX(Context context, String str, Bitmap bitmap, C65953v0 v0Var);

    /* renamed from: Sz */
    void mo108491Sz(Context context, String str, String str2, String str3, C65953v0 v0Var);

    C77398g Tm0(Context context, String str, String str2, String str3, C65953v0 v0Var);

    /* renamed from: Xn */
    void mo108493Xn(Context context, String str, String str2, String str3, C65953v0 v0Var);

    void cu0(Context context, String str, String str2, String str3, String str4, String str5, C65953v0 v0Var);

    /* renamed from: hG */
    C77398g mo108495hG(Context context, String str, String str2, String str3, C65953v0 v0Var);

    C77398g jb0(Context context, String str, View view, String str2, C65953v0 v0Var);

    void or0(MMActivityController mMActivityController, String str, String str2, String str3, C65953v0 v0Var);

    void ph0(Context context, String str, String str2, C65953v0 v0Var, C77398g.C77402i.C77404b bVar, DialogInterface.OnDismissListener onDismissListener);
}
