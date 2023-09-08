package yh2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.MMEditorRecordButton;

/* renamed from: yh2.m */
public class C112463m extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ AnimatorListenerAdapter f336730d;

    /* renamed from: e */
    public final /* synthetic */ MMEditorRecordButton f336731e;

    public C112463m(MMEditorRecordButton mMEditorRecordButton, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f336731e = mMEditorRecordButton;
        this.f336730d = animatorListenerAdapter;
    }

    public void onAnimationEnd(Animator animator) {
        this.f336731e.f315636j = false;
        AnimatorListenerAdapter animatorListenerAdapter = this.f336730d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f336731e.f315636j = true;
        AnimatorListenerAdapter animatorListenerAdapter = this.f336730d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}
