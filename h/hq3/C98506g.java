package hq3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonFastManagementStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.view.popview.AbstractPopView;
import com.tencent.p014mm.view.popview.EmojiPopView;
import gy3.C87412m;
import jp3.C9486a;
import p585kl.C99148f;

/* renamed from: hq3.g */
public final class C98506g extends C98498a implements C9486a {

    /* renamed from: d */
    public final Context f288900d;

    /* renamed from: e */
    public final int f288901e;

    /* renamed from: f */
    public final String f288902f = "MicroMsg.PreviewRelativeEmotionPopupHelper";

    /* renamed from: g */
    public final WindowManager f288903g;

    /* renamed from: h */
    public EmojiPopView f288904h;

    /* renamed from: i */
    public View f288905i;

    /* renamed from: hq3.g$a */
    public static final class C98507a implements AbstractPopView.C75076a {

        /* renamed from: a */
        public final /* synthetic */ C98506g f288906a;

        public C98507a(C98506g gVar) {
            this.f288906a = gVar;
        }

        public final void onDismiss() {
            this.f288906a.mo137862f();
        }
    }

    /* renamed from: hq3.g$b */
    public static final class C98508b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98506g f288907d;

        /* renamed from: e */
        public final /* synthetic */ View f288908e;

        public C98508b(C98506g gVar, View view) {
            this.f288907d = gVar;
            this.f288908e = view;
        }

        public final void run() {
            EmojiPopView emojiPopView = this.f288907d.f288904h;
            if (emojiPopView != null) {
                if (emojiPopView != null) {
                    emojiPopView.setVisibility(0);
                }
                EmojiPopView emojiPopView2 = this.f288907d.f288904h;
                if (emojiPopView2 != null) {
                    emojiPopView2.mo104703d(this.f288908e);
                }
                C98506g gVar = this.f288907d;
                WindowManager windowManager = gVar.f288903g;
                EmojiPopView emojiPopView3 = gVar.f288904h;
                windowManager.updateViewLayout(emojiPopView3, emojiPopView3 != null ? emojiPopView3.getWindowLayoutParams() : null);
            }
        }
    }

    public C98506g(Context context, int i) {
        C87412m.m108594g(context, "context");
        this.f288900d = context;
        this.f288901e = i;
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f288903g = (WindowManager) systemService;
    }

    /* renamed from: a */
    public boolean mo106488a(View view, Object obj) {
        C87412m.m108594g(view, "anchor");
        if (!(obj instanceof EmojiInfo) || !view.isEnabled()) {
            return false;
        }
        this.f288905i = view;
        view.setPressed(true);
        mo137863g(view, obj);
        return true;
    }

    /* renamed from: b */
    public void mo106489b(View view, Object obj) {
        C87412m.m108594g(view, "anchor");
        view.setPressed(true);
        if (!C87412m.m108589b(this.f288905i, view)) {
            View view2 = this.f288905i;
            if (view2 != null) {
                view2.setPressed(false);
            }
            this.f288905i = view;
            mo137863g(view, obj);
        }
    }

    /* renamed from: c */
    public void mo106490c() {
        View view = this.f288905i;
        if (view != null) {
            view.setPressed(false);
        }
    }

    public void dead() {
        mo137862f();
    }

    /* renamed from: f */
    public final void mo137862f() {
        String str = this.f288902f;
        Log.m105924i(str, "removePopup: " + this.f288904h);
        View view = this.f288905i;
        if (view != null) {
            view.setPressed(false);
        }
        this.f288905i = null;
        EmojiPopView emojiPopView = this.f288904h;
        if (emojiPopView != null) {
            this.f288903g.removeView(emojiPopView);
        }
        this.f288904h = null;
    }

    /* renamed from: g */
    public final void mo137863g(View view, Object obj) {
        if (!(obj instanceof EmojiInfo) || !view.isEnabled()) {
            EmojiPopView emojiPopView = this.f288904h;
            if (emojiPopView != null) {
                emojiPopView.setVisibility(8);
                return;
            }
            return;
        }
        int i = this.f288901e;
        if (i == 2 || i == 3 || i == 4) {
            EmoticonFastManagementStruct emoticonFastManagementStruct = C99148f.f290705b;
            emoticonFastManagementStruct.f265460f = emoticonFastManagementStruct.mo86045b("Pid", ((EmojiInfo) obj).field_groupId, true);
        }
        C99148f fVar = C99148f.f290704a;
        fVar.mo138517b(this.f288901e);
        EmoticonFastManagementStruct emoticonFastManagementStruct2 = C99148f.f290705b;
        EmojiInfo emojiInfo = (EmojiInfo) obj;
        emoticonFastManagementStruct2.f265461g = emoticonFastManagementStruct2.mo86045b("Md5", emojiInfo.getMd5(), true);
        fVar.mo138516a(1);
        view.setPressed(true);
        EmojiPopView emojiPopView2 = this.f288904h;
        WindowManager.LayoutParams layoutParams = null;
        if (emojiPopView2 == null) {
            EmojiPopView emojiPopView3 = new EmojiPopView(this.f288900d, (AttributeSet) null);
            this.f288904h = emojiPopView3;
            emojiPopView3.setOnDismissCallback(new C98507a(this));
            WindowManager windowManager = this.f288903g;
            EmojiPopView emojiPopView4 = this.f288904h;
            if (emojiPopView4 != null) {
                layoutParams = emojiPopView4.getWindowLayoutParams();
            }
            windowManager.addView(emojiPopView4, layoutParams);
            EmojiPopView emojiPopView5 = this.f288904h;
            if (emojiPopView5 != null) {
                emojiPopView5.setVisibility(4);
            }
        } else {
            emojiPopView2.mo104703d(view);
            WindowManager windowManager2 = this.f288903g;
            EmojiPopView emojiPopView6 = this.f288904h;
            if (emojiPopView6 != null) {
                layoutParams = emojiPopView6.getWindowLayoutParams();
            }
            windowManager2.updateViewLayout(emojiPopView6, layoutParams);
        }
        EmojiPopView emojiPopView7 = this.f288904h;
        if (emojiPopView7 != null) {
            emojiPopView7.post(new C98508b(this, view));
        }
        EmojiPopView emojiPopView8 = this.f288904h;
        if (emojiPopView8 != null) {
            emojiPopView8.setEmojiInfo(emojiInfo);
        }
        EmojiPopView emojiPopView9 = this.f288904h;
        if (emojiPopView9 != null) {
            emojiPopView9.setPopupType(this.f288901e);
        }
    }
}
