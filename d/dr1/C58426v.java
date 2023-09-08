package dr1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import ao1.C54270m1;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.plugin.finder.view.FinderJumperView;
import com.tencent.p014mm.plugin.lite.C56832d;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58780v1;
import fe1.C58965i;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kq1.C61136e;
import rx3.C13601g;
import rx3.C36568h;
import te3.C50259lg1;
import te3.C51286sr0;

/* renamed from: dr1.v */
public final class C58426v implements C58965i {

    /* renamed from: a */
    public final AppCompatActivity f167384a;

    /* renamed from: b */
    public final FinderJumperView f167385b;

    /* renamed from: c */
    public String f167386c;

    /* renamed from: d */
    public String f167387d;

    /* renamed from: e */
    public C50259lg1 f167388e;

    /* renamed from: f */
    public C56832d f167389f;

    /* renamed from: g */
    public final C13601g f167390g = C36568h.m40985a(new C58428b(this));

    /* renamed from: h */
    public final C13601g f167391h = C36568h.m40985a(new C58430d(this));

    /* renamed from: i */
    public final C13601g f167392i = C36568h.m40985a(new C58429c(this));

    /* renamed from: dr1.v$a */
    public static final class C58427a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58426v f167393d;

        public C58427a(C58426v vVar) {
            this.f167393d = vVar;
        }

        public final void onClick(View view) {
            C51286sr0 sr02;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/upload/postui/FinderPostMusicWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58426v vVar = this.f167393d;
            C50259lg1 lg12 = vVar.f167388e;
            if (!(lg12 == null || (sr02 = lg12.f137401g) == null)) {
                vVar.f167389f = C58780v1.f168288a.mo83840b(vVar.f167384a, sr02, "originalId=" + vVar.f167386c, new C58432x(vVar));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/upload/postui/FinderPostMusicWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: dr1.v$b */
    public static final class C58428b extends C87413o implements C32224a<C61136e> {

        /* renamed from: d */
        public final /* synthetic */ C58426v f167394d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58428b(C58426v vVar) {
            super(0);
            this.f167394d = vVar;
        }

        public Object invoke() {
            return (C61136e) C39818r.f106831a.mo62444c(this.f167394d.f167384a).mo75002a(C61136e.class);
        }
    }

    /* renamed from: dr1.v$c */
    public static final class C58429c extends C87413o implements C32224a<PostMainUIC> {

        /* renamed from: d */
        public final /* synthetic */ C58426v f167395d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58429c(C58426v vVar) {
            super(0);
            this.f167395d = vVar;
        }

        public Object invoke() {
            return (PostMainUIC) C39818r.f106831a.mo62444c(this.f167395d.f167384a).mo75002a(PostMainUIC.class);
        }
    }

    /* renamed from: dr1.v$d */
    public static final class C58430d extends C87413o implements C32224a<C54270m1> {

        /* renamed from: d */
        public final /* synthetic */ C58426v f167396d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58430d(C58426v vVar) {
            super(0);
            this.f167396d = vVar;
        }

        public Object invoke() {
            return (C54270m1) C39818r.f106831a.mo62444c(this.f167396d.f167384a).mo75002a(C54270m1.class);
        }
    }

    public C58426v(AppCompatActivity appCompatActivity, FinderJumperView finderJumperView) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderJumperView, "chooseView");
        this.f167384a = appCompatActivity;
        this.f167385b = finderJumperView;
        String string = appCompatActivity.getString(C0966R.string.n_f);
        C87412m.m108593f(string, "activity.getString(R.str…g.finder_post_music_info)");
        finderJumperView.setDefaultTitle(string);
        finderJumperView.setDefaultIconId(C0966R.raw.icons_outlined_music_finder);
        finderJumperView.setFilledIconId(C0966R.raw.icons_filled_music_finder);
        finderJumperView.setOnClickListener(new C58427a(this));
    }
}
