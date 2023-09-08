package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.s */
public class C115843s {

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.s$a */
    public class C115844a implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C115847c f347568a;

        /* renamed from: b */
        public final /* synthetic */ int f347569b;

        /* renamed from: c */
        public final /* synthetic */ View f347570c;

        /* renamed from: com.tencent.mm.plugin.voiceprint.ui.s$a$a */
        public class C115845a implements Animation.AnimationListener {
            public C115845a() {
            }

            public void onAnimationEnd(Animation animation) {
                Log.m105924i("MicroMsg.VoiceViewAnimationHelper", "next end");
                C115847c cVar = C115844a.this.f347568a;
                if (cVar != null) {
                    cVar.mo176340a();
                }
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        public C115844a(C115847c cVar, int i, View view) {
            this.f347568a = cVar;
            this.f347569b = i;
            this.f347570c = view;
        }

        public void onAnimationEnd(Animation animation) {
            C115847c cVar = this.f347568a;
            if (cVar != null) {
                cVar.mo176341b();
            }
            Log.m105918d("MicroMsg.VoiceViewAnimationHelper", "onAnimationEnd ");
            TranslateAnimation translateAnimation = new TranslateAnimation(0, (float) this.f347569b, 0, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(200);
            translateAnimation.setStartOffset(0);
            translateAnimation.setRepeatMode(-1);
            translateAnimation.setRepeatCount(0);
            translateAnimation.setFillAfter(true);
            translateAnimation.setAnimationListener(new C115845a());
            this.f347570c.startAnimation(translateAnimation);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.s$b */
    public class C115846b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C115847c f347572a;

        public C115846b(C115847c cVar) {
            this.f347572a = cVar;
        }

        public void onAnimationEnd(Animation animation) {
            C115847c cVar = this.f347572a;
            if (cVar != null) {
                cVar.mo176340a();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.s$c */
    public interface C115847c {
        /* renamed from: a */
        void mo176340a();

        /* renamed from: b */
        void mo176341b();
    }

    /* renamed from: a */
    public static void m162941a(View view, Context context, C115847c cVar) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2388bp);
        loadAnimation.setDuration(300);
        loadAnimation.setFillAfter(true);
        loadAnimation.setRepeatCount(0);
        loadAnimation.setAnimationListener(new C115846b(cVar));
        view.startAnimation(loadAnimation);
    }

    /* renamed from: b */
    public static void m162942b(View view, Context context, C115847c cVar) {
        View view2 = view;
        float width = (float) view.getWidth();
        Log.m105918d("MicroMsg.VoiceViewAnimationHelper", "target " + width);
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = (int) (((float) i) + width);
        Log.m105919d("MicroMsg.VoiceViewAnimationHelper", "location %d %d preX=%d", Integer.valueOf(i), Integer.valueOf(iArr[1]), Integer.valueOf(i2));
        View view3 = (View) view.getParent();
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, (float) (-i2), 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(200);
        translateAnimation.setStartOffset(0);
        translateAnimation.setRepeatMode(-1);
        translateAnimation.setRepeatCount(0);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new C115844a(cVar, i2, view2));
        view2.startAnimation(translateAnimation);
    }
}
