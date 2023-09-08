package em3;

import android.util.Pair;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.view.ChattingAvatarImageView;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74193r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.thumbplayer.api.TPOptionalID;
import dm3.C86351b;
import e42.C7596h;
import e42.C86430i;
import fm3.C75776a;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: em3.i */
public final class C86584i extends C86430i<C86351b> {

    /* renamed from: d */
    public final float[] f251494d = {15.0f, 12.0f, 9.0f, 6.0f, 3.0f};

    /* renamed from: e */
    public final long[] f251495e = {0, 50, 100, 150, 200};

    /* renamed from: f */
    public Animation f251496f;

    /* renamed from: g */
    public Animation f251497g;

    /* renamed from: h */
    public final LinkedList<AnimationSet> f251498h = new LinkedList<>();

    /* renamed from: i */
    public final LinkedList<AnimationSet> f251499i = new LinkedList<>();

    /* renamed from: j */
    public final LinkedList<AnimationSet> f251500j = new LinkedList<>();

    /* renamed from: k */
    public final LinkedList<AnimationSet> f251501k = new LinkedList<>();

    /* renamed from: l */
    public final LinkedList<AnimationSet> f251502l = new LinkedList<>();

    /* renamed from: m */
    public final LinkedList<AnimationSet> f251503m = new LinkedList<>();

    /* renamed from: em3.i$b */
    public static final class C31626b {

        /* renamed from: a */
        public float f84499a;

        /* renamed from: b */
        public long f84500b;

        /* renamed from: c */
        public long f84501c;

