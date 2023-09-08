package com.tencent.p014mm.plugin.emoji.p040ui.p319v3.banner;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import o61.C11372c;
import o61.C61947d;
import p61.C100668o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bJ\u0006\u0010\n\u001a\u00020\u0002J\b\u0010\f\u001a\u0004\u0018\u00010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerView$a;", "getDefaultBannerConfig", "Lcom/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerLayoutManager;", "getDefaultLayoutManger", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getNoLoopLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$e;", "getCurrentAdapter", "getCurrentBannerConfig", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "getCurrentBannerLayoutManager", "Lp61/o;", "j", "Lp61/o;", "getSizeResolver", "()Lp61/o;", "setSizeResolver", "(Lp61/o;)V", "sizeResolver", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView */
public final class EmojiStoreV3BannerView extends FrameLayout {

    /* renamed from: d */
    public C93268a f269051d = getDefaultBannerConfig();

    /* renamed from: e */
    public final EmojiStoreV3BannerLayoutManager f269052e = getDefaultLayoutManger();

    /* renamed from: f */
    public C61947d f269053f = new C61947d();

    /* renamed from: g */
    public RecyclerView.C16613e<?> f269054g;

    /* renamed from: h */
    public C93269b f269055h;

    /* renamed from: i */
    public final RecyclerView f269056i;

    /* renamed from: j */
    public C100668o f269057j;

    /* renamed from: n */
    public final String f269058n = "MicroMsg.EmojiStoreV3BannerView";

    /* renamed from: o */
    public float f269059o;

    /* renamed from: p */
    public float f269060p;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView$a */
    public static final class C93268a {

        /* renamed from: a */
        public boolean f269061a;

        /* renamed from: b */
        public boolean f269062b;

        /* renamed from: c */
        public boolean f269063c;

        /* renamed from: d */
        public long f269064d;

        /* renamed from: e */
        public int f269065e;

        /* renamed from: f */
        public int f269066f;

        /* renamed from: g */
        public int f269067g;

