package pb2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.plugin.p081mv.p082ui.adapter.MusicLyricLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import la2.C99364n;
import ma2.C61453s;
import mb2.C61457a;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: pb2.a */
public final class C62252a {

    /* renamed from: a */
    public final Context f176957a;

    /* renamed from: b */
    public final View f176958b;

    /* renamed from: c */
    public final C13601g f176959c = C36568h.m40985a(new C62254b(this));

    /* renamed from: d */
    public final ArrayList<String> f176960d = new ArrayList<>();

    /* renamed from: e */
    public C61453s f176961e;

    /* renamed from: f */
    public int f176962f = -1;

    /* renamed from: g */
    public final C62253a f176963g = new C62253a();

    /* renamed from: h */
    public final C94223g.C94224a f176964h = new C62255c(this);

    /* renamed from: pb2.a$a */
    public static final class C62253a implements C61457a.C61460b {
        /* renamed from: j */
        public void mo86435j(int i) {
        }
    }

    /* renamed from: pb2.a$b */
    public static final class C62254b extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C62252a f176965d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62254b(C62252a aVar) {
            super(0);
            this.f176965d = aVar;
        }

        public Object invoke() {
            return (RecyclerView) this.f176965d.f176958b.findViewById(C0966R.C0970id.gju);
        }
    }

    /* renamed from: pb2.a$c */
    public static final class C62255c implements C94223g.C94224a {

        /* renamed from: a */
        public final /* synthetic */ C62252a f176966a;

        /* renamed from: pb2.a$c$a */
        public static final class C62256a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f176967d;

            /* renamed from: e */
            public final /* synthetic */ int f176968e;

            /* renamed from: f */
            public final /* synthetic */ C62252a f176969f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62256a(int i, int i2, C62252a aVar) {
                super(0);
                this.f176967d = i;
                this.f176968e = i2;
                this.f176969f = aVar;
            }

            public Object invoke() {
                LinearLayoutManager linearLayoutManager;
                int i = this.f176967d;
                if (i >= 0 && this.f176968e >= 0) {
                    C62252a aVar = this.f176969f;
                    int i2 = aVar.f176962f;
                    C61453s sVar = aVar.f176961e;
                    if (sVar != null) {
                        i2 = sVar.mo86428c((long) i);
                    }
                    if (!(i2 == aVar.f176962f || i2 < 0 || (linearLayoutManager = (LinearLayoutManager) aVar.mo87308a().getLayoutManager()) == null)) {
                        int C = linearLayoutManager.mo16957C();
                        int E = linearLayoutManager.mo16959E();
                        aVar.mo87308a().mo17155w1();
                        boolean z = true;
                        int i3 = C - 1;
                        if (i2 > E + 1 || i3 > i2) {
                            z = false;
                        }
                        if (z) {
                            RecyclerView a = aVar.mo87308a();
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(Integer.valueOf(i2));
                            RecyclerView recyclerView = a;
                            C117292a.m165358d(recyclerView, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/open/text_status/MusicMvLyricManager", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            a.mo17149t1(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/mv/ui/open/text_status/MusicMvLyricManager", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        } else {
                            RecyclerView a2 = aVar.mo87308a();
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar3.mo10233c(Integer.valueOf(i2));
                            RecyclerView recyclerView2 = a2;
                            C117292a.m165358d(recyclerView2, aVar3.mo10232b(), "com/tencent/mm/plugin/mv/ui/open/text_status/MusicMvLyricManager", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                            a2.mo17115r1(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/mv/ui/open/text_status/MusicMvLyricManager", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                        }
                    }
                    aVar.f176962f = i2;
                }
                return C13598b0.f38549a;
            }
        }

        public C62255c(C62252a aVar) {
            this.f176966a = aVar;
        }

        /* renamed from: a */
        public final void mo80435a(int i, int i2) {
            C61926c.m72668M(new C62256a(i, i2, this.f176966a));
        }
    }

    public C62252a(Context context, View view) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "rootView");
        this.f176957a = context;
        this.f176958b = view;
    }

    /* renamed from: a */
    public final RecyclerView mo87308a() {
        return (RecyclerView) ((C36570n) this.f176959c).getValue();
    }

    /* renamed from: b */
    public final void mo87309b() {
        Log.m105924i("MicroMsg.Mv.MusicMvLyric", "onCreate" + C99364n.m129616h().mo138822a());
        mo87308a().setLayoutManager(new MusicLyricLayoutManager(this.f176957a, 0, false, 6, (C8480h) null));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mo87308a().getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (int) ((((float) this.f176957a.getResources().getDisplayMetrics().heightPixels) * 0.37f) - ((float) C76577a.m92151b(this.f176957a, 15)));
        }
        C99364n.m129616h().mo138823b(this.f176964h);
    }

    /* renamed from: c */
    public final void mo87310c(String str) {
        if (str != null) {
            C61453s sVar = null;
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                this.f176960d.clear();
                C61453s f = C61453s.m72164f(str, "", "", true, "", false, false);
                if (f.mo86427b() > 1) {
                    sVar = f;
                }
                this.f176961e = sVar;
                if (sVar != null) {
                    int b = sVar.mo86427b();
                    for (int i = 0; i < b; i++) {
                        ArrayList<String> arrayList = this.f176960d;
                        String str2 = sVar.mo86426a(i).f174761c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList.add(str2);
                    }
                }
                if (((C61457a) mo87308a().getAdapter()) == null) {
                    RecyclerView a = mo87308a();
                    C61457a aVar = new C61457a(this.f176963g);
                    aVar.mo86433F4(this.f176960d);
                    a.setAdapter(aVar);
                }
                Log.m105924i("MicroMsg.Mv.MusicMvLyric", "setSongInfo, lyric.length:" + str.length() + ", lyricLine.size:" + this.f176960d.size() + ", lyricRv-Visisble:" + mo87308a().getVisibility() + ", lyricRv.alpha:" + mo87308a().getAlpha());
            }
        }
    }
}
