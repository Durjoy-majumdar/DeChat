package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import ol3.C100367a;
import p182kk.C61104a;
import p206nj.C88955f;
import p272xq.C102714j;
import p910lj.C76701a;
import pb1.C100715i0;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavChatVoiceView */
public class FavChatVoiceView extends TextView implements C102714j, C111847h {

    /* renamed from: d */
    public boolean f269648d = false;

    /* renamed from: e */
    public AlphaAnimation f269649e;

    /* renamed from: f */
    public AnimationDrawable f269650f;

    /* renamed from: g */
    public Context f269651g;

    /* renamed from: h */
    public String f269652h = "";

    /* renamed from: i */
    public int f269653i;

    /* renamed from: j */
    public C100715i0 f269654j;

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavChatVoiceView$a */
    public class C93413a implements View.OnClickListener {
        public C93413a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavChatVoiceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object[] objArr = new Object[3];
            FavChatVoiceView favChatVoiceView = FavChatVoiceView.this;
            objArr[0] = favChatVoiceView.f269652h;
            objArr[1] = favChatVoiceView.f269654j.mo140148c() ? "true" : "false";
            objArr[2] = FavChatVoiceView.this.f269654j.f295079e;
            Log.m105925i("MicroMsg.FavChatVoiceView", "clicked path:%s, player isPlay:%s, path:%s", objArr);
            if (C61104a.m71669y(FavChatVoiceView.this.f269651g) || C61104a.m71665u(FavChatVoiceView.this.f269651g) || C61104a.m71649e(FavChatVoiceView.this.f269651g)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavChatVoiceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (C88955f.m111058b() || Util.isNullOrNil(FavChatVoiceView.this.f269652h)) {
                if (!Util.nullAs(FavChatVoiceView.this.f269652h, "").equals(FavChatVoiceView.this.f269654j.f295079e)) {
                    FavChatVoiceView.m117991b(FavChatVoiceView.this);
                } else if (FavChatVoiceView.this.f269654j.mo140148c()) {
                    FavChatVoiceView.this.mo128241d();
                } else {
                    FavChatVoiceView.m117991b(FavChatVoiceView.this);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavChatVoiceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                C76912y0.m92771j(view.getContext(), (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavChatVoiceView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    public FavChatVoiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f269651g = context;
        mo128240c();
    }

    /* renamed from: b */
    public static void m117991b(FavChatVoiceView favChatVoiceView) {
        Log.m105919d("MicroMsg.FavChatVoiceView", "start play, path[%s] voiceType[%d]", favChatVoiceView.f269652h, Integer.valueOf(favChatVoiceView.f269653i));
        if (!favChatVoiceView.f269654j.mo140151f(favChatVoiceView.f269652h, favChatVoiceView.f269653i)) {
            C76701a.makeText(favChatVoiceView.getContext(), (int) C0966R.string.csa, 1).show();
        } else if (!favChatVoiceView.f269648d) {
            favChatVoiceView.f269648d = true;
            favChatVoiceView.setCompoundDrawablesWithIntrinsicBounds(favChatVoiceView.f269650f, (Drawable) null, (Drawable) null, (Drawable) null);
            favChatVoiceView.f269650f.stop();
            favChatVoiceView.f269650f.start();
        }
    }

    /* renamed from: a */
    public void mo128239a(String str, int i) {
        if (!this.f269652h.equals(str)) {
            mo128241d();
        }
    }

    /* renamed from: c */
    public final void mo128240c() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        this.f269649e = alphaAnimation;
        alphaAnimation.setDuration(1000);
        this.f269649e.setRepeatCount(-1);
        this.f269649e.setRepeatMode(2);
        this.f269650f = new C100367a();
        Drawable drawable = getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new_f1);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f269650f.addFrame(drawable, 300);
        Drawable drawable2 = getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new_f2);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f269650f.addFrame(drawable2, 300);
        Drawable drawable3 = getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new_f3);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f269650f.addFrame(drawable3, 300);
        this.f269650f.setOneShot(false);
        this.f269650f.setVisible(true, true);
    }

    /* renamed from: d */
    public void mo128241d() {
        Log.m105918d("MicroMsg.FavChatVoiceView", "stop play");
        AlphaAnimation alphaAnimation = this.f269649e;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation((Animation) null);
        }
        this.f269648d = false;
        setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new), (Drawable) null, (Drawable) null, (Drawable) null);
        this.f269650f.stop();
        this.f269654j.mo140152g();
    }

    public void onFinish() {
        mo128241d();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new C93413a());
    }

    public void onPause() {
        mo128241d();
    }

    public void setVoiceHelper(C100715i0 i0Var) {
        this.f269654j = i0Var;
        i0Var.mo140147b(this);
    }

    public FavChatVoiceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f269651g = context;
        mo128240c();
    }
}
