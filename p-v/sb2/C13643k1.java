package sb2;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;

/* renamed from: sb2.k1 */
public final class C13643k1 {

    /* renamed from: c */
    public static final C13644a f38655c = new C13644a((C8480h) null);

    /* renamed from: a */
    public View f38656a;

    /* renamed from: b */
    public final HashMap<Integer, C13646b> f38657b = new HashMap<>();

    /* renamed from: sb2.k1$a */
    public static final class C13644a {

        /* renamed from: sb2.k1$a$a */
        public static final class C13645a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f38658d;

            /* renamed from: e */
            public final /* synthetic */ int f38659e;

            public C13645a(View view, int i) {
                this.f38658d = view;
                this.f38659e = i;
            }

            public final void run() {
                View view = this.f38658d;
                int i = this.f38659e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord$Companion$simpleSettingMethod$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord$Companion$simpleSettingMethod$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public C13644a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo13038a(View view, List<Integer> list, int i) {
            C87412m.m108594g(list, "ids");
            for (Integer intValue : list) {
                View findViewById = view != null ? view.findViewById(intValue.intValue()) : null;
                if (findViewById != null) {
                    findViewById.animate().alpha(i == 0 ? 1.0f : 0.0f).setDuration(150).withEndAction(new C13645a(findViewById, i)).start();
                }
            }
        }
    }

    /* renamed from: sb2.k1$b */
    public static final class C13646b {

        /* renamed from: a */
        public final int f38660a;

        /* renamed from: b */
        public final int f38661b;

        /* renamed from: c */
        public final float f38662c;

        /* renamed from: d */
        public final int f38663d;

        /* renamed from: e */
        public final boolean f38664e;

        public C13646b(int i, int i2, float f, int i3, float f2, boolean z) {
            this.f38660a = i;
            this.f38661b = i2;
            this.f38662c = f;
            this.f38663d = i3;
            this.f38664e = z;
        }
    }

    /* renamed from: a */
    public final C13643k1 mo13035a(View view) {
        this.f38656a = view;
        this.f38657b.clear();
        return this;
    }

    /* renamed from: b */
    public final C13643k1 mo13036b(Set<Integer> set) {
        C87412m.m108594g(set, "ids");
        Log.m105924i("MicroMsg.VisibleRecord", "gone: ");
        for (Integer intValue : set) {
            int intValue2 = intValue.intValue();
            View view = this.f38656a;
            View findViewById = view != null ? view.findViewById(intValue2) : null;
            if (findViewById != null) {
                int visibility = findViewById.getVisibility();
                boolean z = visibility != 8;
                C13646b bVar = new C13646b(intValue2, visibility, findViewById.getAlpha(), 8, 0.0f, z);
                this.f38657b.put(Integer.valueOf(intValue2), bVar);
                if (z) {
                    findViewById.animate().cancel();
                    findViewById.animate().alpha(0.0f).setDuration(150).withEndAction(new C13647l1(findViewById, bVar)).start();
                }
            }
        }
        return this;
    }

    /* renamed from: c */
    public final C13643k1 mo13037c(Set<Integer> set) {
        C87412m.m108594g(set, "ids");
        for (Integer intValue : set) {
            int intValue2 = intValue.intValue();
            View view = this.f38656a;
            View findViewById = view != null ? view.findViewById(intValue2) : null;
            if (findViewById != null) {
                int visibility = findViewById.getVisibility();
                boolean z = visibility != 0;
                this.f38657b.put(Integer.valueOf(intValue2), new C13646b(intValue2, visibility, findViewById.getAlpha(), 0, 1.0f, z));
                if (z) {
                    findViewById.animate().cancel();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = findViewById;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord", "visible", "(Ljava/util/Set;)Lcom/tencent/mm/plugin/mv/ui/uic/VisibleRecord;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord", "visible", "(Ljava/util/Set;)Lcom/tencent/mm/plugin/mv/ui/uic/VisibleRecord;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.animate().alpha(1.0f).setDuration(150).start();
                }
            }
        }
        return this;
    }
}
