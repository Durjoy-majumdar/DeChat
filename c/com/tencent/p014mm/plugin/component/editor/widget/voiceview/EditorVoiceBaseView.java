package com.tencent.p014mm.plugin.component.editor.widget.voiceview;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.widget.voiceview.C93093a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import o21.C100275d;
import ol3.C100367a;
import p182kk.C61104a;
import p206nj.C88955f;
import p910lj.C76701a;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.component.editor.widget.voiceview.EditorVoiceBaseView */
public class EditorVoiceBaseView extends TextView implements C93093a.C93094a, C111847h {

    /* renamed from: d */
    public boolean f268180d = false;

    /* renamed from: e */
    public AlphaAnimation f268181e;

    /* renamed from: f */
    public AnimationDrawable f268182f;

    /* renamed from: g */
    public Context f268183g;

    /* renamed from: h */
    public int f268184h = -1;

    /* renamed from: i */
    public String f268185i = "";

    /* renamed from: com.tencent.mm.plugin.component.editor.widget.voiceview.EditorVoiceBaseView$a */
    public class C93089a implements View.OnClickListener {
        public C93089a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object[] objArr = new Object[3];
            objArr[0] = EditorVoiceBaseView.this.f268185i;
            objArr[1] = C93093a.m117459b().mo127596c() ? "true" : "false";
            objArr[2] = C93093a.m117459b().f268208e;
            Log.m105925i("MicroMsg.NoteEditorVoiceBaseView", "clicked path:%s, player isPlay:%s, path:%s", objArr);
            if (C61104a.m71669y(EditorVoiceBaseView.this.f268183g) || C61104a.m71665u(EditorVoiceBaseView.this.f268183g) || C61104a.m71649e(EditorVoiceBaseView.this.f268183g)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (!C88955f.m111058b() && !Util.isNullOrNil(EditorVoiceBaseView.this.f268185i)) {
                C76912y0.m92771j(view.getContext(), (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (C100275d.m131079a().f293767a) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                if (!Util.nullAs(EditorVoiceBaseView.this.f268185i, "").equals(C93093a.m117459b().f268208e)) {
                    EditorVoiceBaseView.m117444e(EditorVoiceBaseView.this);
                } else if (C93093a.m117459b().mo127596c()) {
                    EditorVoiceBaseView editorVoiceBaseView = EditorVoiceBaseView.this;
                    editorVoiceBaseView.getClass();
                    Log.m105918d("MicroMsg.NoteEditorVoiceBaseView", "stop play");
                    editorVoiceBaseView.mo127587g();
                    C93093a.m117459b().mo127598e();
                } else {
                    EditorVoiceBaseView.m117444e(EditorVoiceBaseView.this);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    public EditorVoiceBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f268183g = context;
        mo127586f();
    }

    /* renamed from: e */
    public static void m117444e(EditorVoiceBaseView editorVoiceBaseView) {
        Log.m105919d("MicroMsg.NoteEditorVoiceBaseView", "start play, path[%s] voiceType[%d]", editorVoiceBaseView.f268185i, 0);
        if (!C93093a.m117459b().mo127597d(editorVoiceBaseView.f268185i, 0)) {
            C76701a.makeText(editorVoiceBaseView.getContext(), (int) C0966R.string.csa, 1).show();
        } else if (!editorVoiceBaseView.f268180d) {
            editorVoiceBaseView.f268180d = true;
            editorVoiceBaseView.setCompoundDrawablesWithIntrinsicBounds(editorVoiceBaseView.f268182f, (Drawable) null, (Drawable) null, (Drawable) null);
            editorVoiceBaseView.f268182f.stop();
            editorVoiceBaseView.f268182f.start();
        }
    }

    /* renamed from: a */
    public void mo127582a(String str) {
    }

    /* renamed from: b */
    public void mo127583b(String str) {
        Log.m105919d("MicroMsg.NoteEditorVoiceBaseView", "on play, my path %s, my duration %d, play path %s", this.f268185i, Integer.valueOf(this.f268184h), str);
        if (!Util.nullAs(str, "").equals(this.f268185i)) {
            mo127587g();
        }
    }

    /* renamed from: c */
    public void mo127584c() {
    }

    /* renamed from: d */
    public void mo127585d() {
        mo127587g();
    }

    /* renamed from: f */
    public final void mo127586f() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        this.f268181e = alphaAnimation;
        alphaAnimation.setDuration(1000);
        this.f268181e.setRepeatCount(-1);
        this.f268181e.setRepeatMode(2);
        this.f268182f = new C100367a();
        Drawable drawable = getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new_f1);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f268182f.addFrame(drawable, 300);
        Drawable drawable2 = getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new_f2);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f268182f.addFrame(drawable2, 300);
        Drawable drawable3 = getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new_f3);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f268182f.addFrame(drawable3, 300);
        this.f268182f.setOneShot(false);
        this.f268182f.setVisible(true, true);
    }

    /* renamed from: g */
    public void mo127587g() {
        AlphaAnimation alphaAnimation = this.f268181e;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation((Animation) null);
        }
        this.f268180d = false;
        setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new), (Drawable) null, (Drawable) null, (Drawable) null);
        this.f268182f.stop();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new C93089a());
    }

    public EditorVoiceBaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f268183g = context;
        mo127586f();
    }
}
