package u61;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import r61.C101358h;
import rx3.C13598b0;
import s61.C101543c;
import s61.C101545e;
import s61.C101547g;
import s61.C101552m;
import te3.C101800k70;
import te3.C101824o80;

/* renamed from: u61.d */
public final class C101962d {

    /* renamed from: a */
    public static final C101962d f300168a = new C101962d();

    /* renamed from: f */
    public static C101358h m134210f(C101962d dVar, Context context, EmojiInfo emojiInfo, boolean z, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, String str, int i, long j, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            aVar = null;
        }
        if ((i4 & 16) != 0) {
            aVar2 = null;
        }
        if ((i4 & 32) != 0) {
            str = "";
        }
        if ((i4 & 64) != 0) {
            i = 0;
        }
        if ((i4 & 128) != 0) {
            j = 0;
        }
        if ((i4 & 256) != 0) {
            i2 = 29;
        }
        if ((i4 & 512) != 0) {
            i3 = 0;
        }
        dVar.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(emojiInfo, "info");
        C101358h hVar = new C101358h(context, emojiInfo, z);
        hVar.f296925x = i3;
        hVar.f296923v = j;
        hVar.f296922u = i;
        hVar.f296924w = i2;
        hVar.f296921t = str;
        hVar.f296919r = aVar;
        hVar.f296920s = aVar2;
        hVar.f296911g.mo140655A();
        return hVar;
    }

    /* renamed from: a */
    public final GradientDrawable mo141483a(int i, float f, float f2, float f3, float f4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
        return gradientDrawable;
    }

    /* renamed from: b */
    public final Drawable mo141484b(int i, int i2, float f, float f2, float f3, float f4) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, mo141483a(i2, f, f2, f3, f4));
        stateListDrawable.addState(new int[0], mo141483a(i, f, f2, f3, f4));
        return stateListDrawable;
    }

    /* renamed from: c */
    public final void mo141485c(View... viewArr) {
        C87412m.m108594g(viewArr, "views");
        for (View view : viewArr) {
            if (view != null && view.getVisibility() == 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/utils/EmojiStoreV3UIUtil", "makeUiHide", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/utils/EmojiStoreV3UIUtil", "makeUiHide", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: d */
    public final void mo141486d(View... viewArr) {
        C87412m.m108594g(viewArr, "views");
        for (View view : viewArr) {
            if (!(view == null || view.getVisibility() == 0)) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/utils/EmojiStoreV3UIUtil", "makeUiVisible", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/utils/EmojiStoreV3UIUtil", "makeUiVisible", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: e */
    public final List<C101543c> mo141487e(List<? extends C101800k70> list, List<? extends C101824o80> list2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        boolean z = list.size() + list2.size() > 10;
        int min = Math.min(list.size(), 3);
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            for (int i = 0; i < min; i++) {
                EmojiInfo h = C101964h.m134226h((C101800k70) list.get(i));
                C101552m mVar = new C101552m();
                mVar.f297296a = h;
                arrayList.add(mVar);
            }
        }
        if (!list2.isEmpty()) {
            for (C101824o80 o802 : list2) {
                C101545e eVar = new C101545e();
                eVar.f297281a = o802;
                arrayList.add(eVar);
                if (arrayList.size() >= 10) {
                    break;
                }
            }
        }
        if (arrayList.size() < 10 && list.size() > min) {
            int min2 = Math.min(10 - arrayList.size(), list.size() - min) + min;
            while (min < min2) {
                EmojiInfo h2 = C101964h.m134226h((C101800k70) list.get(min));
                C101552m mVar2 = new C101552m();
                mVar2.f297296a = h2;
                arrayList.add(mVar2);
                min++;
            }
        }
        if (z) {
            arrayList.add(new C101547g());
        }
        return arrayList;
    }
}
