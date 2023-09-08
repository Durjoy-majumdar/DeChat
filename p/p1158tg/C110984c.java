package p1158tg;

import android.animation.ValueAnimator;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ListIterator;
import java.util.Stack;
import p1093bh.C104101k;
import p520fi.C107547d;
import z20.C112573c;

/* renamed from: tg.c */
public class C110984c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C110986e f332401d;

    public C110984c(C110986e eVar) {
        this.f332401d = eVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue("deltaY")).floatValue();
        float floatValue2 = ((Float) valueAnimator.getAnimatedValue("deltaX")).floatValue();
        Log.m105919d("MicroMsg.StickBackAnim", "animatorValueY:%s  %s", Float.valueOf(floatValue), Float.valueOf(floatValue - this.f332401d.f332407g));
        C110986e eVar = this.f332401d;
        C104101k kVar = eVar.f332403c;
        float f = floatValue2 - eVar.f332408h;
        float f2 = floatValue - eVar.f332407g;
        String str = eVar.f332405e;
        C107547d dVar = (C107547d) kVar.mo145692c();
        if (dVar != null) {
            Stack<C112573c> stack = dVar.f321774d;
            ListIterator<C112573c> listIterator = stack.listIterator(stack.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                C112573c previous = listIterator.previous();
                if (previous.f337065e.equals(str)) {
                    previous.f337069i.offset(f, f2);
                    kVar.mo145704o();
                    break;
                }
            }
        } else {
            Log.m105928w("MicroMsg.EmojiAndTextArtist", "cache is null!");
        }
        C110986e eVar2 = this.f332401d;
        eVar2.f332407g = floatValue;
        eVar2.f332408h = floatValue2;
    }
}
