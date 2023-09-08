package com.tencent.p014mm.plugin.record.p094ui;

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
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import nj3.C76912y0;
import ob0.C76996p;
import ol3.C100367a;
import p182kk.C61104a;
import p206nj.C88955f;
import p371ph.C21967a;
import p910lj.C76701a;
import qg2.C101165r0;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordVoiceBaseView */
public class RecordVoiceBaseView extends TextView implements C101165r0.C101167b, C111847h {

    /* renamed from: d */
    public boolean f272681d = false;

    /* renamed from: e */
    public AlphaAnimation f272682e;

    /* renamed from: f */
    public AnimationDrawable f272683f;

    /* renamed from: g */
    public Context f272684g;

    /* renamed from: h */
    public C101165r0 f272685h;

    /* renamed from: i */
    public int f272686i = -1;

    /* renamed from: j */
    public String f272687j = "";

    /* renamed from: n */
    public int f272688n;

    /* renamed from: com.tencent.mm.plugin.record.ui.RecordVoiceBaseView$a */
    public class C94344a implements View.OnClickListener {
        public C94344a() {
        }

        public void onClick(View view) {
            boolean z;
            boolean z2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/record/ui/RecordVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object[] objArr = new Object[2];
            RecordVoiceBaseView recordVoiceBaseView = RecordVoiceBaseView.this;
            boolean z3 = false;
            objArr[0] = recordVoiceBaseView.f272687j;
            C76996p pVar = recordVoiceBaseView.f272685h.f296103d;
            if (pVar == null) {
                Log.m105928w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
                z = false;
            } else {
                z = ((C21967a) pVar).mo35058b();
            }
            objArr[1] = Boolean.valueOf(z);
            Log.m105919d("MicroMsg.RecordVoiceBaseView", "clicked path %s, isPlay %s", objArr);
            if (C61104a.m71669y(RecordVoiceBaseView.this.f272684g) || C61104a.m71665u(RecordVoiceBaseView.this.f272684g) || C61104a.m71649e(RecordVoiceBaseView.this.f272684g)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (C88955f.m111058b() || Util.isNullOrNil(RecordVoiceBaseView.this.f272687j)) {
                if (!Util.nullAs(RecordVoiceBaseView.this.f272687j, "").equals(RecordVoiceBaseView.this.f272685h.f296104e)) {
                    RecordVoiceBaseView.m119336b(RecordVoiceBaseView.this);
                } else {
                    C76996p pVar2 = RecordVoiceBaseView.this.f272685h.f296103d;
                    if (pVar2 == null) {
                        Log.m105928w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
                        z2 = false;
                    } else {
                        z2 = ((C21967a) pVar2).mo35058b();
                    }
                    if (z2) {
                        RecordVoiceBaseView recordVoiceBaseView2 = RecordVoiceBaseView.this;
                        recordVoiceBaseView2.getClass();
                        Log.m105918d("MicroMsg.RecordVoiceBaseView", "stop play");
                        recordVoiceBaseView2.mo129728d();
                        recordVoiceBaseView2.f272685h.mo140612c();
                    } else {
                        RecordVoiceBaseView recordVoiceBaseView3 = RecordVoiceBaseView.this;
                        recordVoiceBaseView3.getClass();
                        Log.m105924i("MicroMsg.RecordVoiceBaseView", "resume play");
                        C101165r0 r0Var = recordVoiceBaseView3.f272685h;
                        r0Var.getClass();
                        Log.m105924i("MicroMsg.RecordVoiceHelper", "resume play");
                        MMEntryLock.lock("keep_app_silent");
                        C76996p pVar3 = r0Var.f296103d;
                        if (pVar3 == null) {
                            Log.m105928w("MicroMsg.RecordVoiceHelper", "resum play error, player is null");
                        } else {
                            z3 = ((C21967a) pVar3).mo35060d();
                        }
                        if (!z3) {
                            RecordVoiceBaseView.m119336b(RecordVoiceBaseView.this);
                        }
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                C76912y0.m92771j(view.getContext(), (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    public RecordVoiceBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f272684g = context;
        mo129727c();
    }

    /* renamed from: b */
    public static void m119336b(RecordVoiceBaseView recordVoiceBaseView) {
        Log.m105919d("MicroMsg.RecordVoiceBaseView", "start play, path[%s] voiceType[%d]", recordVoiceBaseView.f272687j, Integer.valueOf(recordVoiceBaseView.f272688n));
        if (!recordVoiceBaseView.f272685h.mo140611b(recordVoiceBaseView.f272687j, recordVoiceBaseView.f272688n)) {
            C76701a.makeText(recordVoiceBaseView.getContext(), (int) C0966R.string.csa, 1).show();
        } else if (!recordVoiceBaseView.f272681d) {
            recordVoiceBaseView.f272681d = true;
            recordVoiceBaseView.setCompoundDrawablesWithIntrinsicBounds(recordVoiceBaseView.f272683f, (Drawable) null, (Drawable) null, (Drawable) null);
            recordVoiceBaseView.f272683f.stop();
            recordVoiceBaseView.f272683f.start();
        }
    }

    /* renamed from: a */
    public void mo129726a(String str) {
        Log.m105919d("MicroMsg.RecordVoiceBaseView", "on play, my path %s, my duration %d, play path %s", this.f272687j, Integer.valueOf(this.f272686i), str);
        if (!Util.nullAs(str, "").equals(this.f272687j)) {
            mo129728d();
        }
    }

    /* renamed from: c */
    public final void mo129727c() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        this.f272682e = alphaAnimation;
        alphaAnimation.setDuration(1000);
        this.f272682e.setRepeatCount(-1);
        this.f272682e.setRepeatMode(2);
        this.f272683f = new C100367a();
        Drawable drawable = getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new_f1);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f272683f.addFrame(drawable, 300);
        Drawable drawable2 = getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new_f2);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f272683f.addFrame(drawable2, 300);
        Drawable drawable3 = getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new_f3);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f272683f.addFrame(drawable3, 300);
        this.f272683f.setOneShot(false);
        this.f272683f.setVisible(true, true);
    }

    /* renamed from: d */
    public void mo129728d() {
        AlphaAnimation alphaAnimation = this.f272682e;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation((Animation) null);
        }
        this.f272681d = false;
        setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(C0966R.raw.chatfrom_voice_playing_new), (Drawable) null, (Drawable) null, (Drawable) null);
        this.f272683f.stop();
    }

    public void onFinish() {
        Log.m105918d("MicroMsg.RecordVoiceBaseView", "stop play");
        mo129728d();
        this.f272685h.mo140612c();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new C94344a());
    }

    public void setVoiceHelper(C101165r0 r0Var) {
        this.f272685h = r0Var;
        for (C101165r0.C101167b bVar : r0Var.f296111o) {
            if (this == bVar) {
                return;
            }
        }
        ((LinkedList) r0Var.f296111o).add(this);
    }

    public RecordVoiceBaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f272684g = context;
        mo129727c();
    }
}
