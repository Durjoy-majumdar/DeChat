package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.mini.AbsLiveMiniView;
import com.tencent.p014mm.plugin.finder.live.view.mini.FinderMiniWindowFloatLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import iq3.C60601c;
import j20.C117292a;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import l60.C99344b;
import lu3.C34379c;
import o40.C61926c;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import r50.C77486k;
import r60.C101350i;
import t60.C64207e;
import uk1.C65409j;
import up1.C27696y;
import x60.C102564a;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010#J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u001a\u0010\u000e\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@BX\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\u0018R(\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@BX\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u0018¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveMiniView;", "Lcom/tencent/mm/live/core/mini/AbsLiveMiniView;", "", "coverUrl", "Lrx3/b0;", "setBgCoverUrl", "", "newState", "setState", "getCurrentState", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lcom/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayout;", "j", "Lcom/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayout;", "getMultiAreaLayout", "()Lcom/tencent/mm/plugin/finder/live/view/mini/FinderMiniWindowFloatLayout;", "multiAreaLayout", "value", "p", "setCoverUrl", "(Ljava/lang/String;)V", "q", "setAnchorUsername", "anchorUsername", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView */
public class FinderLiveMiniView extends AbsLiveMiniView {

    /* renamed from: d */
    public final String f159783d;

    /* renamed from: e */
    public int f159784e;

    /* renamed from: f */
    public final TextView f159785f;

    /* renamed from: g */
    public final View f159786g;

    /* renamed from: h */
    public final ImageView f159787h;

    /* renamed from: i */
    public final ImageView f159788i;

    /* renamed from: j */
    public final FinderMiniWindowFloatLayout f159789j;

    /* renamed from: n */
    public boolean f159790n;

    /* renamed from: o */
    public View.OnClickListener f159791o;

    /* renamed from: p */
    public String f159792p;

    /* renamed from: q */
    public String f159793q;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView$a */
    public static final class C56022a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveMiniView f159794a;