        public C31626b(float f, long j, long j2) {
            this.f84499a = f;
            this.f84500b = j;
            this.f84501c = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31626b)) {
                return false;
            }
            C31626b bVar = (C31626b) obj;
            return C87412m.m108589b(Float.valueOf(this.f84499a), Float.valueOf(bVar.f84499a)) && this.f84500b == bVar.f84500b && this.f84501c == bVar.f84501c;
        }

        public int hashCode() {
            long j = this.f84500b;
            long j2 = this.f84501c;
            return (((Float.floatToIntBits(this.f84499a) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "RotateAnimationPara(degree=" + this.f84499a + ", duration=" + this.f84500b + ", startOffset=" + this.f84501c + ')';
        }
    }

    /* renamed from: em3.i$a */
    public static final class C45679a implements Animation.AnimationListener {

        /* renamed from: a */
        public final View f123482a;

        public C45679a(View view) {
            C87412m.m108594g(view, "view");
            this.f123482a = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (animation != null) {
                animation.setAnimationListener((Animation.AnimationListener) null);
            }
            this.f123482a.clearAnimation();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "shakeVisibleBubblesAndAvatars";
    }

    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C7596h hVar2;
        String str;
        Object obj;
        AnimationSet animationSet;
        C7596h hVar3 = hVar;
        C87412m.m108594g(hVar3, "data");
        C32226l<C7596h, C13598b0> p = mo120840p();
        T t = this.f251227a;
        C87412m.m108591d(t);
        C67391b bVar = ((C86351b) t).f251055a;
        Log.m105924i("MicroMsg.MEShakeBubblesAndAvatar", "[MB] shake");
        char c = 1;
        char c2 = 0;
        if (this.f251496f == null || this.f251497g == null) {
            this.f251496f = AnimationUtils.loadAnimation(MMApplicationContext.getContext(), C0966R.C0968anim.f2433cw);
            this.f251497g = AnimationUtils.loadAnimation(MMApplicationContext.getContext(), C0966R.C0968anim.f2434cx);
            int i = 0;
            while (i < 5) {
                float f = this.f251494d[i];
                long j = this.f251495e[i];
                C31626b bVar2 = new C31626b(f, 50, j);
                float f2 = ((float) -2) * f;
                float f3 = f2;
                C31626b bVar3 = new C31626b(f3, 100, ((long) 50) + j);
                float f4 = ((float) 2) * f;
                C31626b bVar4 = new C31626b(f4, 100, ((long) 150) + j);
                C31626b bVar5 = new C31626b(f3, 100, ((long) 250) + j);
                C31626b bVar6 = new C31626b(f, 50, ((long) TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE) + j);
                C31626b[] bVarArr = new C31626b[5];
                bVarArr[c2] = bVar2;
                bVarArr[c] = bVar3;
                bVarArr[2] = bVar4;
                bVarArr[3] = bVar5;
                bVarArr[4] = bVar6;
                List f5 = C64197v.m75537f(bVarArr);
                AnimationSet r = mo121026r(f5, 0.0f);
                r.addAnimation(this.f251496f);
                this.f251499i.add(r);
                AnimationSet r2 = mo121026r(f5, 0.0f);
                r2.addAnimation(this.f251497g);
                this.f251502l.add(r2);
                AnimationSet r3 = mo121026r(f5, 1.0f);
                r3.addAnimation(this.f251496f);
                this.f251500j.add(r3);
                AnimationSet r4 = mo121026r(f5, 1.0f);
                r4.addAnimation(this.f251497g);
                this.f251503m.add(r4);
                List f6 = C64197v.m75537f(new C31626b(f, 34, j), new C31626b(f2, 67, ((long) 34) + j), new C31626b(f4, 67, ((long) 101) + j), new C31626b(f2, 67, ((long) 168) + j), new C31626b(f4, 67, ((long) 235) + j), new C31626b(f2, 67, ((long) 312) + j), new C31626b(f, 34, ((long) 379) + j));
                AnimationSet r5 = mo121026r(f6, 0.5f);
                r5.addAnimation(this.f251496f);
                this.f251498h.add(r5);
                AnimationSet r6 = mo121026r(f6, 0.5f);
                r6.addAnimation(this.f251497g);
                this.f251501k.add(r6);
                i++;
                c = 1;
                c2 = 0;
            }
        }
        List<Pair<C72963f4, C74023i.C74026c>> b = C75776a.m91028b(bVar, true);
        if (b == null) {
            Log.m105920e("MicroMsg.MEShakeBubblesAndAvatar", "[MB] no visible views");
            hVar2 = mo120842g(1, "no visible views");
        } else {
            boolean optBoolean = hVar3.optBoolean("isFrom", false);
            ArrayList arrayList = (ArrayList) b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                C74023i.C74026c cVar = (C74023i.C74026c) pair.second;
                View mainContainerView = cVar instanceof C74193r2 ? ((C74193r2) cVar).f217798m : cVar.getMainContainerView();
                ChattingAvatarImageView chattingAvatarImageView = cVar.avatarIV;
                int size = (arrayList.size() - arrayList.indexOf(pair)) - 1;
                float[] fArr = this.f251494d;
                if (size >= fArr.length) {
                    size = fArr.length - 1;
                }
                if (mainContainerView != null) {
                    if (cVar.chattingItem.mo26232R()) {
                        animationSet = (optBoolean ? this.f251500j : this.f251503m).get(size);
                        C87412m.m108593f(animationSet, "{\n                    if…eIndex]\n                }");
                    } else {
                        animationSet = (optBoolean ? this.f251499i : this.f251502l).get(size);
                        C87412m.m108593f(animationSet, "{\n                    if…eIndex]\n                }");
                    }
                    animationSet.setAnimationListener(new C45679a(mainContainerView));
                    mainContainerView.startAnimation(animationSet);
                }
                if (chattingAvatarImageView != null) {
                    if (optBoolean) {
                        obj = this.f251498h.get(size);
                        str = "avatarAnimationBoomFromLeft[shakeIndex]";
                    } else {
                        obj = this.f251501k.get(size);
                        str = "avatarAnimationBoomFromRight[shakeIndex]";
                    }
                    C87412m.m108593f(obj, str);
                    Animation animation = (Animation) obj;
                    animation.setAnimationListener(new C45679a(chattingAvatarImageView));
                    chattingAvatarImageView.startAnimation(animation);
                }
            }
            hVar2 = mo120844i();
        }
        p.invoke(hVar2);
    }

    /* renamed from: r */
    public final AnimationSet mo121026r(List<C31626b> list, float f) {
        AnimationSet animationSet = new AnimationSet(false);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C31626b bVar = list.get(i);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, bVar.f84499a, 1, f, 1, 0.0f);
            rotateAnimation.setDuration(bVar.f84500b);
            rotateAnimation.setStartOffset(bVar.f84501c);
            if (i == 0) {
                rotateAnimation.setInterpolator(new AccelerateInterpolator());
            } else if (i == list.size() - 1) {
                rotateAnimation.setInterpolator(new DecelerateInterpolator());
            } else {
                rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            }
            animationSet.addAnimation(rotateAnimation);
        }
        return animationSet;
    }
}