        public C93268a(boolean z, boolean z2, boolean z3, long j, int i, int i2, int i3, int i4, C8480h hVar) {
            z = (i4 & 1) != 0 ? false : z;
            z2 = (i4 & 2) != 0 ? true : z2;
            z3 = (i4 & 4) != 0 ? true : z3;
            j = (i4 & 8) != 0 ? FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION : j;
            i = (i4 & 16) != 0 ? 500 : i;
            i2 = (i4 & 32) != 0 ? 0 : i2;
            i3 = (i4 & 64) != 0 ? 30 : i3;
            this.f269061a = z;
            this.f269062b = z2;
            this.f269063c = z3;
            this.f269064d = j;
            this.f269065e = i;
            this.f269066f = i2;
            this.f269067g = i3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView$b */
    public static final class C93269b extends Handler {

        /* renamed from: a */
        public final WeakReference<EmojiStoreV3BannerView> f269068a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93269b(EmojiStoreV3BannerView emojiStoreV3BannerView, Looper looper) {
            super(looper);
            C87412m.m108594g(emojiStoreV3BannerView, "view");
            C87412m.m108594g(looper, "looper");
            this.f269068a = new WeakReference<>(emojiStoreV3BannerView);
        }

        public void handleMessage(Message message) {
            int s;
            C87412m.m108594g(message, "msg");
            EmojiStoreV3BannerView emojiStoreV3BannerView = this.f269068a.get();
            if (emojiStoreV3BannerView != null && message.what == 1 && (s = emojiStoreV3BannerView.f269052e.mo23530s()) >= 0) {
                RecyclerView recyclerView = emojiStoreV3BannerView.f269056i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(s + 1));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerView$TimerHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerView$TimerHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                sendEmptyMessageDelayed(1, ((long) emojiStoreV3BannerView.f269052e.f52286f) + emojiStoreV3BannerView.f269051d.f269064d);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiStoreV3BannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View findViewById = LayoutInflater.from(context).inflate(C0966R.C0971layout.ckb, this, true).findViewById(C0966R.C0970id.f357505gk0);
        C87412m.m108593f(findViewById, "from(context).inflate(R.….id.banner_recycler_view)");
        this.f269056i = (RecyclerView) findViewById;
    }

    /* renamed from: a */
    public final void mo127903a(int i) {
        C93268a currentBannerConfig = getCurrentBannerConfig();
        RecyclerView.C16613e<?> eVar = this.f269054g;
        if (eVar != null) {
            if (i >= 2 && i < eVar.getItemCount()) {
                currentBannerConfig.f269063c = false;
                currentBannerConfig.f269062b = true;
                currentBannerConfig.f269061a = false;
            } else if (i >= eVar.getItemCount()) {
                currentBannerConfig.f269063c = false;
                currentBannerConfig.f269062b = false;
                currentBannerConfig.f269061a = false;
            } else {
                currentBannerConfig.f269063c = true;
                currentBannerConfig.f269062b = true;
                currentBannerConfig.f269061a = true;
            }
            mo127906d(currentBannerConfig);
        }
    }

    /* renamed from: b */
    public final void mo127904b(C93268a aVar, RecyclerView.C16613e<?> eVar) {
        C87412m.m108594g(aVar, "bannerConfig");
        C87412m.m108594g(eVar, "adapter");
        mo127906d(aVar);
        this.f269054g = eVar;
        this.f269056i.setAdapter(eVar);
        String str = this.f269058n;
        Log.m105924i(str, "banner setUp, adapter hash: " + eVar.hashCode());
    }

    /* renamed from: c */
    public final void mo127905c() {
        C93269b bVar;
        C93269b bVar2 = this.f269055h;
        if (bVar2 != null) {
            bVar2.removeCallbacksAndMessages((Object) null);
        }
        C93268a aVar = this.f269051d;
        if (aVar.f269063c && (bVar = this.f269055h) != null) {
            bVar.sendEmptyMessageDelayed(1, aVar.f269064d);
        }
    }

    /* renamed from: d */
    public final void mo127906d(C93268a aVar) {
        C93269b bVar;
        C87412m.m108594g(aVar, "bannerConfig");
        this.f269051d = aVar;
        C93269b bVar2 = this.f269055h;
        if (bVar2 != null) {
            bVar2.removeCallbacksAndMessages((Object) null);
        }
        if (aVar.f269063c && (bVar = this.f269055h) != null) {
            bVar.sendEmptyMessageDelayed(1, this.f269051d.f269064d);
        }
        if (aVar.f269061a) {
            this.f269053f.mo75025b(this.f269056i);
            C61947d dVar = this.f269053f;
            dVar.f176080g = this.f269051d.f269066f;
            boolean z = aVar.f269061a;
            dVar.f176079f = z;
            EmojiStoreV3BannerLayoutManager emojiStoreV3BannerLayoutManager = this.f269052e;
            emojiStoreV3BannerLayoutManager.f52287g = z;
            emojiStoreV3BannerLayoutManager.f52286f = aVar.f269065e;
            emojiStoreV3BannerLayoutManager.f52288h = aVar.f269067g;
            emojiStoreV3BannerLayoutManager.f52291n = aVar.f269062b;
            this.f269056i.setLayoutManager(emojiStoreV3BannerLayoutManager);
            return;
        }
        this.f269053f.mo75025b((RecyclerView) null);
        this.f269056i.setLayoutManager(getNoLoopLayoutManager());
        if (this.f269056i.getItemDecorationCount() == 0) {
            this.f269056i.mo17085h0(new C11372c(aVar.f269067g));
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C93269b bVar;
        if (motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 0) {
            requestDisallowInterceptTouchEvent(true);
            if (this.f269051d.f269063c && (bVar = this.f269055h) != null) {
                bVar.removeCallbacksAndMessages((Object) null);
            }
            this.f269059o = motionEvent.getX();
            this.f269060p = motionEvent.getY();
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            if (this.f269051d.f269063c) {
                mo127905c();
            }
        } else if (action == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (Math.abs(this.f269059o - x) >= Math.abs(this.f269060p - y)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
                z = false;
            }
            String str = this.f269058n;
            Log.m105918d(str, "XEvent:" + z + ", deltaX:" + Math.abs(this.f269059o - x) + ", deltaY:" + Math.abs(this.f269060p - y) + ", eventX:" + x + ", eventY:" + y);
            if (!this.f269051d.f269062b) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final RecyclerView.C16613e<?> getCurrentAdapter() {
        return this.f269054g;
    }

    public final C93268a getCurrentBannerConfig() {
        return this.f269051d;
    }

    public final RecyclerView.LayoutManager getCurrentBannerLayoutManager() {
        return this.f269056i.getLayoutManager();
    }

    public final C93268a getDefaultBannerConfig() {
        return new C93268a(false, false, false, 0, 0, 0, 0, 127, (C8480h) null);
    }

    public final EmojiStoreV3BannerLayoutManager getDefaultLayoutManger() {
        return new EmojiStoreV3BannerLayoutManager();
    }

    public final LinearLayoutManager getNoLoopLayoutManager() {
        return new LinearLayoutManager(getContext(), 0, false);
    }

    public final C100668o getSizeResolver() {
        return this.f269057j;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f269055h == null) {
            Looper mainLooper = Looper.getMainLooper();
            C87412m.m108593f(mainLooper, "getMainLooper()");
            this.f269055h = new C93269b(this, mainLooper);
            mo127905c();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.m105918d(this.f269058n, "onDetachedFromWindow");
        C93269b bVar = this.f269055h;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages((Object) null);
        }
        C93269b bVar2 = this.f269055h;
        if (bVar2 != null) {
            bVar2.removeCallbacksAndMessages((Object) null);
            bVar2.f269068a.clear();
        }
        this.f269055h = null;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        String str = this.f269058n;
        Log.m105924i(str, "onSizeChanged w:" + i + ", h:" + i2 + ", oldw::" + i3 + ", oldH:" + i4);
        C100668o oVar = this.f269057j;
        if (oVar != null) {
            oVar.mo140107d(i);
            mo127903a(oVar.f294934c);
        }
    }

    public final void setSizeResolver(C100668o oVar) {
        this.f269057j = oVar;
    }
}