        public C56022a(FinderLiveMiniView finderLiveMiniView) {
            this.f159794a = finderLiveMiniView;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C34379c<?> cVar;
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                FinderLiveMiniView finderLiveMiniView = this.f159794a;
                C119179t tVar = C119157j.f356862d;
                C56096s0 s0Var = new C56096s0(bitmap, finderLiveMiniView);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                cVar = jVar.mo183878i(s0Var, 0);
            } else {
                cVar = null;
            }
            if (cVar == null) {
                Log.m105924i(this.f159794a.getTAG(), "loadBackgroundImage resource is empty!");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveMiniView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f159783d = "FinderLiveMiniView";
        this.f159792p = "";
        this.f159793q = "";
        View.inflate(context, C0966R.C0971layout.aid, this);
        View findViewById = findViewById(C0966R.C0970id.dtf);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_live_multi_area_layout)");
        this.f159789j = (FinderMiniWindowFloatLayout) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.dt9);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_live_mini_view_state_tv)");
        this.f159785f = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.dt6);
        C87412m.m108593f(findViewById3, "findViewById(R.id.finder…ini_view_state_container)");
        this.f159786g = findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.dt8);
        C87412m.m108593f(findViewById4, "findViewById(R.id.finder_live_mini_view_state_iv)");
        ImageView imageView = (ImageView) findViewById4;
        this.f159787h = imageView;
        View findViewById5 = findViewById(C0966R.C0970id.dt7);
        C87412m.m108593f(findViewById5, "findViewById(R.id.finder…ive_mini_view_state_icon)");
        this.f159788i = (ImageView) findViewById5;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new C77486k((float) C76577a.m92151b(MMApplicationContext.getContext(), 8)));
        imageView.setVisibility(8);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById3;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    private final void setAnchorUsername(String str) {
        String str2 = this.f159783d;
        Log.m105924i(str2, "set anchorUsername:" + str);
        this.f159793q = str;
    }

    private final void setCoverUrl(String str) {
        String str2 = this.f159783d;
        Log.m105924i(str2, "set coverUrl:" + str);
        this.f159792p = str;
    }

    /* renamed from: a */
    public void mo76394a(int i) {
        int i2 = this.f159784e;
        Pattern pattern = C61926c.f176038a;
        this.f159784e = i2 | i;
        String str = this.f159783d;
        Log.m105924i(str, "applyState applyState:" + i + ", state:" + this.f159784e);
        mo77964g();
    }

    /* renamed from: b */
    public int mo76395b() {
        return 15;
    }

    /* renamed from: c */
    public void mo76396c() {
        View.OnClickListener onClickListener = this.f159791o;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: d */
    public void mo76397d(int i) {
        int i2 = this.f159784e;
        Pattern pattern = C61926c.f176038a;
        this.f159784e = i2 & (~i);
        String str = this.f159783d;
        Log.m105924i(str, "releaseState releaseState:" + i + ", state:" + this.f159784e);
        mo77964g();
    }

    /* renamed from: e */
    public final void mo77962e() {
        String str;
        String str2 = this.f159792p;
        boolean z = true;
        if (str2 == null || str2.length() == 0) {
            C58969q b = C58961d.f168673a.mo84155b(this.f159793q);
            str = b != null ? b.field_liveCoverImg : null;
        } else {
            str = this.f159792p;
        }
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (!z) {
            C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(str, C27696y.THUMB_IMAGE));
            C56022a aVar = new C56022a(this);
            a.getClass();
            a.f291320d = aVar;
            a.mo85951a();
            return;
        }
        Log.m105924i(this.f159783d, "loadBackgroundImage backgroundUrl is empty!");
    }

    /* renamed from: f */
    public final void mo77963f(String str, String str2, boolean z) {
        String str3 = this.f159783d;
        Log.m105924i(str3, "setupMiniView isAnchor:" + z);
        this.f159790n = z;
        if (z) {
            this.f159789j.setVisibility(8);
        } else {
            this.f159789j.setRadius((float) C76577a.m92151b(MMApplicationContext.getContext(), 8));
            this.f159789j.setAdapter(new C65409j(0, 1, (C8480h) null));
            this.f159789j.setLayoutManager(new C60601c());
            this.f159789j.setVisibility(0);
        }
        setAnchorUsername(str);
        setCoverUrl(str2);
        this.f159787h.setImageDrawable((Drawable) null);
    }

    /* renamed from: g */
    public final void mo77964g() {
        if (C61926c.m72696u(this.f159784e, 4)) {
            this.f159785f.setText(getContext().getResources().getString(C0966R.string.g8p));
            this.f159787h.setVisibility(0);
            View view = this.f159786g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "showFinishView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "showFinishView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo77962e();
            this.f159788i.setVisibility(0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!(childAt.getId() != C0966R.C0970id.f358193dt3)) {
                    childAt = null;
                }
                if (childAt != null) {
                    childAt.getVisibility();
                }
            }
            setContentDescription(getContext().getResources().getString(C0966R.string.juc));
            sendAccessibilityEvent(128);
        } else if (C61926c.m72696u(this.f159784e, 2)) {
            this.f159785f.setText(getContext().getResources().getString(C0966R.string.g8q));
            this.f159787h.setVisibility(0);
            View view3 = this.f159786g;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "showPauseView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "showPauseView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f159788i.setVisibility(8);
            mo77962e();
            setContentDescription(getContext().getResources().getString(C0966R.string.juf));
        } else if (C61926c.m72696u(this.f159784e, 1)) {
            this.f159785f.setText(getContext().getResources().getString(C0966R.string.g8n));
            this.f159787h.setVisibility(0);
            View view5 = this.f159786g;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "showDisconnectView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "showDisconnectView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f159788i.setVisibility(0);
            mo77962e();
            setContentDescription(getContext().getResources().getString(C0966R.string.jue));
            sendAccessibilityEvent(128);
        } else if (C61926c.m72696u(this.f159784e, 8)) {
            String string = getContext().getResources().getString(C0966R.string.g8o);
            C87412m.m108593f(string, "context.resources.getStr…ini_state_free_time_over)");
            String string2 = getContext().getResources().getString(C0966R.string.jud);
            C87412m.m108593f(string2, "context.resources.getStr…back_live_free_time_over)");
            this.f159787h.setVisibility(0);
            View view7 = this.f159786g;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "showStateView", "(ZZLjava/lang/String;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "showStateView", "(ZZLjava/lang/String;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f159788i.setVisibility(8);
            this.f159785f.setText(string);
            mo77962e();
            setContentDescription(string2);
            sendAccessibilityEvent(128);
        } else {
            this.f159787h.setVisibility(8);
            View view9 = this.f159786g;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "showNorlView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView", "showNorlView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            setContentDescription(getContext().getResources().getString(C0966R.string.jua));
        }
    }

    public int getCurrentState() {
        return this.f159784e;
    }

    public final FinderMiniWindowFloatLayout getMultiAreaLayout() {
        return this.f159789j;
    }

    public final String getTAG() {
        return this.f159783d;
    }

    public void setBgCoverUrl(String str) {
        String str2 = this.f159783d;
        Log.m105924i(str2, "setCoverUrl:" + str);
        setCoverUrl(str);
    }

    public void setState(int i) {
        String str = this.f159783d;
        Log.m105924i(str, "setState newState:" + i + ", state:" + this.f159784e);
        this.f159784e = i;
        mo77964g();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveMiniView(Context context) {
        this(context, (AttributeSet) null, 0);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveMiniView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
