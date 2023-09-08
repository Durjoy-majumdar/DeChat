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
import p813fl.C97904g;

/* renamed from: hq3.b */
public final class C98499b extends C98498a implements C9486a {

    /* renamed from: d */
    public final Context f288888d;

    /* renamed from: e */
    public final int f288889e;

    /* renamed from: f */
    public final String f288890f = "MicroMsg.EmojiOperatePopupHelper";

    /* renamed from: g */
    public final WindowManager f288891g;

    /* renamed from: h */
    public EmojiPopView f288892h;

    /* renamed from: i */
    public View f288893i;

    /* renamed from: hq3.b$a */
    public static final class C98500a implements AbstractPopView.C75076a {

        /* renamed from: a */
        public final /* synthetic */ C98499b f288894a;

        public C98500a(C98499b bVar) {
            this.f288894a = bVar;
        }

        public final void onDismiss() {
            this.f288894a.mo137856f();
        }
    }

    /* renamed from: hq3.b$b */
    public static final class C98501b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98499b f288895d;

        /* renamed from: e */
        public final /* synthetic */ View f288896e;

        public C98501b(C98499b bVar, View view) {
            this.f288895d = bVar;
            this.f288896e = view;
        }

        public final void run() {
            EmojiPopView emojiPopView = this.f288895d.f288892h;
            if (emojiPopView != null) {
                if (emojiPopView != null) {
                    emojiPopView.setVisibility(0);
                }
                EmojiPopView emojiPopView2 = this.f288895d.f288892h;
                if (emojiPopView2 != null) {
                    emojiPopView2.mo104703d(this.f288896e);
                }
                C98499b bVar = this.f288895d;
                WindowManager windowManager = bVar.f288891g;
                EmojiPopView emojiPopView3 = bVar.f288892h;
                windowManager.updateViewLayout(emojiPopView3, emojiPopView3 != null ? emojiPopView3.getWindowLayoutParams() : null);
            }
        }
    }

    public C98499b(Context context, int i) {
        C87412m.m108594g(context, "context");
        this.f288888d = context;
        this.f288889e = i;
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f288891g = (WindowManager) systemService;
    }

    /* renamed from: a */
    public boolean mo106488a(View view, Object obj) {
        C87412m.m108594g(view, "anchor");
        if (!(obj instanceof C97904g) || !view.isEnabled()) {
            return false;
        }
        this.f288893i = view;
        view.setPressed(true);
        mo137857g(view, obj);
        return true;
    }

    /* renamed from: b */
    public void mo106489b(View view, Object obj) {
        C87412m.m108594g(view, "anchor");
        view.setPressed(true);
        if (!C87412m.m108589b(this.f288893i, view)) {
            View view2 = this.f288893i;
            if (view2 != null) {
                view2.setPressed(false);
            }
            this.f288893i = view;
            mo137857g(view, obj);
        }
    }

    /* renamed from: c */
    public void mo106490c() {
        View view = this.f288893i;
        if (view != null) {
            view.setPressed(false);
        }
    }

    public void dead() {
        mo137856f();
    }

    /* renamed from: f */
    public final void mo137856f() {
        String str = this.f288890f;
        Log.m105924i(str, "removePopup: " + this.f288892h);
        View view = this.f288893i;
        if (view != null) {
            view.setPressed(false);
        }
        this.f288893i = null;
        EmojiPopView emojiPopView = this.f288892h;
        if (emojiPopView != null) {
            this.f288891g.removeView(emojiPopView);
        }
        this.f288892h = null;
    }

    /* renamed from: g */
    public final void mo137857g(View view, Object obj) {
        if (!(obj instanceof C97904g) || !view.isEnabled()) {
            EmojiPopView emojiPopView = this.f288892h;
            if (emojiPopView != null) {
                emojiPopView.setVisibility(8);
                return;
            }
            return;
        }
        int i = this.f288889e;
        if (i == 2 || i == 3 || i == 4) {
            EmoticonFastManagementStruct emoticonFastManagementStruct = C99148f.f290705b;
            emoticonFastManagementStruct.f265460f = emoticonFastManagementStruct.mo86045b("Pid", ((C97904g) obj).f287200b.getGroupId(), true);
        }
        C99148f fVar = C99148f.f290704a;
        fVar.mo138517b(this.f288889e);
        EmoticonFastManagementStruct emoticonFastManagementStruct2 = C99148f.f290705b;
        C97904g gVar = (C97904g) obj;
        emoticonFastManagementStruct2.f265461g = emoticonFastManagementStruct2.mo86045b("Md5", gVar.f287200b.getMd5(), true);
        fVar.mo138516a(1);
        view.setPressed(true);
        EmojiPopView emojiPopView2 = this.f288892h;
        WindowManager.LayoutParams layoutParams = null;
        if (emojiPopView2 == null) {
            EmojiPopView emojiPopView3 = new EmojiPopView(this.f288888d, (AttributeSet) null);
            this.f288892h = emojiPopView3;
            emojiPopView3.setOnDismissCallback(new C98500a(this));
            WindowManager windowManager = this.f288891g;
            EmojiPopView emojiPopView4 = this.f288892h;
            if (emojiPopView4 != null) {
                layoutParams = emojiPopView4.getWindowLayoutParams();
            }
            windowManager.addView(emojiPopView4, layoutParams);
            EmojiPopView emojiPopView5 = this.f288892h;
            if (emojiPopView5 != null) {
                emojiPopView5.setVisibility(4);
            }
        } else {
            emojiPopView2.mo104703d(view);
            WindowManager windowManager2 = this.f288891g;
            EmojiPopView emojiPopView6 = this.f288892h;
            if (emojiPopView6 != null) {
                layoutParams = emojiPopView6.getWindowLayoutParams();
            }
            windowManager2.updateViewLayout(emojiPopView6, layoutParams);
        }
        EmojiPopView emojiPopView7 = this.f288892h;
        if (emojiPopView7 != null) {
            emojiPopView7.post(new C98501b(this, view));
        }
        EmojiPopView emojiPopView8 = this.f288892h;
        if (emojiPopView8 != null) {
            emojiPopView8.setEmojiInfo((EmojiInfo) gVar.f287200b);
        }
        EmojiPopView emojiPopView9 = this.f288892h;
        if (emojiPopView9 != null) {
            emojiPopView9.setPopupType(this.f288889e);
        }
    }
}
