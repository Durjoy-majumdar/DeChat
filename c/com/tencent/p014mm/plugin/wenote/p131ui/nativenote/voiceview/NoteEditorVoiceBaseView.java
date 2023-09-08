package com.tencent.p014mm.plugin.wenote.p131ui.nativenote.voiceview;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.voiceview.C96750a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import ol3.C100367a;
import p182kk.C61104a;
import p206nj.C88955f;
import p910lj.C76701a;
import wa3.C102378p;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView */
public class NoteEditorVoiceBaseView extends TextView implements C96750a.C96751a, C111847h {

    /* renamed from: d */
    public boolean f283393d = false;

    /* renamed from: e */
    public AlphaAnimation f283394e;

    /* renamed from: f */
    public AnimationDrawable f283395f;

    /* renamed from: g */
    public Context f283396g;

    /* renamed from: h */
    public int f283397h = -1;

    /* renamed from: i */
    public String f283398i = "";

    /* renamed from: j */
    public int f283399j;

    /* renamed from: n */
    public C96750a f283400n;

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView$a */
    public class C96746a implements View.OnClickListener {
        public C96746a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteEditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object[] objArr = new Object[3];
            NoteEditorVoiceBaseView noteEditorVoiceBaseView = NoteEditorVoiceBaseView.this;
            objArr[0] = noteEditorVoiceBaseView.f283398i;
            objArr[1] = noteEditorVoiceBaseView.f283400n.mo135022e() ? "true" : "false";
            objArr[2] = NoteEditorVoiceBaseView.this.f283400n.f283421d;
            Log.m105925i("MicroMsg.NoteEditorVoiceBaseView", "clicked path:%s, player isPlay:%s, path:%s", objArr);
            if (C61104a.m71669y(NoteEditorVoiceBaseView.this.f283396g) || C61104a.m71665u(NoteEditorVoiceBaseView.this.f283396g) || C61104a.m71649e(NoteEditorVoiceBaseView.this.f283396g)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteEditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (!C88955f.m111058b() && !Util.isNullOrNil(NoteEditorVoiceBaseView.this.f283398i)) {
                C76912y0.m92771j(view.getContext(), (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteEditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (C102378p.m135106a().f301521a) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteEditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                if (!Util.nullAs(NoteEditorVoiceBaseView.this.f283398i, "").equals(NoteEditorVoiceBaseView.this.f283400n.f283421d)) {
                    NoteEditorVoiceBaseView.m124178e(NoteEditorVoiceBaseView.this);
                } else if (NoteEditorVoiceBaseView.this.f283400n.mo135022e()) {
                    NoteEditorVoiceBaseView noteEditorVoiceBaseView2 = NoteEditorVoiceBaseView.this;
                    noteEditorVoiceBaseView2.getClass();
                    Log.m105918d("MicroMsg.NoteEditorVoiceBaseView", "stop play");
                    noteEditorVoiceBaseView2.mo135009g();
                    noteEditorVoiceBaseView2.f283400n.mo135024g();
                } else {
                    NoteEditorVoiceBaseView.m124178e(NoteEditorVoiceBaseView.this);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteEditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    public NoteEditorVoiceBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f283396g = context;
        mo135008f();
    }

    /* renamed from: e */
    public static void m124178e(NoteEditorVoiceBaseView noteEditorVoiceBaseView) {
        Log.m105919d("MicroMsg.NoteEditorVoiceBaseView", "start play, path[%s] voiceType[%d]", noteEditorVoiceBaseView.f283398i, Integer.valueOf(noteEditorVoiceBaseView.f283399j));
        if (!noteEditorVoiceBaseView.f283400n.mo135023f(noteEditorVoiceBaseView.f283398i, noteEditorVoiceBaseView.f283399j)) {
            C76701a.makeText(noteEditorVoiceBaseView.getContext(), (int) C0966R.string.csa, 1).show();
        } else if (!noteEditorVoiceBaseView.f283393d) {
            noteEditorVoiceBaseView.f283393d = true;
            noteEditorVoiceBaseView.setCompoundDrawablesWithIntrinsicBounds(noteEditorVoiceBaseView.f283395f, (Drawable) null, (Drawable) null, (Drawable) null);
            noteEditorVoiceBaseView.f283395f.stop();
            noteEditorVoiceBaseView.f283395f.start();
        }
    }

    /* renamed from: a */
    public void mo135004a(String str) {
    }

    /* renamed from: b */
    public void mo135005b(String str) {
        Log.m105919d("MicroMsg.NoteEditorVoiceBaseView", "on play, my path %s, my duration %d, play path %s", this.f283398i, Integer.valueOf(this.f283397h), str);
        if (!Util.nullAs(str, "").equals(this.f283398i)) {
            mo135009g();
        }
    }

    /* renamed from: c */
    public void mo135006c() {
    }

    /* renamed from: d */
    public void mo135007d() {
        mo135009g();
    }

    /* renamed from: f */
    public final void mo135008f() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        this.f283394e = alphaAnimation;
        alphaAnimation.setDuration(1000);
        this.f283394e.setRepeatCount(-1);
        this.f283394e.setRepeatMode(2);
        this.f283395f = new C100367a();
        Drawable drawable = getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new_f1);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f283395f.addFrame(drawable, 300);
        Drawable drawable2 = getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new_f2);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f283395f.addFrame(drawable2, 300);
        Drawable drawable3 = getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new_f3);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f283395f.addFrame(drawable3, 300);
        this.f283395f.setOneShot(false);
        this.f283395f.setVisible(true, true);
    }

    /* renamed from: g */
    public void mo135009g() {
        AlphaAnimation alphaAnimation = this.f283394e;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation((Animation) null);
        }
        this.f283393d = false;
        setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new), (Drawable) null, (Drawable) null, (Drawable) null);
        this.f283395f.stop();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new C96746a());
    }

    public void setVoiceHelper(C96750a aVar) {
        this.f283400n = aVar;
        aVar.mo135019b(this);
    }

    public NoteEditorVoiceBaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f283396g = context;
        mo135008f();
    }
}
